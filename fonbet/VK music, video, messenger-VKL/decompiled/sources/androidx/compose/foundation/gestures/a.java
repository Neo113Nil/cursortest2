package androidx.compose.foundation.gestures;

import androidx.compose.foundation.gestures.d;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.b6l;
import xsna.fz1;
import xsna.hl1;
import xsna.izs;
import xsna.s3q0;
import xsna.spj;
import xsna.vgo;
import xsna.wzs;
import xsna.yzs;

/* compiled from: AnchoredDraggable.kt */
@b6l(c = "androidx.compose.foundation.gestures.AnchoredDraggableNode$drag$2", f = "AnchoredDraggable.kt", l = {412}, m = "invokeSuspend", v = 1)
/* loaded from: classes11.dex */
public final class a extends SuspendLambda implements yzs<fz1, vgo<Object>, spj<? super s3q0>, Object> {
    final /* synthetic */ wzs<izs<? super d.b, s3q0>, spj<? super s3q0>, Object> $forEachDelta;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ c<Object> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public a(wzs<? super izs<? super d.b, s3q0>, ? super spj<? super s3q0>, ? extends Object> wzsVar, c<Object> cVar, spj<? super a> spjVar) {
        super(3, spjVar);
        this.$forEachDelta = wzsVar;
        this.this$0 = cVar;
    }

    @Override // xsna.yzs
    public final Object invoke(fz1 fz1Var, vgo<Object> vgoVar, spj<? super s3q0> spjVar) {
        a aVar = new a(this.$forEachDelta, this.this$0, spjVar);
        aVar.L$0 = fz1Var;
        return aVar.invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            fz1 fz1Var = (fz1) this.L$0;
            wzs<izs<? super d.b, s3q0>, spj<? super s3q0>, Object> wzsVar = this.$forEachDelta;
            hl1 hl1Var = new hl1(1, this.this$0, fz1Var);
            this.label = 1;
            if (wzsVar.invoke(hl1Var, this) == coroutineSingletons) {
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
