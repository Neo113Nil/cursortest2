package ru.ozon.app.android.travel.feature.oldwidgets.widgets.travelScrollPriceCalendar.v2.data;

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
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.M;
import kotlin.collections.e0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.travel.feature.oldwidgets.widgets.travelScrollPriceCalendar.v2.data.TravelScrollPriceCalendarV2DTO;
import ru.ozon.app.android.travel.molecules.dto.travelWidgetSettings.TravelWidgetSettingsDTO;
import ru.ozon.uni.atoms.parsing.adapter.annotation.EnumNullFallback;

@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R \u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001aR(\u0010\u001f\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u001d0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u001aR\u001a\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u001aR\u001c\u0010#\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\"0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\u001aR\u001e\u0010%\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&¨\u0006'"}, d2 = {"Lru/ozon/app/android/travel/feature/oldwidgets/widgets/travelScrollPriceCalendar/v2/data/TravelScrollPriceCalendarV2DTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/travel/feature/oldwidgets/widgets/travelScrollPriceCalendar/v2/data/TravelScrollPriceCalendarV2DTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/travel/feature/oldwidgets/widgets/travelScrollPriceCalendar/v2/data/TravelScrollPriceCalendarV2DTO;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/travel/feature/oldwidgets/widgets/travelScrollPriceCalendar/v2/data/TravelScrollPriceCalendarV2DTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "", "Lru/ozon/app/android/travel/feature/oldwidgets/widgets/travelScrollPriceCalendar/v2/data/TravelScrollPriceCalendarV2DTO$DateTabDTO;", "listOfDateTabDTOAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/travel/feature/oldwidgets/widgets/travelScrollPriceCalendar/v2/data/TravelScrollPriceCalendarV2DTO$AsyncBehaviorType;", "asyncBehaviorTypeAtEnumNullFallbackAdapter", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "nullableMapOfStringTokenizedTrackingInfoAdapter", "", "booleanAdapter", "Lru/ozon/app/android/travel/molecules/dto/travelWidgetSettings/TravelWidgetSettingsDTO;", "nullableTravelWidgetSettingsDTOAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "old-widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TravelScrollPriceCalendarV2DTOJsonAdapter extends JsonAdapter<TravelScrollPriceCalendarV2DTO> {

    @NotNull
    private final JsonAdapter<TravelScrollPriceCalendarV2DTO.AsyncBehaviorType> asyncBehaviorTypeAtEnumNullFallbackAdapter;

    @NotNull
    private final JsonAdapter<Boolean> booleanAdapter;
    private volatile Constructor<TravelScrollPriceCalendarV2DTO> constructorRef;

    @NotNull
    private final JsonAdapter<List<TravelScrollPriceCalendarV2DTO.DateTabDTO>> listOfDateTabDTOAdapter;

    @NotNull
    private final JsonAdapter<Map<String, TokenizedTrackingInfo>> nullableMapOfStringTokenizedTrackingInfoAdapter;

    @NotNull
    private final JsonAdapter<TravelWidgetSettingsDTO> nullableTravelWidgetSettingsDTOAdapter;

    @NotNull
    private final n.a options;

    public TravelScrollPriceCalendarV2DTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("dateTabs", "asyncBehaviorType", "viewTracking", "hasBackground", "tabSettings");
        b e11 = D.e(List.class, TravelScrollPriceCalendarV2DTO.DateTabDTO.class);
        M m11 = M.f71699a;
        this.listOfDateTabDTOAdapter = moshi.f(e11, m11, "dateTabs");
        this.asyncBehaviorTypeAtEnumNullFallbackAdapter = moshi.f(TravelScrollPriceCalendarV2DTO.AsyncBehaviorType.class, e0.h(new EnumNullFallback() { // from class: ru.ozon.app.android.travel.feature.oldwidgets.widgets.travelScrollPriceCalendar.v2.data.TravelScrollPriceCalendarV2DTOJsonAdapter$annotationImpl$ru_ozon_uni_atoms_parsing_adapter_annotation_EnumNullFallback$0
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
        }), "asyncBehaviorType");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter = moshi.f(D.e(Map.class, String.class, TokenizedTrackingInfo.class), m11, "viewTracking");
        this.booleanAdapter = moshi.f(Boolean.TYPE, m11, "hasBackground");
        this.nullableTravelWidgetSettingsDTOAdapter = moshi.f(TravelWidgetSettingsDTO.class, m11, "tabSettings");
    }

    @NotNull
    public String toString() {
        return Ak.b.c(52, "GeneratedJsonAdapter(TravelScrollPriceCalendarV2DTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public TravelScrollPriceCalendarV2DTO fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        Boolean bool = Boolean.FALSE;
        reader.beginObject();
        Boolean bool2 = bool;
        List<TravelScrollPriceCalendarV2DTO.DateTabDTO> list = null;
        TravelScrollPriceCalendarV2DTO.AsyncBehaviorType asyncBehaviorType = null;
        Map<String, TokenizedTrackingInfo> map = null;
        TravelWidgetSettingsDTO travelWidgetSettingsDTO = null;
        int i11 = -1;
        while (reader.hasNext()) {
            int v11 = reader.v(this.options);
            if (v11 == -1) {
                reader.y();
                reader.skipValue();
            } else if (v11 == 0) {
                list = this.listOfDateTabDTOAdapter.fromJson(reader);
                if (list == null) {
                    throw c.q("dateTabs", "dateTabs", reader);
                }
                i11 &= -2;
            } else if (v11 == 1) {
                asyncBehaviorType = this.asyncBehaviorTypeAtEnumNullFallbackAdapter.fromJson(reader);
                if (asyncBehaviorType == null) {
                    throw c.q("asyncBehaviorType", "asyncBehaviorType", reader);
                }
                i11 &= -3;
            } else if (v11 == 2) {
                map = this.nullableMapOfStringTokenizedTrackingInfoAdapter.fromJson(reader);
            } else if (v11 == 3) {
                bool2 = this.booleanAdapter.fromJson(reader);
                if (bool2 == null) {
                    throw c.q("hasBackground", "hasBackground", reader);
                }
                i11 &= -9;
            } else if (v11 == 4) {
                travelWidgetSettingsDTO = this.nullableTravelWidgetSettingsDTOAdapter.fromJson(reader);
                i11 &= -17;
            }
        }
        reader.endObject();
        if (i11 == -28) {
            Intrinsics.g(list, "null cannot be cast to non-null type kotlin.collections.List<ru.ozon.app.android.travel.feature.oldwidgets.widgets.travelScrollPriceCalendar.v2.data.TravelScrollPriceCalendarV2DTO.DateTabDTO>");
            Intrinsics.g(asyncBehaviorType, "null cannot be cast to non-null type ru.ozon.app.android.travel.feature.oldwidgets.widgets.travelScrollPriceCalendar.v2.data.TravelScrollPriceCalendarV2DTO.AsyncBehaviorType");
            return new TravelScrollPriceCalendarV2DTO(list, asyncBehaviorType, map, bool2.booleanValue(), travelWidgetSettingsDTO);
        }
        Constructor<TravelScrollPriceCalendarV2DTO> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = TravelScrollPriceCalendarV2DTO.class.getDeclaredConstructor(List.class, TravelScrollPriceCalendarV2DTO.AsyncBehaviorType.class, Map.class, Boolean.TYPE, TravelWidgetSettingsDTO.class, Integer.TYPE, c.f34864d);
            this.constructorRef = constructor;
            Intrinsics.checkNotNullExpressionValue(constructor, "also(...)");
        }
        TravelScrollPriceCalendarV2DTO newInstance = constructor.newInstance(list, asyncBehaviorType, map, bool2, travelWidgetSettingsDTO, Integer.valueOf(i11), null);
        Intrinsics.checkNotNullExpressionValue(newInstance, "newInstance(...)");
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, TravelScrollPriceCalendarV2DTO value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("dateTabs");
        this.listOfDateTabDTOAdapter.mo44toJson(writer, (x) value.getDateTabs());
        writer.w("asyncBehaviorType");
        this.asyncBehaviorTypeAtEnumNullFallbackAdapter.mo44toJson(writer, (x) value.getAsyncBehaviorType());
        writer.w("viewTracking");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter.mo44toJson(writer, (x) value.getViewTracking());
        writer.w("hasBackground");
        this.booleanAdapter.mo44toJson(writer, (x) Boolean.valueOf(value.getHasBackground()));
        writer.w("tabSettings");
        this.nullableTravelWidgetSettingsDTOAdapter.mo44toJson(writer, (x) value.getTabSettings());
        writer.p();
    }
}
