package ru.ozon.app.android.ugc.payout.widgets.promoReviewProductsV3.data;

import B90.C2616s;
import D40.a;
import G.g;
import N3.C3660k;
import Ns.b;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.squareup.moshi.j;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.joda.time.DateTime;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.cart.common.dynamicElement.DynamicElementDTO;
import ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.data.ReviewGalleryV2DTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.common.CornerRadius;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.image.ImageDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b$\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0081\b\u0018\u00002\u00020\u0001:\u0003@ABBy\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\u0014\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b\u0018\u0010\u0019J\t\u0010/\u001a\u00020\u0003HÆ\u0003J\t\u00100\u001a\u00020\u0005HÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u0011\u00102\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tHÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\u0010HÆ\u0003J\u0017\u00106\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012HÆ\u0003J\u0010\u00107\u001a\u0004\u0018\u00010\u0015HÆ\u0003¢\u0006\u0002\u0010+J\u000b\u00108\u001a\u0004\u0018\u00010\u0017HÆ\u0003J\u0094\u0001\u00109\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0016\b\u0002\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00122\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÆ\u0001¢\u0006\u0002\u0010:J\u0013\u0010;\u001a\u00020<2\b\u0010=\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010>\u001a\u00020\u0015HÖ\u0001J\t\u0010?\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0019\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u001f\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0015\u0010\u0014\u001a\u0004\u0018\u00010\u0015¢\u0006\n\n\u0002\u0010,\u001a\u0004\b*\u0010+R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u0017¢\u0006\b\n\u0000\u001a\u0004\b-\u0010.¨\u0006C"}, d2 = {"Lru/ozon/app/android/ugc/payout/widgets/promoReviewProductsV3/data/PromoReviewItemDTO;", "", "backgroundColor", "", ReviewGalleryV2DTO.ReviewGalleryV2Item.ItemsContainerDTO.PRODUCT_FIELD_NAME, "Lru/ozon/app/android/ugc/payout/widgets/promoReviewProductsV3/data/PromoReviewItemDTO$ProductDTO;", DynamicElementDTO.TIMER, "Lru/ozon/app/android/ugc/payout/widgets/promoReviewProductsV3/data/PromoReviewItemDTO$TimerDTO;", "points", "", "Lru/ozon/app/android/ugc/payout/widgets/promoReviewProductsV3/data/PromoReviewItemDTO$PointDTO;", "reviewButton", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "pointsCell", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "topPaddingCell", "", "rightBottomIcon", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "<init>", "(Ljava/lang/String;Lru/ozon/app/android/ugc/payout/widgets/promoReviewProductsV3/data/PromoReviewItemDTO$ProductDTO;Lru/ozon/app/android/ugc/payout/widgets/promoReviewProductsV3/data/PromoReviewItemDTO$TimerDTO;Ljava/util/List;Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;Lru/ozon/uni/atoms/data/dsCell/CellDTO;Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/util/Map;Ljava/lang/Integer;Lru/ozon/uni/atoms/data/icon/IconDTO;)V", "getBackgroundColor", "()Ljava/lang/String;", "getProduct", "()Lru/ozon/app/android/ugc/payout/widgets/promoReviewProductsV3/data/PromoReviewItemDTO$ProductDTO;", "getTimer", "()Lru/ozon/app/android/ugc/payout/widgets/promoReviewProductsV3/data/PromoReviewItemDTO$TimerDTO;", "getPoints", "()Ljava/util/List;", "getReviewButton", "()Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "getPointsCell", "()Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getTrackingInfo", "()Ljava/util/Map;", "getTopPaddingCell", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getRightBottomIcon", "()Lru/ozon/uni/atoms/data/icon/IconDTO;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "(Ljava/lang/String;Lru/ozon/app/android/ugc/payout/widgets/promoReviewProductsV3/data/PromoReviewItemDTO$ProductDTO;Lru/ozon/app/android/ugc/payout/widgets/promoReviewProductsV3/data/PromoReviewItemDTO$TimerDTO;Ljava/util/List;Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;Lru/ozon/uni/atoms/data/dsCell/CellDTO;Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/util/Map;Ljava/lang/Integer;Lru/ozon/uni/atoms/data/icon/IconDTO;)Lru/ozon/app/android/ugc/payout/widgets/promoReviewProductsV3/data/PromoReviewItemDTO;", "equals", "", "other", "hashCode", "toString", "ProductDTO", "TimerDTO", "PointDTO", "payout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class PromoReviewItemDTO {
    private final AtomActionDTO action;

    @NotNull
    private final String backgroundColor;
    private final List<PointDTO> points;
    private final CellDTO pointsCell;

    @NotNull
    private final ProductDTO product;
    private final ButtonV3DTO reviewButton;
    private final IconDTO rightBottomIcon;
    private final TimerDTO timer;
    private final Integer topPaddingCell;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0006HÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/ugc/payout/widgets/promoReviewProductsV3/data/PromoReviewItemDTO$PointDTO;", "", "icons", "", "Lru/ozon/uni/atoms/data/icon/IconDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/text/TextDTO;", "<init>", "(Ljava/util/List;Lru/ozon/uni/atoms/data/text/TextDTO;)V", "getIcons", "()Ljava/util/List;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "payout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class PointDTO {

        @NotNull
        private final List<IconDTO> icons;

        @NotNull
        private final TextDTO title;

        public PointDTO(@NotNull List<IconDTO> icons, @NotNull TextDTO title) {
            Intrinsics.checkNotNullParameter(icons, "icons");
            Intrinsics.checkNotNullParameter(title, "title");
            this.icons = icons;
            this.title = title;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ PointDTO copy$default(PointDTO pointDTO, List list, TextDTO textDTO, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                list = pointDTO.icons;
            }
            if ((i11 & 2) != 0) {
                textDTO = pointDTO.title;
            }
            return pointDTO.copy(list, textDTO);
        }

        @NotNull
        public final List<IconDTO> component1() {
            return this.icons;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final TextDTO getTitle() {
            return this.title;
        }

        @NotNull
        public final PointDTO copy(@NotNull List<IconDTO> icons, @NotNull TextDTO title) {
            Intrinsics.checkNotNullParameter(icons, "icons");
            Intrinsics.checkNotNullParameter(title, "title");
            return new PointDTO(icons, title);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PointDTO)) {
                return false;
            }
            PointDTO pointDTO = (PointDTO) other;
            return Intrinsics.d(this.icons, pointDTO.icons) && Intrinsics.d(this.title, pointDTO.title);
        }

        @NotNull
        public final List<IconDTO> getIcons() {
            return this.icons;
        }

        @NotNull
        public final TextDTO getTitle() {
            return this.title;
        }

        public int hashCode() {
            return this.title.hashCode() + (this.icons.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return "PointDTO(icons=" + this.icons + ", title=" + this.title + ")";
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\t¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u0017\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\tHÆ\u0003JA\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\tHÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020\nHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u001f\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006!"}, d2 = {"Lru/ozon/app/android/ugc/payout/widgets/promoReviewProductsV3/data/PromoReviewItemDTO$ProductDTO;", "", "image", "Lru/ozon/uni/atoms/data/image/ImageDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/text/TextDTO;", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "trackingInfo", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Lru/ozon/uni/atoms/data/image/ImageDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/util/Map;)V", "getImage", "()Lru/ozon/uni/atoms/data/image/ImageDTO;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "payout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ProductDTO {
        private final AtomActionDTO action;

        @NotNull
        private final ImageDTO image;

        @NotNull
        private final TextDTO title;
        private final Map<String, TokenizedTrackingInfo> trackingInfo;

        public ProductDTO(@NotNull ImageDTO image, @NotNull TextDTO title, AtomActionDTO atomActionDTO, Map<String, TokenizedTrackingInfo> map) {
            Intrinsics.checkNotNullParameter(image, "image");
            Intrinsics.checkNotNullParameter(title, "title");
            this.image = image;
            this.title = title;
            this.action = atomActionDTO;
            this.trackingInfo = map;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ ProductDTO copy$default(ProductDTO productDTO, ImageDTO imageDTO, TextDTO textDTO, AtomActionDTO atomActionDTO, Map map, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                imageDTO = productDTO.image;
            }
            if ((i11 & 2) != 0) {
                textDTO = productDTO.title;
            }
            if ((i11 & 4) != 0) {
                atomActionDTO = productDTO.action;
            }
            if ((i11 & 8) != 0) {
                map = productDTO.trackingInfo;
            }
            return productDTO.copy(imageDTO, textDTO, atomActionDTO, map);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final ImageDTO getImage() {
            return this.image;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final TextDTO getTitle() {
            return this.title;
        }

        /* renamed from: component3, reason: from getter */
        public final AtomActionDTO getAction() {
            return this.action;
        }

        public final Map<String, TokenizedTrackingInfo> component4() {
            return this.trackingInfo;
        }

        @NotNull
        public final ProductDTO copy(@NotNull ImageDTO image, @NotNull TextDTO title, AtomActionDTO action, Map<String, TokenizedTrackingInfo> trackingInfo) {
            Intrinsics.checkNotNullParameter(image, "image");
            Intrinsics.checkNotNullParameter(title, "title");
            return new ProductDTO(image, title, action, trackingInfo);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ProductDTO)) {
                return false;
            }
            ProductDTO productDTO = (ProductDTO) other;
            return Intrinsics.d(this.image, productDTO.image) && Intrinsics.d(this.title, productDTO.title) && Intrinsics.d(this.action, productDTO.action) && Intrinsics.d(this.trackingInfo, productDTO.trackingInfo);
        }

        public final AtomActionDTO getAction() {
            return this.action;
        }

        @NotNull
        public final ImageDTO getImage() {
            return this.image;
        }

        @NotNull
        public final TextDTO getTitle() {
            return this.title;
        }

        public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
            return this.trackingInfo;
        }

        public int hashCode() {
            int a11 = b.a(this.title, this.image.hashCode() * 31, 31);
            AtomActionDTO atomActionDTO = this.action;
            int hashCode = (a11 + (atomActionDTO == null ? 0 : atomActionDTO.hashCode())) * 31;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            return hashCode + (map != null ? map.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            ImageDTO imageDTO = this.image;
            TextDTO textDTO = this.title;
            return a.d(C2616s.d("ProductDTO(image=", imageDTO, ", title=", textDTO, ", action="), this.action, ", trackingInfo=", this.trackingInfo, ")");
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u000bHÆ\u0003JQ\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bHÆ\u0001J\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010#\u001a\u00020$HÖ\u0001J\t\u0010%\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0011\u0010\t\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006&"}, d2 = {"Lru/ozon/app/android/ugc/payout/widgets/promoReviewProductsV3/data/PromoReviewItemDTO$TimerDTO;", "", "backgroundColor", "", "textColor", "typographyToken", "serverTimestamp", "Lorg/joda/time/DateTime;", "startTimestamp", "endTimestamp", "cornerRadius", "Lru/ozon/uni/atoms/data/common/CornerRadius;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Lru/ozon/uni/atoms/data/common/CornerRadius;)V", "getBackgroundColor", "()Ljava/lang/String;", "getTextColor", "getTypographyToken", "getServerTimestamp", "()Lorg/joda/time/DateTime;", "getStartTimestamp", "getEndTimestamp", "getCornerRadius", "()Lru/ozon/uni/atoms/data/common/CornerRadius;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "", "toString", "payout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class TimerDTO {

        @NotNull
        private final String backgroundColor;
        private final CornerRadius cornerRadius;

        @NotNull
        private final DateTime endTimestamp;

        @NotNull
        private final DateTime serverTimestamp;

        @NotNull
        private final DateTime startTimestamp;

        @NotNull
        private final String textColor;

        @NotNull
        private final String typographyToken;

        public TimerDTO(@NotNull String backgroundColor, @NotNull String textColor, @NotNull String typographyToken, @NotNull DateTime serverTimestamp, @NotNull DateTime startTimestamp, @NotNull DateTime endTimestamp, CornerRadius cornerRadius) {
            Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
            Intrinsics.checkNotNullParameter(textColor, "textColor");
            Intrinsics.checkNotNullParameter(typographyToken, "typographyToken");
            Intrinsics.checkNotNullParameter(serverTimestamp, "serverTimestamp");
            Intrinsics.checkNotNullParameter(startTimestamp, "startTimestamp");
            Intrinsics.checkNotNullParameter(endTimestamp, "endTimestamp");
            this.backgroundColor = backgroundColor;
            this.textColor = textColor;
            this.typographyToken = typographyToken;
            this.serverTimestamp = serverTimestamp;
            this.startTimestamp = startTimestamp;
            this.endTimestamp = endTimestamp;
            this.cornerRadius = cornerRadius;
        }

        public static /* synthetic */ TimerDTO copy$default(TimerDTO timerDTO, String str, String str2, String str3, DateTime dateTime, DateTime dateTime2, DateTime dateTime3, CornerRadius cornerRadius, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = timerDTO.backgroundColor;
            }
            if ((i11 & 2) != 0) {
                str2 = timerDTO.textColor;
            }
            if ((i11 & 4) != 0) {
                str3 = timerDTO.typographyToken;
            }
            if ((i11 & 8) != 0) {
                dateTime = timerDTO.serverTimestamp;
            }
            if ((i11 & 16) != 0) {
                dateTime2 = timerDTO.startTimestamp;
            }
            if ((i11 & 32) != 0) {
                dateTime3 = timerDTO.endTimestamp;
            }
            if ((i11 & 64) != 0) {
                cornerRadius = timerDTO.cornerRadius;
            }
            DateTime dateTime4 = dateTime3;
            CornerRadius cornerRadius2 = cornerRadius;
            DateTime dateTime5 = dateTime2;
            String str4 = str3;
            return timerDTO.copy(str, str2, str4, dateTime, dateTime5, dateTime4, cornerRadius2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getBackgroundColor() {
            return this.backgroundColor;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final String getTextColor() {
            return this.textColor;
        }

        @NotNull
        /* renamed from: component3, reason: from getter */
        public final String getTypographyToken() {
            return this.typographyToken;
        }

        @NotNull
        /* renamed from: component4, reason: from getter */
        public final DateTime getServerTimestamp() {
            return this.serverTimestamp;
        }

        @NotNull
        /* renamed from: component5, reason: from getter */
        public final DateTime getStartTimestamp() {
            return this.startTimestamp;
        }

        @NotNull
        /* renamed from: component6, reason: from getter */
        public final DateTime getEndTimestamp() {
            return this.endTimestamp;
        }

        /* renamed from: component7, reason: from getter */
        public final CornerRadius getCornerRadius() {
            return this.cornerRadius;
        }

        @NotNull
        public final TimerDTO copy(@NotNull String backgroundColor, @NotNull String textColor, @NotNull String typographyToken, @NotNull DateTime serverTimestamp, @NotNull DateTime startTimestamp, @NotNull DateTime endTimestamp, CornerRadius cornerRadius) {
            Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
            Intrinsics.checkNotNullParameter(textColor, "textColor");
            Intrinsics.checkNotNullParameter(typographyToken, "typographyToken");
            Intrinsics.checkNotNullParameter(serverTimestamp, "serverTimestamp");
            Intrinsics.checkNotNullParameter(startTimestamp, "startTimestamp");
            Intrinsics.checkNotNullParameter(endTimestamp, "endTimestamp");
            return new TimerDTO(backgroundColor, textColor, typographyToken, serverTimestamp, startTimestamp, endTimestamp, cornerRadius);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TimerDTO)) {
                return false;
            }
            TimerDTO timerDTO = (TimerDTO) other;
            return Intrinsics.d(this.backgroundColor, timerDTO.backgroundColor) && Intrinsics.d(this.textColor, timerDTO.textColor) && Intrinsics.d(this.typographyToken, timerDTO.typographyToken) && Intrinsics.d(this.serverTimestamp, timerDTO.serverTimestamp) && Intrinsics.d(this.startTimestamp, timerDTO.startTimestamp) && Intrinsics.d(this.endTimestamp, timerDTO.endTimestamp) && this.cornerRadius == timerDTO.cornerRadius;
        }

        @NotNull
        public final String getBackgroundColor() {
            return this.backgroundColor;
        }

        public final CornerRadius getCornerRadius() {
            return this.cornerRadius;
        }

        @NotNull
        public final DateTime getEndTimestamp() {
            return this.endTimestamp;
        }

        @NotNull
        public final DateTime getServerTimestamp() {
            return this.serverTimestamp;
        }

        @NotNull
        public final DateTime getStartTimestamp() {
            return this.startTimestamp;
        }

        @NotNull
        public final String getTextColor() {
            return this.textColor;
        }

        @NotNull
        public final String getTypographyToken() {
            return this.typographyToken;
        }

        public int hashCode() {
            int a11 = GR.b.a(this.endTimestamp, GR.b.a(this.startTimestamp, GR.b.a(this.serverTimestamp, g.a(g.a(this.backgroundColor.hashCode() * 31, 31, this.textColor), 31, this.typographyToken), 31), 31), 31);
            CornerRadius cornerRadius = this.cornerRadius;
            return a11 + (cornerRadius == null ? 0 : cornerRadius.hashCode());
        }

        @NotNull
        public String toString() {
            String str = this.backgroundColor;
            String str2 = this.textColor;
            String str3 = this.typographyToken;
            DateTime dateTime = this.serverTimestamp;
            DateTime dateTime2 = this.startTimestamp;
            DateTime dateTime3 = this.endTimestamp;
            CornerRadius cornerRadius = this.cornerRadius;
            StringBuilder d11 = C3660k.d("TimerDTO(backgroundColor=", str, ", textColor=", str2, ", typographyToken=");
            d11.append(str3);
            d11.append(", serverTimestamp=");
            d11.append(dateTime);
            d11.append(", startTimestamp=");
            d11.append(dateTime2);
            d11.append(", endTimestamp=");
            d11.append(dateTime3);
            d11.append(", cornerRadius=");
            d11.append(cornerRadius);
            d11.append(")");
            return d11.toString();
        }
    }

    public PromoReviewItemDTO(@NotNull String backgroundColor, @NotNull ProductDTO product, TimerDTO timerDTO, List<PointDTO> list, ButtonV3DTO buttonV3DTO, CellDTO cellDTO, AtomActionDTO atomActionDTO, Map<String, TokenizedTrackingInfo> map, Integer num, IconDTO iconDTO) {
        Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
        Intrinsics.checkNotNullParameter(product, "product");
        this.backgroundColor = backgroundColor;
        this.product = product;
        this.timer = timerDTO;
        this.points = list;
        this.reviewButton = buttonV3DTO;
        this.pointsCell = cellDTO;
        this.action = atomActionDTO;
        this.trackingInfo = map;
        this.topPaddingCell = num;
        this.rightBottomIcon = iconDTO;
    }

    public static /* synthetic */ PromoReviewItemDTO copy$default(PromoReviewItemDTO promoReviewItemDTO, String str, ProductDTO productDTO, TimerDTO timerDTO, List list, ButtonV3DTO buttonV3DTO, CellDTO cellDTO, AtomActionDTO atomActionDTO, Map map, Integer num, IconDTO iconDTO, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = promoReviewItemDTO.backgroundColor;
        }
        if ((i11 & 2) != 0) {
            productDTO = promoReviewItemDTO.product;
        }
        if ((i11 & 4) != 0) {
            timerDTO = promoReviewItemDTO.timer;
        }
        if ((i11 & 8) != 0) {
            list = promoReviewItemDTO.points;
        }
        if ((i11 & 16) != 0) {
            buttonV3DTO = promoReviewItemDTO.reviewButton;
        }
        if ((i11 & 32) != 0) {
            cellDTO = promoReviewItemDTO.pointsCell;
        }
        if ((i11 & 64) != 0) {
            atomActionDTO = promoReviewItemDTO.action;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
            map = promoReviewItemDTO.trackingInfo;
        }
        if ((i11 & 256) != 0) {
            num = promoReviewItemDTO.topPaddingCell;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0) {
            iconDTO = promoReviewItemDTO.rightBottomIcon;
        }
        Integer num2 = num;
        IconDTO iconDTO2 = iconDTO;
        AtomActionDTO atomActionDTO2 = atomActionDTO;
        Map map2 = map;
        ButtonV3DTO buttonV3DTO2 = buttonV3DTO;
        CellDTO cellDTO2 = cellDTO;
        return promoReviewItemDTO.copy(str, productDTO, timerDTO, list, buttonV3DTO2, cellDTO2, atomActionDTO2, map2, num2, iconDTO2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    /* renamed from: component10, reason: from getter */
    public final IconDTO getRightBottomIcon() {
        return this.rightBottomIcon;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final ProductDTO getProduct() {
        return this.product;
    }

    /* renamed from: component3, reason: from getter */
    public final TimerDTO getTimer() {
        return this.timer;
    }

    public final List<PointDTO> component4() {
        return this.points;
    }

    /* renamed from: component5, reason: from getter */
    public final ButtonV3DTO getReviewButton() {
        return this.reviewButton;
    }

    /* renamed from: component6, reason: from getter */
    public final CellDTO getPointsCell() {
        return this.pointsCell;
    }

    /* renamed from: component7, reason: from getter */
    public final AtomActionDTO getAction() {
        return this.action;
    }

    public final Map<String, TokenizedTrackingInfo> component8() {
        return this.trackingInfo;
    }

    /* renamed from: component9, reason: from getter */
    public final Integer getTopPaddingCell() {
        return this.topPaddingCell;
    }

    @NotNull
    public final PromoReviewItemDTO copy(@NotNull String backgroundColor, @NotNull ProductDTO product, TimerDTO timer, List<PointDTO> points, ButtonV3DTO reviewButton, CellDTO pointsCell, AtomActionDTO action, Map<String, TokenizedTrackingInfo> trackingInfo, Integer topPaddingCell, IconDTO rightBottomIcon) {
        Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
        Intrinsics.checkNotNullParameter(product, "product");
        return new PromoReviewItemDTO(backgroundColor, product, timer, points, reviewButton, pointsCell, action, trackingInfo, topPaddingCell, rightBottomIcon);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PromoReviewItemDTO)) {
            return false;
        }
        PromoReviewItemDTO promoReviewItemDTO = (PromoReviewItemDTO) other;
        return Intrinsics.d(this.backgroundColor, promoReviewItemDTO.backgroundColor) && Intrinsics.d(this.product, promoReviewItemDTO.product) && Intrinsics.d(this.timer, promoReviewItemDTO.timer) && Intrinsics.d(this.points, promoReviewItemDTO.points) && Intrinsics.d(this.reviewButton, promoReviewItemDTO.reviewButton) && Intrinsics.d(this.pointsCell, promoReviewItemDTO.pointsCell) && Intrinsics.d(this.action, promoReviewItemDTO.action) && Intrinsics.d(this.trackingInfo, promoReviewItemDTO.trackingInfo) && Intrinsics.d(this.topPaddingCell, promoReviewItemDTO.topPaddingCell) && Intrinsics.d(this.rightBottomIcon, promoReviewItemDTO.rightBottomIcon);
    }

    public final AtomActionDTO getAction() {
        return this.action;
    }

    @NotNull
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    public final List<PointDTO> getPoints() {
        return this.points;
    }

    public final CellDTO getPointsCell() {
        return this.pointsCell;
    }

    @NotNull
    public final ProductDTO getProduct() {
        return this.product;
    }

    public final ButtonV3DTO getReviewButton() {
        return this.reviewButton;
    }

    public final IconDTO getRightBottomIcon() {
        return this.rightBottomIcon;
    }

    public final TimerDTO getTimer() {
        return this.timer;
    }

    public final Integer getTopPaddingCell() {
        return this.topPaddingCell;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        int hashCode = (this.product.hashCode() + (this.backgroundColor.hashCode() * 31)) * 31;
        TimerDTO timerDTO = this.timer;
        int hashCode2 = (hashCode + (timerDTO == null ? 0 : timerDTO.hashCode())) * 31;
        List<PointDTO> list = this.points;
        int hashCode3 = (hashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        ButtonV3DTO buttonV3DTO = this.reviewButton;
        int hashCode4 = (hashCode3 + (buttonV3DTO == null ? 0 : buttonV3DTO.hashCode())) * 31;
        CellDTO cellDTO = this.pointsCell;
        int hashCode5 = (hashCode4 + (cellDTO == null ? 0 : cellDTO.hashCode())) * 31;
        AtomActionDTO atomActionDTO = this.action;
        int hashCode6 = (hashCode5 + (atomActionDTO == null ? 0 : atomActionDTO.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        int hashCode7 = (hashCode6 + (map == null ? 0 : map.hashCode())) * 31;
        Integer num = this.topPaddingCell;
        int hashCode8 = (hashCode7 + (num == null ? 0 : num.hashCode())) * 31;
        IconDTO iconDTO = this.rightBottomIcon;
        return hashCode8 + (iconDTO != null ? iconDTO.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.backgroundColor;
        ProductDTO productDTO = this.product;
        TimerDTO timerDTO = this.timer;
        List<PointDTO> list = this.points;
        ButtonV3DTO buttonV3DTO = this.reviewButton;
        CellDTO cellDTO = this.pointsCell;
        AtomActionDTO atomActionDTO = this.action;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        Integer num = this.topPaddingCell;
        IconDTO iconDTO = this.rightBottomIcon;
        StringBuilder sb2 = new StringBuilder("PromoReviewItemDTO(backgroundColor=");
        sb2.append(str);
        sb2.append(", product=");
        sb2.append(productDTO);
        sb2.append(", timer=");
        sb2.append(timerDTO);
        sb2.append(", points=");
        sb2.append(list);
        sb2.append(", reviewButton=");
        sb2.append(buttonV3DTO);
        sb2.append(", pointsCell=");
        sb2.append(cellDTO);
        sb2.append(", action=");
        Sh.b.f(sb2, atomActionDTO, ", trackingInfo=", map, ", topPaddingCell=");
        sb2.append(num);
        sb2.append(", rightBottomIcon=");
        sb2.append(iconDTO);
        sb2.append(")");
        return sb2.toString();
    }
}
