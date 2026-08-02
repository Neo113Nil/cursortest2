package ru.ozon.app.android.travel.feature.avia.widgets.travelFlightCheckTariff.v2.presentation.adapter;

import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.adapterdelegates.AdapterDelegate;
import ru.ozon.app.android.adapterdelegates.dsl.DslViewBindingListAdapterDelegate;
import ru.ozon.app.android.travel.feature.avia.widgets.travelFlightCheckTariff.v2.presentation.TravelFlightCheckTariffV2VO;
import ru.ozon.uni.atoms.data.AtomActionDTO;

@Metadata(d1 = {"\u0000(\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0000\u001a4\u0010\u0002\u001a\u0012\u0012\u000e\u0012\f\u0012\b\u0012\u00060\u0001j\u0002`\u00050\u00040\u00032\u001a\u0010\u0006\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\b\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\u0007H\u0000*\f\b\u0002\u0010\u0000\"\u00020\u00012\u00020\u0001¨\u0006\u000b"}, d2 = {"Tariff", "Lru/ozon/app/android/travel/feature/avia/widgets/travelFlightCheckTariff/v2/presentation/TravelFlightCheckTariffV2VO$Tariff;", "travelFlightCheckTariffV2AdapterDelegate", "Lru/ozon/app/android/adapterdelegates/AdapterDelegate;", "", "Lru/ozon/app/android/travel/feature/avia/widgets/travelFlightCheckTariff/v2/presentation/adapter/Tariff;", "onAction", "Lkotlin/Function2;", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "", "", "avia_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class TravelFlightCheckTariffV2AdapterDelegateKt {
    @NotNull
    public static final AdapterDelegate<List<TravelFlightCheckTariffV2VO.Tariff>> travelFlightCheckTariffV2AdapterDelegate(@NotNull Function2<? super AtomActionDTO, ? super Integer, Unit> onAction) {
        Intrinsics.checkNotNullParameter(onAction, "onAction");
        return new DslViewBindingListAdapterDelegate(TravelFlightCheckTariffV2AdapterDelegateKt$travelFlightCheckTariffV2AdapterDelegate$1.INSTANCE, TravelFlightCheckTariffV2AdapterDelegateKt$travelFlightCheckTariffV2AdapterDelegate$$inlined$adapterDelegateViewBinding$default$1.INSTANCE, new TravelFlightCheckTariffV2AdapterDelegateKt$travelFlightCheckTariffV2AdapterDelegate$2(onAction), TravelFlightCheckTariffV2AdapterDelegateKt$travelFlightCheckTariffV2AdapterDelegate$$inlined$adapterDelegateViewBinding$default$2.INSTANCE);
    }
}
