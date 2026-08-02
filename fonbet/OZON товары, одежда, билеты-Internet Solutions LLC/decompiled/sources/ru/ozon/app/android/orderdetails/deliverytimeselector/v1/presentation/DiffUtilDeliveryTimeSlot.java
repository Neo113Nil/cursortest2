package ru.ozon.app.android.orderdetails.deliverytimeselector.v1.presentation;

import androidx.recyclerview.widget.i;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\b\u0001\u0018\u00002\u00020\u0001B#\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0010\u0010\u000fJ\u001f\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0011\u0010\rR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0012R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0012¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/orderdetails/deliverytimeselector/v1/presentation/DiffUtilDeliveryTimeSlot;", "Landroidx/recyclerview/widget/i$b;", "", "Lru/ozon/app/android/orderdetails/deliverytimeselector/v1/presentation/DeliveryTimeSlotVO;", "new", "old", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "", "oldItemPosition", "newItemPosition", "", "areItemsTheSame", "(II)Z", "getOldListSize", "()I", "getNewListSize", "areContentsTheSame", "Ljava/util/List;", "orderdetails_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class DiffUtilDeliveryTimeSlot extends i.b {

    @NotNull
    private final List<DeliveryTimeSlotVO> new;

    @NotNull
    private final List<DeliveryTimeSlotVO> old;

    public DiffUtilDeliveryTimeSlot(@NotNull List<DeliveryTimeSlotVO> list, @NotNull List<DeliveryTimeSlotVO> old) {
        Intrinsics.checkNotNullParameter(list, "new");
        Intrinsics.checkNotNullParameter(old, "old");
        this.new = list;
        this.old = old;
    }

    @Override // androidx.recyclerview.widget.i.b
    public boolean areContentsTheSame(int oldItemPosition, int newItemPosition) {
        return Intrinsics.d(this.old.get(oldItemPosition), this.new.get(newItemPosition));
    }

    @Override // androidx.recyclerview.widget.i.b
    public boolean areItemsTheSame(int oldItemPosition, int newItemPosition) {
        return this.old.get(oldItemPosition) == this.new.get(newItemPosition);
    }

    @Override // androidx.recyclerview.widget.i.b
    public int getNewListSize() {
        return this.new.size();
    }

    @Override // androidx.recyclerview.widget.i.b
    public int getOldListSize() {
        return this.old.size();
    }
}
