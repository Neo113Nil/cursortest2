package androidx.media3.effect;

import android.graphics.Matrix;
import e1.AbstractC4134a;
import e1.L;
import l1.InterfaceC5394z0;

/* loaded from: classes.dex */
public final class n implements InterfaceC5394z0 {

    /* renamed from: a, reason: collision with root package name */
    public final float f20832a;

    /* renamed from: b, reason: collision with root package name */
    public final float f20833b;

    /* renamed from: c, reason: collision with root package name */
    public final float f20834c;

    /* renamed from: d, reason: collision with root package name */
    public final Matrix f20835d;

    /* renamed from: e, reason: collision with root package name */
    public Matrix f20836e;

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public float f20837a = 1.0f;

        /* renamed from: b, reason: collision with root package name */
        public float f20838b = 1.0f;

        /* renamed from: c, reason: collision with root package name */
        public float f20839c = 0.0f;

        public n a() {
            return new n(this.f20837a, this.f20838b, this.f20839c);
        }

        public b b(float f10) {
            float f11 = f10 % 360.0f;
            this.f20839c = f11;
            if (f11 < 0.0f) {
                this.f20839c = f11 + 360.0f;
            }
            return this;
        }
    }

    @Override // l1.InterfaceC5392y0
    public L d(int i10, int i11) {
        AbstractC4134a.b(i10 > 0, "inputWidth must be positive");
        AbstractC4134a.b(i11 > 0, "inputHeight must be positive");
        this.f20836e = new Matrix(this.f20835d);
        if (this.f20835d.isIdentity()) {
            return new L(i10, i11);
        }
        float f10 = i10;
        float f11 = i11;
        float f12 = f10 / f11;
        this.f20836e.preScale(f12, 1.0f);
        this.f20836e.postScale(1.0f / f12, 1.0f);
        float[][] fArr = {new float[]{-1.0f, -1.0f, 0.0f, 1.0f}, new float[]{-1.0f, 1.0f, 0.0f, 1.0f}, new float[]{1.0f, -1.0f, 0.0f, 1.0f}, new float[]{1.0f, 1.0f, 0.0f, 1.0f}};
        float f13 = Float.MIN_VALUE;
        float f14 = Float.MAX_VALUE;
        float f15 = Float.MAX_VALUE;
        float f16 = Float.MIN_VALUE;
        for (int i12 = 0; i12 < 4; i12++) {
            float[] fArr2 = fArr[i12];
            this.f20836e.mapPoints(fArr2);
            f14 = Math.min(f14, fArr2[0]);
            f13 = Math.max(f13, fArr2[0]);
            f15 = Math.min(f15, fArr2[1]);
            f16 = Math.max(f16, fArr2[1]);
        }
        float f17 = (f13 - f14) / 2.0f;
        float f18 = (f16 - f15) / 2.0f;
        this.f20836e.postScale(1.0f / f17, 1.0f / f18);
        return new L(Math.round(f10 * f17), Math.round(f11 * f18));
    }

    @Override // l1.InterfaceC5390x0
    public boolean f(int i10, int i11) {
        L d10 = d(i10, i11);
        return ((Matrix) AbstractC4134a.i(this.f20836e)).isIdentity() && i10 == d10.b() && i11 == d10.a();
    }

    @Override // l1.InterfaceC5394z0
    public Matrix g(long j10) {
        return (Matrix) AbstractC4134a.j(this.f20836e, "configure must be called first");
    }

    public n(float f10, float f11, float f12) {
        this.f20832a = f10;
        this.f20833b = f11;
        this.f20834c = f12;
        Matrix matrix = new Matrix();
        this.f20835d = matrix;
        matrix.postScale(f10, f11);
        matrix.postRotate(f12);
    }
}
