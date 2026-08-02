package ru.ozon.app.android.travel.feature.general.services.widgets.additionalReturnServiceCell.v1.di;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.analytics.di.AnalyticsComponentApi;
import ru.ozon.app.android.composer.widgets.async.data.ComposerAsyncWidgetRepository;
import ru.ozon.app.android.composer.widgets.async.di.ComposerWidgetAsyncComponentApi;
import ru.ozon.app.android.travel.feature.general.services.widgets.additionalReturnServiceCell.v1.data.AdditionalReturnServiceCellMapper;
import ru.ozon.app.android.travel.feature.general.services.widgets.additionalReturnServiceCell.v1.presentation.AdditionalReturnServiceCellViewModel;
import ru.ozon.app.android.utils.dispatcherprovider.CoroutineDispatcherProvider;
import ru.ozon.app.android.utils.dispatcherprovider.di.CoroutineDispatchersComponentApi;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0005\u001a\u0010\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LPc/a;", "Lru/ozon/app/android/travel/feature/general/services/widgets/additionalReturnServiceCell/v1/presentation/AdditionalReturnServiceCellViewModel;", "kotlin.jvm.PlatformType", "invoke", "()LPc/a;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes4.dex */
final class AdditionalReturnServiceCellComponent$Companion$create$1$1$widgetViewModelProvider$2 extends AbstractC7737t implements Function0<Pc.a<AdditionalReturnServiceCellViewModel>> {
    final /* synthetic */ AdditionalReturnServiceCellComponent$Companion$create$1$1 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AdditionalReturnServiceCellComponent$Companion$create$1$1$widgetViewModelProvider$2(AdditionalReturnServiceCellComponent$Companion$create$1$1 additionalReturnServiceCellComponent$Companion$create$1$1) {
        super(0);
        this.this$0 = additionalReturnServiceCellComponent$Companion$create$1$1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AdditionalReturnServiceCellViewModel invoke$lambda$0(AdditionalReturnServiceCellComponent$Companion$create$1$1 additionalReturnServiceCellComponent$Companion$create$1$1) {
        ComposerWidgetAsyncComponentApi composerWidgetAsyncComponentApi;
        CoroutineDispatchersComponentApi coroutineDispatchersComponentApi;
        AnalyticsComponentApi analyticsComponentApi;
        composerWidgetAsyncComponentApi = additionalReturnServiceCellComponent$Companion$create$1$1.asyncApi;
        ComposerAsyncWidgetRepository composerAsyncWidgetRepository = composerWidgetAsyncComponentApi.getComposerAsyncWidgetRepository();
        AdditionalReturnServiceCellMapper additionalReturnServiceCellMapper = additionalReturnServiceCellComponent$Companion$create$1$1.getAdditionalReturnServiceCellMapper();
        coroutineDispatchersComponentApi = additionalReturnServiceCellComponent$Companion$create$1$1.coroutineDispatchersComponentApi;
        CoroutineDispatcherProvider dispatcherProvider = coroutineDispatchersComponentApi.getDispatcherProvider();
        analyticsComponentApi = additionalReturnServiceCellComponent$Companion$create$1$1.analyticsComponentApi;
        return new AdditionalReturnServiceCellViewModel(composerAsyncWidgetRepository, additionalReturnServiceCellMapper, dispatcherProvider, analyticsComponentApi.getPerformanceTrackerDelegate());
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final Pc.a<AdditionalReturnServiceCellViewModel> invoke() {
        final AdditionalReturnServiceCellComponent$Companion$create$1$1 additionalReturnServiceCellComponent$Companion$create$1$1 = this.this$0;
        return new Pc.a() { // from class: ru.ozon.app.android.travel.feature.general.services.widgets.additionalReturnServiceCell.v1.di.a
            @Override // Pc.a
            public final Object get() {
                AdditionalReturnServiceCellViewModel invoke$lambda$0;
                invoke$lambda$0 = AdditionalReturnServiceCellComponent$Companion$create$1$1$widgetViewModelProvider$2.invoke$lambda$0(AdditionalReturnServiceCellComponent$Companion$create$1$1.this);
                return invoke$lambda$0;
            }
        };
    }
}
