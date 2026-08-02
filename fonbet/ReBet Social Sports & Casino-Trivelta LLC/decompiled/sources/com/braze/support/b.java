package com.braze.support;

import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import bo.app.cb;
import com.braze.support.BrazeLogger;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final b f29478a = new b();

    public static final cb a(Intent intent, ConnectivityManager connectivityManager) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        Intrinsics.checkNotNullParameter(connectivityManager, "connectivityManager");
        final String action = intent.getAction();
        if (!Intrinsics.areEqual("android.net.conn.CONNECTIVITY_CHANGE", action)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) f29478a, BrazeLogger.Priority.f29473W, (Throwable) null, false, new Function0() { // from class: Y3.Y0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return com.braze.support.b.a(action);
                }
            }, 6, (Object) null);
            return cb.f25351a;
        }
        try {
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            boolean booleanExtra = intent.getBooleanExtra("noConnectivity", false);
            if (activeNetworkInfo == null || booleanExtra) {
                return cb.f25351a;
            }
            int type = activeNetworkInfo.getType();
            if (type != 0) {
                return (type == 1 || type == 6) ? cb.f25354d : type != 9 ? cb.f25351a : cb.f25353c;
            }
            int subtype = activeNetworkInfo.getSubtype();
            return subtype != 3 ? (subtype == 13 || subtype == 20) ? cb.f25354d : cb.f25352b : cb.f25353c;
        } catch (SecurityException e10) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) f29478a, BrazeLogger.Priority.f29470E, (Throwable) e10, false, new Function0() { // from class: Y3.X0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return com.braze.support.b.a();
                }
            }, 4, (Object) null);
            return cb.f25351a;
        }
    }

    public static final String a() {
        return "Failed to get active network information. Ensure the permission android.permission.ACCESS_NETWORK_STATE is defined in your AndroidManifest.xml";
    }

    public static final String a(String str) {
        return "Unexpected system broadcast received [" + str + "]";
    }

    public static final cb a(NetworkCapabilities networkCapabilities) {
        if (networkCapabilities == null) {
            return cb.f25351a;
        }
        int min = Math.min(networkCapabilities.getLinkDownstreamBandwidthKbps(), networkCapabilities.getLinkUpstreamBandwidthKbps());
        if (min > 14000) {
            return cb.f25354d;
        }
        if (min > 4000) {
            return cb.f25353c;
        }
        return cb.f25352b;
    }
}
