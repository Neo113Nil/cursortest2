package com.google.firebase.messaging;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import com.google.android.gms.internal.measurement.d5;
import com.google.android.gms.tasks.Task;
import io.sentry.android.core.w0;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public class FirebaseMessaging {

    /* renamed from: l, reason: collision with root package name */
    public static h9.c f6059l;

    /* renamed from: n, reason: collision with root package name */
    public static ScheduledThreadPoolExecutor f6061n;

    /* renamed from: a, reason: collision with root package name */
    public final h8.g f6062a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f6063b;

    /* renamed from: c, reason: collision with root package name */
    public final androidx.appcompat.widget.a0 f6064c;

    /* renamed from: d, reason: collision with root package name */
    public final l f6065d;

    /* renamed from: e, reason: collision with root package name */
    public final com.android.billingclient.api.i f6066e;

    /* renamed from: f, reason: collision with root package name */
    public final ScheduledThreadPoolExecutor f6067f;

    /* renamed from: g, reason: collision with root package name */
    public final ThreadPoolExecutor f6068g;

    /* renamed from: h, reason: collision with root package name */
    public final w7.m f6069h;

    /* renamed from: i, reason: collision with root package name */
    public final androidx.core.view.f f6070i;
    public boolean j;

    /* renamed from: k, reason: collision with root package name */
    public static final long f6058k = TimeUnit.HOURS.toSeconds(8);

    /* renamed from: m, reason: collision with root package name */
    public static a9.a f6060m = new n(0);

    public FirebaseMessaging(h8.g gVar, a9.a aVar, a9.a aVar2, b9.e eVar, a9.a aVar3, x8.c cVar) {
        gVar.a();
        Context context = gVar.f10401a;
        final androidx.core.view.f fVar = new androidx.core.view.f(context);
        final androidx.appcompat.widget.a0 a0Var = new androidx.appcompat.widget.a0(gVar, fVar, aVar, aVar2, eVar);
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor(new com.android.billingclient.api.e0("Firebase-Messaging-Task"));
        final int i5 = 1;
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, new com.android.billingclient.api.e0("Firebase-Messaging-Init"));
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new com.android.billingclient.api.e0("Firebase-Messaging-File-Io"));
        final int i10 = 0;
        this.j = false;
        f6060m = aVar3;
        this.f6062a = gVar;
        com.android.billingclient.api.i iVar = new com.android.billingclient.api.i();
        iVar.f4030d = this;
        iVar.f4028b = cVar;
        this.f6066e = iVar;
        gVar.a();
        final Context context2 = gVar.f10401a;
        this.f6063b = context2;
        m mVar = new m();
        this.f6070i = fVar;
        this.f6064c = a0Var;
        this.f6065d = new l(newSingleThreadExecutor);
        this.f6067f = scheduledThreadPoolExecutor;
        this.f6068g = threadPoolExecutor;
        gVar.a();
        if (context instanceof Application) {
            ((Application) context).registerActivityLifecycleCallbacks(mVar);
        } else {
            w0.m("FirebaseMessaging", "Context " + context + " was not an application, can't register for lifecycle callbacks. Some notification events may be dropped as a result.");
        }
        scheduledThreadPoolExecutor.execute(new Runnable(this) { // from class: com.google.firebase.messaging.o

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FirebaseMessaging f6162b;

            {
                this.f6162b = this;
            }

            private final void a() {
                FirebaseMessaging firebaseMessaging = this.f6162b;
                if (firebaseMessaging.f6066e.e() && firebaseMessaging.i(firebaseMessaging.d())) {
                    synchronized (firebaseMessaging) {
                        if (!firebaseMessaging.j) {
                            firebaseMessaging.h(0L);
                        }
                    }
                }
            }

            @Override // java.lang.Runnable
            public final void run() {
                w7.m p10;
                int i11;
                switch (i10) {
                    case 0:
                        a();
                        return;
                    default:
                        FirebaseMessaging firebaseMessaging = this.f6162b;
                        Context context3 = firebaseMessaging.f6063b;
                        u.d(context3);
                        androidx.appcompat.widget.a0 a0Var2 = firebaseMessaging.f6064c;
                        boolean g10 = firebaseMessaging.g();
                        if (Build.VERSION.SDK_INT >= 29) {
                            SharedPreferences s8 = rh.g.s(context3);
                            if (!s8.contains("proxy_retention") || s8.getBoolean("proxy_retention", false) != g10) {
                                b6.b bVar = (b6.b) a0Var2.f682d;
                                if (bVar.f3036c.b() >= 241100000) {
                                    Bundle bundle = new Bundle();
                                    bundle.putBoolean("proxy_retention", g10);
                                    b6.p h10 = b6.p.h(bVar.f3035b);
                                    synchronized (h10) {
                                        i11 = h10.f3078a;
                                        h10.f3078a = i11 + 1;
                                    }
                                    p10 = h10.i(new b6.n(i11, 4, bundle, 0));
                                } else {
                                    p10 = d5.p(new IOException("SERVICE_NOT_AVAILABLE"));
                                }
                                p10.e(new o.a(1), new v(context3, g10));
                            }
                        }
                        if (firebaseMessaging.g()) {
                            firebaseMessaging.e();
                            return;
                        }
                        return;
                }
            }
        });
        final ScheduledThreadPoolExecutor scheduledThreadPoolExecutor2 = new ScheduledThreadPoolExecutor(1, new com.android.billingclient.api.e0("Firebase-Messaging-Topics-Io"));
        int i11 = e0.j;
        w7.m d10 = d5.d(scheduledThreadPoolExecutor2, new Callable() { // from class: com.google.firebase.messaging.d0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                c0 c0Var;
                Context context3 = context2;
                ScheduledThreadPoolExecutor scheduledThreadPoolExecutor3 = scheduledThreadPoolExecutor2;
                FirebaseMessaging firebaseMessaging = this;
                androidx.core.view.f fVar2 = fVar;
                androidx.appcompat.widget.a0 a0Var2 = a0Var;
                synchronized (c0.class) {
                    try {
                        WeakReference weakReference = c0.f6100d;
                        c0Var = weakReference != null ? (c0) weakReference.get() : null;
                        if (c0Var == null) {
                            c0 c0Var2 = new c0(context3.getSharedPreferences("com.google.android.gms.appid", 0), scheduledThreadPoolExecutor3);
                            c0Var2.b();
                            c0.f6100d = new WeakReference(c0Var2);
                            c0Var = c0Var2;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return new e0(firebaseMessaging, fVar2, c0Var, a0Var2, context3, scheduledThreadPoolExecutor3);
            }
        });
        this.f6069h = d10;
        d10.e(scheduledThreadPoolExecutor, new p(this, i10));
        scheduledThreadPoolExecutor.execute(new Runnable(this) { // from class: com.google.firebase.messaging.o

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FirebaseMessaging f6162b;

            {
                this.f6162b = this;
            }

            private final void a() {
                FirebaseMessaging firebaseMessaging = this.f6162b;
                if (firebaseMessaging.f6066e.e() && firebaseMessaging.i(firebaseMessaging.d())) {
                    synchronized (firebaseMessaging) {
                        if (!firebaseMessaging.j) {
                            firebaseMessaging.h(0L);
                        }
                    }
                }
            }

            @Override // java.lang.Runnable
            public final void run() {
                w7.m p10;
                int i112;
                switch (i5) {
                    case 0:
                        a();
                        return;
                    default:
                        FirebaseMessaging firebaseMessaging = this.f6162b;
                        Context context3 = firebaseMessaging.f6063b;
                        u.d(context3);
                        androidx.appcompat.widget.a0 a0Var2 = firebaseMessaging.f6064c;
                        boolean g10 = firebaseMessaging.g();
                        if (Build.VERSION.SDK_INT >= 29) {
                            SharedPreferences s8 = rh.g.s(context3);
                            if (!s8.contains("proxy_retention") || s8.getBoolean("proxy_retention", false) != g10) {
                                b6.b bVar = (b6.b) a0Var2.f682d;
                                if (bVar.f3036c.b() >= 241100000) {
                                    Bundle bundle = new Bundle();
                                    bundle.putBoolean("proxy_retention", g10);
                                    b6.p h10 = b6.p.h(bVar.f3035b);
                                    synchronized (h10) {
                                        i112 = h10.f3078a;
                                        h10.f3078a = i112 + 1;
                                    }
                                    p10 = h10.i(new b6.n(i112, 4, bundle, 0));
                                } else {
                                    p10 = d5.p(new IOException("SERVICE_NOT_AVAILABLE"));
                                }
                                p10.e(new o.a(1), new v(context3, g10));
                            }
                        }
                        if (firebaseMessaging.g()) {
                            firebaseMessaging.e();
                            return;
                        }
                        return;
                }
            }
        });
    }

    public static void b(Runnable runnable, long j) {
        synchronized (FirebaseMessaging.class) {
            try {
                if (f6061n == null) {
                    f6061n = new ScheduledThreadPoolExecutor(1, new com.android.billingclient.api.e0("TAG"));
                }
                f6061n.schedule(runnable, j, TimeUnit.SECONDS);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static synchronized h9.c c(Context context) {
        h9.c cVar;
        synchronized (FirebaseMessaging.class) {
            try {
                if (f6059l == null) {
                    f6059l = new h9.c(context);
                }
                cVar = f6059l;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return cVar;
    }

    @NonNull
    @Keep
    public static synchronized FirebaseMessaging getInstance(@NonNull h8.g gVar) {
        FirebaseMessaging firebaseMessaging;
        synchronized (FirebaseMessaging.class) {
            firebaseMessaging = (FirebaseMessaging) gVar.b(FirebaseMessaging.class);
            g6.v.i(firebaseMessaging, "Firebase Messaging component is not present");
        }
        return firebaseMessaging;
    }

    public final String a() {
        Task task;
        y d10 = d();
        if (!i(d10)) {
            return d10.f6187a;
        }
        String h10 = androidx.core.view.f.h(this.f6062a);
        l lVar = this.f6065d;
        synchronized (lVar) {
            task = (Task) ((s.e) lVar.f6157b).get(h10);
            if (task == null) {
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "Making new request for: " + h10);
                }
                androidx.appcompat.widget.a0 a0Var = this.f6064c;
                task = a0Var.u(a0Var.E(androidx.core.view.f.h((h8.g) a0Var.f680b), "*", new Bundle())).l(this.f6068g, new androidx.transition.i(this, h10, d10, 1)).h((Executor) lVar.f6156a, new g(1, lVar, h10));
                ((s.e) lVar.f6157b).put(h10, task);
            } else if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Joining ongoing request for: " + h10);
            }
        }
        try {
            return (String) d5.a(task);
        } catch (InterruptedException | ExecutionException e7) {
            throw new IOException(e7);
        }
    }

    public final y d() {
        y b10;
        h9.c c2 = c(this.f6063b);
        h8.g gVar = this.f6062a;
        gVar.a();
        String d10 = "[DEFAULT]".equals(gVar.f10402b) ? "" : gVar.d();
        String h10 = androidx.core.view.f.h(this.f6062a);
        synchronized (c2) {
            b10 = y.b(((SharedPreferences) c2.f10430b).getString(d10 + "|T|" + h10 + "|*", null));
        }
        return b10;
    }

    public final void e() {
        Task p10;
        int i5;
        b6.b bVar = (b6.b) this.f6064c.f682d;
        if (bVar.f3036c.b() >= 241100000) {
            b6.p h10 = b6.p.h(bVar.f3035b);
            Bundle bundle = Bundle.EMPTY;
            synchronized (h10) {
                i5 = h10.f3078a;
                h10.f3078a = i5 + 1;
            }
            p10 = h10.i(new b6.n(i5, 5, bundle, 1)).g(b6.g.f3048c, b6.d.f3043c);
        } else {
            p10 = d5.p(new IOException("SERVICE_NOT_AVAILABLE"));
        }
        p10.e(this.f6067f, new p(this, 1));
    }

    public final synchronized void f(boolean z5) {
        this.j = z5;
    }

    public final boolean g() {
        Context context = this.f6063b;
        u.d(context);
        if (!u.f(context)) {
            return false;
        }
        if (this.f6062a.b(l8.b.class) != null) {
            return true;
        }
        return m4.g.g() && f6060m != null;
    }

    public final synchronized void h(long j) {
        b(new a0(this, Math.min(Math.max(30L, 2 * j), f6058k)), j);
        this.j = true;
    }

    public final boolean i(y yVar) {
        if (yVar != null) {
            return System.currentTimeMillis() > yVar.f6189c + y.f6186d || !this.f6070i.f().equals(yVar.f6188b);
        }
        return true;
    }
}
