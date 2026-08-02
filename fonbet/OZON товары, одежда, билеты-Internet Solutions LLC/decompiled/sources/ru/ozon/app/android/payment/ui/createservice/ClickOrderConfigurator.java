package ru.ozon.app.android.payment.ui.createservice;

import GZ.g;
import Pc.a;
import androidx.lifecycle.w0;
import androidx.lifecycle.z0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.account.orders.OrderChangePreferences;
import ru.ozon.app.android.composer.ConfiguratorReferences;
import ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B'\b\u0007\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u000eR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u000fR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0010R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/payment/ui/createservice/ClickOrderConfigurator;", "Lru/ozon/app/android/composer/universalscreen/view/ComposerScreenConfig$PageConfigurator;", "LPc/a;", "Lru/ozon/app/android/payment/ui/createservice/CreateServiceViewModel;", "pViewModel", "LGZ/g;", "router", "Lru/ozon/app/android/account/orders/OrderChangePreferences;", "orderChangePreferences", "<init>", "(LPc/a;LGZ/g;Lru/ozon/app/android/account/orders/OrderChangePreferences;)V", "", "onComposerInitialized", "()V", "LPc/a;", "LGZ/g;", "Lru/ozon/app/android/account/orders/OrderChangePreferences;", "Lru/ozon/app/android/payment/ui/createservice/CreateServiceDelegate;", "createServiceDelegate", "Lru/ozon/app/android/payment/ui/createservice/CreateServiceDelegate;", "payment_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ClickOrderConfigurator extends ComposerScreenConfig.PageConfigurator {
    private CreateServiceDelegate createServiceDelegate;

    @NotNull
    private final OrderChangePreferences orderChangePreferences;

    @NotNull
    private final a<CreateServiceViewModel> pViewModel;

    @NotNull
    private final g router;

    public ClickOrderConfigurator(@NotNull a<CreateServiceViewModel> pViewModel, @NotNull g router, @NotNull OrderChangePreferences orderChangePreferences) {
        Intrinsics.checkNotNullParameter(pViewModel, "pViewModel");
        Intrinsics.checkNotNullParameter(router, "router");
        Intrinsics.checkNotNullParameter(orderChangePreferences, "orderChangePreferences");
        this.pViewModel = pViewModel;
        this.router = router;
        this.orderChangePreferences = orderChangePreferences;
    }

    @Override // ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig.PageConfigurator
    protected void onComposerInitialized() {
        ConfiguratorReferences references = getReferences();
        if (references == null) {
            return;
        }
        CreateServiceViewModel createServiceViewModel = (CreateServiceViewModel) new z0(references.getViewModelOwnerProvider().a(), new z0.c() { // from class: ru.ozon.app.android.payment.ui.createservice.ClickOrderConfigurator$onComposerInitialized$$inlined$createViewModel$1
            @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
            public <T extends w0> T create(Class<T> modelClass) {
                a aVar;
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                aVar = ClickOrderConfigurator.this.pViewModel;
                CreateServiceViewModel createServiceViewModel2 = (CreateServiceViewModel) aVar.get();
                Intrinsics.g(createServiceViewModel2, "null cannot be cast to non-null type T of ru.ozon.app.android.utils.lifecycle.ViewModelExtKt.vmFactory.<no name provided>.create");
                return createServiceViewModel2;
            }
        }).a(CreateServiceViewModel.class);
        this.createServiceDelegate = new CreateServiceDelegate(this.router, new ClickOrderConfigurator$onComposerInitialized$1(references), references.getController(), this.orderChangePreferences);
        createServiceViewModel.getEvents().observe(getOwner(), new ClickOrderConfigurator$sam$androidx_lifecycle_Observer$0(new ClickOrderConfigurator$onComposerInitialized$2(this, references)));
    }
}
