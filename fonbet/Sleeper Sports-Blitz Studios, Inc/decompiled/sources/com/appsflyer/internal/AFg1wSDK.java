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

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\r\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\f\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001b\u0010\u000e\u001a\u00020\u000b8GX\u0087\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\u0010\u001a\u0004\b\u0011\u0010\rR\u001b\u0010\u0012\u001a\u00020\u000b8GX\u0087\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0010\u001a\u0004\b\u000e\u0010\rR\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0013"}, d2 = {"Lcom/appsflyer/internal/AFg1wSDK;", "", "Lcom/appsflyer/internal/AFd1rSDK;", "p0", "Lcom/appsflyer/internal/AFg1vSDK;", "p1", "<init>", "(Lcom/appsflyer/internal/AFd1rSDK;Lcom/appsflyer/internal/AFg1vSDK;)V", "", "getMonetizationNetwork", "()J", "", "getRevenue", "()Z", "getCurrencyIso4217Code", "Lcom/appsflyer/internal/AFd1rSDK;", "Lkotlin/Lazy;", "getMediationNetwork", "AFAdRevenueData", "Lcom/appsflyer/internal/AFg1vSDK;", "AFa1tSDK"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AFg1wSDK {
    private static final long getRevenue = TimeUnit.HOURS.toSeconds(24);
    private final Lazy AFAdRevenueData;

    /* renamed from: getCurrencyIso4217Code, reason: from kotlin metadata */
    private final AFd1rSDK getRevenue;

    /* renamed from: getMediationNetwork, reason: from kotlin metadata */
    private final AFg1vSDK getMonetizationNetwork;

    /* renamed from: getMonetizationNetwork, reason: from kotlin metadata */
    private final Lazy getCurrencyIso4217Code;

    public AFg1wSDK(AFd1rSDK aFd1rSDK, AFg1vSDK aFg1vSDK) {
        Intrinsics.checkNotNullParameter(aFd1rSDK, "");
        Intrinsics.checkNotNullParameter(aFg1vSDK, "");
        this.getRevenue = aFd1rSDK;
        this.getMonetizationNetwork = aFg1vSDK;
        this.getCurrencyIso4217Code = LazyKt.lazy(new Function0<Boolean>() { // from class: com.appsflyer.internal.AFg1wSDK.3
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: getMediationNetwork, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke() {
                return Boolean.valueOf(Boolean.parseBoolean(AFg1wSDK.this.getRevenue.getMonetizationNetwork("com.appsflyer.rc.sandbox")));
            }

            {
                super(0);
            }
        });
        this.AFAdRevenueData = LazyKt.lazy(new Function0<Boolean>() { // from class: com.appsflyer.internal.AFg1wSDK.2
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: getCurrencyIso4217Code, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke() {
                return Boolean.valueOf(Boolean.parseBoolean(AFg1wSDK.this.getRevenue.getMonetizationNetwork("com.appsflyer.rc.staging")));
            }

            {
                super(0);
            }
        });
    }

    public final boolean getMediationNetwork() {
        return ((Boolean) this.getCurrencyIso4217Code.getValue()).booleanValue();
    }

    public final boolean getCurrencyIso4217Code() {
        return ((Boolean) this.AFAdRevenueData.getValue()).booleanValue();
    }

    public final long getMonetizationNetwork() {
        Object m13470constructorimpl;
        String monetizationNetwork = this.getRevenue.getMonetizationNetwork("com.appsflyer.rc.cache.max-age-fallback");
        if (monetizationNetwork != null) {
            try {
                Result.Companion companion = Result.INSTANCE;
                AFg1wSDK aFg1wSDK = this;
                m13470constructorimpl = Result.m13470constructorimpl(Long.valueOf(Long.parseLong(monetizationNetwork)));
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                m13470constructorimpl = Result.m13470constructorimpl(ResultKt.createFailure(th));
            }
            Throwable m13473exceptionOrNullimpl = Result.m13473exceptionOrNullimpl(m13470constructorimpl);
            if (m13473exceptionOrNullimpl != null) {
                AFLogger.afErrorLog("Can't read maxAgeFallback from Manifest: " + m13473exceptionOrNullimpl.getMessage(), m13473exceptionOrNullimpl);
                m13470constructorimpl = Long.valueOf(getRevenue);
            }
            return ((Number) m13470constructorimpl).longValue();
        }
        return getRevenue;
    }

    public final boolean getRevenue() {
        AFi1vSDK aFi1vSDK;
        AFi1ySDK aFi1ySDK = this.getMonetizationNetwork.getMonetizationNetwork;
        if (aFi1ySDK == null) {
            AFh1wSDK.i$default(AFLogger.INSTANCE, AFh1xSDK.REMOTE_CONTROL, "active config is missing - fetching from CDN", false, 4, null);
            return true;
        }
        AFh1dSDK aFh1dSDK = aFi1ySDK.getRevenue;
        return ((aFh1dSDK == null || (aFi1vSDK = aFh1dSDK.getMediationNetwork) == null) ? false : aFi1vSDK.getCurrencyIso4217Code()) || System.currentTimeMillis() - this.getMonetizationNetwork.getCurrencyIso4217Code > TimeUnit.SECONDS.toMillis(this.getMonetizationNetwork.getRevenue);
    }
}
