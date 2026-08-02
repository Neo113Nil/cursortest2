package com.appsflyer.internal;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B+\b\u0002\u0012\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\n\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\r\u0010\u000eR\"\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000fR\u0016\u0010\u0012\u001a\u0004\u0018\u00010\u00058\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011"}, d2 = {"Lcom/appsflyer/internal/AFc1pSDK;", "", "", "", "p0", "Lcom/appsflyer/internal/AFc1gSDK;", "p1", "<init>", "(Ljava/util/Map;Lcom/appsflyer/internal/AFc1gSDK;)V", "", "getMediationNetwork", "(Ljava/lang/String;)Z", "", "AFAdRevenueData", "(Ljava/lang/String;Ljava/lang/Object;)V", "Ljava/util/Map;", "getMonetizationNetwork", "Lcom/appsflyer/internal/AFc1gSDK;", "getRevenue", "AFa1zSDK"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AFc1pSDK {

    /* renamed from: AFa1zSDK, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: AFAdRevenueData, reason: from kotlin metadata */
    final Map<String, Object> getMediationNetwork;

    /* renamed from: getMonetizationNetwork, reason: from kotlin metadata */
    final AFc1gSDK getRevenue;

    private AFc1pSDK(Map<String, Object> map, AFc1gSDK aFc1gSDK) {
        this.getMediationNetwork = map;
        this.getRevenue = aFc1gSDK;
    }

    /* synthetic */ AFc1pSDK(Map map, AFc1gSDK aFc1gSDK, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(map, (i & 2) != 0 ? null : aFc1gSDK);
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\tH\u0007¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"Lcom/appsflyer/internal/AFc1pSDK$AFa1zSDK;", "", "<init>", "()V", "Lcom/appsflyer/internal/AFa1mSDK;", "p0", "Lcom/appsflyer/internal/AFc1pSDK;", "getMonetizationNetwork", "(Lcom/appsflyer/internal/AFa1mSDK;)Lcom/appsflyer/internal/AFc1pSDK;", "Lcom/appsflyer/internal/AFc1gSDK;", "AFAdRevenueData", "(Lcom/appsflyer/internal/AFc1gSDK;)Lcom/appsflyer/internal/AFc1pSDK;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: com.appsflyer.internal.AFc1pSDK$AFa1zSDK, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @JvmStatic
        public static AFc1pSDK getMonetizationNetwork(AFa1mSDK p0) {
            Intrinsics.checkNotNullParameter(p0, "");
            Map<String, Object> monetizationNetwork = p0.getMonetizationNetwork();
            Intrinsics.checkNotNullExpressionValue(monetizationNetwork, "");
            return new AFc1pSDK(monetizationNetwork, null, 2, 0 == true ? 1 : 0);
        }

        @JvmStatic
        public static AFc1pSDK AFAdRevenueData(AFc1gSDK p0) {
            Intrinsics.checkNotNullParameter(p0, "");
            return new AFc1pSDK(new LinkedHashMap(), p0, null);
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final void AFAdRevenueData(String p0, Object p1) {
        Intrinsics.checkNotNullParameter(p0, "");
        this.getMediationNetwork.put(p0, p1);
        AFc1gSDK aFc1gSDK = this.getRevenue;
        if (aFc1gSDK != null) {
            aFc1gSDK.getMonetizationNetwork(this.getMediationNetwork);
        }
    }

    public final boolean getMediationNetwork(String p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        return this.getMediationNetwork.containsKey(p0);
    }

    public /* synthetic */ AFc1pSDK(Map map, AFc1gSDK aFc1gSDK, DefaultConstructorMarker defaultConstructorMarker) {
        this(map, aFc1gSDK);
    }

    @JvmStatic
    public static final AFc1pSDK getCurrencyIso4217Code(AFc1gSDK aFc1gSDK) {
        return Companion.AFAdRevenueData(aFc1gSDK);
    }

    @JvmStatic
    public static final AFc1pSDK getMonetizationNetwork(AFa1mSDK aFa1mSDK) {
        return Companion.getMonetizationNetwork(aFa1mSDK);
    }
}
