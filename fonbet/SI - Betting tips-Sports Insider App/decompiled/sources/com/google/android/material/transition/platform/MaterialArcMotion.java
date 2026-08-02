package com.google.android.material.transition.platform;

import android.graphics.Path;
import android.graphics.PointF;
import android.transition.PathMotion;
import androidx.annotation.NonNull;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class MaterialArcMotion extends PathMotion {
    private static PointF getControlPoint(float f6, float f10, float f11, float f12) {
        return f10 > f12 ? new PointF(f11, f10) : new PointF(f6, f12);
    }

    @Override // android.transition.PathMotion
    @NonNull
    public Path getPath(float f6, float f10, float f11, float f12) {
        Path path = new Path();
        path.moveTo(f6, f10);
        PointF controlPoint = getControlPoint(f6, f10, f11, f12);
        path.quadTo(controlPoint.x, controlPoint.y, f11, f12);
        return path;
    }
}
