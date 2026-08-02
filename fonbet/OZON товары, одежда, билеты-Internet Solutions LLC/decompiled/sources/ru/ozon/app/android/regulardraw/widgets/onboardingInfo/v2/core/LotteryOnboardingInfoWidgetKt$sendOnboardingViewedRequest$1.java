package ru.ozon.app.android.regulardraw.widgets.onboardingInfo.v2.core;

import Sc.s;
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
@e(c = "ru.ozon.app.android.regulardraw.widgets.onboardingInfo.v2.core.LotteryOnboardingInfoWidgetKt$sendOnboardingViewedRequest$1", f = "LotteryOnboardingInfoWidget.kt", l = {162}, m = "invokeSuspend")
/* loaded from: classes13.dex */
final class LotteryOnboardingInfoWidgetKt$sendOnboardingViewedRequest$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ String $actionName;
    final /* synthetic */ ActionV2Repository $actionV2Repository;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    LotteryOnboardingInfoWidgetKt$sendOnboardingViewedRequest$1(ActionV2Repository actionV2Repository, String str, d<? super LotteryOnboardingInfoWidgetKt$sendOnboardingViewedRequest$1> dVar) {
        super(2, dVar);
        this.$actionV2Repository = actionV2Repository;
        this.$actionName = str;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new LotteryOnboardingInfoWidgetKt$sendOnboardingViewedRequest$1(this.$actionV2Repository, this.$actionName, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            ActionV2Repository actionV2Repository = this.$actionV2Repository;
            ActionV2Request actionV2Request = new ActionV2Request(null, this.$actionName, false, 5, null);
            this.label = 1;
            if (actionV2Repository.callActionSuspend(actionV2Request, Object.class, this) == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((LotteryOnboardingInfoWidgetKt$sendOnboardingViewedRequest$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
