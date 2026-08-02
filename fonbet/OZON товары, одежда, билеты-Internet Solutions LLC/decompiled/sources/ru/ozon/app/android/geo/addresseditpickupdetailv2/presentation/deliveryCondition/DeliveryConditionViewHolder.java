package ru.ozon.app.android.geo.addresseditpickupdetailv2.presentation.deliveryCondition;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.geo.addresseditpickupdetailv2.presentation.AddressEditPickUpDetailVO;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000b¨\u0006\f"}, d2 = {"Lru/ozon/app/android/geo/addresseditpickupdetailv2/presentation/deliveryCondition/DeliveryConditionViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$C;", "Lru/ozon/app/android/geo/addresseditpickupdetailv2/presentation/deliveryCondition/DeliveryConditionView;", "deliveryConditionView", "<init>", "(Lru/ozon/app/android/geo/addresseditpickupdetailv2/presentation/deliveryCondition/DeliveryConditionView;)V", "Lru/ozon/app/android/geo/addresseditpickupdetailv2/presentation/AddressEditPickUpDetailVO$DeliveryCondition;", "deliveryCondition", "", "bind", "(Lru/ozon/app/android/geo/addresseditpickupdetailv2/presentation/AddressEditPickUpDetailVO$DeliveryCondition;)V", "Lru/ozon/app/android/geo/addresseditpickupdetailv2/presentation/deliveryCondition/DeliveryConditionView;", "geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class DeliveryConditionViewHolder extends RecyclerView.C {

    @NotNull
    private final DeliveryConditionView deliveryConditionView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeliveryConditionViewHolder(@NotNull DeliveryConditionView deliveryConditionView) {
        super(deliveryConditionView);
        Intrinsics.checkNotNullParameter(deliveryConditionView, "deliveryConditionView");
        this.deliveryConditionView = deliveryConditionView;
    }

    public final void bind(@NotNull AddressEditPickUpDetailVO.DeliveryCondition deliveryCondition) {
        Intrinsics.checkNotNullParameter(deliveryCondition, "deliveryCondition");
        this.deliveryConditionView.bind(deliveryCondition);
    }
}
