package O;

import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class g {

    @NotNull
    private static final c[] ColorSpacesArray;

    @NotNull
    private static final float[] Ntsc1953Primaries;

    @NotNull
    private static final float[] SrgbPrimaries;

    /* renamed from: a, reason: collision with root package name */
    public static final g f8158a = new g();

    /* renamed from: b, reason: collision with root package name */
    public static final x f8159b;

    /* renamed from: c, reason: collision with root package name */
    public static final x f8160c;

    /* renamed from: d, reason: collision with root package name */
    public static final w f8161d;

    /* renamed from: e, reason: collision with root package name */
    public static final w f8162e;

    /* renamed from: f, reason: collision with root package name */
    public static final w f8163f;

    /* renamed from: g, reason: collision with root package name */
    public static final w f8164g;

    /* renamed from: h, reason: collision with root package name */
    public static final w f8165h;

    /* renamed from: i, reason: collision with root package name */
    public static final w f8166i;

    /* renamed from: j, reason: collision with root package name */
    public static final w f8167j;

    /* renamed from: k, reason: collision with root package name */
    public static final w f8168k;

    /* renamed from: l, reason: collision with root package name */
    public static final w f8169l;

    /* renamed from: m, reason: collision with root package name */
    public static final w f8170m;

    /* renamed from: n, reason: collision with root package name */
    public static final w f8171n;

    /* renamed from: o, reason: collision with root package name */
    public static final w f8172o;

    /* renamed from: p, reason: collision with root package name */
    public static final w f8173p;

    /* renamed from: q, reason: collision with root package name */
    public static final w f8174q;

    /* renamed from: r, reason: collision with root package name */
    public static final c f8175r;

    /* renamed from: s, reason: collision with root package name */
    public static final c f8176s;

    /* renamed from: t, reason: collision with root package name */
    public static final w f8177t;

    /* renamed from: u, reason: collision with root package name */
    public static final c f8178u;

    static {
        float[] fArr = {0.64f, 0.33f, 0.3f, 0.6f, 0.15f, 0.06f};
        SrgbPrimaries = fArr;
        float[] fArr2 = {0.67f, 0.33f, 0.21f, 0.71f, 0.14f, 0.08f};
        Ntsc1953Primaries = fArr2;
        x xVar = new x(2.4d, 0.9478672985781991d, 0.05213270142180095d, 0.07739938080495357d, 0.04045d, 0.0d, 0.0d, 96, null);
        f8159b = xVar;
        x xVar2 = new x(2.2d, 0.9478672985781991d, 0.05213270142180095d, 0.07739938080495357d, 0.04045d, 0.0d, 0.0d, 96, null);
        f8160c = xVar2;
        j jVar = j.f8190a;
        w wVar = new w("sRGB IEC61966-2.1", fArr, jVar.e(), xVar, 0);
        f8161d = wVar;
        w wVar2 = new w("sRGB IEC61966-2.1 (Linear)", fArr, jVar.e(), 1.0d, 0.0f, 1.0f, 1);
        f8162e = wVar2;
        w wVar3 = new w("scRGB-nl IEC 61966-2-2:2003", fArr, jVar.e(), null, new i() { // from class: O.e
            @Override // O.i
            public final double a(double d10) {
                double c10;
                c10 = g.c(d10);
                return c10;
            }
        }, new i() { // from class: O.f
            @Override // O.i
            public final double a(double d10) {
                double d11;
                d11 = g.d(d10);
                return d11;
            }
        }, -0.799f, 2.399f, xVar, 2);
        f8163f = wVar3;
        w wVar4 = new w("scRGB IEC 61966-2-2:2003", fArr, jVar.e(), 1.0d, -0.5f, 7.499f, 3);
        f8164g = wVar4;
        w wVar5 = new w("Rec. ITU-R BT.709-5", new float[]{0.64f, 0.33f, 0.3f, 0.6f, 0.15f, 0.06f}, jVar.e(), new x(2.2222222222222223d, 0.9099181073703367d, 0.09008189262966333d, 0.2222222222222222d, 0.081d, 0.0d, 0.0d, 96, null), 4);
        f8165h = wVar5;
        w wVar6 = new w("Rec. ITU-R BT.2020-1", new float[]{0.708f, 0.292f, 0.17f, 0.797f, 0.131f, 0.046f}, jVar.e(), new x(2.2222222222222223d, 0.9096697898662786d, 0.09033021013372146d, 0.2222222222222222d, 0.08145d, 0.0d, 0.0d, 96, null), 5);
        f8166i = wVar6;
        w wVar7 = new w("SMPTE RP 431-2-2007 DCI (P3)", new float[]{0.68f, 0.32f, 0.265f, 0.69f, 0.15f, 0.06f}, new y(0.314f, 0.351f), 2.6d, 0.0f, 1.0f, 6);
        f8167j = wVar7;
        w wVar8 = new w("Display P3", new float[]{0.68f, 0.32f, 0.265f, 0.69f, 0.15f, 0.06f}, jVar.e(), xVar, 7);
        f8168k = wVar8;
        w wVar9 = new w("NTSC (1953)", fArr2, jVar.a(), new x(2.2222222222222223d, 0.9099181073703367d, 0.09008189262966333d, 0.2222222222222222d, 0.081d, 0.0d, 0.0d, 96, null), 8);
        f8169l = wVar9;
        w wVar10 = new w("SMPTE-C RGB", new float[]{0.63f, 0.34f, 0.31f, 0.595f, 0.155f, 0.07f}, jVar.e(), new x(2.2222222222222223d, 0.9099181073703367d, 0.09008189262966333d, 0.2222222222222222d, 0.081d, 0.0d, 0.0d, 96, null), 9);
        f8170m = wVar10;
        w wVar11 = new w("Adobe RGB (1998)", new float[]{0.64f, 0.33f, 0.21f, 0.71f, 0.15f, 0.06f}, jVar.e(), 2.2d, 0.0f, 1.0f, 10);
        f8171n = wVar11;
        w wVar12 = new w("ROMM RGB ISO 22028-2:2013", new float[]{0.7347f, 0.2653f, 0.1596f, 0.8404f, 0.0366f, 1.0E-4f}, jVar.b(), new x(1.8d, 1.0d, 0.0d, 0.0625d, 0.031248d, 0.0d, 0.0d, 96, null), 11);
        f8172o = wVar12;
        w wVar13 = new w("SMPTE ST 2065-1:2012 ACES", new float[]{0.7347f, 0.2653f, 0.0f, 1.0f, 1.0E-4f, -0.077f}, jVar.d(), 1.0d, -65504.0f, 65504.0f, 12);
        f8173p = wVar13;
        w wVar14 = new w("Academy S-2014-004 ACEScg", new float[]{0.713f, 0.293f, 0.165f, 0.83f, 0.128f, 0.044f}, jVar.d(), 1.0d, -65504.0f, 65504.0f, 13);
        f8174q = wVar14;
        z zVar = new z("Generic XYZ", 14);
        f8175r = zVar;
        k kVar = new k("Generic L*a*b*", 15);
        f8176s = kVar;
        w wVar15 = new w("None", fArr, jVar.e(), xVar2, 16);
        f8177t = wVar15;
        l lVar = new l("Oklab", 17);
        f8178u = lVar;
        ColorSpacesArray = new c[]{wVar, wVar2, wVar3, wVar4, wVar5, wVar6, wVar7, wVar8, wVar9, wVar10, wVar11, wVar12, wVar13, wVar14, zVar, kVar, wVar15, lVar};
    }

    public static final double c(double d10) {
        return d.a(d10, 0.9478672985781991d, 0.05213270142180095d, 0.07739938080495357d, 0.04045d, 2.4d);
    }

    public static final double d(double d10) {
        return d.b(d10, 0.9478672985781991d, 0.05213270142180095d, 0.07739938080495357d, 0.04045d, 2.4d);
    }

    public final c[] e() {
        return ColorSpacesArray;
    }

    public final float[] f() {
        return Ntsc1953Primaries;
    }

    public final c g() {
        return f8178u;
    }

    public final w h() {
        return f8161d;
    }

    public final float[] i() {
        return SrgbPrimaries;
    }

    public final w j() {
        return f8177t;
    }
}
