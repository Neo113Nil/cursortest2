package com.unity3d.ads.core.domain;

import com.unity3d.ads.core.data.model.exception.InitializationException;
import com.unity3d.services.core.properties.SdkProperties;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.b6l;
import xsna.s3q0;
import xsna.spj;
import xsna.wzs;
import xsna.yvj;

/* compiled from: TriggerInitializeListener.kt */
@b6l(c = "com.unity3d.ads.core.domain.TriggerInitializeListener$error$1", f = "TriggerInitializeListener.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes14.dex */
public final class TriggerInitializeListener$error$1 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ InitializationException $e;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TriggerInitializeListener$error$1(InitializationException initializationException, spj<? super TriggerInitializeListener$error$1> spjVar) {
        super(2, spjVar);
        this.$e = initializationException;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new TriggerInitializeListener$error$1(this.$e, spjVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.a.a(obj);
        SdkProperties.notifyInitializationFailed(this.$e);
        return s3q0.a;
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((TriggerInitializeListener$error$1) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }
}
