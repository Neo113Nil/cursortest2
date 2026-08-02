package defpackage;

import android.os.CancellationSignal;
import com.blaze.blazesdk.analytics.AnalyticsTrackLocal;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class jx0 extends lxm {
    public final k6g a;
    public final wym b;

    public jx0(k6g k6gVar) {
        this.a = k6gVar;
        this.b = new wym(k6gVar);
        new ozm(k6gVar);
        new o0n(k6gVar);
    }

    @Override // defpackage.lxm
    public final Object a(int i, s2d s2dVar) {
        r6g e = r6g.e(1, "SELECT * FROM analytics_track ORDER BY id ASC LIMIT ?");
        e.q(1, i);
        return rd0.f.l(this.a, new CancellationSignal(), new w(this, e), s2dVar);
    }

    @Override // defpackage.lxm
    public final Object b(r59 r59Var) {
        r6g e = r6g.e(0, "SELECT COUNT(id) FROM analytics_track");
        return rd0.f.l(this.a, new CancellationSignal(), new p1n(this, e), r59Var);
    }

    @Override // defpackage.lxm
    public final Object c(List list, s2d s2dVar) {
        return rd0.f.m(this.a, true, new cym(this, list), s2dVar);
    }

    @Override // defpackage.lxm
    public final Object d(AnalyticsTrackLocal[] analyticsTrackLocalArr, dtm dtmVar) {
        return rd0.f.m(this.a, true, new c1n(this, analyticsTrackLocalArr), dtmVar);
    }
}
