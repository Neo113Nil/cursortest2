package com.socure.docv.capturesdk.feature.scanner.presentation.ui;

import com.google.zxing.pdf417.PDF417Common;
import com.socure.docv.capturesdk.common.logger.LoggerKt;
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
@DebugMetadata(c = "com.socure.docv.capturesdk.feature.scanner.presentation.ui.ScannerFragment$createHelpGraphicJob$1", f = "ScannerFragment.kt", i = {0}, l = {PDF417Common.NUMBER_OF_CODEWORDS}, m = "invokeSuspend", n = {"$this$launch"}, s = {"L$0"})
/* loaded from: classes8.dex */
final class ScannerFragment$createHelpGraphicJob$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ boolean $isVideoFeed;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ ScannerFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ScannerFragment$createHelpGraphicJob$1(ScannerFragment scannerFragment, boolean z, Continuation<? super ScannerFragment$createHelpGraphicJob$1> continuation) {
        super(2, continuation);
        this.this$0 = scannerFragment;
        this.$isVideoFeed = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        ScannerFragment$createHelpGraphicJob$1 scannerFragment$createHelpGraphicJob$1 = new ScannerFragment$createHelpGraphicJob$1(this.this$0, this.$isVideoFeed, continuation);
        scannerFragment$createHelpGraphicJob$1.L$0 = obj;
        return scannerFragment$createHelpGraphicJob$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ScannerFragment$createHelpGraphicJob$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
            if (DelayKt.delay(3000L, this) == coroutine_suspended) {
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
            LoggerKt.logD("SDLT_SF", "setting scannerGraphic gone");
            binding = this.this$0.getBinding();
            binding.scannerGraphic.setVisibility(8);
            this.this$0.setupFpAndManualViewTimers(this.$isVideoFeed);
        } else {
            LoggerKt.logE$default("SDLT_SF", "helpGraphicJob called when not active", null, 4, null);
        }
        return Unit.INSTANCE;
    }
}
