package com.unity3d.ads.core.data.repository;

import gatewayprotocol.v1.NativeConfigurationOuterClass;
import kotlin.a;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.b6l;
import xsna.ksr;
import xsna.rsr;
import xsna.s3q0;
import xsna.spj;
import xsna.wzs;
import xsna.yvj;

/* compiled from: AndroidSessionRepository.kt */
@b6l(c = "com.unity3d.ads.core.data.repository.AndroidSessionRepository$nativeConfiguration$1", f = "AndroidSessionRepository.kt", l = {224}, m = "invokeSuspend")
/* loaded from: classes14.dex */
public final class AndroidSessionRepository$nativeConfiguration$1 extends SuspendLambda implements wzs<yvj, spj<? super NativeConfigurationOuterClass.NativeConfiguration>, Object> {
    int label;
    final /* synthetic */ AndroidSessionRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidSessionRepository$nativeConfiguration$1(AndroidSessionRepository androidSessionRepository, spj<? super AndroidSessionRepository$nativeConfiguration$1> spjVar) {
        super(2, spjVar);
        this.this$0 = androidSessionRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new AndroidSessionRepository$nativeConfiguration$1(this.this$0, spjVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ksr ksrVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            a.a(obj);
            return obj;
        }
        a.a(obj);
        ksrVar = this.this$0.persistedNativeConfiguration;
        this.label = 1;
        Object n = rsr.n(ksrVar, this);
        return n == coroutineSingletons ? coroutineSingletons : n;
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super NativeConfigurationOuterClass.NativeConfiguration> spjVar) {
        return ((AndroidSessionRepository$nativeConfiguration$1) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }
}
