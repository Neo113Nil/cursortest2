package com.unity3d.ads.adplayer;

import com.unity3d.ads.core.extensions.JSONArrayExtensionsKt;
import com.vungle.ads.internal.protos.Sdk;
import defpackage.a70;
import defpackage.b1d;
import defpackage.hoi;
import defpackage.il4;
import defpackage.ku3;
import defpackage.lu3;
import defpackage.rq3;
import defpackage.y6a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.json.JSONArray;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lku3;", "", "<anonymous>", "(Lku3;)V"}, k = 3, mv = {2, 1, 0})
@il4(c = "com.unity3d.ads.adplayer.CommonWebViewBridge$handleInvocation$7", f = "CommonWebViewBridge.kt", l = {Sdk.SDKError.Reason.OMSDK_JS_WRITE_FAILED_VALUE, 134}, m = "invokeSuspend")
/* loaded from: classes6.dex */
public final class CommonWebViewBridge$handleInvocation$7 extends hoi implements Function2<ku3, rq3<? super Unit>, Object> {
    final /* synthetic */ String $callback;
    final /* synthetic */ String $location;
    final /* synthetic */ JSONArray $parameters;
    Object L$0;
    int label;
    final /* synthetic */ CommonWebViewBridge this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CommonWebViewBridge$handleInvocation$7(String str, JSONArray jSONArray, CommonWebViewBridge commonWebViewBridge, String str2, rq3<? super CommonWebViewBridge$handleInvocation$7> rq3Var) {
        super(2, rq3Var);
        this.$location = str;
        this.$parameters = jSONArray;
        this.this$0 = commonWebViewBridge;
        this.$callback = str2;
    }

    @Override // defpackage.h21
    public final rq3<Unit> create(Object obj, rq3<?> rq3Var) {
        return new CommonWebViewBridge$handleInvocation$7(this.$location, this.$parameters, this.this$0, this.$callback, rq3Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ku3 ku3Var, rq3<? super Unit> rq3Var) {
        return ((CommonWebViewBridge$handleInvocation$7) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x004c, code lost:
    
        if (r6 == r0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x004e, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003d, code lost:
    
        if (r7.emit(r1, r6) == r0) goto L15;
     */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Invocation invocation;
        b1d b1dVar;
        Object handleInvocationResult;
        lu3 lu3Var = lu3.a;
        int i = this.label;
        if (i == 0) {
            y6a.M(obj);
            invocation = new Invocation(this.$location, JSONArrayExtensionsKt.toTypedArray(this.$parameters));
            b1dVar = this.this$0._onInvocation;
            this.L$0 = invocation;
            this.label = 1;
        } else {
            if (i != 1) {
                if (i == 2) {
                    y6a.M(obj);
                    return Unit.a;
                }
                a70.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            invocation = (Invocation) this.L$0;
            y6a.M(obj);
        }
        CommonWebViewBridge commonWebViewBridge = this.this$0;
        String str = this.$callback;
        this.L$0 = null;
        this.label = 2;
        handleInvocationResult = commonWebViewBridge.handleInvocationResult(invocation, str, this);
    }
}
