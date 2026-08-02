package com.socure.docv.capturesdk.common.mapper;

import com.socure.docv.capturesdk.common.mapper.Mapper;
import com.socure.docv.capturesdk.common.network.model.stepup.modules.HelpMessages;
import com.socure.docv.capturesdk.common.network.model.stepup.modules.Labels;
import com.socure.docv.capturesdk.common.network.model.stepup.modules.ModuleConfig;
import com.socure.docv.capturesdk.common.network.model.stepup.modules.NativeMessages;
import com.socure.docv.capturesdk.common.network.model.stepup.modules.PreviewMessages;
import com.socure.docv.capturesdk.common.network.model.stepup.modules.SubmitButtonMessages;
import com.socure.docv.capturesdk.models.BackModuleModel;
import io.intercom.android.sdk.metrics.MetricTracker;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

/* compiled from: ModuleConfigToBackModuleConfigMapper.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0005¢\u0006\u0002\u0010\u0004J\u0019\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0002H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u0007J\u001c\u0010\b\u001a\u00020\t2\b\u0010\u0006\u001a\u0004\u0018\u00010\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0002J\u0012\u0010\r\u001a\u00020\u000e2\b\u0010\u0006\u001a\u0004\u0018\u00010\u000fH\u0002J\u0012\u0010\u0010\u001a\u00020\u00112\b\u0010\u0006\u001a\u0004\u0018\u00010\u0012H\u0002J\u0012\u0010\u0013\u001a\u00020\u00142\b\u0010\u0006\u001a\u0004\u0018\u00010\u0015H\u0002\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0016"}, d2 = {"Lcom/socure/docv/capturesdk/common/mapper/ModuleConfigToBackModuleModelMapper;", "Lcom/socure/docv/capturesdk/common/mapper/Mapper;", "Lcom/socure/docv/capturesdk/common/mapper/ModuleMapperInput;", "Lcom/socure/docv/capturesdk/models/BackModuleModel;", "()V", "map", MetricTracker.Object.INPUT, "(Lcom/socure/docv/capturesdk/common/mapper/ModuleMapperInput;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "mapHelpMessages", "Lcom/socure/docv/capturesdk/models/BackModuleModel$HelpMessages;", "Lcom/socure/docv/capturesdk/common/network/model/stepup/modules/HelpMessages;", "labels", "Lcom/socure/docv/capturesdk/common/network/model/stepup/modules/Labels;", "mapNativeMessages", "Lcom/socure/docv/capturesdk/models/BackModuleModel$NativeMessages;", "Lcom/socure/docv/capturesdk/common/network/model/stepup/modules/NativeMessages;", "mapPreviewMessages", "Lcom/socure/docv/capturesdk/models/BackModuleModel$PreviewMessages;", "Lcom/socure/docv/capturesdk/common/network/model/stepup/modules/PreviewMessages;", "mapSubmitButtonMessages", "Lcom/socure/docv/capturesdk/models/BackModuleModel$SubmitButtonMessages;", "Lcom/socure/docv/capturesdk/common/network/model/stepup/modules/SubmitButtonMessages;", "capturesdk_productionRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class ModuleConfigToBackModuleModelMapper implements Mapper<ModuleMapperInput, BackModuleModel> {
    @Override // com.socure.docv.capturesdk.common.mapper.Mapper
    public Object map(List<? extends ModuleMapperInput> list, Continuation<? super List<? extends BackModuleModel>> continuation) {
        return Mapper.DefaultImpls.map(this, list, continuation);
    }

    @Override // com.socure.docv.capturesdk.common.mapper.Mapper
    public Object map(ModuleMapperInput moduleMapperInput, Continuation<? super BackModuleModel> continuation) {
        ModuleConfig moduleConfig;
        HelpMessages helpMessages;
        BackModuleModel.HelpMessages helpMessages2;
        PreviewMessages previewMessages;
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
        String flipIdBarcode = labels != null ? labels.getFlipIdBarcode() : null;
        if (flipIdBarcode == null) {
            flipIdBarcode = "";
        }
        String idLookingGood = labels != null ? labels.getIdLookingGood() : null;
        if (idLookingGood == null) {
            idLookingGood = "";
        }
        String makeSureBarcode = labels != null ? labels.getMakeSureBarcode() : null;
        if (makeSureBarcode == null) {
            makeSureBarcode = "";
        }
        String moveIdCloser = labels != null ? labels.getMoveIdCloser() : null;
        if (moveIdCloser == null) {
            moveIdCloser = "";
        }
        String adjustLighting = labels != null ? labels.getAdjustLighting() : null;
        if (adjustLighting == null) {
            adjustLighting = "";
        }
        String keepIdFlat = labels != null ? labels.getKeepIdFlat() : null;
        if (keepIdFlat == null) {
            keepIdFlat = "";
        }
        String positionBack = labels != null ? labels.getPositionBack() : null;
        if (positionBack == null) {
            positionBack = "";
        }
        String ensureIdFocus = labels != null ? labels.getEnsureIdFocus() : null;
        if (ensureIdFocus == null) {
            ensureIdFocus = "";
        }
        BackModuleModel.NativeMessages mapNativeMessages = mapNativeMessages(labels != null ? labels.getNativeMessages() : null);
        if (labels != null) {
            moduleConfig = config;
            helpMessages = labels.getHelpMessages();
        } else {
            moduleConfig = config;
            helpMessages = null;
        }
        BackModuleModel.HelpMessages mapHelpMessages = mapHelpMessages(helpMessages, labels);
        String captureSuccess = labels != null ? labels.getCaptureSuccess() : null;
        if (captureSuccess == null) {
            captureSuccess = "";
        }
        String scanning = labels != null ? labels.getScanning() : null;
        String str = scanning == null ? "" : scanning;
        String tryPhotoManually = labels != null ? labels.getTryPhotoManually() : null;
        String str2 = tryPhotoManually == null ? "" : tryPhotoManually;
        String cameraLoading = labels != null ? labels.getCameraLoading() : null;
        String str3 = cameraLoading == null ? "" : cameraLoading;
        String cameraIssue = labels != null ? labels.getCameraIssue() : null;
        String str4 = cameraIssue == null ? "" : cameraIssue;
        String startMode = labels != null ? labels.getStartMode() : null;
        String str5 = startMode == null ? "" : startMode;
        String captureMode = labels != null ? labels.getCaptureMode() : null;
        String str6 = captureMode == null ? "" : captureMode;
        String confirmMode = labels != null ? labels.getConfirmMode() : null;
        String str7 = confirmMode == null ? "" : confirmMode;
        String backToScanning = labels != null ? labels.getBackToScanning() : null;
        String str8 = backToScanning == null ? "" : backToScanning;
        String captureCompatibilityCheck = labels != null ? labels.getCaptureCompatibilityCheck() : null;
        String str9 = captureCompatibilityCheck == null ? "" : captureCompatibilityCheck;
        String defaultDocumentTitle = labels != null ? labels.getDefaultDocumentTitle() : null;
        String str10 = defaultDocumentTitle == null ? "" : defaultDocumentTitle;
        String capturePageTitle = labels != null ? labels.getCapturePageTitle() : null;
        String str11 = capturePageTitle == null ? "" : capturePageTitle;
        String confirmPageTitle = labels != null ? labels.getConfirmPageTitle() : null;
        String str12 = confirmPageTitle == null ? "" : confirmPageTitle;
        String toGetStarted = labels != null ? labels.getToGetStarted() : null;
        String str13 = toGetStarted == null ? "" : toGetStarted;
        String errorMessage = moduleConfig.getErrorMessage();
        String defaultIvsError = labels != null ? labels.getDefaultIvsError() : null;
        String str14 = defaultIvsError == null ? "" : defaultIvsError;
        if (labels != null) {
            helpMessages2 = mapHelpMessages;
            previewMessages = labels.getPreviewMessages();
        } else {
            helpMessages2 = mapHelpMessages;
            previewMessages = null;
        }
        BackModuleModel.PreviewMessages mapPreviewMessages = mapPreviewMessages(previewMessages);
        BackModuleModel.SubmitButtonMessages mapSubmitButtonMessages = mapSubmitButtonMessages(labels != null ? labels.getSubmitButtonMessages() : null);
        String movePhoneBack = labels != null ? labels.getMovePhoneBack() : null;
        String str15 = movePhoneBack == null ? "" : movePhoneBack;
        String movePhoneLeft = labels != null ? labels.getMovePhoneLeft() : null;
        String str16 = movePhoneLeft == null ? "" : movePhoneLeft;
        String movePhoneRight = labels != null ? labels.getMovePhoneRight() : null;
        String str17 = movePhoneRight == null ? "" : movePhoneRight;
        String movePhoneDown = labels != null ? labels.getMovePhoneDown() : null;
        String str18 = movePhoneDown == null ? "" : movePhoneDown;
        String movePhoneUp = labels != null ? labels.getMovePhoneUp() : null;
        String str19 = movePhoneUp == null ? "" : movePhoneUp;
        String noCardDetected = labels != null ? labels.getNoCardDetected() : null;
        String str20 = noCardDetected == null ? "" : noCardDetected;
        String idTooClose = labels != null ? labels.getIdTooClose() : null;
        String str21 = idTooClose == null ? "" : idTooClose;
        String manualPrimary = labels != null ? labels.getManualPrimary() : null;
        if (manualPrimary == null) {
            manualPrimary = "";
        }
        String manualSecondary = labels != null ? labels.getManualSecondary() : null;
        if (manualSecondary == null) {
            manualSecondary = "";
        }
        String cameraLoading2 = labels != null ? labels.getCameraLoading() : null;
        String str22 = cameraLoading2 == null ? "" : cameraLoading2;
        String darkImageError = labels != null ? labels.getDarkImageError() : null;
        String str23 = darkImageError == null ? "" : darkImageError;
        String documentCameraPermission = labels != null ? labels.getDocumentCameraPermission() : null;
        String str24 = documentCameraPermission == null ? "" : documentCameraPermission;
        String errorMessage2 = labels != null ? labels.getErrorMessage() : null;
        String str25 = errorMessage2 == null ? "" : errorMessage2;
        Integer completedModuleCount = moduleConfig.getCompletedModuleCount();
        int intValue = completedModuleCount != null ? completedModuleCount.intValue() : 0;
        Integer totalModuleCount = moduleConfig.getTotalModuleCount();
        return new BackModuleModel(moduleId, sessionToken, documentName, confirmationTitle, confirmationText, submitButtonText, flipIdBarcode, idLookingGood, makeSureBarcode, moveIdCloser, adjustLighting, keepIdFlat, positionBack, ensureIdFocus, mapNativeMessages, helpMessages2, captureSuccess, manualPrimary, manualSecondary, str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str25, errorMessage, str14, str23, mapPreviewMessages, mapSubmitButtonMessages, str22, intValue, totalModuleCount != null ? totalModuleCount.intValue() : 0, str20, str21, str17, str16, str18, str19, str15, "", str24);
    }

    private final BackModuleModel.NativeMessages mapNativeMessages(NativeMessages input) {
        String str;
        String str2;
        String title = input != null ? input.getTitle() : null;
        if (title == null) {
            title = "";
        }
        String flipYourId = input != null ? input.getFlipYourId() : null;
        if (flipYourId == null) {
            flipYourId = "";
        }
        String positionPhoneId = input != null ? input.getPositionPhoneId() : null;
        if (positionPhoneId == null) {
            positionPhoneId = "";
        }
        String ensureBarcode = input != null ? input.getEnsureBarcode() : null;
        if (ensureBarcode == null) {
            ensureBarcode = "";
        }
        String clickCapture = input != null ? input.getClickCapture() : null;
        if (clickCapture == null) {
            String str3 = positionPhoneId;
            str2 = "";
            str = str3;
        } else {
            str = positionPhoneId;
            str2 = clickCapture;
        }
        return new BackModuleModel.NativeMessages(title, flipYourId, str, ensureBarcode, str2);
    }

    private final BackModuleModel.HelpMessages mapHelpMessages(HelpMessages input, Labels labels) {
        String str;
        String str2;
        String title = input != null ? input.getTitle() : null;
        if (title == null) {
            title = "";
        }
        String flipYourId = input != null ? input.getFlipYourId() : null;
        if (flipYourId == null) {
            flipYourId = "";
        }
        String holdPhoneOverId = input != null ? input.getHoldPhoneOverId() : null;
        if (holdPhoneOverId == null) {
            holdPhoneOverId = "";
        }
        String focusCameraId = input != null ? input.getFocusCameraId() : null;
        if (focusCameraId == null) {
            focusCameraId = "";
        }
        String keepSteady = labels != null ? labels.getKeepSteady() : null;
        if (keepSteady == null) {
            String str3 = holdPhoneOverId;
            str2 = "";
            str = str3;
        } else {
            str = holdPhoneOverId;
            str2 = keepSteady;
        }
        return new BackModuleModel.HelpMessages(title, flipYourId, str, focusCameraId, str2);
    }

    private final BackModuleModel.PreviewMessages mapPreviewMessages(PreviewMessages input) {
        String submitImageForValidation = input != null ? input.getSubmitImageForValidation() : null;
        if (submitImageForValidation == null) {
            submitImageForValidation = "";
        }
        String validatingImage = input != null ? input.getValidatingImage() : null;
        if (validatingImage == null) {
            validatingImage = "";
        }
        String invalidImage = input != null ? input.getInvalidImage() : null;
        if (invalidImage == null) {
            invalidImage = "";
        }
        String imageValidated = input != null ? input.getImageValidated() : null;
        return new BackModuleModel.PreviewMessages(submitImageForValidation, validatingImage, invalidImage, imageValidated != null ? imageValidated : "");
    }

    private final BackModuleModel.SubmitButtonMessages mapSubmitButtonMessages(SubmitButtonMessages input) {
        String submit = input != null ? input.getSubmit() : null;
        if (submit == null) {
            submit = "";
        }
        String retake = input != null ? input.getRetake() : null;
        if (retake == null) {
            retake = "";
        }
        String processing = input != null ? input.getProcessing() : null;
        if (processing == null) {
            processing = "";
        }
        String success = input != null ? input.getSuccess() : null;
        return new BackModuleModel.SubmitButtonMessages(submit, retake, processing, success != null ? success : "");
    }
}
