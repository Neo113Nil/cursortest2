package com.socure.docv.capturesdk.feature.scanner.presentation.ui;

import android.content.Context;
import com.socure.docv.capturesdk.common.logger.LoggerKt;
import com.socure.docv.capturesdk.common.utils.ConstantsKt;
import com.socure.docv.capturesdk.common.utils.UtilsKt;
import com.socure.docv.capturesdk.core.pipeline.model.ScanType;
import com.socure.docv.capturesdk.databinding.FragmentScannerSocureBinding;
import com.socure.docv.capturesdk.feature.scanner.presentation.viewmodel.ScannerViewModel;
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
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.DelayKt;

/* compiled from: ScannerFragment.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "com.socure.docv.capturesdk.feature.scanner.presentation.ui.ScannerFragment$setFrameProviderWithDelay$1", f = "ScannerFragment.kt", i = {0}, l = {717}, m = "invokeSuspend", n = {"$this$launch"}, s = {"L$0"})
/* loaded from: classes8.dex */
final class ScannerFragment$setFrameProviderWithDelay$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ long $delayTime;
    final /* synthetic */ boolean $videoFeed;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ ScannerFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ScannerFragment$setFrameProviderWithDelay$1(ScannerFragment scannerFragment, long j, boolean z, Continuation<? super ScannerFragment$setFrameProviderWithDelay$1> continuation) {
        super(2, continuation);
        this.this$0 = scannerFragment;
        this.$delayTime = j;
        this.$videoFeed = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        ScannerFragment$setFrameProviderWithDelay$1 scannerFragment$setFrameProviderWithDelay$1 = new ScannerFragment$setFrameProviderWithDelay$1(this.this$0, this.$delayTime, this.$videoFeed, continuation);
        scannerFragment$setFrameProviderWithDelay$1.L$0 = obj;
        return scannerFragment$setFrameProviderWithDelay$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ScannerFragment$setFrameProviderWithDelay$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ScannerViewModel scannerViewModel;
        CoroutineScope coroutineScope;
        boolean noAnalysisMode;
        FragmentScannerSocureBinding binding;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            CoroutineScope coroutineScope2 = (CoroutineScope) this.L$0;
            Context requireContext = this.this$0.requireContext();
            Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext()");
            if (UtilsKt.isTalkBackEnabled(requireContext)) {
                ScannerFragment scannerFragment = this.this$0;
                noAnalysisMode = scannerFragment.noAnalysisMode();
                ScannerFragment.announceAccessibilityMessage$default(scannerFragment, scannerFragment.getInitialAnnouncement(noAnalysisMode), false, 2, null);
            }
            scannerViewModel = this.this$0.viewModel;
            if (scannerViewModel == null) {
                Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                scannerViewModel = null;
            }
            scannerViewModel.clearLiveData();
            this.L$0 = coroutineScope2;
            this.label = 1;
            if (DelayKt.delay(this.$delayTime, this) == coroutine_suspended) {
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
            this.this$0.setFrameProvider(this.$videoFeed);
            LoggerKt.logD("SDLT_SF", "Calling startFrameGeneration and setupDetectionCallbacks");
            if (this.this$0.getScanType() == ScanType.PASSPORT) {
                binding = this.this$0.getBinding();
                binding.docOverView.showGuidingBox();
            }
            if (ConstantsKt.getOPEN_CV_SUPPORTED()) {
                this.this$0.setupDetectionCallbacks();
            }
            this.this$0.setupDebugImageCallback();
            this.this$0.setupCaptureErrorCallback();
            this.this$0.setupOutputCallback();
            this.this$0.startFrameGeneration();
        } else {
            LoggerKt.logE$default("SDLT_SF", "frameProviderDelayJob called when not active", null, 4, null);
        }
        return Unit.INSTANCE;
    }
}
