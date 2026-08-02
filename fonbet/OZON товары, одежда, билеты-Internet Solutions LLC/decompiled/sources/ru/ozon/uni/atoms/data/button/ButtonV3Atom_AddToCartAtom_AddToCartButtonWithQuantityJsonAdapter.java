package ru.ozon.uni.atoms.data.button;

import Ak.b;
import Y9.c;
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
import ru.ozon.uni.atoms.data.TestInfo;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.utils.OzonSpannableString;

@Metadata(d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u001c\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0019R\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0019R\u001c\u0010 \u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u0019R\u001c\u0010\"\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010!0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u0019R\u001a\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010\u0019R\u001a\u0010&\u001a\b\u0012\u0004\u0012\u00020%0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010\u0019R\u001c\u0010(\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010'0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010\u0019R\u001c\u0010*\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010)0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010\u0019R(\u0010-\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020,\u0018\u00010+0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010\u0019R\u001c\u0010/\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010.0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u0010\u0019R\u001e\u00101\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u0001008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102¨\u00063"}, d2 = {"Lru/ozon/uni/atoms/data/button/ButtonV3Atom_AddToCartAtom_AddToCartButtonWithQuantityJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$AddToCartAtom$AddToCartButtonWithQuantity;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/uni/atoms/data/button/ButtonV3Atom$AddToCartAtom$AddToCartButtonWithQuantity;", "Lcom/squareup/moshi/x;", "writer", "value_", "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$AddToCartAtom$AddToCartButtonWithQuantity;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "", "intAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/uni/atoms/utils/OzonSpannableString;", "ozonSpannableStringAdapter", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$AddToCartAtom$AddToCartStyle;", "nullableAddToCartStyleAdapter", "Lru/ozon/uni/atoms/data/button/UpdateMode;", "updateModeAdapter", "nullableStringAdapter", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$AddToCartAtom$AddToCartButtonWithQuantity$SellerIcon;", "nullableSellerIconAdapter", "", "booleanAdapter", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$AddToCartAtom$AddToCartButtonWithQuantity$ButtonSizeMode;", "buttonSizeModeAdapter", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$AddToCartAtom$Action;", "nullableActionAdapter", "Lru/ozon/uni/atoms/data/TestInfo;", "nullableTestInfoAdapter", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "nullableMapOfStringTokenizedTrackingInfoAdapter", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$Extend;", "nullableExtendAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ButtonV3Atom_AddToCartAtom_AddToCartButtonWithQuantityJsonAdapter extends JsonAdapter<ButtonV3Atom.AddToCartAtom.AddToCartButtonWithQuantity> {
    public static final int $stable = 8;

    @NotNull
    private final JsonAdapter<Boolean> booleanAdapter;

    @NotNull
    private final JsonAdapter<ButtonV3Atom.AddToCartAtom.AddToCartButtonWithQuantity.ButtonSizeMode> buttonSizeModeAdapter;
    private volatile Constructor<ButtonV3Atom.AddToCartAtom.AddToCartButtonWithQuantity> constructorRef;

    @NotNull
    private final JsonAdapter<Integer> intAdapter;

    @NotNull
    private final JsonAdapter<ButtonV3Atom.AddToCartAtom.Action> nullableActionAdapter;

    @NotNull
    private final JsonAdapter<ButtonV3Atom.AddToCartAtom.AddToCartStyle> nullableAddToCartStyleAdapter;

    @NotNull
    private final JsonAdapter<ButtonV3Atom.Extend> nullableExtendAdapter;

    @NotNull
    private final JsonAdapter<Map<String, TokenizedTrackingInfo>> nullableMapOfStringTokenizedTrackingInfoAdapter;

    @NotNull
    private final JsonAdapter<ButtonV3Atom.AddToCartAtom.AddToCartButtonWithQuantity.SellerIcon> nullableSellerIconAdapter;

    @NotNull
    private final JsonAdapter<String> nullableStringAdapter;

    @NotNull
    private final JsonAdapter<TestInfo> nullableTestInfoAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<OzonSpannableString> ozonSpannableStringAdapter;

    @NotNull
    private final JsonAdapter<UpdateMode> updateModeAdapter;

    public ButtonV3Atom_AddToCartAtom_AddToCartButtonWithQuantityJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        n.a a11 = n.a.C0918a.a("maxItems", "currentItems", "text", "style", "theme", "mode", "buttonIconId", "sellerIcon", "qtyTextDisabled", "buttonSizeMode", "action", "context", "testInfo", "trackingInfo", "extend");
        Intrinsics.checkNotNullExpressionValue(a11, "of(...)");
        this.options = a11;
        M m11 = M.f71699a;
        JsonAdapter<Integer> f7 = moshi.f(Integer.TYPE, m11, "maxItems");
        Intrinsics.checkNotNullExpressionValue(f7, "adapter(...)");
        this.intAdapter = f7;
        JsonAdapter<OzonSpannableString> f11 = moshi.f(OzonSpannableString.class, m11, "text");
        Intrinsics.checkNotNullExpressionValue(f11, "adapter(...)");
        this.ozonSpannableStringAdapter = f11;
        JsonAdapter<ButtonV3Atom.AddToCartAtom.AddToCartStyle> f12 = moshi.f(ButtonV3Atom.AddToCartAtom.AddToCartStyle.class, m11, "style");
        Intrinsics.checkNotNullExpressionValue(f12, "adapter(...)");
        this.nullableAddToCartStyleAdapter = f12;
        JsonAdapter<UpdateMode> f13 = moshi.f(UpdateMode.class, m11, "mode");
        Intrinsics.checkNotNullExpressionValue(f13, "adapter(...)");
        this.updateModeAdapter = f13;
        JsonAdapter<String> f14 = moshi.f(String.class, m11, "buttonIconId");
        Intrinsics.checkNotNullExpressionValue(f14, "adapter(...)");
        this.nullableStringAdapter = f14;
        JsonAdapter<ButtonV3Atom.AddToCartAtom.AddToCartButtonWithQuantity.SellerIcon> f15 = moshi.f(ButtonV3Atom.AddToCartAtom.AddToCartButtonWithQuantity.SellerIcon.class, m11, "sellerIcon");
        Intrinsics.checkNotNullExpressionValue(f15, "adapter(...)");
        this.nullableSellerIconAdapter = f15;
        JsonAdapter<Boolean> f16 = moshi.f(Boolean.TYPE, m11, "qtyTextDisabled");
        Intrinsics.checkNotNullExpressionValue(f16, "adapter(...)");
        this.booleanAdapter = f16;
        JsonAdapter<ButtonV3Atom.AddToCartAtom.AddToCartButtonWithQuantity.ButtonSizeMode> f17 = moshi.f(ButtonV3Atom.AddToCartAtom.AddToCartButtonWithQuantity.ButtonSizeMode.class, m11, "buttonSizeMode");
        Intrinsics.checkNotNullExpressionValue(f17, "adapter(...)");
        this.buttonSizeModeAdapter = f17;
        JsonAdapter<ButtonV3Atom.AddToCartAtom.Action> f18 = moshi.f(ButtonV3Atom.AddToCartAtom.Action.class, m11, "action");
        Intrinsics.checkNotNullExpressionValue(f18, "adapter(...)");
        this.nullableActionAdapter = f18;
        JsonAdapter<TestInfo> f19 = moshi.f(TestInfo.class, m11, "testInfo");
        Intrinsics.checkNotNullExpressionValue(f19, "adapter(...)");
        this.nullableTestInfoAdapter = f19;
        JsonAdapter<Map<String, TokenizedTrackingInfo>> f21 = moshi.f(D.e(Map.class, String.class, TokenizedTrackingInfo.class), m11, "trackingInfo");
        Intrinsics.checkNotNullExpressionValue(f21, "adapter(...)");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter = f21;
        JsonAdapter<ButtonV3Atom.Extend> f22 = moshi.f(ButtonV3Atom.Extend.class, m11, "extend");
        Intrinsics.checkNotNullExpressionValue(f22, "adapter(...)");
        this.nullableExtendAdapter = f22;
    }

    @NotNull
    public String toString() {
        return b.c(76, "GeneratedJsonAdapter(ButtonV3Atom.AddToCartAtom.AddToCartButtonWithQuantity)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public ButtonV3Atom.AddToCartAtom.AddToCartButtonWithQuantity fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        Boolean bool = Boolean.FALSE;
        reader.beginObject();
        int i11 = -1;
        Boolean bool2 = bool;
        Integer num = null;
        Integer num2 = null;
        UpdateMode updateMode = null;
        ButtonV3Atom.AddToCartAtom.AddToCartButtonWithQuantity.ButtonSizeMode buttonSizeMode = null;
        ButtonV3Atom.AddToCartAtom.Action action = null;
        String str = null;
        OzonSpannableString ozonSpannableString = null;
        ButtonV3Atom.AddToCartAtom.AddToCartStyle addToCartStyle = null;
        ButtonV3Atom.AddToCartAtom.AddToCartStyle addToCartStyle2 = null;
        String str2 = null;
        ButtonV3Atom.AddToCartAtom.AddToCartButtonWithQuantity.SellerIcon sellerIcon = null;
        TestInfo testInfo = null;
        Map<String, TokenizedTrackingInfo> map = null;
        ButtonV3Atom.Extend extend = null;
        while (reader.hasNext()) {
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    break;
                case 0:
                    num = this.intAdapter.fromJson(reader);
                    if (num == null) {
                        throw c.q("maxItems", "maxItems", reader);
                    }
                    break;
                case 1:
                    num2 = this.intAdapter.fromJson(reader);
                    if (num2 == null) {
                        throw c.q("currentItems", "currentItems", reader);
                    }
                    break;
                case 2:
                    ozonSpannableString = this.ozonSpannableStringAdapter.fromJson(reader);
                    if (ozonSpannableString == null) {
                        throw c.q("text", "text", reader);
                    }
                    break;
                case 3:
                    addToCartStyle = this.nullableAddToCartStyleAdapter.fromJson(reader);
                    break;
                case 4:
                    addToCartStyle2 = this.nullableAddToCartStyleAdapter.fromJson(reader);
                    break;
                case 5:
                    updateMode = this.updateModeAdapter.fromJson(reader);
                    if (updateMode == null) {
                        throw c.q("mode", "mode", reader);
                    }
                    i11 &= -33;
                    break;
                case 6:
                    str2 = this.nullableStringAdapter.fromJson(reader);
                    i11 &= -65;
                    break;
                case 7:
                    sellerIcon = this.nullableSellerIconAdapter.fromJson(reader);
                    i11 &= -129;
                    break;
                case 8:
                    bool2 = this.booleanAdapter.fromJson(reader);
                    if (bool2 == null) {
                        throw c.q("qtyTextDisabled", "qtyTextDisabled", reader);
                    }
                    i11 &= -257;
                    break;
                case 9:
                    buttonSizeMode = this.buttonSizeModeAdapter.fromJson(reader);
                    if (buttonSizeMode == null) {
                        throw c.q("buttonSizeMode", "buttonSizeMode", reader);
                    }
                    i11 &= -513;
                    break;
                case 10:
                    action = this.nullableActionAdapter.fromJson(reader);
                    i11 &= -1025;
                    break;
                case 11:
                    str = this.nullableStringAdapter.fromJson(reader);
                    i11 &= -2049;
                    break;
                case 12:
                    testInfo = this.nullableTestInfoAdapter.fromJson(reader);
                    i11 &= -4097;
                    break;
                case 13:
                    map = this.nullableMapOfStringTokenizedTrackingInfoAdapter.fromJson(reader);
                    i11 &= -8193;
                    break;
                case 14:
                    extend = this.nullableExtendAdapter.fromJson(reader);
                    i11 &= -16385;
                    break;
            }
        }
        reader.endObject();
        if (i11 == -32737) {
            if (num == null) {
                throw c.j("maxItems", "maxItems", reader);
            }
            ButtonV3Atom.AddToCartAtom.Action action2 = action;
            int intValue = num.intValue();
            if (num2 == null) {
                throw c.j("currentItems", "currentItems", reader);
            }
            String str3 = str;
            int intValue2 = num2.intValue();
            if (ozonSpannableString == null) {
                throw c.j("text", "text", reader);
            }
            Intrinsics.g(updateMode, "null cannot be cast to non-null type ru.ozon.uni.atoms.data.button.UpdateMode");
            boolean booleanValue = bool2.booleanValue();
            Intrinsics.g(buttonSizeMode, "null cannot be cast to non-null type ru.ozon.uni.atoms.data.button.ButtonV3Atom.AddToCartAtom.AddToCartButtonWithQuantity.ButtonSizeMode");
            return new ButtonV3Atom.AddToCartAtom.AddToCartButtonWithQuantity(intValue, intValue2, ozonSpannableString, addToCartStyle, addToCartStyle2, updateMode, str2, sellerIcon, booleanValue, buttonSizeMode, action2, str3, testInfo, map, extend);
        }
        UpdateMode updateMode2 = updateMode;
        ButtonV3Atom.AddToCartAtom.Action action3 = action;
        String str4 = str;
        Constructor<ButtonV3Atom.AddToCartAtom.AddToCartButtonWithQuantity> constructor = this.constructorRef;
        if (constructor == null) {
            Class<?> cls = c.f34864d;
            Class cls2 = Integer.TYPE;
            constructor = ButtonV3Atom.AddToCartAtom.AddToCartButtonWithQuantity.class.getDeclaredConstructor(cls2, cls2, OzonSpannableString.class, ButtonV3Atom.AddToCartAtom.AddToCartStyle.class, ButtonV3Atom.AddToCartAtom.AddToCartStyle.class, UpdateMode.class, String.class, ButtonV3Atom.AddToCartAtom.AddToCartButtonWithQuantity.SellerIcon.class, Boolean.TYPE, ButtonV3Atom.AddToCartAtom.AddToCartButtonWithQuantity.ButtonSizeMode.class, ButtonV3Atom.AddToCartAtom.Action.class, String.class, TestInfo.class, Map.class, ButtonV3Atom.Extend.class, cls2, cls);
            this.constructorRef = constructor;
            Intrinsics.checkNotNullExpressionValue(constructor, "also(...)");
        }
        if (num == null) {
            throw c.j("maxItems", "maxItems", reader);
        }
        if (num2 == null) {
            throw c.j("currentItems", "currentItems", reader);
        }
        if (ozonSpannableString == null) {
            throw c.j("text", "text", reader);
        }
        ButtonV3Atom.AddToCartAtom.AddToCartButtonWithQuantity newInstance = constructor.newInstance(num, num2, ozonSpannableString, addToCartStyle, addToCartStyle2, updateMode2, str2, sellerIcon, bool2, buttonSizeMode, action3, str4, testInfo, map, extend, Integer.valueOf(i11), null);
        Intrinsics.checkNotNullExpressionValue(newInstance, "newInstance(...)");
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, ButtonV3Atom.AddToCartAtom.AddToCartButtonWithQuantity value_) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("maxItems");
        this.intAdapter.mo44toJson(writer, (x) Integer.valueOf(value_.getMaxItems()));
        writer.w("currentItems");
        this.intAdapter.mo44toJson(writer, (x) Integer.valueOf(value_.getCurrentItems()));
        writer.w("text");
        this.ozonSpannableStringAdapter.mo44toJson(writer, (x) value_.getText());
        writer.w("style");
        this.nullableAddToCartStyleAdapter.mo44toJson(writer, (x) value_.getStyle());
        writer.w("theme");
        this.nullableAddToCartStyleAdapter.mo44toJson(writer, (x) value_.getTheme());
        writer.w("mode");
        this.updateModeAdapter.mo44toJson(writer, (x) value_.getMode());
        writer.w("buttonIconId");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getButtonIconId());
        writer.w("sellerIcon");
        this.nullableSellerIconAdapter.mo44toJson(writer, (x) value_.getSellerIcon());
        writer.w("qtyTextDisabled");
        this.booleanAdapter.mo44toJson(writer, (x) Boolean.valueOf(value_.getQtyTextDisabled()));
        writer.w("buttonSizeMode");
        this.buttonSizeModeAdapter.mo44toJson(writer, (x) value_.getButtonSizeMode());
        writer.w("action");
        this.nullableActionAdapter.mo44toJson(writer, (x) value_.getAction());
        writer.w("context");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getContext());
        writer.w("testInfo");
        this.nullableTestInfoAdapter.mo44toJson(writer, (x) value_.getTestInfo());
        writer.w("trackingInfo");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter.mo44toJson(writer, (x) value_.getTrackingInfo());
        writer.w("extend");
        this.nullableExtendAdapter.mo44toJson(writer, (x) value_.getExtend());
        writer.p();
    }
}
