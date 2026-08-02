package com.google.firebase.messaging;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.util.Log;
import io.sentry.android.core.w0;
import java.util.ArrayDeque;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class k0 implements ServiceConnection {

    /* renamed from: a, reason: collision with root package name */
    public final Context f6148a;

    /* renamed from: b, reason: collision with root package name */
    public final Intent f6149b;

    /* renamed from: c, reason: collision with root package name */
    public final ScheduledThreadPoolExecutor f6150c;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayDeque f6151d;

    /* renamed from: e, reason: collision with root package name */
    public i0 f6152e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f6153f;

    public k0(Context context) {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, new com.android.billingclient.api.e0("Firebase-FirebaseInstanceIdServiceConnection"));
        scheduledThreadPoolExecutor.setKeepAliveTime(40L, TimeUnit.SECONDS);
        scheduledThreadPoolExecutor.allowCoreThreadTimeOut(true);
        this.f6151d = new ArrayDeque();
        this.f6153f = false;
        Context applicationContext = context.getApplicationContext();
        this.f6148a = applicationContext;
        this.f6149b = new Intent("com.google.firebase.MESSAGING_EVENT").setPackage(applicationContext.getPackageName());
        this.f6150c = scheduledThreadPoolExecutor;
    }

    public final synchronized void a() {
        try {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "flush queue called");
            }
            while (!this.f6151d.isEmpty()) {
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "found intent to be delivered");
                }
                i0 i0Var = this.f6152e;
                if (i0Var == null || !i0Var.isBinderAlive()) {
                    c();
                    return;
                }
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "binder is alive, sending the intent.");
                }
                this.f6152e.a((j0) this.f6151d.poll());
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized w7.m b(Intent intent) {
        j0 j0Var;
        try {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "new intent queued in the bind-strategy delivery");
            }
            j0Var = new j0(intent);
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = this.f6150c;
            j0Var.f6146b.f24979a.b(scheduledThreadPoolExecutor, new androidx.credentials.playservices.controllers.CreateRestoreCredential.a(9, scheduledThreadPoolExecutor.schedule(new aa.c(11, j0Var), 20L, TimeUnit.SECONDS)));
            this.f6151d.add(j0Var);
            a();
        } catch (Throwable th2) {
            throw th2;
        }
        return j0Var.f6146b.f24979a;
    }

    public final void c() {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            StringBuilder sb2 = new StringBuilder("binder is dead. start connection? ");
            sb2.append(!this.f6153f);
            Log.d("FirebaseMessaging", sb2.toString());
        }
        if (this.f6153f) {
            return;
        }
        this.f6153f = true;
        try {
        } catch (SecurityException e7) {
            w0.e("FirebaseMessaging", "Exception while binding the service", e7);
        }
        if (p6.a.b().a(this.f6148a, this.f6149b, this, 65)) {
            return;
        }
        w0.d("FirebaseMessaging", "binding to the service failed");
        this.f6153f = false;
        while (true) {
            ArrayDeque arrayDeque = this.f6151d;
            if (arrayDeque.isEmpty()) {
                return;
            } else {
                ((j0) arrayDeque.poll()).f6146b.d(null);
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final synchronized void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        try {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "onServiceConnected: " + componentName);
            }
            this.f6153f = false;
            if (iBinder instanceof i0) {
                this.f6152e = (i0) iBinder;
                a();
                return;
            }
            w0.d("FirebaseMessaging", "Invalid service connection: " + iBinder);
            ArrayDeque arrayDeque = this.f6151d;
            while (!arrayDeque.isEmpty()) {
                ((j0) arrayDeque.poll()).f6146b.d(null);
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
