package ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsLegend.v2.data;

import G.g;
import K1.G;
import T7.P;
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
import ru.ozon.uni.atoms.data.dsCell.CellDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001:\u0001\u001dB5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u0017\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\bHÆ\u0003J;\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\bHÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\tHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u001f\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsLegend/v2/data/FlightSeatsLegendV2DTO;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/text/TextDTO;", "seatTypes", "", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsLegend/v2/data/FlightSeatsLegendV2DTO$SeatTypeV2DTO;", "viewTracking", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Ljava/util/List;Ljava/util/Map;)V", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getSeatTypes", "()Ljava/util/List;", "getViewTracking", "()Ljava/util/Map;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "SeatTypeV2DTO", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class FlightSeatsLegendV2DTO {
    public static final int $stable = 8;

    @NotNull
    private final List<SeatTypeV2DTO> seatTypes;

    @NotNull
    private final TextDTO title;
    private final Map<String, TokenizedTrackingInfo> viewTracking;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\bHÆ\u0003J5\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0005HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsLegend/v2/data/FlightSeatsLegendV2DTO$SeatTypeV2DTO;", "", "seatText", "Lru/ozon/uni/atoms/data/text/TextDTO;", "seatBackgroundColor", "", "seatBackrestColor", "cell", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Ljava/lang/String;Ljava/lang/String;Lru/ozon/uni/atoms/data/dsCell/CellDTO;)V", "getSeatText", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getSeatBackgroundColor", "()Ljava/lang/String;", "getSeatBackrestColor", "getCell", "()Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class SeatTypeV2DTO {
        public static final int $stable = CellDTO.$stable;

        @NotNull
        private final CellDTO cell;

        @NotNull
        private final String seatBackgroundColor;
        private final String seatBackrestColor;
        private final TextDTO seatText;

        public SeatTypeV2DTO(TextDTO textDTO, @NotNull String seatBackgroundColor, String str, @NotNull CellDTO cell) {
            Intrinsics.checkNotNullParameter(seatBackgroundColor, "seatBackgroundColor");
            Intrinsics.checkNotNullParameter(cell, "cell");
            this.seatText = textDTO;
            this.seatBackgroundColor = seatBackgroundColor;
            this.seatBackrestColor = str;
            this.cell = cell;
        }

        public static /* synthetic */ SeatTypeV2DTO copy$default(SeatTypeV2DTO seatTypeV2DTO, TextDTO textDTO, String str, String str2, CellDTO cellDTO, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                textDTO = seatTypeV2DTO.seatText;
            }
            if ((i11 & 2) != 0) {
                str = seatTypeV2DTO.seatBackgroundColor;
            }
            if ((i11 & 4) != 0) {
                str2 = seatTypeV2DTO.seatBackrestColor;
            }
            if ((i11 & 8) != 0) {
                cellDTO = seatTypeV2DTO.cell;
            }
            return seatTypeV2DTO.copy(textDTO, str, str2, cellDTO);
        }

        /* renamed from: component1, reason: from getter */
        public final TextDTO getSeatText() {
            return this.seatText;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final String getSeatBackgroundColor() {
            return this.seatBackgroundColor;
        }

        /* renamed from: component3, reason: from getter */
        public final String getSeatBackrestColor() {
            return this.seatBackrestColor;
        }

        @NotNull
        /* renamed from: component4, reason: from getter */
        public final CellDTO getCell() {
            return this.cell;
        }

        @NotNull
        public final SeatTypeV2DTO copy(TextDTO seatText, @NotNull String seatBackgroundColor, String seatBackrestColor, @NotNull CellDTO cell) {
            Intrinsics.checkNotNullParameter(seatBackgroundColor, "seatBackgroundColor");
            Intrinsics.checkNotNullParameter(cell, "cell");
            return new SeatTypeV2DTO(seatText, seatBackgroundColor, seatBackrestColor, cell);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SeatTypeV2DTO)) {
                return false;
            }
            SeatTypeV2DTO seatTypeV2DTO = (SeatTypeV2DTO) other;
            return Intrinsics.d(this.seatText, seatTypeV2DTO.seatText) && Intrinsics.d(this.seatBackgroundColor, seatTypeV2DTO.seatBackgroundColor) && Intrinsics.d(this.seatBackrestColor, seatTypeV2DTO.seatBackrestColor) && Intrinsics.d(this.cell, seatTypeV2DTO.cell);
        }

        @NotNull
        public final CellDTO getCell() {
            return this.cell;
        }

        @NotNull
        public final String getSeatBackgroundColor() {
            return this.seatBackgroundColor;
        }

        public final String getSeatBackrestColor() {
            return this.seatBackrestColor;
        }

        public final TextDTO getSeatText() {
            return this.seatText;
        }

        public int hashCode() {
            TextDTO textDTO = this.seatText;
            int a11 = g.a((textDTO == null ? 0 : textDTO.hashCode()) * 31, 31, this.seatBackgroundColor);
            String str = this.seatBackrestColor;
            return this.cell.hashCode() + ((a11 + (str != null ? str.hashCode() : 0)) * 31);
        }

        @NotNull
        public String toString() {
            TextDTO textDTO = this.seatText;
            String str = this.seatBackgroundColor;
            String str2 = this.seatBackrestColor;
            CellDTO cellDTO = this.cell;
            StringBuilder f7 = D3.g.f("SeatTypeV2DTO(seatText=", textDTO, ", seatBackgroundColor=", str, ", seatBackrestColor=");
            f7.append(str2);
            f7.append(", cell=");
            f7.append(cellDTO);
            f7.append(")");
            return f7.toString();
        }
    }

    public FlightSeatsLegendV2DTO(@NotNull TextDTO title, @NotNull List<SeatTypeV2DTO> seatTypes, Map<String, TokenizedTrackingInfo> map) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(seatTypes, "seatTypes");
        this.title = title;
        this.seatTypes = seatTypes;
        this.viewTracking = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FlightSeatsLegendV2DTO copy$default(FlightSeatsLegendV2DTO flightSeatsLegendV2DTO, TextDTO textDTO, List list, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            textDTO = flightSeatsLegendV2DTO.title;
        }
        if ((i11 & 2) != 0) {
            list = flightSeatsLegendV2DTO.seatTypes;
        }
        if ((i11 & 4) != 0) {
            map = flightSeatsLegendV2DTO.viewTracking;
        }
        return flightSeatsLegendV2DTO.copy(textDTO, list, map);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final TextDTO getTitle() {
        return this.title;
    }

    @NotNull
    public final List<SeatTypeV2DTO> component2() {
        return this.seatTypes;
    }

    public final Map<String, TokenizedTrackingInfo> component3() {
        return this.viewTracking;
    }

    @NotNull
    public final FlightSeatsLegendV2DTO copy(@NotNull TextDTO title, @NotNull List<SeatTypeV2DTO> seatTypes, Map<String, TokenizedTrackingInfo> viewTracking) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(seatTypes, "seatTypes");
        return new FlightSeatsLegendV2DTO(title, seatTypes, viewTracking);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FlightSeatsLegendV2DTO)) {
            return false;
        }
        FlightSeatsLegendV2DTO flightSeatsLegendV2DTO = (FlightSeatsLegendV2DTO) other;
        return Intrinsics.d(this.title, flightSeatsLegendV2DTO.title) && Intrinsics.d(this.seatTypes, flightSeatsLegendV2DTO.seatTypes) && Intrinsics.d(this.viewTracking, flightSeatsLegendV2DTO.viewTracking);
    }

    @NotNull
    public final List<SeatTypeV2DTO> getSeatTypes() {
        return this.seatTypes;
    }

    @NotNull
    public final TextDTO getTitle() {
        return this.title;
    }

    public final Map<String, TokenizedTrackingInfo> getViewTracking() {
        return this.viewTracking;
    }

    public int hashCode() {
        int b11 = g.b(this.title.hashCode() * 31, 31, this.seatTypes);
        Map<String, TokenizedTrackingInfo> map = this.viewTracking;
        return b11 + (map == null ? 0 : map.hashCode());
    }

    @NotNull
    public String toString() {
        TextDTO textDTO = this.title;
        List<SeatTypeV2DTO> list = this.seatTypes;
        return P.f(G.e("FlightSeatsLegendV2DTO(title=", textDTO, ", seatTypes=", list, ", viewTracking="), this.viewTracking, ")");
    }

    public FlightSeatsLegendV2DTO(TextDTO textDTO, List list, Map map, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(textDTO, (i11 & 2) != 0 ? K.f71697a : list, map);
    }
}
