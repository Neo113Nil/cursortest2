package G1;

import e1.AbstractC4134a;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final a f3792a;

    /* renamed from: b, reason: collision with root package name */
    public final a f3793b;

    /* renamed from: c, reason: collision with root package name */
    public final int f3794c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f3795d;

    public static final class a {
        private final b[] subMeshes;

        public a(b... bVarArr) {
            this.subMeshes = bVarArr;
        }

        public b a(int i10) {
            return this.subMeshes[i10];
        }

        public int b() {
            return this.subMeshes.length;
        }
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final int f3796a;

        /* renamed from: b, reason: collision with root package name */
        public final int f3797b;
        public final float[] textureCoords;
        public final float[] vertices;

        public b(int i10, float[] fArr, float[] fArr2, int i11) {
            this.f3796a = i10;
            AbstractC4134a.a(((long) fArr.length) * 2 == ((long) fArr2.length) * 3);
            this.vertices = fArr;
            this.textureCoords = fArr2;
            this.f3797b = i11;
        }

        public int a() {
            return this.vertices.length / 3;
        }
    }

    public e(a aVar, int i10) {
        this(aVar, aVar, i10);
    }

    public static e a(float f10, int i10, int i11, float f11, float f12, int i12) {
        int i13;
        int i14 = i10;
        AbstractC4134a.a(f10 > 0.0f);
        AbstractC4134a.a(i14 >= 1);
        AbstractC4134a.a(i11 >= 1);
        AbstractC4134a.a(f11 > 0.0f && f11 <= 180.0f);
        AbstractC4134a.a(f12 > 0.0f && f12 <= 360.0f);
        float radians = (float) Math.toRadians(f11);
        float radians2 = (float) Math.toRadians(f12);
        float f13 = radians / i14;
        float f14 = radians2 / i11;
        int i15 = i11 + 1;
        int i16 = ((i15 * 2) + 2) * i14;
        float[] fArr = new float[i16 * 3];
        float[] fArr2 = new float[i16 * 2];
        int i17 = 0;
        int i18 = 0;
        int i19 = 0;
        while (i17 < i14) {
            float f15 = radians / 2.0f;
            float f16 = (i17 * f13) - f15;
            int i20 = i17 + 1;
            float f17 = (i20 * f13) - f15;
            int i21 = 0;
            while (i21 < i15) {
                float f18 = radians;
                float f19 = radians2;
                int i22 = 0;
                int i23 = 2;
                while (i22 < i23) {
                    float f20 = f13;
                    float f21 = i21 * f14;
                    float f22 = f14;
                    float f23 = f16;
                    double d10 = f10;
                    double d11 = (f21 + 3.1415927f) - (f19 / 2.0f);
                    double d12 = i22 == 0 ? f16 : f17;
                    fArr[i18] = -((float) (Math.cos(d12) * Math.sin(d11) * d10));
                    fArr[i18 + 1] = (float) (d10 * Math.sin(d12));
                    int i24 = i18 + 3;
                    fArr[i18 + 2] = (float) (d10 * Math.cos(d11) * Math.cos(d12));
                    fArr2[i19] = f21 / f19;
                    int i25 = i19 + 2;
                    fArr2[i19 + 1] = ((i17 + i22) * f20) / f18;
                    if ((i21 == 0 && i22 == 0) || (i21 == i11 && i22 == 1)) {
                        System.arraycopy(fArr, i18, fArr, i24, 3);
                        i18 += 6;
                        i13 = 2;
                        System.arraycopy(fArr2, i19, fArr2, i25, 2);
                        i19 += 4;
                    } else {
                        i13 = 2;
                        i18 = i24;
                        i19 = i25;
                    }
                    i22++;
                    i23 = i13;
                    f13 = f20;
                    f14 = f22;
                    f16 = f23;
                }
                i21++;
                radians2 = f19;
                radians = f18;
                f13 = f13;
            }
            i14 = i10;
            i17 = i20;
        }
        return new e(new a(new b(0, fArr, fArr2, 1)), i12);
    }

    public static e b(int i10) {
        return a(50.0f, 36, 72, 180.0f, 360.0f, i10);
    }

    public e(a aVar, a aVar2, int i10) {
        this.f3792a = aVar;
        this.f3793b = aVar2;
        this.f3794c = i10;
        this.f3795d = aVar == aVar2;
    }
}
