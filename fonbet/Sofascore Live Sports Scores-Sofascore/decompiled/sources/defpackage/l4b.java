package defpackage;

import android.app.Activity;
import android.content.Context;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.sofascore.results.R;
import com.sofascore.results.league.fragment.topStats.TopStatsCategory;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class l4b implements ct8 {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ l4b(Object obj, boolean z, Object obj2, int i) {
        this.a = i;
        this.d = obj;
        this.b = z;
        this.c = obj2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:132:0x0462, code lost:
    
        if (r8 == null) goto L145;
     */
    @Override // defpackage.ct8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        av8 av8Var;
        boolean z;
        long j;
        long f;
        Object obj4;
        oxh oxhVar;
        Object obj5;
        av8 av8Var2;
        int i = this.a;
        utc utcVar = utc.a;
        a99 a99Var = nf3.a;
        boolean z2 = this.b;
        Object obj6 = this.c;
        Object obj7 = this.d;
        switch (i) {
            case 0:
                osa osaVar = (osa) obj7;
                Function1 function1 = (Function1) obj6;
                vnb vnbVar = (vnb) obj;
                of3 of3Var = (of3) obj2;
                int intValue = ((Integer) obj3).intValue();
                vnbVar.getClass();
                if ((intValue & 6) == 0) {
                    intValue |= ((av8) of3Var).g(vnbVar) ? 4 : 2;
                }
                av8 av8Var3 = (av8) of3Var;
                if (!av8Var3.T(intValue & 1, (intValue & 19) != 18)) {
                    av8Var3.W();
                } else if (vnbVar.equals(tnb.a) || (vnbVar instanceof snb)) {
                    av8Var3.d0(-970747403);
                    s6a.f(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 6, 62, 0L, 0L, av8Var3, bkh.d(utcVar, 1.0f));
                    av8Var3.s(false);
                } else {
                    if (!(vnbVar instanceof unb)) {
                        throw dmi.h(av8Var3, -970744382, false);
                    }
                    av8Var3.d0(-28146513);
                    if (osaVar.c() == 0) {
                        m4b m4bVar = (m4b) ((unb) vnbVar).a;
                        if (m4bVar.b == y3b.f && m4bVar.d == null) {
                            av8Var3.d0(-28097595);
                            s6a.f(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 6, 62, 0L, 0L, av8Var3, bkh.d(utcVar, 1.0f));
                            z = false;
                            av8Var3.s(false);
                            av8Var = av8Var3;
                            av8Var.s(z);
                        }
                    }
                    av8Var3.d0(-27846154);
                    jca.c(((m4b) ((unb) vnbVar).a).b, null, new dr6(23, new esf(), (Context) av8Var3.k(nz.b), vnbVar), av8Var3, 0);
                    g28 g28Var = bkh.c;
                    t3e C = l98.C(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 72.0f, 7);
                    boolean z3 = this.b;
                    boolean h = av8Var3.h(z3) | ((intValue & 14) == 4) | av8Var3.g(function1) | av8Var3.i(osaVar);
                    Object O = av8Var3.O();
                    if (h || O == a99Var) {
                        O = new c30(osaVar, z3, vnbVar, function1, 3);
                        av8Var3.n0(O);
                    }
                    v8a.a(g28Var, null, C, null, null, null, false, null, (Function1) O, av8Var3, 390, 506);
                    av8Var = av8Var3;
                    z = false;
                    av8Var.s(false);
                    av8Var.s(z);
                }
                return Unit.a;
            case 1:
                final Function1 function12 = (Function1) obj6;
                final String str = (String) obj7;
                final ynj ynjVar = (ynj) obj;
                of3 of3Var2 = (of3) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                ynjVar.getClass();
                if ((intValue2 & 6) == 0) {
                    intValue2 |= (intValue2 & 8) == 0 ? ((av8) of3Var2).g(ynjVar) : ((av8) of3Var2).i(ynjVar) ? 4 : 2;
                }
                av8 av8Var4 = (av8) of3Var2;
                if (av8Var4.T(intValue2 & 1, (intValue2 & 19) != 18)) {
                    Context context = (Context) av8Var4.k(nz.b);
                    dib c = pie.a.P().c();
                    final ksa a = msa.a(0, 0, av8Var4, 0, 3);
                    qnj qnjVar = ynjVar.f;
                    uza uzaVar = qnjVar instanceof uza ? (uza) qnjVar : null;
                    if (uzaVar == null) {
                        rlh rlhVar = rlh.b;
                        uzaVar = new uza(rlhVar, rlhVar, rlhVar, null, rlhVar, null, null);
                    }
                    final boolean z4 = !uzaVar.e.isEmpty();
                    gv9 gv9Var = ynjVar.a;
                    final ArrayList arrayList = new ArrayList();
                    for (Object obj8 : gv9Var) {
                        if (!((TopStatsCategory) obj8).getB().isEmpty()) {
                            arrayList.add(obj8);
                        }
                    }
                    boj bojVar = ynjVar.c;
                    int i2 = intValue2 & 14;
                    int i3 = intValue2;
                    boolean i4 = (i2 == 4 || ((i3 & 8) != 0 && av8Var4.i(ynjVar))) | av8Var4.i(context) | av8Var4.g(c);
                    Object O2 = av8Var4.O();
                    Object obj9 = O2;
                    if (i4 || O2 == a99Var) {
                        ncj ncjVar = new ncj(context, ynjVar, c, 3);
                        av8Var4.n0(ncjVar);
                        obj9 = ncjVar;
                    }
                    jca.c(bojVar, null, (Function1) obj9, av8Var4, 0);
                    t3e C2 = l98.C(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 72.0f, 7);
                    boolean i5 = av8Var4.i(uzaVar);
                    final uza uzaVar2 = uzaVar;
                    final boolean z5 = this.b;
                    boolean h2 = av8Var4.h(z5) | i5 | (i2 == 4 || ((i3 & 8) != 0 && av8Var4.i(ynjVar))) | av8Var4.g(function12) | av8Var4.g(a) | av8Var4.h(z4) | av8Var4.i(arrayList) | av8Var4.g(str);
                    Object O3 = av8Var4.O();
                    Object obj10 = O3;
                    if (h2 || O3 == a99Var) {
                        Function1 function13 = new Function1() { // from class: wnj
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj11) {
                                esa esaVar = (esa) obj11;
                                esaVar.getClass();
                                uza uzaVar3 = uza.this;
                                int size = uzaVar3.a.size();
                                boolean z6 = z5;
                                Function1 function14 = function12;
                                if (size > 1) {
                                    esa.d(esaVar, null, null, new tc3(-308871313, new a93(z6, uzaVar3, ynjVar, function14), true), 3);
                                }
                                esa.d(esaVar, null, null, new tc3(-1368108886, new p34(z6, uzaVar3, function14, a, z4), true), 3);
                                ArrayList arrayList2 = arrayList;
                                if (arrayList2.isEmpty()) {
                                    esa.d(esaVar, null, null, oyn.b, 3);
                                } else {
                                    esaVar.a(arrayList2.size(), null, new do6(arrayList2, 1), new tc3(802480018, new l46(arrayList2, str, function14, 10), true));
                                }
                                return Unit.a;
                            }
                        };
                        av8Var4.n0(function13);
                        obj10 = function13;
                    }
                    v8a.a(null, null, C2, null, null, null, false, null, (Function1) obj10, av8Var4, 384, PglCryptUtils.UNKNOWN_ERR);
                    s6a.a(Boolean.valueOf(ynjVar.e).equals(Boolean.TRUE), bkh.c, av8Var4, 48);
                } else {
                    av8Var4.W();
                }
                return Unit.a;
            case 2:
                m1c m1cVar = (m1c) obj;
                g1c g1cVar = (g1c) obj2;
                an3 an3Var = (an3) obj3;
                int g = cn3.g(((znh) obj7).h(), an3Var.a);
                long j2 = an3Var.a;
                int f2 = cn3.f(((znh) obj6).h(), j2);
                int j3 = z2 ? g : an3.j(j2);
                if (!z2) {
                    g = an3.h(j2);
                }
                qhe J = g1cVar.J(an3.a(an3Var.a, j3, g, 0, f2, 4));
                return m1c.G0(m1cVar, J.a, J.b, new b3(J, 5));
            case 3:
                e1d e1dVar = (e1d) obj7;
                r13 r13Var = (r13) obj6;
                xpa xpaVar = (xpa) obj;
                of3 of3Var3 = (of3) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                xpaVar.getClass();
                if ((intValue3 & 6) == 0) {
                    intValue3 |= ((av8) of3Var3).g(xpaVar) ? 4 : 2;
                }
                av8 av8Var5 = (av8) of3Var3;
                if (av8Var5.T(intValue3 & 1, (intValue3 & 19) != 18)) {
                    String v = oea.v(R.string.any_sport_record, av8Var5);
                    String v2 = oea.v(R.string.any_sport_score, av8Var5);
                    boolean g2 = av8Var5.g(v) | av8Var5.g(v2);
                    Object O4 = av8Var5.O();
                    Object obj11 = O4;
                    if (g2 || O4 == a99Var) {
                        b7 K = l6g.K(new s1h(r27.a, v, true), new s1h(r27.b, v2, true));
                        av8Var5.n0(K);
                        obj11 = K;
                    }
                    b7 b7Var = (b7) obj11;
                    r27 r27Var = (r27) e1dVar.getValue();
                    boolean g3 = av8Var5.g(e1dVar);
                    Object O5 = av8Var5.O();
                    Object obj12 = O5;
                    if (g3 || O5 == a99Var) {
                        fw6 fw6Var = new fw6(4, e1dVar);
                        av8Var5.n0(fw6Var);
                        obj12 = fw6Var;
                    }
                    Function1 function14 = (Function1) obj12;
                    av8Var5.d0(1480172765);
                    xtc q = n9e.q(u0a.F(xpa.a(xpaVar, utcVar, 7), z2 ? icb.b : icb.a, 8.0f, av8Var5, 54), lz.D(R.color.surface_1, av8Var5), oyn.e);
                    if (z2) {
                        if (r13Var == null) {
                            j = ljg.f(av8Var5, 972018943, R.color.primary_default, av8Var5, false);
                        } else {
                            av8Var5.d0(972018509);
                            av8Var5.s(false);
                            j = r13Var.a;
                        }
                        q = q.z(f5p.F(j));
                    }
                    av8Var5.s(false);
                    l4a.a(b7Var, r27Var, function14, q, null, false, av8Var5, 0, 48);
                } else {
                    av8Var5.W();
                }
                return Unit.a;
            case 4:
                wn1 wn1Var = (wn1) obj7;
                koh kohVar = (koh) obj6;
                xpa xpaVar2 = (xpa) obj;
                of3 of3Var4 = (of3) obj2;
                int intValue4 = ((Integer) obj3).intValue();
                xpaVar2.getClass();
                if ((intValue4 & 6) == 0) {
                    intValue4 |= ((av8) of3Var4).g(xpaVar2) ? 4 : 2;
                }
                av8 av8Var6 = (av8) of3Var4;
                if (av8Var6.T(intValue4 & 1, (intValue4 & 19) != 18)) {
                    boolean g4 = av8Var6.g(wn1Var) | av8Var6.h(z2);
                    Object O6 = av8Var6.O();
                    if (g4 || O6 == a99Var) {
                        O6 = new jx1(kohVar, wn1Var, z2, r15);
                        av8Var6.n0(O6);
                    }
                    ktm.g(0, av8Var6, xpa.a(xpaVar2, l98.f0(utc.a, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13), 7), (Function0) O6, z2);
                } else {
                    av8Var6.W();
                }
                return Unit.a;
            case 5:
                vnb vnbVar2 = (vnb) obj7;
                Function1 function15 = (Function1) obj6;
                of3 of3Var5 = (of3) obj2;
                int intValue5 = ((Integer) obj3).intValue();
                ((xpa) obj).getClass();
                av8 av8Var7 = (av8) of3Var5;
                if (av8Var7.T(intValue5 & 1, (intValue5 & 17) != 16)) {
                    xtc d = bkh.d(utcVar, 1.0f);
                    if (z2) {
                        av8Var7.d0(925387602);
                        av8Var7.s(false);
                        f = r13.h;
                    } else {
                        f = ljg.f(av8Var7, 925388148, R.color.surface_1, av8Var7, false);
                    }
                    xtc d0 = l98.d0(n9e.q(d, f, oyn.e), 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2);
                    l8g a2 = k8g.a(ww9.b, uxf.l, av8Var7, 0);
                    int hashCode = Long.hashCode(av8Var7.T);
                    aee m = av8Var7.m();
                    xtc C3 = fqj.C(av8Var7, d0);
                    if3.k7.getClass();
                    zg3 zg3Var = hf3.b;
                    av8Var7.h0();
                    if (av8Var7.S) {
                        av8Var7.l(zg3Var);
                    } else {
                        av8Var7.q0();
                    }
                    waa.K(av8Var7, a2, hf3.g);
                    waa.K(av8Var7, m, hf3.f);
                    waa.K(av8Var7, Integer.valueOf(hashCode), hf3.j);
                    waa.J(av8Var7, hf3.k);
                    waa.K(av8Var7, C3, hf3.d);
                    Object obj13 = ((unb) vnbVar2).a;
                    gv9 gv9Var2 = ((m4b) obj13).e;
                    Iterator<E> it = gv9Var2.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            obj4 = it.next();
                            if (((oxh) obj4).a == ((m4b) obj13).b) {
                            }
                        } else {
                            obj4 = null;
                        }
                    }
                    oxh oxhVar2 = (oxh) obj4;
                    boolean g5 = av8Var7.g(function15);
                    Object O7 = av8Var7.O();
                    if (g5 || O7 == a99Var) {
                        O7 = new uj8(13, function15);
                        av8Var7.n0(O7);
                    }
                    r4a.j(gv9Var2, oxhVar2, (Function1) O7, null, z2 ? rxh.i : sxh.i, false, null, false, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, av8Var7, 0, 1000);
                    m4b m4bVar2 = (m4b) obj13;
                    gv9 gv9Var3 = m4bVar2.c;
                    if (m4bVar2.d != null) {
                        Iterator<E> it2 = gv9Var3.iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                Object next = it2.next();
                                if (Intrinsics.c(((oxh) next).a, m4bVar2.d)) {
                                    obj5 = next;
                                }
                            } else {
                                obj5 = null;
                            }
                        }
                        oxhVar = (oxh) obj5;
                        break;
                    }
                    oxhVar = (oxh) CollectionsKt.Y(m4bVar2.c);
                    oxh oxhVar3 = oxhVar;
                    boolean g6 = av8Var7.g(function15);
                    Object O8 = av8Var7.O();
                    if (g6 || O8 == a99Var) {
                        O8 = new uj8(14, function15);
                        av8Var7.n0(O8);
                    }
                    r4a.j(gv9Var3, oxhVar3, (Function1) O8, null, z2 ? rxh.i : sxh.i, false, null, false, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, av8Var7, 0, 1000);
                    av8Var7.s(true);
                } else {
                    av8Var7.W();
                }
                return Unit.a;
            case 6:
                Function2 function2 = (Function2) obj7;
                ecd ecdVar = (ecd) obj6;
                of3 of3Var6 = (of3) obj2;
                int intValue6 = ((Integer) obj3).intValue();
                ((v23) obj).getClass();
                av8 av8Var8 = (av8) of3Var6;
                if (av8Var8.T(intValue6 & 1, (intValue6 & 17) != 16)) {
                    av8Var8.d0(-1855279613);
                    utc utcVar2 = utc.a;
                    xtc Y = fz8.Y(bkh.d(utcVar2, 1.0f), n9a.b);
                    if (z2) {
                        boolean g7 = av8Var8.g(function2) | av8Var8.g(ecdVar);
                        Object O9 = av8Var8.O();
                        if (g7 || O9 == a99Var) {
                            O9 = new ixa(20, function2, ecdVar);
                            av8Var8.n0(O9);
                        }
                        av8Var2 = av8Var8;
                        Y = Y.z(tol.y(utcVar2, false, false, false, 0L, null, (Function0) O9, av8Var8, 31));
                    } else {
                        av8Var2 = av8Var8;
                    }
                    av8Var2.s(false);
                    l8g a3 = k8g.a(ww9.b, uxf.l, av8Var2, 0);
                    int hashCode2 = Long.hashCode(av8Var2.T);
                    aee m2 = av8Var2.m();
                    xtc C4 = fqj.C(av8Var2, Y);
                    if3.k7.getClass();
                    zg3 zg3Var2 = hf3.b;
                    av8Var2.h0();
                    if (av8Var2.S) {
                        av8Var2.l(zg3Var2);
                    } else {
                        av8Var2.q0();
                    }
                    f50 f50Var = hf3.g;
                    waa.K(av8Var2, a3, f50Var);
                    ff3 ff3Var = hf3.f;
                    waa.K(av8Var2, m2, ff3Var);
                    Integer valueOf = Integer.valueOf(hashCode2);
                    f50 f50Var2 = hf3.j;
                    waa.K(av8Var2, valueOf, f50Var2);
                    ry ryVar = hf3.k;
                    waa.J(av8Var2, ryVar);
                    f50 f50Var3 = hf3.d;
                    waa.K(av8Var2, C4, f50Var3);
                    if (1.0f <= 0.0d) {
                        p3a.a("invalid weight; must be greater than zero");
                    }
                    haa.b(ecdVar.f, null, n9e.q(bkh.e(l98.e0(new goa(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), 16.0f, 8.0f, 8.0f, 8.0f), 80.0f), lz.D(R.color.n_lv_4, av8Var2), oyn.e), wv8.c(lz.D(R.color.n_lv_3, av8Var2), 5, haa.t(R.drawable.sofascore_lockup, 0, av8Var2), 12), wv8.c(lz.D(R.color.n_lv_3, av8Var2), 5, haa.t(R.drawable.sofascore_lockup, 0, av8Var2), 12), null, mp3.a, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, av8Var2, 36912, 6, 31712);
                    if (1.0f <= 0.0d) {
                        p3a.a("invalid weight; must be greater than zero");
                    }
                    xtc b0 = l98.b0(new goa(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), 8.0f);
                    u23 a4 = t23.a(ww9.h, uxf.o, av8Var2, 6);
                    int hashCode3 = Long.hashCode(av8Var2.T);
                    aee m3 = av8Var2.m();
                    xtc C5 = fqj.C(av8Var2, b0);
                    av8Var2.h0();
                    if (av8Var2.S) {
                        av8Var2.l(zg3Var2);
                    } else {
                        av8Var2.q0();
                    }
                    waa.K(av8Var2, a4, f50Var);
                    waa.K(av8Var2, m3, ff3Var);
                    bf3.s(hashCode3, av8Var2, f50Var2, av8Var2, ryVar);
                    xtc f0 = l98.f0(ljg.g(av8Var2, C5, f50Var3, 1.0f, true), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, 7);
                    String str2 = ecdVar.b;
                    if (str2 == null) {
                        str2 = "";
                    }
                    String str3 = str2;
                    long D = lz.D(R.color.n_lv_1, av8Var2);
                    yf8 yf8Var = xth.a;
                    udj.c(str3, f0, D, null, 0L, null, 0L, null, null, 0L, 2, false, 2, 0, null, xth.l(), av8Var2, 0, 24960, 110584);
                    jca.n(ecdVar.g, ecdVar.d, null, false, 0L, 0L, av8Var2, 3072, 52);
                    av8Var2.s(true);
                    av8Var2.s(true);
                } else {
                    av8Var8.W();
                }
                return Unit.a;
            case 7:
                mbj mbjVar = (mbj) obj7;
                e1d e1dVar2 = mbjVar.f;
                wzc wzcVar = (wzc) obj6;
                ((Integer) obj3).getClass();
                av8 av8Var9 = (av8) ((of3) obj2);
                av8Var9.d0(-2137546592);
                boolean z6 = ((ewd) ((eoh) e1dVar2).getValue()) == ewd.a || !(av8Var9.k(dh3.n) == ema.b);
                boolean g8 = av8Var9.g(mbjVar);
                Object O10 = av8Var9.O();
                Object obj14 = O10;
                if (g8 || O10 == a99Var) {
                    g2i g2iVar = new g2i(mbjVar, 29);
                    av8Var9.n0(g2iVar);
                    obj14 = g2iVar;
                }
                jvg u = haa.u((Function1) obj14, av8Var9, 0);
                boolean g9 = av8Var9.g(u) | av8Var9.g(mbjVar);
                Object O11 = av8Var9.O();
                Object obj15 = O11;
                if (g9 || O11 == a99Var) {
                    lbj lbjVar = new lbj(u, mbjVar);
                    av8Var9.n0(lbjVar);
                    obj15 = lbjVar;
                }
                xtc a5 = bvg.a(utc.a, (lbj) obj15, (ewd) ((eoh) e1dVar2).getValue(), null, z2 && mbjVar.b.h() != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, z6, wzcVar, 160);
                av8Var9.s(false);
                return a5;
            case 8:
                Activity activity = (Activity) obj7;
                ((Long) obj3).getClass();
                ((String) obj).getClass();
                ((String) obj2).getClass();
                ((Function1) obj6).invoke(Boolean.valueOf(!z2));
                if (activity != null) {
                    activity.setRequestedOrientation(z2 ? 1 : 0);
                }
                return Unit.a;
            default:
                gv9 gv9Var4 = (gv9) obj7;
                Function1 function16 = (Function1) obj6;
                int intValue7 = ((Integer) obj).intValue();
                of3 of3Var7 = (of3) obj2;
                int intValue8 = ((Integer) obj3).intValue();
                if ((intValue8 & 6) == 0) {
                    intValue8 |= ((av8) of3Var7).e(intValue7) ? 4 : 2;
                }
                av8 av8Var10 = (av8) of3Var7;
                if (av8Var10.T(intValue8 & 1, (intValue8 & 19) != 18)) {
                    wil wilVar = (wil) CollectionsKt.a0(intValue7, gv9Var4);
                    if (wilVar == null) {
                        av8Var10.d0(-1052351029);
                        av8Var10.s(false);
                    } else {
                        av8Var10.d0(-1052351028);
                        d7a.l(wilVar, z2, function16, av8Var10, 0);
                        av8Var10.s(false);
                    }
                } else {
                    av8Var10.W();
                }
                return Unit.a;
        }
    }

    public /* synthetic */ l4b(boolean z, Object obj, Object obj2, int i) {
        this.a = i;
        this.b = z;
        this.d = obj;
        this.c = obj2;
    }

    public /* synthetic */ l4b(boolean z, Function1 function1, Object obj, int i) {
        this.a = i;
        this.b = z;
        this.c = function1;
        this.d = obj;
    }
}
