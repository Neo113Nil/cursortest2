package ru.ozon.app.android.account.orders.total;

import GZ.g;
import Pc.a;
import Sc.o;
import a00.h;
import androidx.lifecycle.B0;
import androidx.lifecycle.W;
import androidx.lifecycle.w0;
import androidx.lifecycle.z0;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.U;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.account.orders.total.TotalConfigurator;
import ru.ozon.app.android.composer.ComposerExtKt;
import ru.ozon.app.android.composer.ConfiguratorReferences;
import ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig;
import ru.ozon.app.android.payment.ui.changepayment.presentation.ChangePaymentMethodAction;
import ru.ozon.app.android.payment.ui.changepayment.presentation.ChangePaymentViewModel;
import ru.ozon.app.android.payment.ui.createorder.CreateAndPayViewModel;
import ru.ozon.app.android.storage.device.ApplicationInfoDataSource;
import ru.ozon.app.android.utils.livedata.SingleLiveEvent;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B5\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0014¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0010R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0011R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0011R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0012R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/account/orders/total/TotalConfigurator;", "Lru/ozon/app/android/composer/universalscreen/view/ComposerScreenConfig$PageConfigurator;", "LGZ/g;", "router", "LPc/a;", "Lru/ozon/app/android/payment/ui/changepayment/presentation/ChangePaymentViewModel;", "pViewModel", "Lru/ozon/app/android/payment/ui/createorder/CreateAndPayViewModel;", "pCreateAndPayViewModel", "Lru/ozon/app/android/storage/device/ApplicationInfoDataSource;", "applicationInfoDataSource", "<init>", "(LGZ/g;LPc/a;LPc/a;Lru/ozon/app/android/storage/device/ApplicationInfoDataSource;)V", "", "onComposerInitialized", "()V", "LGZ/g;", "LPc/a;", "Lru/ozon/app/android/storage/device/ApplicationInfoDataSource;", "viewModel", "Lru/ozon/app/android/payment/ui/changepayment/presentation/ChangePaymentViewModel;", "createAndPayViewModel", "Lru/ozon/app/android/payment/ui/createorder/CreateAndPayViewModel;", "cs-orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class TotalConfigurator extends ComposerScreenConfig.PageConfigurator {

    @NotNull
    private final ApplicationInfoDataSource applicationInfoDataSource;
    private CreateAndPayViewModel createAndPayViewModel;

    @NotNull
    private final a<CreateAndPayViewModel> pCreateAndPayViewModel;

    @NotNull
    private final a<ChangePaymentViewModel> pViewModel;

    @NotNull
    private final g router;
    private ChangePaymentViewModel viewModel;

    public TotalConfigurator(@NotNull g router, @NotNull a<ChangePaymentViewModel> pViewModel, @NotNull a<CreateAndPayViewModel> pCreateAndPayViewModel, @NotNull ApplicationInfoDataSource applicationInfoDataSource) {
        Intrinsics.checkNotNullParameter(router, "router");
        Intrinsics.checkNotNullParameter(pViewModel, "pViewModel");
        Intrinsics.checkNotNullParameter(pCreateAndPayViewModel, "pCreateAndPayViewModel");
        Intrinsics.checkNotNullParameter(applicationInfoDataSource, "applicationInfoDataSource");
        this.router = router;
        this.pViewModel = pViewModel;
        this.pCreateAndPayViewModel = pCreateAndPayViewModel;
        this.applicationInfoDataSource = applicationInfoDataSource;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onComposerInitialized$lambda$3(TotalConfigurator totalConfigurator, ChangePaymentMethodAction changePaymentMethodAction) {
        if (changePaymentMethodAction instanceof ChangePaymentMethodAction.Success) {
            ComposerExtKt.setResult$default(totalConfigurator.getContainer(), null, 0, new TotalConfigurator$onComposerInitialized$3$1(changePaymentMethodAction), 3, null);
            ComposerExtKt.closeFlow(totalConfigurator.getContainer());
            String deeplink = ((ChangePaymentMethodAction.Success) changePaymentMethodAction).getDeeplink();
            if (deeplink != null) {
                g.a.a(totalConfigurator.router, deeplink, null, null, 6);
                return;
            }
            return;
        }
        if (changePaymentMethodAction instanceof ChangePaymentMethodAction.Error) {
            ComposerExtKt.setResult$default(totalConfigurator.getContainer(), null, 0, new TotalConfigurator$onComposerInitialized$3$3(changePaymentMethodAction), 3, null);
            ComposerExtKt.closeFlow(totalConfigurator.getContainer());
        } else {
            if (!(changePaymentMethodAction instanceof ChangePaymentMethodAction.SuccessAndRecalculate)) {
                throw new o();
            }
            CreateAndPayViewModel createAndPayViewModel = totalConfigurator.createAndPayViewModel;
            if (createAndPayViewModel != null) {
                ChangePaymentMethodAction.SuccessAndRecalculate successAndRecalculate = (ChangePaymentMethodAction.SuccessAndRecalculate) changePaymentMethodAction;
                createAndPayViewModel.pay(successAndRecalculate.getLink(), U.j(new Pair("orderNumber", successAndRecalculate.getOrderNumber()), new Pair("deviceId", totalConfigurator.applicationInfoDataSource.getUniqueApplicationId())), successAndRecalculate.getTrackingData());
            }
        }
    }

    @Override // ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig.PageConfigurator
    protected void onComposerInitialized() {
        SingleLiveEvent<ChangePaymentMethodAction> singleAction;
        h viewModelOwnerProvider;
        B0 a11;
        h viewModelOwnerProvider2;
        B0 a12;
        ConfiguratorReferences references = getReferences();
        CreateAndPayViewModel createAndPayViewModel = null;
        this.viewModel = (references == null || (viewModelOwnerProvider2 = references.getViewModelOwnerProvider()) == null || (a12 = viewModelOwnerProvider2.a()) == null) ? null : (ChangePaymentViewModel) new z0(a12, new z0.c() { // from class: ru.ozon.app.android.account.orders.total.TotalConfigurator$onComposerInitialized$$inlined$createViewModel$1
            @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
            public <T extends w0> T create(Class<T> modelClass) {
                a aVar;
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                aVar = TotalConfigurator.this.pViewModel;
                ChangePaymentViewModel changePaymentViewModel = (ChangePaymentViewModel) aVar.get();
                Intrinsics.g(changePaymentViewModel, "null cannot be cast to non-null type T of ru.ozon.app.android.utils.lifecycle.ViewModelExtKt.vmFactory.<no name provided>.create");
                return changePaymentViewModel;
            }
        }).a(ChangePaymentViewModel.class);
        ConfiguratorReferences references2 = getReferences();
        if (references2 != null && (viewModelOwnerProvider = references2.getViewModelOwnerProvider()) != null && (a11 = viewModelOwnerProvider.a()) != null) {
            createAndPayViewModel = (CreateAndPayViewModel) new z0(a11, new z0.c() { // from class: ru.ozon.app.android.account.orders.total.TotalConfigurator$onComposerInitialized$$inlined$createViewModel$2
                @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
                public <T extends w0> T create(Class<T> modelClass) {
                    a aVar;
                    Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                    aVar = TotalConfigurator.this.pCreateAndPayViewModel;
                    CreateAndPayViewModel createAndPayViewModel2 = (CreateAndPayViewModel) aVar.get();
                    Intrinsics.g(createAndPayViewModel2, "null cannot be cast to non-null type T of ru.ozon.app.android.utils.lifecycle.ViewModelExtKt.vmFactory.<no name provided>.create");
                    return createAndPayViewModel2;
                }
            }).a(CreateAndPayViewModel.class);
        }
        this.createAndPayViewModel = createAndPayViewModel;
        ChangePaymentViewModel changePaymentViewModel = this.viewModel;
        if (changePaymentViewModel == null || (singleAction = changePaymentViewModel.getSingleAction()) == null) {
            return;
        }
        singleAction.observe(getContainer().g(), new W() { // from class: kl.a
            @Override // androidx.lifecycle.W
            public final void onChanged(Object obj) {
                TotalConfigurator.onComposerInitialized$lambda$3(TotalConfigurator.this, (ChangePaymentMethodAction) obj);
            }
        });
    }
}
