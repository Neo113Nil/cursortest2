package com.google.firebase.messaging;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.PowerManager;
import android.util.Log;
import com.google.android.gms.common.util.concurrent.NamedThreadFactory;
import java.io.IOException;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
final class P implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final long f59635a;

    /* renamed from: b, reason: collision with root package name */
    private final PowerManager.WakeLock f59636b;

    /* renamed from: c, reason: collision with root package name */
    private final FirebaseMessaging f59637c;

    /* renamed from: d, reason: collision with root package name */
    @SuppressLint({"ThreadPoolCreation"})
    ThreadPoolExecutor f59638d = new ThreadPoolExecutor(0, 1, 30, TimeUnit.SECONDS, new LinkedBlockingQueue(), new NamedThreadFactory("firebase-iid-executor"));

    /* loaded from: classes9.dex */
    static class a extends BroadcastReceiver {

        /* renamed from: a, reason: collision with root package name */
        private P f59639a;

        /* renamed from: b, reason: collision with root package name */
        private Context f59640b;

        public a(P p11) {
            this.f59639a = p11;
        }

        public final void a() {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Connectivity change received registered");
            }
            IntentFilter intentFilter = new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE");
            P p11 = this.f59639a;
            if (p11 != null) {
                Context b11 = p11.b();
                this.f59640b = b11;
                b11.registerReceiver(this, intentFilter);
            }
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            P p11 = this.f59639a;
            if (p11 != null && p11.c()) {
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "Connectivity changed. Starting background sync.");
                }
                FirebaseMessaging firebaseMessaging = this.f59639a.f59637c;
                P p12 = this.f59639a;
                firebaseMessaging.getClass();
                FirebaseMessaging.j(p12, 0L);
                Context context2 = this.f59640b;
                if (context2 != null) {
                    context2.unregisterReceiver(this);
                }
                this.f59639a = null;
            }
        }
    }

    @SuppressLint({"InvalidWakeLockTag"})
    public P(FirebaseMessaging firebaseMessaging, long j11) {
        this.f59637c = firebaseMessaging;
        this.f59635a = j11;
        PowerManager.WakeLock newWakeLock = ((PowerManager) firebaseMessaging.k().getSystemService("power")).newWakeLock(1, "fiid-sync");
        this.f59636b = newWakeLock;
        newWakeLock.setReferenceCounted(false);
    }

    final Context b() {
        return this.f59637c.k();
    }

    final boolean c() {
        ConnectivityManager connectivityManager = (ConnectivityManager) this.f59637c.k().getSystemService("connectivity");
        NetworkInfo activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    final boolean d() throws IOException {
        try {
            if (this.f59637c.i() == null) {
                Log.e("FirebaseMessaging", "Token retrieval failed: null");
                return false;
            }
            if (!Log.isLoggable("FirebaseMessaging", 3)) {
                return true;
            }
            Log.d("FirebaseMessaging", "Token successfully retrieved");
            return true;
        } catch (IOException e11) {
            String message = e11.getMessage();
            if (!"SERVICE_NOT_AVAILABLE".equals(message) && !"INTERNAL_SERVER_ERROR".equals(message) && !"InternalServerError".equals(message)) {
                if (e11.getMessage() != null) {
                    throw e11;
                }
                Log.w("FirebaseMessaging", "Token retrieval failed without exception message. Will retry token retrieval");
                return false;
            }
            Log.w("FirebaseMessaging", "Token retrieval failed: " + e11.getMessage() + ". Will retry token retrieval");
            return false;
        } catch (SecurityException unused) {
            Log.w("FirebaseMessaging", "Token retrieval failed with SecurityException. Will retry token retrieval");
            return false;
        }
    }

    @Override // java.lang.Runnable
    @SuppressLint({"WakelockTimeout"})
    public final void run() {
        L a11 = L.a();
        FirebaseMessaging firebaseMessaging = this.f59637c;
        boolean d11 = a11.d(firebaseMessaging.k());
        PowerManager.WakeLock wakeLock = this.f59636b;
        if (d11) {
            wakeLock.acquire();
        }
        try {
            try {
                firebaseMessaging.p(true);
                if (!firebaseMessaging.o()) {
                    firebaseMessaging.p(false);
                    if (L.a().d(firebaseMessaging.k())) {
                        wakeLock.release();
                        return;
                    }
                    return;
                }
                if (L.a().c(firebaseMessaging.k()) && !c()) {
                    new a(this).a();
                    if (L.a().d(firebaseMessaging.k())) {
                        wakeLock.release();
                        return;
                    }
                    return;
                }
                if (d()) {
                    firebaseMessaging.p(false);
                } else {
                    firebaseMessaging.s(this.f59635a);
                }
                if (L.a().d(firebaseMessaging.k())) {
                    wakeLock.release();
                }
            } catch (IOException e11) {
                Log.e("FirebaseMessaging", "Topic sync or token retrieval failed on hard failure exceptions: " + e11.getMessage() + ". Won't retry the operation.");
                firebaseMessaging.p(false);
                if (L.a().d(firebaseMessaging.k())) {
                    wakeLock.release();
                }
            }
        } catch (Throwable th2) {
            if (L.a().d(firebaseMessaging.k())) {
                wakeLock.release();
            }
            throw th2;
        }
    }
}
