package com.unity3d.ads.core.domain;

import com.unity3d.services.core.misc.Utilities;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.b6l;
import xsna.gzs;
import xsna.s3q0;
import xsna.spj;
import xsna.wzs;
import xsna.yvj;

/* compiled from: CommonSafeCallbackInvoke.kt */
@b6l(c = "com.unity3d.ads.core.domain.CommonSafeCallbackInvoke$invoke$1", f = "CommonSafeCallbackInvoke.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes14.dex */
public final class CommonSafeCallbackInvoke$invoke$1 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ gzs<s3q0> $block;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CommonSafeCallbackInvoke$invoke$1(gzs<s3q0> gzsVar, spj<? super CommonSafeCallbackInvoke$invoke$1> spjVar) {
        super(2, spjVar);
        this.$block = gzsVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new CommonSafeCallbackInvoke$invoke$1(this.$block, spjVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.a.a(obj);
        final gzs<s3q0> gzsVar = this.$block;
        Utilities.wrapCustomerListener(new Runnable() { // from class: com.unity3d.ads.core.domain.b
            @Override // java.lang.Runnable
            public final void run() {
                gzs.this.invoke();
            }
        });
        return s3q0.a;
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((CommonSafeCallbackInvoke$invoke$1) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }
}
