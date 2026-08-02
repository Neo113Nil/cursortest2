package defpackage;

import com.blaze.blazesdk.features.videos.models.local.VideoViewed;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class hcm extends ap5 {
    public hcm(k6g k6gVar) {
        super(k6gVar, 1);
    }

    @Override // defpackage.y0
    public final String c() {
        return "INSERT OR IGNORE INTO `videos_viewed` (`video_id`,`is_synced`,`last_viewed_ms`,`is_read`) VALUES (?,?,?,?)";
    }

    @Override // defpackage.ap5
    public final void v(mni mniVar, Object obj) {
        VideoViewed videoViewed = (VideoViewed) obj;
        if (videoViewed.getVideoId() == null) {
            mniVar.s(1);
        } else {
            mniVar.m0(1, videoViewed.getVideoId());
        }
        mniVar.q(2, videoViewed.isSynced() ? 1L : 0L);
        mniVar.J0(videoViewed.getLastViewedMs(), 3);
        mniVar.q(4, videoViewed.isRead() ? 1L : 0L);
    }
}
