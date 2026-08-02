package ru.ozon.app.android.cart.cartSplitV2.v1.data;

import Ak.b;
import Y9.c;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.D;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.n;
import com.squareup.moshi.x;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.M;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cart.cartSplitV2.v1.data.CartSplitV2DTO;
import ru.ozon.app.android.cart.common.dynamicElement.DynamicElementDTO;
import ru.ozon.app.android.cart.common.product.ProductDTO;
import ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.data.ReviewGalleryV2DTO;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\"\u0010\u001e\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u001c0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0019R\u001c\u0010 \u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u0019¨\u0006!"}, d2 = {"Lru/ozon/app/android/cart/cartSplitV2/v1/data/CartSplitV2DTO_ItemJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/cart/cartSplitV2/v1/data/CartSplitV2DTO$Item;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/cart/cartSplitV2/v1/data/CartSplitV2DTO$Item;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/cart/cartSplitV2/v1/data/CartSplitV2DTO$Item;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "Lru/ozon/app/android/cart/cartSplitV2/v1/data/CartSplitV2DTO$Item$Checkbox;", "nullableCheckboxAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/cart/common/product/ProductDTO;", "productDTOAdapter", "", "Lru/ozon/app/android/cart/common/dynamicElement/DynamicElementDTO;", "nullableListOfDynamicElementDTOAdapter", "Lru/ozon/app/android/cart/cartSplitV2/v1/data/CartSplitV2DTO$Item$Controls;", "nullableControlsAdapter", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class CartSplitV2DTO_ItemJsonAdapter extends JsonAdapter<CartSplitV2DTO.Item> {
    public static final int $stable = 8;

    @NotNull
    private final JsonAdapter<CartSplitV2DTO.Item.Checkbox> nullableCheckboxAdapter;

    @NotNull
    private final JsonAdapter<CartSplitV2DTO.Item.Controls> nullableControlsAdapter;

    @NotNull
    private final JsonAdapter<List<DynamicElementDTO>> nullableListOfDynamicElementDTOAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<ProductDTO> productDTOAdapter;

    public CartSplitV2DTO_ItemJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("checkbox", ReviewGalleryV2DTO.ReviewGalleryV2Item.ItemsContainerDTO.PRODUCT_FIELD_NAME, "dynamicElements", "controls");
        M m11 = M.f71699a;
        this.nullableCheckboxAdapter = moshi.f(CartSplitV2DTO.Item.Checkbox.class, m11, "checkbox");
        this.productDTOAdapter = moshi.f(ProductDTO.class, m11, ReviewGalleryV2DTO.ReviewGalleryV2Item.ItemsContainerDTO.PRODUCT_FIELD_NAME);
        this.nullableListOfDynamicElementDTOAdapter = moshi.f(D.e(List.class, DynamicElementDTO.class), m11, "dynamicElements");
        this.nullableControlsAdapter = moshi.f(CartSplitV2DTO.Item.Controls.class, m11, "controls");
    }

    @NotNull
    public String toString() {
        return b.c(41, "GeneratedJsonAdapter(CartSplitV2DTO.Item)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public CartSplitV2DTO.Item fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        CartSplitV2DTO.Item.Checkbox checkbox = null;
        ProductDTO productDTO = null;
        List<DynamicElementDTO> list = null;
        CartSplitV2DTO.Item.Controls controls = null;
        while (reader.hasNext()) {
            int v11 = reader.v(this.options);
            if (v11 == -1) {
                reader.y();
                reader.skipValue();
            } else if (v11 == 0) {
                checkbox = this.nullableCheckboxAdapter.fromJson(reader);
            } else if (v11 == 1) {
                productDTO = this.productDTOAdapter.fromJson(reader);
                if (productDTO == null) {
                    throw c.q(ReviewGalleryV2DTO.ReviewGalleryV2Item.ItemsContainerDTO.PRODUCT_FIELD_NAME, ReviewGalleryV2DTO.ReviewGalleryV2Item.ItemsContainerDTO.PRODUCT_FIELD_NAME, reader);
                }
            } else if (v11 == 2) {
                list = this.nullableListOfDynamicElementDTOAdapter.fromJson(reader);
            } else if (v11 == 3) {
                controls = this.nullableControlsAdapter.fromJson(reader);
            }
        }
        reader.endObject();
        if (productDTO != null) {
            return new CartSplitV2DTO.Item(checkbox, productDTO, list, controls);
        }
        throw c.j(ReviewGalleryV2DTO.ReviewGalleryV2Item.ItemsContainerDTO.PRODUCT_FIELD_NAME, ReviewGalleryV2DTO.ReviewGalleryV2Item.ItemsContainerDTO.PRODUCT_FIELD_NAME, reader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, CartSplitV2DTO.Item value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("checkbox");
        this.nullableCheckboxAdapter.mo44toJson(writer, (x) value.getCheckbox());
        writer.w(ReviewGalleryV2DTO.ReviewGalleryV2Item.ItemsContainerDTO.PRODUCT_FIELD_NAME);
        this.productDTOAdapter.mo44toJson(writer, (x) value.getProduct());
        writer.w("dynamicElements");
        this.nullableListOfDynamicElementDTOAdapter.mo44toJson(writer, (x) value.getDynamicElements());
        writer.w("controls");
        this.nullableControlsAdapter.mo44toJson(writer, (x) value.getControls());
        writer.p();
    }
}
