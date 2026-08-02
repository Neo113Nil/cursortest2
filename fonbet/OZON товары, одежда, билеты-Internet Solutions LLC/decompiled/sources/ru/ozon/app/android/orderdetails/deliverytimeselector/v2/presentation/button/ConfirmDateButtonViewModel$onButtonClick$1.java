package ru.ozon.app.android.orderdetails.deliverytimeselector.v2.presentation.button;

import Ge.f;
import Sc.s;
import Wc.a;
import io.reactivex.y;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.action.v2.ActionV2Repository;
import ru.ozon.app.android.action.v2.models.ActionV2Request;
import ru.ozon.app.android.action.v2.models.ActionV2Response;
import ru.ozon.app.android.orderdetails.deliverytimeselector.v2.data.ConfirmDateButtonActionResponse;
import ru.ozon.app.android.orderdetails.deliverytimeselector.v2.presentation.button.ConfirmDateButtonViewModel;
import ru.ozon.app.android.utils.livedata.SingleLiveEvent;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.orderdetails.deliverytimeselector.v2.presentation.button.ConfirmDateButtonViewModel$onButtonClick$1", f = "ConfirmDateButtonViewModel.kt", l = {48}, m = "invokeSuspend")
/* loaded from: classes13.dex */
final class ConfirmDateButtonViewModel$onButtonClick$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ ActionV2Request $request;
    int label;
    final /* synthetic */ ConfirmDateButtonViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ConfirmDateButtonViewModel$onButtonClick$1(ConfirmDateButtonViewModel confirmDateButtonViewModel, ActionV2Request actionV2Request, d<? super ConfirmDateButtonViewModel$onButtonClick$1> dVar) {
        super(2, dVar);
        this.this$0 = confirmDateButtonViewModel;
        this.$request = actionV2Request;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new ConfirmDateButtonViewModel$onButtonClick$1(this.this$0, this.$request, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        SingleLiveEvent singleLiveEvent;
        SingleLiveEvent singleLiveEvent2;
        String handlingThrowableAndGetErrorMessage;
        SingleLiveEvent singleLiveEvent3;
        SingleLiveEvent singleLiveEvent4;
        ActionV2Repository actionV2Repository;
        SingleLiveEvent singleLiveEvent5;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        try {
            if (i11 == 0) {
                s.b(obj);
                singleLiveEvent4 = this.this$0.singleLoading;
                singleLiveEvent4.setValue(Boolean.TRUE);
                actionV2Repository = this.this$0.actionV2Repository;
                y callAction = actionV2Repository.callAction(this.$request, ConfirmDateButtonActionResponse.class);
                this.label = 1;
                obj = f.b(callAction, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
            }
            singleLiveEvent5 = this.this$0.singleAction;
            ConfirmDateButtonActionResponse confirmDateButtonActionResponse = (ConfirmDateButtonActionResponse) ((ActionV2Response) obj).getData();
            singleLiveEvent5.setValue(new ConfirmDateButtonViewModel.State.Success(String.valueOf(confirmDateButtonActionResponse != null ? confirmDateButtonActionResponse.getMessage() : null)));
            singleLiveEvent3 = this.this$0.singleLoading;
        } catch (Throwable th2) {
            try {
                singleLiveEvent2 = this.this$0.singleAction;
                handlingThrowableAndGetErrorMessage = this.this$0.handlingThrowableAndGetErrorMessage(th2);
                singleLiveEvent2.setValue(new ConfirmDateButtonViewModel.State.Error(handlingThrowableAndGetErrorMessage));
                singleLiveEvent3 = this.this$0.singleLoading;
            } catch (Throwable th3) {
                singleLiveEvent = this.this$0.singleLoading;
                singleLiveEvent.setValue(Boolean.FALSE);
                throw th3;
            }
        }
        singleLiveEvent3.setValue(Boolean.FALSE);
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((ConfirmDateButtonViewModel$onButtonClick$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
