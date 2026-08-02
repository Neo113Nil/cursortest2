package ru.ozon.app.android.cart.cartSplitV2.v2.data;

import Ak.b;
import Y9.c;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.n;
import com.squareup.moshi.x;
import kotlin.Metadata;
import kotlin.collections.M;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cart.cartSplitV2.v2.subwidgets.presentation.product.productView.ProductDTOV2;
import ru.ozon.app.android.favorites.data.favoritebutton.favoriteproduct.FavoriteProductMolecule;
import ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.data.ReviewGalleryV2DTO;
import ru.ozon.uni.atoms.data.AtomActionDTO;

@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0019R\u001c\u0010\u001f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0019R\u001c\u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010 0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u0019R\u001c\u0010#\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\"0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\u0019R\u001c\u0010%\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010$0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010\u0019R\u001c\u0010'\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010&0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010\u0019¨\u0006("}, d2 = {"Lru/ozon/app/android/cart/cartSplitV2/v2/data/CartSplitV2ProductDTOV2JsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/cart/cartSplitV2/v2/data/CartSplitV2ProductDTOV2;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/cart/cartSplitV2/v2/data/CartSplitV2ProductDTOV2;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/cart/cartSplitV2/v2/data/CartSplitV2ProductDTOV2;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "", "intAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/cart/cartSplitV2/v2/data/CheckboxDTO;", "nullableCheckboxDTOAdapter", "Lru/ozon/app/android/cart/cartSplitV2/v2/subwidgets/presentation/product/productView/ProductDTOV2;", "productDTOV2Adapter", "Lru/ozon/app/android/cart/cartSplitV2/v2/data/SeparatorConfig;", "nullableSeparatorConfigAdapter", "Lru/ozon/app/android/cart/cartSplitV2/v2/data/SwipeInfoDTO;", "nullableSwipeInfoDTOAdapter", "Lru/ozon/app/android/favorites/data/favoritebutton/favoriteproduct/FavoriteProductMolecule;", "nullableFavoriteProductMoleculeAdapter", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "nullableAtomActionDTOAdapter", "Lru/ozon/app/android/cart/cartSplitV2/v2/data/CartSplitV2DynamicElementsDTOV2;", "nullableCartSplitV2DynamicElementsDTOV2Adapter", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class CartSplitV2ProductDTOV2JsonAdapter extends JsonAdapter<CartSplitV2ProductDTOV2> {
    public static final int $stable = 8;

    @NotNull
    private final JsonAdapter<Integer> intAdapter;

    @NotNull
    private final JsonAdapter<AtomActionDTO> nullableAtomActionDTOAdapter;

    @NotNull
    private final JsonAdapter<CartSplitV2DynamicElementsDTOV2> nullableCartSplitV2DynamicElementsDTOV2Adapter;

    @NotNull
    private final JsonAdapter<CheckboxDTO> nullableCheckboxDTOAdapter;

    @NotNull
    private final JsonAdapter<FavoriteProductMolecule> nullableFavoriteProductMoleculeAdapter;

    @NotNull
    private final JsonAdapter<SeparatorConfig> nullableSeparatorConfigAdapter;

    @NotNull
    private final JsonAdapter<SwipeInfoDTO> nullableSwipeInfoDTOAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<ProductDTOV2> productDTOV2Adapter;

    public CartSplitV2ProductDTOV2JsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("index", "checkbox", ReviewGalleryV2DTO.ReviewGalleryV2Item.ItemsContainerDTO.PRODUCT_FIELD_NAME, "cartItemsSeparator", "swipeInfo", "favoriteProduct", "removeAction", "bottomDynamicElements");
        M m11 = M.f71699a;
        this.intAdapter = moshi.f(Integer.TYPE, m11, "index");
        this.nullableCheckboxDTOAdapter = moshi.f(CheckboxDTO.class, m11, "checkbox");
        this.productDTOV2Adapter = moshi.f(ProductDTOV2.class, m11, ReviewGalleryV2DTO.ReviewGalleryV2Item.ItemsContainerDTO.PRODUCT_FIELD_NAME);
        this.nullableSeparatorConfigAdapter = moshi.f(SeparatorConfig.class, m11, "cartItemsSeparator");
        this.nullableSwipeInfoDTOAdapter = moshi.f(SwipeInfoDTO.class, m11, "swipeInfo");
        this.nullableFavoriteProductMoleculeAdapter = moshi.f(FavoriteProductMolecule.class, m11, "favoriteProduct");
        this.nullableAtomActionDTOAdapter = moshi.f(AtomActionDTO.class, m11, "removeAction");
        this.nullableCartSplitV2DynamicElementsDTOV2Adapter = moshi.f(CartSplitV2DynamicElementsDTOV2.class, m11, "bottomDynamicElements");
    }

    @NotNull
    public String toString() {
        return b.c(45, "GeneratedJsonAdapter(CartSplitV2ProductDTOV2)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public CartSplitV2ProductDTOV2 fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        Integer num = null;
        CheckboxDTO checkboxDTO = null;
        ProductDTOV2 productDTOV2 = null;
        SeparatorConfig separatorConfig = null;
        SwipeInfoDTO swipeInfoDTO = null;
        FavoriteProductMolecule favoriteProductMolecule = null;
        AtomActionDTO atomActionDTO = null;
        CartSplitV2DynamicElementsDTOV2 cartSplitV2DynamicElementsDTOV2 = null;
        while (reader.hasNext()) {
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    break;
                case 0:
                    num = this.intAdapter.fromJson(reader);
                    if (num == null) {
                        throw c.q("index", "index", reader);
                    }
                    break;
                case 1:
                    checkboxDTO = this.nullableCheckboxDTOAdapter.fromJson(reader);
                    break;
                case 2:
                    productDTOV2 = this.productDTOV2Adapter.fromJson(reader);
                    if (productDTOV2 == null) {
                        throw c.q(ReviewGalleryV2DTO.ReviewGalleryV2Item.ItemsContainerDTO.PRODUCT_FIELD_NAME, ReviewGalleryV2DTO.ReviewGalleryV2Item.ItemsContainerDTO.PRODUCT_FIELD_NAME, reader);
                    }
                    break;
                case 3:
                    separatorConfig = this.nullableSeparatorConfigAdapter.fromJson(reader);
                    break;
                case 4:
                    swipeInfoDTO = this.nullableSwipeInfoDTOAdapter.fromJson(reader);
                    break;
                case 5:
                    favoriteProductMolecule = this.nullableFavoriteProductMoleculeAdapter.fromJson(reader);
                    break;
                case 6:
                    atomActionDTO = this.nullableAtomActionDTOAdapter.fromJson(reader);
                    break;
                case 7:
                    cartSplitV2DynamicElementsDTOV2 = this.nullableCartSplitV2DynamicElementsDTOV2Adapter.fromJson(reader);
                    break;
            }
        }
        reader.endObject();
        if (num == null) {
            throw c.j("index", "index", reader);
        }
        int intValue = num.intValue();
        if (productDTOV2 != null) {
            return new CartSplitV2ProductDTOV2(intValue, checkboxDTO, productDTOV2, separatorConfig, swipeInfoDTO, favoriteProductMolecule, atomActionDTO, cartSplitV2DynamicElementsDTOV2);
        }
        throw c.j(ReviewGalleryV2DTO.ReviewGalleryV2Item.ItemsContainerDTO.PRODUCT_FIELD_NAME, ReviewGalleryV2DTO.ReviewGalleryV2Item.ItemsContainerDTO.PRODUCT_FIELD_NAME, reader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, CartSplitV2ProductDTOV2 value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("index");
        this.intAdapter.mo44toJson(writer, (x) Integer.valueOf(value.getIndex()));
        writer.w("checkbox");
        this.nullableCheckboxDTOAdapter.mo44toJson(writer, (x) value.getCheckbox());
        writer.w(ReviewGalleryV2DTO.ReviewGalleryV2Item.ItemsContainerDTO.PRODUCT_FIELD_NAME);
        this.productDTOV2Adapter.mo44toJson(writer, (x) value.getProduct());
        writer.w("cartItemsSeparator");
        this.nullableSeparatorConfigAdapter.mo44toJson(writer, (x) value.getCartItemsSeparator());
        writer.w("swipeInfo");
        this.nullableSwipeInfoDTOAdapter.mo44toJson(writer, (x) value.getSwipeInfo());
        writer.w("favoriteProduct");
        this.nullableFavoriteProductMoleculeAdapter.mo44toJson(writer, (x) value.getFavoriteProduct());
        writer.w("removeAction");
        this.nullableAtomActionDTOAdapter.mo44toJson(writer, (x) value.getRemoveAction());
        writer.w("bottomDynamicElements");
        this.nullableCartSplitV2DynamicElementsDTOV2Adapter.mo44toJson(writer, (x) value.getBottomDynamicElements());
        writer.p();
    }
}
