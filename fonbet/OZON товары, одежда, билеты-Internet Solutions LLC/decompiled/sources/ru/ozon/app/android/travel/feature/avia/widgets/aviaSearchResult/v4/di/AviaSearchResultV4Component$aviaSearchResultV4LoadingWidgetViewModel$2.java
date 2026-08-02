package ru.ozon.app.android.travel.feature.avia.widgets.aviaSearchResult.v4.di;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.analytics.di.AnalyticsComponentApi;
import ru.ozon.app.android.composer.widgets.async.data.ComposerAsyncWidgetRepository;
import ru.ozon.app.android.composer.widgets.async.di.ComposerWidgetAsyncComponentApi;
import ru.ozon.app.android.travel.feature.avia.widgets.aviaSearchResult.v4.data.AviaSearchResultV4LoadingMapper;
import ru.ozon.app.android.travel.feature.avia.widgets.aviaSearchResult.v4.presentation.skeleton.AviaSearchResultV4LoadingWidgetViewModel;
import ru.ozon.app.android.utils.dispatcherprovider.CoroutineDispatcherProvider;
import ru.ozon.app.android.utils.dispatcherprovider.di.CoroutineDispatchersComponentApi;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LPc/a;", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/v4/presentation/skeleton/AviaSearchResultV4LoadingWidgetViewModel;", "invoke", "()LPc/a;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes10.dex */
final class AviaSearchResultV4Component$aviaSearchResultV4LoadingWidgetViewModel$2 extends AbstractC7737t implements Function0<Pc.a<AviaSearchResultV4LoadingWidgetViewModel>> {
    final /* synthetic */ AviaSearchResultV4Component this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AviaSearchResultV4Component$aviaSearchResultV4LoadingWidgetViewModel$2(AviaSearchResultV4Component aviaSearchResultV4Component) {
        super(0);
        this.this$0 = aviaSearchResultV4Component;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AviaSearchResultV4LoadingWidgetViewModel invoke$lambda$0(AviaSearchResultV4Component aviaSearchResultV4Component) {
        ComposerWidgetAsyncComponentApi composerWidgetAsyncComponentApi;
        CoroutineDispatchersComponentApi coroutineDispatchersComponentApi;
        AnalyticsComponentApi analyticsComponentApi;
        composerWidgetAsyncComponentApi = aviaSearchResultV4Component.composerWidgetAsyncComponentApi;
        ComposerAsyncWidgetRepository composerAsyncWidgetRepository = composerWidgetAsyncComponentApi.getComposerAsyncWidgetRepository();
        AviaSearchResultV4LoadingMapper aviaSearchResultV4LoadingMapper = aviaSearchResultV4Component.getAviaSearchResultV4LoadingMapper();
        coroutineDispatchersComponentApi = aviaSearchResultV4Component.coroutineDispatchersComponentApi;
        CoroutineDispatcherProvider dispatcherProvider = coroutineDispatchersComponentApi.getDispatcherProvider();
        analyticsComponentApi = aviaSearchResultV4Component.analyticsComponentApi;
        return new AviaSearchResultV4LoadingWidgetViewModel(composerAsyncWidgetRepository, aviaSearchResultV4LoadingMapper, dispatcherProvider, analyticsComponentApi.getPerformanceTrackerDelegate());
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final Pc.a<AviaSearchResultV4LoadingWidgetViewModel> invoke() {
        final AviaSearchResultV4Component aviaSearchResultV4Component = this.this$0;
        return new Pc.a() { // from class: ru.ozon.app.android.travel.feature.avia.widgets.aviaSearchResult.v4.di.a
            @Override // Pc.a
            public final Object get() {
                AviaSearchResultV4LoadingWidgetViewModel invoke$lambda$0;
                invoke$lambda$0 = AviaSearchResultV4Component$aviaSearchResultV4LoadingWidgetViewModel$2.invoke$lambda$0(AviaSearchResultV4Component.this);
                return invoke$lambda$0;
            }
        };
    }
}
