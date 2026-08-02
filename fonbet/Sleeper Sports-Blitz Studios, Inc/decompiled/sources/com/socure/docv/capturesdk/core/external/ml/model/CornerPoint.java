package com.socure.docv.capturesdk.core.external.ml.model;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: EdgeDetection.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010!\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u0007\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0011\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0006HÆ\u0003J%\u0010\u0012\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\"\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, d2 = {"Lcom/socure/docv/capturesdk/core/external/ml/model/CornerPoint;", "", "corner", "", "", "confidence", "", "(Ljava/util/List;F)V", "getConfidence", "()F", "setConfidence", "(F)V", "getCorner", "()Ljava/util/List;", "setCorner", "(Ljava/util/List;)V", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "capturesdk_productionRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class CornerPoint {
    public static final int $stable = 8;
    private float confidence;
    private List<Double> corner;

    /* JADX WARN: Multi-variable type inference failed */
    public CornerPoint() {
        this(null, 0.0f, 3, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CornerPoint copy$default(CornerPoint cornerPoint, List list, float f, int i, Object obj) {
        if ((i & 1) != 0) {
            list = cornerPoint.corner;
        }
        if ((i & 2) != 0) {
            f = cornerPoint.confidence;
        }
        return cornerPoint.copy(list, f);
    }

    public final List<Double> component1() {
        return this.corner;
    }

    /* renamed from: component2, reason: from getter */
    public final float getConfidence() {
        return this.confidence;
    }

    public final CornerPoint copy(List<Double> corner, float confidence) {
        return new CornerPoint(corner, confidence);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CornerPoint)) {
            return false;
        }
        CornerPoint cornerPoint = (CornerPoint) other;
        return Intrinsics.areEqual(this.corner, cornerPoint.corner) && Float.compare(this.confidence, cornerPoint.confidence) == 0;
    }

    public int hashCode() {
        List<Double> list = this.corner;
        return ((list == null ? 0 : list.hashCode()) * 31) + Float.hashCode(this.confidence);
    }

    public String toString() {
        return "CornerPoint(corner=" + this.corner + ", confidence=" + this.confidence + ")";
    }

    public CornerPoint(List<Double> list, float f) {
        this.corner = list;
        this.confidence = f;
    }

    public /* synthetic */ CornerPoint(List list, float f, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? -1.0f : f);
    }

    public final List<Double> getCorner() {
        return this.corner;
    }

    public final void setCorner(List<Double> list) {
        this.corner = list;
    }

    public final float getConfidence() {
        return this.confidence;
    }

    public final void setConfidence(float f) {
        this.confidence = f;
    }
}
