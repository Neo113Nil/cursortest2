package l1;

import android.graphics.Matrix;
import e1.AbstractC4134a;

/* loaded from: classes.dex */
public final class L0 implements InterfaceC5394z0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f55428a;

    /* renamed from: b, reason: collision with root package name */
    public final int f55429b;

    /* renamed from: c, reason: collision with root package name */
    public float f55430c;

    /* renamed from: d, reason: collision with root package name */
    public final int f55431d;

    /* renamed from: e, reason: collision with root package name */
    public final int f55432e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f55433f;

    /* renamed from: g, reason: collision with root package name */
    public float f55434g;

    /* renamed from: h, reason: collision with root package name */
    public float f55435h;

    /* renamed from: i, reason: collision with root package name */
    public Matrix f55436i;

    public L0(int i10, int i11, float f10, int i12, int i13, boolean z10) {
        AbstractC4134a.b(f10 == -1.0f || i10 == -1, "width and aspect ratio should not both be set");
        this.f55428a = i10;
        this.f55429b = i11;
        this.f55430c = f10;
        this.f55431d = i12;
        this.f55432e = i13;
        this.f55433f = z10;
        this.f55434g = -1.0f;
        this.f55435h = -1.0f;
        this.f55436i = new Matrix();
    }

    public static void i(int i10) {
        boolean z10 = true;
        if (i10 != 0 && i10 != 1 && i10 != 2) {
            z10 = false;
        }
        AbstractC4134a.b(z10, "invalid layout " + i10);
    }

    public static L0 j(int i10, int i11, int i12) {
        AbstractC4134a.b(i10 > 0, "width " + i10 + " must be positive");
        AbstractC4134a.b(i11 > 0, "height " + i11 + " must be positive");
        i(i12);
        return new L0(i10, i11, -1.0f, i12, 9729, false);
    }

    @Override // l1.InterfaceC5392y0
    public int c() {
        return this.f55432e;
    }

    @Override // l1.InterfaceC5392y0
    public e1.L d(int i10, int i11) {
        int i12;
        AbstractC4134a.b(i10 > 0, "inputWidth must be positive");
        AbstractC4134a.b(i11 > 0, "inputHeight must be positive");
        this.f55436i = new Matrix();
        this.f55434g = i10;
        this.f55435h = i11;
        int i13 = this.f55428a;
        if (i13 != -1 && (i12 = this.f55429b) != -1) {
            this.f55430c = i13 / i12;
        }
        if (this.f55430c != -1.0f) {
            h();
        }
        int i14 = this.f55429b;
        if (i14 != -1) {
            int i15 = this.f55428a;
            if (i15 != -1) {
                this.f55434g = i15;
                this.f55435h = i14;
            } else if (!this.f55433f || i11 <= i10) {
                this.f55434g = (i14 * this.f55434g) / this.f55435h;
                this.f55435h = i14;
            } else {
                this.f55435h = (i14 * this.f55435h) / this.f55434g;
                this.f55434g = i14;
            }
        }
        return new e1.L(Math.round(this.f55434g), Math.round(this.f55435h));
    }

    @Override // l1.InterfaceC5390x0
    public boolean f(int i10, int i11) {
        d(i10, i11);
        return ((Matrix) AbstractC4134a.i(this.f55436i)).isIdentity() && i10 == Math.round(this.f55434g) && i11 == Math.round(this.f55435h);
    }

    @Override // l1.InterfaceC5394z0
    public Matrix g(long j10) {
        return (Matrix) AbstractC4134a.j(this.f55436i, "configure must be called first");
    }

    public final void h() {
        float f10 = this.f55434g;
        float f11 = this.f55435h;
        float f12 = f10 / f11;
        int i10 = this.f55431d;
        if (i10 == 0) {
            float f13 = this.f55430c;
            if (f13 > f12) {
                this.f55436i.setScale(f12 / f13, 1.0f);
                this.f55434g = this.f55435h * this.f55430c;
                return;
            } else {
                this.f55436i.setScale(1.0f, f13 / f12);
                this.f55435h = this.f55434g / this.f55430c;
                return;
            }
        }
        if (i10 == 1) {
            float f14 = this.f55430c;
            if (f14 > f12) {
                this.f55436i.setScale(1.0f, f14 / f12);
                this.f55435h = this.f55434g / this.f55430c;
                return;
            } else {
                this.f55436i.setScale(f12 / f14, 1.0f);
                this.f55434g = this.f55435h * this.f55430c;
                return;
            }
        }
        if (i10 == 2) {
            float f15 = this.f55430c;
            if (f15 > f12) {
                this.f55434g = f11 * f15;
            } else {
                this.f55435h = f10 / f15;
            }
        }
    }
}
