package com.google.android.material.shape;

import androidx.annotation.NonNull;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public class RoundedCornerTreatment extends CornerTreatment {
    float radius;

    public RoundedCornerTreatment() {
        this.radius = -1.0f;
    }

    @Override // com.google.android.material.shape.CornerTreatment
    public void getCornerPath(@NonNull ShapePath shapePath, float f6, float f10, float f11) {
        float f12 = f11 * f10;
        shapePath.reset(0.0f, f12, 180.0f, 180.0f - f6);
        float f13 = f12 * 2.0f;
        shapePath.addArc(0.0f, 0.0f, f13, f13, 180.0f, f6);
    }

    @Deprecated
    public RoundedCornerTreatment(float f6) {
        this.radius = f6;
    }
}
