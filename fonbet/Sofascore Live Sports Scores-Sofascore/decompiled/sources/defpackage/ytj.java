package defpackage;

import com.blaze.blazesdk.data_source.BlazeDataSourcePersonalizedType;
import com.sofascore.results.R;
import com.unity3d.services.UnityAdsConstants;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class ytj implements ct8 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;

    public /* synthetic */ ytj(String str, String str2, boolean z) {
        this.c = str;
        this.d = str2;
        this.b = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v15, types: [xtc] */
    @Override // defpackage.ct8
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        boolean z = this.b;
        switch (i) {
            case 0:
                of3 of3Var = (of3) obj2;
                ((Integer) obj3).getClass();
                ((r70) obj).getClass();
                utc utcVar = utc.a;
                xtc f0 = l98.f0(bkh.d(utcVar, 1.0f), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 12.0f, 7);
                u23 a = t23.a(ww9.d, uxf.o, of3Var, 0);
                av8 av8Var = (av8) of3Var;
                int hashCode = Long.hashCode(av8Var.T);
                aee m = av8Var.m();
                xtc C = fqj.C(of3Var, f0);
                if3.k7.getClass();
                zg3 zg3Var = hf3.b;
                av8 av8Var2 = (av8) of3Var;
                av8Var2.h0();
                if (av8Var2.S) {
                    av8Var2.l(zg3Var);
                } else {
                    av8Var2.q0();
                }
                f50 f50Var = hf3.g;
                waa.K(of3Var, a, f50Var);
                ff3 ff3Var = hf3.f;
                waa.K(of3Var, m, ff3Var);
                Integer valueOf = Integer.valueOf(hashCode);
                f50 f50Var2 = hf3.j;
                waa.K(of3Var, valueOf, f50Var2);
                ry ryVar = hf3.k;
                waa.J(of3Var, ryVar);
                f50 f50Var3 = hf3.d;
                waa.K(of3Var, C, f50Var3);
                xtc c0 = l98.c0(utcVar, 16.0f, 8.0f);
                yf8 yf8Var = xth.a;
                udj.c(this.c, c0, lz.D(R.color.n_lv_1, of3Var), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.e(), of3Var, 48, 0, 131064);
                jej Q = h5a.Q(4, 6, 0, of3Var);
                String v = oea.v(R.string.position, of3Var);
                udj.c(v, l98.f0(utcVar, o6a.p(v, Q, 56, of3Var) + 16.0f, 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 12), lz.D(R.color.n_lv_3, of3Var), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.b(), of3Var, 0, 0, 131064);
                xtc d = bkh.d(l98.d0(utcVar, 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2), 1.0f);
                k1c c = e12.c(uxf.c, false);
                int hashCode2 = Long.hashCode(av8Var2.T);
                aee m2 = av8Var2.m();
                xtc C2 = fqj.C(of3Var, d);
                av8Var2.h0();
                if (av8Var2.S) {
                    av8Var2.l(zg3Var);
                } else {
                    av8Var2.q0();
                }
                waa.K(of3Var, c, f50Var);
                waa.K(of3Var, m2, ff3Var);
                waa.K(of3Var, Integer.valueOf(hashCode2), f50Var2);
                waa.J(of3Var, ryVar);
                waa.K(of3Var, C2, f50Var3);
                wkn.l(s6a.N(R.drawable.performance_chart_info_popover, 6, of3Var), av8Var2.k(dh3.n) == ema.b ? f6a.D(utcVar, -1.0f, 1.0f) : utcVar, null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, of3Var, 48, 120);
                mv1 mv1Var = uxf.i;
                n12 n12Var = n12.a;
                udj.c(oea.v(R.string.standings_tracker_team_one, of3Var), l98.f0(n12Var.a(utcVar, mv1Var), 180.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 110.0f, 6), lz.D(R.color.secondary_default, of3Var), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.b(), of3Var, 0, 0, 131064);
                udj.c(oea.v(R.string.standings_tracker_team_two, of3Var), l98.f0(n12Var.a(utcVar, mv1Var), 180.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 80.0f, 6), lz.D(R.color.primary_default, of3Var), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.b(), of3Var, 0, 0, 131064);
                av8Var2.s(true);
                String str = this.d;
                udj.c(str, l98.f0(utcVar, o6a.p(str, Q, 76, of3Var) + 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 14), lz.D(R.color.n_lv_3, of3Var), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.b(), of3Var, 0, 0, 131064);
                if (z) {
                    av8Var2.d0(-440836472);
                    nq8.h(of3Var, bkh.e(utcVar, 16.0f));
                    udj.c(oea.v(R.string.legend_info_button_title, of3Var), l98.d0(bkh.d(utcVar, 1.0f), 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2), lz.D(R.color.n_lv_1, of3Var), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.l(), of3Var, 48, 0, 131064);
                    nq8.h(of3Var, bkh.e(utcVar, 8.0f));
                    o6a.h(0, of3Var);
                    av8Var2.s(false);
                } else {
                    av8Var2.d0(-440309844);
                    av8Var2.s(false);
                }
                av8Var2.s(true);
                return Unit.a;
            default:
                p0d p0dVar = (p0d) obj;
                k6l k6lVar = (k6l) obj2;
                List list = (List) obj3;
                p0dVar.getClass();
                k6lVar.getClass();
                list.getClass();
                p0d g = p0dVar.g();
                n6l n6lVar = n6l.a;
                g.e(n6l.b, Boolean.valueOf(z));
                g.e(n6l.e, Boolean.FALSE);
                g.e(n6l.c, this.c);
                g.e(n6l.f, this.d);
                e5f e5fVar = n6l.d;
                List list2 = k6lVar.a;
                list2.getClass();
                bga bgaVar = vga.a;
                bgaVar.getClass();
                g.e(e5fVar, bgaVar.c(new xg0(v6l.Companion.serializer(), 0), list2));
                g.e(n6l.i, Integer.valueOf(k6lVar.b));
                g.e(n6l.j, CollectionsKt.f0(list, BlazeDataSourcePersonalizedType.STRING_SEPARATOR, null, null, null, 62));
                g.e(n6l.k, Boolean.valueOf(k6lVar.c));
                g.e(n6l.l, Boolean.valueOf(k6lVar.d));
                return g;
        }
    }

    public /* synthetic */ ytj(boolean z, String str, String str2) {
        this.b = z;
        this.c = str;
        this.d = str2;
    }
}
