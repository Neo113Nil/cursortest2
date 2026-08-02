package ru.ozon.app.android.orderdetails.deliverytimeselector.v1.presentation;

import B90.C2618u;
import Kk.C3532b;
import Ve.C4636t5;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u000f\b\u0081\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0011\u001a\u00020\u00042\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\fR\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0005\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/orderdetails/deliverytimeselector/v1/presentation/DeliveryDateVO;", "", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "", "isSelected", "", "Lru/ozon/app/android/orderdetails/deliverytimeselector/v1/presentation/DeliveryTimeSlotVO;", "timeslots", "<init>", "(Ljava/lang/String;ZLjava/util/List;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTitle", "Z", "()Z", "setSelected", "(Z)V", "Ljava/util/List;", "getTimeslots", "()Ljava/util/List;", "orderdetails_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class DeliveryDateVO {
    private boolean isSelected;

    @NotNull
    private final List<DeliveryTimeSlotVO> timeslots;

    @NotNull
    private final String title;

    public DeliveryDateVO(@NotNull String title, boolean z11, @NotNull List<DeliveryTimeSlotVO> timeslots) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(timeslots, "timeslots");
        this.title = title;
        this.isSelected = z11;
        this.timeslots = timeslots;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DeliveryDateVO)) {
            return false;
        }
        DeliveryDateVO deliveryDateVO = (DeliveryDateVO) other;
        return Intrinsics.d(this.title, deliveryDateVO.title) && this.isSelected == deliveryDateVO.isSelected && Intrinsics.d(this.timeslots, deliveryDateVO.timeslots);
    }

    @NotNull
    public final List<DeliveryTimeSlotVO> getTimeslots() {
        return this.timeslots;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return this.timeslots.hashCode() + C3532b.a(this.title.hashCode() * 31, 31, this.isSelected);
    }

    /* renamed from: isSelected, reason: from getter */
    public final boolean getIsSelected() {
        return this.isSelected;
    }

    @NotNull
    public String toString() {
        String str = this.title;
        boolean z11 = this.isSelected;
        return C2618u.h(C4636t5.b("DeliveryDateVO(title=", str, ", isSelected=", ", timeslots=", z11), this.timeslots, ")");
    }
}
