package ru.ozon.composer.network.decode.serialize.adapter;

import T00.b;
import T00.c;
import T00.e;
import T00.k;
import T00.l;
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

@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001#B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ!\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0016R\u001c\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0016R\u001c\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0016R(\u0010\u001e\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u001d0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0016R\u001c\u0010 \u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u0016R(\u0010\"\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020!\u0018\u00010\u001d0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u0016¨\u0006$"}, d2 = {"Lru/ozon/composer/network/decode/serialize/adapter/ComposerStateJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "LT00/a;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)LT00/a;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;LT00/a;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "", "nullableStringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "LT00/e;", "nullablePageInfoAdapter", "LT00/k;", "nullableSharedDTOAdapter", "LT00/b;", "nullableExperimentsAdapter", "", "nullableMapOfStringStringAdapter", "LT00/c;", "nullableLayoutTrackingInfoAdapter", "LT00/l;", "nullableMapOfStringTrackingTokenAliasesAdapter", "a", "composer-network_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ComposerStateJsonAdapter extends JsonAdapter<T00.a> {

    @NotNull
    private final JsonAdapter<b> nullableExperimentsAdapter;

    @NotNull
    private final JsonAdapter<c> nullableLayoutTrackingInfoAdapter;

    @NotNull
    private final JsonAdapter<Map<String, String>> nullableMapOfStringStringAdapter;

    @NotNull
    private final JsonAdapter<Map<String, l>> nullableMapOfStringTrackingTokenAliasesAdapter;

    @NotNull
    private final JsonAdapter<e> nullablePageInfoAdapter;

    @NotNull
    private final JsonAdapter<k> nullableSharedDTOAdapter;

    @NotNull
    private final JsonAdapter<String> nullableStringAdapter;

    @NotNull
    private final n.a options;

    public static final class a implements JsonAdapter.a {
        @Override // com.squareup.moshi.JsonAdapter.a
        public final JsonAdapter<?> create(@NotNull Type type, @NotNull Set<? extends Annotation> set, @NotNull Moshi moshi) {
            Intrinsics.checkNotNullParameter(type, "type");
            if (Intrinsics.d(Ep.a.b(set, "annotations", moshi, "moshi", type), T00.a.class)) {
                return new ComposerStateJsonAdapter(moshi);
            }
            return null;
        }
    }

    public ComposerStateJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        n.a a11 = n.a.C0918a.a("prevPage", "nextPage", "pageInfo", "shared", "pageToken", "userToken", "experiments", "trackingPayloads", "layoutTrackingInfo", "trackingTokenAliases");
        Intrinsics.checkNotNullExpressionValue(a11, "of(...)");
        this.options = a11;
        M m11 = M.f71699a;
        JsonAdapter<String> f7 = moshi.f(String.class, m11, "currentPage");
        Intrinsics.checkNotNullExpressionValue(f7, "adapter(...)");
        this.nullableStringAdapter = f7;
        JsonAdapter<e> f11 = moshi.f(e.class, m11, "pageInfo");
        Intrinsics.checkNotNullExpressionValue(f11, "adapter(...)");
        this.nullablePageInfoAdapter = f11;
        JsonAdapter<k> f12 = moshi.f(k.class, m11, "shared");
        Intrinsics.checkNotNullExpressionValue(f12, "adapter(...)");
        this.nullableSharedDTOAdapter = f12;
        JsonAdapter<b> f13 = moshi.f(b.class, m11, "experiments");
        Intrinsics.checkNotNullExpressionValue(f13, "adapter(...)");
        this.nullableExperimentsAdapter = f13;
        JsonAdapter<Map<String, String>> f14 = moshi.f(D.e(Map.class, String.class, String.class), m11, "trackingPayloads");
        Intrinsics.checkNotNullExpressionValue(f14, "adapter(...)");
        this.nullableMapOfStringStringAdapter = f14;
        JsonAdapter<c> f15 = moshi.f(c.class, m11, "layoutTrackingInfo");
        Intrinsics.checkNotNullExpressionValue(f15, "adapter(...)");
        this.nullableLayoutTrackingInfoAdapter = f15;
        JsonAdapter<Map<String, l>> f16 = moshi.f(D.e(Map.class, String.class, l.class), m11, "trackingTokenAliases");
        Intrinsics.checkNotNullExpressionValue(f16, "adapter(...)");
        this.nullableMapOfStringTrackingTokenAliasesAdapter = f16;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, T00.a value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public T00.a fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        String str = null;
        String str2 = null;
        e eVar = null;
        k kVar = null;
        String str3 = null;
        String str4 = null;
        b bVar = null;
        Map<String, String> map = null;
        c cVar = null;
        Map<String, l> map2 = null;
        while (reader.hasNext()) {
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    break;
                case 0:
                    str = this.nullableStringAdapter.fromJson(reader);
                    break;
                case 1:
                    str2 = this.nullableStringAdapter.fromJson(reader);
                    break;
                case 2:
                    eVar = this.nullablePageInfoAdapter.fromJson(reader);
                    break;
                case 3:
                    kVar = (k) V00.a.a(reader, this.nullableSharedDTOAdapter);
                    break;
                case 4:
                    str3 = this.nullableStringAdapter.fromJson(reader);
                    break;
                case 5:
                    str4 = this.nullableStringAdapter.fromJson(reader);
                    break;
                case 6:
                    bVar = (b) V00.a.a(reader, this.nullableExperimentsAdapter);
                    break;
                case 7:
                    map = this.nullableMapOfStringStringAdapter.fromJson(reader);
                    break;
                case 8:
                    cVar = (c) V00.a.a(reader, this.nullableLayoutTrackingInfoAdapter);
                    break;
                case 9:
                    map2 = this.nullableMapOfStringTrackingTokenAliasesAdapter.fromJson(reader);
                    break;
            }
        }
        reader.endObject();
        return new T00.a(str, str2, eVar, kVar, str3, str4, bVar, map, cVar, map2);
    }
}
