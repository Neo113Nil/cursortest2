package ru.ozon.app.android.mediaupload.video.metrics.data;

import Ak.b;
import Y9.c;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.D;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.n;
import com.squareup.moshi.x;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.M;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.mediaupload.video.metrics.data.UploadMetricsRequestBody;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0018R\u001c\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0018R\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0018R\"\u0010 \u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u001e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u0018¨\u0006!"}, d2 = {"Lru/ozon/app/android/mediaupload/video/metrics/data/UploadMetricsRequestBody_EventJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/mediaupload/video/metrics/data/UploadMetricsRequestBody$Event;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/mediaupload/video/metrics/data/UploadMetricsRequestBody$Event;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/mediaupload/video/metrics/data/UploadMetricsRequestBody$Event;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "longAdapter", "nullableLongAdapter", "", "intAdapter", "", "Lru/ozon/app/android/mediaupload/video/metrics/data/UploadMetricsRequestBody$Event$ServerTiming;", "nullableListOfServerTimingAdapter", "mediaupload_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class UploadMetricsRequestBody_EventJsonAdapter extends JsonAdapter<UploadMetricsRequestBody.Event> {

    @NotNull
    private final JsonAdapter<Integer> intAdapter;

    @NotNull
    private final JsonAdapter<Long> longAdapter;

    @NotNull
    private final JsonAdapter<List<UploadMetricsRequestBody.Event.ServerTiming>> nullableListOfServerTimingAdapter;

    @NotNull
    private final JsonAdapter<Long> nullableLongAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<String> stringAdapter;

    public UploadMetricsRequestBody_EventJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("eventType", "uploadRequestId", "start", "end", "size", "responseCode", "serverTimings");
        M m11 = M.f71699a;
        this.stringAdapter = moshi.f(String.class, m11, "eventType");
        this.longAdapter = moshi.f(Long.TYPE, m11, "start");
        this.nullableLongAdapter = moshi.f(Long.class, m11, "size");
        this.intAdapter = moshi.f(Integer.TYPE, m11, "responseCode");
        this.nullableListOfServerTimingAdapter = moshi.f(D.e(List.class, UploadMetricsRequestBody.Event.ServerTiming.class), m11, "serverTimings");
    }

    @NotNull
    public String toString() {
        return b.c(52, "GeneratedJsonAdapter(UploadMetricsRequestBody.Event)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public UploadMetricsRequestBody.Event fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        Long l11 = null;
        Long l12 = null;
        String str = null;
        String str2 = null;
        Integer num = null;
        Long l13 = null;
        List<UploadMetricsRequestBody.Event.ServerTiming> list = null;
        while (reader.hasNext()) {
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    break;
                case 0:
                    str = this.stringAdapter.fromJson(reader);
                    if (str == null) {
                        throw c.q("eventType", "eventType", reader);
                    }
                    break;
                case 1:
                    str2 = this.stringAdapter.fromJson(reader);
                    if (str2 == null) {
                        throw c.q("uploadRequestId", "uploadRequestId", reader);
                    }
                    break;
                case 2:
                    l11 = this.longAdapter.fromJson(reader);
                    if (l11 == null) {
                        throw c.q("start", "start", reader);
                    }
                    break;
                case 3:
                    l12 = this.longAdapter.fromJson(reader);
                    if (l12 == null) {
                        throw c.q("end", "end", reader);
                    }
                    break;
                case 4:
                    l13 = this.nullableLongAdapter.fromJson(reader);
                    break;
                case 5:
                    num = this.intAdapter.fromJson(reader);
                    if (num == null) {
                        throw c.q("responseCode", "responseCode", reader);
                    }
                    break;
                case 6:
                    list = this.nullableListOfServerTimingAdapter.fromJson(reader);
                    break;
            }
        }
        reader.endObject();
        Long l14 = l12;
        if (str == null) {
            throw c.j("eventType", "eventType", reader);
        }
        if (str2 == null) {
            throw c.j("uploadRequestId", "uploadRequestId", reader);
        }
        if (l11 == null) {
            throw c.j("start", "start", reader);
        }
        long longValue = l11.longValue();
        if (l14 == null) {
            throw c.j("end", "end", reader);
        }
        long longValue2 = l14.longValue();
        if (num != null) {
            return new UploadMetricsRequestBody.Event(str, str2, longValue, longValue2, l13, num.intValue(), list);
        }
        throw c.j("responseCode", "responseCode", reader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, UploadMetricsRequestBody.Event value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("eventType");
        this.stringAdapter.mo44toJson(writer, (x) value.getEventType());
        writer.w("uploadRequestId");
        this.stringAdapter.mo44toJson(writer, (x) value.getUploadRequestId());
        writer.w("start");
        this.longAdapter.mo44toJson(writer, (x) Long.valueOf(value.getStart()));
        writer.w("end");
        this.longAdapter.mo44toJson(writer, (x) Long.valueOf(value.getEnd()));
        writer.w("size");
        this.nullableLongAdapter.mo44toJson(writer, (x) value.getSize());
        writer.w("responseCode");
        this.intAdapter.mo44toJson(writer, (x) Integer.valueOf(value.getResponseCode()));
        writer.w("serverTimings");
        this.nullableListOfServerTimingAdapter.mo44toJson(writer, (x) value.getServerTimings());
        writer.p();
    }
}
