package com.google.firebase.messaging;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.PowerManager;
import android.util.Log;
import io.sentry.android.core.w0;
import java.io.IOException;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class g0 implements Runnable {

    /* renamed from: f, reason: collision with root package name */
    public static final Object f6127f = new Object();

    /* renamed from: g, reason: collision with root package name */
    public static Boolean f6128g;

    /* renamed from: h, reason: collision with root package name */
    public static Boolean f6129h;

    /* renamed from: a, reason: collision with root package name */
    public final Context f6130a;

    /* renamed from: b, reason: collision with root package name */
    public final androidx.core.view.f f6131b;

    /* renamed from: c, reason: collision with root package name */
    public final PowerManager.WakeLock f6132c;

    /* renamed from: d, reason: collision with root package name */
    public final e0 f6133d;

    /* renamed from: e, reason: collision with root package name */
    public final long f6134e;

    public g0(e0 e0Var, Context context, androidx.core.view.f fVar, long j) {
        this.f6133d = e0Var;
        this.f6130a = context;
        this.f6134e = j;
        this.f6131b = fVar;
        this.f6132c = ((PowerManager) context.getSystemService("power")).newWakeLock(1, "wake:com.google.firebase.messaging");
    }

    public static boolean a(Context context) {
        boolean booleanValue;
        synchronized (f6127f) {
            try {
                Boolean bool = f6129h;
                Boolean valueOf = Boolean.valueOf(bool == null ? b(context, "android.permission.ACCESS_NETWORK_STATE", bool) : bool.booleanValue());
                f6129h = valueOf;
                booleanValue = valueOf.booleanValue();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return booleanValue;
    }

    public static boolean b(Context context, String str, Boolean bool) {
        if (bool != null) {
            return bool.booleanValue();
        }
        boolean z5 = context.checkCallingOrSelfPermission(str) == 0;
        if (!z5 && Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Missing Permission: " + str + ". This permission should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return z5;
    }

    public static boolean c(Context context) {
        boolean booleanValue;
        synchronized (f6127f) {
            try {
                Boolean bool = f6128g;
                Boolean valueOf = Boolean.valueOf(bool == null ? b(context, "android.permission.WAKE_LOCK", bool) : bool.booleanValue());
                f6128g = valueOf;
                booleanValue = valueOf.booleanValue();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return booleanValue;
    }

    public final synchronized boolean d() {
        boolean z5;
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) this.f6130a.getSystemService("connectivity");
            NetworkInfo activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
            if (activeNetworkInfo != null) {
                z5 = activeNetworkInfo.isConnected();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return z5;
    }

    /* JADX WARN: Finally extract failed */
    @Override // java.lang.Runnable
    public final void run() {
        e0 e0Var = this.f6133d;
        Context context = this.f6130a;
        boolean c2 = c(context);
        PowerManager.WakeLock wakeLock = this.f6132c;
        if (c2) {
            wakeLock.acquire(f.f6121a);
        }
        try {
            try {
                try {
                    e0Var.h(true);
                    if (!this.f6131b.j()) {
                        e0Var.h(false);
                        if (c(context)) {
                            try {
                                wakeLock.release();
                                return;
                            } catch (RuntimeException unused) {
                                Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                                return;
                            }
                        }
                        return;
                    }
                    if (!a(context) || d()) {
                        if (e0Var.j()) {
                            e0Var.h(false);
                        } else {
                            e0Var.k(this.f6134e);
                        }
                        if (c(context)) {
                            wakeLock.release();
                            return;
                        }
                        return;
                    }
                    new f0(this, this).a();
                    if (c(context)) {
                        try {
                            wakeLock.release();
                        } catch (RuntimeException unused2) {
                            Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                        }
                    }
                } catch (IOException e7) {
                    w0.d("FirebaseMessaging", "Failed to sync topics. Won't retry sync. " + e7.getMessage());
                    e0Var.h(false);
                    if (c(context)) {
                        wakeLock.release();
                    }
                }
            } catch (RuntimeException unused3) {
                Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
            }
        } catch (Throwable th2) {
            if (c(context)) {
                try {
                    wakeLock.release();
                } catch (RuntimeException unused4) {
                    Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                }
            }
            throw th2;
        }
    }
}
