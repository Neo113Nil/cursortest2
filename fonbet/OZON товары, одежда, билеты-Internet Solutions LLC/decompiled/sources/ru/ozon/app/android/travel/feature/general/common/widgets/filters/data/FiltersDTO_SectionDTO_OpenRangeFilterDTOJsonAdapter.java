package ru.ozon.app.android.travel.feature.general.common.widgets.filters.data;

import Ak.b;
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
import ru.ozon.app.android.travel.feature.general.common.widgets.filters.data.FiltersDTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0019R\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0019R\u001c\u0010 \u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u0019R(\u0010#\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\"\u0018\u00010!0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\u0019R\u001e\u0010%\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&¨\u0006'"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/filters/data/FiltersDTO_SectionDTO_OpenRangeFilterDTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/travel/feature/general/common/widgets/filters/data/FiltersDTO$SectionDTO$OpenRangeFilterDTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/travel/feature/general/common/widgets/filters/data/FiltersDTO$SectionDTO$OpenRangeFilterDTO;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/travel/feature/general/common/widgets/filters/data/FiltersDTO$SectionDTO$OpenRangeFilterDTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "Lru/ozon/uni/atoms/data/text/TextDTO;", "nullableTextDTOAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "nullableCommonControlSettingsAdapter", "", "intAdapter", "", "booleanAdapter", "nullableStringAdapter", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "nullableMapOfStringTokenizedTrackingInfoAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class FiltersDTO_SectionDTO_OpenRangeFilterDTOJsonAdapter extends JsonAdapter<FiltersDTO.SectionDTO.OpenRangeFilterDTO> {
    public static final int $stable = 8;

    @NotNull
    private final JsonAdapter<Boolean> booleanAdapter;
    private volatile Constructor<FiltersDTO.SectionDTO.OpenRangeFilterDTO> constructorRef;

    @NotNull
    private final JsonAdapter<Integer> intAdapter;

    @NotNull
    private final JsonAdapter<CommonControlSettings> nullableCommonControlSettingsAdapter;

    @NotNull
    private final JsonAdapter<Map<String, TokenizedTrackingInfo>> nullableMapOfStringTokenizedTrackingInfoAdapter;

    @NotNull
    private final JsonAdapter<String> nullableStringAdapter;

    @NotNull
    private final JsonAdapter<TextDTO> nullableTextDTOAdapter;

    @NotNull
    private final n.a options;

    public FiltersDTO_SectionDTO_OpenRangeFilterDTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a(SelectionItemFormDTO.TITLE_FIELD_NAME, "common", "minValue", "maxValue", "fromValue", "toValue", "hideSeparator", "symbol", "maxValueSign", "stepPower", "step", "minFieldTrackingInfo", "maxFieldTrackingInfo", "minSliderTrackingInfo", "maxSliderTrackingInfo");
        M m11 = M.f71699a;
        this.nullableTextDTOAdapter = moshi.f(TextDTO.class, m11, SelectionItemFormDTO.TITLE_FIELD_NAME);
        this.nullableCommonControlSettingsAdapter = moshi.f(CommonControlSettings.class, m11, "common");
        this.intAdapter = moshi.f(Integer.TYPE, m11, "minValue");
        this.booleanAdapter = moshi.f(Boolean.TYPE, m11, "hideSeparator");
        this.nullableStringAdapter = moshi.f(String.class, m11, "symbol");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter = moshi.f(D.e(Map.class, String.class, TokenizedTrackingInfo.class), m11, "minFieldTrackingInfo");
    }

    @NotNull
    public String toString() {
        return b.c(62, "GeneratedJsonAdapter(FiltersDTO.SectionDTO.OpenRangeFilterDTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public FiltersDTO.SectionDTO.OpenRangeFilterDTO fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        Boolean bool = Boolean.FALSE;
        reader.beginObject();
        int i11 = -1;
        Integer num = 0;
        Integer num2 = null;
        Integer num3 = null;
        Integer num4 = null;
        Boolean bool2 = bool;
        Integer num5 = null;
        Integer num6 = null;
        String str = null;
        Map<String, TokenizedTrackingInfo> map = null;
        TextDTO textDTO = null;
        CommonControlSettings commonControlSettings = null;
        String str2 = null;
        Map<String, TokenizedTrackingInfo> map2 = null;
        Map<String, TokenizedTrackingInfo> map3 = null;
        Map<String, TokenizedTrackingInfo> map4 = null;
        while (reader.hasNext()) {
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    break;
                case 0:
                    textDTO = this.nullableTextDTOAdapter.fromJson(reader);
                    break;
                case 1:
                    commonControlSettings = this.nullableCommonControlSettingsAdapter.fromJson(reader);
                    break;
                case 2:
                    num5 = this.intAdapter.fromJson(reader);
                    if (num5 == null) {
                        throw c.q("minValue", "minValue", reader);
                    }
                    break;
                case 3:
                    num6 = this.intAdapter.fromJson(reader);
                    if (num6 == null) {
                        throw c.q("maxValue", "maxValue", reader);
                    }
                    break;
                case 4:
                    num = this.intAdapter.fromJson(reader);
                    if (num == null) {
                        throw c.q("fromValue", "fromValue", reader);
                    }
                    i11 &= -17;
                    break;
                case 5:
                    num2 = this.intAdapter.fromJson(reader);
                    if (num2 == null) {
                        throw c.q("toValue", "toValue", reader);
                    }
                    i11 &= -33;
                    break;
                case 6:
                    bool2 = this.booleanAdapter.fromJson(reader);
                    if (bool2 == null) {
                        throw c.q("hideSeparator", "hideSeparator", reader);
                    }
                    i11 &= -65;
                    break;
                case 7:
                    str2 = this.nullableStringAdapter.fromJson(reader);
                    break;
                case 8:
                    str = this.nullableStringAdapter.fromJson(reader);
                    break;
                case 9:
                    num3 = this.intAdapter.fromJson(reader);
                    if (num3 == null) {
                        throw c.q("stepPower", "stepPower", reader);
                    }
                    i11 &= -513;
                    break;
                case 10:
                    num4 = this.intAdapter.fromJson(reader);
                    if (num4 == null) {
                        throw c.q("step", "step", reader);
                    }
                    i11 &= -1025;
                    break;
                case 11:
                    map = this.nullableMapOfStringTokenizedTrackingInfoAdapter.fromJson(reader);
                    break;
                case 12:
                    map2 = this.nullableMapOfStringTokenizedTrackingInfoAdapter.fromJson(reader);
                    break;
                case 13:
                    map3 = this.nullableMapOfStringTokenizedTrackingInfoAdapter.fromJson(reader);
                    break;
                case 14:
                    map4 = this.nullableMapOfStringTokenizedTrackingInfoAdapter.fromJson(reader);
                    break;
            }
        }
        reader.endObject();
        if (i11 == -1649) {
            Map<String, TokenizedTrackingInfo> map5 = map;
            if (num5 == null) {
                throw c.j("minValue", "minValue", reader);
            }
            int intValue = num5.intValue();
            if (num6 == null) {
                throw c.j("maxValue", "maxValue", reader);
            }
            return new FiltersDTO.SectionDTO.OpenRangeFilterDTO(textDTO, commonControlSettings, intValue, num6.intValue(), num.intValue(), num2.intValue(), bool2.booleanValue(), str2, str, num3.intValue(), num4.intValue(), map5, map2, map3, map4);
        }
        Map<String, TokenizedTrackingInfo> map6 = map;
        Constructor<FiltersDTO.SectionDTO.OpenRangeFilterDTO> constructor = this.constructorRef;
        if (constructor == null) {
            Class<?> cls = c.f34864d;
            Class cls2 = Integer.TYPE;
            constructor = FiltersDTO.SectionDTO.OpenRangeFilterDTO.class.getDeclaredConstructor(TextDTO.class, CommonControlSettings.class, cls2, cls2, cls2, cls2, Boolean.TYPE, String.class, String.class, cls2, cls2, Map.class, Map.class, Map.class, Map.class, cls2, cls);
            this.constructorRef = constructor;
            Intrinsics.checkNotNullExpressionValue(constructor, "also(...)");
        }
        if (num5 == null) {
            throw c.j("minValue", "minValue", reader);
        }
        if (num6 == null) {
            throw c.j("maxValue", "maxValue", reader);
        }
        FiltersDTO.SectionDTO.OpenRangeFilterDTO newInstance = constructor.newInstance(textDTO, commonControlSettings, num5, num6, num, num2, bool2, str2, str, num3, num4, map6, map2, map3, map4, Integer.valueOf(i11), null);
        Intrinsics.checkNotNullExpressionValue(newInstance, "newInstance(...)");
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, FiltersDTO.SectionDTO.OpenRangeFilterDTO value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w(SelectionItemFormDTO.TITLE_FIELD_NAME);
        this.nullableTextDTOAdapter.mo44toJson(writer, (x) value.getTitle());
        writer.w("common");
        this.nullableCommonControlSettingsAdapter.mo44toJson(writer, (x) value.getCommon());
        writer.w("minValue");
        this.intAdapter.mo44toJson(writer, (x) Integer.valueOf(value.getMinValue()));
        writer.w("maxValue");
        this.intAdapter.mo44toJson(writer, (x) Integer.valueOf(value.getMaxValue()));
        writer.w("fromValue");
        this.intAdapter.mo44toJson(writer, (x) Integer.valueOf(value.getFromValue()));
        writer.w("toValue");
        this.intAdapter.mo44toJson(writer, (x) Integer.valueOf(value.getToValue()));
        writer.w("hideSeparator");
        this.booleanAdapter.mo44toJson(writer, (x) Boolean.valueOf(value.getHideSeparator()));
        writer.w("symbol");
        this.nullableStringAdapter.mo44toJson(writer, (x) value.getSymbol());
        writer.w("maxValueSign");
        this.nullableStringAdapter.mo44toJson(writer, (x) value.getMaxValueSign());
        writer.w("stepPower");
        this.intAdapter.mo44toJson(writer, (x) Integer.valueOf(value.getStepPower()));
        writer.w("step");
        this.intAdapter.mo44toJson(writer, (x) Integer.valueOf(value.getStep()));
        writer.w("minFieldTrackingInfo");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter.mo44toJson(writer, (x) value.getMinFieldTrackingInfo());
        writer.w("maxFieldTrackingInfo");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter.mo44toJson(writer, (x) value.getMaxFieldTrackingInfo());
        writer.w("minSliderTrackingInfo");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter.mo44toJson(writer, (x) value.getMinSliderTrackingInfo());
        writer.w("maxSliderTrackingInfo");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter.mo44toJson(writer, (x) value.getMaxSliderTrackingInfo());
        writer.p();
    }
}
