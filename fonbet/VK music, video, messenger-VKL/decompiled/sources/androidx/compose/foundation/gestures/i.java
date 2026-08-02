package androidx.compose.foundation.gestures;

import androidx.compose.foundation.gestures.d;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.ab;
import xsna.b6l;
import xsna.izs;
import xsna.pgo;
import xsna.s3q0;
import xsna.spj;
import xsna.wzs;

/* compiled from: Draggable.kt */
@b6l(c = "androidx.compose.foundation.gestures.DraggableNode$drag$2", f = "Draggable.kt", l = {323}, m = "invokeSuspend", v = 1)
/* loaded from: classes11.dex */
public final class i extends SuspendLambda implements wzs<pgo, spj<? super s3q0>, Object> {
    final /* synthetic */ wzs<izs<? super d.b, s3q0>, spj<? super s3q0>, Object> $forEachDelta;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ j this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public i(wzs<? super izs<? super d.b, s3q0>, ? super spj<? super s3q0>, ? extends Object> wzsVar, j jVar, spj<? super i> spjVar) {
        super(2, spjVar);
        this.$forEachDelta = wzsVar;
        this.this$0 = jVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        i iVar = new i(this.$forEachDelta, this.this$0, spjVar);
        iVar.L$0 = obj;
        return iVar;
    }

    @Override // xsna.wzs
    public final Object invoke(pgo pgoVar, spj<? super s3q0> spjVar) {
        return ((i) create(pgoVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            pgo pgoVar = (pgo) this.L$0;
            wzs<izs<? super d.b, s3q0>, spj<? super s3q0>, Object> wzsVar = this.$forEachDelta;
            ab abVar = new ab(11, pgoVar, this.this$0);
            this.label = 1;
            if (wzsVar.invoke(abVar, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
        }
        return s3q0.a;
    }
}
