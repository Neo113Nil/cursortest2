package defpackage;

import android.graphics.Color;
import android.view.animation.Interpolator;
import com.ironsource.C4427z5;
import com.ironsource.U3;
import com.mbridge.msdk.foundation.entity.b;
import com.mbridge.msdk.foundation.same.report.h;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.mbridge.msdk.setting.i;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.Collections;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract class nla {
    public static final wj9 a = wj9.J("nm", "ind", "refId", "ty", "parent", "sw", b.JSON_KEY_SH, "sc", "ks", TtmlNode.TAG_TT, "masksProperties", "shapes", "t", "ef", "sr", "st", "w", h.b, "ip", "op", "tm", "cl", "hd", "ao", "bm");
    public static final wj9 b = wj9.J("d", "a");
    public static final wj9 c = wj9.J("ty", "nm");

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:6:0x0060. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:5:0x0058  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static mla a(lha lhaVar, plb plbVar) {
        String str;
        boolean z;
        x50 x50Var;
        Float f;
        String str2;
        boolean z2;
        long j;
        char c2;
        char c3;
        Float f2;
        Float f3;
        String str3;
        long j2;
        boolean z3;
        long j3;
        r50 r50Var;
        s50 s50Var;
        s50 s50Var2;
        s50 s50Var3;
        s50 s50Var4;
        char c4;
        Float valueOf = Float.valueOf(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        Float valueOf2 = Float.valueOf(1.0f);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        lhaVar.k();
        float f4 = 0.0f;
        float f5 = 0.0f;
        float f6 = 0.0f;
        float f7 = 0.0f;
        float f8 = 0.0f;
        long j4 = -1;
        x50 x50Var2 = null;
        int i = 0;
        String str4 = null;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        boolean z4 = false;
        hpo hpoVar = null;
        p03 p03Var = null;
        int i5 = 1;
        int i6 = 1;
        r50 r50Var2 = null;
        f4a f4aVar = null;
        s50 s50Var5 = null;
        float f9 = 1.0f;
        long j5 = 0;
        String str5 = null;
        String str6 = "UNSET";
        while (true) {
            boolean z5 = false;
            while (lhaVar.t()) {
                switch (lhaVar.e0(a)) {
                    case 0:
                        str6 = lhaVar.T();
                    case 1:
                        f2 = valueOf;
                        j5 = lhaVar.M();
                        valueOf = f2;
                    case 2:
                        str4 = lhaVar.T();
                    case 3:
                        f = valueOf;
                        str2 = str5;
                        z2 = z5;
                        j = j4;
                        int M = lhaVar.M();
                        i = 7;
                        if (M < 6) {
                            i = wt3.D(7)[M];
                        }
                        valueOf = f;
                        str5 = str2;
                        z5 = z2;
                        j4 = j;
                    case 4:
                        f2 = valueOf;
                        j4 = lhaVar.M();
                        valueOf = f2;
                    case 5:
                        f3 = valueOf;
                        str3 = str5;
                        i2 = (int) (vik.c() * lhaVar.M());
                        valueOf = f3;
                        str5 = str3;
                    case 6:
                        f3 = valueOf;
                        str3 = str5;
                        i3 = (int) (vik.c() * lhaVar.M());
                        valueOf = f3;
                        str5 = str3;
                    case 7:
                        f2 = valueOf;
                        i4 = Color.parseColor(lhaVar.T());
                        valueOf = f2;
                    case 8:
                        x50Var2 = y50.c(lhaVar, plbVar);
                    case 9:
                        f = valueOf;
                        str2 = str5;
                        z2 = z5;
                        j = j4;
                        int M2 = lhaVar.M();
                        if (M2 >= wt3.D(6).length) {
                            plbVar.a("Unsupported matte type: " + M2);
                        } else {
                            i5 = wt3.D(6)[M2];
                            int C = wt3.C(i5);
                            if (C == 3) {
                                plbVar.a("Unsupported matte type: Luma");
                            } else if (C == 4) {
                                plbVar.a("Unsupported matte type: Luma Inverted");
                            }
                            plbVar.p++;
                        }
                        valueOf = f;
                        str5 = str2;
                        z5 = z2;
                        j4 = j;
                    case 10:
                        f = valueOf;
                        str2 = str5;
                        z2 = z5;
                        j = j4;
                        lhaVar.h();
                        while (lhaVar.t()) {
                            lhaVar.k();
                            boolean z6 = false;
                            r50 r50Var3 = null;
                            int i7 = 0;
                            r50 r50Var4 = null;
                            while (lhaVar.t()) {
                                String E0 = lhaVar.E0();
                                E0.getClass();
                                switch (E0.hashCode()) {
                                    case 111:
                                        if (E0.equals("o")) {
                                            c2 = 0;
                                            break;
                                        }
                                        c2 = 65535;
                                        break;
                                    case 3588:
                                        if (E0.equals("pt")) {
                                            c2 = 1;
                                            break;
                                        }
                                        c2 = 65535;
                                        break;
                                    case 104433:
                                        if (E0.equals("inv")) {
                                            c2 = 2;
                                            break;
                                        }
                                        c2 = 65535;
                                        break;
                                    case 3357091:
                                        if (E0.equals(U3.a.t)) {
                                            c2 = 3;
                                            break;
                                        }
                                        c2 = 65535;
                                        break;
                                    default:
                                        c2 = 65535;
                                        break;
                                }
                                switch (c2) {
                                    case 0:
                                        r50Var4 = un0.E(lhaVar, plbVar);
                                        break;
                                    case 1:
                                        r50Var3 = new r50(qja.a(lhaVar, plbVar, vik.c(), bbh.a, false), 5);
                                        break;
                                    case 2:
                                        z6 = lhaVar.C();
                                        break;
                                    case 3:
                                        String T = lhaVar.T();
                                        T.getClass();
                                        switch (T.hashCode()) {
                                            case 97:
                                                if (T.equals("a")) {
                                                    c3 = 0;
                                                    break;
                                                }
                                                c3 = 65535;
                                                break;
                                            case 105:
                                                if (T.equals(i.a)) {
                                                    c3 = 1;
                                                    break;
                                                }
                                                c3 = 65535;
                                                break;
                                            case 110:
                                                if (T.equals(C4427z5.q)) {
                                                    c3 = 2;
                                                    break;
                                                }
                                                c3 = 65535;
                                                break;
                                            case INVALID_INDEX_URL_VALUE:
                                                if (T.equals("s")) {
                                                    c3 = 3;
                                                    break;
                                                }
                                                c3 = 65535;
                                                break;
                                            default:
                                                c3 = 65535;
                                                break;
                                        }
                                        switch (c3) {
                                            case 0:
                                                i7 = 1;
                                                break;
                                            case 1:
                                                plbVar.a("Animation contains intersect masks. They are not supported but will be treated like add masks.");
                                                i7 = 3;
                                                break;
                                            case 2:
                                                i7 = 4;
                                                break;
                                            case 3:
                                                i7 = 2;
                                                break;
                                            default:
                                                ajb.b("Unknown mask mode " + E0 + ". Defaulting to Add.");
                                                i7 = 1;
                                                break;
                                        }
                                        break;
                                    default:
                                        lhaVar.g0();
                                        break;
                                }
                            }
                            lhaVar.n();
                            arrayList.add(new jvb(i7, r50Var3, r50Var4, z6));
                        }
                        plbVar.p += arrayList.size();
                        lhaVar.m();
                        valueOf = f;
                        str5 = str2;
                        z5 = z2;
                        j4 = j;
                    case 11:
                        f = valueOf;
                        str2 = str5;
                        z2 = z5;
                        j = j4;
                        lhaVar.h();
                        while (lhaVar.t()) {
                            gp3 a2 = hp3.a(lhaVar, plbVar);
                            if (a2 != null) {
                                arrayList2.add(a2);
                            }
                        }
                        lhaVar.m();
                        valueOf = f;
                        str5 = str2;
                        z5 = z2;
                        j4 = j;
                    case 12:
                        f3 = valueOf;
                        str3 = str5;
                        lhaVar.k();
                        while (lhaVar.t()) {
                            int e0 = lhaVar.e0(b);
                            if (e0 == 0) {
                                j2 = j4;
                                r50Var2 = new r50(qja.a(lhaVar, plbVar, vik.c(), r65.a, false), 6);
                            } else if (e0 != 1) {
                                lhaVar.f0();
                                lhaVar.g0();
                            } else {
                                lhaVar.h();
                                if (lhaVar.t()) {
                                    wj9 wj9Var = w50.a;
                                    lhaVar.k();
                                    p03 p03Var2 = null;
                                    mbd mbdVar = null;
                                    while (lhaVar.t()) {
                                        int e02 = lhaVar.e0(w50.a);
                                        if (e02 != 0) {
                                            boolean z7 = true;
                                            if (e02 != 1) {
                                                lhaVar.f0();
                                                lhaVar.g0();
                                            } else {
                                                lhaVar.k();
                                                r50 r50Var5 = null;
                                                r50 r50Var6 = null;
                                                s50 s50Var6 = null;
                                                s50 s50Var7 = null;
                                                r50 r50Var7 = null;
                                                while (lhaVar.t()) {
                                                    int e03 = lhaVar.e0(w50.c);
                                                    if (e03 == 0) {
                                                        r50Var5 = un0.B(lhaVar, plbVar);
                                                    } else if (e03 == z7) {
                                                        r50Var6 = un0.B(lhaVar, plbVar);
                                                    } else if (e03 == 2) {
                                                        s50Var6 = un0.C(lhaVar, plbVar, z7);
                                                    } else if (e03 == 3) {
                                                        s50Var7 = un0.C(lhaVar, plbVar, z7);
                                                    } else if (e03 != 4) {
                                                        lhaVar.f0();
                                                        lhaVar.g0();
                                                    } else {
                                                        r50Var7 = un0.E(lhaVar, plbVar);
                                                    }
                                                    z7 = true;
                                                }
                                                lhaVar.n();
                                                p03Var2 = new p03(r50Var5, r50Var6, s50Var6, s50Var7, r50Var7, 2);
                                            }
                                        } else {
                                            lhaVar.k();
                                            int i8 = 0;
                                            r50 r50Var8 = null;
                                            r50 r50Var9 = null;
                                            r50 r50Var10 = null;
                                            while (lhaVar.t()) {
                                                r50 r50Var11 = r50Var8;
                                                int e04 = lhaVar.e0(w50.b);
                                                if (e04 != 0) {
                                                    boolean z8 = z5;
                                                    if (e04 == 1) {
                                                        r50Var9 = un0.E(lhaVar, plbVar);
                                                    } else if (e04 == 2) {
                                                        r50Var10 = un0.E(lhaVar, plbVar);
                                                    } else if (e04 != 3) {
                                                        lhaVar.f0();
                                                        lhaVar.g0();
                                                    } else {
                                                        int M3 = lhaVar.M();
                                                        if (M3 == 1 || M3 == 2) {
                                                            i8 = M3 == 1 ? 1 : 2;
                                                        } else {
                                                            plbVar.a("Unsupported text range units: " + M3);
                                                            r50Var8 = r50Var11;
                                                            z5 = z8;
                                                            i8 = 2;
                                                        }
                                                    }
                                                    r50Var8 = r50Var11;
                                                    z5 = z8;
                                                } else {
                                                    r50Var8 = un0.E(lhaVar, plbVar);
                                                }
                                            }
                                            r50 r50Var12 = r50Var8;
                                            boolean z9 = z5;
                                            lhaVar.n();
                                            if (r50Var12 != null || r50Var9 == null) {
                                                j3 = j4;
                                                r50Var = r50Var12;
                                            } else {
                                                j3 = j4;
                                                r50Var = new r50(Collections.singletonList(new nja(0)), 2);
                                            }
                                            mbdVar = new mbd(r50Var, r50Var9, r50Var10, i8);
                                            z5 = z9;
                                            j4 = j3;
                                        }
                                    }
                                    z3 = z5;
                                    j2 = j4;
                                    lhaVar.n();
                                    f4aVar = new f4a(p03Var2, mbdVar, false, 15);
                                } else {
                                    z3 = z5;
                                    j2 = j4;
                                }
                                while (lhaVar.t()) {
                                    lhaVar.g0();
                                }
                                lhaVar.m();
                                z5 = z3;
                            }
                            j4 = j2;
                        }
                        lhaVar.n();
                        valueOf = f3;
                        str5 = str3;
                        break;
                    case 13:
                        f3 = valueOf;
                        str3 = str5;
                        lhaVar.h();
                        ArrayList arrayList3 = new ArrayList();
                        while (lhaVar.t()) {
                            lhaVar.k();
                            while (lhaVar.t()) {
                                int e05 = lhaVar.e0(c);
                                if (e05 == 0) {
                                    int M4 = lhaVar.M();
                                    if (M4 == 29) {
                                        wj9 wj9Var2 = ry1.a;
                                        hpoVar = null;
                                        while (lhaVar.t()) {
                                            if (lhaVar.e0(ry1.a) != 0) {
                                                lhaVar.f0();
                                                lhaVar.g0();
                                            } else {
                                                lhaVar.h();
                                                while (lhaVar.t()) {
                                                    lhaVar.k();
                                                    boolean z10 = false;
                                                    hpo hpoVar2 = null;
                                                    while (lhaVar.t()) {
                                                        int e06 = lhaVar.e0(ry1.b);
                                                        if (e06 == 0) {
                                                            z10 = lhaVar.M() == 0;
                                                        } else if (e06 != 1) {
                                                            lhaVar.f0();
                                                            lhaVar.g0();
                                                        } else if (z10) {
                                                            hpoVar2 = new hpo(un0.C(lhaVar, plbVar, true));
                                                        } else {
                                                            lhaVar.g0();
                                                        }
                                                    }
                                                    lhaVar.n();
                                                    if (hpoVar2 != null) {
                                                        hpoVar = hpoVar2;
                                                    }
                                                }
                                                lhaVar.m();
                                            }
                                        }
                                    } else if (M4 == 25) {
                                        vc5 vc5Var = new vc5();
                                        while (lhaVar.t()) {
                                            if (lhaVar.e0(vc5.f) != 0) {
                                                lhaVar.f0();
                                                lhaVar.g0();
                                            } else {
                                                lhaVar.h();
                                                while (lhaVar.t()) {
                                                    lhaVar.k();
                                                    String str7 = "";
                                                    while (lhaVar.t()) {
                                                        int e07 = lhaVar.e0(vc5.g);
                                                        if (e07 == 0) {
                                                            str7 = lhaVar.T();
                                                        } else if (e07 == 1) {
                                                            str7.getClass();
                                                            switch (str7.hashCode()) {
                                                                case 353103893:
                                                                    if (str7.equals("Distance")) {
                                                                        c4 = 0;
                                                                        break;
                                                                    }
                                                                    c4 = 65535;
                                                                    break;
                                                                case 397447147:
                                                                    if (str7.equals("Opacity")) {
                                                                        c4 = 1;
                                                                        break;
                                                                    }
                                                                    c4 = 65535;
                                                                    break;
                                                                case 1041377119:
                                                                    if (str7.equals("Direction")) {
                                                                        c4 = 2;
                                                                        break;
                                                                    }
                                                                    c4 = 65535;
                                                                    break;
                                                                case 1379387491:
                                                                    if (str7.equals("Shadow Color")) {
                                                                        c4 = 3;
                                                                        break;
                                                                    }
                                                                    c4 = 65535;
                                                                    break;
                                                                case 1383710113:
                                                                    if (str7.equals("Softness")) {
                                                                        c4 = 4;
                                                                        break;
                                                                    }
                                                                    c4 = 65535;
                                                                    break;
                                                                default:
                                                                    c4 = 65535;
                                                                    break;
                                                            }
                                                            switch (c4) {
                                                                case 0:
                                                                    vc5Var.d = un0.C(lhaVar, plbVar, true);
                                                                    break;
                                                                case 1:
                                                                    vc5Var.b = un0.C(lhaVar, plbVar, false);
                                                                    break;
                                                                case 2:
                                                                    vc5Var.c = un0.C(lhaVar, plbVar, false);
                                                                    break;
                                                                case 3:
                                                                    vc5Var.a = un0.B(lhaVar, plbVar);
                                                                    break;
                                                                case 4:
                                                                    vc5Var.e = un0.C(lhaVar, plbVar, true);
                                                                    break;
                                                                default:
                                                                    lhaVar.g0();
                                                                    break;
                                                            }
                                                        } else {
                                                            lhaVar.f0();
                                                            lhaVar.g0();
                                                        }
                                                    }
                                                    lhaVar.n();
                                                }
                                                lhaVar.m();
                                            }
                                        }
                                        r50 r50Var13 = vc5Var.a;
                                        p03Var = (r50Var13 == null || (s50Var = vc5Var.b) == null || (s50Var2 = vc5Var.c) == null || (s50Var3 = vc5Var.d) == null || (s50Var4 = vc5Var.e) == null) ? null : new p03(r50Var13, s50Var, s50Var2, s50Var3, s50Var4, 7);
                                    }
                                } else if (e05 != 1) {
                                    lhaVar.f0();
                                    lhaVar.g0();
                                } else {
                                    arrayList3.add(lhaVar.T());
                                }
                            }
                            lhaVar.n();
                        }
                        lhaVar.m();
                        plbVar.a("Lottie doesn't support layer effects. If you are using them for  fills, strokes, trim paths etc. then try adding them directly as contents  in your shape. Found: " + arrayList3);
                        valueOf = f3;
                        str5 = str3;
                        break;
                    case 14:
                        f3 = valueOf;
                        str3 = str5;
                        f9 = (float) lhaVar.H();
                        valueOf = f3;
                        str5 = str3;
                    case 15:
                        f3 = valueOf;
                        str3 = str5;
                        f8 = (float) lhaVar.H();
                        valueOf = f3;
                        str5 = str3;
                    case 16:
                        f3 = valueOf;
                        str3 = str5;
                        f6 = (float) (lhaVar.H() * vik.c());
                        valueOf = f3;
                        str5 = str3;
                    case 17:
                        f3 = valueOf;
                        str3 = str5;
                        f7 = (float) (lhaVar.H() * vik.c());
                        valueOf = f3;
                        str5 = str3;
                    case 18:
                        f4 = (float) lhaVar.H();
                    case 19:
                        f5 = (float) lhaVar.H();
                    case 20:
                        s50Var5 = un0.C(lhaVar, plbVar, false);
                    case 21:
                        str5 = lhaVar.T();
                    case 22:
                        z4 = lhaVar.C();
                    case 23:
                        if (lhaVar.M() == 1) {
                            z5 = true;
                        }
                        break;
                    case 24:
                        int M5 = lhaVar.M();
                        if (M5 >= wt3.D(18).length) {
                            plbVar.a("Unsupported Blend Mode: " + M5);
                            i6 = 1;
                        } else {
                            i6 = wt3.D(18)[M5];
                        }
                    default:
                        lhaVar.f0();
                        lhaVar.g0();
                        f = valueOf;
                        str2 = str5;
                        z2 = z5;
                        j = j4;
                        valueOf = f;
                        str5 = str2;
                        z5 = z2;
                        j4 = j;
                }
                while (lhaVar.t()) {
                }
            }
            Float f10 = valueOf;
            String str8 = str5;
            boolean z11 = z5;
            long j6 = j4;
            lhaVar.n();
            ArrayList arrayList4 = new ArrayList();
            if (f4 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                str = str8;
                z = z11;
                arrayList4.add(new nja(plbVar, f10, f10, (Interpolator) null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, Float.valueOf(f4)));
            } else {
                str = str8;
                z = z11;
            }
            if (f5 <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                f5 = plbVar.m;
            }
            arrayList4.add(new nja(plbVar, valueOf2, valueOf2, (Interpolator) null, f4, Float.valueOf(f5)));
            arrayList4.add(new nja(plbVar, f10, f10, (Interpolator) null, f5, Float.valueOf(Float.MAX_VALUE)));
            if (str6.endsWith(".ai") || "ai".equals(str)) {
                plbVar.a("Convert your Illustrator layers to shape layers.");
            }
            if (z) {
                x50 x50Var3 = x50Var2 == null ? new x50() : x50Var2;
                x50Var3.m = z;
                x50Var = x50Var3;
            } else {
                x50Var = x50Var2;
            }
            return new mla(arrayList2, plbVar, str6, j5, i, j6, str4, arrayList, x50Var, i2, i3, i4, f9, f8, f6, f7, r50Var2, f4aVar, arrayList4, i5, s50Var5, z4, hpoVar, p03Var, i6);
        }
    }
}
