package com.unity3d.ads.core.utils;

import kotlin.a;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.b6l;
import xsna.gzs;
import xsna.qsl;
import xsna.s3q0;
import xsna.spj;
import xsna.wzs;
import xsna.yvj;
import xsna.zvj;

/* compiled from: CommonCoroutineTimer.kt */
@b6l(c = "com.unity3d.ads.core.utils.CommonCoroutineTimer$start$1", f = "CommonCoroutineTimer.kt", l = {21, 24}, m = "invokeSuspend")
/* loaded from: classes14.dex */
public final class CommonCoroutineTimer$start$1 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ gzs<s3q0> $action;
    final /* synthetic */ long $delayStartMillis;
    final /* synthetic */ long $repeatMillis;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CommonCoroutineTimer$start$1(long j, gzs<s3q0> gzsVar, long j2, spj<? super CommonCoroutineTimer$start$1> spjVar) {
        super(2, spjVar);
        this.$delayStartMillis = j;
        this.$action = gzsVar;
        this.$repeatMillis = j2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        CommonCoroutineTimer$start$1 commonCoroutineTimer$start$1 = new CommonCoroutineTimer$start$1(this.$delayStartMillis, this.$action, this.$repeatMillis, spjVar);
        commonCoroutineTimer$start$1.L$0 = obj;
        return commonCoroutineTimer$start$1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x002f, code lost:
    
        if (xsna.qsl.b(r4, r6) == r0) goto L17;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        yvj yvjVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            a.a(obj);
            yvjVar = (yvj) this.L$0;
            long j = this.$delayStartMillis;
            this.L$0 = yvjVar;
            this.label = 1;
        } else {
            if (i != 1 && i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yvjVar = (yvj) this.L$0;
            a.a(obj);
        }
        while (zvj.f(yvjVar)) {
            this.$action.invoke();
            long j2 = this.$repeatMillis;
            this.L$0 = yvjVar;
            this.label = 2;
            if (qsl.b(j2, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return s3q0.a;
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((CommonCoroutineTimer$start$1) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }
}
