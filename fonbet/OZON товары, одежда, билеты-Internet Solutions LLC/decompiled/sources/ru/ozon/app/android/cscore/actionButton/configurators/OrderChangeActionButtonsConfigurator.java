package ru.ozon.app.android.cscore.actionButton.configurators;

import Pc.a;
import androidx.fragment.app.r;
import androidx.lifecycle.w0;
import androidx.lifecycle.z0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.account.orders.OrderChangePreferences;
import ru.ozon.app.android.composer.ComposerNavigator;
import ru.ozon.app.android.composer.ConfiguratorReferences;
import ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig;
import ru.ozon.app.android.cscore.actionButton.presentation.ActionButtonViewModel;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u001f\b\u0007\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0014¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0012R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/cscore/actionButton/configurators/OrderChangeActionButtonsConfigurator;", "Lru/ozon/app/android/composer/universalscreen/view/ComposerScreenConfig$PageConfigurator;", "LPc/a;", "Lru/ozon/app/android/cscore/actionButton/presentation/ActionButtonViewModel;", "actionViewModel", "Lru/ozon/app/android/account/orders/OrderChangePreferences;", "orderChangePreferences", "<init>", "(LPc/a;Lru/ozon/app/android/account/orders/OrderChangePreferences;)V", "Landroidx/fragment/app/r;", "activity", "Lru/ozon/app/android/cscore/actionButton/presentation/ActionButtonViewModel$Action;", "action", "", "nextPage", "(Landroidx/fragment/app/r;Lru/ozon/app/android/cscore/actionButton/presentation/ActionButtonViewModel$Action;)V", "onComposerInitialized", "()V", "LPc/a;", "Lru/ozon/app/android/account/orders/OrderChangePreferences;", "csma_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class OrderChangeActionButtonsConfigurator extends ComposerScreenConfig.PageConfigurator {

    @NotNull
    private final a<ActionButtonViewModel> actionViewModel;

    @NotNull
    private final OrderChangePreferences orderChangePreferences;

    public OrderChangeActionButtonsConfigurator(@NotNull a<ActionButtonViewModel> actionViewModel, @NotNull OrderChangePreferences orderChangePreferences) {
        Intrinsics.checkNotNullParameter(actionViewModel, "actionViewModel");
        Intrinsics.checkNotNullParameter(orderChangePreferences, "orderChangePreferences");
        this.actionViewModel = actionViewModel;
        this.orderChangePreferences = orderChangePreferences;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void nextPage(r activity, ActionButtonViewModel.Action action) {
        ConfiguratorReferences references;
        ComposerNavigator navigator;
        this.orderChangePreferences.markAsUpdated();
        activity.onBackPressed();
        String deeplink = action.getDeeplink();
        if (deeplink == null || (references = getReferences()) == null || (navigator = references.getNavigator()) == null) {
            return;
        }
        ComposerNavigator.DefaultImpls.openDeeplink$default(navigator, deeplink, null, 2, null);
    }

    @Override // ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig.PageConfigurator
    protected void onComposerInitialized() {
        ConfiguratorReferences references = getReferences();
        Intrinsics.f(references);
        ActionButtonViewModel actionButtonViewModel = (ActionButtonViewModel) new z0(references.getViewModelOwnerProvider().a(), new z0.c() { // from class: ru.ozon.app.android.cscore.actionButton.configurators.OrderChangeActionButtonsConfigurator$onComposerInitialized$$inlined$createViewModel$1
            @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
            public <T extends w0> T create(Class<T> modelClass) {
                a aVar;
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                aVar = OrderChangeActionButtonsConfigurator.this.actionViewModel;
                ActionButtonViewModel actionButtonViewModel2 = (ActionButtonViewModel) aVar.get();
                Intrinsics.g(actionButtonViewModel2, "null cannot be cast to non-null type T of ru.ozon.app.android.utils.lifecycle.ViewModelExtKt.vmFactory.<no name provided>.create");
                return actionButtonViewModel2;
            }
        }).a(ActionButtonViewModel.class);
        actionButtonViewModel.getLoading().observe(getOwner(), new OrderChangeActionButtonsConfigurator$sam$androidx_lifecycle_Observer$0(new OrderChangeActionButtonsConfigurator$onComposerInitialized$1(this)));
        actionButtonViewModel.getActions().observe(getOwner(), new OrderChangeActionButtonsConfigurator$sam$androidx_lifecycle_Observer$0(new OrderChangeActionButtonsConfigurator$onComposerInitialized$2(this)));
    }
}
