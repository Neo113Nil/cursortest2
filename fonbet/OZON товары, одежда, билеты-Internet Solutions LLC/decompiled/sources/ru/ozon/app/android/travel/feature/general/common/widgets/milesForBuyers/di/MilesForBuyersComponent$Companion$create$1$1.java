package ru.ozon.app.android.travel.feature.general.common.widgets.milesForBuyers.di;

import Sc.InterfaceC4008j;
import Sc.k;
import WZ.l;
import k20.C7475g;
import kotlin.Metadata;
import ru.ozon.app.android.analytics.di.AnalyticsComponentApi;
import ru.ozon.app.android.composer.di.composer.RetainComposerComponentApi;
import ru.ozon.app.android.composer.widgets.async.di.ComposerWidgetAsyncComponentApi;
import ru.ozon.app.android.di.provider.component.ContextComponentDependencies;
import ru.ozon.app.android.travel.feature.general.common.widgets.milesForBuyers.data.MilesForBuyersMapper;
import ru.ozon.app.android.travel.feature.general.common.widgets.milesForBuyers.presentation.MilesForBuyersWidgetViewModel;
import ru.ozon.app.android.utils.dispatcherprovider.di.CoroutineDispatchersComponentApi;

@Metadata(d1 = {"\u0000Q\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u001b\u0010\u0016\u001a\u00020\u00118VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R)\u0010\u001d\u001a\u0010\u0012\f\u0012\n \u0019*\u0004\u0018\u00010\u00180\u00180\u00178VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u0013\u001a\u0004\b\u001b\u0010\u001cR\u0018\u0010\"\u001a\u00060\u001ej\u0002`\u001f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b \u0010!¨\u0006#"}, d2 = {"ru/ozon/app/android/travel/feature/general/common/widgets/milesForBuyers/di/MilesForBuyersComponent$Companion$create$1$1", "Lru/ozon/app/android/travel/feature/general/common/widgets/milesForBuyers/di/MilesForBuyersComponent;", "Lru/ozon/app/android/composer/di/composer/RetainComposerComponentApi;", "retainComposerComponentApi", "Lru/ozon/app/android/composer/di/composer/RetainComposerComponentApi;", "Lru/ozon/app/android/composer/widgets/async/di/ComposerWidgetAsyncComponentApi;", "composerWidgetAsyncComponentApi", "Lru/ozon/app/android/composer/widgets/async/di/ComposerWidgetAsyncComponentApi;", "Lru/ozon/app/android/utils/dispatcherprovider/di/CoroutineDispatchersComponentApi;", "coroutineDispatchersComponentApi", "Lru/ozon/app/android/utils/dispatcherprovider/di/CoroutineDispatchersComponentApi;", "Lru/ozon/app/android/analytics/di/AnalyticsComponentApi;", "analyticsComponentApi", "Lru/ozon/app/android/analytics/di/AnalyticsComponentApi;", "Lru/ozon/app/android/di/provider/component/ContextComponentDependencies;", "contextComponentDependencies", "Lru/ozon/app/android/di/provider/component/ContextComponentDependencies;", "Lru/ozon/app/android/travel/feature/general/common/widgets/milesForBuyers/data/MilesForBuyersMapper;", "mapper$delegate", "LSc/j;", "getMapper", "()Lru/ozon/app/android/travel/feature/general/common/widgets/milesForBuyers/data/MilesForBuyersMapper;", "mapper", "LPc/a;", "Lru/ozon/app/android/travel/feature/general/common/widgets/milesForBuyers/presentation/MilesForBuyersWidgetViewModel;", "kotlin.jvm.PlatformType", "widgetViewModelProvider$delegate", "getWidgetViewModelProvider", "()LPc/a;", "widgetViewModelProvider", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "getTokenizedAnalytics", "()LWZ/l;", "tokenizedAnalytics", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class MilesForBuyersComponent$Companion$create$1$1 implements MilesForBuyersComponent {
    private final AnalyticsComponentApi analyticsComponentApi;
    private final ComposerWidgetAsyncComponentApi composerWidgetAsyncComponentApi;
    private final ContextComponentDependencies contextComponentDependencies;
    private final CoroutineDispatchersComponentApi coroutineDispatchersComponentApi;
    private final RetainComposerComponentApi retainComposerComponentApi;

    /* renamed from: mapper$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j mapper = k.b(new MilesForBuyersComponent$Companion$create$1$1$mapper$2(this));

    /* renamed from: widgetViewModelProvider$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j widgetViewModelProvider = k.b(new MilesForBuyersComponent$Companion$create$1$1$widgetViewModelProvider$2(this));

    MilesForBuyersComponent$Companion$create$1$1(C7475g c7475g) {
        this.retainComposerComponentApi = (RetainComposerComponentApi) c7475g.getComponent(RetainComposerComponentApi.class);
        this.composerWidgetAsyncComponentApi = (ComposerWidgetAsyncComponentApi) c7475g.getComponent(ComposerWidgetAsyncComponentApi.class);
        this.coroutineDispatchersComponentApi = (CoroutineDispatchersComponentApi) c7475g.getComponent(CoroutineDispatchersComponentApi.class);
        this.analyticsComponentApi = (AnalyticsComponentApi) c7475g.getComponent(AnalyticsComponentApi.class);
        this.contextComponentDependencies = (ContextComponentDependencies) c7475g.getComponent(ContextComponentDependencies.class);
    }

    @Override // ru.ozon.app.android.travel.feature.general.common.widgets.milesForBuyers.di.MilesForBuyersComponent
    public MilesForBuyersMapper getMapper() {
        return (MilesForBuyersMapper) this.mapper.getValue();
    }

    @Override // ru.ozon.app.android.travel.feature.general.common.widgets.milesForBuyers.di.MilesForBuyersComponent
    public l getTokenizedAnalytics() {
        return this.retainComposerComponentApi.getTokenizedAnalytics();
    }

    @Override // ru.ozon.app.android.travel.feature.general.common.widgets.milesForBuyers.di.MilesForBuyersComponent
    public Pc.a<MilesForBuyersWidgetViewModel> getWidgetViewModelProvider() {
        return (Pc.a) this.widgetViewModelProvider.getValue();
    }
}
