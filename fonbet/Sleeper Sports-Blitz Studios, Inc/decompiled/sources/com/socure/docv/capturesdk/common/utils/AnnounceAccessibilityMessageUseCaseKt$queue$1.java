package com.socure.docv.capturesdk.common.utils;

import android.view.View;
import com.socure.docv.capturesdk.common.logger.LoggerKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: AnnounceAccessibilityMessageUseCase.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "com.socure.docv.capturesdk.common.utils.AnnounceAccessibilityMessageUseCaseKt$queue$1", f = "AnnounceAccessibilityMessageUseCase.kt", i = {}, l = {71}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes8.dex */
final class AnnounceAccessibilityMessageUseCaseKt$queue$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ boolean $interrupt;
    final /* synthetic */ String $message;
    final /* synthetic */ AnnounceAccessibilityMessageUseCase $this_queue;
    final /* synthetic */ View $view;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AnnounceAccessibilityMessageUseCaseKt$queue$1(AnnounceAccessibilityMessageUseCase announceAccessibilityMessageUseCase, View view, String str, boolean z, Continuation<? super AnnounceAccessibilityMessageUseCaseKt$queue$1> continuation) {
        super(2, continuation);
        this.$this_queue = announceAccessibilityMessageUseCase;
        this.$view = view;
        this.$message = str;
        this.$interrupt = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AnnounceAccessibilityMessageUseCaseKt$queue$1(this.$this_queue, this.$view, this.$message, this.$interrupt, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((AnnounceAccessibilityMessageUseCaseKt$queue$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            LoggerKt.logDetailed("AnnounceAccessibilityMessageUseCase", "Launching coroutine to invoke use case");
            this.label = 1;
            if (this.$this_queue.invoke(this.$view, this.$message, this.$interrupt, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}
