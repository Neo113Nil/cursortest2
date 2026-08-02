package defpackage;

import com.sofascore.results.R;
import com.unity3d.services.UnityAdsConstants;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class lfk extends xka implements Function2 {
    public final /* synthetic */ e1d i;
    public final /* synthetic */ am3 j;
    public final /* synthetic */ Function0 k;
    public final /* synthetic */ boolean l;
    public final /* synthetic */ e1d m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lfk(e1d e1dVar, am3 am3Var, Function0 function0, boolean z, e1d e1dVar2) {
        super(2);
        this.i = e1dVar;
        this.j = am3Var;
        this.k = function0;
        this.l = z;
        this.m = e1dVar2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        utc utcVar;
        lv1 lv1Var;
        int i;
        long f;
        String upperCase;
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
        av8Var2.d0(-2062494472);
        am3 am3Var2 = (am3) am3Var.g().b;
        ll3 f2 = am3Var2.f();
        ll3 f3 = am3Var2.f();
        utc utcVar2 = utc.a;
        xtc g = bkh.g(bkh.p(l98.f0(utcVar2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 54.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 11), 70.0f), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 70.0f, 1);
        boolean g2 = av8Var2.g(f3);
        Object O = av8Var2.O();
        a99 a99Var = nf3.a;
        if (g2 || O == a99Var) {
            O = new pw6(f3, 16);
            av8Var2.n0(O);
        }
        wkn.k(haa.t(R.drawable.ic_predictions_menu, 0, av8Var2), null, am3.b(g, f2, (Function1) O), null, mp3.a, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, new ay1(lz.D(R.color.on_color_highlight_1, av8Var2), 5), av8Var2, 24632, 40);
        Object O2 = av8Var2.O();
        if (O2 == a99Var) {
            O2 = mfk.b;
            av8Var2.n0(O2);
        }
        xtc b = am3.b(utcVar2, f3, (Function1) O2);
        l8g a = k8g.a(ww9.b, uxf.l, av8Var2, 0);
        int hashCode = Long.hashCode(av8Var2.T);
        aee m = av8Var2.m();
        xtc C = fqj.C(av8Var2, b);
        if3.k7.getClass();
        zg3 zg3Var = hf3.b;
        av8Var2.h0();
        if (av8Var2.S) {
            av8Var2.l(zg3Var);
        } else {
            av8Var2.q0();
        }
        f50 f50Var = hf3.g;
        waa.K(av8Var2, a, f50Var);
        ff3 ff3Var = hf3.f;
        waa.K(av8Var2, m, ff3Var);
        Integer valueOf = Integer.valueOf(hashCode);
        f50 f50Var2 = hf3.j;
        waa.K(av8Var2, valueOf, f50Var2);
        ry ryVar = hf3.k;
        waa.J(av8Var2, ryVar);
        f50 f50Var3 = hf3.d;
        waa.K(av8Var2, C, f50Var3);
        if (1.0f <= 0.0d) {
            p3a.a("invalid weight; must be greater than zero");
        }
        xtc b0 = l98.b0(new goa(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), 16.0f);
        lv1 lv1Var2 = uxf.m;
        xtc z = b0.z(new nok(lv1Var2));
        u23 a2 = t23.a(ww9.d, uxf.o, av8Var2, 0);
        int hashCode2 = Long.hashCode(av8Var2.T);
        aee m2 = av8Var2.m();
        xtc C2 = fqj.C(av8Var2, z);
        av8Var2.h0();
        if (av8Var2.S) {
            av8Var2.l(zg3Var);
        } else {
            av8Var2.q0();
        }
        waa.K(av8Var2, a2, f50Var);
        waa.K(av8Var2, m2, ff3Var);
        bf3.s(hashCode2, av8Var2, f50Var2, av8Var2, ryVar);
        waa.K(av8Var2, C2, f50Var3);
        e1d e1dVar = this.m;
        String v = oea.v(((Boolean) e1dVar.getValue()).booleanValue() ? R.string.weekly_challenge_daily_10x_vote : R.string.weekly_challenge_daily_10x_header, av8Var2);
        yf8 yf8Var = xth.a;
        udj.c(v, null, lz.D(R.color.n_lv_1, av8Var2), null, 0L, null, 0L, null, new p7j(6), 0L, 0, false, 0, 0, null, xth.j(), av8Var2, 0, 0, 130042);
        av8 av8Var3 = av8Var2;
        if (((Boolean) e1dVar.getValue()).booleanValue()) {
            av8Var3.d0(-1662943864);
            udj.c(oea.v(R.string.weekly_challenge_daily_10x_vote_description, av8Var3), l98.f0(utcVar2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 4.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13), lz.D(R.color.n_lv_1, av8Var3), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.b(), av8Var3, 48, 0, 131064);
            av8Var3 = av8Var3;
            av8Var3.s(false);
        } else {
            av8Var3.d0(-1662628098);
            av8Var3.s(false);
        }
        av8Var3.s(true);
        boolean z2 = this.l;
        if (z2) {
            av8Var3.d0(-1925385626);
            utcVar = utcVar2;
            lv1Var = lv1Var2;
            i = 6;
            kq9.b(s6a.N(R.drawable.ic_done, 6, av8Var3), null, l98.f0(utcVar, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 4.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 11).z(new nok(lv1Var)), lz.D(R.color.n_lv_1, av8Var3), av8Var3, 48, 0);
            av8Var3.s(false);
        } else {
            utcVar = utcVar2;
            lv1Var = lv1Var2;
            i = 6;
            av8Var3.d0(-1925050764);
            av8Var3.s(false);
        }
        xtc A = wnn.A(l98.f0(utcVar, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 11), o7g.a(16.0f));
        if (z2) {
            av8Var3.d0(1877571225);
            av8Var3.s(false);
            f = r13.h;
        } else {
            f = ljg.f(av8Var3, 1877571771, R.color.surface_1, av8Var3, false);
        }
        xtc z3 = l98.c0(n9e.q(A, f, oyn.e), z2 ? 0.0f : 16.0f, 8.0f).z(new nok(lv1Var));
        if (z2) {
            upperCase = ljg.k(av8Var3, 1877578070, R.string.voted, av8Var3, false);
        } else {
            av8Var3.d0(1877581036);
            String v2 = oea.v(R.string.button_play, av8Var3);
            Locale locale = Locale.getDefault();
            locale.getClass();
            upperCase = v2.toUpperCase(locale);
            upperCase.getClass();
            av8Var3.s(false);
        }
        av8 av8Var4 = av8Var3;
        udj.c(upperCase, z3, lz.D(R.color.n_lv_1, av8Var3), null, 0L, null, 0L, null, new p7j(i), 0L, 0, false, 0, 0, null, xth.a(), av8Var4, 0, 0, 130040);
        av8Var4.s(true);
        av8Var4.s(false);
        if (am3Var.b != i2) {
            hz8.t(this.k, av8Var4);
        }
        return Unit.a;
    }
}
