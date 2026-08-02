package ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v2.presentation.schemeItems.adapter;

import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.adapterdelegates.AdapterDelegate;
import ru.ozon.app.android.adapterdelegates.dsl.DslViewBindingListAdapterDelegate;
import ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v2.presentation.airplaneSeat.AirplaneSeatTypeV2VI;
import ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v2.presentation.schemeItems.FlightSeatsSchemeV2Item;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u001aM\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\t2\u0018\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00002\u0016\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00030\u0005j\u0002`\u0007H\u0000¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lkotlin/Function2;", "", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/presentation/airplaneSeat/AirplaneSeatTypeV2VI;", "", "onSeatClickListener", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "Lru/ozon/app/android/action/BuildedActionHandler;", "emergencySeatsActionHandler", "Lru/ozon/app/android/adapterdelegates/AdapterDelegate;", "", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/presentation/schemeItems/FlightSeatsSchemeV2Item;", "flightSeatsSchemeV2ContentRowAdapterDelegate", "(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;)Lru/ozon/app/android/adapterdelegates/AdapterDelegate;", "avia_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class FlightSeatsSchemeV2ContentRowAdapterDelegateKt {
    @NotNull
    public static final AdapterDelegate<List<FlightSeatsSchemeV2Item>> flightSeatsSchemeV2ContentRowAdapterDelegate(@NotNull Function2<? super Integer, ? super AirplaneSeatTypeV2VI, Unit> onSeatClickListener, @NotNull Function1<? super AtomAction, Unit> emergencySeatsActionHandler) {
        Intrinsics.checkNotNullParameter(onSeatClickListener, "onSeatClickListener");
        Intrinsics.checkNotNullParameter(emergencySeatsActionHandler, "emergencySeatsActionHandler");
        return new DslViewBindingListAdapterDelegate(FlightSeatsSchemeV2ContentRowAdapterDelegateKt$flightSeatsSchemeV2ContentRowAdapterDelegate$1.INSTANCE, FlightSeatsSchemeV2ContentRowAdapterDelegateKt$flightSeatsSchemeV2ContentRowAdapterDelegate$$inlined$adapterDelegateViewBinding$default$1.INSTANCE, new FlightSeatsSchemeV2ContentRowAdapterDelegateKt$flightSeatsSchemeV2ContentRowAdapterDelegate$2(emergencySeatsActionHandler, onSeatClickListener), FlightSeatsSchemeV2ContentRowAdapterDelegateKt$flightSeatsSchemeV2ContentRowAdapterDelegate$$inlined$adapterDelegateViewBinding$default$2.INSTANCE);
    }
}
