package ru.ozon.app.android.account.orders.cancel.adapter;

import androidx.recyclerview.widget.i;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.account.orders.cancel.presentation.CancelReasonVO;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\n\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\tJ\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/account/orders/cancel/adapter/CancelReasonItemCallback;", "Landroidx/recyclerview/widget/i$d;", "Lru/ozon/app/android/account/orders/cancel/presentation/CancelReasonVO;", "<init>", "()V", "oldItem", "newItem", "", "areItemsTheSame", "(Lru/ozon/app/android/account/orders/cancel/presentation/CancelReasonVO;Lru/ozon/app/android/account/orders/cancel/presentation/CancelReasonVO;)Z", "areContentsTheSame", "", "getChangePayload", "(Lru/ozon/app/android/account/orders/cancel/presentation/CancelReasonVO;Lru/ozon/app/android/account/orders/cancel/presentation/CancelReasonVO;)Ljava/lang/Object;", "cs-orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class CancelReasonItemCallback extends i.d<CancelReasonVO> {
    @Override // androidx.recyclerview.widget.i.d
    public boolean areContentsTheSame(@NotNull CancelReasonVO oldItem, @NotNull CancelReasonVO newItem) {
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        Intrinsics.checkNotNullParameter(newItem, "newItem");
        return Intrinsics.d(oldItem, newItem);
    }

    @Override // androidx.recyclerview.widget.i.d
    public boolean areItemsTheSame(@NotNull CancelReasonVO oldItem, @NotNull CancelReasonVO newItem) {
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        Intrinsics.checkNotNullParameter(newItem, "newItem");
        return ((oldItem instanceof CancelReasonVO.Reason) && (newItem instanceof CancelReasonVO.Reason)) ? Intrinsics.d(((CancelReasonVO.Reason) oldItem).getCell().getAction(), ((CancelReasonVO.Reason) newItem).getCell().getAction()) : oldItem.getClass() == newItem.getClass();
    }

    @Override // androidx.recyclerview.widget.i.d
    @NotNull
    public Object getChangePayload(@NotNull CancelReasonVO oldItem, @NotNull CancelReasonVO newItem) {
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        Intrinsics.checkNotNullParameter(newItem, "newItem");
        return Unit.f71690a;
    }
}
