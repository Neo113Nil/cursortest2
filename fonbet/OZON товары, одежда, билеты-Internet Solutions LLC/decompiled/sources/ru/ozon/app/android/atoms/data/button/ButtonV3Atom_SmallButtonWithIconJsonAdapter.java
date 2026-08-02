package ru.ozon.app.android.atoms.data.button;

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
import ru.ozon.app.android.atoms.data.AtomActionDTO;
import ru.ozon.app.android.atoms.data.TestInfo;
import ru.ozon.app.android.atoms.data.button.ButtonV3Atom;
import ru.ozon.app.android.atoms.utils.OzonSpannableString;

@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0019R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0019R\u001c\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001d0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0019R\u001c\u0010 \u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u0019R\u001c\u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u0019R(\u0010$\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020#\u0018\u00010\"0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010\u0019R\u001c\u0010&\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010%0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010\u0019R\u001e\u0010(\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)¨\u0006*"}, d2 = {"Lru/ozon/app/android/atoms/data/button/ButtonV3Atom_SmallButtonWithIconJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/atoms/data/button/ButtonV3Atom$SmallButtonWithIcon;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/atoms/data/button/ButtonV3Atom$SmallButtonWithIcon;", "Lcom/squareup/moshi/x;", "writer", "value_", "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/atoms/data/button/ButtonV3Atom$SmallButtonWithIcon;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "Lru/ozon/app/android/atoms/utils/OzonSpannableString;", "ozonSpannableStringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "stringAdapter", "Lru/ozon/app/android/atoms/data/button/ButtonV3Atom$SmallButtonWithIcon$SmallButtonWithIconStyle;", "smallButtonWithIconStyleAdapter", "", "nullableBooleanAdapter", "Lru/ozon/app/android/atoms/data/AtomActionDTO;", "nullableAtomActionDTOAdapter", "nullableStringAdapter", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "nullableMapOfStringTokenizedTrackingInfoAdapter", "Lru/ozon/app/android/atoms/data/TestInfo;", "nullableTestInfoAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "design-system_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ButtonV3Atom_SmallButtonWithIconJsonAdapter extends JsonAdapter<ButtonV3Atom.SmallButtonWithIcon> {
    public static final int $stable = 8;
    private volatile Constructor<ButtonV3Atom.SmallButtonWithIcon> constructorRef;

    @NotNull
    private final JsonAdapter<AtomActionDTO> nullableAtomActionDTOAdapter;

    @NotNull
    private final JsonAdapter<Boolean> nullableBooleanAdapter;

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

    @NotNull
    private final JsonAdapter<ButtonV3Atom.SmallButtonWithIcon.SmallButtonWithIconStyle> smallButtonWithIconStyleAdapter;

    @NotNull
    private final JsonAdapter<String> stringAdapter;

    public ButtonV3Atom_SmallButtonWithIconJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        n.a a11 = n.a.C0918a.a("text", "icon", "theme", "isSelected", "action", "tintColor", "trackingInfo", "testInfo", "context");
        Intrinsics.checkNotNullExpressionValue(a11, "of(...)");
        this.options = a11;
        M m11 = M.f71699a;
        JsonAdapter<OzonSpannableString> f7 = moshi.f(OzonSpannableString.class, m11, "text");
        Intrinsics.checkNotNullExpressionValue(f7, "adapter(...)");
        this.ozonSpannableStringAdapter = f7;
        JsonAdapter<String> f11 = moshi.f(String.class, m11, "icon");
        Intrinsics.checkNotNullExpressionValue(f11, "adapter(...)");
        this.stringAdapter = f11;
        JsonAdapter<ButtonV3Atom.SmallButtonWithIcon.SmallButtonWithIconStyle> f12 = moshi.f(ButtonV3Atom.SmallButtonWithIcon.SmallButtonWithIconStyle.class, m11, "theme");
        Intrinsics.checkNotNullExpressionValue(f12, "adapter(...)");
        this.smallButtonWithIconStyleAdapter = f12;
        JsonAdapter<Boolean> f13 = moshi.f(Boolean.class, m11, "isSelected");
        Intrinsics.checkNotNullExpressionValue(f13, "adapter(...)");
        this.nullableBooleanAdapter = f13;
        JsonAdapter<AtomActionDTO> f14 = moshi.f(AtomActionDTO.class, m11, "action");
        Intrinsics.checkNotNullExpressionValue(f14, "adapter(...)");
        this.nullableAtomActionDTOAdapter = f14;
        JsonAdapter<String> f15 = moshi.f(String.class, m11, "tintColor");
        Intrinsics.checkNotNullExpressionValue(f15, "adapter(...)");
        this.nullableStringAdapter = f15;
        JsonAdapter<Map<String, TokenizedTrackingInfo>> f16 = moshi.f(D.e(Map.class, String.class, TokenizedTrackingInfo.class), m11, "trackingInfo");
        Intrinsics.checkNotNullExpressionValue(f16, "adapter(...)");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter = f16;
        JsonAdapter<TestInfo> f17 = moshi.f(TestInfo.class, m11, "testInfo");
        Intrinsics.checkNotNullExpressionValue(f17, "adapter(...)");
        this.nullableTestInfoAdapter = f17;
    }

    @NotNull
    public String toString() {
        return b.c(54, "GeneratedJsonAdapter(ButtonV3Atom.SmallButtonWithIcon)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public ButtonV3Atom.SmallButtonWithIcon fromJson(@NotNull n reader) {
        int i11;
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        int i12 = -1;
        OzonSpannableString ozonSpannableString = null;
        String str = null;
        ButtonV3Atom.SmallButtonWithIcon.SmallButtonWithIconStyle smallButtonWithIconStyle = null;
        Boolean bool = null;
        AtomActionDTO atomActionDTO = null;
        String str2 = null;
        Map<String, TokenizedTrackingInfo> map = null;
        TestInfo testInfo = null;
        String str3 = null;
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
                    str = this.stringAdapter.fromJson(reader);
                    if (str == null) {
                        throw c.q("icon", "icon", reader);
                    }
                    break;
                case 2:
                    smallButtonWithIconStyle = this.smallButtonWithIconStyleAdapter.fromJson(reader);
                    if (smallButtonWithIconStyle == null) {
                        throw c.q("theme", "theme", reader);
                    }
                    break;
                case 3:
                    bool = this.nullableBooleanAdapter.fromJson(reader);
                    i12 &= -9;
                    break;
                case 4:
                    atomActionDTO = this.nullableAtomActionDTOAdapter.fromJson(reader);
                    i12 &= -17;
                    break;
                case 5:
                    str2 = this.nullableStringAdapter.fromJson(reader);
                    i12 &= -33;
                    break;
                case 6:
                    map = this.nullableMapOfStringTokenizedTrackingInfoAdapter.fromJson(reader);
                    i12 &= -65;
                    break;
                case 7:
                    testInfo = this.nullableTestInfoAdapter.fromJson(reader);
                    i12 &= -129;
                    break;
                case 8:
                    str3 = this.nullableStringAdapter.fromJson(reader);
                    i12 &= -257;
                    break;
            }
        }
        reader.endObject();
        if (i12 == -505) {
            String str4 = str3;
            TestInfo testInfo2 = testInfo;
            Map<String, TokenizedTrackingInfo> map2 = map;
            String str5 = str2;
            AtomActionDTO atomActionDTO2 = atomActionDTO;
            Boolean bool2 = bool;
            ButtonV3Atom.SmallButtonWithIcon.SmallButtonWithIconStyle smallButtonWithIconStyle2 = smallButtonWithIconStyle;
            String str6 = str;
            OzonSpannableString ozonSpannableString2 = ozonSpannableString;
            if (ozonSpannableString2 == null) {
                throw c.j("text", "text", reader);
            }
            if (str6 == null) {
                throw c.j("icon", "icon", reader);
            }
            if (smallButtonWithIconStyle2 != null) {
                return new ButtonV3Atom.SmallButtonWithIcon(ozonSpannableString2, str6, smallButtonWithIconStyle2, bool2, atomActionDTO2, str5, map2, testInfo2, str4);
            }
            throw c.j("theme", "theme", reader);
        }
        String str7 = str3;
        TestInfo testInfo3 = testInfo;
        Map<String, TokenizedTrackingInfo> map3 = map;
        String str8 = str2;
        AtomActionDTO atomActionDTO3 = atomActionDTO;
        Boolean bool3 = bool;
        ButtonV3Atom.SmallButtonWithIcon.SmallButtonWithIconStyle smallButtonWithIconStyle3 = smallButtonWithIconStyle;
        String str9 = str;
        OzonSpannableString ozonSpannableString3 = ozonSpannableString;
        Constructor<ButtonV3Atom.SmallButtonWithIcon> constructor = this.constructorRef;
        if (constructor == null) {
            i11 = i12;
            constructor = ButtonV3Atom.SmallButtonWithIcon.class.getDeclaredConstructor(OzonSpannableString.class, String.class, ButtonV3Atom.SmallButtonWithIcon.SmallButtonWithIconStyle.class, Boolean.class, AtomActionDTO.class, String.class, Map.class, TestInfo.class, String.class, Integer.TYPE, c.f34864d);
            this.constructorRef = constructor;
            Intrinsics.checkNotNullExpressionValue(constructor, "also(...)");
        } else {
            i11 = i12;
        }
        Constructor<ButtonV3Atom.SmallButtonWithIcon> constructor2 = constructor;
        if (ozonSpannableString3 == null) {
            throw c.j("text", "text", reader);
        }
        if (str9 == null) {
            throw c.j("icon", "icon", reader);
        }
        if (smallButtonWithIconStyle3 == null) {
            throw c.j("theme", "theme", reader);
        }
        ButtonV3Atom.SmallButtonWithIcon newInstance = constructor2.newInstance(ozonSpannableString3, str9, smallButtonWithIconStyle3, bool3, atomActionDTO3, str8, map3, testInfo3, str7, Integer.valueOf(i11), null);
        Intrinsics.checkNotNullExpressionValue(newInstance, "newInstance(...)");
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, ButtonV3Atom.SmallButtonWithIcon value_) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("text");
        this.ozonSpannableStringAdapter.mo44toJson(writer, (x) value_.getText());
        writer.w("icon");
        this.stringAdapter.mo44toJson(writer, (x) value_.getIcon());
        writer.w("theme");
        this.smallButtonWithIconStyleAdapter.mo44toJson(writer, (x) value_.getTheme());
        writer.w("isSelected");
        this.nullableBooleanAdapter.mo44toJson(writer, (x) value_.isSelected());
        writer.w("action");
        this.nullableAtomActionDTOAdapter.mo44toJson(writer, (x) value_.getAction());
        writer.w("tintColor");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getTintColor());
        writer.w("trackingInfo");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter.mo44toJson(writer, (x) value_.getTrackingInfo());
        writer.w("testInfo");
        this.nullableTestInfoAdapter.mo44toJson(writer, (x) value_.getTestInfo());
        writer.w("context");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getContext());
        writer.p();
    }
}
