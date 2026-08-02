package ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapInfo.v4.view;

import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapInfo.v4.presentation.HotelsMapInfoV4VO;
import ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapInfo.v4.presentation.analytics.ViewedCardInfo;
import ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapInfo.v4.presentation.cards.CardsAdapter;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "position", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
final class HotelsMapInfoV4View$onPositionChangeListener$1 extends AbstractC7737t implements Function1<Integer, Unit> {
    final /* synthetic */ HotelsMapInfoV4View this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HotelsMapInfoV4View$onPositionChangeListener$1(HotelsMapInfoV4View hotelsMapInfoV4View) {
        super(1);
        this.this$0 = hotelsMapInfoV4View;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
        invoke(num.intValue());
        return Unit.f71690a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0034, code lost:
    
        r2 = r4.this$0.onSlideCardAction;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0017, code lost:
    
        r1 = r4.this$0.cardsAdapter;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void invoke(int i11) {
        CardsAdapter cardsAdapter;
        List<HotelsMapInfoV4VO.CardState> currentList;
        HotelsMapInfoV4VO.CardState cardState;
        CardsAdapter cardsAdapter2;
        List<HotelsMapInfoV4VO.CardState> currentList2;
        HotelsMapInfoV4VO.CardState cardState2;
        String id2;
        Function1 function1;
        cardsAdapter = this.this$0.cardsAdapter;
        if (cardsAdapter == null || (currentList = cardsAdapter.getCurrentList()) == null || (cardState = (HotelsMapInfoV4VO.CardState) C7714v.Q(i11, currentList)) == null || cardsAdapter2 == null || (currentList2 = cardsAdapter2.getCurrentList()) == null || (cardState2 = (HotelsMapInfoV4VO.CardState) C7714v.M(currentList2)) == null || (id2 = cardState2.getId()) == null || function1 == null) {
            return;
        }
        function1.invoke(new ViewedCardInfo(cardState, i11, id2));
    }
}
