package ru.ozon.app.android.travel.feature.general.booking.widgets.travelAddNewPassengerForm.v3.di;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.network.di.NetworkComponentApi;
import ru.ozon.app.android.travel.feature.general.booking.widgets.travelAddNewPassengerForm.v3.data.TravelAddNewPassengerFormV3ResultApi;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "Lru/ozon/app/android/travel/feature/general/booking/widgets/travelAddNewPassengerForm/v3/data/TravelAddNewPassengerFormV3ResultApi;", "kotlin.jvm.PlatformType", "invoke", "()Lru/ozon/app/android/travel/feature/general/booking/widgets/travelAddNewPassengerForm/v3/data/TravelAddNewPassengerFormV3ResultApi;"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
final class TravelAddNewPassengerFormV3Component$Companion$create$1$1$travelAddNewPassengerFormV3ResultApi$2 extends AbstractC7737t implements Function0<TravelAddNewPassengerFormV3ResultApi> {
    final /* synthetic */ TravelAddNewPassengerFormV3Component$Companion$create$1$1 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TravelAddNewPassengerFormV3Component$Companion$create$1$1$travelAddNewPassengerFormV3ResultApi$2(TravelAddNewPassengerFormV3Component$Companion$create$1$1 travelAddNewPassengerFormV3Component$Companion$create$1$1) {
        super(0);
        this.this$0 = travelAddNewPassengerFormV3Component$Companion$create$1$1;
    }

    @Override // kotlin.jvm.functions.Function0
    public final TravelAddNewPassengerFormV3ResultApi invoke() {
        NetworkComponentApi networkComponentApi;
        networkComponentApi = this.this$0.networkComponentApi;
        return (TravelAddNewPassengerFormV3ResultApi) networkComponentApi.getRetrofit().create(TravelAddNewPassengerFormV3ResultApi.class);
    }
}
