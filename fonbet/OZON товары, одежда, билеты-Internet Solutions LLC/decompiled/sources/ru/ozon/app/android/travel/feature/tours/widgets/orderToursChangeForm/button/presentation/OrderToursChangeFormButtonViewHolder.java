package ru.ozon.app.android.travel.feature.tours.widgets.orderToursChangeForm.button.presentation;

import android.view.View;
import android.widget.LinearLayout;
import d20.AbstractC6064a;
import d20.InterfaceC6068e;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l10.i;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.travel.feature.tours.widgets.orderToursChangeForm.presentation.OrderToursChangeFormViewModel;
import ru.ozon.uni.android.uikit.view.atoms.buttons.usual.LargeButtonView;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.v3.holders.buttons.LargeButtonHolderKt;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B%\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0012R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0013R \u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\f0\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u001b\u001a\u0004\u0018\u00010\u00188BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/travel/feature/tours/widgets/orderToursChangeForm/button/presentation/OrderToursChangeFormButtonViewHolder;", "Ld20/a;", "Lru/ozon/app/android/travel/feature/tours/widgets/orderToursChangeForm/button/presentation/OrderToursChangeFormButtonVO;", "Ll10/i;", "container", "Lru/ozon/app/android/travel/feature/tours/widgets/orderToursChangeForm/presentation/OrderToursChangeFormViewModel;", "viewModel", "Ld20/e;", "Landroid/widget/LinearLayout;", "viewFactory", "<init>", "(Ll10/i;Lru/ozon/app/android/travel/feature/tours/widgets/orderToursChangeForm/presentation/OrderToursChangeFormViewModel;Ld20/e;)V", "", "onWidgetCreated", "()V", "item", "bind", "(Lru/ozon/app/android/travel/feature/tours/widgets/orderToursChangeForm/button/presentation/OrderToursChangeFormButtonVO;)V", "Ll10/i;", "Lru/ozon/app/android/travel/feature/tours/widgets/orderToursChangeForm/presentation/OrderToursChangeFormViewModel;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "Lru/ozon/uni/android/uikit/view/atoms/buttons/usual/LargeButtonView;", "getLargeButtonView", "()Lru/ozon/uni/android/uikit/view/atoms/buttons/usual/LargeButtonView;", "largeButtonView", "tours_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class OrderToursChangeFormButtonViewHolder extends AbstractC6064a<OrderToursChangeFormButtonVO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final i container;

    @NotNull
    private final OrderToursChangeFormViewModel viewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OrderToursChangeFormButtonViewHolder(@NotNull i container, @NotNull OrderToursChangeFormViewModel viewModel, @NotNull InterfaceC6068e<LinearLayout> viewFactory) {
        super(container, viewFactory);
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(viewFactory, "viewFactory");
        this.container = container;
        this.viewModel = viewModel;
        this.actionHandler = new ActionHandler.Builder(container, this).onComposerAction(new OrderToursChangeFormButtonViewHolder$actionHandler$1(this)).buildHandler();
    }

    private final LargeButtonView getLargeButtonView() {
        View view = getView();
        if (view instanceof LargeButtonView) {
            return (LargeButtonView) view;
        }
        return null;
    }

    @Override // d20.AbstractC6065b
    public void onWidgetCreated() {
        this.viewModel.progressLiveData().observe(this, new OrderToursChangeFormButtonViewHolder$sam$androidx_lifecycle_Observer$0(new OrderToursChangeFormButtonViewHolder$onWidgetCreated$1(this)));
        this.viewModel.actionLiveData().observe(this, new OrderToursChangeFormButtonViewHolder$sam$androidx_lifecycle_Observer$0(new OrderToursChangeFormButtonViewHolder$onWidgetCreated$2(this)));
    }

    @Override // d20.AbstractC6065b
    public void bind(@NotNull OrderToursChangeFormButtonVO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        LargeButtonView largeButtonView = getLargeButtonView();
        if (largeButtonView != null) {
            LargeButtonHolderKt.bind(largeButtonView, item.getSubmitButton(), this.actionHandler);
        }
    }
}
