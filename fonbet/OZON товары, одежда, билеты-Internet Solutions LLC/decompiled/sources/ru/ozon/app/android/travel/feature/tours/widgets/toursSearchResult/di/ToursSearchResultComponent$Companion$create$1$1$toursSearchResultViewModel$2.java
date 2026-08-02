package ru.ozon.app.android.travel.feature.tours.widgets.toursSearchResult.di;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;
import ru.ozon.app.android.analytics.di.AnalyticsComponentApi;
import ru.ozon.app.android.metrics.client.MetricsClient;
import ru.ozon.app.android.metrics.client.di.MetricsClientComponentApi;
import ru.ozon.app.android.network.di.NetworkComponentApi;
import ru.ozon.app.android.network.serialize.JsonSerializer;
import ru.ozon.app.android.travel.feature.tours.widgets.toursSearchResult.data.ToursSearchResultApi;
import ru.ozon.app.android.travel.feature.tours.widgets.toursSearchResult.data.ToursSearchResultMapper;
import ru.ozon.app.android.travel.feature.tours.widgets.toursSearchResult.presentation.ToursSearchResultViewModel;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LPc/a;", "Lru/ozon/app/android/travel/feature/tours/widgets/toursSearchResult/presentation/ToursSearchResultViewModel;", "invoke", "()LPc/a;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes2.dex */
final class ToursSearchResultComponent$Companion$create$1$1$toursSearchResultViewModel$2 extends AbstractC7737t implements Function0<Pc.a<ToursSearchResultViewModel>> {
    final /* synthetic */ ToursSearchResultComponent$Companion$create$1$1 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ToursSearchResultComponent$Companion$create$1$1$toursSearchResultViewModel$2(ToursSearchResultComponent$Companion$create$1$1 toursSearchResultComponent$Companion$create$1$1) {
        super(0);
        this.this$0 = toursSearchResultComponent$Companion$create$1$1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ToursSearchResultViewModel invoke$lambda$0(ToursSearchResultComponent$Companion$create$1$1 toursSearchResultComponent$Companion$create$1$1) {
        ToursSearchResultApi toursSearchResultApi;
        MetricsClientComponentApi metricsClientComponentApi;
        NetworkComponentApi networkComponentApi;
        NetworkComponentApi networkComponentApi2;
        AnalyticsComponentApi analyticsComponentApi;
        toursSearchResultApi = toursSearchResultComponent$Companion$create$1$1.getToursSearchResultApi();
        Intrinsics.checkNotNullExpressionValue(toursSearchResultApi, "access$getToursSearchResultApi(...)");
        ToursSearchResultMapper toursSearchResultMapper = toursSearchResultComponent$Companion$create$1$1.getToursSearchResultMapper();
        metricsClientComponentApi = toursSearchResultComponent$Companion$create$1$1.metricsClientComponentApi;
        MetricsClient metricsClient = metricsClientComponentApi.getMetricsClient();
        networkComponentApi = toursSearchResultComponent$Companion$create$1$1.networkComponentApi;
        JsonSerializer jsonSerializer = networkComponentApi.getJsonSerializer();
        networkComponentApi2 = toursSearchResultComponent$Companion$create$1$1.networkComponentApi;
        JsonParser jsonDeserializer = networkComponentApi2.getJsonDeserializer();
        analyticsComponentApi = toursSearchResultComponent$Companion$create$1$1.analyticsComponentApi;
        return new ToursSearchResultViewModel(toursSearchResultApi, toursSearchResultMapper, metricsClient, jsonSerializer, jsonDeserializer, analyticsComponentApi.getPerformanceTrackerDelegate());
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final Pc.a<ToursSearchResultViewModel> invoke() {
        final ToursSearchResultComponent$Companion$create$1$1 toursSearchResultComponent$Companion$create$1$1 = this.this$0;
        return new Pc.a() { // from class: ru.ozon.app.android.travel.feature.tours.widgets.toursSearchResult.di.a
            @Override // Pc.a
            public final Object get() {
                ToursSearchResultViewModel invoke$lambda$0;
                invoke$lambda$0 = ToursSearchResultComponent$Companion$create$1$1$toursSearchResultViewModel$2.invoke$lambda$0(ToursSearchResultComponent$Companion$create$1$1.this);
                return invoke$lambda$0;
            }
        };
    }
}
