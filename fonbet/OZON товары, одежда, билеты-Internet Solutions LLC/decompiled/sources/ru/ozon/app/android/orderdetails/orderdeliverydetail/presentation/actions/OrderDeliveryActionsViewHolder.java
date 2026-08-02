package ru.ozon.app.android.orderdetails.orderdeliverydetail.presentation.actions;

import Vg.d;
import android.content.Context;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.orderdetails.databinding.OrderDeliveryDetailActionBinding;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikit.view.atoms.buttons.borderless.LargeBorderlessButtonView;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.v3.holders.buttons.LargeBorderlessButtonHolderKt;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B#\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\u0010\t\u001a\u00060\u0007j\u0002`\b¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\rH\u0014¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0012R \u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u000f0\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/orderdetails/orderdeliverydetail/presentation/actions/OrderDeliveryActionsViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/orderdetails/orderdeliverydetail/presentation/actions/OrderDeliveryDetailActionVO;", "Lru/ozon/app/android/orderdetails/databinding/OrderDeliveryDetailActionBinding;", "binding", "Lru/ozon/app/android/composer/ComposerReferences;", "composerReferences", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "customActionHandlersStoreFactory", "<init>", "(Lru/ozon/app/android/orderdetails/databinding/OrderDeliveryDetailActionBinding;Lru/ozon/app/android/composer/ComposerReferences;LVg/d;)V", "item", "Ll20/d;", "info", "", "bind", "(Lru/ozon/app/android/orderdetails/orderdeliverydetail/presentation/actions/OrderDeliveryDetailActionVO;Ll20/d;)V", "Lru/ozon/app/android/orderdetails/databinding/OrderDeliveryDetailActionBinding;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "orderdetails_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class OrderDeliveryActionsViewHolder extends k<OrderDeliveryDetailActionVO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final OrderDeliveryDetailActionBinding binding;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public OrderDeliveryActionsViewHolder(@NotNull OrderDeliveryDetailActionBinding binding, @NotNull ComposerReferences composerReferences, @NotNull d customActionHandlersStoreFactory) {
        super(r0);
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(composerReferences, "composerReferences");
        Intrinsics.checkNotNullParameter(customActionHandlersStoreFactory, "customActionHandlersStoreFactory");
        LargeBorderlessButtonView constraintLayout = binding.getConstraintLayout();
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
        this.binding = binding;
        this.actionHandler = new ActionHandler.Builder(composerReferences, this).customActionHandlers(new OrderDeliveryActionsViewHolder$actionHandler$1(customActionHandlersStoreFactory)).buildHandler();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull OrderDeliveryDetailActionVO item, @NotNull l20.d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        LargeBorderlessButtonView largeBorderlessButtonView = this.binding.orderDeliveryDetailAction;
        Intrinsics.f(largeBorderlessButtonView);
        LargeBorderlessButtonHolderKt.bind(largeBorderlessButtonView, item.getButton(), this.actionHandler);
        largeBorderlessButtonView.setPadding(largeBorderlessButtonView.getPaddingLeft(), 0, largeBorderlessButtonView.getPaddingRight(), 0);
        largeBorderlessButtonView.setMinimumHeight(-1);
        Context context = largeBorderlessButtonView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        largeBorderlessButtonView.setBackgroundColor(ThemeExtKt.themeColor(context, R$attr.layerFloor1));
    }
}
