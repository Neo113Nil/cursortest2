package ru.ozon.android.messenger.framework.data.remote.models;

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
import ru.ozon.android.messenger.framework.data.remote.models.SocketEventDTO;
import ru.ozon.android.messenger.framework.data.remote.models.items.ItemDTO;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R \u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001aR\u001c\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001a¨\u0006\u001e"}, d2 = {"Lru/ozon/android/messenger/framework/data/remote/models/SocketEventDTO_PinItems_PinItemsModelJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/android/messenger/framework/data/remote/models/SocketEventDTO$PinItems$PinItemsModel;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/android/messenger/framework/data/remote/models/SocketEventDTO$PinItems$PinItemsModel;", "Lcom/squareup/moshi/x;", "writer", "value_", "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/android/messenger/framework/data/remote/models/SocketEventDTO$PinItems$PinItemsModel;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "", "Lru/ozon/android/messenger/framework/data/remote/models/items/ItemDTO;", "listOfItemDTOAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/android/messenger/framework/data/remote/models/b;", "placeDTOAdapter", "nullableStringAdapter", "messenger_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class SocketEventDTO_PinItems_PinItemsModelJsonAdapter extends JsonAdapter<SocketEventDTO.PinItems.PinItemsModel> {
    public static final int $stable = 8;

    @NotNull
    private final JsonAdapter<List<ItemDTO>> listOfItemDTOAdapter;

    @NotNull
    private final JsonAdapter<String> nullableStringAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<b> placeDTOAdapter;

    public SocketEventDTO_PinItems_PinItemsModelJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        n.a a11 = n.a.C0918a.a("items", "place", "id");
        Intrinsics.checkNotNullExpressionValue(a11, "of(...)");
        this.options = a11;
        Y9.b e11 = D.e(List.class, ItemDTO.class);
        M m11 = M.f71699a;
        JsonAdapter<List<ItemDTO>> f7 = moshi.f(e11, m11, "items");
        Intrinsics.checkNotNullExpressionValue(f7, "adapter(...)");
        this.listOfItemDTOAdapter = f7;
        JsonAdapter<b> f11 = moshi.f(b.class, m11, "place");
        Intrinsics.checkNotNullExpressionValue(f11, "adapter(...)");
        this.placeDTOAdapter = f11;
        JsonAdapter<String> f12 = moshi.f(String.class, m11, "id");
        Intrinsics.checkNotNullExpressionValue(f12, "adapter(...)");
        this.nullableStringAdapter = f12;
    }

    @NotNull
    public String toString() {
        return Ak.b.c(59, "GeneratedJsonAdapter(SocketEventDTO.PinItems.PinItemsModel)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public SocketEventDTO.PinItems.PinItemsModel fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        List<ItemDTO> list = null;
        b bVar = null;
        String str = null;
        while (reader.hasNext()) {
            int v11 = reader.v(this.options);
            if (v11 == -1) {
                reader.y();
                reader.skipValue();
            } else if (v11 == 0) {
                list = this.listOfItemDTOAdapter.fromJson(reader);
                if (list == null) {
                    throw Y9.c.q("items", "items", reader);
                }
            } else if (v11 == 1) {
                bVar = this.placeDTOAdapter.fromJson(reader);
                if (bVar == null) {
                    throw Y9.c.q("place", "place", reader);
                }
            } else if (v11 == 2) {
                str = this.nullableStringAdapter.fromJson(reader);
            }
        }
        reader.endObject();
        if (list == null) {
            throw Y9.c.j("items", "items", reader);
        }
        if (bVar != null) {
            return new SocketEventDTO.PinItems.PinItemsModel(list, bVar, str);
        }
        throw Y9.c.j("place", "place", reader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, SocketEventDTO.PinItems.PinItemsModel value_) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("items");
        this.listOfItemDTOAdapter.mo44toJson(writer, (x) value_.getItems());
        writer.w("place");
        this.placeDTOAdapter.mo44toJson(writer, (x) value_.getPlace());
        writer.w("id");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getId());
        writer.p();
    }
}
