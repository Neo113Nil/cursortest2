package ru.ozon.uni.ozi.components.icon.presets.squircle;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0019\u001a\u00020\u001a¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\u001d\u001a\u00020\u001a¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001cR\u0011\u0010\u001f\u001a\u00020\u001a¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001cR\u0011\u0010!\u001a\u00020\u001a¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001cR\u0011\u0010#\u001a\u00020$¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&¨\u0006'"}, d2 = {"Lru/ozon/uni/ozi/components/icon/presets/squircle/SmoothCorner;", "", "cornerRadius", "", "smoothnessAsPercent", "", "maximumCurveStartDistanceFromVertex", "<init>", "(FIF)V", "radius", "smoothness", "curveStartDistance", "shouldCurveInterpolate", "", "interpolationMultiplier", "angleAlpha", "angleBeta", "angleTheta", "distanceE", "distanceC", "distanceD", "distanceK", "distanceL", "distanceB", "distanceA", "anchorPoint1", "Lru/ozon/uni/ozi/components/icon/presets/squircle/PointRelativeToVertex;", "getAnchorPoint1", "()Lru/ozon/uni/ozi/components/icon/presets/squircle/PointRelativeToVertex;", "controlPoint1", "getControlPoint1", "controlPoint2", "getControlPoint2", "anchorPoint2", "getAnchorPoint2", "arcSection", "Lru/ozon/uni/ozi/components/icon/presets/squircle/Arc;", "getArcSection", "()Lru/ozon/uni/ozi/components/icon/presets/squircle/Arc;", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class SmoothCorner {

    @NotNull
    private final PointRelativeToVertex anchorPoint1;

    @NotNull
    private final PointRelativeToVertex anchorPoint2;
    private final float angleAlpha;
    private final float angleBeta;
    private final float angleTheta;

    @NotNull
    private final Arc arcSection;

    @NotNull
    private final PointRelativeToVertex controlPoint1;

    @NotNull
    private final PointRelativeToVertex controlPoint2;
    private final float curveStartDistance;
    private final float distanceA;
    private final float distanceB;
    private final float distanceC;
    private final float distanceD;
    private final float distanceE;
    private final float distanceK;
    private final float distanceL;
    private final float interpolationMultiplier;
    private final float radius;
    private final boolean shouldCurveInterpolate;
    private final float smoothness;

    public SmoothCorner(float f7, int i11, float f11) {
        if (i11 < 0) {
            throw new IllegalArgumentException("The value for smoothness can never be negative.");
        }
        float min = Math.min(f7, f11);
        this.radius = min;
        float f12 = i11 / 100.0f;
        this.smoothness = f12;
        float f13 = 1;
        float min2 = Math.min(f11, (f13 + f12) * min);
        this.curveStartDistance = min2;
        float f14 = 2;
        float f15 = f11 / f14;
        boolean z11 = min <= f15;
        this.shouldCurveInterpolate = z11;
        this.interpolationMultiplier = (min - f15) / f15;
        float radians = (float) (z11 ? Math.toRadians(f12 * 45.0d) : Math.toRadians(f12 * 45.0d * (f13 - r9)));
        this.angleAlpha = radians;
        float radians2 = (float) (z11 ? Math.toRadians((1.0d - f12) * 90.0d) : Math.toRadians((f13 - ((f13 - r9) * f12)) * 90.0d));
        this.angleBeta = radians2;
        float radians3 = (float) ((Math.toRadians(90.0d) - radians2) / 2.0d);
        this.angleTheta = radians3;
        float tan = ((float) Math.tan(radians3 / f14)) * min;
        this.distanceE = tan;
        double d11 = radians;
        float cos = tan * ((float) Math.cos(d11));
        this.distanceC = cos;
        float tan2 = ((float) Math.tan(d11)) * cos;
        this.distanceD = tan2;
        float sin = ((float) Math.sin(radians2 / f14)) * min;
        this.distanceK = sin;
        float sqrt = (float) (sin * Math.sqrt(2.0d));
        this.distanceL = sqrt;
        float tan3 = ((min2 - sqrt) - ((f13 + ((float) Math.tan(d11))) * cos)) / 3;
        this.distanceB = tan3;
        float f16 = f14 * tan3;
        this.distanceA = f16;
        PointRelativeToVertex pointRelativeToVertex = new PointRelativeToVertex(Math.min(min2, f11), 0.0f);
        this.anchorPoint1 = pointRelativeToVertex;
        PointRelativeToVertex pointRelativeToVertex2 = new PointRelativeToVertex(pointRelativeToVertex.getDistanceToFurthestSide() - f16, 0.0f);
        this.controlPoint1 = pointRelativeToVertex2;
        PointRelativeToVertex pointRelativeToVertex3 = new PointRelativeToVertex(pointRelativeToVertex2.getDistanceToFurthestSide() - tan3, 0.0f);
        this.controlPoint2 = pointRelativeToVertex3;
        this.anchorPoint2 = new PointRelativeToVertex(pointRelativeToVertex3.getDistanceToFurthestSide() - cos, tan2);
        this.arcSection = new Arc(min, radians3, radians2);
    }

    @NotNull
    public final PointRelativeToVertex getAnchorPoint1() {
        return this.anchorPoint1;
    }

    @NotNull
    public final PointRelativeToVertex getAnchorPoint2() {
        return this.anchorPoint2;
    }

    @NotNull
    public final Arc getArcSection() {
        return this.arcSection;
    }

    @NotNull
    public final PointRelativeToVertex getControlPoint1() {
        return this.controlPoint1;
    }

    @NotNull
    public final PointRelativeToVertex getControlPoint2() {
        return this.controlPoint2;
    }
}
