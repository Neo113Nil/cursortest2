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
import ru.ozon.tracker.performance.model.TraceEntity;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\"\u0010\u001c\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0019R\u001e\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Lru/ozon/tracker/performance/model/TraceEntity_VideoMetric_VideoFile_PlayerMetricsJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/tracker/performance/model/TraceEntity$VideoMetric$VideoFile$PlayerMetrics;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/tracker/performance/model/TraceEntity$VideoMetric$VideoFile$PlayerMetrics;", "Lcom/squareup/moshi/x;", "writer", "value_", "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/tracker/performance/model/TraceEntity$VideoMetric$VideoFile$PlayerMetrics;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "Lru/ozon/tracker/performance/model/TraceEntity$VideoMetric$VideoFile$PlayerMetrics$VideoResolution;", "nullableVideoResolutionAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "Lru/ozon/tracker/performance/model/TraceEntity$VideoMetric$VideoFile$PlayerMetrics$ServerTimingData;", "nullableListOfServerTimingDataAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "tracker-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TraceEntity_VideoMetric_VideoFile_PlayerMetricsJsonAdapter extends JsonAdapter<TraceEntity.VideoMetric.VideoFile.PlayerMetrics> {
    private volatile Constructor<TraceEntity.VideoMetric.VideoFile.PlayerMetrics> constructorRef;

    @NotNull
    private final JsonAdapter<List<TraceEntity.VideoMetric.VideoFile.PlayerMetrics.ServerTimingData>> nullableListOfServerTimingDataAdapter;

    @NotNull
    private final JsonAdapter<TraceEntity.VideoMetric.VideoFile.PlayerMetrics.VideoResolution> nullableVideoResolutionAdapter;

    @NotNull
    private final n.a options;

    public TraceEntity_VideoMetric_VideoFile_PlayerMetricsJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        n.a a11 = n.a.C0918a.a("videoResolution", "serverTimings");
        Intrinsics.checkNotNullExpressionValue(a11, "of(...)");
        this.options = a11;
        M m11 = M.f71699a;
        JsonAdapter<TraceEntity.VideoMetric.VideoFile.PlayerMetrics.VideoResolution> f7 = moshi.f(TraceEntity.VideoMetric.VideoFile.PlayerMetrics.VideoResolution.class, m11, "videoResolution");
        Intrinsics.checkNotNullExpressionValue(f7, "adapter(...)");
        this.nullableVideoResolutionAdapter = f7;
        JsonAdapter<List<TraceEntity.VideoMetric.VideoFile.PlayerMetrics.ServerTimingData>> f11 = moshi.f(D.e(List.class, TraceEntity.VideoMetric.VideoFile.PlayerMetrics.ServerTimingData.class), m11, "serverTimings");
        Intrinsics.checkNotNullExpressionValue(f11, "adapter(...)");
        this.nullableListOfServerTimingDataAdapter = f11;
    }

    @NotNull
    public String toString() {
        return b.c(69, "GeneratedJsonAdapter(TraceEntity.VideoMetric.VideoFile.PlayerMetrics)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public TraceEntity.VideoMetric.VideoFile.PlayerMetrics fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        TraceEntity.VideoMetric.VideoFile.PlayerMetrics.VideoResolution videoResolution = null;
        List<TraceEntity.VideoMetric.VideoFile.PlayerMetrics.ServerTimingData> list = null;
        int i11 = -1;
        while (reader.hasNext()) {
            int v11 = reader.v(this.options);
            if (v11 == -1) {
                reader.y();
                reader.skipValue();
            } else if (v11 == 0) {
                videoResolution = this.nullableVideoResolutionAdapter.fromJson(reader);
                i11 &= -2;
            } else if (v11 == 1) {
                list = this.nullableListOfServerTimingDataAdapter.fromJson(reader);
                i11 &= -3;
            }
        }
        reader.endObject();
        if (i11 == -4) {
            return new TraceEntity.VideoMetric.VideoFile.PlayerMetrics(videoResolution, list);
        }
        Constructor<TraceEntity.VideoMetric.VideoFile.PlayerMetrics> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = TraceEntity.VideoMetric.VideoFile.PlayerMetrics.class.getDeclaredConstructor(TraceEntity.VideoMetric.VideoFile.PlayerMetrics.VideoResolution.class, List.class, Integer.TYPE, c.f34864d);
            this.constructorRef = constructor;
            Intrinsics.checkNotNullExpressionValue(constructor, "also(...)");
        }
        TraceEntity.VideoMetric.VideoFile.PlayerMetrics newInstance = constructor.newInstance(videoResolution, list, Integer.valueOf(i11), null);
        Intrinsics.checkNotNullExpressionValue(newInstance, "newInstance(...)");
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, TraceEntity.VideoMetric.VideoFile.PlayerMetrics value_) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("videoResolution");
        this.nullableVideoResolutionAdapter.mo44toJson(writer, (x) value_.getVideoResolution());
        writer.w("serverTimings");
        this.nullableListOfServerTimingDataAdapter.mo44toJson(writer, (x) value_.getServerTimings());
        writer.p();
    }
}
