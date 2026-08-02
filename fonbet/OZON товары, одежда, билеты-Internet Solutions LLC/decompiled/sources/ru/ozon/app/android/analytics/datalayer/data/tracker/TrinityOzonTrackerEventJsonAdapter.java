package ru.ozon.app.android.analytics.datalayer.data.tracker;

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
import ru.ozon.tracker.model.TrinityEventEntityKt;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R(\u0010\u001b\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u00190\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0018R\u001c\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0018R\u001e\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"Lru/ozon/app/android/analytics/datalayer/data/tracker/TrinityOzonTrackerEventJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/analytics/datalayer/data/tracker/TrinityOzonTrackerEvent;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/analytics/datalayer/data/tracker/TrinityOzonTrackerEvent;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/analytics/datalayer/data/tracker/TrinityOzonTrackerEvent;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "nullableStringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "", "nullableMapOfStringAnyAdapter", "", "nullableLongAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "analytics_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class TrinityOzonTrackerEventJsonAdapter extends JsonAdapter<TrinityOzonTrackerEvent> {
    private volatile Constructor<TrinityOzonTrackerEvent> constructorRef;

    @NotNull
    private final JsonAdapter<Long> nullableLongAdapter;

    @NotNull
    private final JsonAdapter<Map<String, Object>> nullableMapOfStringAnyAdapter;

    @NotNull
    private final JsonAdapter<String> nullableStringAdapter;

    @NotNull
    private final n.a options;

    public TrinityOzonTrackerEventJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a(TrinityEventEntityKt.ACTION_TYPE_JSON_NAME, "custom", "widgetToken", "cellToken", "sliceToken", "userToken", "pageToken", "pageTimestamp");
        M m11 = M.f71699a;
        this.nullableStringAdapter = moshi.f(String.class, m11, TrinityEventEntityKt.ACTION_TYPE_JSON_NAME);
        this.nullableMapOfStringAnyAdapter = moshi.f(D.e(Map.class, String.class, Object.class), m11, "custom");
        this.nullableLongAdapter = moshi.f(Long.class, m11, "pageTimestamp");
    }

    @NotNull
    public String toString() {
        return b.c(45, "GeneratedJsonAdapter(TrinityOzonTrackerEvent)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public TrinityOzonTrackerEvent fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        int i11 = -1;
        String str = null;
        Map<String, Object> map = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        Long l11 = null;
        while (reader.hasNext()) {
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    break;
                case 0:
                    str = this.nullableStringAdapter.fromJson(reader);
                    i11 &= -2;
                    break;
                case 1:
                    map = this.nullableMapOfStringAnyAdapter.fromJson(reader);
                    i11 &= -3;
                    break;
                case 2:
                    str2 = this.nullableStringAdapter.fromJson(reader);
                    i11 &= -5;
                    break;
                case 3:
                    str3 = this.nullableStringAdapter.fromJson(reader);
                    i11 &= -9;
                    break;
                case 4:
                    str4 = this.nullableStringAdapter.fromJson(reader);
                    i11 &= -17;
                    break;
                case 5:
                    str5 = this.nullableStringAdapter.fromJson(reader);
                    i11 &= -33;
                    break;
                case 6:
                    str6 = this.nullableStringAdapter.fromJson(reader);
                    i11 &= -65;
                    break;
                case 7:
                    l11 = this.nullableLongAdapter.fromJson(reader);
                    i11 &= -129;
                    break;
            }
        }
        reader.endObject();
        if (i11 == -256) {
            Long l12 = l11;
            String str7 = str6;
            String str8 = str5;
            String str9 = str4;
            String str10 = str3;
            return new TrinityOzonTrackerEvent(str, map, str2, str10, str9, str8, str7, l12);
        }
        Long l13 = l11;
        String str11 = str6;
        String str12 = str5;
        String str13 = str4;
        String str14 = str3;
        String str15 = str2;
        Map<String, Object> map2 = map;
        String str16 = str;
        Constructor<TrinityOzonTrackerEvent> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = TrinityOzonTrackerEvent.class.getDeclaredConstructor(String.class, Map.class, String.class, String.class, String.class, String.class, String.class, Long.class, Integer.TYPE, c.f34864d);
            this.constructorRef = constructor;
            Intrinsics.checkNotNullExpressionValue(constructor, "also(...)");
        }
        TrinityOzonTrackerEvent newInstance = constructor.newInstance(str16, map2, str15, str14, str13, str12, str11, l13, Integer.valueOf(i11), null);
        Intrinsics.checkNotNullExpressionValue(newInstance, "newInstance(...)");
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, TrinityOzonTrackerEvent value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w(TrinityEventEntityKt.ACTION_TYPE_JSON_NAME);
        this.nullableStringAdapter.mo44toJson(writer, (x) value.getActionType());
        writer.w("custom");
        this.nullableMapOfStringAnyAdapter.mo44toJson(writer, (x) value.getCustom());
        writer.w("widgetToken");
        this.nullableStringAdapter.mo44toJson(writer, (x) value.getWidgetToken());
        writer.w("cellToken");
        this.nullableStringAdapter.mo44toJson(writer, (x) value.getCellToken());
        writer.w("sliceToken");
        this.nullableStringAdapter.mo44toJson(writer, (x) value.getSliceToken());
        writer.w("userToken");
        this.nullableStringAdapter.mo44toJson(writer, (x) value.getUserToken());
        writer.w("pageToken");
        this.nullableStringAdapter.mo44toJson(writer, (x) value.getPageToken());
        writer.w("pageTimestamp");
        this.nullableLongAdapter.mo44toJson(writer, (x) value.getPageTimestamp());
        writer.p();
    }
}
