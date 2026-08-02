package com.vk.push.core.feature;

import com.vungle.ads.internal.protos.Sdk;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import xsna.b6l;
import xsna.spj;

/* compiled from: FeatureManagerImpl.kt */
@b6l(c = "com.vk.push.core.feature.FeatureManagerImpl", f = "FeatureManagerImpl.kt", l = {Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE, Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE}, m = "saveUpdateInterval-IoAF18A")
/* loaded from: classes.dex */
public final class c extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ FeatureManagerImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(FeatureManagerImpl featureManagerImpl, spj<? super c> spjVar) {
        super(spjVar);
        this.this$0 = featureManagerImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object m98access$saveUpdateIntervalIoAF18A = FeatureManagerImpl.m98access$saveUpdateIntervalIoAF18A(this.this$0, this);
        return m98access$saveUpdateIntervalIoAF18A == CoroutineSingletons.COROUTINE_SUSPENDED ? m98access$saveUpdateIntervalIoAF18A : new Result(m98access$saveUpdateIntervalIoAF18A);
    }
}
