package ru.ozon.app.android.travel.feature.general.order.di;

import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.C7705l;
import kotlin.jvm.internal.Intrinsics;
import n20.i;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.general.order.widgets.flightOrderDetails.v2.FlightOrderDetailsV2WidgetKt;
import ru.ozon.app.android.travel.feature.general.order.widgets.flightOrderDetails.v2.TravelFlightOrderDetailsV2WidgetKt;
import ru.ozon.app.android.travel.feature.general.order.widgets.flightOrderDetails.v3.data.FlightOrderDetailsV3WidgetKt;
import ru.ozon.app.android.travel.feature.general.order.widgets.flightOrderDetails.v4.data.FlightOrderDetailsV4WidgetKt;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/travel/feature/general/order/di/TravelGeneralOrderWidgetModule;", "", "<init>", "()V", "", "Ln20/i;", "provideWidgets", "()Ljava/util/Set;", "order_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class TravelGeneralOrderWidgetModule {

    @NotNull
    public static final TravelGeneralOrderWidgetModule INSTANCE = new TravelGeneralOrderWidgetModule();

    private TravelGeneralOrderWidgetModule() {
    }

    @NotNull
    public final Set<i> provideWidgets() {
        i[] elements = {TravelFlightOrderDetailsV2WidgetKt.TravelFlightOrderDetailsV2Widget(), FlightOrderDetailsV2WidgetKt.FlightOrderDetailsV2Widget(), FlightOrderDetailsV3WidgetKt.FlightOrderDetailsV3Widget(), FlightOrderDetailsV4WidgetKt.FlightOrderDetailsV4Widget()};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return C7705l.j0(elements);
    }
}
