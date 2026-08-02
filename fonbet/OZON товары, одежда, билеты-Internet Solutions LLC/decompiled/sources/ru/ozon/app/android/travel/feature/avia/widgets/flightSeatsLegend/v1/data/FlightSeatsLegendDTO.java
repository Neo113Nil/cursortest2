package ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsLegend.v1.data;

import B90.C2619v;
import J.d;
import com.squareup.moshi.j;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.avia.shared.airplaneSeat.AirplaneSeatDTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.badge.Badge;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@j(generateAdapter = true)
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001:\u0001\u0017B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsLegend/v1/data/FlightSeatsLegendDTO;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/texts/TextAtom;", "seatTypes", "", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsLegend/v1/data/FlightSeatsLegendDTO$SeatType;", "<init>", "(Lru/ozon/uni/atoms/data/texts/TextAtom;Ljava/util/List;)V", "getTitle", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getSeatTypes", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "SeatType", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class FlightSeatsLegendDTO {
    public static final int $stable = 8;

    @NotNull
    private final List<SeatType> seatTypes;

    @NotNull
    private final TextAtom title;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003J)\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsLegend/v1/data/FlightSeatsLegendDTO$SeatType;", "", "sign", "Lru/ozon/app/android/travel/feature/avia/shared/airplaneSeat/AirplaneSeatDTO;", "description", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "priceFromBadge", "Lru/ozon/uni/atoms/data/badge/Badge;", "<init>", "(Lru/ozon/app/android/travel/feature/avia/shared/airplaneSeat/AirplaneSeatDTO;Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/badge/Badge;)V", "getSign", "()Lru/ozon/app/android/travel/feature/avia/shared/airplaneSeat/AirplaneSeatDTO;", "getDescription", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getPriceFromBadge", "()Lru/ozon/uni/atoms/data/badge/Badge;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class SeatType {
        public static final int $stable;

        @NotNull
        private final TextAtom description;
        private final Badge priceFromBadge;

        @NotNull
        private final AirplaneSeatDTO sign;

        static {
            int i11 = Badge.$stable;
            int i12 = TextAtom.$stable;
            $stable = i11 | i12 | i12;
        }

        public SeatType(@NotNull AirplaneSeatDTO sign, @NotNull TextAtom description, Badge badge) {
            Intrinsics.checkNotNullParameter(sign, "sign");
            Intrinsics.checkNotNullParameter(description, "description");
            this.sign = sign;
            this.description = description;
            this.priceFromBadge = badge;
        }

        public static /* synthetic */ SeatType copy$default(SeatType seatType, AirplaneSeatDTO airplaneSeatDTO, TextAtom textAtom, Badge badge, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                airplaneSeatDTO = seatType.sign;
            }
            if ((i11 & 2) != 0) {
                textAtom = seatType.description;
            }
            if ((i11 & 4) != 0) {
                badge = seatType.priceFromBadge;
            }
            return seatType.copy(airplaneSeatDTO, textAtom, badge);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final AirplaneSeatDTO getSign() {
            return this.sign;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final TextAtom getDescription() {
            return this.description;
        }

        /* renamed from: component3, reason: from getter */
        public final Badge getPriceFromBadge() {
            return this.priceFromBadge;
        }

        @NotNull
        public final SeatType copy(@NotNull AirplaneSeatDTO sign, @NotNull TextAtom description, Badge priceFromBadge) {
            Intrinsics.checkNotNullParameter(sign, "sign");
            Intrinsics.checkNotNullParameter(description, "description");
            return new SeatType(sign, description, priceFromBadge);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SeatType)) {
                return false;
            }
            SeatType seatType = (SeatType) other;
            return Intrinsics.d(this.sign, seatType.sign) && Intrinsics.d(this.description, seatType.description) && Intrinsics.d(this.priceFromBadge, seatType.priceFromBadge);
        }

        @NotNull
        public final TextAtom getDescription() {
            return this.description;
        }

        public final Badge getPriceFromBadge() {
            return this.priceFromBadge;
        }

        @NotNull
        public final AirplaneSeatDTO getSign() {
            return this.sign;
        }

        public int hashCode() {
            int b11 = C2619v.b(this.sign.hashCode() * 31, 31, this.description);
            Badge badge = this.priceFromBadge;
            return b11 + (badge == null ? 0 : badge.hashCode());
        }

        @NotNull
        public String toString() {
            return "SeatType(sign=" + this.sign + ", description=" + this.description + ", priceFromBadge=" + this.priceFromBadge + ")";
        }
    }

    public FlightSeatsLegendDTO(@NotNull TextAtom title, @NotNull List<SeatType> seatTypes) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(seatTypes, "seatTypes");
        this.title = title;
        this.seatTypes = seatTypes;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FlightSeatsLegendDTO copy$default(FlightSeatsLegendDTO flightSeatsLegendDTO, TextAtom textAtom, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            textAtom = flightSeatsLegendDTO.title;
        }
        if ((i11 & 2) != 0) {
            list = flightSeatsLegendDTO.seatTypes;
        }
        return flightSeatsLegendDTO.copy(textAtom, list);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final TextAtom getTitle() {
        return this.title;
    }

    @NotNull
    public final List<SeatType> component2() {
        return this.seatTypes;
    }

    @NotNull
    public final FlightSeatsLegendDTO copy(@NotNull TextAtom title, @NotNull List<SeatType> seatTypes) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(seatTypes, "seatTypes");
        return new FlightSeatsLegendDTO(title, seatTypes);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FlightSeatsLegendDTO)) {
            return false;
        }
        FlightSeatsLegendDTO flightSeatsLegendDTO = (FlightSeatsLegendDTO) other;
        return Intrinsics.d(this.title, flightSeatsLegendDTO.title) && Intrinsics.d(this.seatTypes, flightSeatsLegendDTO.seatTypes);
    }

    @NotNull
    public final List<SeatType> getSeatTypes() {
        return this.seatTypes;
    }

    @NotNull
    public final TextAtom getTitle() {
        return this.title;
    }

    public int hashCode() {
        return this.seatTypes.hashCode() + (this.title.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return d.c("FlightSeatsLegendDTO(title=", this.title, ", seatTypes=", this.seatTypes, ")");
    }
}
