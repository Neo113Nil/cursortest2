package ru.ozon.app.android.travel.molecules.dto.sliderWithLabels.v2;

import C.o0;
import Y9.b;
import Y9.c;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.D;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.n;
import com.squareup.moshi.x;
import java.lang.reflect.Constructor;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.M;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.molecules.dto.sliderWithLabels.v2.SliderWithLabelsV2DTO;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R \u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001aR\u001c\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001d0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001aR\u001e\u0010 \u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!¨\u0006\""}, d2 = {"Lru/ozon/app/android/travel/molecules/dto/sliderWithLabels/v2/SliderWithLabelsV2DTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/travel/molecules/dto/sliderWithLabels/v2/SliderWithLabelsV2DTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/travel/molecules/dto/sliderWithLabels/v2/SliderWithLabelsV2DTO;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/travel/molecules/dto/sliderWithLabels/v2/SliderWithLabelsV2DTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "", "Lru/ozon/app/android/travel/molecules/dto/sliderWithLabels/v2/SliderWithLabelsV2DTO$PointDTO;", "listOfPointDTOAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "intAdapter", "Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "nullableCommonControlSettingsAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "molecules_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SliderWithLabelsV2DTOJsonAdapter extends JsonAdapter<SliderWithLabelsV2DTO> {
    private volatile Constructor<SliderWithLabelsV2DTO> constructorRef;

    @NotNull
    private final JsonAdapter<Integer> intAdapter;

    @NotNull
    private final JsonAdapter<List<SliderWithLabelsV2DTO.PointDTO>> listOfPointDTOAdapter;

    @NotNull
    private final JsonAdapter<CommonControlSettings> nullableCommonControlSettingsAdapter;

    @NotNull
    private final n.a options;

    public SliderWithLabelsV2DTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("points", "min", "max", "initialMinValue", "initialMaxValue", "step", "maxRange", "common");
        b e11 = D.e(List.class, SliderWithLabelsV2DTO.PointDTO.class);
        M m11 = M.f71699a;
        this.listOfPointDTOAdapter = moshi.f(e11, m11, "points");
        this.intAdapter = moshi.f(Integer.TYPE, m11, "min");
        this.nullableCommonControlSettingsAdapter = moshi.f(CommonControlSettings.class, m11, "common");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public SliderWithLabelsV2DTO fromJson(@NotNull n reader) {
        int i11 = -1;
        Integer a11 = o0.a(reader, "reader", 0);
        Integer num = a11;
        Integer num2 = num;
        Integer num3 = num2;
        List<SliderWithLabelsV2DTO.PointDTO> list = null;
        Integer num4 = null;
        Integer num5 = null;
        CommonControlSettings commonControlSettings = null;
        while (reader.hasNext()) {
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    break;
                case 0:
                    list = this.listOfPointDTOAdapter.fromJson(reader);
                    if (list == null) {
                        throw c.q("points", "points", reader);
                    }
                    break;
                case 1:
                    num4 = this.intAdapter.fromJson(reader);
                    if (num4 == null) {
                        throw c.q("min", "min", reader);
                    }
                    break;
                case 2:
                    num5 = this.intAdapter.fromJson(reader);
                    if (num5 == null) {
                        throw c.q("max", "max", reader);
                    }
                    break;
                case 3:
                    a11 = this.intAdapter.fromJson(reader);
                    if (a11 == null) {
                        throw c.q("initialMinValue", "initialMinValue", reader);
                    }
                    i11 &= -9;
                    break;
                case 4:
                    num = this.intAdapter.fromJson(reader);
                    if (num == null) {
                        throw c.q("initialMaxValue", "initialMaxValue", reader);
                    }
                    i11 &= -17;
                    break;
                case 5:
                    num2 = this.intAdapter.fromJson(reader);
                    if (num2 == null) {
                        throw c.q("step", "step", reader);
                    }
                    i11 &= -33;
                    break;
                case 6:
                    num3 = this.intAdapter.fromJson(reader);
                    if (num3 == null) {
                        throw c.q("maxRange", "maxRange", reader);
                    }
                    i11 &= -65;
                    break;
                case 7:
                    commonControlSettings = this.nullableCommonControlSettingsAdapter.fromJson(reader);
                    break;
            }
        }
        reader.endObject();
        if (i11 == -121) {
            if (list == null) {
                throw c.j("points", "points", reader);
            }
            if (num4 == null) {
                throw c.j("min", "min", reader);
            }
            int intValue = num4.intValue();
            if (num5 == null) {
                throw c.j("max", "max", reader);
            }
            return new SliderWithLabelsV2DTO(list, intValue, num5.intValue(), a11.intValue(), num.intValue(), num2.intValue(), num3.intValue(), commonControlSettings);
        }
        Constructor<SliderWithLabelsV2DTO> constructor = this.constructorRef;
        if (constructor == null) {
            Class<?> cls = c.f34864d;
            Class cls2 = Integer.TYPE;
            constructor = SliderWithLabelsV2DTO.class.getDeclaredConstructor(List.class, cls2, cls2, cls2, cls2, cls2, cls2, CommonControlSettings.class, cls2, cls);
            this.constructorRef = constructor;
            Intrinsics.checkNotNullExpressionValue(constructor, "also(...)");
        }
        Constructor<SliderWithLabelsV2DTO> constructor2 = constructor;
        if (list == null) {
            throw c.j("points", "points", reader);
        }
        if (num4 == null) {
            throw c.j("min", "min", reader);
        }
        if (num5 == null) {
            throw c.j("max", "max", reader);
        }
        SliderWithLabelsV2DTO newInstance = constructor2.newInstance(list, num4, num5, a11, num, num2, num3, commonControlSettings, Integer.valueOf(i11), null);
        Intrinsics.checkNotNullExpressionValue(newInstance, "newInstance(...)");
        return newInstance;
    }

    @NotNull
    public String toString() {
        return Ak.b.c(43, "GeneratedJsonAdapter(SliderWithLabelsV2DTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, SliderWithLabelsV2DTO value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("points");
        this.listOfPointDTOAdapter.mo44toJson(writer, (x) value.getPoints());
        writer.w("min");
        this.intAdapter.mo44toJson(writer, (x) Integer.valueOf(value.getMin()));
        writer.w("max");
        this.intAdapter.mo44toJson(writer, (x) Integer.valueOf(value.getMax()));
        writer.w("initialMinValue");
        this.intAdapter.mo44toJson(writer, (x) Integer.valueOf(value.getInitialMinValue()));
        writer.w("initialMaxValue");
        this.intAdapter.mo44toJson(writer, (x) Integer.valueOf(value.getInitialMaxValue()));
        writer.w("step");
        this.intAdapter.mo44toJson(writer, (x) Integer.valueOf(value.getStep()));
        writer.w("maxRange");
        this.intAdapter.mo44toJson(writer, (x) Integer.valueOf(value.getMaxRange()));
        writer.w("common");
        this.nullableCommonControlSettingsAdapter.mo44toJson(writer, (x) value.getCommon());
        writer.p();
    }
}
