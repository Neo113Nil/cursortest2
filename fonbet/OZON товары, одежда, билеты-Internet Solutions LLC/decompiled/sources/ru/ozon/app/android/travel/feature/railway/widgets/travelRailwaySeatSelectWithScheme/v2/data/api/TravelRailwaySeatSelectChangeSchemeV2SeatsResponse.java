package ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySeatSelectWithScheme.v2.data.api;

import com.squareup.moshi.j;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySeatSelectWithScheme.v2.data.models.TravelRailwaySeatSelectFooterDTO;
import ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySeatSelectWithScheme.v2.data.models.TravelRailwaySeatSelectWithSchemeV2DTO;
import ru.ozon.app.android.ugc.core.widgets.commentsListV3.data.CommentV3DTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B\u001f\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0011\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0006HÆ\u0003J%\u0010\u000f\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySeatSelectWithScheme/v2/data/api/TravelRailwaySeatSelectChangeSchemeV2SeatsResponse;", "", "seats", "", "Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySeatSelectWithScheme/v2/data/models/TravelRailwaySeatSelectWithSchemeV2DTO$SeatDTO;", CommentV3DTO.FOOTER_FIELD_NAME, "Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySeatSelectWithScheme/v2/data/models/TravelRailwaySeatSelectFooterDTO;", "<init>", "(Ljava/util/List;Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySeatSelectWithScheme/v2/data/models/TravelRailwaySeatSelectFooterDTO;)V", "getSeats", "()Ljava/util/List;", "getFooter", "()Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySeatSelectWithScheme/v2/data/models/TravelRailwaySeatSelectFooterDTO;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "railway_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class TravelRailwaySeatSelectChangeSchemeV2SeatsResponse {
    public static final int $stable = 8;

    @NotNull
    private final TravelRailwaySeatSelectFooterDTO footer;
    private final List<TravelRailwaySeatSelectWithSchemeV2DTO.SeatDTO> seats;

    public TravelRailwaySeatSelectChangeSchemeV2SeatsResponse(List<TravelRailwaySeatSelectWithSchemeV2DTO.SeatDTO> list, @NotNull TravelRailwaySeatSelectFooterDTO footer) {
        Intrinsics.checkNotNullParameter(footer, "footer");
        this.seats = list;
        this.footer = footer;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TravelRailwaySeatSelectChangeSchemeV2SeatsResponse copy$default(TravelRailwaySeatSelectChangeSchemeV2SeatsResponse travelRailwaySeatSelectChangeSchemeV2SeatsResponse, List list, TravelRailwaySeatSelectFooterDTO travelRailwaySeatSelectFooterDTO, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = travelRailwaySeatSelectChangeSchemeV2SeatsResponse.seats;
        }
        if ((i11 & 2) != 0) {
            travelRailwaySeatSelectFooterDTO = travelRailwaySeatSelectChangeSchemeV2SeatsResponse.footer;
        }
        return travelRailwaySeatSelectChangeSchemeV2SeatsResponse.copy(list, travelRailwaySeatSelectFooterDTO);
    }

    public final List<TravelRailwaySeatSelectWithSchemeV2DTO.SeatDTO> component1() {
        return this.seats;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final TravelRailwaySeatSelectFooterDTO getFooter() {
        return this.footer;
    }

    @NotNull
    public final TravelRailwaySeatSelectChangeSchemeV2SeatsResponse copy(List<TravelRailwaySeatSelectWithSchemeV2DTO.SeatDTO> seats, @NotNull TravelRailwaySeatSelectFooterDTO footer) {
        Intrinsics.checkNotNullParameter(footer, "footer");
        return new TravelRailwaySeatSelectChangeSchemeV2SeatsResponse(seats, footer);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TravelRailwaySeatSelectChangeSchemeV2SeatsResponse)) {
            return false;
        }
        TravelRailwaySeatSelectChangeSchemeV2SeatsResponse travelRailwaySeatSelectChangeSchemeV2SeatsResponse = (TravelRailwaySeatSelectChangeSchemeV2SeatsResponse) other;
        return Intrinsics.d(this.seats, travelRailwaySeatSelectChangeSchemeV2SeatsResponse.seats) && Intrinsics.d(this.footer, travelRailwaySeatSelectChangeSchemeV2SeatsResponse.footer);
    }

    @NotNull
    public final TravelRailwaySeatSelectFooterDTO getFooter() {
        return this.footer;
    }

    public final List<TravelRailwaySeatSelectWithSchemeV2DTO.SeatDTO> getSeats() {
        return this.seats;
    }

    public int hashCode() {
        List<TravelRailwaySeatSelectWithSchemeV2DTO.SeatDTO> list = this.seats;
        return this.footer.hashCode() + ((list == null ? 0 : list.hashCode()) * 31);
    }

    @NotNull
    public String toString() {
        return "TravelRailwaySeatSelectChangeSchemeV2SeatsResponse(seats=" + this.seats + ", footer=" + this.footer + ")";
    }
}
