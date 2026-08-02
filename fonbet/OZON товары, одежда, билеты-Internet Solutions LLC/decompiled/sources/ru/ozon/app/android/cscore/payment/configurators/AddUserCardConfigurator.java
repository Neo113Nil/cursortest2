package ru.ozon.app.android.cscore.payment.configurators;

import GZ.g;
import Pc.a;
import Sc.o;
import XV.f;
import a00.C4911f;
import android.content.Intent;
import android.view.ViewGroup;
import androidx.fragment.app.r;
import androidx.lifecycle.B0;
import androidx.lifecycle.V;
import androidx.lifecycle.w0;
import androidx.lifecycle.z0;
import i10.l;
import kotlin.Metadata;
import kotlin.collections.U;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import l10.InterfaceC7851b;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.checkout.prefetch.CheckoutPrefetchController;
import ru.ozon.app.android.composer.ConfiguratorReferences;
import ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig;
import ru.ozon.app.android.csma.R$string;
import ru.ozon.app.android.delivery.customActionsHandlers.addcard.SelectPaymentViewModel;
import ru.ozon.app.android.uikit.R$drawable;
import ru.ozon.uni.android.flashbar.factory.FlashbarFactory;
import ru.ozon.uni.android.uikit.extensions.view.ContextExtKt;
import ru.ozon.uni.atoms.utils.OzonSpannableStringKt;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u0000  2\u00020\u0001:\u0001 B'\b\u0007\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ#\u0010\u000f\u001a\u00020\u000e2\b\b\u0001\u0010\f\u001a\u00020\u000b2\b\b\u0001\u0010\r\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J)\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u000b2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u000eH\u0014¢\u0006\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u001dR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u001eR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u001f¨\u0006!"}, d2 = {"Lru/ozon/app/android/cscore/payment/configurators/AddUserCardConfigurator;", "Lru/ozon/app/android/composer/universalscreen/view/ComposerScreenConfig$PageConfigurator;", "LPc/a;", "Lru/ozon/app/android/delivery/customActionsHandlers/addcard/SelectPaymentViewModel;", "pSelectPaymentViewModel", "LGZ/g;", "ozonRouter", "Lru/ozon/app/android/checkout/prefetch/CheckoutPrefetchController;", "checkoutPrefetchController", "<init>", "(LPc/a;LGZ/g;Lru/ozon/app/android/checkout/prefetch/CheckoutPrefetchController;)V", "", "iconRes", "textRes", "", "showFlashBar", "(II)V", "", "message", "handleError", "(Ljava/lang/String;)V", "requestCode", "resultCode", "Landroid/content/Intent;", "data", "onActivityResult", "(IILandroid/content/Intent;)V", "onComposerInitialized", "()V", "LPc/a;", "LGZ/g;", "Lru/ozon/app/android/checkout/prefetch/CheckoutPrefetchController;", "Companion", "csma_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AddUserCardConfigurator extends ComposerScreenConfig.PageConfigurator {

    @NotNull
    private final CheckoutPrefetchController checkoutPrefetchController;

    @NotNull
    private final g ozonRouter;

    @NotNull
    private final a<SelectPaymentViewModel> pSelectPaymentViewModel;
    public static final int $stable = 8;

    public AddUserCardConfigurator(@NotNull a<SelectPaymentViewModel> pSelectPaymentViewModel, @NotNull g ozonRouter, @NotNull CheckoutPrefetchController checkoutPrefetchController) {
        Intrinsics.checkNotNullParameter(pSelectPaymentViewModel, "pSelectPaymentViewModel");
        Intrinsics.checkNotNullParameter(ozonRouter, "ozonRouter");
        Intrinsics.checkNotNullParameter(checkoutPrefetchController, "checkoutPrefetchController");
        this.pSelectPaymentViewModel = pSelectPaymentViewModel;
        this.ozonRouter = ozonRouter;
        this.checkoutPrefetchController = checkoutPrefetchController;
    }

    private final void handleError(String message) {
        ViewGroup rootView = ContextExtKt.getRootView(getContainer().i());
        if (rootView != null) {
            FlashbarFactory.createDefaultError$default(FlashbarFactory.INSTANCE, rootView, null, message, null, null, null, getContainer().g(), 58, null).show();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onComposerInitialized$lambda$1(AddUserCardConfigurator addUserCardConfigurator, SelectPaymentViewModel.Action action) {
        InterfaceC7851b controller;
        InterfaceC7851b controller2;
        InterfaceC7851b controller3;
        if (action instanceof SelectPaymentViewModel.Action.Success) {
            addUserCardConfigurator.ozonRouter.b(((SelectPaymentViewModel.Action.Success) action).getDeeplink(), 884, U.c());
            ConfiguratorReferences references = addUserCardConfigurator.getReferences();
            if (references == null || (controller3 = references.getController()) == null) {
                return;
            }
            controller3.hideLoader();
            return;
        }
        if (action instanceof SelectPaymentViewModel.Action.Error) {
            addUserCardConfigurator.handleError(((SelectPaymentViewModel.Action.Error) action).getMessage());
            ConfiguratorReferences references2 = addUserCardConfigurator.getReferences();
            if (references2 == null || (controller2 = references2.getController()) == null) {
                return;
            }
            controller2.hideLoader();
            return;
        }
        if (!(action instanceof SelectPaymentViewModel.Action.Loading)) {
            throw new o();
        }
        ConfiguratorReferences references3 = addUserCardConfigurator.getReferences();
        if (references3 == null || (controller = references3.getController()) == null) {
            return;
        }
        controller.e(new l.a.C1079a(0L, null, 3));
    }

    private final void showFlashBar(int iconRes, int textRes) {
        C4911f ownerContainer;
        r a11;
        ViewGroup rootView;
        ConfiguratorReferences references = getReferences();
        if (references == null || (ownerContainer = references.getOwnerContainer()) == null || (a11 = ownerContainer.a()) == null || (rootView = ContextExtKt.getRootView(a11)) == null) {
            return;
        }
        FlashbarFactory flashbarFactory = FlashbarFactory.INSTANCE;
        String string = a11.getString(textRes);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        FlashbarFactory.create$default(flashbarFactory, rootView, null, OzonSpannableStringKt.toOzonSpannableString(string), null, null, Integer.valueOf(iconRes), null, null, null, null, null, null, null, 3000L, null, null, getContainer().g(), 57306, null).show();
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
                showFlashBar(R$drawable.ic_warning, R$string.error_cscore_card_add);
                return;
            } else {
                super.onActivityResult(requestCode, resultCode, data);
                return;
            }
        }
        ConfiguratorReferences references = getReferences();
        if (references != null && (controller = references.getController()) != null) {
            InterfaceC7851b.a.a(controller, null, null, null, null, 15);
        }
        showFlashBar(R$drawable.ic_check_green, R$string.cscore_card_add_successful);
        this.checkoutPrefetchController.removeAllCache();
    }

    @Override // ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig.PageConfigurator
    protected void onComposerInitialized() {
        V<SelectPaymentViewModel.Action> singleAction;
        a00.h viewModelOwnerProvider;
        B0 a11;
        ConfiguratorReferences references = getReferences();
        SelectPaymentViewModel selectPaymentViewModel = (references == null || (viewModelOwnerProvider = references.getViewModelOwnerProvider()) == null || (a11 = viewModelOwnerProvider.a()) == null) ? null : (SelectPaymentViewModel) new z0(a11, new z0.c() { // from class: ru.ozon.app.android.cscore.payment.configurators.AddUserCardConfigurator$onComposerInitialized$$inlined$createViewModel$1
            @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
            public <T extends w0> T create(Class<T> modelClass) {
                a aVar;
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                aVar = AddUserCardConfigurator.this.pSelectPaymentViewModel;
                SelectPaymentViewModel selectPaymentViewModel2 = (SelectPaymentViewModel) aVar.get();
                Intrinsics.g(selectPaymentViewModel2, "null cannot be cast to non-null type T of ru.ozon.app.android.utils.lifecycle.ViewModelExtKt.vmFactory.<no name provided>.create");
                return selectPaymentViewModel2;
            }
        }).a(SelectPaymentViewModel.class);
        if (selectPaymentViewModel == null || (singleAction = selectPaymentViewModel.getSingleAction()) == null) {
            return;
        }
        singleAction.observe(getOwner(), new f(this, 1));
    }
}
