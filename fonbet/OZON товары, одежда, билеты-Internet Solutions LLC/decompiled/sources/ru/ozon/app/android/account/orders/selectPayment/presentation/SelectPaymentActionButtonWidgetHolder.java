package ru.ozon.app.android.account.orders.selectPayment.presentation;

import android.widget.LinearLayout;
import d20.AbstractC6064a;
import d20.InterfaceC6068e;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import l10.i;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.cs_orders.databinding.WidgetSelectPaymentActionButtonBinding;
import ru.ozon.app.android.cscore.buttonv2.viewmodel.ActionButtonViewModel;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.v3.containers.SingleAtom;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B%\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R \u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\r0\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/account/orders/selectPayment/presentation/SelectPaymentActionButtonWidgetHolder;", "Ld20/a;", "Lru/ozon/app/android/account/orders/selectPayment/presentation/SelectPaymentActionButtonVO;", "Lru/ozon/app/android/cscore/buttonv2/viewmodel/ActionButtonViewModel;", "viewModel", "Ll10/i;", "container", "Ld20/e;", "Landroid/widget/LinearLayout;", "viewFactory", "<init>", "(Lru/ozon/app/android/cscore/buttonv2/viewmodel/ActionButtonViewModel;Ll10/i;Ld20/e;)V", "item", "", "bind", "(Lru/ozon/app/android/account/orders/selectPayment/presentation/SelectPaymentActionButtonVO;)V", "Lru/ozon/app/android/cs_orders/databinding/WidgetSelectPaymentActionButtonBinding;", "binding", "Lru/ozon/app/android/cs_orders/databinding/WidgetSelectPaymentActionButtonBinding;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "cs-orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class SelectPaymentActionButtonWidgetHolder extends AbstractC6064a<SelectPaymentActionButtonVO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final WidgetSelectPaymentActionButtonBinding binding;

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Boolean;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.account.orders.selectPayment.presentation.SelectPaymentActionButtonWidgetHolder$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements Function1<Boolean, Unit> {
        AnonymousClass1() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
            invoke2(bool);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(Boolean bool) {
            SelectPaymentActionButtonWidgetHolder.this.binding.selectPaymentLbv.setClickable(bool.booleanValue());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelectPaymentActionButtonWidgetHolder(@NotNull ActionButtonViewModel viewModel, @NotNull i container, @NotNull InterfaceC6068e<LinearLayout> viewFactory) {
        super(container, viewFactory);
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(viewFactory, "viewFactory");
        WidgetSelectPaymentActionButtonBinding bind = WidgetSelectPaymentActionButtonBinding.bind(getView());
        Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
        this.binding = bind;
        Function1<AtomAction, Unit> buildHandler = new ActionHandler.Builder(container, this).onComposerAction(new SelectPaymentActionButtonWidgetHolder$actionHandler$1(viewModel)).buildHandler();
        this.actionHandler = buildHandler;
        bind.selectPaymentLbv.setOnAction(buildHandler);
        viewModel.getClickableAction().observe(this, new SelectPaymentActionButtonWidgetHolder$sam$androidx_lifecycle_Observer$0(new AnonymousClass1()));
    }

    @Override // d20.AbstractC6065b
    public void bind(@NotNull SelectPaymentActionButtonVO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        SingleAtom.bind$default(this.binding.selectPaymentLbv, item.getApplyButton(), false, 2, null);
    }
}
