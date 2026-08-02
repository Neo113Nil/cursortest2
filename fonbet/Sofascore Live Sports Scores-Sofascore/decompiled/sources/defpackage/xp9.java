package defpackage;

import android.content.Context;
import com.sofascore.model.TeamSelection;
import com.sofascore.results.R;
import com.sofascore.results.event.statistics.view.hockey.HockeyEventMapView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class xp9 implements ct8 {
    public final /* synthetic */ int a;
    public final /* synthetic */ TeamSelection b;
    public final /* synthetic */ gv9 c;

    public /* synthetic */ xp9(int i, gv9 gv9Var, TeamSelection teamSelection) {
        this.a = i;
        this.b = teamSelection;
        this.c = gv9Var;
    }

    @Override // defpackage.ct8
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        boolean z;
        boolean z2;
        boolean c0;
        boolean z3;
        int i = this.a;
        a99 a99Var = nf3.a;
        utc utcVar = utc.a;
        final gv9 gv9Var = this.c;
        final TeamSelection teamSelection = this.b;
        final int i2 = 0;
        switch (i) {
            case 0:
                of3 of3Var = (of3) obj2;
                int intValue = ((Integer) obj3).intValue();
                ((v23) obj).getClass();
                av8 av8Var = (av8) of3Var;
                if (av8Var.T(intValue & 1, (intValue & 17) != 16)) {
                    u23 a = t23.a(ww9.d, uxf.p, av8Var, 48);
                    int hashCode = Long.hashCode(av8Var.T);
                    aee m = av8Var.m();
                    xtc C = fqj.C(av8Var, utcVar);
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
                    if (teamSelection == TeamSelection.Second) {
                        av8Var.d0(-639502485);
                        z = !hkg.c0((Context) av8Var.k(nz.b));
                        av8Var.s(false);
                    } else {
                        av8Var.d0(1650260682);
                        av8Var.s(false);
                        z = false;
                    }
                    if (z) {
                        av8Var.d0(1650193406);
                        av8Var.s(false);
                        z2 = true;
                    } else {
                        av8Var.d0(-639501174);
                        if (teamSelection == TeamSelection.First) {
                            av8Var.d0(-639499283);
                            z2 = hkg.c0((Context) av8Var.k(nz.b));
                            av8Var.s(false);
                        } else {
                            av8Var.d0(1650359944);
                            av8Var.s(false);
                            z2 = false;
                        }
                        av8Var.s(false);
                    }
                    kq9.b(s6a.N(R.drawable.ic_terrain_arrow, 6, av8Var), null, f6a.D(utcVar, z2 ? -1.0f : 1.0f, 1.0f), lz.D(R.color.neutral_default, av8Var), av8Var, 48, 0);
                    xtc d = bkh.d(utcVar, 1.0f);
                    boolean i3 = av8Var.i(gv9Var) | av8Var.e(teamSelection.ordinal());
                    Object O = av8Var.O();
                    if (i3 || O == a99Var) {
                        O = new Function1() { // from class: aq9
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj4) {
                                int i4 = i2;
                                TeamSelection teamSelection2 = teamSelection;
                                gv9 gv9Var2 = gv9Var;
                                Context context = (Context) obj4;
                                switch (i4) {
                                    case 0:
                                        context.getClass();
                                        HockeyEventMapView hockeyEventMapView = new HockeyEventMapView(context, null, 6);
                                        hockeyEventMapView.d(gv9Var2, teamSelection2);
                                        return hockeyEventMapView;
                                    default:
                                        context.getClass();
                                        HockeyEventMapView hockeyEventMapView2 = new HockeyEventMapView(context, null, 6);
                                        hockeyEventMapView2.d(gv9Var2, teamSelection2);
                                        return hockeyEventMapView2;
                                }
                            }
                        };
                        av8Var.n0(O);
                    }
                    td4.a((Function1) O, d, null, av8Var, 48, 4);
                    av8Var.s(true);
                } else {
                    av8Var.W();
                }
                break;
            default:
                of3 of3Var2 = (of3) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                ((m12) obj).getClass();
                av8 av8Var2 = (av8) of3Var2;
                if (av8Var2.T(intValue2 & 1, (intValue2 & 17) != 16)) {
                    u23 a2 = t23.a(ww9.d, uxf.p, av8Var2, 48);
                    int hashCode2 = Long.hashCode(av8Var2.T);
                    aee m2 = av8Var2.m();
                    xtc C2 = fqj.C(av8Var2, utcVar);
                    if3.k7.getClass();
                    zg3 zg3Var2 = hf3.b;
                    av8Var2.h0();
                    if (av8Var2.S) {
                        av8Var2.l(zg3Var2);
                    } else {
                        av8Var2.q0();
                    }
                    waa.K(av8Var2, a2, hf3.g);
                    waa.K(av8Var2, m2, hf3.f);
                    waa.K(av8Var2, Integer.valueOf(hashCode2), hf3.j);
                    waa.J(av8Var2, hf3.k);
                    waa.K(av8Var2, C2, hf3.d);
                    if (teamSelection == TeamSelection.Second) {
                        av8Var2.d0(179978938);
                        av8Var2.s(false);
                        c0 = true;
                    } else {
                        av8Var2.d0(559997047);
                        c0 = hkg.c0((Context) av8Var2.k(nz.b));
                        av8Var2.s(false);
                    }
                    kq9.b(s6a.N(R.drawable.ic_terrain_arrow, 6, av8Var2), null, f6a.D(utcVar, c0 ? -1.0f : 1.0f, 1.0f), lz.D(R.color.neutral_default, av8Var2), av8Var2, 48, 0);
                    xtc d2 = bkh.d(utcVar, 1.0f);
                    boolean i4 = av8Var2.i(gv9Var) | av8Var2.e(teamSelection.ordinal());
                    Object O2 = av8Var2.O();
                    if (i4 || O2 == a99Var) {
                        z3 = true;
                        final char c = 1 == true ? 1 : 0;
                        O2 = new Function1() { // from class: aq9
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj4) {
                                int i42 = c;
                                TeamSelection teamSelection2 = teamSelection;
                                gv9 gv9Var2 = gv9Var;
                                Context context = (Context) obj4;
                                switch (i42) {
                                    case 0:
                                        context.getClass();
                                        HockeyEventMapView hockeyEventMapView = new HockeyEventMapView(context, null, 6);
                                        hockeyEventMapView.d(gv9Var2, teamSelection2);
                                        return hockeyEventMapView;
                                    default:
                                        context.getClass();
                                        HockeyEventMapView hockeyEventMapView2 = new HockeyEventMapView(context, null, 6);
                                        hockeyEventMapView2.d(gv9Var2, teamSelection2);
                                        return hockeyEventMapView2;
                                }
                            }
                        };
                        av8Var2.n0(O2);
                    } else {
                        z3 = true;
                    }
                    td4.a((Function1) O2, d2, null, av8Var2, 48, 4);
                    av8Var2.s(z3);
                } else {
                    av8Var2.W();
                }
                break;
        }
        return Unit.a;
    }
}
