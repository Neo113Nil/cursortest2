package com.google.firebase.messaging;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.util.Log;
import com.google.android.gms.common.stats.ConnectionTracker;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.messaging.c0;
import java.util.ArrayDeque;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
final class c0 implements ServiceConnection {

    /* renamed from: a, reason: collision with root package name */
    private final Context f59700a;

    /* renamed from: b, reason: collision with root package name */
    private final Intent f59701b;

    /* renamed from: c, reason: collision with root package name */
    private final ScheduledThreadPoolExecutor f59702c;

    /* renamed from: d, reason: collision with root package name */
    private final ArrayDeque f59703d;

    /* renamed from: e, reason: collision with root package name */
    private Z f59704e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f59705f;

    static class a {

        /* renamed from: a, reason: collision with root package name */
        final Intent f59706a;

        /* renamed from: b, reason: collision with root package name */
        private final TaskCompletionSource<Void> f59707b = new TaskCompletionSource<>();

        a(Intent intent) {
            this.f59706a = intent;
        }

        final void a(ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
            this.f59707b.getTask().addOnCompleteListener(scheduledThreadPoolExecutor, new b0(scheduledThreadPoolExecutor.schedule(new Runnable() { // from class: com.google.firebase.messaging.a0
                @Override // java.lang.Runnable
                public final void run() {
                    StringBuilder sb2 = new StringBuilder("Service took too long to process intent: ");
                    c0.a aVar = c0.a.this;
                    sb2.append(aVar.f59706a.getAction());
                    sb2.append(" finishing.");
                    Log.w("FirebaseMessaging", sb2.toString());
                    aVar.b();
                }
            }, 20L, TimeUnit.SECONDS)));
        }

        final void b() {
            this.f59707b.trySetResult(null);
        }

        final Task<Void> c() {
            return this.f59707b.getTask();
        }
    }

    c0(Context context) {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1);
        scheduledThreadPoolExecutor.setKeepAliveTime(40L, TimeUnit.SECONDS);
        scheduledThreadPoolExecutor.allowCoreThreadTimeOut(true);
        this.f59703d = new ArrayDeque();
        this.f59705f = false;
        Context applicationContext = context.getApplicationContext();
        this.f59700a = applicationContext;
        this.f59701b = new Intent("com.google.firebase.MESSAGING_EVENT").setPackage(applicationContext.getPackageName());
        this.f59702c = scheduledThreadPoolExecutor;
    }

    private synchronized void a() {
        try {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "flush queue called");
            }
            while (!this.f59703d.isEmpty()) {
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "found intent to be delivered");
                }
                Z z11 = this.f59704e;
                if (z11 == null || !z11.isBinderAlive()) {
                    c();
                    return;
                }
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "binder is alive, sending the intent.");
                }
                this.f59704e.a((a) this.f59703d.poll());
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    private void c() {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            StringBuilder sb2 = new StringBuilder("binder is dead. start connection? ");
            sb2.append(!this.f59705f);
            Log.d("FirebaseMessaging", sb2.toString());
        }
        if (this.f59705f) {
            return;
        }
        this.f59705f = true;
        try {
        } catch (SecurityException e11) {
            Log.e("FirebaseMessaging", "Exception while binding the service", e11);
        }
        if (ConnectionTracker.getInstance().bindService(this.f59700a, this.f59701b, this, 65)) {
            return;
        }
        Log.e("FirebaseMessaging", "binding to the service failed");
        this.f59705f = false;
        while (true) {
            ArrayDeque arrayDeque = this.f59703d;
            if (arrayDeque.isEmpty()) {
                return;
            } else {
                ((a) arrayDeque.poll()).b();
            }
        }
    }

    final synchronized Task<Void> b(Intent intent) {
        a aVar;
        try {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "new intent queued in the bind-strategy delivery");
            }
            aVar = new a(intent);
            aVar.a(this.f59702c);
            this.f59703d.add(aVar);
            a();
        } catch (Throwable th2) {
            throw th2;
        }
        return aVar.c();
    }

    @Override // android.content.ServiceConnection
    public final synchronized void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        try {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "onServiceConnected: " + componentName);
            }
            this.f59705f = false;
            if (iBinder instanceof Z) {
                this.f59704e = (Z) iBinder;
                a();
                return;
            }
            Log.e("FirebaseMessaging", "Invalid service connection: " + iBinder);
            while (true) {
                ArrayDeque arrayDeque = this.f59703d;
                if (arrayDeque.isEmpty()) {
                    return;
                } else {
                    ((a) arrayDeque.poll()).b();
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "onServiceDisconnected: " + componentName);
        }
        a();
    }
}
