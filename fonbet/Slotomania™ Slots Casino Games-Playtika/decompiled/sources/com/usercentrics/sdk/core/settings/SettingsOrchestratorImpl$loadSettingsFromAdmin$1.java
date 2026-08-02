package com.usercentrics.sdk.core.settings;

import com.vungle.ads.internal.protos.Sdk;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: SettingsOrchestratorImpl.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.usercentrics.sdk.core.settings.SettingsOrchestratorImpl", f = "SettingsOrchestratorImpl.kt", i = {0, 0}, l = {129, Sdk.SDKError.Reason.PRIVACY_URL_ERROR_VALUE}, m = "loadSettingsFromAdmin-0E7RQCE", n = {"this", "controllerId"}, s = {"L$0", "L$1"})
/* loaded from: classes3.dex */
final class SettingsOrchestratorImpl$loadSettingsFromAdmin$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ SettingsOrchestratorImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SettingsOrchestratorImpl$loadSettingsFromAdmin$1(SettingsOrchestratorImpl settingsOrchestratorImpl, Continuation<? super SettingsOrchestratorImpl$loadSettingsFromAdmin$1> continuation) {
        super(continuation);
        this.this$0 = settingsOrchestratorImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object m10602loadSettingsFromAdmin0E7RQCE;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        m10602loadSettingsFromAdmin0E7RQCE = this.this$0.m10602loadSettingsFromAdmin0E7RQCE(null, null, this);
        return m10602loadSettingsFromAdmin0E7RQCE == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? m10602loadSettingsFromAdmin0E7RQCE : Result.m11179boximpl(m10602loadSettingsFromAdmin0E7RQCE);
    }
}
