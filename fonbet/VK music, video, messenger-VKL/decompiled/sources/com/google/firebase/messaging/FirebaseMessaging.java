package com.google.firebase.messaging;

import android.annotation.SuppressLint;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.heartbeatinfo.HeartBeatInfo;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.messaging.a;
import com.vk.core.preference.Preference;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;
import xsna.azp;
import xsna.bxm0;
import xsna.exc0;
import xsna.f9e0;
import xsna.gi20;
import xsna.h;
import xsna.h3u;
import xsna.hgq0;
import xsna.i;
import xsna.kon0;
import xsna.n7g0;
import xsna.t9p0;
import xsna.top0;
import xsna.uir;
import xsna.utq;
import xsna.vhr;
import xsna.vir;
import xsna.zir;
import xsna.zt50;

/* loaded from: classes.dex */
public class FirebaseMessaging {
    public static final long m = TimeUnit.HOURS.toSeconds(8);
    public static com.google.firebase.messaging.a n;

    @Nullable
    @SuppressLint({"FirebaseUnknownNullness"})
    public static top0 o;
    public static ScheduledThreadPoolExecutor p;
    public final vhr a;

    @Nullable
    public final vir b;
    public final uir c;
    public final Context d;
    public final h3u e;
    public final n7g0 f;
    public final a g;
    public final ScheduledThreadPoolExecutor h;
    public final ExecutorService i;
    public final ThreadPoolExecutor j;
    public final gi20 k;
    public boolean l;

    public class a {
        public final bxm0 a;
        public boolean b;

        @Nullable
        public Boolean c;

        public a(bxm0 bxm0Var) {
            this.a = bxm0Var;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v5, types: [xsna.cjr] */
        public final synchronized boolean a() {
            try {
                synchronized (this) {
                    try {
                        if (!this.b) {
                            Boolean b = b();
                            this.c = b;
                            if (b == null) {
                                this.a.a(new azp() { // from class: xsna.cjr
                                    @Override // xsna.azp
                                    public final void a(qxp qxpVar) {
                                        FirebaseMessaging.a aVar = FirebaseMessaging.a.this;
                                        if (aVar.a()) {
                                            FirebaseMessaging firebaseMessaging = FirebaseMessaging.this;
                                            com.google.firebase.messaging.a aVar2 = FirebaseMessaging.n;
                                            firebaseMessaging.h();
                                        }
                                    }
                                });
                            }
                            this.b = true;
                        }
                    } finally {
                    }
                }
                return r0 != null ? r0.booleanValue() : FirebaseMessaging.this.a.i();
            } catch (Throwable th) {
                throw th;
            }
            Boolean bool = this.c;
            return bool != null ? bool.booleanValue() : FirebaseMessaging.this.a.i();
        }

        @Nullable
        public final Boolean b() {
            ApplicationInfo applicationInfo;
            Bundle bundle;
            vhr vhrVar = FirebaseMessaging.this.a;
            vhrVar.a();
            Context context = vhrVar.a;
            SharedPreferences h = Preference.h(context, 0, "com.google.firebase.messaging");
            if (h.contains("auto_init")) {
                return Boolean.valueOf(h.getBoolean("auto_init", false));
            }
            try {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_messaging_auto_init_enabled")) {
                    return null;
                }
                return Boolean.valueOf(applicationInfo.metaData.getBoolean("firebase_messaging_auto_init_enabled"));
            } catch (PackageManager.NameNotFoundException unused) {
                return null;
            }
        }
    }

    public FirebaseMessaging() {
        throw null;
    }

    public FirebaseMessaging(vhr vhrVar, @Nullable vir virVar, f9e0<hgq0> f9e0Var, f9e0<HeartBeatInfo> f9e0Var2, uir uirVar, @Nullable top0 top0Var, bxm0 bxm0Var) {
        vhrVar.a();
        Context context = vhrVar.a;
        final gi20 gi20Var = new gi20(context);
        final h3u h3uVar = new h3u(vhrVar, gi20Var, f9e0Var, f9e0Var2, uirVar);
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor(new zt50("Firebase-Messaging-Task"));
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, new zt50("Firebase-Messaging-Init"));
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new zt50("Firebase-Messaging-File-Io"));
        int i = 0;
        this.l = false;
        o = top0Var;
        this.a = vhrVar;
        this.b = virVar;
        this.c = uirVar;
        this.g = new a(bxm0Var);
        vhrVar.a();
        final Context context2 = vhrVar.a;
        this.d = context2;
        utq utqVar = new utq();
        this.k = gi20Var;
        this.i = newSingleThreadExecutor;
        this.e = h3uVar;
        this.f = new n7g0(newSingleThreadExecutor);
        this.h = scheduledThreadPoolExecutor;
        this.j = threadPoolExecutor;
        vhrVar.a();
        if (context instanceof Application) {
            ((Application) context).registerActivityLifecycleCallbacks(utqVar);
        } else {
            Objects.toString(context);
        }
        if (virVar != null) {
            virVar.b();
        }
        scheduledThreadPoolExecutor.execute(new Runnable() { // from class: xsna.xir
            @Override // java.lang.Runnable
            public final void run() {
                FirebaseMessaging firebaseMessaging = FirebaseMessaging.this;
                if (firebaseMessaging.g.a()) {
                    firebaseMessaging.h();
                }
            }
        });
        final ScheduledThreadPoolExecutor scheduledThreadPoolExecutor2 = new ScheduledThreadPoolExecutor(1, new zt50("Firebase-Messaging-Topics-Io"));
        int i2 = t9p0.j;
        Tasks.call(scheduledThreadPoolExecutor2, new Callable() { // from class: xsna.s9p0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                r9p0 r9p0Var;
                Context context3 = context2;
                ScheduledThreadPoolExecutor scheduledThreadPoolExecutor3 = scheduledThreadPoolExecutor2;
                FirebaseMessaging firebaseMessaging = this;
                gi20 gi20Var2 = gi20Var;
                h3u h3uVar2 = h3uVar;
                synchronized (r9p0.class) {
                    try {
                        WeakReference<r9p0> weakReference = r9p0.c;
                        r9p0Var = weakReference != null ? weakReference.get() : null;
                        if (r9p0Var == null) {
                            SharedPreferences h = Preference.h(context3, 0, "com.google.android.gms.appid");
                            r9p0 r9p0Var2 = new r9p0(h, scheduledThreadPoolExecutor3);
                            synchronized (r9p0Var2) {
                                r9p0Var2.a = raj0.a(h, scheduledThreadPoolExecutor3);
                            }
                            r9p0.c = new WeakReference<>(r9p0Var2);
                            r9p0Var = r9p0Var2;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return new t9p0(firebaseMessaging, gi20Var2, r9p0Var, h3uVar2, context3, scheduledThreadPoolExecutor3);
            }
        }).addOnSuccessListener(scheduledThreadPoolExecutor, new OnSuccessListener() { // from class: xsna.yir
            @Override // com.google.android.gms.tasks.OnSuccessListener
            public final void onSuccess(Object obj) {
                boolean z;
                t9p0 t9p0Var = (t9p0) obj;
                if (!FirebaseMessaging.this.g.a() || t9p0Var.h.a() == null) {
                    return;
                }
                synchronized (t9p0Var) {
                    z = t9p0Var.g;
                }
                if (z) {
                    return;
                }
                t9p0Var.f(0L);
            }
        });
        scheduledThreadPoolExecutor.execute(new zir(this, i));
    }

    @SuppressLint({"ThreadPoolCreation"})
    public static void c(long j, Runnable runnable) {
        synchronized (FirebaseMessaging.class) {
            try {
                if (p == null) {
                    p = new ScheduledThreadPoolExecutor(1, new zt50("TAG"));
                }
                p.schedule(runnable, j, TimeUnit.SECONDS);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @NonNull
    public static synchronized FirebaseMessaging d() {
        FirebaseMessaging firebaseMessaging;
        synchronized (FirebaseMessaging.class) {
            firebaseMessaging = getInstance(vhr.d());
        }
        return firebaseMessaging;
    }

    @NonNull
    public static synchronized com.google.firebase.messaging.a e(Context context) {
        com.google.firebase.messaging.a aVar;
        synchronized (FirebaseMessaging.class) {
            try {
                if (n == null) {
                    n = new com.google.firebase.messaging.a(context);
                }
                aVar = n;
            } catch (Throwable th) {
                throw th;
            }
        }
        return aVar;
    }

    @NonNull
    @Keep
    public static synchronized FirebaseMessaging getInstance(@NonNull vhr vhrVar) {
        FirebaseMessaging firebaseMessaging;
        synchronized (FirebaseMessaging.class) {
            firebaseMessaging = (FirebaseMessaging) vhrVar.b(FirebaseMessaging.class);
            exc0.j(firebaseMessaging, "Firebase Messaging component is not present");
        }
        return firebaseMessaging;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String a() throws IOException {
        Task task;
        vir virVar = this.b;
        if (virVar != null) {
            try {
                return (String) Tasks.await(virVar.c());
            } catch (InterruptedException | ExecutionException e) {
                throw new IOException(e);
            }
        }
        final a.C0140a g = g();
        if (!j(g)) {
            return g.a;
        }
        final String b = gi20.b(this.a);
        final n7g0 n7g0Var = this.f;
        synchronized (n7g0Var) {
            task = (Task) n7g0Var.b.get(b);
            if (task == null) {
                h3u h3uVar = this.e;
                task = h3uVar.a(h3uVar.c(gi20.b(h3uVar.a), "*", new Bundle())).onSuccessTask(this.j, new SuccessContinuation() { // from class: xsna.bjr
                    @Override // com.google.android.gms.tasks.SuccessContinuation
                    public final Task then(Object obj) {
                        String str;
                        FirebaseMessaging firebaseMessaging = FirebaseMessaging.this;
                        String str2 = b;
                        a.C0140a c0140a = g;
                        String str3 = (String) obj;
                        com.google.firebase.messaging.a e2 = FirebaseMessaging.e(firebaseMessaging.d);
                        String f = firebaseMessaging.f();
                        String a2 = firebaseMessaging.k.a();
                        synchronized (e2) {
                            long currentTimeMillis = System.currentTimeMillis();
                            int i = a.C0140a.e;
                            try {
                                JSONObject jSONObject = new JSONObject();
                                jSONObject.put("token", str3);
                                jSONObject.put("appVersion", a2);
                                jSONObject.put("timestamp", currentTimeMillis);
                                str = jSONObject.toString();
                            } catch (JSONException e3) {
                                e3.toString();
                                str = null;
                            }
                            if (str != null) {
                                SharedPreferences.Editor edit = e2.a.edit();
                                edit.putString(com.google.firebase.messaging.a.a(f, str2), str);
                                edit.commit();
                            }
                        }
                        if (c0140a == null || !str3.equals(c0140a.a)) {
                            vhr vhrVar = firebaseMessaging.a;
                            vhrVar.a();
                            if ("[DEFAULT]".equals(vhrVar.b)) {
                                if (Log.isLoggable("FirebaseMessaging", 3)) {
                                    vhrVar.a();
                                }
                                Intent intent = new Intent("com.google.firebase.messaging.NEW_TOKEN");
                                intent.putExtra("token", str3);
                                new otq(firebaseMessaging.d).b(intent);
                            }
                        }
                        return Tasks.forResult(str3);
                    }
                }).continueWithTask(n7g0Var.a, new Continuation() { // from class: xsna.m7g0
                    @Override // com.google.android.gms.tasks.Continuation
                    public final Object then(Task task2) {
                        n7g0 n7g0Var2 = n7g0.this;
                        String str = b;
                        synchronized (n7g0Var2) {
                            n7g0Var2.b.remove(str);
                        }
                        return task2;
                    }
                });
                n7g0Var.b.put(b, task);
            }
        }
        try {
            return (String) Tasks.await(task);
        } catch (InterruptedException | ExecutionException e2) {
            throw new IOException(e2);
        }
    }

    @NonNull
    public final void b() {
        if (this.b != null) {
            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
            this.h.execute(new h(6, this, taskCompletionSource));
            taskCompletionSource.getTask();
            return;
        }
        if (g() == null) {
            Tasks.forResult(null);
            return;
        }
        TaskCompletionSource taskCompletionSource2 = new TaskCompletionSource();
        Executors.newSingleThreadExecutor(new zt50("Firebase-Messaging-Network-Io")).execute(new i(7, this, taskCompletionSource2));
        taskCompletionSource2.getTask();
    }

    public final String f() {
        vhr vhrVar = this.a;
        vhrVar.a();
        return "[DEFAULT]".equals(vhrVar.b) ? "" : vhrVar.f();
    }

    @Nullable
    public final a.C0140a g() {
        a.C0140a a2;
        com.google.firebase.messaging.a e = e(this.d);
        String f = f();
        String b = gi20.b(this.a);
        synchronized (e) {
            a2 = a.C0140a.a(e.a.getString(com.google.firebase.messaging.a.a(f, b), null));
        }
        return a2;
    }

    public final void h() {
        vir virVar = this.b;
        if (virVar != null) {
            virVar.getToken();
        } else if (j(g())) {
            synchronized (this) {
                if (!this.l) {
                    i(0L);
                }
            }
        }
    }

    public final synchronized void i(long j) {
        c(j, new kon0(this, Math.min(Math.max(30L, 2 * j), m)));
        this.l = true;
    }

    public final boolean j(@Nullable a.C0140a c0140a) {
        if (c0140a != null) {
            return System.currentTimeMillis() > c0140a.c + a.C0140a.d || !this.k.a().equals(c0140a.b);
        }
        return true;
    }
}
