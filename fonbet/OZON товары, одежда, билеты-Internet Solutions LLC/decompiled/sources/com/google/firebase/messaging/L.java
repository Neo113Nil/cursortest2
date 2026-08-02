package com.google.firebase.messaging;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.util.Log;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.wallet.WalletConstants;
import java.util.ArrayDeque;

@KeepForSdk
/* loaded from: classes.dex */
public final class L {

    /* renamed from: e, reason: collision with root package name */
    private static L f59619e;

    /* renamed from: a, reason: collision with root package name */
    private String f59620a = null;

    /* renamed from: b, reason: collision with root package name */
    private Boolean f59621b = null;

    /* renamed from: c, reason: collision with root package name */
    private Boolean f59622c = null;

    /* renamed from: d, reason: collision with root package name */
    private final ArrayDeque f59623d = new ArrayDeque();

    private L() {
    }

    static synchronized L a() {
        L l11;
        synchronized (L.class) {
            try {
                if (f59619e == null) {
                    f59619e = new L();
                }
                l11 = f59619e;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return l11;
    }

    final Intent b() {
        return (Intent) this.f59623d.poll();
    }

    final boolean c(Context context) {
        if (this.f59622c == null) {
            this.f59622c = Boolean.valueOf(context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0);
        }
        if (!this.f59621b.booleanValue() && Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Missing Permission: android.permission.ACCESS_NETWORK_STATE this should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return this.f59622c.booleanValue();
    }

    final boolean d(Context context) {
        if (this.f59621b == null) {
            this.f59621b = Boolean.valueOf(context.checkCallingOrSelfPermission("android.permission.WAKE_LOCK") == 0);
        }
        if (!this.f59621b.booleanValue() && Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Missing Permission: android.permission.WAKE_LOCK this should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return this.f59621b.booleanValue();
    }

    public final int e(Context context, Intent intent) {
        String str;
        ServiceInfo serviceInfo;
        String str2;
        ComponentName startService;
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Starting service");
        }
        this.f59623d.offer(intent);
        Intent intent2 = new Intent("com.google.firebase.MESSAGING_EVENT");
        intent2.setPackage(context.getPackageName());
        synchronized (this) {
            try {
                str = this.f59620a;
                if (str == null) {
                    ResolveInfo resolveService = context.getPackageManager().resolveService(intent2, 0);
                    if (resolveService != null && (serviceInfo = resolveService.serviceInfo) != null) {
                        if (context.getPackageName().equals(serviceInfo.packageName) && (str2 = serviceInfo.name) != null) {
                            if (str2.startsWith(".")) {
                                this.f59620a = context.getPackageName() + serviceInfo.name;
                            } else {
                                this.f59620a = serviceInfo.name;
                            }
                            str = this.f59620a;
                        }
                        Log.e("FirebaseMessaging", "Error resolving target intent service, skipping classname enforcement. Resolved service was: " + serviceInfo.packageName + "/" + serviceInfo.name);
                        str = null;
                    }
                    Log.e("FirebaseMessaging", "Failed to resolve target intent service, skipping classname enforcement");
                    str = null;
                }
            } finally {
            }
        }
        if (str != null) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Restricting intent to a specific service: ".concat(str));
            }
            intent2.setClassName(context.getPackageName(), str);
        }
        try {
            if (d(context)) {
                startService = X.c(context, intent2);
            } else {
                startService = context.startService(intent2);
                Log.d("FirebaseMessaging", "Missing wake lock permission, service start may be delayed");
            }
            if (startService != null) {
                return -1;
            }
            Log.e("FirebaseMessaging", "Error while delivering the message: ServiceIntent not found.");
            return WalletConstants.ERROR_CODE_INVALID_PARAMETERS;
        } catch (IllegalStateException e11) {
            Log.e("FirebaseMessaging", "Failed to start service while in background: " + e11);
            return WalletConstants.ERROR_CODE_SERVICE_UNAVAILABLE;
        } catch (SecurityException e12) {
            Log.e("FirebaseMessaging", "Error while delivering the message to the serviceIntent", e12);
            return 401;
        }
    }
}
