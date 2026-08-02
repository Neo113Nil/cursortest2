package com.vk.push.core.base;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.b6l;
import xsna.bdn;
import xsna.gzs;
import xsna.myc0;
import xsna.qsl;
import xsna.s3q0;
import xsna.spj;
import xsna.wzs;
import xsna.yok0;
import xsna.yvj;
import xsna.zcl;
import xsna.zvj;

/* compiled from: DelayedAction.kt */
/* loaded from: classes5.dex */
public final class DelayedAction {
    public final yvj a;
    public final gzs<s3q0> b;
    public yok0 c;

    /* compiled from: DelayedAction.kt */
    @b6l(c = "com.vk.push.core.base.DelayedAction$runWithDelay$1$1", f = "DelayedAction.kt", l = {23}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        final /* synthetic */ long $delayMillis;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ DelayedAction this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(long j, DelayedAction delayedAction, spj<? super a> spjVar) {
            super(2, spjVar);
            this.$delayMillis = j;
            this.this$0 = delayedAction;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            a aVar = new a(this.$delayMillis, this.this$0, spjVar);
            aVar.L$0 = obj;
            return aVar;
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
            return ((a) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            yvj yvjVar;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.a.a(obj);
                yvj yvjVar2 = (yvj) this.L$0;
                long j = this.$delayMillis;
                this.L$0 = yvjVar2;
                this.label = 1;
                if (qsl.b(j, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                yvjVar = yvjVar2;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                yvjVar = (yvj) this.L$0;
                kotlin.a.a(obj);
            }
            zvj.e(yvjVar);
            if (zvj.f(yvjVar)) {
                this.this$0.b.invoke();
            }
            return s3q0.a;
        }
    }

    public DelayedAction(yvj yvjVar, gzs<s3q0> gzsVar) {
        this.a = yvjVar;
        this.b = gzsVar;
    }

    public final void runWithDelay(long j) {
        synchronized (this) {
            try {
                yok0 yok0Var = this.c;
                if (yok0Var != null) {
                    yok0Var.b(null);
                }
                this.c = myc0.h(this.a, null, null, new a(j, this, null), 3);
                s3q0 s3q0Var = s3q0.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public DelayedAction(yvj yvjVar, gzs gzsVar, int i, zcl zclVar) {
        this((i & 1) != 0 ? zvj.a(bdn.b.T(1)) : yvjVar, gzsVar);
    }
}
