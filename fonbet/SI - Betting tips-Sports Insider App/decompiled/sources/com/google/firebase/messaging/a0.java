package com.google.firebase.messaging;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.PowerManager;
import android.util.Log;
import io.sentry.android.core.w0;
import java.io.IOException;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class a0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final long f6089a;

    /* renamed from: b, reason: collision with root package name */
    public final PowerManager.WakeLock f6090b;

    /* renamed from: c, reason: collision with root package name */
    public final FirebaseMessaging f6091c;

    /* renamed from: d, reason: collision with root package name */
    public final ThreadPoolExecutor f6092d = new ThreadPoolExecutor(0, 1, 30, TimeUnit.SECONDS, new LinkedBlockingQueue(), new com.android.billingclient.api.e0("firebase-iid-executor"));

    public a0(FirebaseMessaging firebaseMessaging, long j) {
        this.f6091c = firebaseMessaging;
        this.f6089a = j;
        PowerManager.WakeLock newWakeLock = ((PowerManager) firebaseMessaging.f6063b.getSystemService("power")).newWakeLock(1, "fiid-sync");
        this.f6090b = newWakeLock;
        newWakeLock.setReferenceCounted(false);
    }

    public final boolean a() {
        ConnectivityManager connectivityManager = (ConnectivityManager) this.f6091c.f6063b.getSystemService("connectivity");
        NetworkInfo activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    public final boolean b() {
        try {
            if (this.f6091c.a() == null) {
                w0.d("FirebaseMessaging", "Token retrieval failed: null");
                return false;
            }
            if (!Log.isLoggable("FirebaseMessaging", 3)) {
                return true;
            }
            Log.d("FirebaseMessaging", "Token successfully retrieved");
            return true;
        } catch (IOException e7) {
            String message = e7.getMessage();
            if (!"SERVICE_NOT_AVAILABLE".equals(message) && !"INTERNAL_SERVER_ERROR".equals(message) && !"InternalServerError".equals(message)) {
                if (e7.getMessage() != null) {
                    throw e7;
                }
                w0.m("FirebaseMessaging", "Token retrieval failed without exception message. Will retry token retrieval");
                return false;
            }
            w0.m("FirebaseMessaging", "Token retrieval failed: " + e7.getMessage() + ". Will retry token retrieval");
            return false;
        } catch (SecurityException unused) {
            w0.m("FirebaseMessaging", "Token retrieval failed with SecurityException. Will retry token retrieval");
            return false;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        PowerManager.WakeLock wakeLock = this.f6090b;
        x w10 = x.w();
        FirebaseMessaging firebaseMessaging = this.f6091c;
        if (w10.z(firebaseMessaging.f6063b)) {
            wakeLock.acquire();
        }
        try {
            try {
                synchronized (firebaseMessaging) {
                    firebaseMessaging.j = true;
                }
                if (!firebaseMessaging.f6070i.j()) {
                    firebaseMessaging.f(false);
                    if (x.w().z(firebaseMessaging.f6063b)) {
                        wakeLock.release();
                        return;
                    }
                    return;
                }
                if (!x.w().y(firebaseMessaging.f6063b) || a()) {
                    if (b()) {
                        firebaseMessaging.f(false);
                    } else {
                        firebaseMessaging.h(this.f6089a);
                    }
                    if (x.w().z(firebaseMessaging.f6063b)) {
                        wakeLock.release();
                        return;
                    }
                    return;
                }
                z zVar = new z();
                zVar.f6192c = this;
                zVar.a();
                if (x.w().z(firebaseMessaging.f6063b)) {
                    wakeLock.release();
                }
            } catch (IOException e7) {
                w0.d("FirebaseMessaging", "Topic sync or token retrieval failed on hard failure exceptions: " + e7.getMessage() + ". Won't retry the operation.");
                firebaseMessaging.f(false);
                if (x.w().z(firebaseMessaging.f6063b)) {
                    wakeLock.release();
                }
            }
        } catch (Throwable th2) {
            if (x.w().z(firebaseMessaging.f6063b)) {
                wakeLock.release();
            }
            throw th2;
        }
    }
}
