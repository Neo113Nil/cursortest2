package com.appsflyer.internal;

import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0000\u0018\u00002\u00020\u0001BC\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\u0007\u0012\u0006\u0010\f\u001a\u00020\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0016\u001a\u00020\u000f8G¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0014\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0018\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001c\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001a\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0017R\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001eR\u0014\u0010!\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010 "}, d2 = {"Lcom/appsflyer/internal/AFi1vSDK;", "", "", "p0", "", "p1", "", "", "p2", "", "p3", "p4", "p5", "<init>", "(JFLjava/util/List;ILjava/lang/String;Ljava/lang/String;)V", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "getCurrencyIso4217Code", "()Z", "getMediationNetwork", "Ljava/lang/String;", "getRevenue", "I", "AFAdRevenueData", "F", "getMonetizationNetwork", "component1", "Ljava/util/List;", "areAllFieldsValid", "J", "component2"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AFi1vSDK {

    /* renamed from: AFAdRevenueData, reason: from kotlin metadata */
    public final float getMonetizationNetwork;

    /* renamed from: component1, reason: from kotlin metadata */
    public final String AFAdRevenueData;

    /* renamed from: getCurrencyIso4217Code, reason: from kotlin metadata */
    public long component2;

    /* renamed from: getMediationNetwork, reason: from kotlin metadata */
    public final String getCurrencyIso4217Code;

    /* renamed from: getMonetizationNetwork, reason: from kotlin metadata */
    public List<String> areAllFieldsValid;
    public final int getRevenue;

    public AFi1vSDK(long j, float f, List<String> list, int i, String str, String str2) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.component2 = j;
        this.getMonetizationNetwork = f;
        this.areAllFieldsValid = list;
        this.getRevenue = i;
        this.getCurrencyIso4217Code = str;
        this.AFAdRevenueData = str2;
    }

    public final boolean getCurrencyIso4217Code() {
        return TimeUnit.SECONDS.toMillis(this.component2) > AFb1rSDK.getRevenue().getCurrencyIso4217Code().component2().getRevenue();
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!Intrinsics.areEqual(getClass(), p0 != null ? p0.getClass() : null)) {
            return false;
        }
        Intrinsics.checkNotNull(p0, "");
        AFi1vSDK aFi1vSDK = (AFi1vSDK) p0;
        return this.component2 == aFi1vSDK.component2 && this.getMonetizationNetwork == aFi1vSDK.getMonetizationNetwork && Intrinsics.areEqual(this.areAllFieldsValid, aFi1vSDK.areAllFieldsValid) && this.getRevenue == aFi1vSDK.getRevenue && Intrinsics.areEqual(this.getCurrencyIso4217Code, aFi1vSDK.getCurrencyIso4217Code) && Intrinsics.areEqual(this.AFAdRevenueData, aFi1vSDK.AFAdRevenueData);
    }

    public final int hashCode() {
        return (((((((((Long.hashCode(this.component2) * 31) + Float.hashCode(this.getMonetizationNetwork)) * 31) + this.areAllFieldsValid.hashCode()) * 31) + this.getRevenue) * 31) + this.getCurrencyIso4217Code.hashCode()) * 31) + this.AFAdRevenueData.hashCode();
    }
}
