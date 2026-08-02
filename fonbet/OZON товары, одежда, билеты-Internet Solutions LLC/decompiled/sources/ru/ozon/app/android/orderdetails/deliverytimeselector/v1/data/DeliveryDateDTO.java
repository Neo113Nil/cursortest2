package ru.ozon.app.android.orderdetails.deliverytimeselector.v1.data;

import An.C2439a;
import com.squareup.moshi.j;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/orderdetails/deliverytimeselector/v1/data/DeliveryDateDTO;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "", "timeslots", "", "Lru/ozon/app/android/orderdetails/deliverytimeselector/v1/data/DeliveryTimeSlotDTO;", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "getTitle", "()Ljava/lang/String;", "getTimeslots", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "orderdetails_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class DeliveryDateDTO {
    public static final int $stable = 8;

    @NotNull
    private final List<DeliveryTimeSlotDTO> timeslots;

    @NotNull
    private final String title;

    public DeliveryDateDTO(@NotNull String title, @NotNull List<DeliveryTimeSlotDTO> timeslots) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(timeslots, "timeslots");
        this.title = title;
        this.timeslots = timeslots;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DeliveryDateDTO copy$default(DeliveryDateDTO deliveryDateDTO, String str, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = deliveryDateDTO.title;
        }
        if ((i11 & 2) != 0) {
            list = deliveryDateDTO.timeslots;
        }
        return deliveryDateDTO.copy(str, list);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @NotNull
    public final List<DeliveryTimeSlotDTO> component2() {
        return this.timeslots;
    }

    @NotNull
    public final DeliveryDateDTO copy(@NotNull String title, @NotNull List<DeliveryTimeSlotDTO> timeslots) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(timeslots, "timeslots");
        return new DeliveryDateDTO(title, timeslots);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DeliveryDateDTO)) {
            return false;
        }
        DeliveryDateDTO deliveryDateDTO = (DeliveryDateDTO) other;
        return Intrinsics.d(this.title, deliveryDateDTO.title) && Intrinsics.d(this.timeslots, deliveryDateDTO.timeslots);
    }

    @NotNull
    public final List<DeliveryTimeSlotDTO> getTimeslots() {
        return this.timeslots;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return this.timeslots.hashCode() + (this.title.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return C2439a.a("DeliveryDateDTO(title=", this.title, ", timeslots=", ")", this.timeslots);
    }
}
