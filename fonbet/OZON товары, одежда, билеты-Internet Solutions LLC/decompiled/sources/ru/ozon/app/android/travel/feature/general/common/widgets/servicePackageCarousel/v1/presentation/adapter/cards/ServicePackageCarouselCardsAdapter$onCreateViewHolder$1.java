package ru.ozon.app.android.travel.feature.general.common.widgets.servicePackageCarousel.v1.presentation.adapter.cards;

import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.travel.feature.general.common.widgets.servicePackageCarousel.v1.presentation.ServicePackageCarouselVO;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "id", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
final class ServicePackageCarouselCardsAdapter$onCreateViewHolder$1 extends AbstractC7737t implements Function1<Integer, Unit> {
    final /* synthetic */ ServicePackageCarouselCardsAdapter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ServicePackageCarouselCardsAdapter$onCreateViewHolder$1(ServicePackageCarouselCardsAdapter servicePackageCarouselCardsAdapter) {
        super(1);
        this.this$0 = servicePackageCarouselCardsAdapter;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
        invoke(num.intValue());
        return Unit.f71690a;
    }

    public final void invoke(int i11) {
        Function2<Integer, List<ServicePackageCarouselVO.ServicePackageCarouselCardVO>, Unit> cardOnFocusCallback = this.this$0.getCardOnFocusCallback();
        if (cardOnFocusCallback != null) {
            Integer valueOf = Integer.valueOf(i11);
            List<ServicePackageCarouselVO.ServicePackageCarouselCardVO> currentList = this.this$0.getCurrentList();
            Intrinsics.checkNotNullExpressionValue(currentList, "getCurrentList(...)");
            cardOnFocusCallback.invoke(valueOf, currentList);
        }
    }
}
