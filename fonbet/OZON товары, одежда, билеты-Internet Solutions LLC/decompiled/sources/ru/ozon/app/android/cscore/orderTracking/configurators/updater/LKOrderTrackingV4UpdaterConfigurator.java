package ru.ozon.app.android.cscore.orderTracking.configurators.updater;

import Pc.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l10.InterfaceC7851b;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.account.orders.OrderListChangeStateViewModel;
import ru.ozon.app.android.barcodecache.cache.BarcodeCacheManager;
import ru.ozon.app.android.composer.ConfiguratorReferences;
import ru.ozon.app.android.cscore.orderTracking.viewmodels.OrderTrackingV4ViewModel;
import ru.ozon.app.android.payment.domain.createorder.busevents.OrderTrackingBus;
import ru.ozon.app.android.storage.auth.AuthStateStorage;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B=\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/cscore/orderTracking/configurators/updater/LKOrderTrackingV4UpdaterConfigurator;", "Lru/ozon/app/android/cscore/orderTracking/configurators/updater/BaseOrderTrackingV4UpdaterConfigurator;", "Lru/ozon/app/android/payment/domain/createorder/busevents/OrderTrackingBus;", "orderTrackingBus", "LPc/a;", "Lru/ozon/app/android/account/orders/OrderListChangeStateViewModel;", "provider", "Lru/ozon/app/android/cscore/orderTracking/viewmodels/OrderTrackingV4ViewModel;", "pOrderTrackingV4ViewModel", "Lru/ozon/app/android/barcodecache/cache/BarcodeCacheManager;", "barcodeCacheManager", "Lru/ozon/app/android/storage/auth/AuthStateStorage;", "authManager", "<init>", "(Lru/ozon/app/android/payment/domain/createorder/busevents/OrderTrackingBus;LPc/a;LPc/a;Lru/ozon/app/android/barcodecache/cache/BarcodeCacheManager;Lru/ozon/app/android/storage/auth/AuthStateStorage;)V", "", "refreshDataOrScreenIfNeed", "()V", "csma_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class LKOrderTrackingV4UpdaterConfigurator extends BaseOrderTrackingV4UpdaterConfigurator {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LKOrderTrackingV4UpdaterConfigurator(@NotNull OrderTrackingBus orderTrackingBus, @NotNull a<OrderListChangeStateViewModel> provider, @NotNull a<OrderTrackingV4ViewModel> pOrderTrackingV4ViewModel, @NotNull BarcodeCacheManager barcodeCacheManager, @NotNull AuthStateStorage authManager) {
        super(orderTrackingBus, provider, pOrderTrackingV4ViewModel, barcodeCacheManager, authManager);
        Intrinsics.checkNotNullParameter(orderTrackingBus, "orderTrackingBus");
        Intrinsics.checkNotNullParameter(provider, "provider");
        Intrinsics.checkNotNullParameter(pOrderTrackingV4ViewModel, "pOrderTrackingV4ViewModel");
        Intrinsics.checkNotNullParameter(barcodeCacheManager, "barcodeCacheManager");
        Intrinsics.checkNotNullParameter(authManager, "authManager");
    }

    @Override // ru.ozon.app.android.cscore.orderTracking.configurators.updater.BaseOrderTrackingV4UpdaterConfigurator
    public void refreshDataOrScreenIfNeed() {
        InterfaceC7851b controller;
        if (!getNeedRefreshAfterOrderCreate()) {
            refreshData();
            return;
        }
        setNeedRefreshAfterOrderCreate(false);
        ConfiguratorReferences references = getReferences();
        if (references == null || (controller = references.getController()) == null) {
            return;
        }
        InterfaceC7851b.a.e(controller, null, null, null, 7);
    }
}
