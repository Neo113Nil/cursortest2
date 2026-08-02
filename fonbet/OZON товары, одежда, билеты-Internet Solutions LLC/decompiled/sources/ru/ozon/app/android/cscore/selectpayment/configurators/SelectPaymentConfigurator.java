package ru.ozon.app.android.cscore.selectpayment.configurators;

import GZ.g;
import Pc.a;
import a00.C4911f;
import android.content.Intent;
import android.view.ViewGroup;
import androidx.fragment.app.r;
import androidx.lifecycle.B0;
import androidx.lifecycle.P;
import androidx.lifecycle.V;
import androidx.lifecycle.w0;
import androidx.lifecycle.z0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import l10.InterfaceC7851b;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.account.orders.OrderChangePreferences;
import ru.ozon.app.android.composer.ComposerExtKt;
import ru.ozon.app.android.composer.ComposerNavigator;
import ru.ozon.app.android.composer.ConfiguratorReferences;
import ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig;
import ru.ozon.app.android.cscore.buttonv2.viewmodel.ActionButtonViewModel;
import ru.ozon.app.android.csma.R$string;
import ru.ozon.app.android.delivery.customActionsHandlers.addcard.SelectPaymentViewModel;
import ru.ozon.app.android.uikit.R$drawable;
import ru.ozon.uni.android.flashbar.factory.FlashbarFactory;
import ru.ozon.uni.android.uikit.extensions.view.ContextExtKt;
import ru.ozon.uni.atoms.utils.OzonSpannableStringKt;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u0000 *2\u00020\u0001:\u0001*B5\b\u0007\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ+\u0010\u0013\u001a\u00020\u00122\b\b\u0001\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\b\b\u0001\u0010\u0011\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ)\u0010!\u001a\u00020\u00122\u0006\u0010\u001d\u001a\u00020\r2\u0006\u0010\u001e\u001a\u00020\r2\b\u0010 \u001a\u0004\u0018\u00010\u001fH\u0016¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u0012H\u0014¢\u0006\u0004\b#\u0010$R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010%R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010%R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010&R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010'R\u0018\u0010(\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)¨\u0006+"}, d2 = {"Lru/ozon/app/android/cscore/selectpayment/configurators/SelectPaymentConfigurator;", "Lru/ozon/app/android/composer/universalscreen/view/ComposerScreenConfig$PageConfigurator;", "LPc/a;", "Lru/ozon/app/android/cscore/buttonv2/viewmodel/ActionButtonViewModel;", "actionViewModel", "Lru/ozon/app/android/delivery/customActionsHandlers/addcard/SelectPaymentViewModel;", "pSelectPaymentViewModel", "Lru/ozon/app/android/account/orders/OrderChangePreferences;", "orderChangePreferences", "LGZ/g;", "ozonRouter", "<init>", "(LPc/a;LPc/a;Lru/ozon/app/android/account/orders/OrderChangePreferences;LGZ/g;)V", "", "iconRes", "Lru/ozon/uni/core/UniColors;", "iconTint", "textRes", "", "showFlashBar", "(ILru/ozon/uni/core/UniColors;I)V", "", "message", "handleError", "(Ljava/lang/String;)V", "Lru/ozon/app/android/cscore/buttonv2/viewmodel/ActionButtonViewModel$Action;", "action", "nextPage", "(Lru/ozon/app/android/cscore/buttonv2/viewmodel/ActionButtonViewModel$Action;)V", "requestCode", "resultCode", "Landroid/content/Intent;", "data", "onActivityResult", "(IILandroid/content/Intent;)V", "onComposerInitialized", "()V", "LPc/a;", "Lru/ozon/app/android/account/orders/OrderChangePreferences;", "LGZ/g;", "successRefreshDeeplink", "Ljava/lang/String;", "Companion", "csma_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class SelectPaymentConfigurator extends ComposerScreenConfig.PageConfigurator {

    @NotNull
    private final a<ActionButtonViewModel> actionViewModel;

    @NotNull
    private final OrderChangePreferences orderChangePreferences;

    @NotNull
    private final g ozonRouter;

    @NotNull
    private final a<SelectPaymentViewModel> pSelectPaymentViewModel;
    private String successRefreshDeeplink;
    public static final int $stable = 8;

    public SelectPaymentConfigurator(@NotNull a<ActionButtonViewModel> actionViewModel, @NotNull a<SelectPaymentViewModel> pSelectPaymentViewModel, @NotNull OrderChangePreferences orderChangePreferences, @NotNull g ozonRouter) {
        Intrinsics.checkNotNullParameter(actionViewModel, "actionViewModel");
        Intrinsics.checkNotNullParameter(pSelectPaymentViewModel, "pSelectPaymentViewModel");
        Intrinsics.checkNotNullParameter(orderChangePreferences, "orderChangePreferences");
        Intrinsics.checkNotNullParameter(ozonRouter, "ozonRouter");
        this.actionViewModel = actionViewModel;
        this.pSelectPaymentViewModel = pSelectPaymentViewModel;
        this.orderChangePreferences = orderChangePreferences;
        this.ozonRouter = ozonRouter;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleError(String message) {
        ViewGroup rootView = ContextExtKt.getRootView(getContainer().i());
        if (rootView != null) {
            FlashbarFactory.createDefaultError$default(FlashbarFactory.INSTANCE, rootView, null, message, null, null, null, getContainer().g(), 58, null).show();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void nextPage(ActionButtonViewModel.Action action) {
        ComposerNavigator navigator;
        C4911f ownerContainer;
        this.orderChangePreferences.markAsUpdated();
        ConfiguratorReferences references = getReferences();
        if (references != null && (ownerContainer = references.getOwnerContainer()) != null) {
            ComposerExtKt.setResultWithTargetRequestCode$default(ownerContainer, null, 0, new SelectPaymentConfigurator$nextPage$1(action), 3, null);
        }
        ConfiguratorReferences references2 = getReferences();
        if (references2 == null || (navigator = references2.getNavigator()) == null) {
            return;
        }
        navigator.popBackStack();
    }

    private final void showFlashBar(int iconRes, UniColors iconTint, int textRes) {
        C4911f ownerContainer;
        r a11;
        ViewGroup rootView;
        ConfiguratorReferences references = getReferences();
        if (references == null || (ownerContainer = references.getOwnerContainer()) == null || (a11 = ownerContainer.a()) == null || (rootView = ContextExtKt.getRootView(a11)) == null) {
            return;
        }
        FlashbarFactory flashbarFactory = FlashbarFactory.INSTANCE;
        String token = iconTint.getToken();
        String string = a11.getString(textRes);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        FlashbarFactory.create$default(flashbarFactory, rootView, null, OzonSpannableStringKt.toOzonSpannableString(string), null, null, Integer.valueOf(iconRes), null, token, null, null, null, null, null, 3000L, null, null, getContainer().g(), 57178, null).show();
    }

    @Override // ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig.PageConfigurator
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        InterfaceC7851b controller;
        String stringExtra = data != null ? data.getStringExtra("PAYMENT_RESULT_DEEPLINK") : null;
        if (requestCode != 884 || stringExtra == null) {
            super.onActivityResult(requestCode, resultCode, data);
            return;
        }
        if (!h.e0(stringExtra, "ozon://addusercard/success", false)) {
            if (h.e0(stringExtra, "ozon://addusercard/failure", false)) {
                showFlashBar(R$drawable.ic_warning, UniColors.GRAPHIC_WARNING_PRIMARY, R$string.error_cscore_card_add);
                return;
            } else {
                showFlashBar(R$drawable.ic_warning, UniColors.GRAPHIC_WARNING_PRIMARY, ru.ozon.app.android.platform.R$string.common_universal_network_error);
                return;
            }
        }
        ConfiguratorReferences references = getReferences();
        if (references != null && (controller = references.getController()) != null) {
            InterfaceC7851b.a.a(controller, this.successRefreshDeeplink, null, null, null, 14);
        }
        showFlashBar(R$drawable.ic_check_green, UniColors.GRAPHIC_POSITIVE_PRIMARY, R$string.cscore_card_add_successful);
    }

    @Override // ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig.PageConfigurator
    protected void onComposerInitialized() {
        V<SelectPaymentViewModel.Action> singleAction;
        a00.h viewModelOwnerProvider;
        B0 a11;
        P<ActionButtonViewModel.Action> actions;
        P<Boolean> loading;
        a00.h viewModelOwnerProvider2;
        B0 a12;
        ConfiguratorReferences references = getReferences();
        SelectPaymentViewModel selectPaymentViewModel = null;
        ActionButtonViewModel actionButtonViewModel = (references == null || (viewModelOwnerProvider2 = references.getViewModelOwnerProvider()) == null || (a12 = viewModelOwnerProvider2.a()) == null) ? null : (ActionButtonViewModel) new z0(a12, new z0.c() { // from class: ru.ozon.app.android.cscore.selectpayment.configurators.SelectPaymentConfigurator$onComposerInitialized$$inlined$createViewModel$1
            @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
            public <T extends w0> T create(Class<T> modelClass) {
                a aVar;
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                aVar = SelectPaymentConfigurator.this.actionViewModel;
                ActionButtonViewModel actionButtonViewModel2 = (ActionButtonViewModel) aVar.get();
                Intrinsics.g(actionButtonViewModel2, "null cannot be cast to non-null type T of ru.ozon.app.android.utils.lifecycle.ViewModelExtKt.vmFactory.<no name provided>.create");
                return actionButtonViewModel2;
            }
        }).a(ActionButtonViewModel.class);
        if (actionButtonViewModel != null && (loading = actionButtonViewModel.getLoading()) != null) {
            loading.observe(getOwner(), new SelectPaymentConfigurator$sam$androidx_lifecycle_Observer$0(new SelectPaymentConfigurator$onComposerInitialized$1(this)));
        }
        if (actionButtonViewModel != null && (actions = actionButtonViewModel.getActions()) != null) {
            actions.observe(getOwner(), new SelectPaymentConfigurator$sam$androidx_lifecycle_Observer$0(new SelectPaymentConfigurator$onComposerInitialized$2(this)));
        }
        ConfiguratorReferences references2 = getReferences();
        if (references2 != null && (viewModelOwnerProvider = references2.getViewModelOwnerProvider()) != null && (a11 = viewModelOwnerProvider.a()) != null) {
            selectPaymentViewModel = (SelectPaymentViewModel) new z0(a11, new z0.c() { // from class: ru.ozon.app.android.cscore.selectpayment.configurators.SelectPaymentConfigurator$onComposerInitialized$$inlined$createViewModel$2
                @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
                public <T extends w0> T create(Class<T> modelClass) {
                    a aVar;
                    Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                    aVar = SelectPaymentConfigurator.this.pSelectPaymentViewModel;
                    SelectPaymentViewModel selectPaymentViewModel2 = (SelectPaymentViewModel) aVar.get();
                    Intrinsics.g(selectPaymentViewModel2, "null cannot be cast to non-null type T of ru.ozon.app.android.utils.lifecycle.ViewModelExtKt.vmFactory.<no name provided>.create");
                    return selectPaymentViewModel2;
                }
            }).a(SelectPaymentViewModel.class);
        }
        if (selectPaymentViewModel == null || (singleAction = selectPaymentViewModel.getSingleAction()) == null) {
            return;
        }
        singleAction.observe(getOwner(), new SelectPaymentConfigurator$sam$androidx_lifecycle_Observer$0(new SelectPaymentConfigurator$onComposerInitialized$3(this)));
    }
}
