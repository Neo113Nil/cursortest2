package com.unity3d.ads.adplayer;

import com.unity3d.ads.core.extensions.JSONArrayExtensionsKt;
import com.vungle.ads.internal.protos.Sdk;
import kotlin.a;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import org.json.JSONArray;
import xsna.b6l;
import xsna.s3q0;
import xsna.sh50;
import xsna.spj;
import xsna.wzs;
import xsna.yvj;

/* compiled from: CommonWebViewBridge.kt */
@b6l(c = "com.unity3d.ads.adplayer.CommonWebViewBridge$handleInvocation$7", f = "CommonWebViewBridge.kt", l = {Sdk.SDKError.Reason.OMSDK_JS_WRITE_FAILED_VALUE, 134}, m = "invokeSuspend")
/* loaded from: classes14.dex */
public final class CommonWebViewBridge$handleInvocation$7 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ String $callback;
    final /* synthetic */ String $location;
    final /* synthetic */ JSONArray $parameters;
    Object L$0;
    int label;
    final /* synthetic */ CommonWebViewBridge this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CommonWebViewBridge$handleInvocation$7(String str, JSONArray jSONArray, CommonWebViewBridge commonWebViewBridge, String str2, spj<? super CommonWebViewBridge$handleInvocation$7> spjVar) {
        super(2, spjVar);
        this.$location = str;
        this.$parameters = jSONArray;
        this.this$0 = commonWebViewBridge;
        this.$callback = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new CommonWebViewBridge$handleInvocation$7(this.$location, this.$parameters, this.this$0, this.$callback, spjVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x004e, code lost:
    
        if (r6 == r0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0050, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003e, code lost:
    
        if (r6.emit(r1, r5) == r0) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Invocation invocation;
        sh50 sh50Var;
        Object handleInvocationResult;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            a.a(obj);
            invocation = new Invocation(this.$location, JSONArrayExtensionsKt.toTypedArray(this.$parameters));
            sh50Var = this.this$0._onInvocation;
            this.L$0 = invocation;
            this.label = 1;
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                a.a(obj);
                return s3q0.a;
            }
            invocation = (Invocation) this.L$0;
            a.a(obj);
        }
        CommonWebViewBridge commonWebViewBridge = this.this$0;
        String str = this.$callback;
        this.L$0 = null;
        this.label = 2;
        handleInvocationResult = commonWebViewBridge.handleInvocationResult(invocation, str, this);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((CommonWebViewBridge$handleInvocation$7) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }
}
