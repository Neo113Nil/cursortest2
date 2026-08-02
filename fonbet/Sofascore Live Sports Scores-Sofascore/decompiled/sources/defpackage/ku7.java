package defpackage;

import android.content.Context;
import androidx.core.app.NotificationCompat;
import com.ironsource.mediationsdk.metadata.a;
import com.sofascore.model.odds.ProviderOdds;
import com.sofascore.results.R;
import com.sofascore.results.event.odds.model.OddsEventUIModel;
import com.unity3d.services.UnityAdsConstants;
import kotlin.collections.CollectionsKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public abstract class ku7 {
    public static final void a(int i, xmd xmdVar, vmd vmdVar, boolean z, of3 of3Var, int i2) {
        av8 av8Var;
        int i3;
        boolean z2;
        boolean z3;
        String str;
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(-596455762);
        int i4 = i2 | (av8Var2.e(i) ? 4 : 2) | (av8Var2.g(xmdVar) ? 32 : 16) | (av8Var2.e(vmdVar.ordinal()) ? NotificationCompat.FLAG_LOCAL_ONLY : 128) | (av8Var2.h(z) ? a.o : 1024);
        boolean z4 = true;
        boolean z5 = false;
        if (av8Var2.T(i4 & 1, (i4 & 1171) != 1170)) {
            utc utcVar = utc.a;
            char c = 0;
            Object obj = null;
            xtc x = gz8.x(bkh.d(utcVar, 1.0f), null, null, 3);
            u23 a = t23.a(ww9.d, uxf.o, av8Var2, 0);
            int hashCode = Long.hashCode(av8Var2.T);
            aee m = av8Var2.m();
            xtc C = fqj.C(av8Var2, x);
            if3.k7.getClass();
            zg3 zg3Var = hf3.b;
            av8Var2.h0();
            if (av8Var2.S) {
                av8Var2.l(zg3Var);
            } else {
                av8Var2.q0();
            }
            waa.K(av8Var2, a, hf3.g);
            waa.K(av8Var2, m, hf3.f);
            waa.K(av8Var2, Integer.valueOf(hashCode), hf3.j);
            waa.J(av8Var2, hf3.k);
            waa.K(av8Var2, C, hf3.d);
            av8Var2.d0(-1399947441);
            if (xmdVar != null) {
                gv9<and> gv9Var = xmdVar.a;
                if (!gv9Var.isEmpty()) {
                    OddsEventUIModel oddsEventUIModel = xmdVar.c;
                    fgf fgfVar = ((and) CollectionsKt.Y(gv9Var)).b;
                    Context context = (Context) av8Var2.k(nz.b);
                    av8Var2.d0(-1153532333);
                    for (and andVar : gv9Var) {
                        av8Var2.a0(1219661808, Integer.valueOf(andVar.b.a));
                        int i5 = oddsEventUIModel.a;
                        utc utcVar2 = utcVar;
                        String str2 = oddsEventUIModel.b;
                        String str3 = oddsEventUIModel.c;
                        old oldVar = andVar.a;
                        av8 av8Var3 = av8Var2;
                        nld.d(i5, str2, str3, oldVar, andVar.b, vmdVar, "featured", null, 0L, false, (z || !oldVar.c) ? cgf.c : cgf.b, false, false, null, null, av8Var3, ((i4 << 9) & 458752) | 1572864, 0, 31616);
                        av8Var3.s(false);
                        z5 = false;
                        utcVar = utcVar2;
                        av8Var2 = av8Var3;
                        oddsEventUIModel = oddsEventUIModel;
                        fgfVar = fgfVar;
                        context = context;
                        c = 0;
                        z4 = true;
                        obj = null;
                    }
                    av8Var = av8Var2;
                    utc utcVar3 = utcVar;
                    boolean z6 = z5;
                    OddsEventUIModel oddsEventUIModel2 = oddsEventUIModel;
                    fgf fgfVar2 = fgfVar;
                    Context context2 = context;
                    av8Var.s(z6);
                    xtc d = bkh.d(utcVar3, 1.0f);
                    lv1 lv1Var = uxf.m;
                    wxf wxfVar = ww9.b;
                    l8g a2 = k8g.a(wxfVar, lv1Var, av8Var, 48);
                    int hashCode2 = Long.hashCode(av8Var.T);
                    aee m2 = av8Var.m();
                    xtc C2 = fqj.C(av8Var, d);
                    if3.k7.getClass();
                    zg3 zg3Var2 = hf3.b;
                    av8Var.h0();
                    if (av8Var.S) {
                        av8Var.l(zg3Var2);
                    } else {
                        av8Var.q0();
                    }
                    f50 f50Var = hf3.g;
                    waa.K(av8Var, a2, f50Var);
                    ff3 ff3Var = hf3.f;
                    waa.K(av8Var, m2, ff3Var);
                    Integer valueOf = Integer.valueOf(hashCode2);
                    f50 f50Var2 = hf3.j;
                    waa.K(av8Var, valueOf, f50Var2);
                    ry ryVar = hf3.k;
                    waa.J(av8Var, ryVar);
                    f50 f50Var3 = hf3.d;
                    waa.K(av8Var, C2, f50Var3);
                    if (1.0f <= 0.0d) {
                        p3a.a("invalid weight; must be greater than zero");
                    }
                    xtc f0 = l98.f0(new goa(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 11);
                    l8g a3 = k8g.a(wxfVar, uxf.l, av8Var, z6 ? 1 : 0);
                    int hashCode3 = Long.hashCode(av8Var.T);
                    aee m3 = av8Var.m();
                    xtc C3 = fqj.C(av8Var, f0);
                    av8Var.h0();
                    if (av8Var.S) {
                        av8Var.l(zg3Var2);
                    } else {
                        av8Var.q0();
                    }
                    waa.K(av8Var, a3, f50Var);
                    waa.K(av8Var, m3, ff3Var);
                    bf3.s(hashCode3, av8Var, f50Var2, av8Var, ryVar);
                    waa.K(av8Var, C3, f50Var3);
                    boolean g = av8Var.g(oddsEventUIModel2.c) | av8Var.g(fgfVar2);
                    Object O = av8Var.O();
                    if (g || O == nf3.a) {
                        fgf fgfVar3 = fgfVar2.c == 1 ? null : fgfVar2;
                        if (fgfVar3 != null) {
                            r9k r9kVar = fgfVar3.b;
                            String b = r9kVar != null ? r9kVar.b(context2) : null;
                            String str4 = oddsEventUIModel2.c;
                            ProviderOdds.Type type = fgfVar3.f;
                            String str5 = fgfVar3.g;
                            context2.getClass();
                            type.getClass();
                            String n = rld.n(context2, b, str4);
                            str = "";
                            if (n == null) {
                                n = "";
                            }
                            rld.w(n, type, str5);
                        } else {
                            str = null;
                        }
                        av8Var.n0(str);
                        O = str;
                    }
                    String str6 = (String) O;
                    if (str6 != null) {
                        av8Var.d0(1015465041);
                        if (1.0f <= 0.0d) {
                            p3a.a("invalid weight; must be greater than zero");
                        }
                        goa goaVar = new goa(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, false);
                        yf8 yf8Var = xth.a;
                        z2 = true;
                        udj.c(str6, goaVar, lz.D(R.color.n_lv_1, av8Var), null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, xth.k(), av8Var, 0, 24960, 110584);
                        av8Var = av8Var;
                        if (fgfVar2.d) {
                            av8Var.d0(1015880875);
                            udj.c(oea.v(R.string.standings_live, av8Var), l98.f0(utcVar3, 4.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 14), lz.D(R.color.value, av8Var), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.k(), av8Var, 48, 0, 131064);
                            av8Var = av8Var;
                            z3 = false;
                            av8Var.s(false);
                        } else {
                            z3 = false;
                            av8Var.d0(1016186194);
                            av8Var.s(false);
                        }
                        av8Var.s(z3);
                    } else {
                        z2 = true;
                        z3 = false;
                        av8Var.d0(1016204050);
                        av8Var.s(false);
                    }
                    av8Var.s(z2);
                    int i6 = i4 & 14;
                    i3 = i;
                    iu7.f(i3, i6, 2, av8Var, null);
                    av8Var.s(z2);
                    av8Var.s(z3);
                    av8Var.s(z2);
                }
            }
            av8Var = av8Var2;
            i3 = i;
            z2 = true;
            z3 = false;
            av8Var.s(z3);
            av8Var.s(z2);
        } else {
            av8Var = av8Var2;
            i3 = i;
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new di(i3, xmdVar, vmdVar, z, i2);
        }
    }
}
