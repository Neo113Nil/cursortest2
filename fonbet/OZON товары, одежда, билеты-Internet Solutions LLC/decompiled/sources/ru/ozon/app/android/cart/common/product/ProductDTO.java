package ru.ozon.app.android.cart.common.product;

import G.g;
import com.google.android.gms.common.internal.ImagesContract;
import com.squareup.moshi.j;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.cart.common.dynamicElement.DynamicElementDTO;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.badge.Badge;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001)BO\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\r\u0018\u00010\f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0005HÆ\u0003J\u000f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\nHÆ\u0003J\u0017\u0010 \u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\r\u0018\u00010\fHÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\nHÆ\u0003J]\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\r\u0018\u00010\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\nHÆ\u0001J\u0013\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010&\u001a\u00020'HÖ\u0001J\t\u0010(\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u001f\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\r\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0018¨\u0006*"}, d2 = {"Lru/ozon/app/android/cart/common/product/ProductDTO;", "", "id", "", "image", "Lru/ozon/app/android/cart/common/product/ProductDTO$Image;", "dynamicElements", "", "Lru/ozon/app/android/cart/common/dynamicElement/DynamicElementDTO;", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "getAccessoriesAction", "<init>", "(Ljava/lang/String;Lru/ozon/app/android/cart/common/product/ProductDTO$Image;Ljava/util/List;Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/util/Map;Lru/ozon/uni/atoms/data/AtomActionDTO;)V", "getId", "()Ljava/lang/String;", "getImage", "()Lru/ozon/app/android/cart/common/product/ProductDTO$Image;", "getDynamicElements", "()Ljava/util/List;", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getTrackingInfo", "()Ljava/util/Map;", "getGetAccessoriesAction", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "Image", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class ProductDTO {
    public static final int $stable = 8;
    private final AtomActionDTO action;

    @NotNull
    private final List<DynamicElementDTO> dynamicElements;
    private final AtomActionDTO getAccessoriesAction;

    @NotNull
    private final String id;

    @NotNull
    private final Image image;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/cart/common/product/ProductDTO$Image;", "", ImagesContract.URL, "", "badge", "Lru/ozon/uni/atoms/data/badge/Badge;", "<init>", "(Ljava/lang/String;Lru/ozon/uni/atoms/data/badge/Badge;)V", "getUrl", "()Ljava/lang/String;", "getBadge", "()Lru/ozon/uni/atoms/data/badge/Badge;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Image {
        public static final int $stable = Badge.$stable;
        private final Badge badge;

        @NotNull
        private final String url;

        public Image(@NotNull String url, Badge badge) {
            Intrinsics.checkNotNullParameter(url, "url");
            this.url = url;
            this.badge = badge;
        }

        public static /* synthetic */ Image copy$default(Image image, String str, Badge badge, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = image.url;
            }
            if ((i11 & 2) != 0) {
                badge = image.badge;
            }
            return image.copy(str, badge);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getUrl() {
            return this.url;
        }

        /* renamed from: component2, reason: from getter */
        public final Badge getBadge() {
            return this.badge;
        }

        @NotNull
        public final Image copy(@NotNull String url, Badge badge) {
            Intrinsics.checkNotNullParameter(url, "url");
            return new Image(url, badge);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Image)) {
                return false;
            }
            Image image = (Image) other;
            return Intrinsics.d(this.url, image.url) && Intrinsics.d(this.badge, image.badge);
        }

        public final Badge getBadge() {
            return this.badge;
        }

        @NotNull
        public final String getUrl() {
            return this.url;
        }

        public int hashCode() {
            int hashCode = this.url.hashCode() * 31;
            Badge badge = this.badge;
            return hashCode + (badge == null ? 0 : badge.hashCode());
        }

        @NotNull
        public String toString() {
            return "Image(url=" + this.url + ", badge=" + this.badge + ")";
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ProductDTO(@NotNull String id2, @NotNull Image image, @NotNull List<? extends DynamicElementDTO> dynamicElements, AtomActionDTO atomActionDTO, Map<String, TokenizedTrackingInfo> map, AtomActionDTO atomActionDTO2) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(image, "image");
        Intrinsics.checkNotNullParameter(dynamicElements, "dynamicElements");
        this.id = id2;
        this.image = image;
        this.dynamicElements = dynamicElements;
        this.action = atomActionDTO;
        this.trackingInfo = map;
        this.getAccessoriesAction = atomActionDTO2;
    }

    public static /* synthetic */ ProductDTO copy$default(ProductDTO productDTO, String str, Image image, List list, AtomActionDTO atomActionDTO, Map map, AtomActionDTO atomActionDTO2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = productDTO.id;
        }
        if ((i11 & 2) != 0) {
            image = productDTO.image;
        }
        if ((i11 & 4) != 0) {
            list = productDTO.dynamicElements;
        }
        if ((i11 & 8) != 0) {
            atomActionDTO = productDTO.action;
        }
        if ((i11 & 16) != 0) {
            map = productDTO.trackingInfo;
        }
        if ((i11 & 32) != 0) {
            atomActionDTO2 = productDTO.getAccessoriesAction;
        }
        Map map2 = map;
        AtomActionDTO atomActionDTO3 = atomActionDTO2;
        return productDTO.copy(str, image, list, atomActionDTO, map2, atomActionDTO3);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final Image getImage() {
        return this.image;
    }

    @NotNull
    public final List<DynamicElementDTO> component3() {
        return this.dynamicElements;
    }

    /* renamed from: component4, reason: from getter */
    public final AtomActionDTO getAction() {
        return this.action;
    }

    public final Map<String, TokenizedTrackingInfo> component5() {
        return this.trackingInfo;
    }

    /* renamed from: component6, reason: from getter */
    public final AtomActionDTO getGetAccessoriesAction() {
        return this.getAccessoriesAction;
    }

    @NotNull
    public final ProductDTO copy(@NotNull String id2, @NotNull Image image, @NotNull List<? extends DynamicElementDTO> dynamicElements, AtomActionDTO action, Map<String, TokenizedTrackingInfo> trackingInfo, AtomActionDTO getAccessoriesAction) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(image, "image");
        Intrinsics.checkNotNullParameter(dynamicElements, "dynamicElements");
        return new ProductDTO(id2, image, dynamicElements, action, trackingInfo, getAccessoriesAction);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProductDTO)) {
            return false;
        }
        ProductDTO productDTO = (ProductDTO) other;
        return Intrinsics.d(this.id, productDTO.id) && Intrinsics.d(this.image, productDTO.image) && Intrinsics.d(this.dynamicElements, productDTO.dynamicElements) && Intrinsics.d(this.action, productDTO.action) && Intrinsics.d(this.trackingInfo, productDTO.trackingInfo) && Intrinsics.d(this.getAccessoriesAction, productDTO.getAccessoriesAction);
    }

    public final AtomActionDTO getAction() {
        return this.action;
    }

    @NotNull
    public final List<DynamicElementDTO> getDynamicElements() {
        return this.dynamicElements;
    }

    public final AtomActionDTO getGetAccessoriesAction() {
        return this.getAccessoriesAction;
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    @NotNull
    public final Image getImage() {
        return this.image;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        int b11 = g.b((this.image.hashCode() + (this.id.hashCode() * 31)) * 31, 31, this.dynamicElements);
        AtomActionDTO atomActionDTO = this.action;
        int hashCode = (b11 + (atomActionDTO == null ? 0 : atomActionDTO.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        int hashCode2 = (hashCode + (map == null ? 0 : map.hashCode())) * 31;
        AtomActionDTO atomActionDTO2 = this.getAccessoriesAction;
        return hashCode2 + (atomActionDTO2 != null ? atomActionDTO2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "ProductDTO(id=" + this.id + ", image=" + this.image + ", dynamicElements=" + this.dynamicElements + ", action=" + this.action + ", trackingInfo=" + this.trackingInfo + ", getAccessoriesAction=" + this.getAccessoriesAction + ")";
    }
}
