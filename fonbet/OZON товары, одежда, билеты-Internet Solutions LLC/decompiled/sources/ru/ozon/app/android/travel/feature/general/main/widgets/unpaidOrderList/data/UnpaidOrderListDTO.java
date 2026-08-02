package ru.ozon.app.android.travel.feature.general.main.widgets.unpaidOrderList.data;

import D40.d;
import E0.C2942q;
import G.g;
import Ih.a;
import Ns.b;
import Pk0.c;
import com.google.android.gms.analytics.ecommerce.ProductAction;
import com.squareup.moshi.j;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.price.PriceDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001:\u0001\u0012B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\n\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/travel/feature/general/main/widgets/unpaidOrderList/data/UnpaidOrderListDTO;", "", "orderList", "", "Lru/ozon/app/android/travel/feature/general/main/widgets/unpaidOrderList/data/UnpaidOrderListDTO$OrderDTO;", "<init>", "(Ljava/util/List;)V", "getOrderList", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "OrderDTO", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class UnpaidOrderListDTO {
    public static final int $stable = 8;

    @NotNull
    private final List<OrderDTO> orderList;

    @Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b#\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001@B\u008d\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0014\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0012\u0012\u0014\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0012\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b\u0018\u0010\u0019J\t\u0010-\u001a\u00020\u0003HÆ\u0003J\t\u0010.\u001a\u00020\u0005HÆ\u0003J\t\u0010/\u001a\u00020\u0005HÆ\u0003J\t\u00100\u001a\u00020\bHÆ\u0003J\t\u00101\u001a\u00020\bHÆ\u0003J\t\u00102\u001a\u00020\bHÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u00104\u001a\b\u0012\u0004\u0012\u00020\u000e0\rHÆ\u0003J\t\u00105\u001a\u00020\u0010HÆ\u0003J\u0017\u00106\u001a\u0010\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0012HÆ\u0003J\u0017\u00107\u001a\u0010\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0012HÆ\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\u0017HÆ\u0003J§\u0001\u00109\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\u0016\b\u0002\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00122\u0016\b\u0002\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00122\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÆ\u0001J\u0013\u0010:\u001a\u00020;2\b\u0010<\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010=\u001a\u00020>HÖ\u0001J\t\u0010?\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001dR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0011\u0010\t\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b!\u0010 R\u0011\u0010\n\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010 R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001bR\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u001f\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0012¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u001f\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0012¢\u0006\b\n\u0000\u001a\u0004\b*\u0010)R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u0017¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,¨\u0006A"}, d2 = {"Lru/ozon/app/android/travel/feature/general/main/widgets/unpaidOrderList/data/UnpaidOrderListDTO$OrderDTO;", "", "badge", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "timeToPay", "", "remainingDisplayTimerValue", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/text/TextDTO;", "dates", ProductAction.ACTION_DETAIL, "priceBadge", "routeIcons", "", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "clickAction", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "viewTracking", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "clickTracking", "priceBlock", "Lru/ozon/app/android/travel/feature/general/main/widgets/unpaidOrderList/data/UnpaidOrderListDTO$OrderDTO$PriceBlock;", "<init>", "(Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;JJLru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;Ljava/util/List;Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/util/Map;Ljava/util/Map;Lru/ozon/app/android/travel/feature/general/main/widgets/unpaidOrderList/data/UnpaidOrderListDTO$OrderDTO$PriceBlock;)V", "getBadge", "()Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "getTimeToPay", "()J", "getRemainingDisplayTimerValue", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getDates", "getDetail", "getPriceBadge", "getRouteIcons", "()Ljava/util/List;", "getClickAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getViewTracking", "()Ljava/util/Map;", "getClickTracking", "getPriceBlock", "()Lru/ozon/app/android/travel/feature/general/main/widgets/unpaidOrderList/data/UnpaidOrderListDTO$OrderDTO$PriceBlock;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "copy", "equals", "", "other", "hashCode", "", "toString", "PriceBlock", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @j(generateAdapter = true)
    public static final /* data */ class OrderDTO {
        public static final int $stable = 8;

        @NotNull
        private final BadgeDTO badge;

        @NotNull
        private final AtomActionDTO clickAction;
        private final Map<String, TokenizedTrackingInfo> clickTracking;

        @NotNull
        private final TextDTO dates;

        @NotNull
        private final TextDTO detail;
        private final BadgeDTO priceBadge;
        private final PriceBlock priceBlock;
        private final long remainingDisplayTimerValue;

        @NotNull
        private final List<IconDTO> routeIcons;
        private final long timeToPay;

        @NotNull
        private final TextDTO title;
        private final Map<String, TokenizedTrackingInfo> viewTracking;

        @j(generateAdapter = true)
        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u001f\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/travel/feature/general/main/widgets/unpaidOrderList/data/UnpaidOrderListDTO$OrderDTO$PriceBlock;", "", "firstPrice", "Lru/ozon/uni/atoms/data/price/PriceDTO;", "secondPrice", "<init>", "(Lru/ozon/uni/atoms/data/price/PriceDTO;Lru/ozon/uni/atoms/data/price/PriceDTO;)V", "getFirstPrice", "()Lru/ozon/uni/atoms/data/price/PriceDTO;", "getSecondPrice", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class PriceBlock {
            public static final int $stable = PriceDTO.$stable;

            @NotNull
            private final PriceDTO firstPrice;
            private final PriceDTO secondPrice;

            public PriceBlock(@NotNull PriceDTO firstPrice, PriceDTO priceDTO) {
                Intrinsics.checkNotNullParameter(firstPrice, "firstPrice");
                this.firstPrice = firstPrice;
                this.secondPrice = priceDTO;
            }

            public static /* synthetic */ PriceBlock copy$default(PriceBlock priceBlock, PriceDTO priceDTO, PriceDTO priceDTO2, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    priceDTO = priceBlock.firstPrice;
                }
                if ((i11 & 2) != 0) {
                    priceDTO2 = priceBlock.secondPrice;
                }
                return priceBlock.copy(priceDTO, priceDTO2);
            }

            @NotNull
            /* renamed from: component1, reason: from getter */
            public final PriceDTO getFirstPrice() {
                return this.firstPrice;
            }

            /* renamed from: component2, reason: from getter */
            public final PriceDTO getSecondPrice() {
                return this.secondPrice;
            }

            @NotNull
            public final PriceBlock copy(@NotNull PriceDTO firstPrice, PriceDTO secondPrice) {
                Intrinsics.checkNotNullParameter(firstPrice, "firstPrice");
                return new PriceBlock(firstPrice, secondPrice);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof PriceBlock)) {
                    return false;
                }
                PriceBlock priceBlock = (PriceBlock) other;
                return Intrinsics.d(this.firstPrice, priceBlock.firstPrice) && Intrinsics.d(this.secondPrice, priceBlock.secondPrice);
            }

            @NotNull
            public final PriceDTO getFirstPrice() {
                return this.firstPrice;
            }

            public final PriceDTO getSecondPrice() {
                return this.secondPrice;
            }

            public int hashCode() {
                int hashCode = this.firstPrice.hashCode() * 31;
                PriceDTO priceDTO = this.secondPrice;
                return hashCode + (priceDTO == null ? 0 : priceDTO.hashCode());
            }

            @NotNull
            public String toString() {
                return "PriceBlock(firstPrice=" + this.firstPrice + ", secondPrice=" + this.secondPrice + ")";
            }
        }

        public OrderDTO(@NotNull BadgeDTO badge, long j11, long j12, @NotNull TextDTO title, @NotNull TextDTO dates, @NotNull TextDTO detail, BadgeDTO badgeDTO, @NotNull List<IconDTO> routeIcons, @NotNull AtomActionDTO clickAction, Map<String, TokenizedTrackingInfo> map, Map<String, TokenizedTrackingInfo> map2, PriceBlock priceBlock) {
            Intrinsics.checkNotNullParameter(badge, "badge");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(dates, "dates");
            Intrinsics.checkNotNullParameter(detail, "detail");
            Intrinsics.checkNotNullParameter(routeIcons, "routeIcons");
            Intrinsics.checkNotNullParameter(clickAction, "clickAction");
            this.badge = badge;
            this.timeToPay = j11;
            this.remainingDisplayTimerValue = j12;
            this.title = title;
            this.dates = dates;
            this.detail = detail;
            this.priceBadge = badgeDTO;
            this.routeIcons = routeIcons;
            this.clickAction = clickAction;
            this.viewTracking = map;
            this.clickTracking = map2;
            this.priceBlock = priceBlock;
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final BadgeDTO getBadge() {
            return this.badge;
        }

        public final Map<String, TokenizedTrackingInfo> component10() {
            return this.viewTracking;
        }

        public final Map<String, TokenizedTrackingInfo> component11() {
            return this.clickTracking;
        }

        /* renamed from: component12, reason: from getter */
        public final PriceBlock getPriceBlock() {
            return this.priceBlock;
        }

        /* renamed from: component2, reason: from getter */
        public final long getTimeToPay() {
            return this.timeToPay;
        }

        /* renamed from: component3, reason: from getter */
        public final long getRemainingDisplayTimerValue() {
            return this.remainingDisplayTimerValue;
        }

        @NotNull
        /* renamed from: component4, reason: from getter */
        public final TextDTO getTitle() {
            return this.title;
        }

        @NotNull
        /* renamed from: component5, reason: from getter */
        public final TextDTO getDates() {
            return this.dates;
        }

        @NotNull
        /* renamed from: component6, reason: from getter */
        public final TextDTO getDetail() {
            return this.detail;
        }

        /* renamed from: component7, reason: from getter */
        public final BadgeDTO getPriceBadge() {
            return this.priceBadge;
        }

        @NotNull
        public final List<IconDTO> component8() {
            return this.routeIcons;
        }

        @NotNull
        /* renamed from: component9, reason: from getter */
        public final AtomActionDTO getClickAction() {
            return this.clickAction;
        }

        @NotNull
        public final OrderDTO copy(@NotNull BadgeDTO badge, long timeToPay, long remainingDisplayTimerValue, @NotNull TextDTO title, @NotNull TextDTO dates, @NotNull TextDTO detail, BadgeDTO priceBadge, @NotNull List<IconDTO> routeIcons, @NotNull AtomActionDTO clickAction, Map<String, TokenizedTrackingInfo> viewTracking, Map<String, TokenizedTrackingInfo> clickTracking, PriceBlock priceBlock) {
            Intrinsics.checkNotNullParameter(badge, "badge");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(dates, "dates");
            Intrinsics.checkNotNullParameter(detail, "detail");
            Intrinsics.checkNotNullParameter(routeIcons, "routeIcons");
            Intrinsics.checkNotNullParameter(clickAction, "clickAction");
            return new OrderDTO(badge, timeToPay, remainingDisplayTimerValue, title, dates, detail, priceBadge, routeIcons, clickAction, viewTracking, clickTracking, priceBlock);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof OrderDTO)) {
                return false;
            }
            OrderDTO orderDTO = (OrderDTO) other;
            return Intrinsics.d(this.badge, orderDTO.badge) && this.timeToPay == orderDTO.timeToPay && this.remainingDisplayTimerValue == orderDTO.remainingDisplayTimerValue && Intrinsics.d(this.title, orderDTO.title) && Intrinsics.d(this.dates, orderDTO.dates) && Intrinsics.d(this.detail, orderDTO.detail) && Intrinsics.d(this.priceBadge, orderDTO.priceBadge) && Intrinsics.d(this.routeIcons, orderDTO.routeIcons) && Intrinsics.d(this.clickAction, orderDTO.clickAction) && Intrinsics.d(this.viewTracking, orderDTO.viewTracking) && Intrinsics.d(this.clickTracking, orderDTO.clickTracking) && Intrinsics.d(this.priceBlock, orderDTO.priceBlock);
        }

        @NotNull
        public final BadgeDTO getBadge() {
            return this.badge;
        }

        @NotNull
        public final AtomActionDTO getClickAction() {
            return this.clickAction;
        }

        public final Map<String, TokenizedTrackingInfo> getClickTracking() {
            return this.clickTracking;
        }

        @NotNull
        public final TextDTO getDates() {
            return this.dates;
        }

        @NotNull
        public final TextDTO getDetail() {
            return this.detail;
        }

        public final BadgeDTO getPriceBadge() {
            return this.priceBadge;
        }

        public final PriceBlock getPriceBlock() {
            return this.priceBlock;
        }

        public final long getRemainingDisplayTimerValue() {
            return this.remainingDisplayTimerValue;
        }

        @NotNull
        public final List<IconDTO> getRouteIcons() {
            return this.routeIcons;
        }

        public final long getTimeToPay() {
            return this.timeToPay;
        }

        @NotNull
        public final TextDTO getTitle() {
            return this.title;
        }

        public final Map<String, TokenizedTrackingInfo> getViewTracking() {
            return this.viewTracking;
        }

        public int hashCode() {
            int a11 = b.a(this.detail, b.a(this.dates, b.a(this.title, c.a(c.a(this.badge.hashCode() * 31, 31, this.timeToPay), 31, this.remainingDisplayTimerValue), 31), 31), 31);
            BadgeDTO badgeDTO = this.priceBadge;
            int b11 = a.b(this.clickAction, g.b((a11 + (badgeDTO == null ? 0 : badgeDTO.hashCode())) * 31, 31, this.routeIcons), 31);
            Map<String, TokenizedTrackingInfo> map = this.viewTracking;
            int hashCode = (b11 + (map == null ? 0 : map.hashCode())) * 31;
            Map<String, TokenizedTrackingInfo> map2 = this.clickTracking;
            int hashCode2 = (hashCode + (map2 == null ? 0 : map2.hashCode())) * 31;
            PriceBlock priceBlock = this.priceBlock;
            return hashCode2 + (priceBlock != null ? priceBlock.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            BadgeDTO badgeDTO = this.badge;
            long j11 = this.timeToPay;
            long j12 = this.remainingDisplayTimerValue;
            TextDTO textDTO = this.title;
            TextDTO textDTO2 = this.dates;
            TextDTO textDTO3 = this.detail;
            BadgeDTO badgeDTO2 = this.priceBadge;
            List<IconDTO> list = this.routeIcons;
            AtomActionDTO atomActionDTO = this.clickAction;
            Map<String, TokenizedTrackingInfo> map = this.viewTracking;
            Map<String, TokenizedTrackingInfo> map2 = this.clickTracking;
            PriceBlock priceBlock = this.priceBlock;
            StringBuilder sb2 = new StringBuilder("OrderDTO(badge=");
            sb2.append(badgeDTO);
            sb2.append(", timeToPay=");
            sb2.append(j11);
            C2942q.f(sb2, ", remainingDisplayTimerValue=", j12, ", title=");
            d.e(", dates=", ", detail=", sb2, textDTO, textDTO2);
            sb2.append(textDTO3);
            sb2.append(", priceBadge=");
            sb2.append(badgeDTO2);
            sb2.append(", routeIcons=");
            sb2.append(list);
            sb2.append(", clickAction=");
            sb2.append(atomActionDTO);
            sb2.append(", viewTracking=");
            Tl.b.g(sb2, map, ", clickTracking=", map2, ", priceBlock=");
            sb2.append(priceBlock);
            sb2.append(")");
            return sb2.toString();
        }
    }

    public UnpaidOrderListDTO(@NotNull List<OrderDTO> orderList) {
        Intrinsics.checkNotNullParameter(orderList, "orderList");
        this.orderList = orderList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ UnpaidOrderListDTO copy$default(UnpaidOrderListDTO unpaidOrderListDTO, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = unpaidOrderListDTO.orderList;
        }
        return unpaidOrderListDTO.copy(list);
    }

    @NotNull
    public final List<OrderDTO> component1() {
        return this.orderList;
    }

    @NotNull
    public final UnpaidOrderListDTO copy(@NotNull List<OrderDTO> orderList) {
        Intrinsics.checkNotNullParameter(orderList, "orderList");
        return new UnpaidOrderListDTO(orderList);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof UnpaidOrderListDTO) && Intrinsics.d(this.orderList, ((UnpaidOrderListDTO) other).orderList);
    }

    @NotNull
    public final List<OrderDTO> getOrderList() {
        return this.orderList;
    }

    public int hashCode() {
        return this.orderList.hashCode();
    }

    @NotNull
    public String toString() {
        return H3.c.a("UnpaidOrderListDTO(orderList=", ")", this.orderList);
    }
}
