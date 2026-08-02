package ru.ozon.app.android.fresh.main.widgets.promoCarousel.adapter;

import android.view.View;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.fresh.main.widgets.promoCarousel.presentation.PromoCarouselVO;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
final class PromoCarouselBannerViewHolder$bind$2 extends AbstractC7737t implements Function1<View, Unit> {
    final /* synthetic */ PromoCarouselVO.PromoCarouselBannerVO $item;
    final /* synthetic */ PromoCarouselBannerViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PromoCarouselBannerViewHolder$bind$2(PromoCarouselBannerViewHolder promoCarouselBannerViewHolder, PromoCarouselVO.PromoCarouselBannerVO promoCarouselBannerVO) {
        super(1);
        this.this$0 = promoCarouselBannerViewHolder;
        this.$item = promoCarouselBannerVO;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(View view) {
        invoke2(view);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(View it) {
        Function1 function1;
        Intrinsics.checkNotNullParameter(it, "it");
        function1 = this.this$0.actionHandler;
        function1.invoke(this.$item.getAtomAction());
    }
}
