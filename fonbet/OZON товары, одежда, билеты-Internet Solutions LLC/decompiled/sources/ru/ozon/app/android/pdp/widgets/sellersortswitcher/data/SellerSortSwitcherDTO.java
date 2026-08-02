package ru.ozon.app.android.pdp.widgets.sellersortswitcher.data;

import G.g;
import N3.C3660k;
import Pk0.a;
import V.e;
import com.squareup.moshi.j;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.checkoutcomposer.common.splitDynamicElements.data.DynamicElementDTO;
import ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.data.ReviewGalleryV2DTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\u0017\u0018B\u001f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J%\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/pdp/widgets/sellersortswitcher/data/SellerSortSwitcherDTO;", "", ReviewGalleryV2DTO.ReviewGalleryV2Item.ItemsContainerDTO.PRODUCT_FIELD_NAME, "Lru/ozon/app/android/pdp/widgets/sellersortswitcher/data/SellerSortSwitcherDTO$ProductDTO;", DynamicElementDTO.TABS, "", "Lru/ozon/app/android/pdp/widgets/sellersortswitcher/data/SellerSortSwitcherDTO$TabDTO;", "<init>", "(Lru/ozon/app/android/pdp/widgets/sellersortswitcher/data/SellerSortSwitcherDTO$ProductDTO;Ljava/util/List;)V", "getProduct", "()Lru/ozon/app/android/pdp/widgets/sellersortswitcher/data/SellerSortSwitcherDTO$ProductDTO;", "getTabs", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "ProductDTO", "TabDTO", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class SellerSortSwitcherDTO {
    public static final int $stable = 8;
    private final ProductDTO product;

    @NotNull
    private final List<TabDTO> tabs;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/pdp/widgets/sellersortswitcher/data/SellerSortSwitcherDTO$ProductDTO;", "", "image", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getImage", "()Ljava/lang/String;", "getTitle", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ProductDTO {
        public static final int $stable = 0;

        @NotNull
        private final String image;

        @NotNull
        private final String title;

        public ProductDTO(@NotNull String image, @NotNull String title) {
            Intrinsics.checkNotNullParameter(image, "image");
            Intrinsics.checkNotNullParameter(title, "title");
            this.image = image;
            this.title = title;
        }

        public static /* synthetic */ ProductDTO copy$default(ProductDTO productDTO, String str, String str2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = productDTO.image;
            }
            if ((i11 & 2) != 0) {
                str2 = productDTO.title;
            }
            return productDTO.copy(str, str2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getImage() {
            return this.image;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        @NotNull
        public final ProductDTO copy(@NotNull String image, @NotNull String title) {
            Intrinsics.checkNotNullParameter(image, "image");
            Intrinsics.checkNotNullParameter(title, "title");
            return new ProductDTO(image, title);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ProductDTO)) {
                return false;
            }
            ProductDTO productDTO = (ProductDTO) other;
            return Intrinsics.d(this.image, productDTO.image) && Intrinsics.d(this.title, productDTO.title);
        }

        @NotNull
        public final String getImage() {
            return this.image;
        }

        @NotNull
        public final String getTitle() {
            return this.title;
        }

        public int hashCode() {
            return this.title.hashCode() + (this.image.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return e.a("ProductDTO(image=", this.image, ", title=", this.title, ")");
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0006HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00062\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\f¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/pdp/widgets/sellersortswitcher/data/SellerSortSwitcherDTO$TabDTO;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "", "deeplink", "isActive", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Z)V", "getTitle", "()Ljava/lang/String;", "getDeeplink", "()Z", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class TabDTO {
        public static final int $stable = 0;

        @NotNull
        private final String deeplink;
        private final boolean isActive;

        @NotNull
        private final String title;

        public TabDTO(@NotNull String title, @NotNull String deeplink, boolean z11) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(deeplink, "deeplink");
            this.title = title;
            this.deeplink = deeplink;
            this.isActive = z11;
        }

        public static /* synthetic */ TabDTO copy$default(TabDTO tabDTO, String str, String str2, boolean z11, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = tabDTO.title;
            }
            if ((i11 & 2) != 0) {
                str2 = tabDTO.deeplink;
            }
            if ((i11 & 4) != 0) {
                z11 = tabDTO.isActive;
            }
            return tabDTO.copy(str, str2, z11);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final String getDeeplink() {
            return this.deeplink;
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getIsActive() {
            return this.isActive;
        }

        @NotNull
        public final TabDTO copy(@NotNull String title, @NotNull String deeplink, boolean isActive) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(deeplink, "deeplink");
            return new TabDTO(title, deeplink, isActive);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TabDTO)) {
                return false;
            }
            TabDTO tabDTO = (TabDTO) other;
            return Intrinsics.d(this.title, tabDTO.title) && Intrinsics.d(this.deeplink, tabDTO.deeplink) && this.isActive == tabDTO.isActive;
        }

        @NotNull
        public final String getDeeplink() {
            return this.deeplink;
        }

        @NotNull
        public final String getTitle() {
            return this.title;
        }

        public int hashCode() {
            return Boolean.hashCode(this.isActive) + g.a(this.title.hashCode() * 31, 31, this.deeplink);
        }

        public final boolean isActive() {
            return this.isActive;
        }

        @NotNull
        public String toString() {
            String str = this.title;
            String str2 = this.deeplink;
            return a.a(")", C3660k.d("TabDTO(title=", str, ", deeplink=", str2, ", isActive="), this.isActive);
        }
    }

    public SellerSortSwitcherDTO(ProductDTO productDTO, @NotNull List<TabDTO> tabs) {
        Intrinsics.checkNotNullParameter(tabs, "tabs");
        this.product = productDTO;
        this.tabs = tabs;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SellerSortSwitcherDTO copy$default(SellerSortSwitcherDTO sellerSortSwitcherDTO, ProductDTO productDTO, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            productDTO = sellerSortSwitcherDTO.product;
        }
        if ((i11 & 2) != 0) {
            list = sellerSortSwitcherDTO.tabs;
        }
        return sellerSortSwitcherDTO.copy(productDTO, list);
    }

    /* renamed from: component1, reason: from getter */
    public final ProductDTO getProduct() {
        return this.product;
    }

    @NotNull
    public final List<TabDTO> component2() {
        return this.tabs;
    }

    @NotNull
    public final SellerSortSwitcherDTO copy(ProductDTO product, @NotNull List<TabDTO> tabs) {
        Intrinsics.checkNotNullParameter(tabs, "tabs");
        return new SellerSortSwitcherDTO(product, tabs);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SellerSortSwitcherDTO)) {
            return false;
        }
        SellerSortSwitcherDTO sellerSortSwitcherDTO = (SellerSortSwitcherDTO) other;
        return Intrinsics.d(this.product, sellerSortSwitcherDTO.product) && Intrinsics.d(this.tabs, sellerSortSwitcherDTO.tabs);
    }

    public final ProductDTO getProduct() {
        return this.product;
    }

    @NotNull
    public final List<TabDTO> getTabs() {
        return this.tabs;
    }

    public int hashCode() {
        ProductDTO productDTO = this.product;
        return this.tabs.hashCode() + ((productDTO == null ? 0 : productDTO.hashCode()) * 31);
    }

    @NotNull
    public String toString() {
        return "SellerSortSwitcherDTO(product=" + this.product + ", tabs=" + this.tabs + ")";
    }
}
