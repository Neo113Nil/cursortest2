package ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapInfo.v4.presentation;

import Sc.s;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.action.v2.models.ActionV2Response;
import ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapInfo.v4.data.FetchPinsActionResponse;
import ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapInfo.v4.data.HotelsMapInfoV4Mapper;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/FetchPinsActionResponseVO;", "<anonymous>", "(Lxe/M;)Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/FetchPinsActionResponseVO;"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapInfo.v4.presentation.UpdateHotelsManager$performUpdate$2", f = "UpdateHotelsManager.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class UpdateHotelsManager$performUpdate$2 extends j implements Function2<M, d<? super FetchPinsActionResponseVO>, Object> {
    final /* synthetic */ ActionV2Response<FetchPinsActionResponse> $response;
    final /* synthetic */ Long $widgetId;
    int label;
    final /* synthetic */ UpdateHotelsManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    UpdateHotelsManager$performUpdate$2(ActionV2Response<FetchPinsActionResponse> actionV2Response, UpdateHotelsManager updateHotelsManager, Long l11, d<? super UpdateHotelsManager$performUpdate$2> dVar) {
        super(2, dVar);
        this.$response = actionV2Response;
        this.this$0 = updateHotelsManager;
        this.$widgetId = l11;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new UpdateHotelsManager$performUpdate$2(this.$response, this.this$0, this.$widgetId, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        HotelsMapInfoV4Mapper hotelsMapInfoV4Mapper;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        FetchPinsActionResponse data = this.$response.getData();
        if (data == null) {
            return null;
        }
        UpdateHotelsManager updateHotelsManager = this.this$0;
        Long l11 = this.$widgetId;
        hotelsMapInfoV4Mapper = updateHotelsManager.mapper;
        return hotelsMapInfoV4Mapper.mapPinsResponse(data, l11);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super FetchPinsActionResponseVO> dVar) {
        return ((UpdateHotelsManager$performUpdate$2) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
