package defpackage;

import com.sofascore.results.R;
import com.unity3d.services.UnityAdsConstants;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.text.b;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class iza extends xka implements Function2 {
    public final /* synthetic */ e1d i;
    public final /* synthetic */ am3 j;
    public final /* synthetic */ Function0 k;
    public final /* synthetic */ boolean l;
    public final /* synthetic */ qug m;
    public final /* synthetic */ kza n;
    public final /* synthetic */ List o;
    public final /* synthetic */ sza p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iza(e1d e1dVar, am3 am3Var, Function0 function0, boolean z, qug qugVar, kza kzaVar, List list, sza szaVar) {
        super(2);
        this.i = e1dVar;
        this.j = am3Var;
        this.k = function0;
        this.l = z;
        this.m = qugVar;
        this.n = kzaVar;
        this.o = list;
        this.p = szaVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        n12 n12Var;
        mv1 mv1Var;
        char c;
        long f;
        of3 of3Var = (of3) obj;
        int intValue = ((Number) obj2).intValue();
        mv1 mv1Var2 = uxf.c;
        if ((intValue & 3) == 2) {
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
        av8Var2.d0(-1261121315);
        am3 am3Var2 = (am3) am3Var.g().b;
        ll3 f2 = am3Var2.f();
        ll3 f3 = am3Var2.f();
        if (this.l) {
            am3.e(am3Var, new yna[]{f3, f2});
        } else {
            am3.e(am3Var, new yna[]{f2, f3});
        }
        utc utcVar = utc.a;
        xtc f0 = l98.f0(utcVar, 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 14);
        Object O = av8Var2.O();
        a99 a99Var = nf3.a;
        if (O == a99Var) {
            O = rg2.m;
            av8Var2.n0(O);
        }
        xtc b = am3.b(f0, f2, (Function1) O);
        lv1 lv1Var = uxf.m;
        wxf wxfVar = ww9.b;
        l8g a = k8g.a(wxfVar, lv1Var, av8Var2, 48);
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
        k1c c2 = e12.c(mv1Var2, false);
        int hashCode2 = Long.hashCode(av8Var2.T);
        aee m2 = av8Var2.m();
        xtc C2 = fqj.C(av8Var2, utcVar);
        av8Var2.h0();
        if (av8Var2.S) {
            av8Var2.l(zg3Var);
        } else {
            av8Var2.q0();
        }
        waa.K(av8Var2, c2, f50Var);
        waa.K(av8Var2, m2, ff3Var);
        bf3.s(hashCode2, av8Var2, f50Var2, av8Var2, ryVar);
        waa.K(av8Var2, C2, f50Var3);
        kza kzaVar = this.n;
        mv1 mv1Var3 = mv1Var2;
        td4.C(kzaVar.a, bkh.l(utcVar, 40.0f), 0L, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, av8Var2, 48, 12);
        int i2 = kzaVar.b;
        xtc l = bkh.l(utcVar, 16.0f);
        mv1 mv1Var4 = uxf.i;
        n12 n12Var2 = n12.a;
        td4.G(i2, n12Var2.a(l, mv1Var4), false, 0L, av8Var2, 0, 12);
        av8Var2.s(true);
        String str = kzaVar.d;
        yf8 yf8Var = xth.a;
        n12 n12Var3 = n12Var2;
        kza kzaVar2 = kzaVar;
        q5a.w(str, l98.d0(utcVar, 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2), lz.D(R.color.n_lv_1, av8Var2), null, 0L, 0L, null, 0L, 2, false, 1, 0, xth.m(), av8Var2, 48, 24960, 110584);
        av8 av8Var3 = av8Var2;
        av8Var3.s(true);
        xtc Z = hkg.Z(utcVar, this.m, false, 14);
        Object O2 = av8Var3.O();
        if (O2 == a99Var) {
            O2 = rg2.n;
            av8Var3.n0(O2);
        }
        xtc b2 = am3.b(Z, f3, (Function1) O2);
        l8g a2 = k8g.a(wxfVar, lv1Var, av8Var3, 48);
        int hashCode3 = Long.hashCode(av8Var3.T);
        aee m3 = av8Var3.m();
        xtc C3 = fqj.C(av8Var3, b2);
        av8Var3.h0();
        if (av8Var3.S) {
            av8Var3.l(zg3Var);
        } else {
            av8Var3.q0();
        }
        waa.K(av8Var3, a2, f50Var);
        waa.K(av8Var3, m3, ff3Var);
        bf3.s(hashCode3, av8Var3, f50Var2, av8Var3, ryVar);
        waa.K(av8Var3, C3, f50Var3);
        av8Var3.d0(1444503237);
        for (sza szaVar : this.o) {
            kza kzaVar3 = kzaVar2;
            String str2 = (String) kzaVar3.f.get(szaVar);
            if (str2 == null) {
                str2 = "00";
            }
            String str3 = str2;
            if (szaVar == sza.h) {
                av8Var3.d0(242060771);
                xtc p = bkh.p(utcVar, 32.0f);
                mv1Var = mv1Var3;
                k1c c3 = e12.c(mv1Var, false);
                int hashCode4 = Long.hashCode(av8Var3.T);
                aee m4 = av8Var3.m();
                xtc C4 = fqj.C(av8Var3, p);
                if3.k7.getClass();
                zg3 zg3Var2 = hf3.b;
                av8Var3.h0();
                if (av8Var3.S) {
                    av8Var3.l(zg3Var2);
                } else {
                    av8Var3.q0();
                }
                waa.K(av8Var3, c3, hf3.g);
                waa.K(av8Var3, m4, hf3.f);
                waa.K(av8Var3, Integer.valueOf(hashCode4), hf3.j);
                waa.J(av8Var3, hf3.k);
                waa.K(av8Var3, C4, hf3.d);
                n12 n12Var4 = n12Var3;
                av8 av8Var4 = av8Var3;
                n12Var = n12Var4;
                i9a.j(b.f(str3), false, false, n12Var4.a(bkh.l(utcVar, 24.0f), uxf.g), false, false, null, av8Var4, 432, 112);
                av8Var3 = av8Var4;
                av8Var3.s(true);
                av8Var3.s(false);
            } else {
                n12Var = n12Var3;
                mv1Var = mv1Var3;
                av8Var3.d0(242580765);
                xtc p2 = bkh.p(utcVar, 32.0f);
                yf8 yf8Var2 = xth.a;
                dfj e = xth.e();
                if (szaVar == this.p) {
                    f = ljg.f(av8Var3, -961999072, R.color.primary_default, av8Var3, false);
                    c = 1392;
                } else {
                    c = 1392;
                    f = ljg.f(av8Var3, -961998282, R.color.n_lv_1, av8Var3, false);
                }
                av8 av8Var5 = av8Var3;
                q5a.w(str3, p2, f, null, 0L, 0L, new p7j(3), 0L, 2, false, 1, 0, e, av8Var5, 48, 24960, 109560);
                av8Var3 = av8Var5;
                av8Var3.s(false);
            }
            kzaVar2 = kzaVar3;
            mv1Var3 = mv1Var;
            n12Var3 = n12Var;
        }
        ljg.t(av8Var3, false, true, false);
        if (am3Var.b != i) {
            hz8.t(this.k, av8Var3);
        }
        return Unit.a;
    }
}
