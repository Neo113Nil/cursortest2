package ru.ozon.fintech.analytic.domain.config;

import K1.G;
import Kk.C3532b;
import Nh.a;
import Pk0.f;
import androidx.annotation.Keep;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Keep
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\u000f\b\u0087\b\u0018\u0000 *2\u00020\u0001:\u0001+Bm\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\u0002\u0012\u0012\b\u0002\u0010\u000b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\n\u0012\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\n¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0012J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0012J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0010J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0010J\u001a\u0010\u0017\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0018\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0018Jx\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\u0012\b\u0002\u0010\u000b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\n2\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\nHÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0012J\u0010\u0010\u001e\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010!\u001a\u00020\u00022\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b!\u0010\"R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b\u0003\u0010\u0010R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010$\u001a\u0004\b%\u0010\u0012R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010$\u001a\u0004\b&\u0010\u0012R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010$\u001a\u0004\b'\u0010\u0012R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010#\u001a\u0004\b\b\u0010\u0010R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010#\u001a\u0004\b\t\u0010\u0010R!\u0010\u000b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010(\u001a\u0004\b)\u0010\u0018R\u001f\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\f\u0010(\u001a\u0004\b\f\u0010\u0018¨\u0006,"}, d2 = {"Lru/ozon/fintech/analytic/domain/config/AnalyticsConfig;", "", "", "isEnabledAnalytics", "", "appsFlyerAnalyticsKey", "appsFlyerStoreName", "sentryDsn", "isStage", "isDebug", "Lkotlin/Function0;", "getOzonIdSessionId", "isOzonIdSigned", "<init>", "(ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "component1", "()Z", "component2", "()Ljava/lang/String;", "component3", "component4", "component5", "component6", "component7", "()Lkotlin/jvm/functions/Function0;", "component8", "copy", "(ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)Lru/ozon/fintech/analytic/domain/config/AnalyticsConfig;", "toString", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "Ljava/lang/String;", "getAppsFlyerAnalyticsKey", "getAppsFlyerStoreName", "getSentryDsn", "Lkotlin/jvm/functions/Function0;", "getGetOzonIdSessionId", "Companion", "a", "fintech-analytic_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class AnalyticsConfig {

    /* renamed from: NO, reason: collision with root package name */
    @NotNull
    private static final AnalyticsConfig f94915NO = new AnalyticsConfig(false, null, null, null, false, false, null, null, 254, null);
    private final String appsFlyerAnalyticsKey;
    private final String appsFlyerStoreName;
    private final Function0<String> getOzonIdSessionId;
    private final boolean isDebug;
    private final boolean isEnabledAnalytics;
    private final Function0<Boolean> isOzonIdSigned;
    private final boolean isStage;
    private final String sentryDsn;

    public AnalyticsConfig(boolean z11, String str, String str2, String str3, boolean z12, boolean z13, Function0<String> function0, Function0<Boolean> function02) {
        this.isEnabledAnalytics = z11;
        this.appsFlyerAnalyticsKey = str;
        this.appsFlyerStoreName = str2;
        this.sentryDsn = str3;
        this.isStage = z12;
        this.isDebug = z13;
        this.getOzonIdSessionId = function0;
        this.isOzonIdSigned = function02;
    }

    public static /* synthetic */ AnalyticsConfig copy$default(AnalyticsConfig analyticsConfig, boolean z11, String str, String str2, String str3, boolean z12, boolean z13, Function0 function0, Function0 function02, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = analyticsConfig.isEnabledAnalytics;
        }
        if ((i11 & 2) != 0) {
            str = analyticsConfig.appsFlyerAnalyticsKey;
        }
        if ((i11 & 4) != 0) {
            str2 = analyticsConfig.appsFlyerStoreName;
        }
        if ((i11 & 8) != 0) {
            str3 = analyticsConfig.sentryDsn;
        }
        if ((i11 & 16) != 0) {
            z12 = analyticsConfig.isStage;
        }
        if ((i11 & 32) != 0) {
            z13 = analyticsConfig.isDebug;
        }
        if ((i11 & 64) != 0) {
            function0 = analyticsConfig.getOzonIdSessionId;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
            function02 = analyticsConfig.isOzonIdSigned;
        }
        Function0 function03 = function0;
        Function0 function04 = function02;
        boolean z14 = z12;
        boolean z15 = z13;
        return analyticsConfig.copy(z11, str, str2, str3, z14, z15, function03, function04);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsEnabledAnalytics() {
        return this.isEnabledAnalytics;
    }

    /* renamed from: component2, reason: from getter */
    public final String getAppsFlyerAnalyticsKey() {
        return this.appsFlyerAnalyticsKey;
    }

    /* renamed from: component3, reason: from getter */
    public final String getAppsFlyerStoreName() {
        return this.appsFlyerStoreName;
    }

    /* renamed from: component4, reason: from getter */
    public final String getSentryDsn() {
        return this.sentryDsn;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getIsStage() {
        return this.isStage;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getIsDebug() {
        return this.isDebug;
    }

    public final Function0<String> component7() {
        return this.getOzonIdSessionId;
    }

    public final Function0<Boolean> component8() {
        return this.isOzonIdSigned;
    }

    @NotNull
    public final AnalyticsConfig copy(boolean isEnabledAnalytics, String appsFlyerAnalyticsKey, String appsFlyerStoreName, String sentryDsn, boolean isStage, boolean isDebug, Function0<String> getOzonIdSessionId, Function0<Boolean> isOzonIdSigned) {
        return new AnalyticsConfig(isEnabledAnalytics, appsFlyerAnalyticsKey, appsFlyerStoreName, sentryDsn, isStage, isDebug, getOzonIdSessionId, isOzonIdSigned);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AnalyticsConfig)) {
            return false;
        }
        AnalyticsConfig analyticsConfig = (AnalyticsConfig) other;
        return this.isEnabledAnalytics == analyticsConfig.isEnabledAnalytics && Intrinsics.d(this.appsFlyerAnalyticsKey, analyticsConfig.appsFlyerAnalyticsKey) && Intrinsics.d(this.appsFlyerStoreName, analyticsConfig.appsFlyerStoreName) && Intrinsics.d(this.sentryDsn, analyticsConfig.sentryDsn) && this.isStage == analyticsConfig.isStage && this.isDebug == analyticsConfig.isDebug && Intrinsics.d(this.getOzonIdSessionId, analyticsConfig.getOzonIdSessionId) && Intrinsics.d(this.isOzonIdSigned, analyticsConfig.isOzonIdSigned);
    }

    public final String getAppsFlyerAnalyticsKey() {
        return this.appsFlyerAnalyticsKey;
    }

    public final String getAppsFlyerStoreName() {
        return this.appsFlyerStoreName;
    }

    public final Function0<String> getGetOzonIdSessionId() {
        return this.getOzonIdSessionId;
    }

    public final String getSentryDsn() {
        return this.sentryDsn;
    }

    public int hashCode() {
        int hashCode = Boolean.hashCode(this.isEnabledAnalytics) * 31;
        String str = this.appsFlyerAnalyticsKey;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.appsFlyerStoreName;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.sentryDsn;
        int a11 = C3532b.a(C3532b.a((hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.isStage), 31, this.isDebug);
        Function0<String> function0 = this.getOzonIdSessionId;
        int hashCode4 = (a11 + (function0 == null ? 0 : function0.hashCode())) * 31;
        Function0<Boolean> function02 = this.isOzonIdSigned;
        return hashCode4 + (function02 != null ? function02.hashCode() : 0);
    }

    public final boolean isDebug() {
        return this.isDebug;
    }

    public final boolean isEnabledAnalytics() {
        return this.isEnabledAnalytics;
    }

    public final Function0<Boolean> isOzonIdSigned() {
        return this.isOzonIdSigned;
    }

    public final boolean isStage() {
        return this.isStage;
    }

    @NotNull
    public String toString() {
        boolean z11 = this.isEnabledAnalytics;
        String str = this.appsFlyerAnalyticsKey;
        String str2 = this.appsFlyerStoreName;
        String str3 = this.sentryDsn;
        boolean z12 = this.isStage;
        boolean z13 = this.isDebug;
        Function0<String> function0 = this.getOzonIdSessionId;
        Function0<Boolean> function02 = this.isOzonIdSigned;
        StringBuilder d11 = G.d("AnalyticsConfig(isEnabledAnalytics=", ", appsFlyerAnalyticsKey=", str, ", appsFlyerStoreName=", z11);
        a.h(d11, str2, ", sentryDsn=", str3, ", isStage=");
        f.c(", isDebug=", ", getOzonIdSessionId=", d11, z12, z13);
        d11.append(function0);
        d11.append(", isOzonIdSigned=");
        d11.append(function02);
        d11.append(")");
        return d11.toString();
    }

    public /* synthetic */ AnalyticsConfig(boolean z11, String str, String str2, String str3, boolean z12, boolean z13, Function0 function0, Function0 function02, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(z11, (i11 & 2) != 0 ? null : str, (i11 & 4) != 0 ? null : str2, (i11 & 8) != 0 ? null : str3, (i11 & 16) != 0 ? false : z12, (i11 & 32) != 0 ? false : z13, (i11 & 64) != 0 ? null : function0, (i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? null : function02);
    }
}
