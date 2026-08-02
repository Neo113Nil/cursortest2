package ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v1.data.scheme;

import Am.C2438a;
import B0.C2454a;
import B90.C2618u;
import G.g;
import H3.c;
import HY.b;
import Ih.a;
import V.e;
import com.squareup.moshi.j;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.K;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.avia.shared.airplaneSeat.AirplaneSeatDTO;
import ru.ozon.moshi.adapters.serialize.proto.ProtoOneOf;
import ru.ozon.moshi.adapters.serialize.proto.ProtoOneOfSignature;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@j(generateAdapter = true)
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\b\b\u0081\b\u0018\u00002\u00020\u0001:\u0004*+,-BM\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f\u0012\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\n0\f¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0006HÆ\u0003J\t\u0010 \u001a\u00020\bHÆ\u0003J\t\u0010!\u001a\u00020\nHÆ\u0003J\u000f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\r0\fHÆ\u0003J\u000f\u0010#\u001a\b\u0012\u0004\u0012\u00020\n0\fHÆ\u0003J[\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\n0\fHÆ\u0001J\u0013\u0010%\u001a\u00020&2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010(\u001a\u00020\u0003HÖ\u0001J\t\u0010)\u001a\u00020\bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\n0\f¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001b¨\u0006."}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/data/scheme/FlightSeatsSchemeBlockDTO;", "", "schemeWidth", "", "seatCountInRow", "seatSelectionAction", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "exitMarkingColor", "", "selectedSeatType", "Lru/ozon/app/android/travel/feature/avia/shared/airplaneSeat/AirplaneSeatDTO;", "rows", "", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/data/scheme/FlightSeatsSchemeBlockDTO$RowDTO;", "seatTypes", "<init>", "(IILru/ozon/uni/atoms/data/AtomActionDTO;Ljava/lang/String;Lru/ozon/app/android/travel/feature/avia/shared/airplaneSeat/AirplaneSeatDTO;Ljava/util/List;Ljava/util/List;)V", "getSchemeWidth", "()I", "getSeatCountInRow", "getSeatSelectionAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getExitMarkingColor", "()Ljava/lang/String;", "getSelectedSeatType", "()Lru/ozon/app/android/travel/feature/avia/shared/airplaneSeat/AirplaneSeatDTO;", "getRows", "()Ljava/util/List;", "getSeatTypes", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "toString", "RowDTO", "SeatDTO", "ExitDTO", "AisleDTO", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class FlightSeatsSchemeBlockDTO {
    public static final int $stable = 8;

    @NotNull
    private final String exitMarkingColor;

    @NotNull
    private final List<RowDTO> rows;
    private final int schemeWidth;
    private final int seatCountInRow;

    @NotNull
    private final AtomActionDTO seatSelectionAction;

    @NotNull
    private final List<AirplaneSeatDTO> seatTypes;

    @NotNull
    private final AirplaneSeatDTO selectedSeatType;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/data/scheme/FlightSeatsSchemeBlockDTO$AisleDTO;", "", "number", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "<init>", "(Lru/ozon/uni/atoms/data/texts/TextAtom;)V", "getNumber", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class AisleDTO {
        public static final int $stable = TextAtom.$stable;
        private final TextAtom number;

        public AisleDTO(TextAtom textAtom) {
            this.number = textAtom;
        }

        public static /* synthetic */ AisleDTO copy$default(AisleDTO aisleDTO, TextAtom textAtom, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                textAtom = aisleDTO.number;
            }
            return aisleDTO.copy(textAtom);
        }

        /* renamed from: component1, reason: from getter */
        public final TextAtom getNumber() {
            return this.number;
        }

        @NotNull
        public final AisleDTO copy(TextAtom number) {
            return new AisleDTO(number);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof AisleDTO) && Intrinsics.d(this.number, ((AisleDTO) other).number);
        }

        public final TextAtom getNumber() {
            return this.number;
        }

        public int hashCode() {
            TextAtom textAtom = this.number;
            if (textAtom == null) {
                return 0;
            }
            return textAtom.hashCode();
        }

        @NotNull
        public String toString() {
            return "AisleDTO(number=" + this.number + ")";
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\n¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/data/scheme/FlightSeatsSchemeBlockDTO$ExitDTO;", "", "text", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "isLeft", "", "<init>", "(Lru/ozon/uni/atoms/data/texts/TextAtom;Z)V", "getText", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "()Z", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ExitDTO {
        public static final int $stable = TextAtom.$stable;
        private final boolean isLeft;

        @NotNull
        private final TextAtom text;

        public ExitDTO(@NotNull TextAtom text, boolean z11) {
            Intrinsics.checkNotNullParameter(text, "text");
            this.text = text;
            this.isLeft = z11;
        }

        public static /* synthetic */ ExitDTO copy$default(ExitDTO exitDTO, TextAtom textAtom, boolean z11, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                textAtom = exitDTO.text;
            }
            if ((i11 & 2) != 0) {
                z11 = exitDTO.isLeft;
            }
            return exitDTO.copy(textAtom, z11);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final TextAtom getText() {
            return this.text;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getIsLeft() {
            return this.isLeft;
        }

        @NotNull
        public final ExitDTO copy(@NotNull TextAtom text, boolean isLeft) {
            Intrinsics.checkNotNullParameter(text, "text");
            return new ExitDTO(text, isLeft);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ExitDTO)) {
                return false;
            }
            ExitDTO exitDTO = (ExitDTO) other;
            return Intrinsics.d(this.text, exitDTO.text) && this.isLeft == exitDTO.isLeft;
        }

        @NotNull
        public final TextAtom getText() {
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
            return "ExitDTO(text=" + this.text + ", isLeft=" + this.isLeft + ")";
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0010\b\u0001\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0011\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0003HÆ\u0003J\u001b\u0010\t\u001a\u00020\u00002\u0010\b\u0003\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0019\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/data/scheme/FlightSeatsSchemeBlockDTO$RowDTO;", "", "seats", "", "<init>", "(Ljava/util/List;)V", "getSeats", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class RowDTO {
        public static final int $stable = 8;

        @NotNull
        private final List<Object> seats;

        public RowDTO(@ProtoOneOfSignature.Container({@ProtoOneOfSignature(name = "emptySpace", type = Object.class), @ProtoOneOfSignature(name = "seat", type = SeatDTO.class), @ProtoOneOfSignature(name = "exit", type = ExitDTO.class), @ProtoOneOfSignature(name = "aisle", type = AisleDTO.class), @ProtoOneOfSignature(name = "columnTitle", type = TextAtom.class)}) @NotNull @ProtoOneOf(label = "type") List<? extends Object> seats) {
            Intrinsics.checkNotNullParameter(seats, "seats");
            this.seats = seats;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ RowDTO copy$default(RowDTO rowDTO, List list, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                list = rowDTO.seats;
            }
            return rowDTO.copy(list);
        }

        @NotNull
        public final List<Object> component1() {
            return this.seats;
        }

        @NotNull
        public final RowDTO copy(@ProtoOneOfSignature.Container({@ProtoOneOfSignature(name = "emptySpace", type = Object.class), @ProtoOneOfSignature(name = "seat", type = SeatDTO.class), @ProtoOneOfSignature(name = "exit", type = ExitDTO.class), @ProtoOneOfSignature(name = "aisle", type = AisleDTO.class), @ProtoOneOfSignature(name = "columnTitle", type = TextAtom.class)}) @NotNull @ProtoOneOf(label = "type") List<? extends Object> seats) {
            Intrinsics.checkNotNullParameter(seats, "seats");
            return new RowDTO(seats);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof RowDTO) && Intrinsics.d(this.seats, ((RowDTO) other).seats);
        }

        @NotNull
        public final List<Object> getSeats() {
            return this.seats;
        }

        public int hashCode() {
            return this.seats.hashCode();
        }

        @NotNull
        public String toString() {
            return c.a("RowDTO(seats=", ")", this.seats);
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/data/scheme/FlightSeatsSchemeBlockDTO$SeatDTO;", "", "number", "", "typeID", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getNumber", "()Ljava/lang/String;", "getTypeID", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class SeatDTO {
        public static final int $stable = 0;

        @NotNull
        private final String number;

        @NotNull
        private final String typeID;

        public SeatDTO(@NotNull String number, @NotNull String typeID) {
            Intrinsics.checkNotNullParameter(number, "number");
            Intrinsics.checkNotNullParameter(typeID, "typeID");
            this.number = number;
            this.typeID = typeID;
        }

        public static /* synthetic */ SeatDTO copy$default(SeatDTO seatDTO, String str, String str2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = seatDTO.number;
            }
            if ((i11 & 2) != 0) {
                str2 = seatDTO.typeID;
            }
            return seatDTO.copy(str, str2);
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

        @NotNull
        public final SeatDTO copy(@NotNull String number, @NotNull String typeID) {
            Intrinsics.checkNotNullParameter(number, "number");
            Intrinsics.checkNotNullParameter(typeID, "typeID");
            return new SeatDTO(number, typeID);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SeatDTO)) {
                return false;
            }
            SeatDTO seatDTO = (SeatDTO) other;
            return Intrinsics.d(this.number, seatDTO.number) && Intrinsics.d(this.typeID, seatDTO.typeID);
        }

        @NotNull
        public final String getNumber() {
            return this.number;
        }

        @NotNull
        public final String getTypeID() {
            return this.typeID;
        }

        public int hashCode() {
            return this.typeID.hashCode() + (this.number.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return e.a("SeatDTO(number=", this.number, ", typeID=", this.typeID, ")");
        }
    }

    public FlightSeatsSchemeBlockDTO(int i11, int i12, @NotNull AtomActionDTO seatSelectionAction, @NotNull String exitMarkingColor, @NotNull AirplaneSeatDTO selectedSeatType, @NotNull List<RowDTO> rows, @NotNull List<AirplaneSeatDTO> seatTypes) {
        Intrinsics.checkNotNullParameter(seatSelectionAction, "seatSelectionAction");
        Intrinsics.checkNotNullParameter(exitMarkingColor, "exitMarkingColor");
        Intrinsics.checkNotNullParameter(selectedSeatType, "selectedSeatType");
        Intrinsics.checkNotNullParameter(rows, "rows");
        Intrinsics.checkNotNullParameter(seatTypes, "seatTypes");
        this.schemeWidth = i11;
        this.seatCountInRow = i12;
        this.seatSelectionAction = seatSelectionAction;
        this.exitMarkingColor = exitMarkingColor;
        this.selectedSeatType = selectedSeatType;
        this.rows = rows;
        this.seatTypes = seatTypes;
    }

    public static /* synthetic */ FlightSeatsSchemeBlockDTO copy$default(FlightSeatsSchemeBlockDTO flightSeatsSchemeBlockDTO, int i11, int i12, AtomActionDTO atomActionDTO, String str, AirplaneSeatDTO airplaneSeatDTO, List list, List list2, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i11 = flightSeatsSchemeBlockDTO.schemeWidth;
        }
        if ((i13 & 2) != 0) {
            i12 = flightSeatsSchemeBlockDTO.seatCountInRow;
        }
        if ((i13 & 4) != 0) {
            atomActionDTO = flightSeatsSchemeBlockDTO.seatSelectionAction;
        }
        if ((i13 & 8) != 0) {
            str = flightSeatsSchemeBlockDTO.exitMarkingColor;
        }
        if ((i13 & 16) != 0) {
            airplaneSeatDTO = flightSeatsSchemeBlockDTO.selectedSeatType;
        }
        if ((i13 & 32) != 0) {
            list = flightSeatsSchemeBlockDTO.rows;
        }
        if ((i13 & 64) != 0) {
            list2 = flightSeatsSchemeBlockDTO.seatTypes;
        }
        List list3 = list;
        List list4 = list2;
        AirplaneSeatDTO airplaneSeatDTO2 = airplaneSeatDTO;
        AtomActionDTO atomActionDTO2 = atomActionDTO;
        return flightSeatsSchemeBlockDTO.copy(i11, i12, atomActionDTO2, str, airplaneSeatDTO2, list3, list4);
    }

    /* renamed from: component1, reason: from getter */
    public final int getSchemeWidth() {
        return this.schemeWidth;
    }

    /* renamed from: component2, reason: from getter */
    public final int getSeatCountInRow() {
        return this.seatCountInRow;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final AtomActionDTO getSeatSelectionAction() {
        return this.seatSelectionAction;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final String getExitMarkingColor() {
        return this.exitMarkingColor;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final AirplaneSeatDTO getSelectedSeatType() {
        return this.selectedSeatType;
    }

    @NotNull
    public final List<RowDTO> component6() {
        return this.rows;
    }

    @NotNull
    public final List<AirplaneSeatDTO> component7() {
        return this.seatTypes;
    }

    @NotNull
    public final FlightSeatsSchemeBlockDTO copy(int schemeWidth, int seatCountInRow, @NotNull AtomActionDTO seatSelectionAction, @NotNull String exitMarkingColor, @NotNull AirplaneSeatDTO selectedSeatType, @NotNull List<RowDTO> rows, @NotNull List<AirplaneSeatDTO> seatTypes) {
        Intrinsics.checkNotNullParameter(seatSelectionAction, "seatSelectionAction");
        Intrinsics.checkNotNullParameter(exitMarkingColor, "exitMarkingColor");
        Intrinsics.checkNotNullParameter(selectedSeatType, "selectedSeatType");
        Intrinsics.checkNotNullParameter(rows, "rows");
        Intrinsics.checkNotNullParameter(seatTypes, "seatTypes");
        return new FlightSeatsSchemeBlockDTO(schemeWidth, seatCountInRow, seatSelectionAction, exitMarkingColor, selectedSeatType, rows, seatTypes);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FlightSeatsSchemeBlockDTO)) {
            return false;
        }
        FlightSeatsSchemeBlockDTO flightSeatsSchemeBlockDTO = (FlightSeatsSchemeBlockDTO) other;
        return this.schemeWidth == flightSeatsSchemeBlockDTO.schemeWidth && this.seatCountInRow == flightSeatsSchemeBlockDTO.seatCountInRow && Intrinsics.d(this.seatSelectionAction, flightSeatsSchemeBlockDTO.seatSelectionAction) && Intrinsics.d(this.exitMarkingColor, flightSeatsSchemeBlockDTO.exitMarkingColor) && Intrinsics.d(this.selectedSeatType, flightSeatsSchemeBlockDTO.selectedSeatType) && Intrinsics.d(this.rows, flightSeatsSchemeBlockDTO.rows) && Intrinsics.d(this.seatTypes, flightSeatsSchemeBlockDTO.seatTypes);
    }

    @NotNull
    public final String getExitMarkingColor() {
        return this.exitMarkingColor;
    }

    @NotNull
    public final List<RowDTO> getRows() {
        return this.rows;
    }

    public final int getSchemeWidth() {
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
    public final List<AirplaneSeatDTO> getSeatTypes() {
        return this.seatTypes;
    }

    @NotNull
    public final AirplaneSeatDTO getSelectedSeatType() {
        return this.selectedSeatType;
    }

    public int hashCode() {
        return this.seatTypes.hashCode() + g.b((this.selectedSeatType.hashCode() + g.a(a.b(this.seatSelectionAction, C2454a.a(this.seatCountInRow, Integer.hashCode(this.schemeWidth) * 31, 31), 31), 31, this.exitMarkingColor)) * 31, 31, this.rows);
    }

    @NotNull
    public String toString() {
        int i11 = this.schemeWidth;
        int i12 = this.seatCountInRow;
        AtomActionDTO atomActionDTO = this.seatSelectionAction;
        String str = this.exitMarkingColor;
        AirplaneSeatDTO airplaneSeatDTO = this.selectedSeatType;
        List<RowDTO> list = this.rows;
        List<AirplaneSeatDTO> list2 = this.seatTypes;
        StringBuilder a11 = C2438a.a("FlightSeatsSchemeBlockDTO(schemeWidth=", i11, ", seatCountInRow=", ", seatSelectionAction=", i12);
        b.d(", exitMarkingColor=", str, ", selectedSeatType=", a11, atomActionDTO);
        a11.append(airplaneSeatDTO);
        a11.append(", rows=");
        a11.append(list);
        a11.append(", seatTypes=");
        return C2618u.h(a11, list2, ")");
    }

    public FlightSeatsSchemeBlockDTO(int i11, int i12, AtomActionDTO atomActionDTO, String str, AirplaneSeatDTO airplaneSeatDTO, List list, List list2, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(i11, i12, atomActionDTO, str, airplaneSeatDTO, list, (i13 & 64) != 0 ? K.f71697a : list2);
    }
}
