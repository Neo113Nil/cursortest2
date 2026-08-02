package com.braze.support;

import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import com.braze.support.BrazeLogger;
import com.reactnativecommunity.netinfo.BroadcastReceiverConnectivityReceiver;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final c f774a = new c();

    public static final com.braze.enums.e a(Intent intent, ConnectivityManager connectivityManager) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        Intrinsics.checkNotNullParameter(connectivityManager, "connectivityManager");
        final String action = intent.getAction();
        if (!Intrinsics.areEqual(BroadcastReceiverConnectivityReceiver.CONNECTIVITY_ACTION, action)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) f774a, BrazeLogger.Priority.W, (Throwable) null, false, new Function0() { // from class: com.braze.support.c$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return c.a(action);
                }
            }, 6, (Object) null);
            return com.braze.enums.e.f504a;
        }
        try {
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            boolean booleanExtra = intent.getBooleanExtra("noConnectivity", false);
            if (activeNetworkInfo == null || booleanExtra) {
                return com.braze.enums.e.f504a;
            }
            int type = activeNetworkInfo.getType();
            if (type != 0) {
                return (type == 1 || type == 6) ? com.braze.enums.e.d : type != 9 ? com.braze.enums.e.f504a : com.braze.enums.e.c;
            }
            int subtype = activeNetworkInfo.getSubtype();
            return subtype != 3 ? (subtype == 13 || subtype == 20) ? com.braze.enums.e.d : com.braze.enums.e.b : com.braze.enums.e.c;
        } catch (SecurityException e) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) f774a, BrazeLogger.Priority.E, (Throwable) e, false, new Function0() { // from class: com.braze.support.c$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return c.a();
                }
            }, 4, (Object) null);
            return com.braze.enums.e.f504a;
        }
    }

    public static final String a() {
        return "Failed to get active network information. Ensure the permission android.permission.ACCESS_NETWORK_STATE is defined in your AndroidManifest.xml";
    }

    public static final String a(String str) {
        return "Unexpected system broadcast received [" + str + "]";
    }

    public static final com.braze.enums.e a(NetworkCapabilities networkCapabilities) {
        if (networkCapabilities == null) {
            return com.braze.enums.e.f504a;
        }
        int min = Math.min(networkCapabilities.getLinkDownstreamBandwidthKbps(), networkCapabilities.getLinkUpstreamBandwidthKbps());
        if (min > 14000) {
            return com.braze.enums.e.d;
        }
        if (min > 4000) {
            return com.braze.enums.e.c;
        }
        return com.braze.enums.e.b;
    }
}
