package ru.ozon.app.android.pdp.widgets.deliveryV6.presentation.sections.adapter.viewHolder;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.widgets.deliveryV6.presentation.sections.adapter.DeliveryV6SectionItem;
import ru.ozon.app.android.pdp.widgets.deliveryV6.presentation.sections.adapter.view.DeliveryV6SectionHeaderView;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lru/ozon/app/android/pdp/widgets/deliveryV6/presentation/sections/adapter/viewHolder/DeliveryV6SectionHeaderViewHolder;", "Lru/ozon/app/android/pdp/widgets/deliveryV6/presentation/sections/adapter/viewHolder/DeliveryV6SectionViewHolder;", "deliveryV6SectionHeaderView", "Lru/ozon/app/android/pdp/widgets/deliveryV6/presentation/sections/adapter/view/DeliveryV6SectionHeaderView;", "<init>", "(Lru/ozon/app/android/pdp/widgets/deliveryV6/presentation/sections/adapter/view/DeliveryV6SectionHeaderView;)V", "bind", "", "item", "Lru/ozon/app/android/pdp/widgets/deliveryV6/presentation/sections/adapter/DeliveryV6SectionItem$SectionHeader;", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class DeliveryV6SectionHeaderViewHolder extends DeliveryV6SectionViewHolder {

    @NotNull
    private final DeliveryV6SectionHeaderView deliveryV6SectionHeaderView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeliveryV6SectionHeaderViewHolder(@NotNull DeliveryV6SectionHeaderView deliveryV6SectionHeaderView) {
        super(deliveryV6SectionHeaderView);
        Intrinsics.checkNotNullParameter(deliveryV6SectionHeaderView, "deliveryV6SectionHeaderView");
        this.deliveryV6SectionHeaderView = deliveryV6SectionHeaderView;
    }

    public final void bind(@NotNull DeliveryV6SectionItem.SectionHeader item) {
        Intrinsics.checkNotNullParameter(item, "item");
        this.deliveryV6SectionHeaderView.bind(item);
    }
}
