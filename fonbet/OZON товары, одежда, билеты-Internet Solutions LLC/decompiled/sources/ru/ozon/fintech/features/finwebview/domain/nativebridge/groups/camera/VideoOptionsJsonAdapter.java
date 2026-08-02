package ru.ozon.fintech.features.finwebview.domain.nativebridge.groups.camera;

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

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0019¨\u0006\u001d"}, d2 = {"Lru/ozon/fintech/features/finwebview/domain/nativebridge/groups/camera/VideoOptionsJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/fintech/features/finwebview/domain/nativebridge/groups/camera/VideoOptions;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/fintech/features/finwebview/domain/nativebridge/groups/camera/VideoOptions;", "Lcom/squareup/moshi/x;", "writer", "value_", "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/fintech/features/finwebview/domain/nativebridge/groups/camera/VideoOptions;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "", "booleanAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "longAdapter", "stringAdapter", "finwebview_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class VideoOptionsJsonAdapter extends JsonAdapter<VideoOptions> {

    @NotNull
    private final JsonAdapter<Boolean> booleanAdapter;

    @NotNull
    private final JsonAdapter<Long> longAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<String> stringAdapter;

    public VideoOptionsJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        n.a a11 = n.a.C0918a.a("enabled", "chunkDurationMs", "videoQuality");
        Intrinsics.checkNotNullExpressionValue(a11, "of(...)");
        this.options = a11;
        M m11 = M.f71699a;
        JsonAdapter<Boolean> f7 = moshi.f(Boolean.TYPE, m11, "enabled");
        Intrinsics.checkNotNullExpressionValue(f7, "adapter(...)");
        this.booleanAdapter = f7;
        JsonAdapter<Long> f11 = moshi.f(Long.TYPE, m11, "chunkDurationMs");
        Intrinsics.checkNotNullExpressionValue(f11, "adapter(...)");
        this.longAdapter = f11;
        JsonAdapter<String> f12 = moshi.f(String.class, m11, "videoQuality");
        Intrinsics.checkNotNullExpressionValue(f12, "adapter(...)");
        this.stringAdapter = f12;
    }

    @NotNull
    public String toString() {
        return b.c(34, "GeneratedJsonAdapter(VideoOptions)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public VideoOptions fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        Boolean bool = null;
        Long l11 = null;
        String str = null;
        while (reader.hasNext()) {
            int v11 = reader.v(this.options);
            if (v11 == -1) {
                reader.y();
                reader.skipValue();
            } else if (v11 == 0) {
                bool = this.booleanAdapter.fromJson(reader);
                if (bool == null) {
                    throw c.q("enabled", "enabled", reader);
                }
            } else if (v11 == 1) {
                l11 = this.longAdapter.fromJson(reader);
                if (l11 == null) {
                    throw c.q("chunkDurationMs", "chunkDurationMs", reader);
                }
            } else if (v11 == 2 && (str = this.stringAdapter.fromJson(reader)) == null) {
                throw c.q("videoQuality", "videoQuality", reader);
            }
        }
        reader.endObject();
        if (bool == null) {
            throw c.j("enabled", "enabled", reader);
        }
        boolean booleanValue = bool.booleanValue();
        if (l11 == null) {
            throw c.j("chunkDurationMs", "chunkDurationMs", reader);
        }
        long longValue = l11.longValue();
        if (str != null) {
            return new VideoOptions(booleanValue, longValue, str);
        }
        throw c.j("videoQuality", "videoQuality", reader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, VideoOptions value_) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("enabled");
        this.booleanAdapter.mo44toJson(writer, (x) Boolean.valueOf(value_.getEnabled()));
        writer.w("chunkDurationMs");
        this.longAdapter.mo44toJson(writer, (x) Long.valueOf(value_.getChunkDurationMs()));
        writer.w("videoQuality");
        this.stringAdapter.mo44toJson(writer, (x) value_.getVideoQuality());
        writer.p();
    }
}
