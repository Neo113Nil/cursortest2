package com.appsflyer.internal;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010%\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0010\b\u0086\b\u0018\u00002\u00020\u0001Bq\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\u0014\b\u0002\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u000f\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00028\u0007@\u0006X\u0087\f¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00028\u0007@\u0006X\u0087\f¢\u0006\u0006\n\u0004\b\u0018\u0010\u0017R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u00048\u0007@\u0006X\u0087\f¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u00048\u0007@\u0006X\u0087\f¢\u0006\u0006\n\u0004\b\u001c\u0010\u001aR\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\f¢\u0006\u0006\n\u0004\b\u001b\u0010\u001aR\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u00048\u0007@\u0006X\u0087\f¢\u0006\u0006\n\u0004\b\u001d\u0010\u001aR\"\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\u000b8\u0006@\u0006X\u0087\f¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u00048\u0007@\u0006X\u0087\f¢\u0006\u0006\n\u0004\b!\u0010\u001a"}, d2 = {"Lcom/appsflyer/internal/AFh1pSDK;", "", "", "p0", "", "p1", "p2", "p3", "p4", "p5", "p6", "", "p7", "<init>", "(Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Ljava/util/Map;)V", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", InAppPurchaseConstants.METHOD_TO_STRING, "()Ljava/lang/String;", "getMediationNetwork", "Ljava/lang/String;", "component3", "getRevenue", "Ljava/lang/Boolean;", "getMonetizationNetwork", "getCurrencyIso4217Code", "AFAdRevenueData", "component1", "areAllFieldsValid", "Ljava/util/Map;", "component2"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class AFh1pSDK {

    /* renamed from: AFAdRevenueData, reason: from kotlin metadata */
    public Boolean component1;

    /* renamed from: areAllFieldsValid, reason: from kotlin metadata */
    public Map<String, Object> component3;

    /* renamed from: component2, reason: from kotlin metadata */
    public Boolean areAllFieldsValid;

    /* renamed from: component3, reason: from kotlin metadata */
    public String getRevenue;

    /* renamed from: getCurrencyIso4217Code, reason: from kotlin metadata */
    public Boolean AFAdRevenueData;
    public String getMediationNetwork;

    /* renamed from: getMonetizationNetwork, reason: from kotlin metadata */
    public Boolean getCurrencyIso4217Code;

    /* renamed from: getRevenue, reason: from kotlin metadata */
    public Boolean getMonetizationNetwork;

    private AFh1pSDK(String str, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, String str2, Boolean bool5, Map<String, Object> map) {
        Intrinsics.checkNotNullParameter(map, "");
        this.getMediationNetwork = str;
        this.component1 = bool;
        this.getMonetizationNetwork = bool2;
        this.AFAdRevenueData = bool3;
        this.getCurrencyIso4217Code = bool4;
        this.getRevenue = str2;
        this.areAllFieldsValid = bool5;
        this.component3 = map;
    }

    public /* synthetic */ AFh1pSDK(String str, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, String str2, Boolean bool5, HashMap hashMap, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : bool, (i & 4) != 0 ? null : bool2, (i & 8) != 0 ? null : bool3, (i & 16) != 0 ? null : bool4, (i & 32) != 0 ? null : str2, (i & 64) != 0 ? null : bool5, (i & 128) != 0 ? new HashMap() : hashMap);
    }

    public AFh1pSDK() {
        this(null, null, null, null, null, null, null, null, 255, null);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof AFh1pSDK)) {
            return false;
        }
        AFh1pSDK aFh1pSDK = (AFh1pSDK) p0;
        return Intrinsics.areEqual(this.getMediationNetwork, aFh1pSDK.getMediationNetwork) && Intrinsics.areEqual(this.component1, aFh1pSDK.component1) && Intrinsics.areEqual(this.getMonetizationNetwork, aFh1pSDK.getMonetizationNetwork) && Intrinsics.areEqual(this.AFAdRevenueData, aFh1pSDK.AFAdRevenueData) && Intrinsics.areEqual(this.getCurrencyIso4217Code, aFh1pSDK.getCurrencyIso4217Code) && Intrinsics.areEqual(this.getRevenue, aFh1pSDK.getRevenue) && Intrinsics.areEqual(this.areAllFieldsValid, aFh1pSDK.areAllFieldsValid) && Intrinsics.areEqual(this.component3, aFh1pSDK.component3);
    }

    public final int hashCode() {
        String str = this.getMediationNetwork;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Boolean bool = this.component1;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.getMonetizationNetwork;
        int hashCode3 = (hashCode2 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.AFAdRevenueData;
        int hashCode4 = (hashCode3 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.getCurrencyIso4217Code;
        int hashCode5 = (hashCode4 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        String str2 = this.getRevenue;
        int hashCode6 = (hashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool5 = this.areAllFieldsValid;
        return ((hashCode6 + (bool5 != null ? bool5.hashCode() : 0)) * 31) + this.component3.hashCode();
    }

    public final String toString() {
        return "AdvertisingIdData(advertisingId=" + this.getMediationNetwork + ", isLimited=" + this.component1 + ", isEnabled=" + this.getMonetizationNetwork + ", isGaidWithGps=" + this.AFAdRevenueData + ", isGaidWithSamsungCloudDev=" + this.getCurrencyIso4217Code + ", gaidError=" + this.getRevenue + ", retry=" + this.areAllFieldsValid + ", metadata=" + this.component3 + ")";
    }
}
