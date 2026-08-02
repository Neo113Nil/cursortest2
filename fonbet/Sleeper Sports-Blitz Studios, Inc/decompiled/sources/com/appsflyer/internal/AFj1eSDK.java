package com.appsflyer.internal;

import com.appsflyer.AppsFlyerLib;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class AFj1eSDK implements AFj1dSDK {
    @Override // com.appsflyer.internal.AFj1dSDK
    public final String getMediationNetwork(String str) {
        Intrinsics.checkNotNullParameter(str, "");
        String format = String.format(str, AppsFlyerLib.getInstance().getHostPrefix(), AFb1rSDK.getRevenue().getHostName());
        Intrinsics.checkNotNullExpressionValue(format, "");
        return format;
    }
}
