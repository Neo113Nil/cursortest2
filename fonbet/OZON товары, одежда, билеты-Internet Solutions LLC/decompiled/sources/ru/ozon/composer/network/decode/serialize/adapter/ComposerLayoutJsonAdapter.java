package ru.ozon.composer.network.decode.serialize.adapter;

import T00.m;
import Y9.c;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.n;
import com.squareup.moshi.x;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.M;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001cB\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ!\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0016R\u001c\u0010\u0019\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0016R\u001c\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0016¨\u0006\u001d"}, d2 = {"Lru/ozon/composer/network/decode/serialize/adapter/ComposerLayoutJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "LT00/m;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)LT00/m;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;LT00/m;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "", "longAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "stringAdapter", "nullableStringAdapter", "", "nullableBooleanAdapter", "a", "composer-network_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ComposerLayoutJsonAdapter extends JsonAdapter<m> {

    @NotNull
    private final JsonAdapter<Long> longAdapter;

    @NotNull
    private final JsonAdapter<Boolean> nullableBooleanAdapter;

    @NotNull
    private final JsonAdapter<String> nullableStringAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<String> stringAdapter;

    public static final class a implements JsonAdapter.a {
        @Override // com.squareup.moshi.JsonAdapter.a
        public final JsonAdapter<?> create(@NotNull Type type, @NotNull Set<? extends Annotation> set, @NotNull Moshi moshi) {
            Intrinsics.checkNotNullParameter(type, "type");
            if (Intrinsics.d(Ep.a.b(set, "annotations", moshi, "moshi", type), m.class)) {
                return new ComposerLayoutJsonAdapter(moshi);
            }
            return null;
        }
    }

    public ComposerLayoutJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        n.a a11 = n.a.C0918a.a("version", "vertical", "component", "stateId", "widgetToken", "asyncData", "isTrackView", "isTrackingOn", "widgetViewCellToken");
        Intrinsics.checkNotNullExpressionValue(a11, "of(...)");
        this.options = a11;
        M m11 = M.f71699a;
        JsonAdapter<Long> f7 = moshi.f(Long.TYPE, m11, "version");
        Intrinsics.checkNotNullExpressionValue(f7, "adapter(...)");
        this.longAdapter = f7;
        JsonAdapter<String> f11 = moshi.f(String.class, m11, "vertical");
        Intrinsics.checkNotNullExpressionValue(f11, "adapter(...)");
        this.stringAdapter = f11;
        JsonAdapter<String> f12 = moshi.f(String.class, m11, "stateId");
        Intrinsics.checkNotNullExpressionValue(f12, "adapter(...)");
        this.nullableStringAdapter = f12;
        JsonAdapter<Boolean> e11 = moshi.e(Boolean.class, m11);
        Intrinsics.checkNotNullExpressionValue(e11, "adapter(...)");
        this.nullableBooleanAdapter = e11;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, m value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public m fromJson(@NotNull n reader) {
        boolean z11;
        Intrinsics.checkNotNullParameter(reader, "reader");
        z11 = K00.a.f14851h;
        reader.beginObject();
        Long l11 = null;
        boolean z12 = !z11;
        boolean z13 = false;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        while (reader.hasNext()) {
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    break;
                case 0:
                    l11 = this.longAdapter.fromJson(reader);
                    if (l11 == null) {
                        throw c.q("version", "version", reader);
                    }
                    break;
                case 1:
                    str = this.stringAdapter.fromJson(reader);
                    if (str == null) {
                        throw c.q("vertical", "vertical", reader);
                    }
                    break;
                case 2:
                    str2 = this.stringAdapter.fromJson(reader);
                    if (str2 == null) {
                        throw c.q("component", "component", reader);
                    }
                    break;
                case 3:
                    str3 = this.nullableStringAdapter.fromJson(reader);
                    break;
                case 4:
                    str4 = this.nullableStringAdapter.fromJson(reader);
                    break;
                case 5:
                    str5 = this.nullableStringAdapter.fromJson(reader);
                    break;
                case 6:
                    Boolean fromJson = this.nullableBooleanAdapter.fromJson(reader);
                    if (fromJson == null) {
                        z13 = false;
                        break;
                    } else {
                        z13 = fromJson.booleanValue();
                        break;
                    }
                case 7:
                    if (!z11) {
                        reader.skipValue();
                        break;
                    } else {
                        Boolean fromJson2 = this.nullableBooleanAdapter.fromJson(reader);
                        if (fromJson2 == null) {
                            z12 = false;
                            break;
                        } else {
                            z12 = fromJson2.booleanValue();
                            break;
                        }
                    }
                case 8:
                    str6 = this.nullableStringAdapter.fromJson(reader);
                    break;
            }
        }
        reader.endObject();
        if (l11 == null) {
            throw c.j("version", "version", reader);
        }
        long longValue = l11.longValue();
        if (str == null) {
            throw c.j("vertical", "vertical", reader);
        }
        if (str2 != null) {
            return new m(longValue, str, str2, str3, str4, str5, z13, z12, str6);
        }
        throw c.j("component", "component", reader);
    }
}
