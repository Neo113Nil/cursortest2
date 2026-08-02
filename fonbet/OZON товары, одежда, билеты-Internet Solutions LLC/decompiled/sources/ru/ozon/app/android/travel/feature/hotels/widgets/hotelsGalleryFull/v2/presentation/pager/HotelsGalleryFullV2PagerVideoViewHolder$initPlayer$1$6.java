package ru.ozon.app.android.travel.feature.hotels.widgets.hotelsGalleryFull.v2.presentation.pager;

import androidx.appcompat.widget.AppCompatImageView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.travel.feature.hotels.databinding.ItemHotelsGalleryFullVideoBinding;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsGalleryFull.v2.presentation.pager.HotelsGalleryFullV2PagerVideoViewHolder;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
final class HotelsGalleryFullV2PagerVideoViewHolder$initPlayer$1$6 extends AbstractC7737t implements Function0<Unit> {
    final /* synthetic */ HotelsGalleryFullV2PagerVideoViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HotelsGalleryFullV2PagerVideoViewHolder$initPlayer$1$6(HotelsGalleryFullV2PagerVideoViewHolder hotelsGalleryFullV2PagerVideoViewHolder) {
        super(0);
        this.this$0 = hotelsGalleryFullV2PagerVideoViewHolder;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ItemHotelsGalleryFullVideoBinding itemHotelsGalleryFullVideoBinding;
        itemHotelsGalleryFullVideoBinding = this.this$0.binding;
        AppCompatImageView playerControlsButtonIv = itemHotelsGalleryFullVideoBinding.playerControlsButtonIv;
        Intrinsics.checkNotNullExpressionValue(playerControlsButtonIv, "playerControlsButtonIv");
        if (playerControlsButtonIv.getVisibility() == 0) {
            return;
        }
        this.this$0.showControlIcon(HotelsGalleryFullV2PagerVideoViewHolder.IconType.PLAY);
    }
}
