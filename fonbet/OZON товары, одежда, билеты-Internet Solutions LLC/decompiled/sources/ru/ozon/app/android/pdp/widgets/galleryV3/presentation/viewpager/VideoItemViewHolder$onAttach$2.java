package ru.ozon.app.android.pdp.widgets.galleryV3.presentation.viewpager;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.pdp.ui.configurators.pdp.gallery.v3.GalleryAction;
import ru.ozon.app.android.pdp.ui.configurators.pdp.gallery.v3.GalleryV3VO;
import ru.ozon.app.android.pdp.ui.configurators.pdp.gallery.v3.GalleryV3ViewModel;
import ru.ozon.app.android.pdp.widgets.galleryV3.presentation.player.GalleryVideoPlayer;
import ru.ozon.app.android.pdpvideomolecule.data.VideoMolecule;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "action", "Lru/ozon/app/android/pdp/ui/configurators/pdp/gallery/v3/GalleryAction;", "kotlin.jvm.PlatformType", "invoke", "(Lru/ozon/app/android/pdp/ui/configurators/pdp/gallery/v3/GalleryAction;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class VideoItemViewHolder$onAttach$2 extends AbstractC7737t implements Function1<GalleryAction, Unit> {
    final /* synthetic */ VideoItemViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    VideoItemViewHolder$onAttach$2(VideoItemViewHolder videoItemViewHolder) {
        super(1);
        this.this$0 = videoItemViewHolder;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(GalleryAction galleryAction) {
        invoke2(galleryAction);
        return Unit.f71690a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0057, code lost:
    
        r0 = r5.this$0.videoPlayer;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0087, code lost:
    
        r6 = r5.this$0.videoPlayer;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x000c, code lost:
    
        r2 = (r1 = r5.this$0).videoPlayer;
     */
    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void invoke2(GalleryAction galleryAction) {
        GalleryVideoPlayer galleryVideoPlayer;
        GalleryVideoPlayer galleryVideoPlayer2;
        GalleryV3VO.Item.OzonVideo ozonVideo;
        GalleryVideoPlayer galleryVideoPlayer3;
        VideoMolecule video;
        GalleryV3VO.Item.OzonVideo ozonVideo2;
        VideoItemViewHolder videoItemViewHolder;
        GalleryVideoPlayer galleryVideoPlayer4;
        GalleryVideoPlayer galleryVideoPlayer5;
        GalleryV3ViewModel galleryV3ViewModel;
        if (galleryAction instanceof GalleryAction.VideoItemClicked) {
            ozonVideo2 = this.this$0.vo;
            if (ozonVideo2 == null || galleryVideoPlayer4 == null) {
                return;
            }
            long position = galleryVideoPlayer4.getPosition();
            galleryVideoPlayer5 = videoItemViewHolder.videoPlayer;
            if (galleryVideoPlayer5 != null) {
                galleryVideoPlayer5.pause();
            }
            galleryV3ViewModel = videoItemViewHolder.galleryViewModel;
            galleryV3ViewModel.openGalleryVideoFromPosition(ozonVideo2, position, ((GalleryAction.VideoItemClicked) galleryAction).getFullScreen());
            return;
        }
        if (galleryAction instanceof GalleryAction.UpdateVideoPosition) {
            GalleryAction.UpdateVideoPosition updateVideoPosition = (GalleryAction.UpdateVideoPosition) galleryAction;
            String link = updateVideoPosition.getPosition().getLink();
            ozonVideo = this.this$0.vo;
            if (!Intrinsics.d(link, (ozonVideo == null || (video = ozonVideo.getVideo()) == null) ? null : video.getLink()) || galleryVideoPlayer3 == null) {
                return;
            }
            galleryVideoPlayer3.setPosition(updateVideoPosition.getPosition().getVideoPosition());
            return;
        }
        if (Intrinsics.d(galleryAction, GalleryAction.Pause.INSTANCE)) {
            galleryVideoPlayer2 = this.this$0.videoPlayer;
            if (galleryVideoPlayer2 != null) {
                galleryVideoPlayer2.pause();
                return;
            }
            return;
        }
        if (!Intrinsics.d(galleryAction, GalleryAction.Resume.INSTANCE) || galleryVideoPlayer == null) {
            return;
        }
        galleryVideoPlayer.resume();
    }
}
