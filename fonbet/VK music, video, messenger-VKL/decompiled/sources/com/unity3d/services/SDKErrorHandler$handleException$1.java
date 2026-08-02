package com.unity3d.services;

import com.google.protobuf.ByteString;
import com.unity3d.ads.core.extensions.ExceptionExtensionsKt;
import com.unity3d.services.core.log.DeviceLog;
import kotlin.a;
import kotlin.coroutines.d;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.b6l;
import xsna.s3q0;
import xsna.spj;
import xsna.wzs;
import xsna.yvj;

/* compiled from: SDKErrorHandler.kt */
@b6l(c = "com.unity3d.services.SDKErrorHandler$handleException$1", f = "SDKErrorHandler.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes14.dex */
public final class SDKErrorHandler$handleException$1 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ d $context;
    final /* synthetic */ Throwable $exception;
    int label;
    final /* synthetic */ SDKErrorHandler this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SDKErrorHandler$handleException$1(SDKErrorHandler sDKErrorHandler, d dVar, Throwable th, spj<? super SDKErrorHandler$handleException$1> spjVar) {
        super(2, spjVar);
        this.this$0 = sDKErrorHandler;
        this.$context = dVar;
        this.$exception = th;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new SDKErrorHandler$handleException$1(this.this$0, this.$context, this.$exception, spjVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String retrieveCoroutineName;
        ByteString retrieveOpportunityId;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        a.a(obj);
        retrieveCoroutineName = this.this$0.retrieveCoroutineName(this.$context);
        retrieveOpportunityId = this.this$0.retrieveOpportunityId(this.$context);
        Throwable th = this.$exception;
        String str = th instanceof NullPointerException ? "native_exception_npe" : th instanceof OutOfMemoryError ? "native_exception_oom" : th instanceof IllegalStateException ? "native_exception_ise" : th instanceof SecurityException ? "native_exception_se" : th instanceof RuntimeException ? "native_exception_re" : "native_exception";
        String retrieveUnityCrashValue = ExceptionExtensionsKt.retrieveUnityCrashValue(th);
        DeviceLog.error("Unity Ads SDK encountered an exception: " + retrieveUnityCrashValue);
        this.this$0.sendDiagnostic(str, retrieveUnityCrashValue, retrieveCoroutineName, ExceptionExtensionsKt.getShortenedStackTrace(this.$exception, 15), retrieveOpportunityId);
        return s3q0.a;
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((SDKErrorHandler$handleException$1) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }
}
