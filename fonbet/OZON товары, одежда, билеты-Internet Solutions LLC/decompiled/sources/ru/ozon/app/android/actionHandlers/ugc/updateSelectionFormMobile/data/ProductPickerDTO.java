package ru.ozon.app.android.actionHandlers.ugc.updateSelectionFormMobile.data;

import B90.C2618u;
import D40.a;
import G.g;
import com.squareup.moshi.j;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.K;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u001aB-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0005¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u000f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\b0\u0005HÆ\u0003J3\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0005HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000e¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/actionHandlers/ugc/updateSelectionFormMobile/data/ProductPickerDTO;", "", "addProduct", "Lru/ozon/app/android/actionHandlers/ugc/updateSelectionFormMobile/data/ProductPickerDTO$AddProductDTO;", "products", "", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "uploadValue", "", "<init>", "(Lru/ozon/app/android/actionHandlers/ugc/updateSelectionFormMobile/data/ProductPickerDTO$AddProductDTO;Ljava/util/List;Ljava/util/List;)V", "getAddProduct", "()Lru/ozon/app/android/actionHandlers/ugc/updateSelectionFormMobile/data/ProductPickerDTO$AddProductDTO;", "getProducts", "()Ljava/util/List;", "getUploadValue", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "AddProductDTO", "action-handlers_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class ProductPickerDTO {

    @NotNull
    private final AddProductDTO addProduct;

    @NotNull
    private final List<CellDTO> products;

    @NotNull
    private final List<String> uploadValue;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u0017\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\n\u0018\u00010\tHÆ\u0003JC\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\n\u0018\u00010\tHÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u001f\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006 "}, d2 = {"Lru/ozon/app/android/actionHandlers/ugc/updateSelectionFormMobile/data/ProductPickerDTO$AddProductDTO;", "", "icon", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "backgroundColor", "", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Lru/ozon/uni/atoms/data/icon/IconDTO;Ljava/lang/String;Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/util/Map;)V", "getIcon", "()Lru/ozon/uni/atoms/data/icon/IconDTO;", "getBackgroundColor", "()Ljava/lang/String;", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "action-handlers_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class AddProductDTO {
        private final AtomActionDTO action;
        private final String backgroundColor;

        @NotNull
        private final IconDTO icon;
        private final Map<String, TokenizedTrackingInfo> trackingInfo;

        public AddProductDTO(@NotNull IconDTO icon, String str, AtomActionDTO atomActionDTO, Map<String, TokenizedTrackingInfo> map) {
            Intrinsics.checkNotNullParameter(icon, "icon");
            this.icon = icon;
            this.backgroundColor = str;
            this.action = atomActionDTO;
            this.trackingInfo = map;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ AddProductDTO copy$default(AddProductDTO addProductDTO, IconDTO iconDTO, String str, AtomActionDTO atomActionDTO, Map map, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                iconDTO = addProductDTO.icon;
            }
            if ((i11 & 2) != 0) {
                str = addProductDTO.backgroundColor;
            }
            if ((i11 & 4) != 0) {
                atomActionDTO = addProductDTO.action;
            }
            if ((i11 & 8) != 0) {
                map = addProductDTO.trackingInfo;
            }
            return addProductDTO.copy(iconDTO, str, atomActionDTO, map);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final IconDTO getIcon() {
            return this.icon;
        }

        /* renamed from: component2, reason: from getter */
        public final String getBackgroundColor() {
            return this.backgroundColor;
        }

        /* renamed from: component3, reason: from getter */
        public final AtomActionDTO getAction() {
            return this.action;
        }

        public final Map<String, TokenizedTrackingInfo> component4() {
            return this.trackingInfo;
        }

        @NotNull
        public final AddProductDTO copy(@NotNull IconDTO icon, String backgroundColor, AtomActionDTO action, Map<String, TokenizedTrackingInfo> trackingInfo) {
            Intrinsics.checkNotNullParameter(icon, "icon");
            return new AddProductDTO(icon, backgroundColor, action, trackingInfo);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AddProductDTO)) {
                return false;
            }
            AddProductDTO addProductDTO = (AddProductDTO) other;
            return Intrinsics.d(this.icon, addProductDTO.icon) && Intrinsics.d(this.backgroundColor, addProductDTO.backgroundColor) && Intrinsics.d(this.action, addProductDTO.action) && Intrinsics.d(this.trackingInfo, addProductDTO.trackingInfo);
        }

        public final AtomActionDTO getAction() {
            return this.action;
        }

        public final String getBackgroundColor() {
            return this.backgroundColor;
        }

        @NotNull
        public final IconDTO getIcon() {
            return this.icon;
        }

        public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
            return this.trackingInfo;
        }

        public int hashCode() {
            int hashCode = this.icon.hashCode() * 31;
            String str = this.backgroundColor;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            AtomActionDTO atomActionDTO = this.action;
            int hashCode3 = (hashCode2 + (atomActionDTO == null ? 0 : atomActionDTO.hashCode())) * 31;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            return hashCode3 + (map != null ? map.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            IconDTO iconDTO = this.icon;
            String str = this.backgroundColor;
            AtomActionDTO atomActionDTO = this.action;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            StringBuilder sb2 = new StringBuilder("AddProductDTO(icon=");
            sb2.append(iconDTO);
            sb2.append(", backgroundColor=");
            sb2.append(str);
            sb2.append(", action=");
            return a.d(sb2, atomActionDTO, ", trackingInfo=", map, ")");
        }
    }

    public ProductPickerDTO(@NotNull AddProductDTO addProduct, @NotNull List<CellDTO> products, @NotNull List<String> uploadValue) {
        Intrinsics.checkNotNullParameter(addProduct, "addProduct");
        Intrinsics.checkNotNullParameter(products, "products");
        Intrinsics.checkNotNullParameter(uploadValue, "uploadValue");
        this.addProduct = addProduct;
        this.products = products;
        this.uploadValue = uploadValue;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ProductPickerDTO copy$default(ProductPickerDTO productPickerDTO, AddProductDTO addProductDTO, List list, List list2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            addProductDTO = productPickerDTO.addProduct;
        }
        if ((i11 & 2) != 0) {
            list = productPickerDTO.products;
        }
        if ((i11 & 4) != 0) {
            list2 = productPickerDTO.uploadValue;
        }
        return productPickerDTO.copy(addProductDTO, list, list2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final AddProductDTO getAddProduct() {
        return this.addProduct;
    }

    @NotNull
    public final List<CellDTO> component2() {
        return this.products;
    }

    @NotNull
    public final List<String> component3() {
        return this.uploadValue;
    }

    @NotNull
    public final ProductPickerDTO copy(@NotNull AddProductDTO addProduct, @NotNull List<CellDTO> products, @NotNull List<String> uploadValue) {
        Intrinsics.checkNotNullParameter(addProduct, "addProduct");
        Intrinsics.checkNotNullParameter(products, "products");
        Intrinsics.checkNotNullParameter(uploadValue, "uploadValue");
        return new ProductPickerDTO(addProduct, products, uploadValue);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProductPickerDTO)) {
            return false;
        }
        ProductPickerDTO productPickerDTO = (ProductPickerDTO) other;
        return Intrinsics.d(this.addProduct, productPickerDTO.addProduct) && Intrinsics.d(this.products, productPickerDTO.products) && Intrinsics.d(this.uploadValue, productPickerDTO.uploadValue);
    }

    @NotNull
    public final AddProductDTO getAddProduct() {
        return this.addProduct;
    }

    @NotNull
    public final List<CellDTO> getProducts() {
        return this.products;
    }

    @NotNull
    public final List<String> getUploadValue() {
        return this.uploadValue;
    }

    public int hashCode() {
        return this.uploadValue.hashCode() + g.b(this.addProduct.hashCode() * 31, 31, this.products);
    }

    @NotNull
    public String toString() {
        AddProductDTO addProductDTO = this.addProduct;
        List<CellDTO> list = this.products;
        List<String> list2 = this.uploadValue;
        StringBuilder sb2 = new StringBuilder("ProductPickerDTO(addProduct=");
        sb2.append(addProductDTO);
        sb2.append(", products=");
        sb2.append(list);
        sb2.append(", uploadValue=");
        return C2618u.h(sb2, list2, ")");
    }

    public ProductPickerDTO(AddProductDTO addProductDTO, List list, List list2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(addProductDTO, list, (i11 & 4) != 0 ? K.f71697a : list2);
    }
}
