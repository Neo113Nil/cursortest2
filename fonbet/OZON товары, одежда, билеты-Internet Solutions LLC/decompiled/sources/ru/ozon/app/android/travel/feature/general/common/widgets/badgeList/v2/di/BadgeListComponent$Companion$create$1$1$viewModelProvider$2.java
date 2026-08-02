package ru.ozon.app.android.travel.feature.general.common.widgets.badgeList.v2.di;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.analytics.di.AnalyticsComponentApi;
import ru.ozon.app.android.composer.widgets.async.data.ComposerAsyncWidgetRepository;
import ru.ozon.app.android.composer.widgets.async.di.ComposerWidgetAsyncComponentApi;
import ru.ozon.app.android.travel.feature.general.common.widgets.badgeList.v2.data.BadgeListMapper;
import ru.ozon.app.android.travel.feature.general.common.widgets.badgeList.v2.presentation.BadgeListWidgetViewModel;
import ru.ozon.app.android.utils.dispatcherprovider.CoroutineDispatcherProvider;
import ru.ozon.app.android.utils.dispatcherprovider.di.CoroutineDispatchersComponentApi;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LPc/a;", "Lru/ozon/app/android/travel/feature/general/common/widgets/badgeList/v2/presentation/BadgeListWidgetViewModel;", "invoke", "()LPc/a;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes3.dex */
final class BadgeListComponent$Companion$create$1$1$viewModelProvider$2 extends AbstractC7737t implements Function0<Pc.a<BadgeListWidgetViewModel>> {
    final /* synthetic */ BadgeListComponent$Companion$create$1$1 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BadgeListComponent$Companion$create$1$1$viewModelProvider$2(BadgeListComponent$Companion$create$1$1 badgeListComponent$Companion$create$1$1) {
        super(0);
        this.this$0 = badgeListComponent$Companion$create$1$1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BadgeListWidgetViewModel invoke$lambda$0(BadgeListComponent$Companion$create$1$1 badgeListComponent$Companion$create$1$1) {
        ComposerWidgetAsyncComponentApi composerWidgetAsyncComponentApi;
        CoroutineDispatchersComponentApi coroutineDispatchersComponentApi;
        AnalyticsComponentApi analyticsComponentApi;
        composerWidgetAsyncComponentApi = badgeListComponent$Companion$create$1$1.composerWidgetAsyncComponentApi;
        ComposerAsyncWidgetRepository composerAsyncWidgetRepository = composerWidgetAsyncComponentApi.getComposerAsyncWidgetRepository();
        BadgeListMapper mapper = badgeListComponent$Companion$create$1$1.getMapper();
        coroutineDispatchersComponentApi = badgeListComponent$Companion$create$1$1.coroutineDispatchersComponentApi;
        CoroutineDispatcherProvider dispatcherProvider = coroutineDispatchersComponentApi.getDispatcherProvider();
        analyticsComponentApi = badgeListComponent$Companion$create$1$1.analyticsComponentApi;
        return new BadgeListWidgetViewModel(composerAsyncWidgetRepository, mapper, dispatcherProvider, analyticsComponentApi.getPerformanceTrackerDelegate());
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final Pc.a<BadgeListWidgetViewModel> invoke() {
        final BadgeListComponent$Companion$create$1$1 badgeListComponent$Companion$create$1$1 = this.this$0;
        return new Pc.a() { // from class: ru.ozon.app.android.travel.feature.general.common.widgets.badgeList.v2.di.a
            @Override // Pc.a
            public final Object get() {
                BadgeListWidgetViewModel invoke$lambda$0;
                invoke$lambda$0 = BadgeListComponent$Companion$create$1$1$viewModelProvider$2.invoke$lambda$0(BadgeListComponent$Companion$create$1$1.this);
                return invoke$lambda$0;
            }
        };
    }
}
