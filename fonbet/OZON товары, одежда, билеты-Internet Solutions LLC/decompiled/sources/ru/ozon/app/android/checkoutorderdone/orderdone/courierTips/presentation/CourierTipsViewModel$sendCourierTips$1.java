package ru.ozon.app.android.checkoutorderdone.orderdone.courierTips.presentation;

import Sc.r;
import Sc.s;
import Wc.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.action.v2.models.ActionV2Response;
import ru.ozon.app.android.checkoutorderdone.orderdone.courierTips.data.CourierTipsApi;
import ru.ozon.app.android.checkoutorderdone.orderdone.courierTips.data.SendCourierTipsBody;
import ru.ozon.app.android.utils.livedata.SingleLiveEvent;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.checkoutorderdone.orderdone.courierTips.presentation.CourierTipsViewModel$sendCourierTips$1", f = "CourierTipsViewModel.kt", l = {52}, m = "invokeSuspend")
/* loaded from: classes11.dex */
final class CourierTipsViewModel$sendCourierTips$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ String $orderID;
    final /* synthetic */ String $orderNumber;
    final /* synthetic */ int $tipID;
    int label;
    final /* synthetic */ CourierTipsViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CourierTipsViewModel$sendCourierTips$1(CourierTipsViewModel courierTipsViewModel, String str, int i11, String str2, d<? super CourierTipsViewModel$sendCourierTips$1> dVar) {
        super(2, dVar);
        this.this$0 = courierTipsViewModel;
        this.$orderID = str;
        this.$tipID = i11;
        this.$orderNumber = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new CourierTipsViewModel$sendCourierTips$1(this.this$0, this.$orderID, this.$tipID, this.$orderNumber, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        SingleLiveEvent singleLiveEvent;
        CourierTipsApi courierTipsApi;
        SingleLiveEvent singleLiveEvent2;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        try {
            if (i11 == 0) {
                s.b(obj);
                courierTipsApi = this.this$0.api;
                SendCourierTipsBody sendCourierTipsBody = new SendCourierTipsBody(this.$orderID, this.$tipID, this.$orderNumber);
                this.label = 1;
                obj = courierTipsApi.sendCourierTips(sendCourierTipsBody, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
            }
            singleLiveEvent2 = this.this$0._sentTipsResponse;
            singleLiveEvent2.setValue(r.a((ActionV2Response) obj));
        } catch (Exception e11) {
            Lm0.a.f17149a.e(e11);
            singleLiveEvent = this.this$0._sentTipsResponse;
            r.Companion companion = r.INSTANCE;
            singleLiveEvent.setValue(r.a(s.a(e11)));
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((CourierTipsViewModel$sendCourierTips$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
