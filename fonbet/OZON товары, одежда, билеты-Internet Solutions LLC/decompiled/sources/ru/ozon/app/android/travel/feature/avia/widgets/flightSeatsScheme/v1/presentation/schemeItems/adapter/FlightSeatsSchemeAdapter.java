package ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v1.presentation.schemeItems.adapter;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.avia.shared.airplaneSeat.AirplaneSeatVO;
import ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v1.presentation.schemeItems.FlightSeatsSchemeItem;
import ru.ozon.app.android.travel.utils.coroutineAdapter.CoroutineListDifferAdapter;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B5\u0012\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0018\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00060\b¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/presentation/schemeItems/adapter/FlightSeatsSchemeAdapter;", "Lru/ozon/app/android/travel/utils/coroutineAdapter/CoroutineListDifferAdapter;", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/presentation/schemeItems/FlightSeatsSchemeItem;", "onAction", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "onSeatClickListener", "Lkotlin/Function2;", "", "Lru/ozon/app/android/travel/feature/avia/shared/airplaneSeat/AirplaneSeatVO;", "<init>", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;)V", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class FlightSeatsSchemeAdapter extends CoroutineListDifferAdapter<FlightSeatsSchemeItem> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlightSeatsSchemeAdapter(@NotNull Function1<? super AtomAction, Unit> onAction, @NotNull Function2<? super Integer, ? super AirplaneSeatVO, Unit> onSeatClickListener) {
        super(new FlightSeatsSchemeItemCallback());
        Intrinsics.checkNotNullParameter(onAction, "onAction");
        Intrinsics.checkNotNullParameter(onSeatClickListener, "onSeatClickListener");
        this.delegatesManager.addDelegate(LegendAdapterDelegateKt.legendAdapterDelegate(onAction));
        this.delegatesManager.addDelegate(FlightSeatsSchemeOuterItemAdapterDelegateKt.flightSeatsSchemeOuterItemAdapterDelegate());
        this.delegatesManager.addDelegate(FlightSeatsSchemeExitAdapterDelegateKt.flightSeatsSchemeExitAdapterDelegate());
        this.delegatesManager.addDelegate(FlightSeatsSchemeContentRowAdapterDelegateKt.flightSeatsSchemeContentRowAdapterDelegate(onSeatClickListener));
        this.delegatesManager.addDelegate(FlightSeatsSchemeOrderDetailsAdapterDelegateKt.flightSeatsSchemeOrderDetailsAdapterDelegate(onAction));
    }
}
