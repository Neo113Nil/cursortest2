package ru.ozon.app.android.pdp.widgets.galleryV4.presentation.gallery.video;

import WZ.l;
import WZ.t;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.pdp.ui.configurators.analitycs.TokenizedAnalyticsExtKt;
import ru.ozon.app.android.pdp.widgets.galleryV4.presentation.GalleryV4VO;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class GalleryV4VideoVH$initPlayer$1$3 extends AbstractC7737t implements Function0<Unit> {
    final /* synthetic */ GalleryV4VO.VideoEvents $videoEvents;
    final /* synthetic */ GalleryV4VideoVH this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GalleryV4VideoVH$initPlayer$1$3(GalleryV4VO.VideoEvents videoEvents, GalleryV4VideoVH galleryV4VideoVH) {
        super(0);
        this.$videoEvents = videoEvents;
        this.this$0 = galleryV4VideoVH;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        l lVar;
        t startVideo = this.$videoEvents.getStartVideo();
        if (startVideo != null) {
            lVar = this.this$0.tokenizedAnalytics;
            TokenizedAnalyticsExtKt.processNonViewEvents(lVar, startVideo);
        }
    }
}
