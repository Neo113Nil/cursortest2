package ru.ozon.app.android.common.actionHandlers;

import Sc.r;
import Sc.s;
import Vg.f;
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
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.common.actionHandlers.ClosePromoStickyBubbleAction$processWidgetAction$1", f = "ClosePromoStickyBubbleAction.kt", l = {43}, m = "invokeSuspend")
/* loaded from: classes11.dex */
final class ClosePromoStickyBubbleAction$processWidgetAction$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ ActionV2Request $request;
    final /* synthetic */ f.a $widgetInfo;
    int label;
    final /* synthetic */ ClosePromoStickyBubbleAction this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ClosePromoStickyBubbleAction$processWidgetAction$1(ClosePromoStickyBubbleAction closePromoStickyBubbleAction, ActionV2Request actionV2Request, f.a aVar, d<? super ClosePromoStickyBubbleAction$processWidgetAction$1> dVar) {
        super(2, dVar);
        this.this$0 = closePromoStickyBubbleAction;
        this.$request = actionV2Request;
        this.$widgetInfo = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new ClosePromoStickyBubbleAction$processWidgetAction$1(this.this$0, this.$request, this.$widgetInfo, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        ActionV2Repository actionV2Repository;
        Object mo480requestActionResultWithTrackingBWLJW6A;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            actionV2Repository = this.this$0.actionV2Repository;
            ActionV2Request actionV2Request = this.$request;
            c n11 = this.$widgetInfo.c().n();
            this.label = 1;
            mo480requestActionResultWithTrackingBWLJW6A = actionV2Repository.mo480requestActionResultWithTrackingBWLJW6A(actionV2Request, n11, Object.class, this);
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
        r.Companion companion = r.INSTANCE;
        if (!(mo480requestActionResultWithTrackingBWLJW6A instanceof r.b)) {
        }
        Throwable b11 = r.b(mo480requestActionResultWithTrackingBWLJW6A);
        if (b11 != null) {
            Lm0.a.f17149a.e(b11);
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((ClosePromoStickyBubbleAction$processWidgetAction$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
