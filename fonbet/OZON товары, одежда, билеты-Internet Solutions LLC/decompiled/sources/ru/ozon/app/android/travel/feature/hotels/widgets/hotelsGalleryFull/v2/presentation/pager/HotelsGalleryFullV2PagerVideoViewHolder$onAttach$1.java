package ru.ozon.app.android.travel.feature.hotels.widgets.hotelsGalleryFull.v2.presentation.pager;

import Sc.s;
import Wc.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.travel.feature.hotels.shared.player.HotelsGalleryVideoPlayer;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "isSoundMuted", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.app.android.travel.feature.hotels.widgets.hotelsGalleryFull.v2.presentation.pager.HotelsGalleryFullV2PagerVideoViewHolder$onAttach$1", f = "HotelsGalleryFullV2PagerVideoViewHolder.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class HotelsGalleryFullV2PagerVideoViewHolder$onAttach$1 extends j implements Function2<Boolean, d<? super Unit>, Object> {
    /* synthetic */ boolean Z$0;
    int label;
    final /* synthetic */ HotelsGalleryFullV2PagerVideoViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HotelsGalleryFullV2PagerVideoViewHolder$onAttach$1(HotelsGalleryFullV2PagerVideoViewHolder hotelsGalleryFullV2PagerVideoViewHolder, d<? super HotelsGalleryFullV2PagerVideoViewHolder$onAttach$1> dVar) {
        super(2, dVar);
        this.this$0 = hotelsGalleryFullV2PagerVideoViewHolder;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        HotelsGalleryFullV2PagerVideoViewHolder$onAttach$1 hotelsGalleryFullV2PagerVideoViewHolder$onAttach$1 = new HotelsGalleryFullV2PagerVideoViewHolder$onAttach$1(this.this$0, dVar);
        hotelsGalleryFullV2PagerVideoViewHolder$onAttach$1.Z$0 = ((Boolean) obj).booleanValue();
        return hotelsGalleryFullV2PagerVideoViewHolder$onAttach$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Boolean bool, d<? super Unit> dVar) {
        return invoke(bool.booleanValue(), dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        HotelsGalleryVideoPlayer hotelsGalleryVideoPlayer;
        a aVar = a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        boolean z11 = this.Z$0;
        hotelsGalleryVideoPlayer = this.this$0.videoPlayer;
        if (hotelsGalleryVideoPlayer != null) {
            hotelsGalleryVideoPlayer.setMuted(z11);
        }
        this.this$0.updateSoundIcon(z11);
        return Unit.f71690a;
    }

    public final Object invoke(boolean z11, d<? super Unit> dVar) {
        return ((HotelsGalleryFullV2PagerVideoViewHolder$onAttach$1) create(Boolean.valueOf(z11), dVar)).invokeSuspend(Unit.f71690a);
    }
}
