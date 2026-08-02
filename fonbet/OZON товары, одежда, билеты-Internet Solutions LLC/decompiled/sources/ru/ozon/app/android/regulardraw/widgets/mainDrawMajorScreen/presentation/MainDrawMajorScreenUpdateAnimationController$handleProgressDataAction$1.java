package ru.ozon.app.android.regulardraw.widgets.mainDrawMajorScreen.presentation;

import Sc.s;
import Wc.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.regulardraw.widgets.mainDrawMajorScreen.data.MainDrawMajorScreenVO;
import ru.ozon.uni.atoms.af.AtomAction;
import xe.M;
import xe.Y;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.regulardraw.widgets.mainDrawMajorScreen.presentation.MainDrawMajorScreenUpdateAnimationController$handleProgressDataAction$1", f = "MainDrawMajorScreenUpdateAnimationController.kt", l = {63}, m = "invokeSuspend")
/* loaded from: classes13.dex */
final class MainDrawMajorScreenUpdateAnimationController$handleProgressDataAction$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ MainDrawMajorScreenVO.UpdateProgressAnimation $item;
    int label;
    final /* synthetic */ MainDrawMajorScreenUpdateAnimationController this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MainDrawMajorScreenUpdateAnimationController$handleProgressDataAction$1(MainDrawMajorScreenVO.UpdateProgressAnimation updateProgressAnimation, MainDrawMajorScreenUpdateAnimationController mainDrawMajorScreenUpdateAnimationController, d<? super MainDrawMajorScreenUpdateAnimationController$handleProgressDataAction$1> dVar) {
        super(2, dVar);
        this.$item = updateProgressAnimation;
        this.this$0 = mainDrawMajorScreenUpdateAnimationController;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new MainDrawMajorScreenUpdateAnimationController$handleProgressDataAction$1(this.$item, this.this$0, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        AtomAction progressDataAction;
        Function1 function1;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            long delay = this.$item.getDelay();
            this.label = 1;
            if (Y.b(delay, this) == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
        }
        MainDrawMajorScreenVO.UpdateProgressAnimation updateProgressAnimation = this.this$0.animationData;
        if (updateProgressAnimation != null && (progressDataAction = updateProgressAnimation.getProgressDataAction()) != null) {
            function1 = this.this$0.actionHandler;
            function1.invoke(progressDataAction);
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((MainDrawMajorScreenUpdateAnimationController$handleProgressDataAction$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
