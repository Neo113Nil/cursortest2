package com.appsflyer.internal;

import com.appsflyer.AppsFlyerLib;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class AFj1dSDK implements AFj1bSDK {
    @Override // com.appsflyer.internal.AFj1bSDK
    public final String getMediationNetwork(String str) {
        Intrinsics.checkNotNullParameter(str, "");
        String format = String.format(str, AppsFlyerLib.getInstance().getHostPrefix(), AFa1zSDK.getMonetizationNetwork().getHostName());
        Intrinsics.checkNotNullExpressionValue(format, "");
        return format;
    }
}
