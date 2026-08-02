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

@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0018R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0018R\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0018R\u001c\u0010\u001f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001d0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0018R\u001c\u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010 0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u0018R\u001c\u0010#\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\"0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\u0018R(\u0010&\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020%\u0018\u00010$0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010\u0018R\u001c\u0010(\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010'0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010\u0018R(\u0010)\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0018\u00010$0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010\u0018R\u001e\u0010+\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,¨\u0006-"}, d2 = {"Lru/ozon/uni/atoms/data/button/ButtonV3Atom_AddToCartAtom_AddToCartButtonJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$AddToCartAtom$AddToCartButton;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/uni/atoms/data/button/ButtonV3Atom$AddToCartAtom$AddToCartButton;", "Lcom/squareup/moshi/x;", "writer", "value_", "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$AddToCartAtom$AddToCartButton;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "nullableStringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "booleanAdapter", "Lru/ozon/uni/atoms/utils/OzonSpannableString;", "ozonSpannableStringAdapter", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$AddToCartAtom$AddToCartStyle;", "addToCartStyleAdapter", "nullableAddToCartStyleAdapter", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$AddToCartAtom$Action;", "nullableActionAdapter", "Lru/ozon/uni/atoms/data/TestInfo;", "nullableTestInfoAdapter", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "nullableMapOfStringTokenizedTrackingInfoAdapter", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$Extend;", "nullableExtendAdapter", "nullableMapOfStringStringAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ButtonV3Atom_AddToCartAtom_AddToCartButtonJsonAdapter extends JsonAdapter<ButtonV3Atom.AddToCartAtom.AddToCartButton> {
    public static final int $stable = 8;

    @NotNull
    private final JsonAdapter<ButtonV3Atom.AddToCartAtom.AddToCartStyle> addToCartStyleAdapter;

    @NotNull
    private final JsonAdapter<Boolean> booleanAdapter;
    private volatile Constructor<ButtonV3Atom.AddToCartAtom.AddToCartButton> constructorRef;

    @NotNull
    private final JsonAdapter<ButtonV3Atom.AddToCartAtom.Action> nullableActionAdapter;

    @NotNull
    private final JsonAdapter<ButtonV3Atom.AddToCartAtom.AddToCartStyle> nullableAddToCartStyleAdapter;

    @NotNull
    private final JsonAdapter<ButtonV3Atom.Extend> nullableExtendAdapter;

    @NotNull
    private final JsonAdapter<Map<String, String>> nullableMapOfStringStringAdapter;

    @NotNull
    private final JsonAdapter<Map<String, TokenizedTrackingInfo>> nullableMapOfStringTokenizedTrackingInfoAdapter;

    @NotNull
    private final JsonAdapter<String> nullableStringAdapter;

    @NotNull
    private final JsonAdapter<TestInfo> nullableTestInfoAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<OzonSpannableString> ozonSpannableStringAdapter;

    public ButtonV3Atom_AddToCartAtom_AddToCartButtonJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        n.a a11 = n.a.C0918a.a("activeText", "isActive", "text", "style", "theme", "action", "context", "testInfo", "trackingInfo", "extend", "extendMap");
        Intrinsics.checkNotNullExpressionValue(a11, "of(...)");
        this.options = a11;
        M m11 = M.f71699a;
        JsonAdapter<String> f7 = moshi.f(String.class, m11, "activeText");
        Intrinsics.checkNotNullExpressionValue(f7, "adapter(...)");
        this.nullableStringAdapter = f7;
        JsonAdapter<Boolean> f11 = moshi.f(Boolean.TYPE, m11, "isActive");
        Intrinsics.checkNotNullExpressionValue(f11, "adapter(...)");
        this.booleanAdapter = f11;
        JsonAdapter<OzonSpannableString> f12 = moshi.f(OzonSpannableString.class, m11, "text");
        Intrinsics.checkNotNullExpressionValue(f12, "adapter(...)");
        this.ozonSpannableStringAdapter = f12;
        JsonAdapter<ButtonV3Atom.AddToCartAtom.AddToCartStyle> f13 = moshi.f(ButtonV3Atom.AddToCartAtom.AddToCartStyle.class, m11, "style");
        Intrinsics.checkNotNullExpressionValue(f13, "adapter(...)");
        this.addToCartStyleAdapter = f13;
        JsonAdapter<ButtonV3Atom.AddToCartAtom.AddToCartStyle> f14 = moshi.f(ButtonV3Atom.AddToCartAtom.AddToCartStyle.class, m11, "theme");
        Intrinsics.checkNotNullExpressionValue(f14, "adapter(...)");
        this.nullableAddToCartStyleAdapter = f14;
        JsonAdapter<ButtonV3Atom.AddToCartAtom.Action> f15 = moshi.f(ButtonV3Atom.AddToCartAtom.Action.class, m11, "action");
        Intrinsics.checkNotNullExpressionValue(f15, "adapter(...)");
        this.nullableActionAdapter = f15;
        JsonAdapter<TestInfo> f16 = moshi.f(TestInfo.class, m11, "testInfo");
        Intrinsics.checkNotNullExpressionValue(f16, "adapter(...)");
        this.nullableTestInfoAdapter = f16;
        JsonAdapter<Map<String, TokenizedTrackingInfo>> f17 = moshi.f(D.e(Map.class, String.class, TokenizedTrackingInfo.class), m11, "trackingInfo");
        Intrinsics.checkNotNullExpressionValue(f17, "adapter(...)");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter = f17;
        JsonAdapter<ButtonV3Atom.Extend> f18 = moshi.f(ButtonV3Atom.Extend.class, m11, "extend");
        Intrinsics.checkNotNullExpressionValue(f18, "adapter(...)");
        this.nullableExtendAdapter = f18;
        JsonAdapter<Map<String, String>> f19 = moshi.f(D.e(Map.class, String.class, String.class), m11, "extendMap");
        Intrinsics.checkNotNullExpressionValue(f19, "adapter(...)");
        this.nullableMapOfStringStringAdapter = f19;
    }

    @NotNull
    public String toString() {
        return b.c(64, "GeneratedJsonAdapter(ButtonV3Atom.AddToCartAtom.AddToCartButton)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public ButtonV3Atom.AddToCartAtom.AddToCartButton fromJson(@NotNull n reader) {
        int i11;
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        int i12 = -1;
        String str = null;
        Boolean bool = null;
        OzonSpannableString ozonSpannableString = null;
        ButtonV3Atom.AddToCartAtom.AddToCartStyle addToCartStyle = null;
        ButtonV3Atom.AddToCartAtom.AddToCartStyle addToCartStyle2 = null;
        ButtonV3Atom.AddToCartAtom.Action action = null;
        String str2 = null;
        TestInfo testInfo = null;
        Map<String, TokenizedTrackingInfo> map = null;
        ButtonV3Atom.Extend extend = null;
        Map<String, String> map2 = null;
        while (reader.hasNext()) {
            String str3 = str;
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    break;
                case 0:
                    str = this.nullableStringAdapter.fromJson(reader);
                    continue;
                case 1:
                    bool = this.booleanAdapter.fromJson(reader);
                    if (bool == null) {
                        throw c.q("isActive", "isActive", reader);
                    }
                    break;
                case 2:
                    ozonSpannableString = this.ozonSpannableStringAdapter.fromJson(reader);
                    if (ozonSpannableString == null) {
                        throw c.q("text", "text", reader);
                    }
                    break;
                case 3:
                    addToCartStyle = this.addToCartStyleAdapter.fromJson(reader);
                    if (addToCartStyle == null) {
                        throw c.q("style", "style", reader);
                    }
                    i12 &= -9;
                    break;
                case 4:
                    addToCartStyle2 = this.nullableAddToCartStyleAdapter.fromJson(reader);
                    i12 &= -17;
                    break;
                case 5:
                    action = this.nullableActionAdapter.fromJson(reader);
                    i12 &= -33;
                    break;
                case 6:
                    str2 = this.nullableStringAdapter.fromJson(reader);
                    i12 &= -65;
                    break;
                case 7:
                    testInfo = this.nullableTestInfoAdapter.fromJson(reader);
                    i12 &= -129;
                    break;
                case 8:
                    map = this.nullableMapOfStringTokenizedTrackingInfoAdapter.fromJson(reader);
                    i12 &= -257;
                    break;
                case 9:
                    extend = this.nullableExtendAdapter.fromJson(reader);
                    i12 &= -513;
                    break;
                case 10:
                    map2 = this.nullableMapOfStringStringAdapter.fromJson(reader);
                    i12 &= -1025;
                    break;
            }
            str = str3;
        }
        String str4 = str;
        reader.endObject();
        if (i12 == -2041) {
            if (bool == null) {
                throw c.j("isActive", "isActive", reader);
            }
            OzonSpannableString ozonSpannableString2 = ozonSpannableString;
            boolean booleanValue = bool.booleanValue();
            if (ozonSpannableString2 == null) {
                throw c.j("text", "text", reader);
            }
            Intrinsics.g(addToCartStyle, "null cannot be cast to non-null type ru.ozon.uni.atoms.data.button.ButtonV3Atom.AddToCartAtom.AddToCartStyle");
            Map<String, TokenizedTrackingInfo> map3 = map;
            TestInfo testInfo2 = testInfo;
            String str5 = str2;
            return new ButtonV3Atom.AddToCartAtom.AddToCartButton(str4, booleanValue, ozonSpannableString2, addToCartStyle, addToCartStyle2, action, str5, testInfo2, map3, extend, map2);
        }
        Constructor<ButtonV3Atom.AddToCartAtom.AddToCartButton> constructor = this.constructorRef;
        if (constructor == null) {
            i11 = i12;
            constructor = ButtonV3Atom.AddToCartAtom.AddToCartButton.class.getDeclaredConstructor(String.class, Boolean.TYPE, OzonSpannableString.class, ButtonV3Atom.AddToCartAtom.AddToCartStyle.class, ButtonV3Atom.AddToCartAtom.AddToCartStyle.class, ButtonV3Atom.AddToCartAtom.Action.class, String.class, TestInfo.class, Map.class, ButtonV3Atom.Extend.class, Map.class, Integer.TYPE, c.f34864d);
            this.constructorRef = constructor;
            Intrinsics.checkNotNullExpressionValue(constructor, "also(...)");
        } else {
            i11 = i12;
        }
        Constructor<ButtonV3Atom.AddToCartAtom.AddToCartButton> constructor2 = constructor;
        if (bool == null) {
            throw c.j("isActive", "isActive", reader);
        }
        if (ozonSpannableString == null) {
            throw c.j("text", "text", reader);
        }
        ButtonV3Atom.AddToCartAtom.AddToCartButton newInstance = constructor2.newInstance(str4, bool, ozonSpannableString, addToCartStyle, addToCartStyle2, action, str2, testInfo, map, extend, map2, Integer.valueOf(i11), null);
        Intrinsics.checkNotNullExpressionValue(newInstance, "newInstance(...)");
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, ButtonV3Atom.AddToCartAtom.AddToCartButton value_) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("activeText");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getActiveText());
        writer.w("isActive");
        this.booleanAdapter.mo44toJson(writer, (x) Boolean.valueOf(value_.isActive()));
        writer.w("text");
        this.ozonSpannableStringAdapter.mo44toJson(writer, (x) value_.getText());
        writer.w("style");
        this.addToCartStyleAdapter.mo44toJson(writer, (x) value_.getStyle());
        writer.w("theme");
        this.nullableAddToCartStyleAdapter.mo44toJson(writer, (x) value_.getTheme());
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
        writer.w("extendMap");
        this.nullableMapOfStringStringAdapter.mo44toJson(writer, (x) value_.getExtendMap());
        writer.p();
    }
}
