package ru.ozon.app.android.select.feature.entry.splash.view;

import Sc.s;
import android.view.ViewPropertyAnimator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import xe.B0;
import xe.C10727i;
import xe.M;
import xe.Y;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.select.feature.entry.splash.view.SelectSplashScreenView$playAnimation$1", f = "SelectSplashScreenView.kt", l = {119, 123, 124, 127}, m = "invokeSuspend")
/* loaded from: classes13.dex */
final class SelectSplashScreenView$playAnimation$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ Function0<Unit> $onAnimationEnded;
    final /* synthetic */ Function0<Unit> $onStartNavigate;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ SelectSplashScreenView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SelectSplashScreenView$playAnimation$1(Function0<Unit> function0, SelectSplashScreenView selectSplashScreenView, Function0<Unit> function02, d<? super SelectSplashScreenView$playAnimation$1> dVar) {
        super(2, dVar);
        this.$onStartNavigate = function0;
        this.this$0 = selectSplashScreenView;
        this.$onAnimationEnded = function02;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        SelectSplashScreenView$playAnimation$1 selectSplashScreenView$playAnimation$1 = new SelectSplashScreenView$playAnimation$1(this.$onStartNavigate, this.this$0, this.$onAnimationEnded, dVar);
        selectSplashScreenView$playAnimation$1.L$0 = obj;
        return selectSplashScreenView$playAnimation$1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x008b, code lost:
    
        if (xe.Y.b(500, r9) == r0) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0080, code lost:
    
        if (r1.r0(r9) == r0) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0075, code lost:
    
        if (r6.r0(r9) == r0) goto L26;
     */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        B0 b02;
        B0 b03;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            M m11 = (M) this.L$0;
            B0 c11 = C10727i.c(m11, null, null, new SelectSplashScreenView$playAnimation$1$gradientJob$1(this.this$0, null), 3);
            B0 c12 = C10727i.c(m11, null, null, new SelectSplashScreenView$playAnimation$1$contentJob$1(this.this$0, null), 3);
            this.L$0 = c11;
            this.L$1 = c12;
            this.label = 1;
            if (Y.b(2000L, this) != aVar) {
                b02 = c11;
                b03 = c12;
            }
            return aVar;
        }
        if (i11 == 1) {
            b03 = (B0) this.L$1;
            b02 = (B0) this.L$0;
            s.b(obj);
        } else if (i11 == 2) {
            b03 = (B0) this.L$0;
            s.b(obj);
            this.L$0 = null;
            this.label = 3;
        } else {
            if (i11 != 3) {
                if (i11 != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
                ViewPropertyAnimator duration = this.this$0.animate().alpha(0.0f).setDuration(200L);
                final Function0<Unit> function0 = this.$onAnimationEnded;
                duration.withEndAction(new Runnable() { // from class: ru.ozon.app.android.select.feature.entry.splash.view.a
                    @Override // java.lang.Runnable
                    public final void run() {
                        Function0.this.invoke();
                    }
                });
                return Unit.f71690a;
            }
            s.b(obj);
            this.label = 4;
        }
        this.$onStartNavigate.invoke();
        this.L$0 = b03;
        this.L$1 = null;
        this.label = 2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((SelectSplashScreenView$playAnimation$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
