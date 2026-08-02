package com.google.android.material.shape;

import androidx.annotation.NonNull;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public class EdgeTreatment {
    public boolean forceIntersection() {
        return false;
    }

    @Deprecated
    public void getEdgePath(float f6, float f10, @NonNull ShapePath shapePath) {
        getEdgePath(f6, f6 / 2.0f, f10, shapePath);
    }

    public void getEdgePath(float f6, float f10, float f11, @NonNull ShapePath shapePath) {
        shapePath.lineTo(f6, 0.0f);
    }
}
