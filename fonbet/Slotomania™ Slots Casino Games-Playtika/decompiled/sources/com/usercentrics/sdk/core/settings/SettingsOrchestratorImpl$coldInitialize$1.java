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
@DebugMetadata(c = "com.usercentrics.sdk.core.settings.SettingsOrchestratorImpl", f = "SettingsOrchestratorImpl.kt", i = {0, 0}, l = {Sdk.SDKMetric.SDKMetricType.INIT_TO_SUCCESS_CALLBACK_DURATION_MS_VALUE, 71}, m = "coldInitialize-gIAlu-s", n = {"this", "controllerId"}, s = {"L$0", "L$1"})
/* loaded from: classes3.dex */
final class SettingsOrchestratorImpl$coldInitialize$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ SettingsOrchestratorImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SettingsOrchestratorImpl$coldInitialize$1(SettingsOrchestratorImpl settingsOrchestratorImpl, Continuation<? super SettingsOrchestratorImpl$coldInitialize$1> continuation) {
        super(continuation);
        this.this$0 = settingsOrchestratorImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object mo10590coldInitializegIAlus = this.this$0.mo10590coldInitializegIAlus(null, this);
        return mo10590coldInitializegIAlus == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? mo10590coldInitializegIAlus : Result.m11179boximpl(mo10590coldInitializegIAlus);
    }
}
