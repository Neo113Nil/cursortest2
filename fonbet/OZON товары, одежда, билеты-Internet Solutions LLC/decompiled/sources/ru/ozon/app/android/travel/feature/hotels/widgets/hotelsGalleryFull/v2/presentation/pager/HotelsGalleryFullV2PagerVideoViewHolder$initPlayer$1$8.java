package ru.ozon.app.android.travel.feature.hotels.widgets.hotelsGalleryFull.v2.presentation.pager;

import androidx.appcompat.widget.AppCompatImageView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.travel.feature.hotels.databinding.ItemHotelsGalleryFullVideoBinding;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "hasAudio", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
final class HotelsGalleryFullV2PagerVideoViewHolder$initPlayer$1$8 extends AbstractC7737t implements Function1<Boolean, Unit> {
    final /* synthetic */ HotelsGalleryFullV2PagerVideoViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HotelsGalleryFullV2PagerVideoViewHolder$initPlayer$1$8(HotelsGalleryFullV2PagerVideoViewHolder hotelsGalleryFullV2PagerVideoViewHolder) {
        super(1);
        this.this$0 = hotelsGalleryFullV2PagerVideoViewHolder;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
        invoke(bool.booleanValue());
        return Unit.f71690a;
    }

    public final void invoke(boolean z11) {
        ItemHotelsGalleryFullVideoBinding itemHotelsGalleryFullVideoBinding;
        itemHotelsGalleryFullVideoBinding = this.this$0.binding;
        AppCompatImageView soundControlIv = itemHotelsGalleryFullVideoBinding.soundControlIv;
        Intrinsics.checkNotNullExpressionValue(soundControlIv, "soundControlIv");
        soundControlIv.setVisibility(z11 ? 0 : 8);
    }
}
