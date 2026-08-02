package ru.ozon.app.android.orders.cml.groupButtons.di;

import Sc.InterfaceC4008j;
import Sc.k;
import Vg.d;
import WZ.l;
import k20.C7475g;
import kotlin.Metadata;
import ru.ozon.app.android.action.custom.di.CustomActionHandlersComponentApi;
import ru.ozon.app.android.composer.di.composer.RetainComposerComponentApi;
import ru.ozon.app.android.orders.cml.groupButtons.data.GroupButtonsMapper;

@Metadata(d1 = {"\u00005\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u001b\u0010\r\u001a\u00020\b8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u000f\u001a\u00020\u000e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001f\u0010\u0018\u001a\u00060\u0013j\u0002`\u00148VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\n\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"ru/ozon/app/android/orders/cml/groupButtons/di/GroupButtonsComponent$Companion$create$1$1", "Lru/ozon/app/android/orders/cml/groupButtons/di/GroupButtonsComponent;", "Lru/ozon/app/android/composer/di/composer/RetainComposerComponentApi;", "retainComposerComponentApi", "Lru/ozon/app/android/composer/di/composer/RetainComposerComponentApi;", "Lru/ozon/app/android/action/custom/di/CustomActionHandlersComponentApi;", "customActionHandlersComponentApi", "Lru/ozon/app/android/action/custom/di/CustomActionHandlersComponentApi;", "Lru/ozon/app/android/orders/cml/groupButtons/data/GroupButtonsMapper;", "mapper$delegate", "LSc/j;", "getMapper", "()Lru/ozon/app/android/orders/cml/groupButtons/data/GroupButtonsMapper;", "mapper", "LWZ/l;", "tokenizedAnalytics", "LWZ/l;", "getTokenizedAnalytics", "()LWZ/l;", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "customActionHandlersStoreFactory$delegate", "getCustomActionHandlersStoreFactory", "()LVg/d;", "customActionHandlersStoreFactory", "orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class GroupButtonsComponent$Companion$create$1$1 implements GroupButtonsComponent {
    private final CustomActionHandlersComponentApi customActionHandlersComponentApi;

    /* renamed from: customActionHandlersStoreFactory$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j customActionHandlersStoreFactory;

    /* renamed from: mapper$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j mapper;
    private final RetainComposerComponentApi retainComposerComponentApi;
    private final l tokenizedAnalytics;

    GroupButtonsComponent$Companion$create$1$1(C7475g c7475g) {
        RetainComposerComponentApi retainComposerComponentApi = (RetainComposerComponentApi) c7475g.getComponent(RetainComposerComponentApi.class);
        this.retainComposerComponentApi = retainComposerComponentApi;
        this.customActionHandlersComponentApi = (CustomActionHandlersComponentApi) c7475g.getComponent(CustomActionHandlersComponentApi.class);
        this.mapper = k.b(GroupButtonsComponent$Companion$create$1$1$mapper$2.INSTANCE);
        this.tokenizedAnalytics = retainComposerComponentApi.getTokenizedAnalytics();
        this.customActionHandlersStoreFactory = k.b(new GroupButtonsComponent$Companion$create$1$1$customActionHandlersStoreFactory$2(this));
    }

    @Override // ru.ozon.app.android.orders.cml.groupButtons.di.GroupButtonsComponent
    public d getCustomActionHandlersStoreFactory() {
        return (d) this.customActionHandlersStoreFactory.getValue();
    }

    @Override // ru.ozon.app.android.orders.cml.groupButtons.di.GroupButtonsComponent
    public GroupButtonsMapper getMapper() {
        return (GroupButtonsMapper) this.mapper.getValue();
    }

    @Override // ru.ozon.app.android.orders.cml.groupButtons.di.GroupButtonsComponent
    public l getTokenizedAnalytics() {
        return this.tokenizedAnalytics;
    }
}
