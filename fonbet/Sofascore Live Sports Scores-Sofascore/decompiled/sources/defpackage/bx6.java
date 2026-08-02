package defpackage;

import android.view.View;
import com.sofascore.results.R;
import com.unity3d.services.UnityAdsConstants;
import kotlin.Unit;
import kotlin.collections.b;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class bx6 extends xka implements Function2 {
    public final /* synthetic */ e1d i;
    public final /* synthetic */ am3 j;
    public final /* synthetic */ Function0 k;
    public final /* synthetic */ tc3 l;
    public final /* synthetic */ cdi m;
    public final /* synthetic */ qug n;
    public final /* synthetic */ View o;
    public final /* synthetic */ Function1 p;
    public final /* synthetic */ mei q;
    public final /* synthetic */ Function1 r;
    public final /* synthetic */ nei s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bx6(e1d e1dVar, am3 am3Var, Function0 function0, tc3 tc3Var, cdi cdiVar, qug qugVar, View view, Function1 function1, mei meiVar, Function1 function12, nei neiVar) {
        super(2);
        this.i = e1dVar;
        this.j = am3Var;
        this.k = function0;
        this.l = tc3Var;
        this.m = cdiVar;
        this.n = qugVar;
        this.o = view;
        this.p = function1;
        this.q = meiVar;
        this.r = function12;
        this.s = neiVar;
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
        av8Var2.d0(-1473569650);
        am3 am3Var2 = (am3) am3Var.g().b;
        ll3 f = am3Var2.f();
        ll3 f2 = am3Var2.f();
        ll3 f3 = am3Var2.f();
        xl3 d = am3Var.d(0.5f);
        mv1 mv1Var = uxf.f;
        boolean g = av8Var2.g(d);
        Object O = av8Var2.O();
        a99 a99Var = nf3.a;
        if (g || O == a99Var) {
            O = new qw6(d, 2);
            av8Var2.n0(O);
        }
        utc utcVar = utc.a;
        xtc b = am3.b(utcVar, f, (Function1) O);
        k1c c = e12.c(mv1Var, false);
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
        waa.K(av8Var2, c, hf3.g);
        waa.K(av8Var2, m, hf3.f);
        waa.K(av8Var2, Integer.valueOf(hashCode), hf3.j);
        waa.J(av8Var2, hf3.k);
        waa.K(av8Var2, C, hf3.d);
        this.l.invoke(n12.a, av8Var2, 6);
        av8Var2.s(true);
        if (((Boolean) this.m.getValue()).booleanValue()) {
            av8Var2.d0(-1473066118);
            xtc p = n9e.p(bkh.p(mha.G(utcVar, 1.0f), 4.0f), wxf.s(b.j(new r13(r13.c(lz.D(R.color.n_lv_4, av8Var2), 0.1f)), new r13(r13.h)), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 14), null, 6);
            boolean g2 = av8Var2.g(d);
            Object O2 = av8Var2.O();
            if (g2 || O2 == a99Var) {
                O2 = new qw6(d, 3);
                av8Var2.n0(O2);
            }
            xtc b2 = am3.b(p, f3, (Function1) O2);
            z = false;
            e12.a(0, av8Var2, b2);
            av8Var2.s(false);
        } else {
            z = false;
            av8Var2.d0(-1472347290);
            av8Var2.s(false);
        }
        tol.b(nyd.a.a(null), yqo.H(-2002263716, av8Var2, new dx6(am3Var, this.n, f2, d, this.o, this.p, this.q, this.r, this.s)), av8Var2, 56);
        av8Var2.s(z);
        if (am3Var.b != i) {
            hz8.t(this.k, av8Var2);
        }
        return Unit.a;
    }
}
