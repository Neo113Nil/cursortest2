package ru.ozon.app.android.orderdetails.ordershipment.orderShipment.presentation.action;

import Vg.c;
import android.content.Context;
import android.view.View;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.orderdetails.databinding.ItemOrderShipmentLayoutActionBinding;
import ru.ozon.app.android.orderdetails.ordershipment.orderShipment.presentation.OrderShipmentItemVO;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikit.view.atoms.buttons.borderless.LargeBorderlessButtonView;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.v3.holders.buttons.LargeBorderlessButtonHolderKt;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B+\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\n\u0010\u000b\u001a\u00060\tj\u0002`\n¢\u0006\u0004\b\f\u0010\rJ\u0013\u0010\u0010\u001a\u00020\u000f*\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0013H\u0014¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0017R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0018R\u0018\u0010\u000b\u001a\u00060\tj\u0002`\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0019R\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR \u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u000f0\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"Lru/ozon/app/android/orderdetails/ordershipment/orderShipment/presentation/action/ActionOrderShipmentWidgetViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/orderdetails/ordershipment/orderShipment/presentation/OrderShipmentItemVO$ShipmentActionsVO;", "Lru/ozon/app/android/orderdetails/databinding/ItemOrderShipmentLayoutActionBinding;", "binding", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "Lru/ozon/app/android/orderdetails/ordershipment/orderShipment/presentation/action/OrderShipmentViewModel;", "orderShipmentViewModel", "LVg/c;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStore;", "customActionHandlersStore", "<init>", "(Lru/ozon/app/android/orderdetails/databinding/ItemOrderShipmentLayoutActionBinding;Lru/ozon/app/android/composer/ComposerReferences;Lru/ozon/app/android/orderdetails/ordershipment/orderShipment/presentation/action/OrderShipmentViewModel;LVg/c;)V", "Landroid/view/View;", "", "changeSize", "(Landroid/view/View;)V", "item", "Ll20/d;", "info", "bind", "(Lru/ozon/app/android/orderdetails/ordershipment/orderShipment/presentation/OrderShipmentItemVO$ShipmentActionsVO;Ll20/d;)V", "Lru/ozon/app/android/orderdetails/databinding/ItemOrderShipmentLayoutActionBinding;", "Lru/ozon/app/android/orderdetails/ordershipment/orderShipment/presentation/action/OrderShipmentViewModel;", "LVg/c;", "", "shipmentActionVerticalPadding", "I", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "orderdetails_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ActionOrderShipmentWidgetViewHolder extends k<OrderShipmentItemVO.ShipmentActionsVO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final ItemOrderShipmentLayoutActionBinding binding;

    @NotNull
    private final c customActionHandlersStore;

    @NotNull
    private final OrderShipmentViewModel orderShipmentViewModel;
    private final int shipmentActionVerticalPadding;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ActionOrderShipmentWidgetViewHolder(@NotNull ItemOrderShipmentLayoutActionBinding binding, @NotNull ComposerReferences refs, @NotNull OrderShipmentViewModel orderShipmentViewModel, @NotNull c customActionHandlersStore) {
        super(r0);
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(refs, "refs");
        Intrinsics.checkNotNullParameter(orderShipmentViewModel, "orderShipmentViewModel");
        Intrinsics.checkNotNullParameter(customActionHandlersStore, "customActionHandlersStore");
        LargeBorderlessButtonView root = binding.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        this.binding = binding;
        this.orderShipmentViewModel = orderShipmentViewModel;
        this.customActionHandlersStore = customActionHandlersStore;
        this.shipmentActionVerticalPadding = ResourceExtKt.toPx(8, getContext());
        this.actionHandler = new ActionHandler.Builder(refs, this).customActionHandlers(new ActionOrderShipmentWidgetViewHolder$actionHandler$1(this)).onClick(new ActionOrderShipmentWidgetViewHolder$actionHandler$2(this)).buildHandler();
    }

    private final void changeSize(View view) {
        view.setPadding(view.getPaddingLeft(), this.shipmentActionVerticalPadding, view.getPaddingRight(), this.shipmentActionVerticalPadding);
        view.setMinimumHeight(-1);
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        view.setBackgroundColor(ThemeExtKt.themeColor(context, R$attr.layerFloor1));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull OrderShipmentItemVO.ShipmentActionsVO item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        ItemOrderShipmentLayoutActionBinding itemOrderShipmentLayoutActionBinding = this.binding;
        LargeBorderlessButtonView orderActionItem = itemOrderShipmentLayoutActionBinding.orderActionItem;
        Intrinsics.checkNotNullExpressionValue(orderActionItem, "orderActionItem");
        LargeBorderlessButtonHolderKt.bind(orderActionItem, item.getButton(), this.actionHandler);
        LargeBorderlessButtonView orderActionItem2 = itemOrderShipmentLayoutActionBinding.orderActionItem;
        Intrinsics.checkNotNullExpressionValue(orderActionItem2, "orderActionItem");
        changeSize(orderActionItem2);
    }
}
