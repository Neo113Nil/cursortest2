package com.appsflyer.internal;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkRequest;
import com.appsflyer.AFLogger;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class AFi1tSDK extends AFi1rSDK {
    private Network AFAdRevenueData;
    private String getMonetizationNetwork;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AFi1tSDK(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "");
        this.getMonetizationNetwork = "unknown";
        AFa1ySDK aFa1ySDK = new AFa1ySDK();
        try {
            ConnectivityManager connectivityManager = this.AFAdRevenueData;
            if (connectivityManager != null) {
                connectivityManager.registerNetworkCallback(new NetworkRequest.Builder().build(), aFa1ySDK);
            }
        } catch (Throwable th) {
            AFh1wSDK.e$default(AFLogger.INSTANCE, AFh1xSDK.DEVICE_DATA, "Error at attempt to register network callback with ConnectivityManager", th, true, false, false, false, 96, null);
        }
    }

    public static final class AFa1ySDK extends ConnectivityManager.NetworkCallback {
        AFa1ySDK() {
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public final void onAvailable(Network network) {
            Intrinsics.checkNotNullParameter(network, "");
            AFi1tSDK.this.AFAdRevenueData = network;
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public final void onLost(Network network) {
            Intrinsics.checkNotNullParameter(network, "");
            AFi1tSDK.this.AFAdRevenueData = network;
            AFi1tSDK.this.getMonetizationNetwork = "NetworkLost";
        }
    }

    @Override // com.appsflyer.internal.AFi1rSDK
    protected final String getMonetizationNetwork() {
        Network network = this.AFAdRevenueData;
        if (network != null) {
            ConnectivityManager connectivityManager = this.AFAdRevenueData;
            NetworkCapabilities networkCapabilities = connectivityManager != null ? connectivityManager.getNetworkCapabilities(network) : null;
            if (networkCapabilities != null && networkCapabilities != null) {
                if (networkCapabilities.hasTransport(1)) {
                    return "WIFI";
                }
                if (networkCapabilities.hasTransport(0)) {
                    return "MOBILE";
                }
            }
        }
        return "unknown";
    }

    @Override // com.appsflyer.internal.AFi1rSDK
    public final boolean getRevenue() {
        Network network = this.AFAdRevenueData;
        if (network == null) {
            return false;
        }
        if (Intrinsics.areEqual(this.getMonetizationNetwork, "NetworkLost")) {
            network = null;
        }
        if (network == null) {
            return false;
        }
        ConnectivityManager connectivityManager = this.AFAdRevenueData;
        NetworkCapabilities networkCapabilities = connectivityManager != null ? connectivityManager.getNetworkCapabilities(network) : null;
        if (networkCapabilities != null) {
            return y_(networkCapabilities);
        }
        return false;
    }

    private static boolean y_(NetworkCapabilities networkCapabilities) {
        return (networkCapabilities == null || !networkCapabilities.hasTransport(4) || networkCapabilities.hasCapability(15)) ? false : true;
    }
}
