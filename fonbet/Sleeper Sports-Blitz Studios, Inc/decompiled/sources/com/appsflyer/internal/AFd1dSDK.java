package com.appsflyer.internal;

import com.appsflyer.AppsFlyerLib;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0013\u0010\u000b\u001a\u00020\u0005*\u00020\u0005H\u0017¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u000b\u001a\u00020\r8\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u000b\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u00058WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012"}, d2 = {"Lcom/appsflyer/internal/AFd1dSDK;", "Lcom/appsflyer/internal/AFd1hSDK;", "", "p0", "", "", "p1", "", "p2", "<init>", "([BLjava/util/Map;I)V", "getRevenue", "(Ljava/lang/String;)Ljava/lang/String;", "Lcom/appsflyer/internal/AFe1sSDK;", "getMonetizationNetwork", "Lcom/appsflyer/internal/AFe1sSDK;", "()Lcom/appsflyer/internal/AFe1sSDK;", "AFAdRevenueData", "()Ljava/lang/String;", "getCurrencyIso4217Code", "AFa1tSDK"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AFd1dSDK extends AFd1hSDK {
    public static String getRevenue = "https://%smonitorsdk.%s/remote-debug/exception-manager";

    /* renamed from: getMonetizationNetwork, reason: from kotlin metadata */
    private final AFe1sSDK getRevenue;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AFd1dSDK(byte[] bArr, Map<String, String> map, int i) {
        super(bArr, map, i);
        Intrinsics.checkNotNullParameter(bArr, "");
        this.getRevenue = AFe1sSDK.JSON;
    }

    @Override // com.appsflyer.internal.AFd1hSDK
    public final String AFAdRevenueData() {
        String format = String.format(getRevenue, AppsFlyerLib.getInstance().getHostPrefix(), AFb1rSDK.getRevenue().getHostName());
        Intrinsics.checkNotNullExpressionValue(format, "");
        return format;
    }

    @Override // com.appsflyer.internal.AFd1hSDK
    /* renamed from: getRevenue, reason: from getter */
    public final AFe1sSDK getGetRevenue() {
        return this.getRevenue;
    }

    @Override // com.appsflyer.internal.AFd1hSDK
    public final String getRevenue(String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return AFe1ySDK.AFAdRevenueData(str);
    }
}
