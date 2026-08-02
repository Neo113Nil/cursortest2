package ru.ozon.app.android.travel.feature.hotels.widgets.hotelsPageRoomsSearchForm.di;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.analytics.di.AnalyticsComponentApi;
import ru.ozon.app.android.composer.widgets.async.data.ComposerAsyncWidgetRepository;
import ru.ozon.app.android.composer.widgets.async.di.ComposerWidgetAsyncComponentApi;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsPageRoomsSearchForm.data.HotelsPageRoomsSearchFormEmptyResponse;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsPageRoomsSearchForm.presentation.HotelsPageRoomsSearchFormWidgetViewModel;
import ru.ozon.app.android.utils.dispatcherprovider.CoroutineDispatcherProvider;
import ru.ozon.app.android.utils.dispatcherprovider.di.CoroutineDispatchersComponentApi;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LPc/a;", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsPageRoomsSearchForm/presentation/HotelsPageRoomsSearchFormWidgetViewModel;", "invoke", "()LPc/a;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes4.dex */
final class HotelsPageRoomsSearchFormComponent$widgetViewModelProvider$2 extends AbstractC7737t implements Function0<Pc.a<HotelsPageRoomsSearchFormWidgetViewModel>> {
    final /* synthetic */ HotelsPageRoomsSearchFormComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HotelsPageRoomsSearchFormComponent$widgetViewModelProvider$2(HotelsPageRoomsSearchFormComponent hotelsPageRoomsSearchFormComponent) {
        super(0);
        this.this$0 = hotelsPageRoomsSearchFormComponent;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final HotelsPageRoomsSearchFormWidgetViewModel invoke$lambda$1(HotelsPageRoomsSearchFormComponent hotelsPageRoomsSearchFormComponent) {
        ComposerWidgetAsyncComponentApi composerWidgetAsyncComponentApi;
        CoroutineDispatchersComponentApi coroutineDispatchersComponentApi;
        AnalyticsComponentApi analyticsComponentApi;
        composerWidgetAsyncComponentApi = hotelsPageRoomsSearchFormComponent.composerWidgetAsyncComponentApi;
        ComposerAsyncWidgetRepository composerAsyncWidgetRepository = composerWidgetAsyncComponentApi.getComposerAsyncWidgetRepository();
        a aVar = new a();
        coroutineDispatchersComponentApi = hotelsPageRoomsSearchFormComponent.coroutineDispatchersComponentApi;
        CoroutineDispatcherProvider dispatcherProvider = coroutineDispatchersComponentApi.getDispatcherProvider();
        analyticsComponentApi = hotelsPageRoomsSearchFormComponent.analyticsComponentApi;
        return new HotelsPageRoomsSearchFormWidgetViewModel(composerAsyncWidgetRepository, aVar, dispatcherProvider, analyticsComponentApi.getPerformanceTrackerDelegate());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1$lambda$0(HotelsPageRoomsSearchFormEmptyResponse it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.f71690a;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final Pc.a<HotelsPageRoomsSearchFormWidgetViewModel> invoke() {
        final HotelsPageRoomsSearchFormComponent hotelsPageRoomsSearchFormComponent = this.this$0;
        return new Pc.a() { // from class: ru.ozon.app.android.travel.feature.hotels.widgets.hotelsPageRoomsSearchForm.di.b
            @Override // Pc.a
            public final Object get() {
                HotelsPageRoomsSearchFormWidgetViewModel invoke$lambda$1;
                invoke$lambda$1 = HotelsPageRoomsSearchFormComponent$widgetViewModelProvider$2.invoke$lambda$1(HotelsPageRoomsSearchFormComponent.this);
                return invoke$lambda$1;
            }
        };
    }
}
