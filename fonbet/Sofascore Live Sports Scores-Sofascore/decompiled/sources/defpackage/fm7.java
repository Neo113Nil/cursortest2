package defpackage;

import com.appsflyer.internal.i;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.sofascore.results.R;
import com.sofascore.results.fantasy.competition.home.bottomsheet.topplayers.FantasyTopPlayersBottomSheet;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.a;
import kotlin.collections.b;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.KFunction;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class fm7 implements Function2 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ ksa b;
    public final /* synthetic */ FantasyTopPlayersBottomSheet c;
    public final /* synthetic */ ksa d;
    public final /* synthetic */ cdi e;

    public /* synthetic */ fm7(ksa ksaVar, FantasyTopPlayersBottomSheet fantasyTopPlayersBottomSheet, ksa ksaVar2, cdi cdiVar) {
        this.b = ksaVar;
        this.c = fantasyTopPlayersBottomSheet;
        this.d = ksaVar2;
        this.e = cdiVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        long j;
        int i = this.a;
        cdi cdiVar = this.e;
        FantasyTopPlayersBottomSheet fantasyTopPlayersBottomSheet = this.c;
        switch (i) {
            case 0:
                of3 of3Var = (of3) obj;
                int intValue = ((Integer) obj2).intValue();
                av8 av8Var = (av8) of3Var;
                if (av8Var.T(intValue & 1, (intValue & 3) != 2)) {
                    g28 g28Var = bkh.c;
                    xtc J = lz.J(g28Var, jaa.L(av8Var), null);
                    k1c c = e12.c(uxf.c, false);
                    int hashCode = Long.hashCode(av8Var.T);
                    aee m = av8Var.m();
                    xtc C = fqj.C(av8Var, J);
                    if3.k7.getClass();
                    zg3 zg3Var = hf3.b;
                    av8Var.h0();
                    if (av8Var.S) {
                        av8Var.l(zg3Var);
                    } else {
                        av8Var.q0();
                    }
                    waa.K(av8Var, c, hf3.g);
                    waa.K(av8Var, m, hf3.f);
                    waa.K(av8Var, Integer.valueOf(hashCode), hf3.j);
                    waa.J(av8Var, hf3.k);
                    waa.K(av8Var, C, hf3.d);
                    tol.b(nyd.a.a(null), yqo.H(465202308, av8Var, new fm7(this.b, fantasyTopPlayersBottomSheet, this.d, cdiVar)), av8Var, 56);
                    s6a.a(fantasyTopPlayersBottomSheet.G().k().e, g28Var, av8Var, 48);
                    av8Var.s(true);
                } else {
                    av8Var.W();
                }
                break;
            default:
                of3 of3Var2 = (of3) obj;
                int intValue2 = ((Integer) obj2).intValue();
                av8 av8Var2 = (av8) of3Var2;
                if (av8Var2.T(intValue2 & 1, (intValue2 & 3) != 2)) {
                    utc utcVar = utc.a;
                    xtc d = bkh.d(utcVar, 1.0f);
                    u23 a = t23.a(ww9.d, uxf.o, av8Var2, 0);
                    int hashCode2 = Long.hashCode(av8Var2.T);
                    aee m2 = av8Var2.m();
                    xtc C2 = fqj.C(av8Var2, d);
                    if3.k7.getClass();
                    zg3 zg3Var2 = hf3.b;
                    av8Var2.h0();
                    if (av8Var2.S) {
                        av8Var2.l(zg3Var2);
                    } else {
                        av8Var2.q0();
                    }
                    f50 f50Var = hf3.g;
                    waa.K(av8Var2, a, f50Var);
                    ff3 ff3Var = hf3.f;
                    waa.K(av8Var2, m2, ff3Var);
                    Integer valueOf = Integer.valueOf(hashCode2);
                    f50 f50Var2 = hf3.j;
                    waa.K(av8Var2, valueOf, f50Var2);
                    ry ryVar = hf3.k;
                    waa.J(av8Var2, ryVar);
                    f50 f50Var3 = hf3.d;
                    waa.K(av8Var2, C2, f50Var3);
                    lv1 lv1Var = uxf.m;
                    xtc e = bkh.e(utcVar, 48.0f);
                    l8g a2 = k8g.a(ww9.b, lv1Var, av8Var2, 48);
                    int hashCode3 = Long.hashCode(av8Var2.T);
                    aee m3 = av8Var2.m();
                    xtc C3 = fqj.C(av8Var2, e);
                    av8Var2.h0();
                    if (av8Var2.S) {
                        av8Var2.l(zg3Var2);
                    } else {
                        av8Var2.q0();
                    }
                    waa.K(av8Var2, a2, f50Var);
                    waa.K(av8Var2, m3, ff3Var);
                    bf3.s(hashCode3, av8Var2, f50Var2, av8Var2, ryVar);
                    goa g = ljg.g(av8Var2, C3, f50Var3, 1.0f, true);
                    k1c c2 = e12.c(uxf.c, false);
                    int hashCode4 = Long.hashCode(av8Var2.T);
                    aee m4 = av8Var2.m();
                    xtc C4 = fqj.C(av8Var2, g);
                    av8Var2.h0();
                    if (av8Var2.S) {
                        av8Var2.l(zg3Var2);
                    } else {
                        av8Var2.q0();
                    }
                    waa.K(av8Var2, c2, f50Var);
                    waa.K(av8Var2, m4, ff3Var);
                    bf3.s(hashCode4, av8Var2, f50Var2, av8Var2, ryVar);
                    waa.K(av8Var2, C4, f50Var3);
                    av8Var2.d0(1410788406);
                    gv9<cm7> gv9Var = fantasyTopPlayersBottomSheet.G().k().a;
                    ArrayList arrayList = new ArrayList(k13.r(gv9Var, 10));
                    for (cm7 cm7Var : gv9Var) {
                        arrayList.add(new vt2(cm7Var, oea.v(cm7Var.a, av8Var2), false, null, null, null, null, 252));
                    }
                    av8Var2.s(false);
                    gv9 W = l6g.W(arrayList);
                    cm7 cm7Var2 = fantasyTopPlayersBottomSheet.G().k().c;
                    im7 G = fantasyTopPlayersBottomSheet.G();
                    boolean i2 = av8Var2.i(G);
                    Object O = av8Var2.O();
                    a99 a99Var = nf3.a;
                    if (i2 || O == a99Var) {
                        O = new s26(1, G, im7.class, "selectCategory", "selectCategory(Lcom/sofascore/results/fantasy/competition/home/components/FantasyTopPlayerCategory;)V", 0, 11);
                        av8Var2.n0(O);
                    }
                    t3e B = l98.B(12.0f, 2);
                    mv1 mv1Var = uxf.f;
                    n12 n12Var = n12.a;
                    xtc a3 = n12Var.a(utcVar, mv1Var);
                    ksa ksaVar = this.d;
                    trh.a(W, cm7Var2, (Function1) ((KFunction) O), a3, ksaVar, B, null, false, false, false, null, null, av8Var2, 196608, 4032);
                    if (ksaVar.d()) {
                        av8Var2.d0(785388589);
                        e12.a(0, av8Var2, n9e.p(bkh.p(bkh.c(n12Var.a(utcVar, uxf.h), 1.0f), 2.0f), wxf.s(b.j(new r13(r13.h), new r13(r13.c(r13.b, 0.1f))), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 14), null, 6));
                        av8Var2.s(false);
                    } else {
                        av8Var2.d0(786296734);
                        av8Var2.s(false);
                    }
                    i.o(av8Var2, true, utcVar, 8.0f, av8Var2);
                    xtc f0 = l98.f0(utcVar, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 12.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 11);
                    gv9 W2 = l6g.W(CollectionsKt.w0(rz6.m, a.c(null)));
                    rz6 rz6Var = fantasyTopPlayersBottomSheet.G().k().d;
                    im7 G2 = fantasyTopPlayersBottomSheet.G();
                    boolean i3 = av8Var2.i(G2);
                    Object O2 = av8Var2.O();
                    if (i3 || O2 == a99Var) {
                        s26 s26Var = new s26(1, G2, im7.class, "selectPosition", "selectPosition(Lcom/sofascore/results/fantasy/ui/model/FantasyFootballPlayerPosition;)V", 0, 12);
                        av8Var2.n0(s26Var);
                        O2 = s26Var;
                    }
                    l6g.p(W2, rz6Var, (Function1) ((KFunction) O2), f0, null, false, yqo.H(-1599670922, av8Var2, new s16(fantasyTopPlayersBottomSheet, 19)), av8Var2, 905972736);
                    av8Var2.s(true);
                    if (((Boolean) cdiVar.getValue()).booleanValue()) {
                        j = ljg.f(av8Var2, -1968337449, R.color.n_lv_4, av8Var2, false);
                    } else {
                        av8Var2.d0(-1968336775);
                        av8Var2.s(false);
                        j = r13.i;
                    }
                    tz9.d(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0, 13, j, 0L, av8Var2, null);
                    goa goaVar = new goa(1.0f, true);
                    t3e C5 = l98.C(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 48.0f, 5);
                    boolean i4 = av8Var2.i(fantasyTopPlayersBottomSheet);
                    Object O3 = av8Var2.O();
                    if (i4 || O3 == a99Var) {
                        O3 = new x16(fantasyTopPlayersBottomSheet, 24);
                        av8Var2.n0(O3);
                    }
                    v8a.a(goaVar, this.b, C5, null, null, null, false, null, (Function1) O3, av8Var2, 0, PglCryptUtils.BASE64_FAILED);
                    av8Var2.s(true);
                } else {
                    av8Var2.W();
                }
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ fm7(FantasyTopPlayersBottomSheet fantasyTopPlayersBottomSheet, ksa ksaVar, ksa ksaVar2, cdi cdiVar) {
        this.c = fantasyTopPlayersBottomSheet;
        this.b = ksaVar;
        this.d = ksaVar2;
        this.e = cdiVar;
    }
}
