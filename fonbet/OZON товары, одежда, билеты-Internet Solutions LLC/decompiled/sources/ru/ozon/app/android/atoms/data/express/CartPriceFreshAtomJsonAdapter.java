package ru.ozon.app.android.atoms.data.express;

import Ak.b;
import C.o0;
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
import ru.ozon.app.android.atoms.data.express.CartPriceFreshAtom;
import ru.ozon.uni.atoms.data.TestInfo;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;

@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0019R\u001c\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0019R\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0019R\u001c\u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010 0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u0019R\u001a\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\u0019R(\u0010&\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020%\u0018\u00010$0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010\u0019R\u001c\u0010(\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010'0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010\u0019R\u001e\u0010*\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+¨\u0006,"}, d2 = {"Lru/ozon/app/android/atoms/data/express/CartPriceFreshAtomJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/atoms/data/express/CartPriceFreshAtom;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/atoms/data/express/CartPriceFreshAtom;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/atoms/data/express/CartPriceFreshAtom;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "Lru/ozon/app/android/atoms/data/express/CartPriceFreshAtom$CartPriceType;", "cartPriceTypeAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/atoms/data/express/CartPriceFreshAtom$CartPriceStyleType;", "nullableCartPriceStyleTypeAdapter", "stringAdapter", "nullableStringAdapter", "", "intAdapter", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$AddToCartAtom$Action;", "nullableActionAdapter", "Lru/ozon/app/android/atoms/data/express/CartPriceFreshAtom$Button;", "buttonAdapter", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "nullableMapOfStringTokenizedTrackingInfoAdapter", "Lru/ozon/uni/atoms/data/TestInfo;", "nullableTestInfoAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "atoms_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class CartPriceFreshAtomJsonAdapter extends JsonAdapter<CartPriceFreshAtom> {

    @NotNull
    private final JsonAdapter<CartPriceFreshAtom.Button> buttonAdapter;

    @NotNull
    private final JsonAdapter<CartPriceFreshAtom.CartPriceType> cartPriceTypeAdapter;
    private volatile Constructor<CartPriceFreshAtom> constructorRef;

    @NotNull
    private final JsonAdapter<Integer> intAdapter;

    @NotNull
    private final JsonAdapter<ButtonV3Atom.AddToCartAtom.Action> nullableActionAdapter;

    @NotNull
    private final JsonAdapter<CartPriceFreshAtom.CartPriceStyleType> nullableCartPriceStyleTypeAdapter;

    @NotNull
    private final JsonAdapter<Map<String, TokenizedTrackingInfo>> nullableMapOfStringTokenizedTrackingInfoAdapter;

    @NotNull
    private final JsonAdapter<String> nullableStringAdapter;

    @NotNull
    private final JsonAdapter<TestInfo> nullableTestInfoAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<String> stringAdapter;

    public CartPriceFreshAtomJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("type", "theme", "price", "priceColor", "originalPrice", "originalPriceColor", "currentItems", "maxQuantity", "action", "unitOfMeasure", "plusButton", "minusButton", "backgroundButtonsColor", "priceWithUnit", "trackingInfo", "testInfo");
        M m11 = M.f71699a;
        this.cartPriceTypeAdapter = moshi.f(CartPriceFreshAtom.CartPriceType.class, m11, "atomType");
        this.nullableCartPriceStyleTypeAdapter = moshi.f(CartPriceFreshAtom.CartPriceStyleType.class, m11, "theme");
        this.stringAdapter = moshi.f(String.class, m11, "price");
        this.nullableStringAdapter = moshi.f(String.class, m11, "originalPrice");
        this.intAdapter = moshi.f(Integer.TYPE, m11, "currentItems");
        this.nullableActionAdapter = moshi.f(ButtonV3Atom.AddToCartAtom.Action.class, m11, "action");
        this.buttonAdapter = moshi.f(CartPriceFreshAtom.Button.class, m11, "plusButton");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter = moshi.f(D.e(Map.class, String.class, TokenizedTrackingInfo.class), m11, "trackingInfo");
        this.nullableTestInfoAdapter = moshi.f(TestInfo.class, m11, "testInfo");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public CartPriceFreshAtom fromJson(@NotNull n reader) {
        CartPriceFreshAtom.CartPriceType cartPriceType;
        int i11 = -1;
        Integer a11 = o0.a(reader, "reader", 0);
        CartPriceFreshAtom.CartPriceType cartPriceType2 = null;
        Integer num = null;
        CartPriceFreshAtom.CartPriceStyleType cartPriceStyleType = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        Map<String, TokenizedTrackingInfo> map = null;
        TestInfo testInfo = null;
        ButtonV3Atom.AddToCartAtom.Action action = null;
        String str5 = null;
        CartPriceFreshAtom.Button button = null;
        CartPriceFreshAtom.Button button2 = null;
        String str6 = null;
        String str7 = null;
        while (true) {
            CartPriceFreshAtom.CartPriceType cartPriceType3 = cartPriceType2;
            Integer num2 = a11;
            if (!reader.hasNext()) {
                Integer num3 = num;
                reader.endObject();
                if (i11 == -33137) {
                    if (cartPriceType3 == null) {
                        throw c.j("atomType", "type", reader);
                    }
                    if (str == null) {
                        throw c.j("price", "price", reader);
                    }
                    if (str2 == null) {
                        throw c.j("priceColor", "priceColor", reader);
                    }
                    Map<String, TokenizedTrackingInfo> map2 = map;
                    int intValue = num2.intValue();
                    if (num3 == null) {
                        throw c.j("maxQuantity", "maxQuantity", reader);
                    }
                    TestInfo testInfo2 = testInfo;
                    int intValue2 = num3.intValue();
                    if (str5 == null) {
                        throw c.j("unitOfMeasure", "unitOfMeasure", reader);
                    }
                    if (button == null) {
                        throw c.j("plusButton", "plusButton", reader);
                    }
                    if (button2 == null) {
                        throw c.j("minusButton", "minusButton", reader);
                    }
                    if (str6 == null) {
                        throw c.j("backgroundButtonsColor", "backgroundButtonsColor", reader);
                    }
                    if (str7 != null) {
                        return new CartPriceFreshAtom(cartPriceType3, cartPriceStyleType, str, str2, str3, str4, intValue, intValue2, action, str5, button, button2, str6, str7, map2, testInfo2);
                    }
                    throw c.j("priceWithUnit", "priceWithUnit", reader);
                }
                Map<String, TokenizedTrackingInfo> map3 = map;
                int i12 = i11;
                TestInfo testInfo3 = testInfo;
                Constructor<CartPriceFreshAtom> constructor = this.constructorRef;
                if (constructor == null) {
                    Class<?> cls = c.f34864d;
                    Class cls2 = Integer.TYPE;
                    cartPriceType = cartPriceType3;
                    constructor = CartPriceFreshAtom.class.getDeclaredConstructor(CartPriceFreshAtom.CartPriceType.class, CartPriceFreshAtom.CartPriceStyleType.class, String.class, String.class, String.class, String.class, cls2, cls2, ButtonV3Atom.AddToCartAtom.Action.class, String.class, CartPriceFreshAtom.Button.class, CartPriceFreshAtom.Button.class, String.class, String.class, Map.class, TestInfo.class, cls2, cls);
                    this.constructorRef = constructor;
                    Intrinsics.checkNotNullExpressionValue(constructor, "also(...)");
                } else {
                    cartPriceType = cartPriceType3;
                }
                if (cartPriceType == null) {
                    throw c.j("atomType", "type", reader);
                }
                if (str == null) {
                    throw c.j("price", "price", reader);
                }
                if (str2 == null) {
                    throw c.j("priceColor", "priceColor", reader);
                }
                if (num3 == null) {
                    throw c.j("maxQuantity", "maxQuantity", reader);
                }
                if (str5 == null) {
                    throw c.j("unitOfMeasure", "unitOfMeasure", reader);
                }
                if (button == null) {
                    throw c.j("plusButton", "plusButton", reader);
                }
                if (button2 == null) {
                    throw c.j("minusButton", "minusButton", reader);
                }
                if (str6 == null) {
                    throw c.j("backgroundButtonsColor", "backgroundButtonsColor", reader);
                }
                if (str7 == null) {
                    throw c.j("priceWithUnit", "priceWithUnit", reader);
                }
                CartPriceFreshAtom.CartPriceType cartPriceType4 = cartPriceType;
                CartPriceFreshAtom newInstance = constructor.newInstance(cartPriceType4, cartPriceStyleType, str, str2, str3, str4, num2, num3, action, str5, button, button2, str6, str7, map3, testInfo3, Integer.valueOf(i12), null);
                Intrinsics.checkNotNullExpressionValue(newInstance, "newInstance(...)");
                return newInstance;
            }
            Integer num4 = num;
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    num = num4;
                    cartPriceType2 = cartPriceType3;
                    a11 = num2;
                case 0:
                    cartPriceType2 = this.cartPriceTypeAdapter.fromJson(reader);
                    if (cartPriceType2 == null) {
                        throw c.q("atomType", "type", reader);
                    }
                    num = num4;
                    a11 = num2;
                case 1:
                    cartPriceStyleType = this.nullableCartPriceStyleTypeAdapter.fromJson(reader);
                    num = num4;
                    cartPriceType2 = cartPriceType3;
                    a11 = num2;
                case 2:
                    str = this.stringAdapter.fromJson(reader);
                    if (str == null) {
                        throw c.q("price", "price", reader);
                    }
                    num = num4;
                    cartPriceType2 = cartPriceType3;
                    a11 = num2;
                case 3:
                    str2 = this.stringAdapter.fromJson(reader);
                    if (str2 == null) {
                        throw c.q("priceColor", "priceColor", reader);
                    }
                    num = num4;
                    cartPriceType2 = cartPriceType3;
                    a11 = num2;
                case 4:
                    str3 = this.nullableStringAdapter.fromJson(reader);
                    i11 &= -17;
                    num = num4;
                    cartPriceType2 = cartPriceType3;
                    a11 = num2;
                case 5:
                    str4 = this.nullableStringAdapter.fromJson(reader);
                    i11 &= -33;
                    num = num4;
                    cartPriceType2 = cartPriceType3;
                    a11 = num2;
                case 6:
                    a11 = this.intAdapter.fromJson(reader);
                    if (a11 == null) {
                        throw c.q("currentItems", "currentItems", reader);
                    }
                    i11 &= -65;
                    num = num4;
                    cartPriceType2 = cartPriceType3;
                case 7:
                    num = this.intAdapter.fromJson(reader);
                    if (num == null) {
                        throw c.q("maxQuantity", "maxQuantity", reader);
                    }
                    cartPriceType2 = cartPriceType3;
                    a11 = num2;
                case 8:
                    action = this.nullableActionAdapter.fromJson(reader);
                    i11 &= -257;
                    num = num4;
                    cartPriceType2 = cartPriceType3;
                    a11 = num2;
                case 9:
                    str5 = this.stringAdapter.fromJson(reader);
                    if (str5 == null) {
                        throw c.q("unitOfMeasure", "unitOfMeasure", reader);
                    }
                    num = num4;
                    cartPriceType2 = cartPriceType3;
                    a11 = num2;
                case 10:
                    button = this.buttonAdapter.fromJson(reader);
                    if (button == null) {
                        throw c.q("plusButton", "plusButton", reader);
                    }
                    num = num4;
                    cartPriceType2 = cartPriceType3;
                    a11 = num2;
                case 11:
                    button2 = this.buttonAdapter.fromJson(reader);
                    if (button2 == null) {
                        throw c.q("minusButton", "minusButton", reader);
                    }
                    num = num4;
                    cartPriceType2 = cartPriceType3;
                    a11 = num2;
                case 12:
                    str6 = this.stringAdapter.fromJson(reader);
                    if (str6 == null) {
                        throw c.q("backgroundButtonsColor", "backgroundButtonsColor", reader);
                    }
                    num = num4;
                    cartPriceType2 = cartPriceType3;
                    a11 = num2;
                case 13:
                    str7 = this.stringAdapter.fromJson(reader);
                    if (str7 == null) {
                        throw c.q("priceWithUnit", "priceWithUnit", reader);
                    }
                    num = num4;
                    cartPriceType2 = cartPriceType3;
                    a11 = num2;
                case 14:
                    map = this.nullableMapOfStringTokenizedTrackingInfoAdapter.fromJson(reader);
                    num = num4;
                    cartPriceType2 = cartPriceType3;
                    a11 = num2;
                case 15:
                    testInfo = this.nullableTestInfoAdapter.fromJson(reader);
                    i11 &= -32769;
                    num = num4;
                    cartPriceType2 = cartPriceType3;
                    a11 = num2;
                default:
                    num = num4;
                    cartPriceType2 = cartPriceType3;
                    a11 = num2;
            }
        }
    }

    @NotNull
    public String toString() {
        return b.c(40, "GeneratedJsonAdapter(CartPriceFreshAtom)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, CartPriceFreshAtom value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("type");
        this.cartPriceTypeAdapter.mo44toJson(writer, (x) value.getAtomType());
        writer.w("theme");
        this.nullableCartPriceStyleTypeAdapter.mo44toJson(writer, (x) value.getTheme());
        writer.w("price");
        this.stringAdapter.mo44toJson(writer, (x) value.getPrice());
        writer.w("priceColor");
        this.stringAdapter.mo44toJson(writer, (x) value.getPriceColor());
        writer.w("originalPrice");
        this.nullableStringAdapter.mo44toJson(writer, (x) value.getOriginalPrice());
        writer.w("originalPriceColor");
        this.nullableStringAdapter.mo44toJson(writer, (x) value.getOriginalPriceColor());
        writer.w("currentItems");
        this.intAdapter.mo44toJson(writer, (x) Integer.valueOf(value.getCurrentItems()));
        writer.w("maxQuantity");
        this.intAdapter.mo44toJson(writer, (x) Integer.valueOf(value.getMaxQuantity()));
        writer.w("action");
        this.nullableActionAdapter.mo44toJson(writer, (x) value.getAction());
        writer.w("unitOfMeasure");
        this.stringAdapter.mo44toJson(writer, (x) value.getUnitOfMeasure());
        writer.w("plusButton");
        this.buttonAdapter.mo44toJson(writer, (x) value.getPlusButton());
        writer.w("minusButton");
        this.buttonAdapter.mo44toJson(writer, (x) value.getMinusButton());
        writer.w("backgroundButtonsColor");
        this.stringAdapter.mo44toJson(writer, (x) value.getBackgroundButtonsColor());
        writer.w("priceWithUnit");
        this.stringAdapter.mo44toJson(writer, (x) value.getPriceWithUnit());
        writer.w("trackingInfo");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter.mo44toJson(writer, (x) value.getTrackingInfo());
        writer.w("testInfo");
        this.nullableTestInfoAdapter.mo44toJson(writer, (x) value.getTestInfo());
        writer.p();
    }
}
