package ru.ozon.app.android.pdp.ui.configurators.ugc.rateItems;

import B0.C2454a;
import Fm.C3051a;
import G.g;
import Kk.C3532b;
import Lh.a;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.K;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0014\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u000b\u0010\fJJ\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0015\u001a\u00020\u00022\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u001a\u0010\u0019R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\u001e\u001a\u0004\b\u001f\u0010\u0013R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\n\u0010 \u001a\u0004\b!\u0010\"¨\u0006#"}, d2 = {"Lru/ozon/app/android/pdp/ui/configurators/ugc/rateItems/RateItemsState;", "", "", "rateItemsDismissed", "rateItemsExpandedState", "", "", "itemIds", "", "behaviorState", "dismissedAt", "<init>", "(ZZLjava/util/List;ILjava/lang/Long;)V", "copy", "(ZZLjava/util/List;ILjava/lang/Long;)Lru/ozon/app/android/pdp/ui/configurators/ugc/rateItems/RateItemsState;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "getRateItemsDismissed", "()Z", "getRateItemsExpandedState", "Ljava/util/List;", "getItemIds", "()Ljava/util/List;", "I", "getBehaviorState", "Ljava/lang/Long;", "getDismissedAt", "()Ljava/lang/Long;", "configurators_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class RateItemsState {
    private final int behaviorState;
    private final Long dismissedAt;

    @NotNull
    private final List<Long> itemIds;
    private final boolean rateItemsDismissed;
    private final boolean rateItemsExpandedState;

    public RateItemsState() {
        this(false, false, null, 0, null, 31, null);
    }

    public static /* synthetic */ RateItemsState copy$default(RateItemsState rateItemsState, boolean z11, boolean z12, List list, int i11, Long l11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            z11 = rateItemsState.rateItemsDismissed;
        }
        if ((i12 & 2) != 0) {
            z12 = rateItemsState.rateItemsExpandedState;
        }
        if ((i12 & 4) != 0) {
            list = rateItemsState.itemIds;
        }
        if ((i12 & 8) != 0) {
            i11 = rateItemsState.behaviorState;
        }
        if ((i12 & 16) != 0) {
            l11 = rateItemsState.dismissedAt;
        }
        Long l12 = l11;
        List list2 = list;
        return rateItemsState.copy(z11, z12, list2, i11, l12);
    }

    @NotNull
    public final RateItemsState copy(boolean rateItemsDismissed, boolean rateItemsExpandedState, @NotNull List<Long> itemIds, int behaviorState, Long dismissedAt) {
        Intrinsics.checkNotNullParameter(itemIds, "itemIds");
        return new RateItemsState(rateItemsDismissed, rateItemsExpandedState, itemIds, behaviorState, dismissedAt);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RateItemsState)) {
            return false;
        }
        RateItemsState rateItemsState = (RateItemsState) other;
        return this.rateItemsDismissed == rateItemsState.rateItemsDismissed && this.rateItemsExpandedState == rateItemsState.rateItemsExpandedState && Intrinsics.d(this.itemIds, rateItemsState.itemIds) && this.behaviorState == rateItemsState.behaviorState && Intrinsics.d(this.dismissedAt, rateItemsState.dismissedAt);
    }

    public final int getBehaviorState() {
        return this.behaviorState;
    }

    public final Long getDismissedAt() {
        return this.dismissedAt;
    }

    @NotNull
    public final List<Long> getItemIds() {
        return this.itemIds;
    }

    public final boolean getRateItemsDismissed() {
        return this.rateItemsDismissed;
    }

    public final boolean getRateItemsExpandedState() {
        return this.rateItemsExpandedState;
    }

    public int hashCode() {
        int a11 = C2454a.a(this.behaviorState, g.b(C3532b.a(Boolean.hashCode(this.rateItemsDismissed) * 31, 31, this.rateItemsExpandedState), 31, this.itemIds), 31);
        Long l11 = this.dismissedAt;
        return a11 + (l11 == null ? 0 : l11.hashCode());
    }

    @NotNull
    public String toString() {
        boolean z11 = this.rateItemsDismissed;
        boolean z12 = this.rateItemsExpandedState;
        List<Long> list = this.itemIds;
        int i11 = this.behaviorState;
        Long l11 = this.dismissedAt;
        StringBuilder d11 = a.d("RateItemsState(rateItemsDismissed=", ", rateItemsExpandedState=", ", itemIds=", z11, z12);
        d11.append(list);
        d11.append(", behaviorState=");
        d11.append(i11);
        d11.append(", dismissedAt=");
        return C3051a.d(d11, l11, ")");
    }

    public RateItemsState(boolean z11, boolean z12, @NotNull List<Long> itemIds, int i11, Long l11) {
        Intrinsics.checkNotNullParameter(itemIds, "itemIds");
        this.rateItemsDismissed = z11;
        this.rateItemsExpandedState = z12;
        this.itemIds = itemIds;
        this.behaviorState = i11;
        this.dismissedAt = l11;
    }

    public RateItemsState(boolean z11, boolean z12, List list, int i11, Long l11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this((i12 & 1) != 0 ? false : z11, (i12 & 2) != 0 ? false : z12, (i12 & 4) != 0 ? K.f71697a : list, (i12 & 8) != 0 ? 5 : i11, (i12 & 16) != 0 ? null : l11);
    }
}
