package androidx.compose.foundation.gestures;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.gestures.d;
import androidx.compose.foundation.gestures.e;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$FloatRef;
import xsna.azl;
import xsna.b6l;
import xsna.dtp0;
import xsna.e02;
import xsna.f12;
import xsna.hz1;
import xsna.itl;
import xsna.jmr0;
import xsna.kz1;
import xsna.l02;
import xsna.lz1;
import xsna.m9k0;
import xsna.myc0;
import xsna.r9k0;
import xsna.s3q0;
import xsna.spj;
import xsna.tpr;
import xsna.vt1;
import xsna.wzs;
import xsna.yvj;
import xsna.zak0;

/* compiled from: AnchoredDraggable.kt */
/* loaded from: classes11.dex */
public final class c<T> extends e {
    public f12<T> K;
    public Orientation L;
    public tpr M;
    public azl N;

    /* compiled from: AnchoredDraggable.kt */
    @b6l(c = "androidx.compose.foundation.gestures.AnchoredDraggableNode$onDragStopped$1", f = "AnchoredDraggable.kt", l = {438, 440}, m = "invokeSuspend", v = 1)
    public static final class a extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        final /* synthetic */ d.C0006d $event;
        int label;
        final /* synthetic */ c<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(c<T> cVar, d.C0006d c0006d, spj<? super a> spjVar) {
            super(2, spjVar);
            this.this$0 = cVar;
            this.$event = c0006d;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return new a(this.this$0, this.$event, spjVar);
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
                c<T> cVar = this.this$0;
                long j = this.$event.a;
                cVar.getClass();
                long f = jmr0.f((itl.f(cVar).A == LayoutDirection.Rtl && cVar.L == Orientation.Horizontal) ? -1.0f : 1.0f, j);
                float c = cVar.L == Orientation.Vertical ? jmr0.c(f) : jmr0.b(f);
                c<T> cVar2 = this.this$0;
                cVar2.getClass();
                this.label = 1;
                if (c.D2(cVar2, c, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else if (i == 1) {
                kotlin.a.a(obj);
            } else {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a.a(obj);
                s3q0 s3q0Var = s3q0.a;
            }
            return s3q0.a;
        }
    }

    public c() {
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object D2(c cVar, float f, ContinuationImpl continuationImpl) {
        b bVar;
        int i;
        Ref$FloatRef ref$FloatRef;
        cVar.getClass();
        if (continuationImpl instanceof b) {
            bVar = (b) continuationImpl;
            int i2 = bVar.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                bVar.label = i2 - Integer.MIN_VALUE;
                Object obj = bVar.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = bVar.label;
                if (i != 0) {
                    kotlin.a.a(obj);
                    if (cVar.K.d()) {
                        f12<T> f12Var = cVar.K;
                        bVar.label = 1;
                        Object h = f12Var.h(f, bVar);
                        if (h != coroutineSingletons) {
                            return h;
                        }
                    } else {
                        Ref$FloatRef ref$FloatRef2 = new Ref$FloatRef();
                        ref$FloatRef2.element = f;
                        f12<T> f12Var2 = cVar.K;
                        e02 e02Var = new e02(cVar, ref$FloatRef2, f, null);
                        bVar.L$0 = ref$FloatRef2;
                        bVar.label = 2;
                        Object b = f12Var2.f.b(MutatePriority.Default, new l02(f12Var2, null, e02Var), bVar);
                        if (b != coroutineSingletons) {
                            b = s3q0.a;
                        }
                        if (b != coroutineSingletons) {
                            ref$FloatRef = ref$FloatRef2;
                        }
                    }
                    return coroutineSingletons;
                }
                if (i == 1) {
                    kotlin.a.a(obj);
                    return obj;
                }
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ref$FloatRef = (Ref$FloatRef) bVar.L$0;
                kotlin.a.a(obj);
                return new Float(ref$FloatRef.element);
            }
        }
        bVar = new b(cVar, continuationImpl);
        Object obj2 = bVar.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = bVar.label;
        if (i != 0) {
        }
        return new Float(ref$FloatRef.element);
    }

    @Override // androidx.compose.foundation.gestures.e
    public final boolean A2() {
        return ((zak0) this.K.m).getValue() != null;
    }

    public final void E2() {
        dtp0 dtp0Var = hz1.a;
        vt1 vt1Var = hz1.b;
        azl azlVar = itl.f(this).z;
        this.N = azlVar;
        kz1 kz1Var = new kz1(this.K, vt1Var, new com.vk.movika.sdk.base.logic.processor.actions.f(azlVar, 2));
        float f = r9k0.a;
        this.M = new m9k0(kz1Var, lz1.b, dtp0Var);
    }

    @Override // xsna.q630.c
    public final void a2() {
        E2();
    }

    @Override // androidx.compose.foundation.gestures.e
    public final Object p2(e.b.a aVar, e.b bVar) {
        f12<T> f12Var = this.K;
        Object b = f12Var.f.b(MutatePriority.Default, new l02(f12Var, null, new androidx.compose.foundation.gestures.a(aVar, this, null)), bVar);
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (b != coroutineSingletons) {
            b = s3q0.a;
        }
        return b == coroutineSingletons ? b : s3q0.a;
    }

    @Override // xsna.htl, xsna.cmb0
    public final void q() {
        h1();
        if (this.o) {
            azl azlVar = itl.f(this).z;
            azl azlVar2 = this.N;
            if (azlVar2 == null || !azlVar2.equals(azlVar)) {
                this.N = azlVar;
                E2();
            }
        }
    }

    @Override // androidx.compose.foundation.gestures.e
    public final void v2(d.C0006d c0006d) {
        if (this.o) {
            myc0.h(W1(), null, null, new a(this, c0006d, null), 3);
        }
    }

    @Override // androidx.compose.foundation.gestures.e
    public final void u2(long j) {
    }
}
