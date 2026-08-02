package ru.ozon.app.android.checkoutorderdone.orderdone.orderdonebuttonbar.presentation;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.checkoutorderdone.orderdone.orderdonebuttonbar.presentation.OrderDoneButtonBarViewModelImpl;
import ru.ozon.app.android.composer.ComposerNavigator;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.navigation.LinkGenerator;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "action", "Lru/ozon/app/android/checkoutorderdone/orderdone/orderdonebuttonbar/presentation/OrderDoneButtonBarViewModelImpl$Action;", "kotlin.jvm.PlatformType", "invoke", "(Lru/ozon/app/android/checkoutorderdone/orderdone/orderdonebuttonbar/presentation/OrderDoneButtonBarViewModelImpl$Action;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
final class OrderDoneButtonBarWidgetViewHolder$onAttachViewModel$1 extends AbstractC7737t implements Function1<OrderDoneButtonBarViewModelImpl.Action, Unit> {
    final /* synthetic */ OrderDoneButtonBarWidgetViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OrderDoneButtonBarWidgetViewHolder$onAttachViewModel$1(OrderDoneButtonBarWidgetViewHolder orderDoneButtonBarWidgetViewHolder) {
        super(1);
        this.this$0 = orderDoneButtonBarWidgetViewHolder;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(OrderDoneButtonBarViewModelImpl.Action action) {
        invoke2(action);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(OrderDoneButtonBarViewModelImpl.Action action) {
        ComposerReferences composerReferences;
        ComposerReferences composerReferences2;
        Function1 function1;
        if (action instanceof OrderDoneButtonBarViewModelImpl.Action.InvokeAction) {
            function1 = this.this$0.actionHandler;
            function1.invoke(((OrderDoneButtonBarViewModelImpl.Action.InvokeAction) action).getAction());
            return;
        }
        if (action instanceof OrderDoneButtonBarViewModelImpl.Action.OpenCart) {
            String uri = LinkGenerator.INSTANCE.cart().toString();
            Intrinsics.checkNotNullExpressionValue(uri, "toString(...)");
            composerReferences2 = this.this$0.refs;
            ComposerNavigator.DefaultImpls.openDeeplink$default(composerReferences2.getNavigator(), uri, null, 2, null);
            return;
        }
        if (action instanceof OrderDoneButtonBarViewModelImpl.Action.ShowMessage) {
            this.this$0.showMessage(((OrderDoneButtonBarViewModelImpl.Action.ShowMessage) action).getMessage());
            return;
        }
        if (action instanceof OrderDoneButtonBarViewModelImpl.Action.Redirect) {
            String redirectLink = ((OrderDoneButtonBarViewModelImpl.Action.Redirect) action).getRedirectLink();
            if (redirectLink != null) {
                composerReferences = this.this$0.refs;
                ComposerNavigator.DefaultImpls.openDeeplink$default(composerReferences.getNavigator(), redirectLink, null, 2, null);
                return;
            }
            return;
        }
        if (action instanceof OrderDoneButtonBarViewModelImpl.Action.ShowRestrictionMessage) {
            this.this$0.showRestriction(((OrderDoneButtonBarViewModelImpl.Action.ShowRestrictionMessage) action).getRestriction());
        } else if (action instanceof OrderDoneButtonBarViewModelImpl.Action.ShowNotification) {
            this.this$0.showNotification(((OrderDoneButtonBarViewModelImpl.Action.ShowNotification) action).getData());
        }
    }
}
