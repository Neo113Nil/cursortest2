package ru.ozon.app.android.pdp.widgets.cartButtonQuant;

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
import ru.ozon.app.android.pdp.widgets.cartButtonQuant.CartButtonQuantDto;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0019R\u001c\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0019¨\u0006\u001f"}, d2 = {"Lru/ozon/app/android/pdp/widgets/cartButtonQuant/CartButtonQuantDto_Configuration_CartDataJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/pdp/widgets/cartButtonQuant/CartButtonQuantDto$Configuration$CartData;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/pdp/widgets/cartButtonQuant/CartButtonQuantDto$Configuration$CartData;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/pdp/widgets/cartButtonQuant/CartButtonQuantDto$Configuration$CartData;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "", "booleanAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/pdp/widgets/cartButtonQuant/CartButtonQuantDto$Configuration$CartData$Buttons;", "buttonsAdapter", "", "intAdapter", "nullableIntAdapter", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class CartButtonQuantDto_Configuration_CartDataJsonAdapter extends JsonAdapter<CartButtonQuantDto.Configuration.CartData> {
    public static final int $stable = 8;

    @NotNull
    private final JsonAdapter<Boolean> booleanAdapter;

    @NotNull
    private final JsonAdapter<CartButtonQuantDto.Configuration.CartData.Buttons> buttonsAdapter;

    @NotNull
    private final JsonAdapter<Integer> intAdapter;

    @NotNull
    private final JsonAdapter<Integer> nullableIntAdapter;

    @NotNull
    private final n.a options;

    public CartButtonQuantDto_Configuration_CartDataJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("isInCart", "inCart", "toCart", "inCartQty", "freeRest", "minAddToCartQuantity", "multiplicityValue", "quantMultiplicityValue");
        M m11 = M.f71699a;
        this.booleanAdapter = moshi.f(Boolean.TYPE, m11, "isInCart");
        this.buttonsAdapter = moshi.f(CartButtonQuantDto.Configuration.CartData.Buttons.class, m11, "inCart");
        this.intAdapter = moshi.f(Integer.TYPE, m11, "inCartQty");
        this.nullableIntAdapter = moshi.f(Integer.class, m11, "minAddToCartQuantity");
    }

    @NotNull
    public String toString() {
        return b.c(63, "GeneratedJsonAdapter(CartButtonQuantDto.Configuration.CartData)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public CartButtonQuantDto.Configuration.CartData fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        Boolean bool = null;
        Integer num = null;
        Integer num2 = null;
        CartButtonQuantDto.Configuration.CartData.Buttons buttons = null;
        CartButtonQuantDto.Configuration.CartData.Buttons buttons2 = null;
        Integer num3 = null;
        Integer num4 = null;
        Integer num5 = null;
        while (reader.hasNext()) {
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    break;
                case 0:
                    bool = this.booleanAdapter.fromJson(reader);
                    if (bool == null) {
                        throw c.q("isInCart", "isInCart", reader);
                    }
                    break;
                case 1:
                    buttons = this.buttonsAdapter.fromJson(reader);
                    if (buttons == null) {
                        throw c.q("inCart", "inCart", reader);
                    }
                    break;
                case 2:
                    buttons2 = this.buttonsAdapter.fromJson(reader);
                    if (buttons2 == null) {
                        throw c.q("toCart", "toCart", reader);
                    }
                    break;
                case 3:
                    num = this.intAdapter.fromJson(reader);
                    if (num == null) {
                        throw c.q("inCartQty", "inCartQty", reader);
                    }
                    break;
                case 4:
                    num2 = this.intAdapter.fromJson(reader);
                    if (num2 == null) {
                        throw c.q("freeRest", "freeRest", reader);
                    }
                    break;
                case 5:
                    num3 = this.nullableIntAdapter.fromJson(reader);
                    break;
                case 6:
                    num4 = this.nullableIntAdapter.fromJson(reader);
                    break;
                case 7:
                    num5 = this.nullableIntAdapter.fromJson(reader);
                    break;
            }
        }
        reader.endObject();
        Integer num6 = num;
        if (bool == null) {
            throw c.j("isInCart", "isInCart", reader);
        }
        boolean booleanValue = bool.booleanValue();
        if (buttons == null) {
            throw c.j("inCart", "inCart", reader);
        }
        if (buttons2 == null) {
            throw c.j("toCart", "toCart", reader);
        }
        if (num6 == null) {
            throw c.j("inCartQty", "inCartQty", reader);
        }
        int intValue = num6.intValue();
        if (num2 != null) {
            return new CartButtonQuantDto.Configuration.CartData(booleanValue, buttons, buttons2, intValue, num2.intValue(), num3, num4, num5);
        }
        throw c.j("freeRest", "freeRest", reader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, CartButtonQuantDto.Configuration.CartData value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("isInCart");
        this.booleanAdapter.mo44toJson(writer, (x) Boolean.valueOf(value.isInCart()));
        writer.w("inCart");
        this.buttonsAdapter.mo44toJson(writer, (x) value.getInCart());
        writer.w("toCart");
        this.buttonsAdapter.mo44toJson(writer, (x) value.getToCart());
        writer.w("inCartQty");
        this.intAdapter.mo44toJson(writer, (x) Integer.valueOf(value.getInCartQty()));
        writer.w("freeRest");
        this.intAdapter.mo44toJson(writer, (x) Integer.valueOf(value.getFreeRest()));
        writer.w("minAddToCartQuantity");
        this.nullableIntAdapter.mo44toJson(writer, (x) value.getMinAddToCartQuantity());
        writer.w("multiplicityValue");
        this.nullableIntAdapter.mo44toJson(writer, (x) value.getMultiplicityValue());
        writer.w("quantMultiplicityValue");
        this.nullableIntAdapter.mo44toJson(writer, (x) value.getQuantMultiplicityValue());
        writer.p();
    }
}
