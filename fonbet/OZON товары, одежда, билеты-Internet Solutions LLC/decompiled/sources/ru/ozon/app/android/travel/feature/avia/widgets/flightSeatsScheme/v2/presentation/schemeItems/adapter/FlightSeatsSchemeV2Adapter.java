package ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v2.presentation.schemeItems.adapter;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v2.presentation.airplaneSeat.AirplaneSeatTypeV2VI;
import ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v2.presentation.schemeItems.FlightSeatsSchemeV2Item;
import ru.ozon.app.android.travel.utils.coroutineAdapter.CoroutineListDifferAdapter;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BI\u0012\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0018\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00060\t¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/presentation/schemeItems/adapter/FlightSeatsSchemeV2Adapter;", "Lru/ozon/app/android/travel/utils/coroutineAdapter/CoroutineListDifferAdapter;", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/presentation/schemeItems/FlightSeatsSchemeV2Item;", "onAction", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "emergencySeatsActionHandler", "onSeatClickListener", "Lkotlin/Function2;", "", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/presentation/airplaneSeat/AirplaneSeatTypeV2VI;", "<init>", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;)V", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class FlightSeatsSchemeV2Adapter extends CoroutineListDifferAdapter<FlightSeatsSchemeV2Item> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlightSeatsSchemeV2Adapter(@NotNull Function1<? super AtomAction, Unit> onAction, @NotNull Function1<? super AtomAction, Unit> emergencySeatsActionHandler, @NotNull Function2<? super Integer, ? super AirplaneSeatTypeV2VI, Unit> onSeatClickListener) {
        super(new FlightSeatsSchemeV2ItemCallback());
        Intrinsics.checkNotNullParameter(onAction, "onAction");
        Intrinsics.checkNotNullParameter(emergencySeatsActionHandler, "emergencySeatsActionHandler");
        Intrinsics.checkNotNullParameter(onSeatClickListener, "onSeatClickListener");
        this.delegatesManager.addDelegate(LegendAdapterDelegateV2Kt.legendAdapterDelegateV2(onAction));
        this.delegatesManager.addDelegate(FlightSeatsSchemeV2OuterItemAdapterDelegateKt.flightSeatsSchemeV2OuterItemAdapterDelegate());
        this.delegatesManager.addDelegate(FlightSeatsSchemeV2ExitAdapterDelegateKt.flightSeatsSchemeV2ExitAdapterDelegate());
        this.delegatesManager.addDelegate(FlightSeatsSchemeV2ContentRowAdapterDelegateKt.flightSeatsSchemeV2ContentRowAdapterDelegate(onSeatClickListener, emergencySeatsActionHandler));
    }
}
