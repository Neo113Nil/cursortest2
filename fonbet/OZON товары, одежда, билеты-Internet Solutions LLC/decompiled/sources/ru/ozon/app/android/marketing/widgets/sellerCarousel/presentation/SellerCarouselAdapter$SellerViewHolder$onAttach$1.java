package ru.ozon.app.android.marketing.widgets.sellerCarousel.presentation;

import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.marketing.widgets.sellerCarousel.presentation.SellerCarouselAdapter;
import ru.ozon.app.android.marketing.widgets.sellerCarousel.presentation.SellerVO;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "", "it", "", "Lru/ozon/app/android/marketing/widgets/sellerCarousel/presentation/SellerVO$ProductVO;", "kotlin.jvm.PlatformType", "invoke", "(Ljava/util/List;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
final class SellerCarouselAdapter$SellerViewHolder$onAttach$1 extends AbstractC7737t implements Function1<List<? extends SellerVO.ProductVO>, Unit> {
    final /* synthetic */ SellerCarouselAdapter.SellerViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SellerCarouselAdapter$SellerViewHolder$onAttach$1(SellerCarouselAdapter.SellerViewHolder sellerViewHolder) {
        super(1);
        this.this$0 = sellerViewHolder;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(List<? extends SellerVO.ProductVO> list) {
        invoke2((List<SellerVO.ProductVO>) list);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(List<SellerVO.ProductVO> list) {
        SellerCarouselAdapter.SellerViewHolder sellerViewHolder = this.this$0;
        Intrinsics.f(list);
        sellerViewHolder.bindImages(list);
    }
}
