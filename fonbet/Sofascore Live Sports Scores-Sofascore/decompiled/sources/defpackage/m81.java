package defpackage;

import android.content.Context;
import android.view.View;
import androidx.compose.runtime.e;
import com.sofascore.model.chat.Message;
import com.sofascore.results.R;
import com.sofascore.results.fantasy.league.chat.FantasyLeagueChatFragment;
import com.sofascore.results.view.FeaturedMatchView;
import com.sofascore.results.view.typeheader.SegmentedButtonsView;
import com.unity3d.services.UnityAdsConstants;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class m81 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;

    public /* synthetic */ m81(boolean z, Function2 function2, int i) {
        this.a = 11;
        this.b = z;
        this.c = function2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i;
        int i2;
        int i3 = this.a;
        int i4 = 5;
        final boolean z = this.b;
        Object obj3 = this.c;
        switch (i3) {
            case 0:
                ((Integer) obj2).getClass();
                u6h.v((p91) obj3, z, (of3) obj, aba.K(49));
                return Unit.a;
            case 1:
                ((Integer) obj2).getClass();
                fqj.o((sk1) obj3, z, (of3) obj, aba.K(391));
                return Unit.a;
            case 2:
                ((Integer) obj2).getClass();
                o02.D((rl1) obj3, z, (of3) obj, aba.K(1));
                return Unit.a;
            case 3:
                ((Integer) obj2).getClass();
                l98.E((tbj) obj3, z, (of3) obj, aba.K(1));
                return Unit.a;
            case 4:
                FantasyLeagueChatFragment fantasyLeagueChatFragment = (FantasyLeagueChatFragment) obj3;
                Message message = (Message) obj;
                message.getClass();
                ((bq2) obj2).getClass();
                if (z) {
                    Context requireContext = fantasyLeagueChatFragment.requireContext();
                    requireContext.getClass();
                    ur2.a(requireContext, fantasyLeagueChatFragment.L(), bq2.b, message, fantasyLeagueChatFragment.K());
                }
                return Unit.a;
            case 5:
                gv9 gv9Var = (gv9) obj3;
                of3 of3Var = (of3) obj;
                int intValue = ((Integer) obj2).intValue();
                av8 av8Var = (av8) of3Var;
                if (av8Var.T(intValue & 1, (intValue & 3) != 2)) {
                    View view = (View) av8Var.k(nz.f);
                    qug o0 = hkg.o0(av8Var);
                    Object O = av8Var.O();
                    a99 a99Var = nf3.a;
                    if (O == a99Var) {
                        O = e.f(Boolean.TRUE);
                        av8Var.n0(O);
                    }
                    e1d e1dVar = (e1d) O;
                    ng0 ng0Var = new ng0(8.0f, true, new a70(6));
                    utc utcVar = utc.a;
                    xtc d0 = l98.d0(hkg.Z(fz8.Y(bkh.d(utcVar, 1.0f), n9a.b), o0, ((Boolean) e1dVar.getValue()).booleanValue(), 12), 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2);
                    Object O2 = av8Var.O();
                    if (O2 == a99Var) {
                        O2 = new fw6(i4, e1dVar);
                        av8Var.n0(O2);
                    }
                    xtc u = i9a.u(d0, view, o0, (Function1) O2, av8Var, 3072);
                    l8g a = k8g.a(ng0Var, uxf.l, av8Var, 6);
                    int hashCode = Long.hashCode(av8Var.T);
                    aee m = av8Var.m();
                    xtc C = fqj.C(av8Var, u);
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
                    av8Var.d0(1799803748);
                    Iterator it = yso.F(5, null, gv9Var).iterator();
                    while (it.hasNext()) {
                        wn1 wn1Var = (wn1) it.next();
                        xtc q = n9e.q(wnn.A(utcVar, o7g.a(8.0f)), lz.D(R.color.surface_P, av8Var), oyn.e);
                        k1c c = e12.c(uxf.c, false);
                        int hashCode2 = Long.hashCode(av8Var.T);
                        aee m2 = av8Var.m();
                        xtc C2 = fqj.C(av8Var, q);
                        if3.k7.getClass();
                        zg3 zg3Var2 = hf3.b;
                        av8Var.h0();
                        if (av8Var.S) {
                            av8Var.l(zg3Var2);
                        } else {
                            av8Var.q0();
                        }
                        waa.K(av8Var, c, hf3.g);
                        waa.K(av8Var, m2, hf3.f);
                        waa.K(av8Var, Integer.valueOf(hashCode2), hf3.j);
                        waa.J(av8Var, hf3.k);
                        waa.K(av8Var, C2, hf3.d);
                        Object O3 = av8Var.O();
                        if (O3 == a99Var) {
                            O3 = new yt6(29);
                            av8Var.n0(O3);
                        }
                        av8 av8Var2 = av8Var;
                        l98.b(wn1Var, null, (Function1) O3, null, null, null, yqo.H(-1104129901, av8Var, new et8() { // from class: c87
                            @Override // defpackage.et8
                            public final Object invoke(Object obj4, Object obj5, Object obj6, Object obj7) {
                                wn1 wn1Var2 = (wn1) obj5;
                                of3 of3Var2 = (of3) obj6;
                                int intValue2 = ((Integer) obj7).intValue();
                                ((k60) obj4).getClass();
                                utc utcVar2 = utc.a;
                                if (wn1Var2 != null) {
                                    av8 av8Var3 = (av8) of3Var2;
                                    av8Var3.d0(2020742109);
                                    xtc c2 = bkh.c(utcVar2, 1.0f);
                                    jca.s(wn1Var2, lz.D(R.color.surface_P, av8Var3), z, c2, av8Var3, ((intValue2 >> 3) & 14) | 27648, 0);
                                    av8Var3.s(false);
                                } else {
                                    av8 av8Var4 = (av8) of3Var2;
                                    av8Var4.d0(2021139343);
                                    jca.t(6, av8Var4, bkh.c(utcVar2, 1.0f));
                                    av8Var4.s(false);
                                }
                                return Unit.a;
                            }
                        }), av8Var2, 1573248, 58);
                        av8Var = av8Var2;
                        av8Var.s(true);
                    }
                    av8Var.s(false);
                    av8Var.s(true);
                } else {
                    av8Var.W();
                }
                return Unit.a;
            case 6:
                ald aldVar = (ald) obj3;
                of3 of3Var2 = (of3) obj;
                int intValue2 = ((Integer) obj2).intValue();
                int i5 = FeaturedMatchView.o;
                av8 av8Var3 = (av8) of3Var2;
                if (av8Var3.T(intValue2 & 1, (intValue2 & 3) != 2)) {
                    if (z) {
                        i = -598910077;
                        i2 = R.color.on_color_secondary;
                    } else {
                        i = -598909380;
                        i2 = R.color.n_lv_3;
                    }
                    qx9.a(aldVar, null, ljg.f(av8Var3, i, i2, av8Var3, false), av8Var3, 0, 2);
                } else {
                    av8Var3.W();
                }
                return Unit.a;
            case 7:
                ((Integer) obj2).getClass();
                nz9.e((uz9) obj3, z, (of3) obj, aba.K(1));
                return Unit.a;
            case 8:
                ((Integer) obj2).getClass();
                aza.b((eza) obj3, z, (of3) obj, aba.K(1));
                return Unit.a;
            case 9:
                ((Integer) obj2).getClass();
                m9b.g((x9b) obj3, z, (of3) obj, aba.K(1));
                return Unit.a;
            case 10:
                ((Integer) obj2).getClass();
                ktm.r((qnb) obj3, z, (of3) obj, aba.K(1));
                return Unit.a;
            case 11:
                ((Integer) obj2).getClass();
                o3a.f(z, (Function2) obj3, (of3) obj, aba.K(1));
                return Unit.a;
            case 12:
                return SegmentedButtonsView.o((SegmentedButtonsView) obj3, z, (of3) obj, ((Integer) obj2).intValue());
            case 13:
                ut2 ut2Var = (ut2) obj3;
                of3 of3Var3 = (of3) obj;
                int intValue3 = ((Integer) obj2).intValue();
                av8 av8Var4 = (av8) of3Var3;
                if (av8Var4.T(intValue3 & 1, (intValue3 & 3) != 2)) {
                    String str = ut2Var.b;
                    yf8 yf8Var = xth.a;
                    udj.c(str, null, z ? ljg.f(av8Var4, -1304641403, R.color.primary_default, av8Var4, false) : ljg.f(av8Var4, -1304640613, R.color.n_lv_1, av8Var4, false), null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, xth.e(), av8Var4, 0, 24960, 110586);
                } else {
                    av8Var4.W();
                }
                return Unit.a;
            case 14:
                h4j h4jVar = (h4j) obj3;
                of3 of3Var4 = (of3) obj;
                int intValue4 = ((Integer) obj2).intValue();
                av8 av8Var5 = (av8) of3Var4;
                if (av8Var5.T(intValue4 & 1, (intValue4 & 3) != 2)) {
                    goa goaVar = new goa(1.0f, true);
                    u23 a2 = t23.a(ww9.d, z ? uxf.o : uxf.q, av8Var5, 0);
                    int hashCode3 = Long.hashCode(av8Var5.T);
                    aee m3 = av8Var5.m();
                    xtc C3 = fqj.C(av8Var5, goaVar);
                    if3.k7.getClass();
                    zg3 zg3Var3 = hf3.b;
                    av8Var5.h0();
                    if (av8Var5.S) {
                        av8Var5.l(zg3Var3);
                    } else {
                        av8Var5.q0();
                    }
                    waa.K(av8Var5, a2, hf3.g);
                    waa.K(av8Var5, m3, hf3.f);
                    waa.K(av8Var5, Integer.valueOf(hashCode3), hf3.j);
                    waa.J(av8Var5, hf3.k);
                    waa.K(av8Var5, C3, hf3.d);
                    String i6 = mz1.i(h4jVar.f, "x");
                    yf8 yf8Var2 = xth.a;
                    udj.c(i6, null, lz.D(R.color.n_lv_1, av8Var5), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.k(), av8Var5, 0, 0, 131066);
                    udj.c(h4jVar.d, null, lz.D(R.color.n_lv_1, av8Var5), null, 0L, null, 0L, null, new p7j(z ? 5 : 6), 0L, 0, false, 0, 0, null, xth.g(), av8Var5, 0, 0, 130042);
                    av8Var5.s(true);
                } else {
                    av8Var5.W();
                }
                return Unit.a;
            case 15:
                return h8l.r((h8l) obj3, z, (String) obj, ((Integer) obj2).intValue());
            default:
                ((Integer) obj2).getClass();
                kjl.c((pqj) obj3, z, (of3) obj, aba.K(1));
                return Unit.a;
        }
    }

    public /* synthetic */ m81(Object obj, boolean z, int i) {
        this.a = i;
        this.c = obj;
        this.b = z;
    }

    public /* synthetic */ m81(boolean z, Object obj, int i) {
        this.a = i;
        this.b = z;
        this.c = obj;
    }

    public /* synthetic */ m81(int i, int i2, Object obj, boolean z) {
        this.a = i2;
        this.c = obj;
        this.b = z;
    }
}
