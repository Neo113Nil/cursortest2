package ru.ozon.app.android.returns.returnableItemsList.data.dto;

import com.squareup.moshi.j;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@j(generateAdapter = true)
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B)\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\bHÆ\u0003J1\u0010\u0014\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/returns/returnableItemsList/data/dto/ReturnableItemsListDTO;", "", "items", "", "Lru/ozon/app/android/returns/returnableItemsList/data/dto/ReturnableItemDTO;", "totalMobile", "Lru/ozon/app/android/returns/returnableItemsList/data/dto/TotalMobileDTO;", "paginationMobile", "Lru/ozon/app/android/returns/returnableItemsList/data/dto/PaginationMobileDTO;", "<init>", "(Ljava/util/List;Lru/ozon/app/android/returns/returnableItemsList/data/dto/TotalMobileDTO;Lru/ozon/app/android/returns/returnableItemsList/data/dto/PaginationMobileDTO;)V", "getItems", "()Ljava/util/List;", "getTotalMobile", "()Lru/ozon/app/android/returns/returnableItemsList/data/dto/TotalMobileDTO;", "getPaginationMobile", "()Lru/ozon/app/android/returns/returnableItemsList/data/dto/PaginationMobileDTO;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "details_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class ReturnableItemsListDTO {
    public static final int $stable = 8;

    @NotNull
    private final List<ReturnableItemDTO> items;
    private final PaginationMobileDTO paginationMobile;
    private final TotalMobileDTO totalMobile;

    public ReturnableItemsListDTO(@NotNull List<ReturnableItemDTO> items, TotalMobileDTO totalMobileDTO, PaginationMobileDTO paginationMobileDTO) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.items = items;
        this.totalMobile = totalMobileDTO;
        this.paginationMobile = paginationMobileDTO;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ReturnableItemsListDTO copy$default(ReturnableItemsListDTO returnableItemsListDTO, List list, TotalMobileDTO totalMobileDTO, PaginationMobileDTO paginationMobileDTO, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = returnableItemsListDTO.items;
        }
        if ((i11 & 2) != 0) {
            totalMobileDTO = returnableItemsListDTO.totalMobile;
        }
        if ((i11 & 4) != 0) {
            paginationMobileDTO = returnableItemsListDTO.paginationMobile;
        }
        return returnableItemsListDTO.copy(list, totalMobileDTO, paginationMobileDTO);
    }

    @NotNull
    public final List<ReturnableItemDTO> component1() {
        return this.items;
    }

    /* renamed from: component2, reason: from getter */
    public final TotalMobileDTO getTotalMobile() {
        return this.totalMobile;
    }

    /* renamed from: component3, reason: from getter */
    public final PaginationMobileDTO getPaginationMobile() {
        return this.paginationMobile;
    }

    @NotNull
    public final ReturnableItemsListDTO copy(@NotNull List<ReturnableItemDTO> items, TotalMobileDTO totalMobile, PaginationMobileDTO paginationMobile) {
        Intrinsics.checkNotNullParameter(items, "items");
        return new ReturnableItemsListDTO(items, totalMobile, paginationMobile);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ReturnableItemsListDTO)) {
            return false;
        }
        ReturnableItemsListDTO returnableItemsListDTO = (ReturnableItemsListDTO) other;
        return Intrinsics.d(this.items, returnableItemsListDTO.items) && Intrinsics.d(this.totalMobile, returnableItemsListDTO.totalMobile) && Intrinsics.d(this.paginationMobile, returnableItemsListDTO.paginationMobile);
    }

    @NotNull
    public final List<ReturnableItemDTO> getItems() {
        return this.items;
    }

    public final PaginationMobileDTO getPaginationMobile() {
        return this.paginationMobile;
    }

    public final TotalMobileDTO getTotalMobile() {
        return this.totalMobile;
    }

    public int hashCode() {
        int hashCode = this.items.hashCode() * 31;
        TotalMobileDTO totalMobileDTO = this.totalMobile;
        int hashCode2 = (hashCode + (totalMobileDTO == null ? 0 : totalMobileDTO.hashCode())) * 31;
        PaginationMobileDTO paginationMobileDTO = this.paginationMobile;
        return hashCode2 + (paginationMobileDTO != null ? paginationMobileDTO.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "ReturnableItemsListDTO(items=" + this.items + ", totalMobile=" + this.totalMobile + ", paginationMobile=" + this.paginationMobile + ")";
    }
}
