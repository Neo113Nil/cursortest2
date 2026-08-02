package ru.ozon.app.android.checkoutorderdone.orderdone.courierTips.presentation.adapter;

import androidx.recyclerview.widget.i;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.checkoutorderdone.orderdone.courierTips.presentation.CourierTipsVO;
import ru.ozon.app.android.checkoutorderdone.orderdone.courierTips.presentation.adapter.CourierTipsVariantsAdapter;
import ru.ozon.uni.android.wrappers.main.chip.ChipState;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\n\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\tJ!\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/checkoutorderdone/orderdone/courierTips/presentation/adapter/CourierTipsVariantsDiffUtil;", "Landroidx/recyclerview/widget/i$d;", "Lru/ozon/app/android/checkoutorderdone/orderdone/courierTips/presentation/CourierTipsVO$CourierTipsVariant;", "<init>", "()V", "oldItem", "newItem", "", "areItemsTheSame", "(Lru/ozon/app/android/checkoutorderdone/orderdone/courierTips/presentation/CourierTipsVO$CourierTipsVariant;Lru/ozon/app/android/checkoutorderdone/orderdone/courierTips/presentation/CourierTipsVO$CourierTipsVariant;)Z", "areContentsTheSame", "", "getChangePayload", "(Lru/ozon/app/android/checkoutorderdone/orderdone/courierTips/presentation/CourierTipsVO$CourierTipsVariant;Lru/ozon/app/android/checkoutorderdone/orderdone/courierTips/presentation/CourierTipsVO$CourierTipsVariant;)Ljava/lang/Object;", "orderdone_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class CourierTipsVariantsDiffUtil extends i.d<CourierTipsVO.CourierTipsVariant> {
    @Override // androidx.recyclerview.widget.i.d
    public boolean areContentsTheSame(@NotNull CourierTipsVO.CourierTipsVariant oldItem, @NotNull CourierTipsVO.CourierTipsVariant newItem) {
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        Intrinsics.checkNotNullParameter(newItem, "newItem");
        return oldItem.getChip().getState() == newItem.getChip().getState();
    }

    @Override // androidx.recyclerview.widget.i.d
    public boolean areItemsTheSame(@NotNull CourierTipsVO.CourierTipsVariant oldItem, @NotNull CourierTipsVO.CourierTipsVariant newItem) {
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        Intrinsics.checkNotNullParameter(newItem, "newItem");
        return Intrinsics.d(oldItem.getChip().getTitle().getText(), newItem.getChip().getTitle().getText());
    }

    @Override // androidx.recyclerview.widget.i.d
    public Object getChangePayload(@NotNull CourierTipsVO.CourierTipsVariant oldItem, @NotNull CourierTipsVO.CourierTipsVariant newItem) {
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        Intrinsics.checkNotNullParameter(newItem, "newItem");
        return newItem.getChip().getState() == ChipState.SELECTED ? CourierTipsVariantsAdapter.PayloadType.SELECT : CourierTipsVariantsAdapter.PayloadType.UNSELECT;
    }
}
