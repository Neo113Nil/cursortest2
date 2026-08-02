package ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v2.data.scheme;

import B0.C2454a;
import G.g;
import HY.b;
import Ih.a;
import Kk.C3532b;
import N3.C3660k;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.squareup.moshi.j;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.K;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v2.data.airplaneSeat.AirplaneSeatTypeV2DTO;
import ru.ozon.moshi.adapters.serialize.proto.ProtoOneOf;
import ru.ozon.moshi.adapters.serialize.proto.ProtoOneOfSignature;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.text.TextDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b*\b\u0081\b\u0018\u00002\u00020\u0001:\u00046789Bk\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f\u0012\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\r0\u000f\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0006¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010&\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0016J\t\u0010'\u001a\u00020\u0003HÆ\u0003J\t\u0010(\u001a\u00020\u0006HÆ\u0003J\t\u0010)\u001a\u00020\u0003HÆ\u0003J\t\u0010*\u001a\u00020\tHÆ\u0003J\t\u0010+\u001a\u00020\u000bHÆ\u0003J\t\u0010,\u001a\u00020\rHÆ\u0003J\u000f\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fHÆ\u0003J\u000f\u0010.\u001a\b\u0012\u0004\u0012\u00020\r0\u000fHÆ\u0003J\t\u0010/\u001a\u00020\u0006HÆ\u0003J\u0080\u0001\u00100\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\r0\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u0006HÆ\u0001¢\u0006\u0002\u00101J\u0013\u00102\u001a\u00020\u00062\b\u00103\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00104\u001a\u00020\u0003HÖ\u0001J\t\u00105\u001a\u00020\u000bHÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u001aR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0019R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\r0\u000f¢\u0006\b\n\u0000\u001a\u0004\b$\u0010#R\u0011\u0010\u0012\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001a¨\u0006:"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/data/scheme/FlightSeatsSchemeV2BlockDTO;", "", "schemeWidth", "", "seatCountInRow", "isBusiness", "", "countOfAisle", "seatSelectionAction", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "exitMarkingColor", "", "selectedSeatType", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/data/airplaneSeat/AirplaneSeatTypeV2DTO;", "rows", "", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/data/scheme/FlightSeatsSchemeV2BlockDTO$RowV2DTO;", "seatTypes", "switchPassengerOnReservedSeatClick", "<init>", "(Ljava/lang/Integer;IZILru/ozon/uni/atoms/data/AtomActionDTO;Ljava/lang/String;Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/data/airplaneSeat/AirplaneSeatTypeV2DTO;Ljava/util/List;Ljava/util/List;Z)V", "getSchemeWidth", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getSeatCountInRow", "()I", "()Z", "getCountOfAisle", "getSeatSelectionAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getExitMarkingColor", "()Ljava/lang/String;", "getSelectedSeatType", "()Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/data/airplaneSeat/AirplaneSeatTypeV2DTO;", "getRows", "()Ljava/util/List;", "getSeatTypes", "getSwitchPassengerOnReservedSeatClick", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "(Ljava/lang/Integer;IZILru/ozon/uni/atoms/data/AtomActionDTO;Ljava/lang/String;Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/data/airplaneSeat/AirplaneSeatTypeV2DTO;Ljava/util/List;Ljava/util/List;Z)Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/data/scheme/FlightSeatsSchemeV2BlockDTO;", "equals", "other", "hashCode", "toString", "RowV2DTO", "SeatV2DTO", "ExitV2DTO", "AisleV2DTO", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class FlightSeatsSchemeV2BlockDTO {
    public static final int $stable = 8;
    private final int countOfAisle;

    @NotNull
    private final String exitMarkingColor;
    private final boolean isBusiness;

    @NotNull
    private final List<RowV2DTO> rows;
    private final Integer schemeWidth;
    private final int seatCountInRow;

    @NotNull
    private final AtomActionDTO seatSelectionAction;

    @NotNull
    private final List<AirplaneSeatTypeV2DTO> seatTypes;

    @NotNull
    private final AirplaneSeatTypeV2DTO selectedSeatType;
    private final boolean switchPassengerOnReservedSeatClick;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/data/scheme/FlightSeatsSchemeV2BlockDTO$AisleV2DTO;", "", "number", "Lru/ozon/uni/atoms/data/text/TextDTO;", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;)V", "getNumber", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class AisleV2DTO {
        public static final int $stable = 0;
        private final TextDTO number;

        public AisleV2DTO(TextDTO textDTO) {
            this.number = textDTO;
        }

        public static /* synthetic */ AisleV2DTO copy$default(AisleV2DTO aisleV2DTO, TextDTO textDTO, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                textDTO = aisleV2DTO.number;
            }
            return aisleV2DTO.copy(textDTO);
        }

        /* renamed from: component1, reason: from getter */
        public final TextDTO getNumber() {
            return this.number;
        }

        @NotNull
        public final AisleV2DTO copy(TextDTO number) {
            return new AisleV2DTO(number);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof AisleV2DTO) && Intrinsics.d(this.number, ((AisleV2DTO) other).number);
        }

        public final TextDTO getNumber() {
            return this.number;
        }

        public int hashCode() {
            TextDTO textDTO = this.number;
            if (textDTO == null) {
                return 0;
            }
            return textDTO.hashCode();
        }

        @NotNull
        public String toString() {
            return "AisleV2DTO(number=" + this.number + ")";
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\n¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/data/scheme/FlightSeatsSchemeV2BlockDTO$ExitV2DTO;", "", "text", "Lru/ozon/uni/atoms/data/text/TextDTO;", "isLeft", "", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Z)V", "getText", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "()Z", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ExitV2DTO {
        public static final int $stable = 0;
        private final boolean isLeft;

        @NotNull
        private final TextDTO text;

        public ExitV2DTO(@NotNull TextDTO text, boolean z11) {
            Intrinsics.checkNotNullParameter(text, "text");
            this.text = text;
            this.isLeft = z11;
        }

        public static /* synthetic */ ExitV2DTO copy$default(ExitV2DTO exitV2DTO, TextDTO textDTO, boolean z11, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                textDTO = exitV2DTO.text;
            }
            if ((i11 & 2) != 0) {
                z11 = exitV2DTO.isLeft;
            }
            return exitV2DTO.copy(textDTO, z11);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final TextDTO getText() {
            return this.text;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getIsLeft() {
            return this.isLeft;
        }

        @NotNull
        public final ExitV2DTO copy(@NotNull TextDTO text, boolean isLeft) {
            Intrinsics.checkNotNullParameter(text, "text");
            return new ExitV2DTO(text, isLeft);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ExitV2DTO)) {
                return false;
            }
            ExitV2DTO exitV2DTO = (ExitV2DTO) other;
            return Intrinsics.d(this.text, exitV2DTO.text) && this.isLeft == exitV2DTO.isLeft;
        }

        @NotNull
        public final TextDTO getText() {
            return this.text;
        }

        public int hashCode() {
            return Boolean.hashCode(this.isLeft) + (this.text.hashCode() * 31);
        }

        public final boolean isLeft() {
            return this.isLeft;
        }

        @NotNull
        public String toString() {
            return "ExitV2DTO(text=" + this.text + ", isLeft=" + this.isLeft + ")";
        }
    }

    public FlightSeatsSchemeV2BlockDTO(Integer num, int i11, boolean z11, int i12, @NotNull AtomActionDTO seatSelectionAction, @NotNull String exitMarkingColor, @NotNull AirplaneSeatTypeV2DTO selectedSeatType, @NotNull List<RowV2DTO> rows, @NotNull List<AirplaneSeatTypeV2DTO> seatTypes, boolean z12) {
        Intrinsics.checkNotNullParameter(seatSelectionAction, "seatSelectionAction");
        Intrinsics.checkNotNullParameter(exitMarkingColor, "exitMarkingColor");
        Intrinsics.checkNotNullParameter(selectedSeatType, "selectedSeatType");
        Intrinsics.checkNotNullParameter(rows, "rows");
        Intrinsics.checkNotNullParameter(seatTypes, "seatTypes");
        this.schemeWidth = num;
        this.seatCountInRow = i11;
        this.isBusiness = z11;
        this.countOfAisle = i12;
        this.seatSelectionAction = seatSelectionAction;
        this.exitMarkingColor = exitMarkingColor;
        this.selectedSeatType = selectedSeatType;
        this.rows = rows;
        this.seatTypes = seatTypes;
        this.switchPassengerOnReservedSeatClick = z12;
    }

    public static /* synthetic */ FlightSeatsSchemeV2BlockDTO copy$default(FlightSeatsSchemeV2BlockDTO flightSeatsSchemeV2BlockDTO, Integer num, int i11, boolean z11, int i12, AtomActionDTO atomActionDTO, String str, AirplaneSeatTypeV2DTO airplaneSeatTypeV2DTO, List list, List list2, boolean z12, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            num = flightSeatsSchemeV2BlockDTO.schemeWidth;
        }
        if ((i13 & 2) != 0) {
            i11 = flightSeatsSchemeV2BlockDTO.seatCountInRow;
        }
        if ((i13 & 4) != 0) {
            z11 = flightSeatsSchemeV2BlockDTO.isBusiness;
        }
        if ((i13 & 8) != 0) {
            i12 = flightSeatsSchemeV2BlockDTO.countOfAisle;
        }
        if ((i13 & 16) != 0) {
            atomActionDTO = flightSeatsSchemeV2BlockDTO.seatSelectionAction;
        }
        if ((i13 & 32) != 0) {
            str = flightSeatsSchemeV2BlockDTO.exitMarkingColor;
        }
        if ((i13 & 64) != 0) {
            airplaneSeatTypeV2DTO = flightSeatsSchemeV2BlockDTO.selectedSeatType;
        }
        if ((i13 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
            list = flightSeatsSchemeV2BlockDTO.rows;
        }
        if ((i13 & 256) != 0) {
            list2 = flightSeatsSchemeV2BlockDTO.seatTypes;
        }
        if ((i13 & UserVerificationMethods.USER_VERIFY_NONE) != 0) {
            z12 = flightSeatsSchemeV2BlockDTO.switchPassengerOnReservedSeatClick;
        }
        List list3 = list2;
        boolean z13 = z12;
        AirplaneSeatTypeV2DTO airplaneSeatTypeV2DTO2 = airplaneSeatTypeV2DTO;
        List list4 = list;
        AtomActionDTO atomActionDTO2 = atomActionDTO;
        String str2 = str;
        return flightSeatsSchemeV2BlockDTO.copy(num, i11, z11, i12, atomActionDTO2, str2, airplaneSeatTypeV2DTO2, list4, list3, z13);
    }

    /* renamed from: component1, reason: from getter */
    public final Integer getSchemeWidth() {
        return this.schemeWidth;
    }

    /* renamed from: component10, reason: from getter */
    public final boolean getSwitchPassengerOnReservedSeatClick() {
        return this.switchPassengerOnReservedSeatClick;
    }

    /* renamed from: component2, reason: from getter */
    public final int getSeatCountInRow() {
        return this.seatCountInRow;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getIsBusiness() {
        return this.isBusiness;
    }

    /* renamed from: component4, reason: from getter */
    public final int getCountOfAisle() {
        return this.countOfAisle;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final AtomActionDTO getSeatSelectionAction() {
        return this.seatSelectionAction;
    }

    @NotNull
    /* renamed from: component6, reason: from getter */
    public final String getExitMarkingColor() {
        return this.exitMarkingColor;
    }

    @NotNull
    /* renamed from: component7, reason: from getter */
    public final AirplaneSeatTypeV2DTO getSelectedSeatType() {
        return this.selectedSeatType;
    }

    @NotNull
    public final List<RowV2DTO> component8() {
        return this.rows;
    }

    @NotNull
    public final List<AirplaneSeatTypeV2DTO> component9() {
        return this.seatTypes;
    }

    @NotNull
    public final FlightSeatsSchemeV2BlockDTO copy(Integer schemeWidth, int seatCountInRow, boolean isBusiness, int countOfAisle, @NotNull AtomActionDTO seatSelectionAction, @NotNull String exitMarkingColor, @NotNull AirplaneSeatTypeV2DTO selectedSeatType, @NotNull List<RowV2DTO> rows, @NotNull List<AirplaneSeatTypeV2DTO> seatTypes, boolean switchPassengerOnReservedSeatClick) {
        Intrinsics.checkNotNullParameter(seatSelectionAction, "seatSelectionAction");
        Intrinsics.checkNotNullParameter(exitMarkingColor, "exitMarkingColor");
        Intrinsics.checkNotNullParameter(selectedSeatType, "selectedSeatType");
        Intrinsics.checkNotNullParameter(rows, "rows");
        Intrinsics.checkNotNullParameter(seatTypes, "seatTypes");
        return new FlightSeatsSchemeV2BlockDTO(schemeWidth, seatCountInRow, isBusiness, countOfAisle, seatSelectionAction, exitMarkingColor, selectedSeatType, rows, seatTypes, switchPassengerOnReservedSeatClick);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FlightSeatsSchemeV2BlockDTO)) {
            return false;
        }
        FlightSeatsSchemeV2BlockDTO flightSeatsSchemeV2BlockDTO = (FlightSeatsSchemeV2BlockDTO) other;
        return Intrinsics.d(this.schemeWidth, flightSeatsSchemeV2BlockDTO.schemeWidth) && this.seatCountInRow == flightSeatsSchemeV2BlockDTO.seatCountInRow && this.isBusiness == flightSeatsSchemeV2BlockDTO.isBusiness && this.countOfAisle == flightSeatsSchemeV2BlockDTO.countOfAisle && Intrinsics.d(this.seatSelectionAction, flightSeatsSchemeV2BlockDTO.seatSelectionAction) && Intrinsics.d(this.exitMarkingColor, flightSeatsSchemeV2BlockDTO.exitMarkingColor) && Intrinsics.d(this.selectedSeatType, flightSeatsSchemeV2BlockDTO.selectedSeatType) && Intrinsics.d(this.rows, flightSeatsSchemeV2BlockDTO.rows) && Intrinsics.d(this.seatTypes, flightSeatsSchemeV2BlockDTO.seatTypes) && this.switchPassengerOnReservedSeatClick == flightSeatsSchemeV2BlockDTO.switchPassengerOnReservedSeatClick;
    }

    public final int getCountOfAisle() {
        return this.countOfAisle;
    }

    @NotNull
    public final String getExitMarkingColor() {
        return this.exitMarkingColor;
    }

    @NotNull
    public final List<RowV2DTO> getRows() {
        return this.rows;
    }

    public final Integer getSchemeWidth() {
        return this.schemeWidth;
    }

    public final int getSeatCountInRow() {
        return this.seatCountInRow;
    }

    @NotNull
    public final AtomActionDTO getSeatSelectionAction() {
        return this.seatSelectionAction;
    }

    @NotNull
    public final List<AirplaneSeatTypeV2DTO> getSeatTypes() {
        return this.seatTypes;
    }

    @NotNull
    public final AirplaneSeatTypeV2DTO getSelectedSeatType() {
        return this.selectedSeatType;
    }

    public final boolean getSwitchPassengerOnReservedSeatClick() {
        return this.switchPassengerOnReservedSeatClick;
    }

    public int hashCode() {
        Integer num = this.schemeWidth;
        return Boolean.hashCode(this.switchPassengerOnReservedSeatClick) + g.b(g.b((this.selectedSeatType.hashCode() + g.a(a.b(this.seatSelectionAction, C2454a.a(this.countOfAisle, C3532b.a(C2454a.a(this.seatCountInRow, (num == null ? 0 : num.hashCode()) * 31, 31), 31, this.isBusiness), 31), 31), 31, this.exitMarkingColor)) * 31, 31, this.rows), 31, this.seatTypes);
    }

    public final boolean isBusiness() {
        return this.isBusiness;
    }

    @NotNull
    public String toString() {
        Integer num = this.schemeWidth;
        int i11 = this.seatCountInRow;
        boolean z11 = this.isBusiness;
        int i12 = this.countOfAisle;
        AtomActionDTO atomActionDTO = this.seatSelectionAction;
        String str = this.exitMarkingColor;
        AirplaneSeatTypeV2DTO airplaneSeatTypeV2DTO = this.selectedSeatType;
        List<RowV2DTO> list = this.rows;
        List<AirplaneSeatTypeV2DTO> list2 = this.seatTypes;
        boolean z12 = this.switchPassengerOnReservedSeatClick;
        StringBuilder sb2 = new StringBuilder("FlightSeatsSchemeV2BlockDTO(schemeWidth=");
        sb2.append(num);
        sb2.append(", seatCountInRow=");
        sb2.append(i11);
        sb2.append(", isBusiness=");
        sb2.append(z11);
        sb2.append(", countOfAisle=");
        sb2.append(i12);
        sb2.append(", seatSelectionAction=");
        b.d(", exitMarkingColor=", str, ", selectedSeatType=", sb2, atomActionDTO);
        sb2.append(airplaneSeatTypeV2DTO);
        sb2.append(", rows=");
        sb2.append(list);
        sb2.append(", seatTypes=");
        sb2.append(list2);
        sb2.append(", switchPassengerOnReservedSeatClick=");
        sb2.append(z12);
        sb2.append(")");
        return sb2.toString();
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0010\b\u0001\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0011\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J%\u0010\r\u001a\u00020\u00002\u0010\b\u0003\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0019\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\n¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/data/scheme/FlightSeatsSchemeV2BlockDTO$RowV2DTO;", "", "seats", "", "isSticky", "", "<init>", "(Ljava/util/List;Z)V", "getSeats", "()Ljava/util/List;", "()Z", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class RowV2DTO {
        public static final int $stable = 8;
        private final boolean isSticky;

        @NotNull
        private final List<Object> seats;

        public RowV2DTO(@ProtoOneOfSignature.Container({@ProtoOneOfSignature(name = "emptySpace", type = Object.class), @ProtoOneOfSignature(name = "seat", type = SeatV2DTO.class), @ProtoOneOfSignature(name = "exit", type = ExitV2DTO.class), @ProtoOneOfSignature(name = "aisle", type = AisleV2DTO.class), @ProtoOneOfSignature(name = "columnTitle", type = TextDTO.class)}) @NotNull @ProtoOneOf(label = "type") List<? extends Object> seats, boolean z11) {
            Intrinsics.checkNotNullParameter(seats, "seats");
            this.seats = seats;
            this.isSticky = z11;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ RowV2DTO copy$default(RowV2DTO rowV2DTO, List list, boolean z11, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                list = rowV2DTO.seats;
            }
            if ((i11 & 2) != 0) {
                z11 = rowV2DTO.isSticky;
            }
            return rowV2DTO.copy(list, z11);
        }

        @NotNull
        public final List<Object> component1() {
            return this.seats;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getIsSticky() {
            return this.isSticky;
        }

        @NotNull
        public final RowV2DTO copy(@ProtoOneOfSignature.Container({@ProtoOneOfSignature(name = "emptySpace", type = Object.class), @ProtoOneOfSignature(name = "seat", type = SeatV2DTO.class), @ProtoOneOfSignature(name = "exit", type = ExitV2DTO.class), @ProtoOneOfSignature(name = "aisle", type = AisleV2DTO.class), @ProtoOneOfSignature(name = "columnTitle", type = TextDTO.class)}) @NotNull @ProtoOneOf(label = "type") List<? extends Object> seats, boolean isSticky) {
            Intrinsics.checkNotNullParameter(seats, "seats");
            return new RowV2DTO(seats, isSticky);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof RowV2DTO)) {
                return false;
            }
            RowV2DTO rowV2DTO = (RowV2DTO) other;
            return Intrinsics.d(this.seats, rowV2DTO.seats) && this.isSticky == rowV2DTO.isSticky;
        }

        @NotNull
        public final List<Object> getSeats() {
            return this.seats;
        }

        public int hashCode() {
            return Boolean.hashCode(this.isSticky) + (this.seats.hashCode() * 31);
        }

        public final boolean isSticky() {
            return this.isSticky;
        }

        @NotNull
        public String toString() {
            return "RowV2DTO(seats=" + this.seats + ", isSticky=" + this.isSticky + ")";
        }

        public /* synthetic */ RowV2DTO(List list, boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(list, (i11 & 2) != 0 ? false : z11);
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u0010\u0018\u001a\u00020\bHÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\nHÆ\u0003J?\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nHÆ\u0001J\u0013\u0010\u001b\u001a\u00020\b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u0012R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006 "}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/data/scheme/FlightSeatsSchemeV2BlockDTO$SeatV2DTO;", "", "number", "", "typeID", "price", "Lru/ozon/uni/atoms/data/text/TextDTO;", "isPriceInvisible", "", "common", "Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lru/ozon/uni/atoms/data/text/TextDTO;ZLru/ozon/uni/atoms/data/controls/CommonControlSettings;)V", "getNumber", "()Ljava/lang/String;", "getTypeID", "getPrice", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "()Z", "getCommon", "()Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toString", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class SeatV2DTO {
        public static final int $stable = 0;
        private final CommonControlSettings common;
        private final boolean isPriceInvisible;

        @NotNull
        private final String number;
        private final TextDTO price;

        @NotNull
        private final String typeID;

        public SeatV2DTO(@NotNull String number, @NotNull String typeID, TextDTO textDTO, boolean z11, CommonControlSettings commonControlSettings) {
            Intrinsics.checkNotNullParameter(number, "number");
            Intrinsics.checkNotNullParameter(typeID, "typeID");
            this.number = number;
            this.typeID = typeID;
            this.price = textDTO;
            this.isPriceInvisible = z11;
            this.common = commonControlSettings;
        }

        public static /* synthetic */ SeatV2DTO copy$default(SeatV2DTO seatV2DTO, String str, String str2, TextDTO textDTO, boolean z11, CommonControlSettings commonControlSettings, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = seatV2DTO.number;
            }
            if ((i11 & 2) != 0) {
                str2 = seatV2DTO.typeID;
            }
            if ((i11 & 4) != 0) {
                textDTO = seatV2DTO.price;
            }
            if ((i11 & 8) != 0) {
                z11 = seatV2DTO.isPriceInvisible;
            }
            if ((i11 & 16) != 0) {
                commonControlSettings = seatV2DTO.common;
            }
            CommonControlSettings commonControlSettings2 = commonControlSettings;
            TextDTO textDTO2 = textDTO;
            return seatV2DTO.copy(str, str2, textDTO2, z11, commonControlSettings2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getNumber() {
            return this.number;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final String getTypeID() {
            return this.typeID;
        }

        /* renamed from: component3, reason: from getter */
        public final TextDTO getPrice() {
            return this.price;
        }

        /* renamed from: component4, reason: from getter */
        public final boolean getIsPriceInvisible() {
            return this.isPriceInvisible;
        }

        /* renamed from: component5, reason: from getter */
        public final CommonControlSettings getCommon() {
            return this.common;
        }

        @NotNull
        public final SeatV2DTO copy(@NotNull String number, @NotNull String typeID, TextDTO price, boolean isPriceInvisible, CommonControlSettings common) {
            Intrinsics.checkNotNullParameter(number, "number");
            Intrinsics.checkNotNullParameter(typeID, "typeID");
            return new SeatV2DTO(number, typeID, price, isPriceInvisible, common);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SeatV2DTO)) {
                return false;
            }
            SeatV2DTO seatV2DTO = (SeatV2DTO) other;
            return Intrinsics.d(this.number, seatV2DTO.number) && Intrinsics.d(this.typeID, seatV2DTO.typeID) && Intrinsics.d(this.price, seatV2DTO.price) && this.isPriceInvisible == seatV2DTO.isPriceInvisible && Intrinsics.d(this.common, seatV2DTO.common);
        }

        public final CommonControlSettings getCommon() {
            return this.common;
        }

        @NotNull
        public final String getNumber() {
            return this.number;
        }

        public final TextDTO getPrice() {
            return this.price;
        }

        @NotNull
        public final String getTypeID() {
            return this.typeID;
        }

        public int hashCode() {
            int a11 = g.a(this.number.hashCode() * 31, 31, this.typeID);
            TextDTO textDTO = this.price;
            int a12 = C3532b.a((a11 + (textDTO == null ? 0 : textDTO.hashCode())) * 31, 31, this.isPriceInvisible);
            CommonControlSettings commonControlSettings = this.common;
            return a12 + (commonControlSettings != null ? commonControlSettings.hashCode() : 0);
        }

        public final boolean isPriceInvisible() {
            return this.isPriceInvisible;
        }

        @NotNull
        public String toString() {
            String str = this.number;
            String str2 = this.typeID;
            TextDTO textDTO = this.price;
            boolean z11 = this.isPriceInvisible;
            CommonControlSettings commonControlSettings = this.common;
            StringBuilder d11 = C3660k.d("SeatV2DTO(number=", str, ", typeID=", str2, ", price=");
            d11.append(textDTO);
            d11.append(", isPriceInvisible=");
            d11.append(z11);
            d11.append(", common=");
            return Ak.b.g(d11, commonControlSettings, ")");
        }

        public /* synthetic */ SeatV2DTO(String str, String str2, TextDTO textDTO, boolean z11, CommonControlSettings commonControlSettings, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, textDTO, (i11 & 8) != 0 ? false : z11, commonControlSettings);
        }
    }

    public FlightSeatsSchemeV2BlockDTO(Integer num, int i11, boolean z11, int i12, AtomActionDTO atomActionDTO, String str, AirplaneSeatTypeV2DTO airplaneSeatTypeV2DTO, List list, List list2, boolean z12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(num, i11, (i13 & 4) != 0 ? false : z11, i12, atomActionDTO, str, airplaneSeatTypeV2DTO, list, (i13 & 256) != 0 ? K.f71697a : list2, (i13 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? false : z12);
    }
}
