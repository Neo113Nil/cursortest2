package ru.ozon.composer.network.decode.serialize.adapter;

import T00.b;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.D;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.n;
import com.squareup.moshi.x;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.M;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001cB\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ!\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R(\u0010\u0019\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0016R(\u0010\u001b\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0016¨\u0006\u001d"}, d2 = {"Lru/ozon/composer/network/decode/serialize/adapter/ExperimentsDTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "LT00/b;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)LT00/b;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;LT00/b;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "", "nullableIntAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "", "nullableMapOfStringIntAdapter", "", "nullableMapOfStringAnyAdapter", "a", "composer-network_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ExperimentsDTOJsonAdapter extends JsonAdapter<b> {

    @NotNull
    private final JsonAdapter<Integer> nullableIntAdapter;

    @NotNull
    private final JsonAdapter<Map<String, Object>> nullableMapOfStringAnyAdapter;

    @NotNull
    private final JsonAdapter<Map<String, Integer>> nullableMapOfStringIntAdapter;

    @NotNull
    private final n.a options;

    public static final class a implements JsonAdapter.a {
        @Override // com.squareup.moshi.JsonAdapter.a
        public final JsonAdapter<?> create(@NotNull Type type, @NotNull Set<? extends Annotation> set, @NotNull Moshi moshi) {
            Intrinsics.checkNotNullParameter(type, "type");
            if (Intrinsics.d(Ep.a.b(set, "annotations", moshi, "moshi", type), b.class)) {
                return new ExperimentsDTOJsonAdapter(moshi);
            }
            return null;
        }
    }

    public ExperimentsDTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        n.a a11 = n.a.C0918a.a("abGroup", "experiments", "config");
        Intrinsics.checkNotNullExpressionValue(a11, "of(...)");
        this.options = a11;
        M m11 = M.f71699a;
        JsonAdapter<Integer> f7 = moshi.f(Integer.class, m11, "abGroup");
        Intrinsics.checkNotNullExpressionValue(f7, "adapter(...)");
        this.nullableIntAdapter = f7;
        JsonAdapter<Map<String, Integer>> f11 = moshi.f(D.e(Map.class, String.class, Integer.class), m11, "experiments");
        Intrinsics.checkNotNullExpressionValue(f11, "adapter(...)");
        this.nullableMapOfStringIntAdapter = f11;
        JsonAdapter<Map<String, Object>> f12 = moshi.f(D.e(Map.class, String.class, Object.class), m11, "config");
        Intrinsics.checkNotNullExpressionValue(f12, "adapter(...)");
        this.nullableMapOfStringAnyAdapter = f12;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, b value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public b fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        Integer num = null;
        Map<String, Integer> map = null;
        Map<String, Object> map2 = null;
        while (reader.hasNext()) {
            int v11 = reader.v(this.options);
            if (v11 == -1) {
                reader.y();
                reader.skipValue();
            } else if (v11 == 0) {
                num = this.nullableIntAdapter.fromJson(reader);
            } else if (v11 == 1) {
                map = this.nullableMapOfStringIntAdapter.fromJson(reader);
            } else if (v11 == 2) {
                map2 = this.nullableMapOfStringAnyAdapter.fromJson(reader);
            }
        }
        reader.endObject();
        return new b(num, map, map2);
    }
}
