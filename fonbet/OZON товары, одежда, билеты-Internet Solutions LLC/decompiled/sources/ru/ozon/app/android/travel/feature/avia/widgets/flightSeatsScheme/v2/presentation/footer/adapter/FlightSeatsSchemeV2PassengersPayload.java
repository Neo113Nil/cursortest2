package ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v2.presentation.footer.adapter;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v2.presentation.footer.FlightSeatsSchemeV2FooterBlockVI;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/presentation/footer/adapter/FlightSeatsSchemeV2PassengersPayload;", "", "<init>", "()V", "TabSelection", "SeatSelection", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/presentation/footer/adapter/FlightSeatsSchemeV2PassengersPayload$SeatSelection;", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/presentation/footer/adapter/FlightSeatsSchemeV2PassengersPayload$TabSelection;", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public abstract class FlightSeatsSchemeV2PassengersPayload {

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0012\u001a\u0004\b\u0015\u0010\u0014¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/presentation/footer/adapter/FlightSeatsSchemeV2PassengersPayload$SeatSelection;", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/presentation/footer/adapter/FlightSeatsSchemeV2PassengersPayload;", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/presentation/footer/FlightSeatsSchemeV2FooterBlockVI$SelectedSeatV2VI;", "oldSeat", "newSeat", "<init>", "(Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/presentation/footer/FlightSeatsSchemeV2FooterBlockVI$SelectedSeatV2VI;Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/presentation/footer/FlightSeatsSchemeV2FooterBlockVI$SelectedSeatV2VI;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/presentation/footer/FlightSeatsSchemeV2FooterBlockVI$SelectedSeatV2VI;", "getOldSeat", "()Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/presentation/footer/FlightSeatsSchemeV2FooterBlockVI$SelectedSeatV2VI;", "getNewSeat", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class SeatSelection extends FlightSeatsSchemeV2PassengersPayload {
        private final FlightSeatsSchemeV2FooterBlockVI.SelectedSeatV2VI newSeat;
        private final FlightSeatsSchemeV2FooterBlockVI.SelectedSeatV2VI oldSeat;

        public SeatSelection(FlightSeatsSchemeV2FooterBlockVI.SelectedSeatV2VI selectedSeatV2VI, FlightSeatsSchemeV2FooterBlockVI.SelectedSeatV2VI selectedSeatV2VI2) {
            super(null);
            this.oldSeat = selectedSeatV2VI;
            this.newSeat = selectedSeatV2VI2;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SeatSelection)) {
                return false;
            }
            SeatSelection seatSelection = (SeatSelection) other;
            return Intrinsics.d(this.oldSeat, seatSelection.oldSeat) && Intrinsics.d(this.newSeat, seatSelection.newSeat);
        }

        public final FlightSeatsSchemeV2FooterBlockVI.SelectedSeatV2VI getNewSeat() {
            return this.newSeat;
        }

        public final FlightSeatsSchemeV2FooterBlockVI.SelectedSeatV2VI getOldSeat() {
            return this.oldSeat;
        }

        public int hashCode() {
            FlightSeatsSchemeV2FooterBlockVI.SelectedSeatV2VI selectedSeatV2VI = this.oldSeat;
            int hashCode = (selectedSeatV2VI == null ? 0 : selectedSeatV2VI.hashCode()) * 31;
            FlightSeatsSchemeV2FooterBlockVI.SelectedSeatV2VI selectedSeatV2VI2 = this.newSeat;
            return hashCode + (selectedSeatV2VI2 != null ? selectedSeatV2VI2.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "SeatSelection(oldSeat=" + this.oldSeat + ", newSeat=" + this.newSeat + ")";
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0012\u001a\u0004\b\u0015\u0010\u0014¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/presentation/footer/adapter/FlightSeatsSchemeV2PassengersPayload$TabSelection;", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/presentation/footer/adapter/FlightSeatsSchemeV2PassengersPayload;", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/presentation/footer/FlightSeatsSchemeV2FooterBlockVI$PassengerV2VI;", "oldPassenger", "newPassenger", "<init>", "(Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/presentation/footer/FlightSeatsSchemeV2FooterBlockVI$PassengerV2VI;Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/presentation/footer/FlightSeatsSchemeV2FooterBlockVI$PassengerV2VI;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/presentation/footer/FlightSeatsSchemeV2FooterBlockVI$PassengerV2VI;", "getOldPassenger", "()Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/presentation/footer/FlightSeatsSchemeV2FooterBlockVI$PassengerV2VI;", "getNewPassenger", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class TabSelection extends FlightSeatsSchemeV2PassengersPayload {

        @NotNull
        private final FlightSeatsSchemeV2FooterBlockVI.PassengerV2VI newPassenger;
        private final FlightSeatsSchemeV2FooterBlockVI.PassengerV2VI oldPassenger;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TabSelection(FlightSeatsSchemeV2FooterBlockVI.PassengerV2VI passengerV2VI, @NotNull FlightSeatsSchemeV2FooterBlockVI.PassengerV2VI newPassenger) {
            super(null);
            Intrinsics.checkNotNullParameter(newPassenger, "newPassenger");
            this.oldPassenger = passengerV2VI;
            this.newPassenger = newPassenger;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TabSelection)) {
                return false;
            }
            TabSelection tabSelection = (TabSelection) other;
            return Intrinsics.d(this.oldPassenger, tabSelection.oldPassenger) && Intrinsics.d(this.newPassenger, tabSelection.newPassenger);
        }

        @NotNull
        public final FlightSeatsSchemeV2FooterBlockVI.PassengerV2VI getNewPassenger() {
            return this.newPassenger;
        }

        public final FlightSeatsSchemeV2FooterBlockVI.PassengerV2VI getOldPassenger() {
            return this.oldPassenger;
        }

        public int hashCode() {
            FlightSeatsSchemeV2FooterBlockVI.PassengerV2VI passengerV2VI = this.oldPassenger;
            return this.newPassenger.hashCode() + ((passengerV2VI == null ? 0 : passengerV2VI.hashCode()) * 31);
        }

        @NotNull
        public String toString() {
            return "TabSelection(oldPassenger=" + this.oldPassenger + ", newPassenger=" + this.newPassenger + ")";
        }
    }

    public /* synthetic */ FlightSeatsSchemeV2PassengersPayload(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private FlightSeatsSchemeV2PassengersPayload() {
    }
}
