package com.google.android.material.shape;

import androidx.annotation.NonNull;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public class TriangleEdgeTreatment extends EdgeTreatment {
    private final boolean inside;
    private final float size;

    public TriangleEdgeTreatment(float f6, boolean z5) {
        this.size = f6;
        this.inside = z5;
    }

    @Override // com.google.android.material.shape.EdgeTreatment
    public void getEdgePath(float f6, float f10, float f11, @NonNull ShapePath shapePath) {
        if (!this.inside) {
            float f12 = this.size;
            shapePath.lineTo(f10 - (f12 * f11), 0.0f, f10, (-f12) * f11);
            shapePath.lineTo((this.size * f11) + f10, 0.0f, f6, 0.0f);
        } else {
            shapePath.lineTo(f10 - (this.size * f11), 0.0f);
            float f13 = this.size;
            shapePath.lineTo(f10, f13 * f11, (f13 * f11) + f10, 0.0f);
            shapePath.lineTo(f6, 0.0f);
        }
    }
}
