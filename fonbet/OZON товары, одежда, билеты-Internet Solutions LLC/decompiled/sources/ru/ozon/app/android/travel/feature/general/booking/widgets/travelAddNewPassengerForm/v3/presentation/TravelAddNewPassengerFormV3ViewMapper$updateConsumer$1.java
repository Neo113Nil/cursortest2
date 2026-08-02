package ru.ozon.app.android.travel.feature.general.booking.widgets.travelAddNewPassengerForm.v3.presentation;

import A00.a;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"LA00/a$J$a;", "update", "Lru/ozon/app/android/travel/feature/general/booking/widgets/travelAddNewPassengerForm/v3/presentation/TravelAddNewPassengerFormV3VO;", "oldVO", "invoke", "(LA00/a$J$a;Lru/ozon/app/android/travel/feature/general/booking/widgets/travelAddNewPassengerForm/v3/presentation/TravelAddNewPassengerFormV3VO;)Lru/ozon/app/android/travel/feature/general/booking/widgets/travelAddNewPassengerForm/v3/presentation/TravelAddNewPassengerFormV3VO;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes7.dex */
final class TravelAddNewPassengerFormV3ViewMapper$updateConsumer$1 extends AbstractC7737t implements Function2<a.J.InterfaceC0007a, TravelAddNewPassengerFormV3VO, TravelAddNewPassengerFormV3VO> {
    public static final TravelAddNewPassengerFormV3ViewMapper$updateConsumer$1 INSTANCE = new TravelAddNewPassengerFormV3ViewMapper$updateConsumer$1();

    TravelAddNewPassengerFormV3ViewMapper$updateConsumer$1() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    public final TravelAddNewPassengerFormV3VO invoke(a.J.InterfaceC0007a update, TravelAddNewPassengerFormV3VO oldVO) {
        Intrinsics.checkNotNullParameter(update, "update");
        Intrinsics.checkNotNullParameter(oldVO, "oldVO");
        if (update instanceof UpdateIsInputV2ChangedByClient) {
            return TravelAddNewPassengerFormV3VO.copy$default(oldVO, 0L, ((UpdateIsInputV2ChangedByClient) update).getInputItems(), null, null, null, true, null, null, 221, null);
        }
        return null;
    }
}
