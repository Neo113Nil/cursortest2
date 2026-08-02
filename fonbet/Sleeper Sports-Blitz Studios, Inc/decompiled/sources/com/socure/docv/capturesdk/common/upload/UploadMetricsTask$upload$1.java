package com.socure.docv.capturesdk.common.upload;

import com.socure.docv.capturesdk.feature.orchestrator.presentation.viewmodel.UnstructuredDocViewModelExtKt;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: UploadMetricsTask.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "com.socure.docv.capturesdk.common.upload.UploadMetricsTask", f = "UploadMetricsTask.kt", i = {0}, l = {22}, m = UnstructuredDocViewModelExtKt.UPLOAD, n = {"uploadMetricCallback"}, s = {"L$0"})
/* loaded from: classes8.dex */
final class UploadMetricsTask$upload$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ UploadMetricsTask this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    UploadMetricsTask$upload$1(UploadMetricsTask uploadMetricsTask, Continuation<? super UploadMetricsTask$upload$1> continuation) {
        super(continuation);
        this.this$0 = uploadMetricsTask;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.upload(null, null, this);
    }
}
