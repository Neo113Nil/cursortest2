package com.socure.docv.capturesdk.feature.scanner.presentation.ui;

import android.content.Context;
import com.socure.docv.capturesdk.common.analytics.AnalyticsConstantsKt;
import com.socure.docv.capturesdk.common.logger.LoggerKt;
import com.socure.docv.capturesdk.common.utils.ConstantsKt;
import com.socure.docv.capturesdk.common.utils.Utils;
import com.socure.docv.capturesdk.common.utils.UtilsKt;
import com.socure.docv.capturesdk.core.pipeline.model.CaptureType;
import com.socure.docv.capturesdk.core.pipeline.model.ScanType;
import com.socure.docv.capturesdk.databinding.FragmentScannerSocureBinding;
import com.socure.docv.capturesdk.feature.scanner.data.TimeOutKeeper;
import com.socure.docv.capturesdk.feature.scanner.presentation.viewmodel.ScannerViewModel;
import kotlin.Metadata;
import kotlin.Pair;
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
@DebugMetadata(c = "com.socure.docv.capturesdk.feature.scanner.presentation.ui.ScannerFragment$setupManualButtonVisibility$1", f = "ScannerFragment.kt", i = {0, 0, 0, 1, 1, 1}, l = {968, 985}, m = "invokeSuspend", n = {"$this$launch", "remainingTimeOut", "timeBeforeHalf", "$this$launch", "remainingTimeOut", "delay"}, s = {"L$0", "J$0", "J$1", "L$0", "J$0", "J$1"})
/* loaded from: classes8.dex */
final class ScannerFragment$setupManualButtonVisibility$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ long $setupDelay;
    long J$0;
    long J$1;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ ScannerFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ScannerFragment$setupManualButtonVisibility$1(ScannerFragment scannerFragment, long j, Continuation<? super ScannerFragment$setupManualButtonVisibility$1> continuation) {
        super(2, continuation);
        this.this$0 = scannerFragment;
        this.$setupDelay = j;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        ScannerFragment$setupManualButtonVisibility$1 scannerFragment$setupManualButtonVisibility$1 = new ScannerFragment$setupManualButtonVisibility$1(this.this$0, this.$setupDelay, continuation);
        scannerFragment$setupManualButtonVisibility$1.L$0 = obj;
        return scannerFragment$setupManualButtonVisibility$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ScannerFragment$setupManualButtonVisibility$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:57:0x008f, code lost:
    
        if (kotlinx.coroutines.DelayKt.delay(r9, r16) == r1) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x011e  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        CoroutineScope coroutineScope;
        FragmentScannerSocureBinding binding;
        TimeOutKeeper timeOutKeeper;
        long start;
        TimeOutKeeper timeOutKeeper2;
        long timeBeforeHalf;
        long j;
        CoroutineScope coroutineScope2;
        long j2;
        ScannerViewModel scannerViewModel;
        long j3;
        ScannerViewModel scannerViewModel2;
        TimeOutKeeper timeOutKeeper3;
        ScannerViewModel scannerViewModel3;
        FragmentScannerSocureBinding binding2;
        FragmentScannerSocureBinding binding3;
        ScannerViewModel scannerViewModel4;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        ScannerViewModel scannerViewModel5 = null;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            coroutineScope = (CoroutineScope) this.L$0;
            binding = this.this$0.getBinding();
            binding.cblView.showHelpButton();
            timeOutKeeper = this.this$0.getTimeOutKeeper();
            start = timeOutKeeper.start();
            if (this.this$0.getScanType() == ScanType.LICENSE_BACK) {
                timeOutKeeper2 = this.this$0.getTimeOutKeeper();
                timeBeforeHalf = timeOutKeeper2.timeBeforeHalf();
                LoggerKt.logD("SDLT_SF", "updateBarcodeStateInPipeline remaining time: " + timeBeforeHalf);
                if (timeBeforeHalf > 0) {
                    this.L$0 = coroutineScope;
                    this.J$0 = start;
                    this.J$1 = timeBeforeHalf;
                    this.label = 1;
                }
                if (!CoroutineScopeKt.isActive(coroutineScope)) {
                    scannerViewModel2 = this.this$0.viewModel;
                    if (scannerViewModel2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                        scannerViewModel2 = null;
                    }
                    scannerViewModel2.updateBarcodeStateInPipeline(true);
                } else {
                    LoggerKt.logE$default("SDLT_SF", "updateBarcodeStateInPipeline not called when not active", null, 4, null);
                }
            }
            j = start;
            coroutineScope2 = coroutineScope;
            j2 = this.$setupDelay;
            if (j > j2) {
                j2 = j;
            }
            boolean open_cv_supported = ConstantsKt.getOPEN_CV_SUPPORTED();
            ScanType scanType = this.this$0.getScanType();
            scannerViewModel = this.this$0.viewModel;
            if (scannerViewModel == null) {
                Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                scannerViewModel = null;
            }
            LoggerKt.logD("SDLT_SF", "setupManualButtonVisibility with openCvSupported: " + open_cv_supported + " | scanType: " + scanType + " | manualCaptureOnly: " + scannerViewModel.getManualCaptureOnly() + " | remainingTimeOut: " + j + " | delay: " + j2);
            this.L$0 = coroutineScope2;
            this.J$0 = j;
            this.J$1 = j2;
            this.label = 2;
            if (DelayKt.delay(j2, this) != coroutine_suspended) {
                j3 = j2;
                if (!CoroutineScopeKt.isActive(coroutineScope2)) {
                }
                return Unit.INSTANCE;
            }
            return coroutine_suspended;
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j3 = this.J$1;
            j = this.J$0;
            coroutineScope2 = (CoroutineScope) this.L$0;
            ResultKt.throwOnFailure(obj);
            if (!CoroutineScopeKt.isActive(coroutineScope2)) {
                LoggerKt.logD("SDLT_SF", "setupManualButtonVisibility is active - delay: " + j3 + " | remainingTimeOut : " + j);
                timeOutKeeper3 = this.this$0.getTimeOutKeeper();
                timeOutKeeper3.finish();
                scannerViewModel3 = this.this$0.viewModel;
                if (scannerViewModel3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                    scannerViewModel3 = null;
                }
                if (scannerViewModel3.getCaptureMode() == null) {
                    this.this$0.sendEvent(AnalyticsConstantsKt.MANUAL_MODE_SWITCHED_ON, new Pair("type", ScannerFragment.getManualType$default(this.this$0, null, 1, null)), new Pair(AnalyticsConstantsKt.KEY_FACET_TYPE, Utils.INSTANCE.getDocSelFacet$capturesdk_productionRelease()));
                    scannerViewModel4 = this.this$0.viewModel;
                    if (scannerViewModel4 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                    } else {
                        scannerViewModel5 = scannerViewModel4;
                    }
                    scannerViewModel5.setCaptureMode(CaptureType.MANUAL);
                } else {
                    LoggerKt.logD("SDLT_SF", "Manual mode already enabled");
                }
                this.this$0.showManualCaptureViews();
                ScannerFragment scannerFragment = this.this$0;
                scannerFragment.showManualAlertMsg(scannerFragment.getScanType());
                if (!Utils.INSTANCE.isSelfie$capturesdk_productionRelease(this.this$0.getScanType())) {
                    Context requireContext = this.this$0.requireContext();
                    Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext()");
                    if (UtilsKt.isTalkBackEnabled(requireContext)) {
                        binding3 = this.this$0.getBinding();
                        binding3.cilView.setImportantForAccessibility(1);
                        ScannerFragment scannerFragment2 = this.this$0;
                        scannerFragment2.announceAccessibilityMessage(scannerFragment2.getTryPhotoManually(), true);
                    }
                }
                if (this.this$0.getScanType() == ScanType.PASSPORT) {
                    binding2 = this.this$0.getBinding();
                    binding2.docOverView.showGuidingBox();
                }
            } else {
                LoggerKt.logE$default("SDLT_SF", "manualButtonVisibilityJob called when not active", null, 4, null);
            }
            return Unit.INSTANCE;
        }
        timeBeforeHalf = this.J$1;
        start = this.J$0;
        coroutineScope = (CoroutineScope) this.L$0;
        ResultKt.throwOnFailure(obj);
        start -= timeBeforeHalf;
        if (!CoroutineScopeKt.isActive(coroutineScope)) {
        }
        j = start;
        coroutineScope2 = coroutineScope;
        j2 = this.$setupDelay;
        if (j > j2) {
        }
        boolean open_cv_supported2 = ConstantsKt.getOPEN_CV_SUPPORTED();
        ScanType scanType2 = this.this$0.getScanType();
        scannerViewModel = this.this$0.viewModel;
        if (scannerViewModel == null) {
        }
        LoggerKt.logD("SDLT_SF", "setupManualButtonVisibility with openCvSupported: " + open_cv_supported2 + " | scanType: " + scanType2 + " | manualCaptureOnly: " + scannerViewModel.getManualCaptureOnly() + " | remainingTimeOut: " + j + " | delay: " + j2);
        this.L$0 = coroutineScope2;
        this.J$0 = j;
        this.J$1 = j2;
        this.label = 2;
        if (DelayKt.delay(j2, this) != coroutine_suspended) {
        }
        return coroutine_suspended;
    }
}
