package c1;

import e1.AbstractC4134a;

/* loaded from: classes.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public final int f26793a;

    /* renamed from: b, reason: collision with root package name */
    public final int f26794b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f26795c;
    private final float[] coefficients;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f26796d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f26797e;

    public t(int i10, int i11, float[] fArr) {
        boolean z10 = false;
        AbstractC4134a.b(i10 > 0, "Input channel count must be positive.");
        AbstractC4134a.b(i11 > 0, "Output channel count must be positive.");
        AbstractC4134a.b(fArr.length == i10 * i11, "Coefficient array length is invalid.");
        this.f26793a = i10;
        this.f26794b = i11;
        this.coefficients = a(fArr);
        int i12 = 0;
        boolean z11 = true;
        boolean z12 = true;
        boolean z13 = true;
        while (i12 < i10) {
            int i13 = 0;
            while (i13 < i11) {
                float i14 = i(i12, i13);
                boolean z14 = i12 == i13;
                if (i14 != 1.0f && z14) {
                    z13 = false;
                }
                if (i14 != 0.0f) {
                    z11 = false;
                    if (!z14) {
                        z12 = false;
                    }
                }
                i13++;
            }
            i12++;
        }
        this.f26795c = z11;
        boolean z15 = m() && z12;
        this.f26796d = z15;
        if (z15 && z13) {
            z10 = true;
        }
        this.f26797e = z10;
    }

    public static float[] a(float[] fArr) {
        for (int i10 = 0; i10 < fArr.length; i10++) {
            if (fArr[i10] < 0.0f) {
                throw new IllegalArgumentException("Coefficient at index " + i10 + " is negative.");
            }
        }
        return fArr;
    }

    public static float[] b(int i10, int i11) {
        if (i10 == i11) {
            return k(i11);
        }
        if (i10 == 1 && i11 == 2) {
            return new float[]{1.0f, 1.0f};
        }
        if (i10 == 2 && i11 == 1) {
            return new float[]{0.5f, 0.5f};
        }
        throw new UnsupportedOperationException("Default channel mixing coefficients for " + i10 + "->" + i11 + " are not yet implemented.");
    }

    public static float[] c(int i10, int i11) {
        if (i11 == 1) {
            return f(i10);
        }
        if (i11 == 2) {
            return g(i10);
        }
        if (i10 == i11) {
            return k(i11);
        }
        throw new UnsupportedOperationException("Default constant power channel mixing coefficients for " + i10 + "->" + i11 + " are not implemented.");
    }

    public static t d(int i10, int i11) {
        return new t(i10, i11, b(i10, i11));
    }

    public static t e(int i10, int i11) {
        return new t(i10, i11, c(i10, i11));
    }

    public static float[] f(int i10) {
        switch (i10) {
            case 1:
                return new float[]{1.0f};
            case 2:
                return new float[]{0.7071f, 0.7071f};
            case 3:
                return new float[]{0.7071f, 0.7071f, 1.0f};
            case 4:
                return new float[]{0.7071f, 0.7071f, 0.5f, 0.5f};
            case 5:
                return new float[]{0.7071f, 0.7071f, 1.0f, 0.5f, 0.5f};
            case 6:
                return new float[]{0.7071f, 0.7071f, 1.0f, 0.7071f, 0.5f, 0.5f};
            default:
                throw new UnsupportedOperationException("Default constant power channel mixing coefficients for " + i10 + "->1 are not implemented.");
        }
    }

    public static float[] g(int i10) {
        switch (i10) {
            case 1:
                return new float[]{0.7071f, 0.7071f};
            case 2:
                return new float[]{1.0f, 0.0f, 0.0f, 1.0f};
            case 3:
                return new float[]{1.0f, 0.0f, 0.7071f, 0.0f, 1.0f, 0.7071f};
            case 4:
                return new float[]{1.0f, 0.0f, 0.7071f, 0.0f, 0.0f, 1.0f, 0.0f, 0.7071f};
            case 5:
                return new float[]{1.0f, 0.0f, 0.7071f, 0.7071f, 0.0f, 0.0f, 1.0f, 0.7071f, 0.0f, 0.7071f};
            case 6:
                return new float[]{1.0f, 0.0f, 0.7071f, 0.5f, 0.7071f, 0.0f, 0.0f, 1.0f, 0.7071f, 0.5f, 0.0f, 0.7071f};
            default:
                throw new UnsupportedOperationException("Default constant power channel mixing coefficients for " + i10 + "->2 are not implemented.");
        }
    }

    public static float[] k(int i10) {
        float[] fArr = new float[i10 * i10];
        for (int i11 = 0; i11 < i10; i11++) {
            fArr[(i10 * i11) + i11] = 1.0f;
        }
        return fArr;
    }

    public int h() {
        return this.f26793a;
    }

    public float i(int i10, int i11) {
        return this.coefficients[(i10 * this.f26794b) + i11];
    }

    public int j() {
        return this.f26794b;
    }

    public boolean l() {
        return this.f26797e;
    }

    public boolean m() {
        return this.f26793a == this.f26794b;
    }

    public boolean n() {
        return this.f26795c;
    }
}
