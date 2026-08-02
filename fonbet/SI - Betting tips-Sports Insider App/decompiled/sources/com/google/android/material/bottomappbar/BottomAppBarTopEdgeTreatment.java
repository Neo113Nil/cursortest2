package com.google.android.material.bottomappbar;

import androidx.annotation.NonNull;
import com.google.android.material.shape.EdgeTreatment;
import com.google.android.material.shape.ShapePath;
import d9.e;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public class BottomAppBarTopEdgeTreatment extends EdgeTreatment implements Cloneable {
    private static final int ANGLE_LEFT = 180;
    private static final int ANGLE_UP = 270;
    private static final int ARC_HALF = 180;
    private static final int ARC_QUARTER = 90;
    private static final float ROUNDED_CORNER_FAB_OFFSET = 1.75f;
    private float cradleVerticalOffset;
    private float fabCornerSize = -1.0f;
    private float fabDiameter;
    private float fabMargin;
    private float horizontalOffset;
    private float roundedCornerRadius;

    public BottomAppBarTopEdgeTreatment(float f6, float f10, float f11) {
        this.fabMargin = f6;
        this.roundedCornerRadius = f10;
        setCradleVerticalOffset(f11);
        this.horizontalOffset = 0.0f;
    }

    public float getCradleVerticalOffset() {
        return this.cradleVerticalOffset;
    }

    @Override // com.google.android.material.shape.EdgeTreatment
    public void getEdgePath(float f6, float f10, float f11, @NonNull ShapePath shapePath) {
        float f12;
        float f13;
        float f14 = this.fabDiameter;
        if (f14 == 0.0f) {
            shapePath.lineTo(f6, 0.0f);
            return;
        }
        float f15 = ((this.fabMargin * 2.0f) + f14) / 2.0f;
        float f16 = f11 * this.roundedCornerRadius;
        float f17 = f10 + this.horizontalOffset;
        float w10 = e.w(1.0f, f11, f15, this.cradleVerticalOffset * f11);
        if (w10 / f15 >= 1.0f) {
            shapePath.lineTo(f6, 0.0f);
            return;
        }
        float f18 = this.fabCornerSize;
        float f19 = f18 * f11;
        boolean z5 = f18 == -1.0f || Math.abs((f18 * 2.0f) - f14) < 0.1f;
        if (z5) {
            f12 = w10;
            f13 = 0.0f;
        } else {
            f13 = ROUNDED_CORNER_FAB_OFFSET;
            f12 = 0.0f;
        }
        float f20 = f15 + f16;
        float f21 = f12 + f16;
        float sqrt = (float) Math.sqrt((f20 * f20) - (f21 * f21));
        float f22 = f17 - sqrt;
        float f23 = f17 + sqrt;
        float degrees = (float) Math.toDegrees(Math.atan(sqrt / f21));
        float f24 = (90.0f - degrees) + f13;
        shapePath.lineTo(f22, 0.0f);
        float f25 = f22 - f16;
        float f26 = f22 + f16;
        float f27 = f16 * 2.0f;
        shapePath.addArc(f25, 0.0f, f26, f27, 270.0f, degrees);
        if (z5) {
            shapePath.addArc(f17 - f15, (-f15) - f12, f17 + f15, f15 - f12, 180.0f - f24, (f24 * 2.0f) - 180.0f);
        } else {
            float f28 = this.fabMargin;
            float f29 = f19 * 2.0f;
            float f30 = f28 + f29;
            float f31 = f17 - f15;
            shapePath.addArc(f31, -(f19 + f28), f30 + f31, f28 + f19, 180.0f - f24, ((f24 * 2.0f) - 180.0f) / 2.0f);
            float f32 = f17 + f15;
            float f33 = this.fabMargin;
            shapePath.lineTo(f32 - ((f33 / 2.0f) + f19), f33 + f19);
            float f34 = this.fabMargin;
            shapePath.addArc(f32 - (f29 + f34), -(f19 + f34), f32, f34 + f19, 90.0f, f24 - 90.0f);
        }
        shapePath.addArc(f23 - f16, 0.0f, f23 + f16, f27, 270.0f - degrees, degrees);
        shapePath.lineTo(f6, 0.0f);
    }

    public float getFabCornerRadius() {
        return this.fabCornerSize;
    }

    public float getFabCradleMargin() {
        return this.fabMargin;
    }

    public float getFabCradleRoundedCornerRadius() {
        return this.roundedCornerRadius;
    }

    public float getFabDiameter() {
        return this.fabDiameter;
    }

    public float getHorizontalOffset() {
        return this.horizontalOffset;
    }

    public void setCradleVerticalOffset(float f6) {
        if (f6 < 0.0f) {
            throw new IllegalArgumentException("cradleVerticalOffset must be positive.");
        }
        this.cradleVerticalOffset = f6;
    }

    public void setFabCornerSize(float f6) {
        this.fabCornerSize = f6;
    }

    public void setFabCradleMargin(float f6) {
        this.fabMargin = f6;
    }

    public void setFabCradleRoundedCornerRadius(float f6) {
        this.roundedCornerRadius = f6;
    }

    public void setFabDiameter(float f6) {
        this.fabDiameter = f6;
    }

    public void setHorizontalOffset(float f6) {
        this.horizontalOffset = f6;
    }
}
