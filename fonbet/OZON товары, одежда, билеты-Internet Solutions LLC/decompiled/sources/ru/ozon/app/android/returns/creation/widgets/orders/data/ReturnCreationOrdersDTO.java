package ru.ozon.app.android.returns.creation.widgets.orders.data;

import com.squareup.moshi.j;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.returns.creation.molecule.returnCreationDeliveryGroup.data.DeliveryGroupDTO;
import ru.ozon.app.android.returns.ui.molecules.opencloud.data.OpenCloudDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B+\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\bHÆ\u0003J3\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0019\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/returns/creation/widgets/orders/data/ReturnCreationOrdersDTO;", "", "openCloud", "Lru/ozon/app/android/returns/ui/molecules/opencloud/data/OpenCloudDTO;", "orders", "", "Lru/ozon/app/android/returns/creation/molecule/returnCreationDeliveryGroup/data/DeliveryGroupDTO;", "pagination", "Lru/ozon/app/android/returns/creation/widgets/orders/data/PaginationDTO;", "<init>", "(Lru/ozon/app/android/returns/ui/molecules/opencloud/data/OpenCloudDTO;Ljava/util/List;Lru/ozon/app/android/returns/creation/widgets/orders/data/PaginationDTO;)V", "getOpenCloud", "()Lru/ozon/app/android/returns/ui/molecules/opencloud/data/OpenCloudDTO;", "getOrders", "()Ljava/util/List;", "getPagination", "()Lru/ozon/app/android/returns/creation/widgets/orders/data/PaginationDTO;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "creation_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class ReturnCreationOrdersDTO {
    public static final int $stable = 8;
    private final OpenCloudDTO openCloud;
    private final List<DeliveryGroupDTO> orders;
    private final PaginationDTO pagination;

    public ReturnCreationOrdersDTO(OpenCloudDTO openCloudDTO, List<DeliveryGroupDTO> list, PaginationDTO paginationDTO) {
        this.openCloud = openCloudDTO;
        this.orders = list;
        this.pagination = paginationDTO;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ReturnCreationOrdersDTO copy$default(ReturnCreationOrdersDTO returnCreationOrdersDTO, OpenCloudDTO openCloudDTO, List list, PaginationDTO paginationDTO, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            openCloudDTO = returnCreationOrdersDTO.openCloud;
        }
        if ((i11 & 2) != 0) {
            list = returnCreationOrdersDTO.orders;
        }
        if ((i11 & 4) != 0) {
            paginationDTO = returnCreationOrdersDTO.pagination;
        }
        return returnCreationOrdersDTO.copy(openCloudDTO, list, paginationDTO);
    }

    /* renamed from: component1, reason: from getter */
    public final OpenCloudDTO getOpenCloud() {
        return this.openCloud;
    }

    public final List<DeliveryGroupDTO> component2() {
        return this.orders;
    }

    /* renamed from: component3, reason: from getter */
    public final PaginationDTO getPagination() {
        return this.pagination;
    }

    @NotNull
    public final ReturnCreationOrdersDTO copy(OpenCloudDTO openCloud, List<DeliveryGroupDTO> orders, PaginationDTO pagination) {
        return new ReturnCreationOrdersDTO(openCloud, orders, pagination);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ReturnCreationOrdersDTO)) {
            return false;
        }
        ReturnCreationOrdersDTO returnCreationOrdersDTO = (ReturnCreationOrdersDTO) other;
        return Intrinsics.d(this.openCloud, returnCreationOrdersDTO.openCloud) && Intrinsics.d(this.orders, returnCreationOrdersDTO.orders) && Intrinsics.d(this.pagination, returnCreationOrdersDTO.pagination);
    }

    public final OpenCloudDTO getOpenCloud() {
        return this.openCloud;
    }

    public final List<DeliveryGroupDTO> getOrders() {
        return this.orders;
    }

    public final PaginationDTO getPagination() {
        return this.pagination;
    }

    public int hashCode() {
        OpenCloudDTO openCloudDTO = this.openCloud;
        int hashCode = (openCloudDTO == null ? 0 : openCloudDTO.hashCode()) * 31;
        List<DeliveryGroupDTO> list = this.orders;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        PaginationDTO paginationDTO = this.pagination;
        return hashCode2 + (paginationDTO != null ? paginationDTO.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "ReturnCreationOrdersDTO(openCloud=" + this.openCloud + ", orders=" + this.orders + ", pagination=" + this.pagination + ")";
    }
}
