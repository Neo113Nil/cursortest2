package ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v2.presentation.schemeItems;

import Am.C2438a;
import B0.C2454a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v2.presentation.airplaneSeat.AirplaneSeatTypeV2VI;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0081\b\u0018\u00002\u00020\u0001B-\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ:\u0010\u000b\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\u0011R\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0019\u0010\u0011R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/presentation/schemeItems/FlightSchemeSeatContentV2;", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/presentation/schemeItems/FlightSchemeContentV2;", "", "width", "height", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/presentation/airplaneSeat/AirplaneSeatTypeV2VI;", "seat", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "<init>", "(IILru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/presentation/airplaneSeat/AirplaneSeatTypeV2VI;Lru/ozon/uni/atoms/af/AtomAction;)V", "copy", "(IILru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/presentation/airplaneSeat/AirplaneSeatTypeV2VI;Lru/ozon/uni/atoms/af/AtomAction;)Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/presentation/schemeItems/FlightSchemeSeatContentV2;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getWidth", "getHeight", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/presentation/airplaneSeat/AirplaneSeatTypeV2VI;", "getSeat", "()Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/presentation/airplaneSeat/AirplaneSeatTypeV2VI;", "Lru/ozon/uni/atoms/af/AtomAction;", "getAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class FlightSchemeSeatContentV2 implements FlightSchemeContentV2 {
    public static final int $stable = AtomAction.$stable;
    private final AtomAction action;
    private final int height;

    @NotNull
    private final AirplaneSeatTypeV2VI seat;
    private final int width;

    public FlightSchemeSeatContentV2(int i11, int i12, @NotNull AirplaneSeatTypeV2VI seat, AtomAction atomAction) {
        Intrinsics.checkNotNullParameter(seat, "seat");
        this.width = i11;
        this.height = i12;
        this.seat = seat;
        this.action = atomAction;
    }

    public static /* synthetic */ FlightSchemeSeatContentV2 copy$default(FlightSchemeSeatContentV2 flightSchemeSeatContentV2, int i11, int i12, AirplaneSeatTypeV2VI airplaneSeatTypeV2VI, AtomAction atomAction, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i11 = flightSchemeSeatContentV2.width;
        }
        if ((i13 & 2) != 0) {
            i12 = flightSchemeSeatContentV2.height;
        }
        if ((i13 & 4) != 0) {
            airplaneSeatTypeV2VI = flightSchemeSeatContentV2.seat;
        }
        if ((i13 & 8) != 0) {
            atomAction = flightSchemeSeatContentV2.action;
        }
        return flightSchemeSeatContentV2.copy(i11, i12, airplaneSeatTypeV2VI, atomAction);
    }

    @NotNull
    public final FlightSchemeSeatContentV2 copy(int width, int height, @NotNull AirplaneSeatTypeV2VI seat, AtomAction action) {
        Intrinsics.checkNotNullParameter(seat, "seat");
        return new FlightSchemeSeatContentV2(width, height, seat, action);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FlightSchemeSeatContentV2)) {
            return false;
        }
        FlightSchemeSeatContentV2 flightSchemeSeatContentV2 = (FlightSchemeSeatContentV2) other;
        return this.width == flightSchemeSeatContentV2.width && this.height == flightSchemeSeatContentV2.height && Intrinsics.d(this.seat, flightSchemeSeatContentV2.seat) && Intrinsics.d(this.action, flightSchemeSeatContentV2.action);
    }

    public final AtomAction getAction() {
        return this.action;
    }

    @Override // ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v2.presentation.schemeItems.FlightSchemeContentV2
    public int getHeight() {
        return this.height;
    }

    @NotNull
    public final AirplaneSeatTypeV2VI getSeat() {
        return this.seat;
    }

    @Override // ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v2.presentation.schemeItems.FlightSchemeContentV2
    public int getWidth() {
        return this.width;
    }

    public int hashCode() {
        int hashCode = (this.seat.hashCode() + C2454a.a(this.height, Integer.hashCode(this.width) * 31, 31)) * 31;
        AtomAction atomAction = this.action;
        return hashCode + (atomAction == null ? 0 : atomAction.hashCode());
    }

    @NotNull
    public String toString() {
        int i11 = this.width;
        int i12 = this.height;
        AirplaneSeatTypeV2VI airplaneSeatTypeV2VI = this.seat;
        AtomAction atomAction = this.action;
        StringBuilder a11 = C2438a.a("FlightSchemeSeatContentV2(width=", i11, ", height=", ", seat=", i12);
        a11.append(airplaneSeatTypeV2VI);
        a11.append(", action=");
        a11.append(atomAction);
        a11.append(")");
        return a11.toString();
    }
}
