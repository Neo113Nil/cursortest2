package ru.ozon.app.android.travel.feature.hotels.widgets.hotelsGalleryFull.v1.presentation.pager;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import ru.ozon.app.android.logger.BxLogger;
import ru.ozon.app.android.travel.feature.hotels.shared.player.HotelsGalleryVideoPlayer;

@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u000e\u0010\u0004\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "message", "", "error", "Ljava/lang/Exception;", "Lkotlin/Exception;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
final class HotelsGalleryFullPagerVideoViewHolder$initPlayer$1$3 extends AbstractC7737t implements Function2<String, Exception, Unit> {
    final /* synthetic */ HotelsGalleryFullPagerVideoViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HotelsGalleryFullPagerVideoViewHolder$initPlayer$1$3(HotelsGalleryFullPagerVideoViewHolder hotelsGalleryFullPagerVideoViewHolder) {
        super(2);
        this.this$0 = hotelsGalleryFullPagerVideoViewHolder;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(String str, Exception exc) {
        invoke2(str, exc);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(String message, Exception exc) {
        Intrinsics.checkNotNullParameter(message, "message");
        this.this$0.showProgress(false);
        BxLogger.INSTANCE.log(6, N.b(HotelsGalleryVideoPlayer.class).B(), message + ", exception=" + exc);
    }
}
