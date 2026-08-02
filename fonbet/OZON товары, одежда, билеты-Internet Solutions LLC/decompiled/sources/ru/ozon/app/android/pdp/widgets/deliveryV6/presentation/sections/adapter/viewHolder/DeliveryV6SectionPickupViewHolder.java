package ru.ozon.app.android.pdp.widgets.deliveryV6.presentation.sections.adapter.viewHolder;

import GD.b;
import android.view.View;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.widgets.deliveryV6.presentation.sections.adapter.DeliveryV6SectionItem;
import ru.ozon.app.android.pdp.widgets.deliveryV6.presentation.sections.adapter.view.DeliveryV6PickupButtonView;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0004\b\b\u0010\tJ\u000e\u0010\u000b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\rR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/pdp/widgets/deliveryV6/presentation/sections/adapter/viewHolder/DeliveryV6SectionPickupViewHolder;", "Lru/ozon/app/android/pdp/widgets/deliveryV6/presentation/sections/adapter/viewHolder/DeliveryV6SectionViewHolder;", "deliveryV6PickupButtonView", "Lru/ozon/app/android/pdp/widgets/deliveryV6/presentation/sections/adapter/view/DeliveryV6PickupButtonView;", "onAction", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "<init>", "(Lru/ozon/app/android/pdp/widgets/deliveryV6/presentation/sections/adapter/view/DeliveryV6PickupButtonView;Lkotlin/jvm/functions/Function1;)V", "action", "bind", "item", "Lru/ozon/app/android/pdp/widgets/deliveryV6/presentation/sections/adapter/DeliveryV6SectionItem$Pickup;", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class DeliveryV6SectionPickupViewHolder extends DeliveryV6SectionViewHolder {
    private AtomAction action;

    @NotNull
    private final DeliveryV6PickupButtonView deliveryV6PickupButtonView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeliveryV6SectionPickupViewHolder(@NotNull DeliveryV6PickupButtonView deliveryV6PickupButtonView, @NotNull Function1<? super AtomAction, Unit> onAction) {
        super(deliveryV6PickupButtonView);
        Intrinsics.checkNotNullParameter(deliveryV6PickupButtonView, "deliveryV6PickupButtonView");
        Intrinsics.checkNotNullParameter(onAction, "onAction");
        this.deliveryV6PickupButtonView = deliveryV6PickupButtonView;
        deliveryV6PickupButtonView.setOnClickListener(new b(0, this, onAction));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$0(DeliveryV6SectionPickupViewHolder deliveryV6SectionPickupViewHolder, Function1 function1, View view) {
        AtomAction atomAction = deliveryV6SectionPickupViewHolder.action;
        if (atomAction != null) {
            function1.invoke(atomAction);
        }
    }

    public final void bind(@NotNull DeliveryV6SectionItem.Pickup item) {
        Intrinsics.checkNotNullParameter(item, "item");
        this.deliveryV6PickupButtonView.bind(item.getPickupButtonVo());
        this.action = item.getAction();
    }
}
