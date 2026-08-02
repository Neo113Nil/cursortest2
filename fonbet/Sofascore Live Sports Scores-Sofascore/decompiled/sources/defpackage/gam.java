package defpackage;

import com.blaze.blazesdk.analytics.AnalyticsDoNotTrackLocal;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class gam extends ap5 {
    public gam(k6g k6gVar) {
        super(k6gVar, 1);
    }

    @Override // defpackage.y0
    public final String c() {
        return "INSERT OR REPLACE INTO `analytics_do_not_track` (`id`,`request`,`response`,`type`) VALUES (nullif(?, 0),?,?,?)";
    }

    @Override // defpackage.ap5
    public final void v(mni mniVar, Object obj) {
        AnalyticsDoNotTrackLocal analyticsDoNotTrackLocal = (AnalyticsDoNotTrackLocal) obj;
        mniVar.q(1, analyticsDoNotTrackLocal.getId());
        if (analyticsDoNotTrackLocal.getRequest() == null) {
            mniVar.s(2);
        } else {
            mniVar.m0(2, analyticsDoNotTrackLocal.getRequest());
        }
        if (analyticsDoNotTrackLocal.getResponse() == null) {
            mniVar.s(3);
        } else {
            mniVar.m0(3, analyticsDoNotTrackLocal.getResponse());
        }
        if (analyticsDoNotTrackLocal.getEventType() == null) {
            mniVar.s(4);
        } else {
            mniVar.m0(4, analyticsDoNotTrackLocal.getEventType());
        }
    }
}
