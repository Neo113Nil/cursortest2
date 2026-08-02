package defpackage;

import com.sofascore.results.R;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public abstract class wx7 {
    static {
        ypa.b(new go7(22));
    }

    public static final void a(k6c k6cVar, of3 of3Var, int i) {
        int i2;
        k6cVar.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(558208661);
        int i3 = (av8Var.e(k6cVar.ordinal()) ? 4 : 2) | i;
        if (av8Var.T(i3 & 1, (i3 & 3) != 2)) {
            Integer valueOf = Integer.valueOf(R.drawable.twitter_feed);
            Integer valueOf2 = Integer.valueOf(R.string.feed_empty_title);
            int ordinal = k6cVar.ordinal();
            if (ordinal == 0) {
                i2 = R.string.feed_empty_following_description;
            } else if (ordinal == 1) {
                i2 = R.string.feed_empty_trending_description;
            } else {
                if (ordinal != 2) {
                    zzl.b();
                    return;
                }
                i2 = R.string.feed_empty_from_description;
            }
            j72.h(null, valueOf, valueOf2, Integer.valueOf(i2), false, null, 10, 0L, av8Var, 1572864, 177);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new hl7(k6cVar, i, 11);
        }
    }

    public static final void b(int i, of3 of3Var, xtc xtcVar) {
        xtc xtcVar2;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-939111663);
        int i2 = (av8Var.g(xtcVar) ? 4 : 2) | i;
        if (av8Var.T(i2 & 1, (i2 & 3) != 2)) {
            xtcVar2 = xtcVar;
            j72.h(xtcVar2, Integer.valueOf(R.drawable.twitter_feed), Integer.valueOf(R.string.empty_page_maintenance_header), Integer.valueOf(R.string.empty_page_maintenance_body), false, null, 0, 0L, av8Var, i2 & 14, 240);
        } else {
            xtcVar2 = xtcVar;
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new l63(xtcVar2, i, 15);
        }
    }

    public static final void c(int i, of3 of3Var) {
        av8 av8Var;
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(589059564);
        if (av8Var2.T(i & 1, i != 0)) {
            utc utcVar = utc.a;
            xtc c0 = l98.c0(bkh.d(utcVar, 1.0f), 32.0f, 16.0f);
            String v = oea.v(R.string.feed_welcome, av8Var2);
            yf8 yf8Var = xth.a;
            av8Var = av8Var2;
            udj.c(v, c0, lz.D(R.color.n_lv_1, av8Var2), null, 0L, null, 0L, null, new p7j(3), 0L, 2, false, 2, 0, null, xth.j(), av8Var, 48, 24960, 109560);
            udj.c(oea.v(R.string.feed_welcome_body, av8Var), l98.f0(bkh.d(utcVar, 1.0f), 32.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 32.0f, 32.0f, 2), lz.D(R.color.n_lv_3, av8Var), null, 0L, null, 0L, null, new p7j(3), 0L, 2, false, 3, 0, null, xth.e(), av8Var, 48, 24960, 109560);
        } else {
            av8Var = av8Var2;
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new sc6(i, 19);
        }
    }
}
