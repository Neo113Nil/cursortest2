package ru.ozon.app.android.returns.creation.widgets.orders.di;

import Sc.InterfaceC4008j;
import Sc.k;
import Vg.d;
import android.content.Context;
import gi.C6739a;
import gi.C6740b;
import hi.InterfaceC6958a;
import kotlin.Metadata;
import ru.ozon.app.android.action.custom.di.CustomActionHandlersComponentApi;
import ru.ozon.app.android.action.di.ActionComponentApi;
import ru.ozon.app.android.action.v2.ActionV2Repository;
import ru.ozon.app.android.network.di.NetworkComponentApi;
import ru.ozon.app.android.returns.creation.widgets.orders.presentation.pagination.viewMapper.PaginationMapper;

@Metadata(d1 = {"\u0000E\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u001b\u0010\r\u001a\u00020\b8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001b\u0010\u0012\u001a\u00020\u000e8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\n\u001a\u0004\b\u0010\u0010\u0011R\u001f\u0010\u0018\u001a\u00060\u0013j\u0002`\u00148VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\n\u001a\u0004\b\u0016\u0010\u0017R\u001b\u0010\u001d\u001a\u00020\u00198VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\n\u001a\u0004\b\u001b\u0010\u001cR\u001a\u0010\u001f\u001a\u00020\u001e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"¨\u0006#"}, d2 = {"ru/ozon/app/android/returns/creation/widgets/orders/di/ReturnCreationOrdersComponent$Companion$create$1$1", "Lru/ozon/app/android/returns/creation/widgets/orders/di/ReturnCreationOrdersComponent;", "Lru/ozon/app/android/action/custom/di/CustomActionHandlersComponentApi;", "customActionHandlersComponentApi", "Lru/ozon/app/android/action/custom/di/CustomActionHandlersComponentApi;", "Lru/ozon/app/android/network/di/NetworkComponentApi;", "networkComponentApi", "Lru/ozon/app/android/network/di/NetworkComponentApi;", "Lru/ozon/app/android/returns/ui/molecules/opencloud/presentation/viewMapper/OpenCloudMapper;", "openCloudMapper$delegate", "LSc/j;", "getOpenCloudMapper", "()Lru/ozon/app/android/returns/ui/molecules/opencloud/presentation/viewMapper/OpenCloudMapper;", "openCloudMapper", "Lru/ozon/app/android/returns/creation/widgets/orders/presentation/pagination/viewMapper/PaginationMapper;", "paginationMapper$delegate", "getPaginationMapper", "()Lru/ozon/app/android/returns/creation/widgets/orders/presentation/pagination/viewMapper/PaginationMapper;", "paginationMapper", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "customActionHandlersStoreFactory$delegate", "getCustomActionHandlersStoreFactory", "()LVg/d;", "customActionHandlersStoreFactory", "Lru/ozon/app/android/returns/ui/domain/PostRefreshHandlerFactory;", "postRefreshHandlerFactory$delegate", "getPostRefreshHandlerFactory", "()Lru/ozon/app/android/returns/ui/domain/PostRefreshHandlerFactory;", "postRefreshHandlerFactory", "Lru/ozon/app/android/action/v2/ActionV2Repository;", "actionV2Repository", "Lru/ozon/app/android/action/v2/ActionV2Repository;", "getActionV2Repository", "()Lru/ozon/app/android/action/v2/ActionV2Repository;", "creation_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ReturnCreationOrdersComponent$Companion$create$1$1 implements ReturnCreationOrdersComponent {
    private final ActionV2Repository actionV2Repository;
    private final CustomActionHandlersComponentApi customActionHandlersComponentApi;

    /* renamed from: customActionHandlersStoreFactory$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j customActionHandlersStoreFactory;
    private final NetworkComponentApi networkComponentApi;

    /* renamed from: openCloudMapper$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j openCloudMapper;

    /* renamed from: paginationMapper$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j paginationMapper;

    /* renamed from: postRefreshHandlerFactory$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j postRefreshHandlerFactory;

    ReturnCreationOrdersComponent$Companion$create$1$1(Context context) {
        if (CustomActionHandlersComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component CustomActionHandlersComponentApi is not DiComponent");
        }
        C6740b dependencyStorage = C6739a.a(context, CustomActionHandlersComponentApi.class).getDependencyStorage();
        if (CustomActionHandlersComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component CustomActionHandlersComponentApi is not DiComponent");
        }
        this.customActionHandlersComponentApi = (CustomActionHandlersComponentApi) dependencyStorage.b(CustomActionHandlersComponentApi.class);
        if (NetworkComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component NetworkComponentApi is not DiComponent");
        }
        C6740b dependencyStorage2 = C6739a.a(context, NetworkComponentApi.class).getDependencyStorage();
        if (NetworkComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component NetworkComponentApi is not DiComponent");
        }
        this.networkComponentApi = (NetworkComponentApi) dependencyStorage2.b(NetworkComponentApi.class);
        this.openCloudMapper = k.b(ReturnCreationOrdersComponent$Companion$create$1$1$openCloudMapper$2.INSTANCE);
        this.paginationMapper = k.b(ReturnCreationOrdersComponent$Companion$create$1$1$paginationMapper$2.INSTANCE);
        this.customActionHandlersStoreFactory = k.b(new ReturnCreationOrdersComponent$Companion$create$1$1$customActionHandlersStoreFactory$2(this));
        this.postRefreshHandlerFactory = k.b(new ReturnCreationOrdersComponent$Companion$create$1$1$postRefreshHandlerFactory$2(this));
        if (ActionComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component ActionComponentApi is not DiComponent");
        }
        C6740b dependencyStorage3 = C6739a.a(context, ActionComponentApi.class).getDependencyStorage();
        if (ActionComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component ActionComponentApi is not DiComponent");
        }
        this.actionV2Repository = ((ActionComponentApi) dependencyStorage3.b(ActionComponentApi.class)).getActionRepository();
    }

    @Override // ru.ozon.app.android.returns.creation.widgets.orders.di.ReturnCreationOrdersComponent
    public ActionV2Repository getActionV2Repository() {
        return this.actionV2Repository;
    }

    @Override // ru.ozon.app.android.returns.creation.widgets.orders.di.ReturnCreationOrdersComponent
    public d getCustomActionHandlersStoreFactory() {
        return (d) this.customActionHandlersStoreFactory.getValue();
    }

    @Override // ru.ozon.app.android.returns.creation.widgets.orders.di.ReturnCreationOrdersComponent
    public PaginationMapper getPaginationMapper() {
        return (PaginationMapper) this.paginationMapper.getValue();
    }
}
