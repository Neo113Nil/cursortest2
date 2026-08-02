package ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapInfo.v4.presentation.pins;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapInfo.v4.presentation.HotelsMapInfoV4VO;
import ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapInfo.v4.view.PointPinProvider;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/pins/PointViewPool;", "", "defaultPin", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/view/PointPinProvider;", "selectedPin", "viewedPin", "<init>", "(Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/view/PointPinProvider;Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/view/PointPinProvider;Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/view/PointPinProvider;)V", "getDefaultPin", "()Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/view/PointPinProvider;", "getSelectedPin", "getViewedPin", "setPinTypes", "", "pricePinStates", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/HotelsMapInfoV4VO$PointPinStates;", "map_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
final class PointViewPool {

    @NotNull
    private final PointPinProvider defaultPin;

    @NotNull
    private final PointPinProvider selectedPin;

    @NotNull
    private final PointPinProvider viewedPin;

    public PointViewPool(@NotNull PointPinProvider defaultPin, @NotNull PointPinProvider selectedPin, @NotNull PointPinProvider viewedPin) {
        Intrinsics.checkNotNullParameter(defaultPin, "defaultPin");
        Intrinsics.checkNotNullParameter(selectedPin, "selectedPin");
        Intrinsics.checkNotNullParameter(viewedPin, "viewedPin");
        this.defaultPin = defaultPin;
        this.selectedPin = selectedPin;
        this.viewedPin = viewedPin;
    }

    @NotNull
    public final PointPinProvider getDefaultPin() {
        return this.defaultPin;
    }

    @NotNull
    public final PointPinProvider getSelectedPin() {
        return this.selectedPin;
    }

    @NotNull
    public final PointPinProvider getViewedPin() {
        return this.viewedPin;
    }

    public final void setPinTypes(@NotNull HotelsMapInfoV4VO.PointPinStates pricePinStates) {
        Intrinsics.checkNotNullParameter(pricePinStates, "pricePinStates");
        this.defaultPin.setStyle(pricePinStates.getDefault());
        PointPinProvider pointPinProvider = this.selectedPin;
        HotelsMapInfoV4VO.PointPinStates.PinStyles selected = pricePinStates.getSelected();
        if (selected == null) {
            selected = pricePinStates.getDefault();
        }
        pointPinProvider.setStyle(selected);
        PointPinProvider pointPinProvider2 = this.viewedPin;
        HotelsMapInfoV4VO.PointPinStates.PinStyles viewed = pricePinStates.getViewed();
        if (viewed == null) {
            viewed = pricePinStates.getDefault();
        }
        pointPinProvider2.setStyle(viewed);
    }
}
