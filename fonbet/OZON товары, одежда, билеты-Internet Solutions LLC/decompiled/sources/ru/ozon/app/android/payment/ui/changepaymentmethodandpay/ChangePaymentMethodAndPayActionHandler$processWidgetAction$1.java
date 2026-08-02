package ru.ozon.app.android.payment.ui.changepaymentmethodandpay;

import Sc.r;
import Sc.s;
import Vg.f;
import W10.c;
import Wc.a;
import android.view.ViewGroup;
import androidx.fragment.app.ComponentCallbacksC5392m;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.action.v2.ActionV2Repository;
import ru.ozon.app.android.action.v2.models.ActionV2Request;
import ru.ozon.app.android.action.v2.models.ActionV2Response;
import ru.ozon.uni.android.flashbar.factory.FlashbarFactory;
import ru.ozon.uni.android.uikit.extensions.view.ContextExtKt;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.payment.ui.changepaymentmethodandpay.ChangePaymentMethodAndPayActionHandler$processWidgetAction$1", f = "ChangePaymentMethodAndPayActionHandler.kt", l = {92}, m = "invokeSuspend")
/* loaded from: classes13.dex */
final class ChangePaymentMethodAndPayActionHandler$processWidgetAction$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ ActionV2Request $request;
    final /* synthetic */ f.a $widgetInfo;
    int label;
    final /* synthetic */ ChangePaymentMethodAndPayActionHandler this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ChangePaymentMethodAndPayActionHandler$processWidgetAction$1(ChangePaymentMethodAndPayActionHandler changePaymentMethodAndPayActionHandler, ActionV2Request actionV2Request, f.a aVar, d<? super ChangePaymentMethodAndPayActionHandler$processWidgetAction$1> dVar) {
        super(2, dVar);
        this.this$0 = changePaymentMethodAndPayActionHandler;
        this.$request = actionV2Request;
        this.$widgetInfo = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new ChangePaymentMethodAndPayActionHandler$processWidgetAction$1(this.this$0, this.$request, this.$widgetInfo, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        ActionV2Repository actionV2Repository;
        Object mo480requestActionResultWithTrackingBWLJW6A;
        ViewGroup rootView;
        ChangePaymentMethodAndPayResponseDTO changePaymentMethodAndPayResponseDTO;
        AtomActionDTO action;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            actionV2Repository = this.this$0.actionV2Repository;
            ActionV2Request actionV2Request = this.$request;
            c n11 = this.$widgetInfo.c().n();
            this.label = 1;
            mo480requestActionResultWithTrackingBWLJW6A = actionV2Repository.mo480requestActionResultWithTrackingBWLJW6A(actionV2Request, n11, ChangePaymentMethodAndPayResponseDTO.class, this);
            if (mo480requestActionResultWithTrackingBWLJW6A == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
            mo480requestActionResultWithTrackingBWLJW6A = ((r) obj).getF26106a();
        }
        ChangePaymentMethodAndPayActionHandler changePaymentMethodAndPayActionHandler = this.this$0;
        f.a aVar2 = this.$widgetInfo;
        r.Companion companion = r.INSTANCE;
        if (!(mo480requestActionResultWithTrackingBWLJW6A instanceof r.b) && (changePaymentMethodAndPayResponseDTO = (ChangePaymentMethodAndPayResponseDTO) ((ActionV2Response) mo480requestActionResultWithTrackingBWLJW6A).getData()) != null && (action = changePaymentMethodAndPayResponseDTO.getAction()) != null) {
            changePaymentMethodAndPayActionHandler.createPayment(action, aVar2);
        }
        f.a aVar3 = this.$widgetInfo;
        Throwable b11 = r.b(mo480requestActionResultWithTrackingBWLJW6A);
        if (b11 != null) {
            Lm0.a.f17149a.e(b11);
            ComponentCallbacksC5392m c11 = aVar3.a().c();
            if (c11 != null && (rootView = ContextExtKt.getRootView(c11)) != null) {
                FlashbarFactory.createDefaultError$default(FlashbarFactory.INSTANCE, rootView, null, null, null, null, null, aVar3.a().e(), 62, null);
            }
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((ChangePaymentMethodAndPayActionHandler$processWidgetAction$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
