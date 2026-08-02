package ru.ozon.app.android.travel.feature.general.main.widgets.travelPassengersCountSelector.v1.data;

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
import kotlin.Metadata;
import kotlin.collections.M;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.general.main.widgets.travelPassengersCountSelector.v1.data.TravelQuantityCellDTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0018R \u0010\u001d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001c0\u001b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0018R\u001e\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"Lru/ozon/app/android/travel/feature/general/main/widgets/travelPassengersCountSelector/v1/data/TravelQuantityCellDTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/travel/feature/general/main/widgets/travelPassengersCountSelector/v1/data/TravelQuantityCellDTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/travel/feature/general/main/widgets/travelPassengersCountSelector/v1/data/TravelQuantityCellDTO;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/travel/feature/general/main/widgets/travelPassengersCountSelector/v1/data/TravelQuantityCellDTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "intAdapter", "", "Lru/ozon/app/android/travel/feature/general/main/widgets/travelPassengersCountSelector/v1/data/TravelQuantityCellDTO$RuleTag;", "listOfRuleTagAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TravelQuantityCellDTOJsonAdapter extends JsonAdapter<TravelQuantityCellDTO> {
    public static final int $stable = 8;
    private volatile Constructor<TravelQuantityCellDTO> constructorRef;

    @NotNull
    private final JsonAdapter<Integer> intAdapter;

    @NotNull
    private final JsonAdapter<List<TravelQuantityCellDTO.RuleTag>> listOfRuleTagAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<String> stringAdapter;

    public TravelQuantityCellDTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("id", SelectionItemFormDTO.TITLE_FIELD_NAME, "subtitle", "currentValue", "minValue", "maxValue", "tags", "dependsOn", "sumDependsOn");
        M m11 = M.f71699a;
        this.stringAdapter = moshi.f(String.class, m11, "id");
        this.intAdapter = moshi.f(Integer.TYPE, m11, "currentValue");
        this.listOfRuleTagAdapter = moshi.f(D.e(List.class, TravelQuantityCellDTO.RuleTag.class), m11, "tags");
    }

    @NotNull
    public String toString() {
        return b.c(43, "GeneratedJsonAdapter(TravelQuantityCellDTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public TravelQuantityCellDTO fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        int i11 = -1;
        String str = null;
        String str2 = null;
        String str3 = null;
        Integer num = null;
        Integer num2 = null;
        Integer num3 = null;
        List<TravelQuantityCellDTO.RuleTag> list = null;
        List<TravelQuantityCellDTO.RuleTag> list2 = null;
        List<TravelQuantityCellDTO.RuleTag> list3 = null;
        while (true) {
            String str4 = str;
            String str5 = str2;
            String str6 = str3;
            if (!reader.hasNext()) {
                Integer num4 = num;
                reader.endObject();
                if (i11 == -385) {
                    if (str4 == null) {
                        throw c.j("id", "id", reader);
                    }
                    if (str5 == null) {
                        throw c.j(SelectionItemFormDTO.TITLE_FIELD_NAME, SelectionItemFormDTO.TITLE_FIELD_NAME, reader);
                    }
                    if (str6 == null) {
                        throw c.j("subtitle", "subtitle", reader);
                    }
                    if (num4 == null) {
                        throw c.j("currentValue", "currentValue", reader);
                    }
                    Integer num5 = num2;
                    int intValue = num4.intValue();
                    if (num5 == null) {
                        throw c.j("minValue", "minValue", reader);
                    }
                    Integer num6 = num3;
                    int intValue2 = num5.intValue();
                    if (num6 == null) {
                        throw c.j("maxValue", "maxValue", reader);
                    }
                    List<TravelQuantityCellDTO.RuleTag> list4 = list;
                    int intValue3 = num6.intValue();
                    if (list4 == null) {
                        throw c.j("tags", "tags", reader);
                    }
                    Intrinsics.g(list2, "null cannot be cast to non-null type kotlin.collections.List<ru.ozon.app.android.travel.feature.general.main.widgets.travelPassengersCountSelector.v1.data.TravelQuantityCellDTO.RuleTag>");
                    Intrinsics.g(list3, "null cannot be cast to non-null type kotlin.collections.List<ru.ozon.app.android.travel.feature.general.main.widgets.travelPassengersCountSelector.v1.data.TravelQuantityCellDTO.RuleTag>");
                    return new TravelQuantityCellDTO(str4, str5, str6, intValue, intValue2, intValue3, list4, list2, list3);
                }
                Integer num7 = num2;
                Integer num8 = num3;
                Constructor<TravelQuantityCellDTO> constructor = this.constructorRef;
                if (constructor == null) {
                    Class<?> cls = c.f34864d;
                    Class cls2 = Integer.TYPE;
                    constructor = TravelQuantityCellDTO.class.getDeclaredConstructor(String.class, String.class, String.class, cls2, cls2, cls2, List.class, List.class, List.class, cls2, cls);
                    this.constructorRef = constructor;
                    Intrinsics.checkNotNullExpressionValue(constructor, "also(...)");
                }
                if (str4 == null) {
                    throw c.j("id", "id", reader);
                }
                if (str5 == null) {
                    throw c.j(SelectionItemFormDTO.TITLE_FIELD_NAME, SelectionItemFormDTO.TITLE_FIELD_NAME, reader);
                }
                if (str6 == null) {
                    throw c.j("subtitle", "subtitle", reader);
                }
                if (num4 == null) {
                    throw c.j("currentValue", "currentValue", reader);
                }
                if (num7 == null) {
                    throw c.j("minValue", "minValue", reader);
                }
                if (num8 == null) {
                    throw c.j("maxValue", "maxValue", reader);
                }
                if (list == null) {
                    throw c.j("tags", "tags", reader);
                }
                TravelQuantityCellDTO newInstance = constructor.newInstance(str4, str5, str6, num4, num7, num8, list, list2, list3, Integer.valueOf(i11), null);
                Intrinsics.checkNotNullExpressionValue(newInstance, "newInstance(...)");
                return newInstance;
            }
            Integer num9 = num;
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    num = num9;
                    str = str4;
                    str2 = str5;
                    str3 = str6;
                case 0:
                    str = this.stringAdapter.fromJson(reader);
                    if (str == null) {
                        throw c.q("id", "id", reader);
                    }
                    num = num9;
                    str2 = str5;
                    str3 = str6;
                case 1:
                    str2 = this.stringAdapter.fromJson(reader);
                    if (str2 == null) {
                        throw c.q(SelectionItemFormDTO.TITLE_FIELD_NAME, SelectionItemFormDTO.TITLE_FIELD_NAME, reader);
                    }
                    num = num9;
                    str = str4;
                    str3 = str6;
                case 2:
                    str3 = this.stringAdapter.fromJson(reader);
                    if (str3 == null) {
                        throw c.q("subtitle", "subtitle", reader);
                    }
                    num = num9;
                    str = str4;
                    str2 = str5;
                case 3:
                    num = this.intAdapter.fromJson(reader);
                    if (num == null) {
                        throw c.q("currentValue", "currentValue", reader);
                    }
                    str = str4;
                    str2 = str5;
                    str3 = str6;
                case 4:
                    num2 = this.intAdapter.fromJson(reader);
                    if (num2 == null) {
                        throw c.q("minValue", "minValue", reader);
                    }
                    num = num9;
                    str = str4;
                    str2 = str5;
                    str3 = str6;
                case 5:
                    num3 = this.intAdapter.fromJson(reader);
                    if (num3 == null) {
                        throw c.q("maxValue", "maxValue", reader);
                    }
                    num = num9;
                    str = str4;
                    str2 = str5;
                    str3 = str6;
                case 6:
                    list = this.listOfRuleTagAdapter.fromJson(reader);
                    if (list == null) {
                        throw c.q("tags", "tags", reader);
                    }
                    num = num9;
                    str = str4;
                    str2 = str5;
                    str3 = str6;
                case 7:
                    list2 = this.listOfRuleTagAdapter.fromJson(reader);
                    if (list2 == null) {
                        throw c.q("dependsOn", "dependsOn", reader);
                    }
                    i11 &= -129;
                    num = num9;
                    str = str4;
                    str2 = str5;
                    str3 = str6;
                case 8:
                    list3 = this.listOfRuleTagAdapter.fromJson(reader);
                    if (list3 == null) {
                        throw c.q("sumDependsOn", "sumDependsOn", reader);
                    }
                    i11 &= -257;
                    num = num9;
                    str = str4;
                    str2 = str5;
                    str3 = str6;
                default:
                    num = num9;
                    str = str4;
                    str2 = str5;
                    str3 = str6;
            }
        }
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, TravelQuantityCellDTO value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("id");
        this.stringAdapter.mo44toJson(writer, (x) value.getId());
        writer.w(SelectionItemFormDTO.TITLE_FIELD_NAME);
        this.stringAdapter.mo44toJson(writer, (x) value.getTitle());
        writer.w("subtitle");
        this.stringAdapter.mo44toJson(writer, (x) value.getSubtitle());
        writer.w("currentValue");
        this.intAdapter.mo44toJson(writer, (x) Integer.valueOf(value.getCurrentValue()));
        writer.w("minValue");
        this.intAdapter.mo44toJson(writer, (x) Integer.valueOf(value.getMinValue()));
        writer.w("maxValue");
        this.intAdapter.mo44toJson(writer, (x) Integer.valueOf(value.getMaxValue()));
        writer.w("tags");
        this.listOfRuleTagAdapter.mo44toJson(writer, (x) value.getTags());
        writer.w("dependsOn");
        this.listOfRuleTagAdapter.mo44toJson(writer, (x) value.getDependsOn());
        writer.w("sumDependsOn");
        this.listOfRuleTagAdapter.mo44toJson(writer, (x) value.getSumDependsOn());
        writer.p();
    }
}
