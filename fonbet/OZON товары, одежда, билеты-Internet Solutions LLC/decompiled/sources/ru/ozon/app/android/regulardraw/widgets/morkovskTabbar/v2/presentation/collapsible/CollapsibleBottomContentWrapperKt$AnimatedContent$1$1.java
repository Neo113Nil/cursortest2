package ru.ozon.app.android.regulardraw.widgets.morkovskTabbar.v2.presentation.collapsible;

import Sc.s;
import Wc.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import m0.C7980b;
import m0.C8008p;
import m0.T0;
import ru.ozon.app.android.regulardraw.widgets.morkovskTabbar.v2.presentation.MorkovskTabbarAnimationSpecs;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.regulardraw.widgets.morkovskTabbar.v2.presentation.collapsible.CollapsibleBottomContentWrapperKt$AnimatedContent$1$1", f = "CollapsibleBottomContentWrapper.kt", l = {59}, m = "invokeSuspend")
/* loaded from: classes13.dex */
final class CollapsibleBottomContentWrapperKt$AnimatedContent$1$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ C7980b<Float, C8008p> $contentHeightMultiplier;
    final /* synthetic */ float $contentHeightMultiplierTarget;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CollapsibleBottomContentWrapperKt$AnimatedContent$1$1(C7980b<Float, C8008p> c7980b, float f7, d<? super CollapsibleBottomContentWrapperKt$AnimatedContent$1$1> dVar) {
        super(2, dVar);
        this.$contentHeightMultiplier = c7980b;
        this.$contentHeightMultiplierTarget = f7;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new CollapsibleBottomContentWrapperKt$AnimatedContent$1$1(this.$contentHeightMultiplier, this.$contentHeightMultiplierTarget, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            C7980b<Float, C8008p> c7980b = this.$contentHeightMultiplier;
            Float f7 = new Float(this.$contentHeightMultiplierTarget);
            T0<Float> stickyCollapse = MorkovskTabbarAnimationSpecs.INSTANCE.getStickyCollapse();
            this.label = 1;
            if (C7980b.f(c7980b, f7, stickyCollapse, null, this, 12) == aVar) {
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
        return ((CollapsibleBottomContentWrapperKt$AnimatedContent$1$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
