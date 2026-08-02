package ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapInfo.v4.presentation.pins;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapInfo.v4.presentation.HotelsMapInfoV4VO;
import ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapInfo.v4.view.PricePinProvider;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fJ\u000e\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0012J\u001a\u0010\u0013\u001a\u00020\r2\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/pins/PriceViewPool;", "", "defaultPin", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/view/PricePinProvider;", "selectedPin", "viewedPin", "<init>", "(Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/view/PricePinProvider;Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/view/PricePinProvider;Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/view/PricePinProvider;)V", "getDefaultPin", "()Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/view/PricePinProvider;", "getSelectedPin", "getViewedPin", "toggleIndivisibleClusters", "", "isEnabled", "", "setPinTypes", "pricePinStates", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/HotelsMapInfoV4VO$PricePinStates;", "setPinTitleTemplates", "singlePinTemplateTitle", "", "clusterPinTemplateTitle", "map_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
final class PriceViewPool {

    @NotNull
    private final PricePinProvider defaultPin;

    @NotNull
    private final PricePinProvider selectedPin;

    @NotNull
    private final PricePinProvider viewedPin;

    public PriceViewPool(@NotNull PricePinProvider defaultPin, @NotNull PricePinProvider selectedPin, @NotNull PricePinProvider viewedPin) {
        Intrinsics.checkNotNullParameter(defaultPin, "defaultPin");
        Intrinsics.checkNotNullParameter(selectedPin, "selectedPin");
        Intrinsics.checkNotNullParameter(viewedPin, "viewedPin");
        this.defaultPin = defaultPin;
        this.selectedPin = selectedPin;
        this.viewedPin = viewedPin;
    }

    @NotNull
    public final PricePinProvider getDefaultPin() {
        return this.defaultPin;
    }

    @NotNull
    public final PricePinProvider getSelectedPin() {
        return this.selectedPin;
    }

    @NotNull
    public final PricePinProvider getViewedPin() {
        return this.viewedPin;
    }

    public final void setPinTitleTemplates(String singlePinTemplateTitle, String clusterPinTemplateTitle) {
        this.defaultPin.setPinTitleTemplates(singlePinTemplateTitle, clusterPinTemplateTitle);
        this.selectedPin.setPinTitleTemplates(singlePinTemplateTitle, clusterPinTemplateTitle);
        this.viewedPin.setPinTitleTemplates(singlePinTemplateTitle, clusterPinTemplateTitle);
    }

    public final void setPinTypes(@NotNull HotelsMapInfoV4VO.PricePinStates pricePinStates) {
        Intrinsics.checkNotNullParameter(pricePinStates, "pricePinStates");
        this.defaultPin.setStyle(pricePinStates.getDefault());
        PricePinProvider pricePinProvider = this.selectedPin;
        HotelsMapInfoV4VO.PricePinStates.PinStyles selected = pricePinStates.getSelected();
        if (selected == null) {
            selected = pricePinStates.getDefault();
        }
        pricePinProvider.setStyle(selected);
        PricePinProvider pricePinProvider2 = this.viewedPin;
        HotelsMapInfoV4VO.PricePinStates.PinStyles viewed = pricePinStates.getViewed();
        if (viewed == null) {
            viewed = pricePinStates.getDefault();
        }
        pricePinProvider2.setStyle(viewed);
    }

    public final void toggleIndivisibleClusters(boolean isEnabled) {
        this.defaultPin.toggleIndivisibleClusters(isEnabled);
        this.selectedPin.toggleIndivisibleClusters(isEnabled);
        this.viewedPin.toggleIndivisibleClusters(isEnabled);
    }
}
