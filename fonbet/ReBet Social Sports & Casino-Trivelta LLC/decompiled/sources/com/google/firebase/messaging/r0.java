package com.google.firebase.messaging;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.util.Log;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.messaging.r0;
import java.util.ArrayDeque;
import java.util.Objects;
import java.util.Queue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public class r0 implements ServiceConnection {

    /* renamed from: a, reason: collision with root package name */
    public final Context f38016a;

    /* renamed from: b, reason: collision with root package name */
    public final Intent f38017b;

    /* renamed from: c, reason: collision with root package name */
    public final ScheduledExecutorService f38018c;

    /* renamed from: d, reason: collision with root package name */
    public final Queue f38019d;

    /* renamed from: e, reason: collision with root package name */
    public o0 f38020e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f38021f;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final Intent f38022a;

        /* renamed from: b, reason: collision with root package name */
        public final TaskCompletionSource f38023b = new TaskCompletionSource();

        public a(Intent intent) {
            this.f38022a = intent;
        }

        public static /* synthetic */ void b(a aVar) {
            aVar.getClass();
            Log.w("FirebaseMessaging", "Service took too long to process intent: " + aVar.f38022a.getAction() + " finishing.");
            aVar.d();
        }

        public void c(ScheduledExecutorService scheduledExecutorService) {
            final ScheduledFuture<?> schedule = scheduledExecutorService.schedule(new Runnable() { // from class: com.google.firebase.messaging.p0
                @Override // java.lang.Runnable
                public final void run() {
                    r0.a.b(r0.a.this);
                }
            }, 20L, TimeUnit.SECONDS);
            e().addOnCompleteListener(scheduledExecutorService, new OnCompleteListener() { // from class: com.google.firebase.messaging.q0
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task) {
                    schedule.cancel(false);
                }
            });
        }

        public void d() {
            this.f38023b.trySetResult(null);
        }

        public Task e() {
            return this.f38023b.getTask();
        }
    }

    public r0(Context context, String str) {
        this(context, str, a());
    }

    public static ScheduledThreadPoolExecutor a() {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, new L9.b("Firebase-FirebaseInstanceIdServiceConnection"));
        scheduledThreadPoolExecutor.setKeepAliveTime(40L, TimeUnit.SECONDS);
        scheduledThreadPoolExecutor.allowCoreThreadTimeOut(true);
        return scheduledThreadPoolExecutor;
    }

    public final void b() {
        while (!this.f38019d.isEmpty()) {
            ((a) this.f38019d.poll()).d();
        }
    }

    public final synchronized void c() {
        try {
            Log.isLoggable("FirebaseMessaging", 3);
            while (!this.f38019d.isEmpty()) {
                Log.isLoggable("FirebaseMessaging", 3);
                o0 o0Var = this.f38020e;
                if (o0Var == null || !o0Var.isBinderAlive()) {
                    e();
                    return;
                } else {
                    Log.isLoggable("FirebaseMessaging", 3);
                    this.f38020e.b((a) this.f38019d.poll());
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized Task d(Intent intent) {
        a aVar;
        Log.isLoggable("FirebaseMessaging", 3);
        aVar = new a(intent);
        aVar.c(this.f38018c);
        this.f38019d.add(aVar);
        c();
        return aVar.e();
    }

    public final void e() {
        Log.isLoggable("FirebaseMessaging", 3);
        if (this.f38021f) {
            return;
        }
        this.f38021f = true;
        try {
        } catch (SecurityException e10) {
            Log.e("FirebaseMessaging", "Exception while binding the service", e10);
        }
        if (J9.b.b().a(this.f38016a, this.f38017b, this, 65)) {
            return;
        }
        Log.e("FirebaseMessaging", "binding to the service failed");
        this.f38021f = false;
        b();
    }

    @Override // android.content.ServiceConnection
    public synchronized void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        try {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Objects.toString(componentName);
            }
            this.f38021f = false;
            if (iBinder instanceof o0) {
                this.f38020e = (o0) iBinder;
                c();
                return;
            }
            Log.e("FirebaseMessaging", "Invalid service connection: " + iBinder);
            b();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Objects.toString(componentName);
        }
        c();
    }

    public r0(Context context, String str, ScheduledExecutorService scheduledExecutorService) {
        this.f38019d = new ArrayDeque();
        this.f38021f = false;
        Context applicationContext = context.getApplicationContext();
        this.f38016a = applicationContext;
        this.f38017b = new Intent(str).setPackage(applicationContext.getPackageName());
        this.f38018c = scheduledExecutorService;
    }
}
