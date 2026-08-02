package defpackage;

import android.view.View;
import androidx.compose.ui.graphics.vector.ImageVector;
import com.ironsource.V2;
import com.sofascore.results.R;
import com.sofascore.results.fantasy.ui.model.FantasyPlayerMissingData;
import com.sofascore.results.fantasy.ui.model.FantasyPlayerUiModel;
import com.sofascore.results.fantasy.ui.model.FantasyRoundPlayerUiModel;
import com.unity3d.services.UnityAdsConstants;
import kotlin.Unit;
import kotlin.collections.b;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class m67 extends xka implements Function2 {
    public final /* synthetic */ e1d i;
    public final /* synthetic */ am3 j;
    public final /* synthetic */ Function0 k;
    public final /* synthetic */ boolean l;
    public final /* synthetic */ FantasyRoundPlayerUiModel m;
    public final /* synthetic */ Function1 n;
    public final /* synthetic */ boolean o;
    public final /* synthetic */ q67 p;
    public final /* synthetic */ cdi q;
    public final /* synthetic */ qug r;
    public final /* synthetic */ boolean s;
    public final /* synthetic */ boolean t;
    public final /* synthetic */ View u;
    public final /* synthetic */ Function1 v;
    public final /* synthetic */ boolean w;
    public final /* synthetic */ boolean x;
    public final /* synthetic */ Integer y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m67(e1d e1dVar, am3 am3Var, Function0 function0, boolean z, FantasyRoundPlayerUiModel fantasyRoundPlayerUiModel, Function1 function1, boolean z2, q67 q67Var, cdi cdiVar, qug qugVar, boolean z3, boolean z4, View view, Function1 function12, boolean z5, boolean z6, Integer num) {
        super(2);
        this.i = e1dVar;
        this.j = am3Var;
        this.k = function0;
        this.l = z;
        this.m = fantasyRoundPlayerUiModel;
        this.n = function1;
        this.o = z2;
        this.p = q67Var;
        this.q = cdiVar;
        this.r = qugVar;
        this.s = z3;
        this.t = z4;
        this.u = view;
        this.v = function12;
        this.w = z5;
        this.x = z6;
        this.y = num;
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x0281, code lost:
    
        if (r10 == r8) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0541, code lost:
    
        if (r5 == r3) goto L111;
     */
    @Override // kotlin.jvm.functions.Function2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj, Object obj2) {
        a99 a99Var;
        boolean z;
        float f;
        m67 m67Var;
        float f2;
        q67 q67Var;
        int i;
        utc utcVar;
        FantasyPlayerMissingData fantasyPlayerMissingData;
        av8 av8Var;
        boolean z2;
        boolean z3;
        xl3 xl3Var;
        a99 a99Var2;
        boolean z4;
        av8 av8Var2;
        boolean z5;
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
        av8Var4.d0(-308646366);
        am3 am3Var2 = (am3) am3Var.g().b;
        ll3 f3 = am3Var2.f();
        ll3 f4 = am3Var2.f();
        ll3 f5 = am3Var2.f();
        ll3 f6 = am3Var2.f();
        ll3 f7 = am3Var2.f();
        ll3 f8 = am3Var2.f();
        ll3 f9 = am3Var2.f();
        xl3 d = am3Var.d(0.5f);
        ImageVector N = s6a.N(R.drawable.ic_info, 6, av8Var4);
        long D = lz.D(R.color.primary_default, av8Var4);
        utc utcVar2 = utc.a;
        xtc l = bkh.l(utcVar2, 32.0f);
        n7g n7gVar = o7g.a;
        xtc A = wnn.A(l, n7gVar);
        long D2 = lz.D(R.color.n_lv_4, av8Var4);
        Object O = av8Var4.O();
        a99 a99Var3 = nf3.a;
        if (O == a99Var3) {
            O = mz1.e(av8Var4);
        }
        wzc wzcVar = (wzc) O;
        Object[] objArr = new Object[0];
        Object O2 = av8Var4.O();
        if (O2 == a99Var3) {
            O2 = o67.b;
            av8Var4.n0(O2);
        }
        boh bohVar = (boh) o3a.N(objArr, (Function0) O2, av8Var4, 48);
        Function1 function1 = this.n;
        FantasyRoundPlayerUiModel fantasyRoundPlayerUiModel = this.m;
        xtc b0 = l98.b0(tol.y(A, true, true, true, D2, wzcVar, new sw6(bohVar, function1, fantasyRoundPlayerUiModel, 1), av8Var4, 0), 4.0f);
        Object O3 = av8Var4.O();
        if (O3 == a99Var3) {
            O3 = rg2.g;
            av8Var4.n0(O3);
        }
        kq9.b(N, null, am3.b(b0, f4, (Function1) O3), D, av8Var4, 48, 0);
        boolean g = av8Var4.g(f4);
        Object O4 = av8Var4.O();
        if (g || O4 == a99Var3) {
            O4 = new pw6(f4, 4);
            av8Var4.n0(O4);
        }
        xtc b = am3.b(utcVar2, f5, (Function1) O4);
        k1c c = e12.c(uxf.c, false);
        int hashCode = Long.hashCode(av8Var4.T);
        aee m = av8Var4.m();
        xtc C = fqj.C(av8Var4, b);
        if3.k7.getClass();
        zg3 zg3Var = hf3.b;
        av8Var4.h0();
        if (av8Var4.S) {
            av8Var4.l(zg3Var);
        } else {
            av8Var4.q0();
        }
        f50 f50Var = hf3.g;
        waa.K(av8Var4, c, f50Var);
        ff3 ff3Var = hf3.f;
        waa.K(av8Var4, m, ff3Var);
        Integer valueOf = Integer.valueOf(hashCode);
        f50 f50Var2 = hf3.j;
        waa.K(av8Var4, valueOf, f50Var2);
        ry ryVar = hf3.k;
        waa.J(av8Var4, ryVar);
        f50 f50Var3 = hf3.d;
        waa.K(av8Var4, C, f50Var3);
        yy6 yy6Var = fantasyRoundPlayerUiModel.c;
        boolean z6 = fantasyRoundPlayerUiModel.m;
        String str = fantasyRoundPlayerUiModel.j;
        FantasyPlayerMissingData fantasyPlayerMissingData2 = fantasyRoundPlayerUiModel.l;
        Boolean valueOf2 = yy6Var != null ? Boolean.valueOf(yy6Var.b) : null;
        Boolean bool = Boolean.TRUE;
        int i3 = Intrinsics.c(valueOf2, bool) ? -1 : fantasyRoundPlayerUiModel.a;
        yy6 yy6Var2 = fantasyRoundPlayerUiModel.c;
        wnn.l(i3, Intrinsics.c(yy6Var2 != null ? Boolean.valueOf(yy6Var2.b) : null, bool) ? -1 : fantasyRoundPlayerUiModel.h, this.o, bkh.l(utcVar2, 40.0f), null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, false, null, av8Var4, 3072, 240);
        mv1 mv1Var = uxf.g;
        xtc a = n12.a.a(n9e.q(bkh.l(utcVar2, 16.0f), lz.D(R.color.n_lv_1, av8Var4), n7gVar), uxf.k);
        k1c c2 = e12.c(mv1Var, false);
        int hashCode2 = Long.hashCode(av8Var4.T);
        aee m2 = av8Var4.m();
        xtc C2 = fqj.C(av8Var4, a);
        av8Var4.h0();
        if (av8Var4.S) {
            av8Var4.l(zg3Var);
        } else {
            av8Var4.q0();
        }
        waa.K(av8Var4, c2, f50Var);
        waa.K(av8Var4, m2, ff3Var);
        bf3.s(hashCode2, av8Var4, f50Var2, av8Var4, ryVar);
        waa.K(av8Var4, C2, f50Var3);
        String str2 = fantasyRoundPlayerUiModel.b.b;
        yf8 yf8Var = xth.a;
        fqj.a(str2, xth.c(), lz.D(R.color.surface_1, av8Var4), null, null, av8Var4, 0, 24);
        av8Var4.s(true);
        av8Var4.s(true);
        boolean g2 = av8Var4.g(f5) | av8Var4.g(d);
        Object O5 = av8Var4.O();
        if (g2) {
            a99Var = a99Var3;
        } else {
            a99Var = a99Var3;
        }
        O5 = new id3(f5, d, 3);
        av8Var4.n0(O5);
        xtc b2 = am3.b(utcVar2, f6, (Function1) O5);
        u23 a2 = t23.a(ww9.d, uxf.o, av8Var4, 0);
        int hashCode3 = Long.hashCode(av8Var4.T);
        aee m3 = av8Var4.m();
        xtc C3 = fqj.C(av8Var4, b2);
        av8Var4.h0();
        if (av8Var4.S) {
            av8Var4.l(zg3Var);
        } else {
            av8Var4.q0();
        }
        waa.K(av8Var4, a2, f50Var);
        waa.K(av8Var4, m3, ff3Var);
        bf3.s(hashCode3, av8Var4, f50Var2, av8Var4, ryVar);
        waa.K(av8Var4, C3, f50Var3);
        lv1 lv1Var = uxf.m;
        l8g a3 = k8g.a(ww9.b, lv1Var, av8Var4, 48);
        int hashCode4 = Long.hashCode(av8Var4.T);
        aee m4 = av8Var4.m();
        xtc C4 = fqj.C(av8Var4, utcVar2);
        av8Var4.h0();
        if (av8Var4.S) {
            av8Var4.l(zg3Var);
        } else {
            av8Var4.q0();
        }
        waa.K(av8Var4, a3, f50Var);
        waa.K(av8Var4, m4, ff3Var);
        bf3.s(hashCode4, av8Var4, f50Var2, av8Var4, ryVar);
        waa.K(av8Var4, C4, f50Var3);
        FantasyPlayerUiModel fantasyPlayerUiModel = fantasyRoundPlayerUiModel.g;
        String str3 = fantasyPlayerUiModel.g;
        if (str3 == null) {
            str3 = fantasyPlayerUiModel.f;
        }
        a99 a99Var4 = a99Var;
        mha.b(str3, xth.l(), null, 0, lz.D(R.color.n_lv_1, av8Var4), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0, 0L, 0L, av8Var4, 196608);
        av8 av8Var5 = av8Var4;
        if (fantasyRoundPlayerUiModel.w) {
            ljg.r(2.0f, -459944104, av8Var5, av8Var5, utcVar2);
            z = true;
            f = 16.0f;
            h5a.l(null, 16.0f, av8Var5, 48, 1);
            av8Var5.s(false);
        } else {
            z = true;
            f = 16.0f;
            av8Var5.d0(-459813408);
            av8Var5.s(false);
        }
        av8Var5.s(z);
        boolean z7 = this.o && str != null;
        q67 q67Var2 = this.p;
        if (z6 || fantasyPlayerMissingData2 != null || q67Var2.c || z7) {
            av8Var5.d0(2110730206);
            xtc f0 = l98.f0(utcVar2, 2.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 14);
            boolean z8 = z7;
            l8g a4 = k8g.a(new ng0(4.0f, true, new a70(6)), lv1Var, av8Var5, 54);
            int hashCode5 = Long.hashCode(av8Var5.T);
            aee m5 = av8Var5.m();
            xtc C5 = fqj.C(av8Var5, f0);
            av8Var5.h0();
            if (av8Var5.S) {
                av8Var5.l(zg3Var);
            } else {
                av8Var5.q0();
            }
            waa.K(av8Var5, a4, f50Var);
            waa.K(av8Var5, m5, ff3Var);
            bf3.s(hashCode5, av8Var5, f50Var2, av8Var5, ryVar);
            waa.K(av8Var5, C5, f50Var3);
            if (z8) {
                av8Var5.d0(1138795359);
                q67Var = q67Var2;
                m67Var = this;
                utcVar = utcVar2;
                f2 = f;
                i = 6;
                fantasyPlayerMissingData = fantasyPlayerMissingData2;
                udj.c(str == null ? "" : str, null, lz.D(R.color.n_lv_3, av8Var5), null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, xth.b(), av8Var5, 0, 24960, 110586);
                av8Var5 = av8Var5;
                av8Var5.s(false);
            } else {
                m67Var = this;
                f2 = f;
                q67Var = q67Var2;
                i = 6;
                utcVar = utcVar2;
                fantasyPlayerMissingData = fantasyPlayerMissingData2;
                av8Var5.d0(1139120859);
                av8Var5.s(false);
            }
            if (z6) {
                av8Var5.d0(1139201366);
                kq9.b(s6a.N(R.drawable.ic_captain, i, av8Var5), null, bkh.l(utcVar, f2), r13.i, av8Var5, V2.b.f, 0);
                av8Var5.s(false);
            } else if (q67Var.c) {
                av8Var5.d0(1139638125);
                kq9.b(s6a.N(R.drawable.ic_matches, i, av8Var5), null, bkh.l(utcVar, f2), lz.D(R.color.secondary_default, av8Var5), av8Var5, 432, 0);
                av8Var5.s(false);
            } else {
                av8Var5.d0(1139950171);
                av8Var5.s(false);
            }
            if (fantasyPlayerMissingData != null) {
                av8Var5.d0(1140039730);
                kq9.b(s6a.N(R.drawable.ic_warning, i, av8Var5), null, bkh.l(utcVar, f2), lz.D(fantasyPlayerMissingData.a.b, av8Var5), av8Var5, 432, 0);
                av8Var = av8Var5;
                z2 = false;
                av8Var.s(false);
            } else {
                av8Var = av8Var5;
                z2 = false;
                av8Var.d0(1140377723);
                av8Var.s(false);
            }
            z3 = true;
            av8Var.s(true);
            av8Var.s(z2);
        } else {
            av8Var5.d0(2112587292);
            av8Var5.s(false);
            utcVar = utcVar2;
            m67Var = this;
            av8Var = av8Var5;
            i = 6;
            z3 = true;
        }
        av8Var.s(z3);
        if (((Boolean) m67Var.q.getValue()).booleanValue()) {
            av8Var.d0(-303890502);
            xtc p = n9e.p(bkh.p(mha.G(utcVar, 1.0f), 4.0f), wxf.s(b.j(new r13(r13.c(lz.D(R.color.n_lv_4, av8Var), 0.1f)), new r13(r13.h)), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 14), null, i);
            xl3Var = d;
            boolean g3 = av8Var.g(xl3Var);
            Object O6 = av8Var.O();
            if (g3) {
                a99Var2 = a99Var4;
            } else {
                a99Var2 = a99Var4;
            }
            O6 = new qw6(xl3Var, 5);
            av8Var.n0(O6);
            z4 = false;
            e12.a(0, av8Var, am3.b(p, f8, (Function1) O6));
            av8Var.s(false);
        } else {
            xl3Var = d;
            a99Var2 = a99Var4;
            z4 = false;
            av8Var.d0(-303171674);
            av8Var.s(false);
        }
        utc utcVar3 = utcVar;
        tol.b(nyd.a.a(null), yqo.H(-20474404, av8Var, new n67(am3Var, m67Var.r, m67Var.s, f7, xl3Var, m67Var.t, m67Var.u, m67Var.v, m67Var.m, m67Var.w, m67Var.x, m67Var.p, m67Var.y)), av8Var, 56);
        if (m67Var.l) {
            av8Var2 = av8Var;
            av8Var2.d0(-300076634);
            av8Var2.s(false);
        } else {
            av8Var.d0(-300305352);
            Object O7 = av8Var.O();
            if (O7 == a99Var2) {
                O7 = rg2.h;
                av8Var.n0(O7);
            }
            av8 av8Var6 = av8Var;
            tz9.d(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0, 14, 0L, 0L, av8Var6, am3.b(utcVar3, f9, (Function1) O7));
            av8Var2 = av8Var6;
            av8Var2.s(false);
        }
        if (fantasyRoundPlayerUiModel.e) {
            av8Var2.d0(-300027158);
            xtc q = n9e.q(utcVar3, r13.c(lz.D(R.color.surface_1, av8Var2), 0.5f), oyn.e);
            boolean g4 = av8Var2.g(f4);
            Object O8 = av8Var2.O();
            if (g4 || O8 == a99Var2) {
                O8 = new pw6(f4, 3);
                av8Var2.n0(O8);
            }
            z5 = false;
            e12.a(0, av8Var2, am3.b(q, f3, (Function1) O8));
            av8Var2.s(false);
        } else {
            z5 = false;
            av8Var2.d0(-299508218);
            av8Var2.s(false);
        }
        av8Var2.s(z5);
        if (am3Var.b != i2) {
            hz8.t(m67Var.k, av8Var2);
        }
        return Unit.a;
    }
}
