package ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v1.presentation.schemeItems.adapter;

import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.adapterdelegates.AdapterDelegate;
import ru.ozon.app.android.adapterdelegates.dsl.DslViewBindingListAdapterDelegate;
import ru.ozon.app.android.travel.feature.avia.shared.airplaneSeat.AirplaneSeatVO;
import ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v1.presentation.schemeItems.FlightSeatsSchemeItem;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u001a5\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u00052\u0018\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0000H\u0000¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lkotlin/Function2;", "", "Lru/ozon/app/android/travel/feature/avia/shared/airplaneSeat/AirplaneSeatVO;", "", "onSeatClickListener", "Lru/ozon/app/android/adapterdelegates/AdapterDelegate;", "", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/presentation/schemeItems/FlightSeatsSchemeItem;", "flightSeatsSchemeContentRowAdapterDelegate", "(Lkotlin/jvm/functions/Function2;)Lru/ozon/app/android/adapterdelegates/AdapterDelegate;", "avia_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class FlightSeatsSchemeContentRowAdapterDelegateKt {
    @NotNull
    public static final AdapterDelegate<List<FlightSeatsSchemeItem>> flightSeatsSchemeContentRowAdapterDelegate(@NotNull Function2<? super Integer, ? super AirplaneSeatVO, Unit> onSeatClickListener) {
        Intrinsics.checkNotNullParameter(onSeatClickListener, "onSeatClickListener");
        return new DslViewBindingListAdapterDelegate(FlightSeatsSchemeContentRowAdapterDelegateKt$flightSeatsSchemeContentRowAdapterDelegate$1.INSTANCE, FlightSeatsSchemeContentRowAdapterDelegateKt$flightSeatsSchemeContentRowAdapterDelegate$$inlined$adapterDelegateViewBinding$default$1.INSTANCE, new FlightSeatsSchemeContentRowAdapterDelegateKt$flightSeatsSchemeContentRowAdapterDelegate$2(onSeatClickListener), FlightSeatsSchemeContentRowAdapterDelegateKt$flightSeatsSchemeContentRowAdapterDelegate$$inlined$adapterDelegateViewBinding$default$2.INSTANCE);
    }
}
