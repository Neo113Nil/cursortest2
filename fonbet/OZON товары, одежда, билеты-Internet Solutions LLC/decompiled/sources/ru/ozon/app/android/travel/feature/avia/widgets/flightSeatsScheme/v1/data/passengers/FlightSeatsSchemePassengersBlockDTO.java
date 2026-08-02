package ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v1.data.passengers;

import B0.A0;
import B90.C2619v;
import G.g;
import I0.C3173b;
import Kk.C3532b;
import N3.C3660k;
import Nh.a;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.j;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.K;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@j(generateAdapter = true)
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0014\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0081\b\u0018\u00002\u00020\u0001:\u0003#$%B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0003J\t\u0010\u001b\u001a\u00020\u000bHÆ\u0003JE\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\b\u0002\u0010\n\u001a\u00020\u000bHÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u000b2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\t\u0010!\u001a\u00020\"HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006&"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/data/passengers/FlightSeatsSchemePassengersBlockDTO;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/texts/TextAtom;", "destination", "passengerTabStyles", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/data/passengers/FlightSeatsSchemePassengersBlockDTO$TabStyle;", "passengers", "", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/data/passengers/FlightSeatsSchemePassengersBlockDTO$Passenger;", "hidePassengers", "", "<init>", "(Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/data/passengers/FlightSeatsSchemePassengersBlockDTO$TabStyle;Ljava/util/List;Z)V", "getTitle", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getDestination", "getPassengerTabStyles", "()Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/data/passengers/FlightSeatsSchemePassengersBlockDTO$TabStyle;", "getPassengers", "()Ljava/util/List;", "getHidePassengers", "()Z", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toString", "", "TabStyle", "Passenger", "SelectedSeat", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class FlightSeatsSchemePassengersBlockDTO {
    public static final int $stable = 8;
    private final TextAtom destination;
    private final boolean hidePassengers;
    private final TabStyle passengerTabStyles;

    @NotNull
    private final List<Passenger> passengers;

    @NotNull
    private final TextAtom title;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0018\b\u0087\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\f¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\nHÆ\u0003J\u0017\u0010 \u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\fHÆ\u0003JU\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\fHÆ\u0001J\u0013\u0010\"\u001a\u00020\u00072\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010$\u001a\u00020\u0003HÖ\u0001J\t\u0010%\u001a\u00020\rHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0015R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0014R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u001f\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001a¨\u0006&"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/data/passengers/FlightSeatsSchemePassengersBlockDTO$Passenger;", "", "id", "", AppMeasurementSdk.ConditionalUserProperty.NAME, "Lru/ozon/uni/atoms/data/texts/TextAtom;", "isCurrent", "", "shortName", "selectedSeat", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/data/passengers/FlightSeatsSchemePassengersBlockDTO$SelectedSeat;", "passengerSelectionTrackingInfo", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(ILru/ozon/uni/atoms/data/texts/TextAtom;ZLru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/data/passengers/FlightSeatsSchemePassengersBlockDTO$SelectedSeat;Ljava/util/Map;)V", "getId", "()I", "getName", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "()Z", "getShortName", "getSelectedSeat", "()Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/data/passengers/FlightSeatsSchemePassengersBlockDTO$SelectedSeat;", "getPassengerSelectionTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "toString", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Passenger {
        public static final int $stable = 8;
        private final int id;
        private final boolean isCurrent;

        @NotNull
        private final TextAtom name;
        private final Map<String, TokenizedTrackingInfo> passengerSelectionTrackingInfo;
        private final SelectedSeat selectedSeat;

        @NotNull
        private final TextAtom shortName;

        public Passenger(int i11, @NotNull TextAtom name, boolean z11, @NotNull TextAtom shortName, SelectedSeat selectedSeat, Map<String, TokenizedTrackingInfo> map) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(shortName, "shortName");
            this.id = i11;
            this.name = name;
            this.isCurrent = z11;
            this.shortName = shortName;
            this.selectedSeat = selectedSeat;
            this.passengerSelectionTrackingInfo = map;
        }

        public static /* synthetic */ Passenger copy$default(Passenger passenger, int i11, TextAtom textAtom, boolean z11, TextAtom textAtom2, SelectedSeat selectedSeat, Map map, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                i11 = passenger.id;
            }
            if ((i12 & 2) != 0) {
                textAtom = passenger.name;
            }
            if ((i12 & 4) != 0) {
                z11 = passenger.isCurrent;
            }
            if ((i12 & 8) != 0) {
                textAtom2 = passenger.shortName;
            }
            if ((i12 & 16) != 0) {
                selectedSeat = passenger.selectedSeat;
            }
            if ((i12 & 32) != 0) {
                map = passenger.passengerSelectionTrackingInfo;
            }
            SelectedSeat selectedSeat2 = selectedSeat;
            Map map2 = map;
            return passenger.copy(i11, textAtom, z11, textAtom2, selectedSeat2, map2);
        }

        /* renamed from: component1, reason: from getter */
        public final int getId() {
            return this.id;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final TextAtom getName() {
            return this.name;
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getIsCurrent() {
            return this.isCurrent;
        }

        @NotNull
        /* renamed from: component4, reason: from getter */
        public final TextAtom getShortName() {
            return this.shortName;
        }

        /* renamed from: component5, reason: from getter */
        public final SelectedSeat getSelectedSeat() {
            return this.selectedSeat;
        }

        public final Map<String, TokenizedTrackingInfo> component6() {
            return this.passengerSelectionTrackingInfo;
        }

        @NotNull
        public final Passenger copy(int id2, @NotNull TextAtom name, boolean isCurrent, @NotNull TextAtom shortName, SelectedSeat selectedSeat, Map<String, TokenizedTrackingInfo> passengerSelectionTrackingInfo) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(shortName, "shortName");
            return new Passenger(id2, name, isCurrent, shortName, selectedSeat, passengerSelectionTrackingInfo);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Passenger)) {
                return false;
            }
            Passenger passenger = (Passenger) other;
            return this.id == passenger.id && Intrinsics.d(this.name, passenger.name) && this.isCurrent == passenger.isCurrent && Intrinsics.d(this.shortName, passenger.shortName) && Intrinsics.d(this.selectedSeat, passenger.selectedSeat) && Intrinsics.d(this.passengerSelectionTrackingInfo, passenger.passengerSelectionTrackingInfo);
        }

        public final int getId() {
            return this.id;
        }

        @NotNull
        public final TextAtom getName() {
            return this.name;
        }

        public final Map<String, TokenizedTrackingInfo> getPassengerSelectionTrackingInfo() {
            return this.passengerSelectionTrackingInfo;
        }

        public final SelectedSeat getSelectedSeat() {
            return this.selectedSeat;
        }

        @NotNull
        public final TextAtom getShortName() {
            return this.shortName;
        }

        public int hashCode() {
            int b11 = C2619v.b(C3532b.a(C2619v.b(Integer.hashCode(this.id) * 31, 31, this.name), 31, this.isCurrent), 31, this.shortName);
            SelectedSeat selectedSeat = this.selectedSeat;
            int hashCode = (b11 + (selectedSeat == null ? 0 : selectedSeat.hashCode())) * 31;
            Map<String, TokenizedTrackingInfo> map = this.passengerSelectionTrackingInfo;
            return hashCode + (map != null ? map.hashCode() : 0);
        }

        public final boolean isCurrent() {
            return this.isCurrent;
        }

        @NotNull
        public String toString() {
            return "Passenger(id=" + this.id + ", name=" + this.name + ", isCurrent=" + this.isCurrent + ", shortName=" + this.shortName + ", selectedSeat=" + this.selectedSeat + ", passengerSelectionTrackingInfo=" + this.passengerSelectionTrackingInfo + ")";
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/data/passengers/FlightSeatsSchemePassengersBlockDTO$SelectedSeat;", "", "number", "", "<init>", "(Ljava/lang/String;)V", "getNumber", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class SelectedSeat {
        public static final int $stable = 0;

        @NotNull
        private final String number;

        public SelectedSeat(@NotNull String number) {
            Intrinsics.checkNotNullParameter(number, "number");
            this.number = number;
        }

        public static /* synthetic */ SelectedSeat copy$default(SelectedSeat selectedSeat, String str, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = selectedSeat.number;
            }
            return selectedSeat.copy(str);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getNumber() {
            return this.number;
        }

        @NotNull
        public final SelectedSeat copy(@NotNull String number) {
            Intrinsics.checkNotNullParameter(number, "number");
            return new SelectedSeat(number);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof SelectedSeat) && Intrinsics.d(this.number, ((SelectedSeat) other).number);
        }

        @NotNull
        public final String getNumber() {
            return this.number;
        }

        public int hashCode() {
            return this.number.hashCode();
        }

        @NotNull
        public String toString() {
            return A0.b("SelectedSeat(number=", this.number, ")");
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001c\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003JY\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001a\u00020#HÖ\u0001J\t\u0010$\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000eR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000eR\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000eR\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000e¨\u0006%"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/data/passengers/FlightSeatsSchemePassengersBlockDTO$TabStyle;", "", "tabDefaultColor", "", "tabSelectionColor", "tabDefaultTextColor", "tabSelectionTextColor", "indicatorDefaultColor", "indicatorSelectionColor", "indicatorDefaultTextColor", "indicatorSelectionTextColor", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getTabDefaultColor", "()Ljava/lang/String;", "getTabSelectionColor", "getTabDefaultTextColor", "getTabSelectionTextColor", "getIndicatorDefaultColor", "getIndicatorSelectionColor", "getIndicatorDefaultTextColor", "getIndicatorSelectionTextColor", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "", "toString", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class TabStyle {
        public static final int $stable = 0;

        @NotNull
        private final String indicatorDefaultColor;

        @NotNull
        private final String indicatorDefaultTextColor;

        @NotNull
        private final String indicatorSelectionColor;

        @NotNull
        private final String indicatorSelectionTextColor;

        @NotNull
        private final String tabDefaultColor;

        @NotNull
        private final String tabDefaultTextColor;

        @NotNull
        private final String tabSelectionColor;

        @NotNull
        private final String tabSelectionTextColor;

        public TabStyle(@NotNull String tabDefaultColor, @NotNull String tabSelectionColor, @NotNull String tabDefaultTextColor, @NotNull String tabSelectionTextColor, @NotNull String indicatorDefaultColor, @NotNull String indicatorSelectionColor, @NotNull String indicatorDefaultTextColor, @NotNull String indicatorSelectionTextColor) {
            Intrinsics.checkNotNullParameter(tabDefaultColor, "tabDefaultColor");
            Intrinsics.checkNotNullParameter(tabSelectionColor, "tabSelectionColor");
            Intrinsics.checkNotNullParameter(tabDefaultTextColor, "tabDefaultTextColor");
            Intrinsics.checkNotNullParameter(tabSelectionTextColor, "tabSelectionTextColor");
            Intrinsics.checkNotNullParameter(indicatorDefaultColor, "indicatorDefaultColor");
            Intrinsics.checkNotNullParameter(indicatorSelectionColor, "indicatorSelectionColor");
            Intrinsics.checkNotNullParameter(indicatorDefaultTextColor, "indicatorDefaultTextColor");
            Intrinsics.checkNotNullParameter(indicatorSelectionTextColor, "indicatorSelectionTextColor");
            this.tabDefaultColor = tabDefaultColor;
            this.tabSelectionColor = tabSelectionColor;
            this.tabDefaultTextColor = tabDefaultTextColor;
            this.tabSelectionTextColor = tabSelectionTextColor;
            this.indicatorDefaultColor = indicatorDefaultColor;
            this.indicatorSelectionColor = indicatorSelectionColor;
            this.indicatorDefaultTextColor = indicatorDefaultTextColor;
            this.indicatorSelectionTextColor = indicatorSelectionTextColor;
        }

        public static /* synthetic */ TabStyle copy$default(TabStyle tabStyle, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = tabStyle.tabDefaultColor;
            }
            if ((i11 & 2) != 0) {
                str2 = tabStyle.tabSelectionColor;
            }
            if ((i11 & 4) != 0) {
                str3 = tabStyle.tabDefaultTextColor;
            }
            if ((i11 & 8) != 0) {
                str4 = tabStyle.tabSelectionTextColor;
            }
            if ((i11 & 16) != 0) {
                str5 = tabStyle.indicatorDefaultColor;
            }
            if ((i11 & 32) != 0) {
                str6 = tabStyle.indicatorSelectionColor;
            }
            if ((i11 & 64) != 0) {
                str7 = tabStyle.indicatorDefaultTextColor;
            }
            if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
                str8 = tabStyle.indicatorSelectionTextColor;
            }
            String str9 = str7;
            String str10 = str8;
            String str11 = str5;
            String str12 = str6;
            return tabStyle.copy(str, str2, str3, str4, str11, str12, str9, str10);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getTabDefaultColor() {
            return this.tabDefaultColor;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final String getTabSelectionColor() {
            return this.tabSelectionColor;
        }

        @NotNull
        /* renamed from: component3, reason: from getter */
        public final String getTabDefaultTextColor() {
            return this.tabDefaultTextColor;
        }

        @NotNull
        /* renamed from: component4, reason: from getter */
        public final String getTabSelectionTextColor() {
            return this.tabSelectionTextColor;
        }

        @NotNull
        /* renamed from: component5, reason: from getter */
        public final String getIndicatorDefaultColor() {
            return this.indicatorDefaultColor;
        }

        @NotNull
        /* renamed from: component6, reason: from getter */
        public final String getIndicatorSelectionColor() {
            return this.indicatorSelectionColor;
        }

        @NotNull
        /* renamed from: component7, reason: from getter */
        public final String getIndicatorDefaultTextColor() {
            return this.indicatorDefaultTextColor;
        }

        @NotNull
        /* renamed from: component8, reason: from getter */
        public final String getIndicatorSelectionTextColor() {
            return this.indicatorSelectionTextColor;
        }

        @NotNull
        public final TabStyle copy(@NotNull String tabDefaultColor, @NotNull String tabSelectionColor, @NotNull String tabDefaultTextColor, @NotNull String tabSelectionTextColor, @NotNull String indicatorDefaultColor, @NotNull String indicatorSelectionColor, @NotNull String indicatorDefaultTextColor, @NotNull String indicatorSelectionTextColor) {
            Intrinsics.checkNotNullParameter(tabDefaultColor, "tabDefaultColor");
            Intrinsics.checkNotNullParameter(tabSelectionColor, "tabSelectionColor");
            Intrinsics.checkNotNullParameter(tabDefaultTextColor, "tabDefaultTextColor");
            Intrinsics.checkNotNullParameter(tabSelectionTextColor, "tabSelectionTextColor");
            Intrinsics.checkNotNullParameter(indicatorDefaultColor, "indicatorDefaultColor");
            Intrinsics.checkNotNullParameter(indicatorSelectionColor, "indicatorSelectionColor");
            Intrinsics.checkNotNullParameter(indicatorDefaultTextColor, "indicatorDefaultTextColor");
            Intrinsics.checkNotNullParameter(indicatorSelectionTextColor, "indicatorSelectionTextColor");
            return new TabStyle(tabDefaultColor, tabSelectionColor, tabDefaultTextColor, tabSelectionTextColor, indicatorDefaultColor, indicatorSelectionColor, indicatorDefaultTextColor, indicatorSelectionTextColor);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TabStyle)) {
                return false;
            }
            TabStyle tabStyle = (TabStyle) other;
            return Intrinsics.d(this.tabDefaultColor, tabStyle.tabDefaultColor) && Intrinsics.d(this.tabSelectionColor, tabStyle.tabSelectionColor) && Intrinsics.d(this.tabDefaultTextColor, tabStyle.tabDefaultTextColor) && Intrinsics.d(this.tabSelectionTextColor, tabStyle.tabSelectionTextColor) && Intrinsics.d(this.indicatorDefaultColor, tabStyle.indicatorDefaultColor) && Intrinsics.d(this.indicatorSelectionColor, tabStyle.indicatorSelectionColor) && Intrinsics.d(this.indicatorDefaultTextColor, tabStyle.indicatorDefaultTextColor) && Intrinsics.d(this.indicatorSelectionTextColor, tabStyle.indicatorSelectionTextColor);
        }

        @NotNull
        public final String getIndicatorDefaultColor() {
            return this.indicatorDefaultColor;
        }

        @NotNull
        public final String getIndicatorDefaultTextColor() {
            return this.indicatorDefaultTextColor;
        }

        @NotNull
        public final String getIndicatorSelectionColor() {
            return this.indicatorSelectionColor;
        }

        @NotNull
        public final String getIndicatorSelectionTextColor() {
            return this.indicatorSelectionTextColor;
        }

        @NotNull
        public final String getTabDefaultColor() {
            return this.tabDefaultColor;
        }

        @NotNull
        public final String getTabDefaultTextColor() {
            return this.tabDefaultTextColor;
        }

        @NotNull
        public final String getTabSelectionColor() {
            return this.tabSelectionColor;
        }

        @NotNull
        public final String getTabSelectionTextColor() {
            return this.tabSelectionTextColor;
        }

        public int hashCode() {
            return this.indicatorSelectionTextColor.hashCode() + g.a(g.a(g.a(g.a(g.a(g.a(this.tabDefaultColor.hashCode() * 31, 31, this.tabSelectionColor), 31, this.tabDefaultTextColor), 31, this.tabSelectionTextColor), 31, this.indicatorDefaultColor), 31, this.indicatorSelectionColor), 31, this.indicatorDefaultTextColor);
        }

        @NotNull
        public String toString() {
            String str = this.tabDefaultColor;
            String str2 = this.tabSelectionColor;
            String str3 = this.tabDefaultTextColor;
            String str4 = this.tabSelectionTextColor;
            String str5 = this.indicatorDefaultColor;
            String str6 = this.indicatorSelectionColor;
            String str7 = this.indicatorDefaultTextColor;
            String str8 = this.indicatorSelectionTextColor;
            StringBuilder d11 = C3660k.d("TabStyle(tabDefaultColor=", str, ", tabSelectionColor=", str2, ", tabDefaultTextColor=");
            a.h(d11, str3, ", tabSelectionTextColor=", str4, ", indicatorDefaultColor=");
            a.h(d11, str5, ", indicatorSelectionColor=", str6, ", indicatorDefaultTextColor=");
            return C3173b.c(d11, str7, ", indicatorSelectionTextColor=", str8, ")");
        }
    }

    public FlightSeatsSchemePassengersBlockDTO(@NotNull TextAtom title, TextAtom textAtom, TabStyle tabStyle, @NotNull List<Passenger> passengers, boolean z11) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(passengers, "passengers");
        this.title = title;
        this.destination = textAtom;
        this.passengerTabStyles = tabStyle;
        this.passengers = passengers;
        this.hidePassengers = z11;
    }

    public static /* synthetic */ FlightSeatsSchemePassengersBlockDTO copy$default(FlightSeatsSchemePassengersBlockDTO flightSeatsSchemePassengersBlockDTO, TextAtom textAtom, TextAtom textAtom2, TabStyle tabStyle, List list, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            textAtom = flightSeatsSchemePassengersBlockDTO.title;
        }
        if ((i11 & 2) != 0) {
            textAtom2 = flightSeatsSchemePassengersBlockDTO.destination;
        }
        if ((i11 & 4) != 0) {
            tabStyle = flightSeatsSchemePassengersBlockDTO.passengerTabStyles;
        }
        if ((i11 & 8) != 0) {
            list = flightSeatsSchemePassengersBlockDTO.passengers;
        }
        if ((i11 & 16) != 0) {
            z11 = flightSeatsSchemePassengersBlockDTO.hidePassengers;
        }
        boolean z12 = z11;
        TabStyle tabStyle2 = tabStyle;
        return flightSeatsSchemePassengersBlockDTO.copy(textAtom, textAtom2, tabStyle2, list, z12);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final TextAtom getTitle() {
        return this.title;
    }

    /* renamed from: component2, reason: from getter */
    public final TextAtom getDestination() {
        return this.destination;
    }

    /* renamed from: component3, reason: from getter */
    public final TabStyle getPassengerTabStyles() {
        return this.passengerTabStyles;
    }

    @NotNull
    public final List<Passenger> component4() {
        return this.passengers;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getHidePassengers() {
        return this.hidePassengers;
    }

    @NotNull
    public final FlightSeatsSchemePassengersBlockDTO copy(@NotNull TextAtom title, TextAtom destination, TabStyle passengerTabStyles, @NotNull List<Passenger> passengers, boolean hidePassengers) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(passengers, "passengers");
        return new FlightSeatsSchemePassengersBlockDTO(title, destination, passengerTabStyles, passengers, hidePassengers);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FlightSeatsSchemePassengersBlockDTO)) {
            return false;
        }
        FlightSeatsSchemePassengersBlockDTO flightSeatsSchemePassengersBlockDTO = (FlightSeatsSchemePassengersBlockDTO) other;
        return Intrinsics.d(this.title, flightSeatsSchemePassengersBlockDTO.title) && Intrinsics.d(this.destination, flightSeatsSchemePassengersBlockDTO.destination) && Intrinsics.d(this.passengerTabStyles, flightSeatsSchemePassengersBlockDTO.passengerTabStyles) && Intrinsics.d(this.passengers, flightSeatsSchemePassengersBlockDTO.passengers) && this.hidePassengers == flightSeatsSchemePassengersBlockDTO.hidePassengers;
    }

    public final TextAtom getDestination() {
        return this.destination;
    }

    public final boolean getHidePassengers() {
        return this.hidePassengers;
    }

    public final TabStyle getPassengerTabStyles() {
        return this.passengerTabStyles;
    }

    @NotNull
    public final List<Passenger> getPassengers() {
        return this.passengers;
    }

    @NotNull
    public final TextAtom getTitle() {
        return this.title;
    }

    public int hashCode() {
        int hashCode = this.title.hashCode() * 31;
        TextAtom textAtom = this.destination;
        int hashCode2 = (hashCode + (textAtom == null ? 0 : textAtom.hashCode())) * 31;
        TabStyle tabStyle = this.passengerTabStyles;
        return Boolean.hashCode(this.hidePassengers) + g.b((hashCode2 + (tabStyle != null ? tabStyle.hashCode() : 0)) * 31, 31, this.passengers);
    }

    @NotNull
    public String toString() {
        TextAtom textAtom = this.title;
        TextAtom textAtom2 = this.destination;
        TabStyle tabStyle = this.passengerTabStyles;
        List<Passenger> list = this.passengers;
        boolean z11 = this.hidePassengers;
        StringBuilder a11 = HY.a.a("FlightSeatsSchemePassengersBlockDTO(title=", textAtom, ", destination=", textAtom2, ", passengerTabStyles=");
        a11.append(tabStyle);
        a11.append(", passengers=");
        a11.append(list);
        a11.append(", hidePassengers=");
        return Pk0.a.a(")", a11, z11);
    }

    public FlightSeatsSchemePassengersBlockDTO(TextAtom textAtom, TextAtom textAtom2, TabStyle tabStyle, List list, boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(textAtom, textAtom2, tabStyle, (i11 & 8) != 0 ? K.f71697a : list, (i11 & 16) != 0 ? false : z11);
    }
}
