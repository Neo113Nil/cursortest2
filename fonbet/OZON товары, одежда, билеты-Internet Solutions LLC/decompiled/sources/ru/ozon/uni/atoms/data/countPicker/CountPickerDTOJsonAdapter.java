package ru.ozon.uni.atoms.data.countPicker;

import Ak.b;
import Y9.c;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.n;
import com.squareup.moshi.x;
import java.lang.reflect.Constructor;
import kotlin.Metadata;
import kotlin.collections.M;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.countPicker.CountPickerDTO;

@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u001c\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0019R\u001c\u0010\u001f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0019R\u001a\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u0019R\u001c\u0010\"\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010 0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u0019R\u001c\u0010#\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\u0019R\u001c\u0010%\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010$0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010\u0019R\u001c\u0010'\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010&0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010\u0019R\u001e\u0010)\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*¨\u0006+"}, d2 = {"Lru/ozon/uni/atoms/data/countPicker/CountPickerDTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/uni/atoms/data/countPicker/CountPickerDTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/uni/atoms/data/countPicker/CountPickerDTO;", "Lcom/squareup/moshi/x;", "writer", "value_", "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/uni/atoms/data/countPicker/CountPickerDTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "Lru/ozon/uni/atoms/data/countPicker/CountPickerDTO$Size;", "nullableSizeAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/uni/atoms/data/countPicker/CountPickerDTO$Sizing;", "nullableSizingAdapter", "Lru/ozon/uni/atoms/data/countPicker/CountPickerDTO$StyleType;", "nullableStyleTypeAdapter", "", "nullableBooleanAdapter", "", "floatAdapter", "nullableFloatAdapter", "nullableStringAdapter", "Lru/ozon/uni/atoms/data/countPicker/CountPickerDTO$CustomStyle;", "nullableCustomStyleAdapter", "Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "nullableCommonControlSettingsAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class CountPickerDTOJsonAdapter extends JsonAdapter<CountPickerDTO> {
    public static final int $stable = 8;
    private volatile Constructor<CountPickerDTO> constructorRef;

    @NotNull
    private final JsonAdapter<Float> floatAdapter;

    @NotNull
    private final JsonAdapter<Boolean> nullableBooleanAdapter;

    @NotNull
    private final JsonAdapter<CommonControlSettings> nullableCommonControlSettingsAdapter;

    @NotNull
    private final JsonAdapter<CountPickerDTO.CustomStyle> nullableCustomStyleAdapter;

    @NotNull
    private final JsonAdapter<Float> nullableFloatAdapter;

    @NotNull
    private final JsonAdapter<CountPickerDTO.Size> nullableSizeAdapter;

    @NotNull
    private final JsonAdapter<CountPickerDTO.Sizing> nullableSizingAdapter;

    @NotNull
    private final JsonAdapter<String> nullableStringAdapter;

    @NotNull
    private final JsonAdapter<CountPickerDTO.StyleType> nullableStyleTypeAdapter;

    @NotNull
    private final n.a options;

    public CountPickerDTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        n.a a11 = n.a.C0918a.a("size", "sizing", "styleType", "isDisabled", AppMeasurementSdk.ConditionalUserProperty.VALUE, "minValue", "maxValue", "step", "showAsFloat", "subLabel", "customStyle", "minusIcon", "plusIcon", "common", "context");
        Intrinsics.checkNotNullExpressionValue(a11, "of(...)");
        this.options = a11;
        M m11 = M.f71699a;
        JsonAdapter<CountPickerDTO.Size> f7 = moshi.f(CountPickerDTO.Size.class, m11, "size");
        Intrinsics.checkNotNullExpressionValue(f7, "adapter(...)");
        this.nullableSizeAdapter = f7;
        JsonAdapter<CountPickerDTO.Sizing> f11 = moshi.f(CountPickerDTO.Sizing.class, m11, "sizing");
        Intrinsics.checkNotNullExpressionValue(f11, "adapter(...)");
        this.nullableSizingAdapter = f11;
        JsonAdapter<CountPickerDTO.StyleType> f12 = moshi.f(CountPickerDTO.StyleType.class, m11, "styleType");
        Intrinsics.checkNotNullExpressionValue(f12, "adapter(...)");
        this.nullableStyleTypeAdapter = f12;
        JsonAdapter<Boolean> f13 = moshi.f(Boolean.class, m11, "isDisabled");
        Intrinsics.checkNotNullExpressionValue(f13, "adapter(...)");
        this.nullableBooleanAdapter = f13;
        JsonAdapter<Float> f14 = moshi.f(Float.TYPE, m11, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        Intrinsics.checkNotNullExpressionValue(f14, "adapter(...)");
        this.floatAdapter = f14;
        JsonAdapter<Float> f15 = moshi.f(Float.class, m11, "minValue");
        Intrinsics.checkNotNullExpressionValue(f15, "adapter(...)");
        this.nullableFloatAdapter = f15;
        JsonAdapter<String> f16 = moshi.f(String.class, m11, "subLabel");
        Intrinsics.checkNotNullExpressionValue(f16, "adapter(...)");
        this.nullableStringAdapter = f16;
        JsonAdapter<CountPickerDTO.CustomStyle> f17 = moshi.f(CountPickerDTO.CustomStyle.class, m11, "customStyle");
        Intrinsics.checkNotNullExpressionValue(f17, "adapter(...)");
        this.nullableCustomStyleAdapter = f17;
        JsonAdapter<CommonControlSettings> f18 = moshi.f(CommonControlSettings.class, m11, "common");
        Intrinsics.checkNotNullExpressionValue(f18, "adapter(...)");
        this.nullableCommonControlSettingsAdapter = f18;
    }

    @NotNull
    public String toString() {
        return b.c(36, "GeneratedJsonAdapter(CountPickerDTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public CountPickerDTO fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        Float valueOf = Float.valueOf(0.0f);
        reader.beginObject();
        int i11 = -1;
        Float f7 = valueOf;
        CountPickerDTO.Size size = null;
        CountPickerDTO.Sizing sizing = null;
        CountPickerDTO.StyleType styleType = null;
        Boolean bool = null;
        CountPickerDTO.CustomStyle customStyle = null;
        Float f11 = null;
        Float f12 = null;
        Float f13 = null;
        Boolean bool2 = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        CommonControlSettings commonControlSettings = null;
        String str4 = null;
        while (reader.hasNext()) {
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    break;
                case 0:
                    size = this.nullableSizeAdapter.fromJson(reader);
                    i11 &= -2;
                    break;
                case 1:
                    sizing = this.nullableSizingAdapter.fromJson(reader);
                    i11 &= -3;
                    break;
                case 2:
                    styleType = this.nullableStyleTypeAdapter.fromJson(reader);
                    i11 &= -5;
                    break;
                case 3:
                    bool = this.nullableBooleanAdapter.fromJson(reader);
                    i11 &= -9;
                    break;
                case 4:
                    f7 = this.floatAdapter.fromJson(reader);
                    if (f7 == null) {
                        throw c.q("value__", AppMeasurementSdk.ConditionalUserProperty.VALUE, reader);
                    }
                    i11 &= -17;
                    break;
                case 5:
                    f11 = this.nullableFloatAdapter.fromJson(reader);
                    i11 &= -33;
                    break;
                case 6:
                    f12 = this.nullableFloatAdapter.fromJson(reader);
                    i11 &= -65;
                    break;
                case 7:
                    f13 = this.nullableFloatAdapter.fromJson(reader);
                    i11 &= -129;
                    break;
                case 8:
                    bool2 = this.nullableBooleanAdapter.fromJson(reader);
                    i11 &= -257;
                    break;
                case 9:
                    str = this.nullableStringAdapter.fromJson(reader);
                    i11 &= -513;
                    break;
                case 10:
                    customStyle = this.nullableCustomStyleAdapter.fromJson(reader);
                    i11 &= -1025;
                    break;
                case 11:
                    str2 = this.nullableStringAdapter.fromJson(reader);
                    i11 &= -2049;
                    break;
                case 12:
                    str3 = this.nullableStringAdapter.fromJson(reader);
                    i11 &= -4097;
                    break;
                case 13:
                    commonControlSettings = this.nullableCommonControlSettingsAdapter.fromJson(reader);
                    i11 &= -8193;
                    break;
                case 14:
                    str4 = this.nullableStringAdapter.fromJson(reader);
                    i11 &= -16385;
                    break;
            }
        }
        reader.endObject();
        if (i11 == -32768) {
            return new CountPickerDTO(size, sizing, styleType, bool, f7.floatValue(), f11, f12, f13, bool2, str, customStyle, str2, str3, commonControlSettings, str4);
        }
        CountPickerDTO.CustomStyle customStyle2 = customStyle;
        Constructor<CountPickerDTO> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = CountPickerDTO.class.getDeclaredConstructor(CountPickerDTO.Size.class, CountPickerDTO.Sizing.class, CountPickerDTO.StyleType.class, Boolean.class, Float.TYPE, Float.class, Float.class, Float.class, Boolean.class, String.class, CountPickerDTO.CustomStyle.class, String.class, String.class, CommonControlSettings.class, String.class, Integer.TYPE, c.f34864d);
            this.constructorRef = constructor;
            Intrinsics.checkNotNullExpressionValue(constructor, "also(...)");
        }
        CountPickerDTO newInstance = constructor.newInstance(size, sizing, styleType, bool, f7, f11, f12, f13, bool2, str, customStyle2, str2, str3, commonControlSettings, str4, Integer.valueOf(i11), null);
        Intrinsics.checkNotNullExpressionValue(newInstance, "newInstance(...)");
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, CountPickerDTO value_) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("size");
        this.nullableSizeAdapter.mo44toJson(writer, (x) value_.getSize());
        writer.w("sizing");
        this.nullableSizingAdapter.mo44toJson(writer, (x) value_.getSizing());
        writer.w("styleType");
        this.nullableStyleTypeAdapter.mo44toJson(writer, (x) value_.getStyleType());
        writer.w("isDisabled");
        this.nullableBooleanAdapter.mo44toJson(writer, (x) value_.isDisabled());
        writer.w(AppMeasurementSdk.ConditionalUserProperty.VALUE);
        this.floatAdapter.mo44toJson(writer, (x) Float.valueOf(value_.getValue()));
        writer.w("minValue");
        this.nullableFloatAdapter.mo44toJson(writer, (x) value_.getMinValue());
        writer.w("maxValue");
        this.nullableFloatAdapter.mo44toJson(writer, (x) value_.getMaxValue());
        writer.w("step");
        this.nullableFloatAdapter.mo44toJson(writer, (x) value_.getStep());
        writer.w("showAsFloat");
        this.nullableBooleanAdapter.mo44toJson(writer, (x) value_.getShowAsFloat());
        writer.w("subLabel");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getSubLabel());
        writer.w("customStyle");
        this.nullableCustomStyleAdapter.mo44toJson(writer, (x) value_.getCustomStyle());
        writer.w("minusIcon");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getMinusIcon());
        writer.w("plusIcon");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getPlusIcon());
        writer.w("common");
        this.nullableCommonControlSettingsAdapter.mo44toJson(writer, (x) value_.getCommon());
        writer.w("context");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getContext());
        writer.p();
    }
}
