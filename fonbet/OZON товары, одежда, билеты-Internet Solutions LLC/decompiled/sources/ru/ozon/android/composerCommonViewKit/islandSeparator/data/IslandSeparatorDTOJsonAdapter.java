package ru.ozon.android.composerCommonViewKit.islandSeparator.data;

import Ak.b;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.n;
import com.squareup.moshi.x;
import kotlin.Metadata;
import kotlin.collections.M;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.composerCommonViewKit.islandSeparator.data.IslandSeparatorDTO;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0019R\u001c\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0019R\u001c\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001d0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0019¨\u0006\u001f"}, d2 = {"Lru/ozon/android/composerCommonViewKit/islandSeparator/data/IslandSeparatorDTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/android/composerCommonViewKit/islandSeparator/data/IslandSeparatorDTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/android/composerCommonViewKit/islandSeparator/data/IslandSeparatorDTO;", "Lcom/squareup/moshi/x;", "writer", "value_", "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/android/composerCommonViewKit/islandSeparator/data/IslandSeparatorDTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "", "nullableIntAdapter", "Lcom/squareup/moshi/JsonAdapter;", "nullableStringAdapter", "Lru/ozon/android/composerCommonViewKit/islandSeparator/data/IslandSeparatorDTO$Configuration;", "nullableConfigurationAdapter", "", "nullableBooleanAdapter", "common-view-kit_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class IslandSeparatorDTOJsonAdapter extends JsonAdapter<IslandSeparatorDTO> {
    public static final int $stable = 8;

    @NotNull
    private final JsonAdapter<Boolean> nullableBooleanAdapter;

    @NotNull
    private final JsonAdapter<IslandSeparatorDTO.Configuration> nullableConfigurationAdapter;

    @NotNull
    private final JsonAdapter<Integer> nullableIntAdapter;

    @NotNull
    private final JsonAdapter<String> nullableStringAdapter;

    @NotNull
    private final n.a options;

    public IslandSeparatorDTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        n.a a11 = n.a.C0918a.a("physicalPartHeight", "color", "configuration", "isSticky", "stickyGroupTag", "isOverlay");
        Intrinsics.checkNotNullExpressionValue(a11, "of(...)");
        this.options = a11;
        M m11 = M.f71699a;
        JsonAdapter<Integer> f7 = moshi.f(Integer.class, m11, "physicalPartHeight");
        Intrinsics.checkNotNullExpressionValue(f7, "adapter(...)");
        this.nullableIntAdapter = f7;
        JsonAdapter<String> f11 = moshi.f(String.class, m11, "color");
        Intrinsics.checkNotNullExpressionValue(f11, "adapter(...)");
        this.nullableStringAdapter = f11;
        JsonAdapter<IslandSeparatorDTO.Configuration> f12 = moshi.f(IslandSeparatorDTO.Configuration.class, m11, "configuration");
        Intrinsics.checkNotNullExpressionValue(f12, "adapter(...)");
        this.nullableConfigurationAdapter = f12;
        JsonAdapter<Boolean> f13 = moshi.f(Boolean.class, m11, "isSticky");
        Intrinsics.checkNotNullExpressionValue(f13, "adapter(...)");
        this.nullableBooleanAdapter = f13;
    }

    @NotNull
    public String toString() {
        return b.c(40, "GeneratedJsonAdapter(IslandSeparatorDTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public IslandSeparatorDTO fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        Integer num = null;
        String str = null;
        IslandSeparatorDTO.Configuration configuration = null;
        Boolean bool = null;
        String str2 = null;
        Boolean bool2 = null;
        while (reader.hasNext()) {
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    break;
                case 0:
                    num = this.nullableIntAdapter.fromJson(reader);
                    break;
                case 1:
                    str = this.nullableStringAdapter.fromJson(reader);
                    break;
                case 2:
                    configuration = this.nullableConfigurationAdapter.fromJson(reader);
                    break;
                case 3:
                    bool = this.nullableBooleanAdapter.fromJson(reader);
                    break;
                case 4:
                    str2 = this.nullableStringAdapter.fromJson(reader);
                    break;
                case 5:
                    bool2 = this.nullableBooleanAdapter.fromJson(reader);
                    break;
            }
        }
        reader.endObject();
        return new IslandSeparatorDTO(num, str, configuration, bool, str2, bool2);
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, IslandSeparatorDTO value_) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("physicalPartHeight");
        this.nullableIntAdapter.mo44toJson(writer, (x) value_.getPhysicalPartHeight());
        writer.w("color");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getColor());
        writer.w("configuration");
        this.nullableConfigurationAdapter.mo44toJson(writer, (x) value_.getConfiguration());
        writer.w("isSticky");
        this.nullableBooleanAdapter.mo44toJson(writer, (x) value_.isSticky());
        writer.w("stickyGroupTag");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getStickyGroupTag());
        writer.w("isOverlay");
        this.nullableBooleanAdapter.mo44toJson(writer, (x) value_.isOverlay());
        writer.p();
    }
}
