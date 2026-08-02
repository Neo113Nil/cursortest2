package defpackage;

import android.content.Context;
import androidx.core.app.NotificationCompat;
import com.ironsource.mediationsdk.metadata.a;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.sofascore.model.mvvm.model.ServerType;
import com.sofascore.results.R;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public abstract class r5i {
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0109, code lost:
    
        if (r0 == defpackage.nf3.a) goto L63;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x02ec  */
    /* JADX WARN: Removed duplicated region for block: B:51:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x02df  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(zmd zmdVar, xtc xtcVar, boolean z, Function2 function2, of3 of3Var, int i, int i2) {
        xtc xtcVar2;
        int i3;
        boolean z2;
        int i4;
        Function2 function22;
        xtc xtcVar3;
        boolean z3;
        eqf u;
        xtc xtcVar4;
        boolean z4;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-1821667666);
        int i5 = (av8Var.i(zmdVar) ? 4 : 2) | i;
        int i6 = i2 & 2;
        if (i6 != 0) {
            i5 |= 48;
        } else if ((i & 48) == 0) {
            xtcVar2 = xtcVar;
            i5 |= av8Var.g(xtcVar2) ? 32 : 16;
            i3 = i2 & 4;
            if (i3 == 0) {
                i5 |= 384;
            } else if ((i & 384) == 0) {
                z2 = z;
                i5 |= av8Var.h(z2) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
                i4 = i2 & 8;
                if (i4 != 0) {
                    i5 |= 3072;
                } else if ((i & 3072) == 0) {
                    function22 = function2;
                    i5 |= av8Var.i(function22) ? a.o : 1024;
                    if (av8Var.T(i5 & 1, (i5 & 1171) == 1170)) {
                        av8Var.W();
                        xtcVar3 = xtcVar2;
                        z3 = z2;
                    } else {
                        utc utcVar = utc.a;
                        if (i6 != 0) {
                            xtcVar2 = utcVar;
                        }
                        boolean z5 = i3 != 0 ? true : z2;
                        if (i4 != 0) {
                            function22 = u6h.d;
                        }
                        Context context = (Context) av8Var.k(nz.b);
                        ng0 ng0Var = new ng0(8.0f, true, new a70(6));
                        lv1 lv1Var = uxf.m;
                        l8g a = k8g.a(ng0Var, lv1Var, av8Var, 54);
                        int hashCode = Long.hashCode(av8Var.T);
                        aee m = av8Var.m();
                        xtc C = fqj.C(av8Var, xtcVar2);
                        if3.k7.getClass();
                        zg3 zg3Var = hf3.b;
                        av8Var.h0();
                        if (av8Var.S) {
                            av8Var.l(zg3Var);
                        } else {
                            av8Var.q0();
                        }
                        f50 f50Var = hf3.g;
                        waa.K(av8Var, a, f50Var);
                        ff3 ff3Var = hf3.f;
                        waa.K(av8Var, m, ff3Var);
                        Integer valueOf = Integer.valueOf(hashCode);
                        f50 f50Var2 = hf3.j;
                        waa.K(av8Var, valueOf, f50Var2);
                        ry ryVar = hf3.k;
                        waa.J(av8Var, ryVar);
                        f50 f50Var3 = hf3.d;
                        waa.K(av8Var, C, f50Var3);
                        int i7 = zmdVar.a;
                        xtc l = bkh.l(utcVar, 40.0f);
                        boolean i8 = av8Var.i(context) | av8Var.i(zmdVar);
                        int i9 = i5;
                        Object O = av8Var.O();
                        if (i8) {
                            xtcVar4 = l;
                        } else {
                            xtcVar4 = l;
                        }
                        O = new q5i(context, zmdVar, 2);
                        av8Var.n0(O);
                        Function2 function23 = function22;
                        boolean z6 = z5;
                        xtc xtcVar5 = xtcVar2;
                        td4.J(i7, 0, av8Var, tol.y(xtcVar4, false, false, false, 0L, null, (Function0) O, av8Var, 29));
                        xtc z7 = new goa(1.0f, true).z(new nok(lv1Var));
                        u23 a2 = t23.a(new ng0(4.0f, true, new a70(6)), uxf.o, av8Var, 6);
                        int hashCode2 = Long.hashCode(av8Var.T);
                        aee m2 = av8Var.m();
                        xtc C2 = fqj.C(av8Var, z7);
                        av8Var.h0();
                        if (av8Var.S) {
                            av8Var.l(zg3Var);
                        } else {
                            av8Var.q0();
                        }
                        waa.K(av8Var, a2, f50Var);
                        waa.K(av8Var, m2, ff3Var);
                        bf3.s(hashCode2, av8Var, f50Var2, av8Var, ryVar);
                        waa.K(av8Var, C2, f50Var3);
                        yf8 yf8Var = xth.a;
                        dfj e = xth.e();
                        long D = lz.D(R.color.n_lv_1, av8Var);
                        String str = zmdVar.b;
                        if (str == null) {
                            str = "";
                        }
                        udj.c(str, null, D, null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, e, av8Var, 0, 0, 131066);
                        av8Var = av8Var;
                        zmd zmdVar2 = zmdVar.c;
                        if (zmdVar2 == null) {
                            av8Var.d0(-1273810933);
                            av8Var.s(false);
                            z4 = true;
                        } else {
                            av8Var.d0(-1273810932);
                            l8g a3 = k8g.a(new ng0(8.0f, true, new a70(6)), uxf.l, av8Var, 6);
                            int hashCode3 = Long.hashCode(av8Var.T);
                            aee m3 = av8Var.m();
                            xtc C3 = fqj.C(av8Var, utcVar);
                            av8Var.h0();
                            if (av8Var.S) {
                                av8Var.l(zg3Var);
                            } else {
                                av8Var.q0();
                            }
                            waa.K(av8Var, a3, f50Var);
                            waa.K(av8Var, m3, ff3Var);
                            bf3.s(hashCode3, av8Var, f50Var2, av8Var, ryVar);
                            waa.K(av8Var, C3, f50Var3);
                            if (z6) {
                                av8Var.d0(-573234275);
                                td4.G(zmdVar2.a, bkh.l(utcVar, 16.0f), false, 0L, av8Var, 48, 12);
                                av8Var.s(false);
                            } else {
                                av8Var.d0(-573015167);
                                av8Var.s(false);
                            }
                            dfj b = xth.b();
                            long D2 = lz.D(R.color.n_lv_3, av8Var);
                            String str2 = zmdVar2.b;
                            udj.c(str2 == null ? "" : str2, null, D2, null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, b, av8Var, 0, 0, 131066);
                            av8Var = av8Var;
                            z4 = true;
                            av8Var.s(true);
                            av8Var.s(false);
                        }
                        av8Var.s(z4);
                        function22 = function23;
                        me4.l((i9 >> 9) & 14, function22, av8Var, z4);
                        z3 = z6;
                        xtcVar3 = xtcVar5;
                    }
                    Function2 function24 = function22;
                    u = av8Var.u();
                    if (u == null) {
                        u.d = new vm7(zmdVar, xtcVar3, z3, function24, i, i2);
                        return;
                    }
                    return;
                }
                function22 = function2;
                if (av8Var.T(i5 & 1, (i5 & 1171) == 1170)) {
                }
                Function2 function242 = function22;
                u = av8Var.u();
                if (u == null) {
                }
            }
            z2 = z;
            i4 = i2 & 8;
            if (i4 != 0) {
            }
            function22 = function2;
            if (av8Var.T(i5 & 1, (i5 & 1171) == 1170)) {
            }
            Function2 function2422 = function22;
            u = av8Var.u();
            if (u == null) {
            }
        }
        xtcVar2 = xtcVar;
        i3 = i2 & 4;
        if (i3 == 0) {
        }
        z2 = z;
        i4 = i2 & 8;
        if (i4 != 0) {
        }
        function22 = function2;
        if (av8Var.T(i5 & 1, (i5 & 1171) == 1170)) {
        }
        Function2 function24222 = function22;
        u = av8Var.u();
        if (u == null) {
        }
    }

    public static final void b(g6i g6iVar, boolean z, vmd vmdVar, of3 of3Var, int i) {
        g6i g6iVar2;
        wxf wxfVar;
        kv1 kv1Var;
        ry ryVar;
        utc utcVar;
        znh znhVar;
        float f;
        int i2;
        p8g p8gVar;
        int i3;
        boolean z2;
        Iterator it;
        gv9 gv9Var;
        p8g p8gVar2;
        wmd wmdVar;
        old oldVar;
        wmd wmdVar2;
        lv1 lv1Var;
        znh znhVar2;
        wxf wxfVar2;
        ServerType serverType;
        v5i v5iVar;
        String a;
        float f2;
        boolean z3;
        ServerType serverType2;
        v5i v5iVar2;
        fgf fgfVar;
        ServerType serverType3;
        v5i v5iVar3;
        boolean z4;
        ServerType serverType4;
        v5i v5iVar4;
        g6i g6iVar3 = g6iVar;
        lv1 lv1Var2 = uxf.l;
        wxf wxfVar3 = ww9.b;
        lv1 lv1Var3 = uxf.m;
        kv1 kv1Var2 = uxf.o;
        g6iVar3.getClass();
        gv9 gv9Var2 = g6iVar3.e;
        old oldVar2 = g6iVar3.g;
        vmdVar.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(27644832);
        int i4 = i | (av8Var.i(g6iVar3) ? 4 : 2) | (av8Var.h(z) ? 32 : 16) | (av8Var.e(vmdVar.ordinal()) ? NotificationCompat.FLAG_LOCAL_ONLY : 128);
        if (av8Var.T(i4 & 1, (i4 & 147) != 146)) {
            Object[] objArr = new Object[0];
            int i5 = g6iVar3.a;
            r9k r9kVar = g6iVar3.b;
            gv9<r9k> gv9Var3 = g6iVar3.d;
            wmd wmdVar3 = g6iVar3.f;
            ServerType serverType5 = wmdVar3.b;
            wmd wmdVar4 = wmdVar3.h;
            String valueOf = String.valueOf(i5);
            boolean i6 = ((i4 & 112) == 32) | av8Var.i(g6iVar3);
            Object O = av8Var.O();
            a99 a99Var = nf3.a;
            if (i6 || O == a99Var) {
                O = new m1(z, g6iVar3, 7);
                av8Var.n0(O);
            }
            wmd wmdVar5 = wmdVar4;
            znh znhVar3 = (znh) o3a.L(objArr, null, valueOf, (Function0) O, av8Var, 0, 2);
            utc utcVar2 = utc.a;
            xtc b0 = l98.b0(bkh.d(utcVar2, 1.0f), 16.0f);
            u23 a2 = t23.a(ww9.d, uxf.p, av8Var, 48);
            int hashCode = Long.hashCode(av8Var.T);
            aee m = av8Var.m();
            xtc C = fqj.C(av8Var, b0);
            if3.k7.getClass();
            old oldVar3 = oldVar2;
            zg3 zg3Var = hf3.b;
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            f50 f50Var = hf3.g;
            waa.K(av8Var, a2, f50Var);
            ff3 ff3Var = hf3.f;
            waa.K(av8Var, m, ff3Var);
            Integer valueOf2 = Integer.valueOf(hashCode);
            wmd wmdVar6 = wmdVar3;
            f50 f50Var2 = hf3.j;
            waa.K(av8Var, valueOf2, f50Var2);
            ry ryVar2 = hf3.k;
            waa.J(av8Var, ryVar2);
            lv1 lv1Var4 = lv1Var2;
            f50 f50Var3 = hf3.d;
            waa.K(av8Var, C, f50Var3);
            if (r9kVar != null) {
                av8Var.d0(-97115348);
                xtc z5 = l98.f0(utcVar2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, 7).z(new we9(kv1Var2));
                String a3 = r9kVar.a(av8Var);
                yf8 yf8Var = xth.a;
                znhVar = znhVar3;
                wxfVar = wxfVar3;
                utcVar = utcVar2;
                kv1Var = kv1Var2;
                f = 1.0f;
                ryVar = ryVar2;
                udj.c(a3, z5, lz.D(R.color.n_lv_1, av8Var), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.l(), av8Var, 0, 0, 131064);
                av8Var = av8Var;
                av8Var.s(false);
            } else {
                wxfVar = wxfVar3;
                kv1Var = kv1Var2;
                ryVar = ryVar2;
                utcVar = utcVar2;
                znhVar = znhVar3;
                f = 1.0f;
                av8Var.d0(-96828660);
                av8Var.s(false);
            }
            gv9 gv9Var4 = (gv9Var3 == null || gv9Var3.isEmpty()) ? null : gv9Var3;
            p8g p8gVar3 = p8g.a;
            if (gv9Var4 != null) {
                av8Var.d0(-96707264);
                xtc f0 = l98.f0(bkh.d(utcVar, f), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13);
                l8g a4 = k8g.a(ww9.c, lv1Var3, av8Var, 54);
                int hashCode2 = Long.hashCode(av8Var.T);
                aee m2 = av8Var.m();
                xtc C2 = fqj.C(av8Var, f0);
                av8Var.h0();
                if (av8Var.S) {
                    av8Var.l(zg3Var);
                } else {
                    av8Var.q0();
                }
                waa.K(av8Var, a4, f50Var);
                waa.K(av8Var, m2, ff3Var);
                bf3.s(hashCode2, av8Var, f50Var2, av8Var, ryVar);
                waa.K(av8Var, C2, f50Var3);
                p8g p8gVar4 = p8gVar3;
                nq8.h(av8Var, p8gVar4.a(0.5f, utcVar, true));
                float size = 0.5f / gv9Var3.size();
                av8Var.d0(1582884991);
                for (r9k r9kVar2 : gv9Var3) {
                    xtc a5 = p8gVar4.a(size, utcVar, true);
                    String a6 = r9kVar2.a(av8Var);
                    yf8 yf8Var2 = xth.a;
                    av8 av8Var2 = av8Var;
                    udj.c(a6, a5, lz.D(R.color.n_lv_3, av8Var), null, 0L, null, 0L, null, new p7j(3), 0L, 0, false, 0, 0, null, xth.b(), av8Var2, 0, 0, 130040);
                    p8gVar4 = p8gVar4;
                    av8Var = av8Var2;
                }
                p8gVar = p8gVar4;
                i3 = 3;
                i2 = 54;
                ljg.t(av8Var, false, true, false);
            } else {
                i2 = 54;
                p8gVar = p8gVar3;
                i3 = 3;
                av8Var.d0(-95855508);
                av8Var.s(false);
            }
            av8Var.d0(-834369667);
            Iterator it2 = CollectionsKt.L0(gv9Var2, znhVar.h()).iterator();
            while (true) {
                int i7 = 6;
                if (it2.hasNext()) {
                    fgf fgfVar2 = (fgf) it2.next();
                    int ordinal = g6iVar3.c.ordinal();
                    if (ordinal == 0) {
                        it = it2;
                        gv9Var = gv9Var2;
                        p8gVar2 = p8gVar;
                        wmdVar = wmdVar5;
                        oldVar = oldVar3;
                        wmdVar2 = wmdVar6;
                        lv1Var = lv1Var4;
                        znhVar2 = znhVar;
                        wxfVar2 = wxfVar;
                        av8Var.d0(1804621802);
                        int i8 = wmdVar2.a;
                        String str = wmdVar2.e;
                        if (wmdVar == null || (serverType = wmdVar.b) == null) {
                            serverType = serverType5;
                        }
                        switch (serverType != null ? y5i.a[serverType.ordinal()] : -1) {
                            case 1:
                            case 2:
                                v5iVar = v5i.Practice;
                                break;
                            case 3:
                            case 4:
                            case 5:
                            case 6:
                                v5iVar = v5i.Qualifying;
                                break;
                            case 7:
                            default:
                                v5iVar = v5i.Race;
                                break;
                            case 8:
                                v5iVar = v5i.Season;
                                break;
                        }
                        String str2 = v5iVar.a;
                        r9k r9kVar3 = fgfVar2.b;
                        if (r9kVar3 == null) {
                            av8Var.d0(1805052856);
                            av8Var.s(false);
                            a = null;
                        } else {
                            av8Var.d0(1720795497);
                            a = r9kVar3.a(av8Var);
                            av8Var.s(false);
                        }
                        av8 av8Var3 = av8Var;
                        nld.d(i8, str, null, oldVar, fgfVar2, vmdVar, "additional", null, 0L, false, cgf.c, false, false, str2, a, av8Var3, ((i4 << 9) & 458752) | 1573248, 6, 7040);
                        av8Var = av8Var3;
                        av8Var.s(false);
                        Unit unit = Unit.a;
                    } else if (ordinal == 1) {
                        it = it2;
                        gv9Var = gv9Var2;
                        p8g p8gVar5 = p8gVar;
                        wmd wmdVar7 = wmdVar5;
                        oldVar = oldVar3;
                        wmd wmdVar8 = wmdVar6;
                        lv1Var = lv1Var4;
                        znhVar2 = znhVar;
                        wxfVar2 = wxfVar;
                        av8Var.d0(1805377582);
                        l8g a7 = k8g.a(new ng0(8.0f, true, new a70(6)), lv1Var3, av8Var, i2);
                        int hashCode3 = Long.hashCode(av8Var.T);
                        aee m3 = av8Var.m();
                        xtc C3 = fqj.C(av8Var, utcVar);
                        if3.k7.getClass();
                        zg3 zg3Var2 = hf3.b;
                        av8Var.h0();
                        if (av8Var.S) {
                            av8Var.l(zg3Var2);
                        } else {
                            av8Var.q0();
                        }
                        waa.K(av8Var, a7, hf3.g);
                        waa.K(av8Var, m3, hf3.f);
                        waa.K(av8Var, Integer.valueOf(hashCode3), hf3.j);
                        waa.J(av8Var, hf3.k);
                        waa.K(av8Var, C3, hf3.d);
                        dld dldVar = (dld) CollectionsKt.firstOrNull(fgfVar2.e);
                        zmd zmdVar = dldVar != null ? dldVar.f : null;
                        if (zmdVar == null) {
                            av8Var.d0(1478551521);
                            av8Var.s(false);
                            z3 = true;
                            f2 = 1.0f;
                        } else {
                            av8Var.d0(1478551522);
                            f2 = 1.0f;
                            z3 = true;
                            a(zmdVar, l98.d0(p8gVar5.a(1.0f, utcVar, true), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, 1), false, null, av8Var, 384, 8);
                            av8Var.s(false);
                        }
                        xtc a8 = p8gVar5.a(f2, utcVar, z3);
                        wmdVar2 = wmdVar8;
                        int i9 = wmdVar2.a;
                        String str3 = wmdVar2.e;
                        if (wmdVar7 == null || (serverType2 = wmdVar7.b) == null) {
                            serverType2 = serverType5;
                        }
                        switch (serverType2 != null ? y5i.a[serverType2.ordinal()] : -1) {
                            case 1:
                            case 2:
                                v5iVar2 = v5i.Practice;
                                break;
                            case 3:
                            case 4:
                            case 5:
                            case 6:
                                v5iVar2 = v5i.Qualifying;
                                break;
                            case 7:
                            default:
                                v5iVar2 = v5i.Race;
                                break;
                            case 8:
                                v5iVar2 = v5i.Season;
                                break;
                        }
                        av8 av8Var4 = av8Var;
                        p8gVar2 = p8gVar5;
                        wmdVar = wmdVar7;
                        nld.d(i9, str3, null, oldVar, fgfVar2, vmdVar, "additional", a8, 0L, false, cgf.c, false, true, v5iVar2.a, null, av8Var4, ((i4 << 9) & 458752) | 1573248, 390, 19200);
                        av8Var = av8Var4;
                        av8Var.s(true);
                        av8Var.s(false);
                        Unit unit2 = Unit.a;
                    } else if (ordinal == 2) {
                        it = it2;
                        p8g p8gVar6 = p8gVar;
                        wmd wmdVar9 = wmdVar5;
                        oldVar = oldVar3;
                        wmd wmdVar10 = wmdVar6;
                        lv1Var = lv1Var4;
                        av8Var.d0(1806904797);
                        xtc g = bkh.g(utcVar, 96.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2);
                        kv1 kv1Var3 = kv1Var;
                        u23 a9 = t23.a(ww9.f, kv1Var3, av8Var, 6);
                        int hashCode4 = Long.hashCode(av8Var.T);
                        aee m4 = av8Var.m();
                        xtc C4 = fqj.C(av8Var, g);
                        if3.k7.getClass();
                        zg3 zg3Var3 = hf3.b;
                        av8Var.h0();
                        if (av8Var.S) {
                            av8Var.l(zg3Var3);
                        } else {
                            av8Var.q0();
                        }
                        waa.K(av8Var, a9, hf3.g);
                        waa.K(av8Var, m4, hf3.f);
                        waa.K(av8Var, Integer.valueOf(hashCode4), hf3.j);
                        waa.J(av8Var, hf3.k);
                        waa.K(av8Var, C4, hf3.d);
                        dld dldVar2 = (dld) CollectionsKt.firstOrNull(fgfVar2.e);
                        zmd zmdVar2 = dldVar2 != null ? dldVar2.f : null;
                        if (zmdVar2 == null) {
                            av8Var.d0(-1446333485);
                            av8Var.s(false);
                            gv9Var = gv9Var2;
                            fgfVar = fgfVar2;
                            kv1Var = kv1Var3;
                            znhVar2 = znhVar;
                        } else {
                            av8Var.d0(-1446333484);
                            kv1Var = kv1Var3;
                            gv9Var = gv9Var2;
                            fgfVar = fgfVar2;
                            zmd zmdVar3 = zmdVar2;
                            znhVar2 = znhVar;
                            a(zmdVar3, null, false, null, av8Var, 384, 10);
                            av8Var.s(false);
                        }
                        int i10 = wmdVar10.a;
                        fgf fgfVar3 = fgfVar;
                        String str4 = wmdVar10.e;
                        if (wmdVar9 == null || (serverType3 = wmdVar9.b) == null) {
                            serverType3 = serverType5;
                        }
                        switch (serverType3 != null ? y5i.a[serverType3.ordinal()] : -1) {
                            case 1:
                            case 2:
                                v5iVar3 = v5i.Practice;
                                break;
                            case 3:
                            case 4:
                            case 5:
                            case 6:
                                v5iVar3 = v5i.Qualifying;
                                break;
                            case 7:
                            default:
                                v5iVar3 = v5i.Race;
                                break;
                            case 8:
                                v5iVar3 = v5i.Season;
                                break;
                        }
                        av8 av8Var5 = av8Var;
                        wxfVar2 = wxfVar;
                        nld.d(i10, str4, null, oldVar, fgfVar3, vmdVar, "additional", null, 0L, false, cgf.c, false, true, v5iVar3.a, null, av8Var5, ((i4 << 9) & 458752) | 1573248, 390, 19328);
                        av8Var = av8Var5;
                        av8Var.s(true);
                        av8Var.s(false);
                        Unit unit3 = Unit.a;
                        p8gVar2 = p8gVar6;
                        wmdVar2 = wmdVar10;
                        wmdVar = wmdVar9;
                    } else {
                        if (ordinal != i3) {
                            throw dmi.h(av8Var, 1720782854, false);
                        }
                        av8Var.d0(1808197931);
                        lv1Var = lv1Var4;
                        wxf wxfVar4 = wxfVar;
                        l8g a10 = k8g.a(wxfVar4, lv1Var, av8Var, 0);
                        int hashCode5 = Long.hashCode(av8Var.T);
                        aee m5 = av8Var.m();
                        xtc C5 = fqj.C(av8Var, utcVar);
                        if3.k7.getClass();
                        zg3 zg3Var4 = hf3.b;
                        av8Var.h0();
                        if (av8Var.S) {
                            av8Var.l(zg3Var4);
                        } else {
                            av8Var.q0();
                        }
                        waa.K(av8Var, a10, hf3.g);
                        waa.K(av8Var, m5, hf3.f);
                        waa.K(av8Var, Integer.valueOf(hashCode5), hf3.j);
                        waa.J(av8Var, hf3.k);
                        waa.K(av8Var, C5, hf3.d);
                        dld dldVar3 = (dld) CollectionsKt.firstOrNull(fgfVar2.e);
                        zmd zmdVar4 = dldVar3 != null ? dldVar3.f : null;
                        if (zmdVar4 == null) {
                            av8Var.d0(1251328764);
                            av8Var.s(false);
                            z4 = true;
                        } else {
                            av8Var.d0(1251328765);
                            c(l98.d0(p8gVar.a(1.0f, utcVar, true), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, 1), zmdVar4, av8Var, 0);
                            av8Var.s(false);
                            z4 = true;
                        }
                        xtc a11 = p8gVar.a(1.0f, utcVar, z4);
                        p8g p8gVar7 = p8gVar;
                        wmd wmdVar11 = wmdVar6;
                        int i11 = wmdVar11.a;
                        String str5 = wmdVar11.e;
                        wmd wmdVar12 = wmdVar5;
                        if (wmdVar12 == null || (serverType4 = wmdVar12.b) == null) {
                            serverType4 = serverType5;
                        }
                        switch (serverType4 != null ? y5i.a[serverType4.ordinal()] : -1) {
                            case 1:
                            case 2:
                                v5iVar4 = v5i.Practice;
                                break;
                            case 3:
                            case 4:
                            case 5:
                            case 6:
                                v5iVar4 = v5i.Qualifying;
                                break;
                            case 7:
                            default:
                                v5iVar4 = v5i.Race;
                                break;
                            case 8:
                                v5iVar4 = v5i.Season;
                                break;
                        }
                        String str6 = v5iVar4.a;
                        av8 av8Var6 = av8Var;
                        oldVar = oldVar3;
                        it = it2;
                        nld.d(i11, str5, null, oldVar, fgfVar2, vmdVar, "additional", a11, 0L, false, cgf.c, false, false, str6, null, av8Var6, ((i4 << 9) & 458752) | 1573248, 6, 23296);
                        av8Var = av8Var6;
                        av8Var.s(true);
                        av8Var.s(false);
                        Unit unit4 = Unit.a;
                        p8gVar2 = p8gVar7;
                        gv9Var = gv9Var2;
                        wmdVar = wmdVar12;
                        wmdVar2 = wmdVar11;
                        znhVar2 = znhVar;
                        wxfVar2 = wxfVar4;
                    }
                    znhVar = znhVar2;
                    wxfVar = wxfVar2;
                    wmdVar5 = wmdVar;
                    lv1Var4 = lv1Var;
                    wmdVar6 = wmdVar2;
                    oldVar3 = oldVar;
                    it2 = it;
                    gv9Var2 = gv9Var;
                    p8gVar = p8gVar2;
                    i3 = 3;
                    i2 = 54;
                    g6iVar3 = g6iVar;
                } else {
                    gv9 gv9Var5 = gv9Var2;
                    lv1 lv1Var5 = lv1Var4;
                    znh znhVar4 = znhVar;
                    wxf wxfVar5 = wxfVar;
                    av8Var.s(false);
                    if (z || gv9Var5.size() <= 5) {
                        z2 = true;
                        g6iVar2 = g6iVar;
                        av8Var.d0(-89285492);
                        av8Var.s(false);
                    } else {
                        av8Var.d0(-90746212);
                        boolean z6 = znhVar4.h() == Integer.MAX_VALUE;
                        g6iVar2 = g6iVar;
                        boolean g2 = av8Var.g(znhVar4) | av8Var.h(z6) | av8Var.i(g6iVar2);
                        Object O2 = av8Var.O();
                        if (g2 || O2 == a99Var) {
                            O2 = new jx1(z6, g6iVar2, znhVar4, i7);
                            av8Var.n0(O2);
                        }
                        av8 av8Var7 = av8Var;
                        utc utcVar3 = utcVar;
                        xtc b02 = l98.b0(tol.y(utcVar3, false, false, false, 0L, null, (Function0) O2, av8Var7, 31), 12.0f);
                        l8g a12 = k8g.a(wxfVar5, lv1Var5, av8Var7, 0);
                        int hashCode6 = Long.hashCode(av8Var7.T);
                        aee m6 = av8Var7.m();
                        xtc C6 = fqj.C(av8Var7, b02);
                        if3.k7.getClass();
                        zg3 zg3Var5 = hf3.b;
                        av8Var7.h0();
                        if (av8Var7.S) {
                            av8Var7.l(zg3Var5);
                        } else {
                            av8Var7.q0();
                        }
                        waa.K(av8Var7, a12, hf3.g);
                        waa.K(av8Var7, m6, hf3.f);
                        waa.K(av8Var7, Integer.valueOf(hashCode6), hf3.j);
                        waa.J(av8Var7, hf3.k);
                        waa.K(av8Var7, C6, hf3.d);
                        yf8 yf8Var3 = xth.a;
                        udj.c(oea.v(z6 ? R.string.see_less : R.string.see_more, av8Var7), null, lz.D(R.color.primary_default, av8Var7), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.l(), av8Var7, 0, 0, 131066);
                        wkn.l(s6a.N(z6 ? R.drawable.ic_chevron_up_large_16 : R.drawable.ic_chevron_down_large_16, 6, av8Var7), bkh.l(l98.f0(utcVar3, 4.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 14), 16.0f), null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, new ay1(lz.D(R.color.primary_default, av8Var7), 5), av8Var7, 432, 56);
                        av8Var = av8Var7;
                        z2 = true;
                        av8Var.s(true);
                        av8Var.s(false);
                    }
                    av8Var.s(z2);
                }
            }
        } else {
            g6iVar2 = g6iVar3;
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new t60(g6iVar2, z, vmdVar, i, 24);
        }
    }

    public static final void c(xtc xtcVar, zmd zmdVar, of3 of3Var, int i) {
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-853567270);
        int i2 = (av8Var.g(xtcVar) ? 4 : 2) | i | (av8Var.i(zmdVar) ? 32 : 16);
        int i3 = 0;
        if (av8Var.T(i2 & 1, (i2 & 19) != 18)) {
            Context context = (Context) av8Var.k(nz.b);
            l8g a = k8g.a(new ng0(8.0f, true, new a70(6)), uxf.m, av8Var, 54);
            int hashCode = Long.hashCode(av8Var.T);
            aee m = av8Var.m();
            xtc C = fqj.C(av8Var, xtcVar);
            if3.k7.getClass();
            zg3 zg3Var = hf3.b;
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, a, hf3.g);
            waa.K(av8Var, m, hf3.f);
            waa.K(av8Var, Integer.valueOf(hashCode), hf3.j);
            waa.J(av8Var, hf3.k);
            waa.K(av8Var, C, hf3.d);
            xtc l = bkh.l(utc.a, 32.0f);
            boolean i4 = av8Var.i(context) | av8Var.i(zmdVar);
            Object O = av8Var.O();
            if (i4 || O == nf3.a) {
                O = new q5i(context, zmdVar, i3);
                av8Var.n0(O);
            }
            td4.G(zmdVar.a, tol.y(l, false, false, false, 0L, null, (Function0) O, av8Var, 31), false, 0L, av8Var, 0, 12);
            goa goaVar = new goa(1.0f, true);
            yf8 yf8Var = xth.a;
            dfj e = xth.e();
            long D = lz.D(R.color.n_lv_1, av8Var);
            String str = zmdVar.b;
            if (str == null) {
                str = "";
            }
            udj.c(str, goaVar, D, null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, e, av8Var, 0, 0, 131064);
            av8Var = av8Var;
            av8Var.s(true);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new s5h(xtcVar, zmdVar, i, 9);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r10v6 */
    public static final void d(int i, String str, String str2, old oldVar, fgf fgfVar, of3 of3Var, int i2) {
        boolean z;
        String a;
        f50 f50Var;
        ry ryVar;
        int i3;
        zg3 zg3Var;
        Context context;
        ff3 ff3Var;
        f50 f50Var2;
        utc utcVar;
        f50 f50Var3;
        ?? r10;
        av8 av8Var;
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(1005564874);
        int i4 = i2 | (av8Var2.e(i) ? 4 : 2) | (av8Var2.g(str) ? 32 : 16) | (av8Var2.g(str2) ? NotificationCompat.FLAG_LOCAL_ONLY : 128) | (av8Var2.g(oldVar) ? a.o : 1024) | (av8Var2.g(fgfVar) ? 16384 : 8192);
        if (av8Var2.T(i4 & 1, (i4 & 9363) != 9362)) {
            Context context2 = (Context) av8Var2.k(nz.b);
            u23 a2 = t23.a(new ng0(4.0f, true, new a70(6)), uxf.o, av8Var2, 6);
            int hashCode = Long.hashCode(av8Var2.T);
            aee m = av8Var2.m();
            utc utcVar2 = utc.a;
            xtc C = fqj.C(av8Var2, utcVar2);
            if3.k7.getClass();
            zg3 zg3Var2 = hf3.b;
            av8Var2.h0();
            if (av8Var2.S) {
                av8Var2.l(zg3Var2);
            } else {
                av8Var2.q0();
            }
            f50 f50Var4 = hf3.g;
            waa.K(av8Var2, a2, f50Var4);
            ff3 ff3Var2 = hf3.f;
            waa.K(av8Var2, m, ff3Var2);
            Integer valueOf = Integer.valueOf(hashCode);
            f50 f50Var5 = hf3.j;
            waa.K(av8Var2, valueOf, f50Var5);
            ry ryVar2 = hf3.k;
            waa.J(av8Var2, ryVar2);
            f50 f50Var6 = hf3.d;
            waa.K(av8Var2, C, f50Var6);
            xtc d0 = l98.d0(utcVar2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 4.0f, 1);
            l8g a3 = k8g.a(new ng0(8.0f, true, new a70(6)), uxf.m, av8Var2, 54);
            int hashCode2 = Long.hashCode(av8Var2.T);
            aee m2 = av8Var2.m();
            xtc C2 = fqj.C(av8Var2, d0);
            av8Var2.h0();
            if (av8Var2.S) {
                av8Var2.l(zg3Var2);
            } else {
                av8Var2.q0();
            }
            waa.K(av8Var2, a3, f50Var4);
            waa.K(av8Var2, m2, ff3Var2);
            bf3.s(hashCode2, av8Var2, f50Var5, av8Var2, ryVar2);
            goa g = ljg.g(av8Var2, C2, f50Var6, 1.0f, true);
            yf8 yf8Var = xth.a;
            dfj k = xth.k();
            long D = lz.D(R.color.n_lv_1, av8Var2);
            r9k r9kVar = fgfVar.b;
            if (r9kVar == null) {
                av8Var2.d0(-1054820313);
                z = false;
                av8Var2.s(false);
                a = null;
            } else {
                z = false;
                av8Var2.d0(-311121126);
                a = r9kVar.a(av8Var2);
                av8Var2.s(false);
            }
            String n = rld.n(context2, a, null);
            if (n == null) {
                n = "";
            }
            boolean z2 = z;
            udj.c(n, g, D, null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, k, av8Var2, 0, 0, 131064);
            if (oldVar.c) {
                av8Var2.d0(-1054728645);
                context = context2;
                f50Var2 = f50Var6;
                zg3Var = zg3Var2;
                ryVar = ryVar2;
                f50Var = f50Var4;
                i3 = 6;
                boolean z3 = z2;
                f50Var3 = f50Var5;
                ff3Var = ff3Var2;
                utcVar = utcVar2;
                nld.f(oldVar, vmd.RACE_RESULTS, str2, "featured", Integer.valueOf(i), null, false, av8Var2, ((i4 >> 9) & 14) | 25008 | ((i4 << 3) & 7168) | ((i4 << 15) & 458752), PsExtractor.AUDIO_STREAM);
                av8 av8Var3 = av8Var2;
                av8Var3.s(z3);
                av8Var = av8Var3;
                r10 = z3;
            } else {
                f50Var = f50Var4;
                ryVar = ryVar2;
                i3 = 6;
                zg3Var = zg3Var2;
                context = context2;
                ff3Var = ff3Var2;
                f50Var2 = f50Var6;
                boolean z4 = z2;
                av8 av8Var4 = av8Var2;
                utcVar = utcVar2;
                f50Var3 = f50Var5;
                av8Var4.d0(-1054337518);
                av8Var4.s(z4);
                av8Var = av8Var4;
                r10 = z4;
            }
            av8Var.s(true);
            xtc d = bkh.d(utcVar, 1.0f);
            l8g a4 = k8g.a(ww9.i, uxf.l, av8Var, i3);
            int hashCode3 = Long.hashCode(av8Var.T);
            aee m3 = av8Var.m();
            xtc C3 = fqj.C(av8Var, d);
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, a4, f50Var);
            waa.K(av8Var, m3, ff3Var);
            bf3.s(hashCode3, av8Var, f50Var3, av8Var, ryVar);
            waa.K(av8Var, C3, f50Var2);
            av8Var.d0(1363288864);
            gv9 gv9Var = fgfVar.e;
            ArrayList arrayList = new ArrayList();
            Iterator<E> it = gv9Var.iterator();
            while (it.hasNext()) {
                zmd zmdVar = ((dld) it.next()).f;
                if (zmdVar != null) {
                    arrayList.add(zmdVar);
                }
            }
            Iterator it2 = arrayList.iterator();
            av8 av8Var5 = av8Var;
            while (it2.hasNext()) {
                zmd zmdVar2 = (zmd) it2.next();
                k1c c = e12.c(uxf.k, r10);
                int hashCode4 = Long.hashCode(av8Var5.T);
                aee m4 = av8Var5.m();
                xtc C4 = fqj.C(av8Var5, utcVar);
                if3.k7.getClass();
                zg3 zg3Var3 = hf3.b;
                av8Var5.h0();
                if (av8Var5.S) {
                    av8Var5.l(zg3Var3);
                } else {
                    av8Var5.q0();
                }
                waa.K(av8Var5, c, hf3.g);
                waa.K(av8Var5, m4, hf3.f);
                waa.K(av8Var5, Integer.valueOf(hashCode4), hf3.j);
                waa.J(av8Var5, hf3.k);
                waa.K(av8Var5, C4, hf3.d);
                int i5 = zmdVar2.a;
                xtc l = bkh.l(utcVar, 32.0f);
                Context context3 = context;
                boolean i6 = av8Var5.i(context3) | av8Var5.i(zmdVar2);
                Object O = av8Var5.O();
                if (i6 || O == nf3.a) {
                    O = new q5i(context3, zmdVar2, 1);
                    av8Var5.n0(O);
                }
                context = context3;
                av8 av8Var6 = av8Var5;
                int i7 = i3;
                av8 av8Var7 = av8Var6;
                td4.J(i5, r10, av8Var7, tol.y(l, false, false, false, 0L, null, (Function0) O, av8Var6, 29));
                String str3 = zmdVar2.d;
                if (str3 == null) {
                    av8Var7.d0(500487475);
                    av8Var7.s(r10);
                } else {
                    av8Var7.d0(500487476);
                    td4.k(str3, bkh.l(utcVar, 16.0f), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, false, av8Var7, 48, 12);
                    av8Var7.s(r10);
                }
                av8Var7.s(true);
                i3 = i7;
                av8Var5 = av8Var7;
            }
            av8Var5.s(r10);
            av8Var5.s(true);
            av8 av8Var8 = av8Var5;
            nld.d(i, str, null, oldVar, fgfVar, vmd.RACE_RESULTS, "featured", null, 0L, false, cgf.c, false, false, str2, null, av8Var8, (i4 & 14) | 1769856 | (i4 & 112) | (i4 & 7168) | (57344 & i4), ((i4 << 3) & 7168) | 6, 23424);
            av8Var2 = av8Var8;
            av8Var2.s(true);
        } else {
            av8Var2.W();
        }
        eqf u = av8Var2.u();
        if (u != null) {
            u.d = new bk1(i, str, str2, oldVar, fgfVar, i2);
        }
    }
}
