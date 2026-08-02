package ru.ozon.app.android.travel.feature.tours.widgets.toursSearchResult.view;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.travel.feature.tours.widgets.toursSearchResult.presentation.ToursSearchResultVO;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class ToursSearchResultHotelView$imagesAdapter$1 extends AbstractC7737t implements Function0<Unit> {
    final /* synthetic */ ToursSearchResultHotelView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ToursSearchResultHotelView$imagesAdapter$1(ToursSearchResultHotelView toursSearchResultHotelView) {
        super(0);
        this.this$0 = toursSearchResultHotelView;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.f71690a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x000e, code lost:
    
        r1 = r2.this$0.onAction;
     */
    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void invoke2() {
        ToursSearchResultVO.HotelVO hotelVO;
        AtomAction selectAction;
        Function1 function1;
        hotelVO = this.this$0.boundedData;
        if (hotelVO == null || (selectAction = hotelVO.getSelectAction()) == null || function1 == null) {
            return;
        }
        function1.invoke(selectAction);
    }
}
