package ru.ozon.app.android.storefront.onboardingscreen.domain;

import Sc.s;
import Wc.a;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.storefront.onboardingscreen.domain.OnboardingInteractorImpl;
import ru.ozon.uni.atoms.af.AtomAction;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.storefront.onboardingscreen.domain.OnboardingInteractorImpl$setFlowAction$1", f = "OnboardingInteractorImpl.kt", l = {51, 52, 53, 54}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class OnboardingInteractorImpl$setFlowAction$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ AtomAction.Click $flowAction;
    int label;
    final /* synthetic */ OnboardingInteractorImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OnboardingInteractorImpl$setFlowAction$1(AtomAction.Click click, OnboardingInteractorImpl onboardingInteractorImpl, d<? super OnboardingInteractorImpl$setFlowAction$1> dVar) {
        super(2, dVar);
        this.$flowAction = click;
        this.this$0 = onboardingInteractorImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new OnboardingInteractorImpl$setFlowAction$1(this.$flowAction, this.this$0, dVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0048, code lost:
    
        if (r7 == r0) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0085, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0061, code lost:
    
        if (r7 == r0) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0078, code lost:
    
        if (r7 == r0) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0083, code lost:
    
        if (r7 == r0) goto L33;
     */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object emitCloseFlowState;
        Object onPushOrdersAction;
        Object onPushAllAction;
        Object onNextStepAction;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            Map<String, String> params = this.$flowAction.getParams();
            String str = params != null ? params.get("onboardingAction") : null;
            if (Intrinsics.d(str, OnboardingInteractorImpl.Companion.OnboardingFlowAction.NEXT_STEP_PARAM.getValue())) {
                OnboardingInteractorImpl onboardingInteractorImpl = this.this$0;
                this.label = 1;
                onNextStepAction = onboardingInteractorImpl.onNextStepAction(this);
            } else if (Intrinsics.d(str, OnboardingInteractorImpl.Companion.OnboardingFlowAction.PUSH_ACTION_PARAM.getValue())) {
                OnboardingInteractorImpl onboardingInteractorImpl2 = this.this$0;
                AtomAction.Click click = this.$flowAction;
                this.label = 2;
                onPushAllAction = onboardingInteractorImpl2.onPushAllAction(click, this);
            } else if (Intrinsics.d(str, OnboardingInteractorImpl.Companion.OnboardingFlowAction.PUSH_ORDERS_PARAM.getValue())) {
                OnboardingInteractorImpl onboardingInteractorImpl3 = this.this$0;
                this.label = 3;
                onPushOrdersAction = onboardingInteractorImpl3.onPushOrdersAction(this);
            } else {
                OnboardingInteractorImpl onboardingInteractorImpl4 = this.this$0;
                this.label = 4;
                emitCloseFlowState = onboardingInteractorImpl4.emitCloseFlowState(this);
            }
        } else {
            if (i11 != 1 && i11 != 2 && i11 != 3 && i11 != 4) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((OnboardingInteractorImpl$setFlowAction$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
