package ru.ozon.app.android.cscore.orderTracking.configurators.updater;

import Ae.C2399j;
import Ae.C2408n0;
import Pc.a;
import a00.h;
import androidx.lifecycle.H;
import androidx.lifecycle.J;
import androidx.lifecycle.K;
import androidx.lifecycle.P;
import androidx.lifecycle.V;
import androidx.lifecycle.w0;
import androidx.lifecycle.z0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.account.orders.OrderListChangeStateViewModel;
import ru.ozon.app.android.barcodecache.cache.BarcodeCacheManager;
import ru.ozon.app.android.composer.ConfiguratorReferences;
import ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig;
import ru.ozon.app.android.cscore.orderTracking.viewmodels.OrderTrackingV4ViewModel;
import ru.ozon.app.android.csma.orderTracking.data.OrderTrackingV4DTO;
import ru.ozon.app.android.csma.orderTracking.data.UpdateAction;
import ru.ozon.app.android.payment.domain.createorder.busevents.OrderTrackingBus;
import ru.ozon.app.android.storage.auth.AuthStateStorage;
import xe.C10727i;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0017\u0018\u00002\u00020\u00012\u00020\u0002B=\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0005\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0010H\u0014¢\u0006\u0004\b\u0014\u0010\u0012J\u0017\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0019\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u001a\u0010\u0012J\u000f\u0010\u001b\u001a\u00020\u0010H\u0004¢\u0006\u0004\b\u001b\u0010\u0012R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u001cR\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001dR\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u001dR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u001eR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u001fR\"\u0010!\u001a\u00020 8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b!\u0010#\"\u0004\b$\u0010%R\"\u0010&\u001a\u00020 8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b&\u0010\"\u001a\u0004\b'\u0010#\"\u0004\b(\u0010%R\u0016\u0010*\u001a\u00020)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+R\u0016\u0010,\u001a\u00020 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010\"R\u0018\u0010.\u001a\u0004\u0018\u00010-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/R\u0018\u00100\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u00101¨\u00062"}, d2 = {"Lru/ozon/app/android/cscore/orderTracking/configurators/updater/BaseOrderTrackingV4UpdaterConfigurator;", "Lru/ozon/app/android/composer/universalscreen/view/ComposerScreenConfig$PageConfigurator;", "", "Lru/ozon/app/android/payment/domain/createorder/busevents/OrderTrackingBus;", "orderTrackingBus", "LPc/a;", "Lru/ozon/app/android/account/orders/OrderListChangeStateViewModel;", "provider", "Lru/ozon/app/android/cscore/orderTracking/viewmodels/OrderTrackingV4ViewModel;", "pOrderTrackingV4ViewModel", "Lru/ozon/app/android/barcodecache/cache/BarcodeCacheManager;", "barcodeCacheManager", "Lru/ozon/app/android/storage/auth/AuthStateStorage;", "authManager", "<init>", "(Lru/ozon/app/android/payment/domain/createorder/busevents/OrderTrackingBus;LPc/a;LPc/a;Lru/ozon/app/android/barcodecache/cache/BarcodeCacheManager;Lru/ozon/app/android/storage/auth/AuthStateStorage;)V", "", "updateBarcodeCache", "()V", "setNeedRefreshByUpdate", "onComposerInitialized", "Landroidx/lifecycle/J;", "owner", "onCreate", "(Landroidx/lifecycle/J;)V", "onResume", "refreshDataOrScreenIfNeed", "refreshData", "Lru/ozon/app/android/payment/domain/createorder/busevents/OrderTrackingBus;", "LPc/a;", "Lru/ozon/app/android/barcodecache/cache/BarcodeCacheManager;", "Lru/ozon/app/android/storage/auth/AuthStateStorage;", "", "isConfiguratorEnabled", "Z", "()Z", "setConfiguratorEnabled", "(Z)V", "needRefreshAfterOrderCreate", "getNeedRefreshAfterOrderCreate", "setNeedRefreshAfterOrderCreate", "", "localLastUpdateTime", "J", "afterOnCreate", "Lru/ozon/app/android/csma/orderTracking/data/UpdateAction;", "lastUpdateAction", "Lru/ozon/app/android/csma/orderTracking/data/UpdateAction;", "viewModel", "Lru/ozon/app/android/cscore/orderTracking/viewmodels/OrderTrackingV4ViewModel;", "csma_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public class BaseOrderTrackingV4UpdaterConfigurator extends ComposerScreenConfig.PageConfigurator {
    private boolean afterOnCreate;

    @NotNull
    private final AuthStateStorage authManager;

    @NotNull
    private final BarcodeCacheManager barcodeCacheManager;
    private boolean isConfiguratorEnabled;
    private UpdateAction lastUpdateAction;
    private long localLastUpdateTime;
    private boolean needRefreshAfterOrderCreate;

    @NotNull
    private final OrderTrackingBus orderTrackingBus;

    @NotNull
    private final a<OrderTrackingV4ViewModel> pOrderTrackingV4ViewModel;

    @NotNull
    private final a<OrderListChangeStateViewModel> provider;
    private OrderTrackingV4ViewModel viewModel;

    public BaseOrderTrackingV4UpdaterConfigurator(@NotNull OrderTrackingBus orderTrackingBus, @NotNull a<OrderListChangeStateViewModel> provider, @NotNull a<OrderTrackingV4ViewModel> pOrderTrackingV4ViewModel, @NotNull BarcodeCacheManager barcodeCacheManager, @NotNull AuthStateStorage authManager) {
        Intrinsics.checkNotNullParameter(orderTrackingBus, "orderTrackingBus");
        Intrinsics.checkNotNullParameter(provider, "provider");
        Intrinsics.checkNotNullParameter(pOrderTrackingV4ViewModel, "pOrderTrackingV4ViewModel");
        Intrinsics.checkNotNullParameter(barcodeCacheManager, "barcodeCacheManager");
        Intrinsics.checkNotNullParameter(authManager, "authManager");
        this.orderTrackingBus = orderTrackingBus;
        this.provider = provider;
        this.pOrderTrackingV4ViewModel = pOrderTrackingV4ViewModel;
        this.barcodeCacheManager = barcodeCacheManager;
        this.authManager = authManager;
        this.localLastUpdateTime = System.currentTimeMillis();
    }

    private final void setNeedRefreshByUpdate() {
        OrderListChangeStateViewModel orderListChangeStateViewModel = (OrderListChangeStateViewModel) new z0(getContainer().j(), new z0.c() { // from class: ru.ozon.app.android.cscore.orderTracking.configurators.updater.BaseOrderTrackingV4UpdaterConfigurator$setNeedRefreshByUpdate$$inlined$viewModel$1
            @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
            public <T extends w0> T create(Class<T> modelClass) {
                a aVar;
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                aVar = BaseOrderTrackingV4UpdaterConfigurator.this.provider;
                OrderListChangeStateViewModel orderListChangeStateViewModel2 = (OrderListChangeStateViewModel) aVar.get();
                Intrinsics.g(orderListChangeStateViewModel2, "null cannot be cast to non-null type T of ru.ozon.app.android.utils.lifecycle.ViewModelExtKt.vmFactory.<no name provided>.create");
                return orderListChangeStateViewModel2;
            }
        }).a(OrderListChangeStateViewModel.class);
        if (this.localLastUpdateTime < orderListChangeStateViewModel.getLastUpdateTime()) {
            this.localLastUpdateTime = orderListChangeStateViewModel.getLastUpdateTime();
            this.needRefreshAfterOrderCreate = true;
        }
    }

    private final void updateBarcodeCache() {
        if (this.authManager.isAuthenticated()) {
            C10727i.c(H.a(getOwner().getLifecycle()), null, null, new BaseOrderTrackingV4UpdaterConfigurator$updateBarcodeCache$1(this, null), 3);
        } else {
            this.barcodeCacheManager.clearCache();
        }
    }

    protected final boolean getNeedRefreshAfterOrderCreate() {
        return this.needRefreshAfterOrderCreate;
    }

    /* renamed from: isConfiguratorEnabled, reason: from getter */
    public boolean getIsConfiguratorEnabled() {
        return this.isConfiguratorEnabled;
    }

    @Override // ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig.PageConfigurator
    protected void onComposerInitialized() {
        P<OrderTrackingV4DTO> updateOrderTrackingObserver;
        h viewModelOwnerProvider;
        super.onComposerInitialized();
        ConfiguratorReferences references = getReferences();
        OrderTrackingV4ViewModel orderTrackingV4ViewModel = (references == null || (viewModelOwnerProvider = references.getViewModelOwnerProvider()) == null) ? null : (OrderTrackingV4ViewModel) new z0(viewModelOwnerProvider.a(), new z0.c() { // from class: ru.ozon.app.android.cscore.orderTracking.configurators.updater.BaseOrderTrackingV4UpdaterConfigurator$onComposerInitialized$$inlined$viewModel$1
            @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
            public <T extends w0> T create(Class<T> modelClass) {
                a aVar;
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                aVar = BaseOrderTrackingV4UpdaterConfigurator.this.pOrderTrackingV4ViewModel;
                OrderTrackingV4ViewModel orderTrackingV4ViewModel2 = (OrderTrackingV4ViewModel) aVar.get();
                Intrinsics.g(orderTrackingV4ViewModel2, "null cannot be cast to non-null type T of ru.ozon.app.android.utils.lifecycle.ViewModelExtKt.vmFactory.<no name provided>.create");
                return orderTrackingV4ViewModel2;
            }
        }).a(OrderTrackingV4ViewModel.class);
        this.viewModel = orderTrackingV4ViewModel;
        if (orderTrackingV4ViewModel == null || (updateOrderTrackingObserver = orderTrackingV4ViewModel.getUpdateOrderTrackingObserver()) == null) {
            return;
        }
        updateOrderTrackingObserver.observe(getOwner(), new BaseOrderTrackingV4UpdaterConfigurator$sam$androidx_lifecycle_Observer$0(new BaseOrderTrackingV4UpdaterConfigurator$onComposerInitialized$2(this)));
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onCreate(@NotNull J owner) {
        V<OrderTrackingV4ViewModel.OrderTrackingV4ViewModelAction> actionObserver;
        Intrinsics.checkNotNullParameter(owner, "owner");
        this.afterOnCreate = true;
        C2399j.C(new C2408n0(this.orderTrackingBus.subscribeEvents(), new BaseOrderTrackingV4UpdaterConfigurator$onCreate$1(this, null)), K.a(owner));
        OrderTrackingV4ViewModel orderTrackingV4ViewModel = this.viewModel;
        if (orderTrackingV4ViewModel == null || (actionObserver = orderTrackingV4ViewModel.getActionObserver()) == null) {
            return;
        }
        actionObserver.observe(owner, new BaseOrderTrackingV4UpdaterConfigurator$sam$androidx_lifecycle_Observer$0(new BaseOrderTrackingV4UpdaterConfigurator$onCreate$2(this)));
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onResume(@NotNull J owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        updateBarcodeCache();
        if (this.afterOnCreate) {
            this.afterOnCreate = false;
            this.needRefreshAfterOrderCreate = false;
        } else if (this.authManager.isAuthenticated()) {
            setNeedRefreshByUpdate();
            if (getIsConfiguratorEnabled() || this.needRefreshAfterOrderCreate) {
                refreshDataOrScreenIfNeed();
            }
        }
    }

    protected final void refreshData() {
        OrderTrackingV4ViewModel orderTrackingV4ViewModel;
        UpdateAction updateAction = this.lastUpdateAction;
        if (updateAction == null || (orderTrackingV4ViewModel = this.viewModel) == null) {
            return;
        }
        orderTrackingV4ViewModel.updateOrderTracking(updateAction.getActionName());
        Unit unit = Unit.f71690a;
    }

    public void refreshDataOrScreenIfNeed() {
        throw null;
    }

    public void setConfiguratorEnabled(boolean z11) {
        this.isConfiguratorEnabled = z11;
    }

    protected final void setNeedRefreshAfterOrderCreate(boolean z11) {
        this.needRefreshAfterOrderCreate = z11;
    }
}
