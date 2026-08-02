package ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v2.data.footer;

import D40.d;
import De.C2859b;
import Ds.C2880a;
import G.g;
import I0.C3173b;
import Kk.C3532b;
import N3.C3660k;
import Nh.a;
import Ns.b;
import T7.P;
import Tz.C4055a;
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
import ru.ozon.uni.atoms.data.common.CommonAtomIconDTO;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001:\u000212BW\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u0010#\u001a\u00020\bHÆ\u0003J\t\u0010$\u001a\u00020\bHÆ\u0003J\t\u0010%\u001a\u00020\u000bHÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\rHÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u000bHÆ\u0003Jg\u0010)\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000bHÆ\u0001J\u0013\u0010*\u001a\u00020+2\b\u0010,\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010-\u001a\u00020.HÖ\u0001J\t\u0010/\u001a\u000200HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\t\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0018R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001b¨\u00063"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/data/footer/FooterBlockV2DTO;", "", "passengers", "", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/data/footer/FooterBlockV2DTO$PassengerV2DTO;", "passengerTabStyles", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/data/footer/FooterBlockV2DTO$TabStyleV2DTO;", "caption", "Lru/ozon/uni/atoms/data/text/TextDTO;", "price", "submitButton", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "infoIcon", "Lru/ozon/uni/atoms/data/common/CommonAtomIconDTO;", "common", "Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "skipButton", "<init>", "(Ljava/util/List;Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/data/footer/FooterBlockV2DTO$TabStyleV2DTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;Lru/ozon/uni/atoms/data/common/CommonAtomIconDTO;Lru/ozon/uni/atoms/data/controls/CommonControlSettings;Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;)V", "getPassengers", "()Ljava/util/List;", "getPassengerTabStyles", "()Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/data/footer/FooterBlockV2DTO$TabStyleV2DTO;", "getCaption", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getPrice", "getSubmitButton", "()Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "getInfoIcon", "()Lru/ozon/uni/atoms/data/common/CommonAtomIconDTO;", "getCommon", "()Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "getSkipButton", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "", "toString", "", "PassengerV2DTO", "TabStyleV2DTO", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class FooterBlockV2DTO {
    public static final int $stable = 8;

    @NotNull
    private final TextDTO caption;
    private final CommonControlSettings common;
    private final CommonAtomIconDTO infoIcon;
    private final TabStyleV2DTO passengerTabStyles;

    @NotNull
    private final List<PassengerV2DTO> passengers;

    @NotNull
    private final TextDTO price;
    private final ButtonV3DTO skipButton;

    @NotNull
    private final ButtonV3DTO submitButton;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u001a\b\u0087\b\u0018\u00002\u00020\u0001BO\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0007\u0012\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001f\u001a\u00020\tHÆ\u0003J\t\u0010 \u001a\u00020\u0005HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u0017\u0010\"\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rHÆ\u0003J_\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u00052\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00072\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rHÆ\u0001J\u0013\u0010$\u001a\u00020\t2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010&\u001a\u00020\u0003HÖ\u0001J\t\u0010'\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0017R\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0014R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0016R\u001f\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001b¨\u0006("}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/data/footer/FooterBlockV2DTO$PassengerV2DTO;", "", "id", "", AppMeasurementSdk.ConditionalUserProperty.NAME, "Lru/ozon/uni/atoms/data/text/TextDTO;", "subtitleName", "", "isCurrent", "", "shortName", "selectedSeatNumber", "passengerSelectionTrackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(ILru/ozon/uni/atoms/data/text/TextDTO;Ljava/lang/String;ZLru/ozon/uni/atoms/data/text/TextDTO;Ljava/lang/String;Ljava/util/Map;)V", "getId", "()I", "getName", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getSubtitleName", "()Ljava/lang/String;", "()Z", "getShortName", "getSelectedSeatNumber", "getPassengerSelectionTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "toString", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class PassengerV2DTO {
        public static final int $stable = 8;
        private final int id;
        private final boolean isCurrent;

        @NotNull
        private final TextDTO name;
        private final Map<String, TokenizedTrackingInfo> passengerSelectionTrackingInfo;
        private final String selectedSeatNumber;

        @NotNull
        private final TextDTO shortName;

        @NotNull
        private final String subtitleName;

        public PassengerV2DTO(int i11, @NotNull TextDTO name, @NotNull String subtitleName, boolean z11, @NotNull TextDTO shortName, String str, Map<String, TokenizedTrackingInfo> map) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(subtitleName, "subtitleName");
            Intrinsics.checkNotNullParameter(shortName, "shortName");
            this.id = i11;
            this.name = name;
            this.subtitleName = subtitleName;
            this.isCurrent = z11;
            this.shortName = shortName;
            this.selectedSeatNumber = str;
            this.passengerSelectionTrackingInfo = map;
        }

        public static /* synthetic */ PassengerV2DTO copy$default(PassengerV2DTO passengerV2DTO, int i11, TextDTO textDTO, String str, boolean z11, TextDTO textDTO2, String str2, Map map, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                i11 = passengerV2DTO.id;
            }
            if ((i12 & 2) != 0) {
                textDTO = passengerV2DTO.name;
            }
            if ((i12 & 4) != 0) {
                str = passengerV2DTO.subtitleName;
            }
            if ((i12 & 8) != 0) {
                z11 = passengerV2DTO.isCurrent;
            }
            if ((i12 & 16) != 0) {
                textDTO2 = passengerV2DTO.shortName;
            }
            if ((i12 & 32) != 0) {
                str2 = passengerV2DTO.selectedSeatNumber;
            }
            if ((i12 & 64) != 0) {
                map = passengerV2DTO.passengerSelectionTrackingInfo;
            }
            String str3 = str2;
            Map map2 = map;
            TextDTO textDTO3 = textDTO2;
            String str4 = str;
            return passengerV2DTO.copy(i11, textDTO, str4, z11, textDTO3, str3, map2);
        }

        /* renamed from: component1, reason: from getter */
        public final int getId() {
            return this.id;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final TextDTO getName() {
            return this.name;
        }

        @NotNull
        /* renamed from: component3, reason: from getter */
        public final String getSubtitleName() {
            return this.subtitleName;
        }

        /* renamed from: component4, reason: from getter */
        public final boolean getIsCurrent() {
            return this.isCurrent;
        }

        @NotNull
        /* renamed from: component5, reason: from getter */
        public final TextDTO getShortName() {
            return this.shortName;
        }

        /* renamed from: component6, reason: from getter */
        public final String getSelectedSeatNumber() {
            return this.selectedSeatNumber;
        }

        public final Map<String, TokenizedTrackingInfo> component7() {
            return this.passengerSelectionTrackingInfo;
        }

        @NotNull
        public final PassengerV2DTO copy(int id2, @NotNull TextDTO name, @NotNull String subtitleName, boolean isCurrent, @NotNull TextDTO shortName, String selectedSeatNumber, Map<String, TokenizedTrackingInfo> passengerSelectionTrackingInfo) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(subtitleName, "subtitleName");
            Intrinsics.checkNotNullParameter(shortName, "shortName");
            return new PassengerV2DTO(id2, name, subtitleName, isCurrent, shortName, selectedSeatNumber, passengerSelectionTrackingInfo);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PassengerV2DTO)) {
                return false;
            }
            PassengerV2DTO passengerV2DTO = (PassengerV2DTO) other;
            return this.id == passengerV2DTO.id && Intrinsics.d(this.name, passengerV2DTO.name) && Intrinsics.d(this.subtitleName, passengerV2DTO.subtitleName) && this.isCurrent == passengerV2DTO.isCurrent && Intrinsics.d(this.shortName, passengerV2DTO.shortName) && Intrinsics.d(this.selectedSeatNumber, passengerV2DTO.selectedSeatNumber) && Intrinsics.d(this.passengerSelectionTrackingInfo, passengerV2DTO.passengerSelectionTrackingInfo);
        }

        public final int getId() {
            return this.id;
        }

        @NotNull
        public final TextDTO getName() {
            return this.name;
        }

        public final Map<String, TokenizedTrackingInfo> getPassengerSelectionTrackingInfo() {
            return this.passengerSelectionTrackingInfo;
        }

        public final String getSelectedSeatNumber() {
            return this.selectedSeatNumber;
        }

        @NotNull
        public final TextDTO getShortName() {
            return this.shortName;
        }

        @NotNull
        public final String getSubtitleName() {
            return this.subtitleName;
        }

        public int hashCode() {
            int a11 = b.a(this.shortName, C3532b.a(g.a(b.a(this.name, Integer.hashCode(this.id) * 31, 31), 31, this.subtitleName), 31, this.isCurrent), 31);
            String str = this.selectedSeatNumber;
            int hashCode = (a11 + (str == null ? 0 : str.hashCode())) * 31;
            Map<String, TokenizedTrackingInfo> map = this.passengerSelectionTrackingInfo;
            return hashCode + (map != null ? map.hashCode() : 0);
        }

        public final boolean isCurrent() {
            return this.isCurrent;
        }

        @NotNull
        public String toString() {
            int i11 = this.id;
            TextDTO textDTO = this.name;
            String str = this.subtitleName;
            boolean z11 = this.isCurrent;
            TextDTO textDTO2 = this.shortName;
            String str2 = this.selectedSeatNumber;
            Map<String, TokenizedTrackingInfo> map = this.passengerSelectionTrackingInfo;
            StringBuilder b11 = C4055a.b(textDTO, "PassengerV2DTO(id=", ", name=", ", subtitleName=", i11);
            C2880a.c(str, ", isCurrent=", ", shortName=", b11, z11);
            b11.append(textDTO2);
            b11.append(", selectedSeatNumber=");
            b11.append(str2);
            b11.append(", passengerSelectionTrackingInfo=");
            return P.f(b11, map, ")");
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001c\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003JY\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001a\u00020#HÖ\u0001J\t\u0010$\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000eR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000eR\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000eR\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000e¨\u0006%"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/data/footer/FooterBlockV2DTO$TabStyleV2DTO;", "", "tabDefaultColor", "", "tabSelectionColor", "tabDefaultTextColor", "tabSelectionTextColor", "indicatorDefaultColor", "indicatorSelectionColor", "indicatorDefaultTextColor", "indicatorSelectionTextColor", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getTabDefaultColor", "()Ljava/lang/String;", "getTabSelectionColor", "getTabDefaultTextColor", "getTabSelectionTextColor", "getIndicatorDefaultColor", "getIndicatorSelectionColor", "getIndicatorDefaultTextColor", "getIndicatorSelectionTextColor", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "", "toString", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class TabStyleV2DTO {
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

        public TabStyleV2DTO(@NotNull String tabDefaultColor, @NotNull String tabSelectionColor, @NotNull String tabDefaultTextColor, @NotNull String tabSelectionTextColor, @NotNull String indicatorDefaultColor, @NotNull String indicatorSelectionColor, @NotNull String indicatorDefaultTextColor, @NotNull String indicatorSelectionTextColor) {
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

        public static /* synthetic */ TabStyleV2DTO copy$default(TabStyleV2DTO tabStyleV2DTO, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = tabStyleV2DTO.tabDefaultColor;
            }
            if ((i11 & 2) != 0) {
                str2 = tabStyleV2DTO.tabSelectionColor;
            }
            if ((i11 & 4) != 0) {
                str3 = tabStyleV2DTO.tabDefaultTextColor;
            }
            if ((i11 & 8) != 0) {
                str4 = tabStyleV2DTO.tabSelectionTextColor;
            }
            if ((i11 & 16) != 0) {
                str5 = tabStyleV2DTO.indicatorDefaultColor;
            }
            if ((i11 & 32) != 0) {
                str6 = tabStyleV2DTO.indicatorSelectionColor;
            }
            if ((i11 & 64) != 0) {
                str7 = tabStyleV2DTO.indicatorDefaultTextColor;
            }
            if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
                str8 = tabStyleV2DTO.indicatorSelectionTextColor;
            }
            String str9 = str7;
            String str10 = str8;
            String str11 = str5;
            String str12 = str6;
            return tabStyleV2DTO.copy(str, str2, str3, str4, str11, str12, str9, str10);
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
        public final TabStyleV2DTO copy(@NotNull String tabDefaultColor, @NotNull String tabSelectionColor, @NotNull String tabDefaultTextColor, @NotNull String tabSelectionTextColor, @NotNull String indicatorDefaultColor, @NotNull String indicatorSelectionColor, @NotNull String indicatorDefaultTextColor, @NotNull String indicatorSelectionTextColor) {
            Intrinsics.checkNotNullParameter(tabDefaultColor, "tabDefaultColor");
            Intrinsics.checkNotNullParameter(tabSelectionColor, "tabSelectionColor");
            Intrinsics.checkNotNullParameter(tabDefaultTextColor, "tabDefaultTextColor");
            Intrinsics.checkNotNullParameter(tabSelectionTextColor, "tabSelectionTextColor");
            Intrinsics.checkNotNullParameter(indicatorDefaultColor, "indicatorDefaultColor");
            Intrinsics.checkNotNullParameter(indicatorSelectionColor, "indicatorSelectionColor");
            Intrinsics.checkNotNullParameter(indicatorDefaultTextColor, "indicatorDefaultTextColor");
            Intrinsics.checkNotNullParameter(indicatorSelectionTextColor, "indicatorSelectionTextColor");
            return new TabStyleV2DTO(tabDefaultColor, tabSelectionColor, tabDefaultTextColor, tabSelectionTextColor, indicatorDefaultColor, indicatorSelectionColor, indicatorDefaultTextColor, indicatorSelectionTextColor);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TabStyleV2DTO)) {
                return false;
            }
            TabStyleV2DTO tabStyleV2DTO = (TabStyleV2DTO) other;
            return Intrinsics.d(this.tabDefaultColor, tabStyleV2DTO.tabDefaultColor) && Intrinsics.d(this.tabSelectionColor, tabStyleV2DTO.tabSelectionColor) && Intrinsics.d(this.tabDefaultTextColor, tabStyleV2DTO.tabDefaultTextColor) && Intrinsics.d(this.tabSelectionTextColor, tabStyleV2DTO.tabSelectionTextColor) && Intrinsics.d(this.indicatorDefaultColor, tabStyleV2DTO.indicatorDefaultColor) && Intrinsics.d(this.indicatorSelectionColor, tabStyleV2DTO.indicatorSelectionColor) && Intrinsics.d(this.indicatorDefaultTextColor, tabStyleV2DTO.indicatorDefaultTextColor) && Intrinsics.d(this.indicatorSelectionTextColor, tabStyleV2DTO.indicatorSelectionTextColor);
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
            StringBuilder d11 = C3660k.d("TabStyleV2DTO(tabDefaultColor=", str, ", tabSelectionColor=", str2, ", tabDefaultTextColor=");
            a.h(d11, str3, ", tabSelectionTextColor=", str4, ", indicatorDefaultColor=");
            a.h(d11, str5, ", indicatorSelectionColor=", str6, ", indicatorDefaultTextColor=");
            return C3173b.c(d11, str7, ", indicatorSelectionTextColor=", str8, ")");
        }
    }

    public FooterBlockV2DTO(@NotNull List<PassengerV2DTO> passengers, TabStyleV2DTO tabStyleV2DTO, @NotNull TextDTO caption, @NotNull TextDTO price, @NotNull ButtonV3DTO submitButton, CommonAtomIconDTO commonAtomIconDTO, CommonControlSettings commonControlSettings, ButtonV3DTO buttonV3DTO) {
        Intrinsics.checkNotNullParameter(passengers, "passengers");
        Intrinsics.checkNotNullParameter(caption, "caption");
        Intrinsics.checkNotNullParameter(price, "price");
        Intrinsics.checkNotNullParameter(submitButton, "submitButton");
        this.passengers = passengers;
        this.passengerTabStyles = tabStyleV2DTO;
        this.caption = caption;
        this.price = price;
        this.submitButton = submitButton;
        this.infoIcon = commonAtomIconDTO;
        this.common = commonControlSettings;
        this.skipButton = buttonV3DTO;
    }

    public static /* synthetic */ FooterBlockV2DTO copy$default(FooterBlockV2DTO footerBlockV2DTO, List list, TabStyleV2DTO tabStyleV2DTO, TextDTO textDTO, TextDTO textDTO2, ButtonV3DTO buttonV3DTO, CommonAtomIconDTO commonAtomIconDTO, CommonControlSettings commonControlSettings, ButtonV3DTO buttonV3DTO2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = footerBlockV2DTO.passengers;
        }
        if ((i11 & 2) != 0) {
            tabStyleV2DTO = footerBlockV2DTO.passengerTabStyles;
        }
        if ((i11 & 4) != 0) {
            textDTO = footerBlockV2DTO.caption;
        }
        if ((i11 & 8) != 0) {
            textDTO2 = footerBlockV2DTO.price;
        }
        if ((i11 & 16) != 0) {
            buttonV3DTO = footerBlockV2DTO.submitButton;
        }
        if ((i11 & 32) != 0) {
            commonAtomIconDTO = footerBlockV2DTO.infoIcon;
        }
        if ((i11 & 64) != 0) {
            commonControlSettings = footerBlockV2DTO.common;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
            buttonV3DTO2 = footerBlockV2DTO.skipButton;
        }
        CommonControlSettings commonControlSettings2 = commonControlSettings;
        ButtonV3DTO buttonV3DTO3 = buttonV3DTO2;
        ButtonV3DTO buttonV3DTO4 = buttonV3DTO;
        CommonAtomIconDTO commonAtomIconDTO2 = commonAtomIconDTO;
        return footerBlockV2DTO.copy(list, tabStyleV2DTO, textDTO, textDTO2, buttonV3DTO4, commonAtomIconDTO2, commonControlSettings2, buttonV3DTO3);
    }

    @NotNull
    public final List<PassengerV2DTO> component1() {
        return this.passengers;
    }

    /* renamed from: component2, reason: from getter */
    public final TabStyleV2DTO getPassengerTabStyles() {
        return this.passengerTabStyles;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final TextDTO getCaption() {
        return this.caption;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final TextDTO getPrice() {
        return this.price;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final ButtonV3DTO getSubmitButton() {
        return this.submitButton;
    }

    /* renamed from: component6, reason: from getter */
    public final CommonAtomIconDTO getInfoIcon() {
        return this.infoIcon;
    }

    /* renamed from: component7, reason: from getter */
    public final CommonControlSettings getCommon() {
        return this.common;
    }

    /* renamed from: component8, reason: from getter */
    public final ButtonV3DTO getSkipButton() {
        return this.skipButton;
    }

    @NotNull
    public final FooterBlockV2DTO copy(@NotNull List<PassengerV2DTO> passengers, TabStyleV2DTO passengerTabStyles, @NotNull TextDTO caption, @NotNull TextDTO price, @NotNull ButtonV3DTO submitButton, CommonAtomIconDTO infoIcon, CommonControlSettings common, ButtonV3DTO skipButton) {
        Intrinsics.checkNotNullParameter(passengers, "passengers");
        Intrinsics.checkNotNullParameter(caption, "caption");
        Intrinsics.checkNotNullParameter(price, "price");
        Intrinsics.checkNotNullParameter(submitButton, "submitButton");
        return new FooterBlockV2DTO(passengers, passengerTabStyles, caption, price, submitButton, infoIcon, common, skipButton);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FooterBlockV2DTO)) {
            return false;
        }
        FooterBlockV2DTO footerBlockV2DTO = (FooterBlockV2DTO) other;
        return Intrinsics.d(this.passengers, footerBlockV2DTO.passengers) && Intrinsics.d(this.passengerTabStyles, footerBlockV2DTO.passengerTabStyles) && Intrinsics.d(this.caption, footerBlockV2DTO.caption) && Intrinsics.d(this.price, footerBlockV2DTO.price) && Intrinsics.d(this.submitButton, footerBlockV2DTO.submitButton) && Intrinsics.d(this.infoIcon, footerBlockV2DTO.infoIcon) && Intrinsics.d(this.common, footerBlockV2DTO.common) && Intrinsics.d(this.skipButton, footerBlockV2DTO.skipButton);
    }

    @NotNull
    public final TextDTO getCaption() {
        return this.caption;
    }

    public final CommonControlSettings getCommon() {
        return this.common;
    }

    public final CommonAtomIconDTO getInfoIcon() {
        return this.infoIcon;
    }

    public final TabStyleV2DTO getPassengerTabStyles() {
        return this.passengerTabStyles;
    }

    @NotNull
    public final List<PassengerV2DTO> getPassengers() {
        return this.passengers;
    }

    @NotNull
    public final TextDTO getPrice() {
        return this.price;
    }

    public final ButtonV3DTO getSkipButton() {
        return this.skipButton;
    }

    @NotNull
    public final ButtonV3DTO getSubmitButton() {
        return this.submitButton;
    }

    public int hashCode() {
        int hashCode = this.passengers.hashCode() * 31;
        TabStyleV2DTO tabStyleV2DTO = this.passengerTabStyles;
        int c11 = C2859b.c(this.submitButton, b.a(this.price, b.a(this.caption, (hashCode + (tabStyleV2DTO == null ? 0 : tabStyleV2DTO.hashCode())) * 31, 31), 31), 31);
        CommonAtomIconDTO commonAtomIconDTO = this.infoIcon;
        int hashCode2 = (c11 + (commonAtomIconDTO == null ? 0 : commonAtomIconDTO.hashCode())) * 31;
        CommonControlSettings commonControlSettings = this.common;
        int hashCode3 = (hashCode2 + (commonControlSettings == null ? 0 : commonControlSettings.hashCode())) * 31;
        ButtonV3DTO buttonV3DTO = this.skipButton;
        return hashCode3 + (buttonV3DTO != null ? buttonV3DTO.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        List<PassengerV2DTO> list = this.passengers;
        TabStyleV2DTO tabStyleV2DTO = this.passengerTabStyles;
        TextDTO textDTO = this.caption;
        TextDTO textDTO2 = this.price;
        ButtonV3DTO buttonV3DTO = this.submitButton;
        CommonAtomIconDTO commonAtomIconDTO = this.infoIcon;
        CommonControlSettings commonControlSettings = this.common;
        ButtonV3DTO buttonV3DTO2 = this.skipButton;
        StringBuilder sb2 = new StringBuilder("FooterBlockV2DTO(passengers=");
        sb2.append(list);
        sb2.append(", passengerTabStyles=");
        sb2.append(tabStyleV2DTO);
        sb2.append(", caption=");
        d.e(", price=", ", submitButton=", sb2, textDTO, textDTO2);
        sb2.append(buttonV3DTO);
        sb2.append(", infoIcon=");
        sb2.append(commonAtomIconDTO);
        sb2.append(", common=");
        sb2.append(commonControlSettings);
        sb2.append(", skipButton=");
        sb2.append(buttonV3DTO2);
        sb2.append(")");
        return sb2.toString();
    }

    public FooterBlockV2DTO(List list, TabStyleV2DTO tabStyleV2DTO, TextDTO textDTO, TextDTO textDTO2, ButtonV3DTO buttonV3DTO, CommonAtomIconDTO commonAtomIconDTO, CommonControlSettings commonControlSettings, ButtonV3DTO buttonV3DTO2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? K.f71697a : list, tabStyleV2DTO, textDTO, textDTO2, buttonV3DTO, commonAtomIconDTO, commonControlSettings, buttonV3DTO2);
    }
}
