package com.socure.docv.capturesdk.feature.orchestrator.presentation.ui;

import android.os.Build;
import android.os.Bundle;
import androidx.core.view.KeyEventDispatcher;
import com.socure.docv.capturesdk.R;
import com.socure.docv.capturesdk.di.ComponentProvider;
import com.socure.docv.capturesdk.di.orchestrator.OrchestratorActivityComponent;
import com.socure.docv.capturesdk.di.scanner.ScannerFragmentComponent;
import com.socure.docv.capturesdk.feature.scanner.data.DetectionCallback;
import com.socure.docv.capturesdk.feature.scanner.presentation.ui.ScannerFragment;
import com.socure.docv.capturesdk.models.PassportModuleModel;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PassportScannerFragment.kt */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0014\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\b\u0010\u0010\u001a\u00020\u000fH\u0016J\b\u0010\u0011\u001a\u00020\u000fH\u0016J\b\u0010\u0012\u001a\u00020\u000fH\u0016J\b\u0010\u0013\u001a\u00020\u000fH\u0016J\b\u0010\u0014\u001a\u00020\u000fH\u0016J\b\u0010\u0015\u001a\u00020\u000fH\u0016J\b\u0010\u0016\u001a\u00020\u000fH\u0016J\b\u0010\u0017\u001a\u00020\u000fH\u0016J\b\u0010\u0018\u001a\u00020\u000fH\u0016J\b\u0010\u0019\u001a\u00020\u000fH\u0016J\b\u0010\u001a\u001a\u00020\u000fH\u0016J\b\u0010\u001b\u001a\u00020\u000fH\u0016J\b\u0010\u001c\u001a\u00020\u000fH\u0016J\u0010\u0010\u001d\u001a\u00020\u000f2\u0006\u0010\u001e\u001a\u00020\u001fH\u0016J\b\u0010 \u001a\u00020!H\u0016J\u000e\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u000f0#H\u0016J\b\u0010$\u001a\u00020\u000fH\u0016J\b\u0010%\u001a\u00020\u000fH\u0016J\u0010\u0010&\u001a\u00020\u000f2\u0006\u0010'\u001a\u00020(H\u0016J\b\u0010)\u001a\u00020\u000fH\u0016J\b\u0010*\u001a\u00020\u000fH\u0016J\u0014\u0010+\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f0,H\u0016J\b\u0010-\u001a\u00020\u000fH\u0016J\b\u0010.\u001a\u00020\u000fH\u0016J\b\u0010/\u001a\u00020\u000fH\u0016J\b\u00100\u001a\u00020\u000fH\u0016J\b\u00101\u001a\u00020\u000fH\u0016J\b\u00102\u001a\u00020\u000fH\u0016J\b\u00103\u001a\u00020\u000fH\u0016J\b\u00104\u001a\u00020\u000fH\u0016J\b\u00105\u001a\u00020\u000fH\u0016J\b\u00106\u001a\u00020\u000fH\u0016J\b\u00107\u001a\u00020\u000fH\u0016J\b\u00108\u001a\u00020\u000fH\u0016J\b\u00109\u001a\u00020\u000fH\u0016J\b\u0010:\u001a\u00020\u000fH\u0016J\u0010\u0010;\u001a\u00020\u000f2\u0006\u0010\u001e\u001a\u00020\u001fH\u0016J\b\u0010<\u001a\u00020\u000fH\u0016J\b\u0010=\u001a\u00020\u000fH\u0016J\b\u0010>\u001a\u00020\u000fH\u0016J\b\u0010?\u001a\u00020\u000fH\u0016R!\u0010\u0003\u001a\u00020\u00048VX\u0096\u0084\u0002¢\u0006\u0012\n\u0004\b\b\u0010\t\u0012\u0004\b\u0005\u0010\u0002\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\n\u001a\u00020\u000b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006@"}, d2 = {"Lcom/socure/docv/capturesdk/feature/orchestrator/presentation/ui/PassportScannerFragment;", "Lcom/socure/docv/capturesdk/feature/scanner/presentation/ui/ScannerFragment;", "()V", "component", "Lcom/socure/docv/capturesdk/di/scanner/ScannerFragmentComponent;", "getComponent$annotations", "getComponent", "()Lcom/socure/docv/capturesdk/di/scanner/ScannerFragmentComponent;", "component$delegate", "Lkotlin/Lazy;", "model", "Lcom/socure/docv/capturesdk/models/PassportModuleModel;", "getModel", "()Lcom/socure/docv/capturesdk/models/PassportModuleModel;", "getAdjustLightingMessage", "", "getBackToScanning", "getBarcodeNotFoundMessage", "getBlurMessage", "getCaptureSuccess", "getCaptureTitleText", "getCardNotFound", "getCardTooClose", "getCompletionTitle", "getConfirmationTitleText", "getContBtnText", "getContinuePreviewMessage", "getCornerDetectionFailedMessage", "getDocumentTooClose", "getGuidingMessage", "detectionCallback", "Lcom/socure/docv/capturesdk/feature/scanner/data/DetectionCallback;", "getHelpBannerImage", "", "getHelpInstruction", "", "getHelpTitleText", "getIdLookingGood", "getInitialAnnouncement", "noAnalysisMode", "", "getKeepSteadyMessage", "getLowBrightnessMessage", "getManualWarningMessage", "Lkotlin/Pair;", "getModuleId", "getMovePhoneBack", "getMovePhoneDown", "getMovePhoneLeft", "getMovePhoneRight", "getMovePhoneUp", "getPreviewConfirmationText", "getPreviewProgressTitle", "getPreviewWarningMessage", "getProgressAnimationText", "getProgressCompleteMessage", "getRetakeBtnText", "getRetryInvalidImage", "getScannerHelpText", "getSelfieAccessibilityAnnouncementMessage", "getSubmitImageForValidation", "getToGetStarted", "getTryPhotoManually", "getUploadAccessibilityMessage", "capturesdk_productionRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class PassportScannerFragment extends ScannerFragment {

    /* renamed from: component$delegate, reason: from kotlin metadata */
    private final Lazy component = LazyKt.lazy(new Function0<ScannerFragmentComponent>() { // from class: com.socure.docv.capturesdk.feature.orchestrator.presentation.ui.PassportScannerFragment$component$2
        {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final ScannerFragmentComponent invoke() {
            KeyEventDispatcher.Component requireActivity = PassportScannerFragment.this.requireActivity();
            Intrinsics.checkNotNull(requireActivity, "null cannot be cast to non-null type com.socure.docv.capturesdk.di.ComponentProvider<com.socure.docv.capturesdk.di.orchestrator.OrchestratorActivityComponent>");
            return ((OrchestratorActivityComponent) ((ComponentProvider) requireActivity).getComponent()).passportScannerFragmentSubComponent(PassportScannerFragment.this);
        }
    });

    public static /* synthetic */ void getComponent$annotations() {
    }

    @Override // com.socure.docv.capturesdk.feature.scanner.presentation.ui.ScannerFragment
    public ScannerFragmentComponent getComponent() {
        return (ScannerFragmentComponent) this.component.getValue();
    }

    private final PassportModuleModel getModel() {
        Object obj;
        Bundle requireArguments = requireArguments();
        Intrinsics.checkNotNullExpressionValue(requireArguments, "requireArguments()");
        if (Build.VERSION.SDK_INT >= 33) {
            obj = requireArguments.getParcelable("model", PassportModuleModel.class);
        } else {
            Object parcelable = requireArguments.getParcelable("model");
            if (!(parcelable instanceof PassportModuleModel)) {
                parcelable = null;
            }
            obj = (PassportModuleModel) parcelable;
        }
        if (obj != null) {
            return (PassportModuleModel) obj;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }

    @Override // com.socure.docv.capturesdk.feature.scanner.presentation.ui.ScannerFragment
    public String getCaptureTitleText() {
        return getModel().getNativeMessages().getTitle();
    }

    @Override // com.socure.docv.capturesdk.feature.scanner.presentation.ui.ScannerFragment
    public String getUploadAccessibilityMessage() {
        return getModel().getPleaseWait();
    }

    @Override // com.socure.docv.capturesdk.feature.scanner.presentation.ui.ScannerFragment
    public String getContinuePreviewMessage() {
        return getModel().getPreviewMessages().getValidatingImage();
    }

    @Override // com.socure.docv.capturesdk.feature.scanner.presentation.ui.ScannerFragment
    public String getRetakeBtnText() {
        return getModel().getSubmitButtonMessages().getRetake();
    }

    @Override // com.socure.docv.capturesdk.feature.scanner.presentation.ui.ScannerFragment
    public String getContBtnText() {
        return getModel().getSubmitButtonMessages().getSubmit();
    }

    @Override // com.socure.docv.capturesdk.feature.scanner.presentation.ui.ScannerFragment
    public String getSubmitImageForValidation() {
        return getModel().getPreviewMessages().getSubmitImageForValidation();
    }

    @Override // com.socure.docv.capturesdk.feature.scanner.presentation.ui.ScannerFragment
    public String getPreviewConfirmationText() {
        return getModel().getConfirmationText();
    }

    @Override // com.socure.docv.capturesdk.feature.scanner.presentation.ui.ScannerFragment
    public String getConfirmationTitleText() {
        return getModel().getConfirmationTitle();
    }

    @Override // com.socure.docv.capturesdk.feature.scanner.presentation.ui.ScannerFragment
    public String getCaptureSuccess() {
        return getModel().getCaptureSuccess();
    }

    @Override // com.socure.docv.capturesdk.feature.scanner.presentation.ui.ScannerFragment
    public Pair<String, String> getManualWarningMessage() {
        return TuplesKt.to(getModel().getManualPrimary(), getModel().getManualSecondary());
    }

    @Override // com.socure.docv.capturesdk.feature.scanner.presentation.ui.ScannerFragment
    public String getToGetStarted() {
        return getModel().getToGetStarted();
    }

    @Override // com.socure.docv.capturesdk.feature.scanner.presentation.ui.ScannerFragment
    public String getScannerHelpText() {
        return getModel().getPlaceFlatAndHoldPassport();
    }

    @Override // com.socure.docv.capturesdk.feature.scanner.presentation.ui.ScannerFragment
    public List<String> getHelpInstruction() {
        return CollectionsKt.listOf((Object[]) new String[]{getModel().getHelpMessages().getOpenPassport(), getModel().getHelpMessages().getHoldPhoneOverPassport(), getModel().getHelpMessages().getFocusCameraPassport()});
    }

    @Override // com.socure.docv.capturesdk.feature.scanner.presentation.ui.ScannerFragment
    public String getBackToScanning() {
        return getModel().getBackToScanning();
    }

    @Override // com.socure.docv.capturesdk.feature.scanner.presentation.ui.ScannerFragment
    public String getHelpTitleText() {
        return getModel().getHelpMessages().getTitle();
    }

    @Override // com.socure.docv.capturesdk.feature.scanner.presentation.ui.ScannerFragment
    public int getHelpBannerImage() {
        return R.drawable.socure_help_passport;
    }

    @Override // com.socure.docv.capturesdk.feature.scanner.presentation.ui.ScannerFragment
    public String getInitialAnnouncement(boolean noAnalysisMode) {
        return getModel().getHelpMessages().getFocusCameraPassport();
    }

    @Override // com.socure.docv.capturesdk.feature.scanner.presentation.ui.ScannerFragment
    public String getRetryInvalidImage() {
        return getModel().getPreviewMessages().getInvalidImage();
    }

    @Override // com.socure.docv.capturesdk.feature.scanner.presentation.ui.ScannerFragment
    public String getPreviewWarningMessage() {
        return getModel().getDefaultIvsError();
    }

    @Override // com.socure.docv.capturesdk.feature.scanner.presentation.ui.ScannerFragment
    public String getPreviewProgressTitle() {
        return getModel().getPreviewMessages().getValidatingImage();
    }

    @Override // com.socure.docv.capturesdk.feature.scanner.presentation.ui.ScannerFragment
    public String getProgressAnimationText() {
        return getModel().getSubmitButtonMessages().getProcessing();
    }

    @Override // com.socure.docv.capturesdk.feature.scanner.presentation.ui.ScannerFragment
    public String getProgressCompleteMessage() {
        return getModel().getSubmitButtonMessages().getSuccess();
    }

    @Override // com.socure.docv.capturesdk.feature.scanner.presentation.ui.ScannerFragment
    public String getTryPhotoManually() {
        return getModel().getTryPhotoManually();
    }

    @Override // com.socure.docv.capturesdk.feature.scanner.presentation.ui.ScannerFragment
    public String getCompletionTitle() {
        return getModel().getPreviewMessages().getImageValidated();
    }

    @Override // com.socure.docv.capturesdk.feature.scanner.presentation.ui.ScannerFragment
    public String getLowBrightnessMessage() {
        return getModel().getDarkImageError();
    }

    @Override // com.socure.docv.capturesdk.feature.scanner.presentation.ui.ScannerFragment
    public String getBlurMessage() {
        return getModel().getEnsurePassportFocus();
    }

    @Override // com.socure.docv.capturesdk.feature.scanner.presentation.ui.ScannerFragment
    public String getAdjustLightingMessage() {
        return getModel().getAdjustLighting();
    }

    @Override // com.socure.docv.capturesdk.feature.scanner.presentation.ui.ScannerFragment
    public String getCornerDetectionFailedMessage() {
        return getModel().getHelpMessages().getHoldPhoneOverPassport();
    }

    @Override // com.socure.docv.capturesdk.feature.scanner.presentation.ui.ScannerFragment
    public String getKeepSteadyMessage() {
        return getModel().getHelpMessages().getKeepSteady();
    }

    @Override // com.socure.docv.capturesdk.feature.scanner.presentation.ui.ScannerFragment
    public String getGuidingMessage(DetectionCallback detectionCallback) {
        Intrinsics.checkNotNullParameter(detectionCallback, "detectionCallback");
        return "";
    }

    @Override // com.socure.docv.capturesdk.feature.scanner.presentation.ui.ScannerFragment
    public String getBarcodeNotFoundMessage() {
        return "";
    }

    @Override // com.socure.docv.capturesdk.feature.scanner.presentation.ui.ScannerFragment
    public String getIdLookingGood() {
        return getModel().getIdLookingGood();
    }

    @Override // com.socure.docv.capturesdk.feature.scanner.presentation.ui.ScannerFragment
    public String getDocumentTooClose() {
        return getModel().getPassportTooClose();
    }

    @Override // com.socure.docv.capturesdk.feature.scanner.presentation.ui.ScannerFragment
    public String getSelfieAccessibilityAnnouncementMessage(DetectionCallback detectionCallback) {
        Intrinsics.checkNotNullParameter(detectionCallback, "detectionCallback");
        return "";
    }

    @Override // com.socure.docv.capturesdk.feature.scanner.presentation.ui.ScannerFragment
    public String getMovePhoneBack() {
        return getModel().getMovePhoneBack();
    }

    @Override // com.socure.docv.capturesdk.feature.scanner.presentation.ui.ScannerFragment
    public String getMovePhoneUp() {
        return getModel().getMovePhoneUp();
    }

    @Override // com.socure.docv.capturesdk.feature.scanner.presentation.ui.ScannerFragment
    public String getMovePhoneDown() {
        return getModel().getMovePhoneDown();
    }

    @Override // com.socure.docv.capturesdk.feature.scanner.presentation.ui.ScannerFragment
    public String getMovePhoneLeft() {
        return getModel().getMovePhoneLeft();
    }

    @Override // com.socure.docv.capturesdk.feature.scanner.presentation.ui.ScannerFragment
    public String getMovePhoneRight() {
        return getModel().getMovePhoneRight();
    }

    @Override // com.socure.docv.capturesdk.feature.scanner.presentation.ui.ScannerFragment
    public String getCardTooClose() {
        return getModel().getPassportTooClose();
    }

    @Override // com.socure.docv.capturesdk.feature.scanner.presentation.ui.ScannerFragment
    public String getCardNotFound() {
        return getModel().getNoPassportDetected();
    }

    @Override // com.socure.docv.capturesdk.feature.scanner.presentation.ui.ScannerFragment
    public String getModuleId() {
        return getModel().getModuleId();
    }
}
