package ru.ozon.app.android.travel.molecules.dto.calendar;

import Ak.b;
import Y9.c;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.n;
import com.squareup.moshi.x;
import kotlin.Metadata;
import kotlin.collections.M;
import kotlin.collections.e0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.molecules.dto.calendar.CalendarDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.parsing.adapter.annotation.EnumNullFallback;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001c\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0018R\u001c\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0018R\u001c\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001d0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0018R\u001c\u0010 \u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u0018¨\u0006!"}, d2 = {"Lru/ozon/app/android/travel/molecules/dto/calendar/CalendarDTO_DateItemDTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/travel/molecules/dto/calendar/CalendarDTO$DateItemDTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/travel/molecules/dto/calendar/CalendarDTO$DateItemDTO;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/travel/molecules/dto/calendar/CalendarDTO$DateItemDTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "nullableFloatAdapter", "", "nullableBooleanAdapter", "Lru/ozon/app/android/travel/molecules/dto/calendar/CalendarDTO$PriceCategory;", "nullablePriceCategoryAtEnumNullFallbackAdapter", "Lru/ozon/uni/atoms/data/text/TextDTO;", "nullableTextDTOAdapter", "molecules_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class CalendarDTO_DateItemDTOJsonAdapter extends JsonAdapter<CalendarDTO.DateItemDTO> {

    @NotNull
    private final JsonAdapter<Boolean> nullableBooleanAdapter;

    @NotNull
    private final JsonAdapter<Float> nullableFloatAdapter;

    @NotNull
    private final JsonAdapter<CalendarDTO.PriceCategory> nullablePriceCategoryAtEnumNullFallbackAdapter;

    @NotNull
    private final JsonAdapter<TextDTO> nullableTextDTOAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<String> stringAdapter;

    public CalendarDTO_DateItemDTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("date", "price", "isMin", "isDisabled", "priceCategory", "text", "isWorkday");
        M m11 = M.f71699a;
        this.stringAdapter = moshi.f(String.class, m11, "date");
        this.nullableFloatAdapter = moshi.f(Float.class, m11, "price");
        this.nullableBooleanAdapter = moshi.f(Boolean.class, m11, "isMin");
        this.nullablePriceCategoryAtEnumNullFallbackAdapter = moshi.f(CalendarDTO.PriceCategory.class, e0.h(new EnumNullFallback() { // from class: ru.ozon.app.android.travel.molecules.dto.calendar.CalendarDTO_DateItemDTOJsonAdapter$annotationImpl$ru_ozon_uni_atoms_parsing_adapter_annotation_EnumNullFallback$0
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
        }), "priceCategory");
        this.nullableTextDTOAdapter = moshi.f(TextDTO.class, m11, "text");
    }

    @NotNull
    public String toString() {
        return b.c(45, "GeneratedJsonAdapter(CalendarDTO.DateItemDTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public CalendarDTO.DateItemDTO fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        String str = null;
        Float f7 = null;
        Boolean bool = null;
        Boolean bool2 = null;
        CalendarDTO.PriceCategory priceCategory = null;
        TextDTO textDTO = null;
        Boolean bool3 = null;
        while (reader.hasNext()) {
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    break;
                case 0:
                    str = this.stringAdapter.fromJson(reader);
                    if (str == null) {
                        throw c.q("date", "date", reader);
                    }
                    break;
                case 1:
                    f7 = this.nullableFloatAdapter.fromJson(reader);
                    break;
                case 2:
                    bool = this.nullableBooleanAdapter.fromJson(reader);
                    break;
                case 3:
                    bool2 = this.nullableBooleanAdapter.fromJson(reader);
                    break;
                case 4:
                    priceCategory = this.nullablePriceCategoryAtEnumNullFallbackAdapter.fromJson(reader);
                    break;
                case 5:
                    textDTO = this.nullableTextDTOAdapter.fromJson(reader);
                    break;
                case 6:
                    bool3 = this.nullableBooleanAdapter.fromJson(reader);
                    break;
            }
        }
        reader.endObject();
        if (str != null) {
            return new CalendarDTO.DateItemDTO(str, f7, bool, bool2, priceCategory, textDTO, bool3);
        }
        throw c.j("date", "date", reader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, CalendarDTO.DateItemDTO value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("date");
        this.stringAdapter.mo44toJson(writer, (x) value.getDate());
        writer.w("price");
        this.nullableFloatAdapter.mo44toJson(writer, (x) value.getPrice());
        writer.w("isMin");
        this.nullableBooleanAdapter.mo44toJson(writer, (x) value.isMin());
        writer.w("isDisabled");
        this.nullableBooleanAdapter.mo44toJson(writer, (x) value.isDisabled());
        writer.w("priceCategory");
        this.nullablePriceCategoryAtEnumNullFallbackAdapter.mo44toJson(writer, (x) value.getPriceCategory());
        writer.w("text");
        this.nullableTextDTOAdapter.mo44toJson(writer, (x) value.getText());
        writer.w("isWorkday");
        this.nullableBooleanAdapter.mo44toJson(writer, (x) value.isWorkday());
        writer.p();
    }
}
