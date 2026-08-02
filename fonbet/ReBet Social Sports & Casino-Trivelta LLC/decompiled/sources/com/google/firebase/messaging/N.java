package com.google.firebase.messaging;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.util.Log;
import eb.C4196f;
import java.util.List;

/* loaded from: classes3.dex */
public class N {

    /* renamed from: a, reason: collision with root package name */
    public final Context f37859a;

    /* renamed from: b, reason: collision with root package name */
    public String f37860b;

    /* renamed from: c, reason: collision with root package name */
    public String f37861c;

    /* renamed from: d, reason: collision with root package name */
    public int f37862d;

    /* renamed from: e, reason: collision with root package name */
    public int f37863e = 0;

    public N(Context context) {
        this.f37859a = context;
    }

    public static String c(C4196f c4196f) {
        String f10 = c4196f.q().f();
        if (f10 != null) {
            return f10;
        }
        String c10 = c4196f.q().c();
        if (!c10.startsWith("1:")) {
            return c10;
        }
        String[] split = c10.split(":");
        if (split.length < 2) {
            return null;
        }
        String str = split[1];
        if (str.isEmpty()) {
            return null;
        }
        return str;
    }

    public synchronized String a() {
        try {
            if (this.f37860b == null) {
                h();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f37860b;
    }

    public synchronized String b() {
        try {
            if (this.f37861c == null) {
                h();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f37861c;
    }

    public synchronized int d() {
        PackageInfo f10;
        try {
            if (this.f37862d == 0 && (f10 = f("com.google.android.gms")) != null) {
                this.f37862d = f10.versionCode;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f37862d;
    }

    public synchronized int e() {
        int i10 = this.f37863e;
        if (i10 != 0) {
            return i10;
        }
        PackageManager packageManager = this.f37859a.getPackageManager();
        if (packageManager.checkPermission("com.google.android.c2dm.permission.SEND", "com.google.android.gms") == -1) {
            Log.e("FirebaseMessaging", "Google Play services missing or without correct permission.");
            return 0;
        }
        if (!K9.n.e()) {
            Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
            intent.setPackage("com.google.android.gms");
            List<ResolveInfo> queryIntentServices = packageManager.queryIntentServices(intent, 0);
            if (queryIntentServices != null && queryIntentServices.size() > 0) {
                this.f37863e = 1;
                return 1;
            }
        }
        Intent intent2 = new Intent("com.google.iid.TOKEN_REQUEST");
        intent2.setPackage("com.google.android.gms");
        List<ResolveInfo> queryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent2, 0);
        if (queryBroadcastReceivers != null && queryBroadcastReceivers.size() > 0) {
            this.f37863e = 2;
            return 2;
        }
        Log.w("FirebaseMessaging", "Failed to resolve IID implementation package, falling back");
        if (K9.n.e()) {
            this.f37863e = 2;
        } else {
            this.f37863e = 1;
        }
        return this.f37863e;
    }

    public final PackageInfo f(String str) {
        try {
            return this.f37859a.getPackageManager().getPackageInfo(str, 0);
        } catch (PackageManager.NameNotFoundException e10) {
            Log.w("FirebaseMessaging", "Failed to find package " + e10);
            return null;
        }
    }

    public boolean g() {
        return e() != 0;
    }

    public final synchronized void h() {
        PackageInfo f10 = f(this.f37859a.getPackageName());
        if (f10 != null) {
            this.f37860b = Integer.toString(f10.versionCode);
            this.f37861c = f10.versionName;
        }
    }
}
