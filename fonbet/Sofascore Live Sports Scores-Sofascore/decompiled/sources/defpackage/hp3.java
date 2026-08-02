package defpackage;

import android.graphics.Path;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.mbridge.msdk.foundation.entity.b;
import com.vungle.ads.internal.task.g;
import java.util.ArrayList;
import java.util.Collections;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract class hp3 {
    public static final wj9 a = wj9.J("ty", "d");

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0772 A[LOOP:1: B:27:0x076c->B:29:0x0772, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static gp3 a(lha lhaVar, plb plbVar) {
        String str;
        char c;
        gp3 yu2Var;
        gp3 dbhVar;
        gp3 fbhVar;
        gp3 c29Var;
        int i;
        int i2;
        char c2;
        lhaVar.k();
        int i3 = 2;
        while (true) {
            if (!lhaVar.t()) {
                str = null;
                break;
            }
            int e0 = lhaVar.e0(a);
            if (e0 == 0) {
                str = lhaVar.T();
                break;
            }
            if (e0 != 1) {
                lhaVar.f0();
                lhaVar.g0();
            } else {
                i3 = lhaVar.M();
            }
        }
        if (str == null) {
            return null;
        }
        boolean z = false;
        boolean z2 = false;
        int i4 = 0;
        int i5 = 3;
        switch (str.hashCode()) {
            case 3239:
                if (str.equals("el")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 3270:
                if (str.equals("fl")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 3295:
                if (str.equals("gf")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 3307:
                if (str.equals("gr")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 3308:
                if (str.equals("gs")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 3488:
                if (str.equals("mm")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case 3633:
                if (str.equals(DownloadCommon.DOWNLOAD_REPORT_RETRY_COUNT)) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case 3634:
                if (str.equals("rd")) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case 3646:
                if (str.equals("rp")) {
                    c = '\b';
                    break;
                }
                c = 65535;
                break;
            case 3669:
                if (str.equals(b.JSON_KEY_SH)) {
                    c = '\t';
                    break;
                }
                c = 65535;
                break;
            case 3679:
                if (str.equals("sr")) {
                    c = '\n';
                    break;
                }
                c = 65535;
                break;
            case 3681:
                if (str.equals("st")) {
                    c = 11;
                    break;
                }
                c = 65535;
                break;
            case 3705:
                if (str.equals("tm")) {
                    c = '\f';
                    break;
                }
                c = 65535;
                break;
            case 3710:
                if (str.equals("tr")) {
                    c = '\r';
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        switch (c) {
            case 0:
                wj9 wj9Var = zu2.a;
                boolean z3 = i3 == 3;
                boolean z4 = false;
                String str2 = null;
                z50 z50Var = null;
                r50 r50Var = null;
                while (lhaVar.t()) {
                    int e02 = lhaVar.e0(zu2.a);
                    if (e02 == 0) {
                        str2 = lhaVar.T();
                    } else if (e02 == 1) {
                        z50Var = u50.b(lhaVar, plbVar);
                    } else if (e02 == 2) {
                        r50Var = un0.F(lhaVar, plbVar);
                    } else if (e02 == 3) {
                        z4 = lhaVar.C();
                    } else if (e02 != 4) {
                        lhaVar.f0();
                        lhaVar.g0();
                    } else {
                        z3 = lhaVar.M() == 3;
                    }
                }
                yu2Var = new yu2(str2, z50Var, r50Var, z3, z4);
                dbhVar = yu2Var;
                while (lhaVar.t()) {
                    lhaVar.g0();
                }
                lhaVar.n();
                return dbhVar;
            case 1:
                wj9 wj9Var2 = ebh.a;
                int i6 = 1;
                boolean z5 = false;
                boolean z6 = false;
                r50 r50Var2 = null;
                String str3 = null;
                r50 r50Var3 = null;
                while (lhaVar.t()) {
                    int e03 = lhaVar.e0(ebh.a);
                    if (e03 == 0) {
                        str3 = lhaVar.T();
                    } else if (e03 == 1) {
                        r50Var3 = un0.B(lhaVar, plbVar);
                    } else if (e03 == 2) {
                        r50Var2 = un0.E(lhaVar, plbVar);
                    } else if (e03 == 3) {
                        z5 = lhaVar.C();
                    } else if (e03 == 4) {
                        i6 = lhaVar.M();
                    } else if (e03 != 5) {
                        lhaVar.f0();
                        lhaVar.g0();
                    } else {
                        z6 = lhaVar.C();
                    }
                }
                if (r50Var2 == null) {
                    r50Var2 = new r50(Collections.singletonList(new nja(100)), 2);
                }
                dbhVar = new dbh(str3, z5, i6 == 1 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD, r50Var3, r50Var2, z6);
                while (lhaVar.t()) {
                }
                lhaVar.n();
                return dbhVar;
            case 2:
                wj9 wj9Var3 = b29.a;
                Path.FillType fillType = Path.FillType.WINDING;
                int i7 = 0;
                boolean z7 = false;
                r50 r50Var4 = null;
                String str4 = null;
                r50 r50Var5 = null;
                r50 r50Var6 = null;
                r50 r50Var7 = null;
                while (lhaVar.t()) {
                    switch (lhaVar.e0(b29.a)) {
                        case 0:
                            str4 = lhaVar.T();
                            break;
                        case 1:
                            lhaVar.k();
                            int i8 = -1;
                            while (lhaVar.t()) {
                                int e04 = lhaVar.e0(b29.b);
                                if (e04 == 0) {
                                    i8 = lhaVar.M();
                                } else if (e04 != 1) {
                                    lhaVar.f0();
                                    lhaVar.g0();
                                } else {
                                    r50Var5 = un0.D(lhaVar, plbVar, i8);
                                }
                            }
                            lhaVar.n();
                            break;
                        case 2:
                            r50Var4 = un0.E(lhaVar, plbVar);
                            break;
                        case 3:
                            if (lhaVar.M() != 1) {
                                i7 = 2;
                                break;
                            } else {
                                i7 = 1;
                                break;
                            }
                        case 4:
                            r50Var6 = un0.F(lhaVar, plbVar);
                            break;
                        case 5:
                            r50Var7 = un0.F(lhaVar, plbVar);
                            break;
                        case 6:
                            fillType = lhaVar.M() == 1 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD;
                            break;
                        case 7:
                            z7 = lhaVar.C();
                            break;
                        default:
                            lhaVar.f0();
                            lhaVar.g0();
                            break;
                    }
                }
                if (r50Var4 == null) {
                    r50Var4 = new r50(Collections.singletonList(new nja(100)), 2);
                }
                dbhVar = new z19(str4, i7, fillType, r50Var5, r50Var4, r50Var6, r50Var7, z7);
                while (lhaVar.t()) {
                }
                lhaVar.n();
                return dbhVar;
            case 3:
                wj9 wj9Var4 = gbh.a;
                ArrayList arrayList = new ArrayList();
                String str5 = null;
                while (lhaVar.t()) {
                    int e05 = lhaVar.e0(gbh.a);
                    if (e05 == 0) {
                        str5 = lhaVar.T();
                    } else if (e05 == 1) {
                        z = lhaVar.C();
                    } else if (e05 != 2) {
                        lhaVar.g0();
                    } else {
                        lhaVar.h();
                        while (lhaVar.t()) {
                            gp3 a2 = a(lhaVar, plbVar);
                            if (a2 != null) {
                                arrayList.add(a2);
                            }
                        }
                        lhaVar.m();
                    }
                }
                fbhVar = new fbh(str5, arrayList, z);
                dbhVar = fbhVar;
                while (lhaVar.t()) {
                }
                lhaVar.n();
                return dbhVar;
            case 4:
                wj9 wj9Var5 = e29.a;
                ArrayList arrayList2 = new ArrayList();
                int i9 = 0;
                int i10 = 0;
                int i11 = 0;
                boolean z8 = false;
                r50 r50Var8 = null;
                String str6 = null;
                r50 r50Var9 = null;
                r50 r50Var10 = null;
                r50 r50Var11 = null;
                s50 s50Var = null;
                s50 s50Var2 = null;
                float f = 0.0f;
                while (lhaVar.t()) {
                    switch (lhaVar.e0(e29.a)) {
                        case 0:
                            str6 = lhaVar.T();
                            break;
                        case 1:
                            lhaVar.k();
                            int i12 = -1;
                            while (lhaVar.t()) {
                                int e06 = lhaVar.e0(e29.b);
                                if (e06 == 0) {
                                    i12 = lhaVar.M();
                                } else if (e06 != 1) {
                                    lhaVar.f0();
                                    lhaVar.g0();
                                } else {
                                    r50Var9 = un0.D(lhaVar, plbVar, i12);
                                }
                            }
                            lhaVar.n();
                            break;
                        case 2:
                            r50Var8 = un0.E(lhaVar, plbVar);
                            break;
                        case 3:
                            if (lhaVar.M() != 1) {
                                i9 = 2;
                                break;
                            } else {
                                i9 = 1;
                                break;
                            }
                        case 4:
                            r50Var10 = un0.F(lhaVar, plbVar);
                            break;
                        case 5:
                            r50Var11 = un0.F(lhaVar, plbVar);
                            break;
                        case 6:
                            s50Var = un0.C(lhaVar, plbVar, true);
                            break;
                        case 7:
                            i10 = wt3.D(3)[lhaVar.M() - 1];
                            break;
                        case 8:
                            i11 = wt3.D(3)[lhaVar.M() - 1];
                            break;
                        case 9:
                            f = (float) lhaVar.H();
                            break;
                        case 10:
                            z8 = lhaVar.C();
                            break;
                        case 11:
                            lhaVar.h();
                            while (lhaVar.t()) {
                                lhaVar.k();
                                String str7 = null;
                                s50 s50Var3 = null;
                                while (lhaVar.t()) {
                                    int e07 = lhaVar.e0(e29.c);
                                    if (e07 == 0) {
                                        str7 = lhaVar.T();
                                    } else if (e07 != 1) {
                                        lhaVar.f0();
                                        lhaVar.g0();
                                    } else {
                                        s50Var3 = un0.C(lhaVar, plbVar, true);
                                    }
                                }
                                lhaVar.n();
                                if (str7.equals("o")) {
                                    s50Var2 = s50Var3;
                                } else if (str7.equals("d") || str7.equals(g.e)) {
                                    plbVar.o = true;
                                    arrayList2.add(s50Var3);
                                }
                            }
                            lhaVar.m();
                            if (arrayList2.size() != 1) {
                                break;
                            } else {
                                arrayList2.add((s50) arrayList2.get(0));
                                break;
                            }
                            break;
                        default:
                            lhaVar.f0();
                            lhaVar.g0();
                            break;
                    }
                }
                if (r50Var8 == null) {
                    r50Var8 = new r50(Collections.singletonList(new nja(100)), 2);
                }
                c29Var = new c29(str6, i9, r50Var9, r50Var8, r50Var10, r50Var11, s50Var, i10, i11, f, arrayList2, s50Var2, z8);
                dbhVar = c29Var;
                while (lhaVar.t()) {
                }
                lhaVar.n();
                return dbhVar;
            case 5:
                wj9 wj9Var6 = ggc.a;
                boolean z9 = false;
                String str8 = null;
                while (lhaVar.t()) {
                    int e08 = lhaVar.e0(ggc.a);
                    if (e08 == 0) {
                        str8 = lhaVar.T();
                    } else if (e08 == 1) {
                        int M = lhaVar.M();
                        if (M != 1) {
                            if (M == 2) {
                                i4 = 2;
                            } else if (M == 3) {
                                i4 = 3;
                            } else if (M == 4) {
                                i4 = 4;
                            } else if (M == 5) {
                                i4 = 5;
                            }
                        }
                        i4 = 1;
                    } else if (e08 != 2) {
                        lhaVar.f0();
                        lhaVar.g0();
                    } else {
                        z9 = lhaVar.C();
                    }
                }
                egc egcVar = new egc(str8, i4, z9);
                plbVar.a("Animation contains merge paths. Merge paths are only supported on KitKat+ and must be manually enabled by calling enableMergePathsForKitKatAndAbove().");
                dbhVar = egcVar;
                while (lhaVar.t()) {
                }
                lhaVar.n();
                return dbhVar;
            case 6:
                wj9 wj9Var7 = tqf.a;
                boolean z10 = false;
                String str9 = null;
                z50 z50Var2 = null;
                r50 r50Var12 = null;
                s50 s50Var4 = null;
                while (lhaVar.t()) {
                    int e09 = lhaVar.e0(tqf.a);
                    if (e09 == 0) {
                        str9 = lhaVar.T();
                    } else if (e09 == 1) {
                        z50Var2 = u50.b(lhaVar, plbVar);
                    } else if (e09 == 2) {
                        r50Var12 = un0.F(lhaVar, plbVar);
                    } else if (e09 == 3) {
                        s50Var4 = un0.C(lhaVar, plbVar, true);
                    } else if (e09 != 4) {
                        lhaVar.g0();
                    } else {
                        z10 = lhaVar.C();
                    }
                }
                c29Var = new sqf(str9, z50Var2, r50Var12, s50Var4, z10);
                dbhVar = c29Var;
                while (lhaVar.t()) {
                }
                lhaVar.n();
                return dbhVar;
            case 7:
                wj9 wj9Var8 = s7g.a;
                String str10 = null;
                s50 s50Var5 = null;
                while (lhaVar.t()) {
                    int e010 = lhaVar.e0(s7g.a);
                    if (e010 == 0) {
                        str10 = lhaVar.T();
                    } else if (e010 == 1) {
                        s50Var5 = un0.C(lhaVar, plbVar, true);
                    } else if (e010 != 2) {
                        lhaVar.g0();
                    } else {
                        z2 = lhaVar.C();
                    }
                }
                if (!z2) {
                    dbhVar = new q7g(str10, s50Var5);
                    while (lhaVar.t()) {
                    }
                    lhaVar.n();
                    return dbhVar;
                }
                dbhVar = null;
                while (lhaVar.t()) {
                }
                lhaVar.n();
                return dbhVar;
            case '\b':
                wj9 wj9Var9 = gzf.a;
                boolean z11 = false;
                String str11 = null;
                s50 s50Var6 = null;
                s50 s50Var7 = null;
                x50 x50Var = null;
                while (lhaVar.t()) {
                    int e011 = lhaVar.e0(gzf.a);
                    if (e011 == 0) {
                        str11 = lhaVar.T();
                    } else if (e011 == 1) {
                        s50Var6 = un0.C(lhaVar, plbVar, false);
                    } else if (e011 == 2) {
                        s50Var7 = un0.C(lhaVar, plbVar, false);
                    } else if (e011 == 3) {
                        x50Var = y50.c(lhaVar, plbVar);
                    } else if (e011 != 4) {
                        lhaVar.g0();
                    } else {
                        z11 = lhaVar.C();
                    }
                }
                c29Var = new sqf(str11, s50Var6, s50Var7, x50Var, z11);
                dbhVar = c29Var;
                while (lhaVar.t()) {
                }
                lhaVar.n();
                return dbhVar;
            case '\t':
                wj9 wj9Var10 = ubh.a;
                int i13 = 0;
                boolean z12 = false;
                r50 r50Var13 = null;
                String str12 = null;
                while (lhaVar.t()) {
                    int e012 = lhaVar.e0(ubh.a);
                    if (e012 == 0) {
                        str12 = lhaVar.T();
                    } else if (e012 == 1) {
                        i13 = lhaVar.M();
                    } else if (e012 == 2) {
                        r50Var13 = new r50(qja.a(lhaVar, plbVar, vik.c(), bbh.a, false), 5);
                    } else if (e012 != 3) {
                        lhaVar.g0();
                    } else {
                        z12 = lhaVar.C();
                    }
                }
                fbhVar = new tbh(str12, i13, r50Var13, z12);
                dbhVar = fbhVar;
                while (lhaVar.t()) {
                }
                lhaVar.n();
                return dbhVar;
            case '\n':
                wj9 wj9Var11 = d0f.a;
                boolean z13 = i3 == 3;
                int i14 = 0;
                boolean z14 = false;
                String str13 = null;
                s50 s50Var8 = null;
                z50 z50Var3 = null;
                s50 s50Var9 = null;
                s50 s50Var10 = null;
                s50 s50Var11 = null;
                s50 s50Var12 = null;
                s50 s50Var13 = null;
                while (lhaVar.t()) {
                    switch (lhaVar.e0(d0f.a)) {
                        case 0:
                            str13 = lhaVar.T();
                            break;
                        case 1:
                            int M2 = lhaVar.M();
                            int[] D = wt3.D(2);
                            int length = D.length;
                            int i15 = 0;
                            while (true) {
                                if (i15 >= length) {
                                    i14 = 0;
                                    break;
                                } else {
                                    int i16 = D[i15];
                                    if (i16 == 1) {
                                        i = 1;
                                    } else {
                                        if (i16 != 2) {
                                            throw null;
                                        }
                                        i = 2;
                                    }
                                    if (i == M2) {
                                        i14 = i16;
                                        break;
                                    } else {
                                        i15++;
                                    }
                                }
                            }
                        case 2:
                            s50Var8 = un0.C(lhaVar, plbVar, false);
                            break;
                        case 3:
                            z50Var3 = u50.b(lhaVar, plbVar);
                            break;
                        case 4:
                            s50Var9 = un0.C(lhaVar, plbVar, false);
                            break;
                        case 5:
                            s50Var11 = un0.C(lhaVar, plbVar, true);
                            break;
                        case 6:
                            s50Var13 = un0.C(lhaVar, plbVar, false);
                            break;
                        case 7:
                            s50Var10 = un0.C(lhaVar, plbVar, true);
                            break;
                        case 8:
                            s50Var12 = un0.C(lhaVar, plbVar, false);
                            break;
                        case 9:
                            z14 = lhaVar.C();
                            break;
                        case 10:
                            if (lhaVar.M() != 3) {
                                z13 = false;
                                break;
                            } else {
                                z13 = true;
                                break;
                            }
                        default:
                            lhaVar.f0();
                            lhaVar.g0();
                            break;
                    }
                }
                c29Var = new c0f(str13, i14, s50Var8, z50Var3, s50Var9, s50Var10, s50Var11, s50Var12, s50Var13, z14, z13);
                dbhVar = c29Var;
                while (lhaVar.t()) {
                }
                lhaVar.n();
                return dbhVar;
            case 11:
                wj9 wj9Var12 = wbh.a;
                ArrayList arrayList3 = new ArrayList();
                int i17 = 0;
                int i18 = 0;
                boolean z15 = false;
                r50 r50Var14 = null;
                String str14 = null;
                s50 s50Var14 = null;
                r50 r50Var15 = null;
                s50 s50Var15 = null;
                float f2 = 0.0f;
                while (lhaVar.t()) {
                    switch (lhaVar.e0(wbh.a)) {
                        case 0:
                            str14 = lhaVar.T();
                            continue;
                        case 1:
                            r50Var15 = un0.B(lhaVar, plbVar);
                            continue;
                        case 2:
                            s50Var15 = un0.C(lhaVar, plbVar, true);
                            continue;
                        case 3:
                            r50Var14 = un0.E(lhaVar, plbVar);
                            continue;
                        case 4:
                            i17 = wt3.D(i5)[lhaVar.M() - 1];
                            continue;
                        case 5:
                            i18 = wt3.D(i5)[lhaVar.M() - 1];
                            continue;
                        case 6:
                            i2 = i5;
                            f2 = (float) lhaVar.H();
                            break;
                        case 7:
                            z15 = lhaVar.C();
                            continue;
                        case 8:
                            lhaVar.h();
                            while (lhaVar.t()) {
                                lhaVar.k();
                                s50 s50Var16 = null;
                                String str15 = null;
                                while (lhaVar.t()) {
                                    int i19 = i5;
                                    int e013 = lhaVar.e0(wbh.b);
                                    if (e013 == 0) {
                                        str15 = lhaVar.T();
                                    } else if (e013 != 1) {
                                        lhaVar.f0();
                                        lhaVar.g0();
                                    } else {
                                        s50Var16 = un0.C(lhaVar, plbVar, true);
                                    }
                                    i5 = i19;
                                }
                                int i20 = i5;
                                lhaVar.n();
                                str15.getClass();
                                switch (str15.hashCode()) {
                                    case 100:
                                        if (str15.equals("d")) {
                                            c2 = 0;
                                            break;
                                        }
                                        c2 = 65535;
                                        break;
                                    case 103:
                                        if (str15.equals(g.e)) {
                                            c2 = 1;
                                            break;
                                        }
                                        c2 = 65535;
                                        break;
                                    case 111:
                                        if (str15.equals("o")) {
                                            c2 = 2;
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
                                    case 1:
                                        plbVar.o = true;
                                        arrayList3.add(s50Var16);
                                        break;
                                    case 2:
                                        s50Var14 = s50Var16;
                                        break;
                                }
                                i5 = i20;
                            }
                            i2 = i5;
                            lhaVar.m();
                            if (arrayList3.size() == 1) {
                                arrayList3.add((s50) arrayList3.get(0));
                                break;
                            }
                            break;
                        default:
                            lhaVar.g0();
                            continue;
                    }
                    i5 = i2;
                }
                if (r50Var14 == null) {
                    r50Var14 = new r50(Collections.singletonList(new nja(100)), 2);
                }
                dbhVar = new vbh(str14, s50Var14, arrayList3, r50Var15, r50Var14, s50Var15, i17 == 0 ? 1 : i17, i18 == 0 ? 1 : i18, f2, z15);
                while (lhaVar.t()) {
                }
                lhaVar.n();
                return dbhVar;
            case '\f':
                wj9 wj9Var13 = zbh.a;
                int i21 = 0;
                boolean z16 = false;
                String str16 = null;
                s50 s50Var17 = null;
                s50 s50Var18 = null;
                s50 s50Var19 = null;
                while (lhaVar.t()) {
                    int e014 = lhaVar.e0(zbh.a);
                    if (e014 == 0) {
                        s50Var17 = un0.C(lhaVar, plbVar, false);
                    } else if (e014 == 1) {
                        s50Var18 = un0.C(lhaVar, plbVar, false);
                    } else if (e014 == 2) {
                        s50Var19 = un0.C(lhaVar, plbVar, false);
                    } else if (e014 == 3) {
                        str16 = lhaVar.T();
                    } else if (e014 == 4) {
                        int M3 = lhaVar.M();
                        if (M3 == 1) {
                            i21 = 1;
                        } else {
                            if (M3 != 2) {
                                a70.p(ljg.j(M3, "Unknown trim path type "));
                                return null;
                            }
                            i21 = 2;
                        }
                    } else if (e014 != 5) {
                        lhaVar.g0();
                    } else {
                        z16 = lhaVar.C();
                    }
                }
                yu2Var = new ybh(str16, i21, s50Var17, s50Var18, s50Var19, z16);
                dbhVar = yu2Var;
                while (lhaVar.t()) {
                }
                lhaVar.n();
                return dbhVar;
            case '\r':
                dbhVar = y50.c(lhaVar, plbVar);
                while (lhaVar.t()) {
                }
                lhaVar.n();
                return dbhVar;
            default:
                ajb.b("Unknown shape type ".concat(str));
                dbhVar = null;
                while (lhaVar.t()) {
                }
                lhaVar.n();
                return dbhVar;
        }
    }
}
