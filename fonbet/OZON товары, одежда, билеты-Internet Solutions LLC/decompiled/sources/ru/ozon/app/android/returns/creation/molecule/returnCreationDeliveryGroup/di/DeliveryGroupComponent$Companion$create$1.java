package ru.ozon.app.android.returns.creation.molecule.returnCreationDeliveryGroup.di;

import Sc.InterfaceC4008j;
import Sc.k;
import Vg.d;
import k20.C7475g;
import kotlin.Metadata;
import ru.ozon.app.android.action.custom.di.CustomActionHandlersComponentApi;
import ru.ozon.app.android.network.di.NetworkComponentApi;
import ru.ozon.app.android.returns.creation.molecule.returnCreationDeliveryGroup.presentation.delivery.viewMapper.ReturnCreationDeliveryMapper;
import ru.ozon.app.android.returns.creation.molecule.returnCreationDeliveryGroup.presentation.group.viewMapper.ReturnCreationGroupMapper;
import ru.ozon.app.android.returns.creation.molecule.returnCreationDeliveryGroup.presentation.product.viewMapper.ReturnCreationItemMapper;
import ru.ozon.app.android.returns.ui.domain.PostRefreshHandlerFactory;

@Metadata(d1 = {"\u0000E\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u001b\u0010\r\u001a\u00020\b8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001b\u0010\u0012\u001a\u00020\u000e8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\n\u001a\u0004\b\u0010\u0010\u0011R\u001b\u0010\u0017\u001a\u00020\u00138VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\n\u001a\u0004\b\u0015\u0010\u0016R\u001b\u0010\u001c\u001a\u00020\u00188VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\n\u001a\u0004\b\u001a\u0010\u001bR\u0018\u0010!\u001a\u00060\u001dj\u0002`\u001e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 ¨\u0006\""}, d2 = {"ru/ozon/app/android/returns/creation/molecule/returnCreationDeliveryGroup/di/DeliveryGroupComponent$Companion$create$1", "Lru/ozon/app/android/returns/creation/molecule/returnCreationDeliveryGroup/di/DeliveryGroupComponent;", "Lru/ozon/app/android/action/custom/di/CustomActionHandlersComponentApi;", "customActionHandlersComponentApi", "Lru/ozon/app/android/action/custom/di/CustomActionHandlersComponentApi;", "Lru/ozon/app/android/network/di/NetworkComponentApi;", "networkComponentApi", "Lru/ozon/app/android/network/di/NetworkComponentApi;", "Lru/ozon/app/android/returns/creation/molecule/returnCreationDeliveryGroup/presentation/delivery/viewMapper/ReturnCreationDeliveryMapper;", "deliveryMapper$delegate", "LSc/j;", "getDeliveryMapper", "()Lru/ozon/app/android/returns/creation/molecule/returnCreationDeliveryGroup/presentation/delivery/viewMapper/ReturnCreationDeliveryMapper;", "deliveryMapper", "Lru/ozon/app/android/returns/creation/molecule/returnCreationDeliveryGroup/presentation/group/viewMapper/ReturnCreationGroupMapper;", "deliveryGroupMapper$delegate", "getDeliveryGroupMapper", "()Lru/ozon/app/android/returns/creation/molecule/returnCreationDeliveryGroup/presentation/group/viewMapper/ReturnCreationGroupMapper;", "deliveryGroupMapper", "Lru/ozon/app/android/returns/creation/molecule/returnCreationDeliveryGroup/presentation/product/viewMapper/ReturnCreationItemMapper;", "itemMapper$delegate", "getItemMapper", "()Lru/ozon/app/android/returns/creation/molecule/returnCreationDeliveryGroup/presentation/product/viewMapper/ReturnCreationItemMapper;", "itemMapper", "Lru/ozon/app/android/returns/ui/domain/PostRefreshHandlerFactory;", "postRefreshHandlerFactory$delegate", "getPostRefreshHandlerFactory", "()Lru/ozon/app/android/returns/ui/domain/PostRefreshHandlerFactory;", "postRefreshHandlerFactory", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "getCustomActionHandlersStoreFactory", "()LVg/d;", "customActionHandlersStoreFactory", "creation_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class DeliveryGroupComponent$Companion$create$1 implements DeliveryGroupComponent {
    private final CustomActionHandlersComponentApi customActionHandlersComponentApi;
    private final NetworkComponentApi networkComponentApi;

    /* renamed from: deliveryMapper$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j deliveryMapper = k.b(DeliveryGroupComponent$Companion$create$1$deliveryMapper$2.INSTANCE);

    /* renamed from: deliveryGroupMapper$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j deliveryGroupMapper = k.b(DeliveryGroupComponent$Companion$create$1$deliveryGroupMapper$2.INSTANCE);

    /* renamed from: itemMapper$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j itemMapper = k.b(DeliveryGroupComponent$Companion$create$1$itemMapper$2.INSTANCE);

    /* renamed from: postRefreshHandlerFactory$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j postRefreshHandlerFactory = k.b(new DeliveryGroupComponent$Companion$create$1$postRefreshHandlerFactory$2(this));

    DeliveryGroupComponent$Companion$create$1(C7475g c7475g) {
        this.customActionHandlersComponentApi = (CustomActionHandlersComponentApi) c7475g.getComponent(CustomActionHandlersComponentApi.class);
        this.networkComponentApi = (NetworkComponentApi) c7475g.getComponent(NetworkComponentApi.class);
    }

    @Override // ru.ozon.app.android.returns.creation.molecule.returnCreationDeliveryGroup.di.DeliveryGroupComponent
    public d getCustomActionHandlersStoreFactory() {
        return this.customActionHandlersComponentApi.getCustomActionHandlersStoreFactory();
    }

    @Override // ru.ozon.app.android.returns.creation.molecule.returnCreationDeliveryGroup.di.DeliveryGroupComponent
    public ReturnCreationGroupMapper getDeliveryGroupMapper() {
        return (ReturnCreationGroupMapper) this.deliveryGroupMapper.getValue();
    }

    @Override // ru.ozon.app.android.returns.creation.molecule.returnCreationDeliveryGroup.di.DeliveryGroupComponent
    public ReturnCreationDeliveryMapper getDeliveryMapper() {
        return (ReturnCreationDeliveryMapper) this.deliveryMapper.getValue();
    }

    @Override // ru.ozon.app.android.returns.creation.molecule.returnCreationDeliveryGroup.di.DeliveryGroupComponent
    public ReturnCreationItemMapper getItemMapper() {
        return (ReturnCreationItemMapper) this.itemMapper.getValue();
    }

    @Override // ru.ozon.app.android.returns.creation.molecule.returnCreationDeliveryGroup.di.DeliveryGroupComponent
    public PostRefreshHandlerFactory getPostRefreshHandlerFactory() {
        return (PostRefreshHandlerFactory) this.postRefreshHandlerFactory.getValue();
    }
}
