package androidx.vectordrawable.graphics.drawable;

import android.animation.TypeEvaluator;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class i implements TypeEvaluator {

    /* renamed from: a, reason: collision with root package name */
    public g0.f[] f2801a;

    @Override // android.animation.TypeEvaluator
    public final Object evaluate(float f6, Object obj, Object obj2) {
        g0.f[] fVarArr = (g0.f[]) obj;
        g0.f[] fVarArr2 = (g0.f[]) obj2;
        if (!y4.a.g(fVarArr, fVarArr2)) {
            throw new IllegalArgumentException("Can't interpolate between two incompatible pathData");
        }
        if (!y4.a.g(this.f2801a, fVarArr)) {
            this.f2801a = y4.a.r(fVarArr);
        }
        for (int i5 = 0; i5 < fVarArr.length; i5++) {
            g0.f fVar = this.f2801a[i5];
            g0.f fVar2 = fVarArr[i5];
            g0.f fVar3 = fVarArr2[i5];
            fVar.getClass();
            fVar.f9681a = fVar2.f9681a;
            int i10 = 0;
            while (true) {
                float[] fArr = fVar2.f9682b;
                if (i10 < fArr.length) {
                    fVar.f9682b[i10] = (fVar3.f9682b[i10] * f6) + ((1.0f - f6) * fArr[i10]);
                    i10++;
                }
            }
        }
        return this.f2801a;
    }
}
