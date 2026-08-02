package ru.ozon.app.android.regulardraw.widgets.morkovskTabbar.v2.presentation.tab;

import S0.A1;
import Sc.s;
import Wc.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import m0.C7980b;
import m0.C8008p;
import m0.T0;
import ru.ozon.app.android.regulardraw.widgets.morkovskTabbar.v2.presentation.MorkovskTabbarAnimationSpecs;
import xe.M;
import xe.Y;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.regulardraw.widgets.morkovskTabbar.v2.presentation.tab.MorkovskTabbarTabIndicatorKt$badgeAppearanceAnimation$1$1$1", f = "MorkovskTabbarTabIndicator.kt", l = {100, 101}, m = "invokeSuspend")
/* loaded from: classes13.dex */
final class MorkovskTabbarTabIndicatorKt$badgeAppearanceAnimation$1$1$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ C7980b<Float, C8008p> $animationProgress;
    final /* synthetic */ A1<Function0<Unit>> $currentOnAnimated$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    MorkovskTabbarTabIndicatorKt$badgeAppearanceAnimation$1$1$1(C7980b<Float, C8008p> c7980b, A1<? extends Function0<Unit>> a12, d<? super MorkovskTabbarTabIndicatorKt$badgeAppearanceAnimation$1$1$1> dVar) {
        super(2, dVar);
        this.$animationProgress = c7980b;
        this.$currentOnAnimated$delegate = a12;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new MorkovskTabbarTabIndicatorKt$badgeAppearanceAnimation$1$1$1(this.$animationProgress, this.$currentOnAnimated$delegate, dVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0045, code lost:
    
        if (m0.C7980b.f(r3, r4, r5, null, r7, 12) == r0) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        MorkovskTabbarTabIndicatorKt$badgeAppearanceAnimation$1$1$1 morkovskTabbarTabIndicatorKt$badgeAppearanceAnimation$1$1$1;
        Function0 invoke$lambda$1;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            this.label = 1;
            if (Y.b(600L, this) == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
                morkovskTabbarTabIndicatorKt$badgeAppearanceAnimation$1$1$1 = this;
                invoke$lambda$1 = MorkovskTabbarTabIndicatorKt$badgeAppearanceAnimation$1.invoke$lambda$1(morkovskTabbarTabIndicatorKt$badgeAppearanceAnimation$1$1$1.$currentOnAnimated$delegate);
                invoke$lambda$1.invoke();
                return Unit.f71690a;
            }
            s.b(obj);
        }
        C7980b<Float, C8008p> c7980b = this.$animationProgress;
        Float f7 = new Float(1.0f);
        T0<Float> indicatorAppearance = MorkovskTabbarAnimationSpecs.INSTANCE.getIndicatorAppearance();
        this.label = 2;
        morkovskTabbarTabIndicatorKt$badgeAppearanceAnimation$1$1$1 = this;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((MorkovskTabbarTabIndicatorKt$badgeAppearanceAnimation$1$1$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
