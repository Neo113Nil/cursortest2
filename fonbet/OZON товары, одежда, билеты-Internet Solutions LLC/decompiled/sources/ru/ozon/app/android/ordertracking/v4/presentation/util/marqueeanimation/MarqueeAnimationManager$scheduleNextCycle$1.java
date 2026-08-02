package ru.ozon.app.android.ordertracking.v4.presentation.util.marqueeanimation;

import Sc.s;
import Wc.a;
import Wc.b;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.ordertracking.v4.presentation.view.OrderTrackingMarqueeView;
import xe.C10737n;
import xe.M;
import xe.N;
import xe.Y;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.ordertracking.v4.presentation.util.marqueeanimation.MarqueeAnimationManager$scheduleNextCycle$1", f = "MarqueeAnimationManager.kt", l = {94, 131, 142}, m = "invokeSuspend")
/* loaded from: classes13.dex */
final class MarqueeAnimationManager$scheduleNextCycle$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ long $delay;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ MarqueeAnimationManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MarqueeAnimationManager$scheduleNextCycle$1(long j11, MarqueeAnimationManager marqueeAnimationManager, d<? super MarqueeAnimationManager$scheduleNextCycle$1> dVar) {
        super(2, dVar);
        this.$delay = j11;
        this.this$0 = marqueeAnimationManager;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        MarqueeAnimationManager$scheduleNextCycle$1 marqueeAnimationManager$scheduleNextCycle$1 = new MarqueeAnimationManager$scheduleNextCycle$1(this.$delay, this.this$0, dVar);
        marqueeAnimationManager$scheduleNextCycle$1.L$0 = obj;
        return marqueeAnimationManager$scheduleNextCycle$1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x0080, code lost:
    
        if (r9 == r0) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x00bf  */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        M m11;
        boolean z11;
        OrderTrackingMarqueeView orderTrackingMarqueeView;
        Object n11;
        M m12;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            M m13 = (M) this.L$0;
            long j11 = this.$delay;
            this.L$0 = m13;
            this.label = 1;
            if (Y.b(j11, this) != aVar) {
                m11 = m13;
            }
            return aVar;
        }
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                m12 = (M) this.L$0;
                s.b(obj);
                if (N.f(m12)) {
                    this.this$0.scheduleNextCycle();
                }
                return Unit.f71690a;
            }
            m11 = (M) this.L$0;
            s.b(obj);
            if (!N.f(m11)) {
                return Unit.f71690a;
            }
            MarqueeAnimationManager marqueeAnimationManager = this.this$0;
            this.L$0 = m11;
            this.L$1 = marqueeAnimationManager;
            this.label = 3;
            C10737n c10737n = new C10737n(1, b.b(this));
            c10737n.o();
            orderTrackingMarqueeView = marqueeAnimationManager.view;
            orderTrackingMarqueeView.startAnimation(new MarqueeAnimationManager$scheduleNextCycle$1$2$1(m11, marqueeAnimationManager, c10737n));
            n11 = c10737n.n();
            if (n11 == aVar) {
                Intrinsics.checkNotNullParameter(this, "frame");
            }
            if (n11 != aVar) {
                m12 = m11;
                if (N.f(m12)) {
                }
                return Unit.f71690a;
            }
            return aVar;
        }
        m11 = (M) this.L$0;
        s.b(obj);
        if (!N.f(m11)) {
            return Unit.f71690a;
        }
        z11 = this.this$0.isPaused;
        if (z11) {
            MarqueeAnimationManager marqueeAnimationManager2 = this.this$0;
            this.L$0 = m11;
            this.L$1 = marqueeAnimationManager2;
            this.label = 2;
            C10737n c10737n2 = new C10737n(1, b.b(this));
            c10737n2.o();
            marqueeAnimationManager2.pauseContinuation = c10737n2;
            Object n12 = c10737n2.n();
            if (n12 == aVar) {
                Intrinsics.checkNotNullParameter(this, "frame");
            }
        }
        MarqueeAnimationManager marqueeAnimationManager3 = this.this$0;
        this.L$0 = m11;
        this.L$1 = marqueeAnimationManager3;
        this.label = 3;
        C10737n c10737n3 = new C10737n(1, b.b(this));
        c10737n3.o();
        orderTrackingMarqueeView = marqueeAnimationManager3.view;
        orderTrackingMarqueeView.startAnimation(new MarqueeAnimationManager$scheduleNextCycle$1$2$1(m11, marqueeAnimationManager3, c10737n3));
        n11 = c10737n3.n();
        if (n11 == aVar) {
        }
        if (n11 != aVar) {
        }
        return aVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((MarqueeAnimationManager$scheduleNextCycle$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
