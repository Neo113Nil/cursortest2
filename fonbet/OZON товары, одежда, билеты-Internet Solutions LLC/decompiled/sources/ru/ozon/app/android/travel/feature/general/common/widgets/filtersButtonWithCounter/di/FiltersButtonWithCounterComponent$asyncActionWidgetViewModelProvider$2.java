package ru.ozon.app.android.travel.feature.general.common.widgets.filtersButtonWithCounter.di;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.analytics.di.AnalyticsComponentApi;
import ru.ozon.app.android.composer.widgets.async.data.ComposerAsyncWidgetRepository;
import ru.ozon.app.android.composer.widgets.async.di.ComposerWidgetAsyncComponentApi;
import ru.ozon.app.android.travel.feature.general.common.widgets.filtersButtonWithCounter.data.FiltersButtonWithCounterMapper;
import ru.ozon.app.android.travel.feature.general.common.widgets.filtersButtonWithCounter.presentation.FiltersButtonWithCounterAsyncActionWidgetViewModel;
import ru.ozon.app.android.utils.dispatcherprovider.CoroutineDispatcherProvider;
import ru.ozon.app.android.utils.dispatcherprovider.di.CoroutineDispatchersComponentApi;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/app/android/travel/feature/general/common/widgets/filtersButtonWithCounter/presentation/FiltersButtonWithCounterAsyncActionWidgetViewModel;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
final class FiltersButtonWithCounterComponent$asyncActionWidgetViewModelProvider$2 extends AbstractC7737t implements Function0<FiltersButtonWithCounterAsyncActionWidgetViewModel> {
    final /* synthetic */ FiltersButtonWithCounterComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FiltersButtonWithCounterComponent$asyncActionWidgetViewModelProvider$2(FiltersButtonWithCounterComponent filtersButtonWithCounterComponent) {
        super(0);
        this.this$0 = filtersButtonWithCounterComponent;
    }

    @Override // kotlin.jvm.functions.Function0
    public final FiltersButtonWithCounterAsyncActionWidgetViewModel invoke() {
        ComposerWidgetAsyncComponentApi composerWidgetAsyncComponentApi;
        CoroutineDispatchersComponentApi coroutineDispatchersComponentApi;
        AnalyticsComponentApi analyticsComponentApi;
        composerWidgetAsyncComponentApi = this.this$0.composerWidgetAsyncComponentApi;
        ComposerAsyncWidgetRepository composerAsyncWidgetRepository = composerWidgetAsyncComponentApi.getComposerAsyncWidgetRepository();
        FiltersButtonWithCounterMapper mapper = this.this$0.getMapper();
        coroutineDispatchersComponentApi = this.this$0.coroutineDispatchersComponentApi;
        CoroutineDispatcherProvider dispatcherProvider = coroutineDispatchersComponentApi.getDispatcherProvider();
        analyticsComponentApi = this.this$0.analyticsComponentApi;
        return new FiltersButtonWithCounterAsyncActionWidgetViewModel(composerAsyncWidgetRepository, mapper, dispatcherProvider, analyticsComponentApi.getPerformanceTrackerDelegate());
    }
}
