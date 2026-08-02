package ru.ozon.app.android.fresh.checkout.widgets.checkoutProducts.data;

import G.g;
import K1.G;
import Kk.c;
import Ns.b;
import com.squareup.moshi.j;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.fresh.common.widgets.molecules.productMedia.data.ProductMediaDTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.moshi.adapters.serialize.proto.ProtoOneOf;
import ru.ozon.moshi.adapters.serialize.proto.ProtoOneOfSignature;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001:\u0001\u0018B+\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0017\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006HÆ\u0003J1\u0010\u0011\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0016\b\u0002\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0007HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001f\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/fresh/checkout/widgets/checkoutProducts/data/CheckoutProductsDTO;", "", "items", "", "Lru/ozon/app/android/fresh/checkout/widgets/checkoutProducts/data/CheckoutProductsDTO$ProductSplitDTO;", "viewTrackingInfo", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Ljava/util/List;Ljava/util/Map;)V", "getItems", "()Ljava/util/List;", "getViewTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "ProductSplitDTO", "widgets-checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class CheckoutProductsDTO {
    public static final int $stable = 8;

    @NotNull
    private final List<ProductSplitDTO> items;
    private final Map<String, TokenizedTrackingInfo> viewTrackingInfo;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u000e\b\u0001\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u0006\u0012\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00010\u0006HÆ\u0003J\u0017\u0010\u001b\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\bHÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\fHÆ\u0003JQ\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\b\u0003\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u00062\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\fHÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\"HÖ\u0001J\t\u0010#\u001a\u00020\tHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u001f\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006$"}, d2 = {"Lru/ozon/app/android/fresh/checkout/widgets/checkoutProducts/data/CheckoutProductsDTO$ProductSplitDTO;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/text/TextDTO;", "subtitle", "images", "", "trackingInfo", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "clickAction", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Ljava/util/List;Ljava/util/Map;Lru/ozon/uni/atoms/data/AtomActionDTO;)V", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getSubtitle", "getImages", "()Ljava/util/List;", "getTrackingInfo", "()Ljava/util/Map;", "getClickAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "widgets-checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ProductSplitDTO {
        public static final int $stable = 8;
        private final AtomActionDTO clickAction;

        @NotNull
        private final List<Object> images;

        @NotNull
        private final TextDTO subtitle;

        @NotNull
        private final TextDTO title;
        private final Map<String, TokenizedTrackingInfo> trackingInfo;

        public ProductSplitDTO(@NotNull TextDTO title, @NotNull TextDTO subtitle, @ProtoOneOfSignature.Container({@ProtoOneOfSignature(name = "productMedia", type = ProductMediaDTO.class), @ProtoOneOfSignature(name = "icon", type = IconDTO.class)}) @NotNull @ProtoOneOf List<? extends Object> images, Map<String, TokenizedTrackingInfo> map, AtomActionDTO atomActionDTO) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(subtitle, "subtitle");
            Intrinsics.checkNotNullParameter(images, "images");
            this.title = title;
            this.subtitle = subtitle;
            this.images = images;
            this.trackingInfo = map;
            this.clickAction = atomActionDTO;
        }

        public static /* synthetic */ ProductSplitDTO copy$default(ProductSplitDTO productSplitDTO, TextDTO textDTO, TextDTO textDTO2, List list, Map map, AtomActionDTO atomActionDTO, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                textDTO = productSplitDTO.title;
            }
            if ((i11 & 2) != 0) {
                textDTO2 = productSplitDTO.subtitle;
            }
            if ((i11 & 4) != 0) {
                list = productSplitDTO.images;
            }
            if ((i11 & 8) != 0) {
                map = productSplitDTO.trackingInfo;
            }
            if ((i11 & 16) != 0) {
                atomActionDTO = productSplitDTO.clickAction;
            }
            AtomActionDTO atomActionDTO2 = atomActionDTO;
            List list2 = list;
            return productSplitDTO.copy(textDTO, textDTO2, list2, map, atomActionDTO2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final TextDTO getTitle() {
            return this.title;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final TextDTO getSubtitle() {
            return this.subtitle;
        }

        @NotNull
        public final List<Object> component3() {
            return this.images;
        }

        public final Map<String, TokenizedTrackingInfo> component4() {
            return this.trackingInfo;
        }

        /* renamed from: component5, reason: from getter */
        public final AtomActionDTO getClickAction() {
            return this.clickAction;
        }

        @NotNull
        public final ProductSplitDTO copy(@NotNull TextDTO title, @NotNull TextDTO subtitle, @ProtoOneOfSignature.Container({@ProtoOneOfSignature(name = "productMedia", type = ProductMediaDTO.class), @ProtoOneOfSignature(name = "icon", type = IconDTO.class)}) @NotNull @ProtoOneOf List<? extends Object> images, Map<String, TokenizedTrackingInfo> trackingInfo, AtomActionDTO clickAction) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(subtitle, "subtitle");
            Intrinsics.checkNotNullParameter(images, "images");
            return new ProductSplitDTO(title, subtitle, images, trackingInfo, clickAction);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ProductSplitDTO)) {
                return false;
            }
            ProductSplitDTO productSplitDTO = (ProductSplitDTO) other;
            return Intrinsics.d(this.title, productSplitDTO.title) && Intrinsics.d(this.subtitle, productSplitDTO.subtitle) && Intrinsics.d(this.images, productSplitDTO.images) && Intrinsics.d(this.trackingInfo, productSplitDTO.trackingInfo) && Intrinsics.d(this.clickAction, productSplitDTO.clickAction);
        }

        public final AtomActionDTO getClickAction() {
            return this.clickAction;
        }

        @NotNull
        public final List<Object> getImages() {
            return this.images;
        }

        @NotNull
        public final TextDTO getSubtitle() {
            return this.subtitle;
        }

        @NotNull
        public final TextDTO getTitle() {
            return this.title;
        }

        public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
            return this.trackingInfo;
        }

        public int hashCode() {
            int b11 = g.b(b.a(this.subtitle, this.title.hashCode() * 31, 31), 31, this.images);
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            int hashCode = (b11 + (map == null ? 0 : map.hashCode())) * 31;
            AtomActionDTO atomActionDTO = this.clickAction;
            return hashCode + (atomActionDTO != null ? atomActionDTO.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            TextDTO textDTO = this.title;
            TextDTO textDTO2 = this.subtitle;
            List<Object> list = this.images;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            AtomActionDTO atomActionDTO = this.clickAction;
            StringBuilder g10 = D3.g.g("ProductSplitDTO(title=", textDTO, ", subtitle=", textDTO2, ", images=");
            g10.append(list);
            g10.append(", trackingInfo=");
            g10.append(map);
            g10.append(", clickAction=");
            return G.c(g10, atomActionDTO, ")");
        }
    }

    public CheckoutProductsDTO(@NotNull List<ProductSplitDTO> items, Map<String, TokenizedTrackingInfo> map) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.items = items;
        this.viewTrackingInfo = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CheckoutProductsDTO copy$default(CheckoutProductsDTO checkoutProductsDTO, List list, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = checkoutProductsDTO.items;
        }
        if ((i11 & 2) != 0) {
            map = checkoutProductsDTO.viewTrackingInfo;
        }
        return checkoutProductsDTO.copy(list, map);
    }

    @NotNull
    public final List<ProductSplitDTO> component1() {
        return this.items;
    }

    public final Map<String, TokenizedTrackingInfo> component2() {
        return this.viewTrackingInfo;
    }

    @NotNull
    public final CheckoutProductsDTO copy(@NotNull List<ProductSplitDTO> items, Map<String, TokenizedTrackingInfo> viewTrackingInfo) {
        Intrinsics.checkNotNullParameter(items, "items");
        return new CheckoutProductsDTO(items, viewTrackingInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CheckoutProductsDTO)) {
            return false;
        }
        CheckoutProductsDTO checkoutProductsDTO = (CheckoutProductsDTO) other;
        return Intrinsics.d(this.items, checkoutProductsDTO.items) && Intrinsics.d(this.viewTrackingInfo, checkoutProductsDTO.viewTrackingInfo);
    }

    @NotNull
    public final List<ProductSplitDTO> getItems() {
        return this.items;
    }

    public final Map<String, TokenizedTrackingInfo> getViewTrackingInfo() {
        return this.viewTrackingInfo;
    }

    public int hashCode() {
        int hashCode = this.items.hashCode() * 31;
        Map<String, TokenizedTrackingInfo> map = this.viewTrackingInfo;
        return hashCode + (map == null ? 0 : map.hashCode());
    }

    @NotNull
    public String toString() {
        return c.d("CheckoutProductsDTO(items=", ", viewTrackingInfo=", ")", this.items, this.viewTrackingInfo);
    }
}
