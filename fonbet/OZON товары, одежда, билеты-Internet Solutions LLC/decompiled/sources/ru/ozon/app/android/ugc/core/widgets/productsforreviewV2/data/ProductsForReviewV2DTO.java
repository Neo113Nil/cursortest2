package ru.ozon.app.android.ugc.core.widgets.productsforreviewV2.data;

import Bl.C2639a;
import D3.g;
import H3.c;
import N3.C3660k;
import Nh.a;
import Ns.b;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.squareup.moshi.j;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.cart.common.dynamicElement.DynamicElementDTO;
import ru.ozon.app.android.pdp.common.ugc.timer.TimerDTO;
import ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.data.ReviewGalleryV2DTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.moshi.adapters.serialize.proto.ProtoOneOf;
import ru.ozon.moshi.adapters.serialize.proto.ProtoOneOfSignature;
import ru.ozon.uni.atoms.data.common.CornerRadius;
import ru.ozon.uni.atoms.data.common.Paddings;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.image.ImageDTO;
import ru.ozon.uni.atoms.data.rating.RatingDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0081\b\u0018\u00002\u00020\u0001:\u0004\u0012\u0013\u0014\u0015B\u0017\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u001b\u0010\n\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/productsforreviewV2/data/ProductsForReviewV2DTO;", "", "items", "", "Lru/ozon/app/android/ugc/core/widgets/productsforreviewV2/data/ProductsForReviewV2DTO$ItemDTO;", "<init>", "(Ljava/util/List;)V", "getItems", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "ItemDTO", "ProductDTO", "Badge", "SwipeAction", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class ProductsForReviewV2DTO {
    public static final int $stable = 8;
    private final List<ItemDTO> items;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/productsforreviewV2/data/ProductsForReviewV2DTO$Badge;", "", "<init>", "()V", "BadgeContentDTO", "TimerContentDTO", "Lru/ozon/app/android/ugc/core/widgets/productsforreviewV2/data/ProductsForReviewV2DTO$Badge$BadgeContentDTO;", "Lru/ozon/app/android/ugc/core/widgets/productsforreviewV2/data/ProductsForReviewV2DTO$Badge$TimerContentDTO;", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class Badge {
        public static final int $stable = 0;

        @j(generateAdapter = true)
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\nJ$\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u000fJ\u0013\u0010\u0010\u001a\u00020\u00052\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\u0004\u0010\n¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/productsforreviewV2/data/ProductsForReviewV2DTO$Badge$BadgeContentDTO;", "Lru/ozon/app/android/ugc/core/widgets/productsforreviewV2/data/ProductsForReviewV2DTO$Badge;", "badge", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "isFullWidth", "", "<init>", "(Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;Ljava/lang/Boolean;)V", "getBadge", "()Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component2", "copy", "(Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;Ljava/lang/Boolean;)Lru/ozon/app/android/ugc/core/widgets/productsforreviewV2/data/ProductsForReviewV2DTO$Badge$BadgeContentDTO;", "equals", "other", "", "hashCode", "", "toString", "", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class BadgeContentDTO extends Badge {
            public static final int $stable = 0;

            @NotNull
            private final BadgeDTO badge;
            private final Boolean isFullWidth;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public BadgeContentDTO(@NotNull BadgeDTO badge, Boolean bool) {
                super(null);
                Intrinsics.checkNotNullParameter(badge, "badge");
                this.badge = badge;
                this.isFullWidth = bool;
            }

            public static /* synthetic */ BadgeContentDTO copy$default(BadgeContentDTO badgeContentDTO, BadgeDTO badgeDTO, Boolean bool, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    badgeDTO = badgeContentDTO.badge;
                }
                if ((i11 & 2) != 0) {
                    bool = badgeContentDTO.isFullWidth;
                }
                return badgeContentDTO.copy(badgeDTO, bool);
            }

            @NotNull
            /* renamed from: component1, reason: from getter */
            public final BadgeDTO getBadge() {
                return this.badge;
            }

            /* renamed from: component2, reason: from getter */
            public final Boolean getIsFullWidth() {
                return this.isFullWidth;
            }

            @NotNull
            public final BadgeContentDTO copy(@NotNull BadgeDTO badge, Boolean isFullWidth) {
                Intrinsics.checkNotNullParameter(badge, "badge");
                return new BadgeContentDTO(badge, isFullWidth);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof BadgeContentDTO)) {
                    return false;
                }
                BadgeContentDTO badgeContentDTO = (BadgeContentDTO) other;
                return Intrinsics.d(this.badge, badgeContentDTO.badge) && Intrinsics.d(this.isFullWidth, badgeContentDTO.isFullWidth);
            }

            @NotNull
            public final BadgeDTO getBadge() {
                return this.badge;
            }

            public int hashCode() {
                int hashCode = this.badge.hashCode() * 31;
                Boolean bool = this.isFullWidth;
                return hashCode + (bool == null ? 0 : bool.hashCode());
            }

            public final Boolean isFullWidth() {
                return this.isFullWidth;
            }

            @NotNull
            public String toString() {
                return "BadgeContentDTO(badge=" + this.badge + ", isFullWidth=" + this.isFullWidth + ")";
            }
        }

        @j(generateAdapter = true)
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\nJ$\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u000fJ\u0013\u0010\u0010\u001a\u00020\u00052\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\u0004\u0010\n¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/productsforreviewV2/data/ProductsForReviewV2DTO$Badge$TimerContentDTO;", "Lru/ozon/app/android/ugc/core/widgets/productsforreviewV2/data/ProductsForReviewV2DTO$Badge;", DynamicElementDTO.TIMER, "Lru/ozon/app/android/pdp/common/ugc/timer/TimerDTO;", "isFullWidth", "", "<init>", "(Lru/ozon/app/android/pdp/common/ugc/timer/TimerDTO;Ljava/lang/Boolean;)V", "getTimer", "()Lru/ozon/app/android/pdp/common/ugc/timer/TimerDTO;", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component2", "copy", "(Lru/ozon/app/android/pdp/common/ugc/timer/TimerDTO;Ljava/lang/Boolean;)Lru/ozon/app/android/ugc/core/widgets/productsforreviewV2/data/ProductsForReviewV2DTO$Badge$TimerContentDTO;", "equals", "other", "", "hashCode", "", "toString", "", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class TimerContentDTO extends Badge {
            public static final int $stable = 8;
            private final Boolean isFullWidth;

            @NotNull
            private final TimerDTO timer;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public TimerContentDTO(@NotNull TimerDTO timer, Boolean bool) {
                super(null);
                Intrinsics.checkNotNullParameter(timer, "timer");
                this.timer = timer;
                this.isFullWidth = bool;
            }

            public static /* synthetic */ TimerContentDTO copy$default(TimerContentDTO timerContentDTO, TimerDTO timerDTO, Boolean bool, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    timerDTO = timerContentDTO.timer;
                }
                if ((i11 & 2) != 0) {
                    bool = timerContentDTO.isFullWidth;
                }
                return timerContentDTO.copy(timerDTO, bool);
            }

            @NotNull
            /* renamed from: component1, reason: from getter */
            public final TimerDTO getTimer() {
                return this.timer;
            }

            /* renamed from: component2, reason: from getter */
            public final Boolean getIsFullWidth() {
                return this.isFullWidth;
            }

            @NotNull
            public final TimerContentDTO copy(@NotNull TimerDTO timer, Boolean isFullWidth) {
                Intrinsics.checkNotNullParameter(timer, "timer");
                return new TimerContentDTO(timer, isFullWidth);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof TimerContentDTO)) {
                    return false;
                }
                TimerContentDTO timerContentDTO = (TimerContentDTO) other;
                return Intrinsics.d(this.timer, timerContentDTO.timer) && Intrinsics.d(this.isFullWidth, timerContentDTO.isFullWidth);
            }

            @NotNull
            public final TimerDTO getTimer() {
                return this.timer;
            }

            public int hashCode() {
                int hashCode = this.timer.hashCode() * 31;
                Boolean bool = this.isFullWidth;
                return hashCode + (bool == null ? 0 : bool.hashCode());
            }

            public final Boolean isFullWidth() {
                return this.isFullWidth;
            }

            @NotNull
            public String toString() {
                return "TimerContentDTO(timer=" + this.timer + ", isFullWidth=" + this.isFullWidth + ")";
            }
        }

        public /* synthetic */ Badge(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Badge() {
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/productsforreviewV2/data/ProductsForReviewV2DTO$ItemDTO;", "", ReviewGalleryV2DTO.ReviewGalleryV2Item.ItemsContainerDTO.PRODUCT_FIELD_NAME, "Lru/ozon/app/android/ugc/core/widgets/productsforreviewV2/data/ProductsForReviewV2DTO$ProductDTO;", "productCommon", "Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "<init>", "(Lru/ozon/app/android/ugc/core/widgets/productsforreviewV2/data/ProductsForReviewV2DTO$ProductDTO;Lru/ozon/uni/atoms/data/controls/CommonControlSettings;)V", "getProduct", "()Lru/ozon/app/android/ugc/core/widgets/productsforreviewV2/data/ProductsForReviewV2DTO$ProductDTO;", "getProductCommon", "()Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ItemDTO {
        public static final int $stable = 8;

        @NotNull
        private final ProductDTO product;
        private final CommonControlSettings productCommon;

        public ItemDTO(@NotNull ProductDTO product, CommonControlSettings commonControlSettings) {
            Intrinsics.checkNotNullParameter(product, "product");
            this.product = product;
            this.productCommon = commonControlSettings;
        }

        public static /* synthetic */ ItemDTO copy$default(ItemDTO itemDTO, ProductDTO productDTO, CommonControlSettings commonControlSettings, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                productDTO = itemDTO.product;
            }
            if ((i11 & 2) != 0) {
                commonControlSettings = itemDTO.productCommon;
            }
            return itemDTO.copy(productDTO, commonControlSettings);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final ProductDTO getProduct() {
            return this.product;
        }

        /* renamed from: component2, reason: from getter */
        public final CommonControlSettings getProductCommon() {
            return this.productCommon;
        }

        @NotNull
        public final ItemDTO copy(@NotNull ProductDTO product, CommonControlSettings productCommon) {
            Intrinsics.checkNotNullParameter(product, "product");
            return new ItemDTO(product, productCommon);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ItemDTO)) {
                return false;
            }
            ItemDTO itemDTO = (ItemDTO) other;
            return Intrinsics.d(this.product, itemDTO.product) && Intrinsics.d(this.productCommon, itemDTO.productCommon);
        }

        @NotNull
        public final ProductDTO getProduct() {
            return this.product;
        }

        public final CommonControlSettings getProductCommon() {
            return this.productCommon;
        }

        public int hashCode() {
            int hashCode = this.product.hashCode() * 31;
            CommonControlSettings commonControlSettings = this.productCommon;
            return hashCode + (commonControlSettings == null ? 0 : commonControlSettings.hashCode());
        }

        @NotNull
        public String toString() {
            return "ItemDTO(product=" + this.product + ", productCommon=" + this.productCommon + ")";
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b#\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0089\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0010\b\u0001\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\u000e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0007\u0012\u0014\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\t\u0010/\u001a\u00020\u0003HÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0011\u00101\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\nHÆ\u0003J\t\u00103\u001a\u00020\fHÆ\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\fHÆ\u0003J\t\u00105\u001a\u00020\u000fHÆ\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\u0011HÆ\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\u0013HÆ\u0003J\u0011\u00108\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0007HÆ\u0003J\u0017\u00109\u001a\u0010\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0017HÆ\u0003J\u009f\u0001\u0010:\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0010\b\u0003\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0010\b\u0002\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u00072\u0016\b\u0002\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0017HÆ\u0001J\u0013\u0010;\u001a\u00020<2\b\u0010=\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010>\u001a\u00020?HÖ\u0001J\t\u0010@\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0019\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0013\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b%\u0010$R\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u0019\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b,\u0010 R\u001f\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0017¢\u0006\b\n\u0000\u001a\u0004\b-\u0010.¨\u0006A"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/productsforreviewV2/data/ProductsForReviewV2DTO$ProductDTO;", "", "id", "", "image", "Lru/ozon/uni/atoms/data/image/ImageDTO;", "badges", "", "Lru/ozon/app/android/ugc/core/widgets/productsforreviewV2/data/ProductsForReviewV2DTO$Badge;", "badgesLeftPadding", "Lru/ozon/uni/atoms/data/common/Paddings;", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/text/TextDTO;", "aspectText", "rating", "Lru/ozon/uni/atoms/data/rating/RatingDTO;", "cornerRadius", "Lru/ozon/uni/atoms/data/common/CornerRadius;", "backgroundColor", "", "swipeActions", "Lru/ozon/app/android/ugc/core/widgets/productsforreviewV2/data/ProductsForReviewV2DTO$SwipeAction;", "swipeTrackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(JLru/ozon/uni/atoms/data/image/ImageDTO;Ljava/util/List;Lru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/rating/RatingDTO;Lru/ozon/uni/atoms/data/common/CornerRadius;Ljava/lang/String;Ljava/util/List;Ljava/util/Map;)V", "getId", "()J", "getImage", "()Lru/ozon/uni/atoms/data/image/ImageDTO;", "getBadges", "()Ljava/util/List;", "getBadgesLeftPadding", "()Lru/ozon/uni/atoms/data/common/Paddings;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getAspectText", "getRating", "()Lru/ozon/uni/atoms/data/rating/RatingDTO;", "getCornerRadius", "()Lru/ozon/uni/atoms/data/common/CornerRadius;", "getBackgroundColor", "()Ljava/lang/String;", "getSwipeActions", "getSwipeTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "copy", "equals", "", "other", "hashCode", "", "toString", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ProductDTO {
        public static final int $stable = 8;
        private final TextDTO aspectText;
        private final String backgroundColor;
        private final List<Badge> badges;
        private final Paddings badgesLeftPadding;
        private final CornerRadius cornerRadius;
        private final long id;
        private final ImageDTO image;

        @NotNull
        private final RatingDTO rating;
        private final List<SwipeAction> swipeActions;
        private final Map<String, TokenizedTrackingInfo> swipeTrackingInfo;

        @NotNull
        private final TextDTO title;

        /* JADX WARN: Multi-variable type inference failed */
        public ProductDTO(long j11, ImageDTO imageDTO, @ProtoOneOfSignature.Container({@ProtoOneOfSignature(fieldName = "badge", name = "BADGE", type = Badge.BadgeContentDTO.class), @ProtoOneOfSignature(fieldName = "timer", name = "TIMER", type = Badge.TimerContentDTO.class)}) @ProtoOneOf(label = "type") List<? extends Badge> list, Paddings paddings, @NotNull TextDTO title, TextDTO textDTO, @NotNull RatingDTO rating, CornerRadius cornerRadius, String str, List<SwipeAction> list2, Map<String, TokenizedTrackingInfo> map) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(rating, "rating");
            this.id = j11;
            this.image = imageDTO;
            this.badges = list;
            this.badgesLeftPadding = paddings;
            this.title = title;
            this.aspectText = textDTO;
            this.rating = rating;
            this.cornerRadius = cornerRadius;
            this.backgroundColor = str;
            this.swipeActions = list2;
            this.swipeTrackingInfo = map;
        }

        public static /* synthetic */ ProductDTO copy$default(ProductDTO productDTO, long j11, ImageDTO imageDTO, List list, Paddings paddings, TextDTO textDTO, TextDTO textDTO2, RatingDTO ratingDTO, CornerRadius cornerRadius, String str, List list2, Map map, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                j11 = productDTO.id;
            }
            return productDTO.copy(j11, (i11 & 2) != 0 ? productDTO.image : imageDTO, (i11 & 4) != 0 ? productDTO.badges : list, (i11 & 8) != 0 ? productDTO.badgesLeftPadding : paddings, (i11 & 16) != 0 ? productDTO.title : textDTO, (i11 & 32) != 0 ? productDTO.aspectText : textDTO2, (i11 & 64) != 0 ? productDTO.rating : ratingDTO, (i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? productDTO.cornerRadius : cornerRadius, (i11 & 256) != 0 ? productDTO.backgroundColor : str, (i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? productDTO.swipeActions : list2, (i11 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? productDTO.swipeTrackingInfo : map);
        }

        /* renamed from: component1, reason: from getter */
        public final long getId() {
            return this.id;
        }

        public final List<SwipeAction> component10() {
            return this.swipeActions;
        }

        public final Map<String, TokenizedTrackingInfo> component11() {
            return this.swipeTrackingInfo;
        }

        /* renamed from: component2, reason: from getter */
        public final ImageDTO getImage() {
            return this.image;
        }

        public final List<Badge> component3() {
            return this.badges;
        }

        /* renamed from: component4, reason: from getter */
        public final Paddings getBadgesLeftPadding() {
            return this.badgesLeftPadding;
        }

        @NotNull
        /* renamed from: component5, reason: from getter */
        public final TextDTO getTitle() {
            return this.title;
        }

        /* renamed from: component6, reason: from getter */
        public final TextDTO getAspectText() {
            return this.aspectText;
        }

        @NotNull
        /* renamed from: component7, reason: from getter */
        public final RatingDTO getRating() {
            return this.rating;
        }

        /* renamed from: component8, reason: from getter */
        public final CornerRadius getCornerRadius() {
            return this.cornerRadius;
        }

        /* renamed from: component9, reason: from getter */
        public final String getBackgroundColor() {
            return this.backgroundColor;
        }

        @NotNull
        public final ProductDTO copy(long id2, ImageDTO image, @ProtoOneOfSignature.Container({@ProtoOneOfSignature(fieldName = "badge", name = "BADGE", type = Badge.BadgeContentDTO.class), @ProtoOneOfSignature(fieldName = "timer", name = "TIMER", type = Badge.TimerContentDTO.class)}) @ProtoOneOf(label = "type") List<? extends Badge> badges, Paddings badgesLeftPadding, @NotNull TextDTO title, TextDTO aspectText, @NotNull RatingDTO rating, CornerRadius cornerRadius, String backgroundColor, List<SwipeAction> swipeActions, Map<String, TokenizedTrackingInfo> swipeTrackingInfo) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(rating, "rating");
            return new ProductDTO(id2, image, badges, badgesLeftPadding, title, aspectText, rating, cornerRadius, backgroundColor, swipeActions, swipeTrackingInfo);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ProductDTO)) {
                return false;
            }
            ProductDTO productDTO = (ProductDTO) other;
            return this.id == productDTO.id && Intrinsics.d(this.image, productDTO.image) && Intrinsics.d(this.badges, productDTO.badges) && this.badgesLeftPadding == productDTO.badgesLeftPadding && Intrinsics.d(this.title, productDTO.title) && Intrinsics.d(this.aspectText, productDTO.aspectText) && Intrinsics.d(this.rating, productDTO.rating) && this.cornerRadius == productDTO.cornerRadius && Intrinsics.d(this.backgroundColor, productDTO.backgroundColor) && Intrinsics.d(this.swipeActions, productDTO.swipeActions) && Intrinsics.d(this.swipeTrackingInfo, productDTO.swipeTrackingInfo);
        }

        public final TextDTO getAspectText() {
            return this.aspectText;
        }

        public final String getBackgroundColor() {
            return this.backgroundColor;
        }

        public final List<Badge> getBadges() {
            return this.badges;
        }

        public final Paddings getBadgesLeftPadding() {
            return this.badgesLeftPadding;
        }

        public final CornerRadius getCornerRadius() {
            return this.cornerRadius;
        }

        public final long getId() {
            return this.id;
        }

        public final ImageDTO getImage() {
            return this.image;
        }

        @NotNull
        public final RatingDTO getRating() {
            return this.rating;
        }

        public final List<SwipeAction> getSwipeActions() {
            return this.swipeActions;
        }

        public final Map<String, TokenizedTrackingInfo> getSwipeTrackingInfo() {
            return this.swipeTrackingInfo;
        }

        @NotNull
        public final TextDTO getTitle() {
            return this.title;
        }

        public int hashCode() {
            int hashCode = Long.hashCode(this.id) * 31;
            ImageDTO imageDTO = this.image;
            int hashCode2 = (hashCode + (imageDTO == null ? 0 : imageDTO.hashCode())) * 31;
            List<Badge> list = this.badges;
            int hashCode3 = (hashCode2 + (list == null ? 0 : list.hashCode())) * 31;
            Paddings paddings = this.badgesLeftPadding;
            int a11 = b.a(this.title, (hashCode3 + (paddings == null ? 0 : paddings.hashCode())) * 31, 31);
            TextDTO textDTO = this.aspectText;
            int hashCode4 = (this.rating.hashCode() + ((a11 + (textDTO == null ? 0 : textDTO.hashCode())) * 31)) * 31;
            CornerRadius cornerRadius = this.cornerRadius;
            int hashCode5 = (hashCode4 + (cornerRadius == null ? 0 : cornerRadius.hashCode())) * 31;
            String str = this.backgroundColor;
            int hashCode6 = (hashCode5 + (str == null ? 0 : str.hashCode())) * 31;
            List<SwipeAction> list2 = this.swipeActions;
            int hashCode7 = (hashCode6 + (list2 == null ? 0 : list2.hashCode())) * 31;
            Map<String, TokenizedTrackingInfo> map = this.swipeTrackingInfo;
            return hashCode7 + (map != null ? map.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            long j11 = this.id;
            ImageDTO imageDTO = this.image;
            List<Badge> list = this.badges;
            Paddings paddings = this.badgesLeftPadding;
            TextDTO textDTO = this.title;
            TextDTO textDTO2 = this.aspectText;
            RatingDTO ratingDTO = this.rating;
            CornerRadius cornerRadius = this.cornerRadius;
            String str = this.backgroundColor;
            List<SwipeAction> list2 = this.swipeActions;
            Map<String, TokenizedTrackingInfo> map = this.swipeTrackingInfo;
            StringBuilder c11 = Nh.b.c("ProductDTO(id=", j11, ", image=", imageDTO);
            c11.append(", badges=");
            c11.append(list);
            c11.append(", badgesLeftPadding=");
            c11.append(paddings);
            g.i(", title=", ", aspectText=", c11, textDTO, textDTO2);
            c11.append(", rating=");
            c11.append(ratingDTO);
            c11.append(", cornerRadius=");
            c11.append(cornerRadius);
            a.g(", backgroundColor=", str, ", swipeActions=", c11, list2);
            return C2639a.b(c11, ", swipeTrackingInfo=", map, ")");
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\tHÆ\u0003JA\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006 "}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/productsforreviewV2/data/ProductsForReviewV2DTO$SwipeAction;", "", "icon", "", "background", "iconTint", "common", "Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/text/TextDTO;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lru/ozon/uni/atoms/data/controls/CommonControlSettings;Lru/ozon/uni/atoms/data/text/TextDTO;)V", "getIcon", "()Ljava/lang/String;", "getBackground", "getIconTint", "getCommon", "()Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class SwipeAction {
        public static final int $stable = 0;
        private final String background;

        @NotNull
        private final CommonControlSettings common;

        @NotNull
        private final String icon;
        private final String iconTint;
        private final TextDTO title;

        public SwipeAction(@NotNull String icon, String str, String str2, @NotNull CommonControlSettings common, TextDTO textDTO) {
            Intrinsics.checkNotNullParameter(icon, "icon");
            Intrinsics.checkNotNullParameter(common, "common");
            this.icon = icon;
            this.background = str;
            this.iconTint = str2;
            this.common = common;
            this.title = textDTO;
        }

        public static /* synthetic */ SwipeAction copy$default(SwipeAction swipeAction, String str, String str2, String str3, CommonControlSettings commonControlSettings, TextDTO textDTO, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = swipeAction.icon;
            }
            if ((i11 & 2) != 0) {
                str2 = swipeAction.background;
            }
            if ((i11 & 4) != 0) {
                str3 = swipeAction.iconTint;
            }
            if ((i11 & 8) != 0) {
                commonControlSettings = swipeAction.common;
            }
            if ((i11 & 16) != 0) {
                textDTO = swipeAction.title;
            }
            TextDTO textDTO2 = textDTO;
            String str4 = str3;
            return swipeAction.copy(str, str2, str4, commonControlSettings, textDTO2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getIcon() {
            return this.icon;
        }

        /* renamed from: component2, reason: from getter */
        public final String getBackground() {
            return this.background;
        }

        /* renamed from: component3, reason: from getter */
        public final String getIconTint() {
            return this.iconTint;
        }

        @NotNull
        /* renamed from: component4, reason: from getter */
        public final CommonControlSettings getCommon() {
            return this.common;
        }

        /* renamed from: component5, reason: from getter */
        public final TextDTO getTitle() {
            return this.title;
        }

        @NotNull
        public final SwipeAction copy(@NotNull String icon, String background, String iconTint, @NotNull CommonControlSettings common, TextDTO title) {
            Intrinsics.checkNotNullParameter(icon, "icon");
            Intrinsics.checkNotNullParameter(common, "common");
            return new SwipeAction(icon, background, iconTint, common, title);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SwipeAction)) {
                return false;
            }
            SwipeAction swipeAction = (SwipeAction) other;
            return Intrinsics.d(this.icon, swipeAction.icon) && Intrinsics.d(this.background, swipeAction.background) && Intrinsics.d(this.iconTint, swipeAction.iconTint) && Intrinsics.d(this.common, swipeAction.common) && Intrinsics.d(this.title, swipeAction.title);
        }

        public final String getBackground() {
            return this.background;
        }

        @NotNull
        public final CommonControlSettings getCommon() {
            return this.common;
        }

        @NotNull
        public final String getIcon() {
            return this.icon;
        }

        public final String getIconTint() {
            return this.iconTint;
        }

        public final TextDTO getTitle() {
            return this.title;
        }

        public int hashCode() {
            int hashCode = this.icon.hashCode() * 31;
            String str = this.background;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.iconTint;
            int a11 = Bi.a.a(this.common, (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31);
            TextDTO textDTO = this.title;
            return a11 + (textDTO != null ? textDTO.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            String str = this.icon;
            String str2 = this.background;
            String str3 = this.iconTint;
            CommonControlSettings commonControlSettings = this.common;
            TextDTO textDTO = this.title;
            StringBuilder d11 = C3660k.d("SwipeAction(icon=", str, ", background=", str2, ", iconTint=");
            d11.append(str3);
            d11.append(", common=");
            d11.append(commonControlSettings);
            d11.append(", title=");
            return Tl.b.e(d11, textDTO, ")");
        }
    }

    public ProductsForReviewV2DTO(List<ItemDTO> list) {
        this.items = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ProductsForReviewV2DTO copy$default(ProductsForReviewV2DTO productsForReviewV2DTO, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = productsForReviewV2DTO.items;
        }
        return productsForReviewV2DTO.copy(list);
    }

    public final List<ItemDTO> component1() {
        return this.items;
    }

    @NotNull
    public final ProductsForReviewV2DTO copy(List<ItemDTO> items) {
        return new ProductsForReviewV2DTO(items);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof ProductsForReviewV2DTO) && Intrinsics.d(this.items, ((ProductsForReviewV2DTO) other).items);
    }

    public final List<ItemDTO> getItems() {
        return this.items;
    }

    public int hashCode() {
        List<ItemDTO> list = this.items;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    @NotNull
    public String toString() {
        return c.a("ProductsForReviewV2DTO(items=", ")", this.items);
    }
}
