package io.intercom.android.sdk.m5.upload.data;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: UploadRepository.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "io.intercom.android.sdk.m5.upload.data.UploadRepository", f = "UploadRepository.kt", i = {0, 0, 1}, l = {42, 48}, m = "uploadFile", n = {"this", "imageData", "uploadUrlResponse"}, s = {"L$0", "L$1", "L$0"})
/* loaded from: classes9.dex */
final class UploadRepository$uploadFile$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ UploadRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    UploadRepository$uploadFile$1(UploadRepository uploadRepository, Continuation<? super UploadRepository$uploadFile$1> continuation) {
        super(continuation);
        this.this$0 = uploadRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.uploadFile(null, this);
    }
}
