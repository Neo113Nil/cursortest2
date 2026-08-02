package com.appsflyer.internal;

import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010%\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0010\b\u0086\b\u0018\u00002\u00020\u0001Bq\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\u0014\b\u0002\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u000f\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00028\u0007@\u0006X\u0087\f¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00028\u0007@\u0006X\u0087\f¢\u0006\u0006\n\u0004\b\u0019\u0010\u0017R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00048\u0007@\u0006X\u0087\f¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u00048\u0007@\u0006X\u0087\f¢\u0006\u0006\n\u0004\b\u001c\u0010\u001bR\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\f¢\u0006\u0006\n\u0004\b\u0018\u0010\u001bR\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u00048\u0007@\u0006X\u0087\f¢\u0006\u0006\n\u0004\b\u001d\u0010\u001bR\"\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\u000b8\u0006@\u0006X\u0087\f¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u00048\u0007@\u0006X\u0087\f¢\u0006\u0006\n\u0004\b!\u0010\u001b"}, d2 = {"Lcom/appsflyer/internal/AFh1xSDK;", "", "", "p0", "", "p1", "p2", "p3", "p4", "p5", "p6", "", "p7", "<init>", "(Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Ljava/util/Map;)V", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "getMediationNetwork", "Ljava/lang/String;", "getMonetizationNetwork", "component2", "getRevenue", "Ljava/lang/Boolean;", "AFAdRevenueData", "getCurrencyIso4217Code", "component3", "component4", "Ljava/util/Map;", "areAllFieldsValid"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class AFh1xSDK {
    public Boolean AFAdRevenueData;

    /* renamed from: areAllFieldsValid, reason: from kotlin metadata */
    public Boolean component4;

    /* renamed from: component2, reason: from kotlin metadata */
    public String getRevenue;

    /* renamed from: component4, reason: from kotlin metadata */
    public Map<String, Object> areAllFieldsValid;

    /* renamed from: getCurrencyIso4217Code, reason: from kotlin metadata */
    public Boolean component3;

    /* renamed from: getMediationNetwork, reason: from kotlin metadata */
    public String getMonetizationNetwork;

    /* renamed from: getMonetizationNetwork, reason: from kotlin metadata */
    public Boolean getCurrencyIso4217Code;

    /* renamed from: getRevenue, reason: from kotlin metadata */
    public Boolean getMediationNetwork;

    private AFh1xSDK(String str, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, String str2, Boolean bool5, Map<String, Object> map) {
        Intrinsics.checkNotNullParameter(map, "");
        this.getMonetizationNetwork = str;
        this.component3 = bool;
        this.getMediationNetwork = bool2;
        this.AFAdRevenueData = bool3;
        this.getCurrencyIso4217Code = bool4;
        this.getRevenue = str2;
        this.component4 = bool5;
        this.areAllFieldsValid = map;
    }

    public /* synthetic */ AFh1xSDK(String str, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, String str2, Boolean bool5, HashMap hashMap, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : bool, (i & 4) != 0 ? null : bool2, (i & 8) != 0 ? null : bool3, (i & 16) != 0 ? null : bool4, (i & 32) != 0 ? null : str2, (i & 64) != 0 ? null : bool5, (i & 128) != 0 ? new HashMap() : hashMap);
    }

    public AFh1xSDK() {
        this(null, null, null, null, null, null, null, null, 255, null);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof AFh1xSDK)) {
            return false;
        }
        AFh1xSDK aFh1xSDK = (AFh1xSDK) p0;
        return Intrinsics.areEqual(this.getMonetizationNetwork, aFh1xSDK.getMonetizationNetwork) && Intrinsics.areEqual(this.component3, aFh1xSDK.component3) && Intrinsics.areEqual(this.getMediationNetwork, aFh1xSDK.getMediationNetwork) && Intrinsics.areEqual(this.AFAdRevenueData, aFh1xSDK.AFAdRevenueData) && Intrinsics.areEqual(this.getCurrencyIso4217Code, aFh1xSDK.getCurrencyIso4217Code) && Intrinsics.areEqual(this.getRevenue, aFh1xSDK.getRevenue) && Intrinsics.areEqual(this.component4, aFh1xSDK.component4) && Intrinsics.areEqual(this.areAllFieldsValid, aFh1xSDK.areAllFieldsValid);
    }

    public final int hashCode() {
        String str = this.getMonetizationNetwork;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Boolean bool = this.component3;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.getMediationNetwork;
        int hashCode3 = (hashCode2 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.AFAdRevenueData;
        int hashCode4 = (hashCode3 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.getCurrencyIso4217Code;
        int hashCode5 = (hashCode4 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        String str2 = this.getRevenue;
        int hashCode6 = (hashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool5 = this.component4;
        return ((hashCode6 + (bool5 != null ? bool5.hashCode() : 0)) * 31) + this.areAllFieldsValid.hashCode();
    }

    public final String toString() {
        return "AdvertisingIdData(advertisingId=" + this.getMonetizationNetwork + ", isLimited=" + this.component3 + ", isEnabled=" + this.getMediationNetwork + ", isGaidWithGps=" + this.AFAdRevenueData + ", isGaidWithSamsungCloudDev=" + this.getCurrencyIso4217Code + ", gaidError=" + this.getRevenue + ", retry=" + this.component4 + ", metadata=" + this.areAllFieldsValid + ")";
    }
}
