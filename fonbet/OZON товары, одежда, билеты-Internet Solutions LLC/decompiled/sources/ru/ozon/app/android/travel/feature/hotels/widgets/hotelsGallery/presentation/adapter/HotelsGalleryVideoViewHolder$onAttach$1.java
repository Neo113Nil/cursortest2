package ru.ozon.app.android.travel.feature.hotels.widgets.hotelsGallery.presentation.adapter;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.travel.feature.hotels.shared.player.HotelsGalleryVideoPlayer;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "isSoundMuted", "", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Boolean;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
final class HotelsGalleryVideoViewHolder$onAttach$1 extends AbstractC7737t implements Function1<Boolean, Unit> {
    final /* synthetic */ HotelsGalleryVideoViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HotelsGalleryVideoViewHolder$onAttach$1(HotelsGalleryVideoViewHolder hotelsGalleryVideoViewHolder) {
        super(1);
        this.this$0 = hotelsGalleryVideoViewHolder;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
        invoke2(bool);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(Boolean bool) {
        HotelsGalleryVideoPlayer hotelsGalleryVideoPlayer;
        hotelsGalleryVideoPlayer = this.this$0.videoPlayer;
        if (hotelsGalleryVideoPlayer != null) {
            Intrinsics.f(bool);
            hotelsGalleryVideoPlayer.setMuted(bool.booleanValue());
        }
    }
}
