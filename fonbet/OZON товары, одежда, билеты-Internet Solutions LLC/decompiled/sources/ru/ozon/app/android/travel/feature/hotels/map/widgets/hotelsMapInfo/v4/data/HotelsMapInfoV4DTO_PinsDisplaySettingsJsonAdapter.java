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
import ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapInfo.v4.data.HotelsMapInfoV4DTO;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0019¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/data/HotelsMapInfoV4DTO_PinsDisplaySettingsJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/data/HotelsMapInfoV4DTO$PinsDisplaySettings;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/data/HotelsMapInfoV4DTO$PinsDisplaySettings;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/data/HotelsMapInfoV4DTO$PinsDisplaySettings;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "", "intAdapter", "Lcom/squareup/moshi/JsonAdapter;", "nullableIntAdapter", "map_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class HotelsMapInfoV4DTO_PinsDisplaySettingsJsonAdapter extends JsonAdapter<HotelsMapInfoV4DTO.PinsDisplaySettings> {

    @NotNull
    private final JsonAdapter<Integer> intAdapter;

    @NotNull
    private final JsonAdapter<Integer> nullableIntAdapter;

    @NotNull
    private final n.a options;

    public HotelsMapInfoV4DTO_PinsDisplaySettingsJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("latitudeCellPxSize", "longitudeCellPxSize", "lowRankedPercentPerCell", "lowRankedPerCellMin", "lowRankedPerCellMax", "showHighRankedZoom");
        M m11 = M.f71699a;
        this.intAdapter = moshi.f(Integer.TYPE, m11, "latitudeCellPxSize");
        this.nullableIntAdapter = moshi.f(Integer.class, m11, "lowRankedPerCellMin");
    }

    @NotNull
    public String toString() {
        return b.c(60, "GeneratedJsonAdapter(HotelsMapInfoV4DTO.PinsDisplaySettings)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public HotelsMapInfoV4DTO.PinsDisplaySettings fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        Integer num = null;
        Integer num2 = null;
        Integer num3 = null;
        Integer num4 = null;
        Integer num5 = null;
        Integer num6 = null;
        while (reader.hasNext()) {
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    break;
                case 0:
                    num = this.intAdapter.fromJson(reader);
                    if (num == null) {
                        throw c.q("latitudeCellPxSize", "latitudeCellPxSize", reader);
                    }
                    break;
                case 1:
                    num2 = this.intAdapter.fromJson(reader);
                    if (num2 == null) {
                        throw c.q("longitudeCellPxSize", "longitudeCellPxSize", reader);
                    }
                    break;
                case 2:
                    num3 = this.intAdapter.fromJson(reader);
                    if (num3 == null) {
                        throw c.q("lowRankedPercentPerCell", "lowRankedPercentPerCell", reader);
                    }
                    break;
                case 3:
                    num4 = this.nullableIntAdapter.fromJson(reader);
                    break;
                case 4:
                    num5 = this.nullableIntAdapter.fromJson(reader);
                    break;
                case 5:
                    num6 = this.nullableIntAdapter.fromJson(reader);
                    break;
            }
        }
        reader.endObject();
        if (num == null) {
            throw c.j("latitudeCellPxSize", "latitudeCellPxSize", reader);
        }
        int intValue = num.intValue();
        if (num2 == null) {
            throw c.j("longitudeCellPxSize", "longitudeCellPxSize", reader);
        }
        int intValue2 = num2.intValue();
        if (num3 != null) {
            return new HotelsMapInfoV4DTO.PinsDisplaySettings(intValue, intValue2, num3.intValue(), num4, num5, num6);
        }
        throw c.j("lowRankedPercentPerCell", "lowRankedPercentPerCell", reader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, HotelsMapInfoV4DTO.PinsDisplaySettings value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("latitudeCellPxSize");
        this.intAdapter.mo44toJson(writer, (x) Integer.valueOf(value.getLatitudeCellPxSize()));
        writer.w("longitudeCellPxSize");
        this.intAdapter.mo44toJson(writer, (x) Integer.valueOf(value.getLongitudeCellPxSize()));
        writer.w("lowRankedPercentPerCell");
        this.intAdapter.mo44toJson(writer, (x) Integer.valueOf(value.getLowRankedPercentPerCell()));
        writer.w("lowRankedPerCellMin");
        this.nullableIntAdapter.mo44toJson(writer, (x) value.getLowRankedPerCellMin());
        writer.w("lowRankedPerCellMax");
        this.nullableIntAdapter.mo44toJson(writer, (x) value.getLowRankedPerCellMax());
        writer.w("showHighRankedZoom");
        this.nullableIntAdapter.mo44toJson(writer, (x) value.getShowHighRankedZoom());
        writer.p();
    }
}
