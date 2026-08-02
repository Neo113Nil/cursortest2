package ru.ozon.tracker.performance.model;

import Ak.b;
import Y9.c;
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
import org.joda.time.DateTime;
import ru.ozon.tracker.performance.model.TraceEntity;

@Metadata(d1 = {"\u0000\u0096\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0018R\u001c\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0018R\u001c\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001d0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0018R\u001c\u0010 \u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u0018R\u001c\u0010\"\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010!0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u0018R\u001c\u0010$\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010#0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010\u0018R\u001c\u0010&\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010%0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010\u0018R\u001c\u0010(\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010'0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010\u0018R\"\u0010+\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020*\u0018\u00010)0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010\u0018R\"\u0010-\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020,\u0018\u00010)0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010\u0018R\u001c\u0010/\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010.0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u0010\u0018R\"\u00101\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u000200\u0018\u00010)0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u0010\u0018R\u001c\u00103\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u0010\u0018R\u001e\u00105\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u0001048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00106¨\u00067"}, d2 = {"Lru/ozon/tracker/performance/model/TraceEntityJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/tracker/performance/model/TraceEntity;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/tracker/performance/model/TraceEntity;", "Lcom/squareup/moshi/x;", "writer", "value_", "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/tracker/performance/model/TraceEntity;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "nullableStringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lorg/joda/time/DateTime;", "dateTimeAdapter", "Lru/ozon/tracker/performance/model/TraceEntity$Attributes;", "nullableAttributesAdapter", "Lru/ozon/tracker/performance/model/TraceEntity$User;", "nullableUserAdapter", "Lru/ozon/tracker/performance/model/TraceEntity$Page;", "nullablePageAdapter", "Lru/ozon/tracker/performance/model/TraceEntity$Obj;", "nullableObjAdapter", "Lru/ozon/tracker/performance/model/TraceEntity$Properties;", "nullablePropertiesAdapter", "Lru/ozon/tracker/performance/model/TraceEntity$Widget;", "nullableWidgetAdapter", "Lru/ozon/tracker/performance/model/TraceEntity$MapSdk;", "nullableMapSdkAdapter", "", "Lru/ozon/tracker/performance/model/TraceEntity$Metric;", "nullableListOfMetricAdapter", "Lru/ozon/tracker/performance/model/TraceEntity$CustomMetric;", "nullableListOfCustomMetricAdapter", "Lru/ozon/tracker/performance/model/TraceEntity$VideoMetric;", "nullableVideoMetricAdapter", "Lru/ozon/tracker/performance/model/TraceEntity$ServerTimingData;", "nullableListOfServerTimingDataAdapter", "Lru/ozon/tracker/performance/model/TraceEntity$PclPage;", "nullablePclPageAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "tracker-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TraceEntityJsonAdapter extends JsonAdapter<TraceEntity> {
    private volatile Constructor<TraceEntity> constructorRef;

    @NotNull
    private final JsonAdapter<DateTime> dateTimeAdapter;

    @NotNull
    private final JsonAdapter<TraceEntity.Attributes> nullableAttributesAdapter;

    @NotNull
    private final JsonAdapter<List<TraceEntity.CustomMetric>> nullableListOfCustomMetricAdapter;

    @NotNull
    private final JsonAdapter<List<TraceEntity.Metric>> nullableListOfMetricAdapter;

    @NotNull
    private final JsonAdapter<List<TraceEntity.ServerTimingData>> nullableListOfServerTimingDataAdapter;

    @NotNull
    private final JsonAdapter<TraceEntity.MapSdk> nullableMapSdkAdapter;

    @NotNull
    private final JsonAdapter<TraceEntity.Obj> nullableObjAdapter;

    @NotNull
    private final JsonAdapter<TraceEntity.Page> nullablePageAdapter;

    @NotNull
    private final JsonAdapter<TraceEntity.PclPage> nullablePclPageAdapter;

    @NotNull
    private final JsonAdapter<TraceEntity.Properties> nullablePropertiesAdapter;

    @NotNull
    private final JsonAdapter<String> nullableStringAdapter;

    @NotNull
    private final JsonAdapter<TraceEntity.User> nullableUserAdapter;

    @NotNull
    private final JsonAdapter<TraceEntity.VideoMetric> nullableVideoMetricAdapter;

    @NotNull
    private final JsonAdapter<TraceEntity.Widget> nullableWidgetAdapter;

    @NotNull
    private final n.a options;

    public TraceEntityJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        n.a a11 = n.a.C0918a.a("uuid", "requestId", "timestamp", "testingToolName", "attributes", "user", "page", "object", "properties", "widget", "map", "metrics", "customMetrics", "video", "serverTimings", "pclpage");
        Intrinsics.checkNotNullExpressionValue(a11, "of(...)");
        this.options = a11;
        M m11 = M.f71699a;
        JsonAdapter<String> f7 = moshi.f(String.class, m11, "uuid");
        Intrinsics.checkNotNullExpressionValue(f7, "adapter(...)");
        this.nullableStringAdapter = f7;
        JsonAdapter<DateTime> f11 = moshi.f(DateTime.class, m11, "timestamp");
        Intrinsics.checkNotNullExpressionValue(f11, "adapter(...)");
        this.dateTimeAdapter = f11;
        JsonAdapter<TraceEntity.Attributes> f12 = moshi.f(TraceEntity.Attributes.class, m11, "attributes");
        Intrinsics.checkNotNullExpressionValue(f12, "adapter(...)");
        this.nullableAttributesAdapter = f12;
        JsonAdapter<TraceEntity.User> f13 = moshi.f(TraceEntity.User.class, m11, "user");
        Intrinsics.checkNotNullExpressionValue(f13, "adapter(...)");
        this.nullableUserAdapter = f13;
        JsonAdapter<TraceEntity.Page> f14 = moshi.f(TraceEntity.Page.class, m11, "page");
        Intrinsics.checkNotNullExpressionValue(f14, "adapter(...)");
        this.nullablePageAdapter = f14;
        JsonAdapter<TraceEntity.Obj> f15 = moshi.f(TraceEntity.Obj.class, m11, "object");
        Intrinsics.checkNotNullExpressionValue(f15, "adapter(...)");
        this.nullableObjAdapter = f15;
        JsonAdapter<TraceEntity.Properties> f16 = moshi.f(TraceEntity.Properties.class, m11, "properties");
        Intrinsics.checkNotNullExpressionValue(f16, "adapter(...)");
        this.nullablePropertiesAdapter = f16;
        JsonAdapter<TraceEntity.Widget> f17 = moshi.f(TraceEntity.Widget.class, m11, "widget");
        Intrinsics.checkNotNullExpressionValue(f17, "adapter(...)");
        this.nullableWidgetAdapter = f17;
        JsonAdapter<TraceEntity.MapSdk> f18 = moshi.f(TraceEntity.MapSdk.class, m11, "map");
        Intrinsics.checkNotNullExpressionValue(f18, "adapter(...)");
        this.nullableMapSdkAdapter = f18;
        JsonAdapter<List<TraceEntity.Metric>> f19 = moshi.f(D.e(List.class, TraceEntity.Metric.class), m11, "metrics");
        Intrinsics.checkNotNullExpressionValue(f19, "adapter(...)");
        this.nullableListOfMetricAdapter = f19;
        JsonAdapter<List<TraceEntity.CustomMetric>> f21 = moshi.f(D.e(List.class, TraceEntity.CustomMetric.class), m11, "customMetrics");
        Intrinsics.checkNotNullExpressionValue(f21, "adapter(...)");
        this.nullableListOfCustomMetricAdapter = f21;
        JsonAdapter<TraceEntity.VideoMetric> f22 = moshi.f(TraceEntity.VideoMetric.class, m11, "video");
        Intrinsics.checkNotNullExpressionValue(f22, "adapter(...)");
        this.nullableVideoMetricAdapter = f22;
        JsonAdapter<List<TraceEntity.ServerTimingData>> f23 = moshi.f(D.e(List.class, TraceEntity.ServerTimingData.class), m11, "serverTimings");
        Intrinsics.checkNotNullExpressionValue(f23, "adapter(...)");
        this.nullableListOfServerTimingDataAdapter = f23;
        JsonAdapter<TraceEntity.PclPage> f24 = moshi.f(TraceEntity.PclPage.class, m11, "pclpage");
        Intrinsics.checkNotNullExpressionValue(f24, "adapter(...)");
        this.nullablePclPageAdapter = f24;
    }

    @NotNull
    public String toString() {
        return b.c(33, "GeneratedJsonAdapter(TraceEntity)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public TraceEntity fromJson(@NotNull n reader) {
        int i11;
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        int i12 = -1;
        String str = null;
        String str2 = null;
        DateTime dateTime = null;
        String str3 = null;
        TraceEntity.Attributes attributes = null;
        TraceEntity.User user = null;
        TraceEntity.Page page = null;
        TraceEntity.Obj obj = null;
        TraceEntity.Properties properties = null;
        TraceEntity.Widget widget = null;
        TraceEntity.MapSdk mapSdk = null;
        List<TraceEntity.Metric> list = null;
        List<TraceEntity.CustomMetric> list2 = null;
        TraceEntity.VideoMetric videoMetric = null;
        List<TraceEntity.ServerTimingData> list3 = null;
        TraceEntity.PclPage pclPage = null;
        while (reader.hasNext()) {
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    break;
                case 0:
                    str = this.nullableStringAdapter.fromJson(reader);
                    i12 &= -2;
                    break;
                case 1:
                    str2 = this.nullableStringAdapter.fromJson(reader);
                    i12 &= -3;
                    break;
                case 2:
                    dateTime = this.dateTimeAdapter.fromJson(reader);
                    if (dateTime == null) {
                        throw c.q("timestamp", "timestamp", reader);
                    }
                    break;
                case 3:
                    str3 = this.nullableStringAdapter.fromJson(reader);
                    i12 &= -9;
                    break;
                case 4:
                    attributes = this.nullableAttributesAdapter.fromJson(reader);
                    i12 &= -17;
                    break;
                case 5:
                    user = this.nullableUserAdapter.fromJson(reader);
                    i12 &= -33;
                    break;
                case 6:
                    page = this.nullablePageAdapter.fromJson(reader);
                    i12 &= -65;
                    break;
                case 7:
                    obj = this.nullableObjAdapter.fromJson(reader);
                    i12 &= -129;
                    break;
                case 8:
                    properties = this.nullablePropertiesAdapter.fromJson(reader);
                    i12 &= -257;
                    break;
                case 9:
                    widget = this.nullableWidgetAdapter.fromJson(reader);
                    i12 &= -513;
                    break;
                case 10:
                    mapSdk = this.nullableMapSdkAdapter.fromJson(reader);
                    i12 &= -1025;
                    break;
                case 11:
                    list = this.nullableListOfMetricAdapter.fromJson(reader);
                    i12 &= -2049;
                    break;
                case 12:
                    list2 = this.nullableListOfCustomMetricAdapter.fromJson(reader);
                    i12 &= -4097;
                    break;
                case 13:
                    videoMetric = this.nullableVideoMetricAdapter.fromJson(reader);
                    i12 &= -8193;
                    break;
                case 14:
                    list3 = this.nullableListOfServerTimingDataAdapter.fromJson(reader);
                    i12 &= -16385;
                    break;
                case 15:
                    pclPage = this.nullablePclPageAdapter.fromJson(reader);
                    i12 &= -32769;
                    break;
            }
        }
        reader.endObject();
        if (i12 == -65532) {
            TraceEntity.Properties properties2 = properties;
            TraceEntity.Obj obj2 = obj;
            TraceEntity.Page page2 = page;
            TraceEntity.User user2 = user;
            TraceEntity.Attributes attributes2 = attributes;
            String str4 = str3;
            DateTime dateTime2 = dateTime;
            String str5 = str2;
            String str6 = str;
            if (dateTime2 != null) {
                return new TraceEntity(str6, str5, dateTime2, str4, attributes2, user2, page2, obj2, properties2, widget, mapSdk, list, list2, videoMetric, list3, pclPage);
            }
            throw c.j("timestamp", "timestamp", reader);
        }
        TraceEntity.Properties properties3 = properties;
        TraceEntity.Obj obj3 = obj;
        TraceEntity.Page page3 = page;
        TraceEntity.User user3 = user;
        TraceEntity.Attributes attributes3 = attributes;
        String str7 = str3;
        DateTime dateTime3 = dateTime;
        String str8 = str2;
        String str9 = str;
        Constructor<TraceEntity> constructor = this.constructorRef;
        if (constructor == null) {
            i11 = i12;
            constructor = TraceEntity.class.getDeclaredConstructor(String.class, String.class, DateTime.class, String.class, TraceEntity.Attributes.class, TraceEntity.User.class, TraceEntity.Page.class, TraceEntity.Obj.class, TraceEntity.Properties.class, TraceEntity.Widget.class, TraceEntity.MapSdk.class, List.class, List.class, TraceEntity.VideoMetric.class, List.class, TraceEntity.PclPage.class, Integer.TYPE, c.f34864d);
            this.constructorRef = constructor;
            Intrinsics.checkNotNullExpressionValue(constructor, "also(...)");
        } else {
            i11 = i12;
        }
        Constructor<TraceEntity> constructor2 = constructor;
        if (dateTime3 == null) {
            throw c.j("timestamp", "timestamp", reader);
        }
        TraceEntity newInstance = constructor2.newInstance(str9, str8, dateTime3, str7, attributes3, user3, page3, obj3, properties3, widget, mapSdk, list, list2, videoMetric, list3, pclPage, Integer.valueOf(i11), null);
        Intrinsics.checkNotNullExpressionValue(newInstance, "newInstance(...)");
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, TraceEntity value_) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("uuid");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getUuid());
        writer.w("requestId");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getRequestId());
        writer.w("timestamp");
        this.dateTimeAdapter.mo44toJson(writer, (x) value_.getTimestamp());
        writer.w("testingToolName");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getTestingToolName());
        writer.w("attributes");
        this.nullableAttributesAdapter.mo44toJson(writer, (x) value_.getAttributes());
        writer.w("user");
        this.nullableUserAdapter.mo44toJson(writer, (x) value_.getUser());
        writer.w("page");
        this.nullablePageAdapter.mo44toJson(writer, (x) value_.getPage());
        writer.w("object");
        this.nullableObjAdapter.mo44toJson(writer, (x) value_.getObject());
        writer.w("properties");
        this.nullablePropertiesAdapter.mo44toJson(writer, (x) value_.getProperties());
        writer.w("widget");
        this.nullableWidgetAdapter.mo44toJson(writer, (x) value_.getWidget());
        writer.w("map");
        this.nullableMapSdkAdapter.mo44toJson(writer, (x) value_.getMap());
        writer.w("metrics");
        this.nullableListOfMetricAdapter.mo44toJson(writer, (x) value_.getMetrics());
        writer.w("customMetrics");
        this.nullableListOfCustomMetricAdapter.mo44toJson(writer, (x) value_.getCustomMetrics());
        writer.w("video");
        this.nullableVideoMetricAdapter.mo44toJson(writer, (x) value_.getVideo());
        writer.w("serverTimings");
        this.nullableListOfServerTimingDataAdapter.mo44toJson(writer, (x) value_.getServerTimings());
        writer.w("pclpage");
        this.nullablePclPageAdapter.mo44toJson(writer, (x) value_.getPclpage());
        writer.p();
    }
}
