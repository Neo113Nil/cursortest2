package ru.ozon.app.android.travel.feature.hotels.widgets.hotelsVerticalShelves.data;

import Y9.b;
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
import ru.ozon.app.android.travel.feature.hotels.shared.data.ShelfCardDTO;
import ru.ozon.app.android.travel.feature.hotels.shared.data.ShelfCardOptions;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsVerticalShelves.data.HotelsVerticalShelvesDTO;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R \u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001c\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001aR \u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001aR\u001c\u0010 \u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u001a¨\u0006!"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsVerticalShelves/data/HotelsVerticalShelvesDTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsVerticalShelves/data/HotelsVerticalShelvesDTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsVerticalShelves/data/HotelsVerticalShelvesDTO;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsVerticalShelves/data/HotelsVerticalShelvesDTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "", "Lru/ozon/app/android/travel/feature/hotels/shared/data/ShelfCardDTO;", "listOfShelfCardDTOAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/travel/feature/hotels/shared/data/ShelfCardOptions;", "nullableShelfCardOptionsAdapter", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsVerticalShelves/data/HotelsVerticalShelvesDTO$CardsRow;", "listOfCardsRowAdapter", "", "nullableIntAdapter", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class HotelsVerticalShelvesDTOJsonAdapter extends JsonAdapter<HotelsVerticalShelvesDTO> {
    public static final int $stable = 8;

    @NotNull
    private final JsonAdapter<List<HotelsVerticalShelvesDTO.CardsRow>> listOfCardsRowAdapter;

    @NotNull
    private final JsonAdapter<List<ShelfCardDTO>> listOfShelfCardDTOAdapter;

    @NotNull
    private final JsonAdapter<Integer> nullableIntAdapter;

    @NotNull
    private final JsonAdapter<ShelfCardOptions> nullableShelfCardOptionsAdapter;

    @NotNull
    private final n.a options;

    public HotelsVerticalShelvesDTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("cards", "cardOptions", "rows", "verticalGap");
        b e11 = D.e(List.class, ShelfCardDTO.class);
        M m11 = M.f71699a;
        this.listOfShelfCardDTOAdapter = moshi.f(e11, m11, "cards");
        this.nullableShelfCardOptionsAdapter = moshi.f(ShelfCardOptions.class, m11, "cardOptions");
        this.listOfCardsRowAdapter = moshi.f(D.e(List.class, HotelsVerticalShelvesDTO.CardsRow.class), m11, "rows");
        this.nullableIntAdapter = moshi.f(Integer.class, m11, "verticalGap");
    }

    @NotNull
    public String toString() {
        return Ak.b.c(46, "GeneratedJsonAdapter(HotelsVerticalShelvesDTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public HotelsVerticalShelvesDTO fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        List<ShelfCardDTO> list = null;
        ShelfCardOptions shelfCardOptions = null;
        List<HotelsVerticalShelvesDTO.CardsRow> list2 = null;
        Integer num = null;
        while (reader.hasNext()) {
            int v11 = reader.v(this.options);
            if (v11 == -1) {
                reader.y();
                reader.skipValue();
            } else if (v11 == 0) {
                list = this.listOfShelfCardDTOAdapter.fromJson(reader);
                if (list == null) {
                    throw c.q("cards", "cards", reader);
                }
            } else if (v11 == 1) {
                shelfCardOptions = this.nullableShelfCardOptionsAdapter.fromJson(reader);
            } else if (v11 == 2) {
                list2 = this.listOfCardsRowAdapter.fromJson(reader);
                if (list2 == null) {
                    throw c.q("rows", "rows", reader);
                }
            } else if (v11 == 3) {
                num = this.nullableIntAdapter.fromJson(reader);
            }
        }
        reader.endObject();
        if (list == null) {
            throw c.j("cards", "cards", reader);
        }
        if (list2 != null) {
            return new HotelsVerticalShelvesDTO(list, shelfCardOptions, list2, num);
        }
        throw c.j("rows", "rows", reader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, HotelsVerticalShelvesDTO value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("cards");
        this.listOfShelfCardDTOAdapter.mo44toJson(writer, (x) value.getCards());
        writer.w("cardOptions");
        this.nullableShelfCardOptionsAdapter.mo44toJson(writer, (x) value.getCardOptions());
        writer.w("rows");
        this.listOfCardsRowAdapter.mo44toJson(writer, (x) value.getRows());
        writer.w("verticalGap");
        this.nullableIntAdapter.mo44toJson(writer, (x) value.getVerticalGap());
        writer.p();
    }
}
