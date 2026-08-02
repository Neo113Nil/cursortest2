package ru.ozon.app.android.returns.creation.widgets.methods.presentation.dates.content;

import androidx.recyclerview.widget.i;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.returns.creation.widgets.methods.presentation.dates.DatesElementVO;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\n\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\t¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/returns/creation/widgets/methods/presentation/dates/content/DiffUtilDeliveryDateSlot;", "Landroidx/recyclerview/widget/i$d;", "Lru/ozon/app/android/returns/creation/widgets/methods/presentation/dates/DatesElementVO$DateVO;", "<init>", "()V", "oldItem", "newItem", "", "areItemsTheSame", "(Lru/ozon/app/android/returns/creation/widgets/methods/presentation/dates/DatesElementVO$DateVO;Lru/ozon/app/android/returns/creation/widgets/methods/presentation/dates/DatesElementVO$DateVO;)Z", "areContentsTheSame", "creation_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class DiffUtilDeliveryDateSlot extends i.d<DatesElementVO.DateVO> {
    @Override // androidx.recyclerview.widget.i.d
    public boolean areContentsTheSame(@NotNull DatesElementVO.DateVO oldItem, @NotNull DatesElementVO.DateVO newItem) {
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        Intrinsics.checkNotNullParameter(newItem, "newItem");
        return Intrinsics.d(oldItem, newItem);
    }

    @Override // androidx.recyclerview.widget.i.d
    public boolean areItemsTheSame(@NotNull DatesElementVO.DateVO oldItem, @NotNull DatesElementVO.DateVO newItem) {
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        Intrinsics.checkNotNullParameter(newItem, "newItem");
        return Intrinsics.d(oldItem.getTitle(), newItem.getTitle()) && Intrinsics.d(oldItem.getSubtitle(), newItem.getSubtitle());
    }
}
