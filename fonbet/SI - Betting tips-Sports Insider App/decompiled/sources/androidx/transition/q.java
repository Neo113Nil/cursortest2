package androidx.transition;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PathMeasure;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class q extends p {

    /* renamed from: a, reason: collision with root package name */
    public final Path f2738a;

    /* renamed from: b, reason: collision with root package name */
    public final Matrix f2739b;

    public q(Path path) {
        Path path2 = new Path();
        this.f2738a = path2;
        Matrix matrix = new Matrix();
        this.f2739b = matrix;
        PathMeasure pathMeasure = new PathMeasure(path, false);
        float[] fArr = new float[2];
        pathMeasure.getPosTan(pathMeasure.getLength(), fArr, null);
        float f6 = fArr[0];
        float f10 = fArr[1];
        pathMeasure.getPosTan(0.0f, fArr, null);
        float f11 = fArr[0];
        float f12 = fArr[1];
        if (f11 == f6 && f12 == f10) {
            throw new IllegalArgumentException("pattern must not end at the starting point");
        }
        matrix.setTranslate(-f11, -f12);
        float f13 = f10 - f12;
        float sqrt = 1.0f / ((float) Math.sqrt((f13 * f13) + (r4 * r4)));
        matrix.postScale(sqrt, sqrt);
        matrix.postRotate((float) Math.toDegrees(-Math.atan2(f13, f6 - f11)));
        path.transform(matrix, path2);
    }

    @Override // androidx.transition.p
    public final Path getPath(float f6, float f10, float f11, float f12) {
        float f13 = f12 - f10;
        float sqrt = (float) Math.sqrt((f13 * f13) + (r6 * r6));
        double atan2 = Math.atan2(f13, f11 - f6);
        Matrix matrix = this.f2739b;
        matrix.setScale(sqrt, sqrt);
        matrix.postRotate((float) Math.toDegrees(atan2));
        matrix.postTranslate(f6, f10);
        Path path = new Path();
        this.f2738a.transform(matrix, path);
        return path;
    }
}
