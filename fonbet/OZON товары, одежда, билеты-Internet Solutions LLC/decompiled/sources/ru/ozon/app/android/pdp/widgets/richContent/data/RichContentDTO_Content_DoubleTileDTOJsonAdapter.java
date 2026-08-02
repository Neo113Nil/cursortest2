package ru.ozon.app.android.pdp.widgets.richContent.data;

import Ak.b;
import Y9.c;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.n;
import com.squareup.moshi.x;
import kotlin.Metadata;
import kotlin.collections.M;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.widgets.richContent.data.RichContentDTO;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0019R\u001c\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u001c\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0019R\u001c\u0010\u001f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0019¨\u0006 "}, d2 = {"Lru/ozon/app/android/pdp/widgets/richContent/data/RichContentDTO_Content_DoubleTileDTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/pdp/widgets/richContent/data/RichContentDTO$Content$DoubleTileDTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/pdp/widgets/richContent/data/RichContentDTO$Content$DoubleTileDTO;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/pdp/widgets/richContent/data/RichContentDTO$Content$DoubleTileDTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "Lru/ozon/app/android/pdp/widgets/richContent/data/RichContentDTO$Content$DoubleTileDTO$Tile;", "tileAdapter", "Lcom/squareup/moshi/JsonAdapter;", "nullableTileAdapter", "nullableStringAdapter", "", "nullableBooleanAdapter", "", "nullableIntAdapter", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class RichContentDTO_Content_DoubleTileDTOJsonAdapter extends JsonAdapter<RichContentDTO.Content.DoubleTileDTO> {
    public static final int $stable = 8;

    @NotNull
    private final JsonAdapter<Boolean> nullableBooleanAdapter;

    @NotNull
    private final JsonAdapter<Integer> nullableIntAdapter;

    @NotNull
    private final JsonAdapter<String> nullableStringAdapter;

    @NotNull
    private final JsonAdapter<RichContentDTO.Content.DoubleTileDTO.Tile> nullableTileAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<RichContentDTO.Content.DoubleTileDTO.Tile> tileAdapter;

    public RichContentDTO_Content_DoubleTileDTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("left", "right", "tabGroupId", "isExpanded", "position");
        M m11 = M.f71699a;
        this.tileAdapter = moshi.f(RichContentDTO.Content.DoubleTileDTO.Tile.class, m11, "left");
        this.nullableTileAdapter = moshi.f(RichContentDTO.Content.DoubleTileDTO.Tile.class, m11, "right");
        this.nullableStringAdapter = moshi.f(String.class, m11, "tabGroupId");
        this.nullableBooleanAdapter = moshi.f(Boolean.class, m11, "isExpanded");
        this.nullableIntAdapter = moshi.f(Integer.class, m11, "position");
    }

    @NotNull
    public String toString() {
        return b.c(58, "GeneratedJsonAdapter(RichContentDTO.Content.DoubleTileDTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public RichContentDTO.Content.DoubleTileDTO fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        RichContentDTO.Content.DoubleTileDTO.Tile tile = null;
        RichContentDTO.Content.DoubleTileDTO.Tile tile2 = null;
        String str = null;
        Boolean bool = null;
        Integer num = null;
        while (reader.hasNext()) {
            int v11 = reader.v(this.options);
            if (v11 == -1) {
                reader.y();
                reader.skipValue();
            } else if (v11 == 0) {
                tile = this.tileAdapter.fromJson(reader);
                if (tile == null) {
                    throw c.q("left", "left", reader);
                }
            } else if (v11 == 1) {
                tile2 = this.nullableTileAdapter.fromJson(reader);
            } else if (v11 == 2) {
                str = this.nullableStringAdapter.fromJson(reader);
            } else if (v11 == 3) {
                bool = this.nullableBooleanAdapter.fromJson(reader);
            } else if (v11 == 4) {
                num = this.nullableIntAdapter.fromJson(reader);
            }
        }
        reader.endObject();
        if (tile != null) {
            return new RichContentDTO.Content.DoubleTileDTO(tile, tile2, str, bool, num);
        }
        throw c.j("left", "left", reader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, RichContentDTO.Content.DoubleTileDTO value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("left");
        this.tileAdapter.mo44toJson(writer, (x) value.getLeft());
        writer.w("right");
        this.nullableTileAdapter.mo44toJson(writer, (x) value.getRight());
        writer.w("tabGroupId");
        this.nullableStringAdapter.mo44toJson(writer, (x) value.getTabGroupId());
        writer.w("isExpanded");
        this.nullableBooleanAdapter.mo44toJson(writer, (x) value.isExpanded());
        writer.w("position");
        this.nullableIntAdapter.mo44toJson(writer, (x) value.getPosition());
        writer.p();
    }
}
