package ja;

import android.animation.TypeEvaluator;
import android.graphics.Matrix;

/* renamed from: ja.f, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC5109f implements TypeEvaluator {
    private final float[] tempStartValues = new float[9];
    private final float[] tempEndValues = new float[9];

    /* renamed from: a, reason: collision with root package name */
    public final Matrix f53866a = new Matrix();

    public Matrix a(float f10, Matrix matrix, Matrix matrix2) {
        matrix.getValues(this.tempStartValues);
        matrix2.getValues(this.tempEndValues);
        for (int i10 = 0; i10 < 9; i10++) {
            float[] fArr = this.tempEndValues;
            float f11 = fArr[i10];
            float f12 = this.tempStartValues[i10];
            fArr[i10] = f12 + ((f11 - f12) * f10);
        }
        this.f53866a.setValues(this.tempEndValues);
        return this.f53866a;
    }
}
