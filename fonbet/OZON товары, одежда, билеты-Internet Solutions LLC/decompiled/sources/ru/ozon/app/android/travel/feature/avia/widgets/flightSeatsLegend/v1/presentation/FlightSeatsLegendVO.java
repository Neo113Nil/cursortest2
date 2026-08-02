package ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsLegend.v1.presentation;

import B90.C2619v;
import Bi.b;
import Bl.C2639a;
import D3.h;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.avia.shared.airplaneSeat.AirplaneSeatVO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.badge.Badge;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0081\b\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0001 B%\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006!"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsLegend/v1/presentation/FlightSeatsLegendVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "Lru/ozon/uni/atoms/data/texts/TextAtom;", SelectionItemFormDTO.TITLE_FIELD_NAME, "", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsLegend/v1/presentation/FlightSeatsLegendVO$SeatType;", "seatTypes", "<init>", "(JLru/ozon/uni/atoms/data/texts/TextAtom;Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "getTitle", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "Ljava/util/List;", "getSeatTypes", "()Ljava/util/List;", "SeatType", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class FlightSeatsLegendVO implements c {
    private final long id;

    @NotNull
    private final List<SeatType> seatTypes;

    @NotNull
    private final TextAtom title;

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0014\b\u0081\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0015\u001a\u00020\n2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010#\u001a\u0004\b\u000b\u0010$¨\u0006%"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsLegend/v1/presentation/FlightSeatsLegendVO$SeatType;", "", "", "id", "Lru/ozon/app/android/travel/feature/avia/shared/airplaneSeat/AirplaneSeatVO;", "sign", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "description", "Lru/ozon/uni/atoms/data/badge/Badge;", "priceFromBadge", "", "isSeparatorInvisible", "<init>", "(JLru/ozon/app/android/travel/feature/avia/shared/airplaneSeat/AirplaneSeatVO;Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/badge/Badge;Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/app/android/travel/feature/avia/shared/airplaneSeat/AirplaneSeatVO;", "getSign", "()Lru/ozon/app/android/travel/feature/avia/shared/airplaneSeat/AirplaneSeatVO;", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "getDescription", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "Lru/ozon/uni/atoms/data/badge/Badge;", "getPriceFromBadge", "()Lru/ozon/uni/atoms/data/badge/Badge;", "Z", "()Z", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class SeatType {
        public static final int $stable;

        @NotNull
        private final TextAtom description;
        private final long id;
        private final boolean isSeparatorInvisible;
        private final Badge priceFromBadge;

        @NotNull
        private final AirplaneSeatVO sign;

        static {
            int i11 = Badge.$stable;
            int i12 = TextAtom.$stable;
            $stable = i11 | i12 | i12;
        }

        public SeatType(long j11, @NotNull AirplaneSeatVO sign, @NotNull TextAtom description, Badge badge, boolean z11) {
            Intrinsics.checkNotNullParameter(sign, "sign");
            Intrinsics.checkNotNullParameter(description, "description");
            this.id = j11;
            this.sign = sign;
            this.description = description;
            this.priceFromBadge = badge;
            this.isSeparatorInvisible = z11;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SeatType)) {
                return false;
            }
            SeatType seatType = (SeatType) other;
            return this.id == seatType.id && Intrinsics.d(this.sign, seatType.sign) && Intrinsics.d(this.description, seatType.description) && Intrinsics.d(this.priceFromBadge, seatType.priceFromBadge) && this.isSeparatorInvisible == seatType.isSeparatorInvisible;
        }

        @NotNull
        public final TextAtom getDescription() {
            return this.description;
        }

        public final long getId() {
            return this.id;
        }

        public final Badge getPriceFromBadge() {
            return this.priceFromBadge;
        }

        @NotNull
        public final AirplaneSeatVO getSign() {
            return this.sign;
        }

        public int hashCode() {
            int b11 = C2619v.b((this.sign.hashCode() + (Long.hashCode(this.id) * 31)) * 31, 31, this.description);
            Badge badge = this.priceFromBadge;
            return Boolean.hashCode(this.isSeparatorInvisible) + ((b11 + (badge == null ? 0 : badge.hashCode())) * 31);
        }

        /* renamed from: isSeparatorInvisible, reason: from getter */
        public final boolean getIsSeparatorInvisible() {
            return this.isSeparatorInvisible;
        }

        @NotNull
        public String toString() {
            long j11 = this.id;
            AirplaneSeatVO airplaneSeatVO = this.sign;
            TextAtom textAtom = this.description;
            Badge badge = this.priceFromBadge;
            boolean z11 = this.isSeparatorInvisible;
            StringBuilder sb2 = new StringBuilder("SeatType(id=");
            sb2.append(j11);
            sb2.append(", sign=");
            sb2.append(airplaneSeatVO);
            sb2.append(", description=");
            sb2.append(textAtom);
            sb2.append(", priceFromBadge=");
            sb2.append(badge);
            return b.f(sb2, ", isSeparatorInvisible=", z11, ")");
        }
    }

    public FlightSeatsLegendVO(long j11, @NotNull TextAtom title, @NotNull List<SeatType> seatTypes) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(seatTypes, "seatTypes");
        this.id = j11;
        this.title = title;
        this.seatTypes = seatTypes;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FlightSeatsLegendVO)) {
            return false;
        }
        FlightSeatsLegendVO flightSeatsLegendVO = (FlightSeatsLegendVO) other;
        return this.id == flightSeatsLegendVO.id && Intrinsics.d(this.title, flightSeatsLegendVO.title) && Intrinsics.d(this.seatTypes, flightSeatsLegendVO.seatTypes);
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    @NotNull
    public final List<SeatType> getSeatTypes() {
        return this.seatTypes;
    }

    @NotNull
    public final TextAtom getTitle() {
        return this.title;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        return this.seatTypes.hashCode() + C2619v.b(Long.hashCode(this.id) * 31, 31, this.title);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        TextAtom textAtom = this.title;
        return h.c(C2639a.c("FlightSeatsLegendVO(id=", j11, ", title=", textAtom), ", seatTypes=", this.seatTypes, ")");
    }
}
