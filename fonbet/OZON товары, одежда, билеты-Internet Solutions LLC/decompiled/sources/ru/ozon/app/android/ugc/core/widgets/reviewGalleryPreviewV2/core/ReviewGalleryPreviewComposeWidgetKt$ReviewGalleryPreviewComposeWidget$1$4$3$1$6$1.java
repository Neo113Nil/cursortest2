package ru.ozon.app.android.ugc.core.widgets.reviewGalleryPreviewV2.core;

import Tg.b;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.ugc.core.widgets.reviewGalleryPreviewV2.presentation.PreviewItemListAdapter;
import ru.ozon.app.android.ugc.core.widgets.reviewGalleryPreviewV2.presentation.ReviewGalleryPreviewV2VO;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "preview", "Lru/ozon/app/android/ugc/core/widgets/reviewGalleryPreviewV2/presentation/ReviewGalleryPreviewV2VO$ItemVO;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class ReviewGalleryPreviewComposeWidgetKt$ReviewGalleryPreviewComposeWidget$1$4$3$1$6$1 extends AbstractC7737t implements Function1<ReviewGalleryPreviewV2VO.ItemVO, Unit> {
    final /* synthetic */ Function1<b, Unit> $actionHandler;
    final /* synthetic */ PreviewItemListAdapter.VideoPreloader $videoPreloader;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    ReviewGalleryPreviewComposeWidgetKt$ReviewGalleryPreviewComposeWidget$1$4$3$1$6$1(PreviewItemListAdapter.VideoPreloader videoPreloader, Function1<? super b, Unit> function1) {
        super(1);
        this.$videoPreloader = videoPreloader;
        this.$actionHandler = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(ReviewGalleryPreviewV2VO.ItemVO itemVO) {
        invoke2(itemVO);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(ReviewGalleryPreviewV2VO.ItemVO preview) {
        Intrinsics.checkNotNullParameter(preview, "preview");
        if (preview.getVideoInfo() != null) {
            this.$videoPreloader.loadVideo(preview.getVideoInfo());
        }
        this.$actionHandler.invoke(preview.getAction());
    }
}
