package ru.ozon.app.android.returns.ui.molecules.opencloud.di;

import Sc.InterfaceC4008j;
import Sc.k;
import Vg.d;
import k20.C7475g;
import kotlin.Metadata;
import ru.ozon.app.android.action.custom.di.CustomActionHandlersComponentApi;
import ru.ozon.app.android.action.di.ActionComponentApi;
import ru.ozon.app.android.action.v2.ActionV2Repository;
import ru.ozon.app.android.network.di.NetworkComponentApi;
import ru.ozon.app.android.returns.ui.domain.PostRefreshHandlerFactory;
import ru.ozon.app.android.returns.ui.molecules.opencloud.presentation.viewMapper.OpenCloudMapper;

@Metadata(d1 = {"\u0000E\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u001b\u0010\u0010\u001a\u00020\u000b8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0015\u001a\u00020\u00118VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\r\u001a\u0004\b\u0013\u0010\u0014R\u0018\u0010\u001a\u001a\u00060\u0016j\u0002`\u00178VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001e\u001a\u00020\u001b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001f"}, d2 = {"ru/ozon/app/android/returns/ui/molecules/opencloud/di/OpenCloudComponent$Companion$create$1", "Lru/ozon/app/android/returns/ui/molecules/opencloud/di/OpenCloudComponent;", "Lru/ozon/app/android/action/custom/di/CustomActionHandlersComponentApi;", "customActionHandlersComponentApi", "Lru/ozon/app/android/action/custom/di/CustomActionHandlersComponentApi;", "Lru/ozon/app/android/network/di/NetworkComponentApi;", "networkComponentApi", "Lru/ozon/app/android/network/di/NetworkComponentApi;", "Lru/ozon/app/android/action/di/ActionComponentApi;", "actionComponentApi", "Lru/ozon/app/android/action/di/ActionComponentApi;", "Lru/ozon/app/android/returns/ui/molecules/opencloud/presentation/viewMapper/OpenCloudMapper;", "openCloudMapper$delegate", "LSc/j;", "getOpenCloudMapper", "()Lru/ozon/app/android/returns/ui/molecules/opencloud/presentation/viewMapper/OpenCloudMapper;", "openCloudMapper", "Lru/ozon/app/android/returns/ui/domain/PostRefreshHandlerFactory;", "postRefreshHandlerFactory$delegate", "getPostRefreshHandlerFactory", "()Lru/ozon/app/android/returns/ui/domain/PostRefreshHandlerFactory;", "postRefreshHandlerFactory", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "getCustomActionHandlersStoreFactory", "()LVg/d;", "customActionHandlersStoreFactory", "Lru/ozon/app/android/action/v2/ActionV2Repository;", "getActionV2Repository", "()Lru/ozon/app/android/action/v2/ActionV2Repository;", "actionV2Repository", "returns_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class OpenCloudComponent$Companion$create$1 implements OpenCloudComponent {
    private final ActionComponentApi actionComponentApi;
    private final CustomActionHandlersComponentApi customActionHandlersComponentApi;
    private final NetworkComponentApi networkComponentApi;

    /* renamed from: openCloudMapper$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j openCloudMapper = k.b(OpenCloudComponent$Companion$create$1$openCloudMapper$2.INSTANCE);

    /* renamed from: postRefreshHandlerFactory$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j postRefreshHandlerFactory = k.b(new OpenCloudComponent$Companion$create$1$postRefreshHandlerFactory$2(this));

    OpenCloudComponent$Companion$create$1(C7475g c7475g) {
        this.customActionHandlersComponentApi = (CustomActionHandlersComponentApi) c7475g.getComponent(CustomActionHandlersComponentApi.class);
        this.networkComponentApi = (NetworkComponentApi) c7475g.getComponent(NetworkComponentApi.class);
        this.actionComponentApi = (ActionComponentApi) c7475g.getComponent(ActionComponentApi.class);
    }

    @Override // ru.ozon.app.android.returns.ui.molecules.opencloud.di.OpenCloudComponent
    public ActionV2Repository getActionV2Repository() {
        return this.actionComponentApi.getActionRepository();
    }

    @Override // ru.ozon.app.android.returns.ui.molecules.opencloud.di.OpenCloudComponent
    public d getCustomActionHandlersStoreFactory() {
        return this.customActionHandlersComponentApi.getCustomActionHandlersStoreFactory();
    }

    @Override // ru.ozon.app.android.returns.ui.molecules.opencloud.di.OpenCloudComponent
    public OpenCloudMapper getOpenCloudMapper() {
        return (OpenCloudMapper) this.openCloudMapper.getValue();
    }

    @Override // ru.ozon.app.android.returns.ui.molecules.opencloud.di.OpenCloudComponent
    public PostRefreshHandlerFactory getPostRefreshHandlerFactory() {
        return (PostRefreshHandlerFactory) this.postRefreshHandlerFactory.getValue();
    }
}
