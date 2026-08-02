package ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapInfo.v4.presentation;

import Sc.s;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.action.v2.ActionV2Repository;
import ru.ozon.app.android.action.v2.models.ActionV2Request;
import ru.ozon.app.android.action.v2.models.ActionV2Response;
import ru.ozon.app.android.travel.actionhandler.utils.extensions.ActionV2ExtensionsKt;
import ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapInfo.v4.data.FetchPinsActionResponse;
import xe.M;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lxe/M;", "Lru/ozon/app/android/action/v2/models/ActionV2Response;", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/data/FetchPinsActionResponse;", "<anonymous>", "(Lxe/M;)Lru/ozon/app/android/action/v2/models/ActionV2Response;"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapInfo.v4.presentation.UpdateHotelsManager$performUpdate$response$1", f = "UpdateHotelsManager.kt", l = {147}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class UpdateHotelsManager$performUpdate$response$1 extends j implements Function2<M, d<? super ActionV2Response<FetchPinsActionResponse>>, Object> {
    final /* synthetic */ String $actionName;
    final /* synthetic */ Map<String, Object> $params;
    int label;
    final /* synthetic */ UpdateHotelsManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    UpdateHotelsManager$performUpdate$response$1(UpdateHotelsManager updateHotelsManager, Map<String, ? extends Object> map, String str, d<? super UpdateHotelsManager$performUpdate$response$1> dVar) {
        super(2, dVar);
        this.this$0 = updateHotelsManager;
        this.$params = map;
        this.$actionName = str;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new UpdateHotelsManager$performUpdate$response$1(this.this$0, this.$params, this.$actionName, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        ActionV2Repository actionV2Repository;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            actionV2Repository = this.this$0.actionV2Repository;
            ActionV2Request actionV2Request = new ActionV2Request(this.$params, this.$actionName, true);
            this.label = 1;
            obj = actionV2Repository.callActionSuspend(actionV2Request, FetchPinsActionResponse.class, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
        }
        return ActionV2ExtensionsKt.ensureSuccessful((ActionV2Response) obj);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super ActionV2Response<FetchPinsActionResponse>> dVar) {
        return ((UpdateHotelsManager$performUpdate$response$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
