package defpackage;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.sofascore.results.R;
import com.sofascore.results.dialog.TopStatsCategoryBottomSheet;
import com.sofascore.results.league.fragment.topStats.TopStatsCategory;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class w54 implements ct8 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ w54(asf asfVar, ArrayList arrayList, int i) {
        this.a = 3;
        this.c = asfVar;
        this.d = arrayList;
        this.b = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ct8
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i;
        int i2 = this.a;
        float f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        int i3 = R.color.n_lv_1;
        utc utcVar = utc.a;
        int i4 = this.b;
        char c = 1;
        Object obj4 = this.d;
        Object obj5 = this.c;
        switch (i2) {
            case 0:
                Function0 function0 = (Function0) obj5;
                e1d e1dVar = (e1d) obj4;
                of3 of3Var = (of3) obj2;
                int intValue = ((Integer) obj3).intValue();
                ((v23) obj).getClass();
                av8 av8Var = (av8) of3Var;
                if (av8Var.T(intValue & 1, (intValue & 17) != 16)) {
                    ff5 ff5Var = qgb.a;
                    FragmentActivity O = hkg.O((Context) av8Var.k(nz.b));
                    O.getClass();
                    tol.b(ff5Var.a(new uv(O)), yqo.H(1643337710, av8Var, new lj(i4, e1dVar, function0)), av8Var, 56);
                } else {
                    av8Var.W();
                }
                break;
            case 1:
                gs6 gs6Var = (gs6) obj5;
                Context context = (Context) obj4;
                xpa xpaVar = (xpa) obj;
                of3 of3Var2 = (of3) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                xpaVar.getClass();
                if ((intValue2 & 6) == 0) {
                    intValue2 |= ((av8) of3Var2).g(xpaVar) ? 4 : 2;
                }
                av8 av8Var2 = (av8) of3Var2;
                if (av8Var2.T(intValue2 & 1, (intValue2 & 19) != 18)) {
                    do7 do7Var = gs6Var.b;
                    Integer num = do7Var.l;
                    mj7 mj7Var = do7Var.c.i;
                    String B = f5p.B(context, mj7Var.c, mj7Var.b);
                    do7 do7Var2 = gs6Var.b;
                    xw3.f(num, this.b, B, do7Var2.e, do7Var2.d, do7Var2.c.f, xpa.a(xpaVar, utcVar, 7), av8Var2, 0);
                } else {
                    av8Var2.W();
                }
                break;
            case 2:
                Function0 function02 = (Function0) obj5;
                Function0 function03 = (Function0) obj4;
                of3 of3Var3 = (of3) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                ((v23) obj).getClass();
                av8 av8Var3 = (av8) of3Var3;
                if (av8Var3.T(intValue3 & 1, (intValue3 & 17) != 16)) {
                    kv1 kv1Var = uxf.p;
                    xtc f0 = l98.f0(l98.d0(bkh.d(utcVar, 1.0f), 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 16.0f, 7);
                    u23 a = t23.a(ww9.d, kv1Var, av8Var3, 48);
                    int hashCode = Long.hashCode(av8Var3.T);
                    aee m = av8Var3.m();
                    xtc C = fqj.C(av8Var3, f0);
                    if3.k7.getClass();
                    zg3 zg3Var = hf3.b;
                    av8Var3.h0();
                    if (av8Var3.S) {
                        av8Var3.l(zg3Var);
                    } else {
                        av8Var3.q0();
                    }
                    f50 f50Var = hf3.g;
                    waa.K(av8Var3, a, f50Var);
                    ff3 ff3Var = hf3.f;
                    waa.K(av8Var3, m, ff3Var);
                    Integer valueOf = Integer.valueOf(hashCode);
                    f50 f50Var2 = hf3.j;
                    waa.K(av8Var3, valueOf, f50Var2);
                    ry ryVar = hf3.k;
                    waa.J(av8Var3, ryVar);
                    f50 f50Var3 = hf3.d;
                    waa.K(av8Var3, C, f50Var3);
                    rha.b(oea.v(function02 != null ? R.string.fantasy_league_management : R.string.teams, av8Var3), null, 0L, av8Var3, 0, 6);
                    nq8.h(av8Var3, bkh.e(utcVar, 16.0f));
                    kg0 kg0Var = ww9.h;
                    xtc d0 = l98.d0(bkh.d(utcVar, 1.0f), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, 1);
                    lv1 lv1Var = uxf.l;
                    l8g a2 = k8g.a(kg0Var, lv1Var, av8Var3, 6);
                    int hashCode2 = Long.hashCode(av8Var3.T);
                    aee m2 = av8Var3.m();
                    xtc C2 = fqj.C(av8Var3, d0);
                    av8Var3.h0();
                    if (av8Var3.S) {
                        av8Var3.l(zg3Var);
                    } else {
                        av8Var3.q0();
                    }
                    waa.K(av8Var3, a2, f50Var);
                    waa.K(av8Var3, m2, ff3Var);
                    bf3.s(hashCode2, av8Var3, f50Var2, av8Var3, ryVar);
                    waa.K(av8Var3, C2, f50Var3);
                    String v = oea.v(R.string.fantasy_number_of_teams, av8Var3);
                    yf8 yf8Var = xth.a;
                    udj.c(v, null, lz.D(R.color.n_lv_1, av8Var3), null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, xth.e(), av8Var3, 0, 24960, 110586);
                    udj.c(String.valueOf(i4), null, lz.D(R.color.n_lv_1, av8Var3), null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, xth.l(), av8Var3, 0, 24960, 110586);
                    bf3.t(av8Var3, true, utcVar, 16.0f, av8Var3);
                    xtc d = bkh.d(utcVar, 1.0f);
                    l8g a3 = k8g.a(ww9.b, lv1Var, av8Var3, 0);
                    int hashCode3 = Long.hashCode(av8Var3.T);
                    aee m3 = av8Var3.m();
                    xtc C3 = fqj.C(av8Var3, d);
                    av8Var3.h0();
                    if (av8Var3.S) {
                        av8Var3.l(zg3Var);
                    } else {
                        av8Var3.q0();
                    }
                    waa.K(av8Var3, a3, f50Var);
                    waa.K(av8Var3, m3, ff3Var);
                    bf3.s(hashCode3, av8Var3, f50Var2, av8Var3, ryVar);
                    waa.K(av8Var3, C3, f50Var3);
                    if (function02 == null) {
                        av8Var3.d0(-1000097138);
                        i = 0;
                        av8Var3.s(false);
                    } else {
                        av8Var3.d0(-1000097137);
                        String v2 = oea.v(R.string.fantasy_invite_players_button, av8Var3);
                        d7e t = haa.t(R.drawable.ic_add_member, 0, av8Var3);
                        if (1.0f <= 0.0d) {
                            p3a.a("invalid weight; must be greater than zero");
                        }
                        i9a.h(v2, t, function02, new goa(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), av8Var3, 64, 0);
                        nq8.h(av8Var3, bkh.p(utcVar, 8.0f));
                        Unit unit = Unit.a;
                        i = 0;
                        av8Var3.s(false);
                    }
                    String v3 = oea.v(R.string.see_all_teams_button, av8Var3);
                    d7e t2 = haa.t(R.drawable.ic_team, i, av8Var3);
                    if (1.0f <= 0.0d) {
                        p3a.a("invalid weight; must be greater than zero");
                    }
                    i9a.h(v3, t2, function03, new goa(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), av8Var3, 64, 0);
                    av8Var3.s(true);
                    av8Var3.s(true);
                } else {
                    av8Var3.W();
                }
                break;
            case 3:
                asf asfVar = (asf) obj5;
                ArrayList arrayList = (ArrayList) obj4;
                n8g n8gVar = (n8g) obj;
                of3 of3Var4 = (of3) obj2;
                int intValue4 = ((Integer) obj3).intValue();
                n8gVar.getClass();
                if ((intValue4 & 6) == 0) {
                    intValue4 |= ((av8) of3Var4).g(n8gVar) ? 4 : 2;
                }
                av8 av8Var4 = (av8) of3Var4;
                if (!av8Var4.T(intValue4 & 1, (intValue4 & 19) != 18)) {
                    av8Var4.W();
                } else if (asfVar.a) {
                    av8Var4.d0(-1057742871);
                    av8Var4.s(false);
                } else {
                    av8Var4.d0(-1281069573);
                    String str = (String) arrayList.get(i4);
                    if (str == null) {
                        av8Var4.d0(-1058451098);
                        av8Var4.s(false);
                    } else {
                        av8Var4.d0(-1058451097);
                        xtc f02 = l98.f0(n8gVar.a(1.0f, kda.O(utcVar, "odds_item_text", av8Var4), true), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 4.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 11);
                        yf8 yf8Var2 = xth.a;
                        udj.c(str, f02, lz.D(R.color.n_lv_3, av8Var4), null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, xth.b(), av8Var4, 0, 24960, 110584);
                        av8Var4.s(false);
                    }
                    av8Var4.s(false);
                }
                break;
            case 4:
                gv9 gv9Var = (gv9) obj5;
                f6i f6iVar = (f6i) obj4;
                of3 of3Var5 = (of3) obj2;
                int intValue5 = ((Integer) obj3).intValue();
                ((v23) obj).getClass();
                av8 av8Var5 = (av8) of3Var5;
                if (av8Var5.T(intValue5 & 1, (intValue5 & 17) != 16)) {
                    g6i g6iVar = (g6i) gv9Var.get(i4);
                    r5i.b(g6iVar, gv9Var.size() == 1 && g6iVar.e.size() <= 10, f6iVar.g, av8Var5, 0);
                } else {
                    av8Var5.W();
                }
                break;
            case 5:
                String str2 = (String) obj5;
                Function1 function1 = (Function1) obj4;
                Function2 function2 = (Function2) obj;
                of3 of3Var6 = (of3) obj2;
                int intValue6 = ((Integer) obj3).intValue();
                function2.getClass();
                if ((intValue6 & 6) == 0) {
                    intValue6 |= ((av8) of3Var6).i(function2) ? 4 : 2;
                }
                av8 av8Var6 = (av8) of3Var6;
                if (av8Var6.T(intValue6 & 1, (intValue6 & 19) != 18)) {
                    int i5 = intValue6;
                    hjg hjgVar = hjg.h;
                    Object O2 = av8Var6.O();
                    if (O2 == nf3.a) {
                        O2 = mz1.e(av8Var6);
                    }
                    wzc wzcVar = (wzc) O2;
                    long j = r13.h;
                    long D = lz.D(R.color.n_lv_1, av8Var6);
                    long j2 = r13.i;
                    n9j a4 = hjg.p((g23) av8Var6.k(i23.a), (wej) av8Var6.k(xej.a)).a(j2, j2, j2, j2, j, j, j2, j2, D, j2, null, j, j, j2, j2, j2, j2, j2, j2, j2, j2, j2, j2, j2, j2, j2, j2, j2, j2, j2, j2, j2, j2, j2, j2, j2, j2, j2, j2, j2, j2, j2, j2);
                    float f2 = (5 & 2) != 0 ? 16.0f : 0.0f;
                    if ((5 & 8) != 0) {
                        f = 16.0f;
                    }
                    hjgVar.m(str2, function2, wzcVar, yqo.H(-1837775181, av8Var6, new o81(i4, 11)), wkn.h, yqo.H(-1738855486, av8Var6, new s5h(29, str2, function1)), null, a4, new t3e(16.0f, f2, 16.0f, f), null, av8Var6, ((i5 << 3) & 112) | 906194304);
                } else {
                    av8Var6.W();
                }
                break;
            case 6:
                TopStatsCategoryBottomSheet topStatsCategoryBottomSheet = (TopStatsCategoryBottomSheet) obj5;
                TopStatsCategory topStatsCategory = (TopStatsCategory) obj4;
                xpa xpaVar2 = (xpa) obj;
                of3 of3Var7 = (of3) obj2;
                int intValue7 = ((Integer) obj3).intValue();
                xpaVar2.getClass();
                if ((intValue7 & 6) == 0) {
                    intValue7 |= ((av8) of3Var7).g(xpaVar2) ? 4 : 2;
                }
                av8 av8Var7 = (av8) of3Var7;
                if (av8Var7.T(intValue7 & 1, (intValue7 & 19) != 18)) {
                    x2a.d(oea.v(i4, av8Var7), xpa.a(xpaVar2, l98.d0(utcVar, 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2), 7), null, 0L, 0L, lz.D(R.color.surface_2, av8Var7), null, yqo.H(867235669, av8Var7, new bmj(c == true ? 1 : 0, topStatsCategoryBottomSheet, topStatsCategory)), uxf.l, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, av8Var7, 113246208, 0, 1628);
                } else {
                    av8Var7.W();
                }
                break;
            default:
                jfj jfjVar = (jfj) obj5;
                jfj jfjVar2 = (jfj) obj4;
                of3 of3Var8 = (of3) obj2;
                ((Integer) obj3).getClass();
                ((w23) obj).getClass();
                String str3 = jfjVar.a;
                String str4 = str3 == null ? "" : str3;
                ty8 ty8Var = ty8.a;
                vy8 A = nq8.A(ty8Var);
                yf8 yf8Var3 = xth.a;
                dfj k = xth.k();
                Integer num2 = jfjVar.b;
                if (num2 != null) {
                    i3 = num2.intValue();
                }
                o3a.i(str4, A, cfj.a(l98.j0(k, Integer.valueOf(i3), of3Var8), new o7j(i4)), 1, of3Var8, 3072, 0);
                String str5 = jfjVar2.a;
                String str6 = str5 == null ? "" : str5;
                vy8 A2 = nq8.A(ty8Var);
                dfj c2 = xth.c();
                Integer num3 = jfjVar2.b;
                o3a.i(str6, A2, cfj.a(l98.j0(c2, Integer.valueOf(num3 != null ? num3.intValue() : R.color.n_lv_3), of3Var8), new o7j(i4)), 1, of3Var8, 3072, 0);
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ w54(int i, Object obj, Object obj2, int i2) {
        this.a = i2;
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    public /* synthetic */ w54(Object obj, int i, Object obj2, int i2) {
        this.a = i2;
        this.c = obj;
        this.b = i;
        this.d = obj2;
    }
}
