package com.socure.docv.capturesdk.feature.scanner.presentation.viewmodel;

import com.socure.docv.capturesdk.common.utils.ExtractedImageData;
import com.socure.docv.capturesdk.common.utils.VarianceManager;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: ScannerViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "com.socure.docv.capturesdk.feature.scanner.presentation.viewmodel.ScannerViewModel$calculateVariance$1", f = "ScannerViewModel.kt", i = {}, l = {200}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes8.dex */
final class ScannerViewModel$calculateVariance$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ ExtractedImageData $current;
    final /* synthetic */ ExtractedImageData $previous;
    int label;
    final /* synthetic */ ScannerViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ScannerViewModel$calculateVariance$1(ScannerViewModel scannerViewModel, ExtractedImageData extractedImageData, ExtractedImageData extractedImageData2, Continuation<? super ScannerViewModel$calculateVariance$1> continuation) {
        super(2, continuation);
        this.this$0 = scannerViewModel;
        this.$previous = extractedImageData;
        this.$current = extractedImageData2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ScannerViewModel$calculateVariance$1(this.this$0, this.$previous, this.$current, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ScannerViewModel$calculateVariance$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        VarianceManager varianceManager;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            varianceManager = this.this$0.getVarianceManager();
            this.label = 1;
            if (varianceManager.calculate(this.$previous, this.$current, this) == coroutine_suspended) {
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
