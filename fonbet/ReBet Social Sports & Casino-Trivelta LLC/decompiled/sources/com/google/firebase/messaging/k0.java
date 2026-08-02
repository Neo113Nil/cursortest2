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

/* loaded from: classes3.dex */
public class k0 implements Runnable {

    /* renamed from: f, reason: collision with root package name */
    public static final Object f37990f = new Object();

    /* renamed from: g, reason: collision with root package name */
    public static Boolean f37991g;

    /* renamed from: h, reason: collision with root package name */
    public static Boolean f37992h;

    /* renamed from: a, reason: collision with root package name */
    public final Context f37993a;

    /* renamed from: b, reason: collision with root package name */
    public final N f37994b;

    /* renamed from: c, reason: collision with root package name */
    public final PowerManager.WakeLock f37995c;

    /* renamed from: d, reason: collision with root package name */
    public final j0 f37996d;

    /* renamed from: e, reason: collision with root package name */
    public final long f37997e;

    public class a extends BroadcastReceiver {

        /* renamed from: a, reason: collision with root package name */
        public k0 f37998a;

        public a(k0 k0Var) {
            this.f37998a = k0Var;
        }

        public void a() {
            k0.j();
            k0.this.f37993a.registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        }

        @Override // android.content.BroadcastReceiver
        public synchronized void onReceive(Context context, Intent intent) {
            k0 k0Var = this.f37998a;
            if (k0Var == null) {
                return;
            }
            if (k0Var.i()) {
                k0.j();
                this.f37998a.f37996d.l(this.f37998a, 0L);
                context.unregisterReceiver(this);
                this.f37998a = null;
            }
        }
    }

    public k0(j0 j0Var, Context context, N n10, long j10) {
        this.f37996d = j0Var;
        this.f37993a = context;
        this.f37997e = j10;
        this.f37994b = n10;
        this.f37995c = ((PowerManager) context.getSystemService("power")).newWakeLock(1, "wake:com.google.firebase.messaging");
    }

    public static String e(String str) {
        return "Missing Permission: " + str + ". This permission should normally be included by the manifest merger, but may needed to be manually added to your manifest";
    }

    public static boolean f(Context context) {
        boolean booleanValue;
        synchronized (f37990f) {
            try {
                Boolean bool = f37992h;
                Boolean valueOf = Boolean.valueOf(bool == null ? g(context, "android.permission.ACCESS_NETWORK_STATE", bool) : bool.booleanValue());
                f37992h = valueOf;
                booleanValue = valueOf.booleanValue();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return booleanValue;
    }

    public static boolean g(Context context, String str, Boolean bool) {
        if (bool != null) {
            return bool.booleanValue();
        }
        boolean z10 = context.checkCallingOrSelfPermission(str) == 0;
        if (!z10 && Log.isLoggable("FirebaseMessaging", 3)) {
            e(str);
        }
        return z10;
    }

    public static boolean h(Context context) {
        boolean booleanValue;
        synchronized (f37990f) {
            try {
                Boolean bool = f37991g;
                Boolean valueOf = Boolean.valueOf(bool == null ? g(context, "android.permission.WAKE_LOCK", bool) : bool.booleanValue());
                f37991g = valueOf;
                booleanValue = valueOf.booleanValue();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return booleanValue;
    }

    public static boolean j() {
        return Log.isLoggable("FirebaseMessaging", 3);
    }

    public final synchronized boolean i() {
        boolean z10;
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) this.f37993a.getSystemService("connectivity");
            NetworkInfo activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
            if (activeNetworkInfo != null) {
                z10 = activeNetworkInfo.isConnected();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return z10;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (h(this.f37993a)) {
            this.f37995c.acquire(AbstractC3498e.f37942a);
        }
        try {
            try {
                try {
                    this.f37996d.n(true);
                    if (!this.f37994b.g()) {
                        this.f37996d.n(false);
                        if (h(this.f37993a)) {
                            try {
                                this.f37995c.release();
                                return;
                            } catch (RuntimeException unused) {
                                Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                                return;
                            }
                        }
                        return;
                    }
                    if (!f(this.f37993a) || i()) {
                        if (this.f37996d.r()) {
                            this.f37996d.n(false);
                        } else {
                            this.f37996d.s(this.f37997e);
                        }
                        if (h(this.f37993a)) {
                            this.f37995c.release();
                            return;
                        }
                        return;
                    }
                    new a(this).a();
                    if (h(this.f37993a)) {
                        try {
                            this.f37995c.release();
                        } catch (RuntimeException unused2) {
                            Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                        }
                    }
                } catch (Throwable th2) {
                    if (h(this.f37993a)) {
                        try {
                            this.f37995c.release();
                        } catch (RuntimeException unused3) {
                            Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                        }
                    }
                    throw th2;
                }
            } catch (IOException e10) {
                Log.e("FirebaseMessaging", "Failed to sync topics. Won't retry sync. " + e10.getMessage());
                this.f37996d.n(false);
                if (h(this.f37993a)) {
                    this.f37995c.release();
                }
            }
        } catch (RuntimeException unused4) {
            Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
        }
    }
}
