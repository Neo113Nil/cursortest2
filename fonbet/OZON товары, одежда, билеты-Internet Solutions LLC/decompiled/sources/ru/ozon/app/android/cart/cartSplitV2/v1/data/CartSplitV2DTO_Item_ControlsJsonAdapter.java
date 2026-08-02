package ru.ozon.app.android.cart.cartSplitV2.v1.data;

import Ak.b;
import Y9.c;
import com.google.android.gms.analytics.ecommerce.ProductAction;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.n;
import com.squareup.moshi.x;
import kotlin.Metadata;
import kotlin.collections.M;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cart.cartSplitV2.v1.data.CartSplitV2DTO;
import ru.ozon.app.android.favorites.data.favoritebutton.favoriteproduct.FavoriteProductMolecule;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u001c\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0019R\u001c\u0010\u001f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0019¨\u0006 "}, d2 = {"Lru/ozon/app/android/cart/cartSplitV2/v1/data/CartSplitV2DTO_Item_ControlsJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/cart/cartSplitV2/v1/data/CartSplitV2DTO$Item$Controls;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/cart/cartSplitV2/v1/data/CartSplitV2DTO$Item$Controls;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/cart/cartSplitV2/v1/data/CartSplitV2DTO$Item$Controls;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "Lru/ozon/app/android/favorites/data/favoritebutton/favoriteproduct/FavoriteProductMolecule;", "favoriteProductMoleculeAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/cart/cartSplitV2/v1/data/CartSplitV2DTO$Item$Controls$RemoveControl;", "removeControlAdapter", "Lru/ozon/app/android/cart/cartSplitV2/v1/data/CartSplitV2DTO$Item$Controls$QuantityControl;", "nullableQuantityControlAdapter", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "nullableButtonV3DTOAdapter", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class CartSplitV2DTO_Item_ControlsJsonAdapter extends JsonAdapter<CartSplitV2DTO.Item.Controls> {
    public static final int $stable = 8;

    @NotNull
    private final JsonAdapter<FavoriteProductMolecule> favoriteProductMoleculeAdapter;

    @NotNull
    private final JsonAdapter<ButtonV3DTO> nullableButtonV3DTOAdapter;

    @NotNull
    private final JsonAdapter<CartSplitV2DTO.Item.Controls.QuantityControl> nullableQuantityControlAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<CartSplitV2DTO.Item.Controls.RemoveControl> removeControlAdapter;

    public CartSplitV2DTO_Item_ControlsJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("favoriteProduct", ProductAction.ACTION_REMOVE, "quantity", "buyInOneClick");
        M m11 = M.f71699a;
        this.favoriteProductMoleculeAdapter = moshi.f(FavoriteProductMolecule.class, m11, "favoriteProduct");
        this.removeControlAdapter = moshi.f(CartSplitV2DTO.Item.Controls.RemoveControl.class, m11, ProductAction.ACTION_REMOVE);
        this.nullableQuantityControlAdapter = moshi.f(CartSplitV2DTO.Item.Controls.QuantityControl.class, m11, "quantity");
        this.nullableButtonV3DTOAdapter = moshi.f(ButtonV3DTO.class, m11, "buyInOneClick");
    }

    @NotNull
    public String toString() {
        return b.c(50, "GeneratedJsonAdapter(CartSplitV2DTO.Item.Controls)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public CartSplitV2DTO.Item.Controls fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        FavoriteProductMolecule favoriteProductMolecule = null;
        CartSplitV2DTO.Item.Controls.RemoveControl removeControl = null;
        CartSplitV2DTO.Item.Controls.QuantityControl quantityControl = null;
        ButtonV3DTO buttonV3DTO = null;
        while (reader.hasNext()) {
            int v11 = reader.v(this.options);
            if (v11 == -1) {
                reader.y();
                reader.skipValue();
            } else if (v11 == 0) {
                favoriteProductMolecule = this.favoriteProductMoleculeAdapter.fromJson(reader);
                if (favoriteProductMolecule == null) {
                    throw c.q("favoriteProduct", "favoriteProduct", reader);
                }
            } else if (v11 == 1) {
                removeControl = this.removeControlAdapter.fromJson(reader);
                if (removeControl == null) {
                    throw c.q(ProductAction.ACTION_REMOVE, ProductAction.ACTION_REMOVE, reader);
                }
            } else if (v11 == 2) {
                quantityControl = this.nullableQuantityControlAdapter.fromJson(reader);
            } else if (v11 == 3) {
                buttonV3DTO = this.nullableButtonV3DTOAdapter.fromJson(reader);
            }
        }
        reader.endObject();
        if (favoriteProductMolecule == null) {
            throw c.j("favoriteProduct", "favoriteProduct", reader);
        }
        if (removeControl != null) {
            return new CartSplitV2DTO.Item.Controls(favoriteProductMolecule, removeControl, quantityControl, buttonV3DTO);
        }
        throw c.j(ProductAction.ACTION_REMOVE, ProductAction.ACTION_REMOVE, reader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, CartSplitV2DTO.Item.Controls value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("favoriteProduct");
        this.favoriteProductMoleculeAdapter.mo44toJson(writer, (x) value.getFavoriteProduct());
        writer.w(ProductAction.ACTION_REMOVE);
        this.removeControlAdapter.mo44toJson(writer, (x) value.getRemove());
        writer.w("quantity");
        this.nullableQuantityControlAdapter.mo44toJson(writer, (x) value.getQuantity());
        writer.w("buyInOneClick");
        this.nullableButtonV3DTOAdapter.mo44toJson(writer, (x) value.getBuyInOneClick());
        writer.p();
    }
}
