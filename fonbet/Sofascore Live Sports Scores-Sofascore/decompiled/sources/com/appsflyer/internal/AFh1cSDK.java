package com.appsflyer.internal;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkRequest;
import com.appsflyer.AFLogger;
import com.appsflyer.sdk_base.logger.AFLoggerBase;
import com.appsflyer.sdk_base.logger.LogTag;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class AFh1cSDK extends AFh1iSDK {

    @NotNull
    private String AFKeystoreWrapper;

    @Nullable
    private Network registerClient;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class AFa1uSDK extends ConnectivityManager.NetworkCallback {
        public AFa1uSDK() {
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public final void onAvailable(Network network) {
            network.getClass();
            AFh1cSDK.this.registerClient = network;
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public final void onLost(Network network) {
            network.getClass();
            AFh1cSDK.this.registerClient = network;
            AFh1cSDK.this.AFKeystoreWrapper = "NetworkLost";
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AFh1cSDK(@NotNull Context context) {
        super(context);
        context.getClass();
        this.AFKeystoreWrapper = "unknown";
        AFa1uSDK aFa1uSDK = new AFa1uSDK();
        try {
            ConnectivityManager d = getD();
            if (d != null) {
                d.registerNetworkCallback(new NetworkRequest.Builder().build(), aFa1uSDK);
                Unit unit = Unit.a;
            }
        } catch (Throwable th) {
            AFLoggerBase.e$default(AFLogger.INSTANCE, LogTag.DEVICE_DATA, "Error at attempt to register network callback with ConnectivityManager", th, true, false, false, false, 96, null);
            Unit unit2 = Unit.a;
        }
    }

    @Override // com.appsflyer.internal.AFh1iSDK
    public final boolean AFLogger() {
        Network G_ = G_();
        if (G_ != null) {
            ConnectivityManager d = getD();
            NetworkCapabilities networkCapabilities = d != null ? d.getNetworkCapabilities(G_) : null;
            if (networkCapabilities != null && networkCapabilities.hasTransport(4) && !networkCapabilities.hasCapability(15)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.appsflyer.internal.AFh1iSDK
    @Nullable
    public final Network G_() {
        Network activeNetwork;
        ConnectivityManager d = getD();
        if (d != null && (activeNetwork = d.getActiveNetwork()) != null) {
            return activeNetwork;
        }
        Network network = this.registerClient;
        if (network == null || Intrinsics.c(this.AFKeystoreWrapper, "NetworkLost")) {
            return null;
        }
        return network;
    }

    @Override // com.appsflyer.internal.AFh1iSDK
    @Nullable
    public final NetworkCapabilities H_() {
        ConnectivityManager d;
        Network G_ = G_();
        if (G_ == null || (d = getD()) == null) {
            return null;
        }
        return d.getNetworkCapabilities(G_);
    }

    @Override // com.appsflyer.internal.AFh1iSDK
    @NotNull
    public final String unregisterClient() {
        Network G_ = G_();
        if (G_ != null) {
            ConnectivityManager d = getD();
            NetworkCapabilities networkCapabilities = d != null ? d.getNetworkCapabilities(G_) : null;
            if (networkCapabilities != null) {
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
}
