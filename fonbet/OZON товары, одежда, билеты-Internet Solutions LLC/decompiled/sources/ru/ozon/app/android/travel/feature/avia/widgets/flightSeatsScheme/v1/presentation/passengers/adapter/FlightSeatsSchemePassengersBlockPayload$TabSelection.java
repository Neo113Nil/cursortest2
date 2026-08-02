package ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v1.presentation.passengers.adapter;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v1.presentation.passengers.FlightSeatsSchemePassengersBlockVO;

@Metadata(d1 = {"\u0000&\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0011\u001a\u0004\b\u0014\u0010\u0013¨\u0006\u0015"}, d2 = {"ru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/presentation/passengers/adapter/FlightSeatsSchemePassengersBlockPayload$TabSelection", "", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/presentation/passengers/FlightSeatsSchemePassengersBlockVO$Passenger;", "oldPassenger", "newPassenger", "<init>", "(Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/presentation/passengers/FlightSeatsSchemePassengersBlockVO$Passenger;Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/presentation/passengers/FlightSeatsSchemePassengersBlockVO$Passenger;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/presentation/passengers/FlightSeatsSchemePassengersBlockVO$Passenger;", "getOldPassenger", "()Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/presentation/passengers/FlightSeatsSchemePassengersBlockVO$Passenger;", "getNewPassenger", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class FlightSeatsSchemePassengersBlockPayload$TabSelection {

    @NotNull
    private final FlightSeatsSchemePassengersBlockVO.Passenger newPassenger;
    private final FlightSeatsSchemePassengersBlockVO.Passenger oldPassenger;

    public FlightSeatsSchemePassengersBlockPayload$TabSelection(FlightSeatsSchemePassengersBlockVO.Passenger passenger, @NotNull FlightSeatsSchemePassengersBlockVO.Passenger newPassenger) {
        Intrinsics.checkNotNullParameter(newPassenger, "newPassenger");
        this.oldPassenger = passenger;
        this.newPassenger = newPassenger;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FlightSeatsSchemePassengersBlockPayload$TabSelection)) {
            return false;
        }
        FlightSeatsSchemePassengersBlockPayload$TabSelection flightSeatsSchemePassengersBlockPayload$TabSelection = (FlightSeatsSchemePassengersBlockPayload$TabSelection) other;
        return Intrinsics.d(this.oldPassenger, flightSeatsSchemePassengersBlockPayload$TabSelection.oldPassenger) && Intrinsics.d(this.newPassenger, flightSeatsSchemePassengersBlockPayload$TabSelection.newPassenger);
    }

    @NotNull
    public final FlightSeatsSchemePassengersBlockVO.Passenger getNewPassenger() {
        return this.newPassenger;
    }

    public final FlightSeatsSchemePassengersBlockVO.Passenger getOldPassenger() {
        return this.oldPassenger;
    }

    public int hashCode() {
        FlightSeatsSchemePassengersBlockVO.Passenger passenger = this.oldPassenger;
        return this.newPassenger.hashCode() + ((passenger == null ? 0 : passenger.hashCode()) * 31);
    }

    @NotNull
    public String toString() {
        return "TabSelection(oldPassenger=" + this.oldPassenger + ", newPassenger=" + this.newPassenger + ")";
    }
}
