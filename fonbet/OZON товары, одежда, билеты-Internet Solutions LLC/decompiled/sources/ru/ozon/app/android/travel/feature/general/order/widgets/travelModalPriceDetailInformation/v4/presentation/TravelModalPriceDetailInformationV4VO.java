package ru.ozon.app.android.travel.feature.general.order.widgets.travelModalPriceDetailInformation.v4.presentation;

import G.g;
import Ns.b;
import TY.a;
import WZ.t;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.core.widgets.commentsListV3.data.CommentV3DTO;
import ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.data.ReviewGalleryV2DTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.price.PriceDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0014\b\u0081\b\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0005%&'()B1\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010\u001f\u001a\u0004\b \u0010!R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\"\u001a\u0004\b#\u0010$¨\u0006*"}, d2 = {"Lru/ozon/app/android/travel/feature/general/order/widgets/travelModalPriceDetailInformation/v4/presentation/TravelModalPriceDetailInformationV4VO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "Lru/ozon/uni/atoms/data/text/TextDTO;", CommentV3DTO.HEADER_FIELD_NAME, "", "Lru/ozon/app/android/travel/feature/general/order/widgets/travelModalPriceDetailInformation/v4/presentation/TravelModalPriceDetailInformationV4VO$PriceItem;", "priceSections", "LWZ/t;", "viewEvent", "<init>", "(JLru/ozon/uni/atoms/data/text/TextDTO;Ljava/util/List;LWZ/t;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getHeader", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "Ljava/util/List;", "getPriceSections", "()Ljava/util/List;", "LWZ/t;", "getViewEvent", "()LWZ/t;", "PriceItem", "PriceSectionVO", "PriceDetailsVO", "PriceItemVO", "PriceSpacer", "order_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class TravelModalPriceDetailInformationV4VO implements c {
    private final TextDTO header;
    private final long id;

    @NotNull
    private final List<PriceItem> priceSections;
    private final t viewEvent;

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/travel/feature/general/order/widgets/travelModalPriceDetailInformation/v4/presentation/TravelModalPriceDetailInformationV4VO$PriceDetailsVO;", "Lru/ozon/app/android/travel/feature/general/order/widgets/travelModalPriceDetailInformation/v4/presentation/TravelModalPriceDetailInformationV4VO$PriceItem;", "", "id", "Lru/ozon/uni/atoms/data/text/TextDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/price/PriceDTO;", "totalPrice", "<init>", "(JLru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/price/PriceDTO;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "Lru/ozon/uni/atoms/data/price/PriceDTO;", "getTotalPrice", "()Lru/ozon/uni/atoms/data/price/PriceDTO;", "order_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class PriceDetailsVO implements PriceItem {
        public static final int $stable = PriceDTO.$stable;
        private final long id;

        @NotNull
        private final TextDTO title;
        private final PriceDTO totalPrice;

        public PriceDetailsVO(long j11, @NotNull TextDTO title, PriceDTO priceDTO) {
            Intrinsics.checkNotNullParameter(title, "title");
            this.id = j11;
            this.title = title;
            this.totalPrice = priceDTO;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PriceDetailsVO)) {
                return false;
            }
            PriceDetailsVO priceDetailsVO = (PriceDetailsVO) other;
            return this.id == priceDetailsVO.id && Intrinsics.d(this.title, priceDetailsVO.title) && Intrinsics.d(this.totalPrice, priceDetailsVO.totalPrice);
        }

        @Override // ru.ozon.app.android.travel.feature.general.order.widgets.travelModalPriceDetailInformation.v4.presentation.TravelModalPriceDetailInformationV4VO.PriceItem
        public long getId() {
            return this.id;
        }

        @NotNull
        public final TextDTO getTitle() {
            return this.title;
        }

        public final PriceDTO getTotalPrice() {
            return this.totalPrice;
        }

        public int hashCode() {
            int a11 = b.a(this.title, Long.hashCode(this.id) * 31, 31);
            PriceDTO priceDTO = this.totalPrice;
            return a11 + (priceDTO == null ? 0 : priceDTO.hashCode());
        }

        @NotNull
        public String toString() {
            long j11 = this.id;
            TextDTO textDTO = this.title;
            PriceDTO priceDTO = this.totalPrice;
            StringBuilder b11 = a.b("PriceDetailsVO(id=", j11, ", title=", textDTO);
            b11.append(", totalPrice=");
            b11.append(priceDTO);
            b11.append(")");
            return b11.toString();
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lru/ozon/app/android/travel/feature/general/order/widgets/travelModalPriceDetailInformation/v4/presentation/TravelModalPriceDetailInformationV4VO$PriceItem;", "", "id", "", "getId", "()J", "Lru/ozon/app/android/travel/feature/general/order/widgets/travelModalPriceDetailInformation/v4/presentation/TravelModalPriceDetailInformationV4VO$PriceDetailsVO;", "Lru/ozon/app/android/travel/feature/general/order/widgets/travelModalPriceDetailInformation/v4/presentation/TravelModalPriceDetailInformationV4VO$PriceItemVO;", "Lru/ozon/app/android/travel/feature/general/order/widgets/travelModalPriceDetailInformation/v4/presentation/TravelModalPriceDetailInformationV4VO$PriceSectionVO;", "Lru/ozon/app/android/travel/feature/general/order/widgets/travelModalPriceDetailInformation/v4/presentation/TravelModalPriceDetailInformationV4VO$PriceSpacer;", "order_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface PriceItem {
        long getId();
    }

    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010 \u001a\u0004\b!\u0010\"¨\u0006#"}, d2 = {"Lru/ozon/app/android/travel/feature/general/order/widgets/travelModalPriceDetailInformation/v4/presentation/TravelModalPriceDetailInformationV4VO$PriceItemVO;", "Lru/ozon/app/android/travel/feature/general/order/widgets/travelModalPriceDetailInformation/v4/presentation/TravelModalPriceDetailInformationV4VO$PriceItem;", "", "id", "Lru/ozon/uni/atoms/data/text/TextDTO;", ReviewGalleryV2DTO.ReviewGalleryV2Item.ItemsContainerDTO.PRODUCT_FIELD_NAME, "Lru/ozon/uni/atoms/data/price/PriceDTO;", "price", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "badge", "<init>", "(JLru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/price/PriceDTO;Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getProduct", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "Lru/ozon/uni/atoms/data/price/PriceDTO;", "getPrice", "()Lru/ozon/uni/atoms/data/price/PriceDTO;", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "getBadge", "()Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "order_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class PriceItemVO implements PriceItem {
        public static final int $stable = PriceDTO.$stable;
        private final BadgeDTO badge;
        private final long id;
        private final PriceDTO price;

        @NotNull
        private final TextDTO product;

        public PriceItemVO(long j11, @NotNull TextDTO product, PriceDTO priceDTO, BadgeDTO badgeDTO) {
            Intrinsics.checkNotNullParameter(product, "product");
            this.id = j11;
            this.product = product;
            this.price = priceDTO;
            this.badge = badgeDTO;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PriceItemVO)) {
                return false;
            }
            PriceItemVO priceItemVO = (PriceItemVO) other;
            return this.id == priceItemVO.id && Intrinsics.d(this.product, priceItemVO.product) && Intrinsics.d(this.price, priceItemVO.price) && Intrinsics.d(this.badge, priceItemVO.badge);
        }

        public final BadgeDTO getBadge() {
            return this.badge;
        }

        @Override // ru.ozon.app.android.travel.feature.general.order.widgets.travelModalPriceDetailInformation.v4.presentation.TravelModalPriceDetailInformationV4VO.PriceItem
        public long getId() {
            return this.id;
        }

        public final PriceDTO getPrice() {
            return this.price;
        }

        @NotNull
        public final TextDTO getProduct() {
            return this.product;
        }

        public int hashCode() {
            int a11 = b.a(this.product, Long.hashCode(this.id) * 31, 31);
            PriceDTO priceDTO = this.price;
            int hashCode = (a11 + (priceDTO == null ? 0 : priceDTO.hashCode())) * 31;
            BadgeDTO badgeDTO = this.badge;
            return hashCode + (badgeDTO != null ? badgeDTO.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            long j11 = this.id;
            TextDTO textDTO = this.product;
            PriceDTO priceDTO = this.price;
            BadgeDTO badgeDTO = this.badge;
            StringBuilder b11 = a.b("PriceItemVO(id=", j11, ", product=", textDTO);
            b11.append(", price=");
            b11.append(priceDTO);
            b11.append(", badge=");
            b11.append(badgeDTO);
            b11.append(")");
            return b11.toString();
        }
    }

    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0019\u001a\u0004\b\u001c\u0010\u001bR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Lru/ozon/app/android/travel/feature/general/order/widgets/travelModalPriceDetailInformation/v4/presentation/TravelModalPriceDetailInformationV4VO$PriceSectionVO;", "Lru/ozon/app/android/travel/feature/general/order/widgets/travelModalPriceDetailInformation/v4/presentation/TravelModalPriceDetailInformationV4VO$PriceItem;", "", "id", "Lru/ozon/uni/atoms/data/text/TextDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "subtitle", "Lru/ozon/uni/atoms/data/price/PriceDTO;", "totalPrice", "<init>", "(JLru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/price/PriceDTO;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getSubtitle", "Lru/ozon/uni/atoms/data/price/PriceDTO;", "getTotalPrice", "()Lru/ozon/uni/atoms/data/price/PriceDTO;", "order_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class PriceSectionVO implements PriceItem {
        public static final int $stable = PriceDTO.$stable;
        private final long id;
        private final TextDTO subtitle;
        private final TextDTO title;
        private final PriceDTO totalPrice;

        public PriceSectionVO(long j11, TextDTO textDTO, TextDTO textDTO2, PriceDTO priceDTO) {
            this.id = j11;
            this.title = textDTO;
            this.subtitle = textDTO2;
            this.totalPrice = priceDTO;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PriceSectionVO)) {
                return false;
            }
            PriceSectionVO priceSectionVO = (PriceSectionVO) other;
            return this.id == priceSectionVO.id && Intrinsics.d(this.title, priceSectionVO.title) && Intrinsics.d(this.subtitle, priceSectionVO.subtitle) && Intrinsics.d(this.totalPrice, priceSectionVO.totalPrice);
        }

        @Override // ru.ozon.app.android.travel.feature.general.order.widgets.travelModalPriceDetailInformation.v4.presentation.TravelModalPriceDetailInformationV4VO.PriceItem
        public long getId() {
            return this.id;
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
            int hashCode = Long.hashCode(this.id) * 31;
            TextDTO textDTO = this.title;
            int hashCode2 = (hashCode + (textDTO == null ? 0 : textDTO.hashCode())) * 31;
            TextDTO textDTO2 = this.subtitle;
            int hashCode3 = (hashCode2 + (textDTO2 == null ? 0 : textDTO2.hashCode())) * 31;
            PriceDTO priceDTO = this.totalPrice;
            return hashCode3 + (priceDTO != null ? priceDTO.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            long j11 = this.id;
            TextDTO textDTO = this.title;
            TextDTO textDTO2 = this.subtitle;
            PriceDTO priceDTO = this.totalPrice;
            StringBuilder b11 = a.b("PriceSectionVO(id=", j11, ", title=", textDTO);
            b11.append(", subtitle=");
            b11.append(textDTO2);
            b11.append(", totalPrice=");
            b11.append(priceDTO);
            b11.append(")");
            return b11.toString();
        }
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u001dB!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00062\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/travel/feature/general/order/widgets/travelModalPriceDetailInformation/v4/presentation/TravelModalPriceDetailInformationV4VO$PriceSpacer;", "Lru/ozon/app/android/travel/feature/general/order/widgets/travelModalPriceDetailInformation/v4/presentation/TravelModalPriceDetailInformationV4VO$PriceItem;", "", "id", "Lru/ozon/app/android/travel/feature/general/order/widgets/travelModalPriceDetailInformation/v4/presentation/TravelModalPriceDetailInformationV4VO$PriceSpacer$Size;", "size", "", "hasDivider", "<init>", "(JLru/ozon/app/android/travel/feature/general/order/widgets/travelModalPriceDetailInformation/v4/presentation/TravelModalPriceDetailInformationV4VO$PriceSpacer$Size;Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/app/android/travel/feature/general/order/widgets/travelModalPriceDetailInformation/v4/presentation/TravelModalPriceDetailInformationV4VO$PriceSpacer$Size;", "getSize", "()Lru/ozon/app/android/travel/feature/general/order/widgets/travelModalPriceDetailInformation/v4/presentation/TravelModalPriceDetailInformationV4VO$PriceSpacer$Size;", "Z", "getHasDivider", "()Z", "Size", "order_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class PriceSpacer implements PriceItem {
        private final boolean hasDivider;
        private final long id;

        @NotNull
        private final Size size;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/travel/feature/general/order/widgets/travelModalPriceDetailInformation/v4/presentation/TravelModalPriceDetailInformationV4VO$PriceSpacer$Size;", "", "<init>", "(Ljava/lang/String;I)V", "SMALL", "BIG", "NONE", "order_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Size {
            private static final /* synthetic */ Xc.a $ENTRIES;
            private static final /* synthetic */ Size[] $VALUES;
            public static final Size SMALL = new Size("SMALL", 0);
            public static final Size BIG = new Size("BIG", 1);
            public static final Size NONE = new Size("NONE", 2);

            private static final /* synthetic */ Size[] $values() {
                return new Size[]{SMALL, BIG, NONE};
            }

            static {
                Size[] $values = $values();
                $VALUES = $values;
                $ENTRIES = Xc.b.a($values);
            }

            private Size(String str, int i11) {
            }

            public static Size valueOf(String str) {
                return (Size) Enum.valueOf(Size.class, str);
            }

            public static Size[] values() {
                return (Size[]) $VALUES.clone();
            }
        }

        public PriceSpacer(long j11, @NotNull Size size, boolean z11) {
            Intrinsics.checkNotNullParameter(size, "size");
            this.id = j11;
            this.size = size;
            this.hasDivider = z11;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PriceSpacer)) {
                return false;
            }
            PriceSpacer priceSpacer = (PriceSpacer) other;
            return this.id == priceSpacer.id && this.size == priceSpacer.size && this.hasDivider == priceSpacer.hasDivider;
        }

        public final boolean getHasDivider() {
            return this.hasDivider;
        }

        @Override // ru.ozon.app.android.travel.feature.general.order.widgets.travelModalPriceDetailInformation.v4.presentation.TravelModalPriceDetailInformationV4VO.PriceItem
        public long getId() {
            return this.id;
        }

        @NotNull
        public final Size getSize() {
            return this.size;
        }

        public int hashCode() {
            return Boolean.hashCode(this.hasDivider) + ((this.size.hashCode() + (Long.hashCode(this.id) * 31)) * 31);
        }

        @NotNull
        public String toString() {
            long j11 = this.id;
            Size size = this.size;
            boolean z11 = this.hasDivider;
            StringBuilder sb2 = new StringBuilder("PriceSpacer(id=");
            sb2.append(j11);
            sb2.append(", size=");
            sb2.append(size);
            return Bi.b.f(sb2, ", hasDivider=", z11, ")");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public TravelModalPriceDetailInformationV4VO(long j11, TextDTO textDTO, @NotNull List<? extends PriceItem> priceSections, t tVar) {
        Intrinsics.checkNotNullParameter(priceSections, "priceSections");
        this.id = j11;
        this.header = textDTO;
        this.priceSections = priceSections;
        this.viewEvent = tVar;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TravelModalPriceDetailInformationV4VO)) {
            return false;
        }
        TravelModalPriceDetailInformationV4VO travelModalPriceDetailInformationV4VO = (TravelModalPriceDetailInformationV4VO) other;
        return this.id == travelModalPriceDetailInformationV4VO.id && Intrinsics.d(this.header, travelModalPriceDetailInformationV4VO.header) && Intrinsics.d(this.priceSections, travelModalPriceDetailInformationV4VO.priceSections) && Intrinsics.d(this.viewEvent, travelModalPriceDetailInformationV4VO.viewEvent);
    }

    public final TextDTO getHeader() {
        return this.header;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @NotNull
    public final List<PriceItem> getPriceSections() {
        return this.priceSections;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    public final t getViewEvent() {
        return this.viewEvent;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int hashCode = Long.hashCode(this.id) * 31;
        TextDTO textDTO = this.header;
        int b11 = g.b((hashCode + (textDTO == null ? 0 : textDTO.hashCode())) * 31, 31, this.priceSections);
        t tVar = this.viewEvent;
        return b11 + (tVar != null ? tVar.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        TextDTO textDTO = this.header;
        List<PriceItem> list = this.priceSections;
        t tVar = this.viewEvent;
        StringBuilder b11 = a.b("TravelModalPriceDetailInformationV4VO(id=", j11, ", header=", textDTO);
        Ak.b.h(b11, ", priceSections=", list, ", viewEvent=", tVar);
        b11.append(")");
        return b11.toString();
    }
}
