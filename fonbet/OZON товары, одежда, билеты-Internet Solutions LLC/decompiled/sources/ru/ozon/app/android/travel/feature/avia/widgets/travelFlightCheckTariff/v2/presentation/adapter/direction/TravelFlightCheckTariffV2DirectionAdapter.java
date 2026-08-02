package ru.ozon.app.android.travel.feature.avia.widgets.travelFlightCheckTariff.v2.presentation.adapter.direction;

import android.annotation.SuppressLint;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.adapterdelegates.ListDelegationAdapter;
import ru.ozon.app.android.travel.feature.avia.widgets.travelFlightCheckTariff.v2.presentation.TravelFlightCheckTariffV2VO;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0016\u0010\u0006\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0017¨\u0006\t"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/travelFlightCheckTariff/v2/presentation/adapter/direction/TravelFlightCheckTariffV2DirectionAdapter;", "Lru/ozon/app/android/adapterdelegates/ListDelegationAdapter;", "", "Lru/ozon/app/android/travel/feature/avia/widgets/travelFlightCheckTariff/v2/presentation/TravelFlightCheckTariffV2VO$Tariff$Direction;", "<init>", "()V", "setItems", "", "items", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class TravelFlightCheckTariffV2DirectionAdapter extends ListDelegationAdapter<List<? extends TravelFlightCheckTariffV2VO.Tariff.Direction>> {
    public TravelFlightCheckTariffV2DirectionAdapter() {
        this.delegatesManager.addDelegate(TravelFlightCheckTariffV2DirectionAdapterDelegateKt.travelFlightCheckTariffV2DirectionAdapterDelegate());
    }

    @SuppressLint({"NotifyDataSetChanged"})
    public void setItems(@NotNull List<TravelFlightCheckTariffV2VO.Tariff.Direction> items) {
        Intrinsics.checkNotNullParameter(items, "items");
        super.setItems((TravelFlightCheckTariffV2DirectionAdapter) items);
        notifyDataSetChanged();
    }
}
