package ru.ozon.app.android.cscore.buttonv2.configurators;

import Pc.a;
import a00.C4911f;
import a00.h;
import androidx.lifecycle.B0;
import androidx.lifecycle.P;
import androidx.lifecycle.w0;
import androidx.lifecycle.z0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.account.orders.OrderChangePreferences;
import ru.ozon.app.android.composer.ComposerExtKt;
import ru.ozon.app.android.composer.ComposerNavigator;
import ru.ozon.app.android.composer.ConfiguratorReferences;
import ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig;
import ru.ozon.app.android.cscore.buttonv2.viewmodel.ActionButtonViewModel;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u001f\b\u0007\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0010R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0011¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/cscore/buttonv2/configurators/SingleActionButtonConfigurator;", "Lru/ozon/app/android/composer/universalscreen/view/ComposerScreenConfig$PageConfigurator;", "LPc/a;", "Lru/ozon/app/android/cscore/buttonv2/viewmodel/ActionButtonViewModel;", "actionViewModel", "Lru/ozon/app/android/account/orders/OrderChangePreferences;", "orderChangePreferences", "<init>", "(LPc/a;Lru/ozon/app/android/account/orders/OrderChangePreferences;)V", "Lru/ozon/app/android/cscore/buttonv2/viewmodel/ActionButtonViewModel$Action;", "action", "", "nextPage", "(Lru/ozon/app/android/cscore/buttonv2/viewmodel/ActionButtonViewModel$Action;)V", "onComposerInitialized", "()V", "LPc/a;", "Lru/ozon/app/android/account/orders/OrderChangePreferences;", "csma_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class SingleActionButtonConfigurator extends ComposerScreenConfig.PageConfigurator {

    @NotNull
    private final a<ActionButtonViewModel> actionViewModel;

    @NotNull
    private final OrderChangePreferences orderChangePreferences;

    public SingleActionButtonConfigurator(@NotNull a<ActionButtonViewModel> actionViewModel, @NotNull OrderChangePreferences orderChangePreferences) {
        Intrinsics.checkNotNullParameter(actionViewModel, "actionViewModel");
        Intrinsics.checkNotNullParameter(orderChangePreferences, "orderChangePreferences");
        this.actionViewModel = actionViewModel;
        this.orderChangePreferences = orderChangePreferences;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void nextPage(ActionButtonViewModel.Action action) {
        C4911f ownerContainer;
        ConfiguratorReferences references;
        ComposerNavigator navigator;
        ConfiguratorReferences references2 = getReferences();
        if (references2 == null || (ownerContainer = references2.getOwnerContainer()) == null) {
            return;
        }
        ComposerExtKt.closeFlow(ownerContainer);
        String deeplink = action.getDeeplink();
        if (deeplink == null || (references = getReferences()) == null || (navigator = references.getNavigator()) == null) {
            return;
        }
        ComposerNavigator.DefaultImpls.openDeeplink$default(navigator, deeplink, null, 2, null);
    }

    @Override // ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig.PageConfigurator
    protected void onComposerInitialized() {
        P<ActionButtonViewModel.Action> actions;
        P<Boolean> loading;
        h viewModelOwnerProvider;
        B0 a11;
        ConfiguratorReferences references = getReferences();
        ActionButtonViewModel actionButtonViewModel = (references == null || (viewModelOwnerProvider = references.getViewModelOwnerProvider()) == null || (a11 = viewModelOwnerProvider.a()) == null) ? null : (ActionButtonViewModel) new z0(a11, new z0.c() { // from class: ru.ozon.app.android.cscore.buttonv2.configurators.SingleActionButtonConfigurator$onComposerInitialized$$inlined$createViewModel$1
            @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
            public <T extends w0> T create(Class<T> modelClass) {
                a aVar;
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                aVar = SingleActionButtonConfigurator.this.actionViewModel;
                ActionButtonViewModel actionButtonViewModel2 = (ActionButtonViewModel) aVar.get();
                Intrinsics.g(actionButtonViewModel2, "null cannot be cast to non-null type T of ru.ozon.app.android.utils.lifecycle.ViewModelExtKt.vmFactory.<no name provided>.create");
                return actionButtonViewModel2;
            }
        }).a(ActionButtonViewModel.class);
        if (actionButtonViewModel != null && (loading = actionButtonViewModel.getLoading()) != null) {
            loading.observe(getOwner(), new SingleActionButtonConfigurator$sam$androidx_lifecycle_Observer$0(new SingleActionButtonConfigurator$onComposerInitialized$1(this)));
        }
        if (actionButtonViewModel == null || (actions = actionButtonViewModel.getActions()) == null) {
            return;
        }
        actions.observe(getOwner(), new SingleActionButtonConfigurator$sam$androidx_lifecycle_Observer$0(new SingleActionButtonConfigurator$onComposerInitialized$2(this)));
    }
}
