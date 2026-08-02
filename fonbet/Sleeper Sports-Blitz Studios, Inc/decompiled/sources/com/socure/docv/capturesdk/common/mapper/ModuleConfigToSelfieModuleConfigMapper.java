package com.socure.docv.capturesdk.common.mapper;

import com.socure.docv.capturesdk.common.mapper.Mapper;
import com.socure.docv.capturesdk.common.network.model.stepup.modules.HelpMessages;
import com.socure.docv.capturesdk.common.network.model.stepup.modules.Labels;
import com.socure.docv.capturesdk.common.network.model.stepup.modules.ModuleConfig;
import com.socure.docv.capturesdk.common.network.model.stepup.modules.NativeMessages;
import com.socure.docv.capturesdk.common.network.model.stepup.modules.PreviewMessages;
import com.socure.docv.capturesdk.common.network.model.stepup.modules.SubmitButtonMessages;
import com.socure.docv.capturesdk.models.SelfieModuleModel;
import io.intercom.android.sdk.metrics.MetricTracker;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

/* compiled from: ModuleConfigToSelfieModuleConfigMapper.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0005¢\u0006\u0002\u0010\u0004J\u0019\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0002H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u0007\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\b"}, d2 = {"Lcom/socure/docv/capturesdk/common/mapper/ModuleConfigToSelfieModuleConfigMapper;", "Lcom/socure/docv/capturesdk/common/mapper/Mapper;", "Lcom/socure/docv/capturesdk/common/mapper/ModuleMapperInput;", "Lcom/socure/docv/capturesdk/models/SelfieModuleModel;", "()V", "map", MetricTracker.Object.INPUT, "(Lcom/socure/docv/capturesdk/common/mapper/ModuleMapperInput;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "capturesdk_productionRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class ModuleConfigToSelfieModuleConfigMapper implements Mapper<ModuleMapperInput, SelfieModuleModel> {
    @Override // com.socure.docv.capturesdk.common.mapper.Mapper
    public Object map(List<? extends ModuleMapperInput> list, Continuation<? super List<? extends SelfieModuleModel>> continuation) {
        return Mapper.DefaultImpls.map(this, list, continuation);
    }

    @Override // com.socure.docv.capturesdk.common.mapper.Mapper
    public Object map(ModuleMapperInput moduleMapperInput, Continuation<? super SelfieModuleModel> continuation) {
        SubmitButtonMessages submitButtonMessages;
        SubmitButtonMessages submitButtonMessages2;
        SubmitButtonMessages submitButtonMessages3;
        SubmitButtonMessages submitButtonMessages4;
        PreviewMessages previewMessages;
        PreviewMessages previewMessages2;
        PreviewMessages previewMessages3;
        PreviewMessages previewMessages4;
        HelpMessages helpMessages;
        HelpMessages helpMessages2;
        HelpMessages helpMessages3;
        HelpMessages helpMessages4;
        HelpMessages helpMessages5;
        NativeMessages nativeMessages;
        NativeMessages nativeMessages2;
        NativeMessages nativeMessages3;
        NativeMessages nativeMessages4;
        ModuleConfig config = moduleMapperInput.getConfig();
        String moduleId = moduleMapperInput.getModuleId();
        String sessionToken = moduleMapperInput.getSessionToken();
        Labels labels = config.getLabels();
        String documentName = labels != null ? labels.getDocumentName() : null;
        if (documentName == null) {
            documentName = "";
        }
        String confirmationTitle = labels != null ? labels.getConfirmationTitle() : null;
        if (confirmationTitle == null) {
            confirmationTitle = "";
        }
        String confirmationText = labels != null ? labels.getConfirmationText() : null;
        if (confirmationText == null) {
            confirmationText = "";
        }
        String submitButtonText = labels != null ? labels.getSubmitButtonText() : null;
        if (submitButtonText == null) {
            submitButtonText = "";
        }
        String movePhoneFront = labels != null ? labels.getMovePhoneFront() : null;
        if (movePhoneFront == null) {
            movePhoneFront = "";
        }
        String movePhoneFrontLowEndDevice = labels != null ? labels.getMovePhoneFrontLowEndDevice() : null;
        if (movePhoneFrontLowEndDevice == null) {
            movePhoneFrontLowEndDevice = "";
        }
        String greatNowCapture = labels != null ? labels.getGreatNowCapture() : null;
        if (greatNowCapture == null) {
            greatNowCapture = "";
        }
        String alignFaceBox = labels != null ? labels.getAlignFaceBox() : null;
        if (alignFaceBox == null) {
            alignFaceBox = "";
        }
        String moveCloser = labels != null ? labels.getMoveCloser() : null;
        if (moveCloser == null) {
            moveCloser = "";
        }
        String lookDirectly = labels != null ? labels.getLookDirectly() : null;
        if (lookDirectly == null) {
            lookDirectly = "";
        }
        String str = null;
        String str2 = confirmationTitle;
        String str3 = movePhoneFront;
        String str4 = alignFaceBox;
        String title = (labels == null || (nativeMessages4 = labels.getNativeMessages()) == null) ? null : nativeMessages4.getTitle();
        String str5 = title == null ? "" : title;
        String holdPhoneFront = (labels == null || (nativeMessages3 = labels.getNativeMessages()) == null) ? null : nativeMessages3.getHoldPhoneFront();
        String str6 = holdPhoneFront == null ? "" : holdPhoneFront;
        String ensureTopHead = (labels == null || (nativeMessages2 = labels.getNativeMessages()) == null) ? null : nativeMessages2.getEnsureTopHead();
        String str7 = ensureTopHead == null ? "" : ensureTopHead;
        String clickCapture = (labels == null || (nativeMessages = labels.getNativeMessages()) == null) ? null : nativeMessages.getClickCapture();
        SelfieModuleModel.NativeMessages nativeMessages5 = new SelfieModuleModel.NativeMessages(str5, str6, str7, clickCapture == null ? "" : clickCapture);
        String title2 = (labels == null || (helpMessages5 = labels.getHelpMessages()) == null) ? null : helpMessages5.getTitle();
        String str8 = title2 == null ? "" : title2;
        String alignFaceFrame = (labels == null || (helpMessages4 = labels.getHelpMessages()) == null) ? null : helpMessages4.getAlignFaceFrame();
        String str9 = alignFaceFrame == null ? "" : alignFaceFrame;
        String holdDevice = (labels == null || (helpMessages3 = labels.getHelpMessages()) == null) ? null : helpMessages3.getHoldDevice();
        String str10 = holdDevice == null ? "" : holdDevice;
        String lookDirectly2 = (labels == null || (helpMessages2 = labels.getHelpMessages()) == null) ? null : helpMessages2.getLookDirectly();
        String str11 = lookDirectly2 == null ? "" : lookDirectly2;
        String keepSteady = labels != null ? labels.getKeepSteady() : null;
        String str12 = keepSteady == null ? "" : keepSteady;
        String holdPhoneOverId = (labels == null || (helpMessages = labels.getHelpMessages()) == null) ? null : helpMessages.getHoldPhoneOverId();
        SelfieModuleModel.HelpMessages helpMessages6 = new SelfieModuleModel.HelpMessages(str8, str9, str10, str11, str12, holdPhoneOverId == null ? "" : holdPhoneOverId);
        String cameraLoading = labels != null ? labels.getCameraLoading() : null;
        if (cameraLoading == null) {
            cameraLoading = "";
        }
        String cameraIssue = labels != null ? labels.getCameraIssue() : null;
        if (cameraIssue == null) {
            cameraIssue = "";
        }
        String startMode = labels != null ? labels.getStartMode() : null;
        String str13 = startMode == null ? "" : startMode;
        String captureMode = labels != null ? labels.getCaptureMode() : null;
        if (captureMode == null) {
            captureMode = "";
        }
        String confirmMode = labels != null ? labels.getConfirmMode() : null;
        if (confirmMode == null) {
            confirmMode = "";
        }
        String backToScanning = labels != null ? labels.getBackToScanning() : null;
        if (backToScanning == null) {
            backToScanning = "";
        }
        String captureCompatibilityCheck = labels != null ? labels.getCaptureCompatibilityCheck() : null;
        if (captureCompatibilityCheck == null) {
            captureCompatibilityCheck = "";
        }
        String defaultDocumentTitle = labels != null ? labels.getDefaultDocumentTitle() : null;
        if (defaultDocumentTitle == null) {
            defaultDocumentTitle = "";
        }
        String capturePageTitle = labels != null ? labels.getCapturePageTitle() : null;
        if (capturePageTitle == null) {
            capturePageTitle = "";
        }
        String confirmPageTitle = labels != null ? labels.getConfirmPageTitle() : null;
        if (confirmPageTitle == null) {
            confirmPageTitle = "";
        }
        String toGetStarted = labels != null ? labels.getToGetStarted() : null;
        if (toGetStarted == null) {
            toGetStarted = "";
        }
        String errorMessage = config.getErrorMessage();
        String defaultIvsError = labels != null ? labels.getDefaultIvsError() : null;
        if (defaultIvsError == null) {
            defaultIvsError = "";
        }
        String noCardDetected = labels != null ? labels.getNoCardDetected() : null;
        if (noCardDetected == null) {
            noCardDetected = "";
        }
        String str14 = cameraLoading;
        String submitImageForValidation = (labels == null || (previewMessages4 = labels.getPreviewMessages()) == null) ? null : previewMessages4.getSubmitImageForValidation();
        String str15 = cameraIssue;
        String str16 = submitImageForValidation == null ? "" : submitImageForValidation;
        String validatingImage = (labels == null || (previewMessages3 = labels.getPreviewMessages()) == null) ? null : previewMessages3.getValidatingImage();
        String str17 = captureMode;
        String str18 = validatingImage == null ? "" : validatingImage;
        String invalidImage = (labels == null || (previewMessages2 = labels.getPreviewMessages()) == null) ? null : previewMessages2.getInvalidImage();
        String str19 = confirmMode;
        String str20 = invalidImage == null ? "" : invalidImage;
        String imageValidated = (labels == null || (previewMessages = labels.getPreviewMessages()) == null) ? null : previewMessages.getImageValidated();
        SelfieModuleModel.PreviewMessages previewMessages5 = new SelfieModuleModel.PreviewMessages(str16, str18, str20, imageValidated == null ? "" : imageValidated);
        String submit = (labels == null || (submitButtonMessages4 = labels.getSubmitButtonMessages()) == null) ? null : submitButtonMessages4.getSubmit();
        if (submit == null) {
            submit = "";
        }
        String retake = (labels == null || (submitButtonMessages3 = labels.getSubmitButtonMessages()) == null) ? null : submitButtonMessages3.getRetake();
        if (retake == null) {
            retake = "";
        }
        String processing = (labels == null || (submitButtonMessages2 = labels.getSubmitButtonMessages()) == null) ? null : submitButtonMessages2.getProcessing();
        if (processing == null) {
            processing = "";
        }
        String success = (labels == null || (submitButtonMessages = labels.getSubmitButtonMessages()) == null) ? null : submitButtonMessages.getSuccess();
        SelfieModuleModel.SubmitButtonMessages submitButtonMessages5 = new SelfieModuleModel.SubmitButtonMessages(submit, retake, processing, success == null ? "" : success);
        Integer completedModuleCount = config.getCompletedModuleCount();
        int intValue = completedModuleCount != null ? completedModuleCount.intValue() : 0;
        Integer totalModuleCount = config.getTotalModuleCount();
        int intValue2 = totalModuleCount != null ? totalModuleCount.intValue() : 0;
        String idTooClose = labels != null ? labels.getIdTooClose() : null;
        if (idTooClose == null) {
            idTooClose = "";
        }
        String movePhoneRight = labels != null ? labels.getMovePhoneRight() : null;
        if (movePhoneRight == null) {
            movePhoneRight = "";
        }
        String movePhoneLeft = labels != null ? labels.getMovePhoneLeft() : null;
        if (movePhoneLeft == null) {
            movePhoneLeft = "";
        }
        String movePhoneDown = labels != null ? labels.getMovePhoneDown() : null;
        if (movePhoneDown == null) {
            movePhoneDown = "";
        }
        String movePhoneUp = labels != null ? labels.getMovePhoneUp() : null;
        if (movePhoneUp == null) {
            movePhoneUp = "";
        }
        String movePhoneBack = labels != null ? labels.getMovePhoneBack() : null;
        if (movePhoneBack == null) {
            movePhoneBack = "";
        }
        String idealFace = labels != null ? labels.getIdealFace() : null;
        if (idealFace == null) {
            idealFace = "";
        }
        String faceTooClose = labels != null ? labels.getFaceTooClose() : null;
        if (faceTooClose == null) {
            faceTooClose = "";
        }
        String faceMustBeVisible = labels != null ? labels.getFaceMustBeVisible() : null;
        if (faceMustBeVisible == null) {
            faceMustBeVisible = "";
        }
        String adjustLighting = labels != null ? labels.getAdjustLighting() : null;
        if (adjustLighting == null) {
            adjustLighting = "";
        }
        String captureSuccess = labels != null ? labels.getCaptureSuccess() : null;
        if (captureSuccess == null) {
            captureSuccess = "";
        }
        String cameraLoading2 = labels != null ? labels.getCameraLoading() : null;
        if (cameraLoading2 == null) {
            cameraLoading2 = "";
        }
        String errorMessage2 = labels != null ? labels.getErrorMessage() : null;
        if (errorMessage2 == null) {
            errorMessage2 = "";
        }
        String documentCameraPermission = labels != null ? labels.getDocumentCameraPermission() : null;
        if (documentCameraPermission == null) {
            documentCameraPermission = "";
        }
        if (labels != null) {
            str = labels.getMoveAreaError();
        }
        return new SelfieModuleModel(moduleId, sessionToken, documentName, str2, confirmationText, submitButtonText, str3, movePhoneFrontLowEndDevice, greatNowCapture, str4, moveCloser, lookDirectly, nativeMessages5, helpMessages6, str14, str15, str13, str17, str19, backToScanning, captureCompatibilityCheck, defaultDocumentTitle, capturePageTitle, confirmPageTitle, toGetStarted, errorMessage, defaultIvsError, noCardDetected, previewMessages5, submitButtonMessages5, intValue, intValue2, idTooClose, movePhoneRight, movePhoneLeft, movePhoneDown, movePhoneUp, movePhoneBack, idealFace, faceTooClose, faceMustBeVisible, adjustLighting, "", captureSuccess, cameraLoading2, errorMessage2, documentCameraPermission, str == null ? "" : str);
    }
}
