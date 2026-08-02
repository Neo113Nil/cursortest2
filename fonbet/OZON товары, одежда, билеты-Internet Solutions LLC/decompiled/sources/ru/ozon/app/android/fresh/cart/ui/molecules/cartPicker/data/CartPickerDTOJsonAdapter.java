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
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0019R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0019R\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0019R\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0019R\u001a\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u0019R\u001a\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\u0019R\u001a\u0010%\u001a\b\u0012\u0004\u0012\u00020$0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010\u0019R\u001e\u0010'\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(¨\u0006)"}, d2 = {"Lru/ozon/app/android/fresh/cart/ui/molecules/cartPicker/data/CartPickerDTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/fresh/cart/ui/molecules/cartPicker/data/CartPickerDTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/fresh/cart/ui/molecules/cartPicker/data/CartPickerDTO;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/fresh/cart/ui/molecules/cartPicker/data/CartPickerDTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "Lru/ozon/uni/atoms/data/text/TextDTO;", "textDTOAdapter", "Lcom/squareup/moshi/JsonAdapter;", "nullableTextDTOAdapter", "Lru/ozon/app/android/fresh/cart/ui/molecules/cartPicker/data/CartPickerDTO$QuantityControl;", "quantityControlAdapter", "stringAdapter", "Lru/ozon/app/android/fresh/cart/ui/molecules/cartPicker/data/CartPickerDTO$Sizes;", "sizesAdapter", "Lru/ozon/app/android/fresh/cart/ui/molecules/cartPicker/data/CartPickerDTO$Sizings;", "sizingsAdapter", "Lru/ozon/app/android/fresh/cart/ui/molecules/cartPicker/data/CartPickerDTO$StyleTypes;", "styleTypesAdapter", "Lru/ozon/app/android/fresh/cart/ui/molecules/cartPicker/data/CartPickerDTO$CustomStyle;", "customStyleAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "widgets-cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class CartPickerDTOJsonAdapter extends JsonAdapter<CartPickerDTO> {
    public static final int $stable = 8;
    private volatile Constructor<CartPickerDTO> constructorRef;

    @NotNull
    private final JsonAdapter<CartPickerDTO.CustomStyle> customStyleAdapter;

    @NotNull
    private final JsonAdapter<TextDTO> nullableTextDTOAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<CartPickerDTO.QuantityControl> quantityControlAdapter;

    @NotNull
    private final JsonAdapter<CartPickerDTO.Sizes> sizesAdapter;

    @NotNull
    private final JsonAdapter<CartPickerDTO.Sizings> sizingsAdapter;

    @NotNull
    private final JsonAdapter<String> stringAdapter;

    @NotNull
    private final JsonAdapter<CartPickerDTO.StyleTypes> styleTypesAdapter;

    @NotNull
    private final JsonAdapter<TextDTO> textDTOAdapter;

    public CartPickerDTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("quantityTitle", "subtitle", "quantity", "decrementIcon", "incrementIcon", "size", "sizingPriority", "styleType", "customStyle");
        M m11 = M.f71699a;
        this.textDTOAdapter = moshi.f(TextDTO.class, m11, "quantityTitle");
        this.nullableTextDTOAdapter = moshi.f(TextDTO.class, m11, "subtitle");
        this.quantityControlAdapter = moshi.f(CartPickerDTO.QuantityControl.class, m11, "quantity");
        this.stringAdapter = moshi.f(String.class, m11, "decrementIcon");
        this.sizesAdapter = moshi.f(CartPickerDTO.Sizes.class, m11, "size");
        this.sizingsAdapter = moshi.f(CartPickerDTO.Sizings.class, m11, "sizingPriority");
        this.styleTypesAdapter = moshi.f(CartPickerDTO.StyleTypes.class, m11, "styleType");
        this.customStyleAdapter = moshi.f(CartPickerDTO.CustomStyle.class, m11, "customStyle");
    }

    @NotNull
    public String toString() {
        return b.c(35, "GeneratedJsonAdapter(CartPickerDTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public CartPickerDTO fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        int i11 = -1;
        TextDTO textDTO = null;
        TextDTO textDTO2 = null;
        CartPickerDTO.QuantityControl quantityControl = null;
        String str = null;
        String str2 = null;
        CartPickerDTO.Sizes sizes = null;
        CartPickerDTO.Sizings sizings = null;
        CartPickerDTO.StyleTypes styleTypes = null;
        CartPickerDTO.CustomStyle customStyle = null;
        while (reader.hasNext()) {
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    break;
                case 0:
                    textDTO = this.textDTOAdapter.fromJson(reader);
                    if (textDTO == null) {
                        throw c.q("quantityTitle", "quantityTitle", reader);
                    }
                    break;
                case 1:
                    textDTO2 = this.nullableTextDTOAdapter.fromJson(reader);
                    break;
                case 2:
                    quantityControl = this.quantityControlAdapter.fromJson(reader);
                    if (quantityControl == null) {
                        throw c.q("quantity", "quantity", reader);
                    }
                    break;
                case 3:
                    str = this.stringAdapter.fromJson(reader);
                    if (str == null) {
                        throw c.q("decrementIcon", "decrementIcon", reader);
                    }
                    i11 &= -9;
                    break;
                case 4:
                    str2 = this.stringAdapter.fromJson(reader);
                    if (str2 == null) {
                        throw c.q("incrementIcon", "incrementIcon", reader);
                    }
                    i11 &= -17;
                    break;
                case 5:
                    sizes = this.sizesAdapter.fromJson(reader);
                    if (sizes == null) {
                        throw c.q("size", "size", reader);
                    }
                    i11 &= -33;
                    break;
                case 6:
                    sizings = this.sizingsAdapter.fromJson(reader);
                    if (sizings == null) {
                        throw c.q("sizingPriority", "sizingPriority", reader);
                    }
                    i11 &= -65;
                    break;
                case 7:
                    styleTypes = this.styleTypesAdapter.fromJson(reader);
                    if (styleTypes == null) {
                        throw c.q("styleType", "styleType", reader);
                    }
                    i11 &= -129;
                    break;
                case 8:
                    customStyle = this.customStyleAdapter.fromJson(reader);
                    if (customStyle == null) {
                        throw c.q("customStyle", "customStyle", reader);
                    }
                    i11 &= -257;
                    break;
            }
        }
        reader.endObject();
        if (i11 != -505) {
            CartPickerDTO.QuantityControl quantityControl2 = quantityControl;
            TextDTO textDTO3 = textDTO2;
            TextDTO textDTO4 = textDTO;
            Constructor<CartPickerDTO> constructor = this.constructorRef;
            if (constructor == null) {
                constructor = CartPickerDTO.class.getDeclaredConstructor(TextDTO.class, TextDTO.class, CartPickerDTO.QuantityControl.class, String.class, String.class, CartPickerDTO.Sizes.class, CartPickerDTO.Sizings.class, CartPickerDTO.StyleTypes.class, CartPickerDTO.CustomStyle.class, Integer.TYPE, c.f34864d);
                this.constructorRef = constructor;
                Intrinsics.checkNotNullExpressionValue(constructor, "also(...)");
            }
            Constructor<CartPickerDTO> constructor2 = constructor;
            if (textDTO4 == null) {
                throw c.j("quantityTitle", "quantityTitle", reader);
            }
            if (quantityControl2 == null) {
                throw c.j("quantity", "quantity", reader);
            }
            CartPickerDTO newInstance = constructor2.newInstance(textDTO4, textDTO3, quantityControl2, str, str2, sizes, sizings, styleTypes, customStyle, Integer.valueOf(i11), null);
            Intrinsics.checkNotNullExpressionValue(newInstance, "newInstance(...)");
            return newInstance;
        }
        CartPickerDTO.QuantityControl quantityControl3 = quantityControl;
        TextDTO textDTO5 = textDTO2;
        TextDTO textDTO6 = textDTO;
        if (textDTO6 == null) {
            throw c.j("quantityTitle", "quantityTitle", reader);
        }
        if (quantityControl3 == null) {
            throw c.j("quantity", "quantity", reader);
        }
        Intrinsics.g(str, "null cannot be cast to non-null type kotlin.String");
        Intrinsics.g(str2, "null cannot be cast to non-null type kotlin.String");
        Intrinsics.g(sizes, "null cannot be cast to non-null type ru.ozon.app.android.fresh.cart.ui.molecules.cartPicker.data.CartPickerDTO.Sizes");
        Intrinsics.g(sizings, "null cannot be cast to non-null type ru.ozon.app.android.fresh.cart.ui.molecules.cartPicker.data.CartPickerDTO.Sizings");
        Intrinsics.g(styleTypes, "null cannot be cast to non-null type ru.ozon.app.android.fresh.cart.ui.molecules.cartPicker.data.CartPickerDTO.StyleTypes");
        Intrinsics.g(customStyle, "null cannot be cast to non-null type ru.ozon.app.android.fresh.cart.ui.molecules.cartPicker.data.CartPickerDTO.CustomStyle");
        CartPickerDTO.CustomStyle customStyle2 = customStyle;
        CartPickerDTO.StyleTypes styleTypes2 = styleTypes;
        CartPickerDTO.Sizings sizings2 = sizings;
        return new CartPickerDTO(textDTO6, textDTO5, quantityControl3, str, str2, sizes, sizings2, styleTypes2, customStyle2);
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, CartPickerDTO value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("quantityTitle");
        this.textDTOAdapter.mo44toJson(writer, (x) value.getQuantityTitle());
        writer.w("subtitle");
        this.nullableTextDTOAdapter.mo44toJson(writer, (x) value.getSubtitle());
        writer.w("quantity");
        this.quantityControlAdapter.mo44toJson(writer, (x) value.getQuantity());
        writer.w("decrementIcon");
        this.stringAdapter.mo44toJson(writer, (x) value.getDecrementIcon());
        writer.w("incrementIcon");
        this.stringAdapter.mo44toJson(writer, (x) value.getIncrementIcon());
        writer.w("size");
        this.sizesAdapter.mo44toJson(writer, (x) value.getSize());
        writer.w("sizingPriority");
        this.sizingsAdapter.mo44toJson(writer, (x) value.getSizingPriority());
        writer.w("styleType");
        this.styleTypesAdapter.mo44toJson(writer, (x) value.getStyleType());
        writer.w("customStyle");
        this.customStyleAdapter.mo44toJson(writer, (x) value.getCustomStyle());
        writer.p();
    }
}
