package ru.ozon.app.android.fresh.cart.ui.molecules.cartPicker.data;

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
import ru.ozon.app.android.fresh.cart.ui.molecules.cartPicker.data.CartPickerDTO;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0019R\u001e\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"Lru/ozon/app/android/fresh/cart/ui/molecules/cartPicker/data/CartPickerDTO_QuantityControlJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/fresh/cart/ui/molecules/cartPicker/data/CartPickerDTO$QuantityControl;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/fresh/cart/ui/molecules/cartPicker/data/CartPickerDTO$QuantityControl;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/fresh/cart/ui/molecules/cartPicker/data/CartPickerDTO$QuantityControl;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "", "intAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/fresh/cart/ui/molecules/cartPicker/data/CartPickerDTO$QuantityControl$ChangeQuantity;", "changeQuantityAdapter", "Lru/ozon/app/android/fresh/cart/ui/molecules/cartPicker/data/CartPickerDTO$QuantityControl$DecrementRemove;", "decrementRemoveAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "widgets-cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class CartPickerDTO_QuantityControlJsonAdapter extends JsonAdapter<CartPickerDTO.QuantityControl> {
    public static final int $stable = 8;

    @NotNull
    private final JsonAdapter<CartPickerDTO.QuantityControl.ChangeQuantity> changeQuantityAdapter;
    private volatile Constructor<CartPickerDTO.QuantityControl> constructorRef;

    @NotNull
    private final JsonAdapter<CartPickerDTO.QuantityControl.DecrementRemove> decrementRemoveAdapter;

    @NotNull
    private final JsonAdapter<Integer> intAdapter;

    @NotNull
    private final n.a options;

    public CartPickerDTO_QuantityControlJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a(AppMeasurementSdk.ConditionalUserProperty.VALUE, "minValue", "maxValue", "multiplicity", "quantSize", "changeQuantityAction", "decrementRemoveAction");
        M m11 = M.f71699a;
        this.intAdapter = moshi.f(Integer.TYPE, m11, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        this.changeQuantityAdapter = moshi.f(CartPickerDTO.QuantityControl.ChangeQuantity.class, m11, "changeQuantityAction");
        this.decrementRemoveAdapter = moshi.f(CartPickerDTO.QuantityControl.DecrementRemove.class, m11, "decrementRemoveAction");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public CartPickerDTO.QuantityControl fromJson(@NotNull n reader) {
        int i11 = -1;
        Integer a11 = o0.a(reader, "reader", 0);
        Integer num = a11;
        Integer num2 = num;
        Integer num3 = num2;
        Integer num4 = num3;
        CartPickerDTO.QuantityControl.ChangeQuantity changeQuantity = null;
        CartPickerDTO.QuantityControl.DecrementRemove decrementRemove = null;
        while (reader.hasNext()) {
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    break;
                case 0:
                    a11 = this.intAdapter.fromJson(reader);
                    if (a11 == null) {
                        throw c.q("value_", AppMeasurementSdk.ConditionalUserProperty.VALUE, reader);
                    }
                    i11 &= -2;
                    break;
                case 1:
                    num = this.intAdapter.fromJson(reader);
                    if (num == null) {
                        throw c.q("minValue", "minValue", reader);
                    }
                    i11 &= -3;
                    break;
                case 2:
                    num2 = this.intAdapter.fromJson(reader);
                    if (num2 == null) {
                        throw c.q("maxValue", "maxValue", reader);
                    }
                    i11 &= -5;
                    break;
                case 3:
                    num3 = this.intAdapter.fromJson(reader);
                    if (num3 == null) {
                        throw c.q("multiplicity", "multiplicity", reader);
                    }
                    i11 &= -9;
                    break;
                case 4:
                    num4 = this.intAdapter.fromJson(reader);
                    if (num4 == null) {
                        throw c.q("quantSize", "quantSize", reader);
                    }
                    i11 &= -17;
                    break;
                case 5:
                    changeQuantity = this.changeQuantityAdapter.fromJson(reader);
                    if (changeQuantity == null) {
                        throw c.q("changeQuantityAction", "changeQuantityAction", reader);
                    }
                    break;
                case 6:
                    decrementRemove = this.decrementRemoveAdapter.fromJson(reader);
                    if (decrementRemove == null) {
                        throw c.q("decrementRemoveAction", "decrementRemoveAction", reader);
                    }
                    break;
            }
        }
        reader.endObject();
        if (i11 == -32) {
            int intValue = a11.intValue();
            int intValue2 = num.intValue();
            int intValue3 = num2.intValue();
            int intValue4 = num3.intValue();
            int intValue5 = num4.intValue();
            if (changeQuantity == null) {
                throw c.j("changeQuantityAction", "changeQuantityAction", reader);
            }
            if (decrementRemove != null) {
                return new CartPickerDTO.QuantityControl(intValue, intValue2, intValue3, intValue4, intValue5, changeQuantity, decrementRemove);
            }
            throw c.j("decrementRemoveAction", "decrementRemoveAction", reader);
        }
        Constructor<CartPickerDTO.QuantityControl> constructor = this.constructorRef;
        if (constructor == null) {
            Class<?> cls = c.f34864d;
            Class cls2 = Integer.TYPE;
            constructor = CartPickerDTO.QuantityControl.class.getDeclaredConstructor(cls2, cls2, cls2, cls2, cls2, CartPickerDTO.QuantityControl.ChangeQuantity.class, CartPickerDTO.QuantityControl.DecrementRemove.class, cls2, cls);
            this.constructorRef = constructor;
            Intrinsics.checkNotNullExpressionValue(constructor, "also(...)");
        }
        Constructor<CartPickerDTO.QuantityControl> constructor2 = constructor;
        if (changeQuantity == null) {
            throw c.j("changeQuantityAction", "changeQuantityAction", reader);
        }
        if (decrementRemove == null) {
            throw c.j("decrementRemoveAction", "decrementRemoveAction", reader);
        }
        CartPickerDTO.QuantityControl newInstance = constructor2.newInstance(a11, num, num2, num3, num4, changeQuantity, decrementRemove, Integer.valueOf(i11), null);
        Intrinsics.checkNotNullExpressionValue(newInstance, "newInstance(...)");
        return newInstance;
    }

    @NotNull
    public String toString() {
        return b.c(51, "GeneratedJsonAdapter(CartPickerDTO.QuantityControl)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, CartPickerDTO.QuantityControl value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w(AppMeasurementSdk.ConditionalUserProperty.VALUE);
        this.intAdapter.mo44toJson(writer, (x) Integer.valueOf(value.getValue()));
        writer.w("minValue");
        this.intAdapter.mo44toJson(writer, (x) Integer.valueOf(value.getMinValue()));
        writer.w("maxValue");
        this.intAdapter.mo44toJson(writer, (x) Integer.valueOf(value.getMaxValue()));
        writer.w("multiplicity");
        this.intAdapter.mo44toJson(writer, (x) Integer.valueOf(value.getMultiplicity()));
        writer.w("quantSize");
        this.intAdapter.mo44toJson(writer, (x) Integer.valueOf(value.getQuantSize()));
        writer.w("changeQuantityAction");
        this.changeQuantityAdapter.mo44toJson(writer, (x) value.getChangeQuantityAction());
        writer.w("decrementRemoveAction");
        this.decrementRemoveAdapter.mo44toJson(writer, (x) value.getDecrementRemoveAction());
        writer.p();
    }
}
