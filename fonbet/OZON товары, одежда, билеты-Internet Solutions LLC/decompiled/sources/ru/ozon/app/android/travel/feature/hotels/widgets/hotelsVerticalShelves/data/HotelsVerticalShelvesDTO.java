package ru.ozon.app.android.travel.feature.hotels.widgets.hotelsVerticalShelves.data;

import G.g;
import com.squareup.moshi.j;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.hotels.shared.data.ShelfCardDTO;
import ru.ozon.app.android.travel.feature.hotels.shared.data.ShelfCardOptions;

@j(generateAdapter = true)
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001:\u0001!B7\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\b0\u0003HÆ\u0003J\u0010\u0010\u0018\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010\u0013JF\u0010\u0019\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0002\u0010\u001aJ\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\nHÖ\u0001J\t\u0010\u001f\u001a\u00020 HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0015\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0012\u0010\u0013¨\u0006\""}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsVerticalShelves/data/HotelsVerticalShelvesDTO;", "", "cards", "", "Lru/ozon/app/android/travel/feature/hotels/shared/data/ShelfCardDTO;", "cardOptions", "Lru/ozon/app/android/travel/feature/hotels/shared/data/ShelfCardOptions;", "rows", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsVerticalShelves/data/HotelsVerticalShelvesDTO$CardsRow;", "verticalGap", "", "<init>", "(Ljava/util/List;Lru/ozon/app/android/travel/feature/hotels/shared/data/ShelfCardOptions;Ljava/util/List;Ljava/lang/Integer;)V", "getCards", "()Ljava/util/List;", "getCardOptions", "()Lru/ozon/app/android/travel/feature/hotels/shared/data/ShelfCardOptions;", "getRows", "getVerticalGap", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "component3", "component4", "copy", "(Ljava/util/List;Lru/ozon/app/android/travel/feature/hotels/shared/data/ShelfCardOptions;Ljava/util/List;Ljava/lang/Integer;)Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsVerticalShelves/data/HotelsVerticalShelvesDTO;", "equals", "", "other", "hashCode", "toString", "", "CardsRow", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class HotelsVerticalShelvesDTO {
    public static final int $stable = 8;
    private final ShelfCardOptions cardOptions;

    @NotNull
    private final List<ShelfCardDTO> cards;

    @NotNull
    private final List<CardsRow> rows;
    private final Integer verticalGap;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsVerticalShelves/data/HotelsVerticalShelvesDTO$CardsRow;", "", "cardCount", "", "imageAspectRatio", "", "<init>", "(IF)V", "getCardCount", "()I", "getImageAspectRatio", "()F", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class CardsRow {
        public static final int $stable = 0;
        private final int cardCount;
        private final float imageAspectRatio;

        public CardsRow(int i11, float f7) {
            this.cardCount = i11;
            this.imageAspectRatio = f7;
        }

        public static /* synthetic */ CardsRow copy$default(CardsRow cardsRow, int i11, float f7, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                i11 = cardsRow.cardCount;
            }
            if ((i12 & 2) != 0) {
                f7 = cardsRow.imageAspectRatio;
            }
            return cardsRow.copy(i11, f7);
        }

        /* renamed from: component1, reason: from getter */
        public final int getCardCount() {
            return this.cardCount;
        }

        /* renamed from: component2, reason: from getter */
        public final float getImageAspectRatio() {
            return this.imageAspectRatio;
        }

        @NotNull
        public final CardsRow copy(int cardCount, float imageAspectRatio) {
            return new CardsRow(cardCount, imageAspectRatio);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CardsRow)) {
                return false;
            }
            CardsRow cardsRow = (CardsRow) other;
            return this.cardCount == cardsRow.cardCount && Float.compare(this.imageAspectRatio, cardsRow.imageAspectRatio) == 0;
        }

        public final int getCardCount() {
            return this.cardCount;
        }

        public final float getImageAspectRatio() {
            return this.imageAspectRatio;
        }

        public int hashCode() {
            return Float.hashCode(this.imageAspectRatio) + (Integer.hashCode(this.cardCount) * 31);
        }

        @NotNull
        public String toString() {
            return "CardsRow(cardCount=" + this.cardCount + ", imageAspectRatio=" + this.imageAspectRatio + ")";
        }
    }

    public HotelsVerticalShelvesDTO(@NotNull List<ShelfCardDTO> cards, ShelfCardOptions shelfCardOptions, @NotNull List<CardsRow> rows, Integer num) {
        Intrinsics.checkNotNullParameter(cards, "cards");
        Intrinsics.checkNotNullParameter(rows, "rows");
        this.cards = cards;
        this.cardOptions = shelfCardOptions;
        this.rows = rows;
        this.verticalGap = num;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ HotelsVerticalShelvesDTO copy$default(HotelsVerticalShelvesDTO hotelsVerticalShelvesDTO, List list, ShelfCardOptions shelfCardOptions, List list2, Integer num, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = hotelsVerticalShelvesDTO.cards;
        }
        if ((i11 & 2) != 0) {
            shelfCardOptions = hotelsVerticalShelvesDTO.cardOptions;
        }
        if ((i11 & 4) != 0) {
            list2 = hotelsVerticalShelvesDTO.rows;
        }
        if ((i11 & 8) != 0) {
            num = hotelsVerticalShelvesDTO.verticalGap;
        }
        return hotelsVerticalShelvesDTO.copy(list, shelfCardOptions, list2, num);
    }

    @NotNull
    public final List<ShelfCardDTO> component1() {
        return this.cards;
    }

    /* renamed from: component2, reason: from getter */
    public final ShelfCardOptions getCardOptions() {
        return this.cardOptions;
    }

    @NotNull
    public final List<CardsRow> component3() {
        return this.rows;
    }

    /* renamed from: component4, reason: from getter */
    public final Integer getVerticalGap() {
        return this.verticalGap;
    }

    @NotNull
    public final HotelsVerticalShelvesDTO copy(@NotNull List<ShelfCardDTO> cards, ShelfCardOptions cardOptions, @NotNull List<CardsRow> rows, Integer verticalGap) {
        Intrinsics.checkNotNullParameter(cards, "cards");
        Intrinsics.checkNotNullParameter(rows, "rows");
        return new HotelsVerticalShelvesDTO(cards, cardOptions, rows, verticalGap);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HotelsVerticalShelvesDTO)) {
            return false;
        }
        HotelsVerticalShelvesDTO hotelsVerticalShelvesDTO = (HotelsVerticalShelvesDTO) other;
        return Intrinsics.d(this.cards, hotelsVerticalShelvesDTO.cards) && Intrinsics.d(this.cardOptions, hotelsVerticalShelvesDTO.cardOptions) && Intrinsics.d(this.rows, hotelsVerticalShelvesDTO.rows) && Intrinsics.d(this.verticalGap, hotelsVerticalShelvesDTO.verticalGap);
    }

    public final ShelfCardOptions getCardOptions() {
        return this.cardOptions;
    }

    @NotNull
    public final List<ShelfCardDTO> getCards() {
        return this.cards;
    }

    @NotNull
    public final List<CardsRow> getRows() {
        return this.rows;
    }

    public final Integer getVerticalGap() {
        return this.verticalGap;
    }

    public int hashCode() {
        int hashCode = this.cards.hashCode() * 31;
        ShelfCardOptions shelfCardOptions = this.cardOptions;
        int b11 = g.b((hashCode + (shelfCardOptions == null ? 0 : shelfCardOptions.hashCode())) * 31, 31, this.rows);
        Integer num = this.verticalGap;
        return b11 + (num != null ? num.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "HotelsVerticalShelvesDTO(cards=" + this.cards + ", cardOptions=" + this.cardOptions + ", rows=" + this.rows + ", verticalGap=" + this.verticalGap + ")";
    }
}
