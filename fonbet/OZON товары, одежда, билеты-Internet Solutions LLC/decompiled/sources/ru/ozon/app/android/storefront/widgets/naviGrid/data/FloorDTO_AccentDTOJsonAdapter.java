package ru.ozon.app.android.storefront.widgets.naviGrid.data;

import Ak.b;
import Y9.c;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
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
import ru.ozon.app.android.storefront.widgets.naviGrid.data.FloorDTO;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R \u0010\u001d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u001c0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0019¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/storefront/widgets/naviGrid/data/FloorDTO_AccentDTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/storefront/widgets/naviGrid/data/FloorDTO$AccentDTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/storefront/widgets/naviGrid/data/FloorDTO$AccentDTO;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/storefront/widgets/naviGrid/data/FloorDTO$AccentDTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "Lru/ozon/app/android/storefront/widgets/naviGrid/data/ItemDTO;", "itemDTOAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/storefront/widgets/naviGrid/data/AccentPosition;", "accentPositionAdapter", "", "listOfItemDTOAdapter", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class FloorDTO_AccentDTOJsonAdapter extends JsonAdapter<FloorDTO.AccentDTO> {
    public static final int $stable = 8;

    @NotNull
    private final JsonAdapter<AccentPosition> accentPositionAdapter;

    @NotNull
    private final JsonAdapter<ItemDTO> itemDTOAdapter;

    @NotNull
    private final JsonAdapter<List<ItemDTO>> listOfItemDTOAdapter;

    @NotNull
    private final n.a options;

    public FloorDTO_AccentDTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("accentItem", "accentPosition", "items");
        M m11 = M.f71699a;
        this.itemDTOAdapter = moshi.f(ItemDTO.class, m11, "accentItem");
        this.accentPositionAdapter = moshi.f(AccentPosition.class, m11, "accentPosition");
        this.listOfItemDTOAdapter = moshi.f(D.e(List.class, ItemDTO.class), m11, "items");
    }

    @NotNull
    public String toString() {
        return b.c(40, "GeneratedJsonAdapter(FloorDTO.AccentDTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public FloorDTO.AccentDTO fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        ItemDTO itemDTO = null;
        AccentPosition accentPosition = null;
        List<ItemDTO> list = null;
        while (reader.hasNext()) {
            int v11 = reader.v(this.options);
            if (v11 == -1) {
                reader.y();
                reader.skipValue();
            } else if (v11 == 0) {
                itemDTO = this.itemDTOAdapter.fromJson(reader);
                if (itemDTO == null) {
                    throw c.q("accentItem", "accentItem", reader);
                }
            } else if (v11 == 1) {
                accentPosition = this.accentPositionAdapter.fromJson(reader);
                if (accentPosition == null) {
                    throw c.q("accentPosition", "accentPosition", reader);
                }
            } else if (v11 == 2 && (list = this.listOfItemDTOAdapter.fromJson(reader)) == null) {
                throw c.q("items", "items", reader);
            }
        }
        reader.endObject();
        if (itemDTO == null) {
            throw c.j("accentItem", "accentItem", reader);
        }
        if (accentPosition == null) {
            throw c.j("accentPosition", "accentPosition", reader);
        }
        if (list != null) {
            return new FloorDTO.AccentDTO(itemDTO, accentPosition, list);
        }
        throw c.j("items", "items", reader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, FloorDTO.AccentDTO value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("accentItem");
        this.itemDTOAdapter.mo44toJson(writer, (x) value.getAccentItem());
        writer.w("accentPosition");
        this.accentPositionAdapter.mo44toJson(writer, (x) value.getAccentPosition());
        writer.w("items");
        this.listOfItemDTOAdapter.mo44toJson(writer, (x) value.getItems());
        writer.p();
    }
}
