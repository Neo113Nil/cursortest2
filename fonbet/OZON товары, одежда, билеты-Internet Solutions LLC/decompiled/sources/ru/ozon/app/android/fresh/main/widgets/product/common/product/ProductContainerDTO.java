package ru.ozon.app.android.fresh.main.widgets.product.common.product;

import Ef0.c;
import com.squareup.moshi.j;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@j(generateAdapter = true)
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0017B\u001f\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0003J%\u0010\u000f\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/fresh/main/widgets/product/common/product/ProductContainerDTO;", "", "products", "", "Lru/ozon/app/android/fresh/main/widgets/product/common/product/ProductDTO;", "options", "Lru/ozon/app/android/fresh/main/widgets/product/common/product/ProductContainerDTO$Options;", "<init>", "(Ljava/util/List;Lru/ozon/app/android/fresh/main/widgets/product/common/product/ProductContainerDTO$Options;)V", "getProducts", "()Ljava/util/List;", "getOptions", "()Lru/ozon/app/android/fresh/main/widgets/product/common/product/ProductContainerDTO$Options;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Options", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class ProductContainerDTO {
    private final Options options;

    @NotNull
    private final List<ProductDTO> products;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u00032\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/fresh/main/widgets/product/common/product/ProductContainerDTO$Options;", "", "imageGrey", "", "itemsAreFaded", "<init>", "(ZZ)V", "getImageGrey", "()Z", "getItemsAreFaded", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Options {
        private final boolean imageGrey;
        private final boolean itemsAreFaded;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Options() {
            this(r2, r2, 3, null);
            boolean z11 = false;
        }

        public static /* synthetic */ Options copy$default(Options options, boolean z11, boolean z12, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                z11 = options.imageGrey;
            }
            if ((i11 & 2) != 0) {
                z12 = options.itemsAreFaded;
            }
            return options.copy(z11, z12);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getImageGrey() {
            return this.imageGrey;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getItemsAreFaded() {
            return this.itemsAreFaded;
        }

        @NotNull
        public final Options copy(boolean imageGrey, boolean itemsAreFaded) {
            return new Options(imageGrey, itemsAreFaded);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Options)) {
                return false;
            }
            Options options = (Options) other;
            return this.imageGrey == options.imageGrey && this.itemsAreFaded == options.itemsAreFaded;
        }

        public final boolean getImageGrey() {
            return this.imageGrey;
        }

        public final boolean getItemsAreFaded() {
            return this.itemsAreFaded;
        }

        public int hashCode() {
            return Boolean.hashCode(this.itemsAreFaded) + (Boolean.hashCode(this.imageGrey) * 31);
        }

        @NotNull
        public String toString() {
            return c.c("Options(imageGrey=", ", itemsAreFaded=", ")", this.imageGrey, this.itemsAreFaded);
        }

        public Options(boolean z11, boolean z12) {
            this.imageGrey = z11;
            this.itemsAreFaded = z12;
        }

        public /* synthetic */ Options(boolean z11, boolean z12, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? false : z11, (i11 & 2) != 0 ? false : z12);
        }
    }

    public ProductContainerDTO(@NotNull List<ProductDTO> products, Options options) {
        Intrinsics.checkNotNullParameter(products, "products");
        this.products = products;
        this.options = options;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ProductContainerDTO copy$default(ProductContainerDTO productContainerDTO, List list, Options options, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = productContainerDTO.products;
        }
        if ((i11 & 2) != 0) {
            options = productContainerDTO.options;
        }
        return productContainerDTO.copy(list, options);
    }

    @NotNull
    public final List<ProductDTO> component1() {
        return this.products;
    }

    /* renamed from: component2, reason: from getter */
    public final Options getOptions() {
        return this.options;
    }

    @NotNull
    public final ProductContainerDTO copy(@NotNull List<ProductDTO> products, Options options) {
        Intrinsics.checkNotNullParameter(products, "products");
        return new ProductContainerDTO(products, options);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProductContainerDTO)) {
            return false;
        }
        ProductContainerDTO productContainerDTO = (ProductContainerDTO) other;
        return Intrinsics.d(this.products, productContainerDTO.products) && Intrinsics.d(this.options, productContainerDTO.options);
    }

    public final Options getOptions() {
        return this.options;
    }

    @NotNull
    public final List<ProductDTO> getProducts() {
        return this.products;
    }

    public int hashCode() {
        int hashCode = this.products.hashCode() * 31;
        Options options = this.options;
        return hashCode + (options == null ? 0 : options.hashCode());
    }

    @NotNull
    public String toString() {
        return "ProductContainerDTO(products=" + this.products + ", options=" + this.options + ")";
    }
}
