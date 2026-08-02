package defpackage;

import androidx.compose.ui.graphics.vector.ImageVector;
import com.sofascore.results.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class qj8 extends xka implements Function2 {
    public final /* synthetic */ e1d i;
    public final /* synthetic */ am3 j;
    public final /* synthetic */ Function0 k;
    public final /* synthetic */ boolean l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qj8(e1d e1dVar, am3 am3Var, Function0 function0, boolean z) {
        super(2);
        this.i = e1dVar;
        this.j = am3Var;
        this.k = function0;
        this.l = z;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        float f;
        boolean z;
        ll3 ll3Var;
        am3 am3Var;
        int i;
        utc utcVar;
        a99 a99Var;
        float f2;
        int i2;
        boolean z2;
        of3 of3Var = (of3) obj;
        if ((((Number) obj2).intValue() & 3) == 2) {
            av8 av8Var = (av8) of3Var;
            if (av8Var.D()) {
                av8Var.W();
                return Unit.a;
            }
        }
        this.i.setValue(Unit.a);
        am3 am3Var2 = this.j;
        int i3 = am3Var2.b;
        am3Var2.h();
        av8 av8Var2 = (av8) of3Var;
        av8Var2.d0(979429188);
        am3 am3Var3 = (am3) am3Var2.g().b;
        ll3 f3 = am3Var3.f();
        ll3 f4 = am3Var3.f();
        ll3 f5 = am3Var3.f();
        double doubleValue = ((Number) av8Var2.k(thb.a)).doubleValue();
        float f6 = (float) (16.0d * doubleValue);
        float f7 = (float) (40.0d * doubleValue);
        utc utcVar2 = utc.a;
        a99 a99Var2 = nf3.a;
        boolean z3 = this.l;
        if (z3) {
            f = f7;
            z = z3;
            ll3Var = f5;
            am3Var = am3Var2;
            i = i3;
            utcVar = utcVar2;
            a99Var = a99Var2;
            f2 = f6;
            i2 = 1;
            z2 = false;
            av8Var2.d0(980287670);
            av8Var2.s(false);
        } else {
            av8Var2.d0(979605360);
            xtc q = n9e.q(bkh.l(utcVar2, f6), lz.D(R.color.on_color_primary, av8Var2), o7g.a);
            boolean g = av8Var2.g(f3) | av8Var2.c(doubleValue);
            Object O = av8Var2.O();
            if (g || O == a99Var2) {
                O = new ry6(f3, doubleValue, 4);
                av8Var2.n0(O);
            }
            xtc b = am3.b(q, f4, (Function1) O);
            k1c c = e12.c(uxf.c, false);
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
            f = f7;
            ll3Var = f5;
            am3Var = am3Var2;
            i = i3;
            f2 = f6;
            a99Var = a99Var2;
            utcVar = utcVar2;
            i2 = 1;
            z2 = false;
            z = z3;
            kq9.b(s6a.N(R.drawable.team_logo_placeholder, 6, av8Var2), null, bkh.c, lz.D(R.color.neutral_default, av8Var2), av8Var2, 432, 0);
            av8Var2.s(true);
            av8Var2.s(false);
        }
        ImageVector N = s6a.N(z ? R.drawable.ic_jersey_placeholder : R.drawable.player_photo_placeholder, 6, av8Var2);
        long j = r13.i;
        xtc l = bkh.l(utcVar, f);
        boolean c2 = av8Var2.c(doubleValue);
        Object O2 = av8Var2.O();
        if (c2 || O2 == a99Var) {
            O2 = new qy6(doubleValue, i2);
            av8Var2.n0(O2);
        }
        kq9.b(N, null, am3.b(l, f3, (Function1) O2), j, av8Var2, 3120, 0);
        if (z) {
            av8Var2.d0(980978009);
            ImageVector N2 = s6a.N(R.drawable.ic_plus, 6, av8Var2);
            long D = lz.D(R.color.neutral_default, av8Var2);
            xtc l2 = bkh.l(utcVar, f2);
            boolean g2 = av8Var2.g(f3);
            Object O3 = av8Var2.O();
            if (g2 || O3 == a99Var) {
                O3 = new pw6(f3, 5);
                av8Var2.n0(O3);
            }
            kq9.b(N2, null, am3.b(l2, ll3Var, (Function1) O3), D, av8Var2, 48, 0);
            av8Var2.s(z2);
        } else {
            av8Var2.d0(981354070);
            av8Var2.s(z2);
        }
        av8Var2.s(z2);
        if (am3Var.b != i) {
            hz8.t(this.k, av8Var2);
        }
        return Unit.a;
    }
}
