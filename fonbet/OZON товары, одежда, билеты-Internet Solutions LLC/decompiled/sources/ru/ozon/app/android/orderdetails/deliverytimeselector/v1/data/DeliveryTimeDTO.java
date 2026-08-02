package ru.ozon.app.android.orderdetails.deliverytimeselector.v1.data;

import com.squareup.moshi.j;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B\u001f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\nJ\u000f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J*\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001¢\u0006\u0002\u0010\u0011J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/orderdetails/deliverytimeselector/v1/data/DeliveryTimeDTO;", "", "selectedDatePosition", "", "dates", "", "Lru/ozon/app/android/orderdetails/deliverytimeselector/v1/data/DeliveryDateDTO;", "<init>", "(Ljava/lang/Integer;Ljava/util/List;)V", "getSelectedDatePosition", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getDates", "()Ljava/util/List;", "component1", "component2", "copy", "(Ljava/lang/Integer;Ljava/util/List;)Lru/ozon/app/android/orderdetails/deliverytimeselector/v1/data/DeliveryTimeDTO;", "equals", "", "other", "hashCode", "toString", "", "orderdetails_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class DeliveryTimeDTO {
    public static final int $stable = 8;

    @NotNull
    private final List<DeliveryDateDTO> dates;
    private final Integer selectedDatePosition;

    public DeliveryTimeDTO(Integer num, @NotNull List<DeliveryDateDTO> dates) {
        Intrinsics.checkNotNullParameter(dates, "dates");
        this.selectedDatePosition = num;
        this.dates = dates;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DeliveryTimeDTO copy$default(DeliveryTimeDTO deliveryTimeDTO, Integer num, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            num = deliveryTimeDTO.selectedDatePosition;
        }
        if ((i11 & 2) != 0) {
            list = deliveryTimeDTO.dates;
        }
        return deliveryTimeDTO.copy(num, list);
    }

    /* renamed from: component1, reason: from getter */
    public final Integer getSelectedDatePosition() {
        return this.selectedDatePosition;
    }

    @NotNull
    public final List<DeliveryDateDTO> component2() {
        return this.dates;
    }

    @NotNull
    public final DeliveryTimeDTO copy(Integer selectedDatePosition, @NotNull List<DeliveryDateDTO> dates) {
        Intrinsics.checkNotNullParameter(dates, "dates");
        return new DeliveryTimeDTO(selectedDatePosition, dates);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DeliveryTimeDTO)) {
            return false;
        }
        DeliveryTimeDTO deliveryTimeDTO = (DeliveryTimeDTO) other;
        return Intrinsics.d(this.selectedDatePosition, deliveryTimeDTO.selectedDatePosition) && Intrinsics.d(this.dates, deliveryTimeDTO.dates);
    }

    @NotNull
    public final List<DeliveryDateDTO> getDates() {
        return this.dates;
    }

    public final Integer getSelectedDatePosition() {
        return this.selectedDatePosition;
    }

    public int hashCode() {
        Integer num = this.selectedDatePosition;
        return this.dates.hashCode() + ((num == null ? 0 : num.hashCode()) * 31);
    }

    @NotNull
    public String toString() {
        return "DeliveryTimeDTO(selectedDatePosition=" + this.selectedDatePosition + ", dates=" + this.dates + ")";
    }
}
