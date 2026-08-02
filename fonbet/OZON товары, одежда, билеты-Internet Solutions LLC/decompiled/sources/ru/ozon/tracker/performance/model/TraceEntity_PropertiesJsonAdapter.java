package ru.ozon.tracker.performance.model;

import Ak.b;
import Y9.c;
import com.google.android.gms.common.internal.ImagesContract;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.n;
import com.squareup.moshi.x;
import java.lang.reflect.Constructor;
import kotlin.Metadata;
import kotlin.collections.M;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.networkinfo.models.ConnectionType;
import ru.ozon.tracker.performance.MapLoadingSteps;
import ru.ozon.tracker.performance.model.TraceEntity;

@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0019R\u001c\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0019R\u001c\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001d0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0019R\u001c\u0010 \u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u0019R\u001e\u0010\"\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006$"}, d2 = {"Lru/ozon/tracker/performance/model/TraceEntity_PropertiesJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/tracker/performance/model/TraceEntity$Properties;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/tracker/performance/model/TraceEntity$Properties;", "Lcom/squareup/moshi/x;", "writer", "value_", "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/tracker/performance/model/TraceEntity$Properties;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "Lru/ozon/android/networkinfo/models/ConnectionType;", "nullableConnectionTypeAdapter", "Lcom/squareup/moshi/JsonAdapter;", "nullableStringAdapter", "", "nullableIntAdapter", "", "nullableBooleanAdapter", "Lru/ozon/tracker/performance/MapLoadingSteps;", "nullableMapLoadingStepsAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "tracker-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TraceEntity_PropertiesJsonAdapter extends JsonAdapter<TraceEntity.Properties> {
    private volatile Constructor<TraceEntity.Properties> constructorRef;

    @NotNull
    private final JsonAdapter<Boolean> nullableBooleanAdapter;

    @NotNull
    private final JsonAdapter<ConnectionType> nullableConnectionTypeAdapter;

    @NotNull
    private final JsonAdapter<Integer> nullableIntAdapter;

    @NotNull
    private final JsonAdapter<MapLoadingSteps> nullableMapLoadingStepsAdapter;

    @NotNull
    private final JsonAdapter<String> nullableStringAdapter;

    @NotNull
    private final n.a options;

    public TraceEntity_PropertiesJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        n.a a11 = n.a.C0918a.a("connectionType", "contentType", "imageHeight", "imageWidth", "priority", "statusCode", "statusCodeType", ImagesContract.URL, "cacheType", "edgeIp", "stateId", "isLowPowerMode", "videoIndex", "isVideoPlaceholder", "mapLoadingStep", "navigation_type");
        Intrinsics.checkNotNullExpressionValue(a11, "of(...)");
        this.options = a11;
        M m11 = M.f71699a;
        JsonAdapter<ConnectionType> f7 = moshi.f(ConnectionType.class, m11, "connectionType");
        Intrinsics.checkNotNullExpressionValue(f7, "adapter(...)");
        this.nullableConnectionTypeAdapter = f7;
        JsonAdapter<String> f11 = moshi.f(String.class, m11, "contentType");
        Intrinsics.checkNotNullExpressionValue(f11, "adapter(...)");
        this.nullableStringAdapter = f11;
        JsonAdapter<Integer> f12 = moshi.f(Integer.class, m11, "imageHeight");
        Intrinsics.checkNotNullExpressionValue(f12, "adapter(...)");
        this.nullableIntAdapter = f12;
        JsonAdapter<Boolean> f13 = moshi.f(Boolean.class, m11, "isLowPowerMode");
        Intrinsics.checkNotNullExpressionValue(f13, "adapter(...)");
        this.nullableBooleanAdapter = f13;
        JsonAdapter<MapLoadingSteps> f14 = moshi.f(MapLoadingSteps.class, m11, "mapLoadingStep");
        Intrinsics.checkNotNullExpressionValue(f14, "adapter(...)");
        this.nullableMapLoadingStepsAdapter = f14;
    }

    @NotNull
    public String toString() {
        return b.c(44, "GeneratedJsonAdapter(TraceEntity.Properties)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public TraceEntity.Properties fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        int i11 = -1;
        ConnectionType connectionType = null;
        String str = null;
        Integer num = null;
        Integer num2 = null;
        Integer num3 = null;
        Integer num4 = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        Boolean bool = null;
        Integer num5 = null;
        Boolean bool2 = null;
        MapLoadingSteps mapLoadingSteps = null;
        String str7 = null;
        while (reader.hasNext()) {
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    break;
                case 0:
                    connectionType = this.nullableConnectionTypeAdapter.fromJson(reader);
                    i11 &= -2;
                    break;
                case 1:
                    str = this.nullableStringAdapter.fromJson(reader);
                    i11 &= -3;
                    break;
                case 2:
                    num = this.nullableIntAdapter.fromJson(reader);
                    i11 &= -5;
                    break;
                case 3:
                    num2 = this.nullableIntAdapter.fromJson(reader);
                    i11 &= -9;
                    break;
                case 4:
                    num3 = this.nullableIntAdapter.fromJson(reader);
                    i11 &= -17;
                    break;
                case 5:
                    num4 = this.nullableIntAdapter.fromJson(reader);
                    i11 &= -33;
                    break;
                case 6:
                    str2 = this.nullableStringAdapter.fromJson(reader);
                    i11 &= -65;
                    break;
                case 7:
                    str3 = this.nullableStringAdapter.fromJson(reader);
                    i11 &= -129;
                    break;
                case 8:
                    str4 = this.nullableStringAdapter.fromJson(reader);
                    i11 &= -257;
                    break;
                case 9:
                    str5 = this.nullableStringAdapter.fromJson(reader);
                    i11 &= -513;
                    break;
                case 10:
                    str6 = this.nullableStringAdapter.fromJson(reader);
                    i11 &= -1025;
                    break;
                case 11:
                    bool = this.nullableBooleanAdapter.fromJson(reader);
                    i11 &= -2049;
                    break;
                case 12:
                    num5 = this.nullableIntAdapter.fromJson(reader);
                    i11 &= -4097;
                    break;
                case 13:
                    bool2 = this.nullableBooleanAdapter.fromJson(reader);
                    i11 &= -8193;
                    break;
                case 14:
                    mapLoadingSteps = this.nullableMapLoadingStepsAdapter.fromJson(reader);
                    i11 &= -16385;
                    break;
                case 15:
                    str7 = this.nullableStringAdapter.fromJson(reader);
                    i11 &= -32769;
                    break;
            }
        }
        reader.endObject();
        if (i11 == -65536) {
            String str8 = str4;
            String str9 = str3;
            String str10 = str2;
            Integer num6 = num4;
            Integer num7 = num3;
            Integer num8 = num2;
            return new TraceEntity.Properties(connectionType, str, num, num8, num7, num6, str10, str9, str8, str5, str6, bool, num5, bool2, mapLoadingSteps, str7);
        }
        String str11 = str4;
        String str12 = str3;
        String str13 = str2;
        Integer num9 = num4;
        Integer num10 = num3;
        Integer num11 = num2;
        Integer num12 = num;
        String str14 = str;
        ConnectionType connectionType2 = connectionType;
        Constructor<TraceEntity.Properties> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = TraceEntity.Properties.class.getDeclaredConstructor(ConnectionType.class, String.class, Integer.class, Integer.class, Integer.class, Integer.class, String.class, String.class, String.class, String.class, String.class, Boolean.class, Integer.class, Boolean.class, MapLoadingSteps.class, String.class, Integer.TYPE, c.f34864d);
            this.constructorRef = constructor;
            Intrinsics.checkNotNullExpressionValue(constructor, "also(...)");
        }
        TraceEntity.Properties newInstance = constructor.newInstance(connectionType2, str14, num12, num11, num10, num9, str13, str12, str11, str5, str6, bool, num5, bool2, mapLoadingSteps, str7, Integer.valueOf(i11), null);
        Intrinsics.checkNotNullExpressionValue(newInstance, "newInstance(...)");
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, TraceEntity.Properties value_) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("connectionType");
        this.nullableConnectionTypeAdapter.mo44toJson(writer, (x) value_.getConnectionType());
        writer.w("contentType");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getContentType());
        writer.w("imageHeight");
        this.nullableIntAdapter.mo44toJson(writer, (x) value_.getImageHeight());
        writer.w("imageWidth");
        this.nullableIntAdapter.mo44toJson(writer, (x) value_.getImageWidth());
        writer.w("priority");
        this.nullableIntAdapter.mo44toJson(writer, (x) value_.getPriority());
        writer.w("statusCode");
        this.nullableIntAdapter.mo44toJson(writer, (x) value_.getStatusCode());
        writer.w("statusCodeType");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getStatusCodeType());
        writer.w(ImagesContract.URL);
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getUrl());
        writer.w("cacheType");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getCacheType());
        writer.w("edgeIp");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getEdgeIp());
        writer.w("stateId");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getStateId());
        writer.w("isLowPowerMode");
        this.nullableBooleanAdapter.mo44toJson(writer, (x) value_.isLowPowerMode());
        writer.w("videoIndex");
        this.nullableIntAdapter.mo44toJson(writer, (x) value_.getVideoIndex());
        writer.w("isVideoPlaceholder");
        this.nullableBooleanAdapter.mo44toJson(writer, (x) value_.isVideoPlaceholder());
        writer.w("mapLoadingStep");
        this.nullableMapLoadingStepsAdapter.mo44toJson(writer, (x) value_.getMapLoadingStep());
        writer.w("navigation_type");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getNavigationType());
        writer.p();
    }
}
