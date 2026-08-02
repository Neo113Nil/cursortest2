package com.yandex.mapkit.map;

import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;

/* loaded from: classes9.dex */
public final class LineStyle implements Serializable {
    private float arcApproximationStep;
    private float dashLength;
    private float dashOffset;
    private float gapLength;
    private float gradientLength;
    private boolean innerOutlineEnabled;
    private int outlineColor;
    private float outlineWidth;
    private float strokeWidth;
    private float turnRadius;

    public LineStyle(float f7, float f11, int i11, float f12, boolean z11, float f13, float f14, float f15, float f16, float f17) {
        this.strokeWidth = f7;
        this.gradientLength = f11;
        this.outlineColor = i11;
        this.outlineWidth = f12;
        this.innerOutlineEnabled = z11;
        this.turnRadius = f13;
        this.arcApproximationStep = f14;
        this.dashLength = f15;
        this.gapLength = f16;
        this.dashOffset = f17;
    }

    public float getArcApproximationStep() {
        return this.arcApproximationStep;
    }

    public float getDashLength() {
        return this.dashLength;
    }

    public float getDashOffset() {
        return this.dashOffset;
    }

    public float getGapLength() {
        return this.gapLength;
    }

    public float getGradientLength() {
        return this.gradientLength;
    }

    public boolean getInnerOutlineEnabled() {
        return this.innerOutlineEnabled;
    }

    public int getOutlineColor() {
        return this.outlineColor;
    }

    public float getOutlineWidth() {
        return this.outlineWidth;
    }

    public float getStrokeWidth() {
        return this.strokeWidth;
    }

    public float getTurnRadius() {
        return this.turnRadius;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        this.strokeWidth = archive.add(this.strokeWidth);
        this.gradientLength = archive.add(this.gradientLength);
        this.outlineColor = archive.add(this.outlineColor);
        this.outlineWidth = archive.add(this.outlineWidth);
        this.innerOutlineEnabled = archive.add(this.innerOutlineEnabled);
        this.turnRadius = archive.add(this.turnRadius);
        this.arcApproximationStep = archive.add(this.arcApproximationStep);
        this.dashLength = archive.add(this.dashLength);
        this.gapLength = archive.add(this.gapLength);
        this.dashOffset = archive.add(this.dashOffset);
    }

    public LineStyle setArcApproximationStep(float f7) {
        this.arcApproximationStep = f7;
        return this;
    }

    public LineStyle setDashLength(float f7) {
        this.dashLength = f7;
        return this;
    }

    public LineStyle setDashOffset(float f7) {
        this.dashOffset = f7;
        return this;
    }

    public LineStyle setGapLength(float f7) {
        this.gapLength = f7;
        return this;
    }

    public LineStyle setGradientLength(float f7) {
        this.gradientLength = f7;
        return this;
    }

    public LineStyle setInnerOutlineEnabled(boolean z11) {
        this.innerOutlineEnabled = z11;
        return this;
    }

    public LineStyle setOutlineColor(int i11) {
        this.outlineColor = i11;
        return this;
    }

    public LineStyle setOutlineWidth(float f7) {
        this.outlineWidth = f7;
        return this;
    }

    public LineStyle setStrokeWidth(float f7) {
        this.strokeWidth = f7;
        return this;
    }

    public LineStyle setTurnRadius(float f7) {
        this.turnRadius = f7;
        return this;
    }

    public LineStyle() {
        this.strokeWidth = 5.0f;
        this.gradientLength = 0.0f;
        this.outlineColor = 0;
        this.outlineWidth = 0.0f;
        this.innerOutlineEnabled = false;
        this.turnRadius = 10.0f;
        this.arcApproximationStep = 12.0f;
        this.dashLength = 0.0f;
        this.gapLength = 0.0f;
        this.dashOffset = 0.0f;
    }
}
