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

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0019¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/data/HotelsMapInfoV4DTO_PricePinStatesJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/data/HotelsMapInfoV4DTO$PricePinStates;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/data/HotelsMapInfoV4DTO$PricePinStates;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/data/HotelsMapInfoV4DTO$PricePinStates;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/data/HotelsMapInfoV4DTO$PricePinStates$PinStyles;", "pinStylesAdapter", "Lcom/squareup/moshi/JsonAdapter;", "nullablePinStylesAdapter", "map_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class HotelsMapInfoV4DTO_PricePinStatesJsonAdapter extends JsonAdapter<HotelsMapInfoV4DTO.PricePinStates> {

    @NotNull
    private final JsonAdapter<HotelsMapInfoV4DTO.PricePinStates.PinStyles> nullablePinStylesAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<HotelsMapInfoV4DTO.PricePinStates.PinStyles> pinStylesAdapter;

    public HotelsMapInfoV4DTO_PricePinStatesJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("default", "selected", "viewed");
        M m11 = M.f71699a;
        this.pinStylesAdapter = moshi.f(HotelsMapInfoV4DTO.PricePinStates.PinStyles.class, m11, "default");
        this.nullablePinStylesAdapter = moshi.f(HotelsMapInfoV4DTO.PricePinStates.PinStyles.class, m11, "selected");
    }

    @NotNull
    public String toString() {
        return b.c(55, "GeneratedJsonAdapter(HotelsMapInfoV4DTO.PricePinStates)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public HotelsMapInfoV4DTO.PricePinStates fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        HotelsMapInfoV4DTO.PricePinStates.PinStyles pinStyles = null;
        HotelsMapInfoV4DTO.PricePinStates.PinStyles pinStyles2 = null;
        HotelsMapInfoV4DTO.PricePinStates.PinStyles pinStyles3 = null;
        while (reader.hasNext()) {
            int v11 = reader.v(this.options);
            if (v11 == -1) {
                reader.y();
                reader.skipValue();
            } else if (v11 == 0) {
                pinStyles = this.pinStylesAdapter.fromJson(reader);
                if (pinStyles == null) {
                    throw c.q("default", "default", reader);
                }
            } else if (v11 == 1) {
                pinStyles2 = this.nullablePinStylesAdapter.fromJson(reader);
            } else if (v11 == 2) {
                pinStyles3 = this.nullablePinStylesAdapter.fromJson(reader);
            }
        }
        reader.endObject();
        if (pinStyles != null) {
            return new HotelsMapInfoV4DTO.PricePinStates(pinStyles, pinStyles2, pinStyles3);
        }
        throw c.j("default", "default", reader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, HotelsMapInfoV4DTO.PricePinStates value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("default");
        this.pinStylesAdapter.mo44toJson(writer, (x) value.getDefault());
        writer.w("selected");
        this.nullablePinStylesAdapter.mo44toJson(writer, (x) value.getSelected());
        writer.w("viewed");
        this.nullablePinStylesAdapter.mo44toJson(writer, (x) value.getViewed());
        writer.p();
    }
}
