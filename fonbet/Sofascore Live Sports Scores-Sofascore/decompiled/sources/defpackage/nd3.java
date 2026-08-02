package defpackage;

import com.sofascore.results.R;
import com.unity3d.services.UnityAdsConstants;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class nd3 extends xka implements Function2 {
    public final /* synthetic */ int i;
    public final /* synthetic */ e1d j;
    public final /* synthetic */ am3 k;
    public final /* synthetic */ Function0 l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ nd3(e1d e1dVar, am3 am3Var, Function0 function0, int i) {
        super(2);
        this.i = i;
        this.j = e1dVar;
        this.k = am3Var;
        this.l = function0;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.i;
        Function0 function0 = this.l;
        a99 a99Var = nf3.a;
        utc utcVar = utc.a;
        e1d e1dVar = this.j;
        am3 am3Var = this.k;
        switch (i) {
            case 0:
                of3 of3Var = (of3) obj;
                if ((((Number) obj2).intValue() & 3) == 2) {
                    av8 av8Var = (av8) of3Var;
                    if (av8Var.D()) {
                        av8Var.W();
                        break;
                    }
                }
                e1dVar.setValue(Unit.a);
                int i2 = am3Var.b;
                am3Var.h();
                av8 av8Var2 = (av8) of3Var;
                av8Var2.d0(-1349762561);
                am3 am3Var2 = (am3) am3Var.g().b;
                ll3 f = am3Var2.f();
                ll3 f2 = am3Var2.f();
                ll3 f3 = am3Var2.f();
                xl3 d = am3Var.d(0.13f);
                xl3 c = am3Var.c(0.21f);
                d7e t = haa.t(R.drawable.price_tracker_info, 0, av8Var2);
                xtc d2 = bkh.d(utcVar, 1.0f);
                Object O = av8Var2.O();
                if (O == a99Var) {
                    O = rg2.c;
                    av8Var2.n0(O);
                }
                wkn.k(t, null, am3.b(d2, f, (Function1) O), null, mp3.d, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, av8Var2, 24632, 104);
                String v = oea.v(R.string.fantasy_player_price, av8Var2);
                yf8 yf8Var = xth.a;
                dfj b = xth.b();
                long D = lz.D(R.color.n_lv_3, av8Var2);
                boolean g = av8Var2.g(d) | av8Var2.g(f);
                Object O2 = av8Var2.O();
                if (g || O2 == a99Var) {
                    O2 = new id3(d, f, 0);
                    av8Var2.n0(O2);
                }
                udj.c(v, am3.b(utcVar, f2, (Function1) O2), D, null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, b, av8Var2, 0, 24960, 110584);
                String v2 = oea.v(R.string.fantasy_round, av8Var2);
                dfj b2 = xth.b();
                long D2 = lz.D(R.color.n_lv_3, av8Var2);
                boolean g2 = av8Var2.g(c) | av8Var2.g(f);
                Object O3 = av8Var2.O();
                if (g2 || O3 == a99Var) {
                    O3 = new id3(c, f, 1);
                    av8Var2.n0(O3);
                }
                udj.c(v2, am3.b(utcVar, f3, (Function1) O3), D2, null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, b2, av8Var2, 0, 24960, 110584);
                av8Var2.s(false);
                if (am3Var.b != i2) {
                    hz8.t(function0, av8Var2);
                }
            default:
                of3 of3Var2 = (of3) obj;
                if ((((Number) obj2).intValue() & 3) == 2) {
                    av8 av8Var3 = (av8) of3Var2;
                    if (av8Var3.D()) {
                        av8Var3.W();
                        break;
                    }
                }
                e1dVar.setValue(Unit.a);
                int i3 = am3Var.b;
                am3Var.h();
                av8 av8Var4 = (av8) of3Var2;
                av8Var4.d0(-353069683);
                am3 am3Var3 = (am3) am3Var.g().b;
                ll3 f4 = am3Var3.f();
                ll3 f5 = am3Var3.f();
                ll3 f6 = am3Var3.f();
                xl3 d3 = am3Var.d(0.285f);
                xl3 c2 = am3Var.c(0.458f);
                d7e t2 = haa.t(R.drawable.rally_tracker_info_popover, 0, av8Var4);
                xtc d4 = bkh.d(utcVar, 1.0f);
                Object O4 = av8Var4.O();
                if (O4 == a99Var) {
                    O4 = rg2.A;
                    av8Var4.n0(O4);
                }
                wkn.k(t2, null, am3.b(d4, f4, (Function1) O4), null, mp3.d, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, av8Var4, 24632, 104);
                String v3 = oea.v(R.string.position, av8Var4);
                yf8 yf8Var2 = xth.a;
                dfj b3 = xth.b();
                long D3 = lz.D(R.color.n_lv_3, av8Var4);
                xtc q = bkh.q(utcVar, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 64.0f, 1);
                boolean g3 = av8Var4.g(d3) | av8Var4.g(f4);
                Object O5 = av8Var4.O();
                if (g3 || O5 == a99Var) {
                    O5 = new id3(d3, f4, 7);
                    av8Var4.n0(O5);
                }
                udj.c(v3, am3.b(q, f5, (Function1) O5), D3, null, 0L, null, 0L, null, new p7j(3), 0L, 2, false, 2, 0, null, b3, av8Var4, 0, 24960, 109560);
                String v4 = oea.v(R.string.motorsport_wrc_stage, av8Var4);
                dfj b4 = xth.b();
                long D4 = lz.D(R.color.n_lv_3, av8Var4);
                xtc q2 = bkh.q(utcVar, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 64.0f, 1);
                boolean g4 = av8Var4.g(c2) | av8Var4.g(f4);
                Object O6 = av8Var4.O();
                if (g4 || O6 == a99Var) {
                    O6 = new id3(c2, f4, 8);
                    av8Var4.n0(O6);
                }
                udj.c(v4, am3.b(q2, f6, (Function1) O6), D4, null, 0L, null, 0L, null, new p7j(3), 0L, 2, false, 2, 0, null, b4, av8Var4, 0, 24960, 109560);
                av8Var4.s(false);
                if (am3Var.b != i3) {
                    hz8.t(function0, av8Var4);
                }
        }
        return Unit.a;
    }
}
