package defpackage;

import android.content.Context;
import androidx.compose.ui.graphics.vector.ImageVector;
import com.sofascore.local_persistance.Brand;
import com.sofascore.local_persistance.BrandingFantasyCompetition;
import com.sofascore.model.crowdsourcing.CrowdsourcingContribution;
import com.sofascore.model.mvvm.model.BaseballInningInfo;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.newNetwork.statistics.BaseballPitch;
import com.sofascore.model.newNetwork.statistics.PlayerHand;
import com.sofascore.model.profile.ContributionStatus;
import com.sofascore.results.R;
import com.sofascore.results.event.odds.model.OddsEventUIModel;
import com.unity3d.services.UnityAdsConstants;
import java.text.Collator;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class vn6 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ vn6(BrandingFantasyCompetition brandingFantasyCompetition, ev6 ev6Var) {
        this.a = 0;
        this.b = brandingFantasyCompetition;
        this.c = ev6Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        long j;
        long j2;
        boolean z;
        gv9 gv9Var;
        gv9 gv9Var2;
        gv9 gv9Var3;
        int i = this.a;
        a99 a99Var = nf3.a;
        utc utcVar = utc.a;
        int i2 = 1;
        Object obj3 = this.c;
        Object obj4 = this.b;
        switch (i) {
            case 0:
                BrandingFantasyCompetition brandingFantasyCompetition = (BrandingFantasyCompetition) obj4;
                ev6 ev6Var = (ev6) obj3;
                of3 of3Var = (of3) obj;
                int intValue = ((Integer) obj2).intValue();
                av8 av8Var = (av8) of3Var;
                if (av8Var.T(intValue & 1, (intValue & 3) != 2)) {
                    g28 g28Var = bkh.c;
                    k1c c = e12.c(uxf.c, false);
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
                    f50 f50Var = hf3.g;
                    waa.K(av8Var, c, f50Var);
                    ff3 ff3Var = hf3.f;
                    waa.K(av8Var, m, ff3Var);
                    Integer valueOf = Integer.valueOf(hashCode);
                    f50 f50Var2 = hf3.j;
                    waa.K(av8Var, valueOf, f50Var2);
                    ry ryVar = hf3.k;
                    waa.J(av8Var, ryVar);
                    f50 f50Var3 = hf3.d;
                    waa.K(av8Var, C, f50Var3);
                    d7e t = haa.t(2131231477, 0, av8Var);
                    jf9 jf9Var = oyn.e;
                    wkn.k(t, null, yqo.u(g28Var, 2.0f, 2.0f, jf9Var), null, mp3.a, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, av8Var, 25016, 104);
                    e12.a(0, av8Var, n9e.q(g28Var, lz.D(R.color.darken_overlay_2, av8Var), jf9Var));
                    kv1 kv1Var = uxf.p;
                    xtc b0 = l98.b0(n12.a.a(utcVar, uxf.g), 8.0f);
                    u23 a = t23.a(ww9.d, kv1Var, av8Var, 48);
                    int hashCode2 = Long.hashCode(av8Var.T);
                    aee m2 = av8Var.m();
                    xtc C2 = fqj.C(av8Var, b0);
                    av8Var.h0();
                    if (av8Var.S) {
                        av8Var.l(zg3Var);
                    } else {
                        av8Var.q0();
                    }
                    waa.K(av8Var, a, f50Var);
                    waa.K(av8Var, m2, ff3Var);
                    bf3.s(hashCode2, av8Var, f50Var2, av8Var, ryVar);
                    waa.K(av8Var, C2, f50Var3);
                    kq9.b(s6a.N(R.drawable.ic_sofascore_logo_watermark, 6, av8Var), null, null, lz.D(R.color.on_color_primary, av8Var), av8Var, 48, 4);
                    nq8.h(av8Var, bkh.e(utcVar, 48.0f));
                    l8g a2 = k8g.a(ww9.b, uxf.m, av8Var, 48);
                    int hashCode3 = Long.hashCode(av8Var.T);
                    aee m3 = av8Var.m();
                    xtc C3 = fqj.C(av8Var, utcVar);
                    av8Var.h0();
                    if (av8Var.S) {
                        av8Var.l(zg3Var);
                    } else {
                        av8Var.q0();
                    }
                    waa.K(av8Var, a2, f50Var);
                    waa.K(av8Var, m3, ff3Var);
                    bf3.s(hashCode3, av8Var, f50Var2, av8Var, ryVar);
                    waa.K(av8Var, C3, f50Var3);
                    td4.q(ev6Var.g, ev6Var.a, ev6Var.y, bkh.l(utcVar, 40.0f), av8Var, 3072);
                    nq8.h(av8Var, bkh.p(utcVar, 16.0f));
                    String str = ev6Var.e;
                    long D = lz.D(R.color.on_color_primary, av8Var);
                    yf8 yf8Var = xth.a;
                    udj.c(str, null, D, null, 0L, null, 0L, null, new p7j(3), 0L, 2, false, 2, 0, null, xth.h(), av8Var, 0, 24960, 109562);
                    bf3.t(av8Var, true, utcVar, 48.0f, av8Var);
                    udj.c(oea.v(R.string.powered_by, av8Var), null, lz.D(R.color.on_color_primary, av8Var), null, 0L, null, 0L, null, new p7j(3), 0L, 0, false, 0, 0, null, xth.e(), av8Var, 0, 0, 130042);
                    nq8.h(av8Var, bkh.e(utcVar, 8.0f));
                    Brand brand = brandingFantasyCompetition.getBrand();
                    td4.n(brand != null ? brand.getId() : 0, bkh.p(bkh.e(utcVar, 64.0f), 96.0f), uxf.d, av8Var, 432);
                    av8Var.s(true);
                    av8Var.s(true);
                } else {
                    av8Var.W();
                }
                return Unit.a;
            case 1:
                ((Integer) obj2).getClass();
                hi.a((eld) obj4, (OddsEventUIModel) obj3, (of3) obj, aba.K(1));
                return Unit.a;
            case 2:
                ((Integer) obj2).getClass();
                iz8.b((vnb) obj4, (ksa) obj3, (of3) obj, aba.K(1));
                return Unit.a;
            case 3:
                float floatValue = ((Float) obj).floatValue();
                ((ax) obj4).a(floatValue, ((Float) obj2).floatValue());
                ((csf) obj3).a = floatValue;
                return Unit.a;
            case 4:
                ((Integer) obj2).getClass();
                v9g.q((mm0) obj4, (xtc) obj3, (of3) obj, aba.K(1));
                return Unit.a;
            case 5:
                ((Integer) obj2).getClass();
                l6g.b((fm8) obj4, (Function1) obj3, (of3) obj, aba.K(1));
                return Unit.a;
            case 6:
                ((Integer) obj2).getClass();
                u6h.t((BaseballPitch) obj4, (BaseballPitch) obj3, (of3) obj, aba.K(1));
                return Unit.a;
            case 7:
                ((Integer) obj2).getClass();
                u6h.u((gv9) obj4, (PlayerHand) obj3, (of3) obj, aba.K(1));
                return Unit.a;
            case 8:
                ((Integer) obj2).getClass();
                v81.b((BaseballInningInfo) obj4, (xtc) obj3, (of3) obj, aba.K(1));
                return Unit.a;
            case 9:
                ((Integer) obj2).getClass();
                u91.a((r91) obj4, (Function1) obj3, (of3) obj, aba.K(1));
                return Unit.a;
            case 10:
                r91 r91Var = (r91) obj4;
                v91 v91Var = (v91) obj3;
                of3 of3Var2 = (of3) obj;
                int intValue2 = ((Integer) obj2).intValue();
                av8 av8Var2 = (av8) of3Var2;
                if (av8Var2.T(intValue2 & 1, (intValue2 & 3) != 2)) {
                    v9b v9bVar = v91Var.l;
                    if (v9bVar == null) {
                        Intrinsics.i("clickHandler");
                        throw null;
                    }
                    u91.a(r91Var, v9bVar, av8Var2, 0);
                } else {
                    av8Var2.W();
                }
                return Unit.a;
            case 11:
                ((Integer) obj2).getClass();
                ek1.c((fk1) obj4, (Function1) obj3, (of3) obj, aba.K(1));
                return Unit.a;
            case 12:
                ((Integer) obj2).getClass();
                fqj.d((Pair) obj4, (xtc) obj3, (of3) obj, aba.K(1));
                return Unit.a;
            case 13:
                Context context = (Context) obj4;
                sk1 sk1Var = (sk1) obj3;
                of3 of3Var3 = (of3) obj;
                int intValue3 = ((Integer) obj2).intValue();
                av8 av8Var3 = (av8) of3Var3;
                if (av8Var3.T(intValue3 & 1, (intValue3 & 3) != 2)) {
                    if (1.0f <= 0.0d) {
                        p3a.a("invalid weight; must be greater than zero");
                    }
                    xtc A = wnn.A(new goa(1.0f <= Float.MAX_VALUE ? 1.0f : Float.MAX_VALUE, true), o7g.a(4.0f));
                    long D2 = lz.D(R.color.n_lv_4, av8Var3);
                    Object O = av8Var3.O();
                    if (O == a99Var) {
                        O = mz1.e(av8Var3);
                    }
                    wzc wzcVar = (wzc) O;
                    Object[] objArr = new Object[0];
                    Object O2 = av8Var3.O();
                    if (O2 == a99Var) {
                        O2 = fi.j;
                        av8Var3.n0(O2);
                    }
                    xtc Y = fz8.Y(l98.f0(tol.y(A, true, true, true, D2, wzcVar, new gi(i2, (boh) o3a.N(objArr, (Function0) O2, av8Var3, 48), context, sk1Var), av8Var3, 0), 16.0f, 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, 4), n9a.a);
                    ng0 ng0Var = new ng0(16.0f, true, new a70(6));
                    lv1 lv1Var = uxf.l;
                    l8g a3 = k8g.a(ng0Var, lv1Var, av8Var3, 6);
                    int hashCode4 = Long.hashCode(av8Var3.T);
                    aee m4 = av8Var3.m();
                    xtc C4 = fqj.C(av8Var3, Y);
                    if3.k7.getClass();
                    zg3 zg3Var2 = hf3.b;
                    av8Var3.h0();
                    if (av8Var3.S) {
                        av8Var3.l(zg3Var2);
                    } else {
                        av8Var3.q0();
                    }
                    f50 f50Var4 = hf3.g;
                    waa.K(av8Var3, a3, f50Var4);
                    ff3 ff3Var2 = hf3.f;
                    waa.K(av8Var3, m4, ff3Var2);
                    Integer valueOf2 = Integer.valueOf(hashCode4);
                    f50 f50Var5 = hf3.j;
                    waa.K(av8Var3, valueOf2, f50Var5);
                    ry ryVar2 = hf3.k;
                    waa.J(av8Var3, ryVar2);
                    f50 f50Var6 = hf3.d;
                    waa.K(av8Var3, C4, f50Var6);
                    int i3 = sk1Var.a;
                    Integer num = sk1Var.d;
                    td4.C(i3, bkh.l(utcVar, 40.0f), 0L, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, av8Var3, 48, 12);
                    xtc c2 = bkh.c(utcVar, 1.0f);
                    u23 a4 = t23.a(ww9.f, uxf.o, av8Var3, 6);
                    int hashCode5 = Long.hashCode(av8Var3.T);
                    aee m5 = av8Var3.m();
                    xtc C5 = fqj.C(av8Var3, c2);
                    av8Var3.h0();
                    if (av8Var3.S) {
                        av8Var3.l(zg3Var2);
                    } else {
                        av8Var3.q0();
                    }
                    waa.K(av8Var3, a4, f50Var4);
                    waa.K(av8Var3, m5, ff3Var2);
                    bf3.s(hashCode5, av8Var3, f50Var5, av8Var3, ryVar2);
                    waa.K(av8Var3, C5, f50Var6);
                    String O3 = l4a.O(sk1Var.b);
                    long D3 = lz.D(R.color.n_lv_1, av8Var3);
                    yf8 yf8Var2 = xth.a;
                    udj.c(O3, null, D3, null, 0L, null, 0L, null, new p7j(5), 0L, 2, false, 1, 0, null, xth.e(), av8Var3, 0, 24960, 109562);
                    if (sk1Var.c == null) {
                        av8Var3.d0(-380310487);
                        av8Var3.s(false);
                        z = true;
                    } else {
                        bf3.r(4.0f, -380310486, av8Var3, av8Var3, utcVar);
                        l8g a5 = k8g.a(ww9.b, lv1Var, av8Var3, 0);
                        int hashCode6 = Long.hashCode(av8Var3.T);
                        aee m6 = av8Var3.m();
                        xtc C6 = fqj.C(av8Var3, utcVar);
                        av8Var3.h0();
                        if (av8Var3.S) {
                            av8Var3.l(zg3Var2);
                        } else {
                            av8Var3.q0();
                        }
                        waa.K(av8Var3, a5, f50Var4);
                        waa.K(av8Var3, m6, ff3Var2);
                        bf3.s(hashCode6, av8Var3, f50Var5, av8Var3, ryVar2);
                        waa.K(av8Var3, C6, f50Var6);
                        Integer num2 = sk1Var.e;
                        if (num2 == null) {
                            av8Var3.d0(950598283);
                            av8Var3.s(false);
                        } else {
                            av8Var3.d0(950598284);
                            int intValue4 = num2.intValue();
                            xtc l = bkh.l(utcVar, 16.0f);
                            ImageVector N = s6a.N(intValue4, 6, av8Var3);
                            r13 r13Var = num != null ? new r13(hkg.b(num.intValue())) : null;
                            if (r13Var == null) {
                                j = ljg.f(av8Var3, 1856211979, R.color.n_lv_3, av8Var3, false);
                            } else {
                                av8Var3.d0(1856210615);
                                av8Var3.s(false);
                                j = r13Var.a;
                            }
                            kq9.b(N, null, l, j, av8Var3, 432, 0);
                            Unit unit = Unit.a;
                            av8Var3.s(false);
                        }
                        String str2 = sk1Var.c;
                        r13 r13Var2 = num != null ? new r13(hkg.b(num.intValue())) : null;
                        if (r13Var2 == null) {
                            j2 = ljg.f(av8Var3, 1416157249, R.color.n_lv_3, av8Var3, false);
                        } else {
                            av8Var3.d0(1416155885);
                            av8Var3.s(false);
                            j2 = r13Var2.a;
                        }
                        udj.c(str2, null, j2, null, 0L, null, 0L, null, new p7j(5), 0L, 2, false, 1, 0, null, xth.b(), av8Var3, 0, 24960, 109562);
                        z = true;
                        av8Var3.s(true);
                        av8Var3.s(false);
                    }
                    av8Var3.s(z);
                    av8Var3.s(z);
                } else {
                    av8Var3.W();
                }
                return Unit.a;
            case 14:
                om1 om1Var = (om1) obj4;
                Event event = (Event) obj3;
                of3 of3Var4 = (of3) obj;
                int intValue5 = ((Integer) obj2).intValue();
                av8 av8Var4 = (av8) of3Var4;
                if (av8Var4.T(intValue5 & 1, (intValue5 & 3) != 2)) {
                    e1d e1dVar = om1Var.d;
                    int id = Event.getHomeTeam$default(event, null, 1, null).getId();
                    int id2 = Event.getAwayTeam$default(event, null, 1, null).getId();
                    eoh eohVar = (eoh) e1dVar;
                    wsi wsiVar = (wsi) eohVar.getValue();
                    if (wsiVar == null || (gv9Var = wsiVar.a) == null) {
                        gv9Var = rlh.b;
                    }
                    gv9 gv9Var4 = gv9Var;
                    wsi wsiVar2 = (wsi) eohVar.getValue();
                    if (wsiVar2 == null || (gv9Var2 = wsiVar2.b) == null) {
                        gv9Var2 = rlh.b;
                    }
                    gv9 gv9Var5 = gv9Var2;
                    wsi wsiVar3 = (wsi) eohVar.getValue();
                    gv9 gv9Var6 = wsiVar3 != null ? wsiVar3.c : rlh.b;
                    wsi wsiVar4 = (wsi) eohVar.getValue();
                    if (wsiVar4 == null || (gv9Var3 = wsiVar4.d) == null) {
                        gv9Var3 = rlh.b;
                    }
                    gv9 gv9Var7 = gv9Var3;
                    wsi wsiVar5 = (wsi) eohVar.getValue();
                    boolean c3 = Intrinsics.c(wsiVar5 != null ? Boolean.valueOf(wsiVar5.f) : null, Boolean.TRUE);
                    wsi wsiVar6 = (wsi) eohVar.getValue();
                    vsi vsiVar = wsiVar6 != null ? wsiVar6.g : null;
                    wsi wsiVar7 = (wsi) eohVar.getValue();
                    vsi vsiVar2 = wsiVar7 != null ? wsiVar7.h : null;
                    xtc c0 = l98.c0(utcVar, 8.0f, 4.0f);
                    boolean g = av8Var4.g(eohVar) | av8Var4.i(om1Var);
                    Object O4 = av8Var4.O();
                    Object obj5 = O4;
                    if (g || O4 == a99Var) {
                        s1 s1Var = new s1(16, om1Var, eohVar);
                        av8Var4.n0(s1Var);
                        obj5 = s1Var;
                    }
                    xw3.a(id, id2, gv9Var4, gv9Var5, c3, gv9Var6, gv9Var7, vsiVar, vsiVar2, (Function1) obj5, c0, av8Var4, 0);
                } else {
                    av8Var4.W();
                }
                return Unit.a;
            case 15:
                ((Integer) obj2).getClass();
                xw3.m((lm1) obj4, (xtc) obj3, (of3) obj, aba.K(1));
                return Unit.a;
            case 16:
                ((Integer) obj2).getClass();
                l98.d((en1) obj4, (xtc) obj3, (of3) obj, aba.K(1));
                return Unit.a;
            case 17:
                ((Integer) obj2).getClass();
                ((p4h) obj4).a((tc3) obj3, (of3) obj, aba.K(7));
                return Unit.a;
            case 18:
                ((Integer) obj2).getClass();
                gr1.a((tee) obj4, (xtc) obj3, (of3) obj, aba.K(1));
                return Unit.a;
            case 19:
                yji yjiVar = (yji) obj;
                an3 an3Var = (an3) obj2;
                return ((k1c) obj4).d(yjiVar, yjiVar.t(Unit.a, new tc3(-431986394, new vn6(20, (tc3) obj3, new s22(yjiVar, an3Var.a)), true)), an3Var.a);
            case 20:
                tc3 tc3Var = (tc3) obj4;
                s22 s22Var = (s22) obj3;
                of3 of3Var5 = (of3) obj;
                int intValue6 = ((Integer) obj2).intValue();
                av8 av8Var5 = (av8) of3Var5;
                if (av8Var5.T(intValue6 & 1, (intValue6 & 3) != 2)) {
                    tc3Var.invoke(s22Var, av8Var5, 0);
                } else {
                    av8Var5.W();
                }
                return Unit.a;
            case 21:
                dsf dsfVar = (dsf) obj3;
                CoroutineContext.Element element = (CoroutineContext.Element) obj2;
                ((Unit) obj).getClass();
                element.getClass();
                int i4 = dsfVar.a;
                dsfVar.a = i4 + 1;
                ((CoroutineContext[]) obj4)[i4] = element;
                return Unit.a;
            case 22:
                ((Integer) obj2).getClass();
                ((iq3) obj4).a((gq3) obj3, (of3) obj, aba.K(1));
                return Unit.a;
            case 23:
                ((Integer) obj2).getClass();
                o02.h((ContributionStatus) obj4, (xtc) obj3, (of3) obj, aba.K(1));
                return Unit.a;
            case 24:
                ((Integer) obj2).getClass();
                s02.d((yr3) obj4, (xtc) obj3, (of3) obj, aba.K(49));
                return Unit.a;
            case 25:
                ((Integer) obj2).getClass();
                j72.e((fs3) obj4, (xtc) obj3, (of3) obj, aba.K(1));
                return Unit.a;
            case 26:
                ((Integer) obj2).getClass();
                pd0.b((ks3) obj4, (xtc) obj3, (of3) obj, aba.K(1));
                return Unit.a;
            case 27:
                Context context2 = (Context) obj3;
                return Integer.valueOf(((Collator) obj4).compare(tv3.c(context2, ((uv3) obj).a), tv3.c(context2, ((uv3) obj2).a)));
            case 28:
                ((Integer) obj2).getClass();
                rfo.b((CrowdsourcingContribution) obj4, (Integer) obj3, (of3) obj, aba.K(1));
                return Unit.a;
            default:
                ((Integer) obj2).getClass();
                ((p4h) obj4).f((String) obj3, (of3) obj, aba.K(55));
                return Unit.a;
        }
    }

    public /* synthetic */ vn6(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    public /* synthetic */ vn6(Object obj, Object obj2, int i, int i2) {
        this.a = i2;
        this.b = obj;
        this.c = obj2;
    }
}
