package ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v2.presentation.footer;

import A00.a;
import Am.C2438a;
import B0.C2454a;
import D40.d;
import De.C2859b;
import G.g;
import Kk.C3532b;
import N3.C3660k;
import Ns.b;
import T7.P;
import Tz.C4055a;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.common.CommonAtomIconDTO;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u001d\b\u0081\b\u0018\u00002\u00020\u0001:\u0003789Be\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0012\u001a\u00020\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0014\u0010\u0015J\u0080\u0001\u0010\u0016\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u00102\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u00102\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010$\u001a\u0004\b%\u0010\u001cR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010&\u001a\u0004\b'\u0010(R\u0017\u0010\t\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010&\u001a\u0004\b)\u0010(R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010*\u001a\u0004\b+\u0010,R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u0010-\u001a\u0004\b.\u0010/R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u00100\u001a\u0004\b1\u00102R\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u00103\u001a\u0004\b\u0011\u00104R\u0017\u0010\u0012\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0012\u00103\u001a\u0004\b5\u00104R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u0013\u0010*\u001a\u0004\b6\u0010,¨\u0006:"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/presentation/footer/FlightSeatsSchemeV2FooterBlockVI;", "LA00/a$J$a;", "", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/presentation/footer/FlightSeatsSchemeV2FooterBlockVI$PassengerV2VI;", "passengers", "", "selectedPassengerIndex", "Lru/ozon/uni/atoms/data/text/TextDTO;", "caption", "price", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "submitButton", "Lru/ozon/uni/atoms/data/common/CommonAtomIconDTO;", "infoIcon", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "", "isUpdatedFromRemote", "hideInfo", "skipButton", "<init>", "(Ljava/util/List;ILru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;Lru/ozon/uni/atoms/data/common/CommonAtomIconDTO;Lru/ozon/uni/atoms/af/AtomAction;ZZLru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;)V", "copy", "(Ljava/util/List;ILru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;Lru/ozon/uni/atoms/data/common/CommonAtomIconDTO;Lru/ozon/uni/atoms/af/AtomAction;ZZLru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;)Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/presentation/footer/FlightSeatsSchemeV2FooterBlockVI;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getPassengers", "()Ljava/util/List;", "I", "getSelectedPassengerIndex", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getCaption", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getPrice", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "getSubmitButton", "()Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "Lru/ozon/uni/atoms/data/common/CommonAtomIconDTO;", "getInfoIcon", "()Lru/ozon/uni/atoms/data/common/CommonAtomIconDTO;", "Lru/ozon/uni/atoms/af/AtomAction;", "getAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "Z", "()Z", "getHideInfo", "getSkipButton", "PassengerV2VI", "SelectedSeatV2VI", "TabStyleV2VI", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class FlightSeatsSchemeV2FooterBlockVI implements a.J.InterfaceC0007a {
    private final AtomAction action;

    @NotNull
    private final TextDTO caption;
    private final boolean hideInfo;
    private final CommonAtomIconDTO infoIcon;
    private final boolean isUpdatedFromRemote;

    @NotNull
    private final List<PassengerV2VI> passengers;

    @NotNull
    private final TextDTO price;
    private final int selectedPassengerIndex;
    private final ButtonV3DTO skipButton;

    @NotNull
    private final ButtonV3DTO submitButton;

    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b#\b\u0087\b\u0018\u00002\u00020\u0001Bs\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\b\b\u0001\u0010\t\u001a\u00020\u0002\u0012\b\b\u0001\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u000b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0014\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012¢\u0006\u0004\b\u0015\u0010\u0016J\u008e\u0001\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0003\u0010\t\u001a\u00020\u00022\b\b\u0003\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000b2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\u0016\b\u0002\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012HÆ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001e\u001a\u00020\u00062\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\u001cR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\"\u001a\u0004\b#\u0010$R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010%\u001a\u0004\b\u0007\u0010&R\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\b\u0010\"\u001a\u0004\b'\u0010$R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010 \u001a\u0004\b(\u0010\u001cR\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010 \u001a\u0004\b)\u0010\u001cR\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010*\u001a\u0004\b+\u0010,R\u0017\u0010\r\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\r\u0010*\u001a\u0004\b-\u0010,R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010.\u001a\u0004\b/\u00100R\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u00101\u001a\u0004\b2\u0010\u001aR%\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\b\u0014\u00103\u001a\u0004\b4\u00105¨\u00066"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/presentation/footer/FlightSeatsSchemeV2FooterBlockVI$PassengerV2VI;", "", "", "id", "Lru/ozon/uni/atoms/data/text/TextDTO;", AppMeasurementSdk.ConditionalUserProperty.NAME, "", "isSelected", "shortName", "backgroundColor", "textColor", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/presentation/footer/FlightSeatsSchemeV2FooterBlockVI$TabStyleV2VI;", "defaultStyle", "selectedStyle", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/presentation/footer/FlightSeatsSchemeV2FooterBlockVI$SelectedSeatV2VI;", "selectedSeat", "", "subtitleName", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "clickEvent", "<init>", "(ILru/ozon/uni/atoms/data/text/TextDTO;ZLru/ozon/uni/atoms/data/text/TextDTO;IILru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/presentation/footer/FlightSeatsSchemeV2FooterBlockVI$TabStyleV2VI;Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/presentation/footer/FlightSeatsSchemeV2FooterBlockVI$TabStyleV2VI;Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/presentation/footer/FlightSeatsSchemeV2FooterBlockVI$SelectedSeatV2VI;Ljava/lang/String;Ljava/util/Map;)V", "copy", "(ILru/ozon/uni/atoms/data/text/TextDTO;ZLru/ozon/uni/atoms/data/text/TextDTO;IILru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/presentation/footer/FlightSeatsSchemeV2FooterBlockVI$TabStyleV2VI;Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/presentation/footer/FlightSeatsSchemeV2FooterBlockVI$TabStyleV2VI;Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/presentation/footer/FlightSeatsSchemeV2FooterBlockVI$SelectedSeatV2VI;Ljava/lang/String;Ljava/util/Map;)Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/presentation/footer/FlightSeatsSchemeV2FooterBlockVI$PassengerV2VI;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "I", "getId", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getName", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "Z", "()Z", "getShortName", "getBackgroundColor", "getTextColor", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/presentation/footer/FlightSeatsSchemeV2FooterBlockVI$TabStyleV2VI;", "getDefaultStyle", "()Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/presentation/footer/FlightSeatsSchemeV2FooterBlockVI$TabStyleV2VI;", "getSelectedStyle", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/presentation/footer/FlightSeatsSchemeV2FooterBlockVI$SelectedSeatV2VI;", "getSelectedSeat", "()Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/presentation/footer/FlightSeatsSchemeV2FooterBlockVI$SelectedSeatV2VI;", "Ljava/lang/String;", "getSubtitleName", "Ljava/util/Map;", "getClickEvent", "()Ljava/util/Map;", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class PassengerV2VI {
        private final int backgroundColor;
        private final Map<String, TokenizedTrackingInfo> clickEvent;

        @NotNull
        private final TabStyleV2VI defaultStyle;
        private final int id;
        private final boolean isSelected;

        @NotNull
        private final TextDTO name;
        private final SelectedSeatV2VI selectedSeat;

        @NotNull
        private final TabStyleV2VI selectedStyle;

        @NotNull
        private final TextDTO shortName;

        @NotNull
        private final String subtitleName;
        private final int textColor;

        public PassengerV2VI(int i11, @NotNull TextDTO name, boolean z11, @NotNull TextDTO shortName, int i12, int i13, @NotNull TabStyleV2VI defaultStyle, @NotNull TabStyleV2VI selectedStyle, SelectedSeatV2VI selectedSeatV2VI, @NotNull String subtitleName, Map<String, TokenizedTrackingInfo> map) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(shortName, "shortName");
            Intrinsics.checkNotNullParameter(defaultStyle, "defaultStyle");
            Intrinsics.checkNotNullParameter(selectedStyle, "selectedStyle");
            Intrinsics.checkNotNullParameter(subtitleName, "subtitleName");
            this.id = i11;
            this.name = name;
            this.isSelected = z11;
            this.shortName = shortName;
            this.backgroundColor = i12;
            this.textColor = i13;
            this.defaultStyle = defaultStyle;
            this.selectedStyle = selectedStyle;
            this.selectedSeat = selectedSeatV2VI;
            this.subtitleName = subtitleName;
            this.clickEvent = map;
        }

        public static /* synthetic */ PassengerV2VI copy$default(PassengerV2VI passengerV2VI, int i11, TextDTO textDTO, boolean z11, TextDTO textDTO2, int i12, int i13, TabStyleV2VI tabStyleV2VI, TabStyleV2VI tabStyleV2VI2, SelectedSeatV2VI selectedSeatV2VI, String str, Map map, int i14, Object obj) {
            if ((i14 & 1) != 0) {
                i11 = passengerV2VI.id;
            }
            if ((i14 & 2) != 0) {
                textDTO = passengerV2VI.name;
            }
            if ((i14 & 4) != 0) {
                z11 = passengerV2VI.isSelected;
            }
            if ((i14 & 8) != 0) {
                textDTO2 = passengerV2VI.shortName;
            }
            if ((i14 & 16) != 0) {
                i12 = passengerV2VI.backgroundColor;
            }
            if ((i14 & 32) != 0) {
                i13 = passengerV2VI.textColor;
            }
            if ((i14 & 64) != 0) {
                tabStyleV2VI = passengerV2VI.defaultStyle;
            }
            if ((i14 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
                tabStyleV2VI2 = passengerV2VI.selectedStyle;
            }
            if ((i14 & 256) != 0) {
                selectedSeatV2VI = passengerV2VI.selectedSeat;
            }
            if ((i14 & UserVerificationMethods.USER_VERIFY_NONE) != 0) {
                str = passengerV2VI.subtitleName;
            }
            if ((i14 & UserVerificationMethods.USER_VERIFY_ALL) != 0) {
                map = passengerV2VI.clickEvent;
            }
            String str2 = str;
            Map map2 = map;
            TabStyleV2VI tabStyleV2VI3 = tabStyleV2VI2;
            SelectedSeatV2VI selectedSeatV2VI2 = selectedSeatV2VI;
            int i15 = i13;
            TabStyleV2VI tabStyleV2VI4 = tabStyleV2VI;
            int i16 = i12;
            boolean z12 = z11;
            return passengerV2VI.copy(i11, textDTO, z12, textDTO2, i16, i15, tabStyleV2VI4, tabStyleV2VI3, selectedSeatV2VI2, str2, map2);
        }

        @NotNull
        public final PassengerV2VI copy(int id2, @NotNull TextDTO name, boolean isSelected, @NotNull TextDTO shortName, int backgroundColor, int textColor, @NotNull TabStyleV2VI defaultStyle, @NotNull TabStyleV2VI selectedStyle, SelectedSeatV2VI selectedSeat, @NotNull String subtitleName, Map<String, TokenizedTrackingInfo> clickEvent) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(shortName, "shortName");
            Intrinsics.checkNotNullParameter(defaultStyle, "defaultStyle");
            Intrinsics.checkNotNullParameter(selectedStyle, "selectedStyle");
            Intrinsics.checkNotNullParameter(subtitleName, "subtitleName");
            return new PassengerV2VI(id2, name, isSelected, shortName, backgroundColor, textColor, defaultStyle, selectedStyle, selectedSeat, subtitleName, clickEvent);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PassengerV2VI)) {
                return false;
            }
            PassengerV2VI passengerV2VI = (PassengerV2VI) other;
            return this.id == passengerV2VI.id && Intrinsics.d(this.name, passengerV2VI.name) && this.isSelected == passengerV2VI.isSelected && Intrinsics.d(this.shortName, passengerV2VI.shortName) && this.backgroundColor == passengerV2VI.backgroundColor && this.textColor == passengerV2VI.textColor && Intrinsics.d(this.defaultStyle, passengerV2VI.defaultStyle) && Intrinsics.d(this.selectedStyle, passengerV2VI.selectedStyle) && Intrinsics.d(this.selectedSeat, passengerV2VI.selectedSeat) && Intrinsics.d(this.subtitleName, passengerV2VI.subtitleName) && Intrinsics.d(this.clickEvent, passengerV2VI.clickEvent);
        }

        public final int getBackgroundColor() {
            return this.backgroundColor;
        }

        public final Map<String, TokenizedTrackingInfo> getClickEvent() {
            return this.clickEvent;
        }

        @NotNull
        public final TabStyleV2VI getDefaultStyle() {
            return this.defaultStyle;
        }

        public final int getId() {
            return this.id;
        }

        @NotNull
        public final TextDTO getName() {
            return this.name;
        }

        public final SelectedSeatV2VI getSelectedSeat() {
            return this.selectedSeat;
        }

        @NotNull
        public final TabStyleV2VI getSelectedStyle() {
            return this.selectedStyle;
        }

        @NotNull
        public final TextDTO getShortName() {
            return this.shortName;
        }

        @NotNull
        public final String getSubtitleName() {
            return this.subtitleName;
        }

        public final int getTextColor() {
            return this.textColor;
        }

        public int hashCode() {
            int hashCode = (this.selectedStyle.hashCode() + ((this.defaultStyle.hashCode() + C2454a.a(this.textColor, C2454a.a(this.backgroundColor, b.a(this.shortName, C3532b.a(b.a(this.name, Integer.hashCode(this.id) * 31, 31), 31, this.isSelected), 31), 31), 31)) * 31)) * 31;
            SelectedSeatV2VI selectedSeatV2VI = this.selectedSeat;
            int a11 = g.a((hashCode + (selectedSeatV2VI == null ? 0 : selectedSeatV2VI.hashCode())) * 31, 31, this.subtitleName);
            Map<String, TokenizedTrackingInfo> map = this.clickEvent;
            return a11 + (map != null ? map.hashCode() : 0);
        }

        /* renamed from: isSelected, reason: from getter */
        public final boolean getIsSelected() {
            return this.isSelected;
        }

        @NotNull
        public String toString() {
            int i11 = this.id;
            TextDTO textDTO = this.name;
            boolean z11 = this.isSelected;
            TextDTO textDTO2 = this.shortName;
            int i12 = this.backgroundColor;
            int i13 = this.textColor;
            TabStyleV2VI tabStyleV2VI = this.defaultStyle;
            TabStyleV2VI tabStyleV2VI2 = this.selectedStyle;
            SelectedSeatV2VI selectedSeatV2VI = this.selectedSeat;
            String str = this.subtitleName;
            Map<String, TokenizedTrackingInfo> map = this.clickEvent;
            StringBuilder b11 = C4055a.b(textDTO, "PassengerV2VI(id=", ", name=", ", isSelected=", i11);
            b11.append(z11);
            b11.append(", shortName=");
            b11.append(textDTO2);
            b11.append(", backgroundColor=");
            Ek.a.f(i12, i13, ", textColor=", ", defaultStyle=", b11);
            b11.append(tabStyleV2VI);
            b11.append(", selectedStyle=");
            b11.append(tabStyleV2VI2);
            b11.append(", selectedSeat=");
            b11.append(selectedSeatV2VI);
            b11.append(", subtitleName=");
            b11.append(str);
            b11.append(", clickEvent=");
            return P.f(b11, map, ")");
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ.\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u00042\b\b\u0003\u0010\u0006\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0016\u0010\u000eR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0015\u001a\u0004\b\u0017\u0010\u000e¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/presentation/footer/FlightSeatsSchemeV2FooterBlockVI$SelectedSeatV2VI;", "", "", "number", "", "backgroundColor", "textColor", "<init>", "(Ljava/lang/String;II)V", "copy", "(Ljava/lang/String;II)Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/presentation/footer/FlightSeatsSchemeV2FooterBlockVI$SelectedSeatV2VI;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getNumber", "I", "getBackgroundColor", "getTextColor", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class SelectedSeatV2VI {
        private final int backgroundColor;

        @NotNull
        private final String number;
        private final int textColor;

        public SelectedSeatV2VI(@NotNull String number, int i11, int i12) {
            Intrinsics.checkNotNullParameter(number, "number");
            this.number = number;
            this.backgroundColor = i11;
            this.textColor = i12;
        }

        public static /* synthetic */ SelectedSeatV2VI copy$default(SelectedSeatV2VI selectedSeatV2VI, String str, int i11, int i12, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                str = selectedSeatV2VI.number;
            }
            if ((i13 & 2) != 0) {
                i11 = selectedSeatV2VI.backgroundColor;
            }
            if ((i13 & 4) != 0) {
                i12 = selectedSeatV2VI.textColor;
            }
            return selectedSeatV2VI.copy(str, i11, i12);
        }

        @NotNull
        public final SelectedSeatV2VI copy(@NotNull String number, int backgroundColor, int textColor) {
            Intrinsics.checkNotNullParameter(number, "number");
            return new SelectedSeatV2VI(number, backgroundColor, textColor);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SelectedSeatV2VI)) {
                return false;
            }
            SelectedSeatV2VI selectedSeatV2VI = (SelectedSeatV2VI) other;
            return Intrinsics.d(this.number, selectedSeatV2VI.number) && this.backgroundColor == selectedSeatV2VI.backgroundColor && this.textColor == selectedSeatV2VI.textColor;
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
            return K00.b.e(this.textColor, ")", C3660k.c(this.backgroundColor, "SelectedSeatV2VI(number=", str, ", backgroundColor=", ", textColor="));
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\rR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0012\u001a\u0004\b\u0014\u0010\rR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0012\u001a\u0004\b\u0015\u0010\rR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0012\u001a\u0004\b\u0016\u0010\r¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/presentation/footer/FlightSeatsSchemeV2FooterBlockVI$TabStyleV2VI;", "", "", "tabBackgroundColor", "tabTextColor", "indicatorBackgroundColor", "indicatorTextColor", "<init>", "(IIII)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getTabBackgroundColor", "getTabTextColor", "getIndicatorBackgroundColor", "getIndicatorTextColor", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class TabStyleV2VI {
        private final int indicatorBackgroundColor;
        private final int indicatorTextColor;
        private final int tabBackgroundColor;
        private final int tabTextColor;

        public TabStyleV2VI(int i11, int i12, int i13, int i14) {
            this.tabBackgroundColor = i11;
            this.tabTextColor = i12;
            this.indicatorBackgroundColor = i13;
            this.indicatorTextColor = i14;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TabStyleV2VI)) {
                return false;
            }
            TabStyleV2VI tabStyleV2VI = (TabStyleV2VI) other;
            return this.tabBackgroundColor == tabStyleV2VI.tabBackgroundColor && this.tabTextColor == tabStyleV2VI.tabTextColor && this.indicatorBackgroundColor == tabStyleV2VI.indicatorBackgroundColor && this.indicatorTextColor == tabStyleV2VI.indicatorTextColor;
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
            return J0.P.a(this.indicatorBackgroundColor, this.indicatorTextColor, ", indicatorTextColor=", ")", C2438a.a("TabStyleV2VI(tabBackgroundColor=", this.tabBackgroundColor, ", tabTextColor=", ", indicatorBackgroundColor=", this.tabTextColor));
        }
    }

    public FlightSeatsSchemeV2FooterBlockVI(@NotNull List<PassengerV2VI> passengers, int i11, @NotNull TextDTO caption, @NotNull TextDTO price, @NotNull ButtonV3DTO submitButton, CommonAtomIconDTO commonAtomIconDTO, AtomAction atomAction, boolean z11, boolean z12, ButtonV3DTO buttonV3DTO) {
        Intrinsics.checkNotNullParameter(passengers, "passengers");
        Intrinsics.checkNotNullParameter(caption, "caption");
        Intrinsics.checkNotNullParameter(price, "price");
        Intrinsics.checkNotNullParameter(submitButton, "submitButton");
        this.passengers = passengers;
        this.selectedPassengerIndex = i11;
        this.caption = caption;
        this.price = price;
        this.submitButton = submitButton;
        this.infoIcon = commonAtomIconDTO;
        this.action = atomAction;
        this.isUpdatedFromRemote = z11;
        this.hideInfo = z12;
        this.skipButton = buttonV3DTO;
    }

    public static /* synthetic */ FlightSeatsSchemeV2FooterBlockVI copy$default(FlightSeatsSchemeV2FooterBlockVI flightSeatsSchemeV2FooterBlockVI, List list, int i11, TextDTO textDTO, TextDTO textDTO2, ButtonV3DTO buttonV3DTO, CommonAtomIconDTO commonAtomIconDTO, AtomAction atomAction, boolean z11, boolean z12, ButtonV3DTO buttonV3DTO2, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            list = flightSeatsSchemeV2FooterBlockVI.passengers;
        }
        if ((i12 & 2) != 0) {
            i11 = flightSeatsSchemeV2FooterBlockVI.selectedPassengerIndex;
        }
        if ((i12 & 4) != 0) {
            textDTO = flightSeatsSchemeV2FooterBlockVI.caption;
        }
        if ((i12 & 8) != 0) {
            textDTO2 = flightSeatsSchemeV2FooterBlockVI.price;
        }
        if ((i12 & 16) != 0) {
            buttonV3DTO = flightSeatsSchemeV2FooterBlockVI.submitButton;
        }
        if ((i12 & 32) != 0) {
            commonAtomIconDTO = flightSeatsSchemeV2FooterBlockVI.infoIcon;
        }
        if ((i12 & 64) != 0) {
            atomAction = flightSeatsSchemeV2FooterBlockVI.action;
        }
        if ((i12 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
            z11 = flightSeatsSchemeV2FooterBlockVI.isUpdatedFromRemote;
        }
        if ((i12 & 256) != 0) {
            z12 = flightSeatsSchemeV2FooterBlockVI.hideInfo;
        }
        if ((i12 & UserVerificationMethods.USER_VERIFY_NONE) != 0) {
            buttonV3DTO2 = flightSeatsSchemeV2FooterBlockVI.skipButton;
        }
        boolean z13 = z12;
        ButtonV3DTO buttonV3DTO3 = buttonV3DTO2;
        AtomAction atomAction2 = atomAction;
        boolean z14 = z11;
        ButtonV3DTO buttonV3DTO4 = buttonV3DTO;
        CommonAtomIconDTO commonAtomIconDTO2 = commonAtomIconDTO;
        return flightSeatsSchemeV2FooterBlockVI.copy(list, i11, textDTO, textDTO2, buttonV3DTO4, commonAtomIconDTO2, atomAction2, z14, z13, buttonV3DTO3);
    }

    @NotNull
    public final FlightSeatsSchemeV2FooterBlockVI copy(@NotNull List<PassengerV2VI> passengers, int selectedPassengerIndex, @NotNull TextDTO caption, @NotNull TextDTO price, @NotNull ButtonV3DTO submitButton, CommonAtomIconDTO infoIcon, AtomAction action, boolean isUpdatedFromRemote, boolean hideInfo, ButtonV3DTO skipButton) {
        Intrinsics.checkNotNullParameter(passengers, "passengers");
        Intrinsics.checkNotNullParameter(caption, "caption");
        Intrinsics.checkNotNullParameter(price, "price");
        Intrinsics.checkNotNullParameter(submitButton, "submitButton");
        return new FlightSeatsSchemeV2FooterBlockVI(passengers, selectedPassengerIndex, caption, price, submitButton, infoIcon, action, isUpdatedFromRemote, hideInfo, skipButton);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FlightSeatsSchemeV2FooterBlockVI)) {
            return false;
        }
        FlightSeatsSchemeV2FooterBlockVI flightSeatsSchemeV2FooterBlockVI = (FlightSeatsSchemeV2FooterBlockVI) other;
        return Intrinsics.d(this.passengers, flightSeatsSchemeV2FooterBlockVI.passengers) && this.selectedPassengerIndex == flightSeatsSchemeV2FooterBlockVI.selectedPassengerIndex && Intrinsics.d(this.caption, flightSeatsSchemeV2FooterBlockVI.caption) && Intrinsics.d(this.price, flightSeatsSchemeV2FooterBlockVI.price) && Intrinsics.d(this.submitButton, flightSeatsSchemeV2FooterBlockVI.submitButton) && Intrinsics.d(this.infoIcon, flightSeatsSchemeV2FooterBlockVI.infoIcon) && Intrinsics.d(this.action, flightSeatsSchemeV2FooterBlockVI.action) && this.isUpdatedFromRemote == flightSeatsSchemeV2FooterBlockVI.isUpdatedFromRemote && this.hideInfo == flightSeatsSchemeV2FooterBlockVI.hideInfo && Intrinsics.d(this.skipButton, flightSeatsSchemeV2FooterBlockVI.skipButton);
    }

    public final AtomAction getAction() {
        return this.action;
    }

    @NotNull
    public final TextDTO getCaption() {
        return this.caption;
    }

    public final boolean getHideInfo() {
        return this.hideInfo;
    }

    public final CommonAtomIconDTO getInfoIcon() {
        return this.infoIcon;
    }

    @NotNull
    public final List<PassengerV2VI> getPassengers() {
        return this.passengers;
    }

    @NotNull
    public final TextDTO getPrice() {
        return this.price;
    }

    public final int getSelectedPassengerIndex() {
        return this.selectedPassengerIndex;
    }

    public final ButtonV3DTO getSkipButton() {
        return this.skipButton;
    }

    @NotNull
    public final ButtonV3DTO getSubmitButton() {
        return this.submitButton;
    }

    public int hashCode() {
        int c11 = C2859b.c(this.submitButton, b.a(this.price, b.a(this.caption, C2454a.a(this.selectedPassengerIndex, this.passengers.hashCode() * 31, 31), 31), 31), 31);
        CommonAtomIconDTO commonAtomIconDTO = this.infoIcon;
        int hashCode = (c11 + (commonAtomIconDTO == null ? 0 : commonAtomIconDTO.hashCode())) * 31;
        AtomAction atomAction = this.action;
        int a11 = C3532b.a(C3532b.a((hashCode + (atomAction == null ? 0 : atomAction.hashCode())) * 31, 31, this.isUpdatedFromRemote), 31, this.hideInfo);
        ButtonV3DTO buttonV3DTO = this.skipButton;
        return a11 + (buttonV3DTO != null ? buttonV3DTO.hashCode() : 0);
    }

    /* renamed from: isUpdatedFromRemote, reason: from getter */
    public final boolean getIsUpdatedFromRemote() {
        return this.isUpdatedFromRemote;
    }

    @NotNull
    public String toString() {
        List<PassengerV2VI> list = this.passengers;
        int i11 = this.selectedPassengerIndex;
        TextDTO textDTO = this.caption;
        TextDTO textDTO2 = this.price;
        ButtonV3DTO buttonV3DTO = this.submitButton;
        CommonAtomIconDTO commonAtomIconDTO = this.infoIcon;
        AtomAction atomAction = this.action;
        boolean z11 = this.isUpdatedFromRemote;
        boolean z12 = this.hideInfo;
        ButtonV3DTO buttonV3DTO2 = this.skipButton;
        StringBuilder sb2 = new StringBuilder("FlightSeatsSchemeV2FooterBlockVI(passengers=");
        sb2.append(list);
        sb2.append(", selectedPassengerIndex=");
        sb2.append(i11);
        sb2.append(", caption=");
        d.e(", price=", ", submitButton=", sb2, textDTO, textDTO2);
        sb2.append(buttonV3DTO);
        sb2.append(", infoIcon=");
        sb2.append(commonAtomIconDTO);
        sb2.append(", action=");
        sb2.append(atomAction);
        sb2.append(", isUpdatedFromRemote=");
        sb2.append(z11);
        sb2.append(", hideInfo=");
        sb2.append(z12);
        sb2.append(", skipButton=");
        sb2.append(buttonV3DTO2);
        sb2.append(")");
        return sb2.toString();
    }

    public /* synthetic */ FlightSeatsSchemeV2FooterBlockVI(List list, int i11, TextDTO textDTO, TextDTO textDTO2, ButtonV3DTO buttonV3DTO, CommonAtomIconDTO commonAtomIconDTO, AtomAction atomAction, boolean z11, boolean z12, ButtonV3DTO buttonV3DTO2, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, i11, textDTO, textDTO2, buttonV3DTO, commonAtomIconDTO, atomAction, (i12 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? true : z11, z12, buttonV3DTO2);
    }
}
