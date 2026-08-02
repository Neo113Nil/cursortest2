package ru.ozon.app.android.travel.feature.railway.widgets.segmentedTrainRoute.data;

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
import ru.ozon.app.android.travel.feature.railway.widgets.segmentedTrainRoute.data.SegmentedTrainRouteDTO;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0019R\"\u0010\u001d\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u001b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0019R\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0019¨\u0006 "}, d2 = {"Lru/ozon/app/android/travel/feature/railway/widgets/segmentedTrainRoute/data/SegmentedTrainRouteDTO_SegmentDTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/travel/feature/railway/widgets/segmentedTrainRoute/data/SegmentedTrainRouteDTO$SegmentDTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/travel/feature/railway/widgets/segmentedTrainRoute/data/SegmentedTrainRouteDTO$SegmentDTO;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/travel/feature/railway/widgets/segmentedTrainRoute/data/SegmentedTrainRouteDTO$SegmentDTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "nullableCellDTOAdapter", "Lcom/squareup/moshi/JsonAdapter;", "cellDTOAdapter", "", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "nullableListOfBadgeDTOAdapter", "Lru/ozon/app/android/travel/feature/railway/widgets/segmentedTrainRoute/data/SegmentedTrainRouteDTO$StopsBlockDTO;", "stopsBlockDTOAdapter", "railway_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class SegmentedTrainRouteDTO_SegmentDTOJsonAdapter extends JsonAdapter<SegmentedTrainRouteDTO.SegmentDTO> {
    public static final int $stable = 8;

    @NotNull
    private final JsonAdapter<CellDTO> cellDTOAdapter;

    @NotNull
    private final JsonAdapter<CellDTO> nullableCellDTOAdapter;

    @NotNull
    private final JsonAdapter<List<BadgeDTO>> nullableListOfBadgeDTOAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<SegmentedTrainRouteDTO.StopsBlockDTO> stopsBlockDTOAdapter;

    public SegmentedTrainRouteDTO_SegmentDTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("transferInfo", "trainInfo", "serviceBadges", "stopsBlock");
        M m11 = M.f71699a;
        this.nullableCellDTOAdapter = moshi.f(CellDTO.class, m11, "transferInfo");
        this.cellDTOAdapter = moshi.f(CellDTO.class, m11, "trainInfo");
        this.nullableListOfBadgeDTOAdapter = moshi.f(D.e(List.class, BadgeDTO.class), m11, "serviceBadges");
        this.stopsBlockDTOAdapter = moshi.f(SegmentedTrainRouteDTO.StopsBlockDTO.class, m11, "stopsBlock");
    }

    @NotNull
    public String toString() {
        return b.c(55, "GeneratedJsonAdapter(SegmentedTrainRouteDTO.SegmentDTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public SegmentedTrainRouteDTO.SegmentDTO fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        CellDTO cellDTO = null;
        CellDTO cellDTO2 = null;
        List<BadgeDTO> list = null;
        SegmentedTrainRouteDTO.StopsBlockDTO stopsBlockDTO = null;
        while (reader.hasNext()) {
            int v11 = reader.v(this.options);
            if (v11 == -1) {
                reader.y();
                reader.skipValue();
            } else if (v11 == 0) {
                cellDTO = this.nullableCellDTOAdapter.fromJson(reader);
            } else if (v11 == 1) {
                cellDTO2 = this.cellDTOAdapter.fromJson(reader);
                if (cellDTO2 == null) {
                    throw c.q("trainInfo", "trainInfo", reader);
                }
            } else if (v11 == 2) {
                list = this.nullableListOfBadgeDTOAdapter.fromJson(reader);
            } else if (v11 == 3 && (stopsBlockDTO = this.stopsBlockDTOAdapter.fromJson(reader)) == null) {
                throw c.q("stopsBlock", "stopsBlock", reader);
            }
        }
        reader.endObject();
        if (cellDTO2 == null) {
            throw c.j("trainInfo", "trainInfo", reader);
        }
        if (stopsBlockDTO != null) {
            return new SegmentedTrainRouteDTO.SegmentDTO(cellDTO, cellDTO2, list, stopsBlockDTO);
        }
        throw c.j("stopsBlock", "stopsBlock", reader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, SegmentedTrainRouteDTO.SegmentDTO value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("transferInfo");
        this.nullableCellDTOAdapter.mo44toJson(writer, (x) value.getTransferInfo());
        writer.w("trainInfo");
        this.cellDTOAdapter.mo44toJson(writer, (x) value.getTrainInfo());
        writer.w("serviceBadges");
        this.nullableListOfBadgeDTOAdapter.mo44toJson(writer, (x) value.getServiceBadges());
        writer.w("stopsBlock");
        this.stopsBlockDTOAdapter.mo44toJson(writer, (x) value.getStopsBlock());
        writer.p();
    }
}
