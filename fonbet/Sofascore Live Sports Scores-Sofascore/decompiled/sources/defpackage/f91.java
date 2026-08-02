package defpackage;

import android.content.Context;
import androidx.compose.runtime.e;
import androidx.compose.ui.graphics.vector.ImageVector;
import com.sofascore.results.R;
import com.unity3d.services.UnityAdsConstants;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class f91 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Function0 b;

    public /* synthetic */ f91(int i, int i2, Function0 function0) {
        this.a = i2;
        this.b = function0;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        utc utcVar = utc.a;
        a99 a99Var = nf3.a;
        int i2 = 2;
        Function0 function0 = this.b;
        switch (i) {
            case 0:
                of3 of3Var = (of3) obj;
                int intValue = ((Integer) obj2).intValue();
                av8 av8Var = (av8) of3Var;
                if (av8Var.T(intValue & 1, (intValue & 3) != 2)) {
                    x2a.d(oea.v(R.string.baseball_game_away_team_first_info, av8Var), l98.c0(utcVar, 8.0f, 4.0f), null, lz.D(R.color.surface_2, av8Var), lz.D(R.color.surface_1, av8Var), lz.D(R.color.primary_default, av8Var), null, yqo.H(700508333, av8Var, new f91(i2, function0)), null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, av8Var, 12582960, 0, 1860);
                } else {
                    av8Var.W();
                }
                break;
            case 1:
                ((Integer) obj2).getClass();
                lz.b(function0, (of3) obj, aba.K(1));
                break;
            case 2:
                of3 of3Var2 = (of3) obj;
                int intValue2 = ((Integer) obj2).intValue();
                av8 av8Var2 = (av8) of3Var2;
                if (av8Var2.T(intValue2 & 1, (intValue2 & 3) != 2)) {
                    ImageVector N = s6a.N(R.drawable.ic_close, 6, av8Var2);
                    long D = lz.D(R.color.surface_2, av8Var2);
                    xtc l = bkh.l(utcVar, 24.0f);
                    long D2 = lz.D(R.color.n_lv_4, av8Var2);
                    Object O = av8Var2.O();
                    if (O == a99Var) {
                        O = mz1.e(av8Var2);
                    }
                    wzc wzcVar = (wzc) O;
                    Object[] objArr = new Object[0];
                    Object O2 = av8Var2.O();
                    if (O2 == a99Var) {
                        O2 = fi.h;
                        av8Var2.n0(O2);
                    }
                    kq9.b(N, null, tol.y(l, true, true, true, D2, wzcVar, new gm(function0, (boh) o3a.N(objArr, (Function0) O2, av8Var2, 48), 1), av8Var2, 0), D, av8Var2, 48, 0);
                } else {
                    av8Var2.W();
                }
                break;
            case 3:
                of3 of3Var3 = (of3) obj;
                int intValue3 = ((Integer) obj2).intValue();
                av8 av8Var3 = (av8) of3Var3;
                if (av8Var3.T(intValue3 & 1, (intValue3 & 3) != 2)) {
                    String v = oea.v(R.string.see_all, av8Var3);
                    yf8 yf8Var = xth.a;
                    ktm.c(v, xth.k(), this.b, null, null, 0L, 0L, av8Var3, 0, 120);
                } else {
                    av8Var3.W();
                }
                break;
            case 4:
                of3 of3Var4 = (of3) obj;
                int intValue4 = ((Integer) obj2).intValue();
                av8 av8Var4 = (av8) of3Var4;
                if (av8Var4.T(intValue4 & 1, (intValue4 & 3) != 2)) {
                    String v2 = oea.v(R.string.see_all, av8Var4);
                    yf8 yf8Var2 = xth.a;
                    ktm.c(v2, xth.k(), this.b, null, null, 0L, 0L, av8Var4, 0, 120);
                } else {
                    av8Var4.W();
                }
                break;
            case 5:
                ((Integer) obj2).getClass();
                s02.v(function0, (of3) obj, aba.K(1));
                break;
            case 6:
                of3 of3Var5 = (of3) obj;
                int intValue5 = ((Integer) obj2).intValue();
                av8 av8Var5 = (av8) of3Var5;
                if (av8Var5.T(intValue5 & 1, (intValue5 & 3) != 2)) {
                    xtc z = bkh.g(l98.f0(utc.a, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13), 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2).z(new we9(uxf.p));
                    p72 p72Var = new p72(r13.h, lz.D(R.color.surface_1, av8Var5), lz.D(R.color.primary_default, av8Var5), lz.D(R.color.surface_1, av8Var5));
                    Object O3 = av8Var5.O();
                    if (O3 == a99Var) {
                        O3 = e.d(0L);
                        av8Var5.n0(O3);
                    }
                    iz8.e(new p28((boh) O3, function0, 4), z, false, null, p72Var, null, null, null, null, yqo.c, av8Var5, 805306368, 492);
                } else {
                    av8Var5.W();
                }
                break;
            case 7:
                of3 of3Var6 = (of3) obj;
                int intValue6 = ((Integer) obj2).intValue();
                av8 av8Var6 = (av8) of3Var6;
                if (av8Var6.T(intValue6 & 1, (intValue6 & 3) != 2)) {
                    Context context = (Context) av8Var6.k(nz.b);
                    long D3 = lz.D(R.color.surface_P, av8Var6);
                    un0.a(l98.c0(n9e.q(wnn.A(l98.d0(utcVar, 24.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2), o7g.a(16.0f)), lz.D(R.color.surface_P, av8Var6), oyn.e), 16.0f, 24.0f), null, new ek2(D3, D3, D3, D3), null, null, yqo.H(1254033681, av8Var6, new qm4(28, context, function0)), av8Var6, 196608, 26);
                } else {
                    av8Var6.W();
                }
                break;
            case 8:
                ((Integer) obj2).getClass();
                sea.a(function0, (of3) obj, aba.K(1));
                break;
            case 9:
                ((Integer) obj2).getClass();
                ehd.d(function0, (of3) obj, aba.K(1));
                break;
            case 10:
                ((Integer) obj2).getClass();
                cga.l(function0, (of3) obj, aba.K(1));
                break;
            case 11:
                of3 of3Var7 = (of3) obj;
                int intValue7 = ((Integer) obj2).intValue();
                av8 av8Var7 = (av8) of3Var7;
                if (av8Var7.T(intValue7 & 1, (intValue7 & 3) != 2)) {
                    xtc l2 = bkh.l(l98.f0(utc.a, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 4.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13), 16.0f);
                    long D4 = lz.D(R.color.n_lv_4, av8Var7);
                    Object O4 = av8Var7.O();
                    if (O4 == a99Var) {
                        O4 = mz1.e(av8Var7);
                    }
                    wzc wzcVar2 = (wzc) O4;
                    Object[] objArr2 = new Object[0];
                    Object O5 = av8Var7.O();
                    if (O5 == a99Var) {
                        O5 = nuh.x;
                        av8Var7.n0(O5);
                    }
                    kq9.b(s6a.N(R.drawable.ic_close, 6, av8Var7), null, tol.y(l2, true, true, true, D4, wzcVar2, new cyg((boh) o3a.N(objArr2, (Function0) O5, av8Var7, 48), function0, 19), av8Var7, 0), lz.D(R.color.n_lv_1, av8Var7), av8Var7, 48, 0);
                } else {
                    av8Var7.W();
                }
                break;
            case 12:
                ((Integer) obj2).getClass();
                u0a.a(function0, (of3) obj, aba.K(1));
                break;
            default:
                ((Integer) obj2).getClass();
                vha.g(function0, (of3) obj, aba.K(1));
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ f91(int i, Function0 function0) {
        this.a = i;
        this.b = function0;
    }
}
