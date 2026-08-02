package ru.ozon.app.android.travel.feature.avia.widgets.passengersLuggageSelection.di;

import Sc.InterfaceC4008j;
import Sc.k;
import Vg.d;
import WZ.l;
import k20.C7475g;
import kotlin.Metadata;
import ru.ozon.app.android.action.custom.di.CustomActionHandlersComponentApi;
import ru.ozon.app.android.analytics.di.AnalyticsComponentApi;
import ru.ozon.app.android.composer.di.composer.RetainComposerComponentApi;
import ru.ozon.app.android.composer.widgets.async.di.ComposerWidgetAsyncComponentApi;
import ru.ozon.app.android.travel.feature.avia.widgets.passengersLuggageSelection.data.PassengersLuggageSelectionMapper;
import ru.ozon.app.android.travel.feature.avia.widgets.passengersLuggageSelection.presentation.PassengersLuggageSelectionWidgetViewModel;
import ru.ozon.app.android.utils.dispatcherprovider.di.CoroutineDispatchersComponentApi;

@Metadata(d1 = {"\u0000]\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R!\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001b\u0010\u001c\u001a\u00020\u00188VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u0014\u001a\u0004\b\u001a\u0010\u001bR\u0018\u0010!\u001a\u00060\u001dj\u0002`\u001e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u0018\u0010&\u001a\u00060\"j\u0002`#8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b$\u0010%¨\u0006'"}, d2 = {"ru/ozon/app/android/travel/feature/avia/widgets/passengersLuggageSelection/di/PassengersLuggageSelectionComponent$Companion$create$1$1", "Lru/ozon/app/android/travel/feature/avia/widgets/passengersLuggageSelection/di/PassengersLuggageSelectionComponent;", "Lru/ozon/app/android/action/custom/di/CustomActionHandlersComponentApi;", "customActionComponentApi", "Lru/ozon/app/android/action/custom/di/CustomActionHandlersComponentApi;", "Lru/ozon/app/android/composer/widgets/async/di/ComposerWidgetAsyncComponentApi;", "composerWidgetAsyncComponentApi", "Lru/ozon/app/android/composer/widgets/async/di/ComposerWidgetAsyncComponentApi;", "Lru/ozon/app/android/composer/di/composer/RetainComposerComponentApi;", "retainComponentApi", "Lru/ozon/app/android/composer/di/composer/RetainComposerComponentApi;", "Lru/ozon/app/android/utils/dispatcherprovider/di/CoroutineDispatchersComponentApi;", "coroutineDispatchersComponentApi", "Lru/ozon/app/android/utils/dispatcherprovider/di/CoroutineDispatchersComponentApi;", "Lru/ozon/app/android/analytics/di/AnalyticsComponentApi;", "analyticsComponentApi", "Lru/ozon/app/android/analytics/di/AnalyticsComponentApi;", "LPc/a;", "Lru/ozon/app/android/travel/feature/avia/widgets/passengersLuggageSelection/presentation/PassengersLuggageSelectionWidgetViewModel;", "viewModelProvider$delegate", "LSc/j;", "getViewModelProvider", "()LPc/a;", "viewModelProvider", "Lru/ozon/app/android/travel/feature/avia/widgets/passengersLuggageSelection/data/PassengersLuggageSelectionMapper;", "mapper$delegate", "getMapper", "()Lru/ozon/app/android/travel/feature/avia/widgets/passengersLuggageSelection/data/PassengersLuggageSelectionMapper;", "mapper", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "getTokenizedAnalytics", "()LWZ/l;", "tokenizedAnalytics", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "getCustomActionHandlersStoreFactory", "()LVg/d;", "customActionHandlersStoreFactory", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class PassengersLuggageSelectionComponent$Companion$create$1$1 implements PassengersLuggageSelectionComponent {
    private final AnalyticsComponentApi analyticsComponentApi;
    private final ComposerWidgetAsyncComponentApi composerWidgetAsyncComponentApi;
    private final CoroutineDispatchersComponentApi coroutineDispatchersComponentApi;
    private final CustomActionHandlersComponentApi customActionComponentApi;
    private final RetainComposerComponentApi retainComponentApi;

    /* renamed from: viewModelProvider$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j viewModelProvider = k.b(new PassengersLuggageSelectionComponent$Companion$create$1$1$viewModelProvider$2(this));

    /* renamed from: mapper$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j mapper = k.b(PassengersLuggageSelectionComponent$Companion$create$1$1$mapper$2.INSTANCE);

    PassengersLuggageSelectionComponent$Companion$create$1$1(C7475g c7475g) {
        this.customActionComponentApi = (CustomActionHandlersComponentApi) c7475g.getComponent(CustomActionHandlersComponentApi.class);
        this.composerWidgetAsyncComponentApi = (ComposerWidgetAsyncComponentApi) c7475g.getComponent(ComposerWidgetAsyncComponentApi.class);
        this.retainComponentApi = (RetainComposerComponentApi) c7475g.getComponent(RetainComposerComponentApi.class);
        this.coroutineDispatchersComponentApi = (CoroutineDispatchersComponentApi) c7475g.getComponent(CoroutineDispatchersComponentApi.class);
        this.analyticsComponentApi = (AnalyticsComponentApi) c7475g.getComponent(AnalyticsComponentApi.class);
    }

    @Override // ru.ozon.app.android.travel.feature.avia.widgets.passengersLuggageSelection.di.PassengersLuggageSelectionComponent
    public d getCustomActionHandlersStoreFactory() {
        return this.customActionComponentApi.getCustomActionHandlersStoreFactory();
    }

    @Override // ru.ozon.app.android.travel.feature.avia.widgets.passengersLuggageSelection.di.PassengersLuggageSelectionComponent
    public PassengersLuggageSelectionMapper getMapper() {
        return (PassengersLuggageSelectionMapper) this.mapper.getValue();
    }

    @Override // ru.ozon.app.android.travel.feature.avia.widgets.passengersLuggageSelection.di.PassengersLuggageSelectionComponent
    public l getTokenizedAnalytics() {
        return this.retainComponentApi.getTokenizedAnalytics();
    }

    @Override // ru.ozon.app.android.travel.feature.avia.widgets.passengersLuggageSelection.di.PassengersLuggageSelectionComponent
    public Pc.a<PassengersLuggageSelectionWidgetViewModel> getViewModelProvider() {
        return (Pc.a) this.viewModelProvider.getValue();
    }
}
