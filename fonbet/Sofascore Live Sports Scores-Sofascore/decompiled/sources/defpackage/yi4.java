package defpackage;

import com.sofascore.results.R;
import com.unity3d.services.UnityAdsConstants;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class yi4 implements ct8 {
    public final /* synthetic */ long a;
    public final /* synthetic */ e1d b;
    public final /* synthetic */ ku3 c;
    public final /* synthetic */ ksa d;
    public final /* synthetic */ IntRange e;
    public final /* synthetic */ lg2 f;
    public final /* synthetic */ di4 g;
    public final /* synthetic */ kg2 h;
    public final /* synthetic */ ci4 i;

    public yi4(long j, e1d e1dVar, ku3 ku3Var, ksa ksaVar, IntRange intRange, lg2 lg2Var, di4 di4Var, kg2 kg2Var, ci4 ci4Var) {
        this.a = j;
        this.b = e1dVar;
        this.c = ku3Var;
        this.d = ksaVar;
        this.e = intRange;
        this.f = lg2Var;
        this.g = di4Var;
        this.h = kg2Var;
        this.i = ci4Var;
    }

    @Override // defpackage.ct8
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        IntRange intRange;
        of3 of3Var = (of3) obj2;
        ((Number) obj3).intValue();
        String B = cga.B(R.string.m3c_date_picker_year_picker_pane_title, of3Var);
        av8 av8Var = (av8) of3Var;
        boolean g = av8Var.g(B);
        Object O = av8Var.O();
        a99 a99Var = nf3.a;
        if (g || O == a99Var) {
            O = new jp1(B, 6);
            av8Var.n0(O);
        }
        utc utcVar = utc.a;
        xtc a = o3h.a(utcVar, false, (Function1) O);
        u23 a2 = t23.a(ww9.d, uxf.o, av8Var, 0);
        int G = z8e.G(av8Var);
        aee m = av8Var.m();
        xtc C = fqj.C(av8Var, a);
        if3.k7.getClass();
        zg3 zg3Var = hf3.b;
        av8Var.h0();
        if (av8Var.S) {
            av8Var.l(zg3Var);
        } else {
            av8Var.q0();
        }
        waa.K(av8Var, a2, hf3.g);
        waa.K(av8Var, m, hf3.f);
        f50 f50Var = hf3.j;
        if (av8Var.S || !Intrinsics.c(av8Var.O(), Integer.valueOf(G))) {
            mz1.t(G, av8Var, G, f50Var);
        }
        waa.K(av8Var, C, hf3.d);
        t3e t3eVar = oj4.a;
        xtc d0 = l98.d0(bkh.h(utcVar, 336.0f - j65.a), 12.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2);
        e1d e1dVar = this.b;
        boolean g2 = av8Var.g(e1dVar);
        ku3 ku3Var = this.c;
        boolean i = g2 | av8Var.i(ku3Var);
        ksa ksaVar = this.d;
        boolean g3 = i | av8Var.g(ksaVar);
        IntRange intRange2 = this.e;
        boolean i2 = g3 | av8Var.i(intRange2);
        lg2 lg2Var = this.f;
        boolean g4 = i2 | av8Var.g(lg2Var);
        Object O2 = av8Var.O();
        if (g4 || O2 == a99Var) {
            ke keVar = new ke(ku3Var, e1dVar, ksaVar, intRange2, lg2Var);
            intRange = intRange2;
            av8Var.n0(keVar);
            O2 = keVar;
        } else {
            intRange = intRange2;
        }
        long j = this.a;
        di4 di4Var = this.g;
        kg2 kg2Var = this.h;
        ci4 ci4Var = this.i;
        oj4.n(d0, j, (Function1) O2, di4Var, kg2Var, intRange, ci4Var, av8Var, 6);
        td4.w(null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, ci4Var.x, av8Var, 0, 3);
        av8Var.s(true);
        return Unit.a;
    }
}
