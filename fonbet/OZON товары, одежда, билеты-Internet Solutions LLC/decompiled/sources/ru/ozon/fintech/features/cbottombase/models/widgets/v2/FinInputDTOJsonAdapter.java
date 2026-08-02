package ru.ozon.fintech.features.cbottombase.models.widgets.v2;

import Ak.b;
import Y9.c;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
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
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.marketing.widgets.hammersV3.newHammers.data.HammersV3BodyDTO;
import ru.ozon.fintech.exchanger.datapass.ComposerTrackingInfo;
import ru.ozon.fintech.features.cbottombase.models.widgets.v2.interfaces.CbottomElement2;
import ru.ozon.fintech.ui.input.InputView;
import ru.rustore.sdk.appupdate.model.AppUpdateInfo;
import t40.EnumC9751a;
import t40.EnumC9752b;

@Metadata(d1 = {"\u0000¢\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0019R\u001c\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0019R\u001c\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001d0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0019R\u001c\u0010 \u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u0019R\"\u0010\"\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010!0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u0019R\"\u0010$\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020#\u0018\u00010!0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010\u0019R\u001c\u0010%\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010\u0019R\"\u0010&\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010!0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010\u0019R\u001c\u0010(\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010'0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010\u0019R\u001a\u0010*\u001a\b\u0012\u0004\u0012\u00020)0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010\u0019R\u001a\u0010,\u001a\b\u0012\u0004\u0012\u00020+0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010\u0019R\u001a\u0010.\u001a\b\u0012\u0004\u0012\u00020-0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010\u0019R\u001a\u00100\u001a\b\u0012\u0004\u0012\u00020/0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u0010\u0019R\u001a\u00102\u001a\b\u0012\u0004\u0012\u0002010\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u0010\u0019R\u001a\u00104\u001a\b\u0012\u0004\u0012\u0002030\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u0010\u0019R(\u00106\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0018\u0001050\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u0010\u0019R(\u00108\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u000207\u0018\u0001050\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u0010\u0019R\u001e\u0010:\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u0001098\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u0010;¨\u0006<"}, d2 = {"Lru/ozon/fintech/features/cbottombase/models/widgets/v2/FinInputDTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/fintech/features/cbottombase/models/widgets/v2/FinInputDTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/fintech/features/cbottombase/models/widgets/v2/FinInputDTO;", "Lcom/squareup/moshi/x;", "writer", "value_", "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/fintech/features/cbottombase/models/widgets/v2/FinInputDTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "Lru/ozon/fintech/features/cbottombase/models/widgets/v2/interfaces/CbottomElement2;", "cbottomElement2Adapter", "Lcom/squareup/moshi/JsonAdapter;", "stringAdapter", "", "nullableIntAdapter", "", "nullableBooleanAdapter", "", "nullableFloatAdapter", "", "nullableListOfIntAdapter", "Lt40/b;", "nullableListOfCbottomLayoutGravityAdapter", "nullableStringAdapter", "nullableListOfStringAdapter", "Lt40/a;", "nullableCbottomGradientOrientationAdapter", "Lru/ozon/fintech/ui/input/InputView$Size;", "sizeAdapter", "Lru/ozon/fintech/ui/input/InputView$Theme;", "themeAdapter", "Lru/ozon/fintech/ui/input/InputView$Status;", "statusAdapter", "Lru/ozon/fintech/ui/input/InputView$State;", "stateAdapter", "Lru/ozon/fintech/ui/input/InputView$LabelPosition;", "labelPositionAdapter", "Lru/ozon/fintech/ui/input/InputView$InputMode;", "inputModeAdapter", "", "nullableMapOfStringStringAdapter", "Lru/ozon/fintech/exchanger/datapass/ComposerTrackingInfo;", "nullableMapOfStringComposerTrackingInfoAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "cbottom-base_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class FinInputDTOJsonAdapter extends JsonAdapter<FinInputDTO> {

    @NotNull
    private final JsonAdapter<CbottomElement2> cbottomElement2Adapter;
    private volatile Constructor<FinInputDTO> constructorRef;

    @NotNull
    private final JsonAdapter<InputView.InputMode> inputModeAdapter;

    @NotNull
    private final JsonAdapter<InputView.LabelPosition> labelPositionAdapter;

    @NotNull
    private final JsonAdapter<Boolean> nullableBooleanAdapter;

    @NotNull
    private final JsonAdapter<EnumC9751a> nullableCbottomGradientOrientationAdapter;

    @NotNull
    private final JsonAdapter<Float> nullableFloatAdapter;

    @NotNull
    private final JsonAdapter<Integer> nullableIntAdapter;

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
    private final JsonAdapter<String> nullableStringAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<InputView.Size> sizeAdapter;

    @NotNull
    private final JsonAdapter<InputView.State> stateAdapter;

    @NotNull
    private final JsonAdapter<InputView.Status> statusAdapter;

    @NotNull
    private final JsonAdapter<String> stringAdapter;

    @NotNull
    private final JsonAdapter<InputView.Theme> themeAdapter;

    public FinInputDTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        n.a a11 = n.a.C0918a.a("type", "id", "version", "clickable", "touchDown", "skeletonable", "disableHighlightAnimation", "width", "height", "ratioW", "ratioH", "percentW", "margins", "layoutGravity", "layoutWeight", "paddings", "backgroundRadius", "backgroundColor", "backgroundGradient", "backgroundGradientOrientation", "strokeColor", "strokeWidth", "dashWidth", "dashGap", "elevation", "opacity", "isHidden", AppMeasurementSdk.ConditionalUserProperty.VALUE, "size", "theme", HammersV3BodyDTO.PLACEHOLDER, "caption", "captionColor", "status", "state", "firstIcon", "secondIcon", "maxLength", "label", "labelPosition", "inputMask", "inputMode", "versionStamp", "composerActionBehavior", "composerActionLink", "composerActionId", "composerActionParams", "composerTrackingInfo");
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
        JsonAdapter<InputView.Size> f21 = moshi.f(InputView.Size.class, m11, "size");
        Intrinsics.checkNotNullExpressionValue(f21, "adapter(...)");
        this.sizeAdapter = f21;
        JsonAdapter<InputView.Theme> f22 = moshi.f(InputView.Theme.class, m11, "theme");
        Intrinsics.checkNotNullExpressionValue(f22, "adapter(...)");
        this.themeAdapter = f22;
        JsonAdapter<InputView.Status> f23 = moshi.f(InputView.Status.class, m11, "status");
        Intrinsics.checkNotNullExpressionValue(f23, "adapter(...)");
        this.statusAdapter = f23;
        JsonAdapter<InputView.State> f24 = moshi.f(InputView.State.class, m11, "state");
        Intrinsics.checkNotNullExpressionValue(f24, "adapter(...)");
        this.stateAdapter = f24;
        JsonAdapter<InputView.LabelPosition> f25 = moshi.f(InputView.LabelPosition.class, m11, "labelPosition");
        Intrinsics.checkNotNullExpressionValue(f25, "adapter(...)");
        this.labelPositionAdapter = f25;
        JsonAdapter<InputView.InputMode> f26 = moshi.f(InputView.InputMode.class, m11, "inputMode");
        Intrinsics.checkNotNullExpressionValue(f26, "adapter(...)");
        this.inputModeAdapter = f26;
        JsonAdapter<Map<String, String>> f27 = moshi.f(D.e(Map.class, String.class, String.class), m11, "composerActionParams");
        Intrinsics.checkNotNullExpressionValue(f27, "adapter(...)");
        this.nullableMapOfStringStringAdapter = f27;
        JsonAdapter<Map<String, ComposerTrackingInfo>> f28 = moshi.f(D.e(Map.class, String.class, ComposerTrackingInfo.class), m11, "composerTrackingInfo");
        Intrinsics.checkNotNullExpressionValue(f28, "adapter(...)");
        this.nullableMapOfStringComposerTrackingInfoAdapter = f28;
    }

    @NotNull
    public String toString() {
        return b.c(33, "GeneratedJsonAdapter(FinInputDTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public FinInputDTO fromJson(@NotNull n reader) {
        int i11;
        int i12;
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        InputView.Size size = null;
        CbottomElement2 cbottomElement2 = null;
        InputView.State state = null;
        InputView.LabelPosition labelPosition = null;
        InputView.InputMode inputMode = null;
        Boolean bool = null;
        Integer num = null;
        Integer num2 = null;
        InputView.Status status = null;
        Integer num3 = null;
        Integer num4 = null;
        Float f7 = null;
        List<Integer> list = null;
        List<EnumC9752b> list2 = null;
        Float f11 = null;
        List<Integer> list3 = null;
        List<Integer> list4 = null;
        String str = null;
        List<String> list5 = null;
        EnumC9751a enumC9751a = null;
        String str2 = null;
        Integer num5 = null;
        Integer num6 = null;
        Integer num7 = null;
        Integer num8 = null;
        Float f12 = null;
        Boolean bool2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        Integer num9 = null;
        Boolean bool3 = null;
        String str8 = null;
        String str9 = null;
        Integer num10 = null;
        String str10 = null;
        Boolean bool4 = null;
        String str11 = null;
        Boolean bool5 = null;
        Integer num11 = null;
        String str12 = null;
        String str13 = null;
        String str14 = null;
        Map<String, String> map = null;
        Map<String, ComposerTrackingInfo> map2 = null;
        int i13 = -1;
        int i14 = -1;
        InputView.Theme theme = null;
        while (true) {
            Boolean bool6 = bool;
            if (!reader.hasNext()) {
                Integer num12 = num;
                reader.endObject();
                if (i13 == 2 && i14 == -65536) {
                    Intrinsics.g(cbottomElement2, "null cannot be cast to non-null type ru.ozon.fintech.features.cbottombase.models.widgets.v2.interfaces.CbottomElement2");
                    if (str4 == null) {
                        throw c.j("id", "id", reader);
                    }
                    Intrinsics.g(size, "null cannot be cast to non-null type ru.ozon.fintech.ui.input.InputView.Size");
                    Intrinsics.g(theme, "null cannot be cast to non-null type ru.ozon.fintech.ui.input.InputView.Theme");
                    Intrinsics.g(status, "null cannot be cast to non-null type ru.ozon.fintech.ui.input.InputView.Status");
                    Intrinsics.g(state, "null cannot be cast to non-null type ru.ozon.fintech.ui.input.InputView.State");
                    Intrinsics.g(labelPosition, "null cannot be cast to non-null type ru.ozon.fintech.ui.input.InputView.LabelPosition");
                    Intrinsics.g(inputMode, "null cannot be cast to non-null type ru.ozon.fintech.ui.input.InputView.InputMode");
                    Boolean bool7 = bool4;
                    String str15 = str10;
                    Integer num13 = num10;
                    String str16 = str9;
                    String str17 = str8;
                    Map<String, ComposerTrackingInfo> map3 = map2;
                    Map<String, String> map4 = map;
                    String str18 = str14;
                    String str19 = str13;
                    String str20 = str12;
                    Integer num14 = num11;
                    InputView.InputMode inputMode2 = inputMode;
                    Integer num15 = num9;
                    String str21 = str7;
                    return new FinInputDTO(cbottomElement2, str4, num15, bool3, bool7, bool5, bool6, num12, num2, num3, num4, f7, list, list2, f11, list3, list4, str, list5, enumC9751a, str2, num5, num6, num7, num8, f12, bool2, str3, size, theme, str5, str6, str21, status, state, str17, str16, num13, str15, labelPosition, str11, inputMode2, num14, str20, str19, str18, map4, map3);
                }
                String str22 = str4;
                InputView.Size size2 = size;
                int i15 = i14;
                Boolean bool8 = bool5;
                String str23 = str11;
                InputView.LabelPosition labelPosition2 = labelPosition;
                Integer num16 = num9;
                String str24 = str7;
                String str25 = str6;
                String str26 = str5;
                InputView.Theme theme2 = theme;
                int i16 = i13;
                Boolean bool9 = bool4;
                String str27 = str10;
                Integer num17 = num10;
                String str28 = str9;
                String str29 = str8;
                InputView.State state2 = state;
                Map<String, ComposerTrackingInfo> map5 = map2;
                Map<String, String> map6 = map;
                String str30 = str14;
                String str31 = str13;
                String str32 = str12;
                Integer num18 = num11;
                InputView.InputMode inputMode3 = inputMode;
                Boolean bool10 = bool3;
                InputView.Status status2 = status;
                Constructor<FinInputDTO> constructor = this.constructorRef;
                if (constructor == null) {
                    Class<?> cls = c.f34864d;
                    Class cls2 = Integer.TYPE;
                    i11 = i15;
                    constructor = FinInputDTO.class.getDeclaredConstructor(CbottomElement2.class, String.class, Integer.class, Boolean.class, Boolean.class, Boolean.class, Boolean.class, Integer.class, Integer.class, Integer.class, Integer.class, Float.class, List.class, List.class, Float.class, List.class, List.class, String.class, List.class, EnumC9751a.class, String.class, Integer.class, Integer.class, Integer.class, Integer.class, Float.class, Boolean.class, String.class, InputView.Size.class, InputView.Theme.class, String.class, String.class, String.class, InputView.Status.class, InputView.State.class, String.class, String.class, Integer.class, String.class, InputView.LabelPosition.class, String.class, InputView.InputMode.class, Integer.class, String.class, String.class, String.class, Map.class, Map.class, cls2, cls2, cls);
                    this.constructorRef = constructor;
                    Intrinsics.checkNotNullExpressionValue(constructor, "also(...)");
                } else {
                    i11 = i15;
                }
                Constructor<FinInputDTO> constructor2 = constructor;
                if (str22 == null) {
                    throw c.j("id", "id", reader);
                }
                FinInputDTO newInstance = constructor2.newInstance(cbottomElement2, str22, num16, bool10, bool9, bool8, bool6, num12, num2, num3, num4, f7, list, list2, f11, list3, list4, str, list5, enumC9751a, str2, num5, num6, num7, num8, f12, bool2, str3, size2, theme2, str26, str25, str24, status2, state2, str29, str28, num17, str27, labelPosition2, str23, inputMode3, num18, str32, str31, str30, map6, map5, Integer.valueOf(i16), Integer.valueOf(i11), null);
                Intrinsics.checkNotNullExpressionValue(newInstance, "newInstance(...)");
                return newInstance;
            }
            Integer num19 = num;
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    num = num19;
                    bool = bool6;
                case 0:
                    cbottomElement2 = this.cbottomElement2Adapter.fromJson(reader);
                    if (cbottomElement2 == null) {
                        throw c.q("type", "type", reader);
                    }
                    i13 &= -2;
                    num = num19;
                    bool = bool6;
                case 1:
                    str4 = this.stringAdapter.fromJson(reader);
                    if (str4 == null) {
                        throw c.q("id", "id", reader);
                    }
                    num = num19;
                    bool = bool6;
                case 2:
                    num9 = this.nullableIntAdapter.fromJson(reader);
                    i13 &= -5;
                    num = num19;
                    bool = bool6;
                case 3:
                    bool3 = this.nullableBooleanAdapter.fromJson(reader);
                    i13 &= -9;
                    num = num19;
                    bool = bool6;
                case 4:
                    bool4 = this.nullableBooleanAdapter.fromJson(reader);
                    i13 &= -17;
                    num = num19;
                    bool = bool6;
                case 5:
                    bool5 = this.nullableBooleanAdapter.fromJson(reader);
                    i13 &= -33;
                    num = num19;
                    bool = bool6;
                case 6:
                    bool = this.nullableBooleanAdapter.fromJson(reader);
                    i13 &= -65;
                    num = num19;
                case 7:
                    num = this.nullableIntAdapter.fromJson(reader);
                    i13 &= -129;
                    bool = bool6;
                case 8:
                    num2 = this.nullableIntAdapter.fromJson(reader);
                    i13 &= -257;
                    num = num19;
                    bool = bool6;
                case 9:
                    num3 = this.nullableIntAdapter.fromJson(reader);
                    i13 &= -513;
                    num = num19;
                    bool = bool6;
                case 10:
                    num4 = this.nullableIntAdapter.fromJson(reader);
                    i13 &= -1025;
                    num = num19;
                    bool = bool6;
                case 11:
                    f7 = this.nullableFloatAdapter.fromJson(reader);
                    i13 &= -2049;
                    num = num19;
                    bool = bool6;
                case 12:
                    list = this.nullableListOfIntAdapter.fromJson(reader);
                    i13 &= -4097;
                    num = num19;
                    bool = bool6;
                case 13:
                    list2 = this.nullableListOfCbottomLayoutGravityAdapter.fromJson(reader);
                    i13 &= -8193;
                    num = num19;
                    bool = bool6;
                case 14:
                    f11 = this.nullableFloatAdapter.fromJson(reader);
                    i13 &= -16385;
                    num = num19;
                    bool = bool6;
                case 15:
                    list3 = this.nullableListOfIntAdapter.fromJson(reader);
                    i13 &= -32769;
                    num = num19;
                    bool = bool6;
                case 16:
                    list4 = this.nullableListOfIntAdapter.fromJson(reader);
                    i12 = -65537;
                    i13 &= i12;
                    num = num19;
                    bool = bool6;
                case 17:
                    str = this.nullableStringAdapter.fromJson(reader);
                    i12 = -131073;
                    i13 &= i12;
                    num = num19;
                    bool = bool6;
                case 18:
                    list5 = this.nullableListOfStringAdapter.fromJson(reader);
                    i12 = -262145;
                    i13 &= i12;
                    num = num19;
                    bool = bool6;
                case 19:
                    enumC9751a = this.nullableCbottomGradientOrientationAdapter.fromJson(reader);
                    i12 = -524289;
                    i13 &= i12;
                    num = num19;
                    bool = bool6;
                case 20:
                    str2 = this.nullableStringAdapter.fromJson(reader);
                    i12 = -1048577;
                    i13 &= i12;
                    num = num19;
                    bool = bool6;
                case 21:
                    num5 = this.nullableIntAdapter.fromJson(reader);
                    i12 = -2097153;
                    i13 &= i12;
                    num = num19;
                    bool = bool6;
                case 22:
                    num6 = this.nullableIntAdapter.fromJson(reader);
                    i12 = -4194305;
                    i13 &= i12;
                    num = num19;
                    bool = bool6;
                case 23:
                    num7 = this.nullableIntAdapter.fromJson(reader);
                    i12 = -8388609;
                    i13 &= i12;
                    num = num19;
                    bool = bool6;
                case 24:
                    num8 = this.nullableIntAdapter.fromJson(reader);
                    i12 = -16777217;
                    i13 &= i12;
                    num = num19;
                    bool = bool6;
                case TombstoneProtos$Tombstone.GUEST_THREADS_FIELD_NUMBER /* 25 */:
                    f12 = this.nullableFloatAdapter.fromJson(reader);
                    i12 = -33554433;
                    i13 &= i12;
                    num = num19;
                    bool = bool6;
                case TombstoneProtos$Tombstone.STACK_HISTORY_BUFFER_FIELD_NUMBER /* 26 */:
                    bool2 = this.nullableBooleanAdapter.fromJson(reader);
                    i12 = -67108865;
                    i13 &= i12;
                    num = num19;
                    bool = bool6;
                case DescriptorProtos$FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER /* 27 */:
                    str3 = this.nullableStringAdapter.fromJson(reader);
                    i12 = -134217729;
                    i13 &= i12;
                    num = num19;
                    bool = bool6;
                case 28:
                    size = this.sizeAdapter.fromJson(reader);
                    if (size == null) {
                        throw c.q("size", "size", reader);
                    }
                    i12 = -268435457;
                    i13 &= i12;
                    num = num19;
                    bool = bool6;
                case 29:
                    theme = this.themeAdapter.fromJson(reader);
                    if (theme == null) {
                        throw c.q("theme", "theme", reader);
                    }
                    i12 = -536870913;
                    i13 &= i12;
                    num = num19;
                    bool = bool6;
                case AppUpdateInfo.Factory.DAYS_BETWEEN_30 /* 30 */:
                    str5 = this.nullableStringAdapter.fromJson(reader);
                    i12 = -1073741825;
                    i13 &= i12;
                    num = num19;
                    bool = bool6;
                case DescriptorProtos$FileOptions.CC_ENABLE_ARENAS_FIELD_NUMBER /* 31 */:
                    str6 = this.nullableStringAdapter.fromJson(reader);
                    i12 = Integer.MAX_VALUE;
                    i13 &= i12;
                    num = num19;
                    bool = bool6;
                case 32:
                    str7 = this.nullableStringAdapter.fromJson(reader);
                    i14 &= -2;
                    num = num19;
                    bool = bool6;
                case 33:
                    status = this.statusAdapter.fromJson(reader);
                    if (status == null) {
                        throw c.q("status", "status", reader);
                    }
                    i14 &= -3;
                    num = num19;
                    bool = bool6;
                case 34:
                    state = this.stateAdapter.fromJson(reader);
                    if (state == null) {
                        throw c.q("state", "state", reader);
                    }
                    i14 &= -5;
                    num = num19;
                    bool = bool6;
                case DescriptorProtos$MethodOptions.FEATURES_FIELD_NUMBER /* 35 */:
                    str8 = this.nullableStringAdapter.fromJson(reader);
                    i14 &= -9;
                    num = num19;
                    bool = bool6;
                case DescriptorProtos$FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER /* 36 */:
                    str9 = this.nullableStringAdapter.fromJson(reader);
                    i14 &= -17;
                    num = num19;
                    bool = bool6;
                case DescriptorProtos$FileOptions.CSHARP_NAMESPACE_FIELD_NUMBER /* 37 */:
                    num10 = this.nullableIntAdapter.fromJson(reader);
                    i14 &= -33;
                    num = num19;
                    bool = bool6;
                case 38:
                    str10 = this.nullableStringAdapter.fromJson(reader);
                    i14 &= -65;
                    num = num19;
                    bool = bool6;
                case DescriptorProtos$FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                    labelPosition = this.labelPositionAdapter.fromJson(reader);
                    if (labelPosition == null) {
                        throw c.q("labelPosition", "labelPosition", reader);
                    }
                    i14 &= -129;
                    num = num19;
                    bool = bool6;
                case 40:
                    str11 = this.nullableStringAdapter.fromJson(reader);
                    i14 &= -257;
                    num = num19;
                    bool = bool6;
                case 41:
                    inputMode = this.inputModeAdapter.fromJson(reader);
                    if (inputMode == null) {
                        throw c.q("inputMode", "inputMode", reader);
                    }
                    i14 &= -513;
                    num = num19;
                    bool = bool6;
                case 42:
                    num11 = this.nullableIntAdapter.fromJson(reader);
                    i14 &= -1025;
                    num = num19;
                    bool = bool6;
                case 43:
                    str12 = this.nullableStringAdapter.fromJson(reader);
                    i14 &= -2049;
                    num = num19;
                    bool = bool6;
                case DescriptorProtos$FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER /* 44 */:
                    str13 = this.nullableStringAdapter.fromJson(reader);
                    i14 &= -4097;
                    num = num19;
                    bool = bool6;
                case DescriptorProtos$FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
                    str14 = this.nullableStringAdapter.fromJson(reader);
                    i14 &= -8193;
                    num = num19;
                    bool = bool6;
                case 46:
                    map = this.nullableMapOfStringStringAdapter.fromJson(reader);
                    i14 &= -16385;
                    num = num19;
                    bool = bool6;
                case 47:
                    map2 = this.nullableMapOfStringComposerTrackingInfoAdapter.fromJson(reader);
                    i14 &= -32769;
                    num = num19;
                    bool = bool6;
                default:
                    num = num19;
                    bool = bool6;
            }
        }
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, FinInputDTO value_) {
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
        writer.w(AppMeasurementSdk.ConditionalUserProperty.VALUE);
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getValue());
        writer.w("size");
        this.sizeAdapter.mo44toJson(writer, (x) value_.getSize());
        writer.w("theme");
        this.themeAdapter.mo44toJson(writer, (x) value_.getTheme());
        writer.w(HammersV3BodyDTO.PLACEHOLDER);
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getPlaceholder());
        writer.w("caption");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getCaption());
        writer.w("captionColor");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getCaptionColor());
        writer.w("status");
        this.statusAdapter.mo44toJson(writer, (x) value_.getStatus());
        writer.w("state");
        this.stateAdapter.mo44toJson(writer, (x) value_.getState());
        writer.w("firstIcon");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getFirstIcon());
        writer.w("secondIcon");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getSecondIcon());
        writer.w("maxLength");
        this.nullableIntAdapter.mo44toJson(writer, (x) value_.getMaxLength());
        writer.w("label");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getLabel());
        writer.w("labelPosition");
        this.labelPositionAdapter.mo44toJson(writer, (x) value_.getLabelPosition());
        writer.w("inputMask");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getInputMask());
        writer.w("inputMode");
        this.inputModeAdapter.mo44toJson(writer, (x) value_.getInputMode());
        writer.w("versionStamp");
        this.nullableIntAdapter.mo44toJson(writer, (x) value_.getVersionStamp());
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
