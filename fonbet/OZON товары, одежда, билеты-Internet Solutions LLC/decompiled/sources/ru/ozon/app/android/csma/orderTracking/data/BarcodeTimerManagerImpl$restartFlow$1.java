package ru.ozon.app.android.csma.orderTracking.data;

import Sc.s;
import Wc.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import xe.M;
import xe.N;
import xe.Y;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.csma.orderTracking.data.BarcodeTimerManagerImpl$restartFlow$1", f = "BarcodeTimerManagerImpl.kt", l = {51, 52, 55}, m = "invokeSuspend")
/* loaded from: classes11.dex */
final class BarcodeTimerManagerImpl$restartFlow$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ boolean $shortDelay;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ BarcodeTimerManagerImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BarcodeTimerManagerImpl$restartFlow$1(boolean z11, BarcodeTimerManagerImpl barcodeTimerManagerImpl, d<? super BarcodeTimerManagerImpl$restartFlow$1> dVar) {
        super(2, dVar);
        this.$shortDelay = z11;
        this.this$0 = barcodeTimerManagerImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        BarcodeTimerManagerImpl$restartFlow$1 barcodeTimerManagerImpl$restartFlow$1 = new BarcodeTimerManagerImpl$restartFlow$1(this.$shortDelay, this.this$0, dVar);
        barcodeTimerManagerImpl$restartFlow$1.L$0 = obj;
        return barcodeTimerManagerImpl$restartFlow$1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x004d, code lost:
    
        if (r8.tryEmit(r7) != r0) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0057  */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        M m11;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            M m12 = (M) this.L$0;
            if (!this.$shortDelay) {
                m11 = m12;
                while (N.f(m11)) {
                }
                return Unit.f71690a;
            }
            long j11 = BarcodeTimerManagerImpl.FIRST_DELAY_BEFORE_ANIMATION;
            this.L$0 = m12;
            this.label = 1;
            if (Y.c(j11, this) != aVar) {
                m11 = m12;
                BarcodeTimerManagerImpl barcodeTimerManagerImpl = this.this$0;
                this.L$0 = m11;
                this.label = 2;
            }
            return aVar;
        }
        if (i11 != 1) {
            if (i11 != 2 && i11 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            m11 = (M) this.L$0;
            s.b(obj);
            while (N.f(m11)) {
                BarcodeTimerManagerImpl barcodeTimerManagerImpl2 = this.this$0;
                this.L$0 = m11;
                this.label = 3;
                if (barcodeTimerManagerImpl2.repeatingAnimation(this) == aVar) {
                    return aVar;
                }
            }
            return Unit.f71690a;
        }
        m11 = (M) this.L$0;
        s.b(obj);
        BarcodeTimerManagerImpl barcodeTimerManagerImpl3 = this.this$0;
        this.L$0 = m11;
        this.label = 2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((BarcodeTimerManagerImpl$restartFlow$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
