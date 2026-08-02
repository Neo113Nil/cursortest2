package ru.ozon.app.android.travel.feature.railway.widgets.segmentedTrainRoute.data;

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
import ru.ozon.app.android.travel.feature.railway.widgets.segmentedTrainRoute.data.SegmentedTrainRouteDTO;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R \u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001aR\u001c\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001d0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001a¨\u0006\u001f"}, d2 = {"Lru/ozon/app/android/travel/feature/railway/widgets/segmentedTrainRoute/data/SegmentedTrainRouteDTO_StopsBlockDTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/travel/feature/railway/widgets/segmentedTrainRoute/data/SegmentedTrainRouteDTO$StopsBlockDTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/travel/feature/railway/widgets/segmentedTrainRoute/data/SegmentedTrainRouteDTO$StopsBlockDTO;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/travel/feature/railway/widgets/segmentedTrainRoute/data/SegmentedTrainRouteDTO$StopsBlockDTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "", "Lru/ozon/app/android/travel/feature/railway/widgets/segmentedTrainRoute/data/SegmentedTrainRouteDTO$StopDTO;", "listOfStopDTOAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/uni/atoms/data/text/TextDTO;", "textDTOAdapter", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "nullableCellDTOAdapter", "railway_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class SegmentedTrainRouteDTO_StopsBlockDTOJsonAdapter extends JsonAdapter<SegmentedTrainRouteDTO.StopsBlockDTO> {
    public static final int $stable = 8;

    @NotNull
    private final JsonAdapter<List<SegmentedTrainRouteDTO.StopDTO>> listOfStopDTOAdapter;

    @NotNull
    private final JsonAdapter<CellDTO> nullableCellDTOAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<TextDTO> textDTOAdapter;

    public SegmentedTrainRouteDTO_StopsBlockDTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("stops", "localTimeInfo", "toggleDetailsButton");
        b e11 = D.e(List.class, SegmentedTrainRouteDTO.StopDTO.class);
        M m11 = M.f71699a;
        this.listOfStopDTOAdapter = moshi.f(e11, m11, "stops");
        this.textDTOAdapter = moshi.f(TextDTO.class, m11, "localTimeInfo");
        this.nullableCellDTOAdapter = moshi.f(CellDTO.class, m11, "toggleDetailsButton");
    }

    @NotNull
    public String toString() {
        return Ak.b.c(58, "GeneratedJsonAdapter(SegmentedTrainRouteDTO.StopsBlockDTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public SegmentedTrainRouteDTO.StopsBlockDTO fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        List<SegmentedTrainRouteDTO.StopDTO> list = null;
        TextDTO textDTO = null;
        CellDTO cellDTO = null;
        while (reader.hasNext()) {
            int v11 = reader.v(this.options);
            if (v11 == -1) {
                reader.y();
                reader.skipValue();
            } else if (v11 == 0) {
                list = this.listOfStopDTOAdapter.fromJson(reader);
                if (list == null) {
                    throw c.q("stops", "stops", reader);
                }
            } else if (v11 == 1) {
                textDTO = this.textDTOAdapter.fromJson(reader);
                if (textDTO == null) {
                    throw c.q("localTimeInfo", "localTimeInfo", reader);
                }
            } else if (v11 == 2) {
                cellDTO = this.nullableCellDTOAdapter.fromJson(reader);
            }
        }
        reader.endObject();
        if (list == null) {
            throw c.j("stops", "stops", reader);
        }
        if (textDTO != null) {
            return new SegmentedTrainRouteDTO.StopsBlockDTO(list, textDTO, cellDTO);
        }
        throw c.j("localTimeInfo", "localTimeInfo", reader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, SegmentedTrainRouteDTO.StopsBlockDTO value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("stops");
        this.listOfStopDTOAdapter.mo44toJson(writer, (x) value.getStops());
        writer.w("localTimeInfo");
        this.textDTOAdapter.mo44toJson(writer, (x) value.getLocalTimeInfo());
        writer.w("toggleDetailsButton");
        this.nullableCellDTOAdapter.mo44toJson(writer, (x) value.getToggleDetailsButton());
        writer.p();
    }
}
