package com.unity3d.ads.core.domain;

import com.vungle.ads.internal.protos.Sdk;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: AndroidGetInitializationRequestPayload.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "com.unity3d.ads.core.domain.AndroidGetInitializationRequestPayload", f = "AndroidGetInitializationRequestPayload.kt", i = {0, 0, 1, 1, 2, 2, 2, 3, 3, 3, 4, 4, 5, 5, 6, 6, 7, 7, 8, 8, 9}, l = {30, 31, 39, 40, 51, Sdk.SDKMetric.SDKMetricType.AD_VISIBILITY_VALUE, 61, 66, 81, 105}, m = "invoke", n = {"this", "$this$invoke_u24lambda_u2412", "this", "$this$invoke_u24lambda_u2412", "this", "$this$invoke_u24lambda_u2412", "$this$invoke_u24lambda_u2412_u24lambda_u242", "this", "$this$invoke_u24lambda_u2412", "$this$invoke_u24lambda_u2412_u24lambda_u242", "this", "$this$invoke_u24lambda_u2412", "this", "$this$invoke_u24lambda_u2412", "this", "$this$invoke_u24lambda_u2412", "this", "$this$invoke_u24lambda_u2412", "this", "$this$invoke_u24lambda_u2412", "$this$invoke_u24lambda_u2412"}, s = {"L$0", "L$2", "L$0", "L$2", "L$0", "L$2", "L$5", "L$0", "L$2", "L$5", "L$0", "L$2", "L$0", "L$2", "L$0", "L$2", "L$0", "L$2", "L$0", "L$2", "L$1"})
/* loaded from: classes2.dex */
final class AndroidGetInitializationRequestPayload$invoke$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AndroidGetInitializationRequestPayload this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AndroidGetInitializationRequestPayload$invoke$1(AndroidGetInitializationRequestPayload androidGetInitializationRequestPayload, Continuation<? super AndroidGetInitializationRequestPayload$invoke$1> continuation) {
        super(continuation);
        this.this$0 = androidGetInitializationRequestPayload;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.invoke(this);
    }
}
