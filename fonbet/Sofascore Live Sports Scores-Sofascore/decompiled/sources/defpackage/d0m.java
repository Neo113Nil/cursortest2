package defpackage;

import com.blaze.blazesdk.features.videos.models.args.a;
import com.blaze.blazesdk.features.videos.models.configuration.BlazeVideosPlaybackConfiguration;
import com.blaze.blazesdk.features.videos.models.ui.i;
import com.blaze.blazesdk.features.videos.players.ui.VideosPlayerActivity;
import com.blaze.blazesdk.players.models.H;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class d0m extends ppd {
    public final /* synthetic */ VideosPlayerActivity d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0m(VideosPlayerActivity videosPlayerActivity) {
        super(true);
        this.d = videosPlayerActivity;
    }

    @Override // defpackage.ppd
    public final void b() {
        i iVar;
        BlazeVideosPlaybackConfiguration.BlazeVideosPipConfiguration blazeVideosPipConfiguration;
        VideosPlayerActivity.a aVar = VideosPlayerActivity.u;
        VideosPlayerActivity videosPlayerActivity = this.d;
        a aVar2 = videosPlayerActivity.n;
        if (((aVar2 == null || (iVar = aVar2.o) == null || (blazeVideosPipConfiguration = iVar.c) == null) ? true : blazeVideosPipConfiguration.getEnterPipOnAppBackground()) && videosPlayerActivity.v()) {
            return;
        }
        videosPlayerActivity.s = false;
        com.blaze.blazesdk.features.videos.players.ui.a aVar3 = videosPlayerActivity.m;
        if (aVar3 != null) {
            aVar3.j(H.BACK_BUTTON);
        }
    }
}
