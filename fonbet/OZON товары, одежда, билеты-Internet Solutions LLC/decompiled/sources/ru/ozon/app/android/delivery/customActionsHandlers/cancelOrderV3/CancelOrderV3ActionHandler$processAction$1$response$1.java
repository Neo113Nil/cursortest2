package ru.ozon.app.android.delivery.customActionsHandlers.cancelOrderV3;

import Sc.s;
import W10.c;
import Wc.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.action.custom.CustomActionHandler;
import ru.ozon.app.android.action.v2.ActionV2Repository;
import ru.ozon.app.android.action.v2.models.ActionV2Request;
import ru.ozon.app.android.action.v2.models.ActionV2Response;
import ru.ozon.app.android.platform.customActionHandlers.composerActionWithAction.ComposerActionWithActionDTO;
import xe.M;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lxe/M;", "Lru/ozon/app/android/action/v2/models/ActionV2Response;", "Lru/ozon/app/android/platform/customActionHandlers/composerActionWithAction/ComposerActionWithActionDTO;", "<anonymous>", "(Lxe/M;)Lru/ozon/app/android/action/v2/models/ActionV2Response;"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.delivery.customActionsHandlers.cancelOrderV3.CancelOrderV3ActionHandler$processAction$1$response$1", f = "CancelOrderV3ActionHandler.kt", l = {170}, m = "invokeSuspend")
/* loaded from: classes11.dex */
final class CancelOrderV3ActionHandler$processAction$1$response$1 extends j implements Function2<M, d<? super ActionV2Response<ComposerActionWithActionDTO>>, Object> {
    final /* synthetic */ CustomActionHandler.HandlerReferences $handlerRefs;
    final /* synthetic */ ActionV2Request $request;
    int label;
    final /* synthetic */ CancelOrderV3ActionHandler this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CancelOrderV3ActionHandler$processAction$1$response$1(CancelOrderV3ActionHandler cancelOrderV3ActionHandler, ActionV2Request actionV2Request, CustomActionHandler.HandlerReferences handlerReferences, d<? super CancelOrderV3ActionHandler$processAction$1$response$1> dVar) {
        super(2, dVar);
        this.this$0 = cancelOrderV3ActionHandler;
        this.$request = actionV2Request;
        this.$handlerRefs = handlerReferences;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new CancelOrderV3ActionHandler$processAction$1$response$1(this.this$0, this.$request, this.$handlerRefs, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        ActionV2Repository actionV2Repository;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 != 0) {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
            return obj;
        }
        s.b(obj);
        actionV2Repository = this.this$0.actionV2Repository;
        ActionV2Request actionV2Request = this.$request;
        c trackingData = this.$handlerRefs.getTrackingData();
        if (trackingData == null) {
            trackingData = new c(null, null, null);
        }
        this.label = 1;
        Object callActionWithTrackingSuspend = actionV2Repository.callActionWithTrackingSuspend(actionV2Request, trackingData, ComposerActionWithActionDTO.class, this);
        return callActionWithTrackingSuspend == aVar ? aVar : callActionWithTrackingSuspend;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super ActionV2Response<ComposerActionWithActionDTO>> dVar) {
        return ((CancelOrderV3ActionHandler$processAction$1$response$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
