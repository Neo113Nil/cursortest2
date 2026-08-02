package defpackage;

import android.os.Build;
import com.sofascore.results.R;
import com.unity3d.services.UnityAdsConstants;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class aae implements Function2 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ j6c b;
    public final /* synthetic */ Function0 c;

    public /* synthetic */ aae(j6c j6cVar, Function0 function0, int i) {
        this.b = j6cVar;
        this.c = function0;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        a99 a99Var;
        f50 f50Var;
        int i = this.a;
        Function0 function0 = this.c;
        j6c j6cVar = this.b;
        switch (i) {
            case 0:
                of3 of3Var = (of3) obj;
                int intValue = ((Integer) obj2).intValue();
                av8 av8Var = (av8) of3Var;
                if (av8Var.T(intValue & 1, (intValue & 3) != 2)) {
                    utc utcVar = utc.a;
                    xtc d = bkh.d(utcVar, 1.0f);
                    k1c c = e12.c(uxf.c, false);
                    int hashCode = Long.hashCode(av8Var.T);
                    aee m = av8Var.m();
                    xtc C = fqj.C(av8Var, d);
                    if3.k7.getClass();
                    zg3 zg3Var = hf3.b;
                    av8Var.h0();
                    if (av8Var.S) {
                        av8Var.l(zg3Var);
                    } else {
                        av8Var.q0();
                    }
                    f50 f50Var2 = hf3.g;
                    waa.K(av8Var, c, f50Var2);
                    ff3 ff3Var = hf3.f;
                    waa.K(av8Var, m, ff3Var);
                    Integer valueOf = Integer.valueOf(hashCode);
                    f50 f50Var3 = hf3.j;
                    waa.K(av8Var, valueOf, f50Var3);
                    ry ryVar = hf3.k;
                    waa.J(av8Var, ryVar);
                    f50 f50Var4 = hf3.d;
                    waa.K(av8Var, C, f50Var4);
                    n12 n12Var = n12.a;
                    wnn.o(n12Var.b(utcVar), false, 0L, true, true, av8Var, 27696, 4);
                    av8 av8Var2 = av8Var;
                    u23 a = t23.a(ww9.d, uxf.o, av8Var2, 0);
                    int hashCode2 = Long.hashCode(av8Var2.T);
                    aee m2 = av8Var2.m();
                    xtc C2 = fqj.C(av8Var2, utcVar);
                    av8Var2.h0();
                    if (av8Var2.S) {
                        av8Var2.l(zg3Var);
                    } else {
                        av8Var2.q0();
                    }
                    waa.K(av8Var2, a, f50Var2);
                    waa.K(av8Var2, m2, ff3Var);
                    bf3.s(hashCode2, av8Var2, f50Var3, av8Var2, ryVar);
                    waa.K(av8Var2, C2, f50Var4);
                    cae.b(j6cVar, av8Var2, 0);
                    int i2 = Build.VERSION.SDK_INT;
                    a99 a99Var2 = nf3.a;
                    if (i2 >= 31) {
                        av8Var2.d0(-1819678762);
                        cae.a(j6cVar, av8Var2, 0);
                        av8Var2.s(false);
                        f50Var = f50Var4;
                        a99Var = a99Var2;
                    } else {
                        av8Var2.d0(-1819583809);
                        xtc d2 = bkh.d(utcVar, 1.0f);
                        boolean g = av8Var2.g(j6cVar);
                        Object O = av8Var2.O();
                        if (g || O == a99Var2) {
                            O = new mnc(j6cVar, 26);
                            av8Var2.n0(O);
                        }
                        a99Var = a99Var2;
                        f50Var = f50Var4;
                        td4.a((Function1) O, d2, null, av8Var2, 48, 4);
                        av8Var2 = av8Var2;
                        av8Var2.s(false);
                    }
                    av8Var2.s(true);
                    xtc e0 = l98.e0(n9e.q(wnn.A(l98.f0(n12Var.a(utcVar, uxf.j), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 32.0f, 7), o7g.a(32.0f)), lz.D(R.color.on_color_primary, av8Var2), oyn.e), 16.0f, 8.0f, 12.0f, 8.0f);
                    l8g a2 = k8g.a(ww9.b, uxf.m, av8Var2, 48);
                    int hashCode3 = Long.hashCode(av8Var2.T);
                    aee m3 = av8Var2.m();
                    xtc C3 = fqj.C(av8Var2, e0);
                    av8Var2.h0();
                    if (av8Var2.S) {
                        av8Var2.l(zg3Var);
                    } else {
                        av8Var2.q0();
                    }
                    waa.K(av8Var2, a2, f50Var2);
                    waa.K(av8Var2, m3, ff3Var);
                    bf3.s(hashCode3, av8Var2, f50Var3, av8Var2, ryVar);
                    waa.K(av8Var2, C3, f50Var);
                    String upperCase = oea.v(R.string.feed_football_see_full_lineups_button, av8Var2).toUpperCase(Locale.ROOT);
                    upperCase.getClass();
                    yf8 yf8Var = xth.a;
                    av8 av8Var3 = av8Var2;
                    udj.c(upperCase, null, 0L, null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.a(), av8Var3, 0, 0, 131070);
                    kq9.b(s6a.N(R.drawable.ic_chevron_right_large_16, 6, av8Var3), null, bkh.l(l98.f0(utcVar, 4.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 14), 16.0f), 0L, av8Var3, 432, 8);
                    av8Var3.s(true);
                    xtc b = n12Var.b(utcVar);
                    boolean g2 = av8Var3.g(function0);
                    Object O2 = av8Var3.O();
                    if (g2 || O2 == a99Var) {
                        O2 = new rsd(1, function0);
                        av8Var3.n0(O2);
                    }
                    e12.a(0, av8Var3, tol.y(b, false, false, false, 0L, null, (Function0) O2, av8Var3, 27));
                    av8Var3.s(true);
                } else {
                    av8Var.W();
                }
                break;
            default:
                ((Integer) obj2).getClass();
                cae.c(j6cVar, function0, (of3) obj, aba.K(1));
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ aae(Function0 function0, j6c j6cVar) {
        this.c = function0;
        this.b = j6cVar;
    }
}
