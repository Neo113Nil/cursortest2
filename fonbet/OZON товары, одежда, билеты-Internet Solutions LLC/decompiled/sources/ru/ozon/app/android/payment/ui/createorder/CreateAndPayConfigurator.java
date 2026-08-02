package ru.ozon.app.android.payment.ui.createorder;

import GZ.g;
import Pc.a;
import W10.c;
import a00.h;
import android.content.Intent;
import android.os.Bundle;
import androidx.lifecycle.J;
import androidx.lifecycle.P;
import androidx.lifecycle.w0;
import androidx.lifecycle.z0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.account.orders.OrderChangePreferences;
import ru.ozon.app.android.composer.ConfiguratorReferences;
import ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig;
import ru.ozon.app.android.network.abtool.FeatureChecker;
import ru.ozon.app.android.payment.ui.GooglePayManagerImpl;
import ru.ozon.app.android.platform.di.AndroidPlatformComponentConfig;

@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 02\u00020\u0001:\u00010B?\b\u0007\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0014¢\u0006\u0004\b\u0012\u0010\u0013J)\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00142\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ#\u0010 \u001a\u00020\u00112\u0006\u0010\u001c\u001a\u00020\u001b2\n\u0010\u001f\u001a\u00060\u001dj\u0002`\u001eH\u0016¢\u0006\u0004\b \u0010!J%\u0010\"\u001a\u00020\u00112\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\n\u0010\u001f\u001a\u00060\u001dj\u0002`\u001eH\u0016¢\u0006\u0004\b\"\u0010!J\u0017\u0010%\u001a\u00020\u00112\u0006\u0010$\u001a\u00020#H\u0016¢\u0006\u0004\b%\u0010&R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010'R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010(R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010)R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010*R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010+R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010,R\u0016\u0010.\u001a\u00020-8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b.\u0010/¨\u00061"}, d2 = {"Lru/ozon/app/android/payment/ui/createorder/CreateAndPayConfigurator;", "Lru/ozon/app/android/composer/universalscreen/view/ComposerScreenConfig$PageConfigurator;", "LPc/a;", "Lru/ozon/app/android/payment/ui/createorder/CreateAndPayViewModel;", "pCreateAndPayViewModel", "LGZ/g;", "router", "Lru/ozon/app/android/account/orders/OrderChangePreferences;", "orderChangePreferences", "Lru/ozon/app/android/platform/di/AndroidPlatformComponentConfig;", "config", "Lru/ozon/app/android/payment/ui/GooglePayManagerImpl;", "googlePayManager", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "featureChecker", "<init>", "(LPc/a;LGZ/g;Lru/ozon/app/android/account/orders/OrderChangePreferences;Lru/ozon/app/android/platform/di/AndroidPlatformComponentConfig;Lru/ozon/app/android/payment/ui/GooglePayManagerImpl;Lru/ozon/app/android/network/abtool/FeatureChecker;)V", "", "onComposerInitialized", "()V", "", "requestCode", "resultCode", "Landroid/content/Intent;", "data", "onActivityResult", "(IILandroid/content/Intent;)V", "Landroid/os/Bundle;", "outState", "La00/h;", "Lru/ozon/app/android/composer/ViewModelOwnerProvider;", "viewModelOwnerProvider", "onSaveInstanceState", "(Landroid/os/Bundle;La00/h;)V", "onRestoreInstanceState", "Landroidx/lifecycle/J;", "owner", "onResume", "(Landroidx/lifecycle/J;)V", "LPc/a;", "LGZ/g;", "Lru/ozon/app/android/account/orders/OrderChangePreferences;", "Lru/ozon/app/android/platform/di/AndroidPlatformComponentConfig;", "Lru/ozon/app/android/payment/ui/GooglePayManagerImpl;", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "Lru/ozon/app/android/payment/ui/createorder/CreateAndPayDelegate;", "createAndPayDelegate", "Lru/ozon/app/android/payment/ui/createorder/CreateAndPayDelegate;", "Companion", "payment_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CreateAndPayConfigurator extends ComposerScreenConfig.PageConfigurator {

    @NotNull
    private final AndroidPlatformComponentConfig config;
    private CreateAndPayDelegate createAndPayDelegate;

    @NotNull
    private final FeatureChecker featureChecker;

    @NotNull
    private final GooglePayManagerImpl googlePayManager;

    @NotNull
    private final OrderChangePreferences orderChangePreferences;

    @NotNull
    private final a<CreateAndPayViewModel> pCreateAndPayViewModel;

    @NotNull
    private final g router;

    public CreateAndPayConfigurator(@NotNull a<CreateAndPayViewModel> pCreateAndPayViewModel, @NotNull g router, @NotNull OrderChangePreferences orderChangePreferences, @NotNull AndroidPlatformComponentConfig config, @NotNull GooglePayManagerImpl googlePayManager, @NotNull FeatureChecker featureChecker) {
        Intrinsics.checkNotNullParameter(pCreateAndPayViewModel, "pCreateAndPayViewModel");
        Intrinsics.checkNotNullParameter(router, "router");
        Intrinsics.checkNotNullParameter(orderChangePreferences, "orderChangePreferences");
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(googlePayManager, "googlePayManager");
        Intrinsics.checkNotNullParameter(featureChecker, "featureChecker");
        this.pCreateAndPayViewModel = pCreateAndPayViewModel;
        this.router = router;
        this.orderChangePreferences = orderChangePreferences;
        this.config = config;
        this.googlePayManager = googlePayManager;
        this.featureChecker = featureChecker;
    }

    @Override // ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig.PageConfigurator
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        Bundle extras;
        ConfiguratorReferences references;
        if (requestCode == 2018) {
            ConfiguratorReferences references2 = getReferences();
            if (references2 == null) {
                return;
            } else {
                ((CreateAndPayViewModel) new z0(references2.getViewModelOwnerProvider().a(), new z0.c() { // from class: ru.ozon.app.android.payment.ui.createorder.CreateAndPayConfigurator$onActivityResult$$inlined$createViewModel$1
                    @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
                    public <T extends w0> T create(Class<T> modelClass) {
                        a aVar;
                        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                        aVar = CreateAndPayConfigurator.this.pCreateAndPayViewModel;
                        CreateAndPayViewModel createAndPayViewModel = (CreateAndPayViewModel) aVar.get();
                        Intrinsics.g(createAndPayViewModel, "null cannot be cast to non-null type T of ru.ozon.app.android.utils.lifecycle.ViewModelExtKt.vmFactory.<no name provided>.create");
                        return createAndPayViewModel;
                    }
                }).a(CreateAndPayViewModel.class)).onGooglePayResult(resultCode, data);
            }
        }
        if (data == null || (extras = data.getExtras()) == null) {
            return;
        }
        boolean z11 = extras.getBoolean("createOrder");
        if (requestCode == 1442 && z11 && (references = getReferences()) != null) {
            CreateAndPayViewModel createAndPayViewModel = (CreateAndPayViewModel) new z0(references.getViewModelOwnerProvider().a(), new z0.c() { // from class: ru.ozon.app.android.payment.ui.createorder.CreateAndPayConfigurator$onActivityResult$$inlined$createViewModel$2
                @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
                public <T extends w0> T create(Class<T> modelClass) {
                    a aVar;
                    Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                    aVar = CreateAndPayConfigurator.this.pCreateAndPayViewModel;
                    CreateAndPayViewModel createAndPayViewModel2 = (CreateAndPayViewModel) aVar.get();
                    Intrinsics.g(createAndPayViewModel2, "null cannot be cast to non-null type T of ru.ozon.app.android.utils.lifecycle.ViewModelExtKt.vmFactory.<no name provided>.create");
                    return createAndPayViewModel2;
                }
            }).a(CreateAndPayViewModel.class);
            String string = extras.getString("orderId");
            if (string == null) {
                return;
            }
            c cVar = (c) extras.getParcelable("trackingData");
            if (cVar == null) {
                cVar = new c(null, null, null);
            }
            c cVar2 = cVar;
            if (string.equals("createOrder")) {
                CreateAndPayViewModel.createOrder$default(createAndPayViewModel, string, cVar2, null, 4, null);
            } else if (string.equals("createOrderV2")) {
                CreateAndPayViewModel.createOrderV2$default(createAndPayViewModel, string, cVar2, null, null, 12, null);
            }
        }
    }

    @Override // ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig.PageConfigurator
    protected void onComposerInitialized() {
        ConfiguratorReferences references = getReferences();
        if (references == null) {
            return;
        }
        CreateAndPayViewModel createAndPayViewModel = (CreateAndPayViewModel) new z0(references.getViewModelOwnerProvider().a(), new z0.c() { // from class: ru.ozon.app.android.payment.ui.createorder.CreateAndPayConfigurator$onComposerInitialized$$inlined$createViewModel$1
            @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
            public <T extends w0> T create(Class<T> modelClass) {
                a aVar;
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                aVar = CreateAndPayConfigurator.this.pCreateAndPayViewModel;
                CreateAndPayViewModel createAndPayViewModel2 = (CreateAndPayViewModel) aVar.get();
                Intrinsics.g(createAndPayViewModel2, "null cannot be cast to non-null type T of ru.ozon.app.android.utils.lifecycle.ViewModelExtKt.vmFactory.<no name provided>.create");
                return createAndPayViewModel2;
            }
        }).a(CreateAndPayViewModel.class);
        CreateAndPayConfigurator$onComposerInitialized$1 createAndPayConfigurator$onComposerInitialized$1 = new CreateAndPayConfigurator$onComposerInitialized$1(references);
        Intrinsics.f(createAndPayViewModel);
        this.createAndPayDelegate = new CreateAndPayDelegate(createAndPayConfigurator$onComposerInitialized$1, createAndPayViewModel, references, this.router, this.googlePayManager, this.orderChangePreferences, this.featureChecker);
        createAndPayViewModel.getViewEffects().observe(getOwner(), new CreateAndPayConfigurator$sam$androidx_lifecycle_Observer$0(new CreateAndPayConfigurator$onComposerInitialized$2(this)));
        P<HandledState<CreateAndPayViewState>> viewState = createAndPayViewModel.getViewState();
        J owner = getOwner();
        CreateAndPayDelegate createAndPayDelegate = this.createAndPayDelegate;
        if (createAndPayDelegate == null) {
            Intrinsics.n("createAndPayDelegate");
            throw null;
        }
        viewState.observe(owner, new CreateAndPayConfigurator$sam$androidx_lifecycle_Observer$0(new CreateAndPayConfigurator$onComposerInitialized$3(createAndPayDelegate)));
        createAndPayViewModel.initAnalytics(references.getAnalyticsScreenStorage());
        createAndPayViewModel.subscribeToAppTerminated();
    }

    @Override // ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig.PageConfigurator
    public void onRestoreInstanceState(Bundle outState, @NotNull h viewModelOwnerProvider) {
        Intrinsics.checkNotNullParameter(viewModelOwnerProvider, "viewModelOwnerProvider");
        CreateAndPayViewModel createAndPayViewModel = (CreateAndPayViewModel) new z0(viewModelOwnerProvider.a(), new z0.c() { // from class: ru.ozon.app.android.payment.ui.createorder.CreateAndPayConfigurator$onRestoreInstanceState$$inlined$createViewModel$1
            @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
            public <T extends w0> T create(Class<T> modelClass) {
                a aVar;
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                aVar = CreateAndPayConfigurator.this.pCreateAndPayViewModel;
                CreateAndPayViewModel createAndPayViewModel2 = (CreateAndPayViewModel) aVar.get();
                Intrinsics.g(createAndPayViewModel2, "null cannot be cast to non-null type T of ru.ozon.app.android.utils.lifecycle.ViewModelExtKt.vmFactory.<no name provided>.create");
                return createAndPayViewModel2;
            }
        }).a(CreateAndPayViewModel.class);
        if (outState != null) {
            createAndPayViewModel.loadState(outState);
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onResume(@NotNull J owner) {
        HandledState<CreateAndPayViewState> value;
        Intrinsics.checkNotNullParameter(owner, "owner");
        ConfiguratorReferences references = getReferences();
        if (references == null || (value = ((CreateAndPayViewModel) new z0(references.getViewModelOwnerProvider().a(), new z0.c() { // from class: ru.ozon.app.android.payment.ui.createorder.CreateAndPayConfigurator$onResume$$inlined$createViewModel$1
            @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
            public <T extends w0> T create(Class<T> modelClass) {
                a aVar;
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                aVar = CreateAndPayConfigurator.this.pCreateAndPayViewModel;
                CreateAndPayViewModel createAndPayViewModel = (CreateAndPayViewModel) aVar.get();
                Intrinsics.g(createAndPayViewModel, "null cannot be cast to non-null type T of ru.ozon.app.android.utils.lifecycle.ViewModelExtKt.vmFactory.<no name provided>.create");
                return createAndPayViewModel;
            }
        }).a(CreateAndPayViewModel.class)).getViewState().getValue()) == null) {
            return;
        }
        CreateAndPayDelegate createAndPayDelegate = this.createAndPayDelegate;
        if (createAndPayDelegate != null) {
            createAndPayDelegate.render(value);
        } else {
            Intrinsics.n("createAndPayDelegate");
            throw null;
        }
    }

    @Override // ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig.PageConfigurator
    public void onSaveInstanceState(@NotNull Bundle outState, @NotNull h viewModelOwnerProvider) {
        Intrinsics.checkNotNullParameter(outState, "outState");
        Intrinsics.checkNotNullParameter(viewModelOwnerProvider, "viewModelOwnerProvider");
        ((CreateAndPayViewModel) new z0(viewModelOwnerProvider.a(), new z0.c() { // from class: ru.ozon.app.android.payment.ui.createorder.CreateAndPayConfigurator$onSaveInstanceState$$inlined$createViewModel$1
            @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
            public <T extends w0> T create(Class<T> modelClass) {
                a aVar;
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                aVar = CreateAndPayConfigurator.this.pCreateAndPayViewModel;
                CreateAndPayViewModel createAndPayViewModel = (CreateAndPayViewModel) aVar.get();
                Intrinsics.g(createAndPayViewModel, "null cannot be cast to non-null type T of ru.ozon.app.android.utils.lifecycle.ViewModelExtKt.vmFactory.<no name provided>.create");
                return createAndPayViewModel;
            }
        }).a(CreateAndPayViewModel.class)).saveState(outState);
    }
}
