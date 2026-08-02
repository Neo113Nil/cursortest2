package ru.ozon.app.android.fresh.cart.ui.molecules.cartPicker.data;

import Ak.b;
import Y9.c;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.D;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.n;
import com.squareup.moshi.x;
import java.lang.reflect.Constructor;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.M;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.fresh.cart.ui.molecules.cartPicker.data.CartPickerDTO;
import ru.ozon.uni.atoms.data.AtomActionDTO;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R(\u0010\u001e\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u001c0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0019R\u001e\u0010 \u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!¨\u0006\""}, d2 = {"Lru/ozon/app/android/fresh/cart/ui/molecules/cartPicker/data/CartPickerDTO_QuantityControl_ChangeQuantityJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/fresh/cart/ui/molecules/cartPicker/data/CartPickerDTO$QuantityControl$ChangeQuantity;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/fresh/cart/ui/molecules/cartPicker/data/CartPickerDTO$QuantityControl$ChangeQuantity;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/fresh/cart/ui/molecules/cartPicker/data/CartPickerDTO$QuantityControl$ChangeQuantity;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "atomActionDTOAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "floatAdapter", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "nullableMapOfStringTokenizedTrackingInfoAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "widgets-cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class CartPickerDTO_QuantityControl_ChangeQuantityJsonAdapter extends JsonAdapter<CartPickerDTO.QuantityControl.ChangeQuantity> {
    public static final int $stable = 8;

    @NotNull
    private final JsonAdapter<AtomActionDTO> atomActionDTOAdapter;
    private volatile Constructor<CartPickerDTO.QuantityControl.ChangeQuantity> constructorRef;

    @NotNull
    private final JsonAdapter<Float> floatAdapter;

    @NotNull
    private final JsonAdapter<Map<String, TokenizedTrackingInfo>> nullableMapOfStringTokenizedTrackingInfoAdapter;

    @NotNull
    private final n.a options;

    public CartPickerDTO_QuantityControl_ChangeQuantityJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("changeValueAction", "changeValueDebounceDelay", "incrementTrackingInfo", "decrementTrackingInfo");
        M m11 = M.f71699a;
        this.atomActionDTOAdapter = moshi.f(AtomActionDTO.class, m11, "changeValueAction");
        this.floatAdapter = moshi.f(Float.TYPE, m11, "changeValueDebounceDelay");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter = moshi.f(D.e(Map.class, String.class, TokenizedTrackingInfo.class), m11, "incrementTrackingInfo");
    }

    @NotNull
    public String toString() {
        return b.c(66, "GeneratedJsonAdapter(CartPickerDTO.QuantityControl.ChangeQuantity)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public CartPickerDTO.QuantityControl.ChangeQuantity fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        Float valueOf = Float.valueOf(0.0f);
        reader.beginObject();
        Float f7 = valueOf;
        AtomActionDTO atomActionDTO = null;
        Map<String, TokenizedTrackingInfo> map = null;
        Map<String, TokenizedTrackingInfo> map2 = null;
        int i11 = -1;
        while (reader.hasNext()) {
            int v11 = reader.v(this.options);
            if (v11 == -1) {
                reader.y();
                reader.skipValue();
            } else if (v11 == 0) {
                atomActionDTO = this.atomActionDTOAdapter.fromJson(reader);
                if (atomActionDTO == null) {
                    throw c.q("changeValueAction", "changeValueAction", reader);
                }
            } else if (v11 == 1) {
                f7 = this.floatAdapter.fromJson(reader);
                if (f7 == null) {
                    throw c.q("changeValueDebounceDelay", "changeValueDebounceDelay", reader);
                }
                i11 = -3;
            } else if (v11 == 2) {
                map = this.nullableMapOfStringTokenizedTrackingInfoAdapter.fromJson(reader);
            } else if (v11 == 3) {
                map2 = this.nullableMapOfStringTokenizedTrackingInfoAdapter.fromJson(reader);
            }
        }
        reader.endObject();
        if (i11 == -3) {
            if (atomActionDTO != null) {
                return new CartPickerDTO.QuantityControl.ChangeQuantity(atomActionDTO, f7.floatValue(), map, map2);
            }
            throw c.j("changeValueAction", "changeValueAction", reader);
        }
        Constructor<CartPickerDTO.QuantityControl.ChangeQuantity> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = CartPickerDTO.QuantityControl.ChangeQuantity.class.getDeclaredConstructor(AtomActionDTO.class, Float.TYPE, Map.class, Map.class, Integer.TYPE, c.f34864d);
            this.constructorRef = constructor;
            Intrinsics.checkNotNullExpressionValue(constructor, "also(...)");
        }
        if (atomActionDTO == null) {
            throw c.j("changeValueAction", "changeValueAction", reader);
        }
        CartPickerDTO.QuantityControl.ChangeQuantity newInstance = constructor.newInstance(atomActionDTO, f7, map, map2, Integer.valueOf(i11), null);
        Intrinsics.checkNotNullExpressionValue(newInstance, "newInstance(...)");
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, CartPickerDTO.QuantityControl.ChangeQuantity value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("changeValueAction");
        this.atomActionDTOAdapter.mo44toJson(writer, (x) value.getChangeValueAction());
        writer.w("changeValueDebounceDelay");
        this.floatAdapter.mo44toJson(writer, (x) Float.valueOf(value.getChangeValueDebounceDelay()));
        writer.w("incrementTrackingInfo");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter.mo44toJson(writer, (x) value.getIncrementTrackingInfo());
        writer.w("decrementTrackingInfo");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter.mo44toJson(writer, (x) value.getDecrementTrackingInfo());
        writer.p();
    }
}
