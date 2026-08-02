package defpackage;

import com.unity3d.services.UnityAdsConstants;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class l23 {
    public static final float[] a;
    public static final float[] b;
    public static final kvj c;
    public static final kvj d;
    public static final b5g e;
    public static final b5g f;
    public static final b5g g;
    public static final b5g h;
    public static final b5g i;
    public static final b5g j;
    public static final b5g k;
    public static final b5g l;
    public static final b5g m;
    public static final b5g n;
    public static final b5g o;
    public static final b5g p;
    public static final b5g q;
    public static final b5g r;
    public static final tka s;
    public static final tka t;
    public static final b5g u;
    public static final b5g v;
    public static final b5g w;
    public static final jpd x;
    public static final j23[] y;

    static {
        float[] fArr = {0.64f, 0.33f, 0.3f, 0.6f, 0.15f, 0.06f};
        a = fArr;
        float[] fArr2 = {0.67f, 0.33f, 0.21f, 0.71f, 0.14f, 0.08f};
        b = fArr2;
        float[] fArr3 = {0.708f, 0.292f, 0.17f, 0.797f, 0.131f, 0.046f};
        kvj kvjVar = new kvj(2.4d, 0.9478672985781991d, 0.05213270142180095d, 0.07739938080495357d, 0.04045d);
        kvj kvjVar2 = new kvj(2.2d, 0.9478672985781991d, 0.05213270142180095d, 0.07739938080495357d, 0.04045d);
        kvj kvjVar3 = new kvj(-3.0d, 2.0d, 2.0d, 5.591816309728916d, 0.28466892d, 0.55991073d, -0.685490157d);
        c = kvjVar3;
        kvj kvjVar4 = new kvj(-2.0d, -1.555223d, 1.860454d, 0.012683313515655966d, 18.8515625d, -18.6875d, 6.277394636015326d);
        d = kvjVar4;
        u5l u5lVar = xw3.h;
        b5g b5gVar = new b5g("sRGB IEC61966-2.1", fArr, u5lVar, kvjVar, 0);
        e = b5gVar;
        b5g b5gVar2 = new b5g("sRGB IEC61966-2.1 (Linear)", fArr, u5lVar, 1.0d, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f, 1);
        f = b5gVar2;
        b5g b5gVar3 = new b5g("scRGB-nl IEC 61966-2-2:2003", fArr, u5lVar, null, new vp2(4), new vp2(5), -0.799f, 2.399f, kvjVar, 2);
        g = b5gVar3;
        b5g b5gVar4 = new b5g("scRGB IEC 61966-2-2:2003", fArr, u5lVar, 1.0d, -0.5f, 7.499f, 3);
        h = b5gVar4;
        b5g b5gVar5 = new b5g("Rec. ITU-R BT.709-5", new float[]{0.64f, 0.33f, 0.3f, 0.6f, 0.15f, 0.06f}, u5lVar, new kvj(2.2222222222222223d, 0.9099181073703367d, 0.09008189262966333d, 0.2222222222222222d, 0.081d), 4);
        i = b5gVar5;
        b5g b5gVar6 = new b5g("Rec. ITU-R BT.2020-1", new float[]{0.708f, 0.292f, 0.17f, 0.797f, 0.131f, 0.046f}, u5lVar, new kvj(2.2222222222222223d, 0.9096697898662786d, 0.09033021013372146d, 0.2222222222222222d, 0.08145d), 5);
        j = b5gVar6;
        b5g b5gVar7 = new b5g("SMPTE RP 431-2-2007 DCI (P3)", new float[]{0.68f, 0.32f, 0.265f, 0.69f, 0.15f, 0.06f}, new u5l(0.314f, 0.351f), 2.6d, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f, 6);
        k = b5gVar7;
        b5g b5gVar8 = new b5g("Display P3", new float[]{0.68f, 0.32f, 0.265f, 0.69f, 0.15f, 0.06f}, u5lVar, kvjVar, 7);
        l = b5gVar8;
        double d2 = 0.2222222222222222d;
        double d3 = 0.081d;
        double d4 = 2.2222222222222223d;
        double d5 = 0.9099181073703367d;
        double d6 = 0.09008189262966333d;
        b5g b5gVar9 = new b5g("NTSC (1953)", fArr2, xw3.e, new kvj(d4, d5, d6, d2, d3), 8);
        m = b5gVar9;
        b5g b5gVar10 = new b5g("SMPTE-C RGB", new float[]{0.63f, 0.34f, 0.31f, 0.595f, 0.155f, 0.07f}, u5lVar, new kvj(d4, d5, d6, d2, d3), 9);
        n = b5gVar10;
        b5g b5gVar11 = new b5g("Adobe RGB (1998)", new float[]{0.64f, 0.33f, 0.21f, 0.71f, 0.15f, 0.06f}, u5lVar, 2.2d, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f, 10);
        o = b5gVar11;
        b5g b5gVar12 = new b5g("ROMM RGB ISO 22028-2:2013", new float[]{0.7347f, 0.2653f, 0.1596f, 0.8404f, 0.0366f, 1.0E-4f}, xw3.f, new kvj(1.8d, 1.0d, 0.0d, 0.0625d, 0.031248d), 11);
        p = b5gVar12;
        float[] fArr4 = {0.7347f, 0.2653f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f, 1.0E-4f, -0.077f};
        u5l u5lVar2 = xw3.g;
        b5g b5gVar13 = new b5g("SMPTE ST 2065-1:2012 ACES", fArr4, u5lVar2, 1.0d, -65504.0f, 65504.0f, 12);
        q = b5gVar13;
        b5g b5gVar14 = new b5g("Academy S-2014-004 ACEScg", new float[]{0.713f, 0.293f, 0.165f, 0.83f, 0.128f, 0.044f}, u5lVar2, 1.0d, -65504.0f, 65504.0f, 13);
        r = b5gVar14;
        tka tkaVar = new tka(14, 1, "Generic XYZ", 12884901889L);
        s = tkaVar;
        tka tkaVar2 = new tka(15, 0, "Generic L*a*b*", 12884901890L);
        t = tkaVar2;
        b5g b5gVar15 = new b5g("None", fArr, u5lVar, kvjVar2, 16);
        u = b5gVar15;
        b5g b5gVar16 = new b5g("Hybrid Log Gamma encoding", fArr3, u5lVar, null, new vp2(6), new vp2(7), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f, kvjVar3, 17);
        v = b5gVar16;
        b5g b5gVar17 = new b5g("Perceptual Quantizer encoding", fArr3, u5lVar, null, new vp2(8), new vp2(9), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f, kvjVar4, 18);
        w = b5gVar17;
        jpd jpdVar = new jpd(19, 12884901890L, "Oklab");
        x = jpdVar;
        y = new j23[]{b5gVar, b5gVar2, b5gVar3, b5gVar4, b5gVar5, b5gVar6, b5gVar7, b5gVar8, b5gVar9, b5gVar10, b5gVar11, b5gVar12, b5gVar13, b5gVar14, tkaVar, tkaVar2, b5gVar15, b5gVar16, b5gVar17, jpdVar};
    }

    public static double a(kvj kvjVar, double d2) {
        double d3 = d2 < 0.0d ? -1.0d : 1.0d;
        double d4 = d2 * d3;
        double d5 = kvjVar.b;
        double d6 = kvjVar.c;
        double d7 = kvjVar.d;
        double d8 = kvjVar.e;
        double d9 = kvjVar.f;
        double d10 = d5 * d4;
        return (kvjVar.g + 1.0d) * d3 * (d10 <= 1.0d ? Math.pow(d10, d6) : Math.exp((d4 - d9) * d7) + d8);
    }

    public static double b(kvj kvjVar, double d2) {
        double d3 = d2 < 0.0d ? -1.0d : 1.0d;
        double d4 = 1.0d / kvjVar.b;
        double d5 = 1.0d / kvjVar.c;
        double d6 = 1.0d / kvjVar.d;
        double d7 = kvjVar.e;
        double d8 = kvjVar.f;
        double d9 = (d2 * d3) / (kvjVar.g + 1.0d);
        return d3 * (d9 <= 1.0d ? Math.pow(d9, d5) * d4 : (Math.log(d9 - d7) * d6) + d8);
    }

    public static double c(kvj kvjVar, double d2) {
        double d3 = d2 < 0.0d ? -1.0d : 1.0d;
        double d4 = d2 * d3;
        double d5 = kvjVar.b;
        double d6 = kvjVar.d;
        double pow = (Math.pow(d4, d6) * kvjVar.c) + d5;
        return Math.pow((pow >= 0.0d ? pow : 0.0d) / ((Math.pow(d4, d6) * kvjVar.f) + kvjVar.e), kvjVar.g) * d3;
    }

    public static double d(kvj kvjVar, double d2) {
        double d3 = d2 < 0.0d ? -1.0d : 1.0d;
        double d4 = d2 * d3;
        double d5 = -kvjVar.b;
        double d6 = kvjVar.e;
        double d7 = 1.0d / kvjVar.g;
        return Math.pow(Math.max((Math.pow(d4, d7) * d6) + d5, 0.0d) / ((Math.pow(d4, d7) * (-kvjVar.f)) + kvjVar.c), 1.0d / kvjVar.d) * d3;
    }
}
