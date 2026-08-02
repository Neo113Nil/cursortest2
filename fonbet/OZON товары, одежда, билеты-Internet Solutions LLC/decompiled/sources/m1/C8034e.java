package m1;

import Kk.C3532b;
import org.jetbrains.annotations.NotNull;

/* renamed from: m1.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8034e {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private static final float[] f73938a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private static final float[] f73939b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private static final p f73940c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private static final p f73941d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private static final p f73942e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private static final p f73943f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private static final p f73944g;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private static final p f73945h;

    /* renamed from: i, reason: collision with root package name */
    @NotNull
    private static final p f73946i;

    /* renamed from: j, reason: collision with root package name */
    @NotNull
    private static final p f73947j;

    /* renamed from: k, reason: collision with root package name */
    @NotNull
    private static final p f73948k;

    /* renamed from: l, reason: collision with root package name */
    @NotNull
    private static final p f73949l;

    /* renamed from: m, reason: collision with root package name */
    @NotNull
    private static final p f73950m;

    /* renamed from: n, reason: collision with root package name */
    @NotNull
    private static final p f73951n;

    /* renamed from: o, reason: collision with root package name */
    @NotNull
    private static final p f73952o;

    /* renamed from: p, reason: collision with root package name */
    @NotNull
    private static final p f73953p;

    /* renamed from: q, reason: collision with root package name */
    @NotNull
    private static final s f73954q;

    /* renamed from: r, reason: collision with root package name */
    @NotNull
    private static final k f73955r;

    /* renamed from: s, reason: collision with root package name */
    @NotNull
    private static final p f73956s;

    /* renamed from: t, reason: collision with root package name */
    @NotNull
    private static final l f73957t;

    /* renamed from: u, reason: collision with root package name */
    @NotNull
    private static final AbstractC8032c[] f73958u;

    /* renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ int f73959v = 0;

    static {
        long j11;
        long j12;
        long j13;
        float[] fArr = {0.64f, 0.33f, 0.3f, 0.6f, 0.15f, 0.06f};
        f73938a = fArr;
        float[] fArr2 = {0.67f, 0.33f, 0.21f, 0.71f, 0.14f, 0.08f};
        f73939b = fArr2;
        q qVar = new q(2.4d, 0.9478672985781991d, 0.05213270142180095d, 0.07739938080495357d, 0.04045d);
        q qVar2 = new q(2.2d, 0.9478672985781991d, 0.05213270142180095d, 0.07739938080495357d, 0.04045d);
        p pVar = new p("sRGB IEC61966-2.1", fArr, j.e(), qVar, 0);
        f73940c = pVar;
        p pVar2 = new p("sRGB IEC61966-2.1 (Linear)", fArr, j.e(), 1.0d, 0.0f, 1.0f, 1);
        f73941d = pVar2;
        p pVar3 = new p("scRGB-nl IEC 61966-2-2:2003", fArr, j.e(), null, new K00.b(), new C3532b(), -0.799f, 2.399f, qVar, 2);
        f73942e = pVar3;
        p pVar4 = new p("scRGB IEC 61966-2-2:2003", fArr, j.e(), 1.0d, -0.5f, 7.499f, 3);
        f73943f = pVar4;
        p pVar5 = new p("Rec. ITU-R BT.709-5", new float[]{0.64f, 0.33f, 0.3f, 0.6f, 0.15f, 0.06f}, j.e(), new q(2.2222222222222223d, 0.9099181073703367d, 0.09008189262966333d, 0.2222222222222222d, 0.081d), 4);
        f73944g = pVar5;
        p pVar6 = new p("Rec. ITU-R BT.2020-1", new float[]{0.708f, 0.292f, 0.17f, 0.797f, 0.131f, 0.046f}, j.e(), new q(2.2222222222222223d, 0.9096697898662786d, 0.09033021013372146d, 0.2222222222222222d, 0.08145d), 5);
        f73945h = pVar6;
        p pVar7 = new p("SMPTE RP 431-2-2007 DCI (P3)", new float[]{0.68f, 0.32f, 0.265f, 0.69f, 0.15f, 0.06f}, new r(0.314f, 0.351f), 2.6d, 0.0f, 1.0f, 6);
        f73946i = pVar7;
        p pVar8 = new p("Display P3", new float[]{0.68f, 0.32f, 0.265f, 0.69f, 0.15f, 0.06f}, j.e(), qVar, 7);
        f73947j = pVar8;
        p pVar9 = new p("NTSC (1953)", fArr2, j.a(), new q(2.2222222222222223d, 0.9099181073703367d, 0.09008189262966333d, 0.2222222222222222d, 0.081d), 8);
        f73948k = pVar9;
        p pVar10 = new p("SMPTE-C RGB", new float[]{0.63f, 0.34f, 0.31f, 0.595f, 0.155f, 0.07f}, j.e(), new q(2.2222222222222223d, 0.9099181073703367d, 0.09008189262966333d, 0.2222222222222222d, 0.081d), 9);
        f73949l = pVar10;
        p pVar11 = new p("Adobe RGB (1998)", new float[]{0.64f, 0.33f, 0.21f, 0.71f, 0.15f, 0.06f}, j.e(), 2.2d, 0.0f, 1.0f, 10);
        f73950m = pVar11;
        p pVar12 = new p("ROMM RGB ISO 22028-2:2013", new float[]{0.7347f, 0.2653f, 0.1596f, 0.8404f, 0.0366f, 1.0E-4f}, j.b(), new q(1.8d, 1.0d, 0.0d, 0.0625d, 0.031248d), 11);
        f73951n = pVar12;
        p pVar13 = new p("SMPTE ST 2065-1:2012 ACES", new float[]{0.7347f, 0.2653f, 0.0f, 1.0f, 1.0E-4f, -0.077f}, j.d(), 1.0d, -65504.0f, 65504.0f, 12);
        f73952o = pVar13;
        p pVar14 = new p("Academy S-2014-004 ACEScg", new float[]{0.713f, 0.293f, 0.165f, 0.83f, 0.128f, 0.044f}, j.d(), 1.0d, -65504.0f, 65504.0f, 13);
        f73953p = pVar14;
        j11 = C8031b.f73931b;
        s sVar = new s(14, j11, "Generic XYZ");
        f73954q = sVar;
        j12 = C8031b.f73932c;
        k kVar = new k(15, j12, "Generic L*a*b*");
        f73955r = kVar;
        p pVar15 = new p("None", fArr, j.e(), qVar2, 16);
        f73956s = pVar15;
        j13 = C8031b.f73932c;
        l lVar = new l(17, j13, "Oklab");
        f73957t = lVar;
        f73958u = new AbstractC8032c[]{pVar, pVar2, pVar3, pVar4, pVar5, pVar6, pVar7, pVar8, pVar9, pVar10, pVar11, pVar12, pVar13, pVar14, sVar, kVar, pVar15, lVar};
    }

    @NotNull
    public static p a() {
        return f73952o;
    }

    @NotNull
    public static p b() {
        return f73953p;
    }

    @NotNull
    public static p c() {
        return f73950m;
    }

    @NotNull
    public static p d() {
        return f73945h;
    }

    @NotNull
    public static p e() {
        return f73944g;
    }

    @NotNull
    public static k f() {
        return f73955r;
    }

    @NotNull
    public static s g() {
        return f73954q;
    }

    @NotNull
    public static AbstractC8032c[] h() {
        return f73958u;
    }

    @NotNull
    public static p i() {
        return f73946i;
    }

    @NotNull
    public static p j() {
        return f73947j;
    }

    @NotNull
    public static p k() {
        return f73942e;
    }

    @NotNull
    public static p l() {
        return f73943f;
    }

    @NotNull
    public static p m() {
        return f73941d;
    }

    @NotNull
    public static p n() {
        return f73948k;
    }

    @NotNull
    public static float[] o() {
        return f73939b;
    }

    @NotNull
    public static l p() {
        return f73957t;
    }

    @NotNull
    public static p q() {
        return f73951n;
    }

    @NotNull
    public static p r() {
        return f73949l;
    }

    @NotNull
    public static p s() {
        return f73940c;
    }

    @NotNull
    public static float[] t() {
        return f73938a;
    }

    @NotNull
    public static p u() {
        return f73956s;
    }
}
