package l1;

import Bl0.C2644e;
import ed.InterfaceC6346b;
import java.util.Arrays;
import k1.C7458d;
import k1.C7459e;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@InterfaceC6346b
/* renamed from: l1.o0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7837o0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final float[] f72274a;

    private /* synthetic */ C7837o0(float[] fArr) {
        this.f72274a = fArr;
    }

    public static final /* synthetic */ C7837o0 a(float[] fArr) {
        return new C7837o0(fArr);
    }

    public static float[] b() {
        return new float[]{1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f};
    }

    public static final long c(long j11, float[] fArr) {
        float g10 = C7459e.g(j11);
        float h11 = C7459e.h(j11);
        float f7 = 1 / (((fArr[7] * h11) + (fArr[3] * g10)) + fArr[15]);
        if (Float.isInfinite(f7) || Float.isNaN(f7)) {
            f7 = 0.0f;
        }
        return P9.a.a(((fArr[4] * h11) + (fArr[0] * g10) + fArr[12]) * f7, ((fArr[5] * h11) + (fArr[1] * g10) + fArr[13]) * f7);
    }

    public static final void d(float[] fArr, @NotNull C7458d c7458d) {
        long c11 = c(P9.a.a(c7458d.b(), c7458d.d()), fArr);
        long c12 = c(P9.a.a(c7458d.b(), c7458d.a()), fArr);
        long c13 = c(P9.a.a(c7458d.c(), c7458d.d()), fArr);
        long c14 = c(P9.a.a(c7458d.c(), c7458d.a()), fArr);
        c7458d.i(Math.min(Math.min(C7459e.g(c11), C7459e.g(c12)), Math.min(C7459e.g(c13), C7459e.g(c14))));
        c7458d.k(Math.min(Math.min(C7459e.h(c11), C7459e.h(c12)), Math.min(C7459e.h(c13), C7459e.h(c14))));
        c7458d.j(Math.max(Math.max(C7459e.g(c11), C7459e.g(c12)), Math.max(C7459e.g(c13), C7459e.g(c14))));
        c7458d.h(Math.max(Math.max(C7459e.h(c11), C7459e.h(c12)), Math.max(C7459e.h(c13), C7459e.h(c14))));
    }

    public static final void e(float[] fArr) {
        int i11 = 0;
        while (i11 < 4) {
            int i12 = 0;
            while (i12 < 4) {
                fArr[(i12 * 4) + i11] = i11 == i12 ? 1.0f : 0.0f;
                i12++;
            }
            i11++;
        }
    }

    public static final void f(float f7, float[] fArr) {
        double d11 = (f7 * 3.141592653589793d) / 180.0d;
        float cos = (float) Math.cos(d11);
        float sin = (float) Math.sin(d11);
        float f11 = fArr[0];
        float f12 = fArr[4];
        float f13 = (sin * f12) + (cos * f11);
        float f14 = -sin;
        float f15 = fArr[1];
        float f16 = fArr[5];
        float f17 = (sin * f16) + (cos * f15);
        float f18 = fArr[2];
        float f19 = fArr[6];
        float f21 = (sin * f19) + (cos * f18);
        float f22 = fArr[3];
        float f23 = fArr[7];
        fArr[0] = f13;
        fArr[1] = f17;
        fArr[2] = f21;
        fArr[3] = (sin * f23) + (cos * f22);
        fArr[4] = (f12 * cos) + (f11 * f14);
        fArr[5] = (f16 * cos) + (f15 * f14);
        fArr[6] = (f19 * cos) + (f18 * f14);
        fArr[7] = (cos * f23) + (f14 * f22);
    }

    public static final void g(float f7, float f11, float[] fArr) {
        fArr[0] = fArr[0] * f7;
        fArr[1] = fArr[1] * f7;
        fArr[2] = fArr[2] * f7;
        fArr[3] = fArr[3] * f7;
        fArr[4] = fArr[4] * f11;
        fArr[5] = fArr[5] * f11;
        fArr[6] = fArr[6] * f11;
        fArr[7] = fArr[7] * f11;
        fArr[8] = fArr[8] * 1.0f;
        fArr[9] = fArr[9] * 1.0f;
        fArr[10] = fArr[10] * 1.0f;
        fArr[11] = fArr[11] * 1.0f;
    }

    public static final void h(float[] fArr, @NotNull float[] fArr2) {
        float b11 = C2644e.b(0, 0, fArr, fArr2);
        float b12 = C2644e.b(0, 1, fArr, fArr2);
        float b13 = C2644e.b(0, 2, fArr, fArr2);
        float b14 = C2644e.b(0, 3, fArr, fArr2);
        float b15 = C2644e.b(1, 0, fArr, fArr2);
        float b16 = C2644e.b(1, 1, fArr, fArr2);
        float b17 = C2644e.b(1, 2, fArr, fArr2);
        float b18 = C2644e.b(1, 3, fArr, fArr2);
        float b19 = C2644e.b(2, 0, fArr, fArr2);
        float b21 = C2644e.b(2, 1, fArr, fArr2);
        float b22 = C2644e.b(2, 2, fArr, fArr2);
        float b23 = C2644e.b(2, 3, fArr, fArr2);
        float b24 = C2644e.b(3, 0, fArr, fArr2);
        float b25 = C2644e.b(3, 1, fArr, fArr2);
        float b26 = C2644e.b(3, 2, fArr, fArr2);
        float b27 = C2644e.b(3, 3, fArr, fArr2);
        fArr[0] = b11;
        fArr[1] = b12;
        fArr[2] = b13;
        fArr[3] = b14;
        fArr[4] = b15;
        fArr[5] = b16;
        fArr[6] = b17;
        fArr[7] = b18;
        fArr[8] = b19;
        fArr[9] = b21;
        fArr[10] = b22;
        fArr[11] = b23;
        fArr[12] = b24;
        fArr[13] = b25;
        fArr[14] = b26;
        fArr[15] = b27;
    }

    public static final void i(float f7, float f11, float[] fArr) {
        float f12 = (fArr[8] * 0.0f) + (fArr[4] * f11) + (fArr[0] * f7) + fArr[12];
        float f13 = (fArr[9] * 0.0f) + (fArr[5] * f11) + (fArr[1] * f7) + fArr[13];
        float f14 = (fArr[10] * 0.0f) + (fArr[6] * f11) + (fArr[2] * f7) + fArr[14];
        float f15 = (fArr[11] * 0.0f) + (fArr[7] * f11) + (fArr[3] * f7) + fArr[15];
        fArr[12] = f12;
        fArr[13] = f13;
        fArr[14] = f14;
        fArr[15] = f15;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C7837o0) {
            return Intrinsics.d(this.f72274a, ((C7837o0) obj).f72274a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f72274a);
    }

    public final /* synthetic */ float[] j() {
        return this.f72274a;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("\n            |");
        float[] fArr = this.f72274a;
        sb2.append(fArr[0]);
        sb2.append(' ');
        sb2.append(fArr[1]);
        sb2.append(' ');
        sb2.append(fArr[2]);
        sb2.append(' ');
        sb2.append(fArr[3]);
        sb2.append("|\n            |");
        sb2.append(fArr[4]);
        sb2.append(' ');
        sb2.append(fArr[5]);
        sb2.append(' ');
        sb2.append(fArr[6]);
        sb2.append(' ');
        sb2.append(fArr[7]);
        sb2.append("|\n            |");
        sb2.append(fArr[8]);
        sb2.append(' ');
        sb2.append(fArr[9]);
        sb2.append(' ');
        sb2.append(fArr[10]);
        sb2.append(' ');
        sb2.append(fArr[11]);
        sb2.append("|\n            |");
        sb2.append(fArr[12]);
        sb2.append(' ');
        sb2.append(fArr[13]);
        sb2.append(' ');
        sb2.append(fArr[14]);
        sb2.append(' ');
        sb2.append(fArr[15]);
        sb2.append("|\n        ");
        return kotlin.text.h.E0(sb2.toString());
    }
}
