package j7;

import Hj.C3143a;
import android.animation.TypeEvaluator;
import android.graphics.Matrix;
import androidx.annotation.NonNull;

/* renamed from: j7.g, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public class C7298g implements TypeEvaluator<Matrix> {

    /* renamed from: a, reason: collision with root package name */
    private final float[] f69472a = new float[9];

    /* renamed from: b, reason: collision with root package name */
    private final float[] f69473b = new float[9];

    /* renamed from: c, reason: collision with root package name */
    private final Matrix f69474c = new Matrix();

    @NonNull
    public Matrix a(float f7, @NonNull Matrix matrix, @NonNull Matrix matrix2) {
        float[] fArr = this.f69472a;
        matrix.getValues(fArr);
        float[] fArr2 = this.f69473b;
        matrix2.getValues(fArr2);
        for (int i11 = 0; i11 < 9; i11++) {
            float f11 = fArr2[i11];
            float f12 = fArr[i11];
            fArr2[i11] = C3143a.d(f11, f12, f7, f12);
        }
        Matrix matrix3 = this.f69474c;
        matrix3.setValues(fArr2);
        return matrix3;
    }
}
