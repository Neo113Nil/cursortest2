package ru.ozon.app.android.travel.feature.general.common.widgets.pricesHistogram.v2.di;

import Sc.InterfaceC4008j;
import Sc.k;
import WZ.l;
import k20.C7475g;
import kotlin.Metadata;
import ru.ozon.app.android.action.custom.di.CustomActionHandlersComponentApi;
import ru.ozon.app.android.action.di.ActionComponentApi;
import ru.ozon.app.android.composer.di.composer.RetainComposerComponentApi;
import ru.ozon.app.android.di.provider.component.ContextComponentDependencies;
import ru.ozon.app.android.travel.feature.general.common.widgets.pricesHistogram.v2.data.PricesHistogramV2Mapper;
import ru.ozon.app.android.travel.feature.general.common.widgets.pricesHistogram.v2.presentation.PricesHistogramV2ViewModel;

@Metadata(d1 = {"\u0000E\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001b\u0010\u0013\u001a\u00020\u000e8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0017\u001a\u00020\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0018\u0010\u001c\u001a\u00060\u0018j\u0002`\u00198VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"ru/ozon/app/android/travel/feature/general/common/widgets/pricesHistogram/v2/di/PricesHistogramV2Component$Companion$create$1$1", "Lru/ozon/app/android/travel/feature/general/common/widgets/pricesHistogram/v2/di/PricesHistogramV2Component;", "Lru/ozon/app/android/action/custom/di/CustomActionHandlersComponentApi;", "customActionHandlersComponentApi", "Lru/ozon/app/android/action/custom/di/CustomActionHandlersComponentApi;", "Lru/ozon/app/android/action/di/ActionComponentApi;", "actionComponentApi", "Lru/ozon/app/android/action/di/ActionComponentApi;", "Lru/ozon/app/android/di/provider/component/ContextComponentDependencies;", "contextComponentApi", "Lru/ozon/app/android/di/provider/component/ContextComponentDependencies;", "Lru/ozon/app/android/composer/di/composer/RetainComposerComponentApi;", "retainComponentApi", "Lru/ozon/app/android/composer/di/composer/RetainComposerComponentApi;", "Lru/ozon/app/android/travel/feature/general/common/widgets/pricesHistogram/v2/data/PricesHistogramV2Mapper;", "mapper$delegate", "LSc/j;", "getMapper", "()Lru/ozon/app/android/travel/feature/general/common/widgets/pricesHistogram/v2/data/PricesHistogramV2Mapper;", "mapper", "Lru/ozon/app/android/travel/feature/general/common/widgets/pricesHistogram/v2/presentation/PricesHistogramV2ViewModel;", "getPricesHistogramV2ViewModel", "()Lru/ozon/app/android/travel/feature/general/common/widgets/pricesHistogram/v2/presentation/PricesHistogramV2ViewModel;", "pricesHistogramV2ViewModel", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "getTokenizedAnalytics", "()LWZ/l;", "tokenizedAnalytics", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class PricesHistogramV2Component$Companion$create$1$1 implements PricesHistogramV2Component {
    private final ActionComponentApi actionComponentApi;
    private final ContextComponentDependencies contextComponentApi;
    private final CustomActionHandlersComponentApi customActionHandlersComponentApi;

    /* renamed from: mapper$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j mapper = k.b(new PricesHistogramV2Component$Companion$create$1$1$mapper$2(this));
    private final RetainComposerComponentApi retainComponentApi;

    PricesHistogramV2Component$Companion$create$1$1(C7475g c7475g) {
        this.customActionHandlersComponentApi = (CustomActionHandlersComponentApi) c7475g.getComponent(CustomActionHandlersComponentApi.class);
        this.actionComponentApi = (ActionComponentApi) c7475g.getComponent(ActionComponentApi.class);
        this.contextComponentApi = (ContextComponentDependencies) c7475g.getComponent(ContextComponentDependencies.class);
        this.retainComponentApi = (RetainComposerComponentApi) c7475g.getComponent(RetainComposerComponentApi.class);
    }

    @Override // ru.ozon.app.android.travel.feature.general.common.widgets.pricesHistogram.v2.di.PricesHistogramV2Component
    public PricesHistogramV2Mapper getMapper() {
        return (PricesHistogramV2Mapper) this.mapper.getValue();
    }

    @Override // ru.ozon.app.android.travel.feature.general.common.widgets.pricesHistogram.v2.di.PricesHistogramV2Component
    public PricesHistogramV2ViewModel getPricesHistogramV2ViewModel() {
        return new PricesHistogramV2ViewModel(this.actionComponentApi.getActionRepository(), this.retainComponentApi.getComposerController());
    }

    @Override // ru.ozon.app.android.travel.feature.general.common.widgets.pricesHistogram.v2.di.PricesHistogramV2Component
    public l getTokenizedAnalytics() {
        return this.retainComponentApi.getTokenizedAnalytics();
    }
}
