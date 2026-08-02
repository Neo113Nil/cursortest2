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
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.M;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.tracker.performance.model.TraceEntity;

@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u001c\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0019R(\u0010\u001e\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u001d0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0019R\u001c\u0010 \u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u0019R\"\u0010#\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\"\u0018\u00010!0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\u0019R\u001e\u0010%\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&¨\u0006'"}, d2 = {"Lru/ozon/tracker/performance/model/TraceEntity_VideoMetricJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/tracker/performance/model/TraceEntity$VideoMetric;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/tracker/performance/model/TraceEntity$VideoMetric;", "Lcom/squareup/moshi/x;", "writer", "value_", "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/tracker/performance/model/TraceEntity$VideoMetric;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "", "nullableIntAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "nullableDoubleAdapter", "nullableStringAdapter", "", "nullableMapOfStringIntAdapter", "Lru/ozon/tracker/performance/model/TraceEntity$ErrorDetails;", "nullableErrorDetailsAdapter", "", "Lru/ozon/tracker/performance/model/TraceEntity$VideoMetric$VideoFile;", "nullableListOfVideoFileAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "tracker-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TraceEntity_VideoMetricJsonAdapter extends JsonAdapter<TraceEntity.VideoMetric> {
    private volatile Constructor<TraceEntity.VideoMetric> constructorRef;

    @NotNull
    private final JsonAdapter<Double> nullableDoubleAdapter;

    @NotNull
    private final JsonAdapter<TraceEntity.ErrorDetails> nullableErrorDetailsAdapter;

    @NotNull
    private final JsonAdapter<Integer> nullableIntAdapter;

    @NotNull
    private final JsonAdapter<List<TraceEntity.VideoMetric.VideoFile>> nullableListOfVideoFileAdapter;

    @NotNull
    private final JsonAdapter<Map<String, Integer>> nullableMapOfStringIntAdapter;

    @NotNull
    private final JsonAdapter<String> nullableStringAdapter;

    @NotNull
    private final n.a options;

    public TraceEntity_VideoMetricJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        n.a a11 = n.a.C0918a.a("index", "stallCount", "stallDuration", "startupTime", "viewTime", "productType", "videoRequestId", "playerLoadTime", "seekCount", "duration", "effectiveStartupTime", "errorCount", "errorDetails", "manifests", "files");
        Intrinsics.checkNotNullExpressionValue(a11, "of(...)");
        this.options = a11;
        M m11 = M.f71699a;
        JsonAdapter<Integer> f7 = moshi.f(Integer.class, m11, "index");
        Intrinsics.checkNotNullExpressionValue(f7, "adapter(...)");
        this.nullableIntAdapter = f7;
        JsonAdapter<Double> f11 = moshi.f(Double.class, m11, "stallDuration");
        Intrinsics.checkNotNullExpressionValue(f11, "adapter(...)");
        this.nullableDoubleAdapter = f11;
        JsonAdapter<String> f12 = moshi.f(String.class, m11, "productType");
        Intrinsics.checkNotNullExpressionValue(f12, "adapter(...)");
        this.nullableStringAdapter = f12;
        JsonAdapter<Map<String, Integer>> f13 = moshi.f(D.e(Map.class, String.class, Integer.class), m11, "errorCount");
        Intrinsics.checkNotNullExpressionValue(f13, "adapter(...)");
        this.nullableMapOfStringIntAdapter = f13;
        JsonAdapter<TraceEntity.ErrorDetails> f14 = moshi.f(TraceEntity.ErrorDetails.class, m11, "errorDetails");
        Intrinsics.checkNotNullExpressionValue(f14, "adapter(...)");
        this.nullableErrorDetailsAdapter = f14;
        JsonAdapter<List<TraceEntity.VideoMetric.VideoFile>> f15 = moshi.f(D.e(List.class, TraceEntity.VideoMetric.VideoFile.class), m11, "manifests");
        Intrinsics.checkNotNullExpressionValue(f15, "adapter(...)");
        this.nullableListOfVideoFileAdapter = f15;
    }

    @NotNull
    public String toString() {
        return b.c(45, "GeneratedJsonAdapter(TraceEntity.VideoMetric)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public TraceEntity.VideoMetric fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        int i11 = -1;
        Integer num = null;
        Integer num2 = null;
        Double d11 = null;
        Double d12 = null;
        Double d13 = null;
        String str = null;
        String str2 = null;
        Double d14 = null;
        Integer num3 = null;
        Double d15 = null;
        Integer num4 = null;
        Map<String, Integer> map = null;
        TraceEntity.ErrorDetails errorDetails = null;
        List<TraceEntity.VideoMetric.VideoFile> list = null;
        List<TraceEntity.VideoMetric.VideoFile> list2 = null;
        while (reader.hasNext()) {
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    break;
                case 0:
                    num = this.nullableIntAdapter.fromJson(reader);
                    break;
                case 1:
                    num2 = this.nullableIntAdapter.fromJson(reader);
                    break;
                case 2:
                    d11 = this.nullableDoubleAdapter.fromJson(reader);
                    break;
                case 3:
                    d12 = this.nullableDoubleAdapter.fromJson(reader);
                    break;
                case 4:
                    d13 = this.nullableDoubleAdapter.fromJson(reader);
                    break;
                case 5:
                    str = this.nullableStringAdapter.fromJson(reader);
                    break;
                case 6:
                    str2 = this.nullableStringAdapter.fromJson(reader);
                    i11 &= -65;
                    break;
                case 7:
                    d14 = this.nullableDoubleAdapter.fromJson(reader);
                    i11 &= -129;
                    break;
                case 8:
                    num3 = this.nullableIntAdapter.fromJson(reader);
                    i11 &= -257;
                    break;
                case 9:
                    d15 = this.nullableDoubleAdapter.fromJson(reader);
                    i11 &= -513;
                    break;
                case 10:
                    num4 = this.nullableIntAdapter.fromJson(reader);
                    i11 &= -1025;
                    break;
                case 11:
                    map = this.nullableMapOfStringIntAdapter.fromJson(reader);
                    i11 &= -2049;
                    break;
                case 12:
                    errorDetails = this.nullableErrorDetailsAdapter.fromJson(reader);
                    i11 &= -4097;
                    break;
                case 13:
                    list = this.nullableListOfVideoFileAdapter.fromJson(reader);
                    i11 &= -8193;
                    break;
                case 14:
                    list2 = this.nullableListOfVideoFileAdapter.fromJson(reader);
                    i11 &= -16385;
                    break;
            }
        }
        reader.endObject();
        if (i11 == -32705) {
            Integer num5 = num3;
            Double d16 = d14;
            String str3 = str2;
            String str4 = str;
            Double d17 = d13;
            Double d18 = d12;
            return new TraceEntity.VideoMetric(num, num2, d11, d18, d17, str4, str3, d16, num5, d15, num4, map, errorDetails, list, list2);
        }
        Integer num6 = num3;
        Double d19 = d14;
        String str5 = str2;
        String str6 = str;
        Double d21 = d13;
        Double d22 = d12;
        Double d23 = d11;
        Integer num7 = num2;
        Integer num8 = num;
        Constructor<TraceEntity.VideoMetric> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = TraceEntity.VideoMetric.class.getDeclaredConstructor(Integer.class, Integer.class, Double.class, Double.class, Double.class, String.class, String.class, Double.class, Integer.class, Double.class, Integer.class, Map.class, TraceEntity.ErrorDetails.class, List.class, List.class, Integer.TYPE, c.f34864d);
            this.constructorRef = constructor;
            Intrinsics.checkNotNullExpressionValue(constructor, "also(...)");
        }
        TraceEntity.VideoMetric newInstance = constructor.newInstance(num8, num7, d23, d22, d21, str6, str5, d19, num6, d15, num4, map, errorDetails, list, list2, Integer.valueOf(i11), null);
        Intrinsics.checkNotNullExpressionValue(newInstance, "newInstance(...)");
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, TraceEntity.VideoMetric value_) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("index");
        this.nullableIntAdapter.mo44toJson(writer, (x) value_.getIndex());
        writer.w("stallCount");
        this.nullableIntAdapter.mo44toJson(writer, (x) value_.getStallCount());
        writer.w("stallDuration");
        this.nullableDoubleAdapter.mo44toJson(writer, (x) value_.getStallDuration());
        writer.w("startupTime");
        this.nullableDoubleAdapter.mo44toJson(writer, (x) value_.getStartupTime());
        writer.w("viewTime");
        this.nullableDoubleAdapter.mo44toJson(writer, (x) value_.getViewTime());
        writer.w("productType");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getProductType());
        writer.w("videoRequestId");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getVideoRequestId());
        writer.w("playerLoadTime");
        this.nullableDoubleAdapter.mo44toJson(writer, (x) value_.getPlayerLoadTime());
        writer.w("seekCount");
        this.nullableIntAdapter.mo44toJson(writer, (x) value_.getSeekCount());
        writer.w("duration");
        this.nullableDoubleAdapter.mo44toJson(writer, (x) value_.getDuration());
        writer.w("effectiveStartupTime");
        this.nullableIntAdapter.mo44toJson(writer, (x) value_.getEffectiveStartupTime());
        writer.w("errorCount");
        this.nullableMapOfStringIntAdapter.mo44toJson(writer, (x) value_.getErrorCount());
        writer.w("errorDetails");
        this.nullableErrorDetailsAdapter.mo44toJson(writer, (x) value_.getErrorDetails());
        writer.w("manifests");
        this.nullableListOfVideoFileAdapter.mo44toJson(writer, (x) value_.getManifests());
        writer.w("files");
        this.nullableListOfVideoFileAdapter.mo44toJson(writer, (x) value_.getFiles());
        writer.p();
    }
}
