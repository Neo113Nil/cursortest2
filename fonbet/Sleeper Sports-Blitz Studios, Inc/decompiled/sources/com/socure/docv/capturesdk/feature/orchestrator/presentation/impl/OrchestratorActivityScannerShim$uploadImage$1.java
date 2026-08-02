package com.socure.docv.capturesdk.feature.orchestrator.presentation.impl;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: OrchestratorActivityScannerShim.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "com.socure.docv.capturesdk.feature.orchestrator.presentation.impl.OrchestratorActivityScannerShim", f = "OrchestratorActivityScannerShim.kt", i = {0}, l = {30, 31}, m = "uploadImage-gIAlu-s$suspendImpl", n = {"$this"}, s = {"L$0"})
/* loaded from: classes8.dex */
final class OrchestratorActivityScannerShim$uploadImage$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ OrchestratorActivityScannerShim this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OrchestratorActivityScannerShim$uploadImage$1(OrchestratorActivityScannerShim orchestratorActivityScannerShim, Continuation<? super OrchestratorActivityScannerShim$uploadImage$1> continuation) {
        super(continuation);
        this.this$0 = orchestratorActivityScannerShim;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object m11541uploadImagegIAlus$suspendImpl = OrchestratorActivityScannerShim.m11541uploadImagegIAlus$suspendImpl(this.this$0, null, this);
        return m11541uploadImagegIAlus$suspendImpl == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? m11541uploadImagegIAlus$suspendImpl : Result.m13469boximpl(m11541uploadImagegIAlus$suspendImpl);
    }
}
