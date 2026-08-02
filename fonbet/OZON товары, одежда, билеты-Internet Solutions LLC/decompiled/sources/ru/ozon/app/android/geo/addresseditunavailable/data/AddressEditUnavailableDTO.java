package ru.ozon.app.android.geo.addresseditunavailable.data;

import B0.A0;
import B90.C2618u;
import Kk.c;
import N3.C3660k;
import com.squareup.moshi.j;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.AtomDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0018B+\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0017\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006HÆ\u0003J1\u0010\u0011\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0016\b\u0002\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0007HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001f\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/geo/addresseditunavailable/data/AddressEditUnavailableDTO;", "", "splits", "", "Lru/ozon/app/android/geo/addresseditunavailable/data/AddressEditUnavailableDTO$Split;", "trackingInfo", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Ljava/util/List;Ljava/util/Map;)V", "getSplits", "()Ljava/util/List;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "Split", "geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class AddressEditUnavailableDTO {

    @NotNull
    private final List<Split> splits;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0019B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J/\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/geo/addresseditunavailable/data/AddressEditUnavailableDTO$Split;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "", "titleColor", "products", "", "Lru/ozon/app/android/geo/addresseditunavailable/data/AddressEditUnavailableDTO$Split$Product;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getTitle", "()Ljava/lang/String;", "getTitleColor", "getProducts", "()Ljava/util/List;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "Product", "geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @j(generateAdapter = true)
    public static final /* data */ class Split {

        @NotNull
        private final List<Product> products;

        @NotNull
        private final String title;
        private final String titleColor;

        @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0017B\u001f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J%\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/geo/addresseditunavailable/data/AddressEditUnavailableDTO$Split$Product;", "", "image", "Lru/ozon/app/android/geo/addresseditunavailable/data/AddressEditUnavailableDTO$Split$Product$Image;", "elements", "", "Lru/ozon/uni/atoms/data/AtomDTO;", "<init>", "(Lru/ozon/app/android/geo/addresseditunavailable/data/AddressEditUnavailableDTO$Split$Product$Image;Ljava/util/List;)V", "getImage", "()Lru/ozon/app/android/geo/addresseditunavailable/data/AddressEditUnavailableDTO$Split$Product$Image;", "getElements", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Image", "geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        @j(generateAdapter = true)
        public static final /* data */ class Product {

            @NotNull
            private final List<AtomDTO> elements;
            private final Image image;

            @j(generateAdapter = true)
            @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/geo/addresseditunavailable/data/AddressEditUnavailableDTO$Split$Product$Image;", "", "image", "", "<init>", "(Ljava/lang/String;)V", "getImage", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final /* data */ class Image {
                private final String image;

                public Image(String str) {
                    this.image = str;
                }

                public static /* synthetic */ Image copy$default(Image image, String str, int i11, Object obj) {
                    if ((i11 & 1) != 0) {
                        str = image.image;
                    }
                    return image.copy(str);
                }

                /* renamed from: component1, reason: from getter */
                public final String getImage() {
                    return this.image;
                }

                @NotNull
                public final Image copy(String image) {
                    return new Image(image);
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    return (other instanceof Image) && Intrinsics.d(this.image, ((Image) other).image);
                }

                public final String getImage() {
                    return this.image;
                }

                public int hashCode() {
                    String str = this.image;
                    if (str == null) {
                        return 0;
                    }
                    return str.hashCode();
                }

                @NotNull
                public String toString() {
                    return A0.b("Image(image=", this.image, ")");
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

        public Split(@NotNull String title, String str, @NotNull List<Product> products) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(products, "products");
            this.title = title;
            this.titleColor = str;
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

        @NotNull
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
        public final Split copy(@NotNull String title, String titleColor, @NotNull List<Product> products) {
            Intrinsics.checkNotNullParameter(title, "title");
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

        @NotNull
        public final String getTitle() {
            return this.title;
        }

        public final String getTitleColor() {
            return this.titleColor;
        }

        public int hashCode() {
            int hashCode = this.title.hashCode() * 31;
            String str = this.titleColor;
            return this.products.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31);
        }

        @NotNull
        public String toString() {
            String str = this.title;
            String str2 = this.titleColor;
            return C2618u.h(C3660k.d("Split(title=", str, ", titleColor=", str2, ", products="), this.products, ")");
        }
    }

    public AddressEditUnavailableDTO(@NotNull List<Split> splits, Map<String, TokenizedTrackingInfo> map) {
        Intrinsics.checkNotNullParameter(splits, "splits");
        this.splits = splits;
        this.trackingInfo = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AddressEditUnavailableDTO copy$default(AddressEditUnavailableDTO addressEditUnavailableDTO, List list, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = addressEditUnavailableDTO.splits;
        }
        if ((i11 & 2) != 0) {
            map = addressEditUnavailableDTO.trackingInfo;
        }
        return addressEditUnavailableDTO.copy(list, map);
    }

    @NotNull
    public final List<Split> component1() {
        return this.splits;
    }

    public final Map<String, TokenizedTrackingInfo> component2() {
        return this.trackingInfo;
    }

    @NotNull
    public final AddressEditUnavailableDTO copy(@NotNull List<Split> splits, Map<String, TokenizedTrackingInfo> trackingInfo) {
        Intrinsics.checkNotNullParameter(splits, "splits");
        return new AddressEditUnavailableDTO(splits, trackingInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AddressEditUnavailableDTO)) {
            return false;
        }
        AddressEditUnavailableDTO addressEditUnavailableDTO = (AddressEditUnavailableDTO) other;
        return Intrinsics.d(this.splits, addressEditUnavailableDTO.splits) && Intrinsics.d(this.trackingInfo, addressEditUnavailableDTO.trackingInfo);
    }

    @NotNull
    public final List<Split> getSplits() {
        return this.splits;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        int hashCode = this.splits.hashCode() * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        return hashCode + (map == null ? 0 : map.hashCode());
    }

    @NotNull
    public String toString() {
        return c.d("AddressEditUnavailableDTO(splits=", ", trackingInfo=", ")", this.splits, this.trackingInfo);
    }
}
