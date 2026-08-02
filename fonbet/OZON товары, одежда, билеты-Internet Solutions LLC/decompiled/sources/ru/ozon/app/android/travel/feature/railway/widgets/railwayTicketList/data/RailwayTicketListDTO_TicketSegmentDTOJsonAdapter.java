package ru.ozon.app.android.travel.feature.railway.widgets.railwayTicketList.data;

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
import ru.ozon.app.android.travel.feature.railway.widgets.railwayTicketList.data.RailwayTicketListDTO;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R \u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001aR\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001a¨\u0006\u001f"}, d2 = {"Lru/ozon/app/android/travel/feature/railway/widgets/railwayTicketList/data/RailwayTicketListDTO_TicketSegmentDTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/travel/feature/railway/widgets/railwayTicketList/data/RailwayTicketListDTO$TicketSegmentDTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/travel/feature/railway/widgets/railwayTicketList/data/RailwayTicketListDTO$TicketSegmentDTO;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/travel/feature/railway/widgets/railwayTicketList/data/RailwayTicketListDTO$TicketSegmentDTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "listOfBadgeDTOAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/travel/feature/railway/widgets/railwayTicketList/data/RailwayTicketListDTO$StopBlockDTO;", "stopBlockDTOAdapter", "Lru/ozon/uni/atoms/data/text/TextDTO;", "textDTOAdapter", "railway_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class RailwayTicketListDTO_TicketSegmentDTOJsonAdapter extends JsonAdapter<RailwayTicketListDTO.TicketSegmentDTO> {
    public static final int $stable = 8;

    @NotNull
    private final JsonAdapter<List<BadgeDTO>> listOfBadgeDTOAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<RailwayTicketListDTO.StopBlockDTO> stopBlockDTOAdapter;

    @NotNull
    private final JsonAdapter<TextDTO> textDTOAdapter;

    public RailwayTicketListDTO_TicketSegmentDTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("badges", "departureStop", "arrivalStop", "totalTravelTime", "placesInfo");
        b e11 = D.e(List.class, BadgeDTO.class);
        M m11 = M.f71699a;
        this.listOfBadgeDTOAdapter = moshi.f(e11, m11, "badges");
        this.stopBlockDTOAdapter = moshi.f(RailwayTicketListDTO.StopBlockDTO.class, m11, "departureStop");
        this.textDTOAdapter = moshi.f(TextDTO.class, m11, "totalTravelTime");
    }

    @NotNull
    public String toString() {
        return Ak.b.c(59, "GeneratedJsonAdapter(RailwayTicketListDTO.TicketSegmentDTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public RailwayTicketListDTO.TicketSegmentDTO fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        List<BadgeDTO> list = null;
        RailwayTicketListDTO.StopBlockDTO stopBlockDTO = null;
        RailwayTicketListDTO.StopBlockDTO stopBlockDTO2 = null;
        TextDTO textDTO = null;
        List<BadgeDTO> list2 = null;
        while (reader.hasNext()) {
            int v11 = reader.v(this.options);
            if (v11 == -1) {
                reader.y();
                reader.skipValue();
            } else if (v11 == 0) {
                list = this.listOfBadgeDTOAdapter.fromJson(reader);
                if (list == null) {
                    throw c.q("badges", "badges", reader);
                }
            } else if (v11 == 1) {
                stopBlockDTO = this.stopBlockDTOAdapter.fromJson(reader);
                if (stopBlockDTO == null) {
                    throw c.q("departureStop", "departureStop", reader);
                }
            } else if (v11 == 2) {
                stopBlockDTO2 = this.stopBlockDTOAdapter.fromJson(reader);
                if (stopBlockDTO2 == null) {
                    throw c.q("arrivalStop", "arrivalStop", reader);
                }
            } else if (v11 == 3) {
                textDTO = this.textDTOAdapter.fromJson(reader);
                if (textDTO == null) {
                    throw c.q("totalTravelTime", "totalTravelTime", reader);
                }
            } else if (v11 == 4 && (list2 = this.listOfBadgeDTOAdapter.fromJson(reader)) == null) {
                throw c.q("placesInfo", "placesInfo", reader);
            }
        }
        reader.endObject();
        if (list == null) {
            throw c.j("badges", "badges", reader);
        }
        if (stopBlockDTO == null) {
            throw c.j("departureStop", "departureStop", reader);
        }
        if (stopBlockDTO2 == null) {
            throw c.j("arrivalStop", "arrivalStop", reader);
        }
        if (textDTO == null) {
            throw c.j("totalTravelTime", "totalTravelTime", reader);
        }
        if (list2 != null) {
            return new RailwayTicketListDTO.TicketSegmentDTO(list, stopBlockDTO, stopBlockDTO2, textDTO, list2);
        }
        throw c.j("placesInfo", "placesInfo", reader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, RailwayTicketListDTO.TicketSegmentDTO value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("badges");
        this.listOfBadgeDTOAdapter.mo44toJson(writer, (x) value.getBadges());
        writer.w("departureStop");
        this.stopBlockDTOAdapter.mo44toJson(writer, (x) value.getDepartureStop());
        writer.w("arrivalStop");
        this.stopBlockDTOAdapter.mo44toJson(writer, (x) value.getArrivalStop());
        writer.w("totalTravelTime");
        this.textDTOAdapter.mo44toJson(writer, (x) value.getTotalTravelTime());
        writer.w("placesInfo");
        this.listOfBadgeDTOAdapter.mo44toJson(writer, (x) value.getPlacesInfo());
        writer.p();
    }
}
