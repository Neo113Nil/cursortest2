package ru.ozon.app.android.orderdetails.orderTotal.presentation.sticky;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.core.view.C5314e0;
import androidx.core.view.C5316f0;
import d20.AbstractC6064a;
import d20.InterfaceC6068e;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l10.i;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.orderdetails.databinding.WidgetOrderTotalStickyLayoutBinding;
import ru.ozon.app.android.payment.ui.createorder.CreateAndPayViewModel;
import ru.ozon.app.android.utils.PriceUtilsKt;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.v3.containers.SingleAtom;
import ru.ozon.uni.atoms.v3.holders.texts.TextAtomHolderKt;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B%\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R \u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\r0\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/orderdetails/orderTotal/presentation/sticky/OrderTotalStickyWidgetHolder;", "Ld20/a;", "Lru/ozon/app/android/orderdetails/orderTotal/presentation/sticky/OrderTotalStickyVO;", "Lru/ozon/app/android/payment/ui/createorder/CreateAndPayViewModel;", "createAndPayViewModel", "Ll10/i;", "container", "Ld20/e;", "Landroid/widget/LinearLayout;", "viewFactory", "<init>", "(Lru/ozon/app/android/payment/ui/createorder/CreateAndPayViewModel;Ll10/i;Ld20/e;)V", "item", "", "bind", "(Lru/ozon/app/android/orderdetails/orderTotal/presentation/sticky/OrderTotalStickyVO;)V", "Lru/ozon/app/android/payment/ui/createorder/CreateAndPayViewModel;", "Lru/ozon/app/android/orderdetails/databinding/WidgetOrderTotalStickyLayoutBinding;", "binding", "Lru/ozon/app/android/orderdetails/databinding/WidgetOrderTotalStickyLayoutBinding;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "orderdetails_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class OrderTotalStickyWidgetHolder extends AbstractC6064a<OrderTotalStickyVO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final WidgetOrderTotalStickyLayoutBinding binding;

    @NotNull
    private final CreateAndPayViewModel createAndPayViewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OrderTotalStickyWidgetHolder(@NotNull CreateAndPayViewModel createAndPayViewModel, @NotNull i container, @NotNull InterfaceC6068e<LinearLayout> viewFactory) {
        super(container, viewFactory);
        Intrinsics.checkNotNullParameter(createAndPayViewModel, "createAndPayViewModel");
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(viewFactory, "viewFactory");
        this.createAndPayViewModel = createAndPayViewModel;
        WidgetOrderTotalStickyLayoutBinding bind = WidgetOrderTotalStickyLayoutBinding.bind(getView());
        Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
        this.binding = bind;
        Function1<AtomAction, Unit> buildHandler = new ActionHandler.Builder(container, this).onClick(new OrderTotalStickyWidgetHolder$actionHandler$1(this)).buildHandler();
        this.actionHandler = buildHandler;
        bind.orderBtn.setOnAction(buildHandler);
    }

    @Override // d20.AbstractC6065b
    public void bind(@NotNull OrderTotalStickyVO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        WidgetOrderTotalStickyLayoutBinding widgetOrderTotalStickyLayoutBinding = this.binding;
        SingleAtom.bind$default(widgetOrderTotalStickyLayoutBinding.orderBtn, item.getButton(), false, 2, null);
        SingleAtom orderBtn = widgetOrderTotalStickyLayoutBinding.orderBtn;
        Intrinsics.checkNotNullExpressionValue(orderBtn, "orderBtn");
        Iterator<View> it = C5316f0.b(orderBtn).iterator();
        while (true) {
            C5314e0 c5314e0 = (C5314e0) it;
            if (!c5314e0.hasNext()) {
                SingleAtom orderBtn2 = widgetOrderTotalStickyLayoutBinding.orderBtn;
                Intrinsics.checkNotNullExpressionValue(orderBtn2, "orderBtn");
                PriceUtilsKt.fixPriceGravity(orderBtn2);
                TextAtomView stickySubtitleTv = widgetOrderTotalStickyLayoutBinding.stickySubtitleTv;
                Intrinsics.checkNotNullExpressionValue(stickySubtitleTv, "stickySubtitleTv");
                TextAtomHolderKt.bindOrGone$default(stickySubtitleTv, item.getSummary().getSubtitle(), null, 2, null);
                SingleAtom.bind$default(widgetOrderTotalStickyLayoutBinding.stickyTitleTv, item.getSummary().getPrice(), false, 2, null);
                return;
            }
            View view = (View) c5314e0.next();
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
            layoutParams.width = -1;
            view.setLayoutParams(layoutParams);
        }
    }
}
