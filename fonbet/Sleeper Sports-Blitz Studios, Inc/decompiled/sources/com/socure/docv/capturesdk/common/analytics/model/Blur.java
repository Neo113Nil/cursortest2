package com.socure.docv.capturesdk.common.analytics.model;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MetricData.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\bJ\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\nJ\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\nJ\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\nJ\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\nJ\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\nJJ\u0010\u0019\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u001aJ\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020!HÖ\u0001R\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\nR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\f\u0010\nR\u001e\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u000b\u001a\u0004\b\r\u0010\n\"\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0007\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u000b\u001a\u0004\b\u0010\u0010\n\"\u0004\b\u0011\u0010\u000fR\u001e\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u000b\u001a\u0004\b\u0012\u0010\n\"\u0004\b\u0013\u0010\u000f¨\u0006\""}, d2 = {"Lcom/socure/docv/capturesdk/common/analytics/model/Blur;", "", "variance", "", "avgLowVariance", "avgHighVariance", "avgVariance", "highestAvgVariance", "(Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;)V", "getAvgHighVariance", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getAvgLowVariance", "getAvgVariance", "setAvgVariance", "(Ljava/lang/Double;)V", "getHighestAvgVariance", "setHighestAvgVariance", "getVariance", "setVariance", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;)Lcom/socure/docv/capturesdk/common/analytics/model/Blur;", "equals", "", "other", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "capturesdk_productionRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class Blur {
    public static final int $stable = 8;
    private final Double avgHighVariance;
    private final Double avgLowVariance;
    private Double avgVariance;
    private Double highestAvgVariance;
    private Double variance;

    public Blur() {
        this(null, null, null, null, null, 31, null);
    }

    public static /* synthetic */ Blur copy$default(Blur blur, Double d, Double d2, Double d3, Double d4, Double d5, int i, Object obj) {
        if ((i & 1) != 0) {
            d = blur.variance;
        }
        if ((i & 2) != 0) {
            d2 = blur.avgLowVariance;
        }
        if ((i & 4) != 0) {
            d3 = blur.avgHighVariance;
        }
        if ((i & 8) != 0) {
            d4 = blur.avgVariance;
        }
        if ((i & 16) != 0) {
            d5 = blur.highestAvgVariance;
        }
        Double d6 = d5;
        Double d7 = d3;
        return blur.copy(d, d2, d7, d4, d6);
    }

    /* renamed from: component1, reason: from getter */
    public final Double getVariance() {
        return this.variance;
    }

    /* renamed from: component2, reason: from getter */
    public final Double getAvgLowVariance() {
        return this.avgLowVariance;
    }

    /* renamed from: component3, reason: from getter */
    public final Double getAvgHighVariance() {
        return this.avgHighVariance;
    }

    /* renamed from: component4, reason: from getter */
    public final Double getAvgVariance() {
        return this.avgVariance;
    }

    /* renamed from: component5, reason: from getter */
    public final Double getHighestAvgVariance() {
        return this.highestAvgVariance;
    }

    public final Blur copy(Double variance, Double avgLowVariance, Double avgHighVariance, Double avgVariance, Double highestAvgVariance) {
        return new Blur(variance, avgLowVariance, avgHighVariance, avgVariance, highestAvgVariance);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Blur)) {
            return false;
        }
        Blur blur = (Blur) other;
        return Intrinsics.areEqual((Object) this.variance, (Object) blur.variance) && Intrinsics.areEqual((Object) this.avgLowVariance, (Object) blur.avgLowVariance) && Intrinsics.areEqual((Object) this.avgHighVariance, (Object) blur.avgHighVariance) && Intrinsics.areEqual((Object) this.avgVariance, (Object) blur.avgVariance) && Intrinsics.areEqual((Object) this.highestAvgVariance, (Object) blur.highestAvgVariance);
    }

    public int hashCode() {
        Double d = this.variance;
        int hashCode = (d == null ? 0 : d.hashCode()) * 31;
        Double d2 = this.avgLowVariance;
        int hashCode2 = (hashCode + (d2 == null ? 0 : d2.hashCode())) * 31;
        Double d3 = this.avgHighVariance;
        int hashCode3 = (hashCode2 + (d3 == null ? 0 : d3.hashCode())) * 31;
        Double d4 = this.avgVariance;
        int hashCode4 = (hashCode3 + (d4 == null ? 0 : d4.hashCode())) * 31;
        Double d5 = this.highestAvgVariance;
        return hashCode4 + (d5 != null ? d5.hashCode() : 0);
    }

    public String toString() {
        return "Blur(variance=" + this.variance + ", avgLowVariance=" + this.avgLowVariance + ", avgHighVariance=" + this.avgHighVariance + ", avgVariance=" + this.avgVariance + ", highestAvgVariance=" + this.highestAvgVariance + ")";
    }

    public Blur(Double d, Double d2, Double d3, Double d4, Double d5) {
        this.variance = d;
        this.avgLowVariance = d2;
        this.avgHighVariance = d3;
        this.avgVariance = d4;
        this.highestAvgVariance = d5;
    }

    public /* synthetic */ Blur(Double d, Double d2, Double d3, Double d4, Double d5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : d, (i & 2) != 0 ? null : d2, (i & 4) != 0 ? null : d3, (i & 8) != 0 ? null : d4, (i & 16) != 0 ? null : d5);
    }

    public final Double getVariance() {
        return this.variance;
    }

    public final void setVariance(Double d) {
        this.variance = d;
    }

    public final Double getAvgLowVariance() {
        return this.avgLowVariance;
    }

    public final Double getAvgHighVariance() {
        return this.avgHighVariance;
    }

    public final Double getAvgVariance() {
        return this.avgVariance;
    }

    public final void setAvgVariance(Double d) {
        this.avgVariance = d;
    }

    public final Double getHighestAvgVariance() {
        return this.highestAvgVariance;
    }

    public final void setHighestAvgVariance(Double d) {
        this.highestAvgVariance = d;
    }
}
