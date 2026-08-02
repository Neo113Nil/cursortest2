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
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.fintech.exchanger.datapass.ComposerTrackingInfo;
import ru.ozon.fintech.features.cbottombase.models.widgets.v2.interfaces.CbottomElement2;
import ru.rustore.sdk.appupdate.model.AppUpdateInfo;
import t40.EnumC9751a;
import t40.EnumC9752b;
import t40.EnumC9754d;

@Metadata(d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0019R\u001c\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0019R\u001c\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001d0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0019R\u001c\u0010 \u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u0019R\"\u0010\"\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010!0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u0019R\"\u0010$\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020#\u0018\u00010!0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010\u0019R\u001c\u0010%\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010\u0019R\"\u0010&\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010!0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010\u0019R\u001c\u0010(\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010'0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010\u0019R\u001c\u0010*\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010)0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010\u0019R(\u0010,\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0018\u00010+0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010\u0019R(\u0010.\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020-\u0018\u00010+0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010\u0019R\u001e\u00100\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u00101¨\u00062"}, d2 = {"Lru/ozon/fintech/features/cbottombase/models/widgets/v2/FinImageV20DTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/fintech/features/cbottombase/models/widgets/v2/FinImageV20DTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/fintech/features/cbottombase/models/widgets/v2/FinImageV20DTO;", "Lcom/squareup/moshi/x;", "writer", "value_", "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/fintech/features/cbottombase/models/widgets/v2/FinImageV20DTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "Lru/ozon/fintech/features/cbottombase/models/widgets/v2/interfaces/CbottomElement2;", "cbottomElement2Adapter", "Lcom/squareup/moshi/JsonAdapter;", "stringAdapter", "", "nullableIntAdapter", "", "nullableBooleanAdapter", "", "nullableFloatAdapter", "", "nullableListOfIntAdapter", "Lt40/b;", "nullableListOfCbottomLayoutGravityAdapter", "nullableStringAdapter", "nullableListOfStringAdapter", "Lt40/a;", "nullableCbottomGradientOrientationAdapter", "Lt40/d;", "nullableCbottomScaleTypeAdapter", "", "nullableMapOfStringStringAdapter", "Lru/ozon/fintech/exchanger/datapass/ComposerTrackingInfo;", "nullableMapOfStringComposerTrackingInfoAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "cbottom-base_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class FinImageV20DTOJsonAdapter extends JsonAdapter<FinImageV20DTO> {

    @NotNull
    private final JsonAdapter<CbottomElement2> cbottomElement2Adapter;
    private volatile Constructor<FinImageV20DTO> constructorRef;

    @NotNull
    private final JsonAdapter<Boolean> nullableBooleanAdapter;

    @NotNull
    private final JsonAdapter<EnumC9751a> nullableCbottomGradientOrientationAdapter;

    @NotNull
    private final JsonAdapter<EnumC9754d> nullableCbottomScaleTypeAdapter;

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
    private final JsonAdapter<String> stringAdapter;

    public FinImageV20DTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        n.a a11 = n.a.C0918a.a("type", "id", "version", "clickable", "touchDown", "skeletonable", "disableHighlightAnimation", "width", "height", "ratioW", "ratioH", "percentW", "margins", "layoutGravity", "layoutWeight", "paddings", "backgroundRadius", "backgroundColor", "backgroundGradient", "backgroundGradientOrientation", "strokeColor", "strokeWidth", "dashWidth", "dashGap", "elevation", "opacity", "isHidden", "iconSrc", "icon", "iconBase64", "iconColor", "scaleType", "composerActionBehavior", "composerActionLink", "composerActionId", "composerActionParams", "composerTrackingInfo");
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
        JsonAdapter<EnumC9754d> f21 = moshi.f(EnumC9754d.class, m11, "scaleType");
        Intrinsics.checkNotNullExpressionValue(f21, "adapter(...)");
        this.nullableCbottomScaleTypeAdapter = f21;
        JsonAdapter<Map<String, String>> f22 = moshi.f(D.e(Map.class, String.class, String.class), m11, "composerActionParams");
        Intrinsics.checkNotNullExpressionValue(f22, "adapter(...)");
        this.nullableMapOfStringStringAdapter = f22;
        JsonAdapter<Map<String, ComposerTrackingInfo>> f23 = moshi.f(D.e(Map.class, String.class, ComposerTrackingInfo.class), m11, "composerTrackingInfo");
        Intrinsics.checkNotNullExpressionValue(f23, "adapter(...)");
        this.nullableMapOfStringComposerTrackingInfoAdapter = f23;
    }

    @NotNull
    public String toString() {
        return b.c(36, "GeneratedJsonAdapter(FinImageV20DTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public FinImageV20DTO fromJson(@NotNull n reader) {
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
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        EnumC9754d enumC9754d = null;
        String str8 = null;
        String str9 = null;
        String str10 = null;
        Map<String, String> map = null;
        Map<String, ComposerTrackingInfo> map2 = null;
        int i14 = -1;
        while (true) {
            String str11 = str;
            if (!reader.hasNext()) {
                reader.endObject();
                if (i13 == 2 && i14 == -32) {
                    Intrinsics.g(cbottomElement2, "null cannot be cast to non-null type ru.ozon.fintech.features.cbottombase.models.widgets.v2.interfaces.CbottomElement2");
                    if (str11 == null) {
                        throw c.j("id", "id", reader);
                    }
                    Integer num10 = num3;
                    Integer num11 = num2;
                    Boolean bool6 = bool4;
                    Boolean bool7 = bool3;
                    return new FinImageV20DTO(cbottomElement2, str11, num, bool, bool2, bool7, bool6, num11, num10, num4, num5, f7, list, list2, f11, list3, list4, str2, list5, enumC9751a, str3, num6, num7, num8, num9, f12, bool5, str4, str5, str6, str7, enumC9754d, str8, str9, str10, map, map2);
                }
                int i15 = i14;
                Constructor<FinImageV20DTO> constructor = this.constructorRef;
                if (constructor == null) {
                    Class<?> cls = c.f34864d;
                    Class cls2 = Integer.TYPE;
                    i11 = i13;
                    constructor = FinImageV20DTO.class.getDeclaredConstructor(CbottomElement2.class, String.class, Integer.class, Boolean.class, Boolean.class, Boolean.class, Boolean.class, Integer.class, Integer.class, Integer.class, Integer.class, Float.class, List.class, List.class, Float.class, List.class, List.class, String.class, List.class, EnumC9751a.class, String.class, Integer.class, Integer.class, Integer.class, Integer.class, Float.class, Boolean.class, String.class, String.class, String.class, String.class, EnumC9754d.class, String.class, String.class, String.class, Map.class, Map.class, cls2, cls2, cls);
                    this.constructorRef = constructor;
                    Intrinsics.checkNotNullExpressionValue(constructor, "also(...)");
                } else {
                    i11 = i13;
                }
                if (str11 == null) {
                    throw c.j("id", "id", reader);
                }
                FinImageV20DTO newInstance = constructor.newInstance(cbottomElement2, str11, num, bool, bool2, bool3, bool4, num2, num3, num4, num5, f7, list, list2, f11, list3, list4, str2, list5, enumC9751a, str3, num6, num7, num8, num9, f12, bool5, str4, str5, str6, str7, enumC9754d, str8, str9, str10, map, map2, Integer.valueOf(i11), Integer.valueOf(i15), null);
                Intrinsics.checkNotNullExpressionValue(newInstance, "newInstance(...)");
                return newInstance;
            }
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    str = str11;
                case 0:
                    cbottomElement2 = this.cbottomElement2Adapter.fromJson(reader);
                    if (cbottomElement2 == null) {
                        throw c.q("type", "type", reader);
                    }
                    i13 &= -2;
                    str = str11;
                case 1:
                    String fromJson = this.stringAdapter.fromJson(reader);
                    if (fromJson == null) {
                        throw c.q("id", "id", reader);
                    }
                    str = fromJson;
                case 2:
                    num = this.nullableIntAdapter.fromJson(reader);
                    i13 &= -5;
                    str = str11;
                case 3:
                    bool = this.nullableBooleanAdapter.fromJson(reader);
                    i13 &= -9;
                    str = str11;
                case 4:
                    bool2 = this.nullableBooleanAdapter.fromJson(reader);
                    i13 &= -17;
                    str = str11;
                case 5:
                    bool3 = this.nullableBooleanAdapter.fromJson(reader);
                    i13 &= -33;
                    str = str11;
                case 6:
                    bool4 = this.nullableBooleanAdapter.fromJson(reader);
                    i13 &= -65;
                    str = str11;
                case 7:
                    num2 = this.nullableIntAdapter.fromJson(reader);
                    i13 &= -129;
                    str = str11;
                case 8:
                    num3 = this.nullableIntAdapter.fromJson(reader);
                    i13 &= -257;
                    str = str11;
                case 9:
                    num4 = this.nullableIntAdapter.fromJson(reader);
                    i13 &= -513;
                    str = str11;
                case 10:
                    num5 = this.nullableIntAdapter.fromJson(reader);
                    i13 &= -1025;
                    str = str11;
                case 11:
                    f7 = this.nullableFloatAdapter.fromJson(reader);
                    i13 &= -2049;
                    str = str11;
                case 12:
                    list = this.nullableListOfIntAdapter.fromJson(reader);
                    i13 &= -4097;
                    str = str11;
                case 13:
                    list2 = this.nullableListOfCbottomLayoutGravityAdapter.fromJson(reader);
                    i13 &= -8193;
                    str = str11;
                case 14:
                    f11 = this.nullableFloatAdapter.fromJson(reader);
                    i13 &= -16385;
                    str = str11;
                case 15:
                    list3 = this.nullableListOfIntAdapter.fromJson(reader);
                    i12 = -32769;
                    i13 &= i12;
                    str = str11;
                case 16:
                    list4 = this.nullableListOfIntAdapter.fromJson(reader);
                    i12 = -65537;
                    i13 &= i12;
                    str = str11;
                case 17:
                    str2 = this.nullableStringAdapter.fromJson(reader);
                    i12 = -131073;
                    i13 &= i12;
                    str = str11;
                case 18:
                    list5 = this.nullableListOfStringAdapter.fromJson(reader);
                    i12 = -262145;
                    i13 &= i12;
                    str = str11;
                case 19:
                    enumC9751a = this.nullableCbottomGradientOrientationAdapter.fromJson(reader);
                    i12 = -524289;
                    i13 &= i12;
                    str = str11;
                case 20:
                    str3 = this.nullableStringAdapter.fromJson(reader);
                    i12 = -1048577;
                    i13 &= i12;
                    str = str11;
                case 21:
                    num6 = this.nullableIntAdapter.fromJson(reader);
                    i12 = -2097153;
                    i13 &= i12;
                    str = str11;
                case 22:
                    num7 = this.nullableIntAdapter.fromJson(reader);
                    i12 = -4194305;
                    i13 &= i12;
                    str = str11;
                case 23:
                    num8 = this.nullableIntAdapter.fromJson(reader);
                    i12 = -8388609;
                    i13 &= i12;
                    str = str11;
                case 24:
                    num9 = this.nullableIntAdapter.fromJson(reader);
                    i12 = -16777217;
                    i13 &= i12;
                    str = str11;
                case TombstoneProtos$Tombstone.GUEST_THREADS_FIELD_NUMBER /* 25 */:
                    f12 = this.nullableFloatAdapter.fromJson(reader);
                    i12 = -33554433;
                    i13 &= i12;
                    str = str11;
                case TombstoneProtos$Tombstone.STACK_HISTORY_BUFFER_FIELD_NUMBER /* 26 */:
                    bool5 = this.nullableBooleanAdapter.fromJson(reader);
                    i12 = -67108865;
                    i13 &= i12;
                    str = str11;
                case DescriptorProtos$FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER /* 27 */:
                    str4 = this.nullableStringAdapter.fromJson(reader);
                    i12 = -134217729;
                    i13 &= i12;
                    str = str11;
                case 28:
                    str5 = this.nullableStringAdapter.fromJson(reader);
                    i12 = -268435457;
                    i13 &= i12;
                    str = str11;
                case 29:
                    str6 = this.nullableStringAdapter.fromJson(reader);
                    i12 = -536870913;
                    i13 &= i12;
                    str = str11;
                case AppUpdateInfo.Factory.DAYS_BETWEEN_30 /* 30 */:
                    str7 = this.nullableStringAdapter.fromJson(reader);
                    i12 = -1073741825;
                    i13 &= i12;
                    str = str11;
                case DescriptorProtos$FileOptions.CC_ENABLE_ARENAS_FIELD_NUMBER /* 31 */:
                    enumC9754d = this.nullableCbottomScaleTypeAdapter.fromJson(reader);
                    i12 = Integer.MAX_VALUE;
                    i13 &= i12;
                    str = str11;
                case 32:
                    str8 = this.nullableStringAdapter.fromJson(reader);
                    i14 &= -2;
                    str = str11;
                case 33:
                    str9 = this.nullableStringAdapter.fromJson(reader);
                    i14 &= -3;
                    str = str11;
                case 34:
                    str10 = this.nullableStringAdapter.fromJson(reader);
                    i14 &= -5;
                    str = str11;
                case DescriptorProtos$MethodOptions.FEATURES_FIELD_NUMBER /* 35 */:
                    map = this.nullableMapOfStringStringAdapter.fromJson(reader);
                    i14 &= -9;
                    str = str11;
                case DescriptorProtos$FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER /* 36 */:
                    map2 = this.nullableMapOfStringComposerTrackingInfoAdapter.fromJson(reader);
                    i14 &= -17;
                    str = str11;
                default:
                    str = str11;
            }
        }
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, FinImageV20DTO value_) {
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
        writer.w("iconSrc");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getIconSrc());
        writer.w("icon");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getIcon());
        writer.w("iconBase64");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getIconBase64());
        writer.w("iconColor");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getIconColor());
        writer.w("scaleType");
        this.nullableCbottomScaleTypeAdapter.mo44toJson(writer, (x) value_.getScaleType());
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
