package ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapInfo.v4.view;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapInfo.v4.presentation.HotelsMapInfoV4VO;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
final class HotelCardView$clickCardListener$1 extends AbstractC7737t implements Function0<Unit> {
    final /* synthetic */ HotelCardView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HotelCardView$clickCardListener$1(HotelCardView hotelCardView) {
        super(0);
        this.this$0 = hotelCardView;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.f71690a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0022, code lost:
    
        r3 = r1.onAction;
     */
    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void invoke2() {
        HotelsMapInfoV4VO.CardState cardState;
        HotelsMapInfoV4VO.Card partialState;
        Function1 function1;
        Function1 function12;
        cardState = this.this$0.item;
        if (cardState != null) {
            HotelCardView hotelCardView = this.this$0;
            if (cardState instanceof HotelsMapInfoV4VO.Card) {
                partialState = (HotelsMapInfoV4VO.Card) cardState;
            } else if (!(cardState instanceof HotelsMapInfoV4VO.PriceLoader)) {
                return;
            } else {
                partialState = ((HotelsMapInfoV4VO.PriceLoader) cardState).getPartialState();
            }
            AtomAction action = partialState.getAction();
            if (action == null || function1 == null) {
                return;
            }
            function12 = hotelCardView.onClickEvent;
            if (function12 != null) {
                function12.invoke(partialState);
            }
            function1.invoke(action);
        }
    }
}
