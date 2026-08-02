package defpackage;

import com.sofascore.results.R;
import com.unity3d.services.UnityAdsConstants;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class hkf extends xka implements Function2 {
    public final /* synthetic */ e1d i;
    public final /* synthetic */ am3 j;
    public final /* synthetic */ Function0 k;
    public final /* synthetic */ int l;
    public final /* synthetic */ boolean m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hkf(e1d e1dVar, am3 am3Var, Function0 function0, int i, boolean z) {
        super(2);
        this.i = e1dVar;
        this.j = am3Var;
        this.k = function0;
        this.l = i;
        this.m = z;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        boolean z;
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
        av8Var2.d0(1847740658);
        am3 am3Var2 = (am3) am3Var.g().b;
        ll3 f = am3Var2.f();
        ll3 f2 = am3Var2.f();
        ll3 f3 = am3Var2.f();
        ll3 f4 = am3Var2.f();
        xl3 d = am3Var.d(0.285f);
        xl3 c = am3Var.c(0.154f);
        xl3 c2 = am3Var.c(0.458f);
        d7e t = haa.t(this.l, 0, av8Var2);
        utc utcVar = utc.a;
        xtc d2 = bkh.d(utcVar, 1.0f);
        Object O = av8Var2.O();
        a99 a99Var = nf3.a;
        if (O == a99Var) {
            O = rg2.z;
            av8Var2.n0(O);
        }
        wkn.k(t, null, am3.b(d2, f, (Function1) O), null, mp3.d, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, av8Var2, 24632, 104);
        String v = oea.v(R.string.position, av8Var2);
        yf8 yf8Var = xth.a;
        dfj b = xth.b();
        long D = lz.D(R.color.n_lv_3, av8Var2);
        xtc q = bkh.q(utcVar, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 64.0f, 1);
        boolean g = av8Var2.g(d) | av8Var2.g(f);
        Object O2 = av8Var2.O();
        if (g || O2 == a99Var) {
            O2 = new id3(d, f, 4);
            av8Var2.n0(O2);
        }
        udj.c(v, am3.b(q, f2, (Function1) O2), D, null, 0L, null, 0L, null, new p7j(3), 0L, 2, false, 2, 0, null, b, av8Var2, 0, 24960, 109560);
        av8 av8Var3 = av8Var2;
        if (this.m) {
            av8Var3.d0(1849251349);
            String v2 = oea.v(R.string.motorsport_legend_pit_stop, av8Var3);
            dfj b2 = xth.b();
            long D2 = lz.D(R.color.n_lv_3, av8Var3);
            xtc q2 = bkh.q(utcVar, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 64.0f, 1);
            boolean g2 = av8Var3.g(c) | av8Var3.g(f);
            Object O3 = av8Var3.O();
            if (g2 || O3 == a99Var) {
                O3 = new id3(c, f, 5);
                av8Var3.n0(O3);
            }
            udj.c(v2, am3.b(q2, f3, (Function1) O3), D2, null, 0L, null, 0L, null, new p7j(3), 0L, 2, false, 2, 0, null, b2, av8Var3, 0, 24960, 109560);
            av8Var3 = av8Var3;
            z = false;
            av8Var3.s(false);
        } else {
            z = false;
            av8Var3.d0(1849978423);
            av8Var3.s(false);
        }
        String v3 = oea.v(R.string.motorsport_legend_lap, av8Var3);
        dfj b3 = xth.b();
        long D3 = lz.D(R.color.n_lv_3, av8Var3);
        xtc q3 = bkh.q(utcVar, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 64.0f, 1);
        boolean g3 = av8Var3.g(c2) | av8Var3.g(f);
        Object O4 = av8Var3.O();
        if (g3 || O4 == a99Var) {
            O4 = new id3(c2, f, 6);
            av8Var3.n0(O4);
        }
        av8 av8Var4 = av8Var3;
        udj.c(v3, am3.b(q3, f4, (Function1) O4), D3, null, 0L, null, 0L, null, new p7j(3), 0L, 2, false, 2, 0, null, b3, av8Var4, 0, 24960, 109560);
        av8Var4.s(z);
        if (am3Var.b != i) {
            hz8.t(this.k, av8Var4);
        }
        return Unit.a;
    }
}
