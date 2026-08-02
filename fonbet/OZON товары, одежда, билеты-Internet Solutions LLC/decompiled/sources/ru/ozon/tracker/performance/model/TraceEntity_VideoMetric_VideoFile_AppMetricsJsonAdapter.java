package ru.ozon.tracker.performance.model;

import Ak.b;
import Y9.c;
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

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001e\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lru/ozon/tracker/performance/model/TraceEntity_VideoMetric_VideoFile_AppMetricsJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/tracker/performance/model/TraceEntity$VideoMetric$VideoFile$AppMetrics;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/tracker/performance/model/TraceEntity$VideoMetric$VideoFile$AppMetrics;", "Lcom/squareup/moshi/x;", "writer", "value_", "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/tracker/performance/model/TraceEntity$VideoMetric$VideoFile$AppMetrics;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "", "nullableDoubleAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "tracker-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TraceEntity_VideoMetric_VideoFile_AppMetricsJsonAdapter extends JsonAdapter<TraceEntity.VideoMetric.VideoFile.AppMetrics> {
    private volatile Constructor<TraceEntity.VideoMetric.VideoFile.AppMetrics> constructorRef;

    @NotNull
    private final JsonAdapter<Double> nullableDoubleAdapter;

    @NotNull
    private final n.a options;

    public TraceEntity_VideoMetric_VideoFile_AppMetricsJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        n.a a11 = n.a.C0918a.a("dnsTime", "tcpTime", "tlsTime", "requestTime", "serverTime", "responseTime", "protocolVersion", "timeToFirstByte", "timeToLastByte", "encodedSize", "decodedSize", "transferSize");
        Intrinsics.checkNotNullExpressionValue(a11, "of(...)");
        this.options = a11;
        JsonAdapter<Double> f7 = moshi.f(Double.class, M.f71699a, "dnsTime");
        Intrinsics.checkNotNullExpressionValue(f7, "adapter(...)");
        this.nullableDoubleAdapter = f7;
    }

    @NotNull
    public String toString() {
        return b.c(66, "GeneratedJsonAdapter(TraceEntity.VideoMetric.VideoFile.AppMetrics)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public TraceEntity.VideoMetric.VideoFile.AppMetrics fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        int i11 = -1;
        Double d11 = null;
        Double d12 = null;
        Double d13 = null;
        Double d14 = null;
        Double d15 = null;
        Double d16 = null;
        Double d17 = null;
        Double d18 = null;
        Double d19 = null;
        Double d21 = null;
        Double d22 = null;
        Double d23 = null;
        while (reader.hasNext()) {
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    break;
                case 0:
                    d11 = this.nullableDoubleAdapter.fromJson(reader);
                    i11 &= -2;
                    break;
                case 1:
                    d12 = this.nullableDoubleAdapter.fromJson(reader);
                    i11 &= -3;
                    break;
                case 2:
                    d13 = this.nullableDoubleAdapter.fromJson(reader);
                    i11 &= -5;
                    break;
                case 3:
                    d14 = this.nullableDoubleAdapter.fromJson(reader);
                    i11 &= -9;
                    break;
                case 4:
                    d15 = this.nullableDoubleAdapter.fromJson(reader);
                    i11 &= -17;
                    break;
                case 5:
                    d16 = this.nullableDoubleAdapter.fromJson(reader);
                    i11 &= -33;
                    break;
                case 6:
                    d17 = this.nullableDoubleAdapter.fromJson(reader);
                    i11 &= -65;
                    break;
                case 7:
                    d18 = this.nullableDoubleAdapter.fromJson(reader);
                    i11 &= -129;
                    break;
                case 8:
                    d19 = this.nullableDoubleAdapter.fromJson(reader);
                    i11 &= -257;
                    break;
                case 9:
                    d21 = this.nullableDoubleAdapter.fromJson(reader);
                    i11 &= -513;
                    break;
                case 10:
                    d22 = this.nullableDoubleAdapter.fromJson(reader);
                    i11 &= -1025;
                    break;
                case 11:
                    d23 = this.nullableDoubleAdapter.fromJson(reader);
                    i11 &= -2049;
                    break;
            }
        }
        reader.endObject();
        if (i11 == -4096) {
            Double d24 = d19;
            Double d25 = d18;
            Double d26 = d17;
            Double d27 = d16;
            Double d28 = d15;
            Double d29 = d14;
            return new TraceEntity.VideoMetric.VideoFile.AppMetrics(d11, d12, d13, d29, d28, d27, d26, d25, d24, d21, d22, d23);
        }
        Double d31 = d19;
        Double d32 = d18;
        Double d33 = d17;
        Double d34 = d16;
        Double d35 = d15;
        Double d36 = d14;
        Double d37 = d13;
        Double d38 = d12;
        Double d39 = d11;
        Constructor<TraceEntity.VideoMetric.VideoFile.AppMetrics> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = TraceEntity.VideoMetric.VideoFile.AppMetrics.class.getDeclaredConstructor(Double.class, Double.class, Double.class, Double.class, Double.class, Double.class, Double.class, Double.class, Double.class, Double.class, Double.class, Double.class, Integer.TYPE, c.f34864d);
            this.constructorRef = constructor;
            Intrinsics.checkNotNullExpressionValue(constructor, "also(...)");
        }
        TraceEntity.VideoMetric.VideoFile.AppMetrics newInstance = constructor.newInstance(d39, d38, d37, d36, d35, d34, d33, d32, d31, d21, d22, d23, Integer.valueOf(i11), null);
        Intrinsics.checkNotNullExpressionValue(newInstance, "newInstance(...)");
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, TraceEntity.VideoMetric.VideoFile.AppMetrics value_) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("dnsTime");
        this.nullableDoubleAdapter.mo44toJson(writer, (x) value_.getDnsTime());
        writer.w("tcpTime");
        this.nullableDoubleAdapter.mo44toJson(writer, (x) value_.getTcpTime());
        writer.w("tlsTime");
        this.nullableDoubleAdapter.mo44toJson(writer, (x) value_.getTlsTime());
        writer.w("requestTime");
        this.nullableDoubleAdapter.mo44toJson(writer, (x) value_.getRequestTime());
        writer.w("serverTime");
        this.nullableDoubleAdapter.mo44toJson(writer, (x) value_.getServerTime());
        writer.w("responseTime");
        this.nullableDoubleAdapter.mo44toJson(writer, (x) value_.getResponseTime());
        writer.w("protocolVersion");
        this.nullableDoubleAdapter.mo44toJson(writer, (x) value_.getProtocolVersion());
        writer.w("timeToFirstByte");
        this.nullableDoubleAdapter.mo44toJson(writer, (x) value_.getTimeToFirstByte());
        writer.w("timeToLastByte");
        this.nullableDoubleAdapter.mo44toJson(writer, (x) value_.getTimeToLastByte());
        writer.w("encodedSize");
        this.nullableDoubleAdapter.mo44toJson(writer, (x) value_.getEncodedSize());
        writer.w("decodedSize");
        this.nullableDoubleAdapter.mo44toJson(writer, (x) value_.getDecodedSize());
        writer.w("transferSize");
        this.nullableDoubleAdapter.mo44toJson(writer, (x) value_.getTransferSize());
        writer.p();
    }
}
