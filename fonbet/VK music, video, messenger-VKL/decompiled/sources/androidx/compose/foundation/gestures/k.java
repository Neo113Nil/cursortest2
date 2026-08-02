package androidx.compose.foundation.gestures;

import androidx.compose.foundation.gestures.d;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.b6l;
import xsna.ij8;
import xsna.izs;
import xsna.n160;
import xsna.s3q0;
import xsna.spj;
import xsna.wzs;
import xsna.zhh0;

/* compiled from: Scrollable.kt */
@b6l(c = "androidx.compose.foundation.gestures.ScrollableNode$drag$2$1", f = "Scrollable.kt", l = {370}, m = "invokeSuspend", v = 1)
/* loaded from: classes11.dex */
public final class k extends SuspendLambda implements wzs<n160, spj<? super s3q0>, Object> {
    final /* synthetic */ wzs<izs<? super d.b, s3q0>, spj<? super s3q0>, Object> $forEachDelta;
    final /* synthetic */ zhh0 $this_with;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(spj spjVar, wzs wzsVar, zhh0 zhh0Var) {
        super(2, spjVar);
        this.$forEachDelta = wzsVar;
        this.$this_with = zhh0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        k kVar = new k(spjVar, this.$forEachDelta, this.$this_with);
        kVar.L$0 = obj;
        return kVar;
    }

    @Override // xsna.wzs
    public final Object invoke(n160 n160Var, spj<? super s3q0> spjVar) {
        return ((k) create(n160Var, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            n160 n160Var = (n160) this.L$0;
            wzs<izs<? super d.b, s3q0>, spj<? super s3q0>, Object> wzsVar = this.$forEachDelta;
            ij8 ij8Var = new ij8(28, n160Var, this.$this_with);
            this.label = 1;
            if (wzsVar.invoke(ij8Var, this) == coroutineSingletons) {
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
