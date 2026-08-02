package ru.ozon.fintech.features.cbottombase.models.widgets.v2;

import Ak.b;
import Y9.c;
import com.google.protobuf.DescriptorProtos$FileOptions;
import com.google.protobuf.DescriptorProtos$MethodOptions;
import com.squareup.moshi.D;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.n;
import com.squareup.moshi.x;
import io.sentry.android.core.internal.tombstone.TombstoneProtos$Tombstone;
import java.lang.reflect.Constructor;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.M;
import kotlin.collections.e0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.fintech.exchanger.datapass.ComposerTrackingInfo;
import ru.ozon.fintech.features.cbottombase.models.widgets.v2.TextFieldV20DTO;
import ru.ozon.fintech.features.cbottombase.models.widgets.v2.interfaces.CbottomElement2;
import ru.ozon.uni.android.input.textinput.data.OzonTextInputLayoutModel;
import ru.ozon.uni.android.wrappers.mainaddon.data.AddonSide;
import ru.ozon.uni.atoms.parsing.adapter.annotation.EnumNullFallback;
import ru.rustore.sdk.appupdate.model.AppUpdateInfo;
import t40.EnumC9751a;
import t40.EnumC9752b;

@Metadata(d1 = {"\u0000¢\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0019R\u001c\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0019R\u001c\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001d0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0019R\u001c\u0010 \u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u0019R\"\u0010\"\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010!0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u0019R\"\u0010$\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020#\u0018\u00010!0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010\u0019R\u001c\u0010%\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010\u0019R\"\u0010&\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010!0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010\u0019R\u001c\u0010(\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010'0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010\u0019R\u001c\u0010*\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010)0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010\u0019R\u001c\u0010,\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010+0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010\u0019R\u001c\u0010.\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010-0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010\u0019R\u001c\u00100\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010/0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u0010\u0019R\u001c\u00102\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001010\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u0010\u0019R\u001c\u00104\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001030\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u0010\u0019R(\u00106\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0018\u0001050\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u0010\u0019R(\u00108\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u000207\u0018\u0001050\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u0010\u0019R\u001e\u0010:\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u0001098\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u0010;¨\u0006<"}, d2 = {"Lru/ozon/fintech/features/cbottombase/models/widgets/v2/TextFieldV20DTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/fintech/features/cbottombase/models/widgets/v2/TextFieldV20DTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/fintech/features/cbottombase/models/widgets/v2/TextFieldV20DTO;", "Lcom/squareup/moshi/x;", "writer", "value_", "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/fintech/features/cbottombase/models/widgets/v2/TextFieldV20DTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "Lru/ozon/fintech/features/cbottombase/models/widgets/v2/interfaces/CbottomElement2;", "cbottomElement2Adapter", "Lcom/squareup/moshi/JsonAdapter;", "stringAdapter", "", "nullableIntAdapter", "", "nullableBooleanAdapter", "", "nullableFloatAdapter", "", "nullableListOfIntAdapter", "Lt40/b;", "nullableListOfCbottomLayoutGravityAdapter", "nullableStringAdapter", "nullableListOfStringAdapter", "Lt40/a;", "nullableCbottomGradientOrientationAdapter", "Lru/ozon/fintech/features/cbottombase/models/widgets/v2/TextFieldV20DTO$b;", "nullableTextFieldPresetEnumAdapter", "Lru/ozon/uni/android/wrappers/mainaddon/data/AddonSide;", "nullableAddonSideAtEnumNullFallbackAdapter", "Lru/ozon/uni/android/input/textinput/data/OzonTextInputLayoutModel$State;", "nullableStateAtEnumNullFallbackAdapter", "Lru/ozon/uni/android/input/textinput/data/OzonTextInputLayoutModel$Status;", "nullableStatusAtEnumNullFallbackAdapter", "Lru/ozon/uni/android/input/textinput/data/OzonTextInputLayoutModel$KeyboardType;", "nullableKeyboardTypeAtEnumNullFallbackAdapter", "Lru/ozon/uni/android/input/textinput/data/OzonTextInputLayoutModel$KeyboardAction;", "nullableKeyboardActionAtEnumNullFallbackAdapter", "", "nullableMapOfStringStringAdapter", "Lru/ozon/fintech/exchanger/datapass/ComposerTrackingInfo;", "nullableMapOfStringComposerTrackingInfoAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "cbottom-base_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TextFieldV20DTOJsonAdapter extends JsonAdapter<TextFieldV20DTO> {

    @NotNull
    private final JsonAdapter<CbottomElement2> cbottomElement2Adapter;
    private volatile Constructor<TextFieldV20DTO> constructorRef;

    @NotNull
    private final JsonAdapter<AddonSide> nullableAddonSideAtEnumNullFallbackAdapter;

    @NotNull
    private final JsonAdapter<Boolean> nullableBooleanAdapter;

    @NotNull
    private final JsonAdapter<EnumC9751a> nullableCbottomGradientOrientationAdapter;

    @NotNull
    private final JsonAdapter<Float> nullableFloatAdapter;

    @NotNull
    private final JsonAdapter<Integer> nullableIntAdapter;

    @NotNull
    private final JsonAdapter<OzonTextInputLayoutModel.KeyboardAction> nullableKeyboardActionAtEnumNullFallbackAdapter;

    @NotNull
    private final JsonAdapter<OzonTextInputLayoutModel.KeyboardType> nullableKeyboardTypeAtEnumNullFallbackAdapter;

    @NotNull
    private final JsonAdapter<List<EnumC9752b>> nullableListOfCbottomLayoutGravityAdapter;

    @NotNull
    private final JsonAdapter<List<Integer>> nullableListOfIntAdapter;

    @NotNull
    private final JsonAdapter<List<String>> nullableListOfStringAdapter;

    @NotNull
    private final JsonAdapter<Map<String, ComposerTrackingInfo>> nullableMapOfStringComposerTrackingInfoAdapter;

    @NotNull
    private final JsonAdapter<Map<String, String>> nullableMapOfStringStringAdapter;

    @NotNull
    private final JsonAdapter<OzonTextInputLayoutModel.State> nullableStateAtEnumNullFallbackAdapter;

    @NotNull
    private final JsonAdapter<OzonTextInputLayoutModel.Status> nullableStatusAtEnumNullFallbackAdapter;

    @NotNull
    private final JsonAdapter<String> nullableStringAdapter;

    @NotNull
    private final JsonAdapter<TextFieldV20DTO.b> nullableTextFieldPresetEnumAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<String> stringAdapter;

    public /* synthetic */ class a implements EnumNullFallback {
        @Override // java.lang.annotation.Annotation
        public final /* synthetic */ Class annotationType() {
            return EnumNullFallback.class;
        }

        @Override // java.lang.annotation.Annotation
        public final boolean equals(Object obj) {
            return obj instanceof EnumNullFallback;
        }

        @Override // java.lang.annotation.Annotation
        public final int hashCode() {
            return 0;
        }

        @Override // java.lang.annotation.Annotation
        @NotNull
        public final String toString() {
            return "@ru.ozon.uni.atoms.parsing.adapter.annotation.EnumNullFallback()";
        }
    }

    public TextFieldV20DTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        n.a a11 = n.a.C0918a.a("type", "id", "version", "clickable", "touchDown", "skeletonable", "disableHighlightAnimation", "width", "height", "ratioW", "ratioH", "percentW", "margins", "layoutGravity", "layoutWeight", "paddings", "backgroundRadius", "backgroundColor", "backgroundGradient", "backgroundGradientOrientation", "strokeColor", "strokeWidth", "dashWidth", "dashGap", "elevation", "opacity", "isHidden", "textFieldPreset", "inputTitle", "inputValue", "labelText", "labelTextColor", "labelIcon", "labelIconColor", "isInputCopyEnabled", "isInputResetEnabled", "isInputProtected", "versionStamp", "labelIconPosition", "inputState", "inputStatus", "inputKeyboardType", "inputKeyboardAction", "composerActionBehavior", "composerActionLink", "composerActionId", "composerActionParams", "composerTrackingInfo");
        Intrinsics.checkNotNullExpressionValue(a11, "of(...)");
        this.options = a11;
        M m11 = M.f71699a;
        JsonAdapter<CbottomElement2> f7 = moshi.f(CbottomElement2.class, m11, "type");
        Intrinsics.checkNotNullExpressionValue(f7, "adapter(...)");
        this.cbottomElement2Adapter = f7;
        JsonAdapter<String> f11 = moshi.f(String.class, m11, "id");
        Intrinsics.checkNotNullExpressionValue(f11, "adapter(...)");
        this.stringAdapter = f11;
        JsonAdapter<Integer> f12 = moshi.f(Integer.class, m11, "version");
        Intrinsics.checkNotNullExpressionValue(f12, "adapter(...)");
        this.nullableIntAdapter = f12;
        JsonAdapter<Boolean> f13 = moshi.f(Boolean.class, m11, "clickable");
        Intrinsics.checkNotNullExpressionValue(f13, "adapter(...)");
        this.nullableBooleanAdapter = f13;
        JsonAdapter<Float> f14 = moshi.f(Float.class, m11, "percentW");
        Intrinsics.checkNotNullExpressionValue(f14, "adapter(...)");
        this.nullableFloatAdapter = f14;
        JsonAdapter<List<Integer>> f15 = moshi.f(D.e(List.class, Integer.class), m11, "margins");
        Intrinsics.checkNotNullExpressionValue(f15, "adapter(...)");
        this.nullableListOfIntAdapter = f15;
        JsonAdapter<List<EnumC9752b>> f16 = moshi.f(D.e(List.class, EnumC9752b.class), m11, "layoutGravity");
        Intrinsics.checkNotNullExpressionValue(f16, "adapter(...)");
        this.nullableListOfCbottomLayoutGravityAdapter = f16;
        JsonAdapter<String> f17 = moshi.f(String.class, m11, "backgroundColor");
        Intrinsics.checkNotNullExpressionValue(f17, "adapter(...)");
        this.nullableStringAdapter = f17;
        JsonAdapter<List<String>> f18 = moshi.f(D.e(List.class, String.class), m11, "backgroundGradient");
        Intrinsics.checkNotNullExpressionValue(f18, "adapter(...)");
        this.nullableListOfStringAdapter = f18;
        JsonAdapter<EnumC9751a> f19 = moshi.f(EnumC9751a.class, m11, "backgroundGradientOrientation");
        Intrinsics.checkNotNullExpressionValue(f19, "adapter(...)");
        this.nullableCbottomGradientOrientationAdapter = f19;
        JsonAdapter<TextFieldV20DTO.b> f21 = moshi.f(TextFieldV20DTO.b.class, m11, "textFieldPreset");
        Intrinsics.checkNotNullExpressionValue(f21, "adapter(...)");
        this.nullableTextFieldPresetEnumAdapter = f21;
        JsonAdapter<AddonSide> f22 = moshi.f(AddonSide.class, e0.h(new a()), "labelIconPosition");
        Intrinsics.checkNotNullExpressionValue(f22, "adapter(...)");
        this.nullableAddonSideAtEnumNullFallbackAdapter = f22;
        JsonAdapter<OzonTextInputLayoutModel.State> f23 = moshi.f(OzonTextInputLayoutModel.State.class, e0.h(new a()), "inputState");
        Intrinsics.checkNotNullExpressionValue(f23, "adapter(...)");
        this.nullableStateAtEnumNullFallbackAdapter = f23;
        JsonAdapter<OzonTextInputLayoutModel.Status> f24 = moshi.f(OzonTextInputLayoutModel.Status.class, e0.h(new a()), "inputStatus");
        Intrinsics.checkNotNullExpressionValue(f24, "adapter(...)");
        this.nullableStatusAtEnumNullFallbackAdapter = f24;
        JsonAdapter<OzonTextInputLayoutModel.KeyboardType> f25 = moshi.f(OzonTextInputLayoutModel.KeyboardType.class, e0.h(new a()), "inputKeyboardType");
        Intrinsics.checkNotNullExpressionValue(f25, "adapter(...)");
        this.nullableKeyboardTypeAtEnumNullFallbackAdapter = f25;
        JsonAdapter<OzonTextInputLayoutModel.KeyboardAction> f26 = moshi.f(OzonTextInputLayoutModel.KeyboardAction.class, e0.h(new a()), "inputKeyboardAction");
        Intrinsics.checkNotNullExpressionValue(f26, "adapter(...)");
        this.nullableKeyboardActionAtEnumNullFallbackAdapter = f26;
        JsonAdapter<Map<String, String>> f27 = moshi.f(D.e(Map.class, String.class, String.class), m11, "composerActionParams");
        Intrinsics.checkNotNullExpressionValue(f27, "adapter(...)");
        this.nullableMapOfStringStringAdapter = f27;
        JsonAdapter<Map<String, ComposerTrackingInfo>> f28 = moshi.f(D.e(Map.class, String.class, ComposerTrackingInfo.class), m11, "composerTrackingInfo");
        Intrinsics.checkNotNullExpressionValue(f28, "adapter(...)");
        this.nullableMapOfStringComposerTrackingInfoAdapter = f28;
    }

    @NotNull
    public String toString() {
        return b.c(37, "GeneratedJsonAdapter(TextFieldV20DTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public TextFieldV20DTO fromJson(@NotNull n reader) {
        int i11;
        int i12;
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        int i13 = -1;
        CbottomElement2 cbottomElement2 = null;
        String str = null;
        Integer num = null;
        Boolean bool = null;
        Boolean bool2 = null;
        Boolean bool3 = null;
        Boolean bool4 = null;
        Integer num2 = null;
        Integer num3 = null;
        Integer num4 = null;
        Integer num5 = null;
        Float f7 = null;
        List<Integer> list = null;
        List<EnumC9752b> list2 = null;
        Float f11 = null;
        List<Integer> list3 = null;
        List<Integer> list4 = null;
        String str2 = null;
        List<String> list5 = null;
        EnumC9751a enumC9751a = null;
        String str3 = null;
        Integer num6 = null;
        Integer num7 = null;
        Integer num8 = null;
        Integer num9 = null;
        Float f12 = null;
        Boolean bool5 = null;
        TextFieldV20DTO.b bVar = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        String str9 = null;
        Boolean bool6 = null;
        Boolean bool7 = null;
        Boolean bool8 = null;
        Integer num10 = null;
        AddonSide addonSide = null;
        OzonTextInputLayoutModel.State state = null;
        OzonTextInputLayoutModel.Status status = null;
        OzonTextInputLayoutModel.KeyboardType keyboardType = null;
        OzonTextInputLayoutModel.KeyboardAction keyboardAction = null;
        String str10 = null;
        String str11 = null;
        String str12 = null;
        Map<String, String> map = null;
        Map<String, ComposerTrackingInfo> map2 = null;
        int i14 = -1;
        while (true) {
            String str13 = str;
            if (!reader.hasNext()) {
                reader.endObject();
                if (i13 == -134217726 && i14 == -63521) {
                    Intrinsics.g(cbottomElement2, "null cannot be cast to non-null type ru.ozon.fintech.features.cbottombase.models.widgets.v2.interfaces.CbottomElement2");
                    if (str13 == null) {
                        throw c.j("id", "id", reader);
                    }
                    Integer num11 = num3;
                    Integer num12 = num2;
                    Boolean bool9 = bool4;
                    Boolean bool10 = bool3;
                    return new TextFieldV20DTO(cbottomElement2, str13, num, bool, bool2, bool10, bool9, num12, num11, num4, num5, f7, list, list2, f11, list3, list4, str2, list5, enumC9751a, str3, num6, num7, num8, num9, f12, bool5, bVar, str4, str5, str6, str7, str8, str9, bool6, bool7, bool8, num10, addonSide, state, status, keyboardType, keyboardAction, str10, str11, str12, map, map2);
                }
                int i15 = i14;
                Constructor<TextFieldV20DTO> constructor = this.constructorRef;
                if (constructor == null) {
                    Class<?> cls = c.f34864d;
                    Class cls2 = Integer.TYPE;
                    i11 = i13;
                    constructor = TextFieldV20DTO.class.getDeclaredConstructor(CbottomElement2.class, String.class, Integer.class, Boolean.class, Boolean.class, Boolean.class, Boolean.class, Integer.class, Integer.class, Integer.class, Integer.class, Float.class, List.class, List.class, Float.class, List.class, List.class, String.class, List.class, EnumC9751a.class, String.class, Integer.class, Integer.class, Integer.class, Integer.class, Float.class, Boolean.class, TextFieldV20DTO.b.class, String.class, String.class, String.class, String.class, String.class, String.class, Boolean.class, Boolean.class, Boolean.class, Integer.class, AddonSide.class, OzonTextInputLayoutModel.State.class, OzonTextInputLayoutModel.Status.class, OzonTextInputLayoutModel.KeyboardType.class, OzonTextInputLayoutModel.KeyboardAction.class, String.class, String.class, String.class, Map.class, Map.class, cls2, cls2, cls);
                    this.constructorRef = constructor;
                    Intrinsics.checkNotNullExpressionValue(constructor, "also(...)");
                } else {
                    i11 = i13;
                }
                if (str13 == null) {
                    throw c.j("id", "id", reader);
                }
                TextFieldV20DTO newInstance = constructor.newInstance(cbottomElement2, str13, num, bool, bool2, bool3, bool4, num2, num3, num4, num5, f7, list, list2, f11, list3, list4, str2, list5, enumC9751a, str3, num6, num7, num8, num9, f12, bool5, bVar, str4, str5, str6, str7, str8, str9, bool6, bool7, bool8, num10, addonSide, state, status, keyboardType, keyboardAction, str10, str11, str12, map, map2, Integer.valueOf(i11), Integer.valueOf(i15), null);
                Intrinsics.checkNotNullExpressionValue(newInstance, "newInstance(...)");
                return newInstance;
            }
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    str = str13;
                case 0:
                    cbottomElement2 = this.cbottomElement2Adapter.fromJson(reader);
                    if (cbottomElement2 == null) {
                        throw c.q("type", "type", reader);
                    }
                    i13 &= -2;
                    str = str13;
                case 1:
                    String fromJson = this.stringAdapter.fromJson(reader);
                    if (fromJson == null) {
                        throw c.q("id", "id", reader);
                    }
                    str = fromJson;
                case 2:
                    num = this.nullableIntAdapter.fromJson(reader);
                    i13 &= -5;
                    str = str13;
                case 3:
                    bool = this.nullableBooleanAdapter.fromJson(reader);
                    i13 &= -9;
                    str = str13;
                case 4:
                    bool2 = this.nullableBooleanAdapter.fromJson(reader);
                    i13 &= -17;
                    str = str13;
                case 5:
                    bool3 = this.nullableBooleanAdapter.fromJson(reader);
                    i13 &= -33;
                    str = str13;
                case 6:
                    bool4 = this.nullableBooleanAdapter.fromJson(reader);
                    i13 &= -65;
                    str = str13;
                case 7:
                    num2 = this.nullableIntAdapter.fromJson(reader);
                    i13 &= -129;
                    str = str13;
                case 8:
                    num3 = this.nullableIntAdapter.fromJson(reader);
                    i13 &= -257;
                    str = str13;
                case 9:
                    num4 = this.nullableIntAdapter.fromJson(reader);
                    i13 &= -513;
                    str = str13;
                case 10:
                    num5 = this.nullableIntAdapter.fromJson(reader);
                    i13 &= -1025;
                    str = str13;
                case 11:
                    f7 = this.nullableFloatAdapter.fromJson(reader);
                    i13 &= -2049;
                    str = str13;
                case 12:
                    list = this.nullableListOfIntAdapter.fromJson(reader);
                    i13 &= -4097;
                    str = str13;
                case 13:
                    list2 = this.nullableListOfCbottomLayoutGravityAdapter.fromJson(reader);
                    i13 &= -8193;
                    str = str13;
                case 14:
                    f11 = this.nullableFloatAdapter.fromJson(reader);
                    i13 &= -16385;
                    str = str13;
                case 15:
                    list3 = this.nullableListOfIntAdapter.fromJson(reader);
                    i13 &= -32769;
                    str = str13;
                case 16:
                    list4 = this.nullableListOfIntAdapter.fromJson(reader);
                    i12 = -65537;
                    i13 &= i12;
                    str = str13;
                case 17:
                    str2 = this.nullableStringAdapter.fromJson(reader);
                    i12 = -131073;
                    i13 &= i12;
                    str = str13;
                case 18:
                    list5 = this.nullableListOfStringAdapter.fromJson(reader);
                    i12 = -262145;
                    i13 &= i12;
                    str = str13;
                case 19:
                    enumC9751a = this.nullableCbottomGradientOrientationAdapter.fromJson(reader);
                    i12 = -524289;
                    i13 &= i12;
                    str = str13;
                case 20:
                    str3 = this.nullableStringAdapter.fromJson(reader);
                    i12 = -1048577;
                    i13 &= i12;
                    str = str13;
                case 21:
                    num6 = this.nullableIntAdapter.fromJson(reader);
                    i12 = -2097153;
                    i13 &= i12;
                    str = str13;
                case 22:
                    num7 = this.nullableIntAdapter.fromJson(reader);
                    i12 = -4194305;
                    i13 &= i12;
                    str = str13;
                case 23:
                    num8 = this.nullableIntAdapter.fromJson(reader);
                    i12 = -8388609;
                    i13 &= i12;
                    str = str13;
                case 24:
                    num9 = this.nullableIntAdapter.fromJson(reader);
                    i12 = -16777217;
                    i13 &= i12;
                    str = str13;
                case TombstoneProtos$Tombstone.GUEST_THREADS_FIELD_NUMBER /* 25 */:
                    f12 = this.nullableFloatAdapter.fromJson(reader);
                    i12 = -33554433;
                    i13 &= i12;
                    str = str13;
                case TombstoneProtos$Tombstone.STACK_HISTORY_BUFFER_FIELD_NUMBER /* 26 */:
                    bool5 = this.nullableBooleanAdapter.fromJson(reader);
                    i12 = -67108865;
                    i13 &= i12;
                    str = str13;
                case DescriptorProtos$FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER /* 27 */:
                    bVar = this.nullableTextFieldPresetEnumAdapter.fromJson(reader);
                    str = str13;
                case 28:
                    str4 = this.nullableStringAdapter.fromJson(reader);
                    str = str13;
                case 29:
                    str5 = this.nullableStringAdapter.fromJson(reader);
                    str = str13;
                case AppUpdateInfo.Factory.DAYS_BETWEEN_30 /* 30 */:
                    str6 = this.nullableStringAdapter.fromJson(reader);
                    str = str13;
                case DescriptorProtos$FileOptions.CC_ENABLE_ARENAS_FIELD_NUMBER /* 31 */:
                    str7 = this.nullableStringAdapter.fromJson(reader);
                    str = str13;
                case 32:
                    str8 = this.nullableStringAdapter.fromJson(reader);
                    str = str13;
                case 33:
                    str9 = this.nullableStringAdapter.fromJson(reader);
                    str = str13;
                case 34:
                    bool6 = this.nullableBooleanAdapter.fromJson(reader);
                    str = str13;
                case DescriptorProtos$MethodOptions.FEATURES_FIELD_NUMBER /* 35 */:
                    bool7 = this.nullableBooleanAdapter.fromJson(reader);
                    str = str13;
                case DescriptorProtos$FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER /* 36 */:
                    bool8 = this.nullableBooleanAdapter.fromJson(reader);
                    str = str13;
                case DescriptorProtos$FileOptions.CSHARP_NAMESPACE_FIELD_NUMBER /* 37 */:
                    num10 = this.nullableIntAdapter.fromJson(reader);
                    i14 &= -33;
                    str = str13;
                case 38:
                    addonSide = this.nullableAddonSideAtEnumNullFallbackAdapter.fromJson(reader);
                    str = str13;
                case DescriptorProtos$FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                    state = this.nullableStateAtEnumNullFallbackAdapter.fromJson(reader);
                    str = str13;
                case 40:
                    status = this.nullableStatusAtEnumNullFallbackAdapter.fromJson(reader);
                    str = str13;
                case 41:
                    keyboardType = this.nullableKeyboardTypeAtEnumNullFallbackAdapter.fromJson(reader);
                    str = str13;
                case 42:
                    keyboardAction = this.nullableKeyboardActionAtEnumNullFallbackAdapter.fromJson(reader);
                    str = str13;
                case 43:
                    str10 = this.nullableStringAdapter.fromJson(reader);
                    i14 &= -2049;
                    str = str13;
                case DescriptorProtos$FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER /* 44 */:
                    str11 = this.nullableStringAdapter.fromJson(reader);
                    i14 &= -4097;
                    str = str13;
                case DescriptorProtos$FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
                    str12 = this.nullableStringAdapter.fromJson(reader);
                    i14 &= -8193;
                    str = str13;
                case 46:
                    map = this.nullableMapOfStringStringAdapter.fromJson(reader);
                    i14 &= -16385;
                    str = str13;
                case 47:
                    map2 = this.nullableMapOfStringComposerTrackingInfoAdapter.fromJson(reader);
                    i14 &= -32769;
                    str = str13;
                default:
                    str = str13;
            }
        }
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, TextFieldV20DTO value_) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("type");
        this.cbottomElement2Adapter.mo44toJson(writer, (x) value_.getType());
        writer.w("id");
        this.stringAdapter.mo44toJson(writer, (x) value_.getId());
        writer.w("version");
        this.nullableIntAdapter.mo44toJson(writer, (x) value_.getVersion());
        writer.w("clickable");
        this.nullableBooleanAdapter.mo44toJson(writer, (x) value_.getClickable());
        writer.w("touchDown");
        this.nullableBooleanAdapter.mo44toJson(writer, (x) value_.getTouchDown());
        writer.w("skeletonable");
        this.nullableBooleanAdapter.mo44toJson(writer, (x) value_.getSkeletonable());
        writer.w("disableHighlightAnimation");
        this.nullableBooleanAdapter.mo44toJson(writer, (x) value_.getDisableHighlightAnimation());
        writer.w("width");
        this.nullableIntAdapter.mo44toJson(writer, (x) value_.getWidth());
        writer.w("height");
        this.nullableIntAdapter.mo44toJson(writer, (x) value_.getHeight());
        writer.w("ratioW");
        this.nullableIntAdapter.mo44toJson(writer, (x) value_.getRatioW());
        writer.w("ratioH");
        this.nullableIntAdapter.mo44toJson(writer, (x) value_.getRatioH());
        writer.w("percentW");
        this.nullableFloatAdapter.mo44toJson(writer, (x) value_.getPercentW());
        writer.w("margins");
        this.nullableListOfIntAdapter.mo44toJson(writer, (x) value_.getMargins());
        writer.w("layoutGravity");
        this.nullableListOfCbottomLayoutGravityAdapter.mo44toJson(writer, (x) value_.getLayoutGravity());
        writer.w("layoutWeight");
        this.nullableFloatAdapter.mo44toJson(writer, (x) value_.getLayoutWeight());
        writer.w("paddings");
        this.nullableListOfIntAdapter.mo44toJson(writer, (x) value_.getPaddings());
        writer.w("backgroundRadius");
        this.nullableListOfIntAdapter.mo44toJson(writer, (x) value_.getBackgroundRadius());
        writer.w("backgroundColor");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getBackgroundColor());
        writer.w("backgroundGradient");
        this.nullableListOfStringAdapter.mo44toJson(writer, (x) value_.getBackgroundGradient());
        writer.w("backgroundGradientOrientation");
        this.nullableCbottomGradientOrientationAdapter.mo44toJson(writer, (x) value_.getBackgroundGradientOrientation());
        writer.w("strokeColor");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getStrokeColor());
        writer.w("strokeWidth");
        this.nullableIntAdapter.mo44toJson(writer, (x) value_.getStrokeWidth());
        writer.w("dashWidth");
        this.nullableIntAdapter.mo44toJson(writer, (x) value_.getDashWidth());
        writer.w("dashGap");
        this.nullableIntAdapter.mo44toJson(writer, (x) value_.getDashGap());
        writer.w("elevation");
        this.nullableIntAdapter.mo44toJson(writer, (x) value_.getElevation());
        writer.w("opacity");
        this.nullableFloatAdapter.mo44toJson(writer, (x) value_.getAlpha());
        writer.w("isHidden");
        this.nullableBooleanAdapter.mo44toJson(writer, (x) value_.isHidden());
        writer.w("textFieldPreset");
        this.nullableTextFieldPresetEnumAdapter.mo44toJson(writer, (x) value_.getTextFieldPreset());
        writer.w("inputTitle");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getInputTitle());
        writer.w("inputValue");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getInputValue());
        writer.w("labelText");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getLabelText());
        writer.w("labelTextColor");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getLabelTextColor());
        writer.w("labelIcon");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getLabelIcon());
        writer.w("labelIconColor");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getLabelIconColor());
        writer.w("isInputCopyEnabled");
        this.nullableBooleanAdapter.mo44toJson(writer, (x) value_.isInputCopyEnabled());
        writer.w("isInputResetEnabled");
        this.nullableBooleanAdapter.mo44toJson(writer, (x) value_.isInputResetEnabled());
        writer.w("isInputProtected");
        this.nullableBooleanAdapter.mo44toJson(writer, (x) value_.isInputProtected());
        writer.w("versionStamp");
        this.nullableIntAdapter.mo44toJson(writer, (x) value_.getVersionStamp());
        writer.w("labelIconPosition");
        this.nullableAddonSideAtEnumNullFallbackAdapter.mo44toJson(writer, (x) value_.getLabelIconPosition());
        writer.w("inputState");
        this.nullableStateAtEnumNullFallbackAdapter.mo44toJson(writer, (x) value_.getInputState());
        writer.w("inputStatus");
        this.nullableStatusAtEnumNullFallbackAdapter.mo44toJson(writer, (x) value_.getInputStatus());
        writer.w("inputKeyboardType");
        this.nullableKeyboardTypeAtEnumNullFallbackAdapter.mo44toJson(writer, (x) value_.getInputKeyboardType());
        writer.w("inputKeyboardAction");
        this.nullableKeyboardActionAtEnumNullFallbackAdapter.mo44toJson(writer, (x) value_.getInputKeyboardAction());
        writer.w("composerActionBehavior");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getComposerActionBehavior());
        writer.w("composerActionLink");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getComposerActionLink());
        writer.w("composerActionId");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getComposerActionId());
        writer.w("composerActionParams");
        this.nullableMapOfStringStringAdapter.mo44toJson(writer, (x) value_.getComposerActionParams());
        writer.w("composerTrackingInfo");
        this.nullableMapOfStringComposerTrackingInfoAdapter.mo44toJson(writer, (x) value_.getComposerTrackingInfo());
        writer.p();
    }
}
