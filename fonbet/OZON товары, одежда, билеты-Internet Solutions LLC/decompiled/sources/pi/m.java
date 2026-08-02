package pi;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import oi.InterfaceC8742f;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public final class m implements l {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public static final m f81166a = new m();

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private static final oi.g f81168b = new oi.g("tsBodyAccent100Caption", true);

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private static final oi.g f81170c = new oi.g("tsBodyAccent250Caption", true);

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private static final oi.g f81172d = new oi.g("tsBodyAccent300XSmall", false);

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private static final oi.g f81174e = new oi.g("tsBodyAccent400Small", false);

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private static final oi.g f81176f = new oi.g("tsBodyAccent500Medium", false);

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private static final oi.g f81178g = new oi.g("tsBodyControl300XSmall", false);

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private static final oi.g f81180h = new oi.g("tsBodyControl400Small", false);

    /* renamed from: i, reason: collision with root package name */
    @NotNull
    private static final oi.g f81182i = new oi.g("tsBodyControl500Medium", false);

    /* renamed from: j, reason: collision with root package name */
    @NotNull
    private static final oi.g f81184j = new oi.g("tsBodyControl600Large", false);

    /* renamed from: k, reason: collision with root package name */
    @NotNull
    private static final oi.g f81186k = new oi.g("tsBodyControl700Large", false);

    /* renamed from: l, reason: collision with root package name */
    @NotNull
    private static final oi.g f81188l = new oi.g("tsBodyControl700XLarge", false);

    /* renamed from: m, reason: collision with root package name */
    @NotNull
    private static final oi.g f81190m = new oi.g("tsBodyNumeric200XSmall", false);

    /* renamed from: n, reason: collision with root package name */
    @NotNull
    private static final oi.g f81192n = new oi.g("tsBodyNumeric300XSmall", false);

    /* renamed from: o, reason: collision with root package name */
    @NotNull
    private static final oi.g f81194o = new oi.g("tsBodyNumeric400Small", false);

    /* renamed from: p, reason: collision with root package name */
    @NotNull
    private static final oi.g f81196p = new oi.g("tsBodyNumeric500Medium", false);

    /* renamed from: q, reason: collision with root package name */
    @NotNull
    private static final oi.g f81197q = new oi.g("tsBodyNumeric600Large", false);

    /* renamed from: r, reason: collision with root package name */
    @NotNull
    private static final oi.g f81198r = new oi.g("tsBodyPromo300XSmall", false);

    /* renamed from: s, reason: collision with root package name */
    @NotNull
    private static final oi.g f81199s = new oi.g("tsBody200XSmall", false);

    /* renamed from: t, reason: collision with root package name */
    @NotNull
    private static final oi.g f81200t = new oi.g("tsBody300XSmall", false);

    /* renamed from: u, reason: collision with root package name */
    @NotNull
    private static final oi.g f81201u = new oi.g("tsBody400Large", false);

    /* renamed from: v, reason: collision with root package name */
    @NotNull
    private static final oi.g f81202v = new oi.g("tsBody400Small", false);

    /* renamed from: w, reason: collision with root package name */
    @NotNull
    private static final oi.g f81203w = new oi.g("tsBody450Small", false);

    /* renamed from: x, reason: collision with root package name */
    @NotNull
    private static final oi.g f81204x = new oi.g("tsBody500Large", false);

    /* renamed from: y, reason: collision with root package name */
    @NotNull
    private static final oi.g f81205y = new oi.g("tsBody500Medium", false);

    /* renamed from: z, reason: collision with root package name */
    @NotNull
    private static final oi.g f81206z = new oi.g("tsBody500Small", false);

    /* renamed from: A, reason: collision with root package name */
    @NotNull
    private static final oi.g f81140A = new oi.g("tsBody600Medium", false);

    /* renamed from: B, reason: collision with root package name */
    @NotNull
    private static final oi.g f81141B = new oi.g("tsCompactControl300XSmall", false);

    /* renamed from: C, reason: collision with root package name */
    @NotNull
    private static final oi.g f81142C = new oi.g("tsCompactControl400Small", false);

    /* renamed from: D, reason: collision with root package name */
    @NotNull
    private static final oi.g f81143D = new oi.g("tsCompactControl500Medium", false);

    /* renamed from: E, reason: collision with root package name */
    @NotNull
    private static final oi.g f81144E = new oi.g("tsCompactNumeric400Small", false);

    /* renamed from: F, reason: collision with root package name */
    @NotNull
    private static final oi.g f81145F = new oi.g("tsCompactNumeric600Large", false);

    /* renamed from: G, reason: collision with root package name */
    @NotNull
    private static final oi.g f81146G = new oi.g("tsCompact300XSmall", false);

    /* renamed from: H, reason: collision with root package name */
    @NotNull
    private static final oi.g f81147H = new oi.g("tsCompact400Large", false);

    /* renamed from: I, reason: collision with root package name */
    @NotNull
    private static final oi.g f81148I = new oi.g("tsCompact400Small", false);

    /* renamed from: J, reason: collision with root package name */
    @NotNull
    private static final oi.g f81149J = new oi.g("tsCompact450Small", false);

    /* renamed from: K, reason: collision with root package name */
    @NotNull
    private static final oi.g f81150K = new oi.g("tsCompact500Medium", false);

    /* renamed from: L, reason: collision with root package name */
    @NotNull
    private static final oi.g f81151L = new oi.g("tsCompact550Medium", false);

    /* renamed from: M, reason: collision with root package name */
    @NotNull
    private static final oi.g f81152M = new oi.g("tsCompact600Large", false);

    /* renamed from: N, reason: collision with root package name */
    @NotNull
    private static final oi.g f81153N = new oi.g("tsHeadlineCompact400Medium", true);

    /* renamed from: O, reason: collision with root package name */
    @NotNull
    private static final oi.g f81154O = new oi.g("tsHeadlineCompact400Small", false);

    /* renamed from: P, reason: collision with root package name */
    @NotNull
    private static final oi.g f81155P = new oi.g("tsHeadlineNumeric700XLarge", false);

    /* renamed from: Q, reason: collision with root package name */
    @NotNull
    private static final oi.g f81156Q = new oi.g("tsHeadlineNumeric800XxLarge", false);

    /* renamed from: R, reason: collision with root package name */
    @NotNull
    private static final oi.g f81157R = new oi.g("tsHeadlinePromo400Small", false);

    /* renamed from: S, reason: collision with root package name */
    @NotNull
    private static final oi.g f81158S = new oi.g("tsHeadlinePromo500Medium", false);

    /* renamed from: T, reason: collision with root package name */
    @NotNull
    private static final oi.g f81159T = new oi.g("tsHeadline300XSmall", true);

    /* renamed from: U, reason: collision with root package name */
    @NotNull
    private static final oi.g f81160U = new oi.g("tsHeadline400Small", false);

    /* renamed from: V, reason: collision with root package name */
    @NotNull
    private static final oi.g f81161V = new oi.g("tsHeadline500Medium", false);

    /* renamed from: W, reason: collision with root package name */
    @NotNull
    private static final oi.g f81162W = new oi.g("tsHeadline500XMedium", false);

    /* renamed from: X, reason: collision with root package name */
    @NotNull
    private static final oi.g f81163X = new oi.g("tsHeadline550Medium", false);

    /* renamed from: Y, reason: collision with root package name */
    @NotNull
    private static final oi.g f81164Y = new oi.g("tsHeadline600Large", false);

    /* renamed from: Z, reason: collision with root package name */
    @NotNull
    private static final oi.g f81165Z = new oi.g("tsHeadline600Medium", false);

    /* renamed from: a0, reason: collision with root package name */
    @NotNull
    private static final oi.g f81167a0 = new oi.g("tsHeadline700XLarge", false);

    /* renamed from: b0, reason: collision with root package name */
    @NotNull
    private static final oi.g f81169b0 = new oi.g("tsHeadline800XxLarge", false);

    /* renamed from: c0, reason: collision with root package name */
    @NotNull
    private static final oi.g f81171c0 = new oi.g("tsHeadline900XxLarge", false);

    /* renamed from: d0, reason: collision with root package name */
    @NotNull
    private static final oi.g f81173d0 = new oi.g("tsKeyPromo200XSmall", false);

    /* renamed from: e0, reason: collision with root package name */
    @NotNull
    private static final oi.g f81175e0 = new oi.g("tsKeyPromo400Large", false);

    /* renamed from: f0, reason: collision with root package name */
    @NotNull
    private static final oi.g f81177f0 = new oi.g("tsKeyPromo400Medium", false);

    /* renamed from: g0, reason: collision with root package name */
    @NotNull
    private static final oi.g f81179g0 = new oi.g("tsKeyPromo500Medium", false);

    /* renamed from: h0, reason: collision with root package name */
    @NotNull
    private static final oi.g f81181h0 = new oi.g("tsKeyPromo600Large", false);

    /* renamed from: i0, reason: collision with root package name */
    @NotNull
    private static final oi.g f81183i0 = new oi.g("tsKeyPromo600XLarge", false);

    /* renamed from: j0, reason: collision with root package name */
    @NotNull
    private static final oi.g f81185j0 = new oi.g("tsKeyPromo650Large", false);

    /* renamed from: k0, reason: collision with root package name */
    @NotNull
    private static final oi.g f81187k0 = new oi.g("tsKeyPromo700Large", false);

    /* renamed from: l0, reason: collision with root package name */
    @NotNull
    private static final oi.g f81189l0 = new oi.g("tsKeyPromo700XLarge", false);

    /* renamed from: m0, reason: collision with root package name */
    @NotNull
    private static final oi.g f81191m0 = new oi.g("tsKeyPromo800Large", false);

    /* renamed from: n0, reason: collision with root package name */
    @NotNull
    private static final oi.g f81193n0 = new oi.g("tsKeyPromo800Small", false);

    /* renamed from: o0, reason: collision with root package name */
    @NotNull
    private static final oi.g f81195o0 = new oi.g("tsKeyPromo900Medium", false);

    @NotNull
    public final oi.g A() {
        return f81146G;
    }

    @NotNull
    public final oi.g B() {
        return f81147H;
    }

    @NotNull
    public final oi.g C() {
        return f81148I;
    }

    @NotNull
    public final oi.g D() {
        return f81149J;
    }

    @NotNull
    public final oi.g E() {
        return f81150K;
    }

    @NotNull
    public final oi.g F() {
        return f81151L;
    }

    @NotNull
    public final oi.g G() {
        return f81152M;
    }

    @NotNull
    public final oi.g H() {
        return f81141B;
    }

    @NotNull
    public final oi.g I() {
        return f81142C;
    }

    @NotNull
    public final oi.g J() {
        return f81143D;
    }

    @NotNull
    public final oi.g K() {
        return f81144E;
    }

    @NotNull
    public final oi.g L() {
        return f81145F;
    }

    @NotNull
    public final oi.g M() {
        return f81159T;
    }

    @NotNull
    public final oi.g N() {
        return f81160U;
    }

    @NotNull
    public final oi.g O() {
        return f81161V;
    }

    @NotNull
    public final oi.g P() {
        return f81162W;
    }

    @NotNull
    public final oi.g Q() {
        return f81163X;
    }

    @NotNull
    public final oi.g R() {
        return f81164Y;
    }

    @NotNull
    public final oi.g S() {
        return f81165Z;
    }

    @NotNull
    public final oi.g T() {
        return f81167a0;
    }

    @NotNull
    public final oi.g U() {
        return f81169b0;
    }

    @NotNull
    public final oi.g V() {
        return f81171c0;
    }

    @NotNull
    public final oi.g W() {
        return f81153N;
    }

    @NotNull
    public final oi.g X() {
        return f81154O;
    }

    @NotNull
    public final oi.g Y() {
        return f81155P;
    }

    @NotNull
    public final oi.g Z() {
        return f81156Q;
    }

    @NotNull
    public final oi.g a() {
        return f81199s;
    }

    @NotNull
    public final oi.g a0() {
        return f81157R;
    }

    @NotNull
    public final oi.g b() {
        return f81200t;
    }

    @NotNull
    public final oi.g b0() {
        return f81158S;
    }

    @NotNull
    public final oi.g c() {
        return f81201u;
    }

    @NotNull
    public final oi.g c0() {
        return f81173d0;
    }

    @NotNull
    public final oi.g d() {
        return f81202v;
    }

    @NotNull
    public final oi.g d0() {
        return f81175e0;
    }

    @NotNull
    public final oi.g e() {
        return f81203w;
    }

    @NotNull
    public final oi.g e0() {
        return f81177f0;
    }

    @NotNull
    public final oi.g f() {
        return f81204x;
    }

    @NotNull
    public final oi.g f0() {
        return f81179g0;
    }

    @NotNull
    public final oi.g g() {
        return f81205y;
    }

    @NotNull
    public final oi.g g0() {
        return f81181h0;
    }

    @Override // pi.l
    public final InterfaceC8742f getById(String tokenId) {
        Map map;
        Intrinsics.checkNotNullParameter(tokenId, "tokenId");
        map = n.f81207a;
        return (oi.g) map.get(tokenId);
    }

    @NotNull
    public final oi.g h() {
        return f81206z;
    }

    @NotNull
    public final oi.g h0() {
        return f81183i0;
    }

    @NotNull
    public final oi.g i() {
        return f81140A;
    }

    @NotNull
    public final oi.g i0() {
        return f81185j0;
    }

    @NotNull
    public final oi.g j() {
        return f81168b;
    }

    @NotNull
    public final oi.g j0() {
        return f81187k0;
    }

    @NotNull
    public final oi.g k() {
        return f81170c;
    }

    @NotNull
    public final oi.g k0() {
        return f81189l0;
    }

    @NotNull
    public final oi.g l() {
        return f81172d;
    }

    @NotNull
    public final oi.g l0() {
        return f81191m0;
    }

    @NotNull
    public final oi.g m() {
        return f81174e;
    }

    @NotNull
    public final oi.g m0() {
        return f81193n0;
    }

    @NotNull
    public final oi.g n() {
        return f81176f;
    }

    @NotNull
    public final oi.g n0() {
        return f81195o0;
    }

    @NotNull
    public final oi.g o() {
        return f81178g;
    }

    @NotNull
    public final oi.g p() {
        return f81180h;
    }

    @NotNull
    public final oi.g q() {
        return f81182i;
    }

    @NotNull
    public final oi.g r() {
        return f81184j;
    }

    @NotNull
    public final oi.g s() {
        return f81186k;
    }

    @NotNull
    public final oi.g t() {
        return f81188l;
    }

    @NotNull
    public final oi.g u() {
        return f81190m;
    }

    @NotNull
    public final oi.g v() {
        return f81192n;
    }

    @NotNull
    public final oi.g w() {
        return f81194o;
    }

    @NotNull
    public final oi.g x() {
        return f81196p;
    }

    @NotNull
    public final oi.g y() {
        return f81197q;
    }

    @NotNull
    public final oi.g z() {
        return f81198r;
    }
}
