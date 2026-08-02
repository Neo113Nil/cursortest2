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
@DebugMetadata(c = "com.usercentrics.sdk.core.settings.SettingsOrchestratorImpl", f = "SettingsOrchestratorImpl.kt", i = {0, 0}, l = {Sdk.SDKError.Reason.MRAID_JS_DOES_NOT_EXIST_VALUE}, m = "finishInitialization-gIAlu-s", n = {"this", "isFirstInitialization"}, s = {"L$0", "Z$0"})
/* loaded from: classes3.dex */
final class SettingsOrchestratorImpl$finishInitialization$1 extends ContinuationImpl {
    Object L$0;
    boolean Z$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ SettingsOrchestratorImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SettingsOrchestratorImpl$finishInitialization$1(SettingsOrchestratorImpl settingsOrchestratorImpl, Continuation<? super SettingsOrchestratorImpl$finishInitialization$1> continuation) {
        super(continuation);
        this.this$0 = settingsOrchestratorImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object m10598finishInitializationgIAlus;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        m10598finishInitializationgIAlus = this.this$0.m10598finishInitializationgIAlus(null, this);
        return m10598finishInitializationgIAlus == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? m10598finishInitializationgIAlus : Result.m11179boximpl(m10598finishInitializationgIAlus);
    }
}
