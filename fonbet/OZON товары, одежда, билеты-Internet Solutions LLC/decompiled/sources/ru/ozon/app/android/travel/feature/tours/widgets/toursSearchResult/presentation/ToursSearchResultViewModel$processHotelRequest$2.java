package ru.ozon.app.android.travel.feature.tours.widgets.toursSearchResult.presentation;

import Sc.s;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;
import ru.ozon.app.android.metrics.client.MetricsClient;
import ru.ozon.app.android.metrics.client.MetricsRequestData;
import ru.ozon.app.android.metrics.client.MetricsResponse;
import ru.ozon.app.android.metrics.client.MetricsResponseParser;
import ru.ozon.app.android.travel.feature.tours.widgets.toursSearchResult.data.ToursSearchResultDTO;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "Lru/ozon/app/android/travel/feature/tours/widgets/toursSearchResult/data/ToursSearchResultDTO;", "<anonymous>", "(Lxe/M;)Lru/ozon/app/android/travel/feature/tours/widgets/toursSearchResult/data/ToursSearchResultDTO;"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.travel.feature.tours.widgets.toursSearchResult.presentation.ToursSearchResultViewModel$processHotelRequest$2", f = "ToursSearchResultViewModel.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class ToursSearchResultViewModel$processHotelRequest$2 extends j implements Function2<M, d<? super ToursSearchResultDTO>, Object> {
    final /* synthetic */ String $actionName;
    final /* synthetic */ Function1<MetricsResponse.Metrics, Unit> $metricsTracker;
    final /* synthetic */ Map<String, Object> $params;
    int label;
    final /* synthetic */ ToursSearchResultViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    ToursSearchResultViewModel$processHotelRequest$2(ToursSearchResultViewModel toursSearchResultViewModel, String str, Map<String, ? extends Object> map, Function1<? super MetricsResponse.Metrics, Unit> function1, d<? super ToursSearchResultViewModel$processHotelRequest$2> dVar) {
        super(2, dVar);
        this.this$0 = toursSearchResultViewModel;
        this.$actionName = str;
        this.$params = map;
        this.$metricsTracker = function1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ToursSearchResultDTO invokeSuspend$lambda$0(ToursSearchResultViewModel toursSearchResultViewModel, String str) {
        JsonParser jsonParser;
        jsonParser = toursSearchResultViewModel.jsonDeserializer;
        return (ToursSearchResultDTO) jsonParser.fromJson(str, ToursSearchResultDTO.class);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new ToursSearchResultViewModel$processHotelRequest$2(this.this$0, this.$actionName, this.$params, this.$metricsTracker, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        MetricsClient metricsClient;
        MetricsRequestData createRequestData;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        metricsClient = this.this$0.metricsClient;
        createRequestData = this.this$0.createRequestData(this.$actionName, this.$params);
        final ToursSearchResultViewModel toursSearchResultViewModel = this.this$0;
        MetricsResponse call = metricsClient.call(createRequestData, true, new MetricsResponseParser() { // from class: ru.ozon.app.android.travel.feature.tours.widgets.toursSearchResult.presentation.a
            @Override // ru.ozon.app.android.metrics.client.MetricsResponseParser
            public final Object parse(String str) {
                ToursSearchResultDTO invokeSuspend$lambda$0;
                invokeSuspend$lambda$0 = ToursSearchResultViewModel$processHotelRequest$2.invokeSuspend$lambda$0(ToursSearchResultViewModel.this, str);
                return invokeSuspend$lambda$0;
            }
        });
        this.$metricsTracker.invoke(call.getMetrics());
        return call.getResponse();
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super ToursSearchResultDTO> dVar) {
        return ((ToursSearchResultViewModel$processHotelRequest$2) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
