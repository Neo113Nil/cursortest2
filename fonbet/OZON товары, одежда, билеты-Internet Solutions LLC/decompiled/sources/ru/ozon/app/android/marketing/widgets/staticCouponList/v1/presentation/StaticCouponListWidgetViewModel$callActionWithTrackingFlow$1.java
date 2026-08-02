package ru.ozon.app.android.marketing.widgets.staticCouponList.v1.presentation;

import Ae.InterfaceC2397i;
import Sc.r;
import Sc.s;
import W10.c;
import Wc.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.action.v2.ActionV2Repository;
import ru.ozon.app.android.action.v2.models.ActionV2Request;
import ru.ozon.app.android.action.v2.models.ActionV2Response;
import ru.ozon.app.android.marketing.widgets.staticCouponList.v1.presentation.StaticCouponListWidgetViewModel;
import ru.ozon.app.android.platform.customActionHandlers.composerActionWithAction.ComposerActionWithActionDTO;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LAe/i;", "Lru/ozon/app/android/platform/customActionHandlers/composerActionWithAction/ComposerActionWithActionDTO;", "", "<anonymous>", "(LAe/i;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.marketing.widgets.staticCouponList.v1.presentation.StaticCouponListWidgetViewModel$callActionWithTrackingFlow$1", f = "StaticCouponListWidgetViewModel.kt", l = {131, 90}, m = "invokeSuspend")
/* loaded from: classes12.dex */
final class StaticCouponListWidgetViewModel$callActionWithTrackingFlow$1 extends j implements Function2<InterfaceC2397i<? super ComposerActionWithActionDTO>, d<? super Unit>, Object> {
    final /* synthetic */ ActionV2Request $request;
    final /* synthetic */ c $trackingData;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ StaticCouponListWidgetViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    StaticCouponListWidgetViewModel$callActionWithTrackingFlow$1(StaticCouponListWidgetViewModel staticCouponListWidgetViewModel, ActionV2Request actionV2Request, c cVar, d<? super StaticCouponListWidgetViewModel$callActionWithTrackingFlow$1> dVar) {
        super(2, dVar);
        this.this$0 = staticCouponListWidgetViewModel;
        this.$request = actionV2Request;
        this.$trackingData = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        StaticCouponListWidgetViewModel$callActionWithTrackingFlow$1 staticCouponListWidgetViewModel$callActionWithTrackingFlow$1 = new StaticCouponListWidgetViewModel$callActionWithTrackingFlow$1(this.this$0, this.$request, this.$trackingData, dVar);
        staticCouponListWidgetViewModel$callActionWithTrackingFlow$1.L$0 = obj;
        return staticCouponListWidgetViewModel$callActionWithTrackingFlow$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC2397i<? super ComposerActionWithActionDTO> interfaceC2397i, d<? super Unit> dVar) {
        return ((StaticCouponListWidgetViewModel$callActionWithTrackingFlow$1) create(interfaceC2397i, dVar)).invokeSuspend(Unit.f71690a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0061, code lost:
    
        if (r1.emit(r7, r6) == r0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0063, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0042, code lost:
    
        if (r7 == r0) goto L19;
     */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        InterfaceC2397i interfaceC2397i;
        ActionV2Repository actionV2Repository;
        Object mo480requestActionResultWithTrackingBWLJW6A;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            interfaceC2397i = (InterfaceC2397i) this.L$0;
            actionV2Repository = this.this$0.actionV2Repository;
            ActionV2Request actionV2Request = this.$request;
            c cVar = this.$trackingData;
            this.L$0 = interfaceC2397i;
            this.label = 1;
            mo480requestActionResultWithTrackingBWLJW6A = actionV2Repository.mo480requestActionResultWithTrackingBWLJW6A(actionV2Request, cVar, ComposerActionWithActionDTO.class, this);
        } else {
            if (i11 != 1) {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
                return Unit.f71690a;
            }
            interfaceC2397i = (InterfaceC2397i) this.L$0;
            s.b(obj);
            mo480requestActionResultWithTrackingBWLJW6A = ((r) obj).getF26106a();
        }
        s.b(mo480requestActionResultWithTrackingBWLJW6A);
        ActionV2Response actionV2Response = (ActionV2Response) mo480requestActionResultWithTrackingBWLJW6A;
        String error = actionV2Response.getError();
        if (error != null) {
            throw new StaticCouponListWidgetViewModel.ActionV2Throwable(error);
        }
        ComposerActionWithActionDTO composerActionWithActionDTO = (ComposerActionWithActionDTO) actionV2Response.getData();
        if (composerActionWithActionDTO != null) {
            this.L$0 = null;
            this.label = 2;
        }
        return Unit.f71690a;
    }
}
