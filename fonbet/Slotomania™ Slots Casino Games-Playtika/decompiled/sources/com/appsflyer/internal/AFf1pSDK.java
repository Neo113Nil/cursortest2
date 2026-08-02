package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import java.util.concurrent.TimeUnit;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\r\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001b\u0010\u000e\u001a\u00020\u000b8GX\u0087\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\u0011\u001a\u0004\b\u000e\u0010\rR\u001b\u0010\u0012\u001a\u00020\u000b8GX\u0087\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\u0011\u001a\u0004\b\u0010\u0010\rR\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0013"}, d2 = {"Lcom/appsflyer/internal/AFf1pSDK;", "", "Lcom/appsflyer/internal/AFc1kSDK;", "p0", "Lcom/appsflyer/internal/AFf1nSDK;", "p1", "<init>", "(Lcom/appsflyer/internal/AFc1kSDK;Lcom/appsflyer/internal/AFf1nSDK;)V", "", "getCurrencyIso4217Code", "()J", "", "getRevenue", "()Z", "AFAdRevenueData", "Lcom/appsflyer/internal/AFc1kSDK;", "getMonetizationNetwork", "Lkotlin/Lazy;", "getMediationNetwork", "Lcom/appsflyer/internal/AFf1nSDK;", "AFa1ySDK"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class AFf1pSDK {
    private static final long getMediationNetwork = TimeUnit.HOURS.toSeconds(24);

    /* renamed from: AFAdRevenueData, reason: from kotlin metadata */
    private final AFc1kSDK getMonetizationNetwork;

    /* renamed from: getCurrencyIso4217Code, reason: from kotlin metadata */
    private final Lazy AFAdRevenueData;

    /* renamed from: getMonetizationNetwork, reason: from kotlin metadata */
    private final AFf1nSDK getCurrencyIso4217Code;

    /* renamed from: getRevenue, reason: from kotlin metadata */
    private final Lazy getMediationNetwork;

    public AFf1pSDK(AFc1kSDK aFc1kSDK, AFf1nSDK aFf1nSDK) {
        Intrinsics.checkNotNullParameter(aFc1kSDK, "");
        Intrinsics.checkNotNullParameter(aFf1nSDK, "");
        this.getMonetizationNetwork = aFc1kSDK;
        this.getCurrencyIso4217Code = aFf1nSDK;
        this.AFAdRevenueData = LazyKt.lazy(new Function0<Boolean>() { // from class: com.appsflyer.internal.AFf1pSDK.3
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: AFAdRevenueData, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke() {
                return Boolean.valueOf(Boolean.parseBoolean(AFf1pSDK.this.getMonetizationNetwork.getCurrencyIso4217Code("com.appsflyer.rc.sandbox")));
            }

            {
                super(0);
            }
        });
        this.getMediationNetwork = LazyKt.lazy(new Function0<Boolean>() { // from class: com.appsflyer.internal.AFf1pSDK.5
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: getMediationNetwork, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke() {
                return Boolean.valueOf(Boolean.parseBoolean(AFf1pSDK.this.getMonetizationNetwork.getCurrencyIso4217Code("com.appsflyer.rc.staging")));
            }

            {
                super(0);
            }
        });
    }

    public final boolean AFAdRevenueData() {
        return ((Boolean) this.AFAdRevenueData.getValue()).booleanValue();
    }

    public final boolean getMonetizationNetwork() {
        return ((Boolean) this.getMediationNetwork.getValue()).booleanValue();
    }

    public final long getCurrencyIso4217Code() {
        Object m11180constructorimpl;
        String currencyIso4217Code = this.getMonetizationNetwork.getCurrencyIso4217Code("com.appsflyer.rc.cache.max-age-fallback");
        if (currencyIso4217Code != null) {
            try {
                Result.Companion companion = Result.INSTANCE;
                AFf1pSDK aFf1pSDK = this;
                m11180constructorimpl = Result.m11180constructorimpl(Long.valueOf(Long.parseLong(currencyIso4217Code)));
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                m11180constructorimpl = Result.m11180constructorimpl(ResultKt.createFailure(th));
            }
            Throwable m11183exceptionOrNullimpl = Result.m11183exceptionOrNullimpl(m11180constructorimpl);
            if (m11183exceptionOrNullimpl != null) {
                AFLogger.afErrorLog("Can't read maxAgeFallback from Manifest: " + m11183exceptionOrNullimpl.getMessage(), m11183exceptionOrNullimpl);
                m11180constructorimpl = Long.valueOf(getMediationNetwork);
            }
            return ((Number) m11180constructorimpl).longValue();
        }
        return getMediationNetwork;
    }

    public final boolean getRevenue() {
        AFh1bSDK aFh1bSDK;
        AFi1zSDK aFi1zSDK = this.getCurrencyIso4217Code.getMediationNetwork;
        if (aFi1zSDK == null) {
            AFg1gSDK.i$default(AFLogger.INSTANCE, AFh1zSDK.REMOTE_CONTROL, "active config is missing - fetching from CDN", false, 4, null);
            return true;
        }
        AFh1iSDK aFh1iSDK = aFi1zSDK.getRevenue;
        return ((aFh1iSDK == null || (aFh1bSDK = aFh1iSDK.getRevenue) == null) ? false : aFh1bSDK.getCurrencyIso4217Code()) || System.currentTimeMillis() - this.getCurrencyIso4217Code.getRevenue > TimeUnit.SECONDS.toMillis(this.getCurrencyIso4217Code.getMonetizationNetwork);
    }
}
