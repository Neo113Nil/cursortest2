package com.google.firebase.messaging;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.PowerManager;
import android.util.Log;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public class f0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final long f37951a;

    /* renamed from: b, reason: collision with root package name */
    public final PowerManager.WakeLock f37952b;

    /* renamed from: c, reason: collision with root package name */
    public final FirebaseMessaging f37953c;

    /* renamed from: d, reason: collision with root package name */
    public ExecutorService f37954d = new ThreadPoolExecutor(0, 1, 30, TimeUnit.SECONDS, new LinkedBlockingQueue(), new L9.b("firebase-iid-executor"));

    public static class a extends BroadcastReceiver {

        /* renamed from: a, reason: collision with root package name */
        public f0 f37955a;

        /* renamed from: b, reason: collision with root package name */
        public Context f37956b;

        public a(f0 f0Var) {
            this.f37955a = f0Var;
        }

        public void a() {
            f0.c();
            IntentFilter intentFilter = new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE");
            f0 f0Var = this.f37955a;
            if (f0Var != null) {
                Context b10 = f0Var.b();
                this.f37956b = b10;
                b10.registerReceiver(this, intentFilter);
            }
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            f0 f0Var = this.f37955a;
            if (f0Var != null && f0Var.d()) {
                f0.c();
                this.f37955a.f37953c.enqueueTaskWithDelaySeconds(this.f37955a, 0L);
                Context context2 = this.f37956b;
                if (context2 != null) {
                    context2.unregisterReceiver(this);
                }
                this.f37955a = null;
            }
        }
    }

    public f0(FirebaseMessaging firebaseMessaging, long j10) {
        this.f37953c = firebaseMessaging;
        this.f37951a = j10;
        PowerManager.WakeLock newWakeLock = ((PowerManager) b().getSystemService("power")).newWakeLock(1, "fiid-sync");
        this.f37952b = newWakeLock;
        newWakeLock.setReferenceCounted(false);
    }

    public static boolean c() {
        return Log.isLoggable("FirebaseMessaging", 3);
    }

    public Context b() {
        return this.f37953c.getApplicationContext();
    }

    public boolean d() {
        ConnectivityManager connectivityManager = (ConnectivityManager) b().getSystemService("connectivity");
        NetworkInfo activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    public boolean e() {
        try {
            if (this.f37953c.blockingGetToken() == null) {
                Log.e("FirebaseMessaging", "Token retrieval failed: null");
                return false;
            }
            Log.isLoggable("FirebaseMessaging", 3);
            return true;
        } catch (IOException e10) {
            if (!I.i(e10.getMessage())) {
                if (e10.getMessage() != null) {
                    throw e10;
                }
                Log.w("FirebaseMessaging", "Token retrieval failed without exception message. Will retry token retrieval");
                return false;
            }
            Log.w("FirebaseMessaging", "Token retrieval failed: " + e10.getMessage() + ". Will retry token retrieval");
            return false;
        } catch (SecurityException unused) {
            Log.w("FirebaseMessaging", "Token retrieval failed with SecurityException. Will retry token retrieval");
            return false;
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        if (b0.b().e(b())) {
            this.f37952b.acquire();
        }
        try {
            try {
                this.f37953c.setSyncScheduledOrRunning(true);
                if (!this.f37953c.isGmsCorePresent()) {
                    this.f37953c.setSyncScheduledOrRunning(false);
                    if (!b0.b().e(b())) {
                        return;
                    }
                } else if (!b0.b().d(b()) || d()) {
                    if (e()) {
                        this.f37953c.setSyncScheduledOrRunning(false);
                    } else {
                        this.f37953c.syncWithDelaySecondsInternal(this.f37951a);
                    }
                    if (!b0.b().e(b())) {
                        return;
                    }
                } else {
                    new a(this).a();
                    if (!b0.b().e(b())) {
                        return;
                    }
                }
                this.f37952b.release();
            } catch (IOException e10) {
                Log.e("FirebaseMessaging", "Topic sync or token retrieval failed on hard failure exceptions: " + e10.getMessage() + ". Won't retry the operation.");
                this.f37953c.setSyncScheduledOrRunning(false);
                if (b0.b().e(b())) {
                    this.f37952b.release();
                }
            }
        } catch (Throwable th2) {
            if (b0.b().e(b())) {
                this.f37952b.release();
            }
            throw th2;
        }
    }
}
