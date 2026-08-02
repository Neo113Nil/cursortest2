package ru.ozon.app.android.fresh.geo.widgets.orderInfo.data;

import G.g;
import T7.P;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.squareup.moshi.j;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.image.ImageDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001:\u00010Bu\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u0016\b\u0002\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0012\u0010\u0013J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000f\u0010&\u001a\b\u0012\u0004\u0012\u00020\f0\u000bHÆ\u0003J\u0017\u0010'\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000eHÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\tHÆ\u0003Jy\u0010)\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0016\b\u0002\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\tHÆ\u0001J\u0013\u0010*\u001a\u00020+2\b\u0010,\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010-\u001a\u00020.HÖ\u0001J\t\u0010/\u001a\u00020\u000fHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0015R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u001f\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0013\u0010\u0011\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001b¨\u00061"}, d2 = {"Lru/ozon/app/android/fresh/geo/widgets/orderInfo/data/OrderInfoDTO;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/text/TextDTO;", "subtitle", "headerButton", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "rightHeaderText", "rightHeaderTextAction", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "products", "", "Lru/ozon/app/android/fresh/geo/widgets/orderInfo/data/OrderInfoDTO$OrderProductDTO;", "trackingInfo", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "productsListAction", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/util/List;Ljava/util/Map;Lru/ozon/uni/atoms/data/AtomActionDTO;)V", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getSubtitle", "getHeaderButton", "()Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "getRightHeaderText", "getRightHeaderTextAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getProducts", "()Ljava/util/List;", "getTrackingInfo", "()Ljava/util/Map;", "getProductsListAction", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "", "toString", "OrderProductDTO", "widgets-geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class OrderInfoDTO {
    private final BadgeDTO headerButton;

    @NotNull
    private final List<OrderProductDTO> products;
    private final AtomActionDTO productsListAction;
    private final TextDTO rightHeaderText;
    private final AtomActionDTO rightHeaderTextAction;
    private final TextDTO subtitle;
    private final TextDTO title;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    public OrderInfoDTO(TextDTO textDTO, TextDTO textDTO2, BadgeDTO badgeDTO, TextDTO textDTO3, AtomActionDTO atomActionDTO, @NotNull List<OrderProductDTO> products, Map<String, TokenizedTrackingInfo> map, AtomActionDTO atomActionDTO2) {
        Intrinsics.checkNotNullParameter(products, "products");
        this.title = textDTO;
        this.subtitle = textDTO2;
        this.headerButton = badgeDTO;
        this.rightHeaderText = textDTO3;
        this.rightHeaderTextAction = atomActionDTO;
        this.products = products;
        this.trackingInfo = map;
        this.productsListAction = atomActionDTO2;
    }

    public static /* synthetic */ OrderInfoDTO copy$default(OrderInfoDTO orderInfoDTO, TextDTO textDTO, TextDTO textDTO2, BadgeDTO badgeDTO, TextDTO textDTO3, AtomActionDTO atomActionDTO, List list, Map map, AtomActionDTO atomActionDTO2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            textDTO = orderInfoDTO.title;
        }
        if ((i11 & 2) != 0) {
            textDTO2 = orderInfoDTO.subtitle;
        }
        if ((i11 & 4) != 0) {
            badgeDTO = orderInfoDTO.headerButton;
        }
        if ((i11 & 8) != 0) {
            textDTO3 = orderInfoDTO.rightHeaderText;
        }
        if ((i11 & 16) != 0) {
            atomActionDTO = orderInfoDTO.rightHeaderTextAction;
        }
        if ((i11 & 32) != 0) {
            list = orderInfoDTO.products;
        }
        if ((i11 & 64) != 0) {
            map = orderInfoDTO.trackingInfo;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
            atomActionDTO2 = orderInfoDTO.productsListAction;
        }
        Map map2 = map;
        AtomActionDTO atomActionDTO3 = atomActionDTO2;
        AtomActionDTO atomActionDTO4 = atomActionDTO;
        List list2 = list;
        return orderInfoDTO.copy(textDTO, textDTO2, badgeDTO, textDTO3, atomActionDTO4, list2, map2, atomActionDTO3);
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
    public final BadgeDTO getHeaderButton() {
        return this.headerButton;
    }

    /* renamed from: component4, reason: from getter */
    public final TextDTO getRightHeaderText() {
        return this.rightHeaderText;
    }

    /* renamed from: component5, reason: from getter */
    public final AtomActionDTO getRightHeaderTextAction() {
        return this.rightHeaderTextAction;
    }

    @NotNull
    public final List<OrderProductDTO> component6() {
        return this.products;
    }

    public final Map<String, TokenizedTrackingInfo> component7() {
        return this.trackingInfo;
    }

    /* renamed from: component8, reason: from getter */
    public final AtomActionDTO getProductsListAction() {
        return this.productsListAction;
    }

    @NotNull
    public final OrderInfoDTO copy(TextDTO title, TextDTO subtitle, BadgeDTO headerButton, TextDTO rightHeaderText, AtomActionDTO rightHeaderTextAction, @NotNull List<OrderProductDTO> products, Map<String, TokenizedTrackingInfo> trackingInfo, AtomActionDTO productsListAction) {
        Intrinsics.checkNotNullParameter(products, "products");
        return new OrderInfoDTO(title, subtitle, headerButton, rightHeaderText, rightHeaderTextAction, products, trackingInfo, productsListAction);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OrderInfoDTO)) {
            return false;
        }
        OrderInfoDTO orderInfoDTO = (OrderInfoDTO) other;
        return Intrinsics.d(this.title, orderInfoDTO.title) && Intrinsics.d(this.subtitle, orderInfoDTO.subtitle) && Intrinsics.d(this.headerButton, orderInfoDTO.headerButton) && Intrinsics.d(this.rightHeaderText, orderInfoDTO.rightHeaderText) && Intrinsics.d(this.rightHeaderTextAction, orderInfoDTO.rightHeaderTextAction) && Intrinsics.d(this.products, orderInfoDTO.products) && Intrinsics.d(this.trackingInfo, orderInfoDTO.trackingInfo) && Intrinsics.d(this.productsListAction, orderInfoDTO.productsListAction);
    }

    public final BadgeDTO getHeaderButton() {
        return this.headerButton;
    }

    @NotNull
    public final List<OrderProductDTO> getProducts() {
        return this.products;
    }

    public final AtomActionDTO getProductsListAction() {
        return this.productsListAction;
    }

    public final TextDTO getRightHeaderText() {
        return this.rightHeaderText;
    }

    public final AtomActionDTO getRightHeaderTextAction() {
        return this.rightHeaderTextAction;
    }

    public final TextDTO getSubtitle() {
        return this.subtitle;
    }

    public final TextDTO getTitle() {
        return this.title;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        TextDTO textDTO = this.title;
        int hashCode = (textDTO == null ? 0 : textDTO.hashCode()) * 31;
        TextDTO textDTO2 = this.subtitle;
        int hashCode2 = (hashCode + (textDTO2 == null ? 0 : textDTO2.hashCode())) * 31;
        BadgeDTO badgeDTO = this.headerButton;
        int hashCode3 = (hashCode2 + (badgeDTO == null ? 0 : badgeDTO.hashCode())) * 31;
        TextDTO textDTO3 = this.rightHeaderText;
        int hashCode4 = (hashCode3 + (textDTO3 == null ? 0 : textDTO3.hashCode())) * 31;
        AtomActionDTO atomActionDTO = this.rightHeaderTextAction;
        int b11 = g.b((hashCode4 + (atomActionDTO == null ? 0 : atomActionDTO.hashCode())) * 31, 31, this.products);
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        int hashCode5 = (b11 + (map == null ? 0 : map.hashCode())) * 31;
        AtomActionDTO atomActionDTO2 = this.productsListAction;
        return hashCode5 + (atomActionDTO2 != null ? atomActionDTO2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        TextDTO textDTO = this.title;
        TextDTO textDTO2 = this.subtitle;
        BadgeDTO badgeDTO = this.headerButton;
        TextDTO textDTO3 = this.rightHeaderText;
        AtomActionDTO atomActionDTO = this.rightHeaderTextAction;
        List<OrderProductDTO> list = this.products;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        AtomActionDTO atomActionDTO2 = this.productsListAction;
        StringBuilder g10 = D3.g.g("OrderInfoDTO(title=", textDTO, ", subtitle=", textDTO2, ", headerButton=");
        g10.append(badgeDTO);
        g10.append(", rightHeaderText=");
        g10.append(textDTO3);
        g10.append(", rightHeaderTextAction=");
        g10.append(atomActionDTO);
        g10.append(", products=");
        g10.append(list);
        g10.append(", trackingInfo=");
        g10.append(map);
        g10.append(", productsListAction=");
        g10.append(atomActionDTO2);
        g10.append(")");
        return g10.toString();
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0017\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007HÆ\u0003J7\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001f\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/fresh/geo/widgets/orderInfo/data/OrderInfoDTO$OrderProductDTO;", "", "image", "Lru/ozon/uni/atoms/data/image/ImageDTO;", "openProduct", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "trackingInfo", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Lru/ozon/uni/atoms/data/image/ImageDTO;Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/util/Map;)V", "getImage", "()Lru/ozon/uni/atoms/data/image/ImageDTO;", "getOpenProduct", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "widgets-geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class OrderProductDTO {

        @NotNull
        private final ImageDTO image;
        private final AtomActionDTO openProduct;
        private final Map<String, TokenizedTrackingInfo> trackingInfo;

        public OrderProductDTO(@NotNull ImageDTO image, AtomActionDTO atomActionDTO, Map<String, TokenizedTrackingInfo> map) {
            Intrinsics.checkNotNullParameter(image, "image");
            this.image = image;
            this.openProduct = atomActionDTO;
            this.trackingInfo = map;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ OrderProductDTO copy$default(OrderProductDTO orderProductDTO, ImageDTO imageDTO, AtomActionDTO atomActionDTO, Map map, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                imageDTO = orderProductDTO.image;
            }
            if ((i11 & 2) != 0) {
                atomActionDTO = orderProductDTO.openProduct;
            }
            if ((i11 & 4) != 0) {
                map = orderProductDTO.trackingInfo;
            }
            return orderProductDTO.copy(imageDTO, atomActionDTO, map);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final ImageDTO getImage() {
            return this.image;
        }

        /* renamed from: component2, reason: from getter */
        public final AtomActionDTO getOpenProduct() {
            return this.openProduct;
        }

        public final Map<String, TokenizedTrackingInfo> component3() {
            return this.trackingInfo;
        }

        @NotNull
        public final OrderProductDTO copy(@NotNull ImageDTO image, AtomActionDTO openProduct, Map<String, TokenizedTrackingInfo> trackingInfo) {
            Intrinsics.checkNotNullParameter(image, "image");
            return new OrderProductDTO(image, openProduct, trackingInfo);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof OrderProductDTO)) {
                return false;
            }
            OrderProductDTO orderProductDTO = (OrderProductDTO) other;
            return Intrinsics.d(this.image, orderProductDTO.image) && Intrinsics.d(this.openProduct, orderProductDTO.openProduct) && Intrinsics.d(this.trackingInfo, orderProductDTO.trackingInfo);
        }

        @NotNull
        public final ImageDTO getImage() {
            return this.image;
        }

        public final AtomActionDTO getOpenProduct() {
            return this.openProduct;
        }

        public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
            return this.trackingInfo;
        }

        public int hashCode() {
            int hashCode = this.image.hashCode() * 31;
            AtomActionDTO atomActionDTO = this.openProduct;
            int hashCode2 = (hashCode + (atomActionDTO == null ? 0 : atomActionDTO.hashCode())) * 31;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            return hashCode2 + (map != null ? map.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            ImageDTO imageDTO = this.image;
            AtomActionDTO atomActionDTO = this.openProduct;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            StringBuilder sb2 = new StringBuilder("OrderProductDTO(image=");
            sb2.append(imageDTO);
            sb2.append(", openProduct=");
            sb2.append(atomActionDTO);
            sb2.append(", trackingInfo=");
            return P.f(sb2, map, ")");
        }

        public /* synthetic */ OrderProductDTO(ImageDTO imageDTO, AtomActionDTO atomActionDTO, Map map, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(imageDTO, (i11 & 2) != 0 ? null : atomActionDTO, (i11 & 4) != 0 ? null : map);
        }
    }

    public /* synthetic */ OrderInfoDTO(TextDTO textDTO, TextDTO textDTO2, BadgeDTO badgeDTO, TextDTO textDTO3, AtomActionDTO atomActionDTO, List list, Map map, AtomActionDTO atomActionDTO2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : textDTO, (i11 & 2) != 0 ? null : textDTO2, (i11 & 4) != 0 ? null : badgeDTO, (i11 & 8) != 0 ? null : textDTO3, (i11 & 16) != 0 ? null : atomActionDTO, list, (i11 & 64) != 0 ? null : map, (i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? null : atomActionDTO2);
    }
}
