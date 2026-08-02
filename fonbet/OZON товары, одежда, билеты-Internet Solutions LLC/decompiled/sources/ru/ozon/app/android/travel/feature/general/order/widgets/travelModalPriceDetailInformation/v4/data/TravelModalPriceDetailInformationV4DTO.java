package ru.ozon.app.android.travel.feature.general.order.widgets.travelModalPriceDetailInformation.v4.data;

import AZ.c;
import B90.C2618u;
import D3.g;
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
import ru.ozon.app.android.ugc.core.widgets.commentsListV3.data.CommentV3DTO;
import ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.data.ReviewGalleryV2DTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.price.PriceDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0081\b\u0018\u00002\u00020\u0001:\u0003\u001d\u001e\u001fB7\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\fJ\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u0017\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\bHÆ\u0003J=\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\bHÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\tHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u001f\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006 "}, d2 = {"Lru/ozon/app/android/travel/feature/general/order/widgets/travelModalPriceDetailInformation/v4/data/TravelModalPriceDetailInformationV4DTO;", "", CommentV3DTO.HEADER_FIELD_NAME, "Lru/ozon/uni/atoms/data/text/TextDTO;", "priceSections", "", "Lru/ozon/app/android/travel/feature/general/order/widgets/travelModalPriceDetailInformation/v4/data/TravelModalPriceDetailInformationV4DTO$PriceSectionDTO;", "trackingInfo", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Ljava/util/List;Ljava/util/Map;)V", "getHeader", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getPriceSections", "()Ljava/util/List;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "PriceSectionDTO", "PriceDetailsDTO", "PriceItemDTO", "order_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class TravelModalPriceDetailInformationV4DTO {
    public static final int $stable = 8;
    private final TextDTO header;

    @NotNull
    private final List<PriceSectionDTO> priceSections;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0011\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0003J1\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0019\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/travel/feature/general/order/widgets/travelModalPriceDetailInformation/v4/data/TravelModalPriceDetailInformationV4DTO$PriceDetailsDTO;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/text/TextDTO;", "totalPrice", "Lru/ozon/uni/atoms/data/price/PriceDTO;", "prices", "", "Lru/ozon/app/android/travel/feature/general/order/widgets/travelModalPriceDetailInformation/v4/data/TravelModalPriceDetailInformationV4DTO$PriceItemDTO;", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/price/PriceDTO;Ljava/util/List;)V", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getTotalPrice", "()Lru/ozon/uni/atoms/data/price/PriceDTO;", "getPrices", "()Ljava/util/List;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "order_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class PriceDetailsDTO {
        public static final int $stable = 8;
        private final List<PriceItemDTO> prices;

        @NotNull
        private final TextDTO title;
        private final PriceDTO totalPrice;

        public PriceDetailsDTO(@NotNull TextDTO title, PriceDTO priceDTO, List<PriceItemDTO> list) {
            Intrinsics.checkNotNullParameter(title, "title");
            this.title = title;
            this.totalPrice = priceDTO;
            this.prices = list;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ PriceDetailsDTO copy$default(PriceDetailsDTO priceDetailsDTO, TextDTO textDTO, PriceDTO priceDTO, List list, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                textDTO = priceDetailsDTO.title;
            }
            if ((i11 & 2) != 0) {
                priceDTO = priceDetailsDTO.totalPrice;
            }
            if ((i11 & 4) != 0) {
                list = priceDetailsDTO.prices;
            }
            return priceDetailsDTO.copy(textDTO, priceDTO, list);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final TextDTO getTitle() {
            return this.title;
        }

        /* renamed from: component2, reason: from getter */
        public final PriceDTO getTotalPrice() {
            return this.totalPrice;
        }

        public final List<PriceItemDTO> component3() {
            return this.prices;
        }

        @NotNull
        public final PriceDetailsDTO copy(@NotNull TextDTO title, PriceDTO totalPrice, List<PriceItemDTO> prices) {
            Intrinsics.checkNotNullParameter(title, "title");
            return new PriceDetailsDTO(title, totalPrice, prices);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PriceDetailsDTO)) {
                return false;
            }
            PriceDetailsDTO priceDetailsDTO = (PriceDetailsDTO) other;
            return Intrinsics.d(this.title, priceDetailsDTO.title) && Intrinsics.d(this.totalPrice, priceDetailsDTO.totalPrice) && Intrinsics.d(this.prices, priceDetailsDTO.prices);
        }

        public final List<PriceItemDTO> getPrices() {
            return this.prices;
        }

        @NotNull
        public final TextDTO getTitle() {
            return this.title;
        }

        public final PriceDTO getTotalPrice() {
            return this.totalPrice;
        }

        public int hashCode() {
            int hashCode = this.title.hashCode() * 31;
            PriceDTO priceDTO = this.totalPrice;
            int hashCode2 = (hashCode + (priceDTO == null ? 0 : priceDTO.hashCode())) * 31;
            List<PriceItemDTO> list = this.prices;
            return hashCode2 + (list != null ? list.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            TextDTO textDTO = this.title;
            PriceDTO priceDTO = this.totalPrice;
            List<PriceItemDTO> list = this.prices;
            StringBuilder sb2 = new StringBuilder("PriceDetailsDTO(title=");
            sb2.append(textDTO);
            sb2.append(", totalPrice=");
            sb2.append(priceDTO);
            sb2.append(", prices=");
            return C2618u.h(sb2, list, ")");
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003J+\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/travel/feature/general/order/widgets/travelModalPriceDetailInformation/v4/data/TravelModalPriceDetailInformationV4DTO$PriceItemDTO;", "", ReviewGalleryV2DTO.ReviewGalleryV2Item.ItemsContainerDTO.PRODUCT_FIELD_NAME, "Lru/ozon/uni/atoms/data/text/TextDTO;", "price", "Lru/ozon/uni/atoms/data/price/PriceDTO;", "badge", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/price/PriceDTO;Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;)V", "getProduct", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getPrice", "()Lru/ozon/uni/atoms/data/price/PriceDTO;", "getBadge", "()Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "order_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class PriceItemDTO {
        public static final int $stable = PriceDTO.$stable;
        private final BadgeDTO badge;
        private final PriceDTO price;

        @NotNull
        private final TextDTO product;

        public PriceItemDTO(@NotNull TextDTO product, PriceDTO priceDTO, BadgeDTO badgeDTO) {
            Intrinsics.checkNotNullParameter(product, "product");
            this.product = product;
            this.price = priceDTO;
            this.badge = badgeDTO;
        }

        public static /* synthetic */ PriceItemDTO copy$default(PriceItemDTO priceItemDTO, TextDTO textDTO, PriceDTO priceDTO, BadgeDTO badgeDTO, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                textDTO = priceItemDTO.product;
            }
            if ((i11 & 2) != 0) {
                priceDTO = priceItemDTO.price;
            }
            if ((i11 & 4) != 0) {
                badgeDTO = priceItemDTO.badge;
            }
            return priceItemDTO.copy(textDTO, priceDTO, badgeDTO);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final TextDTO getProduct() {
            return this.product;
        }

        /* renamed from: component2, reason: from getter */
        public final PriceDTO getPrice() {
            return this.price;
        }

        /* renamed from: component3, reason: from getter */
        public final BadgeDTO getBadge() {
            return this.badge;
        }

        @NotNull
        public final PriceItemDTO copy(@NotNull TextDTO product, PriceDTO price, BadgeDTO badge) {
            Intrinsics.checkNotNullParameter(product, "product");
            return new PriceItemDTO(product, price, badge);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PriceItemDTO)) {
                return false;
            }
            PriceItemDTO priceItemDTO = (PriceItemDTO) other;
            return Intrinsics.d(this.product, priceItemDTO.product) && Intrinsics.d(this.price, priceItemDTO.price) && Intrinsics.d(this.badge, priceItemDTO.badge);
        }

        public final BadgeDTO getBadge() {
            return this.badge;
        }

        public final PriceDTO getPrice() {
            return this.price;
        }

        @NotNull
        public final TextDTO getProduct() {
            return this.product;
        }

        public int hashCode() {
            int hashCode = this.product.hashCode() * 31;
            PriceDTO priceDTO = this.price;
            int hashCode2 = (hashCode + (priceDTO == null ? 0 : priceDTO.hashCode())) * 31;
            BadgeDTO badgeDTO = this.badge;
            return hashCode2 + (badgeDTO != null ? badgeDTO.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            TextDTO textDTO = this.product;
            PriceDTO priceDTO = this.price;
            BadgeDTO badgeDTO = this.badge;
            StringBuilder sb2 = new StringBuilder("PriceItemDTO(product=");
            sb2.append(textDTO);
            sb2.append(", price=");
            sb2.append(priceDTO);
            sb2.append(", badge=");
            return c.b(sb2, badgeDTO, ")");
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u0011\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0003J?\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001f"}, d2 = {"Lru/ozon/app/android/travel/feature/general/order/widgets/travelModalPriceDetailInformation/v4/data/TravelModalPriceDetailInformationV4DTO$PriceSectionDTO;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/text/TextDTO;", "subtitle", "totalPrice", "Lru/ozon/uni/atoms/data/price/PriceDTO;", "priceDetails", "", "Lru/ozon/app/android/travel/feature/general/order/widgets/travelModalPriceDetailInformation/v4/data/TravelModalPriceDetailInformationV4DTO$PriceDetailsDTO;", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/price/PriceDTO;Ljava/util/List;)V", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getSubtitle", "getTotalPrice", "()Lru/ozon/uni/atoms/data/price/PriceDTO;", "getPriceDetails", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "", "order_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class PriceSectionDTO {
        public static final int $stable = 8;
        private final List<PriceDetailsDTO> priceDetails;
        private final TextDTO subtitle;
        private final TextDTO title;
        private final PriceDTO totalPrice;

        public PriceSectionDTO(TextDTO textDTO, TextDTO textDTO2, PriceDTO priceDTO, List<PriceDetailsDTO> list) {
            this.title = textDTO;
            this.subtitle = textDTO2;
            this.totalPrice = priceDTO;
            this.priceDetails = list;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ PriceSectionDTO copy$default(PriceSectionDTO priceSectionDTO, TextDTO textDTO, TextDTO textDTO2, PriceDTO priceDTO, List list, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                textDTO = priceSectionDTO.title;
            }
            if ((i11 & 2) != 0) {
                textDTO2 = priceSectionDTO.subtitle;
            }
            if ((i11 & 4) != 0) {
                priceDTO = priceSectionDTO.totalPrice;
            }
            if ((i11 & 8) != 0) {
                list = priceSectionDTO.priceDetails;
            }
            return priceSectionDTO.copy(textDTO, textDTO2, priceDTO, list);
        }

        /* renamed from: component1, reason: from getter */
        public final TextDTO getTitle() {
            return this.title;
        }

        /* renamed from: component2, reason: from getter */
        public final TextDTO getSubtitle() {
            return this.subtitle;
        }

        /* renamed from: component3, reason: from getter */
        public final PriceDTO getTotalPrice() {
            return this.totalPrice;
        }

        public final List<PriceDetailsDTO> component4() {
            return this.priceDetails;
        }

        @NotNull
        public final PriceSectionDTO copy(TextDTO title, TextDTO subtitle, PriceDTO totalPrice, List<PriceDetailsDTO> priceDetails) {
            return new PriceSectionDTO(title, subtitle, totalPrice, priceDetails);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PriceSectionDTO)) {
                return false;
            }
            PriceSectionDTO priceSectionDTO = (PriceSectionDTO) other;
            return Intrinsics.d(this.title, priceSectionDTO.title) && Intrinsics.d(this.subtitle, priceSectionDTO.subtitle) && Intrinsics.d(this.totalPrice, priceSectionDTO.totalPrice) && Intrinsics.d(this.priceDetails, priceSectionDTO.priceDetails);
        }

        public final List<PriceDetailsDTO> getPriceDetails() {
            return this.priceDetails;
        }

        public final TextDTO getSubtitle() {
            return this.subtitle;
        }

        public final TextDTO getTitle() {
            return this.title;
        }

        public final PriceDTO getTotalPrice() {
            return this.totalPrice;
        }

        public int hashCode() {
            TextDTO textDTO = this.title;
            int hashCode = (textDTO == null ? 0 : textDTO.hashCode()) * 31;
            TextDTO textDTO2 = this.subtitle;
            int hashCode2 = (hashCode + (textDTO2 == null ? 0 : textDTO2.hashCode())) * 31;
            PriceDTO priceDTO = this.totalPrice;
            int hashCode3 = (hashCode2 + (priceDTO == null ? 0 : priceDTO.hashCode())) * 31;
            List<PriceDetailsDTO> list = this.priceDetails;
            return hashCode3 + (list != null ? list.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            TextDTO textDTO = this.title;
            TextDTO textDTO2 = this.subtitle;
            PriceDTO priceDTO = this.totalPrice;
            List<PriceDetailsDTO> list = this.priceDetails;
            StringBuilder g10 = g.g("PriceSectionDTO(title=", textDTO, ", subtitle=", textDTO2, ", totalPrice=");
            g10.append(priceDTO);
            g10.append(", priceDetails=");
            g10.append(list);
            g10.append(")");
            return g10.toString();
        }
    }

    public TravelModalPriceDetailInformationV4DTO(TextDTO textDTO, @NotNull List<PriceSectionDTO> priceSections, Map<String, TokenizedTrackingInfo> map) {
        Intrinsics.checkNotNullParameter(priceSections, "priceSections");
        this.header = textDTO;
        this.priceSections = priceSections;
        this.trackingInfo = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TravelModalPriceDetailInformationV4DTO copy$default(TravelModalPriceDetailInformationV4DTO travelModalPriceDetailInformationV4DTO, TextDTO textDTO, List list, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            textDTO = travelModalPriceDetailInformationV4DTO.header;
        }
        if ((i11 & 2) != 0) {
            list = travelModalPriceDetailInformationV4DTO.priceSections;
        }
        if ((i11 & 4) != 0) {
            map = travelModalPriceDetailInformationV4DTO.trackingInfo;
        }
        return travelModalPriceDetailInformationV4DTO.copy(textDTO, list, map);
    }

    /* renamed from: component1, reason: from getter */
    public final TextDTO getHeader() {
        return this.header;
    }

    @NotNull
    public final List<PriceSectionDTO> component2() {
        return this.priceSections;
    }

    public final Map<String, TokenizedTrackingInfo> component3() {
        return this.trackingInfo;
    }

    @NotNull
    public final TravelModalPriceDetailInformationV4DTO copy(TextDTO header, @NotNull List<PriceSectionDTO> priceSections, Map<String, TokenizedTrackingInfo> trackingInfo) {
        Intrinsics.checkNotNullParameter(priceSections, "priceSections");
        return new TravelModalPriceDetailInformationV4DTO(header, priceSections, trackingInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TravelModalPriceDetailInformationV4DTO)) {
            return false;
        }
        TravelModalPriceDetailInformationV4DTO travelModalPriceDetailInformationV4DTO = (TravelModalPriceDetailInformationV4DTO) other;
        return Intrinsics.d(this.header, travelModalPriceDetailInformationV4DTO.header) && Intrinsics.d(this.priceSections, travelModalPriceDetailInformationV4DTO.priceSections) && Intrinsics.d(this.trackingInfo, travelModalPriceDetailInformationV4DTO.trackingInfo);
    }

    public final TextDTO getHeader() {
        return this.header;
    }

    @NotNull
    public final List<PriceSectionDTO> getPriceSections() {
        return this.priceSections;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        TextDTO textDTO = this.header;
        int b11 = G.g.b((textDTO == null ? 0 : textDTO.hashCode()) * 31, 31, this.priceSections);
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        return b11 + (map != null ? map.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        TextDTO textDTO = this.header;
        List<PriceSectionDTO> list = this.priceSections;
        return P.f(G.e("TravelModalPriceDetailInformationV4DTO(header=", textDTO, ", priceSections=", list, ", trackingInfo="), this.trackingInfo, ")");
    }

    public TravelModalPriceDetailInformationV4DTO(TextDTO textDTO, List list, Map map, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(textDTO, (i11 & 2) != 0 ? K.f71697a : list, map);
    }
}
