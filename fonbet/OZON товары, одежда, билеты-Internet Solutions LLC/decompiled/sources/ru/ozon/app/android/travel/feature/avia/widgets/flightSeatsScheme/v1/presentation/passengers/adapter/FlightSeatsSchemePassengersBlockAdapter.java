package ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v1.presentation.passengers.adapter;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v1.presentation.passengers.FlightSeatsSchemePassengersBlockVO;
import ru.ozon.app.android.travel.utils.coroutineAdapter.CoroutineListDifferAdapter;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B#\u0012\u001a\u0010\u0006\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/presentation/passengers/adapter/FlightSeatsSchemePassengersBlockAdapter;", "Lru/ozon/app/android/travel/utils/coroutineAdapter/CoroutineListDifferAdapter;", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/presentation/passengers/FlightSeatsSchemePassengersBlockVO$Passenger;", "Lkotlin/Function2;", "", "", "onPassengerSelected", "<init>", "(Lkotlin/jvm/functions/Function2;)V", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class FlightSeatsSchemePassengersBlockAdapter extends CoroutineListDifferAdapter<FlightSeatsSchemePassengersBlockVO.Passenger> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlightSeatsSchemePassengersBlockAdapter(@NotNull Function2<? super Integer, ? super FlightSeatsSchemePassengersBlockVO.Passenger, Unit> onPassengerSelected) {
        super(new FlightSeatsSchemePassengersBlockItemCallback());
        Intrinsics.checkNotNullParameter(onPassengerSelected, "onPassengerSelected");
        this.delegatesManager.addDelegate(FlightSeatsSchemePassengersBlockAdapterDelegateKt.flightSeatsSchemePassengersBlockAdapterDelegate(onPassengerSelected));
    }
}
