package ru.ozon.app.android.select.feature.entry;

import Ae.x0;
import Sc.s;
import Wc.a;
import io.sentry.android.core.internal.tombstone.TombstoneProtos$Tombstone;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.select.feature.entry.OzonSelectViewModel$delayedCloseSplash$1", f = "OzonSelectViewModel.kt", l = {TombstoneProtos$Tombstone.GUEST_THREADS_FIELD_NUMBER, 29}, m = "invokeSuspend")
/* loaded from: classes13.dex */
final class OzonSelectViewModel$delayedCloseSplash$1 extends j implements Function2<M, d<? super Unit>, Object> {
    int label;
    final /* synthetic */ OzonSelectViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OzonSelectViewModel$delayedCloseSplash$1(OzonSelectViewModel ozonSelectViewModel, d<? super OzonSelectViewModel$delayedCloseSplash$1> dVar) {
        super(2, dVar);
        this.this$0 = ozonSelectViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new OzonSelectViewModel$delayedCloseSplash$1(this.this$0, dVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x003f, code lost:
    
        if (xe.Y.b(100, r6) == r0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0041, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0027, code lost:
    
        if (xe.Y.b(100, r6) == r0) goto L19;
     */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        AtomicBoolean atomicBoolean;
        AtomicBoolean atomicBoolean2;
        x0 x0Var;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            this.label = 1;
        } else {
            if (i11 != 1) {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
                atomicBoolean2 = this.this$0.splashScreenExitHandled;
                if (atomicBoolean2.compareAndSet(false, true)) {
                    x0Var = this.this$0._splashCompletedFlow;
                    x0Var.setValue(Boolean.TRUE);
                }
                return Unit.f71690a;
            }
            s.b(obj);
        }
        atomicBoolean = this.this$0.splashScreenExitHandled;
        if (atomicBoolean.compareAndSet(true, true)) {
            return Unit.f71690a;
        }
        this.label = 2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((OzonSelectViewModel$delayedCloseSplash$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
