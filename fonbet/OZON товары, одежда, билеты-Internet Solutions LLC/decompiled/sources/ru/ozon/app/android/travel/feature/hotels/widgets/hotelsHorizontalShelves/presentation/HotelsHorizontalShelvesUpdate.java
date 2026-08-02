package ru.ozon.app.android.travel.feature.hotels.widgets.hotelsHorizontalShelves.presentation;

import A00.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsHorizontalShelves.presentation.HotelsHorizontalShelvesVO;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0081\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsHorizontalShelves/presentation/HotelsHorizontalShelvesUpdate;", "LA00/a$J$a;", "", "widgetId", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsHorizontalShelves/presentation/HotelsHorizontalShelvesVO$State;", "newState", "<init>", "(Ljava/lang/Long;Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsHorizontalShelves/presentation/HotelsHorizontalShelvesVO$State;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Long;", "getWidgetId", "()Ljava/lang/Long;", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsHorizontalShelves/presentation/HotelsHorizontalShelvesVO$State;", "getNewState", "()Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsHorizontalShelves/presentation/HotelsHorizontalShelvesVO$State;", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class HotelsHorizontalShelvesUpdate implements a.J.InterfaceC0007a {

    @NotNull
    private final HotelsHorizontalShelvesVO.State newState;
    private final Long widgetId;

    public HotelsHorizontalShelvesUpdate(Long l11, @NotNull HotelsHorizontalShelvesVO.State newState) {
        Intrinsics.checkNotNullParameter(newState, "newState");
        this.widgetId = l11;
        this.newState = newState;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HotelsHorizontalShelvesUpdate)) {
            return false;
        }
        HotelsHorizontalShelvesUpdate hotelsHorizontalShelvesUpdate = (HotelsHorizontalShelvesUpdate) other;
        return Intrinsics.d(this.widgetId, hotelsHorizontalShelvesUpdate.widgetId) && Intrinsics.d(this.newState, hotelsHorizontalShelvesUpdate.newState);
    }

    @NotNull
    public final HotelsHorizontalShelvesVO.State getNewState() {
        return this.newState;
    }

    public final Long getWidgetId() {
        return this.widgetId;
    }

    public int hashCode() {
        Long l11 = this.widgetId;
        return this.newState.hashCode() + ((l11 == null ? 0 : l11.hashCode()) * 31);
    }

    @NotNull
    public String toString() {
        return "HotelsHorizontalShelvesUpdate(widgetId=" + this.widgetId + ", newState=" + this.newState + ")";
    }
}
