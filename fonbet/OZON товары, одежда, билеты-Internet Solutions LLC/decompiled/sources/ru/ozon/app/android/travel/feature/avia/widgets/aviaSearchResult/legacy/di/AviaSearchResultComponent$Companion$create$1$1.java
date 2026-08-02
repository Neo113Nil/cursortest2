package ru.ozon.app.android.travel.feature.avia.widgets.aviaSearchResult.legacy.di;

import Sc.InterfaceC4008j;
import Sc.k;
import WZ.l;
import k20.C7475g;
import kotlin.Metadata;
import ru.ozon.app.android.action.di.ActionComponentApi;
import ru.ozon.app.android.composer.di.composer.RetainComposerComponentApi;
import ru.ozon.app.android.di.provider.component.ContextComponentDependencies;
import ru.ozon.app.android.network.di.NetworkComponentApi;
import ru.ozon.app.android.travel.feature.avia.widgets.aviaSearchResult.legacy.data.v3.AviaSearchResultApi;
import ru.ozon.app.android.travel.feature.avia.widgets.aviaSearchResult.legacy.data.v3.AviaSearchResultV3Mapper;
import ru.ozon.app.android.travel.feature.avia.widgets.aviaSearchResult.legacy.pool.AviaSearchResultViewPool;
import ru.ozon.app.android.travel.feature.avia.widgets.aviaSearchResult.legacy.viewModel.AviaSearchResultViewModel;

@Metadata(d1 = {"\u0000Y\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001c\u0010\u0010\u001a\n \u000f*\u0004\u0018\u00010\u000e0\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R!\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00130\u00128VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001b\u0010\u001d\u001a\u00020\u00198VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u0015\u001a\u0004\b\u001b\u0010\u001cR\u001b\u0010\"\u001a\u00020\u001e8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010\u0015\u001a\u0004\b \u0010!R\u0018\u0010'\u001a\u00060#j\u0002`$8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b%\u0010&¨\u0006("}, d2 = {"ru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/legacy/di/AviaSearchResultComponent$Companion$create$1$1", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/legacy/di/AviaSearchResultComponent;", "Lru/ozon/app/android/di/provider/component/ContextComponentDependencies;", "contextComponentDependencies", "Lru/ozon/app/android/di/provider/component/ContextComponentDependencies;", "Lru/ozon/app/android/composer/di/composer/RetainComposerComponentApi;", "retainComposerComponentApi", "Lru/ozon/app/android/composer/di/composer/RetainComposerComponentApi;", "Lru/ozon/app/android/network/di/NetworkComponentApi;", "networkComponentApi", "Lru/ozon/app/android/network/di/NetworkComponentApi;", "Lru/ozon/app/android/action/di/ActionComponentApi;", "actionComponentApi", "Lru/ozon/app/android/action/di/ActionComponentApi;", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/legacy/data/v3/AviaSearchResultApi;", "kotlin.jvm.PlatformType", "aviaSearchResultApi", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/legacy/data/v3/AviaSearchResultApi;", "LPc/a;", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/legacy/viewModel/AviaSearchResultViewModel;", "aviaSearchResultViewModel$delegate", "LSc/j;", "getAviaSearchResultViewModel", "()LPc/a;", "aviaSearchResultViewModel", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/legacy/data/v3/AviaSearchResultV3Mapper;", "aviaSearchResultV3Mapper$delegate", "getAviaSearchResultV3Mapper", "()Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/legacy/data/v3/AviaSearchResultV3Mapper;", "aviaSearchResultV3Mapper", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/legacy/pool/AviaSearchResultViewPool;", "aviaSearchResultViewPool$delegate", "getAviaSearchResultViewPool", "()Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/legacy/pool/AviaSearchResultViewPool;", "aviaSearchResultViewPool", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "getTokenizedAnalytics", "()LWZ/l;", "tokenizedAnalytics", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class AviaSearchResultComponent$Companion$create$1$1 implements AviaSearchResultComponent {
    private final ActionComponentApi actionComponentApi;
    private final AviaSearchResultApi aviaSearchResultApi;

    /* renamed from: aviaSearchResultV3Mapper$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j aviaSearchResultV3Mapper;

    /* renamed from: aviaSearchResultViewModel$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j aviaSearchResultViewModel;

    /* renamed from: aviaSearchResultViewPool$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j aviaSearchResultViewPool;
    private final ContextComponentDependencies contextComponentDependencies;
    private final NetworkComponentApi networkComponentApi;
    private final RetainComposerComponentApi retainComposerComponentApi;

    AviaSearchResultComponent$Companion$create$1$1(C7475g c7475g) {
        this.contextComponentDependencies = (ContextComponentDependencies) c7475g.getComponent(ContextComponentDependencies.class);
        this.retainComposerComponentApi = (RetainComposerComponentApi) c7475g.getComponent(RetainComposerComponentApi.class);
        NetworkComponentApi networkComponentApi = (NetworkComponentApi) c7475g.getComponent(NetworkComponentApi.class);
        this.networkComponentApi = networkComponentApi;
        this.actionComponentApi = (ActionComponentApi) c7475g.getComponent(ActionComponentApi.class);
        this.aviaSearchResultApi = (AviaSearchResultApi) networkComponentApi.getRetrofit().create(AviaSearchResultApi.class);
        this.aviaSearchResultViewModel = k.b(new AviaSearchResultComponent$Companion$create$1$1$aviaSearchResultViewModel$2(this));
        this.aviaSearchResultV3Mapper = k.b(new AviaSearchResultComponent$Companion$create$1$1$aviaSearchResultV3Mapper$2(this));
        this.aviaSearchResultViewPool = k.b(AviaSearchResultComponent$Companion$create$1$1$aviaSearchResultViewPool$2.INSTANCE);
    }

    @Override // ru.ozon.app.android.travel.feature.avia.widgets.aviaSearchResult.legacy.di.AviaSearchResultComponent
    public AviaSearchResultV3Mapper getAviaSearchResultV3Mapper() {
        return (AviaSearchResultV3Mapper) this.aviaSearchResultV3Mapper.getValue();
    }

    @Override // ru.ozon.app.android.travel.feature.avia.widgets.aviaSearchResult.legacy.di.AviaSearchResultComponent
    public Pc.a<AviaSearchResultViewModel> getAviaSearchResultViewModel() {
        return (Pc.a) this.aviaSearchResultViewModel.getValue();
    }

    @Override // ru.ozon.app.android.travel.feature.avia.widgets.aviaSearchResult.legacy.di.AviaSearchResultComponent
    public AviaSearchResultViewPool getAviaSearchResultViewPool() {
        return (AviaSearchResultViewPool) this.aviaSearchResultViewPool.getValue();
    }

    @Override // ru.ozon.app.android.travel.feature.avia.widgets.aviaSearchResult.legacy.di.AviaSearchResultComponent
    public l getTokenizedAnalytics() {
        return this.retainComposerComponentApi.getTokenizedAnalytics();
    }
}
