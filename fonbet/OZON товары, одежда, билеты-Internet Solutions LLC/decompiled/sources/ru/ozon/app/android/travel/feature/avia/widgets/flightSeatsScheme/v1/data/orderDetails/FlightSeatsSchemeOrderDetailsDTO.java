package ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v1.data.orderDetails;

import B90.C2618u;
import B90.C2619v;
import Co.a;
import H3.c;
import Tl.b;
import com.squareup.moshi.j;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.K;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.core.widgets.commentsListV3.data.CommentV3DTO;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001:\u0002\"#B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0007HÆ\u0003J\u000f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0003JA\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020!HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006$"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/data/orderDetails/FlightSeatsSchemeOrderDetailsDTO;", "", CommentV3DTO.HEADER_FIELD_NAME, "Lru/ozon/uni/atoms/data/texts/TextAtom;", "totalPriceTitle", "totalPrice", "submitButton", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", "flightPrices", "", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/data/orderDetails/FlightSeatsSchemeOrderDetailsDTO$FlightPrice;", "<init>", "(Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;Ljava/util/List;)V", "getHeader", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getTotalPriceTitle", "getTotalPrice", "getSubmitButton", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", "getFlightPrices", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "", "FlightPrice", "ItemWithPrice", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class FlightSeatsSchemeOrderDetailsDTO {
    public static final int $stable = 8;

    @NotNull
    private final List<FlightPrice> flightPrices;

    @NotNull
    private final TextAtom header;

    @NotNull
    private final ButtonV3Atom.LargeButton submitButton;

    @NotNull
    private final TextAtom totalPrice;

    @NotNull
    private final TextAtom totalPriceTitle;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\n\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/data/orderDetails/FlightSeatsSchemeOrderDetailsDTO$FlightPrice;", "", "prices", "", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/data/orderDetails/FlightSeatsSchemeOrderDetailsDTO$ItemWithPrice;", "<init>", "(Ljava/util/List;)V", "getPrices", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class FlightPrice {
        public static final int $stable = 8;

        @NotNull
        private final List<ItemWithPrice> prices;

        public FlightPrice() {
            this(null, 1, null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ FlightPrice copy$default(FlightPrice flightPrice, List list, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                list = flightPrice.prices;
            }
            return flightPrice.copy(list);
        }

        @NotNull
        public final List<ItemWithPrice> component1() {
            return this.prices;
        }

        @NotNull
        public final FlightPrice copy(@NotNull List<ItemWithPrice> prices) {
            Intrinsics.checkNotNullParameter(prices, "prices");
            return new FlightPrice(prices);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof FlightPrice) && Intrinsics.d(this.prices, ((FlightPrice) other).prices);
        }

        @NotNull
        public final List<ItemWithPrice> getPrices() {
            return this.prices;
        }

        public int hashCode() {
            return this.prices.hashCode();
        }

        @NotNull
        public String toString() {
            return c.a("FlightPrice(prices=", ")", this.prices);
        }

        public FlightPrice(@NotNull List<ItemWithPrice> prices) {
            Intrinsics.checkNotNullParameter(prices, "prices");
            this.prices = prices;
        }

        public FlightPrice(List list, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? K.f71697a : list);
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u001f\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/data/orderDetails/FlightSeatsSchemeOrderDetailsDTO$ItemWithPrice;", "", "item", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "price", "<init>", "(Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/texts/TextAtom;)V", "getItem", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getPrice", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ItemWithPrice {
        public static final int $stable = TextAtom.$stable;

        @NotNull
        private final TextAtom item;
        private final TextAtom price;

        public ItemWithPrice(@NotNull TextAtom item, TextAtom textAtom) {
            Intrinsics.checkNotNullParameter(item, "item");
            this.item = item;
            this.price = textAtom;
        }

        public static /* synthetic */ ItemWithPrice copy$default(ItemWithPrice itemWithPrice, TextAtom textAtom, TextAtom textAtom2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                textAtom = itemWithPrice.item;
            }
            if ((i11 & 2) != 0) {
                textAtom2 = itemWithPrice.price;
            }
            return itemWithPrice.copy(textAtom, textAtom2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final TextAtom getItem() {
            return this.item;
        }

        /* renamed from: component2, reason: from getter */
        public final TextAtom getPrice() {
            return this.price;
        }

        @NotNull
        public final ItemWithPrice copy(@NotNull TextAtom item, TextAtom price) {
            Intrinsics.checkNotNullParameter(item, "item");
            return new ItemWithPrice(item, price);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ItemWithPrice)) {
                return false;
            }
            ItemWithPrice itemWithPrice = (ItemWithPrice) other;
            return Intrinsics.d(this.item, itemWithPrice.item) && Intrinsics.d(this.price, itemWithPrice.price);
        }

        @NotNull
        public final TextAtom getItem() {
            return this.item;
        }

        public final TextAtom getPrice() {
            return this.price;
        }

        public int hashCode() {
            int hashCode = this.item.hashCode() * 31;
            TextAtom textAtom = this.price;
            return hashCode + (textAtom == null ? 0 : textAtom.hashCode());
        }

        @NotNull
        public String toString() {
            return a.a("ItemWithPrice(item=", this.item, ", price=", this.price, ")");
        }
    }

    public FlightSeatsSchemeOrderDetailsDTO(@NotNull TextAtom header, @NotNull TextAtom totalPriceTitle, @NotNull TextAtom totalPrice, @NotNull ButtonV3Atom.LargeButton submitButton, @NotNull List<FlightPrice> flightPrices) {
        Intrinsics.checkNotNullParameter(header, "header");
        Intrinsics.checkNotNullParameter(totalPriceTitle, "totalPriceTitle");
        Intrinsics.checkNotNullParameter(totalPrice, "totalPrice");
        Intrinsics.checkNotNullParameter(submitButton, "submitButton");
        Intrinsics.checkNotNullParameter(flightPrices, "flightPrices");
        this.header = header;
        this.totalPriceTitle = totalPriceTitle;
        this.totalPrice = totalPrice;
        this.submitButton = submitButton;
        this.flightPrices = flightPrices;
    }

    public static /* synthetic */ FlightSeatsSchemeOrderDetailsDTO copy$default(FlightSeatsSchemeOrderDetailsDTO flightSeatsSchemeOrderDetailsDTO, TextAtom textAtom, TextAtom textAtom2, TextAtom textAtom3, ButtonV3Atom.LargeButton largeButton, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            textAtom = flightSeatsSchemeOrderDetailsDTO.header;
        }
        if ((i11 & 2) != 0) {
            textAtom2 = flightSeatsSchemeOrderDetailsDTO.totalPriceTitle;
        }
        if ((i11 & 4) != 0) {
            textAtom3 = flightSeatsSchemeOrderDetailsDTO.totalPrice;
        }
        if ((i11 & 8) != 0) {
            largeButton = flightSeatsSchemeOrderDetailsDTO.submitButton;
        }
        if ((i11 & 16) != 0) {
            list = flightSeatsSchemeOrderDetailsDTO.flightPrices;
        }
        List list2 = list;
        TextAtom textAtom4 = textAtom3;
        return flightSeatsSchemeOrderDetailsDTO.copy(textAtom, textAtom2, textAtom4, largeButton, list2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final TextAtom getHeader() {
        return this.header;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final TextAtom getTotalPriceTitle() {
        return this.totalPriceTitle;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final TextAtom getTotalPrice() {
        return this.totalPrice;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final ButtonV3Atom.LargeButton getSubmitButton() {
        return this.submitButton;
    }

    @NotNull
    public final List<FlightPrice> component5() {
        return this.flightPrices;
    }

    @NotNull
    public final FlightSeatsSchemeOrderDetailsDTO copy(@NotNull TextAtom header, @NotNull TextAtom totalPriceTitle, @NotNull TextAtom totalPrice, @NotNull ButtonV3Atom.LargeButton submitButton, @NotNull List<FlightPrice> flightPrices) {
        Intrinsics.checkNotNullParameter(header, "header");
        Intrinsics.checkNotNullParameter(totalPriceTitle, "totalPriceTitle");
        Intrinsics.checkNotNullParameter(totalPrice, "totalPrice");
        Intrinsics.checkNotNullParameter(submitButton, "submitButton");
        Intrinsics.checkNotNullParameter(flightPrices, "flightPrices");
        return new FlightSeatsSchemeOrderDetailsDTO(header, totalPriceTitle, totalPrice, submitButton, flightPrices);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FlightSeatsSchemeOrderDetailsDTO)) {
            return false;
        }
        FlightSeatsSchemeOrderDetailsDTO flightSeatsSchemeOrderDetailsDTO = (FlightSeatsSchemeOrderDetailsDTO) other;
        return Intrinsics.d(this.header, flightSeatsSchemeOrderDetailsDTO.header) && Intrinsics.d(this.totalPriceTitle, flightSeatsSchemeOrderDetailsDTO.totalPriceTitle) && Intrinsics.d(this.totalPrice, flightSeatsSchemeOrderDetailsDTO.totalPrice) && Intrinsics.d(this.submitButton, flightSeatsSchemeOrderDetailsDTO.submitButton) && Intrinsics.d(this.flightPrices, flightSeatsSchemeOrderDetailsDTO.flightPrices);
    }

    @NotNull
    public final List<FlightPrice> getFlightPrices() {
        return this.flightPrices;
    }

    @NotNull
    public final TextAtom getHeader() {
        return this.header;
    }

    @NotNull
    public final ButtonV3Atom.LargeButton getSubmitButton() {
        return this.submitButton;
    }

    @NotNull
    public final TextAtom getTotalPrice() {
        return this.totalPrice;
    }

    @NotNull
    public final TextAtom getTotalPriceTitle() {
        return this.totalPriceTitle;
    }

    public int hashCode() {
        return this.flightPrices.hashCode() + b.a(this.submitButton, C2619v.b(C2619v.b(this.header.hashCode() * 31, 31, this.totalPriceTitle), 31, this.totalPrice), 31);
    }

    @NotNull
    public String toString() {
        TextAtom textAtom = this.header;
        TextAtom textAtom2 = this.totalPriceTitle;
        TextAtom textAtom3 = this.totalPrice;
        ButtonV3Atom.LargeButton largeButton = this.submitButton;
        List<FlightPrice> list = this.flightPrices;
        StringBuilder a11 = HY.a.a("FlightSeatsSchemeOrderDetailsDTO(header=", textAtom, ", totalPriceTitle=", textAtom2, ", totalPrice=");
        a11.append(textAtom3);
        a11.append(", submitButton=");
        a11.append(largeButton);
        a11.append(", flightPrices=");
        return C2618u.h(a11, list, ")");
    }

    public FlightSeatsSchemeOrderDetailsDTO(TextAtom textAtom, TextAtom textAtom2, TextAtom textAtom3, ButtonV3Atom.LargeButton largeButton, List list, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(textAtom, textAtom2, textAtom3, largeButton, (i11 & 16) != 0 ? K.f71697a : list);
    }
}
