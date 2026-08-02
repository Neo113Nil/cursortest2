package ru.ozon.app.android.cart.cartSplitV2.v2.subwidgets.presentation.product.productView;

import G.g;
import Tl.b;
import com.squareup.moshi.j;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.cart.cartSplitV2.v2.dynamicElementV2.DynamicElementDTOV2;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.productMedia.ProductMediaDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\bHÆ\u0003J\u0017\u0010\u001d\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nHÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\rHÆ\u0003JS\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\rHÆ\u0001J\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010#\u001a\u00020$HÖ\u0001J\t\u0010%\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u001f\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019¨\u0006&"}, d2 = {"Lru/ozon/app/android/cart/cartSplitV2/v2/subwidgets/presentation/product/productView/ProductDTOV2;", "", "id", "", "dynamicElements", "", "Lru/ozon/app/android/cart/cartSplitV2/v2/dynamicElementV2/DynamicElementDTOV2;", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "media", "Lru/ozon/uni/atoms/data/productMedia/ProductMediaDTO;", "<init>", "(Ljava/lang/String;Ljava/util/List;Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/util/Map;Lru/ozon/uni/atoms/data/productMedia/ProductMediaDTO;)V", "getId", "()Ljava/lang/String;", "getDynamicElements", "()Ljava/util/List;", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getTrackingInfo", "()Ljava/util/Map;", "getMedia", "()Lru/ozon/uni/atoms/data/productMedia/ProductMediaDTO;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class ProductDTOV2 {
    public static final int $stable = 8;
    private final AtomActionDTO action;

    @NotNull
    private final List<DynamicElementDTOV2> dynamicElements;

    @NotNull
    private final String id;
    private final ProductMediaDTO media;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    /* JADX WARN: Multi-variable type inference failed */
    public ProductDTOV2(@NotNull String id2, @NotNull List<? extends DynamicElementDTOV2> dynamicElements, AtomActionDTO atomActionDTO, Map<String, TokenizedTrackingInfo> map, ProductMediaDTO productMediaDTO) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(dynamicElements, "dynamicElements");
        this.id = id2;
        this.dynamicElements = dynamicElements;
        this.action = atomActionDTO;
        this.trackingInfo = map;
        this.media = productMediaDTO;
    }

    public static /* synthetic */ ProductDTOV2 copy$default(ProductDTOV2 productDTOV2, String str, List list, AtomActionDTO atomActionDTO, Map map, ProductMediaDTO productMediaDTO, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = productDTOV2.id;
        }
        if ((i11 & 2) != 0) {
            list = productDTOV2.dynamicElements;
        }
        if ((i11 & 4) != 0) {
            atomActionDTO = productDTOV2.action;
        }
        if ((i11 & 8) != 0) {
            map = productDTOV2.trackingInfo;
        }
        if ((i11 & 16) != 0) {
            productMediaDTO = productDTOV2.media;
        }
        ProductMediaDTO productMediaDTO2 = productMediaDTO;
        AtomActionDTO atomActionDTO2 = atomActionDTO;
        return productDTOV2.copy(str, list, atomActionDTO2, map, productMediaDTO2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @NotNull
    public final List<DynamicElementDTOV2> component2() {
        return this.dynamicElements;
    }

    /* renamed from: component3, reason: from getter */
    public final AtomActionDTO getAction() {
        return this.action;
    }

    public final Map<String, TokenizedTrackingInfo> component4() {
        return this.trackingInfo;
    }

    /* renamed from: component5, reason: from getter */
    public final ProductMediaDTO getMedia() {
        return this.media;
    }

    @NotNull
    public final ProductDTOV2 copy(@NotNull String id2, @NotNull List<? extends DynamicElementDTOV2> dynamicElements, AtomActionDTO action, Map<String, TokenizedTrackingInfo> trackingInfo, ProductMediaDTO media) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(dynamicElements, "dynamicElements");
        return new ProductDTOV2(id2, dynamicElements, action, trackingInfo, media);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProductDTOV2)) {
            return false;
        }
        ProductDTOV2 productDTOV2 = (ProductDTOV2) other;
        return Intrinsics.d(this.id, productDTOV2.id) && Intrinsics.d(this.dynamicElements, productDTOV2.dynamicElements) && Intrinsics.d(this.action, productDTOV2.action) && Intrinsics.d(this.trackingInfo, productDTOV2.trackingInfo) && Intrinsics.d(this.media, productDTOV2.media);
    }

    public final AtomActionDTO getAction() {
        return this.action;
    }

    @NotNull
    public final List<DynamicElementDTOV2> getDynamicElements() {
        return this.dynamicElements;
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    public final ProductMediaDTO getMedia() {
        return this.media;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        int b11 = g.b(this.id.hashCode() * 31, 31, this.dynamicElements);
        AtomActionDTO atomActionDTO = this.action;
        int hashCode = (b11 + (atomActionDTO == null ? 0 : atomActionDTO.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        int hashCode2 = (hashCode + (map == null ? 0 : map.hashCode())) * 31;
        ProductMediaDTO productMediaDTO = this.media;
        return hashCode2 + (productMediaDTO != null ? productMediaDTO.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.id;
        List<DynamicElementDTOV2> list = this.dynamicElements;
        AtomActionDTO atomActionDTO = this.action;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        ProductMediaDTO productMediaDTO = this.media;
        StringBuilder f7 = b.f("ProductDTOV2(id=", str, ", dynamicElements=", ", action=", list);
        Sh.b.f(f7, atomActionDTO, ", trackingInfo=", map, ", media=");
        f7.append(productMediaDTO);
        f7.append(")");
        return f7.toString();
    }
}
