package ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapInfo.v4.data;

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
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0013\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0018R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0018R\u001c\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001d0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0018R\u001c\u0010\u001f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0018R\u001c\u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010 0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u0018¨\u0006\""}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/data/PinDTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/data/PinDTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/data/PinDTO;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/data/PinDTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "floatAdapter", "", "doubleArrayAdapter", "", "nullableIntAdapter", "nullableStringAdapter", "", "nullableBooleanAdapter", "map_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class PinDTOJsonAdapter extends JsonAdapter<PinDTO> {

    @NotNull
    private final JsonAdapter<double[]> doubleArrayAdapter;

    @NotNull
    private final JsonAdapter<Float> floatAdapter;

    @NotNull
    private final JsonAdapter<Boolean> nullableBooleanAdapter;

    @NotNull
    private final JsonAdapter<Integer> nullableIntAdapter;

    @NotNull
    private final JsonAdapter<String> nullableStringAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<String> stringAdapter;

    public PinDTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("id", "rank", "coords", "price", SelectionItemFormDTO.TITLE_FIELD_NAME, "hasDiscount", "isFavorite", "sku", "rightIconId", "leftIconId");
        M m11 = M.f71699a;
        this.stringAdapter = moshi.f(String.class, m11, "id");
        this.floatAdapter = moshi.f(Float.TYPE, m11, "rank");
        this.doubleArrayAdapter = moshi.f(double[].class, m11, "coords");
        this.nullableIntAdapter = moshi.f(Integer.class, m11, "price");
        this.nullableStringAdapter = moshi.f(String.class, m11, SelectionItemFormDTO.TITLE_FIELD_NAME);
        this.nullableBooleanAdapter = moshi.f(Boolean.class, m11, "hasDiscount");
    }

    @NotNull
    public String toString() {
        return b.c(28, "GeneratedJsonAdapter(PinDTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public PinDTO fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        Float f7 = null;
        String str = null;
        double[] dArr = null;
        Integer num = null;
        String str2 = null;
        Boolean bool = null;
        Boolean bool2 = null;
        String str3 = null;
        Integer num2 = null;
        Integer num3 = null;
        while (reader.hasNext()) {
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    break;
                case 0:
                    str = this.stringAdapter.fromJson(reader);
                    if (str == null) {
                        throw c.q("id", "id", reader);
                    }
                    break;
                case 1:
                    f7 = this.floatAdapter.fromJson(reader);
                    if (f7 == null) {
                        throw c.q("rank", "rank", reader);
                    }
                    break;
                case 2:
                    dArr = this.doubleArrayAdapter.fromJson(reader);
                    if (dArr == null) {
                        throw c.q("coords", "coords", reader);
                    }
                    break;
                case 3:
                    num = this.nullableIntAdapter.fromJson(reader);
                    break;
                case 4:
                    str2 = this.nullableStringAdapter.fromJson(reader);
                    break;
                case 5:
                    bool = this.nullableBooleanAdapter.fromJson(reader);
                    break;
                case 6:
                    bool2 = this.nullableBooleanAdapter.fromJson(reader);
                    break;
                case 7:
                    str3 = this.nullableStringAdapter.fromJson(reader);
                    break;
                case 8:
                    num2 = this.nullableIntAdapter.fromJson(reader);
                    break;
                case 9:
                    num3 = this.nullableIntAdapter.fromJson(reader);
                    break;
            }
        }
        reader.endObject();
        if (str == null) {
            throw c.j("id", "id", reader);
        }
        if (f7 == null) {
            throw c.j("rank", "rank", reader);
        }
        float floatValue = f7.floatValue();
        if (dArr != null) {
            return new PinDTO(str, floatValue, dArr, num, str2, bool, bool2, str3, num2, num3);
        }
        throw c.j("coords", "coords", reader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, PinDTO value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("id");
        this.stringAdapter.mo44toJson(writer, (x) value.getId());
        writer.w("rank");
        this.floatAdapter.mo44toJson(writer, (x) Float.valueOf(value.getRank()));
        writer.w("coords");
        this.doubleArrayAdapter.mo44toJson(writer, (x) value.getCoords());
        writer.w("price");
        this.nullableIntAdapter.mo44toJson(writer, (x) value.getPrice());
        writer.w(SelectionItemFormDTO.TITLE_FIELD_NAME);
        this.nullableStringAdapter.mo44toJson(writer, (x) value.getTitle());
        writer.w("hasDiscount");
        this.nullableBooleanAdapter.mo44toJson(writer, (x) value.getHasDiscount());
        writer.w("isFavorite");
        this.nullableBooleanAdapter.mo44toJson(writer, (x) value.isFavorite());
        writer.w("sku");
        this.nullableStringAdapter.mo44toJson(writer, (x) value.getSku());
        writer.w("rightIconId");
        this.nullableIntAdapter.mo44toJson(writer, (x) value.getRightIconId());
        writer.w("leftIconId");
        this.nullableIntAdapter.mo44toJson(writer, (x) value.getLeftIconId());
        writer.p();
    }
}
