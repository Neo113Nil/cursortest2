package ru.ozon.app.android.checkoutcomposer.splitdetail.data;

import Ak.C2436a;
import B90.C2618u;
import N3.C3660k;
import V.e;
import com.squareup.moshi.j;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.AtomDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0016B%\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0011\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003HÆ\u0003J+\u0010\u000e\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\n¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/splitdetail/data/SplitDetailDTO;", "", "headerElements", "", "Lru/ozon/uni/atoms/data/AtomDTO;", "splits", "Lru/ozon/app/android/checkoutcomposer/splitdetail/data/SplitDetailDTO$Split;", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "getHeaderElements", "()Ljava/util/List;", "getSplits", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Split", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class SplitDetailDTO {
    public static final int $stable = 8;
    private final List<AtomDTO> headerElements;

    @NotNull
    private final List<Split> splits;

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0019B)\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J1\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/splitdetail/data/SplitDetailDTO$Split;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "", "titleColor", "products", "", "Lru/ozon/app/android/checkoutcomposer/splitdetail/data/SplitDetailDTO$Split$Product;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getTitle", "()Ljava/lang/String;", "getTitleColor", "getProducts", "()Ljava/util/List;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "Product", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @j(generateAdapter = true)
    public static final /* data */ class Split {
        public static final int $stable = 8;

        @NotNull
        private final List<Product> products;
        private final String title;
        private final String titleColor;

        @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0017B\u001f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J%\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/splitdetail/data/SplitDetailDTO$Split$Product;", "", "image", "Lru/ozon/app/android/checkoutcomposer/splitdetail/data/SplitDetailDTO$Split$Product$Image;", "elements", "", "Lru/ozon/uni/atoms/data/AtomDTO;", "<init>", "(Lru/ozon/app/android/checkoutcomposer/splitdetail/data/SplitDetailDTO$Split$Product$Image;Ljava/util/List;)V", "getImage", "()Lru/ozon/app/android/checkoutcomposer/splitdetail/data/SplitDetailDTO$Split$Product$Image;", "getElements", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Image", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        @j(generateAdapter = true)
        public static final /* data */ class Product {
            public static final int $stable = 8;

            @NotNull
            private final List<AtomDTO> elements;
            private final Image image;

            @j(generateAdapter = true)
            @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/splitdetail/data/SplitDetailDTO$Split$Product$Image;", "", "image", "", "borderColor", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getImage", "()Ljava/lang/String;", "getBorderColor", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final /* data */ class Image {
                public static final int $stable = 0;
                private final String borderColor;
                private final String image;

                public Image(String str, String str2) {
                    this.image = str;
                    this.borderColor = str2;
                }

                public static /* synthetic */ Image copy$default(Image image, String str, String str2, int i11, Object obj) {
                    if ((i11 & 1) != 0) {
                        str = image.image;
                    }
                    if ((i11 & 2) != 0) {
                        str2 = image.borderColor;
                    }
                    return image.copy(str, str2);
                }

                /* renamed from: component1, reason: from getter */
                public final String getImage() {
                    return this.image;
                }

                /* renamed from: component2, reason: from getter */
                public final String getBorderColor() {
                    return this.borderColor;
                }

                @NotNull
                public final Image copy(String image, String borderColor) {
                    return new Image(image, borderColor);
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof Image)) {
                        return false;
                    }
                    Image image = (Image) other;
                    return Intrinsics.d(this.image, image.image) && Intrinsics.d(this.borderColor, image.borderColor);
                }

                public final String getBorderColor() {
                    return this.borderColor;
                }

                public final String getImage() {
                    return this.image;
                }

                public int hashCode() {
                    String str = this.image;
                    int hashCode = (str == null ? 0 : str.hashCode()) * 31;
                    String str2 = this.borderColor;
                    return hashCode + (str2 != null ? str2.hashCode() : 0);
                }

                @NotNull
                public String toString() {
                    return e.a("Image(image=", this.image, ", borderColor=", this.borderColor, ")");
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            public Product(Image image, @NotNull List<? extends AtomDTO> elements) {
                Intrinsics.checkNotNullParameter(elements, "elements");
                this.image = image;
                this.elements = elements;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ Product copy$default(Product product, Image image, List list, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    image = product.image;
                }
                if ((i11 & 2) != 0) {
                    list = product.elements;
                }
                return product.copy(image, list);
            }

            /* renamed from: component1, reason: from getter */
            public final Image getImage() {
                return this.image;
            }

            @NotNull
            public final List<AtomDTO> component2() {
                return this.elements;
            }

            @NotNull
            public final Product copy(Image image, @NotNull List<? extends AtomDTO> elements) {
                Intrinsics.checkNotNullParameter(elements, "elements");
                return new Product(image, elements);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Product)) {
                    return false;
                }
                Product product = (Product) other;
                return Intrinsics.d(this.image, product.image) && Intrinsics.d(this.elements, product.elements);
            }

            @NotNull
            public final List<AtomDTO> getElements() {
                return this.elements;
            }

            public final Image getImage() {
                return this.image;
            }

            public int hashCode() {
                Image image = this.image;
                return this.elements.hashCode() + ((image == null ? 0 : image.hashCode()) * 31);
            }

            @NotNull
            public String toString() {
                return "Product(image=" + this.image + ", elements=" + this.elements + ")";
            }
        }

        public Split(String str, String str2, @NotNull List<Product> products) {
            Intrinsics.checkNotNullParameter(products, "products");
            this.title = str;
            this.titleColor = str2;
            this.products = products;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Split copy$default(Split split, String str, String str2, List list, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = split.title;
            }
            if ((i11 & 2) != 0) {
                str2 = split.titleColor;
            }
            if ((i11 & 4) != 0) {
                list = split.products;
            }
            return split.copy(str, str2, list);
        }

        /* renamed from: component1, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        /* renamed from: component2, reason: from getter */
        public final String getTitleColor() {
            return this.titleColor;
        }

        @NotNull
        public final List<Product> component3() {
            return this.products;
        }

        @NotNull
        public final Split copy(String title, String titleColor, @NotNull List<Product> products) {
            Intrinsics.checkNotNullParameter(products, "products");
            return new Split(title, titleColor, products);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Split)) {
                return false;
            }
            Split split = (Split) other;
            return Intrinsics.d(this.title, split.title) && Intrinsics.d(this.titleColor, split.titleColor) && Intrinsics.d(this.products, split.products);
        }

        @NotNull
        public final List<Product> getProducts() {
            return this.products;
        }

        public final String getTitle() {
            return this.title;
        }

        public final String getTitleColor() {
            return this.titleColor;
        }

        public int hashCode() {
            String str = this.title;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.titleColor;
            return this.products.hashCode() + ((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
        }

        @NotNull
        public String toString() {
            String str = this.title;
            String str2 = this.titleColor;
            return C2618u.h(C3660k.d("Split(title=", str, ", titleColor=", str2, ", products="), this.products, ")");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SplitDetailDTO(List<? extends AtomDTO> list, @NotNull List<Split> splits) {
        Intrinsics.checkNotNullParameter(splits, "splits");
        this.headerElements = list;
        this.splits = splits;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SplitDetailDTO copy$default(SplitDetailDTO splitDetailDTO, List list, List list2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = splitDetailDTO.headerElements;
        }
        if ((i11 & 2) != 0) {
            list2 = splitDetailDTO.splits;
        }
        return splitDetailDTO.copy(list, list2);
    }

    public final List<AtomDTO> component1() {
        return this.headerElements;
    }

    @NotNull
    public final List<Split> component2() {
        return this.splits;
    }

    @NotNull
    public final SplitDetailDTO copy(List<? extends AtomDTO> headerElements, @NotNull List<Split> splits) {
        Intrinsics.checkNotNullParameter(splits, "splits");
        return new SplitDetailDTO(headerElements, splits);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SplitDetailDTO)) {
            return false;
        }
        SplitDetailDTO splitDetailDTO = (SplitDetailDTO) other;
        return Intrinsics.d(this.headerElements, splitDetailDTO.headerElements) && Intrinsics.d(this.splits, splitDetailDTO.splits);
    }

    public final List<AtomDTO> getHeaderElements() {
        return this.headerElements;
    }

    @NotNull
    public final List<Split> getSplits() {
        return this.splits;
    }

    public int hashCode() {
        List<AtomDTO> list = this.headerElements;
        return this.splits.hashCode() + ((list == null ? 0 : list.hashCode()) * 31);
    }

    @NotNull
    public String toString() {
        return C2436a.b("SplitDetailDTO(headerElements=", this.headerElements, ", splits=", ")", this.splits);
    }
}
