package defpackage;

import androidx.paging.compose.PagingPlaceholderKey;
import com.sofascore.model.Sports;
import com.sofascore.model.fantasy.FantasyCompetitionType;
import com.sofascore.model.firebase.AdType;
import com.sofascore.model.network.response.SearchResponseKt;
import com.vungle.ads.internal.protos.Sdk;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class ke7 implements Function1 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ osa b;
    public final /* synthetic */ mei c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ Function1 e;
    public final /* synthetic */ qug f;
    public final /* synthetic */ w28 g;
    public final /* synthetic */ boolean h;
    public final /* synthetic */ boolean i;
    public final /* synthetic */ ho1 j;
    public final /* synthetic */ Function1 k;
    public final /* synthetic */ Float l;
    public final /* synthetic */ Function1 m;
    public final /* synthetic */ rz6 n;
    public final /* synthetic */ Function1 o;
    public final /* synthetic */ Function0 p;
    public final /* synthetic */ cdi q;
    public final /* synthetic */ Function1 r;
    public final /* synthetic */ nei s;
    public final /* synthetic */ Function1 t;
    public final /* synthetic */ Object u;
    public final /* synthetic */ Object v;
    public final /* synthetic */ Object w;

    public /* synthetic */ ke7(q67 q67Var, osa osaVar, FantasyCompetitionType fantasyCompetitionType, mei meiVar, boolean z, Function1 function1, qug qugVar, w28 w28Var, boolean z2, boolean z3, ho1 ho1Var, Function1 function12, Float f, Function1 function13, rz6 rz6Var, Function1 function14, Function0 function0, cdi cdiVar, Function1 function15, nei neiVar, gv9 gv9Var, Function1 function16) {
        this.u = q67Var;
        this.b = osaVar;
        this.v = fantasyCompetitionType;
        this.c = meiVar;
        this.d = z;
        this.e = function1;
        this.f = qugVar;
        this.g = w28Var;
        this.h = z2;
        this.i = z3;
        this.j = ho1Var;
        this.k = function12;
        this.l = f;
        this.m = function13;
        this.n = rz6Var;
        this.o = function14;
        this.p = function0;
        this.q = cdiVar;
        this.r = function15;
        this.s = neiVar;
        this.w = gv9Var;
        this.t = function16;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        qug qugVar;
        mei meiVar;
        boolean z;
        boolean z2;
        tee teeVar;
        Object obj2;
        boolean z3;
        Function1 function1;
        qug qugVar2;
        qug qugVar3;
        Object obj3;
        int i = this.a;
        ofb ofbVar = ofb.b;
        Object obj4 = this.w;
        Object obj5 = this.v;
        Object obj6 = this.u;
        switch (i) {
            case 0:
                String str = (String) obj6;
                ct8 ct8Var = (ct8) obj5;
                e1d e1dVar = (e1d) obj4;
                esa esaVar = (esa) obj;
                esaVar.getClass();
                final w28 w28Var = this.g;
                final ho1 ho1Var = this.j;
                final Function1 function12 = this.e;
                final Float f = this.l;
                final Function1 function13 = this.k;
                final rz6 rz6Var = this.n;
                final Function1 function14 = this.m;
                final Function0 function0 = this.p;
                final boolean z4 = this.d;
                final cdi cdiVar = this.q;
                esa.b(esaVar, "filters", new tc3(817942395, new et8() { // from class: me7
                    @Override // defpackage.et8
                    public final Object invoke(Object obj7, Object obj8, Object obj9, Object obj10) {
                        xpa xpaVar = (xpa) obj7;
                        ((Integer) obj8).getClass();
                        of3 of3Var = (of3) obj9;
                        int intValue = ((Integer) obj10).intValue();
                        xpaVar.getClass();
                        if ((intValue & 6) == 0) {
                            intValue |= ((av8) of3Var).g(xpaVar) ? 4 : 2;
                        }
                        av8 av8Var = (av8) of3Var;
                        if (av8Var.T(intValue & 1, (intValue & Sdk.SDKError.Reason.MRAID_JS_WRITE_FAILED_VALUE) != 130)) {
                            c6o.n(w28.this, true, true, ho1Var, function12, f, function13, rz6Var, function14, ((Boolean) cdiVar.getValue()).booleanValue(), function0, z4, xpa.a(xpaVar, utc.a, 7), av8Var, 432);
                        } else {
                            av8Var.W();
                        }
                        return Unit.a;
                    }
                }, true), 2);
                osa osaVar = this.b;
                int c = osaVar.c();
                qug qugVar4 = this.f;
                mei meiVar2 = this.c;
                boolean z5 = this.h;
                boolean z6 = this.i;
                if (c > 0) {
                    qugVar = qugVar4;
                    meiVar = meiVar2;
                    z = z5;
                    z2 = z6;
                    esa.d(esaVar, "table_legend", null, new tc3(1912437258, new ne7(qugVar, this.o, meiVar, this.s, ct8Var, z, z2, e1dVar), true), 2);
                } else {
                    qugVar = qugVar4;
                    meiVar = meiVar2;
                    z = z5;
                    z2 = z6;
                }
                int c2 = osaVar.c();
                if (str != null) {
                    teeVar = l6g.L(new Pair(0, new sz0(AdType.Banner.FantasySmall, l6g.L(new Pair(SearchResponseKt.SPORT_ENTITY, Sports.FOOTBALL), new Pair("page", "fantasy")))), new Pair(12, new sz0(AdType.Banner.FantasyBig, l6g.L(new Pair(SearchResponseKt.SPORT_ENTITY, Sports.FOOTBALL), new Pair("page", "fantasy")))));
                } else {
                    teeVar = uee.g;
                    teeVar.getClass();
                }
                tee teeVar2 = teeVar;
                int i2 = 0;
                while (i2 < c2) {
                    Object e = osaVar.e(i2);
                    Object pagingPlaceholderKey = e == null ? new PagingPlaceholderKey(i2) : Integer.valueOf(((q67) e).a.a);
                    osa osaVar2 = osaVar;
                    int i3 = i2;
                    tee teeVar3 = teeVar2;
                    esaVar.f(pagingPlaceholderKey, "statistic_item", new tc3(-987070095, new oe7(i3, teeVar2, osaVar2, meiVar, z4, this.r, this.t, qugVar, z, z2, e1dVar), true));
                    sz0 sz0Var = (sz0) teeVar3.get(Integer.valueOf(i3));
                    if (sz0Var != null) {
                        AdType.Banner banner = sz0Var.a;
                        esaVar.f(banner + "_" + i3 + "_null", "banner_ads_" + banner, new tc3(1323635312, new moa(sz0Var, 8, 0), true));
                    }
                    teeVar2 = teeVar3;
                    i2 = i3 + 1;
                    osaVar = osaVar2;
                }
                osa osaVar3 = osaVar;
                if ((osaVar3.d().c instanceof pfb) && osaVar3.d().c.a && osaVar3.c() == 0) {
                    obj2 = null;
                    esa.d(esaVar, null, null, v9g.b, 3);
                } else {
                    obj2 = null;
                }
                if (Intrinsics.c(osaVar3.d().c, ofbVar)) {
                    esa.d(esaVar, "loading_indicator", obj2, v9g.c, 2);
                }
                break;
            default:
                q67 q67Var = (q67) obj6;
                FantasyCompetitionType fantasyCompetitionType = (FantasyCompetitionType) obj5;
                gv9 gv9Var = (gv9) obj4;
                esa esaVar2 = (esa) obj;
                esaVar2.getClass();
                mei meiVar3 = this.c;
                boolean z7 = this.d;
                Function1 function15 = this.e;
                qug qugVar5 = this.f;
                if (q67Var != null) {
                    z3 = z7;
                    o87 o87Var = new o87(fantasyCompetitionType, meiVar3, q67Var, z3, function15, qugVar5);
                    function1 = function15;
                    qugVar2 = qugVar5;
                    esa.d(esaVar2, "player_out_header", null, new tc3(-439476196, o87Var, true), 2);
                } else {
                    z3 = z7;
                    function1 = function15;
                    qugVar2 = qugVar5;
                }
                final boolean z8 = z3;
                final w28 w28Var2 = this.g;
                final boolean z9 = this.h;
                final boolean z10 = this.i;
                final ho1 ho1Var2 = this.j;
                final Function1 function16 = this.k;
                final Float f2 = this.l;
                final Function1 function17 = this.m;
                final rz6 rz6Var2 = this.n;
                final Function1 function18 = this.o;
                final Function0 function02 = this.p;
                final cdi cdiVar2 = this.q;
                esa.b(esaVar2, "filters", new tc3(-1714978835, new et8() { // from class: dk7
                    @Override // defpackage.et8
                    public final Object invoke(Object obj7, Object obj8, Object obj9, Object obj10) {
                        xpa xpaVar = (xpa) obj7;
                        ((Integer) obj8).getClass();
                        of3 of3Var = (of3) obj9;
                        int intValue = ((Integer) obj10).intValue();
                        xpaVar.getClass();
                        if ((intValue & 6) == 0) {
                            intValue |= ((av8) of3Var).g(xpaVar) ? 4 : 2;
                        }
                        av8 av8Var = (av8) of3Var;
                        if (av8Var.T(intValue & 1, (intValue & Sdk.SDKError.Reason.MRAID_JS_WRITE_FAILED_VALUE) != 130)) {
                            c6o.n(w28.this, z9, z10, ho1Var2, function16, f2, function17, rz6Var2, function18, ((Boolean) cdiVar2.getValue()).booleanValue(), function02, z8, xpa.a(xpaVar, utc.a, 7), av8Var, 0);
                        } else {
                            av8Var.W();
                        }
                        return Unit.a;
                    }
                }, true), 2);
                osa osaVar4 = this.b;
                if (osaVar4.c() > 0) {
                    qugVar3 = qugVar2;
                    esa.d(esaVar2, "table_legend", null, new tc3(1242730238, new ff7((Object) fantasyCompetitionType, (Object) qugVar3, this.r, (Object) meiVar3, (Object) this.s, 9), true), 2);
                } else {
                    qugVar3 = qugVar2;
                }
                esaVar2.a(osaVar4.c(), new uf8(15, new e87(25), osaVar4), new e87(26), new tc3(-17415472, new yj7(osaVar4, fantasyCompetitionType, gv9Var, meiVar3, z8, this.t, function1, qugVar3), true));
                if ((osaVar4.d().c instanceof pfb) && osaVar4.d().c.a && osaVar4.c() == 0) {
                    obj3 = null;
                    esa.d(esaVar2, null, null, fqj.c, 3);
                } else {
                    obj3 = null;
                }
                if (Intrinsics.c(osaVar4.d().c, ofbVar)) {
                    esa.d(esaVar2, "loading_indicator", obj3, fqj.d, 2);
                }
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ ke7(osa osaVar, String str, w28 w28Var, ho1 ho1Var, Function1 function1, Float f, Function1 function12, rz6 rz6Var, Function1 function13, Function0 function0, boolean z, cdi cdiVar, qug qugVar, Function1 function14, mei meiVar, nei neiVar, ct8 ct8Var, boolean z2, boolean z3, e1d e1dVar, Function1 function15, Function1 function16) {
        this.b = osaVar;
        this.u = str;
        this.g = w28Var;
        this.j = ho1Var;
        this.e = function1;
        this.l = f;
        this.k = function12;
        this.n = rz6Var;
        this.m = function13;
        this.p = function0;
        this.d = z;
        this.q = cdiVar;
        this.f = qugVar;
        this.o = function14;
        this.c = meiVar;
        this.s = neiVar;
        this.v = ct8Var;
        this.h = z2;
        this.i = z3;
        this.w = e1dVar;
        this.r = function15;
        this.t = function16;
    }
}
