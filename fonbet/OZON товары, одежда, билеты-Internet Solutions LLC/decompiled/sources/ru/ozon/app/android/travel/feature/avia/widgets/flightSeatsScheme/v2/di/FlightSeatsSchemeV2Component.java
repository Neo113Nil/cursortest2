package ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v2.di;

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
import ru.ozon.app.android.composer.widgets.async.di.ComposerWidgetAsyncComponentApi;
import ru.ozon.app.android.di.provider.component.ContextComponentDependencies;
import ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v2.data.FlightSeatsSchemeV2ItemsMapper;
import ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v2.data.FlightSeatsSchemeV2Mapper;
import ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v2.data.footer.FlightSeatsSchemeV2FooterMapper;
import ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v2.data.header.FlightSeatsSchemeV2HeaderBlockMapper;
import ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v2.data.legend.LegendMapperV2;
import ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v2.data.scheme.FlightSeatsSchemeV2BlockMapper;
import ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v2.presentation.FlightSeatsSchemeV2AsyncViewModel;
import ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v2.presentation.FlightSeatsSchemeV2ViewModel;
import ru.ozon.app.android.utils.dispatcherprovider.di.CoroutineDispatchersComponentApi;

@Metadata(d1 = {"\u0000 \u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0013\u0012\n\u0010\u0005\u001a\u00060\u0003j\u0002`\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001b\u0010\u001f\u001a\u00020\u001a8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001b\u0010$\u001a\u00020 8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b!\u0010\u001c\u001a\u0004\b\"\u0010#R\u001b\u0010)\u001a\u00020%8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b&\u0010\u001c\u001a\u0004\b'\u0010(R\u001b\u0010.\u001a\u00020*8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b+\u0010\u001c\u001a\u0004\b,\u0010-R\u001b\u00103\u001a\u00020/8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b0\u0010\u001c\u001a\u0004\b1\u00102R\u001b\u00108\u001a\u0002048FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b5\u0010\u001c\u001a\u0004\b6\u00107R!\u0010>\u001a\b\u0012\u0004\u0012\u00020:098FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b;\u0010\u001c\u001a\u0004\b<\u0010=R!\u0010B\u001a\b\u0012\u0004\u0012\u00020?098FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b@\u0010\u001c\u001a\u0004\bA\u0010=R\u0015\u0010G\u001a\u00060Cj\u0002`D8F¢\u0006\u0006\u001a\u0004\bE\u0010FR\u0011\u0010K\u001a\u00020H8F¢\u0006\u0006\u001a\u0004\bI\u0010J¨\u0006L"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/di/FlightSeatsSchemeV2Component;", "Lhi/a;", "Lru/ozon/app/android/di/provider/component/DiComponent;", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "<init>", "(Lk20/g;)V", "Lru/ozon/app/android/di/provider/component/ContextComponentDependencies;", "contextComponentDependencies", "Lru/ozon/app/android/di/provider/component/ContextComponentDependencies;", "Lru/ozon/app/android/action/custom/di/CustomActionHandlersComponentApi;", "customActionHandlersComponentApi", "Lru/ozon/app/android/action/custom/di/CustomActionHandlersComponentApi;", "Lru/ozon/app/android/action/di/ActionComponentApi;", "actionComponentApi", "Lru/ozon/app/android/action/di/ActionComponentApi;", "Lru/ozon/app/android/composer/di/composer/RetainComposerComponentApi;", "retainComposerComponentApi", "Lru/ozon/app/android/composer/di/composer/RetainComposerComponentApi;", "Lru/ozon/app/android/composer/widgets/async/di/ComposerWidgetAsyncComponentApi;", "composerWidgetAsyncComponentApi", "Lru/ozon/app/android/composer/widgets/async/di/ComposerWidgetAsyncComponentApi;", "Lru/ozon/app/android/utils/dispatcherprovider/di/CoroutineDispatchersComponentApi;", "coroutineDispatchersComponentApi", "Lru/ozon/app/android/utils/dispatcherprovider/di/CoroutineDispatchersComponentApi;", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/data/header/FlightSeatsSchemeV2HeaderBlockMapper;", "headerMapper$delegate", "LSc/j;", "getHeaderMapper", "()Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/data/header/FlightSeatsSchemeV2HeaderBlockMapper;", "headerMapper", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/data/footer/FlightSeatsSchemeV2FooterMapper;", "footerMapper$delegate", "getFooterMapper", "()Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/data/footer/FlightSeatsSchemeV2FooterMapper;", "footerMapper", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/data/legend/LegendMapperV2;", "legendMapper$delegate", "getLegendMapper", "()Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/data/legend/LegendMapperV2;", "legendMapper", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/data/scheme/FlightSeatsSchemeV2BlockMapper;", "blockMapper$delegate", "getBlockMapper", "()Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/data/scheme/FlightSeatsSchemeV2BlockMapper;", "blockMapper", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/data/FlightSeatsSchemeV2ItemsMapper;", "itemsMapper$delegate", "getItemsMapper", "()Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/data/FlightSeatsSchemeV2ItemsMapper;", "itemsMapper", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/data/FlightSeatsSchemeV2Mapper;", "flightSeatsSchemeMapper$delegate", "getFlightSeatsSchemeMapper", "()Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/data/FlightSeatsSchemeV2Mapper;", "flightSeatsSchemeMapper", "LPc/a;", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/presentation/FlightSeatsSchemeV2ViewModel;", "viewModelProvider$delegate", "getViewModelProvider", "()LPc/a;", "viewModelProvider", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/presentation/FlightSeatsSchemeV2AsyncViewModel;", "asyncWidgetViewModelProvider$delegate", "getAsyncWidgetViewModelProvider", "asyncWidgetViewModelProvider", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "getCustomActionHandlersStoreFactory", "()LVg/d;", "customActionHandlersStoreFactory", "LWZ/l;", "getTokenizedAnalytics", "()LWZ/l;", "tokenizedAnalytics", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class FlightSeatsSchemeV2Component implements InterfaceC6958a {

    @NotNull
    private final ActionComponentApi actionComponentApi;

    /* renamed from: asyncWidgetViewModelProvider$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j asyncWidgetViewModelProvider;

    /* renamed from: blockMapper$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j blockMapper;

    @NotNull
    private final ComposerWidgetAsyncComponentApi composerWidgetAsyncComponentApi;

    @NotNull
    private final ContextComponentDependencies contextComponentDependencies;

    @NotNull
    private final CoroutineDispatchersComponentApi coroutineDispatchersComponentApi;

    @NotNull
    private final CustomActionHandlersComponentApi customActionHandlersComponentApi;

    /* renamed from: flightSeatsSchemeMapper$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j flightSeatsSchemeMapper;

    /* renamed from: footerMapper$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j footerMapper;

    /* renamed from: headerMapper$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j headerMapper;

    /* renamed from: itemsMapper$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j itemsMapper;

    /* renamed from: legendMapper$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j legendMapper;

    @NotNull
    private final RetainComposerComponentApi retainComposerComponentApi;

    /* renamed from: viewModelProvider$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j viewModelProvider;

    public FlightSeatsSchemeV2Component(@NotNull C7475g storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        this.contextComponentDependencies = (ContextComponentDependencies) storage.getComponent(ContextComponentDependencies.class);
        this.customActionHandlersComponentApi = (CustomActionHandlersComponentApi) storage.getComponent(CustomActionHandlersComponentApi.class);
        this.actionComponentApi = (ActionComponentApi) storage.getComponent(ActionComponentApi.class);
        this.retainComposerComponentApi = (RetainComposerComponentApi) storage.getComponent(RetainComposerComponentApi.class);
        this.composerWidgetAsyncComponentApi = (ComposerWidgetAsyncComponentApi) storage.getComponent(ComposerWidgetAsyncComponentApi.class);
        this.coroutineDispatchersComponentApi = (CoroutineDispatchersComponentApi) storage.getComponent(CoroutineDispatchersComponentApi.class);
        this.headerMapper = k.b(FlightSeatsSchemeV2Component$headerMapper$2.INSTANCE);
        this.footerMapper = k.b(new FlightSeatsSchemeV2Component$footerMapper$2(this));
        this.legendMapper = k.b(FlightSeatsSchemeV2Component$legendMapper$2.INSTANCE);
        this.blockMapper = k.b(new FlightSeatsSchemeV2Component$blockMapper$2(this));
        this.itemsMapper = k.b(new FlightSeatsSchemeV2Component$itemsMapper$2(this));
        this.flightSeatsSchemeMapper = k.b(new FlightSeatsSchemeV2Component$flightSeatsSchemeMapper$2(this));
        this.viewModelProvider = k.b(new FlightSeatsSchemeV2Component$viewModelProvider$2(this));
        this.asyncWidgetViewModelProvider = k.b(new FlightSeatsSchemeV2Component$asyncWidgetViewModelProvider$2(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final FlightSeatsSchemeV2BlockMapper getBlockMapper() {
        return (FlightSeatsSchemeV2BlockMapper) this.blockMapper.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final FlightSeatsSchemeV2FooterMapper getFooterMapper() {
        return (FlightSeatsSchemeV2FooterMapper) this.footerMapper.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final FlightSeatsSchemeV2HeaderBlockMapper getHeaderMapper() {
        return (FlightSeatsSchemeV2HeaderBlockMapper) this.headerMapper.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final FlightSeatsSchemeV2ItemsMapper getItemsMapper() {
        return (FlightSeatsSchemeV2ItemsMapper) this.itemsMapper.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final LegendMapperV2 getLegendMapper() {
        return (LegendMapperV2) this.legendMapper.getValue();
    }

    @NotNull
    public final Pc.a<FlightSeatsSchemeV2AsyncViewModel> getAsyncWidgetViewModelProvider() {
        return (Pc.a) this.asyncWidgetViewModelProvider.getValue();
    }

    @NotNull
    public final d getCustomActionHandlersStoreFactory() {
        return this.customActionHandlersComponentApi.getCustomActionHandlersStoreFactory();
    }

    @NotNull
    public final FlightSeatsSchemeV2Mapper getFlightSeatsSchemeMapper() {
        return (FlightSeatsSchemeV2Mapper) this.flightSeatsSchemeMapper.getValue();
    }

    @NotNull
    public final l getTokenizedAnalytics() {
        return this.retainComposerComponentApi.getTokenizedAnalytics();
    }

    @NotNull
    public final Pc.a<FlightSeatsSchemeV2ViewModel> getViewModelProvider() {
        return (Pc.a) this.viewModelProvider.getValue();
    }
}
