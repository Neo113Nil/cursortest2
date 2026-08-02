package ru.ozon.app.android.orderdetails.orderactions.v2.di;

import Sc.InterfaceC4008j;
import Sc.k;
import Vg.d;
import k20.C7475g;
import kotlin.Metadata;
import ru.ozon.app.android.action.custom.di.CustomActionHandlersComponentApi;
import ru.ozon.app.android.composer.di.composer.RetainComposerComponentApi;
import ru.ozon.app.android.network.di.NetworkComponentApi;
import ru.ozon.app.android.orderdetails.orderactions.v2.core.OrderActionsV2Mapper;
import ru.ozon.app.android.orderdetails.orderactions.v2.core.OrderActionsV2Parser;
import ru.ozon.app.android.platform.di.AndroidPlatformComponentDependencies;
import ru.ozon.app.android.utils.AppType;

@Metadata(d1 = {"\u0000M\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001b\u0010\u0012\u001a\u00020\r8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001f\u0010\u0018\u001a\u00060\u0013j\u0002`\u00148VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u000f\u001a\u0004\b\u0016\u0010\u0017R\u001b\u0010\u001d\u001a\u00020\u00198VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u000f\u001a\u0004\b\u001b\u0010\u001cR\u001b\u0010\"\u001a\u00020\u001e8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010\u000f\u001a\u0004\b \u0010!R\u0014\u0010&\u001a\u00020#8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b$\u0010%¨\u0006'"}, d2 = {"ru/ozon/app/android/orderdetails/orderactions/v2/di/OrderActionsV2Component$Companion$create$1$1", "Lru/ozon/app/android/orderdetails/orderactions/v2/di/OrderActionsV2Component;", "Lru/ozon/app/android/action/custom/di/CustomActionHandlersComponentApi;", "customActionHandlersComponentApi", "Lru/ozon/app/android/action/custom/di/CustomActionHandlersComponentApi;", "Lru/ozon/app/android/network/di/NetworkComponentApi;", "networkComponentApi", "Lru/ozon/app/android/network/di/NetworkComponentApi;", "Lru/ozon/app/android/composer/di/composer/RetainComposerComponentApi;", "analyticsComponentApi", "Lru/ozon/app/android/composer/di/composer/RetainComposerComponentApi;", "getAnalyticsComponentApi", "()Lru/ozon/app/android/composer/di/composer/RetainComposerComponentApi;", "Lru/ozon/app/android/orderdetails/orderactions/v2/core/OrderActionsV2Mapper;", "mapper$delegate", "LSc/j;", "getMapper", "()Lru/ozon/app/android/orderdetails/orderactions/v2/core/OrderActionsV2Mapper;", "mapper", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "customActionHandlersStoreFactory$delegate", "getCustomActionHandlersStoreFactory", "()LVg/d;", "customActionHandlersStoreFactory", "LWZ/l;", "tokenizedAnalytics$delegate", "getTokenizedAnalytics", "()LWZ/l;", "tokenizedAnalytics", "Lru/ozon/app/android/orderdetails/orderactions/v2/core/OrderActionsV2Parser;", "parser$delegate", "getParser", "()Lru/ozon/app/android/orderdetails/orderactions/v2/core/OrderActionsV2Parser;", "parser", "Lru/ozon/app/android/utils/AppType;", "getAppType", "()Lru/ozon/app/android/utils/AppType;", "appType", "orderdetails_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class OrderActionsV2Component$Companion$create$1$1 implements OrderActionsV2Component {
    final /* synthetic */ C7475g $storage;
    private final RetainComposerComponentApi analyticsComponentApi;
    private final CustomActionHandlersComponentApi customActionHandlersComponentApi;
    private final NetworkComponentApi networkComponentApi;

    /* renamed from: mapper$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j mapper = k.b(OrderActionsV2Component$Companion$create$1$1$mapper$2.INSTANCE);

    /* renamed from: customActionHandlersStoreFactory$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j customActionHandlersStoreFactory = k.b(new OrderActionsV2Component$Companion$create$1$1$customActionHandlersStoreFactory$2(this));

    /* renamed from: tokenizedAnalytics$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j tokenizedAnalytics = k.b(new OrderActionsV2Component$Companion$create$1$1$tokenizedAnalytics$2(this));

    /* renamed from: parser$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j parser = k.b(new OrderActionsV2Component$Companion$create$1$1$parser$2(this));

    OrderActionsV2Component$Companion$create$1$1(C7475g c7475g) {
        this.$storage = c7475g;
        this.customActionHandlersComponentApi = (CustomActionHandlersComponentApi) c7475g.getComponent(CustomActionHandlersComponentApi.class);
        this.networkComponentApi = (NetworkComponentApi) c7475g.getComponent(NetworkComponentApi.class);
        this.analyticsComponentApi = (RetainComposerComponentApi) c7475g.getComponent(RetainComposerComponentApi.class);
    }

    public final RetainComposerComponentApi getAnalyticsComponentApi() {
        return this.analyticsComponentApi;
    }

    @Override // ru.ozon.app.android.orderdetails.orderactions.v2.di.OrderActionsV2Component
    public AppType getAppType() {
        return ((AndroidPlatformComponentDependencies) this.$storage.getComponent(AndroidPlatformComponentDependencies.class)).getAppType();
    }

    @Override // ru.ozon.app.android.orderdetails.orderactions.v2.di.OrderActionsV2Component
    public d getCustomActionHandlersStoreFactory() {
        return (d) this.customActionHandlersStoreFactory.getValue();
    }

    @Override // ru.ozon.app.android.orderdetails.orderactions.v2.di.OrderActionsV2Component
    public OrderActionsV2Mapper getMapper() {
        return (OrderActionsV2Mapper) this.mapper.getValue();
    }

    @Override // ru.ozon.app.android.orderdetails.orderactions.v2.di.OrderActionsV2Component
    public OrderActionsV2Parser getParser() {
        return (OrderActionsV2Parser) this.parser.getValue();
    }
}
