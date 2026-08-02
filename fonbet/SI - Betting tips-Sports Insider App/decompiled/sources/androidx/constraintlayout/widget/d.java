package androidx.constraintlayout.widget;

import android.view.ViewGroup;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class d extends ViewGroup.MarginLayoutParams {
    public int A;
    public int B;
    public int C;
    public int D;
    public float E;
    public float F;
    public String G;
    public float H;
    public float I;
    public int J;
    public int K;
    public int L;
    public int M;
    public int N;
    public int O;
    public int P;
    public int Q;
    public float R;
    public float S;
    public int T;
    public int U;
    public int V;
    public boolean W;
    public boolean X;
    public String Y;
    public int Z;

    /* renamed from: a, reason: collision with root package name */
    public int f1069a;

    /* renamed from: a0, reason: collision with root package name */
    public boolean f1070a0;

    /* renamed from: b, reason: collision with root package name */
    public int f1071b;

    /* renamed from: b0, reason: collision with root package name */
    public boolean f1072b0;

    /* renamed from: c, reason: collision with root package name */
    public float f1073c;

    /* renamed from: c0, reason: collision with root package name */
    public boolean f1074c0;

    /* renamed from: d, reason: collision with root package name */
    public boolean f1075d;

    /* renamed from: d0, reason: collision with root package name */
    public boolean f1076d0;

    /* renamed from: e, reason: collision with root package name */
    public int f1077e;
    public boolean e0;

    /* renamed from: f, reason: collision with root package name */
    public int f1078f;

    /* renamed from: f0, reason: collision with root package name */
    public int f1079f0;

    /* renamed from: g, reason: collision with root package name */
    public int f1080g;

    /* renamed from: g0, reason: collision with root package name */
    public int f1081g0;

    /* renamed from: h, reason: collision with root package name */
    public int f1082h;

    /* renamed from: h0, reason: collision with root package name */
    public int f1083h0;

    /* renamed from: i, reason: collision with root package name */
    public int f1084i;

    /* renamed from: i0, reason: collision with root package name */
    public int f1085i0;
    public int j;
    public int j0;

    /* renamed from: k, reason: collision with root package name */
    public int f1086k;
    public int k0;

    /* renamed from: l, reason: collision with root package name */
    public int f1087l;

    /* renamed from: l0, reason: collision with root package name */
    public float f1088l0;

    /* renamed from: m, reason: collision with root package name */
    public int f1089m;

    /* renamed from: m0, reason: collision with root package name */
    public int f1090m0;

    /* renamed from: n, reason: collision with root package name */
    public int f1091n;

    /* renamed from: n0, reason: collision with root package name */
    public int f1092n0;

    /* renamed from: o, reason: collision with root package name */
    public int f1093o;

    /* renamed from: o0, reason: collision with root package name */
    public float f1094o0;

    /* renamed from: p, reason: collision with root package name */
    public int f1095p;

    /* renamed from: p0, reason: collision with root package name */
    public x.d f1096p0;
    public int q;

    /* renamed from: r, reason: collision with root package name */
    public float f1097r;

    /* renamed from: s, reason: collision with root package name */
    public int f1098s;

    /* renamed from: t, reason: collision with root package name */
    public int f1099t;

    /* renamed from: u, reason: collision with root package name */
    public int f1100u;

    /* renamed from: v, reason: collision with root package name */
    public int f1101v;

    /* renamed from: w, reason: collision with root package name */
    public int f1102w;

    /* renamed from: x, reason: collision with root package name */
    public int f1103x;

    /* renamed from: y, reason: collision with root package name */
    public int f1104y;

    /* renamed from: z, reason: collision with root package name */
    public int f1105z;

    public final void a() {
        this.f1076d0 = false;
        this.f1070a0 = true;
        this.f1072b0 = true;
        int i5 = ((ViewGroup.MarginLayoutParams) this).width;
        if (i5 == -2 && this.W) {
            this.f1070a0 = false;
            if (this.L == 0) {
                this.L = 1;
            }
        }
        int i10 = ((ViewGroup.MarginLayoutParams) this).height;
        if (i10 == -2 && this.X) {
            this.f1072b0 = false;
            if (this.M == 0) {
                this.M = 1;
            }
        }
        if (i5 == 0 || i5 == -1) {
            this.f1070a0 = false;
            if (i5 == 0 && this.L == 1) {
                ((ViewGroup.MarginLayoutParams) this).width = -2;
                this.W = true;
            }
        }
        if (i10 == 0 || i10 == -1) {
            this.f1072b0 = false;
            if (i10 == 0 && this.M == 1) {
                ((ViewGroup.MarginLayoutParams) this).height = -2;
                this.X = true;
            }
        }
        if (this.f1073c == -1.0f && this.f1069a == -1 && this.f1071b == -1) {
            return;
        }
        this.f1076d0 = true;
        this.f1070a0 = true;
        this.f1072b0 = true;
        if (!(this.f1096p0 instanceof x.h)) {
            this.f1096p0 = new x.h();
        }
        ((x.h) this.f1096p0).S(this.V);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0082  */
    @Override // android.view.ViewGroup.MarginLayoutParams, android.view.ViewGroup.LayoutParams
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void resolveLayoutDirection(int i5) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14 = ((ViewGroup.MarginLayoutParams) this).leftMargin;
        int i15 = ((ViewGroup.MarginLayoutParams) this).rightMargin;
        super.resolveLayoutDirection(i5);
        boolean z5 = false;
        boolean z7 = 1 == getLayoutDirection();
        this.f1083h0 = -1;
        this.f1085i0 = -1;
        this.f1079f0 = -1;
        this.f1081g0 = -1;
        this.j0 = this.f1102w;
        this.k0 = this.f1104y;
        float f6 = this.E;
        this.f1088l0 = f6;
        int i16 = this.f1069a;
        this.f1090m0 = i16;
        int i17 = this.f1071b;
        this.f1092n0 = i17;
        float f10 = this.f1073c;
        this.f1094o0 = f10;
        if (z7) {
            int i18 = this.f1098s;
            if (i18 != -1) {
                this.f1083h0 = i18;
            } else {
                int i19 = this.f1099t;
                if (i19 != -1) {
                    this.f1085i0 = i19;
                }
                i10 = this.f1100u;
                if (i10 != -1) {
                    this.f1081g0 = i10;
                    z5 = true;
                }
                i11 = this.f1101v;
                if (i11 != -1) {
                    this.f1079f0 = i11;
                    z5 = true;
                }
                i12 = this.A;
                if (i12 != Integer.MIN_VALUE) {
                    this.k0 = i12;
                }
                i13 = this.B;
                if (i13 != Integer.MIN_VALUE) {
                    this.j0 = i13;
                }
                if (z5) {
                    this.f1088l0 = 1.0f - f6;
                }
                if (this.f1076d0 && this.V == 1 && this.f1075d) {
                    if (f10 == -1.0f) {
                        this.f1094o0 = 1.0f - f10;
                        this.f1090m0 = -1;
                        this.f1092n0 = -1;
                    } else if (i16 != -1) {
                        this.f1092n0 = i16;
                        this.f1090m0 = -1;
                        this.f1094o0 = -1.0f;
                    } else if (i17 != -1) {
                        this.f1090m0 = i17;
                        this.f1092n0 = -1;
                        this.f1094o0 = -1.0f;
                    }
                }
            }
            z5 = true;
            i10 = this.f1100u;
            if (i10 != -1) {
            }
            i11 = this.f1101v;
            if (i11 != -1) {
            }
            i12 = this.A;
            if (i12 != Integer.MIN_VALUE) {
            }
            i13 = this.B;
            if (i13 != Integer.MIN_VALUE) {
            }
            if (z5) {
            }
            if (this.f1076d0) {
                if (f10 == -1.0f) {
                }
            }
        } else {
            int i20 = this.f1098s;
            if (i20 != -1) {
                this.f1081g0 = i20;
            }
            int i21 = this.f1099t;
            if (i21 != -1) {
                this.f1079f0 = i21;
            }
            int i22 = this.f1100u;
            if (i22 != -1) {
                this.f1083h0 = i22;
            }
            int i23 = this.f1101v;
            if (i23 != -1) {
                this.f1085i0 = i23;
            }
            int i24 = this.A;
            if (i24 != Integer.MIN_VALUE) {
                this.j0 = i24;
            }
            int i25 = this.B;
            if (i25 != Integer.MIN_VALUE) {
                this.k0 = i25;
            }
        }
        if (this.f1100u == -1 && this.f1101v == -1 && this.f1099t == -1 && this.f1098s == -1) {
            int i26 = this.f1080g;
            if (i26 != -1) {
                this.f1083h0 = i26;
                if (((ViewGroup.MarginLayoutParams) this).rightMargin <= 0 && i15 > 0) {
                    ((ViewGroup.MarginLayoutParams) this).rightMargin = i15;
                }
            } else {
                int i27 = this.f1082h;
                if (i27 != -1) {
                    this.f1085i0 = i27;
                    if (((ViewGroup.MarginLayoutParams) this).rightMargin <= 0 && i15 > 0) {
                        ((ViewGroup.MarginLayoutParams) this).rightMargin = i15;
                    }
                }
            }
            int i28 = this.f1077e;
            if (i28 != -1) {
                this.f1079f0 = i28;
                if (((ViewGroup.MarginLayoutParams) this).leftMargin > 0 || i14 <= 0) {
                    return;
                }
                ((ViewGroup.MarginLayoutParams) this).leftMargin = i14;
                return;
            }
            int i29 = this.f1078f;
            if (i29 != -1) {
                this.f1081g0 = i29;
                if (((ViewGroup.MarginLayoutParams) this).leftMargin > 0 || i14 <= 0) {
                    return;
                }
                ((ViewGroup.MarginLayoutParams) this).leftMargin = i14;
            }
        }
    }
}
