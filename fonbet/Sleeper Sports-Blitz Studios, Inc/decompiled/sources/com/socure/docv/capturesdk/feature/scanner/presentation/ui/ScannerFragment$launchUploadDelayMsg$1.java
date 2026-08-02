package com.socure.docv.capturesdk.feature.scanner.presentation.ui;

import com.socure.docv.capturesdk.databinding.FragmentScannerSocureBinding;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.DelayKt;

/* compiled from: ScannerFragment.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "com.socure.docv.capturesdk.feature.scanner.presentation.ui.ScannerFragment$launchUploadDelayMsg$1", f = "ScannerFragment.kt", i = {0}, l = {1605}, m = "invokeSuspend", n = {"$this$launch"}, s = {"L$0"})
/* loaded from: classes8.dex */
final class ScannerFragment$launchUploadDelayMsg$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ ScannerFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ScannerFragment$launchUploadDelayMsg$1(ScannerFragment scannerFragment, Continuation<? super ScannerFragment$launchUploadDelayMsg$1> continuation) {
        super(2, continuation);
        this.this$0 = scannerFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        ScannerFragment$launchUploadDelayMsg$1 scannerFragment$launchUploadDelayMsg$1 = new ScannerFragment$launchUploadDelayMsg$1(this.this$0, continuation);
        scannerFragment$launchUploadDelayMsg$1.L$0 = obj;
        return scannerFragment$launchUploadDelayMsg$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ScannerFragment$launchUploadDelayMsg$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineScope coroutineScope;
        FragmentScannerSocureBinding binding;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            CoroutineScope coroutineScope2 = (CoroutineScope) this.L$0;
            this.L$0 = coroutineScope2;
            this.label = 1;
            if (DelayKt.delay(30000L, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            coroutineScope = coroutineScope2;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            coroutineScope = (CoroutineScope) this.L$0;
            ResultKt.throwOnFailure(obj);
        }
        if (CoroutineScopeKt.isActive(coroutineScope)) {
            ScannerFragment scannerFragment = this.this$0;
            scannerFragment.announceAccessibilityMessage(scannerFragment.getUploadAccessibilityMessage(), true);
            binding = this.this$0.getBinding();
            binding.bsContainer.previewView.showDelayProgressTitle(this.this$0.getUploadAccessibilityMessage());
        }
        return Unit.INSTANCE;
    }
}
