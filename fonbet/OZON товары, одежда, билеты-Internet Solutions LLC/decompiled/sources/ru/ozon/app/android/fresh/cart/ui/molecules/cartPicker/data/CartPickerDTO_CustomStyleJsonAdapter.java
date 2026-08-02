package ru.ozon.app.android.fresh.cart.ui.molecules.cartPicker.data;

import Ak.b;
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

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001e\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/fresh/cart/ui/molecules/cartPicker/data/CartPickerDTO_CustomStyleJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/fresh/cart/ui/molecules/cartPicker/data/CartPickerDTO$CustomStyle;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/fresh/cart/ui/molecules/cartPicker/data/CartPickerDTO$CustomStyle;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/fresh/cart/ui/molecules/cartPicker/data/CartPickerDTO$CustomStyle;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "widgets-cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class CartPickerDTO_CustomStyleJsonAdapter extends JsonAdapter<CartPickerDTO.CustomStyle> {
    public static final int $stable = 8;
    private volatile Constructor<CartPickerDTO.CustomStyle> constructorRef;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<String> stringAdapter;

    public CartPickerDTO_CustomStyleJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("backgroundColor", "buttonBackgroundColor", "clickedButtonBackgroundColor", "iconColor");
        this.stringAdapter = moshi.f(String.class, M.f71699a, "backgroundColor");
    }

    @NotNull
    public String toString() {
        return b.c(47, "GeneratedJsonAdapter(CartPickerDTO.CustomStyle)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public CartPickerDTO.CustomStyle fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        int i11 = -1;
        while (reader.hasNext()) {
            int v11 = reader.v(this.options);
            if (v11 == -1) {
                reader.y();
                reader.skipValue();
            } else if (v11 == 0) {
                str = this.stringAdapter.fromJson(reader);
                if (str == null) {
                    throw c.q("backgroundColor", "backgroundColor", reader);
                }
                i11 &= -2;
            } else if (v11 == 1) {
                str2 = this.stringAdapter.fromJson(reader);
                if (str2 == null) {
                    throw c.q("buttonBackgroundColor", "buttonBackgroundColor", reader);
                }
                i11 &= -3;
            } else if (v11 == 2) {
                str3 = this.stringAdapter.fromJson(reader);
                if (str3 == null) {
                    throw c.q("clickedButtonBackgroundColor", "clickedButtonBackgroundColor", reader);
                }
                i11 &= -5;
            } else if (v11 == 3) {
                str4 = this.stringAdapter.fromJson(reader);
                if (str4 == null) {
                    throw c.q("iconColor", "iconColor", reader);
                }
                i11 &= -9;
            } else {
                continue;
            }
        }
        reader.endObject();
        if (i11 == -16) {
            Intrinsics.g(str, "null cannot be cast to non-null type kotlin.String");
            Intrinsics.g(str2, "null cannot be cast to non-null type kotlin.String");
            Intrinsics.g(str3, "null cannot be cast to non-null type kotlin.String");
            Intrinsics.g(str4, "null cannot be cast to non-null type kotlin.String");
            return new CartPickerDTO.CustomStyle(str, str2, str3, str4);
        }
        Constructor<CartPickerDTO.CustomStyle> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = CartPickerDTO.CustomStyle.class.getDeclaredConstructor(String.class, String.class, String.class, String.class, Integer.TYPE, c.f34864d);
            this.constructorRef = constructor;
            Intrinsics.checkNotNullExpressionValue(constructor, "also(...)");
        }
        CartPickerDTO.CustomStyle newInstance = constructor.newInstance(str, str2, str3, str4, Integer.valueOf(i11), null);
        Intrinsics.checkNotNullExpressionValue(newInstance, "newInstance(...)");
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, CartPickerDTO.CustomStyle value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("backgroundColor");
        this.stringAdapter.mo44toJson(writer, (x) value.getBackgroundColor());
        writer.w("buttonBackgroundColor");
        this.stringAdapter.mo44toJson(writer, (x) value.getButtonBackgroundColor());
        writer.w("clickedButtonBackgroundColor");
        this.stringAdapter.mo44toJson(writer, (x) value.getClickedButtonBackgroundColor());
        writer.w("iconColor");
        this.stringAdapter.mo44toJson(writer, (x) value.getIconColor());
        writer.p();
    }
}
