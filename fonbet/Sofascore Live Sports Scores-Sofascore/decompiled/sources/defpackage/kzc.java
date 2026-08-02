package defpackage;

import android.content.Context;
import androidx.compose.ui.graphics.vector.ImageVector;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.mvvm.model.MmaEvent;
import com.sofascore.model.mvvm.model.Team;
import com.sofascore.model.mvvm.model.UniqueTournament;
import com.sofascore.results.R;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class kzc extends xka implements Function2 {
    public final /* synthetic */ e1d i;
    public final /* synthetic */ am3 j;
    public final /* synthetic */ Function0 k;
    public final /* synthetic */ Event l;
    public final /* synthetic */ Context m;
    public final /* synthetic */ boolean n;
    public final /* synthetic */ int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kzc(e1d e1dVar, am3 am3Var, Function0 function0, Event event, Context context, boolean z, int i) {
        super(2);
        this.i = e1dVar;
        this.j = am3Var;
        this.k = function0;
        this.l = event;
        this.m = context;
        this.n = z;
        this.o = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        boolean z;
        String str;
        boolean z2;
        String valueOf;
        int i;
        long f;
        String w;
        of3 of3Var = (of3) obj;
        if ((((Number) obj2).intValue() & 3) == 2) {
            av8 av8Var = (av8) of3Var;
            if (av8Var.D()) {
                av8Var.W();
                return Unit.a;
            }
        }
        this.i.setValue(Unit.a);
        am3 am3Var = this.j;
        int i2 = am3Var.b;
        am3Var.h();
        av8 av8Var2 = (av8) of3Var;
        av8Var2.d0(-1073051605);
        am3 am3Var2 = (am3) am3Var.g().b;
        ll3 f2 = am3Var2.f();
        ll3 f3 = am3Var2.f();
        ll3 f4 = am3Var2.f();
        ll3 f5 = am3Var2.f();
        ll3 f6 = am3Var2.f();
        ll3 f7 = am3Var2.f();
        ll3 f8 = am3Var2.f();
        ll3 f9 = am3Var2.f();
        ll3 f10 = am3Var2.f();
        ll3 f11 = am3Var2.f();
        ll3 f12 = am3Var2.f();
        Set set = wyh.a;
        Event event = this.l;
        ImageVector N = s6a.N(wyh.a(event.getSportSlug()), 6, av8Var2);
        long D = lz.D(R.color.on_color_highlight_2, av8Var2);
        Object O = av8Var2.O();
        a99 a99Var = nf3.a;
        Object obj3 = O;
        if (O == a99Var) {
            rg2 rg2Var = rg2.r;
            av8Var2.n0(rg2Var);
            obj3 = rg2Var;
        }
        utc utcVar = utc.a;
        kq9.b(N, null, am3.b(utcVar, f12, (Function1) obj3), D, av8Var2, 48, 0);
        Object O2 = av8Var2.O();
        Object obj4 = O2;
        if (O2 == a99Var) {
            rg2 rg2Var2 = rg2.s;
            av8Var2.n0(rg2Var2);
            obj4 = rg2Var2;
        }
        xtc c0 = l98.c0(n9e.q(am3.b(utcVar, f2, (Function1) obj4), lz.D(R.color.on_color_primary, av8Var2), oyn.e), 8.0f, 4.0f);
        k1c c = e12.c(uxf.g, false);
        int hashCode = Long.hashCode(av8Var2.T);
        aee m = av8Var2.m();
        xtc C = fqj.C(av8Var2, c0);
        if3.k7.getClass();
        zg3 zg3Var = hf3.b;
        av8Var2.h0();
        if (av8Var2.S) {
            av8Var2.l(zg3Var);
        } else {
            av8Var2.q0();
        }
        waa.K(av8Var2, c, hf3.g);
        waa.K(av8Var2, m, hf3.f);
        waa.K(av8Var2, Integer.valueOf(hashCode), hf3.j);
        waa.J(av8Var2, hf3.k);
        waa.K(av8Var2, C, hf3.d);
        String valueOf2 = String.valueOf(this.o + 1);
        yf8 yf8Var = xth.a;
        udj.c(valueOf2, null, lz.D(R.color.graphics_dark, av8Var2), null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, xth.l(), av8Var2, 0, 24960, 110586);
        av8Var2.s(true);
        boolean g = av8Var2.g(f2);
        Object O3 = av8Var2.O();
        Object obj5 = O3;
        if (g || O3 == a99Var) {
            pw6 pw6Var = new pw6(f2, 7);
            av8Var2.n0(pw6Var);
            obj5 = pw6Var;
        }
        td4.G(Event.getHomeTeam$default(event, null, 1, null).getId(), bkh.l(am3.b(utcVar, f3, (Function1) obj5), 32.0f), false, 0L, av8Var2, 0, 12);
        Team homeTeam$default = Event.getHomeTeam$default(event, null, 1, null);
        Context context = this.m;
        String p = tba.p(context, homeTeam$default);
        dfj l = xth.l();
        long D2 = lz.D(R.color.on_color_primary, av8Var2);
        boolean g2 = av8Var2.g(f3) | av8Var2.g(f5);
        boolean z3 = this.n;
        boolean h = g2 | av8Var2.h(z3);
        Object O4 = av8Var2.O();
        Object obj6 = O4;
        if (h || O4 == a99Var) {
            lzc lzcVar = new lzc(f3, f5, z3, 1);
            av8Var2.n0(lzcVar);
            obj6 = lzcVar;
        }
        udj.c(p, am3.b(utcVar, f4, (Function1) obj6), D2, null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, l, av8Var2, 0, 24960, 110584);
        boolean z4 = event instanceof MmaEvent;
        String str2 = "";
        if (z4) {
            av8Var2.d0(-34545906);
            str = wnn.G(event, true, av8Var2);
            z = false;
            av8Var2.s(false);
        } else {
            z = false;
            av8Var2.d0(-1070877762);
            av8Var2.s(false);
            Integer display = Event.getHomeScore$default(event, null, 1, null).getDisplay();
            if (display == null || (str = String.valueOf(display.intValue())) == null) {
                str = "";
            }
        }
        dfj l2 = xth.l();
        Integer winnerCode$default = Event.getWinnerCode$default(event, null, 1, null);
        long f13 = (winnerCode$default != null && winnerCode$default.intValue() == 1) ? ljg.f(av8Var2, -34537980, R.color.on_color_primary, av8Var2, z) : ljg.f(av8Var2, -34537338, R.color.on_color_secondary, av8Var2, z);
        boolean g3 = av8Var2.g(f4);
        Object O5 = av8Var2.O();
        Object obj7 = O5;
        if (g3 || O5 == a99Var) {
            pw6 pw6Var2 = new pw6(f4, 8);
            av8Var2.n0(pw6Var2);
            obj7 = pw6Var2;
        }
        udj.c(str, am3.b(utcVar, f5, (Function1) obj7), f13, null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, l2, av8Var2, 0, 24960, 110584);
        boolean g4 = av8Var2.g(f3);
        Object O6 = av8Var2.O();
        Object obj8 = O6;
        if (g4 || O6 == a99Var) {
            pw6 pw6Var3 = new pw6(f3, 9);
            av8Var2.n0(pw6Var3);
            obj8 = pw6Var3;
        }
        td4.G(Event.getAwayTeam$default(event, null, 1, null).getId(), bkh.l(am3.b(utcVar, f6, (Function1) obj8), 32.0f), false, 0L, av8Var2, 0, 12);
        String K = qea.K(tba.p(context, Event.getAwayTeam$default(event, null, 1, null)), event.shouldReverseTeams());
        if (K == null) {
            K = "";
        }
        dfj l3 = xth.l();
        long D3 = lz.D(R.color.on_color_primary, av8Var2);
        boolean g5 = av8Var2.g(f6) | av8Var2.g(f8) | av8Var2.h(z3);
        Object O7 = av8Var2.O();
        Object obj9 = O7;
        if (g5 || O7 == a99Var) {
            lzc lzcVar2 = new lzc(f6, f8, z3, 2);
            av8Var2.n0(lzcVar2);
            obj9 = lzcVar2;
        }
        udj.c(K, am3.b(utcVar, f7, (Function1) obj9), D3, null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, l3, av8Var2, 0, 24960, 110584);
        if (z4) {
            av8Var2.d0(-34493489);
            z2 = false;
            str2 = wnn.G(event, false, av8Var2);
            av8Var2.s(false);
        } else {
            z2 = false;
            av8Var2.d0(-1069251874);
            av8Var2.s(false);
            Integer display2 = Event.getAwayScore$default(event, null, 1, null).getDisplay();
            if (display2 != null && (valueOf = String.valueOf(display2.intValue())) != null) {
                str2 = valueOf;
            }
        }
        dfj l4 = xth.l();
        Integer winnerCode$default2 = Event.getWinnerCode$default(event, null, 1, null);
        if (winnerCode$default2 != null && winnerCode$default2.intValue() == 2) {
            f = ljg.f(av8Var2, -34483228, R.color.on_color_primary, av8Var2, z2);
            i = R.color.on_color_secondary;
        } else {
            i = R.color.on_color_secondary;
            f = ljg.f(av8Var2, -34482586, R.color.on_color_secondary, av8Var2, z2);
        }
        boolean g6 = av8Var2.g(f7);
        Object O8 = av8Var2.O();
        Object obj10 = O8;
        if (g6 || O8 == a99Var) {
            pw6 pw6Var4 = new pw6(f7, 10);
            av8Var2.n0(pw6Var4);
            obj10 = pw6Var4;
        }
        boolean z5 = z2;
        udj.c(str2, am3.b(utcVar, f8, (Function1) obj10), f, null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, l4, av8Var2, 0, 24960, 110584);
        Integer F = o3a.F(event.getTournament());
        int intValue = F != null ? F.intValue() : event.getTournament().getId();
        boolean g7 = av8Var2.g(f6);
        Object O9 = av8Var2.O();
        Object obj11 = O9;
        if (g7 || O9 == a99Var) {
            pw6 pw6Var5 = new pw6(f6, 6);
            av8Var2.n0(pw6Var5);
            obj11 = pw6Var5;
        }
        td4.y(intValue, 0, 12, av8Var2, bkh.l(am3.b(utcVar, f9, (Function1) obj11), 16.0f), null, false);
        UniqueTournament uniqueTournament = event.getTournament().getUniqueTournament();
        if (uniqueTournament == null || (w = tba.x(uniqueTournament)) == null) {
            w = tba.w(event.getTournament());
        }
        String str3 = w;
        dfj g8 = xth.g();
        long D4 = lz.D(i, av8Var2);
        boolean g9 = av8Var2.g(f9) | av8Var2.g(f11) | av8Var2.h(z3);
        Object O10 = av8Var2.O();
        Object obj12 = O10;
        if (g9 || O10 == a99Var) {
            lzc lzcVar3 = new lzc(f9, f11, z3, z5 ? 1 : 0);
            av8Var2.n0(lzcVar3);
            obj12 = lzcVar3;
        }
        udj.c(str3, am3.b(utcVar, f10, (Function1) obj12), D4, null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, g8, av8Var2, 0, 24960, 110584);
        long startTimestamp = event.getStartTimestamp();
        bi4 bi4Var = bi4.PATTERN_DMY;
        ConcurrentHashMap concurrentHashMap = hk4.a;
        String i3 = fc6.i(startTimestamp, hk4.a(bi4Var.d()));
        dfj g10 = xth.g();
        long D5 = lz.D(i, av8Var2);
        boolean g11 = av8Var2.g(f10) | av8Var2.h(z3);
        Object O11 = av8Var2.O();
        Object obj13 = O11;
        if (g11 || O11 == a99Var) {
            mzc mzcVar = new mzc(f10, z3, 0);
            av8Var2.n0(mzcVar);
            obj13 = mzcVar;
        }
        udj.c(i3, am3.b(utcVar, f11, (Function1) obj13), D5, null, 0L, null, 0L, null, new p7j(3), 0L, 2, false, 1, 0, null, g10, av8Var2, 0, 24960, 109560);
        av8Var2.s(false);
        if (am3Var.b != i2) {
            hz8.t(this.k, av8Var2);
        }
        return Unit.a;
    }
}
