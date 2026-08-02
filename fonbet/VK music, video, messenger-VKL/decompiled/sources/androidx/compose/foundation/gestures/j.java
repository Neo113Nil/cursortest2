package androidx.compose.foundation.gestures;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.gestures.d;
import androidx.compose.foundation.gestures.e;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineStart;
import xsna.b6l;
import xsna.epx;
import xsna.fho;
import xsna.gho;
import xsna.jmr0;
import xsna.myc0;
import xsna.ov70;
import xsna.s3q0;
import xsna.spj;
import xsna.wzs;
import xsna.yvj;
import xsna.yzs;

/* compiled from: Draggable.kt */
/* loaded from: classes11.dex */
public final class j extends e {
    public gho K;
    public Orientation L;
    public boolean M;
    public yzs<? super yvj, ? super ov70, ? super spj<? super s3q0>, ? extends Object> N;
    public yzs<? super yvj, ? super Float, ? super spj<? super s3q0>, ? extends Object> O;
    public boolean P;

    /* compiled from: Draggable.kt */
    @b6l(c = "androidx.compose.foundation.gestures.DraggableNode$onDragStarted$1", f = "Draggable.kt", l = {332}, m = "invokeSuspend", v = 1)
    public static final class a extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        final /* synthetic */ long $startedPosition;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(long j, spj<? super a> spjVar) {
            super(2, spjVar);
            this.$startedPosition = j;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            a aVar = j.this.new a(this.$startedPosition, spjVar);
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
                yzs<? super yvj, ? super ov70, ? super spj<? super s3q0>, ? extends Object> yzsVar = j.this.N;
                ov70 ov70Var = new ov70(this.$startedPosition);
                this.label = 1;
                if (yzsVar.invoke(yvjVar, ov70Var, this) == coroutineSingletons) {
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

    /* compiled from: Draggable.kt */
    @b6l(c = "androidx.compose.foundation.gestures.DraggableNode$onDragStopped$1", f = "Draggable.kt", l = {339}, m = "invokeSuspend", v = 1)
    public static final class b extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        final /* synthetic */ d.C0006d $event;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(d.C0006d c0006d, spj<? super b> spjVar) {
            super(2, spjVar);
            this.$event = c0006d;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            b bVar = j.this.new b(this.$event, spjVar);
            bVar.L$0 = obj;
            return bVar;
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
            return ((b) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.a.a(obj);
                yvj yvjVar = (yvj) this.L$0;
                j jVar = j.this;
                yzs<? super yvj, ? super Float, ? super spj<? super s3q0>, ? extends Object> yzsVar = jVar.O;
                long f = jmr0.f(jVar.P ? -1.0f : 1.0f, this.$event.a);
                Orientation orientation = j.this.L;
                fho.a aVar = fho.a;
                Float f2 = new Float(orientation == Orientation.Vertical ? jmr0.c(f) : jmr0.b(f));
                this.label = 1;
                if (yzsVar.invoke(yvjVar, f2, this) == coroutineSingletons) {
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

    public j() {
        throw null;
    }

    @Override // androidx.compose.foundation.gestures.e
    public final boolean A2() {
        return this.M;
    }

    @Override // androidx.compose.foundation.gestures.e
    public final Object p2(e.b.a aVar, e.b bVar) {
        Object a2 = this.K.a(MutatePriority.UserInput, new i(aVar, this, null), bVar);
        return a2 == CoroutineSingletons.COROUTINE_SUSPENDED ? a2 : s3q0.a;
    }

    @Override // androidx.compose.foundation.gestures.e
    public final void u2(long j) {
        if (!this.o || epx.f(this.N, fho.a)) {
            return;
        }
        myc0.h(W1(), null, CoroutineStart.UNDISPATCHED, new a(j, null), 1);
    }

    @Override // androidx.compose.foundation.gestures.e
    public final void v2(d.C0006d c0006d) {
        if (!this.o || epx.f(this.O, fho.b)) {
            return;
        }
        myc0.h(W1(), null, CoroutineStart.UNDISPATCHED, new b(c0006d, null), 1);
    }
}
