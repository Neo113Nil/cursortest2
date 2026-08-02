package ru.ozon.app.android.marketing.widgets.highlightProducts.data;

import C.o0;
import G.g;
import N3.C3660k;
import Sh.b;
import T7.P;
import V.e;
import com.squareup.moshi.j;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.marketing.widgets.highlightsWrapper.data.HighlightsCurrentMiniWidget;
import ru.ozon.app.android.marketing.widgets.highlightsWrapper.data.HighlightsWrapperProgressText;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0081\b\u0018\u00002\u00020\u0001:\u0003/01BO\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\n¢\u0006\u0004\b\r\u0010\u000eJ\u000b\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u0011\u0010%\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0017\u0010'\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\nHÆ\u0003J[\u0010(\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\nHÆ\u0001J\u0013\u0010)\u001a\u00020*2\b\u0010+\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010,\u001a\u00020-HÖ\u0001J\t\u0010.\u001a\u00020\u000bHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010R\u001f\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u001eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"¨\u00062"}, d2 = {"Lru/ozon/app/android/marketing/widgets/highlightProducts/data/HighlightProductsDTO;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/texts/TextAtom;", "mainProducts", "", "Lru/ozon/app/android/marketing/widgets/highlightProducts/data/HighlightProductsDTO$HighlightProduct;", "subProducts", "subtitle", "trackingInfo", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Lru/ozon/uni/atoms/data/texts/TextAtom;Ljava/util/List;Ljava/util/List;Lru/ozon/uni/atoms/data/texts/TextAtom;Ljava/util/Map;)V", "getTitle", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getMainProducts", "()Ljava/util/List;", "getSubProducts", "getSubtitle", "getTrackingInfo", "()Ljava/util/Map;", "currentMiniWidget", "Lru/ozon/app/android/marketing/widgets/highlightsWrapper/data/HighlightsCurrentMiniWidget;", "getCurrentMiniWidget", "()Lru/ozon/app/android/marketing/widgets/highlightsWrapper/data/HighlightsCurrentMiniWidget;", "setCurrentMiniWidget", "(Lru/ozon/app/android/marketing/widgets/highlightsWrapper/data/HighlightsCurrentMiniWidget;)V", "miniProgressText", "Lru/ozon/app/android/marketing/widgets/highlightsWrapper/data/HighlightsWrapperProgressText;", "getMiniProgressText", "()Lru/ozon/app/android/marketing/widgets/highlightsWrapper/data/HighlightsWrapperProgressText;", "setMiniProgressText", "(Lru/ozon/app/android/marketing/widgets/highlightsWrapper/data/HighlightsWrapperProgressText;)V", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "HighlightProduct", "ProductIcon", "ProductBadge", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class HighlightProductsDTO {
    public static final int $stable = 8;
    private HighlightsCurrentMiniWidget currentMiniWidget;

    @NotNull
    private final List<HighlightProduct> mainProducts;
    private HighlightsWrapperProgressText miniProgressText;
    private final List<HighlightProduct> subProducts;
    private final TextAtom subtitle;
    private final TextAtom title;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BE\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\r\u0010\u000eJ\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u0017\u0010\u001c\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\n\u0018\u00010\tHÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\fHÆ\u0003JQ\u0010\u001e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\n\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\fHÆ\u0001J\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001a\u00020#HÖ\u0001J\t\u0010$\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u001f\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018¨\u0006%"}, d2 = {"Lru/ozon/app/android/marketing/widgets/highlightProducts/data/HighlightProductsDTO$HighlightProduct;", "", "image", "", "icon", "Lru/ozon/app/android/marketing/widgets/highlightProducts/data/HighlightProductsDTO$ProductIcon;", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "badge", "Lru/ozon/app/android/marketing/widgets/highlightProducts/data/HighlightProductsDTO$ProductBadge;", "<init>", "(Ljava/lang/String;Lru/ozon/app/android/marketing/widgets/highlightProducts/data/HighlightProductsDTO$ProductIcon;Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/util/Map;Lru/ozon/app/android/marketing/widgets/highlightProducts/data/HighlightProductsDTO$ProductBadge;)V", "getImage", "()Ljava/lang/String;", "getIcon", "()Lru/ozon/app/android/marketing/widgets/highlightProducts/data/HighlightProductsDTO$ProductIcon;", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getTrackingInfo", "()Ljava/util/Map;", "getBadge", "()Lru/ozon/app/android/marketing/widgets/highlightProducts/data/HighlightProductsDTO$ProductBadge;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class HighlightProduct {
        public static final int $stable = 8;
        private final AtomActionDTO action;
        private final ProductBadge badge;
        private final ProductIcon icon;
        private final String image;
        private final Map<String, TokenizedTrackingInfo> trackingInfo;

        public HighlightProduct(String str, ProductIcon productIcon, AtomActionDTO atomActionDTO, Map<String, TokenizedTrackingInfo> map, ProductBadge productBadge) {
            this.image = str;
            this.icon = productIcon;
            this.action = atomActionDTO;
            this.trackingInfo = map;
            this.badge = productBadge;
        }

        public static /* synthetic */ HighlightProduct copy$default(HighlightProduct highlightProduct, String str, ProductIcon productIcon, AtomActionDTO atomActionDTO, Map map, ProductBadge productBadge, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = highlightProduct.image;
            }
            if ((i11 & 2) != 0) {
                productIcon = highlightProduct.icon;
            }
            if ((i11 & 4) != 0) {
                atomActionDTO = highlightProduct.action;
            }
            if ((i11 & 8) != 0) {
                map = highlightProduct.trackingInfo;
            }
            if ((i11 & 16) != 0) {
                productBadge = highlightProduct.badge;
            }
            ProductBadge productBadge2 = productBadge;
            AtomActionDTO atomActionDTO2 = atomActionDTO;
            return highlightProduct.copy(str, productIcon, atomActionDTO2, map, productBadge2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getImage() {
            return this.image;
        }

        /* renamed from: component2, reason: from getter */
        public final ProductIcon getIcon() {
            return this.icon;
        }

        /* renamed from: component3, reason: from getter */
        public final AtomActionDTO getAction() {
            return this.action;
        }

        public final Map<String, TokenizedTrackingInfo> component4() {
            return this.trackingInfo;
        }

        /* renamed from: component5, reason: from getter */
        public final ProductBadge getBadge() {
            return this.badge;
        }

        @NotNull
        public final HighlightProduct copy(String image, ProductIcon icon, AtomActionDTO action, Map<String, TokenizedTrackingInfo> trackingInfo, ProductBadge badge) {
            return new HighlightProduct(image, icon, action, trackingInfo, badge);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof HighlightProduct)) {
                return false;
            }
            HighlightProduct highlightProduct = (HighlightProduct) other;
            return Intrinsics.d(this.image, highlightProduct.image) && Intrinsics.d(this.icon, highlightProduct.icon) && Intrinsics.d(this.action, highlightProduct.action) && Intrinsics.d(this.trackingInfo, highlightProduct.trackingInfo) && Intrinsics.d(this.badge, highlightProduct.badge);
        }

        public final AtomActionDTO getAction() {
            return this.action;
        }

        public final ProductBadge getBadge() {
            return this.badge;
        }

        public final ProductIcon getIcon() {
            return this.icon;
        }

        public final String getImage() {
            return this.image;
        }

        public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
            return this.trackingInfo;
        }

        public int hashCode() {
            String str = this.image;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            ProductIcon productIcon = this.icon;
            int hashCode2 = (hashCode + (productIcon == null ? 0 : productIcon.hashCode())) * 31;
            AtomActionDTO atomActionDTO = this.action;
            int hashCode3 = (hashCode2 + (atomActionDTO == null ? 0 : atomActionDTO.hashCode())) * 31;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            int hashCode4 = (hashCode3 + (map == null ? 0 : map.hashCode())) * 31;
            ProductBadge productBadge = this.badge;
            return hashCode4 + (productBadge != null ? productBadge.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            String str = this.image;
            ProductIcon productIcon = this.icon;
            AtomActionDTO atomActionDTO = this.action;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            ProductBadge productBadge = this.badge;
            StringBuilder sb2 = new StringBuilder("HighlightProduct(image=");
            sb2.append(str);
            sb2.append(", icon=");
            sb2.append(productIcon);
            sb2.append(", action=");
            b.f(sb2, atomActionDTO, ", trackingInfo=", map, ", badge=");
            sb2.append(productBadge);
            sb2.append(")");
            return sb2.toString();
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J+\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/marketing/widgets/highlightProducts/data/HighlightProductsDTO$ProductBadge;", "", "image", "", "tintColor", "backgroundColor", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getImage", "()Ljava/lang/String;", "getTintColor", "getBackgroundColor", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ProductBadge {
        public static final int $stable = 0;
        private final String backgroundColor;

        @NotNull
        private final String image;
        private final String tintColor;

        public ProductBadge(@NotNull String image, String str, String str2) {
            Intrinsics.checkNotNullParameter(image, "image");
            this.image = image;
            this.tintColor = str;
            this.backgroundColor = str2;
        }

        public static /* synthetic */ ProductBadge copy$default(ProductBadge productBadge, String str, String str2, String str3, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = productBadge.image;
            }
            if ((i11 & 2) != 0) {
                str2 = productBadge.tintColor;
            }
            if ((i11 & 4) != 0) {
                str3 = productBadge.backgroundColor;
            }
            return productBadge.copy(str, str2, str3);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getImage() {
            return this.image;
        }

        /* renamed from: component2, reason: from getter */
        public final String getTintColor() {
            return this.tintColor;
        }

        /* renamed from: component3, reason: from getter */
        public final String getBackgroundColor() {
            return this.backgroundColor;
        }

        @NotNull
        public final ProductBadge copy(@NotNull String image, String tintColor, String backgroundColor) {
            Intrinsics.checkNotNullParameter(image, "image");
            return new ProductBadge(image, tintColor, backgroundColor);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ProductBadge)) {
                return false;
            }
            ProductBadge productBadge = (ProductBadge) other;
            return Intrinsics.d(this.image, productBadge.image) && Intrinsics.d(this.tintColor, productBadge.tintColor) && Intrinsics.d(this.backgroundColor, productBadge.backgroundColor);
        }

        public final String getBackgroundColor() {
            return this.backgroundColor;
        }

        @NotNull
        public final String getImage() {
            return this.image;
        }

        public final String getTintColor() {
            return this.tintColor;
        }

        public int hashCode() {
            int hashCode = this.image.hashCode() * 31;
            String str = this.tintColor;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.backgroundColor;
            return hashCode2 + (str2 != null ? str2.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            String str = this.image;
            String str2 = this.tintColor;
            return o0.c(C3660k.d("ProductBadge(image=", str, ", tintColor=", str2, ", backgroundColor="), this.backgroundColor, ")");
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u001f\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/marketing/widgets/highlightProducts/data/HighlightProductsDTO$ProductIcon;", "", "icon", "", "tintColor", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getIcon", "()Ljava/lang/String;", "getTintColor", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ProductIcon {
        public static final int $stable = 0;

        @NotNull
        private final String icon;
        private final String tintColor;

        public ProductIcon(@NotNull String icon, String str) {
            Intrinsics.checkNotNullParameter(icon, "icon");
            this.icon = icon;
            this.tintColor = str;
        }

        public static /* synthetic */ ProductIcon copy$default(ProductIcon productIcon, String str, String str2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = productIcon.icon;
            }
            if ((i11 & 2) != 0) {
                str2 = productIcon.tintColor;
            }
            return productIcon.copy(str, str2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getIcon() {
            return this.icon;
        }

        /* renamed from: component2, reason: from getter */
        public final String getTintColor() {
            return this.tintColor;
        }

        @NotNull
        public final ProductIcon copy(@NotNull String icon, String tintColor) {
            Intrinsics.checkNotNullParameter(icon, "icon");
            return new ProductIcon(icon, tintColor);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ProductIcon)) {
                return false;
            }
            ProductIcon productIcon = (ProductIcon) other;
            return Intrinsics.d(this.icon, productIcon.icon) && Intrinsics.d(this.tintColor, productIcon.tintColor);
        }

        @NotNull
        public final String getIcon() {
            return this.icon;
        }

        public final String getTintColor() {
            return this.tintColor;
        }

        public int hashCode() {
            int hashCode = this.icon.hashCode() * 31;
            String str = this.tintColor;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        @NotNull
        public String toString() {
            return e.a("ProductIcon(icon=", this.icon, ", tintColor=", this.tintColor, ")");
        }
    }

    public HighlightProductsDTO(TextAtom textAtom, @NotNull List<HighlightProduct> mainProducts, List<HighlightProduct> list, TextAtom textAtom2, Map<String, TokenizedTrackingInfo> map) {
        Intrinsics.checkNotNullParameter(mainProducts, "mainProducts");
        this.title = textAtom;
        this.mainProducts = mainProducts;
        this.subProducts = list;
        this.subtitle = textAtom2;
        this.trackingInfo = map;
    }

    public static /* synthetic */ HighlightProductsDTO copy$default(HighlightProductsDTO highlightProductsDTO, TextAtom textAtom, List list, List list2, TextAtom textAtom2, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            textAtom = highlightProductsDTO.title;
        }
        if ((i11 & 2) != 0) {
            list = highlightProductsDTO.mainProducts;
        }
        if ((i11 & 4) != 0) {
            list2 = highlightProductsDTO.subProducts;
        }
        if ((i11 & 8) != 0) {
            textAtom2 = highlightProductsDTO.subtitle;
        }
        if ((i11 & 16) != 0) {
            map = highlightProductsDTO.trackingInfo;
        }
        Map map2 = map;
        List list3 = list2;
        return highlightProductsDTO.copy(textAtom, list, list3, textAtom2, map2);
    }

    /* renamed from: component1, reason: from getter */
    public final TextAtom getTitle() {
        return this.title;
    }

    @NotNull
    public final List<HighlightProduct> component2() {
        return this.mainProducts;
    }

    public final List<HighlightProduct> component3() {
        return this.subProducts;
    }

    /* renamed from: component4, reason: from getter */
    public final TextAtom getSubtitle() {
        return this.subtitle;
    }

    public final Map<String, TokenizedTrackingInfo> component5() {
        return this.trackingInfo;
    }

    @NotNull
    public final HighlightProductsDTO copy(TextAtom title, @NotNull List<HighlightProduct> mainProducts, List<HighlightProduct> subProducts, TextAtom subtitle, Map<String, TokenizedTrackingInfo> trackingInfo) {
        Intrinsics.checkNotNullParameter(mainProducts, "mainProducts");
        return new HighlightProductsDTO(title, mainProducts, subProducts, subtitle, trackingInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HighlightProductsDTO)) {
            return false;
        }
        HighlightProductsDTO highlightProductsDTO = (HighlightProductsDTO) other;
        return Intrinsics.d(this.title, highlightProductsDTO.title) && Intrinsics.d(this.mainProducts, highlightProductsDTO.mainProducts) && Intrinsics.d(this.subProducts, highlightProductsDTO.subProducts) && Intrinsics.d(this.subtitle, highlightProductsDTO.subtitle) && Intrinsics.d(this.trackingInfo, highlightProductsDTO.trackingInfo);
    }

    public final HighlightsCurrentMiniWidget getCurrentMiniWidget() {
        return this.currentMiniWidget;
    }

    @NotNull
    public final List<HighlightProduct> getMainProducts() {
        return this.mainProducts;
    }

    public final HighlightsWrapperProgressText getMiniProgressText() {
        return this.miniProgressText;
    }

    public final List<HighlightProduct> getSubProducts() {
        return this.subProducts;
    }

    public final TextAtom getSubtitle() {
        return this.subtitle;
    }

    public final TextAtom getTitle() {
        return this.title;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        TextAtom textAtom = this.title;
        int b11 = g.b((textAtom == null ? 0 : textAtom.hashCode()) * 31, 31, this.mainProducts);
        List<HighlightProduct> list = this.subProducts;
        int hashCode = (b11 + (list == null ? 0 : list.hashCode())) * 31;
        TextAtom textAtom2 = this.subtitle;
        int hashCode2 = (hashCode + (textAtom2 == null ? 0 : textAtom2.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        return hashCode2 + (map != null ? map.hashCode() : 0);
    }

    public final void setCurrentMiniWidget(HighlightsCurrentMiniWidget highlightsCurrentMiniWidget) {
        this.currentMiniWidget = highlightsCurrentMiniWidget;
    }

    public final void setMiniProgressText(HighlightsWrapperProgressText highlightsWrapperProgressText) {
        this.miniProgressText = highlightsWrapperProgressText;
    }

    @NotNull
    public String toString() {
        TextAtom textAtom = this.title;
        List<HighlightProduct> list = this.mainProducts;
        List<HighlightProduct> list2 = this.subProducts;
        TextAtom textAtom2 = this.subtitle;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        StringBuilder sb2 = new StringBuilder("HighlightProductsDTO(title=");
        sb2.append(textAtom);
        sb2.append(", mainProducts=");
        sb2.append(list);
        sb2.append(", subProducts=");
        sb2.append(list2);
        sb2.append(", subtitle=");
        sb2.append(textAtom2);
        sb2.append(", trackingInfo=");
        return P.f(sb2, map, ")");
    }
}
