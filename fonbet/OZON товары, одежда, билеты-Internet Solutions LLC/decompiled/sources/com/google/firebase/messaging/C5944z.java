package com.google.firebase.messaging;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.util.Log;
import com.google.android.gms.common.util.PlatformVersion;
import java.util.List;
import ru.ozon.app.android.sellerproducts.sellerProducts.data.model.ProductContainerDTO;

/* renamed from: com.google.firebase.messaging.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C5944z {

    /* renamed from: a, reason: collision with root package name */
    private final Context f59752a;

    /* renamed from: b, reason: collision with root package name */
    private String f59753b;

    /* renamed from: c, reason: collision with root package name */
    private String f59754c;

    /* renamed from: d, reason: collision with root package name */
    private int f59755d;

    /* renamed from: e, reason: collision with root package name */
    private int f59756e = 0;

    C5944z(Context context) {
        this.f59752a = context;
    }

    static String c(k8.e eVar) {
        String d11 = eVar.l().d();
        if (d11 != null) {
            return d11;
        }
        String c11 = eVar.l().c();
        if (!c11.startsWith("1:")) {
            return c11;
        }
        String[] split = c11.split(ProductContainerDTO.RATIO_DELIMITER);
        if (split.length < 2) {
            return null;
        }
        String str = split[1];
        if (str.isEmpty()) {
            return null;
        }
        return str;
    }

    private PackageInfo e(String str) {
        try {
            return this.f59752a.getPackageManager().getPackageInfo(str, 0);
        } catch (PackageManager.NameNotFoundException e11) {
            Log.w("FirebaseMessaging", "Failed to find package " + e11);
            return null;
        }
    }

    private synchronized void g() {
        PackageInfo e11 = e(this.f59752a.getPackageName());
        if (e11 != null) {
            this.f59753b = Integer.toString(e11.versionCode);
            this.f59754c = e11.versionName;
        }
    }

    final synchronized String a() {
        try {
            if (this.f59753b == null) {
                g();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f59753b;
    }

    final synchronized String b() {
        try {
            if (this.f59754c == null) {
                g();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f59754c;
    }

    final synchronized int d() {
        PackageInfo e11;
        try {
            if (this.f59755d == 0 && (e11 = e("com.google.android.gms")) != null) {
                this.f59755d = e11.versionCode;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f59755d;
    }

    final boolean f() {
        int i11;
        synchronized (this) {
            i11 = this.f59756e;
            if (i11 == 0) {
                PackageManager packageManager = this.f59752a.getPackageManager();
                if (packageManager.checkPermission("com.google.android.c2dm.permission.SEND", "com.google.android.gms") == -1) {
                    Log.e("FirebaseMessaging", "Google Play services missing or without correct permission.");
                    i11 = 0;
                } else {
                    if (!PlatformVersion.isAtLeastO()) {
                        Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
                        intent.setPackage("com.google.android.gms");
                        List<ResolveInfo> queryIntentServices = packageManager.queryIntentServices(intent, 0);
                        if (queryIntentServices != null && queryIntentServices.size() > 0) {
                            this.f59756e = 1;
                            i11 = 1;
                        }
                    }
                    Intent intent2 = new Intent("com.google.iid.TOKEN_REQUEST");
                    intent2.setPackage("com.google.android.gms");
                    List<ResolveInfo> queryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent2, 0);
                    if (queryBroadcastReceivers == null || queryBroadcastReceivers.size() <= 0) {
                        Log.w("FirebaseMessaging", "Failed to resolve IID implementation package, falling back");
                        if (PlatformVersion.isAtLeastO()) {
                            this.f59756e = 2;
                        } else {
                            this.f59756e = 1;
                        }
                        i11 = this.f59756e;
                    } else {
                        this.f59756e = 2;
                        i11 = 2;
                    }
                }
            }
        }
        return i11 != 0;
    }
}
