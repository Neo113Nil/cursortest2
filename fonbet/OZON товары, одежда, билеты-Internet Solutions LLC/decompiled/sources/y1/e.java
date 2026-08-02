package y1;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import x1.C10631f;
import x1.C10639n;
import x1.x;

/* loaded from: classes.dex */
public final class e {
    public static final void a(@NotNull d dVar, @NotNull x xVar) {
        if (C10639n.a(xVar)) {
            dVar.d();
        }
        if (!C10639n.c(xVar)) {
            List<C10631f> c11 = xVar.c();
            int size = c11.size();
            for (int i11 = 0; i11 < size; i11++) {
                C10631f c10631f = c11.get(i11);
                dVar.a(c10631f.c(), c10631f.a());
            }
            dVar.a(xVar.m(), xVar.e());
        }
        if (C10639n.c(xVar) && xVar.m() - dVar.c() > 40) {
            dVar.d();
        }
        dVar.e(xVar.m());
    }

    private static final float b(float[] fArr, float[] fArr2) {
        int length = fArr.length;
        float f7 = 0.0f;
        for (int i11 = 0; i11 < length; i11++) {
            f7 += fArr[i11] * fArr2[i11];
        }
        return f7;
    }

    @NotNull
    public static final void c(@NotNull float[] fArr, @NotNull float[] fArr2, int i11, @NotNull float[] fArr3) {
        if (i11 == 0) {
            A1.a.a("At least one point must be provided");
            throw null;
        }
        int i12 = 2 >= i11 ? i11 - 1 : 2;
        int i13 = i12 + 1;
        float[][] fArr4 = new float[i13][];
        for (int i14 = 0; i14 < i13; i14++) {
            fArr4[i14] = new float[i11];
        }
        for (int i15 = 0; i15 < i11; i15++) {
            fArr4[0][i15] = 1.0f;
            for (int i16 = 1; i16 < i13; i16++) {
                fArr4[i16][i15] = fArr4[i16 - 1][i15] * fArr[i15];
            }
        }
        float[][] fArr5 = new float[i13][];
        for (int i17 = 0; i17 < i13; i17++) {
            fArr5[i17] = new float[i11];
        }
        float[][] fArr6 = new float[i13][];
        for (int i18 = 0; i18 < i13; i18++) {
            fArr6[i18] = new float[i13];
        }
        int i19 = 0;
        while (i19 < i13) {
            float[] destination = fArr5[i19];
            float[] fArr7 = fArr4[i19];
            Intrinsics.checkNotNullParameter(fArr7, "<this>");
            Intrinsics.checkNotNullParameter(destination, "destination");
            System.arraycopy(fArr7, 0, destination, 0, i11);
            for (int i21 = 0; i21 < i19; i21++) {
                float[] fArr8 = fArr5[i21];
                float b11 = b(destination, fArr8);
                for (int i22 = 0; i22 < i11; i22++) {
                    destination[i22] = destination[i22] - (fArr8[i22] * b11);
                }
            }
            float sqrt = (float) Math.sqrt(b(destination, destination));
            if (sqrt < 1.0E-6f) {
                sqrt = 1.0E-6f;
            }
            float f7 = 1.0f / sqrt;
            for (int i23 = 0; i23 < i11; i23++) {
                destination[i23] = destination[i23] * f7;
            }
            float[] fArr9 = fArr6[i19];
            int i24 = 0;
            while (i24 < i13) {
                fArr9[i24] = i24 < i19 ? 0.0f : b(destination, fArr4[i24]);
                i24++;
            }
            i19++;
        }
        for (int i25 = i12; -1 < i25; i25--) {
            float b12 = b(fArr5[i25], fArr2);
            float[] fArr10 = fArr6[i25];
            int i26 = i25 + 1;
            if (i26 <= i12) {
                int i27 = i12;
                while (true) {
                    b12 -= fArr10[i27] * fArr3[i27];
                    if (i27 != i26) {
                        i27--;
                    }
                }
            }
            fArr3[i25] = b12 / fArr10[i25];
        }
    }
}
