package defpackage;

import android.content.Context;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.results.R;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class mqj extends xka implements Function2 {
    public final /* synthetic */ e1d i;
    public final /* synthetic */ am3 j;
    public final /* synthetic */ Function0 k;
    public final /* synthetic */ Event l;
    public final /* synthetic */ boolean m;
    public final /* synthetic */ Context n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mqj(e1d e1dVar, am3 am3Var, Function0 function0, Event event, boolean z, Context context) {
        super(2);
        this.i = e1dVar;
        this.j = am3Var;
        this.k = function0;
        this.l = event;
        this.m = z;
        this.n = context;
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x0346, code lost:
    
        if (r13 == r7) goto L59;
     */
    @Override // kotlin.jvm.functions.Function2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj, Object obj2) {
        ll3 ll3Var;
        a99 a99Var;
        String str;
        String str2;
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
        int i = am3Var.b;
        am3Var.h();
        av8 av8Var2 = (av8) of3Var;
        av8Var2.d0(332674048);
        am3 am3Var2 = (am3) am3Var.g().b;
        ll3 f = am3Var2.f();
        ll3 f2 = am3Var2.f();
        ll3 f3 = am3Var2.f();
        ll3 f4 = am3Var2.f();
        ll3 f5 = am3Var2.f();
        ll3 f6 = am3Var2.f();
        ll3 f7 = am3Var2.f();
        ll3 f8 = am3Var2.f();
        ll3 f9 = am3Var2.f();
        xl3 d = am3Var.d(0.2f);
        Event event = this.l;
        long startTimestamp = event.getStartTimestamp();
        bi4 bi4Var = bi4.PATTERN_DMY;
        ConcurrentHashMap concurrentHashMap = hk4.a;
        String i2 = fc6.i(startTimestamp, hk4.a(bi4Var.d()));
        yf8 yf8Var = xth.a;
        dfj g = xth.g();
        long D = lz.D(R.color.on_color_secondary, av8Var2);
        boolean g2 = av8Var2.g(d);
        boolean z = this.m;
        boolean h = g2 | av8Var2.h(z);
        Object O = av8Var2.O();
        a99 a99Var2 = nf3.a;
        if (h || O == a99Var2) {
            ll3Var = f3;
            O = new mzc(d, z, 2);
            av8Var2.n0(O);
        } else {
            ll3Var = f3;
        }
        utc utcVar = utc.a;
        ll3 ll3Var2 = ll3Var;
        udj.c(i2, am3.b(utcVar, f, (Function1) O), D, null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, g, av8Var2, 0, 24960, 110584);
        String statusDescription = event.getStatusDescription();
        String sportSlug = event.getSportSlug();
        Context context = this.n;
        String c = afi.c(context, statusDescription, sportSlug, true);
        dfj g3 = xth.g();
        long D2 = lz.D(R.color.on_color_secondary, av8Var2);
        boolean g4 = av8Var2.g(f);
        Object O2 = av8Var2.O();
        if (g4 || O2 == a99Var2) {
            O2 = new pw6(f, 13);
            av8Var2.n0(O2);
        }
        udj.c(c, am3.b(utcVar, f2, (Function1) O2), D2, null, 0L, null, 0L, null, new p7j(3), 0L, 2, false, 1, 0, null, g3, av8Var2, 0, 24960, 109560);
        boolean g5 = av8Var2.g(f) | av8Var2.g(f2);
        Object O3 = av8Var2.O();
        if (g5 || O3 == a99Var2) {
            O3 = new tsh(f, f2, 1);
            av8Var2.n0(O3);
        }
        tz9.r(1.0f, 384, 8, lz.D(R.color.on_color_highlight_1, av8Var2), 0L, av8Var2, am3.b(utcVar, ll3Var2, (Function1) O3));
        int id = Event.getHomeTeam$default(event, null, 1, null).getId();
        boolean g6 = av8Var2.g(ll3Var2);
        Object O4 = av8Var2.O();
        if (g6 || O4 == a99Var2) {
            O4 = new pw6(ll3Var2, 14);
            av8Var2.n0(O4);
        }
        td4.G(id, bkh.l(am3.b(utcVar, f4, (Function1) O4), 16.0f), false, 0L, av8Var2, 0, 12);
        int id2 = Event.getAwayTeam$default(event, null, 1, null).getId();
        boolean g7 = av8Var2.g(f4) | av8Var2.g(ll3Var2);
        Object O5 = av8Var2.O();
        if (g7 || O5 == a99Var2) {
            O5 = new tsh(f4, ll3Var2, 2);
            av8Var2.n0(O5);
        }
        td4.G(id2, bkh.l(am3.b(utcVar, f7, (Function1) O5), 16.0f), false, 0L, av8Var2, 0, 12);
        String p = tba.p(context, Event.getHomeTeam$default(event, null, 1, null));
        dfj e = xth.e();
        Integer winnerCode$default = Event.getWinnerCode$default(event, null, 1, null);
        long f10 = (winnerCode$default != null && winnerCode$default.intValue() == 1) ? ljg.f(av8Var2, -1928849963, R.color.on_color_primary, av8Var2, false) : ljg.f(av8Var2, -1928849321, R.color.on_color_secondary, av8Var2, false);
        boolean g8 = av8Var2.g(f4) | av8Var2.g(f6);
        Object O6 = av8Var2.O();
        if (g8 || O6 == a99Var2) {
            O6 = new tsh(f4, f6, 3);
            av8Var2.n0(O6);
        }
        udj.c(p, am3.b(utcVar, f5, (Function1) O6), f10, null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, e, av8Var2, 0, 24960, 110584);
        String K = qea.K(tba.p(context, Event.getAwayTeam$default(event, null, 1, null)), event.shouldReverseTeams());
        String str3 = K == null ? "" : K;
        dfj e2 = xth.e();
        Integer winnerCode$default2 = Event.getWinnerCode$default(event, null, 1, null);
        long f11 = (winnerCode$default2 != null && winnerCode$default2.intValue() == 2) ? ljg.f(av8Var2, -1928829227, R.color.on_color_primary, av8Var2, false) : ljg.f(av8Var2, -1928828585, R.color.on_color_secondary, av8Var2, false);
        boolean g9 = av8Var2.g(f7) | av8Var2.g(f5) | av8Var2.g(f9);
        Object O7 = av8Var2.O();
        if (g9) {
            a99Var = a99Var2;
        } else {
            a99Var = a99Var2;
        }
        O7 = new tx5(2, f7, f5, f9);
        av8Var2.n0(O7);
        a99 a99Var3 = a99Var;
        udj.c(str3, am3.b(utcVar, f8, (Function1) O7), f11, null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, e2, av8Var2, 0, 24960, 110584);
        Integer display = Event.getHomeScore$default(event, null, 1, null).getDisplay();
        if (display == null || (str = String.valueOf(display.intValue())) == null) {
            str = "";
        }
        dfj e3 = xth.e();
        Integer winnerCode$default3 = Event.getWinnerCode$default(event, null, 1, null);
        long f12 = (winnerCode$default3 != null && winnerCode$default3.intValue() == 1) ? ljg.f(av8Var2, -1928807243, R.color.on_color_primary, av8Var2, false) : ljg.f(av8Var2, -1928806601, R.color.on_color_secondary, av8Var2, false);
        Object O8 = av8Var2.O();
        if (O8 == a99Var3) {
            O8 = rg2.D;
            av8Var2.n0(O8);
        }
        udj.c(str, am3.b(utcVar, f6, (Function1) O8), f12, null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, e3, av8Var2, 0, 24960, 110584);
        Integer display2 = Event.getAwayScore$default(event, null, 1, null).getDisplay();
        if (display2 == null || (str2 = String.valueOf(display2.intValue())) == null) {
            str2 = "";
        }
        dfj e4 = xth.e();
        Integer winnerCode$default4 = Event.getWinnerCode$default(event, null, 1, null);
        long f13 = (winnerCode$default4 != null && winnerCode$default4.intValue() == 2) ? ljg.f(av8Var2, -1928792715, R.color.on_color_primary, av8Var2, false) : ljg.f(av8Var2, -1928792073, R.color.on_color_secondary, av8Var2, false);
        boolean g10 = av8Var2.g(f6);
        Object O9 = av8Var2.O();
        if (g10 || O9 == a99Var3) {
            O9 = new pw6(f6, 15);
            av8Var2.n0(O9);
        }
        udj.c(str2, am3.b(utcVar, f9, (Function1) O9), f13, null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, e4, av8Var2, 0, 24960, 110584);
        av8Var2.s(false);
        if (am3Var.b != i) {
            hz8.t(this.k, av8Var2);
        }
        return Unit.a;
    }
}
