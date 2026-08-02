package defpackage;

import com.blaze.blazesdk.features.videos.models.local.VideoLikedStatus;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class awl extends ap5 {
    public awl(k6g k6gVar) {
        super(k6gVar, 1);
    }

    @Override // defpackage.y0
    public final String c() {
        return "INSERT OR IGNORE INTO `videos_liked_status` (`video_id`,`is_liked`) VALUES (?,?)";
    }

    @Override // defpackage.ap5
    public final void v(mni mniVar, Object obj) {
        VideoLikedStatus videoLikedStatus = (VideoLikedStatus) obj;
        if (videoLikedStatus.getVideoId() == null) {
            mniVar.s(1);
        } else {
            mniVar.m0(1, videoLikedStatus.getVideoId());
        }
        mniVar.q(2, videoLikedStatus.isLiked() ? 1L : 0L);
    }
}
