package ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapInfo.v2.data;

import Ak.b;
import Y9.c;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.D;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.n;
import com.squareup.moshi.x;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.M;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.travel.feature.hotels.map.shared.data.Coordinate;
import ru.ozon.app.android.travel.feature.hotels.map.shared.data.PointDTO;
import ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapInfo.v2.data.HotelsMapInfoV2DTO;

@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001c\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0018R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0018R\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0018R\u001c\u0010 \u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u0018R(\u0010#\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\"\u0018\u00010!0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\u0018¨\u0006$"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v2/data/HotelsMapInfoV2DTO_PinJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v2/data/HotelsMapInfoV2DTO$Pin;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v2/data/HotelsMapInfoV2DTO$Pin;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v2/data/HotelsMapInfoV2DTO$Pin;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "nullableStringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/travel/feature/hotels/map/shared/data/Coordinate;", "nullableCoordinateAdapter", "Lru/ozon/app/android/travel/feature/hotels/map/shared/data/PointDTO;", "pointDTOAdapter", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v2/data/HotelsMapInfoV2DTO$RenderingInfo;", "renderingInfoAdapter", "", "nullableBooleanAdapter", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "nullableMapOfStringTokenizedTrackingInfoAdapter", "map_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class HotelsMapInfoV2DTO_PinJsonAdapter extends JsonAdapter<HotelsMapInfoV2DTO.Pin> {

    @NotNull
    private final JsonAdapter<Boolean> nullableBooleanAdapter;

    @NotNull
    private final JsonAdapter<Coordinate> nullableCoordinateAdapter;

    @NotNull
    private final JsonAdapter<Map<String, TokenizedTrackingInfo>> nullableMapOfStringTokenizedTrackingInfoAdapter;

    @NotNull
    private final JsonAdapter<String> nullableStringAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<PointDTO> pointDTOAdapter;

    @NotNull
    private final JsonAdapter<HotelsMapInfoV2DTO.RenderingInfo> renderingInfoAdapter;

    public HotelsMapInfoV2DTO_PinJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("id", "coordinate", "anchorPoint", "renderingInfo", "indivisibleCluster", "trackingInfo");
        M m11 = M.f71699a;
        this.nullableStringAdapter = moshi.f(String.class, m11, "id");
        this.nullableCoordinateAdapter = moshi.f(Coordinate.class, m11, "coordinate");
        this.pointDTOAdapter = moshi.f(PointDTO.class, m11, "anchorPoint");
        this.renderingInfoAdapter = moshi.f(HotelsMapInfoV2DTO.RenderingInfo.class, m11, "renderingInfo");
        this.nullableBooleanAdapter = moshi.f(Boolean.class, m11, "indivisibleCluster");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter = moshi.f(D.e(Map.class, String.class, TokenizedTrackingInfo.class), m11, "trackingInfo");
    }

    @NotNull
    public String toString() {
        return b.c(44, "GeneratedJsonAdapter(HotelsMapInfoV2DTO.Pin)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public HotelsMapInfoV2DTO.Pin fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        String str = null;
        Coordinate coordinate = null;
        PointDTO pointDTO = null;
        HotelsMapInfoV2DTO.RenderingInfo renderingInfo = null;
        Boolean bool = null;
        Map<String, TokenizedTrackingInfo> map = null;
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
                    coordinate = this.nullableCoordinateAdapter.fromJson(reader);
                    break;
                case 2:
                    pointDTO = this.pointDTOAdapter.fromJson(reader);
                    if (pointDTO == null) {
                        throw c.q("anchorPoint", "anchorPoint", reader);
                    }
                    break;
                case 3:
                    renderingInfo = this.renderingInfoAdapter.fromJson(reader);
                    if (renderingInfo == null) {
                        throw c.q("renderingInfo", "renderingInfo", reader);
                    }
                    break;
                case 4:
                    bool = this.nullableBooleanAdapter.fromJson(reader);
                    break;
                case 5:
                    map = this.nullableMapOfStringTokenizedTrackingInfoAdapter.fromJson(reader);
                    break;
            }
        }
        reader.endObject();
        if (pointDTO == null) {
            throw c.j("anchorPoint", "anchorPoint", reader);
        }
        if (renderingInfo != null) {
            return new HotelsMapInfoV2DTO.Pin(str, coordinate, pointDTO, renderingInfo, bool, map);
        }
        throw c.j("renderingInfo", "renderingInfo", reader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, HotelsMapInfoV2DTO.Pin value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("id");
        this.nullableStringAdapter.mo44toJson(writer, (x) value.getId());
        writer.w("coordinate");
        this.nullableCoordinateAdapter.mo44toJson(writer, (x) value.getCoordinate());
        writer.w("anchorPoint");
        this.pointDTOAdapter.mo44toJson(writer, (x) value.getAnchorPoint());
        writer.w("renderingInfo");
        this.renderingInfoAdapter.mo44toJson(writer, (x) value.getRenderingInfo());
        writer.w("indivisibleCluster");
        this.nullableBooleanAdapter.mo44toJson(writer, (x) value.getIndivisibleCluster());
        writer.w("trackingInfo");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter.mo44toJson(writer, (x) value.getTrackingInfo());
        writer.p();
    }
}
