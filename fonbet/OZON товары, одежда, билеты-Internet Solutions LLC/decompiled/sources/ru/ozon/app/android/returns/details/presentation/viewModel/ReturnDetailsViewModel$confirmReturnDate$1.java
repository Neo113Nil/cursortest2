package ru.ozon.app.android.returns.details.presentation.viewModel;

import Sc.s;
import Wc.a;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.U;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;
import ru.ozon.app.android.action.v2.ActionV2Repository;
import ru.ozon.app.android.action.v2.models.ActionV2Request;
import ru.ozon.app.android.action.v2.models.ActionV2Response;
import ru.ozon.app.android.returns.details.data.request.ConfirmTimeSlotRequest;
import ru.ozon.app.android.returns.details.data.response.ConfirmTimeSlotResponse;
import ru.ozon.app.android.returns.details.presentation.viewModel.ReturnDetailsViewModel;
import ru.ozon.app.android.utils.livedata.SingleLiveEvent;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.returns.details.presentation.viewModel.ReturnDetailsViewModel$confirmReturnDate$1", f = "ReturnDetailsViewModel.kt", l = {148}, m = "invokeSuspend")
/* loaded from: classes13.dex */
final class ReturnDetailsViewModel$confirmReturnDate$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ String $actionName;
    int label;
    final /* synthetic */ ReturnDetailsViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ReturnDetailsViewModel$confirmReturnDate$1(ReturnDetailsViewModel returnDetailsViewModel, String str, d<? super ReturnDetailsViewModel$confirmReturnDate$1> dVar) {
        super(2, dVar);
        this.this$0 = returnDetailsViewModel;
        this.$actionName = str;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new ReturnDetailsViewModel$confirmReturnDate$1(this.this$0, this.$actionName, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        SingleLiveEvent<ReturnDetailsViewModel.Action> action;
        ReturnDetailsViewModel.Action.Loading loading;
        JsonParser jsonParser;
        String str;
        ActionV2Repository actionV2Repository;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        try {
            try {
                if (i11 == 0) {
                    s.b(obj);
                    this.this$0.getAction().setValue(new ReturnDetailsViewModel.Action.Loading(true));
                    jsonParser = this.this$0.jsonDeserializer;
                    str = this.this$0.selectedTimeSlotValue;
                    if (str == null) {
                        str = "";
                    }
                    ConfirmTimeSlotRequest confirmTimeSlotRequest = (ConfirmTimeSlotRequest) jsonParser.fromJson(str, ConfirmTimeSlotRequest.class);
                    actionV2Repository = this.this$0.repository;
                    ActionV2Request actionV2Request = new ActionV2Request(U.i(new Pair("timeSlot", confirmTimeSlotRequest)), this.$actionName, false, 4, null);
                    this.label = 1;
                    obj = actionV2Repository.callActionSuspend(actionV2Request, ConfirmTimeSlotResponse.class, this);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    s.b(obj);
                }
                ConfirmTimeSlotResponse confirmTimeSlotResponse = (ConfirmTimeSlotResponse) ((ActionV2Response) obj).getData();
                if (confirmTimeSlotResponse != null) {
                    this.this$0.handleConfirmReturnSuccess(confirmTimeSlotResponse);
                }
                action = this.this$0.getAction();
                loading = new ReturnDetailsViewModel.Action.Loading(false);
            } catch (Exception e11) {
                this.this$0.handleConfirmReturnError(e11);
                action = this.this$0.getAction();
                loading = new ReturnDetailsViewModel.Action.Loading(false);
            }
            action.setValue(loading);
            return Unit.f71690a;
        } catch (Throwable th2) {
            this.this$0.getAction().setValue(new ReturnDetailsViewModel.Action.Loading(false));
            throw th2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((ReturnDetailsViewModel$confirmReturnDate$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
