package ru.ozon.app.android.pdp.widgets.galleryV5.presentation.gallery.video;

import WZ.t;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.pdp.ui.configurators.analitycs.TokenizedAnalyticsExtKt;
import ru.ozon.app.android.pdp.widgets.galleryV5.presentation.GalleryV5VO;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class GalleryV5VideoVH$initPlayer$1$2 extends AbstractC7737t implements Function0<Unit> {
    final /* synthetic */ GalleryV5VO.VideoEvents $videoEvents;
    final /* synthetic */ GalleryV5VideoVH this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GalleryV5VideoVH$initPlayer$1$2(GalleryV5VideoVH galleryV5VideoVH, GalleryV5VO.VideoEvents videoEvents) {
        super(0);
        this.this$0 = galleryV5VideoVH;
        this.$videoEvents = videoEvents;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        boolean z11;
        Function0 function0;
        this.this$0.videoView.hideProgress();
        this.this$0.videoView.hidePreview();
        z11 = this.this$0.isSecondFrame;
        if (z11) {
            t endVideo = this.$videoEvents.getEndVideo();
            if (endVideo != null) {
                TokenizedAnalyticsExtKt.processNonViewEvents(this.this$0.tokenizedAnalytics, endVideo);
            }
        } else {
            this.this$0.isSecondFrame = true;
        }
        function0 = this.this$0.onRenderFirstFrame;
        function0.invoke();
    }
}
