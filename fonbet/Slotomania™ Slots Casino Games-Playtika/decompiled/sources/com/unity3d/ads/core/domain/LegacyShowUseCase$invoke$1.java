package com.unity3d.ads.core.domain;

import com.ironsource.X3;
import com.vungle.ads.internal.protos.Sdk;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: LegacyShowUseCase.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "com.unity3d.ads.core.domain.LegacyShowUseCase", f = "LegacyShowUseCase.kt", i = {5, 5, 9}, l = {120, Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE, Sdk.SDKError.Reason.MRAID_JS_WRITE_FAILED_VALUE, Sdk.SDKError.Reason.PRIVACY_URL_ERROR_VALUE, 144, 149, 155, 162, 167, 199}, m = "invoke", n = {"this", "opportunityIdByteString", X3.w}, s = {"L$0", "L$1", "I$0"})
/* loaded from: classes.dex */
final class LegacyShowUseCase$invoke$1 extends ContinuationImpl {
    int I$0;
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ LegacyShowUseCase this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    LegacyShowUseCase$invoke$1(LegacyShowUseCase legacyShowUseCase, Continuation<? super LegacyShowUseCase$invoke$1> continuation) {
        super(continuation);
        this.this$0 = legacyShowUseCase;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.invoke(null, null, null, this);
    }
}
