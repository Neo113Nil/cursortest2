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
import java.io.IOException;

/* loaded from: classes9.dex */
final class V implements Runnable {

    /* renamed from: f, reason: collision with root package name */
    private static final Object f59662f = new Object();

    /* renamed from: g, reason: collision with root package name */
    private static Boolean f59663g;

    /* renamed from: h, reason: collision with root package name */
    private static Boolean f59664h;

    /* renamed from: a, reason: collision with root package name */
    private final Context f59665a;

    /* renamed from: b, reason: collision with root package name */
    private final C5944z f59666b;

    /* renamed from: c, reason: collision with root package name */
    private final PowerManager.WakeLock f59667c;

    /* renamed from: d, reason: collision with root package name */
    private final U f59668d;

    /* renamed from: e, reason: collision with root package name */
    private final long f59669e;

    class a extends BroadcastReceiver {

        /* renamed from: a, reason: collision with root package name */
        private V f59670a;

        public a(V v11) {
            this.f59670a = v11;
        }

        public final void a() {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Connectivity change received registered");
            }
            V.this.f59665a.registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        }

        @Override // android.content.BroadcastReceiver
        public final synchronized void onReceive(Context context, Intent intent) {
            try {
                V v11 = this.f59670a;
                if (v11 == null) {
                    return;
                }
                if (v11.g()) {
                    if (Log.isLoggable("FirebaseMessaging", 3)) {
                        Log.d("FirebaseMessaging", "Connectivity changed. Starting background sync.");
                    }
                    this.f59670a.f59668d.c(this.f59670a, 0L);
                    context.unregisterReceiver(this);
                    this.f59670a = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    V(U u11, Context context, C5944z c5944z, long j11) {
        this.f59668d = u11;
        this.f59665a = context;
        this.f59669e = j11;
        this.f59666b = c5944z;
        this.f59667c = ((PowerManager) context.getSystemService("power")).newWakeLock(1, "wake:com.google.firebase.messaging");
    }

    private static boolean d(Context context) {
        boolean booleanValue;
        synchronized (f59662f) {
            try {
                Boolean bool = f59664h;
                Boolean valueOf = Boolean.valueOf(bool == null ? e(context, "android.permission.ACCESS_NETWORK_STATE", bool) : bool.booleanValue());
                f59664h = valueOf;
                booleanValue = valueOf.booleanValue();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return booleanValue;
    }

    private static boolean e(Context context, String str, Boolean bool) {
        if (bool != null) {
            return bool.booleanValue();
        }
        boolean z11 = context.checkCallingOrSelfPermission(str) == 0;
        if (!z11 && Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Missing Permission: " + str + ". This permission should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return z11;
    }

    private static boolean f(Context context) {
        boolean booleanValue;
        synchronized (f59662f) {
            try {
                Boolean bool = f59663g;
                Boolean valueOf = Boolean.valueOf(bool == null ? e(context, "android.permission.WAKE_LOCK", bool) : bool.booleanValue());
                f59663g = valueOf;
                booleanValue = valueOf.booleanValue();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return booleanValue;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized boolean g() {
        boolean z11;
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) this.f59665a.getSystemService("connectivity");
            NetworkInfo activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
            if (activeNetworkInfo != null) {
                z11 = activeNetworkInfo.isConnected();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return z11;
    }

    /* JADX WARN: Finally extract failed */
    @Override // java.lang.Runnable
    @SuppressLint({"Wakelock"})
    public final void run() {
        U u11 = this.f59668d;
        Context context = this.f59665a;
        boolean f7 = f(context);
        PowerManager.WakeLock wakeLock = this.f59667c;
        if (f7) {
            wakeLock.acquire(C5925f.f59713a);
        }
        try {
            try {
                try {
                    u11.d(true);
                    if (!this.f59666b.f()) {
                        u11.d(false);
                        if (!f(context)) {
                            return;
                        }
                    } else if (!d(context) || g()) {
                        if (u11.f()) {
                            u11.d(false);
                        } else {
                            u11.g(this.f59669e);
                        }
                        if (!f(context)) {
                            return;
                        }
                    } else {
                        new a(this).a();
                        if (!f(context)) {
                            return;
                        }
                    }
                    wakeLock.release();
                } catch (IOException e11) {
                    Log.e("FirebaseMessaging", "Failed to sync topics. Won't retry sync. " + e11.getMessage());
                    u11.d(false);
                    if (f(context)) {
                        wakeLock.release();
                    }
                }
            } catch (Throwable th2) {
                if (f(context)) {
                    try {
                        wakeLock.release();
                    } catch (RuntimeException unused) {
                        Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                    }
                }
                throw th2;
            }
        } catch (RuntimeException unused2) {
            Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
        }
    }
}
