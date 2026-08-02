package ru.ozon.app.android.fresh.main.widgets.curtainGoals.v2.presentation;

import Sc.s;
import Wc.a;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.fresh.main.widgets.curtainGoals.v2.api.CurtainGoalsApi;
import ru.ozon.app.android.fresh.main.widgets.curtainGoals.v2.api.CurtainGoalsResponse;
import ru.ozon.app.android.utils.livedata.SingleLiveEvent;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.fresh.main.widgets.curtainGoals.v2.presentation.CurtainGoalsViewModel$onApplyCouponAction$1", f = "CurtainGoalsViewModel.kt", l = {43}, m = "invokeSuspend")
/* loaded from: classes12.dex */
final class CurtainGoalsViewModel$onApplyCouponAction$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ Map<String, String> $couponBody;
    int label;
    final /* synthetic */ CurtainGoalsViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CurtainGoalsViewModel$onApplyCouponAction$1(CurtainGoalsViewModel curtainGoalsViewModel, Map<String, String> map, d<? super CurtainGoalsViewModel$onApplyCouponAction$1> dVar) {
        super(2, dVar);
        this.this$0 = curtainGoalsViewModel;
        this.$couponBody = map;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new CurtainGoalsViewModel$onApplyCouponAction$1(this.this$0, this.$couponBody, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        CurtainGoalsApi curtainGoalsApi;
        SingleLiveEvent singleLiveEvent;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            curtainGoalsApi = this.this$0.api;
            Map<String, String> map = this.$couponBody;
            this.label = 1;
            obj = curtainGoalsApi.applyGoalsCoupon(map, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
        }
        singleLiveEvent = this.this$0._appliedCouponResult;
        singleLiveEvent.postValue((CurtainGoalsResponse) obj);
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((CurtainGoalsViewModel$onApplyCouponAction$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
