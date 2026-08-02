package ru.ozon.app.android.travel.feature.general.order.widgets.flightOrderDetails.v4.data;

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
import ru.ozon.app.android.travel.feature.general.order.widgets.flightOrderDetails.v4.data.FlightOrderDetailsV4DTO;
import ru.ozon.app.android.travel.molecules.dto.tripLeg.v3.TripLegV3DTO;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0019R\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0019R\u001c\u0010 \u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u0019¨\u0006!"}, d2 = {"Lru/ozon/app/android/travel/feature/general/order/widgets/flightOrderDetails/v4/data/FlightOrderDetailsV4DTO_SegmentDTO_SegmentPartDTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/travel/feature/general/order/widgets/flightOrderDetails/v4/data/FlightOrderDetailsV4DTO$SegmentDTO$SegmentPartDTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/travel/feature/general/order/widgets/flightOrderDetails/v4/data/FlightOrderDetailsV4DTO$SegmentDTO$SegmentPartDTO;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/travel/feature/general/order/widgets/flightOrderDetails/v4/data/FlightOrderDetailsV4DTO$SegmentDTO$SegmentPartDTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "nullableBadgeDTOAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "cellDTOAdapter", "Lru/ozon/app/android/travel/molecules/dto/tripLeg/v3/TripLegV3DTO;", "tripLegV3DTOAdapter", "Lru/ozon/app/android/travel/feature/general/order/widgets/flightOrderDetails/v4/data/FlightOrderDetailsV4DTO$SegmentDTO$SegmentPartDTO$LuggageBlockDTO;", "luggageBlockDTOAdapter", "nullableCellDTOAdapter", "order_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class FlightOrderDetailsV4DTO_SegmentDTO_SegmentPartDTOJsonAdapter extends JsonAdapter<FlightOrderDetailsV4DTO.SegmentDTO.SegmentPartDTO> {
    public static final int $stable = 8;

    @NotNull
    private final JsonAdapter<CellDTO> cellDTOAdapter;

    @NotNull
    private final JsonAdapter<FlightOrderDetailsV4DTO.SegmentDTO.SegmentPartDTO.LuggageBlockDTO> luggageBlockDTOAdapter;

    @NotNull
    private final JsonAdapter<BadgeDTO> nullableBadgeDTOAdapter;

    @NotNull
    private final JsonAdapter<CellDTO> nullableCellDTOAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<TripLegV3DTO> tripLegV3DTOAdapter;

    public FlightOrderDetailsV4DTO_SegmentDTO_SegmentPartDTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("badge", "airlineCell", "tripLeg", "luggageBlock", "transferCell");
        M m11 = M.f71699a;
        this.nullableBadgeDTOAdapter = moshi.f(BadgeDTO.class, m11, "badge");
        this.cellDTOAdapter = moshi.f(CellDTO.class, m11, "airlineCell");
        this.tripLegV3DTOAdapter = moshi.f(TripLegV3DTO.class, m11, "tripLeg");
        this.luggageBlockDTOAdapter = moshi.f(FlightOrderDetailsV4DTO.SegmentDTO.SegmentPartDTO.LuggageBlockDTO.class, m11, "luggageBlock");
        this.nullableCellDTOAdapter = moshi.f(CellDTO.class, m11, "transferCell");
    }

    @NotNull
    public String toString() {
        return b.c(71, "GeneratedJsonAdapter(FlightOrderDetailsV4DTO.SegmentDTO.SegmentPartDTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public FlightOrderDetailsV4DTO.SegmentDTO.SegmentPartDTO fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        BadgeDTO badgeDTO = null;
        CellDTO cellDTO = null;
        TripLegV3DTO tripLegV3DTO = null;
        FlightOrderDetailsV4DTO.SegmentDTO.SegmentPartDTO.LuggageBlockDTO luggageBlockDTO = null;
        CellDTO cellDTO2 = null;
        while (reader.hasNext()) {
            int v11 = reader.v(this.options);
            if (v11 == -1) {
                reader.y();
                reader.skipValue();
            } else if (v11 == 0) {
                badgeDTO = this.nullableBadgeDTOAdapter.fromJson(reader);
            } else if (v11 == 1) {
                cellDTO = this.cellDTOAdapter.fromJson(reader);
                if (cellDTO == null) {
                    throw c.q("airlineCell", "airlineCell", reader);
                }
            } else if (v11 == 2) {
                tripLegV3DTO = this.tripLegV3DTOAdapter.fromJson(reader);
                if (tripLegV3DTO == null) {
                    throw c.q("tripLeg", "tripLeg", reader);
                }
            } else if (v11 == 3) {
                luggageBlockDTO = this.luggageBlockDTOAdapter.fromJson(reader);
                if (luggageBlockDTO == null) {
                    throw c.q("luggageBlock", "luggageBlock", reader);
                }
            } else if (v11 == 4) {
                cellDTO2 = this.nullableCellDTOAdapter.fromJson(reader);
            }
        }
        reader.endObject();
        if (cellDTO == null) {
            throw c.j("airlineCell", "airlineCell", reader);
        }
        if (tripLegV3DTO == null) {
            throw c.j("tripLeg", "tripLeg", reader);
        }
        if (luggageBlockDTO != null) {
            return new FlightOrderDetailsV4DTO.SegmentDTO.SegmentPartDTO(badgeDTO, cellDTO, tripLegV3DTO, luggageBlockDTO, cellDTO2);
        }
        throw c.j("luggageBlock", "luggageBlock", reader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, FlightOrderDetailsV4DTO.SegmentDTO.SegmentPartDTO value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("badge");
        this.nullableBadgeDTOAdapter.mo44toJson(writer, (x) value.getBadge());
        writer.w("airlineCell");
        this.cellDTOAdapter.mo44toJson(writer, (x) value.getAirlineCell());
        writer.w("tripLeg");
        this.tripLegV3DTOAdapter.mo44toJson(writer, (x) value.getTripLeg());
        writer.w("luggageBlock");
        this.luggageBlockDTOAdapter.mo44toJson(writer, (x) value.getLuggageBlock());
        writer.w("transferCell");
        this.nullableCellDTOAdapter.mo44toJson(writer, (x) value.getTransferCell());
        writer.p();
    }
}
