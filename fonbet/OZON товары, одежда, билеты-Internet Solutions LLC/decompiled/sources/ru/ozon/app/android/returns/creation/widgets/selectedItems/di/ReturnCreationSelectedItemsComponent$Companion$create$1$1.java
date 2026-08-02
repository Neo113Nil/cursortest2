package ru.ozon.app.android.returns.creation.widgets.selectedItems.di;

import Sc.InterfaceC4008j;
import Sc.k;
import Vg.d;
import android.content.Context;
import gi.C6739a;
import gi.C6740b;
import hi.InterfaceC6958a;
import kotlin.Metadata;
import ru.ozon.app.android.action.custom.di.CustomActionHandlersComponentApi;
import ru.ozon.app.android.network.di.NetworkComponentApi;
import ru.ozon.app.android.returns.creation.widgets.selectedItems.presentation.viewMapper.ReturnCreationSelectedItemMapper;
import ru.ozon.app.android.returns.ui.di.RmsComponentApi;
import ru.ozon.app.android.returns.ui.domain.PostRefreshHandlerFactory;
import ru.ozon.app.android.returns.ui.domain.events.ReturnCreationEventManager;

@Metadata(d1 = {"\u0000E\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u001b\u0010\u0010\u001a\u00020\u000b8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0015\u001a\u00020\u00118VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\r\u001a\u0004\b\u0013\u0010\u0014R\u001f\u0010\u001b\u001a\u00060\u0016j\u0002`\u00178VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\r\u001a\u0004\b\u0019\u0010\u001aR\u001b\u0010 \u001a\u00020\u001c8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\r\u001a\u0004\b\u001e\u0010\u001f¨\u0006!"}, d2 = {"ru/ozon/app/android/returns/creation/widgets/selectedItems/di/ReturnCreationSelectedItemsComponent$Companion$create$1$1", "Lru/ozon/app/android/returns/creation/widgets/selectedItems/di/ReturnCreationSelectedItemsComponent;", "Lru/ozon/app/android/network/di/NetworkComponentApi;", "networkComponentApi", "Lru/ozon/app/android/network/di/NetworkComponentApi;", "Lru/ozon/app/android/action/custom/di/CustomActionHandlersComponentApi;", "customActionHandlersComponentApi", "Lru/ozon/app/android/action/custom/di/CustomActionHandlersComponentApi;", "Lru/ozon/app/android/returns/ui/di/RmsComponentApi;", "rmsComponentApi", "Lru/ozon/app/android/returns/ui/di/RmsComponentApi;", "Lru/ozon/app/android/returns/creation/widgets/selectedItems/presentation/viewMapper/ReturnCreationSelectedItemMapper;", "mapper$delegate", "LSc/j;", "getMapper", "()Lru/ozon/app/android/returns/creation/widgets/selectedItems/presentation/viewMapper/ReturnCreationSelectedItemMapper;", "mapper", "Lru/ozon/app/android/returns/ui/domain/PostRefreshHandlerFactory;", "postRefreshHandlerFactory$delegate", "getPostRefreshHandlerFactory", "()Lru/ozon/app/android/returns/ui/domain/PostRefreshHandlerFactory;", "postRefreshHandlerFactory", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "customActionHandlersStoreFactory$delegate", "getCustomActionHandlersStoreFactory", "()LVg/d;", "customActionHandlersStoreFactory", "Lru/ozon/app/android/returns/ui/domain/events/ReturnCreationEventManager;", "returnCreationEventManager$delegate", "getReturnCreationEventManager", "()Lru/ozon/app/android/returns/ui/domain/events/ReturnCreationEventManager;", "returnCreationEventManager", "creation_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ReturnCreationSelectedItemsComponent$Companion$create$1$1 implements ReturnCreationSelectedItemsComponent {
    private final CustomActionHandlersComponentApi customActionHandlersComponentApi;

    /* renamed from: customActionHandlersStoreFactory$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j customActionHandlersStoreFactory;

    /* renamed from: mapper$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j mapper;
    private final NetworkComponentApi networkComponentApi;

    /* renamed from: postRefreshHandlerFactory$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j postRefreshHandlerFactory;

    /* renamed from: returnCreationEventManager$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j returnCreationEventManager;
    private final RmsComponentApi rmsComponentApi;

    ReturnCreationSelectedItemsComponent$Companion$create$1$1(Context context) {
        if (NetworkComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component NetworkComponentApi is not DiComponent");
        }
        C6740b dependencyStorage = C6739a.a(context, NetworkComponentApi.class).getDependencyStorage();
        if (NetworkComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component NetworkComponentApi is not DiComponent");
        }
        this.networkComponentApi = (NetworkComponentApi) dependencyStorage.b(NetworkComponentApi.class);
        if (CustomActionHandlersComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component CustomActionHandlersComponentApi is not DiComponent");
        }
        C6740b dependencyStorage2 = C6739a.a(context, CustomActionHandlersComponentApi.class).getDependencyStorage();
        if (CustomActionHandlersComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component CustomActionHandlersComponentApi is not DiComponent");
        }
        this.customActionHandlersComponentApi = (CustomActionHandlersComponentApi) dependencyStorage2.b(CustomActionHandlersComponentApi.class);
        if (RmsComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component RmsComponentApi is not DiComponent");
        }
        C6740b dependencyStorage3 = C6739a.a(context, RmsComponentApi.class).getDependencyStorage();
        if (RmsComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component RmsComponentApi is not DiComponent");
        }
        this.rmsComponentApi = (RmsComponentApi) dependencyStorage3.b(RmsComponentApi.class);
        this.mapper = k.b(ReturnCreationSelectedItemsComponent$Companion$create$1$1$mapper$2.INSTANCE);
        this.postRefreshHandlerFactory = k.b(new ReturnCreationSelectedItemsComponent$Companion$create$1$1$postRefreshHandlerFactory$2(this));
        this.customActionHandlersStoreFactory = k.b(new ReturnCreationSelectedItemsComponent$Companion$create$1$1$customActionHandlersStoreFactory$2(this));
        this.returnCreationEventManager = k.b(new ReturnCreationSelectedItemsComponent$Companion$create$1$1$returnCreationEventManager$2(this));
    }

    @Override // ru.ozon.app.android.returns.creation.widgets.selectedItems.di.ReturnCreationSelectedItemsComponent
    public d getCustomActionHandlersStoreFactory() {
        return (d) this.customActionHandlersStoreFactory.getValue();
    }

    @Override // ru.ozon.app.android.returns.creation.widgets.selectedItems.di.ReturnCreationSelectedItemsComponent
    public ReturnCreationSelectedItemMapper getMapper() {
        return (ReturnCreationSelectedItemMapper) this.mapper.getValue();
    }

    @Override // ru.ozon.app.android.returns.creation.widgets.selectedItems.di.ReturnCreationSelectedItemsComponent
    public PostRefreshHandlerFactory getPostRefreshHandlerFactory() {
        return (PostRefreshHandlerFactory) this.postRefreshHandlerFactory.getValue();
    }

    @Override // ru.ozon.app.android.returns.creation.widgets.selectedItems.di.ReturnCreationSelectedItemsComponent
    public ReturnCreationEventManager getReturnCreationEventManager() {
        return (ReturnCreationEventManager) this.returnCreationEventManager.getValue();
    }
}
