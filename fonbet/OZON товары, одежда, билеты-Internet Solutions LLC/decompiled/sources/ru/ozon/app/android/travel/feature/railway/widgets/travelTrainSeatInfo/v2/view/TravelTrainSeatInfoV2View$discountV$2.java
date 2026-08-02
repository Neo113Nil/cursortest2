package ru.ozon.app.android.travel.feature.railway.widgets.travelTrainSeatInfo.v2.view;

import android.content.Context;
import com.google.android.flexbox.FlexboxLayout;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/app/android/travel/feature/railway/widgets/travelTrainSeatInfo/v2/view/TravelTrainSeatInfoV2SeatDiscountView;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
final class TravelTrainSeatInfoV2View$discountV$2 extends AbstractC7737t implements Function0<TravelTrainSeatInfoV2SeatDiscountView> {
    final /* synthetic */ Context $context;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TravelTrainSeatInfoV2View$discountV$2(Context context) {
        super(0);
        this.$context = context;
    }

    @Override // kotlin.jvm.functions.Function0
    public final TravelTrainSeatInfoV2SeatDiscountView invoke() {
        TravelTrainSeatInfoV2SeatDiscountView travelTrainSeatInfoV2SeatDiscountView = new TravelTrainSeatInfoV2SeatDiscountView(this.$context);
        travelTrainSeatInfoV2SeatDiscountView.setLayoutParams(new FlexboxLayout.a(-2, -2));
        return travelTrainSeatInfoV2SeatDiscountView;
    }
}
