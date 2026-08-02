package com.google.android.material.shape;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import androidx.annotation.NonNull;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public class ShapeAppearancePathProvider {
    protected static final int BOTTOM_LEFT_CORNER_INDEX = 2;
    protected static final int BOTTOM_RIGHT_CORNER_INDEX = 1;
    protected static final int TOP_LEFT_CORNER_INDEX = 3;
    protected static final int TOP_RIGHT_CORNER_INDEX = 0;
    private final ShapePath[] cornerPaths = new ShapePath[4];
    private final Matrix[] cornerTransforms = new Matrix[4];
    private final Matrix[] edgeTransforms = new Matrix[4];
    private final PointF pointF = new PointF();
    private final Path overlappedEdgePath = new Path();
    private final Path boundsPath = new Path();
    private final ShapePath shapePath = new ShapePath();
    private final float[] scratch = new float[2];
    private final float[] scratch2 = new float[2];
    private final Path edgePath = new Path();
    private final Path cornerPath = new Path();
    private boolean edgeIntersectionCheckEnabled = true;

    /* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
    public static class Lazy {
        static final ShapeAppearancePathProvider INSTANCE = new ShapeAppearancePathProvider();

        private Lazy() {
        }
    }

    /* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
    public interface PathListener {
        void onCornerPathCreated(ShapePath shapePath, Matrix matrix, int i5);

        void onEdgePathCreated(ShapePath shapePath, Matrix matrix, int i5);
    }

    /* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
    public static final class ShapeAppearancePathSpec {

        @NonNull
        public final RectF bounds;
        public final float interpolation;

        @NonNull
        public final Path path;
        public final PathListener pathListener;

        @NonNull
        public final ShapeAppearanceModel shapeAppearanceModel;

        public ShapeAppearancePathSpec(@NonNull ShapeAppearanceModel shapeAppearanceModel, float f6, RectF rectF, PathListener pathListener, Path path) {
            this.pathListener = pathListener;
            this.shapeAppearanceModel = shapeAppearanceModel;
            this.interpolation = f6;
            this.bounds = rectF;
            this.path = path;
        }
    }

    public ShapeAppearancePathProvider() {
        for (int i5 = 0; i5 < 4; i5++) {
            this.cornerPaths[i5] = new ShapePath();
            this.cornerTransforms[i5] = new Matrix();
            this.edgeTransforms[i5] = new Matrix();
        }
    }

    private float angleOfEdge(int i5) {
        return ((i5 + 1) % 4) * 90;
    }

    private void appendCornerPath(@NonNull ShapeAppearancePathSpec shapeAppearancePathSpec, int i5) {
        this.scratch[0] = this.cornerPaths[i5].getStartX();
        this.scratch[1] = this.cornerPaths[i5].getStartY();
        this.cornerTransforms[i5].mapPoints(this.scratch);
        if (i5 == 0) {
            Path path = shapeAppearancePathSpec.path;
            float[] fArr = this.scratch;
            path.moveTo(fArr[0], fArr[1]);
        } else {
            Path path2 = shapeAppearancePathSpec.path;
            float[] fArr2 = this.scratch;
            path2.lineTo(fArr2[0], fArr2[1]);
        }
        this.cornerPaths[i5].applyToPath(this.cornerTransforms[i5], shapeAppearancePathSpec.path);
        PathListener pathListener = shapeAppearancePathSpec.pathListener;
        if (pathListener != null) {
            pathListener.onCornerPathCreated(this.cornerPaths[i5], this.cornerTransforms[i5], i5);
        }
    }

    private void appendEdgePath(@NonNull ShapeAppearancePathSpec shapeAppearancePathSpec, int i5) {
        int i10 = (i5 + 1) % 4;
        this.scratch[0] = this.cornerPaths[i5].getEndX();
        this.scratch[1] = this.cornerPaths[i5].getEndY();
        this.cornerTransforms[i5].mapPoints(this.scratch);
        this.scratch2[0] = this.cornerPaths[i10].getStartX();
        this.scratch2[1] = this.cornerPaths[i10].getStartY();
        this.cornerTransforms[i10].mapPoints(this.scratch2);
        float f6 = this.scratch[0];
        float[] fArr = this.scratch2;
        float max = Math.max(((float) Math.hypot(f6 - fArr[0], r1[1] - fArr[1])) - 0.001f, 0.0f);
        float edgeCenterForIndex = getEdgeCenterForIndex(shapeAppearancePathSpec.bounds, i5);
        this.shapePath.reset(0.0f, 0.0f);
        EdgeTreatment edgeTreatmentForIndex = getEdgeTreatmentForIndex(i5, shapeAppearancePathSpec.shapeAppearanceModel);
        edgeTreatmentForIndex.getEdgePath(max, edgeCenterForIndex, shapeAppearancePathSpec.interpolation, this.shapePath);
        this.edgePath.reset();
        this.shapePath.applyToPath(this.edgeTransforms[i5], this.edgePath);
        if (this.edgeIntersectionCheckEnabled && (edgeTreatmentForIndex.forceIntersection() || pathOverlapsCorner(this.edgePath, i5) || pathOverlapsCorner(this.edgePath, i10))) {
            Path path = this.edgePath;
            path.op(path, this.boundsPath, Path.Op.DIFFERENCE);
            this.scratch[0] = this.shapePath.getStartX();
            this.scratch[1] = this.shapePath.getStartY();
            this.edgeTransforms[i5].mapPoints(this.scratch);
            Path path2 = this.overlappedEdgePath;
            float[] fArr2 = this.scratch;
            path2.moveTo(fArr2[0], fArr2[1]);
            this.shapePath.applyToPath(this.edgeTransforms[i5], this.overlappedEdgePath);
        } else {
            this.shapePath.applyToPath(this.edgeTransforms[i5], shapeAppearancePathSpec.path);
        }
        PathListener pathListener = shapeAppearancePathSpec.pathListener;
        if (pathListener != null) {
            pathListener.onEdgePathCreated(this.shapePath, this.edgeTransforms[i5], i5);
        }
    }

    private void getCoordinatesOfCorner(int i5, @NonNull RectF rectF, @NonNull PointF pointF) {
        if (i5 == 1) {
            pointF.set(rectF.right, rectF.bottom);
            return;
        }
        if (i5 == 2) {
            pointF.set(rectF.left, rectF.bottom);
        } else if (i5 != 3) {
            pointF.set(rectF.right, rectF.top);
        } else {
            pointF.set(rectF.left, rectF.top);
        }
    }

    private CornerTreatment getCornerTreatmentForIndex(int i5, @NonNull ShapeAppearanceModel shapeAppearanceModel) {
        return i5 != 1 ? i5 != 2 ? i5 != 3 ? shapeAppearanceModel.getTopRightCorner() : shapeAppearanceModel.getTopLeftCorner() : shapeAppearanceModel.getBottomLeftCorner() : shapeAppearanceModel.getBottomRightCorner();
    }

    private float getEdgeCenterForIndex(@NonNull RectF rectF, int i5) {
        float[] fArr = this.scratch;
        ShapePath shapePath = this.cornerPaths[i5];
        fArr[0] = shapePath.endX;
        fArr[1] = shapePath.endY;
        this.cornerTransforms[i5].mapPoints(fArr);
        return (i5 == 1 || i5 == 3) ? Math.abs(rectF.centerX() - this.scratch[0]) : Math.abs(rectF.centerY() - this.scratch[1]);
    }

    private EdgeTreatment getEdgeTreatmentForIndex(int i5, @NonNull ShapeAppearanceModel shapeAppearanceModel) {
        return i5 != 1 ? i5 != 2 ? i5 != 3 ? shapeAppearanceModel.getRightEdge() : shapeAppearanceModel.getTopEdge() : shapeAppearanceModel.getLeftEdge() : shapeAppearanceModel.getBottomEdge();
    }

    @NonNull
    public static ShapeAppearancePathProvider getInstance() {
        return Lazy.INSTANCE;
    }

    private boolean pathOverlapsCorner(Path path, int i5) {
        this.cornerPath.reset();
        this.cornerPaths[i5].applyToPath(this.cornerTransforms[i5], this.cornerPath);
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        this.cornerPath.computeBounds(rectF, true);
        path.op(this.cornerPath, Path.Op.INTERSECT);
        path.computeBounds(rectF, true);
        return !rectF.isEmpty() || (rectF.width() > 1.0f && rectF.height() > 1.0f);
    }

    private void setCornerPathAndTransform(@NonNull ShapeAppearancePathSpec shapeAppearancePathSpec, int i5, float[] fArr) {
        getCornerTreatmentForIndex(i5, shapeAppearancePathSpec.shapeAppearanceModel).getCornerPath(this.cornerPaths[i5], 90.0f, shapeAppearancePathSpec.interpolation, shapeAppearancePathSpec.bounds, fArr == null ? getCornerSizeForIndex(i5, shapeAppearancePathSpec.shapeAppearanceModel) : new ClampedCornerSize(fArr[i5]));
        float angleOfEdge = angleOfEdge(i5);
        this.cornerTransforms[i5].reset();
        getCoordinatesOfCorner(i5, shapeAppearancePathSpec.bounds, this.pointF);
        Matrix matrix = this.cornerTransforms[i5];
        PointF pointF = this.pointF;
        matrix.setTranslate(pointF.x, pointF.y);
        this.cornerTransforms[i5].preRotate(angleOfEdge);
    }

    private void setEdgePathAndTransform(int i5) {
        this.scratch[0] = this.cornerPaths[i5].getEndX();
        this.scratch[1] = this.cornerPaths[i5].getEndY();
        this.cornerTransforms[i5].mapPoints(this.scratch);
        float angleOfEdge = angleOfEdge(i5);
        this.edgeTransforms[i5].reset();
        Matrix matrix = this.edgeTransforms[i5];
        float[] fArr = this.scratch;
        matrix.setTranslate(fArr[0], fArr[1]);
        this.edgeTransforms[i5].preRotate(angleOfEdge);
    }

    public void calculatePath(ShapeAppearanceModel shapeAppearanceModel, float f6, RectF rectF, @NonNull Path path) {
        calculatePath(shapeAppearanceModel, f6, rectF, null, path);
    }

    @NonNull
    public CornerSize getCornerSizeForIndex(int i5, @NonNull ShapeAppearanceModel shapeAppearanceModel) {
        return i5 != 1 ? i5 != 2 ? i5 != 3 ? shapeAppearanceModel.getTopRightCornerSize() : shapeAppearanceModel.getTopLeftCornerSize() : shapeAppearanceModel.getBottomLeftCornerSize() : shapeAppearanceModel.getBottomRightCornerSize();
    }

    public void setEdgeIntersectionCheckEnable(boolean z5) {
        this.edgeIntersectionCheckEnabled = z5;
    }

    public void calculatePath(ShapeAppearanceModel shapeAppearanceModel, float f6, RectF rectF, PathListener pathListener, @NonNull Path path) {
        calculatePath(shapeAppearanceModel, null, f6, rectF, pathListener, path);
    }

    public void calculatePath(@NonNull ShapeAppearanceModel shapeAppearanceModel, float[] fArr, float f6, RectF rectF, PathListener pathListener, @NonNull Path path) {
        path.rewind();
        this.overlappedEdgePath.rewind();
        this.boundsPath.rewind();
        this.boundsPath.addRect(rectF, Path.Direction.CW);
        ShapeAppearancePathSpec shapeAppearancePathSpec = new ShapeAppearancePathSpec(shapeAppearanceModel, f6, rectF, pathListener, path);
        for (int i5 = 0; i5 < 4; i5++) {
            setCornerPathAndTransform(shapeAppearancePathSpec, i5, fArr);
            setEdgePathAndTransform(i5);
        }
        for (int i10 = 0; i10 < 4; i10++) {
            appendCornerPath(shapeAppearancePathSpec, i10);
            appendEdgePath(shapeAppearancePathSpec, i10);
        }
        path.close();
        this.overlappedEdgePath.close();
        if (this.overlappedEdgePath.isEmpty()) {
            return;
        }
        path.op(this.overlappedEdgePath, Path.Op.UNION);
    }
}
