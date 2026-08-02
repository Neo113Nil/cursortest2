package ru.ozon.app.android.ugc.core.widgets.topAuthorCounter.presentation.ui.widgetStates;

import S0.InterfaceC3978p0;
import Sc.s;
import Wc.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import m0.C7980b;
import m0.C8004n;
import m0.C8008p;
import m0.G;
import m0.T0;
import ru.ozon.app.android.ugc.core.widgets.topAuthorCounter.presentation.TopAuthorAnimationStateViewModel;
import ru.ozon.app.android.ugc.core.widgets.topAuthorCounter.presentation.TopAuthorAnimationUIState;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.ugc.core.widgets.topAuthorCounter.presentation.ui.widgetStates.TopAuthorAnimationStateKt$TopAuthorAnimationStateContent$3$1$1", f = "TopAuthorAnimationState.kt", l = {101, 102, 105, 111}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class TopAuthorAnimationStateKt$TopAuthorAnimationStateContent$3$1$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ C7980b<Float, C8008p> $circleAnimationProgress;
    final /* synthetic */ boolean $isResumed;
    final /* synthetic */ C7980b<Float, C8008p> $lineAnimationProgress;
    final /* synthetic */ InterfaceC3978p0<Boolean> $playConfetti;
    final /* synthetic */ TopAuthorAnimationStateViewModel $viewModel;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TopAuthorAnimationStateKt$TopAuthorAnimationStateContent$3$1$1(boolean z11, TopAuthorAnimationStateViewModel topAuthorAnimationStateViewModel, C7980b<Float, C8008p> c7980b, C7980b<Float, C8008p> c7980b2, InterfaceC3978p0<Boolean> interfaceC3978p0, d<? super TopAuthorAnimationStateKt$TopAuthorAnimationStateContent$3$1$1> dVar) {
        super(2, dVar);
        this.$isResumed = z11;
        this.$viewModel = topAuthorAnimationStateViewModel;
        this.$lineAnimationProgress = c7980b;
        this.$circleAnimationProgress = c7980b2;
        this.$playConfetti = interfaceC3978p0;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new TopAuthorAnimationStateKt$TopAuthorAnimationStateContent$3$1$1(this.$isResumed, this.$viewModel, this.$lineAnimationProgress, this.$circleAnimationProgress, this.$playConfetti, dVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x00a6, code lost:
    
        if (m0.C7980b.f(r0, r1, r2, null, r12, 12) == r6) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00a8, code lost:
    
        return r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0088, code lost:
    
        if (m0.C7980b.f(r0, r1, r3, null, r12, 12) == r6) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x006b, code lost:
    
        if (r0.m(r3, r12) == r6) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x005b, code lost:
    
        if (r0.m(r5, r12) == r6) goto L31;
     */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            if (!this.$isResumed) {
                if (Intrinsics.d(this.$viewModel.getAnimationState(), TopAuthorAnimationUIState.Animating.INSTANCE)) {
                    this.$viewModel.setAnimationState(TopAuthorAnimationUIState.Initial.INSTANCE);
                    this.$playConfetti.setValue(Boolean.FALSE);
                }
                return Unit.f71690a;
            }
            if (!Intrinsics.d(this.$viewModel.getAnimationState(), TopAuthorAnimationUIState.Initial.INSTANCE)) {
                return Unit.f71690a;
            }
            this.$viewModel.setAnimationState(TopAuthorAnimationUIState.Animating.INSTANCE);
            C7980b<Float, C8008p> c7980b = this.$lineAnimationProgress;
            Float f7 = new Float(0.0f);
            this.label = 1;
        } else if (i11 == 1) {
            s.b(obj);
        } else if (i11 == 2) {
            s.b(obj);
            C7980b<Float, C8008p> c7980b2 = this.$lineAnimationProgress;
            Float f11 = new Float(1.0f);
            T0 d11 = C8004n.d(1000, 0, null, 6);
            this.label = 3;
        } else {
            if (i11 != 3) {
                if (i11 != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
                this.$playConfetti.setValue(Boolean.TRUE);
                return Unit.f71690a;
            }
            s.b(obj);
            C7980b<Float, C8008p> c7980b3 = this.$circleAnimationProgress;
            Float f12 = new Float(1.0f);
            T0 d12 = C8004n.d(400, 0, G.b(), 2);
            this.label = 4;
        }
        C7980b<Float, C8008p> c7980b4 = this.$circleAnimationProgress;
        Float f13 = new Float(0.0f);
        this.label = 2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((TopAuthorAnimationStateKt$TopAuthorAnimationStateContent$3$1$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
