package ru.ozon.app.android.account.orders.activeorderscount;

import Cm.e;
import com.squareup.moshi.j;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/account/orders/activeorderscount/ActiveOrdersCountDTO;", "", "activeOrders", "", "allUnread", "<init>", "(II)V", "getActiveOrders", "()I", "getAllUnread", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "cs-orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class ActiveOrdersCountDTO {
    public static final int $stable = 0;
    private final int activeOrders;
    private final int allUnread;

    public ActiveOrdersCountDTO(int i11, int i12) {
        this.activeOrders = i11;
        this.allUnread = i12;
    }

    public static /* synthetic */ ActiveOrdersCountDTO copy$default(ActiveOrdersCountDTO activeOrdersCountDTO, int i11, int i12, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i11 = activeOrdersCountDTO.activeOrders;
        }
        if ((i13 & 2) != 0) {
            i12 = activeOrdersCountDTO.allUnread;
        }
        return activeOrdersCountDTO.copy(i11, i12);
    }

    /* renamed from: component1, reason: from getter */
    public final int getActiveOrders() {
        return this.activeOrders;
    }

    /* renamed from: component2, reason: from getter */
    public final int getAllUnread() {
        return this.allUnread;
    }

    @NotNull
    public final ActiveOrdersCountDTO copy(int activeOrders, int allUnread) {
        return new ActiveOrdersCountDTO(activeOrders, allUnread);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ActiveOrdersCountDTO)) {
            return false;
        }
        ActiveOrdersCountDTO activeOrdersCountDTO = (ActiveOrdersCountDTO) other;
        return this.activeOrders == activeOrdersCountDTO.activeOrders && this.allUnread == activeOrdersCountDTO.allUnread;
    }

    public final int getActiveOrders() {
        return this.activeOrders;
    }

    public final int getAllUnread() {
        return this.allUnread;
    }

    public int hashCode() {
        return Integer.hashCode(this.allUnread) + (Integer.hashCode(this.activeOrders) * 31);
    }

    @NotNull
    public String toString() {
        return e.c("ActiveOrdersCountDTO(activeOrders=", this.activeOrders, ", allUnread=", ")", this.allUnread);
    }
}
