package ru.ozon.fintech.features.metrix.data;

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

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0019R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0019¨\u0006\u001d"}, d2 = {"Lru/ozon/fintech/features/metrix/data/DeviceInfoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/fintech/features/metrix/data/DeviceInfo;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/fintech/features/metrix/data/DeviceInfo;", "Lcom/squareup/moshi/x;", "writer", "value_", "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/fintech/features/metrix/data/DeviceInfo;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "", "intAdapter", "Lcom/squareup/moshi/JsonAdapter;", "stringAdapter", "", "booleanAdapter", "metrix_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DeviceInfoJsonAdapter extends JsonAdapter<DeviceInfo> {

    @NotNull
    private final JsonAdapter<Boolean> booleanAdapter;

    @NotNull
    private final JsonAdapter<Integer> intAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<String> stringAdapter;

    public DeviceInfoJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        n.a a11 = n.a.C0918a.a("battery", "cpu", "device_model", "prefetched", "ram");
        Intrinsics.checkNotNullExpressionValue(a11, "of(...)");
        this.options = a11;
        M m11 = M.f71699a;
        JsonAdapter<Integer> f7 = moshi.f(Integer.TYPE, m11, "battery");
        Intrinsics.checkNotNullExpressionValue(f7, "adapter(...)");
        this.intAdapter = f7;
        JsonAdapter<String> f11 = moshi.f(String.class, m11, "deviceModel");
        Intrinsics.checkNotNullExpressionValue(f11, "adapter(...)");
        this.stringAdapter = f11;
        JsonAdapter<Boolean> f12 = moshi.f(Boolean.TYPE, m11, "prefetched");
        Intrinsics.checkNotNullExpressionValue(f12, "adapter(...)");
        this.booleanAdapter = f12;
    }

    @NotNull
    public String toString() {
        return b.c(32, "GeneratedJsonAdapter(DeviceInfo)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public DeviceInfo fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        Integer num = null;
        Integer num2 = null;
        Boolean bool = null;
        Integer num3 = null;
        String str = null;
        while (reader.hasNext()) {
            int v11 = reader.v(this.options);
            if (v11 == -1) {
                reader.y();
                reader.skipValue();
            } else if (v11 == 0) {
                num = this.intAdapter.fromJson(reader);
                if (num == null) {
                    throw c.q("battery", "battery", reader);
                }
            } else if (v11 == 1) {
                num2 = this.intAdapter.fromJson(reader);
                if (num2 == null) {
                    throw c.q("cpu", "cpu", reader);
                }
            } else if (v11 == 2) {
                str = this.stringAdapter.fromJson(reader);
                if (str == null) {
                    throw c.q("deviceModel", "device_model", reader);
                }
            } else if (v11 == 3) {
                bool = this.booleanAdapter.fromJson(reader);
                if (bool == null) {
                    throw c.q("prefetched", "prefetched", reader);
                }
            } else if (v11 == 4 && (num3 = this.intAdapter.fromJson(reader)) == null) {
                throw c.q("ram", "ram", reader);
            }
        }
        reader.endObject();
        Boolean bool2 = bool;
        if (num == null) {
            throw c.j("battery", "battery", reader);
        }
        int intValue = num.intValue();
        if (num2 == null) {
            throw c.j("cpu", "cpu", reader);
        }
        int intValue2 = num2.intValue();
        if (str == null) {
            throw c.j("deviceModel", "device_model", reader);
        }
        if (bool2 == null) {
            throw c.j("prefetched", "prefetched", reader);
        }
        boolean booleanValue = bool2.booleanValue();
        if (num3 != null) {
            return new DeviceInfo(intValue, intValue2, str, booleanValue, num3.intValue());
        }
        throw c.j("ram", "ram", reader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, DeviceInfo value_) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("battery");
        this.intAdapter.mo44toJson(writer, (x) Integer.valueOf(value_.getBattery()));
        writer.w("cpu");
        this.intAdapter.mo44toJson(writer, (x) Integer.valueOf(value_.getCpu()));
        writer.w("device_model");
        this.stringAdapter.mo44toJson(writer, (x) value_.getDeviceModel());
        writer.w("prefetched");
        this.booleanAdapter.mo44toJson(writer, (x) Boolean.valueOf(value_.getPrefetched()));
        writer.w("ram");
        this.intAdapter.mo44toJson(writer, (x) Integer.valueOf(value_.getRam()));
        writer.p();
    }
}
