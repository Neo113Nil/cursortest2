package com.google.firebase.messaging;

import android.annotation.SuppressLint;
import android.app.Application;
import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Binder;
import android.os.Bundle;
import android.util.Log;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import androidx.fragment.app.RunnableC5391l;
import com.google.android.gms.cloudmessaging.CloudMessage;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.common.util.concurrent.NamedThreadFactory;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.messaging.O;
import java.io.IOException;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import l8.InterfaceC7893a;
import v8.C10272a;
import v8.InterfaceC10273b;
import x8.InterfaceC10676a;
import y8.InterfaceC10861a;
import z8.InterfaceC10999b;

/* loaded from: classes.dex */
public class FirebaseMessaging {

    /* renamed from: m, reason: collision with root package name */
    private static O f59595m;

    /* renamed from: o, reason: collision with root package name */
    static ScheduledThreadPoolExecutor f59597o;

    /* renamed from: a, reason: collision with root package name */
    private final k8.e f59598a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC10676a f59599b;

    /* renamed from: c, reason: collision with root package name */
    private final Context f59600c;

    /* renamed from: d, reason: collision with root package name */
    private final C5941w f59601d;

    /* renamed from: e, reason: collision with root package name */
    private final J f59602e;

    /* renamed from: f, reason: collision with root package name */
    private final a f59603f;

    /* renamed from: g, reason: collision with root package name */
    private final ScheduledThreadPoolExecutor f59604g;

    /* renamed from: h, reason: collision with root package name */
    private final ThreadPoolExecutor f59605h;

    /* renamed from: i, reason: collision with root package name */
    private final C5944z f59606i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f59607j;

    /* renamed from: k, reason: collision with root package name */
    private final Application.ActivityLifecycleCallbacks f59608k;

    /* renamed from: l, reason: collision with root package name */
    private static final long f59594l = TimeUnit.HOURS.toSeconds(8);

    /* renamed from: n, reason: collision with root package name */
    static InterfaceC10861a<Q6.i> f59596n = new C5934o();

    /* JADX INFO: Access modifiers changed from: private */
    class a {

        /* renamed from: a, reason: collision with root package name */
        private final v8.d f59609a;

        /* renamed from: b, reason: collision with root package name */
        private boolean f59610b;

        /* renamed from: c, reason: collision with root package name */
        private Boolean f59611c;

        a(v8.d dVar) {
            this.f59609a = dVar;
        }

        private Boolean b() {
            ApplicationInfo applicationInfo;
            Bundle bundle;
            Context i11 = FirebaseMessaging.this.f59598a.i();
            SharedPreferences sharedPreferences = i11.getSharedPreferences("com.google.firebase.messaging", 0);
            if (sharedPreferences.contains("auto_init")) {
                return Boolean.valueOf(sharedPreferences.getBoolean("auto_init", false));
            }
            try {
                PackageManager packageManager = i11.getPackageManager();
                if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(i11.getPackageName(), UserVerificationMethods.USER_VERIFY_PATTERN)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_messaging_auto_init_enabled")) {
                    return null;
                }
                return Boolean.valueOf(applicationInfo.metaData.getBoolean("firebase_messaging_auto_init_enabled"));
            } catch (PackageManager.NameNotFoundException unused) {
                return null;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v5, types: [com.google.firebase.messaging.t] */
        final synchronized boolean a() {
            try {
                synchronized (this) {
                    try {
                        if (!this.f59610b) {
                            Boolean b11 = b();
                            this.f59611c = b11;
                            if (b11 == null) {
                                this.f59609a.a(new InterfaceC10273b() { // from class: com.google.firebase.messaging.t
                                    @Override // v8.InterfaceC10273b
                                    public final void a(C10272a c10272a) {
                                        FirebaseMessaging.a aVar = FirebaseMessaging.a.this;
                                        if (aVar.a()) {
                                            FirebaseMessaging.this.r();
                                        }
                                    }
                                });
                            }
                            this.f59610b = true;
                        }
                    } finally {
                    }
                }
                return r0 != null ? r0.booleanValue() : FirebaseMessaging.this.f59598a.q();
            } catch (Throwable th2) {
                throw th2;
            }
            Boolean bool = this.f59611c;
            return bool != null ? bool.booleanValue() : FirebaseMessaging.this.f59598a.q();
        }
    }

    FirebaseMessaging() {
        throw null;
    }

    FirebaseMessaging(k8.e eVar, InterfaceC10676a interfaceC10676a, InterfaceC10861a<H8.h> interfaceC10861a, InterfaceC10861a<w8.i> interfaceC10861a2, InterfaceC10999b interfaceC10999b, InterfaceC10861a<Q6.i> interfaceC10861a3, v8.d dVar) {
        final C5944z c5944z = new C5944z(eVar.i());
        final C5941w c5941w = new C5941w(eVar, c5944z, interfaceC10861a, interfaceC10861a2, interfaceC10999b);
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor(new NamedThreadFactory("Firebase-Messaging-Task"));
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, new NamedThreadFactory("Firebase-Messaging-Init"));
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new NamedThreadFactory("Firebase-Messaging-File-Io"));
        this.f59607j = false;
        f59596n = interfaceC10861a3;
        this.f59598a = eVar;
        this.f59599b = interfaceC10676a;
        this.f59603f = new a(dVar);
        final Context i11 = eVar.i();
        this.f59600c = i11;
        C5933n c5933n = new C5933n();
        this.f59608k = c5933n;
        this.f59606i = c5944z;
        this.f59601d = c5941w;
        this.f59602e = new J(newSingleThreadExecutor);
        this.f59604g = scheduledThreadPoolExecutor;
        this.f59605h = threadPoolExecutor;
        Context i12 = eVar.i();
        if (i12 instanceof Application) {
            ((Application) i12).registerActivityLifecycleCallbacks(c5933n);
        } else {
            Log.w("FirebaseMessaging", "Context " + i12 + " was not an application, can't register for lifecycle callbacks. Some notification events may be dropped as a result.");
        }
        if (interfaceC10676a != null) {
            interfaceC10676a.b();
        }
        scheduledThreadPoolExecutor.execute(new RunnableC5391l(this, 1));
        final ScheduledThreadPoolExecutor scheduledThreadPoolExecutor2 = new ScheduledThreadPoolExecutor(1, new NamedThreadFactory("Firebase-Messaging-Topics-Io"));
        int i13 = U.f59653j;
        Tasks.call(scheduledThreadPoolExecutor2, new Callable() { // from class: com.google.firebase.messaging.T
            @Override // java.util.concurrent.Callable
            public final Object call() {
                C5944z c5944z2 = c5944z;
                C5941w c5941w2 = c5941w;
                return U.a(i11, scheduledThreadPoolExecutor2, this, c5944z2, c5941w2);
            }
        }).addOnSuccessListener(scheduledThreadPoolExecutor, new OnSuccessListener() { // from class: com.google.firebase.messaging.p
            @Override // com.google.android.gms.tasks.OnSuccessListener
            public final void onSuccess(Object obj) {
                FirebaseMessaging.f(FirebaseMessaging.this, (U) obj);
            }
        });
        scheduledThreadPoolExecutor.execute(new com.appsflyer.internal.g(this, 1));
    }

    public static Task a(FirebaseMessaging firebaseMessaging, String str, O.a aVar, String str2) {
        Context context = firebaseMessaging.f59600c;
        O m11 = m(context);
        k8.e eVar = firebaseMessaging.f59598a;
        String m12 = "[DEFAULT]".equals(eVar.k()) ? "" : eVar.m();
        String a11 = firebaseMessaging.f59606i.a();
        synchronized (m11) {
            String a12 = O.a.a(System.currentTimeMillis(), str2, a11);
            if (a12 != null) {
                SharedPreferences.Editor edit = m11.f59630a.edit();
                edit.putString(m12 + "|T|" + str + "|*", a12);
                edit.commit();
            }
        }
        if (aVar == null || !str2.equals(aVar.f59632a)) {
            k8.e eVar2 = firebaseMessaging.f59598a;
            if ("[DEFAULT]".equals(eVar2.k())) {
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "Invoking onNewToken for app: " + eVar2.k());
                }
                Intent intent = new Intent("com.google.firebase.messaging.NEW_TOKEN");
                intent.putExtra("token", str2);
                new C5932m(context).c(intent);
            }
        }
        return Tasks.forResult(str2);
    }

    public static void b(FirebaseMessaging firebaseMessaging) {
        if (firebaseMessaging.f59603f.a()) {
            firebaseMessaging.r();
        }
    }

    public static void c(FirebaseMessaging firebaseMessaging) {
        Context context = firebaseMessaging.f59600c;
        D.a(context);
        boolean q11 = firebaseMessaging.q();
        C5941w c5941w = firebaseMessaging.f59601d;
        F.e(context, c5941w, q11);
        if (firebaseMessaging.q()) {
            c5941w.a().addOnSuccessListener(firebaseMessaging.f59604g, new BY.a(firebaseMessaging));
        }
    }

    public static void d(FirebaseMessaging firebaseMessaging, CloudMessage cloudMessage) {
        firebaseMessaging.getClass();
        if (cloudMessage != null) {
            C5943y.c(cloudMessage.getIntent());
            firebaseMessaging.f59601d.a().addOnSuccessListener(firebaseMessaging.f59604g, new BY.a(firebaseMessaging));
        }
    }

    public static void f(FirebaseMessaging firebaseMessaging, U u11) {
        if (firebaseMessaging.f59603f.a()) {
            u11.e();
        }
    }

    @NonNull
    @Keep
    static synchronized FirebaseMessaging getInstance(@NonNull k8.e eVar) {
        FirebaseMessaging firebaseMessaging;
        synchronized (FirebaseMessaging.class) {
            firebaseMessaging = (FirebaseMessaging) eVar.h(FirebaseMessaging.class);
            Preconditions.checkNotNull(firebaseMessaging, "Firebase Messaging component is not present");
        }
        return firebaseMessaging;
    }

    @SuppressLint({"ThreadPoolCreation"})
    static void j(Runnable runnable, long j11) {
        synchronized (FirebaseMessaging.class) {
            try {
                if (f59597o == null) {
                    f59597o = new ScheduledThreadPoolExecutor(1, new NamedThreadFactory("TAG"));
                }
                f59597o.schedule(runnable, j11, TimeUnit.SECONDS);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @NonNull
    public static synchronized FirebaseMessaging l() {
        FirebaseMessaging firebaseMessaging;
        synchronized (FirebaseMessaging.class) {
            firebaseMessaging = getInstance(k8.e.j());
        }
        return firebaseMessaging;
    }

    @NonNull
    private static synchronized O m(Context context) {
        O o11;
        synchronized (FirebaseMessaging.class) {
            try {
                if (f59595m == null) {
                    f59595m = new O(context);
                }
                o11 = f59595m;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return o11;
    }

    private boolean q() {
        String notificationDelegate;
        boolean z11;
        Context context = this.f59600c;
        D.a(context);
        if (PlatformVersion.isAtLeastQ()) {
            if (Binder.getCallingUid() == context.getApplicationInfo().uid) {
                notificationDelegate = ((NotificationManager) context.getSystemService(NotificationManager.class)).getNotificationDelegate();
                if ("com.google.android.gms".equals(notificationDelegate)) {
                    if (Log.isLoggable("FirebaseMessaging", 3)) {
                        Log.d("FirebaseMessaging", "GMS core is set for proxying");
                    }
                    z11 = true;
                    return z11 && (this.f59598a.h(InterfaceC7893a.class) != null || (C5943y.a() && f59596n != null));
                }
            } else {
                Log.e("FirebaseMessaging", "error retrieving notification delegate for package " + context.getPackageName());
            }
        } else if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Platform doesn't support proxying.");
        }
        z11 = false;
        if (z11) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void r() {
        O.a c11;
        InterfaceC10676a interfaceC10676a = this.f59599b;
        if (interfaceC10676a != null) {
            interfaceC10676a.a();
            return;
        }
        O m11 = m(this.f59600c);
        k8.e eVar = this.f59598a;
        String m12 = "[DEFAULT]".equals(eVar.k()) ? "" : eVar.m();
        String c12 = C5944z.c(this.f59598a);
        synchronized (m11) {
            c11 = O.a.c(m11.f59630a.getString(m12 + "|T|" + c12 + "|*", null));
        }
        if (c11 == null || c11.b(this.f59606i.a())) {
            synchronized (this) {
                if (!this.f59607j) {
                    s(0L);
                }
            }
        }
    }

    final String i() throws IOException {
        O.a c11;
        InterfaceC10676a interfaceC10676a = this.f59599b;
        if (interfaceC10676a != null) {
            try {
                return (String) Tasks.await(interfaceC10676a.c());
            } catch (InterruptedException | ExecutionException e11) {
                throw new IOException(e11);
            }
        }
        O m11 = m(this.f59600c);
        k8.e eVar = this.f59598a;
        String m12 = "[DEFAULT]".equals(eVar.k()) ? "" : eVar.m();
        String c12 = C5944z.c(this.f59598a);
        synchronized (m11) {
            c11 = O.a.c(m11.f59630a.getString(m12 + "|T|" + c12 + "|*", null));
        }
        if (c11 != null && !c11.b(this.f59606i.a())) {
            return c11.f59632a;
        }
        String c13 = C5944z.c(this.f59598a);
        try {
            return (String) Tasks.await(this.f59602e.b(c13, new r(this, c13, c11)));
        } catch (InterruptedException | ExecutionException e12) {
            throw new IOException(e12);
        }
    }

    final Context k() {
        return this.f59600c;
    }

    @NonNull
    public final Task<String> n() {
        InterfaceC10676a interfaceC10676a = this.f59599b;
        if (interfaceC10676a != null) {
            return interfaceC10676a.c();
        }
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.f59604g.execute(new Runnable() { // from class: com.google.firebase.messaging.q
            @Override // java.lang.Runnable
            public final void run() {
                TaskCompletionSource taskCompletionSource2 = taskCompletionSource;
                InterfaceC10861a<Q6.i> interfaceC10861a = FirebaseMessaging.f59596n;
                FirebaseMessaging firebaseMessaging = FirebaseMessaging.this;
                firebaseMessaging.getClass();
                try {
                    taskCompletionSource2.setResult(firebaseMessaging.i());
                } catch (Exception e11) {
                    taskCompletionSource2.setException(e11);
                }
            }
        });
        return taskCompletionSource.getTask();
    }

    final boolean o() {
        return this.f59606i.f();
    }

    final synchronized void p(boolean z11) {
        this.f59607j = z11;
    }

    final synchronized void s(long j11) {
        j(new P(this, Math.min(Math.max(30L, 2 * j11), f59594l)), j11);
        this.f59607j = true;
    }
}
