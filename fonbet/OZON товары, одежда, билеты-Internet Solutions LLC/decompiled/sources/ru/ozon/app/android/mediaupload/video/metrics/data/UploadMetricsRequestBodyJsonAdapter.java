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

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0018R \u0010\u001d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001c0\u001b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0018¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/mediaupload/video/metrics/data/UploadMetricsRequestBodyJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/mediaupload/video/metrics/data/UploadMetricsRequestBody;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/mediaupload/video/metrics/data/UploadMetricsRequestBody;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/mediaupload/video/metrics/data/UploadMetricsRequestBody;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "booleanAdapter", "", "Lru/ozon/app/android/mediaupload/video/metrics/data/UploadMetricsRequestBody$Event;", "listOfEventAdapter", "mediaupload_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class UploadMetricsRequestBodyJsonAdapter extends JsonAdapter<UploadMetricsRequestBody> {

    @NotNull
    private final JsonAdapter<Boolean> booleanAdapter;

    @NotNull
    private final JsonAdapter<List<UploadMetricsRequestBody.Event>> listOfEventAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<String> stringAdapter;

    public UploadMetricsRequestBodyJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("uploadID", "uploadProcessId", "clientName", "clientVersion", "clientTeam", "videoType", "domain", "path", "isFinished", "isCanceled", "events");
        M m11 = M.f71699a;
        this.stringAdapter = moshi.f(String.class, m11, "uploadID");
        this.booleanAdapter = moshi.f(Boolean.TYPE, m11, "isFinished");
        this.listOfEventAdapter = moshi.f(D.e(List.class, UploadMetricsRequestBody.Event.class), m11, "events");
    }

    @NotNull
    public String toString() {
        return b.c(46, "GeneratedJsonAdapter(UploadMetricsRequestBody)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public UploadMetricsRequestBody fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        Boolean bool = null;
        Boolean bool2 = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        List<UploadMetricsRequestBody.Event> list = null;
        while (true) {
            Boolean bool3 = bool;
            Boolean bool4 = bool2;
            String str9 = str;
            String str10 = str2;
            String str11 = str3;
            String str12 = str4;
            String str13 = str5;
            String str14 = str6;
            String str15 = str7;
            if (!reader.hasNext()) {
                reader.endObject();
                if (str9 == null) {
                    throw c.j("uploadID", "uploadID", reader);
                }
                if (str10 == null) {
                    throw c.j("uploadProcessId", "uploadProcessId", reader);
                }
                if (str11 == null) {
                    throw c.j("clientName", "clientName", reader);
                }
                if (str12 == null) {
                    throw c.j("clientVersion", "clientVersion", reader);
                }
                if (str13 == null) {
                    throw c.j("clientTeam", "clientTeam", reader);
                }
                if (str14 == null) {
                    throw c.j("videoType", "videoType", reader);
                }
                if (str15 == null) {
                    throw c.j("domain", "domain", reader);
                }
                if (str8 == null) {
                    throw c.j("path", "path", reader);
                }
                if (bool3 == null) {
                    throw c.j("isFinished", "isFinished", reader);
                }
                boolean booleanValue = bool3.booleanValue();
                if (bool4 == null) {
                    throw c.j("isCanceled", "isCanceled", reader);
                }
                boolean booleanValue2 = bool4.booleanValue();
                if (list != null) {
                    return new UploadMetricsRequestBody(str9, str10, str11, str12, str13, str14, str15, str8, booleanValue, booleanValue2, list);
                }
                throw c.j("events", "events", reader);
            }
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    bool = bool3;
                    bool2 = bool4;
                    str = str9;
                    str2 = str10;
                    str3 = str11;
                    str4 = str12;
                    str5 = str13;
                    str6 = str14;
                    str7 = str15;
                case 0:
                    str = this.stringAdapter.fromJson(reader);
                    if (str == null) {
                        throw c.q("uploadID", "uploadID", reader);
                    }
                    bool = bool3;
                    bool2 = bool4;
                    str2 = str10;
                    str3 = str11;
                    str4 = str12;
                    str5 = str13;
                    str6 = str14;
                    str7 = str15;
                case 1:
                    str2 = this.stringAdapter.fromJson(reader);
                    if (str2 == null) {
                        throw c.q("uploadProcessId", "uploadProcessId", reader);
                    }
                    bool = bool3;
                    bool2 = bool4;
                    str = str9;
                    str3 = str11;
                    str4 = str12;
                    str5 = str13;
                    str6 = str14;
                    str7 = str15;
                case 2:
                    str3 = this.stringAdapter.fromJson(reader);
                    if (str3 == null) {
                        throw c.q("clientName", "clientName", reader);
                    }
                    bool = bool3;
                    bool2 = bool4;
                    str = str9;
                    str2 = str10;
                    str4 = str12;
                    str5 = str13;
                    str6 = str14;
                    str7 = str15;
                case 3:
                    str4 = this.stringAdapter.fromJson(reader);
                    if (str4 == null) {
                        throw c.q("clientVersion", "clientVersion", reader);
                    }
                    bool = bool3;
                    bool2 = bool4;
                    str = str9;
                    str2 = str10;
                    str3 = str11;
                    str5 = str13;
                    str6 = str14;
                    str7 = str15;
                case 4:
                    str5 = this.stringAdapter.fromJson(reader);
                    if (str5 == null) {
                        throw c.q("clientTeam", "clientTeam", reader);
                    }
                    bool = bool3;
                    bool2 = bool4;
                    str = str9;
                    str2 = str10;
                    str3 = str11;
                    str4 = str12;
                    str6 = str14;
                    str7 = str15;
                case 5:
                    str6 = this.stringAdapter.fromJson(reader);
                    if (str6 == null) {
                        throw c.q("videoType", "videoType", reader);
                    }
                    bool = bool3;
                    bool2 = bool4;
                    str = str9;
                    str2 = str10;
                    str3 = str11;
                    str4 = str12;
                    str5 = str13;
                    str7 = str15;
                case 6:
                    str7 = this.stringAdapter.fromJson(reader);
                    if (str7 == null) {
                        throw c.q("domain", "domain", reader);
                    }
                    bool = bool3;
                    bool2 = bool4;
                    str = str9;
                    str2 = str10;
                    str3 = str11;
                    str4 = str12;
                    str5 = str13;
                    str6 = str14;
                case 7:
                    str8 = this.stringAdapter.fromJson(reader);
                    if (str8 == null) {
                        throw c.q("path", "path", reader);
                    }
                    bool = bool3;
                    bool2 = bool4;
                    str = str9;
                    str2 = str10;
                    str3 = str11;
                    str4 = str12;
                    str5 = str13;
                    str6 = str14;
                    str7 = str15;
                case 8:
                    bool = this.booleanAdapter.fromJson(reader);
                    if (bool == null) {
                        throw c.q("isFinished", "isFinished", reader);
                    }
                    bool2 = bool4;
                    str = str9;
                    str2 = str10;
                    str3 = str11;
                    str4 = str12;
                    str5 = str13;
                    str6 = str14;
                    str7 = str15;
                case 9:
                    bool2 = this.booleanAdapter.fromJson(reader);
                    if (bool2 == null) {
                        throw c.q("isCanceled", "isCanceled", reader);
                    }
                    bool = bool3;
                    str = str9;
                    str2 = str10;
                    str3 = str11;
                    str4 = str12;
                    str5 = str13;
                    str6 = str14;
                    str7 = str15;
                case 10:
                    list = this.listOfEventAdapter.fromJson(reader);
                    if (list == null) {
                        throw c.q("events", "events", reader);
                    }
                    bool = bool3;
                    bool2 = bool4;
                    str = str9;
                    str2 = str10;
                    str3 = str11;
                    str4 = str12;
                    str5 = str13;
                    str6 = str14;
                    str7 = str15;
                default:
                    bool = bool3;
                    bool2 = bool4;
                    str = str9;
                    str2 = str10;
                    str3 = str11;
                    str4 = str12;
                    str5 = str13;
                    str6 = str14;
                    str7 = str15;
            }
        }
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, UploadMetricsRequestBody value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("uploadID");
        this.stringAdapter.mo44toJson(writer, (x) value.getUploadID());
        writer.w("uploadProcessId");
        this.stringAdapter.mo44toJson(writer, (x) value.getUploadProcessId());
        writer.w("clientName");
        this.stringAdapter.mo44toJson(writer, (x) value.getClientName());
        writer.w("clientVersion");
        this.stringAdapter.mo44toJson(writer, (x) value.getClientVersion());
        writer.w("clientTeam");
        this.stringAdapter.mo44toJson(writer, (x) value.getClientTeam());
        writer.w("videoType");
        this.stringAdapter.mo44toJson(writer, (x) value.getVideoType());
        writer.w("domain");
        this.stringAdapter.mo44toJson(writer, (x) value.getDomain());
        writer.w("path");
        this.stringAdapter.mo44toJson(writer, (x) value.getPath());
        writer.w("isFinished");
        this.booleanAdapter.mo44toJson(writer, (x) Boolean.valueOf(value.isFinished()));
        writer.w("isCanceled");
        this.booleanAdapter.mo44toJson(writer, (x) Boolean.valueOf(value.isCanceled()));
        writer.w("events");
        this.listOfEventAdapter.mo44toJson(writer, (x) value.getEvents());
        writer.p();
    }
}
