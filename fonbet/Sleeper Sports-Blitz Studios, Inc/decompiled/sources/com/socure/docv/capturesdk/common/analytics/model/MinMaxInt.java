package com.socure.docv.capturesdk.common.analytics.model;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: MetricData.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0007\"\u0004\b\u000b\u0010\t¨\u0006\u0015"}, d2 = {"Lcom/socure/docv/capturesdk/common/analytics/model/MinMaxInt;", "", "min", "", "max", "(II)V", "getMax", "()I", "setMax", "(I)V", "getMin", "setMin", "component1", "component2", "copy", "equals", "", "other", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "", "capturesdk_productionRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class MinMaxInt {
    public static final int $stable = 8;
    private int max;
    private int min;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public MinMaxInt() {
        this(r2, r2, 3, null);
        int i = 0;
    }

    public static /* synthetic */ MinMaxInt copy$default(MinMaxInt minMaxInt, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = minMaxInt.min;
        }
        if ((i3 & 2) != 0) {
            i2 = minMaxInt.max;
        }
        return minMaxInt.copy(i, i2);
    }

    /* renamed from: component1, reason: from getter */
    public final int getMin() {
        return this.min;
    }

    /* renamed from: component2, reason: from getter */
    public final int getMax() {
        return this.max;
    }

    public final MinMaxInt copy(int min, int max) {
        return new MinMaxInt(min, max);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MinMaxInt)) {
            return false;
        }
        MinMaxInt minMaxInt = (MinMaxInt) other;
        return this.min == minMaxInt.min && this.max == minMaxInt.max;
    }

    public int hashCode() {
        return (Integer.hashCode(this.min) * 31) + Integer.hashCode(this.max);
    }

    public String toString() {
        return "MinMaxInt(min=" + this.min + ", max=" + this.max + ")";
    }

    public MinMaxInt(int i, int i2) {
        this.min = i;
        this.max = i2;
    }

    public /* synthetic */ MinMaxInt(int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? 0 : i2);
    }

    public final int getMax() {
        return this.max;
    }

    public final int getMin() {
        return this.min;
    }

    public final void setMax(int i) {
        this.max = i;
    }

    public final void setMin(int i) {
        this.min = i;
    }
}
