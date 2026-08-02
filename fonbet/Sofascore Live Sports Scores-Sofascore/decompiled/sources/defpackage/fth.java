package defpackage;

import com.sofascore.results.R;
import com.sofascore.results.fantasy.ui.model.FantasyRoundPlayerUiModel;
import com.unity3d.services.UnityAdsConstants;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class fth implements ct8 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ Function0 b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    public /* synthetic */ fth(hth hthVar, e1d e1dVar, e1d e1dVar2, q50 q50Var, Function0 function0, vfi vfiVar, e1d e1dVar3) {
        this.c = hthVar;
        this.d = e1dVar;
        this.e = e1dVar2;
        this.g = q50Var;
        this.b = function0;
        this.h = vfiVar;
        this.f = e1dVar3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:64:0x0378, code lost:
    
        if (r3 == r1) goto L68;
     */
    @Override // defpackage.ct8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Object obj4;
        int i = this.a;
        Object obj5 = nf3.a;
        Object obj6 = this.h;
        Object obj7 = this.g;
        Object obj8 = this.f;
        Object obj9 = this.e;
        Object obj10 = this.d;
        Object obj11 = this.c;
        int i2 = 2;
        switch (i) {
            case 0:
                hth hthVar = (hth) obj11;
                gv9 gv9Var = hthVar.a;
                e1d e1dVar = (e1d) obj10;
                e1d e1dVar2 = (e1d) obj9;
                q50 q50Var = (q50) obj7;
                vfi vfiVar = (vfi) obj6;
                e1d e1dVar3 = (e1d) obj8;
                s22 s22Var = (s22) obj;
                of3 of3Var = (of3) obj2;
                int intValue = ((Integer) obj3).intValue();
                mv1 mv1Var = uxf.g;
                s22Var.getClass();
                if ((intValue & 6) == 0) {
                    intValue |= ((av8) of3Var).g(s22Var) ? 4 : 2;
                }
                av8 av8Var = (av8) of3Var;
                if (av8Var.T(intValue & 1, (intValue & 19) != 18)) {
                    e1dVar.setValue(new p75(s22Var.c()));
                    e1dVar2.setValue(new p75(s22Var.b()));
                    if (gv9Var.isEmpty()) {
                        av8Var.d0(1332659572);
                        g28 g28Var = bkh.c;
                        k1c c = e12.c(mv1Var, false);
                        int hashCode = Long.hashCode(av8Var.T);
                        aee m = av8Var.m();
                        xtc C = fqj.C(av8Var, g28Var);
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
                        ncf.a(null, lz.D(R.color.on_color_primary, av8Var), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0L, 0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, av8Var, 0, 61);
                        av8Var.s(true);
                        av8Var.s(false);
                    } else {
                        av8Var.d0(1332962132);
                        xtc f0 = ml4.f0(l98.f0(bkh.c, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 16.0f, 7));
                        u23 a = t23.a(ww9.d, uxf.o, av8Var, 0);
                        int hashCode2 = Long.hashCode(av8Var.T);
                        aee m2 = av8Var.m();
                        xtc C2 = fqj.C(av8Var, f0);
                        if3.k7.getClass();
                        zg3 zg3Var2 = hf3.b;
                        av8Var.h0();
                        if (av8Var.S) {
                            av8Var.l(zg3Var2);
                        } else {
                            av8Var.q0();
                        }
                        f50 f50Var = hf3.g;
                        waa.K(av8Var, a, f50Var);
                        ff3 ff3Var = hf3.f;
                        waa.K(av8Var, m2, ff3Var);
                        Integer valueOf = Integer.valueOf(hashCode2);
                        f50 f50Var2 = hf3.j;
                        waa.K(av8Var, valueOf, f50Var2);
                        ry ryVar = hf3.k;
                        waa.J(av8Var, ryVar);
                        f50 f50Var3 = hf3.d;
                        waa.K(av8Var, C2, f50Var3);
                        int size = gv9Var.size();
                        int i3 = hthVar.b;
                        float f = hthVar.d;
                        utc utcVar = utc.a;
                        l98.D(f, size, i3, 0, av8Var, mha.G(ml4.q0(l98.d0(utcVar, 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2)), 100.0f));
                        xtc G = mha.G(l98.c0(bkh.d(utcVar, 1.0f), 16.0f, 12.0f), 1.0f);
                        l8g a2 = k8g.a(ww9.b, uxf.m, av8Var, 48);
                        int hashCode3 = Long.hashCode(av8Var.T);
                        aee m3 = av8Var.m();
                        xtc C3 = fqj.C(av8Var, G);
                        av8Var.h0();
                        if (av8Var.S) {
                            av8Var.l(zg3Var2);
                        } else {
                            av8Var.q0();
                        }
                        waa.K(av8Var, a2, f50Var);
                        waa.K(av8Var, m3, ff3Var);
                        bf3.s(hashCode3, av8Var, f50Var2, av8Var, ryVar);
                        waa.K(av8Var, C3, f50Var3);
                        kq9.a(haa.t(R.drawable.ic_sofascore_2, 0, av8Var), "Logo", null, lz.D(R.color.on_color_primary, av8Var), av8Var, 56, 4);
                        w1l.o(1.0f, true, av8Var);
                        ao2.g(this.b, null, false, null, null, gvd.c, av8Var, 1572864, 62);
                        av8Var.s(true);
                        xtc G2 = mha.G(l98.d0(fn0.e(1.0f, bkh.d(utcVar, 1.0f), true), 28.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                        k1c c2 = e12.c(mv1Var, false);
                        int hashCode4 = Long.hashCode(av8Var.T);
                        aee m4 = av8Var.m();
                        xtc C4 = fqj.C(av8Var, G2);
                        av8Var.h0();
                        if (av8Var.S) {
                            av8Var.l(zg3Var2);
                        } else {
                            av8Var.q0();
                        }
                        waa.K(av8Var, c2, f50Var);
                        waa.K(av8Var, m4, ff3Var);
                        bf3.s(hashCode4, av8Var, f50Var2, av8Var, ryVar);
                        waa.K(av8Var, C4, f50Var3);
                        Iterator it = CollectionsKt.L0(t2k.a, 13).iterator();
                        float f2 = 1.0f;
                        while (it.hasNext()) {
                            f2 *= 1.0f - (((Number) it.next()).floatValue() * 2.0f);
                        }
                        ml4.C(hthVar, vfiVar, ((p75) e1dVar.getValue()).a / (((p75) e1dVar.getValue()).a * f2), ((p75) e1dVar2.getValue()).a / (((p75) e1dVar2.getValue()).a * f2), av8Var, 0);
                        vsh.a(hthVar, av8Var, 0);
                        av8Var.s(true);
                        we9 we9Var = new we9(uxf.p);
                        boolean i4 = av8Var.i(q50Var);
                        Object O = av8Var.O();
                        if (!i4) {
                            obj4 = obj5;
                            break;
                        } else {
                            obj4 = obj5;
                        }
                        O = new atc(q50Var, 2);
                        av8Var.n0(O);
                        xtc M = s02.M(we9Var, (Function1) O);
                        Object O2 = av8Var.O();
                        if (O2 == obj4) {
                            O2 = new tra(20, e1dVar3);
                            av8Var.n0(O2);
                        }
                        l98.F(48, av8Var, M, (Function0) O2);
                        av8Var.s(true);
                        av8Var.s(false);
                    }
                } else {
                    av8Var.W();
                }
                break;
            default:
                Function1 function1 = (Function1) obj11;
                FantasyRoundPlayerUiModel fantasyRoundPlayerUiModel = (FantasyRoundPlayerUiModel) obj10;
                Function1 function12 = (Function1) obj9;
                jz6 jz6Var = (jz6) obj8;
                ku3 ku3Var = (ku3) obj7;
                dfh dfhVar = (dfh) obj6;
                of3 of3Var2 = (of3) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                ((v23) obj).getClass();
                av8 av8Var2 = (av8) of3Var2;
                if (av8Var2.T(intValue2 & 1, (intValue2 & 17) != 16)) {
                    s67 s67Var = s67.i;
                    s67 s67Var2 = s67.l;
                    boolean g = av8Var2.g(function1) | av8Var2.g(fantasyRoundPlayerUiModel);
                    Object O3 = av8Var2.O();
                    if (g || O3 == obj5) {
                        O3 = new lw6(function1, fantasyRoundPlayerUiModel, 3);
                        av8Var2.n0(O3);
                    }
                    Function0 function0 = (Function0) O3;
                    boolean g2 = av8Var2.g(function12) | av8Var2.g(fantasyRoundPlayerUiModel);
                    Object O4 = av8Var2.O();
                    if (g2 || O4 == obj5) {
                        O4 = new lw6(function12, fantasyRoundPlayerUiModel, 4);
                        av8Var2.n0(O4);
                    }
                    rse rseVar = new rse(s67Var, s67Var2, function0, (Function0) O4);
                    boolean i5 = av8Var2.i(ku3Var) | av8Var2.g(dfhVar);
                    Function0 function02 = this.b;
                    boolean g3 = i5 | av8Var2.g(function02);
                    Object O5 = av8Var2.O();
                    if (g3 || O5 == obj5) {
                        O5 = new t87(ku3Var, dfhVar, function02, i2);
                        av8Var2.n0(O5);
                    }
                    o1j.l(jz6Var, rseVar, (Function0) O5, null, null, false, av8Var2, 196608, 24);
                } else {
                    av8Var2.W();
                }
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ fth(Function1 function1, FantasyRoundPlayerUiModel fantasyRoundPlayerUiModel, Function1 function12, jz6 jz6Var, ku3 ku3Var, dfh dfhVar, Function0 function0) {
        this.c = function1;
        this.d = fantasyRoundPlayerUiModel;
        this.e = function12;
        this.f = jz6Var;
        this.g = ku3Var;
        this.h = dfhVar;
        this.b = function0;
    }
}
