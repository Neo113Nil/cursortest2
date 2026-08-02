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
import ru.ozon.tracker.performance.model.TraceEntity;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001c\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0018R\u001c\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0018R\u001e\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Lru/ozon/tracker/performance/model/TraceEntity_VideoMetric_VideoFileJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/tracker/performance/model/TraceEntity$VideoMetric$VideoFile;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/tracker/performance/model/TraceEntity$VideoMetric$VideoFile;", "Lcom/squareup/moshi/x;", "writer", "value_", "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/tracker/performance/model/TraceEntity$VideoMetric$VideoFile;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/tracker/performance/model/TraceEntity$VideoMetric$VideoFile$AppMetrics;", "nullableAppMetricsAdapter", "Lru/ozon/tracker/performance/model/TraceEntity$VideoMetric$VideoFile$PlayerMetrics;", "nullablePlayerMetricsAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "tracker-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TraceEntity_VideoMetric_VideoFileJsonAdapter extends JsonAdapter<TraceEntity.VideoMetric.VideoFile> {
    private volatile Constructor<TraceEntity.VideoMetric.VideoFile> constructorRef;

    @NotNull
    private final JsonAdapter<TraceEntity.VideoMetric.VideoFile.AppMetrics> nullableAppMetricsAdapter;

    @NotNull
    private final JsonAdapter<TraceEntity.VideoMetric.VideoFile.PlayerMetrics> nullablePlayerMetricsAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<String> stringAdapter;

    public TraceEntity_VideoMetric_VideoFileJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        n.a a11 = n.a.C0918a.a(ImagesContract.URL, "appMetrics", "playerMetrics");
        Intrinsics.checkNotNullExpressionValue(a11, "of(...)");
        this.options = a11;
        M m11 = M.f71699a;
        JsonAdapter<String> f7 = moshi.f(String.class, m11, ImagesContract.URL);
        Intrinsics.checkNotNullExpressionValue(f7, "adapter(...)");
        this.stringAdapter = f7;
        JsonAdapter<TraceEntity.VideoMetric.VideoFile.AppMetrics> f11 = moshi.f(TraceEntity.VideoMetric.VideoFile.AppMetrics.class, m11, "appMetrics");
        Intrinsics.checkNotNullExpressionValue(f11, "adapter(...)");
        this.nullableAppMetricsAdapter = f11;
        JsonAdapter<TraceEntity.VideoMetric.VideoFile.PlayerMetrics> f12 = moshi.f(TraceEntity.VideoMetric.VideoFile.PlayerMetrics.class, m11, "playerMetrics");
        Intrinsics.checkNotNullExpressionValue(f12, "adapter(...)");
        this.nullablePlayerMetricsAdapter = f12;
    }

    @NotNull
    public String toString() {
        return b.c(55, "GeneratedJsonAdapter(TraceEntity.VideoMetric.VideoFile)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public TraceEntity.VideoMetric.VideoFile fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        String str = null;
        TraceEntity.VideoMetric.VideoFile.AppMetrics appMetrics = null;
        TraceEntity.VideoMetric.VideoFile.PlayerMetrics playerMetrics = null;
        int i11 = -1;
        while (reader.hasNext()) {
            int v11 = reader.v(this.options);
            if (v11 == -1) {
                reader.y();
                reader.skipValue();
            } else if (v11 == 0) {
                str = this.stringAdapter.fromJson(reader);
                if (str == null) {
                    throw c.q(ImagesContract.URL, ImagesContract.URL, reader);
                }
            } else if (v11 == 1) {
                appMetrics = this.nullableAppMetricsAdapter.fromJson(reader);
                i11 &= -3;
            } else if (v11 == 2) {
                playerMetrics = this.nullablePlayerMetricsAdapter.fromJson(reader);
                i11 &= -5;
            }
        }
        reader.endObject();
        if (i11 == -7) {
            if (str != null) {
                return new TraceEntity.VideoMetric.VideoFile(str, appMetrics, playerMetrics);
            }
            throw c.j(ImagesContract.URL, ImagesContract.URL, reader);
        }
        Constructor<TraceEntity.VideoMetric.VideoFile> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = TraceEntity.VideoMetric.VideoFile.class.getDeclaredConstructor(String.class, TraceEntity.VideoMetric.VideoFile.AppMetrics.class, TraceEntity.VideoMetric.VideoFile.PlayerMetrics.class, Integer.TYPE, c.f34864d);
            this.constructorRef = constructor;
            Intrinsics.checkNotNullExpressionValue(constructor, "also(...)");
        }
        if (str == null) {
            throw c.j(ImagesContract.URL, ImagesContract.URL, reader);
        }
        TraceEntity.VideoMetric.VideoFile newInstance = constructor.newInstance(str, appMetrics, playerMetrics, Integer.valueOf(i11), null);
        Intrinsics.checkNotNullExpressionValue(newInstance, "newInstance(...)");
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, TraceEntity.VideoMetric.VideoFile value_) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w(ImagesContract.URL);
        this.stringAdapter.mo44toJson(writer, (x) value_.getUrl());
        writer.w("appMetrics");
        this.nullableAppMetricsAdapter.mo44toJson(writer, (x) value_.getAppMetrics());
        writer.w("playerMetrics");
        this.nullablePlayerMetricsAdapter.mo44toJson(writer, (x) value_.getPlayerMetrics());
        writer.p();
    }
}
