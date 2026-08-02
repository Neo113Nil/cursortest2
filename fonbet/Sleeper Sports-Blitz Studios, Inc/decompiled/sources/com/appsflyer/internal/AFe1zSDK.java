package com.appsflyer.internal;

import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B;\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\r\u001a\u00020\u0007*\u00020\u0007H\u0017¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0013\u001a\u00020\u000f8\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\r\u0010\u0012R\u0014\u0010\u0015\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0014R\u001a\u0010\r\u001a\u00020\u00168\u0017X\u0097D¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0015\u0010\u0019R\u0014\u0010\u0017\u001a\u00020\u00078WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b"}, d2 = {"Lcom/appsflyer/internal/AFe1zSDK;", "Lcom/appsflyer/internal/AFd1hSDK;", "Lcom/appsflyer/internal/AFd1rSDK;", "p0", "", "p1", "", "", "p2", "", "p3", "<init>", "(Lcom/appsflyer/internal/AFd1rSDK;[BLjava/util/Map;I)V", "getRevenue", "(Ljava/lang/String;)Ljava/lang/String;", "Lcom/appsflyer/internal/AFe1sSDK;", "areAllFieldsValid", "Lcom/appsflyer/internal/AFe1sSDK;", "()Lcom/appsflyer/internal/AFe1sSDK;", "getMediationNetwork", "Lcom/appsflyer/internal/AFd1rSDK;", "getCurrencyIso4217Code", "", "getMonetizationNetwork", "Z", "()Z", "AFAdRevenueData", "()Ljava/lang/String;"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AFe1zSDK extends AFd1hSDK {

    /* renamed from: areAllFieldsValid, reason: from kotlin metadata */
    private final AFe1sSDK getMediationNetwork;

    /* renamed from: getMonetizationNetwork, reason: from kotlin metadata */
    private final boolean getRevenue;

    /* renamed from: getRevenue, reason: from kotlin metadata */
    public AFd1rSDK getCurrencyIso4217Code;

    public /* synthetic */ AFe1zSDK(AFd1rSDK aFd1rSDK, byte[] bArr, Map map, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(aFd1rSDK, bArr, (i2 & 4) != 0 ? null : map, (i2 & 8) != 0 ? 2000 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private AFe1zSDK(AFd1rSDK aFd1rSDK, byte[] bArr, Map<String, String> map, int i) {
        super(bArr, map, i);
        Intrinsics.checkNotNullParameter(aFd1rSDK, "");
        Intrinsics.checkNotNullParameter(bArr, "");
        this.getCurrencyIso4217Code = aFd1rSDK;
        this.getMediationNetwork = AFe1sSDK.OCTET_STREAM;
    }

    @Override // com.appsflyer.internal.AFd1hSDK
    /* renamed from: getCurrencyIso4217Code, reason: from getter */
    public final boolean getGetRevenue() {
        return this.getRevenue;
    }

    @Override // com.appsflyer.internal.AFd1hSDK
    public final String AFAdRevenueData() {
        AFj1iSDK aFj1iSDK = new AFj1iSDK(this.getCurrencyIso4217Code, null, 2, null);
        return aFj1iSDK.getCurrencyIso4217Code(aFj1iSDK.getMediationNetwork.getMediationNetwork(AFj1iSDK.component4));
    }

    @Override // com.appsflyer.internal.AFd1hSDK
    /* renamed from: getRevenue, reason: from getter */
    public final AFe1sSDK getGetMediationNetwork() {
        return this.getMediationNetwork;
    }

    @Override // com.appsflyer.internal.AFd1hSDK
    public final String getRevenue(String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return "[RD]: " + str;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AFe1zSDK(AFd1rSDK aFd1rSDK, byte[] bArr) {
        this(aFd1rSDK, bArr, null, 0, 12, null);
        Intrinsics.checkNotNullParameter(aFd1rSDK, "");
        Intrinsics.checkNotNullParameter(bArr, "");
    }
}
