package ru.ozon.app.android.sellerproducts.sellerProducts.data.model;

import C.o0;
import Kk.C3532b;
import Lh.a;
import com.squareup.moshi.j;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@j(generateAdapter = true)
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u0000 \u001d2\u00020\u0001:\u0002\u001d\u001eB\u001f\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ,\u0010\r\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0019\u001a\u0004\b\u001a\u0010\nR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u001c\u0010\f¨\u0006\u001f"}, d2 = {"Lru/ozon/app/android/sellerproducts/sellerProducts/data/model/ProductContainerDTO;", "", "", "Lru/ozon/app/android/sellerproducts/sellerProducts/data/model/ProductDTO;", "products", "Lru/ozon/app/android/sellerproducts/sellerProducts/data/model/ProductContainerDTO$Options;", "options", "<init>", "(Ljava/util/List;Lru/ozon/app/android/sellerproducts/sellerProducts/data/model/ProductContainerDTO$Options;)V", "component1", "()Ljava/util/List;", "component2", "()Lru/ozon/app/android/sellerproducts/sellerProducts/data/model/ProductContainerDTO$Options;", "copy", "(Ljava/util/List;Lru/ozon/app/android/sellerproducts/sellerProducts/data/model/ProductContainerDTO$Options;)Lru/ozon/app/android/sellerproducts/sellerProducts/data/model/ProductContainerDTO;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getProducts", "Lru/ozon/app/android/sellerproducts/sellerProducts/data/model/ProductContainerDTO$Options;", "getOptions", "Companion", "Options", "sellerproducts_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class ProductContainerDTO {

    @NotNull
    public static final String DEFAULT_RATIO = "1:1";
    public static final float DEFAULT_RATIO_F = 1.0f;

    @NotNull
    public static final String RATIO_DELIMITER = ":";
    private final Options options;

    @NotNull
    private final List<ProductDTO> products;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0006HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00032\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0006HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/sellerproducts/sellerProducts/data/model/ProductContainerDTO$Options;", "", "imageGrey", "", "itemsAreFaded", "ratio", "", "<init>", "(ZZLjava/lang/String;)V", "getImageGrey", "()Z", "getItemsAreFaded", "getRatio", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "sellerproducts_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Options {
        private final boolean imageGrey;
        private final boolean itemsAreFaded;

        @NotNull
        private final String ratio;

        public Options() {
            this(false, false, null, 7, null);
        }

        public static /* synthetic */ Options copy$default(Options options, boolean z11, boolean z12, String str, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                z11 = options.imageGrey;
            }
            if ((i11 & 2) != 0) {
                z12 = options.itemsAreFaded;
            }
            if ((i11 & 4) != 0) {
                str = options.ratio;
            }
            return options.copy(z11, z12, str);
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
        /* renamed from: component3, reason: from getter */
        public final String getRatio() {
            return this.ratio;
        }

        @NotNull
        public final Options copy(boolean imageGrey, boolean itemsAreFaded, @NotNull String ratio) {
            Intrinsics.checkNotNullParameter(ratio, "ratio");
            return new Options(imageGrey, itemsAreFaded, ratio);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Options)) {
                return false;
            }
            Options options = (Options) other;
            return this.imageGrey == options.imageGrey && this.itemsAreFaded == options.itemsAreFaded && Intrinsics.d(this.ratio, options.ratio);
        }

        public final boolean getImageGrey() {
            return this.imageGrey;
        }

        public final boolean getItemsAreFaded() {
            return this.itemsAreFaded;
        }

        @NotNull
        public final String getRatio() {
            return this.ratio;
        }

        public int hashCode() {
            return this.ratio.hashCode() + C3532b.a(Boolean.hashCode(this.imageGrey) * 31, 31, this.itemsAreFaded);
        }

        @NotNull
        public String toString() {
            boolean z11 = this.imageGrey;
            boolean z12 = this.itemsAreFaded;
            return o0.c(a.d("Options(imageGrey=", ", itemsAreFaded=", ", ratio=", z11, z12), this.ratio, ")");
        }

        public Options(boolean z11, boolean z12, @NotNull String ratio) {
            Intrinsics.checkNotNullParameter(ratio, "ratio");
            this.imageGrey = z11;
            this.itemsAreFaded = z12;
            this.ratio = ratio;
        }

        public /* synthetic */ Options(boolean z11, boolean z12, String str, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? false : z11, (i11 & 2) != 0 ? false : z12, (i11 & 4) != 0 ? "1:1" : str);
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
