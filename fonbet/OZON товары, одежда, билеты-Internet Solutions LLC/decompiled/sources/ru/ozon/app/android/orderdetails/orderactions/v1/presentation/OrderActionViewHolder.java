package ru.ozon.app.android.orderdetails.orderactions.v1.presentation;

import Sc.o;
import Vg.d;
import i10.l;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.U;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.RestrictionsUtilsKt;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.composer.ComposerNavigator;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.delivery.customActionsHandlers.fetchcancelreasons.data.CancelReasonsWithPayloads;
import ru.ozon.app.android.navigation.LinkGenerator;
import ru.ozon.app.android.orderdetails.databinding.WidgetOrderActionItemBinding;
import ru.ozon.app.android.orderdetails.orderactions.v1.presentation.Action;
import ru.ozon.app.android.uikit.R$drawable;
import ru.ozon.app.android.uikit.R$string;
import ru.ozon.app.android.uikit.text.StringProvider;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.uikit.view.atoms.buttons.borderless.LargeBorderlessButtonView;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.v3.holders.buttons.LargeBorderlessButtonHolderKt;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B+\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\n\u0010\u000b\u001a\u00060\tj\u0002`\n¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0014H\u0014¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0018R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0019R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u001aR \u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u00100\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Lru/ozon/app/android/orderdetails/orderactions/v1/presentation/OrderActionViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/orderdetails/orderactions/v1/presentation/OrderActionVO;", "Lru/ozon/app/android/orderdetails/databinding/WidgetOrderActionItemBinding;", "binding", "Lru/ozon/app/android/composer/ComposerReferences;", "composerReferences", "Lru/ozon/app/android/orderdetails/orderactions/v1/presentation/OrderActionsViewModel;", "orderActionsViewModel", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "customActionHandlersStoreFactory", "<init>", "(Lru/ozon/app/android/orderdetails/databinding/WidgetOrderActionItemBinding;Lru/ozon/app/android/composer/ComposerReferences;Lru/ozon/app/android/orderdetails/orderactions/v1/presentation/OrderActionsViewModel;LVg/d;)V", "Lru/ozon/app/android/delivery/customActionsHandlers/fetchcancelreasons/data/CancelReasonsWithPayloads;", "cancelReasons", "", "openCancelReasons", "(Lru/ozon/app/android/delivery/customActionsHandlers/fetchcancelreasons/data/CancelReasonsWithPayloads;)V", "item", "Ll20/d;", "info", "bind", "(Lru/ozon/app/android/orderdetails/orderactions/v1/presentation/OrderActionVO;Ll20/d;)V", "Lru/ozon/app/android/orderdetails/databinding/WidgetOrderActionItemBinding;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/orderdetails/orderactions/v1/presentation/OrderActionsViewModel;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "orderdetails_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class OrderActionViewHolder extends k<OrderActionVO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final WidgetOrderActionItemBinding binding;

    @NotNull
    private final ComposerReferences composerReferences;

    @NotNull
    private final OrderActionsViewModel orderActionsViewModel;

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "it", "Lru/ozon/app/android/orderdetails/orderactions/v1/presentation/Action;", "kotlin.jvm.PlatformType", "invoke", "(Lru/ozon/app/android/orderdetails/orderactions/v1/presentation/Action;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.orderdetails.orderactions.v1.presentation.OrderActionViewHolder$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements Function1<Action, Unit> {
        AnonymousClass1() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Action action) {
            invoke2(action);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(Action action) {
            if (action instanceof Action.ShowLoader) {
                OrderActionViewHolder.this.composerReferences.getController().e(new l.a.C1079a(0L, null, 3));
                return;
            }
            if (action instanceof Action.HideLoader) {
                OrderActionViewHolder.this.composerReferences.getController().hideLoader();
                return;
            }
            if (action instanceof Action.OpenCart) {
                ComposerNavigator navigator = OrderActionViewHolder.this.composerReferences.getNavigator();
                String uri = LinkGenerator.INSTANCE.cart().toString();
                Intrinsics.checkNotNullExpressionValue(uri, "toString(...)");
                ComposerNavigator.DefaultImpls.openDeeplink$default(navigator, uri, null, 2, null);
                return;
            }
            if (action instanceof Action.OpenReasons) {
                OrderActionViewHolder.this.openCancelReasons(((Action.OpenReasons) action).getCancelReasons());
            } else {
                if (!(action instanceof Action.Fail)) {
                    throw new o();
                }
                RestrictionsUtilsKt.showRestriction$default(OrderActionViewHolder.this.composerReferences, StringProvider.getString(R$string.error_common_error_technical_error_title), Integer.valueOf(R$drawable.ic_warning), null, 4, null);
            }
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public OrderActionViewHolder(@NotNull WidgetOrderActionItemBinding binding, @NotNull ComposerReferences composerReferences, @NotNull OrderActionsViewModel orderActionsViewModel, @NotNull d customActionHandlersStoreFactory) {
        super(r0);
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(composerReferences, "composerReferences");
        Intrinsics.checkNotNullParameter(orderActionsViewModel, "orderActionsViewModel");
        Intrinsics.checkNotNullParameter(customActionHandlersStoreFactory, "customActionHandlersStoreFactory");
        LargeBorderlessButtonView constraintLayout = binding.getConstraintLayout();
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
        this.binding = binding;
        this.composerReferences = composerReferences;
        this.orderActionsViewModel = orderActionsViewModel;
        this.actionHandler = new ActionHandler.Builder(composerReferences, this).onClick(new OrderActionViewHolder$actionHandler$1(this)).onComposerAction(new OrderActionViewHolder$actionHandler$2(this)).customActionHandlers(new OrderActionViewHolder$actionHandler$3(customActionHandlersStoreFactory)).configureBottomSheetWrapContent(true).buildHandler();
        orderActionsViewModel.attachTokenizedAnalytics(composerReferences.getTokenizedAnalytics());
        orderActionsViewModel.getActions().observe(composerReferences.getContainer().g(), new OrderActionViewHolder$sam$androidx_lifecycle_Observer$0(new AnonymousClass1()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void openCancelReasons(CancelReasonsWithPayloads cancelReasons) {
        ComposerNavigator navigator = this.composerReferences.getNavigator();
        String uri = LinkGenerator.INSTANCE.cancelReasons().toString();
        Intrinsics.checkNotNullExpressionValue(uri, "toString(...)");
        navigator.openDeeplink(uri, U.j(new Pair("cancelReasons", cancelReasons), new Pair("trackingData", getTrackingData())));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull OrderActionVO item, @NotNull l20.d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        LargeBorderlessButtonView orderActionItem = this.binding.orderActionItem;
        Intrinsics.checkNotNullExpressionValue(orderActionItem, "orderActionItem");
        LargeBorderlessButtonHolderKt.bind(orderActionItem, item.getButton(), this.actionHandler);
        Integer textColor = item.getTextColor();
        if (textColor != null) {
            this.binding.orderActionItem.setTextColor(textColor.intValue());
        }
    }
}
