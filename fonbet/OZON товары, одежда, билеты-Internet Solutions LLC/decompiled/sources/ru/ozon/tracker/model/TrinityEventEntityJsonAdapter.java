package ru.ozon.tracker.model;

import Ak.b;
import Y9.c;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.n;
import com.squareup.moshi.x;
import java.lang.reflect.Constructor;
import kotlin.Metadata;
import kotlin.collections.M;
import kotlin.collections.e0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.joda.time.DateTime;
import ru.ozon.tracker.network.serializing.date.DateTimeWithMs;
import ru.ozon.tracker.sendEvent.Cell;

@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0018R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00190\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0018R\u001c\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0018R\u001c\u0010\u001f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0018R\u001c\u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010 0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u0018R\u001c\u0010#\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\"0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\u0018R\u001c\u0010$\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010\u0018R\u001e\u0010&\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'¨\u0006("}, d2 = {"Lru/ozon/tracker/model/TrinityEventEntityJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/tracker/model/TrinityEventEntity;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/tracker/model/TrinityEventEntity;", "Lcom/squareup/moshi/x;", "writer", "value_", "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/tracker/model/TrinityEventEntity;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "nullableStringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lorg/joda/time/DateTime;", "dateTimeAdapter", "dateTimeAtDateTimeWithMsAdapter", "Lru/ozon/tracker/model/TrinityAttributes;", "nullableTrinityAttributesAdapter", "Lru/ozon/tracker/model/TrinityPage;", "nullableTrinityPageAdapter", "Lru/ozon/tracker/sendEvent/Cell$CustomCell;", "nullableCustomCellAdapter", "Lru/ozon/tracker/model/TrinityUser;", "nullableTrinityUserAdapter", "nullableDateTimeAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "tracker-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class TrinityEventEntityJsonAdapter extends JsonAdapter<TrinityEventEntity> {
    private volatile Constructor<TrinityEventEntity> constructorRef;

    @NotNull
    private final JsonAdapter<DateTime> dateTimeAdapter;

    @NotNull
    private final JsonAdapter<DateTime> dateTimeAtDateTimeWithMsAdapter;

    @NotNull
    private final JsonAdapter<Cell.CustomCell> nullableCustomCellAdapter;

    @NotNull
    private final JsonAdapter<DateTime> nullableDateTimeAdapter;

    @NotNull
    private final JsonAdapter<String> nullableStringAdapter;

    @NotNull
    private final JsonAdapter<TrinityAttributes> nullableTrinityAttributesAdapter;

    @NotNull
    private final JsonAdapter<TrinityPage> nullableTrinityPageAdapter;

    @NotNull
    private final JsonAdapter<TrinityUser> nullableTrinityUserAdapter;

    @NotNull
    private final n.a options;

    public TrinityEventEntityJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        n.a a11 = n.a.C0918a.a("uuid", "number", "timestamp", "timestampMs", TrinityEventEntityKt.ACTION_TYPE_JSON_NAME, TrinityEventEntityKt.TRACK_CAMPAIGN_UUID_JSON_NAME, "attributes", "page", "pageToken", "custom", "widgetToken", "sliceToken", "cellToken", "userToken", "user", "pageTimestamp");
        Intrinsics.checkNotNullExpressionValue(a11, "of(...)");
        this.options = a11;
        M m11 = M.f71699a;
        JsonAdapter<String> f7 = moshi.f(String.class, m11, "uuid");
        Intrinsics.checkNotNullExpressionValue(f7, "adapter(...)");
        this.nullableStringAdapter = f7;
        JsonAdapter<DateTime> f11 = moshi.f(DateTime.class, m11, "timestamp");
        Intrinsics.checkNotNullExpressionValue(f11, "adapter(...)");
        this.dateTimeAdapter = f11;
        JsonAdapter<DateTime> f12 = moshi.f(DateTime.class, e0.h(new DateTimeWithMs() { // from class: ru.ozon.tracker.model.TrinityEventEntityJsonAdapter$annotationImpl$ru_ozon_tracker_network_serializing_date_DateTimeWithMs$0
            @Override // java.lang.annotation.Annotation
            public final /* synthetic */ Class annotationType() {
                return DateTimeWithMs.class;
            }

            @Override // java.lang.annotation.Annotation
            public final boolean equals(Object obj) {
                return obj instanceof DateTimeWithMs;
            }

            @Override // java.lang.annotation.Annotation
            public final int hashCode() {
                return 0;
            }

            @Override // java.lang.annotation.Annotation
            @NotNull
            public final String toString() {
                return "@ru.ozon.tracker.network.serializing.date.DateTimeWithMs()";
            }
        }), "timestampMs");
        Intrinsics.checkNotNullExpressionValue(f12, "adapter(...)");
        this.dateTimeAtDateTimeWithMsAdapter = f12;
        JsonAdapter<TrinityAttributes> f13 = moshi.f(TrinityAttributes.class, m11, "attributes");
        Intrinsics.checkNotNullExpressionValue(f13, "adapter(...)");
        this.nullableTrinityAttributesAdapter = f13;
        JsonAdapter<TrinityPage> f14 = moshi.f(TrinityPage.class, m11, "page");
        Intrinsics.checkNotNullExpressionValue(f14, "adapter(...)");
        this.nullableTrinityPageAdapter = f14;
        JsonAdapter<Cell.CustomCell> f15 = moshi.f(Cell.CustomCell.class, m11, "custom");
        Intrinsics.checkNotNullExpressionValue(f15, "adapter(...)");
        this.nullableCustomCellAdapter = f15;
        JsonAdapter<TrinityUser> f16 = moshi.f(TrinityUser.class, m11, "user");
        Intrinsics.checkNotNullExpressionValue(f16, "adapter(...)");
        this.nullableTrinityUserAdapter = f16;
        JsonAdapter<DateTime> f17 = moshi.f(DateTime.class, m11, "pageTimestamp");
        Intrinsics.checkNotNullExpressionValue(f17, "adapter(...)");
        this.nullableDateTimeAdapter = f17;
    }

    @NotNull
    public String toString() {
        return b.c(40, "GeneratedJsonAdapter(TrinityEventEntity)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public TrinityEventEntity fromJson(@NotNull n reader) {
        String str;
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        int i11 = -1;
        String str2 = null;
        String str3 = null;
        DateTime dateTime = null;
        DateTime dateTime2 = null;
        String str4 = null;
        String str5 = null;
        TrinityAttributes trinityAttributes = null;
        TrinityPage trinityPage = null;
        String str6 = null;
        Cell.CustomCell customCell = null;
        String str7 = null;
        String str8 = null;
        String str9 = null;
        String str10 = null;
        TrinityUser trinityUser = null;
        DateTime dateTime3 = null;
        while (reader.hasNext()) {
            String str11 = str2;
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    break;
                case 0:
                    str2 = this.nullableStringAdapter.fromJson(reader);
                    i11 &= -2;
                    continue;
                case 1:
                    str3 = this.nullableStringAdapter.fromJson(reader);
                    i11 &= -3;
                    break;
                case 2:
                    dateTime = this.dateTimeAdapter.fromJson(reader);
                    if (dateTime == null) {
                        throw c.q("timestamp", "timestamp", reader);
                    }
                    break;
                case 3:
                    dateTime2 = this.dateTimeAtDateTimeWithMsAdapter.fromJson(reader);
                    if (dateTime2 == null) {
                        throw c.q("timestampMs", "timestampMs", reader);
                    }
                    break;
                case 4:
                    str4 = this.nullableStringAdapter.fromJson(reader);
                    break;
                case 5:
                    str5 = this.nullableStringAdapter.fromJson(reader);
                    i11 &= -33;
                    break;
                case 6:
                    trinityAttributes = this.nullableTrinityAttributesAdapter.fromJson(reader);
                    i11 &= -65;
                    break;
                case 7:
                    trinityPage = this.nullableTrinityPageAdapter.fromJson(reader);
                    i11 &= -129;
                    break;
                case 8:
                    str6 = this.nullableStringAdapter.fromJson(reader);
                    i11 &= -257;
                    break;
                case 9:
                    customCell = this.nullableCustomCellAdapter.fromJson(reader);
                    i11 &= -513;
                    break;
                case 10:
                    str7 = this.nullableStringAdapter.fromJson(reader);
                    i11 &= -1025;
                    break;
                case 11:
                    str8 = this.nullableStringAdapter.fromJson(reader);
                    i11 &= -2049;
                    break;
                case 12:
                    str9 = this.nullableStringAdapter.fromJson(reader);
                    i11 &= -4097;
                    break;
                case 13:
                    str10 = this.nullableStringAdapter.fromJson(reader);
                    i11 &= -8193;
                    break;
                case 14:
                    trinityUser = this.nullableTrinityUserAdapter.fromJson(reader);
                    i11 &= -16385;
                    break;
                case 15:
                    dateTime3 = this.nullableDateTimeAdapter.fromJson(reader);
                    i11 &= -32769;
                    break;
            }
            str2 = str11;
        }
        String str12 = str2;
        reader.endObject();
        if (i11 == -65508) {
            if (dateTime == null) {
                throw c.j("timestamp", "timestamp", reader);
            }
            if (dateTime2 == null) {
                throw c.j("timestampMs", "timestampMs", reader);
            }
            String str13 = str6;
            TrinityPage trinityPage2 = trinityPage;
            TrinityAttributes trinityAttributes2 = trinityAttributes;
            String str14 = str5;
            String str15 = str4;
            return new TrinityEventEntity(str12, str3, dateTime, dateTime2, str15, str14, trinityAttributes2, trinityPage2, str13, customCell, str7, str8, str9, str10, trinityUser, dateTime3);
        }
        int i12 = i11;
        Constructor<TrinityEventEntity> constructor = this.constructorRef;
        if (constructor == null) {
            str = str12;
            constructor = TrinityEventEntity.class.getDeclaredConstructor(String.class, String.class, DateTime.class, DateTime.class, String.class, String.class, TrinityAttributes.class, TrinityPage.class, String.class, Cell.CustomCell.class, String.class, String.class, String.class, String.class, TrinityUser.class, DateTime.class, Integer.TYPE, c.f34864d);
            this.constructorRef = constructor;
            Intrinsics.checkNotNullExpressionValue(constructor, "also(...)");
        } else {
            str = str12;
        }
        if (dateTime == null) {
            throw c.j("timestamp", "timestamp", reader);
        }
        if (dateTime2 == null) {
            throw c.j("timestampMs", "timestampMs", reader);
        }
        TrinityEventEntity newInstance = constructor.newInstance(str, str3, dateTime, dateTime2, str4, str5, trinityAttributes, trinityPage, str6, customCell, str7, str8, str9, str10, trinityUser, dateTime3, Integer.valueOf(i12), null);
        Intrinsics.checkNotNullExpressionValue(newInstance, "newInstance(...)");
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, TrinityEventEntity value_) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("uuid");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getUuid());
        writer.w("number");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getNumber());
        writer.w("timestamp");
        this.dateTimeAdapter.mo44toJson(writer, (x) value_.getTimestamp());
        writer.w("timestampMs");
        this.dateTimeAtDateTimeWithMsAdapter.mo44toJson(writer, (x) value_.getTimestampMs());
        writer.w(TrinityEventEntityKt.ACTION_TYPE_JSON_NAME);
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getActionType());
        writer.w(TrinityEventEntityKt.TRACK_CAMPAIGN_UUID_JSON_NAME);
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getTrackCampaignUuid());
        writer.w("attributes");
        this.nullableTrinityAttributesAdapter.mo44toJson(writer, (x) value_.getAttributes());
        writer.w("page");
        this.nullableTrinityPageAdapter.mo44toJson(writer, (x) value_.getPage());
        writer.w("pageToken");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getPageToken());
        writer.w("custom");
        this.nullableCustomCellAdapter.mo44toJson(writer, (x) value_.getCustom());
        writer.w("widgetToken");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getWidgetToken());
        writer.w("sliceToken");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getSliceToken());
        writer.w("cellToken");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getCellToken());
        writer.w("userToken");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getUserToken());
        writer.w("user");
        this.nullableTrinityUserAdapter.mo44toJson(writer, (x) value_.getUser());
        writer.w("pageTimestamp");
        this.nullableDateTimeAdapter.mo44toJson(writer, (x) value_.getPageTimestamp());
        writer.p();
    }
}
