package ru.ozon.app.android.cml.delivery.widgets.boxList.di;

import Pc.a;
import Sc.InterfaceC4008j;
import Sc.k;
import Vg.d;
import WZ.l;
import kotlin.Metadata;
import ru.ozon.app.android.action.custom.di.CustomActionHandlersComponentApi;
import ru.ozon.app.android.cml.delivery.widgets.boxList.data.BoxListMapper;
import ru.ozon.app.android.cml.delivery.widgets.boxList.presentation.BoxListViewModel;
import ru.ozon.app.android.composer.di.composer.RetainComposerComponentApi;
import ru.ozon.app.android.composer.throttle.HandlersInhibitor;

@Metadata(d1 = {"\u00009\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\r\u001a\u00020\b8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001b\u0010\u0012\u001a\u00020\u000e8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\n\u001a\u0004\b\u0010\u0010\u0011R\u0018\u0010\u0017\u001a\u00060\u0013j\u0002`\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u001b\u001a\u00020\u00188VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, d2 = {"ru/ozon/app/android/cml/delivery/widgets/boxList/di/BoxListComponent$Companion$create$1$1", "Lru/ozon/app/android/cml/delivery/widgets/boxList/di/BoxListComponent;", "LPc/a;", "Lru/ozon/app/android/cml/delivery/widgets/boxList/presentation/BoxListViewModel;", "boxListViewModelProvider", "LPc/a;", "getBoxListViewModelProvider", "()LPc/a;", "Lru/ozon/app/android/cml/delivery/widgets/boxList/data/BoxListMapper;", "boxListMapper$delegate", "LSc/j;", "getBoxListMapper", "()Lru/ozon/app/android/cml/delivery/widgets/boxList/data/BoxListMapper;", "boxListMapper", "Lru/ozon/app/android/composer/throttle/HandlersInhibitor;", "handlersInhibitor$delegate", "getHandlersInhibitor", "()Lru/ozon/app/android/composer/throttle/HandlersInhibitor;", "handlersInhibitor", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "getActionHandlersStoreFactory", "()LVg/d;", "actionHandlersStoreFactory", "LWZ/l;", "getTokenizedAnalytics", "()LWZ/l;", "tokenizedAnalytics", "delivery_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class BoxListComponent$Companion$create$1$1 implements BoxListComponent {
    final /* synthetic */ CustomActionHandlersComponentApi $actionHandlersApi;
    final /* synthetic */ RetainComposerComponentApi $retainComposerApi;
    private final a<BoxListViewModel> boxListViewModelProvider = new Hp.a(0);

    /* renamed from: boxListMapper$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j boxListMapper = k.b(BoxListComponent$Companion$create$1$1$boxListMapper$2.INSTANCE);

    /* renamed from: handlersInhibitor$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j handlersInhibitor = k.b(BoxListComponent$Companion$create$1$1$handlersInhibitor$2.INSTANCE);

    BoxListComponent$Companion$create$1$1(CustomActionHandlersComponentApi customActionHandlersComponentApi, RetainComposerComponentApi retainComposerComponentApi) {
        this.$actionHandlersApi = customActionHandlersComponentApi;
        this.$retainComposerApi = retainComposerComponentApi;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BoxListViewModel boxListViewModelProvider$lambda$0() {
        return new BoxListViewModel();
    }

    @Override // ru.ozon.app.android.cml.delivery.widgets.boxList.di.BoxListComponent
    public d getActionHandlersStoreFactory() {
        return this.$actionHandlersApi.getCustomActionHandlersStoreFactory();
    }

    @Override // ru.ozon.app.android.cml.delivery.widgets.boxList.di.BoxListComponent
    public BoxListMapper getBoxListMapper() {
        return (BoxListMapper) this.boxListMapper.getValue();
    }

    @Override // ru.ozon.app.android.cml.delivery.widgets.boxList.di.BoxListComponent
    public a<BoxListViewModel> getBoxListViewModelProvider() {
        return this.boxListViewModelProvider;
    }

    @Override // ru.ozon.app.android.cml.delivery.widgets.boxList.di.BoxListComponent
    public HandlersInhibitor getHandlersInhibitor() {
        return (HandlersInhibitor) this.handlersInhibitor.getValue();
    }

    @Override // ru.ozon.app.android.cml.delivery.widgets.boxList.di.BoxListComponent
    public l getTokenizedAnalytics() {
        return this.$retainComposerApi.getTokenizedAnalytics();
    }
}
