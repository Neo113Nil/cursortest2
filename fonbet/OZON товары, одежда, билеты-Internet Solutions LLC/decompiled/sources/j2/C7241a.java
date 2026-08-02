package j2;

import B1.U;
import j2.f;
import java.util.HashMap;
import m2.d;

/* renamed from: j2.a, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public class C7241a implements e {

    /* renamed from: a, reason: collision with root package name */
    private Object f68828a;

    /* renamed from: b, reason: collision with root package name */
    final f f68830b;

    /* renamed from: b0, reason: collision with root package name */
    private float f68831b0;

    /* renamed from: c0, reason: collision with root package name */
    private float f68833c0;

    /* renamed from: g0, reason: collision with root package name */
    private U f68841g0;

    /* renamed from: h0, reason: collision with root package name */
    private m2.e f68843h0;

    /* renamed from: c, reason: collision with root package name */
    Object f68832c = null;

    /* renamed from: d, reason: collision with root package name */
    int f68834d = 0;

    /* renamed from: e, reason: collision with root package name */
    int f68836e = 0;

    /* renamed from: f, reason: collision with root package name */
    float f68838f = -1.0f;

    /* renamed from: g, reason: collision with root package name */
    float f68840g = -1.0f;

    /* renamed from: h, reason: collision with root package name */
    protected float f68842h = 0.5f;

    /* renamed from: i, reason: collision with root package name */
    protected float f68844i = 0.5f;

    /* renamed from: j, reason: collision with root package name */
    protected int f68846j = 0;

    /* renamed from: k, reason: collision with root package name */
    protected int f68848k = 0;

    /* renamed from: l, reason: collision with root package name */
    protected int f68849l = 0;

    /* renamed from: m, reason: collision with root package name */
    protected int f68850m = 0;

    /* renamed from: n, reason: collision with root package name */
    protected int f68851n = 0;

    /* renamed from: o, reason: collision with root package name */
    protected int f68852o = 0;

    /* renamed from: p, reason: collision with root package name */
    protected int f68853p = 0;

    /* renamed from: q, reason: collision with root package name */
    protected int f68854q = 0;

    /* renamed from: r, reason: collision with root package name */
    protected int f68855r = 0;

    /* renamed from: s, reason: collision with root package name */
    protected int f68856s = 0;

    /* renamed from: t, reason: collision with root package name */
    protected int f68857t = 0;

    /* renamed from: u, reason: collision with root package name */
    protected int f68858u = 0;

    /* renamed from: v, reason: collision with root package name */
    int f68859v = 0;

    /* renamed from: w, reason: collision with root package name */
    int f68860w = 0;

    /* renamed from: x, reason: collision with root package name */
    float f68861x = Float.NaN;

    /* renamed from: y, reason: collision with root package name */
    float f68862y = Float.NaN;

    /* renamed from: z, reason: collision with root package name */
    float f68863z = Float.NaN;

    /* renamed from: A, reason: collision with root package name */
    float f68802A = Float.NaN;

    /* renamed from: B, reason: collision with root package name */
    float f68803B = Float.NaN;

    /* renamed from: C, reason: collision with root package name */
    float f68804C = Float.NaN;

    /* renamed from: D, reason: collision with root package name */
    float f68805D = Float.NaN;

    /* renamed from: E, reason: collision with root package name */
    float f68806E = Float.NaN;

    /* renamed from: F, reason: collision with root package name */
    float f68807F = Float.NaN;

    /* renamed from: G, reason: collision with root package name */
    float f68808G = Float.NaN;

    /* renamed from: H, reason: collision with root package name */
    float f68809H = Float.NaN;

    /* renamed from: I, reason: collision with root package name */
    int f68810I = 0;

    /* renamed from: J, reason: collision with root package name */
    protected Object f68811J = null;

    /* renamed from: K, reason: collision with root package name */
    protected Object f68812K = null;

    /* renamed from: L, reason: collision with root package name */
    protected Object f68813L = null;

    /* renamed from: M, reason: collision with root package name */
    protected Object f68814M = null;

    /* renamed from: N, reason: collision with root package name */
    protected Object f68815N = null;

    /* renamed from: O, reason: collision with root package name */
    protected Object f68816O = null;

    /* renamed from: P, reason: collision with root package name */
    protected Object f68817P = null;

    /* renamed from: Q, reason: collision with root package name */
    protected Object f68818Q = null;

    /* renamed from: R, reason: collision with root package name */
    protected Object f68819R = null;

    /* renamed from: S, reason: collision with root package name */
    protected Object f68820S = null;

    /* renamed from: T, reason: collision with root package name */
    C7241a f68821T = null;

    /* renamed from: U, reason: collision with root package name */
    protected Object f68822U = null;

    /* renamed from: V, reason: collision with root package name */
    protected Object f68823V = null;

    /* renamed from: W, reason: collision with root package name */
    C7241a f68824W = null;

    /* renamed from: X, reason: collision with root package name */
    Object f68825X = null;

    /* renamed from: Y, reason: collision with root package name */
    Object f68826Y = null;

    /* renamed from: Z, reason: collision with root package name */
    Object f68827Z = null;

    /* renamed from: a0, reason: collision with root package name */
    Object f68829a0 = null;

    /* renamed from: d0, reason: collision with root package name */
    f.b f68835d0 = null;

    /* renamed from: e0, reason: collision with root package name */
    c f68837e0 = c.b();

    /* renamed from: f0, reason: collision with root package name */
    c f68839f0 = c.b();

    /* renamed from: i0, reason: collision with root package name */
    private HashMap<String, Integer> f68845i0 = new HashMap<>();

    /* renamed from: j0, reason: collision with root package name */
    private HashMap<String, Float> f68847j0 = new HashMap<>();

    /* renamed from: j2.a$a, reason: collision with other inner class name */
    static /* synthetic */ class C1126a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f68864a;

        static {
            int[] iArr = new int[f.b.values().length];
            f68864a = iArr;
            try {
                iArr[f.b.LEFT_TO_LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f68864a[f.b.LEFT_TO_RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f68864a[f.b.RIGHT_TO_LEFT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f68864a[f.b.RIGHT_TO_RIGHT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f68864a[f.b.START_TO_START.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f68864a[f.b.START_TO_END.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f68864a[f.b.END_TO_START.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f68864a[f.b.END_TO_END.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f68864a[f.b.TOP_TO_TOP.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f68864a[f.b.TOP_TO_BOTTOM.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f68864a[f.b.TOP_TO_BASELINE.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f68864a[f.b.BOTTOM_TO_TOP.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f68864a[f.b.BOTTOM_TO_BOTTOM.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f68864a[f.b.BOTTOM_TO_BASELINE.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f68864a[f.b.BASELINE_TO_BOTTOM.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f68864a[f.b.BASELINE_TO_TOP.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f68864a[f.b.BASELINE_TO_BASELINE.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f68864a[f.b.CIRCULAR_CONSTRAINT.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                f68864a[f.b.CENTER_HORIZONTALLY.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f68864a[f.b.CENTER_VERTICALLY.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
        }
    }

    public C7241a(f fVar) {
        this.f68830b = fVar;
    }

    private void f(m2.e eVar, Object obj, f.b bVar) {
        m2.e b11 = obj instanceof e ? ((e) obj).b() : null;
        if (b11 == null) {
            return;
        }
        int[] iArr = C1126a.f68864a;
        int i11 = iArr[bVar.ordinal()];
        switch (iArr[bVar.ordinal()]) {
            case 1:
                d.a aVar = d.a.LEFT;
                eVar.n(aVar).b(b11.n(aVar), this.f68846j, this.f68853p, false);
                break;
            case 2:
                eVar.n(d.a.LEFT).b(b11.n(d.a.RIGHT), this.f68846j, this.f68853p, false);
                break;
            case 3:
                eVar.n(d.a.RIGHT).b(b11.n(d.a.LEFT), this.f68848k, this.f68854q, false);
                break;
            case 4:
                d.a aVar2 = d.a.RIGHT;
                eVar.n(aVar2).b(b11.n(aVar2), this.f68848k, this.f68854q, false);
                break;
            case 5:
                d.a aVar3 = d.a.LEFT;
                eVar.n(aVar3).b(b11.n(aVar3), this.f68849l, this.f68855r, false);
                break;
            case 6:
                eVar.n(d.a.LEFT).b(b11.n(d.a.RIGHT), this.f68849l, this.f68855r, false);
                break;
            case 7:
                eVar.n(d.a.RIGHT).b(b11.n(d.a.LEFT), this.f68850m, this.f68856s, false);
                break;
            case 8:
                d.a aVar4 = d.a.RIGHT;
                eVar.n(aVar4).b(b11.n(aVar4), this.f68850m, this.f68856s, false);
                break;
            case 9:
                d.a aVar5 = d.a.TOP;
                eVar.n(aVar5).b(b11.n(aVar5), this.f68851n, this.f68857t, false);
                break;
            case 10:
                eVar.n(d.a.TOP).b(b11.n(d.a.BOTTOM), this.f68851n, this.f68857t, false);
                break;
            case 11:
                eVar.U(d.a.TOP, b11, d.a.BASELINE, this.f68851n, this.f68857t);
                break;
            case 12:
                eVar.n(d.a.BOTTOM).b(b11.n(d.a.TOP), this.f68852o, this.f68858u, false);
                break;
            case 13:
                d.a aVar6 = d.a.BOTTOM;
                eVar.n(aVar6).b(b11.n(aVar6), this.f68852o, this.f68858u, false);
                break;
            case 14:
                eVar.U(d.a.BOTTOM, b11, d.a.BASELINE, this.f68852o, this.f68858u);
                break;
            case 15:
                eVar.U(d.a.BASELINE, b11, d.a.BOTTOM, this.f68859v, this.f68860w);
                break;
            case 16:
                eVar.U(d.a.BASELINE, b11, d.a.TOP, this.f68859v, this.f68860w);
                break;
            case 17:
                d.a aVar7 = d.a.BASELINE;
                eVar.U(aVar7, b11, aVar7, this.f68859v, this.f68860w);
                break;
            case 18:
                float f7 = this.f68831b0;
                int i12 = (int) this.f68833c0;
                d.a aVar8 = d.a.CENTER;
                eVar.U(aVar8, b11, aVar8, i12, 0);
                eVar.f74098E = f7;
                break;
        }
    }

    private Object o(Object obj) {
        if (obj == null) {
            return null;
        }
        return !(obj instanceof C7241a) ? this.f68830b.f68893c.get(obj) : obj;
    }

    public final void A(float f7) {
        this.f68840g = f7;
    }

    public final void B(U u11) {
        this.f68841g0 = u11;
        m2.e eVar = this.f68843h0;
        if (eVar != null) {
            eVar.q0(u11);
        }
    }

    public final void C(Object obj) {
        this.f68835d0 = f.b.START_TO_END;
        this.f68816O = obj;
    }

    public final void D(Object obj) {
        this.f68835d0 = f.b.START_TO_START;
        this.f68815N = obj;
    }

    public final void E(Object obj) {
        this.f68835d0 = f.b.TOP_TO_BOTTOM;
        this.f68820S = obj;
    }

    public final void F(Object obj) {
        this.f68835d0 = f.b.TOP_TO_TOP;
        this.f68819R = obj;
    }

    public final void G(float f7) {
        this.f68844i = f7;
    }

    @Override // j2.e
    public final void a(m2.e eVar) {
        if (eVar == null) {
            return;
        }
        this.f68843h0 = eVar;
        eVar.q0(this.f68841g0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, k2.e] */
    @Override // j2.e
    public void apply() {
        if (this.f68843h0 == null) {
            return;
        }
        ?? r02 = this.f68832c;
        if (r02 != 0) {
            r02.apply();
        }
        this.f68837e0.a(this.f68843h0, 0);
        this.f68839f0.a(this.f68843h0, 1);
        this.f68811J = o(this.f68811J);
        this.f68812K = o(this.f68812K);
        this.f68813L = o(this.f68813L);
        this.f68814M = o(this.f68814M);
        this.f68815N = o(this.f68815N);
        this.f68816O = o(this.f68816O);
        this.f68817P = o(this.f68817P);
        this.f68818Q = o(this.f68818Q);
        this.f68819R = o(this.f68819R);
        this.f68820S = o(this.f68820S);
        this.f68822U = o(this.f68822U);
        this.f68823V = o(this.f68823V);
        this.f68825X = o(this.f68825X);
        this.f68826Y = o(this.f68826Y);
        this.f68827Z = o(this.f68827Z);
        f(this.f68843h0, this.f68811J, f.b.LEFT_TO_LEFT);
        f(this.f68843h0, this.f68812K, f.b.LEFT_TO_RIGHT);
        f(this.f68843h0, this.f68813L, f.b.RIGHT_TO_LEFT);
        f(this.f68843h0, this.f68814M, f.b.RIGHT_TO_RIGHT);
        f(this.f68843h0, this.f68815N, f.b.START_TO_START);
        f(this.f68843h0, this.f68816O, f.b.START_TO_END);
        f(this.f68843h0, this.f68817P, f.b.END_TO_START);
        f(this.f68843h0, this.f68818Q, f.b.END_TO_END);
        f(this.f68843h0, this.f68819R, f.b.TOP_TO_TOP);
        f(this.f68843h0, this.f68820S, f.b.TOP_TO_BOTTOM);
        f(this.f68843h0, this.f68821T, f.b.TOP_TO_BASELINE);
        f(this.f68843h0, this.f68822U, f.b.BOTTOM_TO_TOP);
        f(this.f68843h0, this.f68823V, f.b.BOTTOM_TO_BOTTOM);
        f(this.f68843h0, this.f68824W, f.b.BOTTOM_TO_BASELINE);
        f(this.f68843h0, this.f68825X, f.b.BASELINE_TO_BASELINE);
        f(this.f68843h0, this.f68826Y, f.b.BASELINE_TO_TOP);
        f(this.f68843h0, this.f68827Z, f.b.BASELINE_TO_BOTTOM);
        f(this.f68843h0, this.f68829a0, f.b.CIRCULAR_CONSTRAINT);
        int i11 = this.f68834d;
        if (i11 != 0) {
            this.f68843h0.B0(i11);
        }
        int i12 = this.f68836e;
        if (i12 != 0) {
            this.f68843h0.P0(i12);
        }
        float f7 = this.f68838f;
        if (f7 != -1.0f) {
            this.f68843h0.f74149o0[0] = f7;
        }
        float f11 = this.f68840g;
        if (f11 != -1.0f) {
            this.f68843h0.f74149o0[1] = f11;
        }
        this.f68843h0.A0(this.f68842h);
        this.f68843h0.O0(this.f68844i);
        m2.e eVar = this.f68843h0;
        g gVar = eVar.f74138j;
        gVar.f68906f = this.f68861x;
        gVar.f68907g = this.f68862y;
        gVar.f68908h = this.f68863z;
        gVar.f68909i = this.f68802A;
        gVar.f68910j = this.f68803B;
        gVar.f68911k = this.f68804C;
        gVar.f68912l = this.f68805D;
        gVar.f68913m = this.f68806E;
        gVar.f68914n = this.f68808G;
        gVar.f68915o = this.f68809H;
        gVar.f68916p = this.f68807F;
        int i13 = this.f68810I;
        gVar.f68917q = i13;
        eVar.S0(i13);
        this.f68843h0.f74138j.getClass();
        HashMap<String, Integer> hashMap = this.f68845i0;
        if (hashMap != null) {
            for (String str : hashMap.keySet()) {
                this.f68843h0.f74138j.d(hashMap.get(str).intValue(), str);
            }
        }
        HashMap<String, Float> hashMap2 = this.f68847j0;
        if (hashMap2 != null) {
            for (String str2 : hashMap2.keySet()) {
                this.f68843h0.f74138j.e(str2, this.f68847j0.get(str2).floatValue());
            }
        }
    }

    @Override // j2.e
    public m2.e b() {
        if (this.f68843h0 == null) {
            m2.e eVar = new m2.e(this.f68837e0.f68884d, this.f68839f0.f68884d);
            this.f68843h0 = eVar;
            eVar.q0(this.f68841g0);
        }
        return this.f68843h0;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, k2.e] */
    @Override // j2.e
    public final k2.e c() {
        return this.f68832c;
    }

    public final void d(int i11, String str) {
        this.f68845i0.put(str, Integer.valueOf(i11));
    }

    public final void e(String str, float f7) {
        if (this.f68847j0 == null) {
            this.f68847j0 = new HashMap<>();
        }
        this.f68847j0.put(str, Float.valueOf(f7));
    }

    public final void g(Object obj) {
        this.f68835d0 = f.b.BOTTOM_TO_BOTTOM;
        this.f68823V = obj;
    }

    @Override // j2.e
    public final Object getKey() {
        return this.f68828a;
    }

    public final void h(Object obj) {
        this.f68835d0 = f.b.BOTTOM_TO_TOP;
        this.f68822U = obj;
    }

    public final void i(C7241a c7241a, float f7, float f11) {
        this.f68829a0 = o(c7241a);
        this.f68831b0 = f7;
        this.f68833c0 = f11;
        this.f68835d0 = f.b.CIRCULAR_CONSTRAINT;
    }

    public final void j() {
        f.b bVar = this.f68835d0;
        if (bVar == null) {
            this.f68811J = null;
            this.f68812K = null;
            this.f68846j = 0;
            this.f68813L = null;
            this.f68814M = null;
            this.f68848k = 0;
            this.f68815N = null;
            this.f68816O = null;
            this.f68849l = 0;
            this.f68817P = null;
            this.f68818Q = null;
            this.f68850m = 0;
            this.f68819R = null;
            this.f68820S = null;
            this.f68851n = 0;
            this.f68822U = null;
            this.f68823V = null;
            this.f68852o = 0;
            this.f68825X = null;
            this.f68829a0 = null;
            this.f68842h = 0.5f;
            this.f68844i = 0.5f;
            this.f68853p = 0;
            this.f68854q = 0;
            this.f68855r = 0;
            this.f68856s = 0;
            this.f68857t = 0;
            this.f68858u = 0;
            return;
        }
        switch (C1126a.f68864a[bVar.ordinal()]) {
            case 1:
            case 2:
                this.f68811J = null;
                this.f68812K = null;
                this.f68846j = 0;
                this.f68853p = 0;
                break;
            case 3:
            case 4:
                this.f68813L = null;
                this.f68814M = null;
                this.f68848k = 0;
                this.f68854q = 0;
                break;
            case 5:
            case 6:
                this.f68815N = null;
                this.f68816O = null;
                this.f68849l = 0;
                this.f68855r = 0;
                break;
            case 7:
            case 8:
                this.f68817P = null;
                this.f68818Q = null;
                this.f68850m = 0;
                this.f68856s = 0;
                break;
            case 9:
            case 10:
            case 11:
                this.f68819R = null;
                this.f68820S = null;
                this.f68821T = null;
                this.f68851n = 0;
                this.f68857t = 0;
                break;
            case 12:
            case 13:
            case 14:
                this.f68822U = null;
                this.f68823V = null;
                this.f68824W = null;
                this.f68852o = 0;
                this.f68858u = 0;
                break;
            case 17:
                this.f68825X = null;
                break;
            case 18:
                this.f68829a0 = null;
                break;
        }
    }

    public final void k() {
        if (this.f68815N != null) {
            this.f68835d0 = f.b.START_TO_START;
        } else {
            this.f68835d0 = f.b.START_TO_END;
        }
        j();
        if (this.f68817P != null) {
            this.f68835d0 = f.b.END_TO_START;
        } else {
            this.f68835d0 = f.b.END_TO_END;
        }
        j();
        if (this.f68811J != null) {
            this.f68835d0 = f.b.LEFT_TO_LEFT;
        } else {
            this.f68835d0 = f.b.LEFT_TO_RIGHT;
        }
        j();
        if (this.f68813L != null) {
            this.f68835d0 = f.b.RIGHT_TO_LEFT;
        } else {
            this.f68835d0 = f.b.RIGHT_TO_RIGHT;
        }
        j();
    }

    public final void l() {
        if (this.f68819R != null) {
            this.f68835d0 = f.b.TOP_TO_TOP;
        } else {
            this.f68835d0 = f.b.TOP_TO_BOTTOM;
        }
        j();
        this.f68835d0 = f.b.BASELINE_TO_BASELINE;
        j();
        if (this.f68822U != null) {
            this.f68835d0 = f.b.BOTTOM_TO_TOP;
        } else {
            this.f68835d0 = f.b.BOTTOM_TO_BOTTOM;
        }
        j();
    }

    public final void m(Object obj) {
        this.f68835d0 = f.b.END_TO_END;
        this.f68818Q = obj;
    }

    public final void n(Object obj) {
        this.f68835d0 = f.b.END_TO_START;
        this.f68817P = obj;
    }

    public final c p() {
        return this.f68839f0;
    }

    public final c q() {
        return this.f68837e0;
    }

    public final void r(float f7) {
        this.f68842h = f7;
    }

    public C7241a s(int i11) {
        f.b bVar = this.f68835d0;
        if (bVar == null) {
            this.f68846j = i11;
            this.f68848k = i11;
            this.f68849l = i11;
            this.f68850m = i11;
            this.f68851n = i11;
            this.f68852o = i11;
            return this;
        }
        switch (C1126a.f68864a[bVar.ordinal()]) {
            case 1:
            case 2:
                this.f68846j = i11;
                break;
            case 3:
            case 4:
                this.f68848k = i11;
                break;
            case 5:
            case 6:
                this.f68849l = i11;
                break;
            case 7:
            case 8:
                this.f68850m = i11;
                break;
            case 9:
            case 10:
            case 11:
                this.f68851n = i11;
                break;
            case 12:
            case 13:
            case 14:
                this.f68852o = i11;
                break;
            case 15:
            case 16:
            case 17:
                this.f68859v = i11;
                break;
            case 18:
                this.f68833c0 = i11;
                break;
        }
        return this;
    }

    public C7241a t(Float f7) {
        return s(this.f68830b.d(f7));
    }

    public final void u(int i11) {
        f.b bVar = this.f68835d0;
        if (bVar == null) {
            this.f68853p = i11;
            this.f68854q = i11;
            this.f68855r = i11;
            this.f68856s = i11;
            this.f68857t = i11;
            this.f68858u = i11;
            return;
        }
        switch (C1126a.f68864a[bVar.ordinal()]) {
            case 1:
            case 2:
                this.f68853p = i11;
                break;
            case 3:
            case 4:
                this.f68854q = i11;
                break;
            case 5:
            case 6:
                this.f68855r = i11;
                break;
            case 7:
            case 8:
                this.f68856s = i11;
                break;
            case 9:
            case 10:
            case 11:
                this.f68857t = i11;
                break;
            case 12:
            case 13:
            case 14:
                this.f68858u = i11;
                break;
            case 15:
            case 16:
            case 17:
                this.f68860w = i11;
                break;
        }
    }

    public final void v(Float f7) {
        u(this.f68830b.d(f7));
    }

    public final void w(int i11) {
        this.f68834d = i11;
    }

    public final void x(float f7) {
        this.f68838f = f7;
    }

    public final void y(Object obj) {
        this.f68828a = obj;
    }

    public final void z(int i11) {
        this.f68836e = i11;
    }
}
