package defpackage;

import android.os.CancellationSignal;
import com.blaze.blazesdk.analytics.AnalyticsDoNotTrackLocal;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class dnm extends m4m {
    public final k6g a;
    public final gam b;

    public dnm(k6g k6gVar) {
        this.a = k6gVar;
        this.b = new gam(k6gVar);
        new ycm(k6gVar);
        new sfm(k6gVar);
    }

    @Override // defpackage.m4m
    public final Object a(int i, hnb hnbVar) {
        r6g e = r6g.e(1, "SELECT * FROM analytics_do_not_track ORDER BY id ASC LIMIT ?");
        e.q(1, i);
        return rd0.f.l(this.a, new CancellationSignal(), new olm(this, e), hnbVar);
    }

    @Override // defpackage.m4m
    public final Object b(hu8 hu8Var) {
        r6g e = r6g.e(0, "SELECT COUNT(id) FROM analytics_do_not_track");
        return rd0.f.l(this.a, new CancellationSignal(), new qjm(this, e), hu8Var);
    }

    @Override // defpackage.m4m
    public final Object c(List list, hnb hnbVar) {
        return rd0.f.m(this.a, true, new t7m(this, list), hnbVar);
    }

    @Override // defpackage.m4m
    public final Object d(AnalyticsDoNotTrackLocal[] analyticsDoNotTrackLocalArr, dtm dtmVar) {
        return rd0.f.m(this.a, true, new vhm(this, analyticsDoNotTrackLocalArr), dtmVar);
    }
}
