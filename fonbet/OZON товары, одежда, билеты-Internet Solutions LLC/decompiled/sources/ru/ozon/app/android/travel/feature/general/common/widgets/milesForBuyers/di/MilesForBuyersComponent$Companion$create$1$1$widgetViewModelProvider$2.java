package ru.ozon.app.android.travel.feature.general.common.widgets.milesForBuyers.di;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.analytics.di.AnalyticsComponentApi;
import ru.ozon.app.android.composer.widgets.async.data.ComposerAsyncWidgetRepository;
import ru.ozon.app.android.composer.widgets.async.di.ComposerWidgetAsyncComponentApi;
import ru.ozon.app.android.travel.feature.general.common.widgets.milesForBuyers.data.MilesForBuyersMapper;
import ru.ozon.app.android.travel.feature.general.common.widgets.milesForBuyers.presentation.MilesForBuyersWidgetViewModel;
import ru.ozon.app.android.utils.dispatcherprovider.CoroutineDispatcherProvider;
import ru.ozon.app.android.utils.dispatcherprovider.di.CoroutineDispatchersComponentApi;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0005\u001a\u0010\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LPc/a;", "Lru/ozon/app/android/travel/feature/general/common/widgets/milesForBuyers/presentation/MilesForBuyersWidgetViewModel;", "kotlin.jvm.PlatformType", "invoke", "()LPc/a;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes4.dex */
final class MilesForBuyersComponent$Companion$create$1$1$widgetViewModelProvider$2 extends AbstractC7737t implements Function0<Pc.a<MilesForBuyersWidgetViewModel>> {
    final /* synthetic */ MilesForBuyersComponent$Companion$create$1$1 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MilesForBuyersComponent$Companion$create$1$1$widgetViewModelProvider$2(MilesForBuyersComponent$Companion$create$1$1 milesForBuyersComponent$Companion$create$1$1) {
        super(0);
        this.this$0 = milesForBuyersComponent$Companion$create$1$1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MilesForBuyersWidgetViewModel invoke$lambda$0(MilesForBuyersComponent$Companion$create$1$1 milesForBuyersComponent$Companion$create$1$1) {
        ComposerWidgetAsyncComponentApi composerWidgetAsyncComponentApi;
        CoroutineDispatchersComponentApi coroutineDispatchersComponentApi;
        AnalyticsComponentApi analyticsComponentApi;
        composerWidgetAsyncComponentApi = milesForBuyersComponent$Companion$create$1$1.composerWidgetAsyncComponentApi;
        ComposerAsyncWidgetRepository composerAsyncWidgetRepository = composerWidgetAsyncComponentApi.getComposerAsyncWidgetRepository();
        MilesForBuyersMapper mapper = milesForBuyersComponent$Companion$create$1$1.getMapper();
        coroutineDispatchersComponentApi = milesForBuyersComponent$Companion$create$1$1.coroutineDispatchersComponentApi;
        CoroutineDispatcherProvider dispatcherProvider = coroutineDispatchersComponentApi.getDispatcherProvider();
        analyticsComponentApi = milesForBuyersComponent$Companion$create$1$1.analyticsComponentApi;
        return new MilesForBuyersWidgetViewModel(composerAsyncWidgetRepository, mapper, dispatcherProvider, analyticsComponentApi.getPerformanceTrackerDelegate());
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final Pc.a<MilesForBuyersWidgetViewModel> invoke() {
        final MilesForBuyersComponent$Companion$create$1$1 milesForBuyersComponent$Companion$create$1$1 = this.this$0;
        return new Pc.a() { // from class: ru.ozon.app.android.travel.feature.general.common.widgets.milesForBuyers.di.a
            @Override // Pc.a
            public final Object get() {
                MilesForBuyersWidgetViewModel invoke$lambda$0;
                invoke$lambda$0 = MilesForBuyersComponent$Companion$create$1$1$widgetViewModelProvider$2.invoke$lambda$0(MilesForBuyersComponent$Companion$create$1$1.this);
                return invoke$lambda$0;
            }
        };
    }
}
