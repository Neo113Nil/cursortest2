package m2;

import f2.C6402b;
import f2.C6404d;
import java.util.ArrayList;
import java.util.HashMap;
import m2.d;
import m2.e;

/* loaded from: classes.dex */
public final class h extends e {

    /* renamed from: A0, reason: collision with root package name */
    private boolean f74232A0;

    /* renamed from: v0, reason: collision with root package name */
    protected float f74233v0 = -1.0f;

    /* renamed from: w0, reason: collision with root package name */
    protected int f74234w0 = -1;

    /* renamed from: x0, reason: collision with root package name */
    protected int f74235x0 = -1;

    /* renamed from: y0, reason: collision with root package name */
    private d f74236y0 = this.f74105L;

    /* renamed from: z0, reason: collision with root package name */
    private int f74237z0 = 0;

    /* loaded from: classes8.dex */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f74238a;

        static {
            int[] iArr = new int[d.a.values().length];
            f74238a = iArr;
            try {
                iArr[d.a.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f74238a[d.a.RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f74238a[d.a.TOP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f74238a[d.a.BOTTOM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f74238a[d.a.BASELINE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f74238a[d.a.CENTER.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f74238a[d.a.CENTER_X.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f74238a[d.a.CENTER_Y.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f74238a[d.a.NONE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    public h() {
        this.f74113T.clear();
        this.f74113T.add(this.f74236y0);
        int length = this.f74112S.length;
        for (int i11 = 0; i11 < length; i11++) {
            this.f74112S[i11] = this.f74236y0;
        }
    }

    @Override // m2.e
    public final void Y0(C6404d c6404d, boolean z11) {
        if (this.f74116W == null) {
            return;
        }
        d dVar = this.f74236y0;
        c6404d.getClass();
        int o11 = C6404d.o(dVar);
        if (this.f74237z0 == 1) {
            this.f74123b0 = o11;
            this.f74125c0 = 0;
            z0(this.f74116W.v());
            T0(0);
            return;
        }
        this.f74123b0 = 0;
        this.f74125c0 = o11;
        T0(this.f74116W.N());
        z0(0);
    }

    public final d Z0() {
        return this.f74236y0;
    }

    public final int a1() {
        return this.f74237z0;
    }

    public final int b1() {
        return this.f74234w0;
    }

    public final int c1() {
        return this.f74235x0;
    }

    @Override // m2.e
    public final boolean d0() {
        return this.f74232A0;
    }

    public final float d1() {
        return this.f74233v0;
    }

    @Override // m2.e
    public final boolean e0() {
        return this.f74232A0;
    }

    public final void e1(int i11) {
        this.f74236y0.q(i11);
        this.f74232A0 = true;
    }

    @Override // m2.e
    public final void f(C6404d c6404d, boolean z11) {
        f fVar = (f) this.f74116W;
        if (fVar == null) {
            return;
        }
        d n11 = fVar.n(d.a.LEFT);
        d n12 = fVar.n(d.a.RIGHT);
        e eVar = this.f74116W;
        boolean z12 = eVar != null && eVar.f74115V[0] == e.b.WRAP_CONTENT;
        if (this.f74237z0 == 0) {
            n11 = fVar.n(d.a.TOP);
            n12 = fVar.n(d.a.BOTTOM);
            e eVar2 = this.f74116W;
            z12 = eVar2 != null && eVar2.f74115V[1] == e.b.WRAP_CONTENT;
        }
        if (this.f74232A0 && this.f74236y0.k()) {
            f2.h k11 = c6404d.k(this.f74236y0);
            c6404d.d(k11, this.f74236y0.e());
            if (this.f74234w0 != -1) {
                if (z12) {
                    c6404d.f(c6404d.k(n12), k11, 0, 5);
                }
            } else if (this.f74235x0 != -1 && z12) {
                f2.h k12 = c6404d.k(n12);
                c6404d.f(k11, c6404d.k(n11), 0, 5);
                c6404d.f(k12, k11, 0, 5);
            }
            this.f74232A0 = false;
            return;
        }
        if (this.f74234w0 != -1) {
            f2.h k13 = c6404d.k(this.f74236y0);
            c6404d.e(k13, c6404d.k(n11), this.f74234w0, 8);
            if (z12) {
                c6404d.f(c6404d.k(n12), k13, 0, 5);
                return;
            }
            return;
        }
        if (this.f74235x0 != -1) {
            f2.h k14 = c6404d.k(this.f74236y0);
            f2.h k15 = c6404d.k(n12);
            c6404d.e(k14, k15, -this.f74235x0, 8);
            if (z12) {
                c6404d.f(k14, c6404d.k(n11), 0, 5);
                c6404d.f(k15, k14, 0, 5);
                return;
            }
            return;
        }
        if (this.f74233v0 != -1.0f) {
            f2.h k16 = c6404d.k(this.f74236y0);
            f2.h k17 = c6404d.k(n12);
            float f7 = this.f74233v0;
            C6402b l11 = c6404d.l();
            l11.f62448d.a(k16, -1.0f);
            l11.f62448d.a(k17, f7);
            c6404d.c(l11);
        }
    }

    public final void f1(int i11) {
        if (i11 > -1) {
            this.f74233v0 = -1.0f;
            this.f74234w0 = i11;
            this.f74235x0 = -1;
        }
    }

    @Override // m2.e
    public final boolean g() {
        return true;
    }

    public final void g1(int i11) {
        if (i11 > -1) {
            this.f74233v0 = -1.0f;
            this.f74234w0 = -1;
            this.f74235x0 = i11;
        }
    }

    public final void h1(float f7) {
        if (f7 > -1.0f) {
            this.f74233v0 = f7;
            this.f74234w0 = -1;
            this.f74235x0 = -1;
        }
    }

    public final void i1(int i11) {
        if (this.f74237z0 == i11) {
            return;
        }
        this.f74237z0 = i11;
        ArrayList<d> arrayList = this.f74113T;
        arrayList.clear();
        if (this.f74237z0 == 1) {
            this.f74236y0 = this.f74104K;
        } else {
            this.f74236y0 = this.f74105L;
        }
        arrayList.add(this.f74236y0);
        d[] dVarArr = this.f74112S;
        int length = dVarArr.length;
        for (int i12 = 0; i12 < length; i12++) {
            dVarArr[i12] = this.f74236y0;
        }
    }

    @Override // m2.e
    public final void k(e eVar, HashMap<e, e> hashMap) {
        super.k(eVar, hashMap);
        h hVar = (h) eVar;
        this.f74233v0 = hVar.f74233v0;
        this.f74234w0 = hVar.f74234w0;
        this.f74235x0 = hVar.f74235x0;
        i1(hVar.f74237z0);
    }

    @Override // m2.e
    public final d n(d.a aVar) {
        int i11 = a.f74238a[aVar.ordinal()];
        if (i11 == 1 || i11 == 2) {
            if (this.f74237z0 == 1) {
                return this.f74236y0;
            }
            return null;
        }
        if ((i11 == 3 || i11 == 4) && this.f74237z0 == 0) {
            return this.f74236y0;
        }
        return null;
    }
}
