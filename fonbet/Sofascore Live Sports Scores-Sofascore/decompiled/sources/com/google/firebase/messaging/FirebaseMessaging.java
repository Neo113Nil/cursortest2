package com.google.firebase.messaging;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import com.google.android.gms.cloudmessaging.Rpc;
import com.google.android.gms.cloudmessaging.zzv;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.concurrent.NamedThreadFactory;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.messaging.FirebaseMessaging;
import defpackage.cp4;
import defpackage.dff;
import defpackage.dh0;
import defpackage.en0;
import defpackage.eq3;
import defpackage.g35;
import defpackage.gt7;
import defpackage.hki;
import defpackage.iu;
import defpackage.k1d;
import defpackage.k48;
import defpackage.kc3;
import defpackage.l48;
import defpackage.mpi;
import defpackage.o48;
import defpackage.ou4;
import defpackage.ow9;
import defpackage.ox9;
import defpackage.p03;
import defpackage.pic;
import defpackage.q48;
import defpackage.qea;
import defpackage.r38;
import defpackage.r48;
import defpackage.s3p;
import defpackage.vff;
import defpackage.yia;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public class FirebaseMessaging {
    public static yia l;
    public static vff m = new kc3(5);
    public static ScheduledThreadPoolExecutor n;
    public final r38 a;
    public final Context b;
    public final ox9 c;
    public final p03 d;
    public final k1d e;
    public final en0 f;
    public final ScheduledThreadPoolExecutor g;
    public final ThreadPoolExecutor h;
    public final pic i;
    public final l48 j;
    public boolean k;

    public FirebaseMessaging(final r38 r38Var, vff vffVar, vff vffVar2, final l48 l48Var, vff vffVar3, hki hkiVar) {
        r38Var.a();
        Context context = r38Var.a;
        final pic picVar = new pic();
        final int i = 0;
        picVar.b = 0;
        picVar.c = context;
        ox9 ox9Var = new ox9(r38Var, picVar, vffVar, vffVar2, l48Var);
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor(new NamedThreadFactory("Firebase-Messaging-Task"));
        final int i2 = 1;
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, new NamedThreadFactory("Firebase-Messaging-Init"));
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new NamedThreadFactory("Firebase-Messaging-File-Io"));
        this.k = false;
        m = vffVar3;
        this.a = r38Var;
        this.f = new en0(this, hkiVar);
        r38Var.a();
        final Context context2 = r38Var.a;
        this.b = context2;
        gt7 gt7Var = new gt7();
        this.i = picVar;
        this.c = ox9Var;
        this.j = l48Var;
        p03 p03Var = new p03(context2, r38Var, l48Var, ox9Var, picVar);
        this.d = p03Var;
        this.e = new k1d(newSingleThreadExecutor);
        this.g = scheduledThreadPoolExecutor;
        this.h = threadPoolExecutor;
        r38Var.a();
        Context context3 = r38Var.a;
        if (context3 instanceof Application) {
            ((Application) context3).registerActivityLifecycleCallbacks(gt7Var);
        } else {
            Objects.toString(context3);
        }
        if (p03Var.n()) {
            o48 o48Var = new o48(this);
            k48 k48Var = (k48) l48Var;
            synchronized (k48Var) {
                k48Var.j.add(o48Var);
            }
        }
        scheduledThreadPoolExecutor.execute(new Runnable(this) { // from class: p48
            public final /* synthetic */ FirebaseMessaging b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                Task forException;
                int i3;
                int i4 = i;
                FirebaseMessaging firebaseMessaging = this.b;
                switch (i4) {
                    case 0:
                        if (firebaseMessaging.f.s() && firebaseMessaging.h(firebaseMessaging.d())) {
                            synchronized (firebaseMessaging) {
                                if (!firebaseMessaging.k) {
                                    firebaseMessaging.g(0L);
                                }
                            }
                            return;
                        }
                        return;
                    default:
                        final Context context4 = firebaseMessaging.b;
                        eq3.C(context4);
                        ox9 ox9Var2 = firebaseMessaging.c;
                        final boolean f = firebaseMessaging.f();
                        if (Build.VERSION.SDK_INT >= 29) {
                            SharedPreferences I = z1a.I(context4);
                            if (!I.contains("proxy_retention") || I.getBoolean("proxy_retention", false) != f) {
                                Rpc rpc = (Rpc) ox9Var2.d;
                                if (rpc.c.b() >= 241100000) {
                                    Bundle bundle = new Bundle();
                                    bundle.putBoolean("proxy_retention", f);
                                    zzv a = zzv.a(rpc.b);
                                    synchronized (a) {
                                        i3 = a.d;
                                        a.d = i3 + 1;
                                    }
                                    forException = a.b(new s3p(i3, 4, bundle, 0));
                                } else {
                                    forException = Tasks.forException(new IOException("SERVICE_NOT_AVAILABLE"));
                                }
                                forException.addOnSuccessListener(new hg0(1), new OnSuccessListener() { // from class: kgf
                                    @Override // com.google.android.gms.tasks.OnSuccessListener
                                    public final void onSuccess(Object obj) {
                                        SharedPreferences.Editor edit = z1a.I(context4).edit();
                                        edit.putBoolean("proxy_retention", f);
                                        edit.apply();
                                    }
                                });
                            }
                        }
                        if (firebaseMessaging.f()) {
                            firebaseMessaging.e();
                            return;
                        }
                        return;
                }
            }
        });
        final ScheduledThreadPoolExecutor scheduledThreadPoolExecutor2 = new ScheduledThreadPoolExecutor(1, new NamedThreadFactory("Firebase-Messaging-Topics-Io"));
        Tasks.call(scheduledThreadPoolExecutor2, new Callable() { // from class: hqj
            @Override // java.util.concurrent.Callable
            public final Object call() {
                gqj gqjVar;
                Context context4 = context2;
                ScheduledThreadPoolExecutor scheduledThreadPoolExecutor3 = scheduledThreadPoolExecutor2;
                pic picVar2 = picVar;
                r38 r38Var2 = r38Var;
                FirebaseMessaging firebaseMessaging = this;
                l48 l48Var2 = l48Var;
                synchronized (gqj.class) {
                    try {
                        WeakReference weakReference = gqj.c;
                        gqjVar = weakReference != null ? (gqj) weakReference.get() : null;
                        if (gqjVar == null) {
                            SharedPreferences sharedPreferences = context4.getSharedPreferences("com.google.android.gms.appid", 0);
                            gqj gqjVar2 = new gqj(sharedPreferences, scheduledThreadPoolExecutor3);
                            synchronized (gqjVar2) {
                                gqjVar2.a = ejg.f(sharedPreferences, scheduledThreadPoolExecutor3);
                            }
                            gqj.c = new WeakReference(gqjVar2);
                            gqjVar = gqjVar2;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return new iqj(picVar2, gqjVar, new hcc(r38Var2, firebaseMessaging, l48Var2), context4, scheduledThreadPoolExecutor3);
            }
        }).addOnSuccessListener(scheduledThreadPoolExecutor, new q48(this, i));
        scheduledThreadPoolExecutor.execute(new Runnable(this) { // from class: p48
            public final /* synthetic */ FirebaseMessaging b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                Task forException;
                int i3;
                int i4 = i2;
                FirebaseMessaging firebaseMessaging = this.b;
                switch (i4) {
                    case 0:
                        if (firebaseMessaging.f.s() && firebaseMessaging.h(firebaseMessaging.d())) {
                            synchronized (firebaseMessaging) {
                                if (!firebaseMessaging.k) {
                                    firebaseMessaging.g(0L);
                                }
                            }
                            return;
                        }
                        return;
                    default:
                        final Context context4 = firebaseMessaging.b;
                        eq3.C(context4);
                        ox9 ox9Var2 = firebaseMessaging.c;
                        final boolean f = firebaseMessaging.f();
                        if (Build.VERSION.SDK_INT >= 29) {
                            SharedPreferences I = z1a.I(context4);
                            if (!I.contains("proxy_retention") || I.getBoolean("proxy_retention", false) != f) {
                                Rpc rpc = (Rpc) ox9Var2.d;
                                if (rpc.c.b() >= 241100000) {
                                    Bundle bundle = new Bundle();
                                    bundle.putBoolean("proxy_retention", f);
                                    zzv a = zzv.a(rpc.b);
                                    synchronized (a) {
                                        i3 = a.d;
                                        a.d = i3 + 1;
                                    }
                                    forException = a.b(new s3p(i3, 4, bundle, 0));
                                } else {
                                    forException = Tasks.forException(new IOException("SERVICE_NOT_AVAILABLE"));
                                }
                                forException.addOnSuccessListener(new hg0(1), new OnSuccessListener() { // from class: kgf
                                    @Override // com.google.android.gms.tasks.OnSuccessListener
                                    public final void onSuccess(Object obj) {
                                        SharedPreferences.Editor edit = z1a.I(context4).edit();
                                        edit.putBoolean("proxy_retention", f);
                                        edit.apply();
                                    }
                                });
                            }
                        }
                        if (firebaseMessaging.f()) {
                            firebaseMessaging.e();
                            return;
                        }
                        return;
                }
            }
        });
    }

    public static void b(long j, Runnable runnable) {
        synchronized (FirebaseMessaging.class) {
            try {
                ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = n;
                if (scheduledThreadPoolExecutor == null) {
                    scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, new NamedThreadFactory("TAG"));
                    n = scheduledThreadPoolExecutor;
                }
                scheduledThreadPoolExecutor.schedule(runnable, j, TimeUnit.SECONDS);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static synchronized yia c(Context context) {
        yia yiaVar;
        synchronized (FirebaseMessaging.class) {
            yiaVar = l;
            if (yiaVar == null) {
                yiaVar = new yia(context);
                l = yiaVar;
            }
        }
        return yiaVar;
    }

    @NonNull
    @Keep
    @Deprecated
    public static synchronized FirebaseMessaging getInstance(@NonNull r38 r38Var) {
        FirebaseMessaging firebaseMessaging;
        synchronized (FirebaseMessaging.class) {
            firebaseMessaging = (FirebaseMessaging) r38Var.b(FirebaseMessaging.class);
            Preconditions.j(firebaseMessaging, "Firebase Messaging component is not present");
        }
        return firebaseMessaging;
    }

    public final String a() {
        Task task;
        ou4 d = d();
        if (!h(d)) {
            return (String) d.b;
        }
        String c = pic.c(this.a);
        k1d k1dVar = this.e;
        r48 r48Var = new r48(this, c, d);
        synchronized (k1dVar) {
            task = (Task) ((dh0) k1dVar.c).get(c);
            if (task == null) {
                task = r48Var.a().continueWithTask((Executor) k1dVar.b, new ow9(9, k1dVar, c));
                ((dh0) k1dVar.c).put(c, task);
            }
        }
        try {
            return (String) Tasks.await(task);
        } catch (InterruptedException | ExecutionException e) {
            cp4.i("FCM Registration failed!", e);
            return null;
        }
    }

    public final ou4 d() {
        ou4 d;
        yia c = c(this.b);
        r38 r38Var = this.a;
        r38Var.a();
        String d2 = "[DEFAULT]".equals(r38Var.b) ? "" : r38Var.d();
        String c2 = pic.c(this.a);
        synchronized (c) {
            d = ou4.d(((SharedPreferences) c.b).getString(d2 + "|T|" + c2 + "|*", null));
        }
        return d;
    }

    public final void e() {
        Task forException;
        int i;
        Rpc rpc = (Rpc) this.c.d;
        int i2 = 1;
        if (rpc.c.b() >= 241100000) {
            zzv a = zzv.a(rpc.b);
            Bundle bundle = Bundle.EMPTY;
            synchronized (a) {
                i = a.d;
                a.d = i + 1;
            }
            forException = a.b(new s3p(i, 5, bundle, 1)).continueWith(g35.d, dff.b);
        } else {
            forException = Tasks.forException(new IOException("SERVICE_NOT_AVAILABLE"));
        }
        forException.addOnSuccessListener(this.g, new q48(this, i2));
    }

    public final boolean f() {
        Context context = this.b;
        eq3.C(context);
        if (!eq3.F(context)) {
            return false;
        }
        if (this.a.b(iu.class) != null) {
            return true;
        }
        return qea.q() && m != null;
    }

    public final synchronized void g(long j) {
        b(j, new mpi(this, Math.min(Math.max(30L, 2 * j), 28800L)));
        this.k = true;
    }

    public final boolean h(ou4 ou4Var) {
        String str;
        if (ou4Var != null) {
            String str2 = (String) ou4Var.b;
            String b = this.i.b();
            if (System.currentTimeMillis() <= ou4Var.a + 604800000 && b.equals((String) ou4Var.c)) {
                if (!this.d.n()) {
                    return str2.length() <= 22;
                }
                try {
                    str = (String) Tasks.await(((k48) this.j).c());
                } catch (InterruptedException | ExecutionException unused) {
                    str = null;
                }
                return !str2.equalsIgnoreCase(str);
            }
        }
        return true;
    }
}
