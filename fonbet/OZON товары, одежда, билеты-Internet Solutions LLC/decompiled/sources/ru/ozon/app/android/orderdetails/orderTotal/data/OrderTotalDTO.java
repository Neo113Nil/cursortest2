package ru.ozon.app.android.orderdetails.orderTotal.data;

import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.partpayment.formpage.data.FormPageDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/orderdetails/orderTotal/data/OrderTotalDTO;", "", "sticky", "Lru/ozon/app/android/orderdetails/orderTotal/data/StickyDTO;", FormPageDTO.Field.FIELD_TYPE_SUMMARY, "Lru/ozon/app/android/orderdetails/orderTotal/data/SummaryDTO;", "<init>", "(Lru/ozon/app/android/orderdetails/orderTotal/data/StickyDTO;Lru/ozon/app/android/orderdetails/orderTotal/data/SummaryDTO;)V", "getSticky", "()Lru/ozon/app/android/orderdetails/orderTotal/data/StickyDTO;", "getSummary", "()Lru/ozon/app/android/orderdetails/orderTotal/data/SummaryDTO;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "orderdetails_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class OrderTotalDTO {
    public static final int $stable = 8;
    private final StickyDTO sticky;
    private final SummaryDTO summary;

    public OrderTotalDTO(StickyDTO stickyDTO, SummaryDTO summaryDTO) {
        this.sticky = stickyDTO;
        this.summary = summaryDTO;
    }

    public static /* synthetic */ OrderTotalDTO copy$default(OrderTotalDTO orderTotalDTO, StickyDTO stickyDTO, SummaryDTO summaryDTO, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            stickyDTO = orderTotalDTO.sticky;
        }
        if ((i11 & 2) != 0) {
            summaryDTO = orderTotalDTO.summary;
        }
        return orderTotalDTO.copy(stickyDTO, summaryDTO);
    }

    /* renamed from: component1, reason: from getter */
    public final StickyDTO getSticky() {
        return this.sticky;
    }

    /* renamed from: component2, reason: from getter */
    public final SummaryDTO getSummary() {
        return this.summary;
    }

    @NotNull
    public final OrderTotalDTO copy(StickyDTO sticky, SummaryDTO summary) {
        return new OrderTotalDTO(sticky, summary);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OrderTotalDTO)) {
            return false;
        }
        OrderTotalDTO orderTotalDTO = (OrderTotalDTO) other;
        return Intrinsics.d(this.sticky, orderTotalDTO.sticky) && Intrinsics.d(this.summary, orderTotalDTO.summary);
    }

    public final StickyDTO getSticky() {
        return this.sticky;
    }

    public final SummaryDTO getSummary() {
        return this.summary;
    }

    public int hashCode() {
        StickyDTO stickyDTO = this.sticky;
        int hashCode = (stickyDTO == null ? 0 : stickyDTO.hashCode()) * 31;
        SummaryDTO summaryDTO = this.summary;
        return hashCode + (summaryDTO != null ? summaryDTO.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "OrderTotalDTO(sticky=" + this.sticky + ", summary=" + this.summary + ")";
    }
}
