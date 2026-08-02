package com.google.android.material.shape;

import androidx.annotation.NonNull;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public class CutCornerTreatment extends CornerTreatment {
    float size;

    public CutCornerTreatment() {
        this.size = -1.0f;
    }

    @Override // com.google.android.material.shape.CornerTreatment
    public void getCornerPath(@NonNull ShapePath shapePath, float f6, float f10, float f11) {
        float f12 = f11 * f10;
        shapePath.reset(0.0f, f12, 180.0f, 180.0f - f6);
        double d10 = f12;
        shapePath.lineTo((float) (Math.sin(Math.toRadians(f6)) * d10), (float) (Math.sin(Math.toRadians(90.0f - f6)) * d10));
    }

    @Deprecated
    public CutCornerTreatment(float f6) {
        this.size = f6;
    }
}
