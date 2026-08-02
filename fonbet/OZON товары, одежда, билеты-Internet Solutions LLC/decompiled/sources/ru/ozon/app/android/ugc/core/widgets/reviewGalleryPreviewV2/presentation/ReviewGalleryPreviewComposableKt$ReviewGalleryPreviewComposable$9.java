package ru.ozon.app.android.ugc.core.widgets.reviewGalleryPreviewV2.presentation;

import Bl0.C2652m;
import S0.InterfaceC3967k;
import WZ.t;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.ugc.core.widgets.reviewGalleryPreviewV2.presentation.ReviewGalleryPreviewV2VO;
import ru.ozon.uni.atoms.af.AtomAction;
import v0.I;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class ReviewGalleryPreviewComposableKt$ReviewGalleryPreviewComposable$9 extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ ReviewGalleryPreviewV2VO $item;
    final /* synthetic */ I $listState;
    final /* synthetic */ Function1<AtomAction, Unit> $onAction;
    final /* synthetic */ Function1<ReviewGalleryPreviewV2VO.ItemVO, Unit> $onItemClick;
    final /* synthetic */ Function2<Integer, Integer, Unit> $onLoadNext;
    final /* synthetic */ Function2<Integer, Integer, Unit> $onScroll;
    final /* synthetic */ Function1<t, Unit> $onView;
    final /* synthetic */ List<ReviewGalleryPreviewV2VO.ItemVO> $previews;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    ReviewGalleryPreviewComposableKt$ReviewGalleryPreviewComposable$9(ReviewGalleryPreviewV2VO reviewGalleryPreviewV2VO, List<ReviewGalleryPreviewV2VO.ItemVO> list, Function2<? super Integer, ? super Integer, Unit> function2, Function2<? super Integer, ? super Integer, Unit> function22, Function1<? super t, Unit> function1, Function1<? super ReviewGalleryPreviewV2VO.ItemVO, Unit> function12, Function1<? super AtomAction, Unit> function13, I i11, int i12, int i13) {
        super(2);
        this.$item = reviewGalleryPreviewV2VO;
        this.$previews = list;
        this.$onScroll = function2;
        this.$onLoadNext = function22;
        this.$onView = function1;
        this.$onItemClick = function12;
        this.$onAction = function13;
        this.$listState = i11;
        this.$$changed = i12;
        this.$$default = i13;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        invoke(interfaceC3967k, num.intValue());
        return Unit.f71690a;
    }

    public final void invoke(InterfaceC3967k interfaceC3967k, int i11) {
        ReviewGalleryPreviewComposableKt.ReviewGalleryPreviewComposable(this.$item, this.$previews, this.$onScroll, this.$onLoadNext, this.$onView, this.$onItemClick, this.$onAction, this.$listState, interfaceC3967k, C2652m.e(this.$$changed | 1), this.$$default);
    }
}
