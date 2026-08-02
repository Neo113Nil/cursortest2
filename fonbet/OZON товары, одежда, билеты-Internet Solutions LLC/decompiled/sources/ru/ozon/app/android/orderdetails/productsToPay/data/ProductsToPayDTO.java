package ru.ozon.app.android.orderdetails.productsToPay.data;

import C.o0;
import com.squareup.moshi.j;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.moshi.adapters.serialize.proto.ProtoOneOf;
import ru.ozon.moshi.adapters.serialize.proto.ProtoOneOfSignature;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B-\u0012\u000e\b\u0001\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003J1\u0010\u0013\u001a\u00020\u00002\u000e\b\u0003\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0007HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/orderdetails/productsToPay/data/ProductsToPayDTO;", "", "items", "", "verticalPadding", "Lru/ozon/app/android/orderdetails/productsToPay/data/VerticalPadding;", "state", "", "<init>", "(Ljava/util/List;Lru/ozon/app/android/orderdetails/productsToPay/data/VerticalPadding;Ljava/lang/String;)V", "getItems", "()Ljava/util/List;", "getVerticalPadding", "()Lru/ozon/app/android/orderdetails/productsToPay/data/VerticalPadding;", "getState", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "orderdetails_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class ProductsToPayDTO {
    public static final int $stable = 8;

    @NotNull
    private final List<Object> items;
    private final String state;
    private final VerticalPadding verticalPadding;

    public ProductsToPayDTO(@ProtoOneOfSignature.Container({@ProtoOneOfSignature(name = "cell", type = CellDTO.class), @ProtoOneOfSignature(name = "product", type = ProductDTO.class), @ProtoOneOfSignature(name = "productImageCarousel", type = ProductImageCarouselDTO.class)}) @NotNull @ProtoOneOf(label = "type") List<? extends Object> items, VerticalPadding verticalPadding, String str) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.items = items;
        this.verticalPadding = verticalPadding;
        this.state = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ProductsToPayDTO copy$default(ProductsToPayDTO productsToPayDTO, List list, VerticalPadding verticalPadding, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = productsToPayDTO.items;
        }
        if ((i11 & 2) != 0) {
            verticalPadding = productsToPayDTO.verticalPadding;
        }
        if ((i11 & 4) != 0) {
            str = productsToPayDTO.state;
        }
        return productsToPayDTO.copy(list, verticalPadding, str);
    }

    @NotNull
    public final List<Object> component1() {
        return this.items;
    }

    /* renamed from: component2, reason: from getter */
    public final VerticalPadding getVerticalPadding() {
        return this.verticalPadding;
    }

    /* renamed from: component3, reason: from getter */
    public final String getState() {
        return this.state;
    }

    @NotNull
    public final ProductsToPayDTO copy(@ProtoOneOfSignature.Container({@ProtoOneOfSignature(name = "cell", type = CellDTO.class), @ProtoOneOfSignature(name = "product", type = ProductDTO.class), @ProtoOneOfSignature(name = "productImageCarousel", type = ProductImageCarouselDTO.class)}) @NotNull @ProtoOneOf(label = "type") List<? extends Object> items, VerticalPadding verticalPadding, String state) {
        Intrinsics.checkNotNullParameter(items, "items");
        return new ProductsToPayDTO(items, verticalPadding, state);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProductsToPayDTO)) {
            return false;
        }
        ProductsToPayDTO productsToPayDTO = (ProductsToPayDTO) other;
        return Intrinsics.d(this.items, productsToPayDTO.items) && Intrinsics.d(this.verticalPadding, productsToPayDTO.verticalPadding) && Intrinsics.d(this.state, productsToPayDTO.state);
    }

    @NotNull
    public final List<Object> getItems() {
        return this.items;
    }

    public final String getState() {
        return this.state;
    }

    public final VerticalPadding getVerticalPadding() {
        return this.verticalPadding;
    }

    public int hashCode() {
        int hashCode = this.items.hashCode() * 31;
        VerticalPadding verticalPadding = this.verticalPadding;
        int hashCode2 = (hashCode + (verticalPadding == null ? 0 : verticalPadding.hashCode())) * 31;
        String str = this.state;
        return hashCode2 + (str != null ? str.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        List<Object> list = this.items;
        VerticalPadding verticalPadding = this.verticalPadding;
        String str = this.state;
        StringBuilder sb2 = new StringBuilder("ProductsToPayDTO(items=");
        sb2.append(list);
        sb2.append(", verticalPadding=");
        sb2.append(verticalPadding);
        sb2.append(", state=");
        return o0.c(sb2, str, ")");
    }

    public /* synthetic */ ProductsToPayDTO(List list, VerticalPadding verticalPadding, String str, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, verticalPadding, (i11 & 4) != 0 ? null : str);
    }
}
