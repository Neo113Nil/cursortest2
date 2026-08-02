package ru.ozon.app.android.orderdetails.deliverytimeselector.v2.configurator;

import Sc.o;
import android.view.ViewGroup;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.fragment.app.r;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import l10.InterfaceC7851b;
import ru.ozon.app.android.composer.ConfiguratorReferences;
import ru.ozon.app.android.orderdetails.deliverytimeselector.v2.presentation.button.ConfirmDateButtonViewModel;
import ru.ozon.app.android.uikit.R$drawable;
import ru.ozon.uni.android.flashbar.callback.OnDismissListener;
import ru.ozon.uni.android.flashbar.factory.FlashbarFactory;
import ru.ozon.uni.android.flashbar.view.DismissEvent;
import ru.ozon.uni.android.uikit.extensions.view.ContextExtKt;
import ru.ozon.uni.atoms.utils.OzonSpannableStringKt;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "action", "Lru/ozon/app/android/orderdetails/deliverytimeselector/v2/presentation/button/ConfirmDateButtonViewModel$State;", "kotlin.jvm.PlatformType", "invoke", "(Lru/ozon/app/android/orderdetails/deliverytimeselector/v2/presentation/button/ConfirmDateButtonViewModel$State;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class ConfirmDeliveryDateActionButtonsConfigurator$onComposerInitialized$2 extends AbstractC7737t implements Function1<ConfirmDateButtonViewModel.State, Unit> {
    final /* synthetic */ ConfirmDeliveryDateActionButtonsConfigurator this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ConfirmDeliveryDateActionButtonsConfigurator$onComposerInitialized$2(ConfirmDeliveryDateActionButtonsConfigurator confirmDeliveryDateActionButtonsConfigurator) {
        super(1);
        this.this$0 = confirmDeliveryDateActionButtonsConfigurator;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(ConfirmDateButtonViewModel.State state) {
        invoke2(state);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(ConfirmDateButtonViewModel.State state) {
        InterfaceC7851b controller;
        if (state instanceof ConfirmDateButtonViewModel.State.Success) {
            final r i11 = this.this$0.getContainer().i();
            ComponentCallbacksC5392m j11 = this.this$0.getContainer().j();
            ConfirmDateButtonViewModel.State.Success success = (ConfirmDateButtonViewModel.State.Success) state;
            if (success.getMessage() == null) {
                this.this$0.nextPage(i11);
                return;
            }
            ViewGroup rootView = ContextExtKt.getRootView(j11);
            if (rootView != null) {
                final ConfirmDeliveryDateActionButtonsConfigurator confirmDeliveryDateActionButtonsConfigurator = this.this$0;
                FlashbarFactory.create$default(FlashbarFactory.INSTANCE, rootView, null, OzonSpannableStringKt.toOzonSpannableString(success.getMessage()), null, null, Integer.valueOf(R$drawable.ic_check_green), null, null, null, null, null, null, null, 3000L, null, new OnDismissListener() { // from class: ru.ozon.app.android.orderdetails.deliverytimeselector.v2.configurator.ConfirmDeliveryDateActionButtonsConfigurator$onComposerInitialized$2$1$1
                    @Override // ru.ozon.uni.android.flashbar.callback.OnDismissListener
                    public void onDismissProgress(float f7) {
                        OnDismissListener.DefaultImpls.onDismissProgress(this, f7);
                    }

                    @Override // ru.ozon.uni.android.flashbar.callback.OnDismissListener
                    public void onDismissed(DismissEvent event) {
                        Intrinsics.checkNotNullParameter(event, "event");
                        ConfirmDeliveryDateActionButtonsConfigurator.this.nextPage(i11);
                    }

                    @Override // ru.ozon.uni.android.flashbar.callback.OnDismissListener
                    public void onDismissing(boolean z11) {
                        OnDismissListener.DefaultImpls.onDismissing(this, z11);
                    }
                }, confirmDeliveryDateActionButtonsConfigurator.getContainer().g(), 24538, null).show();
                return;
            }
            return;
        }
        if (!(state instanceof ConfirmDateButtonViewModel.State.Error)) {
            throw new o();
        }
        ViewGroup rootView2 = ContextExtKt.getRootView(this.this$0.getContainer().j());
        if (rootView2 != null) {
            ConfirmDeliveryDateActionButtonsConfigurator confirmDeliveryDateActionButtonsConfigurator2 = this.this$0;
            FlashbarFactory flashbarFactory = FlashbarFactory.INSTANCE;
            String message = ((ConfirmDateButtonViewModel.State.Error) state).getMessage();
            if (message == null) {
                message = "";
            }
            FlashbarFactory.create$default(flashbarFactory, rootView2, null, OzonSpannableStringKt.toOzonSpannableString(message), null, null, Integer.valueOf(R$drawable.ic_danger_red), null, null, null, null, null, null, null, 3000L, null, null, confirmDeliveryDateActionButtonsConfigurator2.getContainer().g(), 57306, null).show();
        }
        ConfiguratorReferences references = this.this$0.getReferences();
        if (references == null || (controller = references.getController()) == null) {
            return;
        }
        controller.hideLoader();
    }
}
