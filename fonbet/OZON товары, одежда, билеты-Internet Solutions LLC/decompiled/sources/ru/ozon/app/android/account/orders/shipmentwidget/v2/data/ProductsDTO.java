package ru.ozon.app.android.account.orders.shipmentwidget.v2.data;

import GR.b;
import com.squareup.moshi.j;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cscore.padding.HorizontalPadding;
import ru.ozon.uni.atoms.data.common.Paddings;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0006HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\bHÆ\u0003J\t\u0010\u001b\u001a\u00020\u000bHÆ\u0003JE\u0010\u001c\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\n\u001a\u00020\u000bHÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020!HÖ\u0001J\t\u0010\"\u001a\u00020#HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006$"}, d2 = {"Lru/ozon/app/android/account/orders/shipmentwidget/v2/data/ProductsDTO;", "", "products", "", "Lru/ozon/app/android/account/orders/shipmentwidget/v2/data/ProductImageDTO;", "spaceBetween", "Lru/ozon/uni/atoms/data/common/Paddings;", "common", "Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "rootCommon", "horizontalPadding", "Lru/ozon/app/android/cscore/padding/HorizontalPadding;", "<init>", "(Ljava/util/List;Lru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/uni/atoms/data/controls/CommonControlSettings;Lru/ozon/uni/atoms/data/controls/CommonControlSettings;Lru/ozon/app/android/cscore/padding/HorizontalPadding;)V", "getProducts", "()Ljava/util/List;", "getSpaceBetween", "()Lru/ozon/uni/atoms/data/common/Paddings;", "getCommon", "()Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "getRootCommon", "getHorizontalPadding", "()Lru/ozon/app/android/cscore/padding/HorizontalPadding;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "", "cs-orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class ProductsDTO {
    public static final int $stable = 8;
    private final CommonControlSettings common;

    @NotNull
    private final HorizontalPadding horizontalPadding;

    @NotNull
    private final List<ProductImageDTO> products;
    private final transient CommonControlSettings rootCommon;

    @NotNull
    private final Paddings spaceBetween;

    public ProductsDTO(@NotNull List<ProductImageDTO> products, @NotNull Paddings spaceBetween, CommonControlSettings commonControlSettings, CommonControlSettings commonControlSettings2, @NotNull HorizontalPadding horizontalPadding) {
        Intrinsics.checkNotNullParameter(products, "products");
        Intrinsics.checkNotNullParameter(spaceBetween, "spaceBetween");
        Intrinsics.checkNotNullParameter(horizontalPadding, "horizontalPadding");
        this.products = products;
        this.spaceBetween = spaceBetween;
        this.common = commonControlSettings;
        this.rootCommon = commonControlSettings2;
        this.horizontalPadding = horizontalPadding;
    }

    public static /* synthetic */ ProductsDTO copy$default(ProductsDTO productsDTO, List list, Paddings paddings, CommonControlSettings commonControlSettings, CommonControlSettings commonControlSettings2, HorizontalPadding horizontalPadding, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = productsDTO.products;
        }
        if ((i11 & 2) != 0) {
            paddings = productsDTO.spaceBetween;
        }
        if ((i11 & 4) != 0) {
            commonControlSettings = productsDTO.common;
        }
        if ((i11 & 8) != 0) {
            commonControlSettings2 = productsDTO.rootCommon;
        }
        if ((i11 & 16) != 0) {
            horizontalPadding = productsDTO.horizontalPadding;
        }
        HorizontalPadding horizontalPadding2 = horizontalPadding;
        CommonControlSettings commonControlSettings3 = commonControlSettings;
        return productsDTO.copy(list, paddings, commonControlSettings3, commonControlSettings2, horizontalPadding2);
    }

    @NotNull
    public final List<ProductImageDTO> component1() {
        return this.products;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final Paddings getSpaceBetween() {
        return this.spaceBetween;
    }

    /* renamed from: component3, reason: from getter */
    public final CommonControlSettings getCommon() {
        return this.common;
    }

    /* renamed from: component4, reason: from getter */
    public final CommonControlSettings getRootCommon() {
        return this.rootCommon;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final HorizontalPadding getHorizontalPadding() {
        return this.horizontalPadding;
    }

    @NotNull
    public final ProductsDTO copy(@NotNull List<ProductImageDTO> products, @NotNull Paddings spaceBetween, CommonControlSettings common, CommonControlSettings rootCommon, @NotNull HorizontalPadding horizontalPadding) {
        Intrinsics.checkNotNullParameter(products, "products");
        Intrinsics.checkNotNullParameter(spaceBetween, "spaceBetween");
        Intrinsics.checkNotNullParameter(horizontalPadding, "horizontalPadding");
        return new ProductsDTO(products, spaceBetween, common, rootCommon, horizontalPadding);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProductsDTO)) {
            return false;
        }
        ProductsDTO productsDTO = (ProductsDTO) other;
        return Intrinsics.d(this.products, productsDTO.products) && this.spaceBetween == productsDTO.spaceBetween && Intrinsics.d(this.common, productsDTO.common) && Intrinsics.d(this.rootCommon, productsDTO.rootCommon) && Intrinsics.d(this.horizontalPadding, productsDTO.horizontalPadding);
    }

    public final CommonControlSettings getCommon() {
        return this.common;
    }

    @NotNull
    public final HorizontalPadding getHorizontalPadding() {
        return this.horizontalPadding;
    }

    @NotNull
    public final List<ProductImageDTO> getProducts() {
        return this.products;
    }

    public final CommonControlSettings getRootCommon() {
        return this.rootCommon;
    }

    @NotNull
    public final Paddings getSpaceBetween() {
        return this.spaceBetween;
    }

    public int hashCode() {
        int b11 = b.b(this.spaceBetween, this.products.hashCode() * 31, 31);
        CommonControlSettings commonControlSettings = this.common;
        int hashCode = (b11 + (commonControlSettings == null ? 0 : commonControlSettings.hashCode())) * 31;
        CommonControlSettings commonControlSettings2 = this.rootCommon;
        return this.horizontalPadding.hashCode() + ((hashCode + (commonControlSettings2 != null ? commonControlSettings2.hashCode() : 0)) * 31);
    }

    @NotNull
    public String toString() {
        return "ProductsDTO(products=" + this.products + ", spaceBetween=" + this.spaceBetween + ", common=" + this.common + ", rootCommon=" + this.rootCommon + ", horizontalPadding=" + this.horizontalPadding + ")";
    }

    public /* synthetic */ ProductsDTO(List list, Paddings paddings, CommonControlSettings commonControlSettings, CommonControlSettings commonControlSettings2, HorizontalPadding horizontalPadding, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, (i11 & 2) != 0 ? Paddings.PADDING_200 : paddings, commonControlSettings, (i11 & 8) != 0 ? null : commonControlSettings2, (i11 & 16) != 0 ? HorizontalPadding.INSTANCE.getDEFAULT_PADDING_500() : horizontalPadding);
    }
}
