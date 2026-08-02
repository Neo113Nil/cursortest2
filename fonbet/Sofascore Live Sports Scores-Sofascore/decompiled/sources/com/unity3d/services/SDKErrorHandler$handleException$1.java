package com.unity3d.services;

import com.google.protobuf.ByteString;
import com.unity3d.ads.core.extensions.ExceptionExtensionsKt;
import com.unity3d.services.core.log.DeviceLog;
import defpackage.a70;
import defpackage.hoi;
import defpackage.il4;
import defpackage.ku3;
import defpackage.lu3;
import defpackage.rq3;
import defpackage.y6a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lku3;", "", "<anonymous>", "(Lku3;)V"}, k = 3, mv = {2, 1, 0})
@il4(c = "com.unity3d.services.SDKErrorHandler$handleException$1", f = "SDKErrorHandler.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes6.dex */
public final class SDKErrorHandler$handleException$1 extends hoi implements Function2<ku3, rq3<? super Unit>, Object> {
    final /* synthetic */ CoroutineContext $context;
    final /* synthetic */ Throwable $exception;
    int label;
    final /* synthetic */ SDKErrorHandler this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SDKErrorHandler$handleException$1(SDKErrorHandler sDKErrorHandler, CoroutineContext coroutineContext, Throwable th, rq3<? super SDKErrorHandler$handleException$1> rq3Var) {
        super(2, rq3Var);
        this.this$0 = sDKErrorHandler;
        this.$context = coroutineContext;
        this.$exception = th;
    }

    @Override // defpackage.h21
    public final rq3<Unit> create(Object obj, rq3<?> rq3Var) {
        return new SDKErrorHandler$handleException$1(this.this$0, this.$context, this.$exception, rq3Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ku3 ku3Var, rq3<? super Unit> rq3Var) {
        return ((SDKErrorHandler$handleException$1) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        String retrieveCoroutineName;
        ByteString retrieveOpportunityId;
        lu3 lu3Var = lu3.a;
        if (this.label != 0) {
            a70.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        y6a.M(obj);
        retrieveCoroutineName = this.this$0.retrieveCoroutineName(this.$context);
        retrieveOpportunityId = this.this$0.retrieveOpportunityId(this.$context);
        Throwable th = this.$exception;
        String str = th instanceof NullPointerException ? "native_exception_npe" : th instanceof OutOfMemoryError ? "native_exception_oom" : th instanceof IllegalStateException ? "native_exception_ise" : th instanceof SecurityException ? "native_exception_se" : th instanceof RuntimeException ? "native_exception_re" : "native_exception";
        String retrieveUnityCrashValue = ExceptionExtensionsKt.retrieveUnityCrashValue(th);
        DeviceLog.error("Unity Ads SDK encountered an exception: " + retrieveUnityCrashValue);
        this.this$0.sendDiagnostic(str, retrieveUnityCrashValue, retrieveCoroutineName, ExceptionExtensionsKt.getShortenedStackTrace(this.$exception, 15), retrieveOpportunityId);
        return Unit.a;
    }
}
