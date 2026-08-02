package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;
import com.vungle.ads.internal.protos.Sdk;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.b6l;
import xsna.eyx;
import xsna.mr90;
import xsna.myc0;
import xsna.s3q0;
import xsna.spj;
import xsna.wzs;
import xsna.yvj;

/* compiled from: PausingDispatcher.jvm.kt */
@b6l(c = "androidx.lifecycle.PausingDispatcherKt$whenStateAtLeast$2", f = "PausingDispatcher.jvm.kt", l = {Sdk.SDKError.Reason.INVALID_ADUNIT_BID_PAYLOAD_VALUE}, m = "invokeSuspend", v = 1)
/* loaded from: classes12.dex */
public final class p extends SuspendLambda implements wzs<yvj, spj<Object>, Object> {
    final /* synthetic */ wzs<yvj, spj<Object>, Object> $block;
    final /* synthetic */ Lifecycle.State $minState;
    final /* synthetic */ Lifecycle $this_whenStateAtLeast;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public p(Lifecycle lifecycle, Lifecycle.State state, wzs<? super yvj, ? super spj<Object>, ? extends Object> wzsVar, spj<? super p> spjVar) {
        super(2, spjVar);
        this.$this_whenStateAtLeast = lifecycle;
        this.$minState = state;
        this.$block = wzsVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        p pVar = new p(this.$this_whenStateAtLeast, this.$minState, this.$block, spjVar);
        pVar.L$0 = obj;
        return pVar;
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<Object> spjVar) {
        return ((p) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        h hVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            eyx eyxVar = (eyx) ((yvj) this.L$0).getCoroutineContext().get(eyx.a.b);
            if (eyxVar == null) {
                throw new IllegalStateException("when[State] methods should have a parent job");
            }
            mr90 mr90Var = new mr90();
            h hVar2 = new h(this.$this_whenStateAtLeast, this.$minState, mr90Var.c, eyxVar);
            try {
                wzs<yvj, spj<Object>, Object> wzsVar = this.$block;
                this.L$0 = hVar2;
                this.label = 1;
                obj = myc0.k(mr90Var, wzsVar, this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
                hVar = hVar2;
            } catch (Throwable th) {
                th = th;
                hVar = hVar2;
                hVar.a();
                throw th;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            hVar = (h) this.L$0;
            try {
                kotlin.a.a(obj);
            } catch (Throwable th2) {
                th = th2;
                hVar.a();
                throw th;
            }
        }
        hVar.a();
        return obj;
    }
}
