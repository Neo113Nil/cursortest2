package ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySeatSelectWithScheme.v2.di;

import Sc.InterfaceC4008j;
import Sc.k;
import Vg.d;
import WZ.l;
import hi.InterfaceC6958a;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.custom.di.CustomActionHandlersComponentApi;
import ru.ozon.app.android.action.di.ActionComponentApi;
import ru.ozon.app.android.composer.di.composer.RetainComposerComponentApi;
import ru.ozon.app.android.di.provider.component.ContextComponentDependencies;
import ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySeatSelectWithScheme.v2.data.mapper.TravelRailwaySeatSelectFooterMapper;
import ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySeatSelectWithScheme.v2.data.mapper.TravelRailwaySeatSelectStickyButtonMapper;
import ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySeatSelectWithScheme.v2.data.mapper.TravelRailwaySeatSelectWithSchemeV2Mapper;
import ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySeatSelectWithScheme.v2.presentation.TravelRailwaySeatSelectWidgetViewModel;
import ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySeatSelectWithScheme.v2.view.scheme.TravelRailwaySchemeBitmapLoader;
import ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySeatSelectWithScheme.v2.view.scheme.TravelRailwaySchemeController;

@Metadata(d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0013\u0012\n\u0010\u0005\u001a\u00060\u0003j\u0002`\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u001b\u0010\u0019\u001a\u00020\u00148FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001b\u0010\u001e\u001a\u00020\u001a8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u0016\u001a\u0004\b\u001c\u0010\u001dR\u001b\u0010#\u001a\u00020\u001f8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b \u0010\u0016\u001a\u0004\b!\u0010\"R\u001b\u0010(\u001a\u00020$8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b%\u0010\u0016\u001a\u0004\b&\u0010'R\u001b\u0010-\u001a\u00020)8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b*\u0010\u0016\u001a\u0004\b+\u0010,R)\u00104\u001a\u0010\u0012\f\u0012\n 0*\u0004\u0018\u00010/0/0.8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b1\u0010\u0016\u001a\u0004\b2\u00103R\u0015\u00109\u001a\u000605j\u0002`68F¢\u0006\u0006\u001a\u0004\b7\u00108R\u0015\u0010>\u001a\u00060:j\u0002`;8F¢\u0006\u0006\u001a\u0004\b<\u0010=¨\u0006?"}, d2 = {"Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySeatSelectWithScheme/v2/di/TravelRailwaySeatSelectWithSchemeComponent;", "Lhi/a;", "Lru/ozon/app/android/di/provider/component/DiComponent;", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "<init>", "(Lk20/g;)V", "Lru/ozon/app/android/action/di/ActionComponentApi;", "actionComponentApi", "Lru/ozon/app/android/action/di/ActionComponentApi;", "Lru/ozon/app/android/di/provider/component/ContextComponentDependencies;", "contextComponentApi", "Lru/ozon/app/android/di/provider/component/ContextComponentDependencies;", "Lru/ozon/app/android/action/custom/di/CustomActionHandlersComponentApi;", "customActionHandlersComponentApi", "Lru/ozon/app/android/action/custom/di/CustomActionHandlersComponentApi;", "Lru/ozon/app/android/composer/di/composer/RetainComposerComponentApi;", "retainComponentApi", "Lru/ozon/app/android/composer/di/composer/RetainComposerComponentApi;", "Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySeatSelectWithScheme/v2/view/scheme/TravelRailwaySchemeBitmapLoader;", "loader$delegate", "LSc/j;", "getLoader", "()Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySeatSelectWithScheme/v2/view/scheme/TravelRailwaySchemeBitmapLoader;", "loader", "Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySeatSelectWithScheme/v2/view/scheme/TravelRailwaySchemeController;", "schemeController$delegate", "getSchemeController", "()Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySeatSelectWithScheme/v2/view/scheme/TravelRailwaySchemeController;", "schemeController", "Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySeatSelectWithScheme/v2/data/mapper/TravelRailwaySeatSelectWithSchemeV2Mapper;", "schemeMapperV2$delegate", "getSchemeMapperV2", "()Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySeatSelectWithScheme/v2/data/mapper/TravelRailwaySeatSelectWithSchemeV2Mapper;", "schemeMapperV2", "Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySeatSelectWithScheme/v2/data/mapper/TravelRailwaySeatSelectFooterMapper;", "footerMapper$delegate", "getFooterMapper", "()Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySeatSelectWithScheme/v2/data/mapper/TravelRailwaySeatSelectFooterMapper;", "footerMapper", "Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySeatSelectWithScheme/v2/data/mapper/TravelRailwaySeatSelectStickyButtonMapper;", "buttonMapper$delegate", "getButtonMapper", "()Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySeatSelectWithScheme/v2/data/mapper/TravelRailwaySeatSelectStickyButtonMapper;", "buttonMapper", "LPc/a;", "Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySeatSelectWithScheme/v2/presentation/TravelRailwaySeatSelectWidgetViewModel;", "kotlin.jvm.PlatformType", "railwaySeatSelectViewModelProvider$delegate", "getRailwaySeatSelectViewModelProvider", "()LPc/a;", "railwaySeatSelectViewModelProvider", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "getCustomActionHandlersStoreFactory", "()LVg/d;", "customActionHandlersStoreFactory", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "getTokenizedAnalytics", "()LWZ/l;", "tokenizedAnalytics", "railway_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class TravelRailwaySeatSelectWithSchemeComponent implements InterfaceC6958a {

    @NotNull
    private final ActionComponentApi actionComponentApi;

    /* renamed from: buttonMapper$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j buttonMapper;

    @NotNull
    private final ContextComponentDependencies contextComponentApi;

    @NotNull
    private final CustomActionHandlersComponentApi customActionHandlersComponentApi;

    /* renamed from: footerMapper$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j footerMapper;

    /* renamed from: loader$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j loader;

    /* renamed from: railwaySeatSelectViewModelProvider$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j railwaySeatSelectViewModelProvider;

    @NotNull
    private final RetainComposerComponentApi retainComponentApi;

    /* renamed from: schemeController$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j schemeController;

    /* renamed from: schemeMapperV2$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j schemeMapperV2;

    public TravelRailwaySeatSelectWithSchemeComponent(@NotNull C7475g storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        this.actionComponentApi = (ActionComponentApi) storage.getComponent(ActionComponentApi.class);
        this.contextComponentApi = (ContextComponentDependencies) storage.getComponent(ContextComponentDependencies.class);
        this.customActionHandlersComponentApi = (CustomActionHandlersComponentApi) storage.getComponent(CustomActionHandlersComponentApi.class);
        this.retainComponentApi = (RetainComposerComponentApi) storage.getComponent(RetainComposerComponentApi.class);
        this.loader = k.b(new TravelRailwaySeatSelectWithSchemeComponent$loader$2(this));
        this.schemeController = k.b(new TravelRailwaySeatSelectWithSchemeComponent$schemeController$2(this));
        this.schemeMapperV2 = k.b(new TravelRailwaySeatSelectWithSchemeComponent$schemeMapperV2$2(this));
        this.footerMapper = k.b(new TravelRailwaySeatSelectWithSchemeComponent$footerMapper$2(this));
        this.buttonMapper = k.b(TravelRailwaySeatSelectWithSchemeComponent$buttonMapper$2.INSTANCE);
        this.railwaySeatSelectViewModelProvider = k.b(new TravelRailwaySeatSelectWithSchemeComponent$railwaySeatSelectViewModelProvider$2(this));
    }

    @NotNull
    public final TravelRailwaySeatSelectStickyButtonMapper getButtonMapper() {
        return (TravelRailwaySeatSelectStickyButtonMapper) this.buttonMapper.getValue();
    }

    @NotNull
    public final d getCustomActionHandlersStoreFactory() {
        return this.customActionHandlersComponentApi.getCustomActionHandlersStoreFactory();
    }

    @NotNull
    public final TravelRailwaySeatSelectFooterMapper getFooterMapper() {
        return (TravelRailwaySeatSelectFooterMapper) this.footerMapper.getValue();
    }

    @NotNull
    public final TravelRailwaySchemeBitmapLoader getLoader() {
        return (TravelRailwaySchemeBitmapLoader) this.loader.getValue();
    }

    @NotNull
    public final Pc.a<TravelRailwaySeatSelectWidgetViewModel> getRailwaySeatSelectViewModelProvider() {
        return (Pc.a) this.railwaySeatSelectViewModelProvider.getValue();
    }

    @NotNull
    public final TravelRailwaySchemeController getSchemeController() {
        return (TravelRailwaySchemeController) this.schemeController.getValue();
    }

    @NotNull
    public final TravelRailwaySeatSelectWithSchemeV2Mapper getSchemeMapperV2() {
        return (TravelRailwaySeatSelectWithSchemeV2Mapper) this.schemeMapperV2.getValue();
    }

    @NotNull
    public final l getTokenizedAnalytics() {
        return this.retainComponentApi.getTokenizedAnalytics();
    }
}
