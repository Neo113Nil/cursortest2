package ru.ozon.app.android.travel.feature.tours.widgets.orderToursChangeForm.button.presentation;

import android.view.View;
import android.view.ViewGroup;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import l10.i;
import ru.ozon.app.android.travel.feature.tours.widgets.orderToursChangeForm.presentation.OrderToursChangeFormViewModel;
import ru.ozon.uni.android.flashbar.factory.FlashbarFactory;
import ru.ozon.uni.android.uikit.extensions.view.ContextExtKt;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "action", "Lru/ozon/app/android/travel/feature/tours/widgets/orderToursChangeForm/presentation/OrderToursChangeFormViewModel$Action;", "kotlin.jvm.PlatformType", "invoke", "(Lru/ozon/app/android/travel/feature/tours/widgets/orderToursChangeForm/presentation/OrderToursChangeFormViewModel$Action;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
final class OrderToursChangeFormButtonViewHolder$onWidgetCreated$2 extends AbstractC7737t implements Function1<OrderToursChangeFormViewModel.Action, Unit> {
    final /* synthetic */ OrderToursChangeFormButtonViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OrderToursChangeFormButtonViewHolder$onWidgetCreated$2(OrderToursChangeFormButtonViewHolder orderToursChangeFormButtonViewHolder) {
        super(1);
        this.this$0 = orderToursChangeFormButtonViewHolder;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(OrderToursChangeFormViewModel.Action action) {
        invoke2(action);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(OrderToursChangeFormViewModel.Action action) {
        i iVar;
        Function1 function1;
        if (action instanceof OrderToursChangeFormViewModel.Action.ShowButton) {
            Object parent = this.this$0.getView().getParent();
            View view = parent instanceof View ? (View) parent : null;
            if (view != null) {
                view.setVisibility(((OrderToursChangeFormViewModel.Action.ShowButton) action).getIsVisible() ? 0 : 8);
                return;
            }
            return;
        }
        if (action instanceof OrderToursChangeFormViewModel.Action.HandleAction) {
            function1 = this.this$0.actionHandler;
            function1.invoke(((OrderToursChangeFormViewModel.Action.HandleAction) action).getAction());
        } else if (action instanceof OrderToursChangeFormViewModel.Action.Error) {
            iVar = this.this$0.container;
            ViewGroup rootView = ContextExtKt.getRootView(iVar.K().b());
            if (rootView != null) {
                FlashbarFactory.createDefaultError$default(FlashbarFactory.INSTANCE, rootView, null, null, null, null, null, this.this$0, 62, null).show();
            }
        }
    }
}
