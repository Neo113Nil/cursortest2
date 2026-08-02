package ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v1.di;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.action.di.ActionComponentApi;
import ru.ozon.app.android.action.v2.ActionV2Repository;
import ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v1.data.orderDetails.FlightSeatsSchemeOrderDetailsMapper;
import ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v1.data.passengers.FlightSeatsSchemePassengersBlockMapper;
import ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v1.data.scheme.FlightSeatsSchemeBlockMapper;
import ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v1.presentation.FlightSeatsSchemeViewModel;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LPc/a;", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/presentation/FlightSeatsSchemeViewModel;", "invoke", "()LPc/a;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes10.dex */
final class FlightSeatsSchemeComponent$Companion$create$1$1$viewModelProvider$2 extends AbstractC7737t implements Function0<Pc.a<FlightSeatsSchemeViewModel>> {
    final /* synthetic */ FlightSeatsSchemeComponent$Companion$create$1$1 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FlightSeatsSchemeComponent$Companion$create$1$1$viewModelProvider$2(FlightSeatsSchemeComponent$Companion$create$1$1 flightSeatsSchemeComponent$Companion$create$1$1) {
        super(0);
        this.this$0 = flightSeatsSchemeComponent$Companion$create$1$1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FlightSeatsSchemeViewModel invoke$lambda$0(FlightSeatsSchemeComponent$Companion$create$1$1 flightSeatsSchemeComponent$Companion$create$1$1) {
        ActionComponentApi actionComponentApi;
        FlightSeatsSchemePassengersBlockMapper passengersBlockMapper;
        FlightSeatsSchemeBlockMapper blockMapper;
        FlightSeatsSchemeOrderDetailsMapper orderDetailsMapper;
        actionComponentApi = flightSeatsSchemeComponent$Companion$create$1$1.actionComponentApi;
        ActionV2Repository actionRepository = actionComponentApi.getActionRepository();
        passengersBlockMapper = flightSeatsSchemeComponent$Companion$create$1$1.getPassengersBlockMapper();
        blockMapper = flightSeatsSchemeComponent$Companion$create$1$1.getBlockMapper();
        orderDetailsMapper = flightSeatsSchemeComponent$Companion$create$1$1.getOrderDetailsMapper();
        return new FlightSeatsSchemeViewModel(actionRepository, passengersBlockMapper, blockMapper, orderDetailsMapper);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final Pc.a<FlightSeatsSchemeViewModel> invoke() {
        final FlightSeatsSchemeComponent$Companion$create$1$1 flightSeatsSchemeComponent$Companion$create$1$1 = this.this$0;
        return new Pc.a() { // from class: ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v1.di.b
            @Override // Pc.a
            public final Object get() {
                FlightSeatsSchemeViewModel invoke$lambda$0;
                invoke$lambda$0 = FlightSeatsSchemeComponent$Companion$create$1$1$viewModelProvider$2.invoke$lambda$0(FlightSeatsSchemeComponent$Companion$create$1$1.this);
                return invoke$lambda$0;
            }
        };
    }
}
