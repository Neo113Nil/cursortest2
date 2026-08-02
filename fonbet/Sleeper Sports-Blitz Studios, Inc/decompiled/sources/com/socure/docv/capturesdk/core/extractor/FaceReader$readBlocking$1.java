package com.socure.docv.capturesdk.core.extractor;

import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.mlkit.vision.face.Face;
import com.socure.docv.capturesdk.common.logger.LoggerKt;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: FaceReader.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "Lcom/google/mlkit/vision/face/Face;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "com.socure.docv.capturesdk.core.extractor.FaceReader$readBlocking$1", f = "FaceReader.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes8.dex */
final class FaceReader$readBlocking$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Face>, Object> {
    final /* synthetic */ Task<List<Face>> $result;
    final /* synthetic */ long $timeOutInMillis;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FaceReader$readBlocking$1(Task<List<Face>> task, long j, Continuation<? super FaceReader$readBlocking$1> continuation) {
        super(2, continuation);
        this.$result = task;
        this.$timeOutInMillis = j;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        FaceReader$readBlocking$1 faceReader$readBlocking$1 = new FaceReader$readBlocking$1(this.$result, this.$timeOutInMillis, continuation);
        faceReader$readBlocking$1.L$0 = obj;
        return faceReader$readBlocking$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Face> continuation) {
        return ((FaceReader$readBlocking$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        List faces = (List) Tasks.await(this.$result, this.$timeOutInMillis, TimeUnit.MILLISECONDS);
        LoggerKt.logD("SDLT_FD", "readBlocking resumed at: " + System.currentTimeMillis());
        if (faces.isEmpty()) {
            return null;
        }
        Intrinsics.checkNotNullExpressionValue(faces, "faces");
        Face finalFace = ExtractorUtilsKt.getFinalFace(faces);
        return finalFace == null ? (Face) faces.get(0) : finalFace;
    }
}
