package ru.ozon.app.android.deliveryreview.deliveryReviewForm.presentation.common.viewmodel;

import Sc.r;
import Sc.s;
import Wc.a;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.account.orders.OrderChangePreferences;
import ru.ozon.app.android.action.v2.ActionV2Repository;
import ru.ozon.app.android.action.v2.models.ActionV2Request;
import ru.ozon.app.android.action.v2.models.ActionV2Response;
import ru.ozon.app.android.deliveryreview.deliveryReviewForm.data.mapper.SendDeliveryReviewFormRequestMapper;
import ru.ozon.app.android.deliveryreview.deliveryReviewForm.data.response.SendDeliveryReviewFormResponse;
import ru.ozon.app.android.deliveryreview.deliveryReviewForm.presentation.common.viewmodel.DeliveryReviewFormViewModel;
import ru.ozon.app.android.ui.screenstate.ScreenStateExtKt;
import ru.ozon.app.android.uikit.R$string;
import ru.ozon.app.android.uikit.screenstate.ScreenState;
import ru.ozon.app.android.uikit.text.StringProvider;
import ru.ozon.app.android.utils.livedata.SingleLiveEvent;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.deliveryreview.deliveryReviewForm.presentation.common.viewmodel.DeliveryReviewFormViewModelImpl$sendForm$1", f = "DeliveryReviewFormViewModelImpl.kt", l = {197}, m = "invokeSuspend")
/* loaded from: classes11.dex */
final class DeliveryReviewFormViewModelImpl$sendForm$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ String $actionName;
    final /* synthetic */ Map<String, String> $params;
    int label;
    final /* synthetic */ DeliveryReviewFormViewModelImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DeliveryReviewFormViewModelImpl$sendForm$1(DeliveryReviewFormViewModelImpl deliveryReviewFormViewModelImpl, Map<String, String> map, String str, d<? super DeliveryReviewFormViewModelImpl$sendForm$1> dVar) {
        super(2, dVar);
        this.this$0 = deliveryReviewFormViewModelImpl;
        this.$params = map;
        this.$actionName = str;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new DeliveryReviewFormViewModelImpl$sendForm$1(this.this$0, this.$params, this.$actionName, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        SingleLiveEvent<Boolean> loadingState;
        ActionV2Repository actionV2Repository;
        SendDeliveryReviewFormRequestMapper sendDeliveryReviewFormRequestMapper;
        int i11;
        Map map;
        Object mo479requestActionResult0E7RQCE;
        OrderChangePreferences orderChangePreferences;
        AtomActionDTO nextAction;
        a aVar = a.COROUTINE_SUSPENDED;
        int i12 = this.label;
        try {
            try {
                if (i12 == 0) {
                    s.b(obj);
                    this.this$0.getLoadingState().setValue(Boolean.TRUE);
                    actionV2Repository = this.this$0.repository;
                    sendDeliveryReviewFormRequestMapper = this.this$0.requestMapper;
                    i11 = this.this$0.rating;
                    map = this.this$0.groups;
                    ActionV2Request actionV2Request = new ActionV2Request(sendDeliveryReviewFormRequestMapper.map(i11, C7714v.U0(map.values()), this.$params), this.$actionName, false, 4, null);
                    this.label = 1;
                    mo479requestActionResult0E7RQCE = actionV2Repository.mo479requestActionResult0E7RQCE(actionV2Request, SendDeliveryReviewFormResponse.class, this);
                    if (mo479requestActionResult0E7RQCE == aVar) {
                        return aVar;
                    }
                } else {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    s.b(obj);
                    mo479requestActionResult0E7RQCE = ((r) obj).getF26106a();
                }
                s.b(mo479requestActionResult0E7RQCE);
                ActionV2Response actionV2Response = (ActionV2Response) mo479requestActionResult0E7RQCE;
                SendDeliveryReviewFormResponse sendDeliveryReviewFormResponse = (SendDeliveryReviewFormResponse) actionV2Response.getData();
                AtomAction atomAction = (sendDeliveryReviewFormResponse == null || (nextAction = sendDeliveryReviewFormResponse.getNextAction()) == null) ? null : AtomActionMapperKt.toAtomAction(nextAction, actionV2Response.getTrackingInfo());
                if (atomAction != null) {
                    DeliveryReviewFormViewModelImpl deliveryReviewFormViewModelImpl = this.this$0;
                    orderChangePreferences = deliveryReviewFormViewModelImpl.orderChangePreferences;
                    orderChangePreferences.markAsUpdated();
                    deliveryReviewFormViewModelImpl.getAction().setValue(new DeliveryReviewFormViewModel.Action.Success(atomAction));
                }
                loadingState = this.this$0.getLoadingState();
            } catch (Exception e11) {
                this.this$0.getAction().setValue(new DeliveryReviewFormViewModel.Action.Error(StringProvider.getString(ScreenStateExtKt.toScreenState$default(e11, null, false, 3, null) instanceof ScreenState.NoConnection ? R$string.error_common_error_no_connection_description : R$string.error_common_error_technical_error_title)));
                loadingState = this.this$0.getLoadingState();
            }
            loadingState.setValue(Boolean.FALSE);
            return Unit.f71690a;
        } catch (Throwable th2) {
            this.this$0.getLoadingState().setValue(Boolean.FALSE);
            throw th2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((DeliveryReviewFormViewModelImpl$sendForm$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
