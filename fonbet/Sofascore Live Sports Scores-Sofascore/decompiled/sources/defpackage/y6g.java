package defpackage;

import android.content.Context;
import com.sofascore.model.odds.FeaturedOddsWithProvider;
import com.sofascore.results.R;
import com.sofascore.results.widget.NavigateLeftOrRight;
import com.unity3d.services.UnityAdsConstants;
import java.util.Arrays;
import kotlin.Unit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class y6g implements ct8 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ Object e;

    public /* synthetic */ y6g(c3f c3fVar, boolean z, boolean z2, boolean z3) {
        this.e = c3fVar;
        this.b = z;
        this.c = z2;
        this.d = z3;
    }

    @Override // defpackage.ct8
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        Object obj4 = this.e;
        switch (i) {
            case 0:
                c3f c3fVar = (c3f) obj4;
                of3 of3Var = (of3) obj2;
                int intValue = ((Integer) obj3).intValue();
                ((v23) obj).getClass();
                av8 av8Var = (av8) of3Var;
                if (av8Var.T(intValue & 1, (intValue & 17) != 16)) {
                    utc utcVar = utc.a;
                    xtc z = l98.f0(utcVar, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13).z(bkh.c);
                    u23 a = t23.a(ww9.f, uxf.o, av8Var, 6);
                    int hashCode = Long.hashCode(av8Var.T);
                    aee m = av8Var.m();
                    xtc C = fqj.C(av8Var, z);
                    if3.k7.getClass();
                    zg3 zg3Var = hf3.b;
                    av8Var.h0();
                    if (av8Var.S) {
                        av8Var.l(zg3Var);
                    } else {
                        av8Var.q0();
                    }
                    waa.K(av8Var, a, hf3.g);
                    waa.K(av8Var, m, hf3.f);
                    waa.K(av8Var, Integer.valueOf(hashCode), hf3.j);
                    waa.J(av8Var, hf3.k);
                    waa.K(av8Var, C, hf3.d);
                    String str = c3fVar.j;
                    FeaturedOddsWithProvider featuredOddsWithProvider = c3fVar.m;
                    bx7 bx7Var = c3fVar.h;
                    String str2 = bx7Var.j;
                    Long l = bx7Var.l;
                    long longValue = l != null ? l.longValue() : 0L;
                    String str3 = bx7Var.k;
                    if (str3 == null) {
                        str3 = "";
                    }
                    gz8.d(str, str2, longValue, str3, c3fVar.k, c3fVar.l, false, av8Var, 1572864);
                    if (c3fVar.o) {
                        av8Var.d0(1210417266);
                        jaa.k(0, av8Var);
                        av8Var.s(false);
                    } else {
                        av8Var.d0(1210473965);
                        av8Var.s(false);
                    }
                    if (featuredOddsWithProvider != null) {
                        av8Var.d0(1210573134);
                        xtc b0 = l98.b0(utcVar, 8.0f);
                        int i2 = bx7Var.a;
                        String str4 = bx7Var.j;
                        String str5 = str4 == null ? "" : str4;
                        String str6 = c3fVar.j;
                        ff5 ff5Var = nz.b;
                        String n = rld.n((Context) av8Var.k(ff5Var), featuredOddsWithProvider.getFeaturedOdds().getMarketName(), bx7Var.f);
                        ded.a(i2, str5, str6, n == null ? "" : n, rld.f((Context) av8Var.k(ff5Var), false), this.b, this.c, this.d, c3fVar.m, b0, av8Var, 819658752);
                        av8Var = av8Var;
                        av8Var.s(false);
                    } else {
                        av8Var.d0(1211354861);
                        av8Var.s(false);
                    }
                    av8Var.s(true);
                } else {
                    av8Var.W();
                }
                break;
            default:
                Context context = (Context) obj4;
                of3 of3Var2 = (of3) obj2;
                ((Integer) obj3).getClass();
                ((o8g) obj).getClass();
                int i3 = this.b ? R.color.primary_default : R.color.widget_icons;
                int i4 = this.c ? R.color.primary_default : R.color.widget_icons;
                ty8 ty8Var = ty8.a;
                vy8 O = h5a.O(nq8.y(ty8Var), 8.0f, 2);
                kc kcVar = ok3.k;
                vy8 x = j72.x(O, new x9g(NavigateLeftOrRight.class, zm2.A((lc[]) Arrays.copyOf(new lc[]{new lc(kcVar, -1)}, 1))));
                boolean z2 = this.d;
                nq8.g(x, 0, 1, yqo.H(-437278540, of3Var2, new duh(i3, z2, context)), of3Var2, 3072, 2);
                aba.i(o8g.a(), of3Var2, 0);
                nq8.g(j72.x(h5a.O(nq8.y(ty8Var), 8.0f, 2), new x9g(NavigateLeftOrRight.class, zm2.A((lc[]) Arrays.copyOf(new lc[]{new lc(kcVar, 1)}, 1)))), 0, 1, yqo.H(267770987, of3Var2, new duh(z2, context, i4)), of3Var2, 3072, 2);
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ y6g(boolean z, boolean z2, boolean z3, Context context) {
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = context;
    }
}
