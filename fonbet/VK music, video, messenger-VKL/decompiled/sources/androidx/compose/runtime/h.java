package androidx.compose.runtime;

import androidx.compose.runtime.Recomposer;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.b6l;
import xsna.cak0;
import xsna.eyx;
import xsna.g830;
import xsna.gr70;
import xsna.hqj;
import xsna.iyx;
import xsna.j5g;
import xsna.qak0;
import xsna.s3q0;
import xsna.spj;
import xsna.utk0;
import xsna.v0a0;
import xsna.w69;
import xsna.wzs;
import xsna.yvj;
import xsna.yzs;
import xsna.z0a0;
import xsna.zvj;

/* compiled from: Recomposer.kt */
@b6l(c = "androidx.compose.runtime.Recomposer$recompositionRunner$2", f = "Recomposer.kt", l = {1081}, m = "invokeSuspend", v = 1)
/* loaded from: classes11.dex */
public final class h extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ yzs<yvj, g830, spj<? super s3q0>, Object> $block;
    final /* synthetic */ g830 $parentFrameClock;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ Recomposer this$0;

    /* compiled from: Recomposer.kt */
    @b6l(c = "androidx.compose.runtime.Recomposer$recompositionRunner$2$2", f = "Recomposer.kt", l = {1081}, m = "invokeSuspend", v = 1)
    public static final class a extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        final /* synthetic */ yzs<yvj, g830, spj<? super s3q0>, Object> $block;
        final /* synthetic */ g830 $parentFrameClock;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(yzs<? super yvj, ? super g830, ? super spj<? super s3q0>, ? extends Object> yzsVar, g830 g830Var, spj<? super a> spjVar) {
            super(2, spjVar);
            this.$block = yzsVar;
            this.$parentFrameClock = g830Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            a aVar = new a(this.$block, this.$parentFrameClock, spjVar);
            aVar.L$0 = obj;
            return aVar;
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
            return ((a) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.a.a(obj);
                yvj yvjVar = (yvj) this.L$0;
                yzs<yvj, g830, spj<? super s3q0>, Object> yzsVar = this.$block;
                g830 g830Var = this.$parentFrameClock;
                this.label = 1;
                if (yzsVar.invoke(yvjVar, g830Var, this) == coroutineSingletons) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public h(Recomposer recomposer, yzs<? super yvj, ? super g830, ? super spj<? super s3q0>, ? extends Object> yzsVar, g830 g830Var, spj<? super h> spjVar) {
        super(2, spjVar);
        this.this$0 = recomposer;
        this.$block = yzsVar;
        this.$parentFrameClock = g830Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        h hVar = new h(this.this$0, this.$block, this.$parentFrameClock, spjVar);
        hVar.L$0 = obj;
        return hVar;
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((h) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0122 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        eyx f;
        utk0 utk0Var;
        z0a0 z0a0Var;
        v0a0 add;
        gr70 gr70Var;
        Throwable th;
        List<hqj> H;
        Recomposer recomposer;
        utk0 utk0Var2;
        z0a0 z0a0Var2;
        v0a0 N2;
        utk0 utk0Var3;
        z0a0 z0a0Var3;
        v0a0 N22;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            f = iyx.f(((yvj) this.L$0).getCoroutineContext());
            Recomposer recomposer2 = this.this$0;
            synchronized (recomposer2.c) {
                try {
                    Throwable th2 = recomposer2.e;
                    if (th2 != null) {
                        throw th2;
                    }
                    if (((Recomposer.State) recomposer2.u.getValue()).compareTo(Recomposer.State.ShuttingDown) <= 0) {
                        throw new IllegalStateException("Recomposer shut down");
                    }
                    if (recomposer2.d != null) {
                        throw new IllegalStateException("Recomposer already running");
                    }
                    recomposer2.d = f;
                    if (recomposer2.C() != null) {
                        b.a("called outside of runRecomposeAndApplyChanges");
                    }
                    s3q0 s3q0Var = s3q0.a;
                } catch (Throwable th3) {
                    throw th3;
                }
            }
            w69 w69Var = new w69(this.this$0, 12);
            qak0.e(qak0.a);
            synchronized (qak0.c) {
                qak0.h = j5g.v0(w69Var, qak0.h);
            }
            cak0 cak0Var = new cak0(w69Var);
            utk0 utk0Var4 = Recomposer.z;
            Recomposer.c cVar = this.this$0.y;
            try {
                do {
                    utk0Var = Recomposer.z;
                    z0a0Var = (z0a0) utk0Var.getValue();
                    add = z0a0Var.add((Object) cVar);
                    if (z0a0Var != add) {
                    }
                    break;
                } while (!utk0Var.compareAndSet(z0a0Var, add));
                break;
                Recomposer recomposer3 = this.this$0;
                synchronized (recomposer3.c) {
                    H = recomposer3.H();
                }
                int size = H.size();
                for (int i2 = 0; i2 < size; i2++) {
                    H.get(i2).o();
                }
                a aVar = new a(this.$block, this.$parentFrameClock, null);
                this.L$0 = f;
                this.L$1 = cak0Var;
                this.label = 1;
                if (zvj.d(aVar, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                gr70Var = cak0Var;
            } catch (Throwable th4) {
                gr70Var = cak0Var;
                th = th4;
                gr70Var.dispose();
                recomposer = this.this$0;
                synchronized (recomposer.c) {
                }
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gr70Var = (gr70) this.L$1;
            f = (eyx) this.L$0;
            try {
                kotlin.a.a(obj);
            } catch (Throwable th5) {
                th = th5;
                gr70Var.dispose();
                recomposer = this.this$0;
                synchronized (recomposer.c) {
                    try {
                        if (recomposer.d == f) {
                            recomposer.d = null;
                        }
                        if (recomposer.C() != null) {
                            b.a("called outside of runRecomposeAndApplyChanges");
                        }
                        s3q0 s3q0Var2 = s3q0.a;
                    } catch (Throwable th6) {
                        throw th6;
                    }
                }
                utk0 utk0Var5 = Recomposer.z;
                Recomposer.c cVar2 = this.this$0.y;
                do {
                    utk0Var2 = Recomposer.z;
                    z0a0Var2 = (z0a0) utk0Var2.getValue();
                    N2 = z0a0Var2.N2(cVar2);
                    if (z0a0Var2 == N2) {
                        break;
                    }
                } while (!utk0Var2.compareAndSet(z0a0Var2, N2));
                throw th;
            }
        }
        gr70Var.dispose();
        Recomposer recomposer4 = this.this$0;
        synchronized (recomposer4.c) {
            try {
                if (recomposer4.d == f) {
                    recomposer4.d = null;
                }
                if (recomposer4.C() != null) {
                    b.a("called outside of runRecomposeAndApplyChanges");
                }
                s3q0 s3q0Var3 = s3q0.a;
            } catch (Throwable th7) {
                throw th7;
            }
        }
        utk0 utk0Var6 = Recomposer.z;
        Recomposer.c cVar3 = this.this$0.y;
        do {
            utk0Var3 = Recomposer.z;
            z0a0Var3 = (z0a0) utk0Var3.getValue();
            N22 = z0a0Var3.N2(cVar3);
            if (z0a0Var3 == N22) {
                break;
            }
        } while (!utk0Var3.compareAndSet(z0a0Var3, N22));
        return s3q0.a;
    }
}
