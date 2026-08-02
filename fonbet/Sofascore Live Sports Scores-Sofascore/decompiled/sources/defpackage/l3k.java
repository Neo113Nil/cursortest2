package defpackage;

import com.sofascore.results.R;
import com.unity3d.services.UnityAdsConstants;
import java.io.Serializable;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class l3k implements ct8 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Serializable g;
    public final /* synthetic */ Object h;

    public /* synthetic */ l3k(gv9 gv9Var, boolean z, Function0 function0, Function0 function02, String str, Function0 function03, Function2 function2) {
        this.c = gv9Var;
        this.b = z;
        this.d = function0;
        this.e = function02;
        this.g = str;
        this.f = function03;
        this.h = function2;
    }

    @Override // defpackage.ct8
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        Object obj4 = this.h;
        Serializable serializable = this.g;
        Object obj5 = this.f;
        Object obj6 = this.e;
        Object obj7 = this.d;
        Object obj8 = this.c;
        boolean z = this.b;
        switch (i) {
            case 0:
                gv9 gv9Var = (gv9) obj8;
                Function0 function0 = (Function0) obj7;
                Function0 function02 = (Function0) obj6;
                String str = (String) serializable;
                Function0 function03 = (Function0) obj5;
                Function2 function2 = (Function2) obj4;
                of3 of3Var = (of3) obj2;
                int intValue = ((Integer) obj3).intValue();
                wxf wxfVar = ww9.b;
                lv1 lv1Var = uxf.m;
                ((v23) obj).getClass();
                av8 av8Var = (av8) of3Var;
                if (av8Var.T(intValue & 1, (intValue & 17) != 16)) {
                    utc utcVar = utc.a;
                    xtc d0 = l98.d0(utcVar, 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2);
                    u23 a = t23.a(ww9.d, uxf.o, av8Var, 0);
                    int hashCode = Long.hashCode(av8Var.T);
                    aee m = av8Var.m();
                    xtc C = fqj.C(av8Var, d0);
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
                    xtc d02 = l98.d0(utcVar, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 12.0f, 1);
                    l8g a2 = k8g.a(wxfVar, lv1Var, av8Var, 48);
                    int hashCode2 = Long.hashCode(av8Var.T);
                    aee m2 = av8Var.m();
                    xtc C2 = fqj.C(av8Var, d02);
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
                    xtc e = fn0.e(1.0f, l98.f0(utcVar, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 11), true);
                    yf8 yf8Var = xth.a;
                    udj.c(oea.v(R.string.where_to_watch, av8Var), e, lz.D(R.color.n_lv_1, av8Var), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.j(), av8Var, 0, 0, 131064);
                    r4a.k(new oxh(str, null, yqo.H(1006419690, av8Var, new d82(str, 5)), null, null, false, 250), function03, null, null, false, new t3e(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT), av8Var, 196608, 28);
                    av8Var.s(true);
                    av8Var.d0(-129400808);
                    Iterator<E> it = gv9Var.iterator();
                    while (it.hasNext()) {
                        u0a.q((i3k) it.next(), z, function2, av8Var, 0);
                    }
                    av8Var.s(false);
                    if (z) {
                        av8Var.d0(-129392158);
                        u0a.a(function0, av8Var, 0);
                        av8Var.s(false);
                    } else if (gv9Var.isEmpty()) {
                        av8Var.d0(283965989);
                        xtc d03 = l98.d0(utcVar, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, 1);
                        yf8 yf8Var2 = xth.a;
                        udj.c(oea.v(R.string.tv_empty_text, av8Var), d03, lz.D(R.color.n_lv_3, av8Var), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.g(), av8Var, 48, 0, 131064);
                        av8Var.s(false);
                    } else {
                        av8Var.d0(284274904);
                        av8Var.s(false);
                    }
                    xtc A = wnn.A(l98.f0(utcVar, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 4.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 12.0f, 5).z(new we9(uxf.p)), o7g.a(16.0f));
                    long D = lz.D(R.color.n_lv_4, av8Var);
                    Object O = av8Var.O();
                    a99 a99Var = nf3.a;
                    if (O == a99Var) {
                        O = mz1.e(av8Var);
                    }
                    wzc wzcVar = (wzc) O;
                    Object[] objArr = new Object[0];
                    Object O2 = av8Var.O();
                    if (O2 == a99Var) {
                        O2 = wzj.d;
                        av8Var.n0(O2);
                    }
                    xtc d04 = l98.d0(tol.y(A, true, true, true, D, wzcVar, new cyg(function02, (boh) o3a.N(objArr, (Function0) O2, av8Var, 48), 24), av8Var, 0), 12.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2);
                    l8g a3 = k8g.a(wxfVar, lv1Var, av8Var, 48);
                    int hashCode3 = Long.hashCode(av8Var.T);
                    aee m3 = av8Var.m();
                    xtc C3 = fqj.C(av8Var, d04);
                    if3.k7.getClass();
                    zg3 zg3Var2 = hf3.b;
                    av8Var.h0();
                    if (av8Var.S) {
                        av8Var.l(zg3Var2);
                    } else {
                        av8Var.q0();
                    }
                    waa.K(av8Var, a3, hf3.g);
                    waa.K(av8Var, m3, hf3.f);
                    waa.K(av8Var, Integer.valueOf(hashCode3), hf3.j);
                    waa.J(av8Var, hf3.k);
                    waa.K(av8Var, C3, hf3.d);
                    String v = oea.v(R.string.full_tv_schedule, av8Var);
                    yf8 yf8Var3 = xth.a;
                    udj.c(v, null, lz.D(R.color.primary_default, av8Var), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.l(), av8Var, 0, 0, 131066);
                    kq9.b(s6a.N(R.drawable.ic_chevron_right_large_16, 6, av8Var), null, bkh.l(l98.f0(utcVar, 4.0f, 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, 4), 16.0f), lz.D(R.color.primary_default, av8Var), av8Var, 432, 0);
                    av8Var.s(true);
                    av8Var.s(true);
                } else {
                    av8Var.W();
                }
                break;
            default:
                jfj jfjVar = (jfj) obj8;
                jfj jfjVar2 = (jfj) obj7;
                jfj jfjVar3 = (jfj) obj6;
                jfj jfjVar4 = (jfj) obj5;
                jfj jfjVar5 = (jfj) serializable;
                jfj jfjVar6 = (jfj) obj4;
                of3 of3Var2 = (of3) obj2;
                ((Integer) obj3).getClass();
                ((o8g) obj).getClass();
                ty8 ty8Var = ty8.a;
                if (z) {
                    av8 av8Var2 = (av8) of3Var2;
                    av8Var2.d0(-857897348);
                    waa.i(true, jfjVar, jfjVar2, true, o8g.a(), av8Var2, 3078);
                    aba.i(c5n.t(nq8.F(nq8.N(ty8Var, 1.0f), 28.0f), new h1g(R.color.n_lv_4)), av8Var2, 0);
                    waa.i(true, jfjVar3, jfjVar4, false, o8g.a(), av8Var2, 3078);
                    av8Var2.s(false);
                } else {
                    av8 av8Var3 = (av8) of3Var2;
                    av8Var3.d0(-857151085);
                    waa.i(false, jfjVar5, jfjVar6, true, nq8.A(ty8Var), av8Var3, 3078);
                    av8Var3.s(false);
                }
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ l3k(boolean z, jfj jfjVar, jfj jfjVar2, jfj jfjVar3, jfj jfjVar4, jfj jfjVar5, jfj jfjVar6) {
        this.b = z;
        this.c = jfjVar;
        this.d = jfjVar2;
        this.e = jfjVar3;
        this.f = jfjVar4;
        this.g = jfjVar5;
        this.h = jfjVar6;
    }
}
