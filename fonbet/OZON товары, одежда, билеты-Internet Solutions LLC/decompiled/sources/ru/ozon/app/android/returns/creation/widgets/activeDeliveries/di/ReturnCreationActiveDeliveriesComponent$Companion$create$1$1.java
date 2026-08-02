package ru.ozon.app.android.returns.creation.widgets.activeDeliveries.di;

import Sc.InterfaceC4008j;
import Sc.k;
import Vg.d;
import android.content.Context;
import gi.C6739a;
import gi.C6740b;
import hi.InterfaceC6958a;
import k20.C7475g;
import kotlin.Metadata;
import ru.ozon.app.android.account.adult.presenter.AdultListDelegateProvider;
import ru.ozon.app.android.account.di.AccountComponentApi;
import ru.ozon.app.android.action.custom.di.CustomActionHandlersComponentApi;
import ru.ozon.app.android.composer.widgets.v2.di.ComposerWidgetComponentStorageKt;
import ru.ozon.app.android.network.di.NetworkComponentApi;
import ru.ozon.app.android.platform.di.AndroidPlatformComponentDependencies;
import ru.ozon.app.android.returns.creation.widgets.activeDeliveries.presentation.element.viewMapper.ElementMapper;
import ru.ozon.app.android.returns.creation.widgets.activeDeliveries.presentation.header.viewMapper.HeaderMapper;
import ru.ozon.app.android.returns.creation.widgets.activeDeliveries.presentation.sticky.viewMapper.StickyMapper;
import ru.ozon.app.android.returns.ui.domain.PostRefreshHandlerFactory;
import ru.ozon.app.android.utils.AppType;

@Metadata(d1 = {"\u0000]\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u001b\u0010\u0010\u001a\u00020\u000b8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0015\u001a\u00020\u00118VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\r\u001a\u0004\b\u0013\u0010\u0014R\u001b\u0010\u001a\u001a\u00020\u00168VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\r\u001a\u0004\b\u0018\u0010\u0019R\u001f\u0010 \u001a\u00060\u001bj\u0002`\u001c8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\r\u001a\u0004\b\u001e\u0010\u001fR\u001b\u0010%\u001a\u00020!8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\"\u0010\r\u001a\u0004\b#\u0010$R\u001b\u0010*\u001a\u00020&8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b'\u0010\r\u001a\u0004\b(\u0010)R\u001a\u0010,\u001a\u00020+8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/¨\u00060"}, d2 = {"ru/ozon/app/android/returns/creation/widgets/activeDeliveries/di/ReturnCreationActiveDeliveriesComponent$Companion$create$1$1", "Lru/ozon/app/android/returns/creation/widgets/activeDeliveries/di/ReturnCreationActiveDeliveriesComponent;", "Lru/ozon/app/android/account/di/AccountComponentApi;", "accountComponentApi", "Lru/ozon/app/android/account/di/AccountComponentApi;", "Lru/ozon/app/android/action/custom/di/CustomActionHandlersComponentApi;", "customActionHandlersComponentApi", "Lru/ozon/app/android/action/custom/di/CustomActionHandlersComponentApi;", "Lru/ozon/app/android/network/di/NetworkComponentApi;", "networkComponentApi", "Lru/ozon/app/android/network/di/NetworkComponentApi;", "Lru/ozon/app/android/returns/creation/widgets/activeDeliveries/presentation/header/viewMapper/HeaderMapper;", "headerMapper$delegate", "LSc/j;", "getHeaderMapper", "()Lru/ozon/app/android/returns/creation/widgets/activeDeliveries/presentation/header/viewMapper/HeaderMapper;", "headerMapper", "Lru/ozon/app/android/returns/creation/widgets/activeDeliveries/presentation/element/viewMapper/ElementMapper;", "elementMapper$delegate", "getElementMapper", "()Lru/ozon/app/android/returns/creation/widgets/activeDeliveries/presentation/element/viewMapper/ElementMapper;", "elementMapper", "Lru/ozon/app/android/returns/creation/widgets/activeDeliveries/presentation/sticky/viewMapper/StickyMapper;", "stickyMapper$delegate", "getStickyMapper", "()Lru/ozon/app/android/returns/creation/widgets/activeDeliveries/presentation/sticky/viewMapper/StickyMapper;", "stickyMapper", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "customActionHandlersStoreFactory$delegate", "getCustomActionHandlersStoreFactory", "()LVg/d;", "customActionHandlersStoreFactory", "Lru/ozon/app/android/returns/ui/domain/PostRefreshHandlerFactory;", "postRefreshHandlerFactory$delegate", "getPostRefreshHandlerFactory", "()Lru/ozon/app/android/returns/ui/domain/PostRefreshHandlerFactory;", "postRefreshHandlerFactory", "Lru/ozon/app/android/account/adult/presenter/AdultListDelegateProvider;", "adultListDelegateProvider$delegate", "getAdultListDelegateProvider", "()Lru/ozon/app/android/account/adult/presenter/AdultListDelegateProvider;", "adultListDelegateProvider", "Lru/ozon/app/android/utils/AppType;", "appType", "Lru/ozon/app/android/utils/AppType;", "getAppType", "()Lru/ozon/app/android/utils/AppType;", "creation_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ReturnCreationActiveDeliveriesComponent$Companion$create$1$1 implements ReturnCreationActiveDeliveriesComponent {
    private final AccountComponentApi accountComponentApi;

    /* renamed from: adultListDelegateProvider$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j adultListDelegateProvider;
    private final AppType appType;
    private final CustomActionHandlersComponentApi customActionHandlersComponentApi;

    /* renamed from: customActionHandlersStoreFactory$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j customActionHandlersStoreFactory;

    /* renamed from: elementMapper$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j elementMapper;

    /* renamed from: headerMapper$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j headerMapper;
    private final NetworkComponentApi networkComponentApi;

    /* renamed from: postRefreshHandlerFactory$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j postRefreshHandlerFactory;

    /* renamed from: stickyMapper$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j stickyMapper;

    ReturnCreationActiveDeliveriesComponent$Companion$create$1$1(C7475g c7475g) {
        Context context = ComposerWidgetComponentStorageKt.getContext(c7475g);
        if (AccountComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component AccountComponentApi is not DiComponent");
        }
        C6740b dependencyStorage = C6739a.a(context, AccountComponentApi.class).getDependencyStorage();
        if (AccountComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component AccountComponentApi is not DiComponent");
        }
        this.accountComponentApi = (AccountComponentApi) dependencyStorage.b(AccountComponentApi.class);
        Context context2 = ComposerWidgetComponentStorageKt.getContext(c7475g);
        if (CustomActionHandlersComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component CustomActionHandlersComponentApi is not DiComponent");
        }
        C6740b dependencyStorage2 = C6739a.a(context2, CustomActionHandlersComponentApi.class).getDependencyStorage();
        if (CustomActionHandlersComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component CustomActionHandlersComponentApi is not DiComponent");
        }
        this.customActionHandlersComponentApi = (CustomActionHandlersComponentApi) dependencyStorage2.b(CustomActionHandlersComponentApi.class);
        Context context3 = ComposerWidgetComponentStorageKt.getContext(c7475g);
        if (NetworkComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component NetworkComponentApi is not DiComponent");
        }
        C6740b dependencyStorage3 = C6739a.a(context3, NetworkComponentApi.class).getDependencyStorage();
        if (NetworkComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component NetworkComponentApi is not DiComponent");
        }
        this.networkComponentApi = (NetworkComponentApi) dependencyStorage3.b(NetworkComponentApi.class);
        this.headerMapper = k.b(ReturnCreationActiveDeliveriesComponent$Companion$create$1$1$headerMapper$2.INSTANCE);
        this.elementMapper = k.b(ReturnCreationActiveDeliveriesComponent$Companion$create$1$1$elementMapper$2.INSTANCE);
        this.stickyMapper = k.b(ReturnCreationActiveDeliveriesComponent$Companion$create$1$1$stickyMapper$2.INSTANCE);
        this.customActionHandlersStoreFactory = k.b(new ReturnCreationActiveDeliveriesComponent$Companion$create$1$1$customActionHandlersStoreFactory$2(this));
        this.postRefreshHandlerFactory = k.b(new ReturnCreationActiveDeliveriesComponent$Companion$create$1$1$postRefreshHandlerFactory$2(this));
        this.adultListDelegateProvider = k.b(new ReturnCreationActiveDeliveriesComponent$Companion$create$1$1$adultListDelegateProvider$2(this));
        this.appType = ((AndroidPlatformComponentDependencies) c7475g.getComponent(AndroidPlatformComponentDependencies.class)).getAppType();
    }

    @Override // ru.ozon.app.android.returns.creation.widgets.activeDeliveries.di.ReturnCreationActiveDeliveriesComponent
    public AdultListDelegateProvider getAdultListDelegateProvider() {
        return (AdultListDelegateProvider) this.adultListDelegateProvider.getValue();
    }

    @Override // ru.ozon.app.android.returns.creation.widgets.activeDeliveries.di.ReturnCreationActiveDeliveriesComponent
    public AppType getAppType() {
        return this.appType;
    }

    @Override // ru.ozon.app.android.returns.creation.widgets.activeDeliveries.di.ReturnCreationActiveDeliveriesComponent
    public d getCustomActionHandlersStoreFactory() {
        return (d) this.customActionHandlersStoreFactory.getValue();
    }

    @Override // ru.ozon.app.android.returns.creation.widgets.activeDeliveries.di.ReturnCreationActiveDeliveriesComponent
    public ElementMapper getElementMapper() {
        return (ElementMapper) this.elementMapper.getValue();
    }

    @Override // ru.ozon.app.android.returns.creation.widgets.activeDeliveries.di.ReturnCreationActiveDeliveriesComponent
    public HeaderMapper getHeaderMapper() {
        return (HeaderMapper) this.headerMapper.getValue();
    }

    @Override // ru.ozon.app.android.returns.creation.widgets.activeDeliveries.di.ReturnCreationActiveDeliveriesComponent
    public PostRefreshHandlerFactory getPostRefreshHandlerFactory() {
        return (PostRefreshHandlerFactory) this.postRefreshHandlerFactory.getValue();
    }

    @Override // ru.ozon.app.android.returns.creation.widgets.activeDeliveries.di.ReturnCreationActiveDeliveriesComponent
    public StickyMapper getStickyMapper() {
        return (StickyMapper) this.stickyMapper.getValue();
    }
}
