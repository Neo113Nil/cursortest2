package ru.ozon.app.android.ugc.core.widgets.singlereview.actionsFooter;

import Pc.a;
import Sc.InterfaceC4008j;
import Sc.k;
import Vg.c;
import Yx.b;
import k20.C7475g;
import kotlin.Metadata;
import ru.ozon.app.android.action.custom.di.CustomActionHandlersComponentApi;
import ru.ozon.app.android.composer.throttle.HandlersInhibitor;
import ru.ozon.app.android.network.di.NetworkComponentApi;
import ru.ozon.app.android.ugc.core.widgets.common.UgcCachedActionsSharedViewModel;

@Metadata(d1 = {"\u0000E\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u001b\u0010\n\u001a\u00020\u00058VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001b\u0010\u000f\u001a\u00020\u000b8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\u0007\u001a\u0004\b\r\u0010\u000eR\u001b\u0010\u0014\u001a\u00020\u00108VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0007\u001a\u0004\b\u0012\u0010\u0013R\u001b\u0010\u0019\u001a\u00020\u00158VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0007\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u001a\u0010!\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 ¨\u0006\""}, d2 = {"ru/ozon/app/android/ugc/core/widgets/singlereview/actionsFooter/ActionsFooterComponent$Companion$create$1$1", "Lru/ozon/app/android/ugc/core/widgets/singlereview/actionsFooter/ActionsFooterComponent;", "Lru/ozon/app/android/network/di/NetworkComponentApi;", "networkComponentApi", "Lru/ozon/app/android/network/di/NetworkComponentApi;", "Lru/ozon/app/android/ugc/core/widgets/singlereview/actionsFooter/ActionsFooterMapper;", "actionsFooterMapper$delegate", "LSc/j;", "getActionsFooterMapper", "()Lru/ozon/app/android/ugc/core/widgets/singlereview/actionsFooter/ActionsFooterMapper;", "actionsFooterMapper", "Lru/ozon/app/android/composer/throttle/HandlersInhibitor;", "handlersInhibitor$delegate", "getHandlersInhibitor", "()Lru/ozon/app/android/composer/throttle/HandlersInhibitor;", "handlersInhibitor", "", "actionsFooterViewModel$delegate", "getActionsFooterViewModel", "()Ljava/lang/Object;", "actionsFooterViewModel", "LVg/c;", "customActionHandlersStore$delegate", "getCustomActionHandlersStore", "()LVg/c;", "customActionHandlersStore", "Lru/ozon/app/android/action/custom/di/CustomActionHandlersComponentApi;", "customActionHandlersComponentApi", "Lru/ozon/app/android/action/custom/di/CustomActionHandlersComponentApi;", "LPc/a;", "Lru/ozon/app/android/ugc/core/widgets/common/UgcCachedActionsSharedViewModel;", "getUgcCachedActionsSharedViewModel", "()LPc/a;", "ugcCachedActionsSharedViewModel", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ActionsFooterComponent$Companion$create$1$1 implements ActionsFooterComponent {

    /* renamed from: actionsFooterViewModel$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j actionsFooterViewModel;
    private final CustomActionHandlersComponentApi customActionHandlersComponentApi;
    private final NetworkComponentApi networkComponentApi;

    /* renamed from: actionsFooterMapper$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j actionsFooterMapper = k.b(ActionsFooterComponent$Companion$create$1$1$actionsFooterMapper$2.INSTANCE);

    /* renamed from: handlersInhibitor$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j handlersInhibitor = k.b(ActionsFooterComponent$Companion$create$1$1$handlersInhibitor$2.INSTANCE);

    /* renamed from: customActionHandlersStore$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j customActionHandlersStore = k.b(new ActionsFooterComponent$Companion$create$1$1$customActionHandlersStore$2(this));

    ActionsFooterComponent$Companion$create$1$1(C7475g c7475g) {
        this.networkComponentApi = (NetworkComponentApi) c7475g.getComponent(NetworkComponentApi.class);
        this.actionsFooterViewModel = k.b(new ActionsFooterComponent$Companion$create$1$1$actionsFooterViewModel$2(c7475g));
        this.customActionHandlersComponentApi = (CustomActionHandlersComponentApi) c7475g.getComponent(CustomActionHandlersComponentApi.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final UgcCachedActionsSharedViewModel _get_ugcCachedActionsSharedViewModel_$lambda$0() {
        return new UgcCachedActionsSharedViewModel();
    }

    @Override // ru.ozon.app.android.ugc.core.widgets.singlereview.actionsFooter.ActionsFooterComponent
    public ActionsFooterMapper getActionsFooterMapper() {
        return (ActionsFooterMapper) this.actionsFooterMapper.getValue();
    }

    @Override // ru.ozon.app.android.ugc.core.widgets.singlereview.actionsFooter.ActionsFooterComponent
    public c getCustomActionHandlersStore() {
        return (c) this.customActionHandlersStore.getValue();
    }

    @Override // ru.ozon.app.android.ugc.core.widgets.singlereview.actionsFooter.ActionsFooterComponent
    public HandlersInhibitor getHandlersInhibitor() {
        return (HandlersInhibitor) this.handlersInhibitor.getValue();
    }

    @Override // ru.ozon.app.android.ugc.core.widgets.singlereview.actionsFooter.ActionsFooterComponent
    public a<UgcCachedActionsSharedViewModel> getUgcCachedActionsSharedViewModel() {
        return new b(1);
    }
}
