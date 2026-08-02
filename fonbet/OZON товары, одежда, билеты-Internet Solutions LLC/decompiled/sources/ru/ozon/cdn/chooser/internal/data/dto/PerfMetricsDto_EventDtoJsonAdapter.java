package ru.ozon.cdn.chooser.internal.data.dto;

import Ak.b;
import Y9.c;
import com.squareup.moshi.D;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.n;
import com.squareup.moshi.x;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.M;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.networkinfo.models.NetworkConnectionType;
import ru.ozon.cdn.chooser.internal.data.dto.PerfMetricsDto;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R&\u0010\u001b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u001a0\u00190\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0018R\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0018¨\u0006\u001e"}, d2 = {"Lru/ozon/cdn/chooser/internal/data/dto/PerfMetricsDto_EventDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/cdn/chooser/internal/data/dto/PerfMetricsDto$EventDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/cdn/chooser/internal/data/dto/PerfMetricsDto$EventDto;", "Lcom/squareup/moshi/x;", "writer", "value_", "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/cdn/chooser/internal/data/dto/PerfMetricsDto$EventDto;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "", "mapOfStringDoubleAdapter", "Lru/ozon/android/networkinfo/models/NetworkConnectionType;", "networkConnectionTypeAdapter", "cdn-chooser_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class PerfMetricsDto_EventDtoJsonAdapter extends JsonAdapter<PerfMetricsDto.EventDto> {

    @NotNull
    private final JsonAdapter<Map<String, Double>> mapOfStringDoubleAdapter;

    @NotNull
    private final JsonAdapter<NetworkConnectionType> networkConnectionTypeAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<String> stringAdapter;

    public PerfMetricsDto_EventDtoJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        n.a a11 = n.a.C0918a.a("popId", "imageId", "timeMetrics", "connectionType");
        Intrinsics.checkNotNullExpressionValue(a11, "of(...)");
        this.options = a11;
        M m11 = M.f71699a;
        JsonAdapter<String> f7 = moshi.f(String.class, m11, "popId");
        Intrinsics.checkNotNullExpressionValue(f7, "adapter(...)");
        this.stringAdapter = f7;
        JsonAdapter<Map<String, Double>> f11 = moshi.f(D.e(Map.class, String.class, Double.class), m11, "timeMetrics");
        Intrinsics.checkNotNullExpressionValue(f11, "adapter(...)");
        this.mapOfStringDoubleAdapter = f11;
        JsonAdapter<NetworkConnectionType> f12 = moshi.f(NetworkConnectionType.class, m11, "connectionType");
        Intrinsics.checkNotNullExpressionValue(f12, "adapter(...)");
        this.networkConnectionTypeAdapter = f12;
    }

    @NotNull
    public String toString() {
        return b.c(45, "GeneratedJsonAdapter(PerfMetricsDto.EventDto)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public PerfMetricsDto.EventDto fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        String str = null;
        String str2 = null;
        Map<String, Double> map = null;
        NetworkConnectionType networkConnectionType = null;
        while (reader.hasNext()) {
            int v11 = reader.v(this.options);
            if (v11 == -1) {
                reader.y();
                reader.skipValue();
            } else if (v11 == 0) {
                str = this.stringAdapter.fromJson(reader);
                if (str == null) {
                    throw c.q("popId", "popId", reader);
                }
            } else if (v11 == 1) {
                str2 = this.stringAdapter.fromJson(reader);
                if (str2 == null) {
                    throw c.q("imageId", "imageId", reader);
                }
            } else if (v11 == 2) {
                map = this.mapOfStringDoubleAdapter.fromJson(reader);
                if (map == null) {
                    throw c.q("timeMetrics", "timeMetrics", reader);
                }
            } else if (v11 == 3 && (networkConnectionType = this.networkConnectionTypeAdapter.fromJson(reader)) == null) {
                throw c.q("connectionType", "connectionType", reader);
            }
        }
        reader.endObject();
        if (str == null) {
            throw c.j("popId", "popId", reader);
        }
        if (str2 == null) {
            throw c.j("imageId", "imageId", reader);
        }
        if (map == null) {
            throw c.j("timeMetrics", "timeMetrics", reader);
        }
        if (networkConnectionType != null) {
            return new PerfMetricsDto.EventDto(str, str2, map, networkConnectionType);
        }
        throw c.j("connectionType", "connectionType", reader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, PerfMetricsDto.EventDto value_) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("popId");
        this.stringAdapter.mo44toJson(writer, (x) value_.getPopId());
        writer.w("imageId");
        this.stringAdapter.mo44toJson(writer, (x) value_.getImageId());
        writer.w("timeMetrics");
        this.mapOfStringDoubleAdapter.mo44toJson(writer, (x) value_.getTimeMetrics());
        writer.w("connectionType");
        this.networkConnectionTypeAdapter.mo44toJson(writer, (x) value_.getConnectionType());
        writer.p();
    }
}
