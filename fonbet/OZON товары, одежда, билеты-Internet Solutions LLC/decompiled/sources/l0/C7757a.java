package l0;

import Hj.C3143a;
import org.jetbrains.annotations.NotNull;

/* renamed from: l0.a, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C7757a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private static final float[] f72059a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f72060b = 0;

    /* renamed from: l0.a$a, reason: collision with other inner class name */
    public static final class C1193a {

        /* renamed from: a, reason: collision with root package name */
        private final float f72061a;

        /* renamed from: b, reason: collision with root package name */
        private final float f72062b;

        public C1193a(float f7, float f11) {
            this.f72061a = f7;
            this.f72062b = f11;
        }

        public final float a() {
            return this.f72061a;
        }

        public final float b() {
            return this.f72062b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C1193a)) {
                return false;
            }
            C1193a c1193a = (C1193a) obj;
            return Float.compare(this.f72061a, c1193a.f72061a) == 0 && Float.compare(this.f72062b, c1193a.f72062b) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.f72062b) + (Float.hashCode(this.f72061a) * 31);
        }

        @NotNull
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("FlingResult(distanceCoefficient=");
            sb2.append(this.f72061a);
            sb2.append(", velocityCoefficient=");
            return F3.G.a(sb2, this.f72062b, ')');
        }
    }

    static {
        float f7;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        float f16;
        float f17;
        float f18;
        float[] fArr = new float[101];
        f72059a = fArr;
        float[] fArr2 = new float[101];
        float f19 = 0.0f;
        int i11 = 0;
        float f21 = 0.0f;
        while (true) {
            float f22 = 1.0f;
            if (i11 >= 100) {
                fArr2[100] = 1.0f;
                fArr[100] = 1.0f;
                return;
            }
            float f23 = i11 / 100;
            float f24 = 1.0f;
            while (true) {
                f7 = ((f24 - f19) / 2.0f) + f19;
                f11 = f22 - f7;
                f12 = f7 * 3.0f * f11;
                f13 = f7 * f7 * f7;
                float f25 = (((f7 * 0.35000002f) + (f11 * 0.175f)) * f12) + f13;
                f14 = f22;
                if (Math.abs(f25 - f23) < 1.0E-5d) {
                    break;
                }
                if (f25 > f23) {
                    f24 = f7;
                } else {
                    f19 = f7;
                }
                f22 = f14;
            }
            float f26 = 0.5f;
            fArr[i11] = (((f11 * 0.5f) + f7) * f12) + f13;
            float f27 = f14;
            while (true) {
                f15 = ((f27 - f21) / 2.0f) + f21;
                f16 = f14 - f15;
                f17 = f15 * 3.0f * f16;
                f18 = f15 * f15 * f15;
                float f28 = (((f16 * f26) + f15) * f17) + f18;
                float f29 = f27;
                if (Math.abs(f28 - f23) >= 1.0E-5d) {
                    if (f28 > f23) {
                        f27 = f15;
                    } else {
                        f21 = f15;
                        f27 = f29;
                    }
                    f26 = 0.5f;
                }
            }
            fArr2[i11] = (((f15 * 0.35000002f) + (f16 * 0.175f)) * f17) + f18;
            i11++;
        }
    }

    public static double a(float f7, float f11) {
        return Math.log((Math.abs(f7) * 0.35f) / f11);
    }

    @NotNull
    public static C1193a b(float f7) {
        float f11 = 0.0f;
        float f12 = 1.0f;
        float d11 = kotlin.ranges.h.d(f7, 0.0f, 1.0f);
        float f13 = 100;
        int i11 = (int) (f13 * d11);
        if (i11 < 100) {
            float f14 = i11 / f13;
            int i12 = i11 + 1;
            float f15 = i12 / f13;
            float[] fArr = f72059a;
            float f16 = fArr[i11];
            float f17 = (fArr[i12] - f16) / (f15 - f14);
            float d12 = C3143a.d(d11, f14, f17, f16);
            f11 = f17;
            f12 = d12;
        }
        return new C1193a(f12, f11);
    }
}
