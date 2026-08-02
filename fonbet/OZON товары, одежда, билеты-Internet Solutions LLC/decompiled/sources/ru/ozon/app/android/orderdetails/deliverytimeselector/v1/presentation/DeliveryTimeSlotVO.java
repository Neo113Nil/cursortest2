package ru.ozon.app.android.orderdetails.deliverytimeselector.v1.presentation;

import G.g;
import N3.C3660k;
import Pk0.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\r\b\u0081\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u000f\u001a\u00020\u00052\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\nR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0011\u001a\u0004\b\u0013\u0010\nR\"\u0010\u0006\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0014\u001a\u0004\b\u0006\u0010\u0015\"\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/orderdetails/deliverytimeselector/v1/presentation/DeliveryTimeSlotVO;", "", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "deeplink", "", "isSelected", "<init>", "(Ljava/lang/String;Ljava/lang/String;Z)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTitle", "getDeeplink", "Z", "()Z", "setSelected", "(Z)V", "orderdetails_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class DeliveryTimeSlotVO {

    @NotNull
    private final String deeplink;
    private boolean isSelected;

    @NotNull
    private final String title;

    public DeliveryTimeSlotVO(@NotNull String title, @NotNull String deeplink, boolean z11) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        this.title = title;
        this.deeplink = deeplink;
        this.isSelected = z11;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DeliveryTimeSlotVO)) {
            return false;
        }
        DeliveryTimeSlotVO deliveryTimeSlotVO = (DeliveryTimeSlotVO) other;
        return Intrinsics.d(this.title, deliveryTimeSlotVO.title) && Intrinsics.d(this.deeplink, deliveryTimeSlotVO.deeplink) && this.isSelected == deliveryTimeSlotVO.isSelected;
    }

    @NotNull
    public final String getDeeplink() {
        return this.deeplink;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return Boolean.hashCode(this.isSelected) + g.a(this.title.hashCode() * 31, 31, this.deeplink);
    }

    /* renamed from: isSelected, reason: from getter */
    public final boolean getIsSelected() {
        return this.isSelected;
    }

    @NotNull
    public String toString() {
        String str = this.title;
        String str2 = this.deeplink;
        return a.a(")", C3660k.d("DeliveryTimeSlotVO(title=", str, ", deeplink=", str2, ", isSelected="), this.isSelected);
    }
}
