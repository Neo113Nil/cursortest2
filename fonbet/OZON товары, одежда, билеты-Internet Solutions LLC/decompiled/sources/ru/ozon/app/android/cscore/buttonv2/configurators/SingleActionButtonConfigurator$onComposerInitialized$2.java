package ru.ozon.app.android.cscore.buttonv2.configurators;

import Sc.o;
import android.view.ViewGroup;
import androidx.fragment.app.r;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import l10.InterfaceC7851b;
import ru.ozon.app.android.account.orders.OrderChangePreferences;
import ru.ozon.app.android.composer.ConfiguratorReferences;
import ru.ozon.app.android.cscore.buttonv2.viewmodel.ActionButtonViewModel;
import ru.ozon.app.android.uikit.R$drawable;
import ru.ozon.uni.android.flashbar.callback.OnDismissListener;
import ru.ozon.uni.android.flashbar.factory.FlashbarFactory;
import ru.ozon.uni.android.flashbar.view.DismissEvent;
import ru.ozon.uni.android.uikit.extensions.view.ContextExtKt;
import ru.ozon.uni.atoms.utils.OzonSpannableStringKt;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "action", "Lru/ozon/app/android/cscore/buttonv2/viewmodel/ActionButtonViewModel$Action;", "kotlin.jvm.PlatformType", "invoke", "(Lru/ozon/app/android/cscore/buttonv2/viewmodel/ActionButtonViewModel$Action;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
final class SingleActionButtonConfigurator$onComposerInitialized$2 extends AbstractC7737t implements Function1<ActionButtonViewModel.Action, Unit> {
    final /* synthetic */ SingleActionButtonConfigurator this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SingleActionButtonConfigurator$onComposerInitialized$2(SingleActionButtonConfigurator singleActionButtonConfigurator) {
        super(1);
        this.this$0 = singleActionButtonConfigurator;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(ActionButtonViewModel.Action action) {
        invoke2(action);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(final ActionButtonViewModel.Action action) {
        InterfaceC7851b controller;
        OrderChangePreferences orderChangePreferences;
        if (!(action instanceof ActionButtonViewModel.Action.Success)) {
            if (!(action instanceof ActionButtonViewModel.Action.Error)) {
                throw new o();
            }
            ViewGroup rootView = ContextExtKt.getRootView(this.this$0.getContainer().i());
            if (rootView != null) {
                FlashbarFactory.createDefaultError$default(FlashbarFactory.INSTANCE, rootView, null, ((ActionButtonViewModel.Action.Error) action).getMessage(), null, null, null, this.this$0.getContainer().g(), 58, null).show();
            }
            ConfiguratorReferences references = this.this$0.getReferences();
            if (references == null || (controller = references.getController()) == null) {
                return;
            }
            controller.hideLoader();
            return;
        }
        orderChangePreferences = this.this$0.orderChangePreferences;
        orderChangePreferences.markAsUpdated();
        r i11 = this.this$0.getContainer().i();
        ActionButtonViewModel.Action.Success success = (ActionButtonViewModel.Action.Success) action;
        if (success.getMessage() == null) {
            this.this$0.nextPage(action);
            return;
        }
        ViewGroup rootView2 = ContextExtKt.getRootView(i11);
        if (rootView2 != null) {
            final SingleActionButtonConfigurator singleActionButtonConfigurator = this.this$0;
            FlashbarFactory.create$default(FlashbarFactory.INSTANCE, rootView2, null, OzonSpannableStringKt.toOzonSpannableString(success.getMessage()), null, null, Integer.valueOf(R$drawable.ic_check_green), null, null, null, null, null, null, null, 3000L, null, new OnDismissListener() { // from class: ru.ozon.app.android.cscore.buttonv2.configurators.SingleActionButtonConfigurator$onComposerInitialized$2$1$1
                @Override // ru.ozon.uni.android.flashbar.callback.OnDismissListener
                public void onDismissProgress(float f7) {
                    OnDismissListener.DefaultImpls.onDismissProgress(this, f7);
                }

                @Override // ru.ozon.uni.android.flashbar.callback.OnDismissListener
                public void onDismissed(DismissEvent event) {
                    Intrinsics.checkNotNullParameter(event, "event");
                    SingleActionButtonConfigurator.this.nextPage(action);
                }

                @Override // ru.ozon.uni.android.flashbar.callback.OnDismissListener
                public void onDismissing(boolean z11) {
                    OnDismissListener.DefaultImpls.onDismissing(this, z11);
                }
            }, singleActionButtonConfigurator.getContainer().g(), 24538, null).show();
        }
    }
}
