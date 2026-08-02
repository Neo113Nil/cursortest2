package com.google.android.material.progressindicator;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.Rect;
import androidx.annotation.NonNull;
import com.google.android.material.progressindicator.BaseProgressIndicatorSpec;
import java.util.Arrays;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
abstract class DrawingDelegate<S extends BaseProgressIndicatorSpec> {
    static final float WAVE_SMOOTHNESS = 0.48f;
    final PathMeasure activePathMeasure;
    final Path cachedActivePath;
    final Path displayedActivePath;
    S spec;
    final Matrix transform;

    /* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
    public static class ActiveIndicator {
        float amplitudeFraction = 1.0f;
        int color;
        float endFraction;
        int gapSize;
        boolean isDeterminate;
        float phaseFraction;
        float rotationDegree;
        float startFraction;
    }

    public DrawingDelegate(S s8) {
        Path path = new Path();
        this.cachedActivePath = path;
        this.displayedActivePath = new Path();
        this.activePathMeasure = new PathMeasure(path, false);
        this.spec = s8;
        this.transform = new Matrix();
    }

    public abstract void adjustCanvas(@NonNull Canvas canvas, @NonNull Rect rect, float f6, boolean z5, boolean z7);

    public abstract void drawStopIndicator(@NonNull Canvas canvas, @NonNull Paint paint, int i5, int i10);

    public abstract void fillIndicator(@NonNull Canvas canvas, @NonNull Paint paint, @NonNull ActiveIndicator activeIndicator, int i5);

    public abstract void fillTrack(@NonNull Canvas canvas, @NonNull Paint paint, float f6, float f10, int i5, int i10, int i11);

    public abstract int getPreferredHeight();

    public abstract int getPreferredWidth();

    public abstract void invalidateCachedPaths();

    public void validateSpecAndAdjustCanvas(@NonNull Canvas canvas, @NonNull Rect rect, float f6, boolean z5, boolean z7) {
        this.spec.validateSpec();
        adjustCanvas(canvas, rect, f6, z5, z7);
    }

    public float vectorToCanvasRotation(float[] fArr) {
        return (float) Math.toDegrees(Math.atan2(fArr[1], fArr[0]));
    }

    /* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
    public class PathPoint {
        float[] posVec;
        float[] tanVec;
        final Matrix transform;

        public PathPoint() {
            this.posVec = new float[2];
            this.tanVec = new float[]{1.0f, 0.0f};
            this.transform = new Matrix();
        }

        public float distance(DrawingDelegate<S>.PathPoint pathPoint) {
            float f6 = pathPoint.posVec[0];
            float[] fArr = this.posVec;
            return (float) Math.hypot(f6 - fArr[0], r5[1] - fArr[1]);
        }

        public void moveAcross(float f6) {
            float[] fArr = this.tanVec;
            float atan2 = (float) (Math.atan2(fArr[1], fArr[0]) + 1.5707963267948966d);
            double d10 = f6;
            double d11 = atan2;
            this.posVec[0] = (float) ((Math.cos(d11) * d10) + r2[0]);
            this.posVec[1] = (float) ((Math.sin(d11) * d10) + r14[1]);
        }

        public void moveAlong(float f6) {
            float[] fArr = this.tanVec;
            float atan2 = (float) Math.atan2(fArr[1], fArr[0]);
            double d10 = f6;
            double d11 = atan2;
            this.posVec[0] = (float) ((Math.cos(d11) * d10) + r2[0]);
            this.posVec[1] = (float) ((Math.sin(d11) * d10) + r14[1]);
        }

        public void reset() {
            Arrays.fill(this.posVec, 0.0f);
            Arrays.fill(this.tanVec, 0.0f);
            this.tanVec[0] = 1.0f;
            this.transform.reset();
        }

        public void rotate(float f6) {
            this.transform.reset();
            this.transform.setRotate(f6);
            this.transform.mapPoints(this.posVec);
            this.transform.mapPoints(this.tanVec);
        }

        public void scale(float f6, float f10) {
            float[] fArr = this.posVec;
            fArr[0] = fArr[0] * f6;
            fArr[1] = fArr[1] * f10;
            float[] fArr2 = this.tanVec;
            fArr2[0] = fArr2[0] * f6;
            fArr2[1] = fArr2[1] * f10;
        }

        public void translate(float f6, float f10) {
            float[] fArr = this.posVec;
            fArr[0] = fArr[0] + f6;
            fArr[1] = fArr[1] + f10;
        }

        public PathPoint(DrawingDelegate drawingDelegate, DrawingDelegate<S>.PathPoint pathPoint) {
            this(pathPoint.posVec, pathPoint.tanVec);
        }

        public PathPoint(float[] fArr, float[] fArr2) {
            float[] fArr3 = new float[2];
            this.posVec = fArr3;
            this.tanVec = new float[2];
            System.arraycopy(fArr, 0, fArr3, 0, 2);
            System.arraycopy(fArr2, 0, this.tanVec, 0, 2);
            this.transform = new Matrix();
        }
    }
}
