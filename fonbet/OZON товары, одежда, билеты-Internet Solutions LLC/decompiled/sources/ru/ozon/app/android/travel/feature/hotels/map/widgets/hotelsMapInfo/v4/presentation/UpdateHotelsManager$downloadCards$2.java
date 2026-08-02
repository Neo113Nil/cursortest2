package ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapInfo.v4.presentation;

import Sc.s;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.action.v2.models.ActionV2Response;
import ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapInfo.v4.data.FetchCardsActionResponse;
import ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapInfo.v4.data.HotelsMapInfoV4DTO;
import ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapInfo.v4.data.HotelsMapInfoV4Mapper;
import ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapInfo.v4.presentation.HotelsMapInfoV4VO;
import ru.ozon.uni.atoms.data.notification.NotificationDTO;
import xe.M;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lxe/M;", "", "", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/HotelsMapInfoV4VO$Card;", "<anonymous>", "(Lxe/M;)Ljava/util/Map;"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapInfo.v4.presentation.UpdateHotelsManager$downloadCards$2", f = "UpdateHotelsManager.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class UpdateHotelsManager$downloadCards$2 extends j implements Function2<M, d<? super Map<String, HotelsMapInfoV4VO.Card>>, Object> {
    final /* synthetic */ HotelsMapInfoV4DTO.CardStyle $cardStyle;
    final /* synthetic */ List<String> $favoriteIds;
    final /* synthetic */ Function1<NotificationDTO, Unit> $onGetNotification;
    final /* synthetic */ ActionV2Response<FetchCardsActionResponse> $response;
    final /* synthetic */ Long $widgetId;
    int label;
    final /* synthetic */ UpdateHotelsManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    UpdateHotelsManager$downloadCards$2(ActionV2Response<FetchCardsActionResponse> actionV2Response, Function1<? super NotificationDTO, Unit> function1, UpdateHotelsManager updateHotelsManager, Long l11, HotelsMapInfoV4DTO.CardStyle cardStyle, List<String> list, d<? super UpdateHotelsManager$downloadCards$2> dVar) {
        super(2, dVar);
        this.$response = actionV2Response;
        this.$onGetNotification = function1;
        this.this$0 = updateHotelsManager;
        this.$widgetId = l11;
        this.$cardStyle = cardStyle;
        this.$favoriteIds = list;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new UpdateHotelsManager$downloadCards$2(this.$response, this.$onGetNotification, this.this$0, this.$widgetId, this.$cardStyle, this.$favoriteIds, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        HotelsMapInfoV4Mapper hotelsMapInfoV4Mapper;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        FetchCardsActionResponse data = this.$response.getData();
        if (data == null) {
            return null;
        }
        Function1<NotificationDTO, Unit> function1 = this.$onGetNotification;
        UpdateHotelsManager updateHotelsManager = this.this$0;
        Long l11 = this.$widgetId;
        HotelsMapInfoV4DTO.CardStyle cardStyle = this.$cardStyle;
        List<String> list = this.$favoriteIds;
        NotificationDTO notification = data.getNotification();
        if (notification != null) {
            function1.invoke(notification);
        }
        hotelsMapInfoV4Mapper = updateHotelsManager.mapper;
        return hotelsMapInfoV4Mapper.mapCardsResponse(l11, data, cardStyle, list);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Map<String, HotelsMapInfoV4VO.Card>> dVar) {
        return ((UpdateHotelsManager$downloadCards$2) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
