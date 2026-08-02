package ru.ozon.app.android.atoms.data.button;

import Ak.b;
import Y9.c;
import com.squareup.moshi.D;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.n;
import com.squareup.moshi.x;
import java.lang.reflect.Constructor;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.M;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.atoms.data.AtomActionDTO;
import ru.ozon.app.android.atoms.data.TestInfo;
import ru.ozon.app.android.atoms.data.button.ButtonV3Atom;
import ru.ozon.app.android.atoms.utils.OzonSpannableString;

@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0019R\u001c\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\"\u0010\u001d\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u001c0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0019R\u001c\u0010\u001f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0019R\u001c\u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010 0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u0019R\u001c\u0010#\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\"0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\u0019R(\u0010&\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020%\u0018\u00010$0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010\u0019R\u001e\u0010(\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)¨\u0006*"}, d2 = {"Lru/ozon/app/android/atoms/data/button/ButtonV3Atom_LargeGradientButtonJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/atoms/data/button/ButtonV3Atom$LargeGradientButton;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/atoms/data/button/ButtonV3Atom$LargeGradientButton;", "Lcom/squareup/moshi/x;", "writer", "value_", "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/atoms/data/button/ButtonV3Atom$LargeGradientButton;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "Lru/ozon/app/android/atoms/utils/OzonSpannableString;", "ozonSpannableStringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "nullableOzonSpannableStringAdapter", "nullableStringAdapter", "", "nullableListOfStringAdapter", "Lru/ozon/app/android/atoms/data/button/ButtonV3Atom$LargeGradientButton$LargeGradientButtonStyle;", "nullableLargeGradientButtonStyleAdapter", "Lru/ozon/app/android/atoms/data/AtomActionDTO;", "nullableAtomActionDTOAdapter", "Lru/ozon/app/android/atoms/data/TestInfo;", "nullableTestInfoAdapter", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "nullableMapOfStringTokenizedTrackingInfoAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "design-system_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ButtonV3Atom_LargeGradientButtonJsonAdapter extends JsonAdapter<ButtonV3Atom.LargeGradientButton> {
    public static final int $stable = 8;
    private volatile Constructor<ButtonV3Atom.LargeGradientButton> constructorRef;

    @NotNull
    private final JsonAdapter<AtomActionDTO> nullableAtomActionDTOAdapter;

    @NotNull
    private final JsonAdapter<ButtonV3Atom.LargeGradientButton.LargeGradientButtonStyle> nullableLargeGradientButtonStyleAdapter;

    @NotNull
    private final JsonAdapter<List<String>> nullableListOfStringAdapter;

    @NotNull
    private final JsonAdapter<Map<String, TokenizedTrackingInfo>> nullableMapOfStringTokenizedTrackingInfoAdapter;

    @NotNull
    private final JsonAdapter<OzonSpannableString> nullableOzonSpannableStringAdapter;

    @NotNull
    private final JsonAdapter<String> nullableStringAdapter;

    @NotNull
    private final JsonAdapter<TestInfo> nullableTestInfoAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<OzonSpannableString> ozonSpannableStringAdapter;

    public ButtonV3Atom_LargeGradientButtonJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        n.a a11 = n.a.C0918a.a("text", "subtext", "textColor", "gradientColors", "theme", "icon", "action", "context", "testInfo", "trackingInfo");
        Intrinsics.checkNotNullExpressionValue(a11, "of(...)");
        this.options = a11;
        M m11 = M.f71699a;
        JsonAdapter<OzonSpannableString> f7 = moshi.f(OzonSpannableString.class, m11, "text");
        Intrinsics.checkNotNullExpressionValue(f7, "adapter(...)");
        this.ozonSpannableStringAdapter = f7;
        JsonAdapter<OzonSpannableString> f11 = moshi.f(OzonSpannableString.class, m11, "subtext");
        Intrinsics.checkNotNullExpressionValue(f11, "adapter(...)");
        this.nullableOzonSpannableStringAdapter = f11;
        JsonAdapter<String> f12 = moshi.f(String.class, m11, "textColor");
        Intrinsics.checkNotNullExpressionValue(f12, "adapter(...)");
        this.nullableStringAdapter = f12;
        JsonAdapter<List<String>> f13 = moshi.f(D.e(List.class, String.class), m11, "gradientColors");
        Intrinsics.checkNotNullExpressionValue(f13, "adapter(...)");
        this.nullableListOfStringAdapter = f13;
        JsonAdapter<ButtonV3Atom.LargeGradientButton.LargeGradientButtonStyle> f14 = moshi.f(ButtonV3Atom.LargeGradientButton.LargeGradientButtonStyle.class, m11, "theme");
        Intrinsics.checkNotNullExpressionValue(f14, "adapter(...)");
        this.nullableLargeGradientButtonStyleAdapter = f14;
        JsonAdapter<AtomActionDTO> f15 = moshi.f(AtomActionDTO.class, m11, "action");
        Intrinsics.checkNotNullExpressionValue(f15, "adapter(...)");
        this.nullableAtomActionDTOAdapter = f15;
        JsonAdapter<TestInfo> f16 = moshi.f(TestInfo.class, m11, "testInfo");
        Intrinsics.checkNotNullExpressionValue(f16, "adapter(...)");
        this.nullableTestInfoAdapter = f16;
        JsonAdapter<Map<String, TokenizedTrackingInfo>> f17 = moshi.f(D.e(Map.class, String.class, TokenizedTrackingInfo.class), m11, "trackingInfo");
        Intrinsics.checkNotNullExpressionValue(f17, "adapter(...)");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter = f17;
    }

    @NotNull
    public String toString() {
        return b.c(54, "GeneratedJsonAdapter(ButtonV3Atom.LargeGradientButton)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public ButtonV3Atom.LargeGradientButton fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        int i11 = -1;
        OzonSpannableString ozonSpannableString = null;
        OzonSpannableString ozonSpannableString2 = null;
        String str = null;
        List<String> list = null;
        ButtonV3Atom.LargeGradientButton.LargeGradientButtonStyle largeGradientButtonStyle = null;
        String str2 = null;
        AtomActionDTO atomActionDTO = null;
        String str3 = null;
        TestInfo testInfo = null;
        Map<String, TokenizedTrackingInfo> map = null;
        while (reader.hasNext()) {
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    break;
                case 0:
                    ozonSpannableString = this.ozonSpannableStringAdapter.fromJson(reader);
                    if (ozonSpannableString == null) {
                        throw c.q("text", "text", reader);
                    }
                    break;
                case 1:
                    ozonSpannableString2 = this.nullableOzonSpannableStringAdapter.fromJson(reader);
                    i11 &= -3;
                    break;
                case 2:
                    str = this.nullableStringAdapter.fromJson(reader);
                    i11 &= -5;
                    break;
                case 3:
                    list = this.nullableListOfStringAdapter.fromJson(reader);
                    i11 &= -9;
                    break;
                case 4:
                    largeGradientButtonStyle = this.nullableLargeGradientButtonStyleAdapter.fromJson(reader);
                    break;
                case 5:
                    str2 = this.nullableStringAdapter.fromJson(reader);
                    i11 &= -33;
                    break;
                case 6:
                    atomActionDTO = this.nullableAtomActionDTOAdapter.fromJson(reader);
                    i11 &= -65;
                    break;
                case 7:
                    str3 = this.nullableStringAdapter.fromJson(reader);
                    i11 &= -129;
                    break;
                case 8:
                    testInfo = this.nullableTestInfoAdapter.fromJson(reader);
                    i11 &= -257;
                    break;
                case 9:
                    map = this.nullableMapOfStringTokenizedTrackingInfoAdapter.fromJson(reader);
                    i11 &= -513;
                    break;
            }
        }
        reader.endObject();
        if (i11 == -1007) {
            TestInfo testInfo2 = testInfo;
            String str4 = str3;
            AtomActionDTO atomActionDTO2 = atomActionDTO;
            String str5 = str2;
            ButtonV3Atom.LargeGradientButton.LargeGradientButtonStyle largeGradientButtonStyle2 = largeGradientButtonStyle;
            List<String> list2 = list;
            String str6 = str;
            OzonSpannableString ozonSpannableString3 = ozonSpannableString2;
            OzonSpannableString ozonSpannableString4 = ozonSpannableString;
            if (ozonSpannableString4 != null) {
                return new ButtonV3Atom.LargeGradientButton(ozonSpannableString4, ozonSpannableString3, str6, list2, largeGradientButtonStyle2, str5, atomActionDTO2, str4, testInfo2, map);
            }
            throw c.j("text", "text", reader);
        }
        TestInfo testInfo3 = testInfo;
        String str7 = str3;
        AtomActionDTO atomActionDTO3 = atomActionDTO;
        String str8 = str2;
        ButtonV3Atom.LargeGradientButton.LargeGradientButtonStyle largeGradientButtonStyle3 = largeGradientButtonStyle;
        List<String> list3 = list;
        String str9 = str;
        OzonSpannableString ozonSpannableString5 = ozonSpannableString2;
        OzonSpannableString ozonSpannableString6 = ozonSpannableString;
        Constructor<ButtonV3Atom.LargeGradientButton> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = ButtonV3Atom.LargeGradientButton.class.getDeclaredConstructor(OzonSpannableString.class, OzonSpannableString.class, String.class, List.class, ButtonV3Atom.LargeGradientButton.LargeGradientButtonStyle.class, String.class, AtomActionDTO.class, String.class, TestInfo.class, Map.class, Integer.TYPE, c.f34864d);
            this.constructorRef = constructor;
            Intrinsics.checkNotNullExpressionValue(constructor, "also(...)");
        }
        if (ozonSpannableString6 == null) {
            throw c.j("text", "text", reader);
        }
        ButtonV3Atom.LargeGradientButton newInstance = constructor.newInstance(ozonSpannableString6, ozonSpannableString5, str9, list3, largeGradientButtonStyle3, str8, atomActionDTO3, str7, testInfo3, map, Integer.valueOf(i11), null);
        Intrinsics.checkNotNullExpressionValue(newInstance, "newInstance(...)");
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, ButtonV3Atom.LargeGradientButton value_) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("text");
        this.ozonSpannableStringAdapter.mo44toJson(writer, (x) value_.getText());
        writer.w("subtext");
        this.nullableOzonSpannableStringAdapter.mo44toJson(writer, (x) value_.getSubtext());
        writer.w("textColor");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getTextColor());
        writer.w("gradientColors");
        this.nullableListOfStringAdapter.mo44toJson(writer, (x) value_.getGradientColors());
        writer.w("theme");
        this.nullableLargeGradientButtonStyleAdapter.mo44toJson(writer, (x) value_.getTheme());
        writer.w("icon");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getIcon());
        writer.w("action");
        this.nullableAtomActionDTOAdapter.mo44toJson(writer, (x) value_.getAction());
        writer.w("context");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getContext());
        writer.w("testInfo");
        this.nullableTestInfoAdapter.mo44toJson(writer, (x) value_.getTestInfo());
        writer.w("trackingInfo");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter.mo44toJson(writer, (x) value_.getTrackingInfo());
        writer.p();
    }
}
