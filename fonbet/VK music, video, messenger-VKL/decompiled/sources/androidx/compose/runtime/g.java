package androidx.compose.runtime;

import androidx.compose.runtime.Recomposer;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.b6l;
import xsna.s3q0;
import xsna.spj;
import xsna.wzs;

/* compiled from: Recomposer.kt */
@b6l(c = "androidx.compose.runtime.Recomposer$join$2", f = "Recomposer.kt", l = {}, m = "invokeSuspend", v = 1)
/* loaded from: classes11.dex */
public final class g extends SuspendLambda implements wzs<Recomposer.State, spj<? super Boolean>, Object> {
    /* synthetic */ Object L$0;
    int label;

    public g() {
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        g gVar = new g(2, spjVar);
        gVar.L$0 = obj;
        return gVar;
    }

    @Override // xsna.wzs
    public final Object invoke(Recomposer.State state, spj<? super Boolean> spjVar) {
        return ((g) create(state, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.a.a(obj);
        return Boolean.valueOf(((Recomposer.State) this.L$0) == Recomposer.State.ShutDown);
    }
}
