package ru.ozon.app.android.account.orders.orderProduct.data.dto;

import D40.b;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cscore.orderdetails.molecule.images.data.ImagesDTO;
import ru.ozon.app.android.cscore.padding.Padding;
import ru.ozon.app.android.ugc.core.widgets.commentsListV3.data.CommentV3DTO;
import ru.ozon.moshi.adapters.serialize.proto.ProtoOneOf;
import ru.ozon.moshi.adapters.serialize.proto.ProtoOneOfSignature;
import ru.ozon.uni.atoms.data.common.Paddings;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0081\b\u0018\u00002\u00020\u0001:\u0002#$B9\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000b\u0010\fJ\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\nHÆ\u0003JC\u0010\u001c\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nHÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020!HÖ\u0001J\t\u0010\"\u001a\u00020\bHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006%"}, d2 = {"Lru/ozon/app/android/account/orders/orderProduct/data/dto/OrderProductItemDTO;", "", "cell", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "products", "Lru/ozon/app/android/account/orders/orderProduct/data/dto/OrderProductItemDTO$ProductsDTO;", CommentV3DTO.FOOTER_FIELD_NAME, "backgroundColor", "", "common", "Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "<init>", "(Lru/ozon/uni/atoms/data/dsCell/CellDTO;Lru/ozon/app/android/account/orders/orderProduct/data/dto/OrderProductItemDTO$ProductsDTO;Ljava/lang/Object;Ljava/lang/String;Lru/ozon/uni/atoms/data/controls/CommonControlSettings;)V", "getCell", "()Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "getProducts", "()Lru/ozon/app/android/account/orders/orderProduct/data/dto/OrderProductItemDTO$ProductsDTO;", "getFooter", "()Ljava/lang/Object;", "getBackgroundColor", "()Ljava/lang/String;", "getCommon", "()Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "ProductsDTO", "SeparatorDTO", "cs-orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class OrderProductItemDTO {
    public static final int $stable = 8;
    private final String backgroundColor;
    private final CellDTO cell;
    private final CommonControlSettings common;
    private final Object footer;

    @NotNull
    private final ProductsDTO products;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/account/orders/orderProduct/data/dto/OrderProductItemDTO$ProductsDTO;", "", "images", "Lru/ozon/app/android/cscore/orderdetails/molecule/images/data/ImagesDTO;", "paddings", "Lru/ozon/app/android/cscore/padding/Padding;", "<init>", "(Lru/ozon/app/android/cscore/orderdetails/molecule/images/data/ImagesDTO;Lru/ozon/app/android/cscore/padding/Padding;)V", "getImages", "()Lru/ozon/app/android/cscore/orderdetails/molecule/images/data/ImagesDTO;", "getPaddings", "()Lru/ozon/app/android/cscore/padding/Padding;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "cs-orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ProductsDTO {
        public static final int $stable = Padding.$stable | ImagesDTO.$stable;

        @NotNull
        private final ImagesDTO images;
        private final Padding paddings;

        public ProductsDTO(@NotNull ImagesDTO images, Padding padding) {
            Intrinsics.checkNotNullParameter(images, "images");
            this.images = images;
            this.paddings = padding;
        }

        public static /* synthetic */ ProductsDTO copy$default(ProductsDTO productsDTO, ImagesDTO imagesDTO, Padding padding, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                imagesDTO = productsDTO.images;
            }
            if ((i11 & 2) != 0) {
                padding = productsDTO.paddings;
            }
            return productsDTO.copy(imagesDTO, padding);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final ImagesDTO getImages() {
            return this.images;
        }

        /* renamed from: component2, reason: from getter */
        public final Padding getPaddings() {
            return this.paddings;
        }

        @NotNull
        public final ProductsDTO copy(@NotNull ImagesDTO images, Padding paddings) {
            Intrinsics.checkNotNullParameter(images, "images");
            return new ProductsDTO(images, paddings);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ProductsDTO)) {
                return false;
            }
            ProductsDTO productsDTO = (ProductsDTO) other;
            return Intrinsics.d(this.images, productsDTO.images) && Intrinsics.d(this.paddings, productsDTO.paddings);
        }

        @NotNull
        public final ImagesDTO getImages() {
            return this.images;
        }

        public final Padding getPaddings() {
            return this.paddings;
        }

        public int hashCode() {
            int hashCode = this.images.hashCode() * 31;
            Padding padding = this.paddings;
            return hashCode + (padding == null ? 0 : padding.hashCode());
        }

        @NotNull
        public String toString() {
            return "ProductsDTO(images=" + this.images + ", paddings=" + this.paddings + ")";
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003J+\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/account/orders/orderProduct/data/dto/OrderProductItemDTO$SeparatorDTO;", "", "backgroundColor", "", "leftPadding", "Lru/ozon/uni/atoms/data/common/Paddings;", "rightPadding", "<init>", "(Ljava/lang/String;Lru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/uni/atoms/data/common/Paddings;)V", "getBackgroundColor", "()Ljava/lang/String;", "getLeftPadding", "()Lru/ozon/uni/atoms/data/common/Paddings;", "getRightPadding", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "cs-orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class SeparatorDTO {
        public static final int $stable = 0;

        @NotNull
        private final String backgroundColor;
        private final Paddings leftPadding;
        private final Paddings rightPadding;

        public SeparatorDTO(@NotNull String backgroundColor, Paddings paddings, Paddings paddings2) {
            Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
            this.backgroundColor = backgroundColor;
            this.leftPadding = paddings;
            this.rightPadding = paddings2;
        }

        public static /* synthetic */ SeparatorDTO copy$default(SeparatorDTO separatorDTO, String str, Paddings paddings, Paddings paddings2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = separatorDTO.backgroundColor;
            }
            if ((i11 & 2) != 0) {
                paddings = separatorDTO.leftPadding;
            }
            if ((i11 & 4) != 0) {
                paddings2 = separatorDTO.rightPadding;
            }
            return separatorDTO.copy(str, paddings, paddings2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getBackgroundColor() {
            return this.backgroundColor;
        }

        /* renamed from: component2, reason: from getter */
        public final Paddings getLeftPadding() {
            return this.leftPadding;
        }

        /* renamed from: component3, reason: from getter */
        public final Paddings getRightPadding() {
            return this.rightPadding;
        }

        @NotNull
        public final SeparatorDTO copy(@NotNull String backgroundColor, Paddings leftPadding, Paddings rightPadding) {
            Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
            return new SeparatorDTO(backgroundColor, leftPadding, rightPadding);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SeparatorDTO)) {
                return false;
            }
            SeparatorDTO separatorDTO = (SeparatorDTO) other;
            return Intrinsics.d(this.backgroundColor, separatorDTO.backgroundColor) && this.leftPadding == separatorDTO.leftPadding && this.rightPadding == separatorDTO.rightPadding;
        }

        @NotNull
        public final String getBackgroundColor() {
            return this.backgroundColor;
        }

        public final Paddings getLeftPadding() {
            return this.leftPadding;
        }

        public final Paddings getRightPadding() {
            return this.rightPadding;
        }

        public int hashCode() {
            int hashCode = this.backgroundColor.hashCode() * 31;
            Paddings paddings = this.leftPadding;
            int hashCode2 = (hashCode + (paddings == null ? 0 : paddings.hashCode())) * 31;
            Paddings paddings2 = this.rightPadding;
            return hashCode2 + (paddings2 != null ? paddings2.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            String str = this.backgroundColor;
            Paddings paddings = this.leftPadding;
            Paddings paddings2 = this.rightPadding;
            StringBuilder sb2 = new StringBuilder("SeparatorDTO(backgroundColor=");
            sb2.append(str);
            sb2.append(", leftPadding=");
            sb2.append(paddings);
            sb2.append(", rightPadding=");
            return b.b(sb2, paddings2, ")");
        }
    }

    public OrderProductItemDTO(CellDTO cellDTO, @NotNull ProductsDTO products, @ProtoOneOfSignature(name = "separator", type = SeparatorDTO.class) @ProtoOneOf(label = "type") Object obj, String str, CommonControlSettings commonControlSettings) {
        Intrinsics.checkNotNullParameter(products, "products");
        this.cell = cellDTO;
        this.products = products;
        this.footer = obj;
        this.backgroundColor = str;
        this.common = commonControlSettings;
    }

    public static /* synthetic */ OrderProductItemDTO copy$default(OrderProductItemDTO orderProductItemDTO, CellDTO cellDTO, ProductsDTO productsDTO, Object obj, String str, CommonControlSettings commonControlSettings, int i11, Object obj2) {
        if ((i11 & 1) != 0) {
            cellDTO = orderProductItemDTO.cell;
        }
        if ((i11 & 2) != 0) {
            productsDTO = orderProductItemDTO.products;
        }
        if ((i11 & 4) != 0) {
            obj = orderProductItemDTO.footer;
        }
        if ((i11 & 8) != 0) {
            str = orderProductItemDTO.backgroundColor;
        }
        if ((i11 & 16) != 0) {
            commonControlSettings = orderProductItemDTO.common;
        }
        CommonControlSettings commonControlSettings2 = commonControlSettings;
        Object obj3 = obj;
        return orderProductItemDTO.copy(cellDTO, productsDTO, obj3, str, commonControlSettings2);
    }

    /* renamed from: component1, reason: from getter */
    public final CellDTO getCell() {
        return this.cell;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final ProductsDTO getProducts() {
        return this.products;
    }

    /* renamed from: component3, reason: from getter */
    public final Object getFooter() {
        return this.footer;
    }

    /* renamed from: component4, reason: from getter */
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    /* renamed from: component5, reason: from getter */
    public final CommonControlSettings getCommon() {
        return this.common;
    }

    @NotNull
    public final OrderProductItemDTO copy(CellDTO cell, @NotNull ProductsDTO products, @ProtoOneOfSignature(name = "separator", type = SeparatorDTO.class) @ProtoOneOf(label = "type") Object footer, String backgroundColor, CommonControlSettings common) {
        Intrinsics.checkNotNullParameter(products, "products");
        return new OrderProductItemDTO(cell, products, footer, backgroundColor, common);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OrderProductItemDTO)) {
            return false;
        }
        OrderProductItemDTO orderProductItemDTO = (OrderProductItemDTO) other;
        return Intrinsics.d(this.cell, orderProductItemDTO.cell) && Intrinsics.d(this.products, orderProductItemDTO.products) && Intrinsics.d(this.footer, orderProductItemDTO.footer) && Intrinsics.d(this.backgroundColor, orderProductItemDTO.backgroundColor) && Intrinsics.d(this.common, orderProductItemDTO.common);
    }

    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    public final CellDTO getCell() {
        return this.cell;
    }

    public final CommonControlSettings getCommon() {
        return this.common;
    }

    public final Object getFooter() {
        return this.footer;
    }

    @NotNull
    public final ProductsDTO getProducts() {
        return this.products;
    }

    public int hashCode() {
        CellDTO cellDTO = this.cell;
        int hashCode = (this.products.hashCode() + ((cellDTO == null ? 0 : cellDTO.hashCode()) * 31)) * 31;
        Object obj = this.footer;
        int hashCode2 = (hashCode + (obj == null ? 0 : obj.hashCode())) * 31;
        String str = this.backgroundColor;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        CommonControlSettings commonControlSettings = this.common;
        return hashCode3 + (commonControlSettings != null ? commonControlSettings.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        CellDTO cellDTO = this.cell;
        ProductsDTO productsDTO = this.products;
        Object obj = this.footer;
        String str = this.backgroundColor;
        CommonControlSettings commonControlSettings = this.common;
        StringBuilder sb2 = new StringBuilder("OrderProductItemDTO(cell=");
        sb2.append(cellDTO);
        sb2.append(", products=");
        sb2.append(productsDTO);
        sb2.append(", footer=");
        sb2.append(obj);
        sb2.append(", backgroundColor=");
        sb2.append(str);
        sb2.append(", common=");
        return Ak.b.g(sb2, commonControlSettings, ")");
    }
}
