package ru.ozon.app.android.travel.molecules.dto.calendar;

import Ak.b;
import C.o0;
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
import ru.ozon.app.android.travel.molecules.dto.calendar.CalendarDTO;

@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001c\u0010\u0019\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0018R\"\u0010\u001c\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0018R(\u0010\u001f\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u001d0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0018R\u001a\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u0018R\"\u0010#\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\"\u0018\u00010\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\u0018R\u001e\u0010%\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&¨\u0006'"}, d2 = {"Lru/ozon/app/android/travel/molecules/dto/calendar/CalendarDTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/travel/molecules/dto/calendar/CalendarDTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/travel/molecules/dto/calendar/CalendarDTO;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/travel/molecules/dto/calendar/CalendarDTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "nullableStringAdapter", "", "Lru/ozon/app/android/travel/molecules/dto/calendar/CalendarDTO$DateItemDTO;", "nullableListOfDateItemDTOAdapter", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "nullableMapOfStringTokenizedTrackingInfoAdapter", "", "intAdapter", "Lru/ozon/app/android/travel/molecules/dto/calendar/CalendarDTO$PriceCategoryColorDTO;", "nullableListOfPriceCategoryColorDTOAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "molecules_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class CalendarDTOJsonAdapter extends JsonAdapter<CalendarDTO> {
    private volatile Constructor<CalendarDTO> constructorRef;

    @NotNull
    private final JsonAdapter<Integer> intAdapter;

    @NotNull
    private final JsonAdapter<List<CalendarDTO.DateItemDTO>> nullableListOfDateItemDTOAdapter;

    @NotNull
    private final JsonAdapter<List<CalendarDTO.PriceCategoryColorDTO>> nullableListOfPriceCategoryColorDTOAdapter;

    @NotNull
    private final JsonAdapter<Map<String, TokenizedTrackingInfo>> nullableMapOfStringTokenizedTrackingInfoAdapter;

    @NotNull
    private final JsonAdapter<String> nullableStringAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<String> stringAdapter;

    public CalendarDTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("startShownDate", "endShownDate", "minAvailableDate", "maxAvailableDate", "startSelectedDate", "endSelectedDate", "dateItems", "dateTrackingInfo", "countDayRound", "priceCategoryColors", "preScrollDate");
        M m11 = M.f71699a;
        this.stringAdapter = moshi.f(String.class, m11, "startShownDate");
        this.nullableStringAdapter = moshi.f(String.class, m11, "minAvailableDate");
        this.nullableListOfDateItemDTOAdapter = moshi.f(D.e(List.class, CalendarDTO.DateItemDTO.class), m11, "dateItems");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter = moshi.f(D.e(Map.class, String.class, TokenizedTrackingInfo.class), m11, "dateTrackingInfo");
        this.intAdapter = moshi.f(Integer.TYPE, m11, "countDayRound");
        this.nullableListOfPriceCategoryColorDTOAdapter = moshi.f(D.e(List.class, CalendarDTO.PriceCategoryColorDTO.class), m11, "priceCategoryColors");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public CalendarDTO fromJson(@NotNull n reader) {
        String str;
        String str2 = null;
        Integer a11 = o0.a(reader, "reader", 0);
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        List<CalendarDTO.DateItemDTO> list = null;
        Map<String, TokenizedTrackingInfo> map = null;
        List<CalendarDTO.PriceCategoryColorDTO> list2 = null;
        String str7 = null;
        int i11 = -1;
        String str8 = null;
        while (true) {
            String str9 = str3;
            if (!reader.hasNext()) {
                reader.endObject();
                if (i11 == -257) {
                    if (str9 == null) {
                        throw c.j("startShownDate", "startShownDate", reader);
                    }
                    if (str2 != null) {
                        return new CalendarDTO(str9, str2, str8, str4, str5, str6, list, map, a11.intValue(), list2, str7);
                    }
                    throw c.j("endShownDate", "endShownDate", reader);
                }
                Constructor<CalendarDTO> constructor = this.constructorRef;
                if (constructor == null) {
                    Class<?> cls = c.f34864d;
                    Class cls2 = Integer.TYPE;
                    str = str2;
                    constructor = CalendarDTO.class.getDeclaredConstructor(String.class, String.class, String.class, String.class, String.class, String.class, List.class, Map.class, cls2, List.class, String.class, cls2, cls);
                    this.constructorRef = constructor;
                    Intrinsics.checkNotNullExpressionValue(constructor, "also(...)");
                } else {
                    str = str2;
                }
                if (str9 == null) {
                    throw c.j("startShownDate", "startShownDate", reader);
                }
                if (str == null) {
                    throw c.j("endShownDate", "endShownDate", reader);
                }
                Integer valueOf = Integer.valueOf(i11);
                String str10 = str6;
                Map<String, TokenizedTrackingInfo> map2 = map;
                String str11 = str5;
                String str12 = str;
                CalendarDTO newInstance = constructor.newInstance(str9, str12, str8, str4, str11, str10, list, map2, a11, list2, str7, valueOf, null);
                Intrinsics.checkNotNullExpressionValue(newInstance, "newInstance(...)");
                return newInstance;
            }
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    break;
                case 0:
                    str3 = this.stringAdapter.fromJson(reader);
                    if (str3 == null) {
                        throw c.q("startShownDate", "startShownDate", reader);
                    }
                    continue;
                case 1:
                    str2 = this.stringAdapter.fromJson(reader);
                    if (str2 == null) {
                        throw c.q("endShownDate", "endShownDate", reader);
                    }
                    break;
                case 2:
                    str8 = this.nullableStringAdapter.fromJson(reader);
                    break;
                case 3:
                    str4 = this.nullableStringAdapter.fromJson(reader);
                    break;
                case 4:
                    str5 = this.nullableStringAdapter.fromJson(reader);
                    break;
                case 5:
                    str6 = this.nullableStringAdapter.fromJson(reader);
                    break;
                case 6:
                    list = this.nullableListOfDateItemDTOAdapter.fromJson(reader);
                    break;
                case 7:
                    map = this.nullableMapOfStringTokenizedTrackingInfoAdapter.fromJson(reader);
                    break;
                case 8:
                    a11 = this.intAdapter.fromJson(reader);
                    if (a11 == null) {
                        throw c.q("countDayRound", "countDayRound", reader);
                    }
                    str3 = str9;
                    i11 = -257;
                    continue;
                case 9:
                    list2 = this.nullableListOfPriceCategoryColorDTOAdapter.fromJson(reader);
                    break;
                case 10:
                    str7 = this.nullableStringAdapter.fromJson(reader);
                    break;
            }
            str3 = str9;
        }
    }

    @NotNull
    public String toString() {
        return b.c(33, "GeneratedJsonAdapter(CalendarDTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, CalendarDTO value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("startShownDate");
        this.stringAdapter.mo44toJson(writer, (x) value.getStartShownDate());
        writer.w("endShownDate");
        this.stringAdapter.mo44toJson(writer, (x) value.getEndShownDate());
        writer.w("minAvailableDate");
        this.nullableStringAdapter.mo44toJson(writer, (x) value.getMinAvailableDate());
        writer.w("maxAvailableDate");
        this.nullableStringAdapter.mo44toJson(writer, (x) value.getMaxAvailableDate());
        writer.w("startSelectedDate");
        this.nullableStringAdapter.mo44toJson(writer, (x) value.getStartSelectedDate());
        writer.w("endSelectedDate");
        this.nullableStringAdapter.mo44toJson(writer, (x) value.getEndSelectedDate());
        writer.w("dateItems");
        this.nullableListOfDateItemDTOAdapter.mo44toJson(writer, (x) value.getDateItems());
        writer.w("dateTrackingInfo");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter.mo44toJson(writer, (x) value.getDateTrackingInfo());
        writer.w("countDayRound");
        this.intAdapter.mo44toJson(writer, (x) Integer.valueOf(value.getCountDayRound()));
        writer.w("priceCategoryColors");
        this.nullableListOfPriceCategoryColorDTOAdapter.mo44toJson(writer, (x) value.getPriceCategoryColors());
        writer.w("preScrollDate");
        this.nullableStringAdapter.mo44toJson(writer, (x) value.getPreScrollDate());
        writer.p();
    }
}
