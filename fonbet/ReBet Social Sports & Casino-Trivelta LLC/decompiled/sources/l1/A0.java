package l1;

import android.graphics.Matrix;
import com.google.common.collect.AbstractC3445z;
import e1.AbstractC4134a;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public abstract class A0 {

    /* renamed from: a, reason: collision with root package name */
    public static final float[][] f55394a = {new float[]{1.0f, 0.0f, 0.0f, 1.0f}, new float[]{-1.0f, 0.0f, 0.0f, 1.0f}, new float[]{0.0f, 1.0f, 0.0f, 1.0f}, new float[]{0.0f, -1.0f, 0.0f, 1.0f}, new float[]{0.0f, 0.0f, 1.0f, 1.0f}, new float[]{0.0f, 0.0f, -1.0f, 1.0f}};

    public static AbstractC3445z a(AbstractC3445z abstractC3445z) {
        AbstractC4134a.b(abstractC3445z.size() >= 3, "A polygon must have at least 3 vertices.");
        AbstractC3445z.a k10 = new AbstractC3445z.a().k(abstractC3445z);
        float[][] fArr = f55394a;
        int length = fArr.length;
        int i10 = 0;
        while (i10 < length) {
            float[] fArr2 = fArr[i10];
            AbstractC3445z m10 = k10.m();
            AbstractC3445z.a aVar = new AbstractC3445z.a();
            for (int i11 = 0; i11 < m10.size(); i11++) {
                float[] fArr3 = (float[]) m10.get(i11);
                float[] fArr4 = (float[]) m10.get(((m10.size() + i11) - 1) % m10.size());
                if (f(fArr3, fArr2)) {
                    if (!f(fArr4, fArr2)) {
                        float[] b10 = b(fArr2, fArr2, fArr4, fArr3);
                        if (!Arrays.equals(fArr3, b10)) {
                            aVar.a(b10);
                        }
                    }
                    aVar.a(fArr3);
                } else if (f(fArr4, fArr2)) {
                    float[] b11 = b(fArr2, fArr2, fArr4, fArr3);
                    if (!Arrays.equals(fArr4, b11)) {
                        aVar.a(b11);
                    }
                }
            }
            i10++;
            k10 = aVar;
        }
        return k10.m();
    }

    public static float[] b(float[] fArr, float[] fArr2, float[] fArr3, float[] fArr4) {
        AbstractC4134a.b(fArr2.length == 4, "Expecting 4 plane parameters");
        float f10 = fArr[0];
        float f11 = fArr3[0];
        float f12 = fArr2[0];
        float f13 = fArr[1];
        float f14 = fArr3[1];
        float f15 = fArr2[1];
        float f16 = fArr[2];
        float f17 = fArr3[2];
        float f18 = fArr2[2];
        float f19 = ((f10 - f11) * f12) + ((f13 - f14) * f15) + ((f16 - f17) * f18);
        float f20 = fArr4[0];
        float f21 = (f20 - f11) * f12;
        float f22 = fArr4[1];
        float f23 = fArr4[2];
        float f24 = f19 / ((f21 + ((f22 - f14) * f15)) + ((f23 - f17) * f18));
        return new float[]{f11 + ((f20 - f11) * f24), f14 + ((f22 - f14) * f24), f17 + ((f23 - f17) * f24), 1.0f};
    }

    public static e1.L c(int i10, int i11, List list) {
        AbstractC4134a.b(i10 > 0, "inputWidth must be positive");
        AbstractC4134a.b(i11 > 0, "inputHeight must be positive");
        e1.L l10 = new e1.L(i10, i11);
        for (int i12 = 0; i12 < list.size(); i12++) {
            l10 = ((InterfaceC5392y0) list.get(i12)).d(l10.b(), l10.a());
        }
        return l10;
    }

    public static float[] d(Matrix matrix) {
        float[] fArr = new float[9];
        matrix.getValues(fArr);
        float[] e10 = e(fArr);
        float[] fArr2 = new float[16];
        android.opengl.Matrix.transposeM(fArr2, 0, e10, 0);
        return fArr2;
    }

    public static float[] e(float[] fArr) {
        float[] fArr2 = new float[16];
        fArr2[10] = 1.0f;
        int i10 = 0;
        while (i10 < 3) {
            int i11 = 0;
            while (i11 < 3) {
                fArr2[((i10 == 2 ? 3 : i10) * 4) + (i11 == 2 ? 3 : i11)] = fArr[(i10 * 3) + i11];
                i11++;
            }
            i10++;
        }
        return fArr2;
    }

    public static boolean f(float[] fArr, float[] fArr2) {
        AbstractC4134a.b(fArr2.length == 4, "Expecting 4 plane parameters");
        return ((fArr2[0] * fArr[0]) + (fArr2[1] * fArr[1])) + (fArr2[2] * fArr[2]) <= fArr2[3];
    }

    public static AbstractC3445z g(float[] fArr, AbstractC3445z abstractC3445z) {
        AbstractC3445z.a aVar = new AbstractC3445z.a();
        int i10 = 0;
        while (i10 < abstractC3445z.size()) {
            float[] fArr2 = new float[4];
            float[] fArr3 = fArr;
            android.opengl.Matrix.multiplyMV(fArr2, 0, fArr3, 0, (float[]) abstractC3445z.get(i10), 0);
            float f10 = fArr2[0];
            float f11 = fArr2[3];
            fArr2[0] = f10 / f11;
            fArr2[1] = fArr2[1] / f11;
            fArr2[2] = fArr2[2] / f11;
            fArr2[3] = 1.0f;
            aVar.a(fArr2);
            i10++;
            fArr = fArr3;
        }
        return aVar.m();
    }
}
