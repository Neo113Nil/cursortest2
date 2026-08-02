package com.socure.docv.capturesdk.feature.scanner.presentation.ui;

import com.socure.docv.capturesdk.R;
import com.socure.docv.capturesdk.databinding.FragmentScannerSocureBinding;
import com.socure.docv.capturesdk.feature.scanner.presentation.viewmodel.ScannerViewModel;
import com.socure.docv.capturesdk.models.ButtonStyleModel;
import com.socure.docv.capturesdk.models.StartSessionModel;
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
import kotlinx.coroutines.DelayKt;

/* compiled from: ScannerFragment.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "com.socure.docv.capturesdk.feature.scanner.presentation.ui.ScannerFragment$handleImageUploadStatus$1", f = "ScannerFragment.kt", i = {}, l = {842}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes8.dex */
final class ScannerFragment$handleImageUploadStatus$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ ScannerFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ScannerFragment$handleImageUploadStatus$1(ScannerFragment scannerFragment, Continuation<? super ScannerFragment$handleImageUploadStatus$1> continuation) {
        super(2, continuation);
        this.this$0 = scannerFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ScannerFragment$handleImageUploadStatus$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ScannerFragment$handleImageUploadStatus$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        StartSessionModel startSessionModel;
        FragmentScannerSocureBinding binding;
        ScannerViewModel scannerViewModel;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            startSessionModel = this.this$0.getStartSessionModel();
            ButtonStyleModel primary = startSessionModel.getGlobalConfig().getCustomization().getTheme().getPrimary().getButton().getPrimary();
            binding = this.this$0.getBinding();
            binding.bsContainer.previewView.setIvsStatusImage(primary.getBackgroundColor(), primary.getColor(), R.drawable.ic_socure_ivs_success);
            this.label = 1;
            if (DelayKt.delay(1000L, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        scannerViewModel = this.this$0.viewModel;
        if (scannerViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            scannerViewModel = null;
        }
        scannerViewModel.onCompletionShown();
        return Unit.INSTANCE;
    }
}
