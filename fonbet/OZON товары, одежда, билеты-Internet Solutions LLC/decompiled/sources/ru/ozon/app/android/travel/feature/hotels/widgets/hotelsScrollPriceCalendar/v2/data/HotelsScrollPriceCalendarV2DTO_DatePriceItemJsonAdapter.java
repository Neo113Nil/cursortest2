package ru.ozon.app.android.travel.feature.hotels.widgets.hotelsScrollPriceCalendar.v2.data;

import Ak.b;
import Y9.c;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.n;
import com.squareup.moshi.x;
import kotlin.Metadata;
import kotlin.collections.M;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsScrollPriceCalendar.v2.data.HotelsScrollPriceCalendarV2DTO;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0019R\u001c\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0019R\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0019R\u001c\u0010 \u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u0019R\u001c\u0010\"\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010!0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u0019¨\u0006#"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsScrollPriceCalendar/v2/data/HotelsScrollPriceCalendarV2DTO_DatePriceItemJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsScrollPriceCalendar/v2/data/HotelsScrollPriceCalendarV2DTO$DatePriceItem;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsScrollPriceCalendar/v2/data/HotelsScrollPriceCalendarV2DTO$DatePriceItem;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsScrollPriceCalendar/v2/data/HotelsScrollPriceCalendarV2DTO$DatePriceItem;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "Lru/ozon/uni/atoms/data/text/TextDTO;", "textDTOAdapter", "Lcom/squareup/moshi/JsonAdapter;", "nullableTextDTOAdapter", "", "nullableBooleanAdapter", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsScrollPriceCalendar/v2/data/HotelsScrollPriceCalendarV2DTO$DatePriceItem$Background;", "backgroundAdapter", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "nullableBadgeDTOAdapter", "Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "nullableCommonControlSettingsAdapter", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class HotelsScrollPriceCalendarV2DTO_DatePriceItemJsonAdapter extends JsonAdapter<HotelsScrollPriceCalendarV2DTO.DatePriceItem> {
    public static final int $stable = 8;

    @NotNull
    private final JsonAdapter<HotelsScrollPriceCalendarV2DTO.DatePriceItem.Background> backgroundAdapter;

    @NotNull
    private final JsonAdapter<BadgeDTO> nullableBadgeDTOAdapter;

    @NotNull
    private final JsonAdapter<Boolean> nullableBooleanAdapter;

    @NotNull
    private final JsonAdapter<CommonControlSettings> nullableCommonControlSettingsAdapter;

    @NotNull
    private final JsonAdapter<TextDTO> nullableTextDTOAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<TextDTO> textDTOAdapter;

    public HotelsScrollPriceCalendarV2DTO_DatePriceItemJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("weekdaysInterval", "dateInterval", "price", "isLoading", "background", "badge", "common");
        M m11 = M.f71699a;
        this.textDTOAdapter = moshi.f(TextDTO.class, m11, "weekdaysInterval");
        this.nullableTextDTOAdapter = moshi.f(TextDTO.class, m11, "price");
        this.nullableBooleanAdapter = moshi.f(Boolean.class, m11, "isLoading");
        this.backgroundAdapter = moshi.f(HotelsScrollPriceCalendarV2DTO.DatePriceItem.Background.class, m11, "background");
        this.nullableBadgeDTOAdapter = moshi.f(BadgeDTO.class, m11, "badge");
        this.nullableCommonControlSettingsAdapter = moshi.f(CommonControlSettings.class, m11, "common");
    }

    @NotNull
    public String toString() {
        return b.c(66, "GeneratedJsonAdapter(HotelsScrollPriceCalendarV2DTO.DatePriceItem)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public HotelsScrollPriceCalendarV2DTO.DatePriceItem fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        TextDTO textDTO = null;
        TextDTO textDTO2 = null;
        TextDTO textDTO3 = null;
        Boolean bool = null;
        HotelsScrollPriceCalendarV2DTO.DatePriceItem.Background background = null;
        BadgeDTO badgeDTO = null;
        CommonControlSettings commonControlSettings = null;
        while (reader.hasNext()) {
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    break;
                case 0:
                    textDTO = this.textDTOAdapter.fromJson(reader);
                    if (textDTO == null) {
                        throw c.q("weekdaysInterval", "weekdaysInterval", reader);
                    }
                    break;
                case 1:
                    textDTO2 = this.textDTOAdapter.fromJson(reader);
                    if (textDTO2 == null) {
                        throw c.q("dateInterval", "dateInterval", reader);
                    }
                    break;
                case 2:
                    textDTO3 = this.nullableTextDTOAdapter.fromJson(reader);
                    break;
                case 3:
                    bool = this.nullableBooleanAdapter.fromJson(reader);
                    break;
                case 4:
                    background = this.backgroundAdapter.fromJson(reader);
                    if (background == null) {
                        throw c.q("background", "background", reader);
                    }
                    break;
                case 5:
                    badgeDTO = this.nullableBadgeDTOAdapter.fromJson(reader);
                    break;
                case 6:
                    commonControlSettings = this.nullableCommonControlSettingsAdapter.fromJson(reader);
                    break;
            }
        }
        reader.endObject();
        if (textDTO == null) {
            throw c.j("weekdaysInterval", "weekdaysInterval", reader);
        }
        if (textDTO2 == null) {
            throw c.j("dateInterval", "dateInterval", reader);
        }
        if (background != null) {
            return new HotelsScrollPriceCalendarV2DTO.DatePriceItem(textDTO, textDTO2, textDTO3, bool, background, badgeDTO, commonControlSettings);
        }
        throw c.j("background", "background", reader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, HotelsScrollPriceCalendarV2DTO.DatePriceItem value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("weekdaysInterval");
        this.textDTOAdapter.mo44toJson(writer, (x) value.getWeekdaysInterval());
        writer.w("dateInterval");
        this.textDTOAdapter.mo44toJson(writer, (x) value.getDateInterval());
        writer.w("price");
        this.nullableTextDTOAdapter.mo44toJson(writer, (x) value.getPrice());
        writer.w("isLoading");
        this.nullableBooleanAdapter.mo44toJson(writer, (x) value.isLoading());
        writer.w("background");
        this.backgroundAdapter.mo44toJson(writer, (x) value.getBackground());
        writer.w("badge");
        this.nullableBadgeDTOAdapter.mo44toJson(writer, (x) value.getBadge());
        writer.w("common");
        this.nullableCommonControlSettingsAdapter.mo44toJson(writer, (x) value.getCommon());
        writer.p();
    }
}
