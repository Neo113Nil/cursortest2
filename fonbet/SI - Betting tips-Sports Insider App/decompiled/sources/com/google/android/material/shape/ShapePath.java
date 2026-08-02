package com.google.android.material.shape;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import androidx.annotation.NonNull;
import com.google.android.material.shadow.ShadowRenderer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public class ShapePath {
    protected static final float ANGLE_LEFT = 180.0f;
    private static final float ANGLE_UP = 270.0f;
    private boolean containsIncompatibleShadowOp;

    @Deprecated
    public float currentShadowAngle;

    @Deprecated
    public float endShadowAngle;

    @Deprecated
    public float endX;

    @Deprecated
    public float endY;
    private final List<PathOperation> operations = new ArrayList();
    private final List<ShadowCompatOperation> shadowCompatOperations = new ArrayList();

    @Deprecated
    public float startX;

    @Deprecated
    public float startY;

    /* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
    public static class ArcShadowOperation extends ShadowCompatOperation {
        private final PathArcOperation operation;

        public ArcShadowOperation(PathArcOperation pathArcOperation) {
            this.operation = pathArcOperation;
        }

        @Override // com.google.android.material.shape.ShapePath.ShadowCompatOperation
        public void draw(Matrix matrix, @NonNull ShadowRenderer shadowRenderer, int i5, @NonNull Canvas canvas) {
            shadowRenderer.drawCornerShadow(canvas, matrix, new RectF(this.operation.getLeft(), this.operation.getTop(), this.operation.getRight(), this.operation.getBottom()), i5, this.operation.getStartAngle(), this.operation.getSweepAngle());
        }
    }

    /* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
    public static class InnerCornerShadowOperation extends ShadowCompatOperation {
        private final PathLineOperation operation1;
        private final PathLineOperation operation2;
        private final float startX;
        private final float startY;

        public InnerCornerShadowOperation(PathLineOperation pathLineOperation, PathLineOperation pathLineOperation2, float f6, float f10) {
            this.operation1 = pathLineOperation;
            this.operation2 = pathLineOperation2;
            this.startX = f6;
            this.startY = f10;
        }

        @Override // com.google.android.material.shape.ShapePath.ShadowCompatOperation
        public void draw(Matrix matrix, ShadowRenderer shadowRenderer, int i5, Canvas canvas) {
            int i10;
            float sweepAngle = getSweepAngle();
            if (sweepAngle > 0.0f) {
                return;
            }
            double hypot = Math.hypot(this.operation1.f5949x - this.startX, this.operation1.f5950y - this.startY);
            double hypot2 = Math.hypot(this.operation2.f5949x - this.operation1.f5949x, this.operation2.f5950y - this.operation1.f5950y);
            float min = (float) Math.min(i5, Math.min(hypot, hypot2));
            double d10 = min;
            double tan = Math.tan(Math.toRadians((-sweepAngle) / 2.0f)) * d10;
            if (hypot > tan) {
                RectF rectF = new RectF(0.0f, 0.0f, (float) (hypot - tan), 0.0f);
                this.renderMatrix.set(matrix);
                this.renderMatrix.preTranslate(this.startX, this.startY);
                this.renderMatrix.preRotate(getStartAngle());
                i10 = i5;
                shadowRenderer.drawEdgeShadow(canvas, this.renderMatrix, rectF, i10);
            } else {
                i10 = i5;
            }
            float f6 = min * 2.0f;
            RectF rectF2 = new RectF(0.0f, 0.0f, f6, f6);
            this.renderMatrix.set(matrix);
            this.renderMatrix.preTranslate(this.operation1.f5949x, this.operation1.f5950y);
            this.renderMatrix.preRotate(getStartAngle());
            this.renderMatrix.preTranslate((float) ((-tan) - d10), (-2.0f) * min);
            shadowRenderer.drawInnerCornerShadow(canvas, this.renderMatrix, rectF2, (int) min, 450.0f, sweepAngle, new float[]{(float) (d10 + tan), f6});
            if (hypot2 > tan) {
                RectF rectF3 = new RectF(0.0f, 0.0f, (float) (hypot2 - tan), 0.0f);
                this.renderMatrix.set(matrix);
                this.renderMatrix.preTranslate(this.operation1.f5949x, this.operation1.f5950y);
                this.renderMatrix.preRotate(getEndAngle());
                this.renderMatrix.preTranslate((float) tan, 0.0f);
                shadowRenderer.drawEdgeShadow(canvas, this.renderMatrix, rectF3, i10);
            }
        }

        public float getEndAngle() {
            return (float) Math.toDegrees(Math.atan((this.operation2.f5950y - this.operation1.f5950y) / (this.operation2.f5949x - this.operation1.f5949x)));
        }

        public float getStartAngle() {
            return (float) Math.toDegrees(Math.atan((this.operation1.f5950y - this.startY) / (this.operation1.f5949x - this.startX)));
        }

        public float getSweepAngle() {
            float endAngle = ((getEndAngle() - getStartAngle()) + 360.0f) % 360.0f;
            return endAngle <= ShapePath.ANGLE_LEFT ? endAngle : endAngle - 360.0f;
        }
    }

    /* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
    public static class LineShadowOperation extends ShadowCompatOperation {
        private final PathLineOperation operation;
        private final float startX;
        private final float startY;

        public LineShadowOperation(PathLineOperation pathLineOperation, float f6, float f10) {
            this.operation = pathLineOperation;
            this.startX = f6;
            this.startY = f10;
        }

        @Override // com.google.android.material.shape.ShapePath.ShadowCompatOperation
        public void draw(Matrix matrix, @NonNull ShadowRenderer shadowRenderer, int i5, @NonNull Canvas canvas) {
            RectF rectF = new RectF(0.0f, 0.0f, (float) Math.hypot(this.operation.f5950y - this.startY, this.operation.f5949x - this.startX), 0.0f);
            this.renderMatrix.set(matrix);
            this.renderMatrix.preTranslate(this.startX, this.startY);
            this.renderMatrix.preRotate(getAngle());
            shadowRenderer.drawEdgeShadow(canvas, this.renderMatrix, rectF, i5);
        }

        public float getAngle() {
            return (float) Math.toDegrees(Math.atan((this.operation.f5950y - this.startY) / (this.operation.f5949x - this.startX)));
        }
    }

    /* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
    public static class PathArcOperation extends PathOperation {
        private static final RectF rectF = new RectF();

        @Deprecated
        public float bottom;

        @Deprecated
        public float left;

        @Deprecated
        public float right;

        @Deprecated
        public float startAngle;

        @Deprecated
        public float sweepAngle;

        @Deprecated
        public float top;

        public PathArcOperation(float f6, float f10, float f11, float f12) {
            setLeft(f6);
            setTop(f10);
            setRight(f11);
            setBottom(f12);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public float getBottom() {
            return this.bottom;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public float getLeft() {
            return this.left;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public float getRight() {
            return this.right;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public float getStartAngle() {
            return this.startAngle;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public float getSweepAngle() {
            return this.sweepAngle;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public float getTop() {
            return this.top;
        }

        private void setBottom(float f6) {
            this.bottom = f6;
        }

        private void setLeft(float f6) {
            this.left = f6;
        }

        private void setRight(float f6) {
            this.right = f6;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setStartAngle(float f6) {
            this.startAngle = f6;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSweepAngle(float f6) {
            this.sweepAngle = f6;
        }

        private void setTop(float f6) {
            this.top = f6;
        }

        @Override // com.google.android.material.shape.ShapePath.PathOperation
        public void applyToPath(@NonNull Matrix matrix, @NonNull Path path) {
            Matrix matrix2 = this.matrix;
            matrix.invert(matrix2);
            path.transform(matrix2);
            RectF rectF2 = rectF;
            rectF2.set(getLeft(), getTop(), getRight(), getBottom());
            path.arcTo(rectF2, getStartAngle(), getSweepAngle(), false);
            path.transform(matrix);
        }
    }

    /* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
    public static class PathCubicOperation extends PathOperation {
        private float controlX1;
        private float controlX2;
        private float controlY1;
        private float controlY2;
        private float endX;
        private float endY;

        public PathCubicOperation(float f6, float f10, float f11, float f12, float f13, float f14) {
            setControlX1(f6);
            setControlY1(f10);
            setControlX2(f11);
            setControlY2(f12);
            setEndX(f13);
            setEndY(f14);
        }

        private float getControlX1() {
            return this.controlX1;
        }

        private float getControlX2() {
            return this.controlX2;
        }

        private float getControlY1() {
            return this.controlY1;
        }

        private float getControlY2() {
            return this.controlY1;
        }

        private float getEndX() {
            return this.endX;
        }

        private float getEndY() {
            return this.endY;
        }

        private void setControlX1(float f6) {
            this.controlX1 = f6;
        }

        private void setControlX2(float f6) {
            this.controlX2 = f6;
        }

        private void setControlY1(float f6) {
            this.controlY1 = f6;
        }

        private void setControlY2(float f6) {
            this.controlY2 = f6;
        }

        private void setEndX(float f6) {
            this.endX = f6;
        }

        private void setEndY(float f6) {
            this.endY = f6;
        }

        @Override // com.google.android.material.shape.ShapePath.PathOperation
        public void applyToPath(@NonNull Matrix matrix, @NonNull Path path) {
            Matrix matrix2 = this.matrix;
            matrix.invert(matrix2);
            path.transform(matrix2);
            path.cubicTo(this.controlX1, this.controlY1, this.controlX2, this.controlY2, this.endX, this.endY);
            path.transform(matrix);
        }
    }

    /* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
    public static class PathLineOperation extends PathOperation {

        /* renamed from: x, reason: collision with root package name */
        private float f5949x;

        /* renamed from: y, reason: collision with root package name */
        private float f5950y;

        @Override // com.google.android.material.shape.ShapePath.PathOperation
        public void applyToPath(@NonNull Matrix matrix, @NonNull Path path) {
            Matrix matrix2 = this.matrix;
            matrix.invert(matrix2);
            path.transform(matrix2);
            path.lineTo(this.f5949x, this.f5950y);
            path.transform(matrix);
        }
    }

    /* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
    public static abstract class PathOperation {
        protected final Matrix matrix = new Matrix();

        public abstract void applyToPath(Matrix matrix, Path path);
    }

    /* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
    public static class PathQuadOperation extends PathOperation {

        @Deprecated
        public float controlX;

        @Deprecated
        public float controlY;

        @Deprecated
        public float endX;

        @Deprecated
        public float endY;

        private float getControlX() {
            return this.controlX;
        }

        private float getControlY() {
            return this.controlY;
        }

        private float getEndX() {
            return this.endX;
        }

        private float getEndY() {
            return this.endY;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setControlX(float f6) {
            this.controlX = f6;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setControlY(float f6) {
            this.controlY = f6;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setEndX(float f6) {
            this.endX = f6;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setEndY(float f6) {
            this.endY = f6;
        }

        @Override // com.google.android.material.shape.ShapePath.PathOperation
        public void applyToPath(@NonNull Matrix matrix, @NonNull Path path) {
            Matrix matrix2 = this.matrix;
            matrix.invert(matrix2);
            path.transform(matrix2);
            path.quadTo(getControlX(), getControlY(), getEndX(), getEndY());
            path.transform(matrix);
        }
    }

    /* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
    public static abstract class ShadowCompatOperation {
        static final Matrix IDENTITY_MATRIX = new Matrix();
        final Matrix renderMatrix = new Matrix();

        public abstract void draw(Matrix matrix, ShadowRenderer shadowRenderer, int i5, Canvas canvas);

        public final void draw(ShadowRenderer shadowRenderer, int i5, Canvas canvas) {
            draw(IDENTITY_MATRIX, shadowRenderer, i5, canvas);
        }
    }

    public ShapePath() {
        reset(0.0f, 0.0f);
    }

    private void addConnectingShadowIfNecessary(float f6) {
        if (getCurrentShadowAngle() == f6) {
            return;
        }
        float currentShadowAngle = ((f6 - getCurrentShadowAngle()) + 360.0f) % 360.0f;
        if (currentShadowAngle > ANGLE_LEFT) {
            return;
        }
        PathArcOperation pathArcOperation = new PathArcOperation(getEndX(), getEndY(), getEndX(), getEndY());
        pathArcOperation.setStartAngle(getCurrentShadowAngle());
        pathArcOperation.setSweepAngle(currentShadowAngle);
        this.shadowCompatOperations.add(new ArcShadowOperation(pathArcOperation));
        setCurrentShadowAngle(f6);
    }

    private void addShadowCompatOperation(ShadowCompatOperation shadowCompatOperation, float f6, float f10) {
        addConnectingShadowIfNecessary(f6);
        this.shadowCompatOperations.add(shadowCompatOperation);
        setCurrentShadowAngle(f10);
    }

    private float getCurrentShadowAngle() {
        return this.currentShadowAngle;
    }

    private float getEndShadowAngle() {
        return this.endShadowAngle;
    }

    private void setCurrentShadowAngle(float f6) {
        this.currentShadowAngle = f6;
    }

    private void setEndShadowAngle(float f6) {
        this.endShadowAngle = f6;
    }

    private void setEndX(float f6) {
        this.endX = f6;
    }

    private void setEndY(float f6) {
        this.endY = f6;
    }

    private void setStartX(float f6) {
        this.startX = f6;
    }

    private void setStartY(float f6) {
        this.startY = f6;
    }

    public void addArc(float f6, float f10, float f11, float f12, float f13, float f14) {
        PathArcOperation pathArcOperation = new PathArcOperation(f6, f10, f11, f12);
        pathArcOperation.setStartAngle(f13);
        pathArcOperation.setSweepAngle(f14);
        this.operations.add(pathArcOperation);
        ArcShadowOperation arcShadowOperation = new ArcShadowOperation(pathArcOperation);
        float f15 = f13 + f14;
        boolean z5 = f14 < 0.0f;
        if (z5) {
            f13 = (f13 + ANGLE_LEFT) % 360.0f;
        }
        addShadowCompatOperation(arcShadowOperation, f13, z5 ? (ANGLE_LEFT + f15) % 360.0f : f15);
        double d10 = f15;
        setEndX((((f11 - f6) / 2.0f) * ((float) Math.cos(Math.toRadians(d10)))) + ((f6 + f11) * 0.5f));
        setEndY((((f12 - f10) / 2.0f) * ((float) Math.sin(Math.toRadians(d10)))) + ((f10 + f12) * 0.5f));
    }

    public void applyToPath(Matrix matrix, Path path) {
        int size = this.operations.size();
        for (int i5 = 0; i5 < size; i5++) {
            this.operations.get(i5).applyToPath(matrix, path);
        }
    }

    public boolean containsIncompatibleShadowOp() {
        return this.containsIncompatibleShadowOp;
    }

    @NonNull
    public ShadowCompatOperation createShadowCompatOperation(Matrix matrix) {
        addConnectingShadowIfNecessary(getEndShadowAngle());
        final Matrix matrix2 = new Matrix(matrix);
        final ArrayList arrayList = new ArrayList(this.shadowCompatOperations);
        return new ShadowCompatOperation() { // from class: com.google.android.material.shape.ShapePath.1
            @Override // com.google.android.material.shape.ShapePath.ShadowCompatOperation
            public void draw(Matrix matrix3, ShadowRenderer shadowRenderer, int i5, Canvas canvas) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((ShadowCompatOperation) it.next()).draw(matrix2, shadowRenderer, i5, canvas);
                }
            }
        };
    }

    public void cubicToPoint(float f6, float f10, float f11, float f12, float f13, float f14) {
        this.operations.add(new PathCubicOperation(f6, f10, f11, f12, f13, f14));
        this.containsIncompatibleShadowOp = true;
        setEndX(f13);
        setEndY(f14);
    }

    public float getEndX() {
        return this.endX;
    }

    public float getEndY() {
        return this.endY;
    }

    public float getStartX() {
        return this.startX;
    }

    public float getStartY() {
        return this.startY;
    }

    public void lineTo(float f6, float f10) {
        PathLineOperation pathLineOperation = new PathLineOperation();
        pathLineOperation.f5949x = f6;
        pathLineOperation.f5950y = f10;
        this.operations.add(pathLineOperation);
        LineShadowOperation lineShadowOperation = new LineShadowOperation(pathLineOperation, getEndX(), getEndY());
        addShadowCompatOperation(lineShadowOperation, lineShadowOperation.getAngle() + ANGLE_UP, lineShadowOperation.getAngle() + ANGLE_UP);
        setEndX(f6);
        setEndY(f10);
    }

    public void quadToPoint(float f6, float f10, float f11, float f12) {
        PathQuadOperation pathQuadOperation = new PathQuadOperation();
        pathQuadOperation.setControlX(f6);
        pathQuadOperation.setControlY(f10);
        pathQuadOperation.setEndX(f11);
        pathQuadOperation.setEndY(f12);
        this.operations.add(pathQuadOperation);
        this.containsIncompatibleShadowOp = true;
        setEndX(f11);
        setEndY(f12);
    }

    public void reset(float f6, float f10) {
        reset(f6, f10, ANGLE_UP, 0.0f);
    }

    public void reset(float f6, float f10, float f11, float f12) {
        setStartX(f6);
        setStartY(f10);
        setEndX(f6);
        setEndY(f10);
        setCurrentShadowAngle(f11);
        setEndShadowAngle((f11 + f12) % 360.0f);
        this.operations.clear();
        this.shadowCompatOperations.clear();
        this.containsIncompatibleShadowOp = false;
    }

    public ShapePath(float f6, float f10) {
        reset(f6, f10);
    }

    public void lineTo(float f6, float f10, float f11, float f12) {
        if ((Math.abs(f6 - getEndX()) < 0.001f && Math.abs(f10 - getEndY()) < 0.001f) || (Math.abs(f6 - f11) < 0.001f && Math.abs(f10 - f12) < 0.001f)) {
            lineTo(f11, f12);
            return;
        }
        PathLineOperation pathLineOperation = new PathLineOperation();
        pathLineOperation.f5949x = f6;
        pathLineOperation.f5950y = f10;
        this.operations.add(pathLineOperation);
        PathLineOperation pathLineOperation2 = new PathLineOperation();
        pathLineOperation2.f5949x = f11;
        pathLineOperation2.f5950y = f12;
        this.operations.add(pathLineOperation2);
        InnerCornerShadowOperation innerCornerShadowOperation = new InnerCornerShadowOperation(pathLineOperation, pathLineOperation2, getEndX(), getEndY());
        if (innerCornerShadowOperation.getSweepAngle() > 0.0f) {
            lineTo(f6, f10);
            lineTo(f11, f12);
        } else {
            addShadowCompatOperation(innerCornerShadowOperation, innerCornerShadowOperation.getStartAngle() + ANGLE_UP, innerCornerShadowOperation.getEndAngle() + ANGLE_UP);
            setEndX(f11);
            setEndY(f12);
        }
    }
}
