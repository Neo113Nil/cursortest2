package ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v1.presentation.schemeItems.adapter.orderPrice;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.travel.feature.avia.databinding.ItemFlightSeatsSchemeSeatPriceInfoBinding;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lru/ozon/app/android/travel/feature/avia/databinding/ItemFlightSeatsSchemeSeatPriceInfoBinding;", "inflater", "Landroid/view/LayoutInflater;", "parent", "Landroid/view/ViewGroup;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
final class FlightSeatsSchemeSeatPriceInfoAdapterDelegateKt$flightSeatsSchemeSeatPriceInfoAdapterDelegate$1 extends AbstractC7737t implements Function2<LayoutInflater, ViewGroup, ItemFlightSeatsSchemeSeatPriceInfoBinding> {
    public static final FlightSeatsSchemeSeatPriceInfoAdapterDelegateKt$flightSeatsSchemeSeatPriceInfoAdapterDelegate$1 INSTANCE = new FlightSeatsSchemeSeatPriceInfoAdapterDelegateKt$flightSeatsSchemeSeatPriceInfoAdapterDelegate$1();

    FlightSeatsSchemeSeatPriceInfoAdapterDelegateKt$flightSeatsSchemeSeatPriceInfoAdapterDelegate$1() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    public final ItemFlightSeatsSchemeSeatPriceInfoBinding invoke(LayoutInflater inflater, ViewGroup parent) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        Intrinsics.checkNotNullParameter(parent, "parent");
        ItemFlightSeatsSchemeSeatPriceInfoBinding inflate = ItemFlightSeatsSchemeSeatPriceInfoBinding.inflate(inflater, parent, false);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        return inflate;
    }
}
