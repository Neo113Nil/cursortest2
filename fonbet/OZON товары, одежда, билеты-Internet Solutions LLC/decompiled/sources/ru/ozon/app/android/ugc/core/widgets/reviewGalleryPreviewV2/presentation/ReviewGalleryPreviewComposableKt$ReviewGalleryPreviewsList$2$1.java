package ru.ozon.app.android.ugc.core.widgets.reviewGalleryPreviewV2.presentation;

import WZ.t;
import a1.C4912a;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.ugc.core.widgets.reviewGalleryPreviewV2.presentation.ReviewGalleryPreviewV2VO;
import v0.G;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lv0/G;", "", "invoke", "(Lv0/G;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes2.dex */
final class ReviewGalleryPreviewComposableKt$ReviewGalleryPreviewsList$2$1 extends AbstractC7737t implements Function1<G, Unit> {
    final /* synthetic */ Function1<ReviewGalleryPreviewV2VO.ItemVO, Unit> $onItemClick;
    final /* synthetic */ Function1<t, Unit> $onView;
    final /* synthetic */ List<ReviewGalleryPreviewV2VO.ItemVO> $previews;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    ReviewGalleryPreviewComposableKt$ReviewGalleryPreviewsList$2$1(List<ReviewGalleryPreviewV2VO.ItemVO> list, Function1<? super t, Unit> function1, Function1<? super ReviewGalleryPreviewV2VO.ItemVO, Unit> function12) {
        super(1);
        this.$previews = list;
        this.$onView = function1;
        this.$onItemClick = function12;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(G g10) {
        invoke2(g10);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(G LazyRow) {
        Intrinsics.checkNotNullParameter(LazyRow, "$this$LazyRow");
        List<ReviewGalleryPreviewV2VO.ItemVO> list = this.$previews;
        Function1<t, Unit> function1 = this.$onView;
        Function1<ReviewGalleryPreviewV2VO.ItemVO, Unit> function12 = this.$onItemClick;
        LazyRow.a(list.size(), null, new ReviewGalleryPreviewComposableKt$ReviewGalleryPreviewsList$2$1$invoke$$inlined$items$default$3(ReviewGalleryPreviewComposableKt$ReviewGalleryPreviewsList$2$1$invoke$$inlined$items$default$1.INSTANCE, list), new C4912a(true, -632812321, new ReviewGalleryPreviewComposableKt$ReviewGalleryPreviewsList$2$1$invoke$$inlined$items$default$4(list, function1, function12)));
    }
}
