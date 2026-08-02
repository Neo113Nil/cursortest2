package ru.ozon.app.android.geo.common.configurators;

import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.J;
import i10.h;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import l10.InterfaceC7851b;
import ru.ozon.app.android.cart.common.domain.CartRefreshReason;
import ru.ozon.app.android.cart.common.domain.delegate.CartModeManager;
import ru.ozon.app.android.cart.common.domain.delegate.CartScreenStateHolder;
import ru.ozon.app.android.cart.common.domain.delegate.ResetCartModesReason;
import ru.ozon.app.android.cart.common.presentation.refresh.CartEventsController;
import ru.ozon.app.android.composer.ConfiguratorReferences;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class AddressSelectorRefresherConfigurator$onComposerInitialized$1 extends AbstractC7737t implements Function1<Unit, Unit> {
    final /* synthetic */ AddressSelectorRefresherConfigurator this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AddressSelectorRefresherConfigurator$onComposerInitialized$1(AddressSelectorRefresherConfigurator addressSelectorRefresherConfigurator) {
        super(1);
        this.this$0 = addressSelectorRefresherConfigurator;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Unit unit) {
        invoke2(unit);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(Unit unit) {
        CartModeManager cartModeManager;
        CartScreenStateHolder cartScreenStateHolder;
        InterfaceC7851b controller;
        h.b postProcessingInfo;
        CartEventsController cartEventsController;
        J owner = this.this$0.getOwner();
        final AddressSelectorRefresherConfigurator addressSelectorRefresherConfigurator = this.this$0;
        final AbstractC5434v lifecycle = owner.getLifecycle();
        if (!lifecycle.b().a(AbstractC5434v.b.STARTED)) {
            lifecycle.a(new DefaultLifecycleObserver() { // from class: ru.ozon.app.android.geo.common.configurators.AddressSelectorRefresherConfigurator$onComposerInitialized$1$invoke$$inlined$whenStarted$1
                @Override // androidx.lifecycle.DefaultLifecycleObserver
                public void onDestroy(J owner2) {
                    Intrinsics.checkNotNullParameter(owner2, "owner");
                    AbstractC5434v.this.e(this);
                }

                @Override // androidx.lifecycle.DefaultLifecycleObserver
                public void onStart(J owner2) {
                    CartModeManager cartModeManager2;
                    CartScreenStateHolder cartScreenStateHolder2;
                    InterfaceC7851b controller2;
                    h.b postProcessingInfo2;
                    CartEventsController cartEventsController2;
                    Intrinsics.checkNotNullParameter(owner2, "owner");
                    cartModeManager2 = addressSelectorRefresherConfigurator.cartModeManager;
                    cartModeManager2.resetCartModes(ResetCartModesReason.CHANGE_ADDRESS);
                    cartScreenStateHolder2 = addressSelectorRefresherConfigurator.cartScreenStateHolder;
                    if (cartScreenStateHolder2.isStarted()) {
                        cartEventsController2 = addressSelectorRefresherConfigurator.cartEventController;
                        cartEventsController2.setEvent(CartRefreshReason.AddressChanged.INSTANCE);
                    } else {
                        ConfiguratorReferences references = addressSelectorRefresherConfigurator.getReferences();
                        if (references != null && (controller2 = references.getController()) != null) {
                            postProcessingInfo2 = addressSelectorRefresherConfigurator.getPostProcessingInfo();
                            InterfaceC7851b.a.a(controller2, null, null, null, postProcessingInfo2, 7);
                        }
                    }
                    AbstractC5434v.this.e(this);
                }
            });
            return;
        }
        cartModeManager = addressSelectorRefresherConfigurator.cartModeManager;
        cartModeManager.resetCartModes(ResetCartModesReason.CHANGE_ADDRESS);
        cartScreenStateHolder = addressSelectorRefresherConfigurator.cartScreenStateHolder;
        if (cartScreenStateHolder.isStarted()) {
            cartEventsController = addressSelectorRefresherConfigurator.cartEventController;
            cartEventsController.setEvent(CartRefreshReason.AddressChanged.INSTANCE);
            return;
        }
        ConfiguratorReferences references = addressSelectorRefresherConfigurator.getReferences();
        if (references == null || (controller = references.getController()) == null) {
            return;
        }
        postProcessingInfo = addressSelectorRefresherConfigurator.getPostProcessingInfo();
        InterfaceC7851b.a.a(controller, null, null, null, postProcessingInfo, 7);
    }
}
