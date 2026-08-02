package ru.ozon.app.android.travel.feature.general.order.widgets.travelModalPriceDetailInformation.v3.data;

import B90.C2618u;
import Co.a;
import J.d;
import com.squareup.moshi.j;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.core.widgets.commentsListV3.data.CommentV3DTO;
import ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.data.ReviewGalleryV2DTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@j(generateAdapter = true)
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0081\b\u0018\u00002\u00020\u0001:\u0003\u0017\u0018\u0019B\u001f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J%\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/travel/feature/general/order/widgets/travelModalPriceDetailInformation/v3/data/TravelModalPriceDetailInformationV3DTO;", "", CommentV3DTO.HEADER_FIELD_NAME, "Lru/ozon/uni/atoms/data/texts/TextAtom;", "priceSections", "", "Lru/ozon/app/android/travel/feature/general/order/widgets/travelModalPriceDetailInformation/v3/data/TravelModalPriceDetailInformationV3DTO$PriceSection;", "<init>", "(Lru/ozon/uni/atoms/data/texts/TextAtom;Ljava/util/List;)V", "getHeader", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getPriceSections", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "PriceSection", "PriceDetails", "Price", "order_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class TravelModalPriceDetailInformationV3DTO {
    public static final int $stable = 8;
    private final TextAtom header;

    @NotNull
    private final List<PriceSection> priceSections;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u001f\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/travel/feature/general/order/widgets/travelModalPriceDetailInformation/v3/data/TravelModalPriceDetailInformationV3DTO$Price;", "", ReviewGalleryV2DTO.ReviewGalleryV2Item.ItemsContainerDTO.PRODUCT_FIELD_NAME, "Lru/ozon/uni/atoms/data/texts/TextAtom;", "price", "<init>", "(Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/texts/TextAtom;)V", "getProduct", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getPrice", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "order_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Price {
        public static final int $stable = TextAtom.$stable;
        private final TextAtom price;

        @NotNull
        private final TextAtom product;

        public Price(@NotNull TextAtom product, TextAtom textAtom) {
            Intrinsics.checkNotNullParameter(product, "product");
            this.product = product;
            this.price = textAtom;
        }

        public static /* synthetic */ Price copy$default(Price price, TextAtom textAtom, TextAtom textAtom2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                textAtom = price.product;
            }
            if ((i11 & 2) != 0) {
                textAtom2 = price.price;
            }
            return price.copy(textAtom, textAtom2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final TextAtom getProduct() {
            return this.product;
        }

        /* renamed from: component2, reason: from getter */
        public final TextAtom getPrice() {
            return this.price;
        }

        @NotNull
        public final Price copy(@NotNull TextAtom product, TextAtom price) {
            Intrinsics.checkNotNullParameter(product, "product");
            return new Price(product, price);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Price)) {
                return false;
            }
            Price price = (Price) other;
            return Intrinsics.d(this.product, price.product) && Intrinsics.d(this.price, price.price);
        }

        public final TextAtom getPrice() {
            return this.price;
        }

        @NotNull
        public final TextAtom getProduct() {
            return this.product;
        }

        public int hashCode() {
            int hashCode = this.product.hashCode() * 31;
            TextAtom textAtom = this.price;
            return hashCode + (textAtom == null ? 0 : textAtom.hashCode());
        }

        @NotNull
        public String toString() {
            return a.a("Price(product=", this.product, ", price=", this.price, ")");
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0003J1\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0019\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/travel/feature/general/order/widgets/travelModalPriceDetailInformation/v3/data/TravelModalPriceDetailInformationV3DTO$PriceDetails;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/texts/TextAtom;", "totalPrice", "prices", "", "Lru/ozon/app/android/travel/feature/general/order/widgets/travelModalPriceDetailInformation/v3/data/TravelModalPriceDetailInformationV3DTO$Price;", "<init>", "(Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/texts/TextAtom;Ljava/util/List;)V", "getTitle", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getTotalPrice", "getPrices", "()Ljava/util/List;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "order_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class PriceDetails {
        public static final int $stable = 8;
        private final List<Price> prices;

        @NotNull
        private final TextAtom title;
        private final TextAtom totalPrice;

        public PriceDetails(@NotNull TextAtom title, TextAtom textAtom, List<Price> list) {
            Intrinsics.checkNotNullParameter(title, "title");
            this.title = title;
            this.totalPrice = textAtom;
            this.prices = list;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ PriceDetails copy$default(PriceDetails priceDetails, TextAtom textAtom, TextAtom textAtom2, List list, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                textAtom = priceDetails.title;
            }
            if ((i11 & 2) != 0) {
                textAtom2 = priceDetails.totalPrice;
            }
            if ((i11 & 4) != 0) {
                list = priceDetails.prices;
            }
            return priceDetails.copy(textAtom, textAtom2, list);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final TextAtom getTitle() {
            return this.title;
        }

        /* renamed from: component2, reason: from getter */
        public final TextAtom getTotalPrice() {
            return this.totalPrice;
        }

        public final List<Price> component3() {
            return this.prices;
        }

        @NotNull
        public final PriceDetails copy(@NotNull TextAtom title, TextAtom totalPrice, List<Price> prices) {
            Intrinsics.checkNotNullParameter(title, "title");
            return new PriceDetails(title, totalPrice, prices);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PriceDetails)) {
                return false;
            }
            PriceDetails priceDetails = (PriceDetails) other;
            return Intrinsics.d(this.title, priceDetails.title) && Intrinsics.d(this.totalPrice, priceDetails.totalPrice) && Intrinsics.d(this.prices, priceDetails.prices);
        }

        public final List<Price> getPrices() {
            return this.prices;
        }

        @NotNull
        public final TextAtom getTitle() {
            return this.title;
        }

        public final TextAtom getTotalPrice() {
            return this.totalPrice;
        }

        public int hashCode() {
            int hashCode = this.title.hashCode() * 31;
            TextAtom textAtom = this.totalPrice;
            int hashCode2 = (hashCode + (textAtom == null ? 0 : textAtom.hashCode())) * 31;
            List<Price> list = this.prices;
            return hashCode2 + (list != null ? list.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            TextAtom textAtom = this.title;
            TextAtom textAtom2 = this.totalPrice;
            return C2618u.h(HY.a.a("PriceDetails(title=", textAtom, ", totalPrice=", textAtom2, ", prices="), this.prices, ")");
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0003J?\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0019\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/travel/feature/general/order/widgets/travelModalPriceDetailInformation/v3/data/TravelModalPriceDetailInformationV3DTO$PriceSection;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/texts/TextAtom;", "subtitle", "totalPrice", "priceDetails", "", "Lru/ozon/app/android/travel/feature/general/order/widgets/travelModalPriceDetailInformation/v3/data/TravelModalPriceDetailInformationV3DTO$PriceDetails;", "<init>", "(Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/texts/TextAtom;Ljava/util/List;)V", "getTitle", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getSubtitle", "getTotalPrice", "getPriceDetails", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "", "order_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class PriceSection {
        public static final int $stable = 8;
        private final List<PriceDetails> priceDetails;
        private final TextAtom subtitle;
        private final TextAtom title;
        private final TextAtom totalPrice;

        public PriceSection(TextAtom textAtom, TextAtom textAtom2, TextAtom textAtom3, List<PriceDetails> list) {
            this.title = textAtom;
            this.subtitle = textAtom2;
            this.totalPrice = textAtom3;
            this.priceDetails = list;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ PriceSection copy$default(PriceSection priceSection, TextAtom textAtom, TextAtom textAtom2, TextAtom textAtom3, List list, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                textAtom = priceSection.title;
            }
            if ((i11 & 2) != 0) {
                textAtom2 = priceSection.subtitle;
            }
            if ((i11 & 4) != 0) {
                textAtom3 = priceSection.totalPrice;
            }
            if ((i11 & 8) != 0) {
                list = priceSection.priceDetails;
            }
            return priceSection.copy(textAtom, textAtom2, textAtom3, list);
        }

        /* renamed from: component1, reason: from getter */
        public final TextAtom getTitle() {
            return this.title;
        }

        /* renamed from: component2, reason: from getter */
        public final TextAtom getSubtitle() {
            return this.subtitle;
        }

        /* renamed from: component3, reason: from getter */
        public final TextAtom getTotalPrice() {
            return this.totalPrice;
        }

        public final List<PriceDetails> component4() {
            return this.priceDetails;
        }

        @NotNull
        public final PriceSection copy(TextAtom title, TextAtom subtitle, TextAtom totalPrice, List<PriceDetails> priceDetails) {
            return new PriceSection(title, subtitle, totalPrice, priceDetails);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PriceSection)) {
                return false;
            }
            PriceSection priceSection = (PriceSection) other;
            return Intrinsics.d(this.title, priceSection.title) && Intrinsics.d(this.subtitle, priceSection.subtitle) && Intrinsics.d(this.totalPrice, priceSection.totalPrice) && Intrinsics.d(this.priceDetails, priceSection.priceDetails);
        }

        public final List<PriceDetails> getPriceDetails() {
            return this.priceDetails;
        }

        public final TextAtom getSubtitle() {
            return this.subtitle;
        }

        public final TextAtom getTitle() {
            return this.title;
        }

        public final TextAtom getTotalPrice() {
            return this.totalPrice;
        }

        public int hashCode() {
            TextAtom textAtom = this.title;
            int hashCode = (textAtom == null ? 0 : textAtom.hashCode()) * 31;
            TextAtom textAtom2 = this.subtitle;
            int hashCode2 = (hashCode + (textAtom2 == null ? 0 : textAtom2.hashCode())) * 31;
            TextAtom textAtom3 = this.totalPrice;
            int hashCode3 = (hashCode2 + (textAtom3 == null ? 0 : textAtom3.hashCode())) * 31;
            List<PriceDetails> list = this.priceDetails;
            return hashCode3 + (list != null ? list.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            TextAtom textAtom = this.title;
            TextAtom textAtom2 = this.subtitle;
            TextAtom textAtom3 = this.totalPrice;
            List<PriceDetails> list = this.priceDetails;
            StringBuilder a11 = HY.a.a("PriceSection(title=", textAtom, ", subtitle=", textAtom2, ", totalPrice=");
            a11.append(textAtom3);
            a11.append(", priceDetails=");
            a11.append(list);
            a11.append(")");
            return a11.toString();
        }
    }

    public TravelModalPriceDetailInformationV3DTO(TextAtom textAtom, @NotNull List<PriceSection> priceSections) {
        Intrinsics.checkNotNullParameter(priceSections, "priceSections");
        this.header = textAtom;
        this.priceSections = priceSections;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TravelModalPriceDetailInformationV3DTO copy$default(TravelModalPriceDetailInformationV3DTO travelModalPriceDetailInformationV3DTO, TextAtom textAtom, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            textAtom = travelModalPriceDetailInformationV3DTO.header;
        }
        if ((i11 & 2) != 0) {
            list = travelModalPriceDetailInformationV3DTO.priceSections;
        }
        return travelModalPriceDetailInformationV3DTO.copy(textAtom, list);
    }

    /* renamed from: component1, reason: from getter */
    public final TextAtom getHeader() {
        return this.header;
    }

    @NotNull
    public final List<PriceSection> component2() {
        return this.priceSections;
    }

    @NotNull
    public final TravelModalPriceDetailInformationV3DTO copy(TextAtom header, @NotNull List<PriceSection> priceSections) {
        Intrinsics.checkNotNullParameter(priceSections, "priceSections");
        return new TravelModalPriceDetailInformationV3DTO(header, priceSections);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TravelModalPriceDetailInformationV3DTO)) {
            return false;
        }
        TravelModalPriceDetailInformationV3DTO travelModalPriceDetailInformationV3DTO = (TravelModalPriceDetailInformationV3DTO) other;
        return Intrinsics.d(this.header, travelModalPriceDetailInformationV3DTO.header) && Intrinsics.d(this.priceSections, travelModalPriceDetailInformationV3DTO.priceSections);
    }

    public final TextAtom getHeader() {
        return this.header;
    }

    @NotNull
    public final List<PriceSection> getPriceSections() {
        return this.priceSections;
    }

    public int hashCode() {
        TextAtom textAtom = this.header;
        return this.priceSections.hashCode() + ((textAtom == null ? 0 : textAtom.hashCode()) * 31);
    }

    @NotNull
    public String toString() {
        return d.c("TravelModalPriceDetailInformationV3DTO(header=", this.header, ", priceSections=", this.priceSections, ")");
    }
}
