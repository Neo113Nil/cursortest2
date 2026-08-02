package ru.ozon.app.android.pdp.widgets.galleryV3.presentation.viewpager;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.pdp.ui.configurators.pdp.gallery.v3.GalleryV3VO;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "videoItem", "Lru/ozon/app/android/pdp/ui/configurators/pdp/gallery/v3/GalleryV3VO$Item$OzonVideo;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class GalleryRecyclerAdapter$onCreateViewHolder$1 extends AbstractC7737t implements Function1<GalleryV3VO.Item.OzonVideo, Unit> {
    final /* synthetic */ GalleryRecyclerAdapter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GalleryRecyclerAdapter$onCreateViewHolder$1(GalleryRecyclerAdapter galleryRecyclerAdapter) {
        super(1);
        this.this$0 = galleryRecyclerAdapter;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(GalleryV3VO.Item.OzonVideo ozonVideo) {
        invoke2(ozonVideo);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(GalleryV3VO.Item.OzonVideo videoItem) {
        Function1 function1;
        Intrinsics.checkNotNullParameter(videoItem, "videoItem");
        function1 = this.this$0.onItemClickListener;
        function1.invoke(videoItem);
    }
}
