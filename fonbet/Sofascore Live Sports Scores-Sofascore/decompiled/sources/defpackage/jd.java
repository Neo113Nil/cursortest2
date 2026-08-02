package defpackage;

import android.content.Context;
import android.view.View;
import android.view.animation.TranslateAnimation;
import com.bytedance.sdk.component.kj.pcc.wh;
import com.facebook.internal.x;
import com.facebook.w;
import com.ironsource.AbstractC4031d3;
import com.ironsource.Ea;
import com.ironsource.Va;
import com.unity3d.mediation.LevelPlayAdError;
import com.unity3d.services.UnityAdsConstants;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final /* synthetic */ class jd implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ jd(nw3 nw3Var, long j, String str) {
        this.a = 1;
        this.d = nw3Var;
        this.b = j;
        this.c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        jy0 jy0Var;
        int i = 1;
        switch (this.a) {
            case 0:
                long j = this.b;
                String str = (String) this.c;
                Context context = (Context) this.d;
                jy0 jy0Var2 = md.f;
                Long l = jy0Var2 != null ? (Long) jy0Var2.c : null;
                if (md.f == null) {
                    md.f = new jy0(Long.valueOf(j), null);
                    String str2 = md.h;
                    context.getClass();
                    f8h.u(context, str, str2);
                } else if (l != null) {
                    long longValue = j - l.longValue();
                    ScheduledExecutorService scheduledExecutorService = md.a;
                    if (longValue > (x.b(w.b()) == null ? 60 : r4.b) * 1000) {
                        f8h.w(str, md.f, md.h);
                        String str3 = md.h;
                        context.getClass();
                        f8h.u(context, str, str3);
                        md.f = new jy0(Long.valueOf(j), null);
                    } else if (longValue > 1000 && (jy0Var = md.f) != null) {
                        jy0Var.a++;
                    }
                }
                jy0 jy0Var3 = md.f;
                if (jy0Var3 != null) {
                    jy0Var3.c = Long.valueOf(j);
                }
                jy0 jy0Var4 = md.f;
                if (jy0Var4 != null) {
                    jy0Var4.i();
                    break;
                }
                break;
            case 1:
                nw3 nw3Var = (nw3) this.d;
                long j2 = this.b;
                String str4 = (String) this.c;
                jw3 jw3Var = nw3Var.g;
                wx3 wx3Var = jw3Var.n;
                if (wx3Var == null || !wx3Var.e.get()) {
                    ((h18) jw3Var.i.c).v(j2, str4);
                    break;
                }
                break;
            case 2:
                Ea.a((Ea) this.c, (AbstractC4031d3.c) this.d, this.b);
                break;
            case 3:
                m35 m35Var = (m35) this.c;
                long j3 = this.b;
                View view = (View) this.d;
                TranslateAnimation translateAnimation = new TranslateAnimation(0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1, m35Var.a, 1, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                translateAnimation.setDuration(j3);
                translateAnimation.setFillAfter(true);
                view.startAnimation(translateAnimation);
                view.setVisibility(0);
                break;
            case 4:
                Va.a((Va) this.c, this.b, (LevelPlayAdError) this.d);
                break;
            case 5:
                qo0 qo0Var = (qo0) this.c;
                Object obj = this.d;
                long j4 = this.b;
                lg6 lg6Var = qo0Var.b;
                int i2 = lik.a;
                ug6 ug6Var = lg6Var.a;
                bn4 bn4Var = ug6Var.r;
                pv y = bn4Var.y();
                bn4Var.z(y, 26, new ib3(y, obj, j4, 3));
                if (ug6Var.R == obj) {
                    ug6Var.l.k(26, new hg6(2));
                    break;
                }
                break;
            case 6:
                ro0 ro0Var = (ro0) this.c;
                Object obj2 = this.d;
                long j5 = this.b;
                mg6 mg6Var = ro0Var.b;
                String str5 = nik.a;
                vg6 vg6Var = mg6Var.a;
                cn4 cn4Var = vg6Var.s;
                qv p = cn4Var.p();
                cn4Var.q(p, 26, new ib3(p, obj2, j5, 2));
                if (vg6Var.T == obj2) {
                    vg6Var.m.g(26, new hg6(i));
                    break;
                }
                break;
            default:
                ((wh) this.c).sf((Runnable) this.d, this.b);
                break;
        }
    }

    public /* synthetic */ jd(Context context, String str, long j) {
        this.a = 0;
        this.b = j;
        this.c = str;
        this.d = context;
    }

    public /* synthetic */ jd(Object obj, long j, Object obj2, int i) {
        this.a = i;
        this.c = obj;
        this.b = j;
        this.d = obj2;
    }

    public /* synthetic */ jd(Object obj, Object obj2, long j, int i) {
        this.a = i;
        this.c = obj;
        this.d = obj2;
        this.b = j;
    }
}
