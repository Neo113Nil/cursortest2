package defpackage;

import androidx.compose.ui.graphics.vector.ImageVector;
import com.sofascore.results.R;
import com.sofascore.results.fantasy.ui.model.FantasyPlayerMissingData;
import com.sofascore.results.fantasy.ui.model.FantasyRoundPlayerUiModel;
import com.unity3d.services.UnityAdsConstants;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class py6 extends xka implements Function2 {
    public final /* synthetic */ e1d i;
    public final /* synthetic */ am3 j;
    public final /* synthetic */ Function0 k;
    public final /* synthetic */ FantasyRoundPlayerUiModel l;
    public final /* synthetic */ boolean m;
    public final /* synthetic */ boolean n;
    public final /* synthetic */ boolean o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public py6(e1d e1dVar, am3 am3Var, Function0 function0, FantasyRoundPlayerUiModel fantasyRoundPlayerUiModel, boolean z, boolean z2, boolean z3) {
        super(2);
        this.i = e1dVar;
        this.j = am3Var;
        this.k = function0;
        this.l = fantasyRoundPlayerUiModel;
        this.m = z;
        this.n = z2;
        this.o = z3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v15 */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        FantasyRoundPlayerUiModel fantasyRoundPlayerUiModel;
        ll3 ll3Var;
        Object obj3;
        float f;
        double d;
        ll3 ll3Var2;
        ll3 ll3Var3;
        FantasyRoundPlayerUiModel fantasyRoundPlayerUiModel2;
        int i;
        av8 av8Var;
        float f2;
        ll3 ll3Var4;
        boolean z;
        float f3;
        ll3 ll3Var5;
        FantasyRoundPlayerUiModel fantasyRoundPlayerUiModel3;
        boolean z2;
        av8 av8Var2;
        ?? r3;
        of3 of3Var = (of3) obj;
        if ((((Number) obj2).intValue() & 3) == 2) {
            av8 av8Var3 = (av8) of3Var;
            if (av8Var3.D()) {
                av8Var3.W();
                return Unit.a;
            }
        }
        this.i.setValue(Unit.a);
        am3 am3Var = this.j;
        int i2 = am3Var.b;
        am3Var.h();
        av8 av8Var4 = (av8) of3Var;
        av8Var4.d0(56566724);
        am3 am3Var2 = (am3) am3Var.g().b;
        ll3 f4 = am3Var2.f();
        ll3 f5 = am3Var2.f();
        ll3 f6 = am3Var2.f();
        ll3 f7 = am3Var2.f();
        ll3 f8 = am3Var2.f();
        double doubleValue = ((Number) av8Var4.k(thb.a)).doubleValue();
        float f9 = (float) (16.0d * doubleValue);
        float f10 = (float) (40.0d * doubleValue);
        float f11 = (float) (2.0d * doubleValue);
        FantasyRoundPlayerUiModel fantasyRoundPlayerUiModel4 = this.l;
        yy6 yy6Var = fantasyRoundPlayerUiModel4.c;
        Boolean valueOf = yy6Var != null ? Boolean.valueOf(yy6Var.b) : null;
        Boolean bool = Boolean.TRUE;
        int i3 = Intrinsics.c(valueOf, bool) ? -1 : fantasyRoundPlayerUiModel4.a;
        utc utcVar = utc.a;
        xtc l = bkh.l(utcVar, f10);
        boolean c = av8Var4.c(doubleValue);
        Object O = av8Var4.O();
        Object obj4 = nf3.a;
        if (c || O == obj4) {
            O = new qy6(doubleValue, 0);
            av8Var4.n0(O);
        }
        xtc b = am3.b(l, f4, (Function1) O);
        boolean z3 = this.m;
        td4.s(i3, 0, av8Var4, b, z3);
        if (fantasyRoundPlayerUiModel4.w && this.n) {
            av8Var4.d0(57327835);
            fantasyRoundPlayerUiModel = fantasyRoundPlayerUiModel4;
            xtc q = n9e.q(bkh.l(utcVar, f9), lz.D(R.color.surface_1, av8Var4), o7g.a);
            boolean g = av8Var4.g(f4) | av8Var4.c(doubleValue);
            Object O2 = av8Var4.O();
            if (g || O2 == obj4) {
                r3 = 0;
                O2 = new ry6(f4, doubleValue, 0);
                av8Var4.n0(O2);
            } else {
                r3 = 0;
            }
            h5a.l(am3.b(q, f8, (Function1) O2), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, av8Var4, r3, 2);
            av8Var4.s(r3);
        } else {
            fantasyRoundPlayerUiModel = fantasyRoundPlayerUiModel4;
            av8Var4.d0(57704547);
            av8Var4.s(false);
        }
        if (z3) {
            av8Var4.d0(57847860);
            FantasyRoundPlayerUiModel fantasyRoundPlayerUiModel5 = fantasyRoundPlayerUiModel;
            Object obj5 = Intrinsics.c(yy6Var != null ? Boolean.valueOf(yy6Var.b) : null, bool) ? null : fantasyRoundPlayerUiModel5.j;
            if (obj5 == null) {
                av8Var4.d0(57847859);
                av8Var4.s(false);
                z2 = false;
                ll3Var = f4;
                fantasyRoundPlayerUiModel3 = fantasyRoundPlayerUiModel5;
                obj3 = obj4;
                f3 = f9;
                d = doubleValue;
                ll3Var5 = f6;
                ll3Var3 = f7;
                av8Var2 = av8Var4;
            } else {
                av8Var4.d0(57847860);
                long D = lz.D(R.color.graphics_dark, av8Var4);
                yf8 yf8Var = xth.a;
                dfj n = xth.n();
                long j = xth.c().a.b;
                v8a.l(j);
                long E = v8a.E(j & 1095216660480L, (float) (lfj.c(j) * doubleValue));
                long j2 = xth.c().b.c;
                v8a.l(j2);
                dfj a = dfj.a(n, 0L, E, null, null, 0L, null, 0, 0, v8a.E(j2 & 1095216660480L, (float) (lfj.c(j2) * doubleValue)), null, null, 0, 16646141);
                xtc c0 = l98.c0(n9e.q(utcVar, lz.D(R.color.on_color_primary, av8Var4), o7g.a(f11)), f11, (float) (1.0d * doubleValue));
                boolean g2 = av8Var4.g(f4);
                Object O3 = av8Var4.O();
                if (g2 || O3 == obj4) {
                    O3 = new pw6(f4, 2);
                    av8Var4.n0(O3);
                }
                xtc b2 = am3.b(c0, f5, (Function1) O3);
                f3 = f9;
                ll3Var3 = f7;
                ll3Var5 = f6;
                obj3 = obj4;
                ll3Var = f4;
                fantasyRoundPlayerUiModel3 = fantasyRoundPlayerUiModel5;
                d = doubleValue;
                udj.c(obj5, b2, D, null, 0L, null, 0L, null, null, 0L, 0, false, 1, 0, null, a, av8Var4, 0, 24576, 114680);
                av8 av8Var5 = av8Var4;
                z2 = false;
                av8Var5.s(false);
                av8Var2 = av8Var5;
            }
            av8Var2.s(z2);
            f = f3;
            fantasyRoundPlayerUiModel2 = fantasyRoundPlayerUiModel3;
            ll3Var2 = ll3Var5;
            av8Var = av8Var2;
        } else {
            ll3Var = f4;
            obj3 = obj4;
            f = f9;
            d = doubleValue;
            ll3Var2 = f6;
            FantasyRoundPlayerUiModel fantasyRoundPlayerUiModel6 = fantasyRoundPlayerUiModel;
            ll3Var3 = f7;
            av8Var4.d0(58667996);
            xtc b0 = l98.b0(n9e.q(bkh.l(utcVar, f), lz.D(R.color.on_color_primary, av8Var4), o7g.a(f11)), 1.0f);
            boolean g3 = av8Var4.g(ll3Var) | av8Var4.c(d);
            Object O4 = av8Var4.O();
            if (g3 || O4 == obj3) {
                O4 = new ry6(ll3Var, d, 1);
                av8Var4.n0(O4);
            }
            xtc b3 = am3.b(b0, f5, (Function1) O4);
            k1c c2 = e12.c(uxf.c, false);
            int hashCode = Long.hashCode(av8Var4.T);
            aee m = av8Var4.m();
            xtc C = fqj.C(av8Var4, b3);
            if3.k7.getClass();
            zg3 zg3Var = hf3.b;
            av8Var4.h0();
            if (av8Var4.S) {
                av8Var4.l(zg3Var);
            } else {
                av8Var4.q0();
            }
            waa.K(av8Var4, c2, hf3.g);
            waa.K(av8Var4, m, hf3.f);
            waa.K(av8Var4, Integer.valueOf(hashCode), hf3.j);
            waa.J(av8Var4, hf3.k);
            waa.K(av8Var4, C, hf3.d);
            g28 g28Var = bkh.c;
            if (Intrinsics.c(yy6Var != null ? Boolean.valueOf(yy6Var.b) : null, bool)) {
                i = -1;
                fantasyRoundPlayerUiModel2 = fantasyRoundPlayerUiModel6;
            } else {
                fantasyRoundPlayerUiModel2 = fantasyRoundPlayerUiModel6;
                i = fantasyRoundPlayerUiModel2.h;
            }
            td4.u(i, 48, av8Var4, g28Var);
            av8Var4.s(true);
            av8Var4.s(false);
            av8Var = av8Var4;
        }
        if (fantasyRoundPlayerUiModel2.m) {
            av8Var.d0(59382701);
            ImageVector N = s6a.N(this.o ? R.drawable.ic_triple_captain : R.drawable.ic_captain, 6, av8Var);
            long j3 = r13.i;
            xtc l2 = bkh.l(utcVar, f);
            boolean g4 = av8Var.g(ll3Var) | av8Var.c(d);
            Object O5 = av8Var.O();
            if (g4 || O5 == obj3) {
                O5 = new ry6(ll3Var, d, 2);
                av8Var.n0(O5);
            }
            xtc b4 = am3.b(l2, ll3Var2, (Function1) O5);
            f2 = f;
            ll3Var4 = ll3Var3;
            kq9.b(N, null, b4, j3, av8Var, 3120, 0);
            z = false;
            av8Var.s(false);
        } else {
            f2 = f;
            ll3Var4 = ll3Var3;
            z = false;
            av8Var.d0(59905795);
            av8Var.s(false);
        }
        FantasyPlayerMissingData fantasyPlayerMissingData = fantasyRoundPlayerUiModel2.l;
        if (fantasyPlayerMissingData == null) {
            av8Var.d0(59952325);
            av8Var.s(z);
        } else {
            av8Var.d0(59952326);
            ImageVector N2 = s6a.N(R.drawable.ic_warning, 6, av8Var);
            long D2 = lz.D(fantasyPlayerMissingData.a.b, av8Var);
            xtc l3 = bkh.l(utcVar, f2);
            boolean g5 = av8Var.g(ll3Var) | av8Var.c(d);
            Object O6 = av8Var.O();
            if (g5 || O6 == obj3) {
                O6 = new ry6(ll3Var, d, 3);
                av8Var.n0(O6);
            }
            kq9.b(N2, null, am3.b(l3, ll3Var4, (Function1) O6), D2, av8Var, 48, 0);
            z = false;
            av8Var.s(false);
        }
        av8Var.s(z);
        if (am3Var.b != i2) {
            hz8.t(this.k, av8Var);
        }
        return Unit.a;
    }
}
