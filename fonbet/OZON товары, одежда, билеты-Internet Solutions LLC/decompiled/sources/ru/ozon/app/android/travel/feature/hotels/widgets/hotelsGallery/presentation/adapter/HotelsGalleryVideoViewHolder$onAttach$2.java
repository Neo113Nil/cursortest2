package ru.ozon.app.android.travel.feature.hotels.widgets.hotelsGallery.presentation.adapter;

import Sc.s;
import Wc.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.travel.feature.hotels.shared.player.HotelsGalleryVideoPlayer;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsGallery.presentation.GalleryAction;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsGallery.presentation.HotelsGalleryVO;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsGallery.presentation.HotelsGalleryViewModel;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "action", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGallery/presentation/GalleryAction$VideoItemClicked;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.app.android.travel.feature.hotels.widgets.hotelsGallery.presentation.adapter.HotelsGalleryVideoViewHolder$onAttach$2", f = "HotelsGalleryVideoViewHolder.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class HotelsGalleryVideoViewHolder$onAttach$2 extends j implements Function2<GalleryAction.VideoItemClicked, d<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ HotelsGalleryVideoViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HotelsGalleryVideoViewHolder$onAttach$2(HotelsGalleryVideoViewHolder hotelsGalleryVideoViewHolder, d<? super HotelsGalleryVideoViewHolder$onAttach$2> dVar) {
        super(2, dVar);
        this.this$0 = hotelsGalleryVideoViewHolder;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        HotelsGalleryVideoViewHolder$onAttach$2 hotelsGalleryVideoViewHolder$onAttach$2 = new HotelsGalleryVideoViewHolder$onAttach$2(this.this$0, dVar);
        hotelsGalleryVideoViewHolder$onAttach$2.L$0 = obj;
        return hotelsGalleryVideoViewHolder$onAttach$2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0015, code lost:
    
        r1 = (r0 = r7.this$0).videoPlayer;
     */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        HotelsGalleryVO.Video video;
        HotelsGalleryVideoViewHolder hotelsGalleryVideoViewHolder;
        HotelsGalleryVideoPlayer hotelsGalleryVideoPlayer;
        HotelsGalleryVideoPlayer hotelsGalleryVideoPlayer2;
        HotelsGalleryViewModel hotelsGalleryViewModel;
        a aVar = a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        GalleryAction.VideoItemClicked videoItemClicked = (GalleryAction.VideoItemClicked) this.L$0;
        video = this.this$0.vo;
        if (video != null && hotelsGalleryVideoPlayer != null) {
            long position = hotelsGalleryVideoPlayer.getPosition();
            hotelsGalleryVideoPlayer2 = hotelsGalleryVideoViewHolder.videoPlayer;
            if (hotelsGalleryVideoPlayer2 != null) {
                hotelsGalleryVideoPlayer2.pause();
            }
            hotelsGalleryViewModel = hotelsGalleryVideoViewHolder.galleryViewModel;
            hotelsGalleryViewModel.openGalleryVideoFromPosition(video, position, videoItemClicked.getFullScreen(), videoItemClicked.getAtomAction());
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(GalleryAction.VideoItemClicked videoItemClicked, d<? super Unit> dVar) {
        return ((HotelsGalleryVideoViewHolder$onAttach$2) create(videoItemClicked, dVar)).invokeSuspend(Unit.f71690a);
    }
}
