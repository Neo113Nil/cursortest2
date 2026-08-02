package ru.ozon.app.android.pdp.widgets.cartButtonV5.data;

import Ak.b;
import C.o0;
import Y9.c;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.n;
import com.squareup.moshi.x;
import java.lang.reflect.Constructor;
import kotlin.Metadata;
import kotlin.collections.M;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.widgets.cartButtonV5.data.CartButtonV5DTO;

@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u001c\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0019R\u001c\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001d0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0019R\u001c\u0010\u001f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0019R\u001a\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u0019R\u001c\u0010\"\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010 0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u0019R\u001e\u0010$\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%¨\u0006&"}, d2 = {"Lru/ozon/app/android/pdp/widgets/cartButtonV5/data/CartButtonV5DTO_CartButtonJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/pdp/widgets/cartButtonV5/data/CartButtonV5DTO$CartButton;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/pdp/widgets/cartButtonV5/data/CartButtonV5DTO$CartButton;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/pdp/widgets/cartButtonV5/data/CartButtonV5DTO$CartButton;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "", "booleanAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/pdp/widgets/cartButtonV5/data/CartButtonV5DTO$CartButton$Button;", "buttonAdapter", "nullableButtonAdapter", "Lru/ozon/app/android/pdp/widgets/cartButtonV5/data/CartButtonV5DTO$CartButton$AdditionalButton;", "nullableAdditionalButtonAdapter", "nullableStringAdapter", "", "intAdapter", "nullableIntAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class CartButtonV5DTO_CartButtonJsonAdapter extends JsonAdapter<CartButtonV5DTO.CartButton> {
    public static final int $stable = 8;

    @NotNull
    private final JsonAdapter<Boolean> booleanAdapter;

    @NotNull
    private final JsonAdapter<CartButtonV5DTO.CartButton.Button> buttonAdapter;
    private volatile Constructor<CartButtonV5DTO.CartButton> constructorRef;

    @NotNull
    private final JsonAdapter<Integer> intAdapter;

    @NotNull
    private final JsonAdapter<CartButtonV5DTO.CartButton.AdditionalButton> nullableAdditionalButtonAdapter;

    @NotNull
    private final JsonAdapter<CartButtonV5DTO.CartButton.Button> nullableButtonAdapter;

    @NotNull
    private final JsonAdapter<Integer> nullableIntAdapter;

    @NotNull
    private final JsonAdapter<String> nullableStringAdapter;

    @NotNull
    private final n.a options;

    public CartButtonV5DTO_CartButtonJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("isInCart", "toCart", "inCart", "additionalButton", "sku", "deliverySchema", "freeRest", "minAddToCartQuantity", "inCartQuantity", "multiplicityValue", "quantMultiplicityValue");
        M m11 = M.f71699a;
        this.booleanAdapter = moshi.f(Boolean.TYPE, m11, "isInCart");
        this.buttonAdapter = moshi.f(CartButtonV5DTO.CartButton.Button.class, m11, "toCart");
        this.nullableButtonAdapter = moshi.f(CartButtonV5DTO.CartButton.Button.class, m11, "inCart");
        this.nullableAdditionalButtonAdapter = moshi.f(CartButtonV5DTO.CartButton.AdditionalButton.class, m11, "additionalButton");
        this.nullableStringAdapter = moshi.f(String.class, m11, "sku");
        this.intAdapter = moshi.f(Integer.TYPE, m11, "freeRest");
        this.nullableIntAdapter = moshi.f(Integer.class, m11, "quantMultiplicityValue");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public CartButtonV5DTO.CartButton fromJson(@NotNull n reader) {
        int i11 = -1;
        Integer a11 = o0.a(reader, "reader", 0);
        Integer num = a11;
        Integer num2 = num;
        Integer num3 = num2;
        Boolean bool = null;
        Integer num4 = null;
        CartButtonV5DTO.CartButton.Button button = null;
        CartButtonV5DTO.CartButton.Button button2 = null;
        CartButtonV5DTO.CartButton.AdditionalButton additionalButton = null;
        String str = null;
        String str2 = null;
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
                    button = this.buttonAdapter.fromJson(reader);
                    if (button == null) {
                        throw c.q("toCart", "toCart", reader);
                    }
                    break;
                case 2:
                    button2 = this.nullableButtonAdapter.fromJson(reader);
                    break;
                case 3:
                    additionalButton = this.nullableAdditionalButtonAdapter.fromJson(reader);
                    break;
                case 4:
                    str = this.nullableStringAdapter.fromJson(reader);
                    break;
                case 5:
                    str2 = this.nullableStringAdapter.fromJson(reader);
                    break;
                case 6:
                    a11 = this.intAdapter.fromJson(reader);
                    if (a11 == null) {
                        throw c.q("freeRest", "freeRest", reader);
                    }
                    i11 &= -65;
                    break;
                case 7:
                    num = this.intAdapter.fromJson(reader);
                    if (num == null) {
                        throw c.q("minAddToCartQuantity", "minAddToCartQuantity", reader);
                    }
                    i11 &= -129;
                    break;
                case 8:
                    num2 = this.intAdapter.fromJson(reader);
                    if (num2 == null) {
                        throw c.q("inCartQuantity", "inCartQuantity", reader);
                    }
                    i11 &= -257;
                    break;
                case 9:
                    num3 = this.intAdapter.fromJson(reader);
                    if (num3 == null) {
                        throw c.q("multiplicityValue", "multiplicityValue", reader);
                    }
                    i11 &= -513;
                    break;
                case 10:
                    num4 = this.nullableIntAdapter.fromJson(reader);
                    break;
            }
        }
        reader.endObject();
        if (i11 == -961) {
            Integer num5 = num4;
            if (bool == null) {
                throw c.j("isInCart", "isInCart", reader);
            }
            boolean booleanValue = bool.booleanValue();
            if (button != null) {
                return new CartButtonV5DTO.CartButton(booleanValue, button, button2, additionalButton, str, str2, a11.intValue(), num.intValue(), num2.intValue(), num3.intValue(), num5);
            }
            throw c.j("toCart", "toCart", reader);
        }
        Integer num6 = num4;
        Constructor<CartButtonV5DTO.CartButton> constructor = this.constructorRef;
        if (constructor == null) {
            Class<?> cls = c.f34864d;
            Class cls2 = Integer.TYPE;
            constructor = CartButtonV5DTO.CartButton.class.getDeclaredConstructor(Boolean.TYPE, CartButtonV5DTO.CartButton.Button.class, CartButtonV5DTO.CartButton.Button.class, CartButtonV5DTO.CartButton.AdditionalButton.class, String.class, String.class, cls2, cls2, cls2, cls2, Integer.class, cls2, cls);
            this.constructorRef = constructor;
            Intrinsics.checkNotNullExpressionValue(constructor, "also(...)");
        }
        if (bool == null) {
            throw c.j("isInCart", "isInCart", reader);
        }
        if (button == null) {
            throw c.j("toCart", "toCart", reader);
        }
        CartButtonV5DTO.CartButton newInstance = constructor.newInstance(bool, button, button2, additionalButton, str, str2, a11, num, num2, num3, num6, Integer.valueOf(i11), null);
        Intrinsics.checkNotNullExpressionValue(newInstance, "newInstance(...)");
        return newInstance;
    }

    @NotNull
    public String toString() {
        return b.c(48, "GeneratedJsonAdapter(CartButtonV5DTO.CartButton)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, CartButtonV5DTO.CartButton value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("isInCart");
        this.booleanAdapter.mo44toJson(writer, (x) Boolean.valueOf(value.isInCart()));
        writer.w("toCart");
        this.buttonAdapter.mo44toJson(writer, (x) value.getToCart());
        writer.w("inCart");
        this.nullableButtonAdapter.mo44toJson(writer, (x) value.getInCart());
        writer.w("additionalButton");
        this.nullableAdditionalButtonAdapter.mo44toJson(writer, (x) value.getAdditionalButton());
        writer.w("sku");
        this.nullableStringAdapter.mo44toJson(writer, (x) value.getSku());
        writer.w("deliverySchema");
        this.nullableStringAdapter.mo44toJson(writer, (x) value.getDeliverySchema());
        writer.w("freeRest");
        this.intAdapter.mo44toJson(writer, (x) Integer.valueOf(value.getFreeRest()));
        writer.w("minAddToCartQuantity");
        this.intAdapter.mo44toJson(writer, (x) Integer.valueOf(value.getMinAddToCartQuantity()));
        writer.w("inCartQuantity");
        this.intAdapter.mo44toJson(writer, (x) Integer.valueOf(value.getInCartQuantity()));
        writer.w("multiplicityValue");
        this.intAdapter.mo44toJson(writer, (x) Integer.valueOf(value.getMultiplicityValue()));
        writer.w("quantMultiplicityValue");
        this.nullableIntAdapter.mo44toJson(writer, (x) value.getQuantMultiplicityValue());
        writer.p();
    }
}
