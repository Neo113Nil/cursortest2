package com.appsflyer.internal;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import com.appsflyer.AFLogger;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.C7705l;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.C7747g;
import kotlin.sequences.Sequence;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class AFi1vSDK extends AFh1dSDK {

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\u0010\u0001\u001a\u0006*\u00020\u00000\u0000H\u000b¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/net/Network;", "p0", "Landroid/net/NetworkInfo;", "values", "(Landroid/net/Network;)Landroid/net/NetworkInfo;"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* renamed from: com.appsflyer.internal.AFi1vSDK$3, reason: invalid class name */
    static final class AnonymousClass3 extends AbstractC7737t implements Function1<Network, NetworkInfo> {
        AnonymousClass3() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: values, reason: merged with bridge method [inline-methods] */
        public final NetworkInfo invoke(Network network) {
            ConnectivityManager connectivityManager = AFi1vSDK.this.AFKeystoreWrapper;
            Intrinsics.f(connectivityManager);
            return connectivityManager.getNetworkInfo(network);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AFi1vSDK(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "");
    }

    private static boolean AFInAppEventParameterName(NetworkCapabilities networkCapabilities) {
        return (networkCapabilities == null || !networkCapabilities.hasTransport(4) || networkCapabilities.hasCapability(15)) ? false : true;
    }

    @Override // com.appsflyer.internal.AFh1dSDK
    public final boolean valueOf() {
        Network[] allNetworks;
        try {
            ConnectivityManager connectivityManager = this.AFKeystoreWrapper;
            if (connectivityManager == null || (allNetworks = connectivityManager.getAllNetworks()) == null) {
                return false;
            }
            ArrayList arrayList = new ArrayList();
            for (Network network : allNetworks) {
                ConnectivityManager connectivityManager2 = this.AFKeystoreWrapper;
                Intrinsics.f(connectivityManager2);
                NetworkCapabilities networkCapabilities = connectivityManager2.getNetworkCapabilities(network);
                if (networkCapabilities != null) {
                    arrayList.add(networkCapabilities);
                }
            }
            if (arrayList.isEmpty()) {
                return false;
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                if (AFInAppEventParameterName((NetworkCapabilities) it.next())) {
                    return true;
                }
            }
            return false;
        } catch (Exception e11) {
            AFLogger.afErrorLog("Failed collecting ivc data", e11);
            return false;
        }
    }

    @Override // com.appsflyer.internal.AFh1dSDK
    @NotNull
    protected final String values() {
        Network[] allNetworks;
        Sequence g10;
        Object obj;
        ConnectivityManager connectivityManager = this.AFKeystoreWrapper;
        if (connectivityManager == null || (allNetworks = connectivityManager.getAllNetworks()) == null || (g10 = C7705l.g(allNetworks)) == null) {
            return "unknown";
        }
        Iterator it = kotlin.sequences.l.w(g10, new AnonymousClass3()).iterator();
        while (true) {
            C7747g.a aVar = (C7747g.a) it;
            if (!aVar.hasNext()) {
                obj = null;
                break;
            }
            obj = aVar.next();
            if (AFh1dSDK.AFInAppEventParameterName((NetworkInfo) obj)) {
                break;
            }
        }
        NetworkInfo networkInfo = (NetworkInfo) obj;
        if (networkInfo == null) {
            return "unknown";
        }
        int type = networkInfo.getType();
        return type != 0 ? type != 1 ? "unknown" : "WIFI" : "MOBILE";
    }
}
