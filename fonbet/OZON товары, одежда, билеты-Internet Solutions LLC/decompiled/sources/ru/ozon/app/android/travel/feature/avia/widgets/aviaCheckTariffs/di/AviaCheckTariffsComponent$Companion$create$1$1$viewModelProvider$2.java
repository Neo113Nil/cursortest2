package ru.ozon.app.android.travel.feature.avia.widgets.aviaCheckTariffs.di;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.analytics.di.AnalyticsComponentApi;
import ru.ozon.app.android.composer.widgets.async.data.ComposerAsyncWidgetRepository;
import ru.ozon.app.android.composer.widgets.async.di.ComposerWidgetAsyncComponentApi;
import ru.ozon.app.android.travel.feature.avia.widgets.aviaCheckTariffs.data.AviaCheckTariffsMapper;
import ru.ozon.app.android.travel.feature.avia.widgets.aviaCheckTariffs.presentation.flights.AviaCheckTariffsViewWidgetViewModel;
import ru.ozon.app.android.utils.dispatcherprovider.CoroutineDispatcherProvider;
import ru.ozon.app.android.utils.dispatcherprovider.di.CoroutineDispatchersComponentApi;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LPc/a;", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaCheckTariffs/presentation/flights/AviaCheckTariffsViewWidgetViewModel;", "invoke", "()LPc/a;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes10.dex */
final class AviaCheckTariffsComponent$Companion$create$1$1$viewModelProvider$2 extends AbstractC7737t implements Function0<Pc.a<AviaCheckTariffsViewWidgetViewModel>> {
    final /* synthetic */ AviaCheckTariffsComponent$Companion$create$1$1 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AviaCheckTariffsComponent$Companion$create$1$1$viewModelProvider$2(AviaCheckTariffsComponent$Companion$create$1$1 aviaCheckTariffsComponent$Companion$create$1$1) {
        super(0);
        this.this$0 = aviaCheckTariffsComponent$Companion$create$1$1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AviaCheckTariffsViewWidgetViewModel invoke$lambda$0(AviaCheckTariffsComponent$Companion$create$1$1 aviaCheckTariffsComponent$Companion$create$1$1) {
        ComposerWidgetAsyncComponentApi composerWidgetAsyncComponentApi;
        CoroutineDispatchersComponentApi coroutineDispatchersComponentApi;
        AnalyticsComponentApi analyticsComponentApi;
        composerWidgetAsyncComponentApi = aviaCheckTariffsComponent$Companion$create$1$1.composerWidgetAsyncComponentApi;
        ComposerAsyncWidgetRepository composerAsyncWidgetRepository = composerWidgetAsyncComponentApi.getComposerAsyncWidgetRepository();
        AviaCheckTariffsMapper tariffsMapper = aviaCheckTariffsComponent$Companion$create$1$1.getTariffsMapper();
        coroutineDispatchersComponentApi = aviaCheckTariffsComponent$Companion$create$1$1.coroutineDispatchersComponentApi;
        CoroutineDispatcherProvider dispatcherProvider = coroutineDispatchersComponentApi.getDispatcherProvider();
        analyticsComponentApi = aviaCheckTariffsComponent$Companion$create$1$1.analyticsComponentApi;
        return new AviaCheckTariffsViewWidgetViewModel(composerAsyncWidgetRepository, tariffsMapper, dispatcherProvider, analyticsComponentApi.getPerformanceTrackerDelegate());
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final Pc.a<AviaCheckTariffsViewWidgetViewModel> invoke() {
        final AviaCheckTariffsComponent$Companion$create$1$1 aviaCheckTariffsComponent$Companion$create$1$1 = this.this$0;
        return new Pc.a() { // from class: ru.ozon.app.android.travel.feature.avia.widgets.aviaCheckTariffs.di.a
            @Override // Pc.a
            public final Object get() {
                AviaCheckTariffsViewWidgetViewModel invoke$lambda$0;
                invoke$lambda$0 = AviaCheckTariffsComponent$Companion$create$1$1$viewModelProvider$2.invoke$lambda$0(AviaCheckTariffsComponent$Companion$create$1$1.this);
                return invoke$lambda$0;
            }
        };
    }
}
