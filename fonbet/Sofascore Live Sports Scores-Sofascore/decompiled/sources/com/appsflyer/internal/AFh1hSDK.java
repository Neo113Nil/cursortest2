package com.appsflyer.internal;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import com.appsflyer.AFLogger;
import com.appsflyer.sdk_base.logger.AFLoggerBase;
import com.appsflyer.sdk_base.logger.LogTag;
import defpackage.c38;
import defpackage.i5h;
import defpackage.ph0;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.functions.Function1;
import kotlin.sequences.Sequence;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class AFh1hSDK extends AFh1iSDK {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AFh1hSDK(@NotNull Context context) {
        super(context);
        context.getClass();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final NetworkInfo F_(AFh1hSDK aFh1hSDK, Network network) {
        ConnectivityManager d = aFh1hSDK.getD();
        d.getClass();
        return d.getNetworkInfo(network);
    }

    @Override // com.appsflyer.internal.AFh1iSDK
    public final boolean AFLogger() {
        Network[] allNetworks;
        try {
            ConnectivityManager d = getD();
            if (d != null && (allNetworks = d.getAllNetworks()) != null) {
                ArrayList<NetworkCapabilities> arrayList = new ArrayList();
                for (Network network : allNetworks) {
                    ConnectivityManager d2 = getD();
                    d2.getClass();
                    NetworkCapabilities networkCapabilities = d2.getNetworkCapabilities(network);
                    if (networkCapabilities != null) {
                        arrayList.add(networkCapabilities);
                    }
                }
                if (!arrayList.isEmpty()) {
                    for (NetworkCapabilities networkCapabilities2 : arrayList) {
                        if (networkCapabilities2 != null && networkCapabilities2.hasTransport(4) && !networkCapabilities2.hasCapability(15)) {
                            return true;
                        }
                    }
                }
            }
            return false;
        } catch (Exception e) {
            AFLoggerBase.e$default(AFLogger.INSTANCE, LogTag.DEVICE_DATA, "Failed collecting VPN capability data", e, false, false, false, false, 120, null);
            return false;
        }
    }

    @Override // com.appsflyer.internal.AFh1iSDK
    @Nullable
    public final Network G_() {
        Network[] allNetworks;
        Sequence r;
        ConnectivityManager d = getD();
        Object obj = null;
        if (d == null || (allNetworks = d.getAllNetworks()) == null || (r = ph0.r(allNetworks)) == null) {
            return null;
        }
        Iterator it = r.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            ConnectivityManager d2 = getD();
            d2.getClass();
            NetworkInfo networkInfo = d2.getNetworkInfo((Network) next);
            if (networkInfo != null && networkInfo.isConnectedOrConnecting()) {
                obj = next;
                break;
            }
        }
        return (Network) obj;
    }

    @Override // com.appsflyer.internal.AFh1iSDK
    @Nullable
    public final NetworkCapabilities H_() {
        Network G_ = G_();
        if (G_ == null) {
            return null;
        }
        ConnectivityManager d = getD();
        d.getClass();
        return d.getNetworkCapabilities(G_);
    }

    @Override // com.appsflyer.internal.AFh1iSDK
    @NotNull
    public final String unregisterClient() {
        Network[] allNetworks;
        Sequence r;
        Object obj;
        ConnectivityManager d = getD();
        if (d == null || (allNetworks = d.getAllNetworks()) == null || (r = ph0.r(allNetworks)) == null) {
            return "unknown";
        }
        c38 c38Var = new c38(i5h.o(r, new Function1() { // from class: com.appsflyer.internal.r
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                NetworkInfo F_;
                F_ = AFh1hSDK.F_(AFh1hSDK.this, (Network) obj2);
                return F_;
            }
        }));
        while (true) {
            if (!c38Var.hasNext()) {
                obj = null;
                break;
            }
            obj = c38Var.next();
            NetworkInfo networkInfo = (NetworkInfo) obj;
            if (networkInfo != null ? networkInfo.isConnectedOrConnecting() : false) {
                break;
            }
        }
        NetworkInfo networkInfo2 = (NetworkInfo) obj;
        if (networkInfo2 == null) {
            return "unknown";
        }
        int type = networkInfo2.getType();
        return type != 0 ? type != 1 ? "unknown" : "WIFI" : "MOBILE";
    }
}
