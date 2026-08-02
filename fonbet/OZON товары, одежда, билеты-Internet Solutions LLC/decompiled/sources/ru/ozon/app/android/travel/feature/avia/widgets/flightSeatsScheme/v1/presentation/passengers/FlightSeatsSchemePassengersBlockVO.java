package ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v1.presentation.passengers;

import Am.C2438a;
import B0.C2454a;
import B90.C2619v;
import Ek.a;
import G.g;
import J0.P;
import K00.b;
import Kk.C3532b;
import N3.C3660k;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0016\b\u0081\b\u0018\u00002\u00020\u0001:\u0003\"#$B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ>\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\tHÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0015\u001a\u00020\t2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u001d\u001a\u0004\b\u001e\u0010\u0013R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u001f\u001a\u0004\b \u0010!¨\u0006%"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/presentation/passengers/FlightSeatsSchemePassengersBlockVO;", "", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "compoundTitle", "", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/presentation/passengers/FlightSeatsSchemePassengersBlockVO$Passenger;", "passengers", "", "selectedPassengerIndex", "", "areTabsVisible", "<init>", "(Lru/ozon/uni/atoms/data/texts/TextAtom;Ljava/util/List;IZ)V", "copy", "(Lru/ozon/uni/atoms/data/texts/TextAtom;Ljava/util/List;IZ)Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/presentation/passengers/FlightSeatsSchemePassengersBlockVO;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "getCompoundTitle", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "Ljava/util/List;", "getPassengers", "()Ljava/util/List;", "I", "getSelectedPassengerIndex", "Z", "getAreTabsVisible", "()Z", "Passenger", "SelectedSeat", "Style", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class FlightSeatsSchemePassengersBlockVO {
    private final boolean areTabsVisible;

    @NotNull
    private final TextAtom compoundTitle;

    @NotNull
    private final List<Passenger> passengers;
    private final int selectedPassengerIndex;

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b!\b\u0087\b\u0018\u00002\u00020\u0001Bk\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\b\b\u0001\u0010\t\u001a\u00020\u0002\u0012\b\b\u0001\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u000b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\u0014\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0010¢\u0006\u0004\b\u0014\u0010\u0015J\u0084\u0001\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0003\u0010\t\u001a\u00020\u00022\b\b\u0003\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000b2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0016\b\u0002\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0010HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001d\u001a\u00020\u00062\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001f\u001a\u0004\b \u0010\u001bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010$\u001a\u0004\b\u0007\u0010%R\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\b\u0010!\u001a\u0004\b&\u0010#R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u001f\u001a\u0004\b'\u0010\u001bR\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u001f\u001a\u0004\b(\u0010\u001bR\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010)\u001a\u0004\b*\u0010+R\u0017\u0010\r\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\r\u0010)\u001a\u0004\b,\u0010+R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010-\u001a\u0004\b.\u0010/R%\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b\u0013\u00100\u001a\u0004\b1\u00102¨\u00063"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/presentation/passengers/FlightSeatsSchemePassengersBlockVO$Passenger;", "", "", "id", "Lru/ozon/uni/atoms/data/texts/TextAtom;", AppMeasurementSdk.ConditionalUserProperty.NAME, "", "isSelected", "shortName", "backgroundColor", "textColor", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/presentation/passengers/FlightSeatsSchemePassengersBlockVO$Style;", "defaultStyle", "selectedStyle", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/presentation/passengers/FlightSeatsSchemePassengersBlockVO$SelectedSeat;", "selectedSeat", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "clickEvent", "<init>", "(ILru/ozon/uni/atoms/data/texts/TextAtom;ZLru/ozon/uni/atoms/data/texts/TextAtom;IILru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/presentation/passengers/FlightSeatsSchemePassengersBlockVO$Style;Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/presentation/passengers/FlightSeatsSchemePassengersBlockVO$Style;Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/presentation/passengers/FlightSeatsSchemePassengersBlockVO$SelectedSeat;Ljava/util/Map;)V", "copy", "(ILru/ozon/uni/atoms/data/texts/TextAtom;ZLru/ozon/uni/atoms/data/texts/TextAtom;IILru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/presentation/passengers/FlightSeatsSchemePassengersBlockVO$Style;Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/presentation/passengers/FlightSeatsSchemePassengersBlockVO$Style;Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/presentation/passengers/FlightSeatsSchemePassengersBlockVO$SelectedSeat;Ljava/util/Map;)Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/presentation/passengers/FlightSeatsSchemePassengersBlockVO$Passenger;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "I", "getId", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "getName", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "Z", "()Z", "getShortName", "getBackgroundColor", "getTextColor", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/presentation/passengers/FlightSeatsSchemePassengersBlockVO$Style;", "getDefaultStyle", "()Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/presentation/passengers/FlightSeatsSchemePassengersBlockVO$Style;", "getSelectedStyle", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/presentation/passengers/FlightSeatsSchemePassengersBlockVO$SelectedSeat;", "getSelectedSeat", "()Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/presentation/passengers/FlightSeatsSchemePassengersBlockVO$SelectedSeat;", "Ljava/util/Map;", "getClickEvent", "()Ljava/util/Map;", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Passenger {
        private final int backgroundColor;
        private final Map<String, TokenizedTrackingInfo> clickEvent;

        @NotNull
        private final Style defaultStyle;
        private final int id;
        private final boolean isSelected;

        @NotNull
        private final TextAtom name;
        private final SelectedSeat selectedSeat;

        @NotNull
        private final Style selectedStyle;

        @NotNull
        private final TextAtom shortName;
        private final int textColor;

        public Passenger(int i11, @NotNull TextAtom name, boolean z11, @NotNull TextAtom shortName, int i12, int i13, @NotNull Style defaultStyle, @NotNull Style selectedStyle, SelectedSeat selectedSeat, Map<String, TokenizedTrackingInfo> map) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(shortName, "shortName");
            Intrinsics.checkNotNullParameter(defaultStyle, "defaultStyle");
            Intrinsics.checkNotNullParameter(selectedStyle, "selectedStyle");
            this.id = i11;
            this.name = name;
            this.isSelected = z11;
            this.shortName = shortName;
            this.backgroundColor = i12;
            this.textColor = i13;
            this.defaultStyle = defaultStyle;
            this.selectedStyle = selectedStyle;
            this.selectedSeat = selectedSeat;
            this.clickEvent = map;
        }

        public static /* synthetic */ Passenger copy$default(Passenger passenger, int i11, TextAtom textAtom, boolean z11, TextAtom textAtom2, int i12, int i13, Style style, Style style2, SelectedSeat selectedSeat, Map map, int i14, Object obj) {
            if ((i14 & 1) != 0) {
                i11 = passenger.id;
            }
            if ((i14 & 2) != 0) {
                textAtom = passenger.name;
            }
            if ((i14 & 4) != 0) {
                z11 = passenger.isSelected;
            }
            if ((i14 & 8) != 0) {
                textAtom2 = passenger.shortName;
            }
            if ((i14 & 16) != 0) {
                i12 = passenger.backgroundColor;
            }
            if ((i14 & 32) != 0) {
                i13 = passenger.textColor;
            }
            if ((i14 & 64) != 0) {
                style = passenger.defaultStyle;
            }
            if ((i14 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
                style2 = passenger.selectedStyle;
            }
            if ((i14 & 256) != 0) {
                selectedSeat = passenger.selectedSeat;
            }
            if ((i14 & UserVerificationMethods.USER_VERIFY_NONE) != 0) {
                map = passenger.clickEvent;
            }
            SelectedSeat selectedSeat2 = selectedSeat;
            Map map2 = map;
            Style style3 = style;
            Style style4 = style2;
            int i15 = i12;
            int i16 = i13;
            return passenger.copy(i11, textAtom, z11, textAtom2, i15, i16, style3, style4, selectedSeat2, map2);
        }

        @NotNull
        public final Passenger copy(int id2, @NotNull TextAtom name, boolean isSelected, @NotNull TextAtom shortName, int backgroundColor, int textColor, @NotNull Style defaultStyle, @NotNull Style selectedStyle, SelectedSeat selectedSeat, Map<String, TokenizedTrackingInfo> clickEvent) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(shortName, "shortName");
            Intrinsics.checkNotNullParameter(defaultStyle, "defaultStyle");
            Intrinsics.checkNotNullParameter(selectedStyle, "selectedStyle");
            return new Passenger(id2, name, isSelected, shortName, backgroundColor, textColor, defaultStyle, selectedStyle, selectedSeat, clickEvent);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Passenger)) {
                return false;
            }
            Passenger passenger = (Passenger) other;
            return this.id == passenger.id && Intrinsics.d(this.name, passenger.name) && this.isSelected == passenger.isSelected && Intrinsics.d(this.shortName, passenger.shortName) && this.backgroundColor == passenger.backgroundColor && this.textColor == passenger.textColor && Intrinsics.d(this.defaultStyle, passenger.defaultStyle) && Intrinsics.d(this.selectedStyle, passenger.selectedStyle) && Intrinsics.d(this.selectedSeat, passenger.selectedSeat) && Intrinsics.d(this.clickEvent, passenger.clickEvent);
        }

        public final int getBackgroundColor() {
            return this.backgroundColor;
        }

        public final Map<String, TokenizedTrackingInfo> getClickEvent() {
            return this.clickEvent;
        }

        @NotNull
        public final Style getDefaultStyle() {
            return this.defaultStyle;
        }

        public final int getId() {
            return this.id;
        }

        @NotNull
        public final TextAtom getName() {
            return this.name;
        }

        public final SelectedSeat getSelectedSeat() {
            return this.selectedSeat;
        }

        @NotNull
        public final Style getSelectedStyle() {
            return this.selectedStyle;
        }

        @NotNull
        public final TextAtom getShortName() {
            return this.shortName;
        }

        public final int getTextColor() {
            return this.textColor;
        }

        public int hashCode() {
            int hashCode = (this.selectedStyle.hashCode() + ((this.defaultStyle.hashCode() + C2454a.a(this.textColor, C2454a.a(this.backgroundColor, C2619v.b(C3532b.a(C2619v.b(Integer.hashCode(this.id) * 31, 31, this.name), 31, this.isSelected), 31, this.shortName), 31), 31)) * 31)) * 31;
            SelectedSeat selectedSeat = this.selectedSeat;
            int hashCode2 = (hashCode + (selectedSeat == null ? 0 : selectedSeat.hashCode())) * 31;
            Map<String, TokenizedTrackingInfo> map = this.clickEvent;
            return hashCode2 + (map != null ? map.hashCode() : 0);
        }

        /* renamed from: isSelected, reason: from getter */
        public final boolean getIsSelected() {
            return this.isSelected;
        }

        @NotNull
        public String toString() {
            int i11 = this.id;
            TextAtom textAtom = this.name;
            boolean z11 = this.isSelected;
            TextAtom textAtom2 = this.shortName;
            int i12 = this.backgroundColor;
            int i13 = this.textColor;
            Style style = this.defaultStyle;
            Style style2 = this.selectedStyle;
            SelectedSeat selectedSeat = this.selectedSeat;
            Map<String, TokenizedTrackingInfo> map = this.clickEvent;
            StringBuilder sb2 = new StringBuilder("Passenger(id=");
            sb2.append(i11);
            sb2.append(", name=");
            sb2.append(textAtom);
            sb2.append(", isSelected=");
            sb2.append(z11);
            sb2.append(", shortName=");
            sb2.append(textAtom2);
            sb2.append(", backgroundColor=");
            a.f(i12, i13, ", textColor=", ", defaultStyle=", sb2);
            sb2.append(style);
            sb2.append(", selectedStyle=");
            sb2.append(style2);
            sb2.append(", selectedSeat=");
            sb2.append(selectedSeat);
            sb2.append(", clickEvent=");
            sb2.append(map);
            sb2.append(")");
            return sb2.toString();
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ.\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u00042\b\b\u0003\u0010\u0006\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0016\u0010\u000eR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0015\u001a\u0004\b\u0017\u0010\u000e¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/presentation/passengers/FlightSeatsSchemePassengersBlockVO$SelectedSeat;", "", "", "number", "", "backgroundColor", "textColor", "<init>", "(Ljava/lang/String;II)V", "copy", "(Ljava/lang/String;II)Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/presentation/passengers/FlightSeatsSchemePassengersBlockVO$SelectedSeat;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getNumber", "I", "getBackgroundColor", "getTextColor", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class SelectedSeat {
        private final int backgroundColor;

        @NotNull
        private final String number;
        private final int textColor;

        public SelectedSeat(@NotNull String number, int i11, int i12) {
            Intrinsics.checkNotNullParameter(number, "number");
            this.number = number;
            this.backgroundColor = i11;
            this.textColor = i12;
        }

        public static /* synthetic */ SelectedSeat copy$default(SelectedSeat selectedSeat, String str, int i11, int i12, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                str = selectedSeat.number;
            }
            if ((i13 & 2) != 0) {
                i11 = selectedSeat.backgroundColor;
            }
            if ((i13 & 4) != 0) {
                i12 = selectedSeat.textColor;
            }
            return selectedSeat.copy(str, i11, i12);
        }

        @NotNull
        public final SelectedSeat copy(@NotNull String number, int backgroundColor, int textColor) {
            Intrinsics.checkNotNullParameter(number, "number");
            return new SelectedSeat(number, backgroundColor, textColor);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SelectedSeat)) {
                return false;
            }
            SelectedSeat selectedSeat = (SelectedSeat) other;
            return Intrinsics.d(this.number, selectedSeat.number) && this.backgroundColor == selectedSeat.backgroundColor && this.textColor == selectedSeat.textColor;
        }

        public final int getBackgroundColor() {
            return this.backgroundColor;
        }

        @NotNull
        public final String getNumber() {
            return this.number;
        }

        public final int getTextColor() {
            return this.textColor;
        }

        public int hashCode() {
            return Integer.hashCode(this.textColor) + C2454a.a(this.backgroundColor, this.number.hashCode() * 31, 31);
        }

        @NotNull
        public String toString() {
            String str = this.number;
            return b.e(this.textColor, ")", C3660k.c(this.backgroundColor, "SelectedSeat(number=", str, ", backgroundColor=", ", textColor="));
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\rR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0012\u001a\u0004\b\u0014\u0010\rR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0012\u001a\u0004\b\u0015\u0010\rR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0012\u001a\u0004\b\u0016\u0010\r¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/presentation/passengers/FlightSeatsSchemePassengersBlockVO$Style;", "", "", "tabBackgroundColor", "tabTextColor", "indicatorBackgroundColor", "indicatorTextColor", "<init>", "(IIII)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getTabBackgroundColor", "getTabTextColor", "getIndicatorBackgroundColor", "getIndicatorTextColor", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Style {
        private final int indicatorBackgroundColor;
        private final int indicatorTextColor;
        private final int tabBackgroundColor;
        private final int tabTextColor;

        public Style(int i11, int i12, int i13, int i14) {
            this.tabBackgroundColor = i11;
            this.tabTextColor = i12;
            this.indicatorBackgroundColor = i13;
            this.indicatorTextColor = i14;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Style)) {
                return false;
            }
            Style style = (Style) other;
            return this.tabBackgroundColor == style.tabBackgroundColor && this.tabTextColor == style.tabTextColor && this.indicatorBackgroundColor == style.indicatorBackgroundColor && this.indicatorTextColor == style.indicatorTextColor;
        }

        public final int getIndicatorBackgroundColor() {
            return this.indicatorBackgroundColor;
        }

        public final int getIndicatorTextColor() {
            return this.indicatorTextColor;
        }

        public final int getTabBackgroundColor() {
            return this.tabBackgroundColor;
        }

        public final int getTabTextColor() {
            return this.tabTextColor;
        }

        public int hashCode() {
            return Integer.hashCode(this.indicatorTextColor) + C2454a.a(this.indicatorBackgroundColor, C2454a.a(this.tabTextColor, Integer.hashCode(this.tabBackgroundColor) * 31, 31), 31);
        }

        @NotNull
        public String toString() {
            return P.a(this.indicatorBackgroundColor, this.indicatorTextColor, ", indicatorTextColor=", ")", C2438a.a("Style(tabBackgroundColor=", this.tabBackgroundColor, ", tabTextColor=", ", indicatorBackgroundColor=", this.tabTextColor));
        }
    }

    public FlightSeatsSchemePassengersBlockVO(@NotNull TextAtom compoundTitle, @NotNull List<Passenger> passengers, int i11, boolean z11) {
        Intrinsics.checkNotNullParameter(compoundTitle, "compoundTitle");
        Intrinsics.checkNotNullParameter(passengers, "passengers");
        this.compoundTitle = compoundTitle;
        this.passengers = passengers;
        this.selectedPassengerIndex = i11;
        this.areTabsVisible = z11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FlightSeatsSchemePassengersBlockVO copy$default(FlightSeatsSchemePassengersBlockVO flightSeatsSchemePassengersBlockVO, TextAtom textAtom, List list, int i11, boolean z11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            textAtom = flightSeatsSchemePassengersBlockVO.compoundTitle;
        }
        if ((i12 & 2) != 0) {
            list = flightSeatsSchemePassengersBlockVO.passengers;
        }
        if ((i12 & 4) != 0) {
            i11 = flightSeatsSchemePassengersBlockVO.selectedPassengerIndex;
        }
        if ((i12 & 8) != 0) {
            z11 = flightSeatsSchemePassengersBlockVO.areTabsVisible;
        }
        return flightSeatsSchemePassengersBlockVO.copy(textAtom, list, i11, z11);
    }

    @NotNull
    public final FlightSeatsSchemePassengersBlockVO copy(@NotNull TextAtom compoundTitle, @NotNull List<Passenger> passengers, int selectedPassengerIndex, boolean areTabsVisible) {
        Intrinsics.checkNotNullParameter(compoundTitle, "compoundTitle");
        Intrinsics.checkNotNullParameter(passengers, "passengers");
        return new FlightSeatsSchemePassengersBlockVO(compoundTitle, passengers, selectedPassengerIndex, areTabsVisible);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FlightSeatsSchemePassengersBlockVO)) {
            return false;
        }
        FlightSeatsSchemePassengersBlockVO flightSeatsSchemePassengersBlockVO = (FlightSeatsSchemePassengersBlockVO) other;
        return Intrinsics.d(this.compoundTitle, flightSeatsSchemePassengersBlockVO.compoundTitle) && Intrinsics.d(this.passengers, flightSeatsSchemePassengersBlockVO.passengers) && this.selectedPassengerIndex == flightSeatsSchemePassengersBlockVO.selectedPassengerIndex && this.areTabsVisible == flightSeatsSchemePassengersBlockVO.areTabsVisible;
    }

    public final boolean getAreTabsVisible() {
        return this.areTabsVisible;
    }

    @NotNull
    public final TextAtom getCompoundTitle() {
        return this.compoundTitle;
    }

    @NotNull
    public final List<Passenger> getPassengers() {
        return this.passengers;
    }

    public final int getSelectedPassengerIndex() {
        return this.selectedPassengerIndex;
    }

    public int hashCode() {
        return Boolean.hashCode(this.areTabsVisible) + C2454a.a(this.selectedPassengerIndex, g.b(this.compoundTitle.hashCode() * 31, 31, this.passengers), 31);
    }

    @NotNull
    public String toString() {
        return "FlightSeatsSchemePassengersBlockVO(compoundTitle=" + this.compoundTitle + ", passengers=" + this.passengers + ", selectedPassengerIndex=" + this.selectedPassengerIndex + ", areTabsVisible=" + this.areTabsVisible + ")";
    }
}
