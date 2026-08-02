package ru.ozon.app.android.travel.feature.hotels.widgets.hotelsGalleryFull.v1.presentation.pager;

import WZ.l;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.pdp.ui.configurators.analitycs.TokenizedAnalyticsExtKt;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsGalleryFull.v1.presentation.HotelsGalleryFullVI;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
final class HotelsGalleryFullPagerVideoViewHolder$initPlayer$1$2 extends AbstractC7737t implements Function0<Unit> {
    final /* synthetic */ HotelsGalleryFullPagerVideoViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HotelsGalleryFullPagerVideoViewHolder$initPlayer$1$2(HotelsGalleryFullPagerVideoViewHolder hotelsGalleryFullPagerVideoViewHolder) {
        super(0);
        this.this$0 = hotelsGalleryFullPagerVideoViewHolder;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        boolean z11;
        l lVar;
        HotelsGalleryFullVI.Video video;
        HotelsGalleryFullVI.VideoTokenizedEvent videoTrackingInfo;
        this.this$0.showProgress(false);
        this.this$0.hidePreview();
        z11 = this.this$0.isSecondFrame;
        if (!z11) {
            this.this$0.isSecondFrame = true;
            return;
        }
        lVar = this.this$0.tokenizedAnalytics;
        video = this.this$0.vo;
        TokenizedAnalyticsExtKt.processNonViewEvents(lVar, (video == null || (videoTrackingInfo = video.getVideoTrackingInfo()) == null) ? null : videoTrackingInfo.getEndVideo());
    }
}
