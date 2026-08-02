package ru.ozon.app.android.marketing.widgets.staticCouponList.v1.presentation;

import Ae.InterfaceC2397i;
import Sc.s;
import Wc.a;
import fd.InterfaceC6511n;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import ru.ozon.app.android.marketing.widgets.staticCouponList.v1.presentation.StaticCouponListWidgetViewModel;
import ru.ozon.app.android.platform.customActionHandlers.composerActionWithAction.ComposerActionWithActionDTO;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"LAe/i;", "Lru/ozon/app/android/platform/customActionHandlers/composerActionWithAction/ComposerActionWithActionDTO;", "", "error", "", "<anonymous>", "(LAe/i;Ljava/lang/Throwable;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.marketing.widgets.staticCouponList.v1.presentation.StaticCouponListWidgetViewModel$handleComposerAction$2", f = "StaticCouponListWidgetViewModel.kt", l = {76}, m = "invokeSuspend")
/* loaded from: classes12.dex */
final class StaticCouponListWidgetViewModel$handleComposerAction$2 extends j implements InterfaceC6511n<InterfaceC2397i<? super ComposerActionWithActionDTO>, Throwable, d<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ StaticCouponListWidgetViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    StaticCouponListWidgetViewModel$handleComposerAction$2(StaticCouponListWidgetViewModel staticCouponListWidgetViewModel, d<? super StaticCouponListWidgetViewModel$handleComposerAction$2> dVar) {
        super(3, dVar);
        this.this$0 = staticCouponListWidgetViewModel;
    }

    @Override // fd.InterfaceC6511n
    public final Object invoke(InterfaceC2397i<? super ComposerActionWithActionDTO> interfaceC2397i, Throwable th2, d<? super Unit> dVar) {
        StaticCouponListWidgetViewModel$handleComposerAction$2 staticCouponListWidgetViewModel$handleComposerAction$2 = new StaticCouponListWidgetViewModel$handleComposerAction$2(this.this$0, dVar);
        staticCouponListWidgetViewModel$handleComposerAction$2.L$0 = th2;
        return staticCouponListWidgetViewModel$handleComposerAction$2.invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        boolean isNetworkRelatedError;
        Object emitErrorResult;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            Throwable th2 = (Throwable) this.L$0;
            Lm0.a.f17149a.e(th2);
            StaticCouponListWidgetViewModel.ActionV2Throwable actionV2Throwable = th2 instanceof StaticCouponListWidgetViewModel.ActionV2Throwable ? (StaticCouponListWidgetViewModel.ActionV2Throwable) th2 : null;
            String message = actionV2Throwable != null ? actionV2Throwable.getMessage() : null;
            StaticCouponListWidgetViewModel staticCouponListWidgetViewModel = this.this$0;
            isNetworkRelatedError = staticCouponListWidgetViewModel.isNetworkRelatedError(th2);
            this.label = 1;
            emitErrorResult = staticCouponListWidgetViewModel.emitErrorResult(message, isNetworkRelatedError, this);
            if (emitErrorResult == aVar) {
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
}
