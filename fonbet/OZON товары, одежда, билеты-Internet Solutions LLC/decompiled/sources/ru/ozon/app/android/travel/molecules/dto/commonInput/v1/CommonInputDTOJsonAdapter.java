package ru.ozon.app.android.travel.molecules.dto.commonInput.v1;

import Ak.b;
import Y9.c;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
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
import ru.ozon.app.android.marketing.widgets.hammersV3.newHammers.data.HammersV3BodyDTO;
import ru.ozon.app.android.partpayment.formpage.data.FormPageDTO;
import ru.ozon.app.android.travel.molecules.dto.commonInput.v1.CommonInputDTO;
import ru.ozon.uni.atoms.data.AtomActionDTO;

@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0019R\u001c\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0019R\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0019R\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0019R\"\u0010!\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010 0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u0019R\"\u0010#\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\"\u0018\u00010 0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\u0019R\u001c\u0010%\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010$0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010\u0019R\u001c\u0010'\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010&0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010\u0019R(\u0010*\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020)\u0018\u00010(0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010\u0019R\u001e\u0010,\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-¨\u0006."}, d2 = {"Lru/ozon/app/android/travel/molecules/dto/commonInput/v1/CommonInputDTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/travel/molecules/dto/commonInput/v1/CommonInputDTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/travel/molecules/dto/commonInput/v1/CommonInputDTO;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/travel/molecules/dto/commonInput/v1/CommonInputDTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "Lru/ozon/app/android/travel/molecules/dto/commonInput/v1/CommonInputDTO$InputType;", "inputTypeAdapter", "Lcom/squareup/moshi/JsonAdapter;", "nullableStringAdapter", "Lru/ozon/app/android/travel/molecules/dto/commonInput/v1/CommonInputDTO$DateRange;", "nullableDateRangeAdapter", "stringAdapter", "", "booleanAdapter", "", "nullableListOfStringAdapter", "Lru/ozon/app/android/travel/molecules/dto/commonInput/v1/CommonInputDTO$SelectorOption;", "nullableListOfSelectorOptionAdapter", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "nullableAtomActionDTOAdapter", "", "nullableIntAdapter", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "nullableMapOfStringTokenizedTrackingInfoAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "molecules_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class CommonInputDTOJsonAdapter extends JsonAdapter<CommonInputDTO> {

    @NotNull
    private final JsonAdapter<Boolean> booleanAdapter;
    private volatile Constructor<CommonInputDTO> constructorRef;

    @NotNull
    private final JsonAdapter<CommonInputDTO.InputType> inputTypeAdapter;

    @NotNull
    private final JsonAdapter<AtomActionDTO> nullableAtomActionDTOAdapter;

    @NotNull
    private final JsonAdapter<CommonInputDTO.DateRange> nullableDateRangeAdapter;

    @NotNull
    private final JsonAdapter<Integer> nullableIntAdapter;

    @NotNull
    private final JsonAdapter<List<CommonInputDTO.SelectorOption>> nullableListOfSelectorOptionAdapter;

    @NotNull
    private final JsonAdapter<List<String>> nullableListOfStringAdapter;

    @NotNull
    private final JsonAdapter<Map<String, TokenizedTrackingInfo>> nullableMapOfStringTokenizedTrackingInfoAdapter;

    @NotNull
    private final JsonAdapter<String> nullableStringAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<String> stringAdapter;

    public CommonInputDTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("type", AppMeasurementSdk.ConditionalUserProperty.VALUE, "defaultValue", FormPageDTO.Field.FIELD_TYPE_RANGE, HammersV3BodyDTO.PLACEHOLDER, "subtext", AppMeasurementSdk.ConditionalUserProperty.NAME, FormPageDTO.Field.FIELD_TYPE_MASK, "isReadOnly", "isDisabled", "isTouched", "isInvalid", "errors", "options", "onClick", "onChange", "isMultiline", "selectedAction", "maxLength", "trackingInfo", "selectTrackingInfo", "unfocusedTrackingInfo", "scrollOnMount", "focusOnMount");
        M m11 = M.f71699a;
        this.inputTypeAdapter = moshi.f(CommonInputDTO.InputType.class, m11, "type");
        this.nullableStringAdapter = moshi.f(String.class, m11, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        this.nullableDateRangeAdapter = moshi.f(CommonInputDTO.DateRange.class, m11, FormPageDTO.Field.FIELD_TYPE_RANGE);
        this.stringAdapter = moshi.f(String.class, m11, AppMeasurementSdk.ConditionalUserProperty.NAME);
        this.booleanAdapter = moshi.f(Boolean.TYPE, m11, "isReadOnly");
        this.nullableListOfStringAdapter = moshi.f(D.e(List.class, String.class), m11, "errors");
        this.nullableListOfSelectorOptionAdapter = moshi.f(D.e(List.class, CommonInputDTO.SelectorOption.class), m11, "options");
        this.nullableAtomActionDTOAdapter = moshi.f(AtomActionDTO.class, m11, "onClick");
        this.nullableIntAdapter = moshi.f(Integer.class, m11, "maxLength");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter = moshi.f(D.e(Map.class, String.class, TokenizedTrackingInfo.class), m11, "trackingInfo");
    }

    @NotNull
    public String toString() {
        return b.c(36, "GeneratedJsonAdapter(CommonInputDTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public CommonInputDTO fromJson(@NotNull n reader) {
        int i11;
        Intrinsics.checkNotNullParameter(reader, "reader");
        Boolean bool = Boolean.FALSE;
        reader.beginObject();
        int i12 = -1;
        Boolean bool2 = bool;
        Boolean bool3 = bool2;
        Boolean bool4 = bool3;
        Boolean bool5 = bool4;
        Boolean bool6 = bool5;
        Boolean bool7 = bool6;
        Boolean bool8 = bool7;
        List<String> list = null;
        List<CommonInputDTO.SelectorOption> list2 = null;
        AtomActionDTO atomActionDTO = null;
        AtomActionDTO atomActionDTO2 = null;
        CommonInputDTO.InputType inputType = null;
        String str = null;
        String str2 = null;
        CommonInputDTO.DateRange dateRange = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        AtomActionDTO atomActionDTO3 = null;
        Integer num = null;
        Map<String, TokenizedTrackingInfo> map = null;
        Map<String, TokenizedTrackingInfo> map2 = null;
        Map<String, TokenizedTrackingInfo> map3 = null;
        while (reader.hasNext()) {
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    continue;
                case 0:
                    inputType = this.inputTypeAdapter.fromJson(reader);
                    if (inputType == null) {
                        throw c.q("type", "type", reader);
                    }
                    continue;
                case 1:
                    str = this.nullableStringAdapter.fromJson(reader);
                    continue;
                case 2:
                    str2 = this.nullableStringAdapter.fromJson(reader);
                    continue;
                case 3:
                    dateRange = this.nullableDateRangeAdapter.fromJson(reader);
                    continue;
                case 4:
                    str3 = this.nullableStringAdapter.fromJson(reader);
                    continue;
                case 5:
                    str4 = this.nullableStringAdapter.fromJson(reader);
                    continue;
                case 6:
                    str5 = this.stringAdapter.fromJson(reader);
                    if (str5 == null) {
                        throw c.q(AppMeasurementSdk.ConditionalUserProperty.NAME, AppMeasurementSdk.ConditionalUserProperty.NAME, reader);
                    }
                    continue;
                case 7:
                    str6 = this.nullableStringAdapter.fromJson(reader);
                    continue;
                case 8:
                    bool2 = this.booleanAdapter.fromJson(reader);
                    if (bool2 == null) {
                        throw c.q("isReadOnly", "isReadOnly", reader);
                    }
                    i12 &= -257;
                    continue;
                case 9:
                    bool3 = this.booleanAdapter.fromJson(reader);
                    if (bool3 == null) {
                        throw c.q("isDisabled", "isDisabled", reader);
                    }
                    i12 &= -513;
                    continue;
                case 10:
                    bool4 = this.booleanAdapter.fromJson(reader);
                    if (bool4 == null) {
                        throw c.q("isTouched", "isTouched", reader);
                    }
                    i12 &= -1025;
                    continue;
                case 11:
                    bool5 = this.booleanAdapter.fromJson(reader);
                    if (bool5 == null) {
                        throw c.q("isInvalid", "isInvalid", reader);
                    }
                    i12 &= -2049;
                    continue;
                case 12:
                    list = this.nullableListOfStringAdapter.fromJson(reader);
                    continue;
                case 13:
                    list2 = this.nullableListOfSelectorOptionAdapter.fromJson(reader);
                    continue;
                case 14:
                    atomActionDTO = this.nullableAtomActionDTOAdapter.fromJson(reader);
                    continue;
                case 15:
                    atomActionDTO2 = this.nullableAtomActionDTOAdapter.fromJson(reader);
                    continue;
                case 16:
                    bool6 = this.booleanAdapter.fromJson(reader);
                    if (bool6 == null) {
                        throw c.q("isMultiline", "isMultiline", reader);
                    }
                    i11 = -65537;
                    break;
                case 17:
                    atomActionDTO3 = this.nullableAtomActionDTOAdapter.fromJson(reader);
                    continue;
                case 18:
                    num = this.nullableIntAdapter.fromJson(reader);
                    continue;
                case 19:
                    map = this.nullableMapOfStringTokenizedTrackingInfoAdapter.fromJson(reader);
                    continue;
                case 20:
                    map2 = this.nullableMapOfStringTokenizedTrackingInfoAdapter.fromJson(reader);
                    continue;
                case 21:
                    map3 = this.nullableMapOfStringTokenizedTrackingInfoAdapter.fromJson(reader);
                    continue;
                case 22:
                    bool7 = this.booleanAdapter.fromJson(reader);
                    if (bool7 == null) {
                        throw c.q("scrollOnMount", "scrollOnMount", reader);
                    }
                    i11 = -4194305;
                    break;
                case 23:
                    bool8 = this.booleanAdapter.fromJson(reader);
                    if (bool8 == null) {
                        throw c.q("focusOnMount", "focusOnMount", reader);
                    }
                    i11 = -8388609;
                    break;
            }
            i12 &= i11;
        }
        reader.endObject();
        if (i12 == -12652289) {
            if (inputType == null) {
                throw c.j("type", "type", reader);
            }
            if (str5 == null) {
                throw c.j(AppMeasurementSdk.ConditionalUserProperty.NAME, AppMeasurementSdk.ConditionalUserProperty.NAME, reader);
            }
            return new CommonInputDTO(inputType, str, str2, dateRange, str3, str4, str5, str6, bool2.booleanValue(), bool3.booleanValue(), bool4.booleanValue(), bool5.booleanValue(), list, list2, atomActionDTO, atomActionDTO2, bool6.booleanValue(), atomActionDTO3, num, map, map2, map3, bool7.booleanValue(), bool8.booleanValue());
        }
        Constructor<CommonInputDTO> constructor = this.constructorRef;
        if (constructor == null) {
            Class<?> cls = c.f34864d;
            Class cls2 = Boolean.TYPE;
            constructor = CommonInputDTO.class.getDeclaredConstructor(CommonInputDTO.InputType.class, String.class, String.class, CommonInputDTO.DateRange.class, String.class, String.class, String.class, String.class, cls2, cls2, cls2, cls2, List.class, List.class, AtomActionDTO.class, AtomActionDTO.class, cls2, AtomActionDTO.class, Integer.class, Map.class, Map.class, Map.class, cls2, cls2, Integer.TYPE, cls);
            this.constructorRef = constructor;
            Intrinsics.checkNotNullExpressionValue(constructor, "also(...)");
        }
        if (inputType == null) {
            throw c.j("type", "type", reader);
        }
        if (str5 == null) {
            throw c.j(AppMeasurementSdk.ConditionalUserProperty.NAME, AppMeasurementSdk.ConditionalUserProperty.NAME, reader);
        }
        CommonInputDTO newInstance = constructor.newInstance(inputType, str, str2, dateRange, str3, str4, str5, str6, bool2, bool3, bool4, bool5, list, list2, atomActionDTO, atomActionDTO2, bool6, atomActionDTO3, num, map, map2, map3, bool7, bool8, Integer.valueOf(i12), null);
        Intrinsics.checkNotNullExpressionValue(newInstance, "newInstance(...)");
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, CommonInputDTO value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("type");
        this.inputTypeAdapter.mo44toJson(writer, (x) value.getType());
        writer.w(AppMeasurementSdk.ConditionalUserProperty.VALUE);
        this.nullableStringAdapter.mo44toJson(writer, (x) value.getValue());
        writer.w("defaultValue");
        this.nullableStringAdapter.mo44toJson(writer, (x) value.getDefaultValue());
        writer.w(FormPageDTO.Field.FIELD_TYPE_RANGE);
        this.nullableDateRangeAdapter.mo44toJson(writer, (x) value.getRange());
        writer.w(HammersV3BodyDTO.PLACEHOLDER);
        this.nullableStringAdapter.mo44toJson(writer, (x) value.getPlaceholder());
        writer.w("subtext");
        this.nullableStringAdapter.mo44toJson(writer, (x) value.getSubtext());
        writer.w(AppMeasurementSdk.ConditionalUserProperty.NAME);
        this.stringAdapter.mo44toJson(writer, (x) value.getName());
        writer.w(FormPageDTO.Field.FIELD_TYPE_MASK);
        this.nullableStringAdapter.mo44toJson(writer, (x) value.getMask());
        writer.w("isReadOnly");
        this.booleanAdapter.mo44toJson(writer, (x) Boolean.valueOf(value.isReadOnly()));
        writer.w("isDisabled");
        this.booleanAdapter.mo44toJson(writer, (x) Boolean.valueOf(value.isDisabled()));
        writer.w("isTouched");
        this.booleanAdapter.mo44toJson(writer, (x) Boolean.valueOf(value.isTouched()));
        writer.w("isInvalid");
        this.booleanAdapter.mo44toJson(writer, (x) Boolean.valueOf(value.isInvalid()));
        writer.w("errors");
        this.nullableListOfStringAdapter.mo44toJson(writer, (x) value.getErrors());
        writer.w("options");
        this.nullableListOfSelectorOptionAdapter.mo44toJson(writer, (x) value.getOptions());
        writer.w("onClick");
        this.nullableAtomActionDTOAdapter.mo44toJson(writer, (x) value.getOnClick());
        writer.w("onChange");
        this.nullableAtomActionDTOAdapter.mo44toJson(writer, (x) value.getOnChange());
        writer.w("isMultiline");
        this.booleanAdapter.mo44toJson(writer, (x) Boolean.valueOf(value.isMultiline()));
        writer.w("selectedAction");
        this.nullableAtomActionDTOAdapter.mo44toJson(writer, (x) value.getSelectedAction());
        writer.w("maxLength");
        this.nullableIntAdapter.mo44toJson(writer, (x) value.getMaxLength());
        writer.w("trackingInfo");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter.mo44toJson(writer, (x) value.getTrackingInfo());
        writer.w("selectTrackingInfo");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter.mo44toJson(writer, (x) value.getSelectTrackingInfo());
        writer.w("unfocusedTrackingInfo");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter.mo44toJson(writer, (x) value.getUnfocusedTrackingInfo());
        writer.w("scrollOnMount");
        this.booleanAdapter.mo44toJson(writer, (x) Boolean.valueOf(value.getScrollOnMount()));
        writer.w("focusOnMount");
        this.booleanAdapter.mo44toJson(writer, (x) Boolean.valueOf(value.getFocusOnMount()));
        writer.p();
    }
}
