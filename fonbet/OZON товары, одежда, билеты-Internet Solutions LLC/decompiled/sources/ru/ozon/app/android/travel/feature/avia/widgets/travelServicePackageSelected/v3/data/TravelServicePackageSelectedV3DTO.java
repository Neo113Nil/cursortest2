package ru.ozon.app.android.travel.feature.avia.widgets.travelServicePackageSelected.v3.data;

import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.molecules.dto.serviceBlock.v3.ServiceBlockV3DTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/travelServicePackageSelected/v3/data/TravelServicePackageSelectedV3DTO;", "", "service", "Lru/ozon/app/android/travel/molecules/dto/serviceBlock/v3/ServiceBlockV3DTO;", "<init>", "(Lru/ozon/app/android/travel/molecules/dto/serviceBlock/v3/ServiceBlockV3DTO;)V", "getService", "()Lru/ozon/app/android/travel/molecules/dto/serviceBlock/v3/ServiceBlockV3DTO;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class TravelServicePackageSelectedV3DTO {
    public static final int $stable = 8;

    @NotNull
    private final ServiceBlockV3DTO service;

    public TravelServicePackageSelectedV3DTO(@NotNull ServiceBlockV3DTO service) {
        Intrinsics.checkNotNullParameter(service, "service");
        this.service = service;
    }

    public static /* synthetic */ TravelServicePackageSelectedV3DTO copy$default(TravelServicePackageSelectedV3DTO travelServicePackageSelectedV3DTO, ServiceBlockV3DTO serviceBlockV3DTO, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            serviceBlockV3DTO = travelServicePackageSelectedV3DTO.service;
        }
        return travelServicePackageSelectedV3DTO.copy(serviceBlockV3DTO);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final ServiceBlockV3DTO getService() {
        return this.service;
    }

    @NotNull
    public final TravelServicePackageSelectedV3DTO copy(@NotNull ServiceBlockV3DTO service) {
        Intrinsics.checkNotNullParameter(service, "service");
        return new TravelServicePackageSelectedV3DTO(service);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof TravelServicePackageSelectedV3DTO) && Intrinsics.d(this.service, ((TravelServicePackageSelectedV3DTO) other).service);
    }

    @NotNull
    public final ServiceBlockV3DTO getService() {
        return this.service;
    }

    public int hashCode() {
        return this.service.hashCode();
    }

    @NotNull
    public String toString() {
        return "TravelServicePackageSelectedV3DTO(service=" + this.service + ")";
    }
}
