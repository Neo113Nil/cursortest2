package defpackage;

import com.blaze.blazesdk.features.moments.models.local.MomentViewed;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class ubm extends ap5 {
    public ubm(k6g k6gVar) {
        super(k6gVar, 1);
    }

    @Override // defpackage.y0
    public final String c() {
        return "INSERT OR IGNORE INTO `moments_viewed` (`moment_id`,`is_synced`) VALUES (?,?)";
    }

    @Override // defpackage.ap5
    public final void v(mni mniVar, Object obj) {
        MomentViewed momentViewed = (MomentViewed) obj;
        if (momentViewed.getMomentId() == null) {
            mniVar.s(1);
        } else {
            mniVar.m0(1, momentViewed.getMomentId());
        }
        mniVar.q(2, momentViewed.isSynced() ? 1L : 0L);
    }
}
