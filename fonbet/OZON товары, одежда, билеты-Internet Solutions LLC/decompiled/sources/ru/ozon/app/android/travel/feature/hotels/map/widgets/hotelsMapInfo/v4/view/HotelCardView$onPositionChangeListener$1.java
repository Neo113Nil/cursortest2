package ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapInfo.v4.view;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapInfo.v4.presentation.HotelsMapInfoV4VO;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "position", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
final class HotelCardView$onPositionChangeListener$1 extends AbstractC7737t implements Function1<Integer, Unit> {
    final /* synthetic */ HotelCardView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HotelCardView$onPositionChangeListener$1(HotelCardView hotelCardView) {
        super(1);
        this.this$0 = hotelCardView;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
        invoke(num.intValue());
        return Unit.f71690a;
    }

    public final void invoke(int i11) {
        Integer num;
        Function2 function2;
        HotelsMapInfoV4VO.CardState cardState;
        num = this.this$0.previousImageScrollPosition;
        if (num == null && i11 == 0) {
            return;
        }
        function2 = this.this$0.onSlideImageEvent;
        if (function2 != null) {
            cardState = this.this$0.item;
            HotelsMapInfoV4VO.Card card = cardState instanceof HotelsMapInfoV4VO.Card ? (HotelsMapInfoV4VO.Card) cardState : null;
            function2.invoke(card != null ? card.getGallerySlideEvent() : null, Integer.valueOf(i11 + 1));
        }
        this.this$0.previousImageScrollPosition = Integer.valueOf(i11);
    }
}
