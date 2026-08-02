package ru.ozon.app.android.travel.feature.general.booking.widgets.additionalServices.presentation;

import Sc.s;
import Wc.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.composer.widgets.async.data.api.ComposerAsyncWidgetResponse;
import ru.ozon.app.android.travel.feature.general.booking.widgets.additionalServices.data.AdditionalServicesDTO;
import ru.ozon.app.android.travel.feature.general.booking.widgets.additionalServices.data.AdditionalServicesMapper;
import ru.ozon.app.android.travel.feature.general.booking.widgets.additionalServices.presentation.AdditionalServicesVO;
import ru.ozon.app.android.travel.utils.asyncWidget.AsyncWidgetFetchedModel;
import xe.M;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lxe/M;", "Lru/ozon/app/android/travel/utils/asyncWidget/AsyncWidgetFetchedModel;", "Lru/ozon/app/android/travel/feature/general/booking/widgets/additionalServices/presentation/AdditionalServicesVO$State$Loaded;", "<anonymous>", "(Lxe/M;)Lru/ozon/app/android/travel/utils/asyncWidget/AsyncWidgetFetchedModel;"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.travel.feature.general.booking.widgets.additionalServices.presentation.AdditionalServicesViewModel$mapAsyncWidgetResponse$2", f = "AdditionalServicesViewModel.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class AdditionalServicesViewModel$mapAsyncWidgetResponse$2 extends j implements Function2<M, d<? super AsyncWidgetFetchedModel<AdditionalServicesVO.State.Loaded>>, Object> {
    final /* synthetic */ ComposerAsyncWidgetResponse<AdditionalServicesDTO> $response;
    int label;
    final /* synthetic */ AdditionalServicesViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AdditionalServicesViewModel$mapAsyncWidgetResponse$2(AdditionalServicesViewModel additionalServicesViewModel, ComposerAsyncWidgetResponse<AdditionalServicesDTO> composerAsyncWidgetResponse, d<? super AdditionalServicesViewModel$mapAsyncWidgetResponse$2> dVar) {
        super(2, dVar);
        this.this$0 = additionalServicesViewModel;
        this.$response = composerAsyncWidgetResponse;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new AdditionalServicesViewModel$mapAsyncWidgetResponse$2(this.this$0, this.$response, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        AdditionalServicesMapper additionalServicesMapper;
        a aVar = a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        additionalServicesMapper = this.this$0.mapper;
        return new AsyncWidgetFetchedModel(additionalServicesMapper.mapAsyncState(this.$response.getState()), this.$response.getTrackingPayloads(), this.$response.getMetrics());
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super AsyncWidgetFetchedModel<AdditionalServicesVO.State.Loaded>> dVar) {
        return ((AdditionalServicesViewModel$mapAsyncWidgetResponse$2) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
