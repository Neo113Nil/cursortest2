package ru.ozon.app.android.rfbs.deliverycomplain.di;

import Sc.InterfaceC4008j;
import Sc.k;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.account.di.AccountComponentApi;
import ru.ozon.app.android.composer.throttle.HandlersInhibitor;
import ru.ozon.app.android.csma.api.ComposerActionApi;
import ru.ozon.app.android.network.di.NetworkComponentApi;
import ru.ozon.app.android.rfbs.deliverycomplain.presentation.ComplainViewModel;

@Metadata(d1 = {"\u00001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R#\u0010\u000e\u001a\n \t*\u0004\u0018\u00010\b0\b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001b\u0010\u0013\u001a\u00020\u000f8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u000b\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0017\u001a\u00020\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"ru/ozon/app/android/rfbs/deliverycomplain/di/DeliveryComplainWidgetComponent$Companion$create$1", "Lru/ozon/app/android/rfbs/deliverycomplain/di/DeliveryComplainWidgetComponent;", "Lru/ozon/app/android/account/di/AccountComponentApi;", "accountComponentApi", "Lru/ozon/app/android/account/di/AccountComponentApi;", "Lru/ozon/app/android/network/di/NetworkComponentApi;", "networkComponentApi", "Lru/ozon/app/android/network/di/NetworkComponentApi;", "Lru/ozon/app/android/csma/api/ComposerActionApi;", "kotlin.jvm.PlatformType", "composerActionApi$delegate", "LSc/j;", "getComposerActionApi", "()Lru/ozon/app/android/csma/api/ComposerActionApi;", "composerActionApi", "Lru/ozon/app/android/composer/throttle/HandlersInhibitor;", "handlersInhibitor$delegate", "getHandlersInhibitor", "()Lru/ozon/app/android/composer/throttle/HandlersInhibitor;", "handlersInhibitor", "Lru/ozon/app/android/rfbs/deliverycomplain/presentation/ComplainViewModel;", "getViewModel", "()Lru/ozon/app/android/rfbs/deliverycomplain/presentation/ComplainViewModel;", "viewModel", "cs-orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class DeliveryComplainWidgetComponent$Companion$create$1 implements DeliveryComplainWidgetComponent {
    private final AccountComponentApi accountComponentApi;

    /* renamed from: composerActionApi$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j composerActionApi = k.b(new DeliveryComplainWidgetComponent$Companion$create$1$composerActionApi$2(this));

    /* renamed from: handlersInhibitor$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j handlersInhibitor = k.b(DeliveryComplainWidgetComponent$Companion$create$1$handlersInhibitor$2.INSTANCE);
    private final NetworkComponentApi networkComponentApi;

    DeliveryComplainWidgetComponent$Companion$create$1(C7475g c7475g) {
        this.accountComponentApi = (AccountComponentApi) c7475g.getComponent(AccountComponentApi.class);
        this.networkComponentApi = (NetworkComponentApi) c7475g.getComponent(NetworkComponentApi.class);
    }

    private final ComposerActionApi getComposerActionApi() {
        return (ComposerActionApi) this.composerActionApi.getValue();
    }

    @Override // ru.ozon.app.android.rfbs.deliverycomplain.di.DeliveryComplainWidgetComponent
    public HandlersInhibitor getHandlersInhibitor() {
        return (HandlersInhibitor) this.handlersInhibitor.getValue();
    }

    @Override // ru.ozon.app.android.rfbs.deliverycomplain.di.DeliveryComplainWidgetComponent
    public ComplainViewModel getViewModel() {
        ComposerActionApi composerActionApi = getComposerActionApi();
        Intrinsics.checkNotNullExpressionValue(composerActionApi, "<get-composerActionApi>(...)");
        return new ComplainViewModel(composerActionApi, this.accountComponentApi.getOrderChangePreferences());
    }
}
