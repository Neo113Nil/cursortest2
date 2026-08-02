package ru.ozon.fintech.antifraud.internal.models;

import Ak.b;
import Y9.c;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.n;
import com.squareup.moshi.x;
import kotlin.Metadata;
import kotlin.collections.M;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.fintech.antifraud.internal.models.DeviceStatus;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0019¨\u0006\u001d"}, d2 = {"Lru/ozon/fintech/antifraud/internal/models/DeviceStatus_LocationJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/fintech/antifraud/internal/models/DeviceStatus$Location;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/fintech/antifraud/internal/models/DeviceStatus$Location;", "Lcom/squareup/moshi/x;", "writer", "value_", "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/fintech/antifraud/internal/models/DeviceStatus$Location;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "", "doubleAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "intAdapter", "stringAdapter", "internal_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DeviceStatus_LocationJsonAdapter extends JsonAdapter<DeviceStatus.Location> {

    @NotNull
    private final JsonAdapter<Double> doubleAdapter;

    @NotNull
    private final JsonAdapter<Integer> intAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<String> stringAdapter;

    public DeviceStatus_LocationJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        n.a a11 = n.a.C0918a.a("lat", "lon", "accuracy", "geo_source");
        Intrinsics.checkNotNullExpressionValue(a11, "of(...)");
        this.options = a11;
        M m11 = M.f71699a;
        JsonAdapter<Double> f7 = moshi.f(Double.TYPE, m11, "lat");
        Intrinsics.checkNotNullExpressionValue(f7, "adapter(...)");
        this.doubleAdapter = f7;
        JsonAdapter<Integer> f11 = moshi.f(Integer.TYPE, m11, "accuracy");
        Intrinsics.checkNotNullExpressionValue(f11, "adapter(...)");
        this.intAdapter = f11;
        JsonAdapter<String> f12 = moshi.f(String.class, m11, "source");
        Intrinsics.checkNotNullExpressionValue(f12, "adapter(...)");
        this.stringAdapter = f12;
    }

    @NotNull
    public String toString() {
        return b.c(43, "GeneratedJsonAdapter(DeviceStatus.Location)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public DeviceStatus.Location fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        Double d11 = null;
        Double d12 = null;
        Integer num = null;
        String str = null;
        while (reader.hasNext()) {
            int v11 = reader.v(this.options);
            if (v11 == -1) {
                reader.y();
                reader.skipValue();
            } else if (v11 == 0) {
                d11 = this.doubleAdapter.fromJson(reader);
                if (d11 == null) {
                    throw c.q("lat", "lat", reader);
                }
            } else if (v11 == 1) {
                d12 = this.doubleAdapter.fromJson(reader);
                if (d12 == null) {
                    throw c.q("lon", "lon", reader);
                }
            } else if (v11 == 2) {
                num = this.intAdapter.fromJson(reader);
                if (num == null) {
                    throw c.q("accuracy", "accuracy", reader);
                }
            } else if (v11 == 3 && (str = this.stringAdapter.fromJson(reader)) == null) {
                throw c.q("source", "geo_source", reader);
            }
        }
        reader.endObject();
        if (d11 == null) {
            throw c.j("lat", "lat", reader);
        }
        double doubleValue = d11.doubleValue();
        if (d12 == null) {
            throw c.j("lon", "lon", reader);
        }
        double doubleValue2 = d12.doubleValue();
        if (num == null) {
            throw c.j("accuracy", "accuracy", reader);
        }
        int intValue = num.intValue();
        if (str != null) {
            return new DeviceStatus.Location(doubleValue, doubleValue2, intValue, str);
        }
        throw c.j("source", "geo_source", reader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, DeviceStatus.Location value_) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("lat");
        this.doubleAdapter.mo44toJson(writer, (x) Double.valueOf(value_.getLat()));
        writer.w("lon");
        this.doubleAdapter.mo44toJson(writer, (x) Double.valueOf(value_.getLon()));
        writer.w("accuracy");
        this.intAdapter.mo44toJson(writer, (x) Integer.valueOf(value_.getAccuracy()));
        writer.w("geo_source");
        this.stringAdapter.mo44toJson(writer, (x) value_.getSource());
        writer.p();
    }
}
