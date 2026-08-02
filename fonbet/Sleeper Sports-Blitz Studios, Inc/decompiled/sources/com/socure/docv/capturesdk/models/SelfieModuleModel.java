package com.socure.docv.capturesdk.models;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.common.C;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SelfieModuleModel.kt */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b{\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\b®\u0001¯\u0001°\u0001±\u0001B\u0089\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\u0005\u0012\u0006\u0010\r\u001a\u00020\u0005\u0012\u0006\u0010\u000e\u001a\u00020\u0005\u0012\u0006\u0010\u000f\u001a\u00020\u0005\u0012\u0006\u0010\u0010\u001a\u00020\u0005\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\u0006\u0010\u0013\u001a\u00020\u0014\u0012\u0006\u0010\u0015\u001a\u00020\u0005\u0012\u0006\u0010\u0016\u001a\u00020\u0005\u0012\u0006\u0010\u0017\u001a\u00020\u0005\u0012\u0006\u0010\u0018\u001a\u00020\u0005\u0012\u0006\u0010\u0019\u001a\u00020\u0005\u0012\u0006\u0010\u001a\u001a\u00020\u0005\u0012\u0006\u0010\u001b\u001a\u00020\u0005\u0012\u0006\u0010\u001c\u001a\u00020\u0005\u0012\u0006\u0010\u001d\u001a\u00020\u0005\u0012\u0006\u0010\u001e\u001a\u00020\u0005\u0012\u0006\u0010\u001f\u001a\u00020\u0005\u0012\b\u0010 \u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010!\u001a\u00020\u0005\u0012\u0006\u0010\"\u001a\u00020\u0005\u0012\u0006\u0010#\u001a\u00020$\u0012\u0006\u0010%\u001a\u00020&\u0012\u0006\u0010'\u001a\u00020(\u0012\u0006\u0010)\u001a\u00020(\u0012\u0006\u0010*\u001a\u00020\u0005\u0012\u0006\u0010+\u001a\u00020\u0005\u0012\u0006\u0010,\u001a\u00020\u0005\u0012\u0006\u0010-\u001a\u00020\u0005\u0012\u0006\u0010.\u001a\u00020\u0005\u0012\u0006\u0010/\u001a\u00020\u0005\u0012\u0006\u00100\u001a\u00020\u0005\u0012\u0006\u00101\u001a\u00020\u0005\u0012\u0006\u00102\u001a\u00020\u0005\u0012\u0006\u00103\u001a\u00020\u0005\u0012\u0006\u00104\u001a\u00020\u0005\u0012\u0006\u00105\u001a\u00020\u0005\u0012\u0006\u00106\u001a\u00020\u0005\u0012\u0006\u00107\u001a\u00020\u0005\u0012\u0006\u00108\u001a\u00020\u0005\u0012\u0006\u00109\u001a\u00020\u0005¢\u0006\u0002\u0010:J\t\u0010q\u001a\u00020\u0005HÆ\u0003J\t\u0010r\u001a\u00020\u0005HÆ\u0003J\t\u0010s\u001a\u00020\u0005HÆ\u0003J\t\u0010t\u001a\u00020\u0005HÆ\u0003J\t\u0010u\u001a\u00020\u0012HÆ\u0003J\t\u0010v\u001a\u00020\u0014HÆ\u0003J\t\u0010w\u001a\u00020\u0005HÆ\u0003J\t\u0010x\u001a\u00020\u0005HÆ\u0003J\t\u0010y\u001a\u00020\u0005HÆ\u0003J\t\u0010z\u001a\u00020\u0005HÆ\u0003J\t\u0010{\u001a\u00020\u0005HÆ\u0003J\u000b\u0010|\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010}\u001a\u00020\u0005HÆ\u0003J\t\u0010~\u001a\u00020\u0005HÆ\u0003J\t\u0010\u007f\u001a\u00020\u0005HÆ\u0003J\n\u0010\u0080\u0001\u001a\u00020\u0005HÆ\u0003J\n\u0010\u0081\u0001\u001a\u00020\u0005HÆ\u0003J\n\u0010\u0082\u0001\u001a\u00020\u0005HÆ\u0003J\f\u0010\u0083\u0001\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\n\u0010\u0084\u0001\u001a\u00020\u0005HÆ\u0003J\n\u0010\u0085\u0001\u001a\u00020\u0005HÆ\u0003J\n\u0010\u0086\u0001\u001a\u00020$HÆ\u0003J\n\u0010\u0087\u0001\u001a\u00020\u0005HÆ\u0003J\n\u0010\u0088\u0001\u001a\u00020&HÆ\u0003J\n\u0010\u0089\u0001\u001a\u00020(HÆ\u0003J\n\u0010\u008a\u0001\u001a\u00020(HÆ\u0003J\n\u0010\u008b\u0001\u001a\u00020\u0005HÆ\u0003J\n\u0010\u008c\u0001\u001a\u00020\u0005HÆ\u0003J\n\u0010\u008d\u0001\u001a\u00020\u0005HÆ\u0003J\n\u0010\u008e\u0001\u001a\u00020\u0005HÆ\u0003J\n\u0010\u008f\u0001\u001a\u00020\u0005HÆ\u0003J\n\u0010\u0090\u0001\u001a\u00020\u0005HÆ\u0003J\n\u0010\u0091\u0001\u001a\u00020\u0005HÆ\u0003J\n\u0010\u0092\u0001\u001a\u00020\u0005HÆ\u0003J\n\u0010\u0093\u0001\u001a\u00020\u0005HÆ\u0003J\n\u0010\u0094\u0001\u001a\u00020\u0005HÆ\u0003J\n\u0010\u0095\u0001\u001a\u00020\u0005HÆ\u0003J\n\u0010\u0096\u0001\u001a\u00020\u0005HÆ\u0003J\n\u0010\u0097\u0001\u001a\u00020\u0005HÆ\u0003J\n\u0010\u0098\u0001\u001a\u00020\u0005HÆ\u0003J\n\u0010\u0099\u0001\u001a\u00020\u0005HÆ\u0003J\n\u0010\u009a\u0001\u001a\u00020\u0005HÆ\u0003J\n\u0010\u009b\u0001\u001a\u00020\u0005HÆ\u0003J\n\u0010\u009c\u0001\u001a\u00020\u0005HÆ\u0003J\n\u0010\u009d\u0001\u001a\u00020\u0005HÆ\u0003J\n\u0010\u009e\u0001\u001a\u00020\u0005HÆ\u0003J\n\u0010\u009f\u0001\u001a\u00020\u0005HÆ\u0003J\n\u0010 \u0001\u001a\u00020\u0005HÆ\u0003Jî\u0003\u0010¡\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u00052\b\b\u0002\u0010\f\u001a\u00020\u00052\b\b\u0002\u0010\r\u001a\u00020\u00052\b\b\u0002\u0010\u000e\u001a\u00020\u00052\b\b\u0002\u0010\u000f\u001a\u00020\u00052\b\b\u0002\u0010\u0010\u001a\u00020\u00052\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u00052\b\b\u0002\u0010\u0016\u001a\u00020\u00052\b\b\u0002\u0010\u0017\u001a\u00020\u00052\b\b\u0002\u0010\u0018\u001a\u00020\u00052\b\b\u0002\u0010\u0019\u001a\u00020\u00052\b\b\u0002\u0010\u001a\u001a\u00020\u00052\b\b\u0002\u0010\u001b\u001a\u00020\u00052\b\b\u0002\u0010\u001c\u001a\u00020\u00052\b\b\u0002\u0010\u001d\u001a\u00020\u00052\b\b\u0002\u0010\u001e\u001a\u00020\u00052\b\b\u0002\u0010\u001f\u001a\u00020\u00052\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010!\u001a\u00020\u00052\b\b\u0002\u0010\"\u001a\u00020\u00052\b\b\u0002\u0010#\u001a\u00020$2\b\b\u0002\u0010%\u001a\u00020&2\b\b\u0002\u0010'\u001a\u00020(2\b\b\u0002\u0010)\u001a\u00020(2\b\b\u0002\u0010*\u001a\u00020\u00052\b\b\u0002\u0010+\u001a\u00020\u00052\b\b\u0002\u0010,\u001a\u00020\u00052\b\b\u0002\u0010-\u001a\u00020\u00052\b\b\u0002\u0010.\u001a\u00020\u00052\b\b\u0002\u0010/\u001a\u00020\u00052\b\b\u0002\u00100\u001a\u00020\u00052\b\b\u0002\u00101\u001a\u00020\u00052\b\b\u0002\u00102\u001a\u00020\u00052\b\b\u0002\u00103\u001a\u00020\u00052\b\b\u0002\u00104\u001a\u00020\u00052\b\b\u0002\u00105\u001a\u00020\u00052\b\b\u0002\u00106\u001a\u00020\u00052\b\b\u0002\u00107\u001a\u00020\u00052\b\b\u0002\u00108\u001a\u00020\u00052\b\b\u0002\u00109\u001a\u00020\u0005HÆ\u0001J\n\u0010¢\u0001\u001a\u00020(HÖ\u0001J\u0017\u0010£\u0001\u001a\u00030¤\u00012\n\u0010¥\u0001\u001a\u0005\u0018\u00010¦\u0001HÖ\u0003J\n\u0010§\u0001\u001a\u00020(HÖ\u0001J\n\u0010¨\u0001\u001a\u00020\u0005HÖ\u0001J\u001e\u0010©\u0001\u001a\u00030ª\u00012\b\u0010«\u0001\u001a\u00030¬\u00012\u0007\u0010\u00ad\u0001\u001a\u00020(HÖ\u0001R\u0011\u00103\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b;\u0010<R\u0011\u0010\u000e\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b=\u0010<R\u0011\u0010\u001a\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b>\u0010<R\u0011\u0010\u0016\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b?\u0010<R\u0011\u0010\u0015\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b@\u0010<R\u0011\u0010\u001b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\bA\u0010<R\u0011\u0010\u0018\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\bB\u0010<R\u0011\u0010\u001d\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\bC\u0010<R\u0011\u00105\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\bD\u0010<R\u0011\u0010\"\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\bE\u0010<R\u0011\u0010'\u001a\u00020(¢\u0006\b\n\u0000\u001a\u0004\bF\u0010GR\u0011\u0010\u0019\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\bH\u0010<R\u0011\u0010\u001e\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\bI\u0010<R\u0011\u0010\t\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\bJ\u0010<R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\bK\u0010<R\u0011\u0010\u001c\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\bL\u0010<R\u0011\u0010!\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\bM\u0010<R\u0011\u00108\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\bN\u0010<R\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\bO\u0010<R\u0011\u00102\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\bP\u0010<R\u0011\u00101\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\bQ\u0010<R\u0011\u0010\r\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\bR\u0010<R\u0011\u0010\u0013\u001a\u00020\u0014¢\u0006\b\n\u0000\u001a\u0004\bS\u0010TR\u0011\u0010*\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\bU\u0010<R\u0011\u00100\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\bV\u0010<R\u0011\u00107\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\bW\u0010<R\u0011\u0010\u0010\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\bX\u0010<R\u0011\u00104\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\bY\u0010<R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bZ\u0010<R\u0011\u00109\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b[\u0010<R\u0011\u0010\u000f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\\\u0010<R\u0011\u0010/\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b]\u0010<R\u0011\u0010-\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b^\u0010<R\u0011\u0010\u000b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b_\u0010<R\u0011\u0010,\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b`\u0010<R\u0011\u0010\f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\ba\u0010<R\u0011\u0010+\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\bb\u0010<R\u0011\u0010.\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\bc\u0010<R\u0011\u0010\u0011\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\bd\u0010eR\u0011\u00106\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\bf\u0010<R\u0011\u0010#\u001a\u00020$¢\u0006\b\n\u0000\u001a\u0004\bg\u0010hR\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bi\u0010<R\u0011\u0010\u0017\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\bj\u0010<R\u0016\u0010 \u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bk\u0010<R\u0011\u0010%\u001a\u00020&¢\u0006\b\n\u0000\u001a\u0004\bl\u0010mR\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\bn\u0010<R\u0011\u0010\u001f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\bo\u0010<R\u0011\u0010)\u001a\u00020(¢\u0006\b\n\u0000\u001a\u0004\bp\u0010G¨\u0006²\u0001"}, d2 = {"Lcom/socure/docv/capturesdk/models/SelfieModuleModel;", "Lcom/socure/docv/capturesdk/models/ModuleModel;", "Landroid/os/Parcelable;", "Lcom/socure/docv/capturesdk/models/ScannerModel;", "moduleId", "", "sessionToken", "documentName", "confirmationTitle", "confirmationText", "submitButtonText", "movePhoneFront", "movePhoneLowEndDevice", "greatNowCapture", "alignFaceBox", "moveCloser", "lookDirectly", "nativeMessages", "Lcom/socure/docv/capturesdk/models/SelfieModuleModel$NativeMessages;", "helpMessages", "Lcom/socure/docv/capturesdk/models/SelfieModuleModel$HelpMessages;", "cameraLoading", "cameraIssue", "startMode", "captureMode", "confirmMode", "backToScanning", "captureCompatibilityCheck", "defaultDocumentTitle", "capturePageTitle", "confirmPageTitle", "toGetStarted", "submissionErrorMessage", "defaultIvsError", "cardNotFound", "previewMessages", "Lcom/socure/docv/capturesdk/models/SelfieModuleModel$PreviewMessages;", "submitButtonMessages", "Lcom/socure/docv/capturesdk/models/SelfieModuleModel$SubmitButtonMessages;", "completedModuleCount", "", "totalModuleCount", "idTooClose", "movePhoneRight", "movePhoneLeft", "movePhoneDown", "movePhoneUp", "movePhoneBack", "idealFace", "faceTooClose", "faceMustBeVisible", "adjustLighting", "lowBrightnessError", "captureSuccess", "pleaseWait", "labelErrorMessage", "documentCameraPermission", "moveAreaError", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/socure/docv/capturesdk/models/SelfieModuleModel$NativeMessages;Lcom/socure/docv/capturesdk/models/SelfieModuleModel$HelpMessages;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/socure/docv/capturesdk/models/SelfieModuleModel$PreviewMessages;Lcom/socure/docv/capturesdk/models/SelfieModuleModel$SubmitButtonMessages;IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAdjustLighting", "()Ljava/lang/String;", "getAlignFaceBox", "getBackToScanning", "getCameraIssue", "getCameraLoading", "getCaptureCompatibilityCheck", "getCaptureMode", "getCapturePageTitle", "getCaptureSuccess", "getCardNotFound", "getCompletedModuleCount", "()I", "getConfirmMode", "getConfirmPageTitle", "getConfirmationText", "getConfirmationTitle", "getDefaultDocumentTitle", "getDefaultIvsError", "getDocumentCameraPermission", "getDocumentName", "getFaceMustBeVisible", "getFaceTooClose", "getGreatNowCapture", "getHelpMessages", "()Lcom/socure/docv/capturesdk/models/SelfieModuleModel$HelpMessages;", "getIdTooClose", "getIdealFace", "getLabelErrorMessage", "getLookDirectly", "getLowBrightnessError", "getModuleId", "getMoveAreaError", "getMoveCloser", "getMovePhoneBack", "getMovePhoneDown", "getMovePhoneFront", "getMovePhoneLeft", "getMovePhoneLowEndDevice", "getMovePhoneRight", "getMovePhoneUp", "getNativeMessages", "()Lcom/socure/docv/capturesdk/models/SelfieModuleModel$NativeMessages;", "getPleaseWait", "getPreviewMessages", "()Lcom/socure/docv/capturesdk/models/SelfieModuleModel$PreviewMessages;", "getSessionToken", "getStartMode", "getSubmissionErrorMessage", "getSubmitButtonMessages", "()Lcom/socure/docv/capturesdk/models/SelfieModuleModel$SubmitButtonMessages;", "getSubmitButtonText", "getToGetStarted", "getTotalModuleCount", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component3", "component30", "component31", "component32", "component33", "component34", "component35", "component36", "component37", "component38", "component39", "component4", "component40", "component41", "component42", "component43", "component44", "component45", "component46", "component47", "component48", "component5", "component6", "component7", "component8", "component9", "copy", "describeContents", "equals", "", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "HelpMessages", "NativeMessages", "PreviewMessages", "SubmitButtonMessages", "capturesdk_productionRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class SelfieModuleModel implements ModuleModel, Parcelable, ScannerModel {
    public static final int $stable = 0;
    public static final Parcelable.Creator<SelfieModuleModel> CREATOR = new Creator();
    private final String adjustLighting;
    private final String alignFaceBox;
    private final String backToScanning;
    private final String cameraIssue;
    private final String cameraLoading;
    private final String captureCompatibilityCheck;
    private final String captureMode;
    private final String capturePageTitle;
    private final String captureSuccess;
    private final String cardNotFound;
    private final int completedModuleCount;
    private final String confirmMode;
    private final String confirmPageTitle;
    private final String confirmationText;
    private final String confirmationTitle;
    private final String defaultDocumentTitle;
    private final String defaultIvsError;
    private final String documentCameraPermission;
    private final String documentName;
    private final String faceMustBeVisible;
    private final String faceTooClose;
    private final String greatNowCapture;
    private final HelpMessages helpMessages;
    private final String idTooClose;
    private final String idealFace;
    private final String labelErrorMessage;
    private final String lookDirectly;
    private final String lowBrightnessError;
    private final String moduleId;
    private final String moveAreaError;
    private final String moveCloser;
    private final String movePhoneBack;
    private final String movePhoneDown;
    private final String movePhoneFront;
    private final String movePhoneLeft;
    private final String movePhoneLowEndDevice;
    private final String movePhoneRight;
    private final String movePhoneUp;
    private final NativeMessages nativeMessages;
    private final String pleaseWait;
    private final PreviewMessages previewMessages;
    private final String sessionToken;
    private final String startMode;
    private final String submissionErrorMessage;
    private final SubmitButtonMessages submitButtonMessages;
    private final String submitButtonText;
    private final String toGetStarted;
    private final int totalModuleCount;

    /* compiled from: SelfieModuleModel.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<SelfieModuleModel> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SelfieModuleModel createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new SelfieModuleModel(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), NativeMessages.CREATOR.createFromParcel(parcel), HelpMessages.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), PreviewMessages.CREATOR.createFromParcel(parcel), SubmitButtonMessages.CREATOR.createFromParcel(parcel), parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SelfieModuleModel[] newArray(int i) {
            return new SelfieModuleModel[i];
        }
    }

    public static /* synthetic */ SelfieModuleModel copy$default(SelfieModuleModel selfieModuleModel, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, NativeMessages nativeMessages, HelpMessages helpMessages, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25, String str26, PreviewMessages previewMessages, SubmitButtonMessages submitButtonMessages, int i, int i2, String str27, String str28, String str29, String str30, String str31, String str32, String str33, String str34, String str35, String str36, String str37, String str38, String str39, String str40, String str41, String str42, int i3, int i4, Object obj) {
        String moduleId = (i3 & 1) != 0 ? selfieModuleModel.getModuleId() : str;
        String sessionToken = (i3 & 2) != 0 ? selfieModuleModel.getSessionToken() : str2;
        String str43 = (i3 & 4) != 0 ? selfieModuleModel.documentName : str3;
        String str44 = (i3 & 8) != 0 ? selfieModuleModel.confirmationTitle : str4;
        String str45 = (i3 & 16) != 0 ? selfieModuleModel.confirmationText : str5;
        String str46 = (i3 & 32) != 0 ? selfieModuleModel.submitButtonText : str6;
        String str47 = (i3 & 64) != 0 ? selfieModuleModel.movePhoneFront : str7;
        String str48 = (i3 & 128) != 0 ? selfieModuleModel.movePhoneLowEndDevice : str8;
        String str49 = (i3 & 256) != 0 ? selfieModuleModel.greatNowCapture : str9;
        String str50 = (i3 & 512) != 0 ? selfieModuleModel.alignFaceBox : str10;
        String str51 = (i3 & 1024) != 0 ? selfieModuleModel.moveCloser : str11;
        String str52 = (i3 & 2048) != 0 ? selfieModuleModel.lookDirectly : str12;
        NativeMessages nativeMessages2 = (i3 & 4096) != 0 ? selfieModuleModel.nativeMessages : nativeMessages;
        String str53 = moduleId;
        HelpMessages helpMessages2 = (i3 & 8192) != 0 ? selfieModuleModel.helpMessages : helpMessages;
        String str54 = (i3 & 16384) != 0 ? selfieModuleModel.cameraLoading : str13;
        String str55 = (i3 & 32768) != 0 ? selfieModuleModel.cameraIssue : str14;
        String str56 = (i3 & 65536) != 0 ? selfieModuleModel.startMode : str15;
        String str57 = (i3 & 131072) != 0 ? selfieModuleModel.captureMode : str16;
        String str58 = (i3 & 262144) != 0 ? selfieModuleModel.confirmMode : str17;
        String str59 = (i3 & 524288) != 0 ? selfieModuleModel.backToScanning : str18;
        String str60 = (i3 & 1048576) != 0 ? selfieModuleModel.captureCompatibilityCheck : str19;
        String str61 = (i3 & 2097152) != 0 ? selfieModuleModel.defaultDocumentTitle : str20;
        String str62 = (i3 & 4194304) != 0 ? selfieModuleModel.capturePageTitle : str21;
        String str63 = (i3 & 8388608) != 0 ? selfieModuleModel.confirmPageTitle : str22;
        String str64 = (i3 & 16777216) != 0 ? selfieModuleModel.toGetStarted : str23;
        return selfieModuleModel.copy(str53, sessionToken, str43, str44, str45, str46, str47, str48, str49, str50, str51, str52, nativeMessages2, helpMessages2, str54, str55, str56, str57, str58, str59, str60, str61, str62, str63, str64, (i3 & 33554432) != 0 ? selfieModuleModel.getSubmissionErrorMessage() : str24, (i3 & 67108864) != 0 ? selfieModuleModel.defaultIvsError : str25, (i3 & C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? selfieModuleModel.cardNotFound : str26, (i3 & 268435456) != 0 ? selfieModuleModel.previewMessages : previewMessages, (i3 & C.BUFFER_FLAG_LAST_SAMPLE) != 0 ? selfieModuleModel.submitButtonMessages : submitButtonMessages, (i3 & 1073741824) != 0 ? selfieModuleModel.completedModuleCount : i, (i3 & Integer.MIN_VALUE) != 0 ? selfieModuleModel.totalModuleCount : i2, (i4 & 1) != 0 ? selfieModuleModel.idTooClose : str27, (i4 & 2) != 0 ? selfieModuleModel.movePhoneRight : str28, (i4 & 4) != 0 ? selfieModuleModel.movePhoneLeft : str29, (i4 & 8) != 0 ? selfieModuleModel.movePhoneDown : str30, (i4 & 16) != 0 ? selfieModuleModel.movePhoneUp : str31, (i4 & 32) != 0 ? selfieModuleModel.movePhoneBack : str32, (i4 & 64) != 0 ? selfieModuleModel.idealFace : str33, (i4 & 128) != 0 ? selfieModuleModel.faceTooClose : str34, (i4 & 256) != 0 ? selfieModuleModel.faceMustBeVisible : str35, (i4 & 512) != 0 ? selfieModuleModel.adjustLighting : str36, (i4 & 1024) != 0 ? selfieModuleModel.lowBrightnessError : str37, (i4 & 2048) != 0 ? selfieModuleModel.captureSuccess : str38, (i4 & 4096) != 0 ? selfieModuleModel.pleaseWait : str39, (i4 & 8192) != 0 ? selfieModuleModel.labelErrorMessage : str40, (i4 & 16384) != 0 ? selfieModuleModel.documentCameraPermission : str41, (i4 & 32768) != 0 ? selfieModuleModel.moveAreaError : str42);
    }

    public final String component1() {
        return getModuleId();
    }

    /* renamed from: component10, reason: from getter */
    public final String getAlignFaceBox() {
        return this.alignFaceBox;
    }

    /* renamed from: component11, reason: from getter */
    public final String getMoveCloser() {
        return this.moveCloser;
    }

    /* renamed from: component12, reason: from getter */
    public final String getLookDirectly() {
        return this.lookDirectly;
    }

    /* renamed from: component13, reason: from getter */
    public final NativeMessages getNativeMessages() {
        return this.nativeMessages;
    }

    /* renamed from: component14, reason: from getter */
    public final HelpMessages getHelpMessages() {
        return this.helpMessages;
    }

    /* renamed from: component15, reason: from getter */
    public final String getCameraLoading() {
        return this.cameraLoading;
    }

    /* renamed from: component16, reason: from getter */
    public final String getCameraIssue() {
        return this.cameraIssue;
    }

    /* renamed from: component17, reason: from getter */
    public final String getStartMode() {
        return this.startMode;
    }

    /* renamed from: component18, reason: from getter */
    public final String getCaptureMode() {
        return this.captureMode;
    }

    /* renamed from: component19, reason: from getter */
    public final String getConfirmMode() {
        return this.confirmMode;
    }

    public final String component2() {
        return getSessionToken();
    }

    /* renamed from: component20, reason: from getter */
    public final String getBackToScanning() {
        return this.backToScanning;
    }

    /* renamed from: component21, reason: from getter */
    public final String getCaptureCompatibilityCheck() {
        return this.captureCompatibilityCheck;
    }

    /* renamed from: component22, reason: from getter */
    public final String getDefaultDocumentTitle() {
        return this.defaultDocumentTitle;
    }

    /* renamed from: component23, reason: from getter */
    public final String getCapturePageTitle() {
        return this.capturePageTitle;
    }

    /* renamed from: component24, reason: from getter */
    public final String getConfirmPageTitle() {
        return this.confirmPageTitle;
    }

    /* renamed from: component25, reason: from getter */
    public final String getToGetStarted() {
        return this.toGetStarted;
    }

    public final String component26() {
        return getSubmissionErrorMessage();
    }

    /* renamed from: component27, reason: from getter */
    public final String getDefaultIvsError() {
        return this.defaultIvsError;
    }

    /* renamed from: component28, reason: from getter */
    public final String getCardNotFound() {
        return this.cardNotFound;
    }

    /* renamed from: component29, reason: from getter */
    public final PreviewMessages getPreviewMessages() {
        return this.previewMessages;
    }

    /* renamed from: component3, reason: from getter */
    public final String getDocumentName() {
        return this.documentName;
    }

    /* renamed from: component30, reason: from getter */
    public final SubmitButtonMessages getSubmitButtonMessages() {
        return this.submitButtonMessages;
    }

    /* renamed from: component31, reason: from getter */
    public final int getCompletedModuleCount() {
        return this.completedModuleCount;
    }

    /* renamed from: component32, reason: from getter */
    public final int getTotalModuleCount() {
        return this.totalModuleCount;
    }

    /* renamed from: component33, reason: from getter */
    public final String getIdTooClose() {
        return this.idTooClose;
    }

    /* renamed from: component34, reason: from getter */
    public final String getMovePhoneRight() {
        return this.movePhoneRight;
    }

    /* renamed from: component35, reason: from getter */
    public final String getMovePhoneLeft() {
        return this.movePhoneLeft;
    }

    /* renamed from: component36, reason: from getter */
    public final String getMovePhoneDown() {
        return this.movePhoneDown;
    }

    /* renamed from: component37, reason: from getter */
    public final String getMovePhoneUp() {
        return this.movePhoneUp;
    }

    /* renamed from: component38, reason: from getter */
    public final String getMovePhoneBack() {
        return this.movePhoneBack;
    }

    /* renamed from: component39, reason: from getter */
    public final String getIdealFace() {
        return this.idealFace;
    }

    /* renamed from: component4, reason: from getter */
    public final String getConfirmationTitle() {
        return this.confirmationTitle;
    }

    /* renamed from: component40, reason: from getter */
    public final String getFaceTooClose() {
        return this.faceTooClose;
    }

    /* renamed from: component41, reason: from getter */
    public final String getFaceMustBeVisible() {
        return this.faceMustBeVisible;
    }

    /* renamed from: component42, reason: from getter */
    public final String getAdjustLighting() {
        return this.adjustLighting;
    }

    /* renamed from: component43, reason: from getter */
    public final String getLowBrightnessError() {
        return this.lowBrightnessError;
    }

    /* renamed from: component44, reason: from getter */
    public final String getCaptureSuccess() {
        return this.captureSuccess;
    }

    /* renamed from: component45, reason: from getter */
    public final String getPleaseWait() {
        return this.pleaseWait;
    }

    /* renamed from: component46, reason: from getter */
    public final String getLabelErrorMessage() {
        return this.labelErrorMessage;
    }

    /* renamed from: component47, reason: from getter */
    public final String getDocumentCameraPermission() {
        return this.documentCameraPermission;
    }

    /* renamed from: component48, reason: from getter */
    public final String getMoveAreaError() {
        return this.moveAreaError;
    }

    /* renamed from: component5, reason: from getter */
    public final String getConfirmationText() {
        return this.confirmationText;
    }

    /* renamed from: component6, reason: from getter */
    public final String getSubmitButtonText() {
        return this.submitButtonText;
    }

    /* renamed from: component7, reason: from getter */
    public final String getMovePhoneFront() {
        return this.movePhoneFront;
    }

    /* renamed from: component8, reason: from getter */
    public final String getMovePhoneLowEndDevice() {
        return this.movePhoneLowEndDevice;
    }

    /* renamed from: component9, reason: from getter */
    public final String getGreatNowCapture() {
        return this.greatNowCapture;
    }

    public final SelfieModuleModel copy(String moduleId, String sessionToken, String documentName, String confirmationTitle, String confirmationText, String submitButtonText, String movePhoneFront, String movePhoneLowEndDevice, String greatNowCapture, String alignFaceBox, String moveCloser, String lookDirectly, NativeMessages nativeMessages, HelpMessages helpMessages, String cameraLoading, String cameraIssue, String startMode, String captureMode, String confirmMode, String backToScanning, String captureCompatibilityCheck, String defaultDocumentTitle, String capturePageTitle, String confirmPageTitle, String toGetStarted, String submissionErrorMessage, String defaultIvsError, String cardNotFound, PreviewMessages previewMessages, SubmitButtonMessages submitButtonMessages, int completedModuleCount, int totalModuleCount, String idTooClose, String movePhoneRight, String movePhoneLeft, String movePhoneDown, String movePhoneUp, String movePhoneBack, String idealFace, String faceTooClose, String faceMustBeVisible, String adjustLighting, String lowBrightnessError, String captureSuccess, String pleaseWait, String labelErrorMessage, String documentCameraPermission, String moveAreaError) {
        Intrinsics.checkNotNullParameter(moduleId, "moduleId");
        Intrinsics.checkNotNullParameter(documentName, "documentName");
        Intrinsics.checkNotNullParameter(confirmationTitle, "confirmationTitle");
        Intrinsics.checkNotNullParameter(confirmationText, "confirmationText");
        Intrinsics.checkNotNullParameter(submitButtonText, "submitButtonText");
        Intrinsics.checkNotNullParameter(movePhoneFront, "movePhoneFront");
        Intrinsics.checkNotNullParameter(movePhoneLowEndDevice, "movePhoneLowEndDevice");
        Intrinsics.checkNotNullParameter(greatNowCapture, "greatNowCapture");
        Intrinsics.checkNotNullParameter(alignFaceBox, "alignFaceBox");
        Intrinsics.checkNotNullParameter(moveCloser, "moveCloser");
        Intrinsics.checkNotNullParameter(lookDirectly, "lookDirectly");
        Intrinsics.checkNotNullParameter(nativeMessages, "nativeMessages");
        Intrinsics.checkNotNullParameter(helpMessages, "helpMessages");
        Intrinsics.checkNotNullParameter(cameraLoading, "cameraLoading");
        Intrinsics.checkNotNullParameter(cameraIssue, "cameraIssue");
        Intrinsics.checkNotNullParameter(startMode, "startMode");
        Intrinsics.checkNotNullParameter(captureMode, "captureMode");
        Intrinsics.checkNotNullParameter(confirmMode, "confirmMode");
        Intrinsics.checkNotNullParameter(backToScanning, "backToScanning");
        Intrinsics.checkNotNullParameter(captureCompatibilityCheck, "captureCompatibilityCheck");
        Intrinsics.checkNotNullParameter(defaultDocumentTitle, "defaultDocumentTitle");
        Intrinsics.checkNotNullParameter(capturePageTitle, "capturePageTitle");
        Intrinsics.checkNotNullParameter(confirmPageTitle, "confirmPageTitle");
        Intrinsics.checkNotNullParameter(toGetStarted, "toGetStarted");
        Intrinsics.checkNotNullParameter(defaultIvsError, "defaultIvsError");
        Intrinsics.checkNotNullParameter(cardNotFound, "cardNotFound");
        Intrinsics.checkNotNullParameter(previewMessages, "previewMessages");
        Intrinsics.checkNotNullParameter(submitButtonMessages, "submitButtonMessages");
        Intrinsics.checkNotNullParameter(idTooClose, "idTooClose");
        Intrinsics.checkNotNullParameter(movePhoneRight, "movePhoneRight");
        Intrinsics.checkNotNullParameter(movePhoneLeft, "movePhoneLeft");
        Intrinsics.checkNotNullParameter(movePhoneDown, "movePhoneDown");
        Intrinsics.checkNotNullParameter(movePhoneUp, "movePhoneUp");
        Intrinsics.checkNotNullParameter(movePhoneBack, "movePhoneBack");
        Intrinsics.checkNotNullParameter(idealFace, "idealFace");
        Intrinsics.checkNotNullParameter(faceTooClose, "faceTooClose");
        Intrinsics.checkNotNullParameter(faceMustBeVisible, "faceMustBeVisible");
        Intrinsics.checkNotNullParameter(adjustLighting, "adjustLighting");
        Intrinsics.checkNotNullParameter(lowBrightnessError, "lowBrightnessError");
        Intrinsics.checkNotNullParameter(captureSuccess, "captureSuccess");
        Intrinsics.checkNotNullParameter(pleaseWait, "pleaseWait");
        Intrinsics.checkNotNullParameter(labelErrorMessage, "labelErrorMessage");
        Intrinsics.checkNotNullParameter(documentCameraPermission, "documentCameraPermission");
        Intrinsics.checkNotNullParameter(moveAreaError, "moveAreaError");
        return new SelfieModuleModel(moduleId, sessionToken, documentName, confirmationTitle, confirmationText, submitButtonText, movePhoneFront, movePhoneLowEndDevice, greatNowCapture, alignFaceBox, moveCloser, lookDirectly, nativeMessages, helpMessages, cameraLoading, cameraIssue, startMode, captureMode, confirmMode, backToScanning, captureCompatibilityCheck, defaultDocumentTitle, capturePageTitle, confirmPageTitle, toGetStarted, submissionErrorMessage, defaultIvsError, cardNotFound, previewMessages, submitButtonMessages, completedModuleCount, totalModuleCount, idTooClose, movePhoneRight, movePhoneLeft, movePhoneDown, movePhoneUp, movePhoneBack, idealFace, faceTooClose, faceMustBeVisible, adjustLighting, lowBrightnessError, captureSuccess, pleaseWait, labelErrorMessage, documentCameraPermission, moveAreaError);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SelfieModuleModel)) {
            return false;
        }
        SelfieModuleModel selfieModuleModel = (SelfieModuleModel) other;
        return Intrinsics.areEqual(getModuleId(), selfieModuleModel.getModuleId()) && Intrinsics.areEqual(getSessionToken(), selfieModuleModel.getSessionToken()) && Intrinsics.areEqual(this.documentName, selfieModuleModel.documentName) && Intrinsics.areEqual(this.confirmationTitle, selfieModuleModel.confirmationTitle) && Intrinsics.areEqual(this.confirmationText, selfieModuleModel.confirmationText) && Intrinsics.areEqual(this.submitButtonText, selfieModuleModel.submitButtonText) && Intrinsics.areEqual(this.movePhoneFront, selfieModuleModel.movePhoneFront) && Intrinsics.areEqual(this.movePhoneLowEndDevice, selfieModuleModel.movePhoneLowEndDevice) && Intrinsics.areEqual(this.greatNowCapture, selfieModuleModel.greatNowCapture) && Intrinsics.areEqual(this.alignFaceBox, selfieModuleModel.alignFaceBox) && Intrinsics.areEqual(this.moveCloser, selfieModuleModel.moveCloser) && Intrinsics.areEqual(this.lookDirectly, selfieModuleModel.lookDirectly) && Intrinsics.areEqual(this.nativeMessages, selfieModuleModel.nativeMessages) && Intrinsics.areEqual(this.helpMessages, selfieModuleModel.helpMessages) && Intrinsics.areEqual(this.cameraLoading, selfieModuleModel.cameraLoading) && Intrinsics.areEqual(this.cameraIssue, selfieModuleModel.cameraIssue) && Intrinsics.areEqual(this.startMode, selfieModuleModel.startMode) && Intrinsics.areEqual(this.captureMode, selfieModuleModel.captureMode) && Intrinsics.areEqual(this.confirmMode, selfieModuleModel.confirmMode) && Intrinsics.areEqual(this.backToScanning, selfieModuleModel.backToScanning) && Intrinsics.areEqual(this.captureCompatibilityCheck, selfieModuleModel.captureCompatibilityCheck) && Intrinsics.areEqual(this.defaultDocumentTitle, selfieModuleModel.defaultDocumentTitle) && Intrinsics.areEqual(this.capturePageTitle, selfieModuleModel.capturePageTitle) && Intrinsics.areEqual(this.confirmPageTitle, selfieModuleModel.confirmPageTitle) && Intrinsics.areEqual(this.toGetStarted, selfieModuleModel.toGetStarted) && Intrinsics.areEqual(getSubmissionErrorMessage(), selfieModuleModel.getSubmissionErrorMessage()) && Intrinsics.areEqual(this.defaultIvsError, selfieModuleModel.defaultIvsError) && Intrinsics.areEqual(this.cardNotFound, selfieModuleModel.cardNotFound) && Intrinsics.areEqual(this.previewMessages, selfieModuleModel.previewMessages) && Intrinsics.areEqual(this.submitButtonMessages, selfieModuleModel.submitButtonMessages) && this.completedModuleCount == selfieModuleModel.completedModuleCount && this.totalModuleCount == selfieModuleModel.totalModuleCount && Intrinsics.areEqual(this.idTooClose, selfieModuleModel.idTooClose) && Intrinsics.areEqual(this.movePhoneRight, selfieModuleModel.movePhoneRight) && Intrinsics.areEqual(this.movePhoneLeft, selfieModuleModel.movePhoneLeft) && Intrinsics.areEqual(this.movePhoneDown, selfieModuleModel.movePhoneDown) && Intrinsics.areEqual(this.movePhoneUp, selfieModuleModel.movePhoneUp) && Intrinsics.areEqual(this.movePhoneBack, selfieModuleModel.movePhoneBack) && Intrinsics.areEqual(this.idealFace, selfieModuleModel.idealFace) && Intrinsics.areEqual(this.faceTooClose, selfieModuleModel.faceTooClose) && Intrinsics.areEqual(this.faceMustBeVisible, selfieModuleModel.faceMustBeVisible) && Intrinsics.areEqual(this.adjustLighting, selfieModuleModel.adjustLighting) && Intrinsics.areEqual(this.lowBrightnessError, selfieModuleModel.lowBrightnessError) && Intrinsics.areEqual(this.captureSuccess, selfieModuleModel.captureSuccess) && Intrinsics.areEqual(this.pleaseWait, selfieModuleModel.pleaseWait) && Intrinsics.areEqual(this.labelErrorMessage, selfieModuleModel.labelErrorMessage) && Intrinsics.areEqual(this.documentCameraPermission, selfieModuleModel.documentCameraPermission) && Intrinsics.areEqual(this.moveAreaError, selfieModuleModel.moveAreaError);
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((getModuleId().hashCode() * 31) + (getSessionToken() == null ? 0 : getSessionToken().hashCode())) * 31) + this.documentName.hashCode()) * 31) + this.confirmationTitle.hashCode()) * 31) + this.confirmationText.hashCode()) * 31) + this.submitButtonText.hashCode()) * 31) + this.movePhoneFront.hashCode()) * 31) + this.movePhoneLowEndDevice.hashCode()) * 31) + this.greatNowCapture.hashCode()) * 31) + this.alignFaceBox.hashCode()) * 31) + this.moveCloser.hashCode()) * 31) + this.lookDirectly.hashCode()) * 31) + this.nativeMessages.hashCode()) * 31) + this.helpMessages.hashCode()) * 31) + this.cameraLoading.hashCode()) * 31) + this.cameraIssue.hashCode()) * 31) + this.startMode.hashCode()) * 31) + this.captureMode.hashCode()) * 31) + this.confirmMode.hashCode()) * 31) + this.backToScanning.hashCode()) * 31) + this.captureCompatibilityCheck.hashCode()) * 31) + this.defaultDocumentTitle.hashCode()) * 31) + this.capturePageTitle.hashCode()) * 31) + this.confirmPageTitle.hashCode()) * 31) + this.toGetStarted.hashCode()) * 31) + (getSubmissionErrorMessage() != null ? getSubmissionErrorMessage().hashCode() : 0)) * 31) + this.defaultIvsError.hashCode()) * 31) + this.cardNotFound.hashCode()) * 31) + this.previewMessages.hashCode()) * 31) + this.submitButtonMessages.hashCode()) * 31) + Integer.hashCode(this.completedModuleCount)) * 31) + Integer.hashCode(this.totalModuleCount)) * 31) + this.idTooClose.hashCode()) * 31) + this.movePhoneRight.hashCode()) * 31) + this.movePhoneLeft.hashCode()) * 31) + this.movePhoneDown.hashCode()) * 31) + this.movePhoneUp.hashCode()) * 31) + this.movePhoneBack.hashCode()) * 31) + this.idealFace.hashCode()) * 31) + this.faceTooClose.hashCode()) * 31) + this.faceMustBeVisible.hashCode()) * 31) + this.adjustLighting.hashCode()) * 31) + this.lowBrightnessError.hashCode()) * 31) + this.captureSuccess.hashCode()) * 31) + this.pleaseWait.hashCode()) * 31) + this.labelErrorMessage.hashCode()) * 31) + this.documentCameraPermission.hashCode()) * 31) + this.moveAreaError.hashCode();
    }

    public String toString() {
        return "SelfieModuleModel(moduleId=" + getModuleId() + ", sessionToken=" + getSessionToken() + ", documentName=" + this.documentName + ", confirmationTitle=" + this.confirmationTitle + ", confirmationText=" + this.confirmationText + ", submitButtonText=" + this.submitButtonText + ", movePhoneFront=" + this.movePhoneFront + ", movePhoneLowEndDevice=" + this.movePhoneLowEndDevice + ", greatNowCapture=" + this.greatNowCapture + ", alignFaceBox=" + this.alignFaceBox + ", moveCloser=" + this.moveCloser + ", lookDirectly=" + this.lookDirectly + ", nativeMessages=" + this.nativeMessages + ", helpMessages=" + this.helpMessages + ", cameraLoading=" + this.cameraLoading + ", cameraIssue=" + this.cameraIssue + ", startMode=" + this.startMode + ", captureMode=" + this.captureMode + ", confirmMode=" + this.confirmMode + ", backToScanning=" + this.backToScanning + ", captureCompatibilityCheck=" + this.captureCompatibilityCheck + ", defaultDocumentTitle=" + this.defaultDocumentTitle + ", capturePageTitle=" + this.capturePageTitle + ", confirmPageTitle=" + this.confirmPageTitle + ", toGetStarted=" + this.toGetStarted + ", submissionErrorMessage=" + getSubmissionErrorMessage() + ", defaultIvsError=" + this.defaultIvsError + ", cardNotFound=" + this.cardNotFound + ", previewMessages=" + this.previewMessages + ", submitButtonMessages=" + this.submitButtonMessages + ", completedModuleCount=" + this.completedModuleCount + ", totalModuleCount=" + this.totalModuleCount + ", idTooClose=" + this.idTooClose + ", movePhoneRight=" + this.movePhoneRight + ", movePhoneLeft=" + this.movePhoneLeft + ", movePhoneDown=" + this.movePhoneDown + ", movePhoneUp=" + this.movePhoneUp + ", movePhoneBack=" + this.movePhoneBack + ", idealFace=" + this.idealFace + ", faceTooClose=" + this.faceTooClose + ", faceMustBeVisible=" + this.faceMustBeVisible + ", adjustLighting=" + this.adjustLighting + ", lowBrightnessError=" + this.lowBrightnessError + ", captureSuccess=" + this.captureSuccess + ", pleaseWait=" + this.pleaseWait + ", labelErrorMessage=" + this.labelErrorMessage + ", documentCameraPermission=" + this.documentCameraPermission + ", moveAreaError=" + this.moveAreaError + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.moduleId);
        parcel.writeString(this.sessionToken);
        parcel.writeString(this.documentName);
        parcel.writeString(this.confirmationTitle);
        parcel.writeString(this.confirmationText);
        parcel.writeString(this.submitButtonText);
        parcel.writeString(this.movePhoneFront);
        parcel.writeString(this.movePhoneLowEndDevice);
        parcel.writeString(this.greatNowCapture);
        parcel.writeString(this.alignFaceBox);
        parcel.writeString(this.moveCloser);
        parcel.writeString(this.lookDirectly);
        this.nativeMessages.writeToParcel(parcel, flags);
        this.helpMessages.writeToParcel(parcel, flags);
        parcel.writeString(this.cameraLoading);
        parcel.writeString(this.cameraIssue);
        parcel.writeString(this.startMode);
        parcel.writeString(this.captureMode);
        parcel.writeString(this.confirmMode);
        parcel.writeString(this.backToScanning);
        parcel.writeString(this.captureCompatibilityCheck);
        parcel.writeString(this.defaultDocumentTitle);
        parcel.writeString(this.capturePageTitle);
        parcel.writeString(this.confirmPageTitle);
        parcel.writeString(this.toGetStarted);
        parcel.writeString(this.submissionErrorMessage);
        parcel.writeString(this.defaultIvsError);
        parcel.writeString(this.cardNotFound);
        this.previewMessages.writeToParcel(parcel, flags);
        this.submitButtonMessages.writeToParcel(parcel, flags);
        parcel.writeInt(this.completedModuleCount);
        parcel.writeInt(this.totalModuleCount);
        parcel.writeString(this.idTooClose);
        parcel.writeString(this.movePhoneRight);
        parcel.writeString(this.movePhoneLeft);
        parcel.writeString(this.movePhoneDown);
        parcel.writeString(this.movePhoneUp);
        parcel.writeString(this.movePhoneBack);
        parcel.writeString(this.idealFace);
        parcel.writeString(this.faceTooClose);
        parcel.writeString(this.faceMustBeVisible);
        parcel.writeString(this.adjustLighting);
        parcel.writeString(this.lowBrightnessError);
        parcel.writeString(this.captureSuccess);
        parcel.writeString(this.pleaseWait);
        parcel.writeString(this.labelErrorMessage);
        parcel.writeString(this.documentCameraPermission);
        parcel.writeString(this.moveAreaError);
    }

    public SelfieModuleModel(String moduleId, String str, String documentName, String confirmationTitle, String confirmationText, String submitButtonText, String movePhoneFront, String movePhoneLowEndDevice, String greatNowCapture, String alignFaceBox, String moveCloser, String lookDirectly, NativeMessages nativeMessages, HelpMessages helpMessages, String cameraLoading, String cameraIssue, String startMode, String captureMode, String confirmMode, String backToScanning, String captureCompatibilityCheck, String defaultDocumentTitle, String capturePageTitle, String confirmPageTitle, String toGetStarted, String str2, String defaultIvsError, String cardNotFound, PreviewMessages previewMessages, SubmitButtonMessages submitButtonMessages, int i, int i2, String idTooClose, String movePhoneRight, String movePhoneLeft, String movePhoneDown, String movePhoneUp, String movePhoneBack, String idealFace, String faceTooClose, String faceMustBeVisible, String adjustLighting, String lowBrightnessError, String captureSuccess, String pleaseWait, String labelErrorMessage, String documentCameraPermission, String moveAreaError) {
        Intrinsics.checkNotNullParameter(moduleId, "moduleId");
        Intrinsics.checkNotNullParameter(documentName, "documentName");
        Intrinsics.checkNotNullParameter(confirmationTitle, "confirmationTitle");
        Intrinsics.checkNotNullParameter(confirmationText, "confirmationText");
        Intrinsics.checkNotNullParameter(submitButtonText, "submitButtonText");
        Intrinsics.checkNotNullParameter(movePhoneFront, "movePhoneFront");
        Intrinsics.checkNotNullParameter(movePhoneLowEndDevice, "movePhoneLowEndDevice");
        Intrinsics.checkNotNullParameter(greatNowCapture, "greatNowCapture");
        Intrinsics.checkNotNullParameter(alignFaceBox, "alignFaceBox");
        Intrinsics.checkNotNullParameter(moveCloser, "moveCloser");
        Intrinsics.checkNotNullParameter(lookDirectly, "lookDirectly");
        Intrinsics.checkNotNullParameter(nativeMessages, "nativeMessages");
        Intrinsics.checkNotNullParameter(helpMessages, "helpMessages");
        Intrinsics.checkNotNullParameter(cameraLoading, "cameraLoading");
        Intrinsics.checkNotNullParameter(cameraIssue, "cameraIssue");
        Intrinsics.checkNotNullParameter(startMode, "startMode");
        Intrinsics.checkNotNullParameter(captureMode, "captureMode");
        Intrinsics.checkNotNullParameter(confirmMode, "confirmMode");
        Intrinsics.checkNotNullParameter(backToScanning, "backToScanning");
        Intrinsics.checkNotNullParameter(captureCompatibilityCheck, "captureCompatibilityCheck");
        Intrinsics.checkNotNullParameter(defaultDocumentTitle, "defaultDocumentTitle");
        Intrinsics.checkNotNullParameter(capturePageTitle, "capturePageTitle");
        Intrinsics.checkNotNullParameter(confirmPageTitle, "confirmPageTitle");
        Intrinsics.checkNotNullParameter(toGetStarted, "toGetStarted");
        Intrinsics.checkNotNullParameter(defaultIvsError, "defaultIvsError");
        Intrinsics.checkNotNullParameter(cardNotFound, "cardNotFound");
        Intrinsics.checkNotNullParameter(previewMessages, "previewMessages");
        Intrinsics.checkNotNullParameter(submitButtonMessages, "submitButtonMessages");
        Intrinsics.checkNotNullParameter(idTooClose, "idTooClose");
        Intrinsics.checkNotNullParameter(movePhoneRight, "movePhoneRight");
        Intrinsics.checkNotNullParameter(movePhoneLeft, "movePhoneLeft");
        Intrinsics.checkNotNullParameter(movePhoneDown, "movePhoneDown");
        Intrinsics.checkNotNullParameter(movePhoneUp, "movePhoneUp");
        Intrinsics.checkNotNullParameter(movePhoneBack, "movePhoneBack");
        Intrinsics.checkNotNullParameter(idealFace, "idealFace");
        Intrinsics.checkNotNullParameter(faceTooClose, "faceTooClose");
        Intrinsics.checkNotNullParameter(faceMustBeVisible, "faceMustBeVisible");
        Intrinsics.checkNotNullParameter(adjustLighting, "adjustLighting");
        Intrinsics.checkNotNullParameter(lowBrightnessError, "lowBrightnessError");
        Intrinsics.checkNotNullParameter(captureSuccess, "captureSuccess");
        Intrinsics.checkNotNullParameter(pleaseWait, "pleaseWait");
        Intrinsics.checkNotNullParameter(labelErrorMessage, "labelErrorMessage");
        Intrinsics.checkNotNullParameter(documentCameraPermission, "documentCameraPermission");
        Intrinsics.checkNotNullParameter(moveAreaError, "moveAreaError");
        this.moduleId = moduleId;
        this.sessionToken = str;
        this.documentName = documentName;
        this.confirmationTitle = confirmationTitle;
        this.confirmationText = confirmationText;
        this.submitButtonText = submitButtonText;
        this.movePhoneFront = movePhoneFront;
        this.movePhoneLowEndDevice = movePhoneLowEndDevice;
        this.greatNowCapture = greatNowCapture;
        this.alignFaceBox = alignFaceBox;
        this.moveCloser = moveCloser;
        this.lookDirectly = lookDirectly;
        this.nativeMessages = nativeMessages;
        this.helpMessages = helpMessages;
        this.cameraLoading = cameraLoading;
        this.cameraIssue = cameraIssue;
        this.startMode = startMode;
        this.captureMode = captureMode;
        this.confirmMode = confirmMode;
        this.backToScanning = backToScanning;
        this.captureCompatibilityCheck = captureCompatibilityCheck;
        this.defaultDocumentTitle = defaultDocumentTitle;
        this.capturePageTitle = capturePageTitle;
        this.confirmPageTitle = confirmPageTitle;
        this.toGetStarted = toGetStarted;
        this.submissionErrorMessage = str2;
        this.defaultIvsError = defaultIvsError;
        this.cardNotFound = cardNotFound;
        this.previewMessages = previewMessages;
        this.submitButtonMessages = submitButtonMessages;
        this.completedModuleCount = i;
        this.totalModuleCount = i2;
        this.idTooClose = idTooClose;
        this.movePhoneRight = movePhoneRight;
        this.movePhoneLeft = movePhoneLeft;
        this.movePhoneDown = movePhoneDown;
        this.movePhoneUp = movePhoneUp;
        this.movePhoneBack = movePhoneBack;
        this.idealFace = idealFace;
        this.faceTooClose = faceTooClose;
        this.faceMustBeVisible = faceMustBeVisible;
        this.adjustLighting = adjustLighting;
        this.lowBrightnessError = lowBrightnessError;
        this.captureSuccess = captureSuccess;
        this.pleaseWait = pleaseWait;
        this.labelErrorMessage = labelErrorMessage;
        this.documentCameraPermission = documentCameraPermission;
        this.moveAreaError = moveAreaError;
    }

    @Override // com.socure.docv.capturesdk.models.ModuleModel
    public String getModuleId() {
        return this.moduleId;
    }

    @Override // com.socure.docv.capturesdk.models.ModuleModel
    public String getSessionToken() {
        return this.sessionToken;
    }

    public final String getDocumentName() {
        return this.documentName;
    }

    public final String getConfirmationTitle() {
        return this.confirmationTitle;
    }

    public final String getConfirmationText() {
        return this.confirmationText;
    }

    public final String getSubmitButtonText() {
        return this.submitButtonText;
    }

    public final String getMovePhoneFront() {
        return this.movePhoneFront;
    }

    public final String getMovePhoneLowEndDevice() {
        return this.movePhoneLowEndDevice;
    }

    public final String getGreatNowCapture() {
        return this.greatNowCapture;
    }

    public final String getAlignFaceBox() {
        return this.alignFaceBox;
    }

    public final String getMoveCloser() {
        return this.moveCloser;
    }

    public final String getLookDirectly() {
        return this.lookDirectly;
    }

    public final NativeMessages getNativeMessages() {
        return this.nativeMessages;
    }

    public final HelpMessages getHelpMessages() {
        return this.helpMessages;
    }

    public final String getCameraLoading() {
        return this.cameraLoading;
    }

    public final String getCameraIssue() {
        return this.cameraIssue;
    }

    public final String getStartMode() {
        return this.startMode;
    }

    public final String getCaptureMode() {
        return this.captureMode;
    }

    public final String getConfirmMode() {
        return this.confirmMode;
    }

    public final String getBackToScanning() {
        return this.backToScanning;
    }

    public final String getCaptureCompatibilityCheck() {
        return this.captureCompatibilityCheck;
    }

    public final String getDefaultDocumentTitle() {
        return this.defaultDocumentTitle;
    }

    public final String getCapturePageTitle() {
        return this.capturePageTitle;
    }

    public final String getConfirmPageTitle() {
        return this.confirmPageTitle;
    }

    public final String getToGetStarted() {
        return this.toGetStarted;
    }

    @Override // com.socure.docv.capturesdk.models.ScannerModel
    public String getSubmissionErrorMessage() {
        return this.submissionErrorMessage;
    }

    public final String getDefaultIvsError() {
        return this.defaultIvsError;
    }

    public final String getCardNotFound() {
        return this.cardNotFound;
    }

    public final PreviewMessages getPreviewMessages() {
        return this.previewMessages;
    }

    public final SubmitButtonMessages getSubmitButtonMessages() {
        return this.submitButtonMessages;
    }

    public final int getCompletedModuleCount() {
        return this.completedModuleCount;
    }

    public final int getTotalModuleCount() {
        return this.totalModuleCount;
    }

    public final String getIdTooClose() {
        return this.idTooClose;
    }

    public final String getMovePhoneRight() {
        return this.movePhoneRight;
    }

    public final String getMovePhoneLeft() {
        return this.movePhoneLeft;
    }

    public final String getMovePhoneDown() {
        return this.movePhoneDown;
    }

    public final String getMovePhoneUp() {
        return this.movePhoneUp;
    }

    public final String getMovePhoneBack() {
        return this.movePhoneBack;
    }

    public final String getIdealFace() {
        return this.idealFace;
    }

    public final String getFaceTooClose() {
        return this.faceTooClose;
    }

    public final String getFaceMustBeVisible() {
        return this.faceMustBeVisible;
    }

    public final String getAdjustLighting() {
        return this.adjustLighting;
    }

    public final String getLowBrightnessError() {
        return this.lowBrightnessError;
    }

    public final String getCaptureSuccess() {
        return this.captureSuccess;
    }

    public final String getPleaseWait() {
        return this.pleaseWait;
    }

    public final String getLabelErrorMessage() {
        return this.labelErrorMessage;
    }

    public final String getDocumentCameraPermission() {
        return this.documentCameraPermission;
    }

    public final String getMoveAreaError() {
        return this.moveAreaError;
    }

    /* compiled from: SelfieModuleModel.kt */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J1\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001J\u0019\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u001f"}, d2 = {"Lcom/socure/docv/capturesdk/models/SelfieModuleModel$NativeMessages;", "Landroid/os/Parcelable;", "title", "", "holdPhoneFront", "ensureTopHead", "clickCapture", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getClickCapture", "()Ljava/lang/String;", "getEnsureTopHead", "getHoldPhoneFront", "getTitle", "component1", "component2", "component3", "component4", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "capturesdk_productionRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class NativeMessages implements Parcelable {
        public static final int $stable = 0;
        public static final Parcelable.Creator<NativeMessages> CREATOR = new Creator();
        private final String clickCapture;
        private final String ensureTopHead;
        private final String holdPhoneFront;
        private final String title;

        /* compiled from: SelfieModuleModel.kt */
        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<NativeMessages> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final NativeMessages createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new NativeMessages(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final NativeMessages[] newArray(int i) {
                return new NativeMessages[i];
            }
        }

        public static /* synthetic */ NativeMessages copy$default(NativeMessages nativeMessages, String str, String str2, String str3, String str4, int i, Object obj) {
            if ((i & 1) != 0) {
                str = nativeMessages.title;
            }
            if ((i & 2) != 0) {
                str2 = nativeMessages.holdPhoneFront;
            }
            if ((i & 4) != 0) {
                str3 = nativeMessages.ensureTopHead;
            }
            if ((i & 8) != 0) {
                str4 = nativeMessages.clickCapture;
            }
            return nativeMessages.copy(str, str2, str3, str4);
        }

        /* renamed from: component1, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        /* renamed from: component2, reason: from getter */
        public final String getHoldPhoneFront() {
            return this.holdPhoneFront;
        }

        /* renamed from: component3, reason: from getter */
        public final String getEnsureTopHead() {
            return this.ensureTopHead;
        }

        /* renamed from: component4, reason: from getter */
        public final String getClickCapture() {
            return this.clickCapture;
        }

        public final NativeMessages copy(String title, String holdPhoneFront, String ensureTopHead, String clickCapture) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(holdPhoneFront, "holdPhoneFront");
            Intrinsics.checkNotNullParameter(ensureTopHead, "ensureTopHead");
            Intrinsics.checkNotNullParameter(clickCapture, "clickCapture");
            return new NativeMessages(title, holdPhoneFront, ensureTopHead, clickCapture);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof NativeMessages)) {
                return false;
            }
            NativeMessages nativeMessages = (NativeMessages) other;
            return Intrinsics.areEqual(this.title, nativeMessages.title) && Intrinsics.areEqual(this.holdPhoneFront, nativeMessages.holdPhoneFront) && Intrinsics.areEqual(this.ensureTopHead, nativeMessages.ensureTopHead) && Intrinsics.areEqual(this.clickCapture, nativeMessages.clickCapture);
        }

        public int hashCode() {
            return (((((this.title.hashCode() * 31) + this.holdPhoneFront.hashCode()) * 31) + this.ensureTopHead.hashCode()) * 31) + this.clickCapture.hashCode();
        }

        public String toString() {
            return "NativeMessages(title=" + this.title + ", holdPhoneFront=" + this.holdPhoneFront + ", ensureTopHead=" + this.ensureTopHead + ", clickCapture=" + this.clickCapture + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            Intrinsics.checkNotNullParameter(parcel, "out");
            parcel.writeString(this.title);
            parcel.writeString(this.holdPhoneFront);
            parcel.writeString(this.ensureTopHead);
            parcel.writeString(this.clickCapture);
        }

        public NativeMessages(String title, String holdPhoneFront, String ensureTopHead, String clickCapture) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(holdPhoneFront, "holdPhoneFront");
            Intrinsics.checkNotNullParameter(ensureTopHead, "ensureTopHead");
            Intrinsics.checkNotNullParameter(clickCapture, "clickCapture");
            this.title = title;
            this.holdPhoneFront = holdPhoneFront;
            this.ensureTopHead = ensureTopHead;
            this.clickCapture = clickCapture;
        }

        public final String getTitle() {
            return this.title;
        }

        public final String getHoldPhoneFront() {
            return this.holdPhoneFront;
        }

        public final String getEnsureTopHead() {
            return this.ensureTopHead;
        }

        public final String getClickCapture() {
            return this.clickCapture;
        }
    }

    /* compiled from: SelfieModuleModel.kt */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0015\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003JE\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u0003HÆ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dHÖ\u0003J\t\u0010\u001e\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001J\u0019\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u0019HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000b¨\u0006%"}, d2 = {"Lcom/socure/docv/capturesdk/models/SelfieModuleModel$HelpMessages;", "Landroid/os/Parcelable;", "title", "", "alignFaceFrame", "holdDevice", "lookDirectly", "keepSteady", "holdPhoneOverId", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAlignFaceFrame", "()Ljava/lang/String;", "getHoldDevice", "getHoldPhoneOverId", "getKeepSteady", "getLookDirectly", "getTitle", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "capturesdk_productionRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class HelpMessages implements Parcelable {
        public static final int $stable = 0;
        public static final Parcelable.Creator<HelpMessages> CREATOR = new Creator();
        private final String alignFaceFrame;
        private final String holdDevice;
        private final String holdPhoneOverId;
        private final String keepSteady;
        private final String lookDirectly;
        private final String title;

        /* compiled from: SelfieModuleModel.kt */
        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<HelpMessages> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final HelpMessages createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new HelpMessages(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final HelpMessages[] newArray(int i) {
                return new HelpMessages[i];
            }
        }

        public static /* synthetic */ HelpMessages copy$default(HelpMessages helpMessages, String str, String str2, String str3, String str4, String str5, String str6, int i, Object obj) {
            if ((i & 1) != 0) {
                str = helpMessages.title;
            }
            if ((i & 2) != 0) {
                str2 = helpMessages.alignFaceFrame;
            }
            if ((i & 4) != 0) {
                str3 = helpMessages.holdDevice;
            }
            if ((i & 8) != 0) {
                str4 = helpMessages.lookDirectly;
            }
            if ((i & 16) != 0) {
                str5 = helpMessages.keepSteady;
            }
            if ((i & 32) != 0) {
                str6 = helpMessages.holdPhoneOverId;
            }
            String str7 = str5;
            String str8 = str6;
            return helpMessages.copy(str, str2, str3, str4, str7, str8);
        }

        /* renamed from: component1, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        /* renamed from: component2, reason: from getter */
        public final String getAlignFaceFrame() {
            return this.alignFaceFrame;
        }

        /* renamed from: component3, reason: from getter */
        public final String getHoldDevice() {
            return this.holdDevice;
        }

        /* renamed from: component4, reason: from getter */
        public final String getLookDirectly() {
            return this.lookDirectly;
        }

        /* renamed from: component5, reason: from getter */
        public final String getKeepSteady() {
            return this.keepSteady;
        }

        /* renamed from: component6, reason: from getter */
        public final String getHoldPhoneOverId() {
            return this.holdPhoneOverId;
        }

        public final HelpMessages copy(String title, String alignFaceFrame, String holdDevice, String lookDirectly, String keepSteady, String holdPhoneOverId) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(alignFaceFrame, "alignFaceFrame");
            Intrinsics.checkNotNullParameter(holdDevice, "holdDevice");
            Intrinsics.checkNotNullParameter(lookDirectly, "lookDirectly");
            Intrinsics.checkNotNullParameter(keepSteady, "keepSteady");
            Intrinsics.checkNotNullParameter(holdPhoneOverId, "holdPhoneOverId");
            return new HelpMessages(title, alignFaceFrame, holdDevice, lookDirectly, keepSteady, holdPhoneOverId);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof HelpMessages)) {
                return false;
            }
            HelpMessages helpMessages = (HelpMessages) other;
            return Intrinsics.areEqual(this.title, helpMessages.title) && Intrinsics.areEqual(this.alignFaceFrame, helpMessages.alignFaceFrame) && Intrinsics.areEqual(this.holdDevice, helpMessages.holdDevice) && Intrinsics.areEqual(this.lookDirectly, helpMessages.lookDirectly) && Intrinsics.areEqual(this.keepSteady, helpMessages.keepSteady) && Intrinsics.areEqual(this.holdPhoneOverId, helpMessages.holdPhoneOverId);
        }

        public int hashCode() {
            return (((((((((this.title.hashCode() * 31) + this.alignFaceFrame.hashCode()) * 31) + this.holdDevice.hashCode()) * 31) + this.lookDirectly.hashCode()) * 31) + this.keepSteady.hashCode()) * 31) + this.holdPhoneOverId.hashCode();
        }

        public String toString() {
            return "HelpMessages(title=" + this.title + ", alignFaceFrame=" + this.alignFaceFrame + ", holdDevice=" + this.holdDevice + ", lookDirectly=" + this.lookDirectly + ", keepSteady=" + this.keepSteady + ", holdPhoneOverId=" + this.holdPhoneOverId + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            Intrinsics.checkNotNullParameter(parcel, "out");
            parcel.writeString(this.title);
            parcel.writeString(this.alignFaceFrame);
            parcel.writeString(this.holdDevice);
            parcel.writeString(this.lookDirectly);
            parcel.writeString(this.keepSteady);
            parcel.writeString(this.holdPhoneOverId);
        }

        public HelpMessages(String title, String alignFaceFrame, String holdDevice, String lookDirectly, String keepSteady, String holdPhoneOverId) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(alignFaceFrame, "alignFaceFrame");
            Intrinsics.checkNotNullParameter(holdDevice, "holdDevice");
            Intrinsics.checkNotNullParameter(lookDirectly, "lookDirectly");
            Intrinsics.checkNotNullParameter(keepSteady, "keepSteady");
            Intrinsics.checkNotNullParameter(holdPhoneOverId, "holdPhoneOverId");
            this.title = title;
            this.alignFaceFrame = alignFaceFrame;
            this.holdDevice = holdDevice;
            this.lookDirectly = lookDirectly;
            this.keepSteady = keepSteady;
            this.holdPhoneOverId = holdPhoneOverId;
        }

        public final String getTitle() {
            return this.title;
        }

        public final String getAlignFaceFrame() {
            return this.alignFaceFrame;
        }

        public final String getHoldDevice() {
            return this.holdDevice;
        }

        public final String getLookDirectly() {
            return this.lookDirectly;
        }

        public final String getKeepSteady() {
            return this.keepSteady;
        }

        public final String getHoldPhoneOverId() {
            return this.holdPhoneOverId;
        }
    }

    /* compiled from: SelfieModuleModel.kt */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J1\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001J\u0019\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u001f"}, d2 = {"Lcom/socure/docv/capturesdk/models/SelfieModuleModel$PreviewMessages;", "Landroid/os/Parcelable;", "submitImageForValidation", "", "validatingImage", "invalidImage", "imageValidated", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getImageValidated", "()Ljava/lang/String;", "getInvalidImage", "getSubmitImageForValidation", "getValidatingImage", "component1", "component2", "component3", "component4", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "capturesdk_productionRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class PreviewMessages implements Parcelable {
        public static final int $stable = 0;
        public static final Parcelable.Creator<PreviewMessages> CREATOR = new Creator();
        private final String imageValidated;
        private final String invalidImage;
        private final String submitImageForValidation;
        private final String validatingImage;

        /* compiled from: SelfieModuleModel.kt */
        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<PreviewMessages> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final PreviewMessages createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new PreviewMessages(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final PreviewMessages[] newArray(int i) {
                return new PreviewMessages[i];
            }
        }

        public static /* synthetic */ PreviewMessages copy$default(PreviewMessages previewMessages, String str, String str2, String str3, String str4, int i, Object obj) {
            if ((i & 1) != 0) {
                str = previewMessages.submitImageForValidation;
            }
            if ((i & 2) != 0) {
                str2 = previewMessages.validatingImage;
            }
            if ((i & 4) != 0) {
                str3 = previewMessages.invalidImage;
            }
            if ((i & 8) != 0) {
                str4 = previewMessages.imageValidated;
            }
            return previewMessages.copy(str, str2, str3, str4);
        }

        /* renamed from: component1, reason: from getter */
        public final String getSubmitImageForValidation() {
            return this.submitImageForValidation;
        }

        /* renamed from: component2, reason: from getter */
        public final String getValidatingImage() {
            return this.validatingImage;
        }

        /* renamed from: component3, reason: from getter */
        public final String getInvalidImage() {
            return this.invalidImage;
        }

        /* renamed from: component4, reason: from getter */
        public final String getImageValidated() {
            return this.imageValidated;
        }

        public final PreviewMessages copy(String submitImageForValidation, String validatingImage, String invalidImage, String imageValidated) {
            Intrinsics.checkNotNullParameter(submitImageForValidation, "submitImageForValidation");
            Intrinsics.checkNotNullParameter(validatingImage, "validatingImage");
            Intrinsics.checkNotNullParameter(invalidImage, "invalidImage");
            Intrinsics.checkNotNullParameter(imageValidated, "imageValidated");
            return new PreviewMessages(submitImageForValidation, validatingImage, invalidImage, imageValidated);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PreviewMessages)) {
                return false;
            }
            PreviewMessages previewMessages = (PreviewMessages) other;
            return Intrinsics.areEqual(this.submitImageForValidation, previewMessages.submitImageForValidation) && Intrinsics.areEqual(this.validatingImage, previewMessages.validatingImage) && Intrinsics.areEqual(this.invalidImage, previewMessages.invalidImage) && Intrinsics.areEqual(this.imageValidated, previewMessages.imageValidated);
        }

        public int hashCode() {
            return (((((this.submitImageForValidation.hashCode() * 31) + this.validatingImage.hashCode()) * 31) + this.invalidImage.hashCode()) * 31) + this.imageValidated.hashCode();
        }

        public String toString() {
            return "PreviewMessages(submitImageForValidation=" + this.submitImageForValidation + ", validatingImage=" + this.validatingImage + ", invalidImage=" + this.invalidImage + ", imageValidated=" + this.imageValidated + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            Intrinsics.checkNotNullParameter(parcel, "out");
            parcel.writeString(this.submitImageForValidation);
            parcel.writeString(this.validatingImage);
            parcel.writeString(this.invalidImage);
            parcel.writeString(this.imageValidated);
        }

        public PreviewMessages(String submitImageForValidation, String validatingImage, String invalidImage, String imageValidated) {
            Intrinsics.checkNotNullParameter(submitImageForValidation, "submitImageForValidation");
            Intrinsics.checkNotNullParameter(validatingImage, "validatingImage");
            Intrinsics.checkNotNullParameter(invalidImage, "invalidImage");
            Intrinsics.checkNotNullParameter(imageValidated, "imageValidated");
            this.submitImageForValidation = submitImageForValidation;
            this.validatingImage = validatingImage;
            this.invalidImage = invalidImage;
            this.imageValidated = imageValidated;
        }

        public final String getSubmitImageForValidation() {
            return this.submitImageForValidation;
        }

        public final String getValidatingImage() {
            return this.validatingImage;
        }

        public final String getInvalidImage() {
            return this.invalidImage;
        }

        public final String getImageValidated() {
            return this.imageValidated;
        }
    }

    /* compiled from: SelfieModuleModel.kt */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J1\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001J\u0019\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u001f"}, d2 = {"Lcom/socure/docv/capturesdk/models/SelfieModuleModel$SubmitButtonMessages;", "Landroid/os/Parcelable;", "submit", "", "retake", "processing", "success", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getProcessing", "()Ljava/lang/String;", "getRetake", "getSubmit", "getSuccess", "component1", "component2", "component3", "component4", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "capturesdk_productionRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class SubmitButtonMessages implements Parcelable {
        public static final int $stable = 0;
        public static final Parcelable.Creator<SubmitButtonMessages> CREATOR = new Creator();
        private final String processing;
        private final String retake;
        private final String submit;
        private final String success;

        /* compiled from: SelfieModuleModel.kt */
        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<SubmitButtonMessages> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SubmitButtonMessages createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new SubmitButtonMessages(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SubmitButtonMessages[] newArray(int i) {
                return new SubmitButtonMessages[i];
            }
        }

        public static /* synthetic */ SubmitButtonMessages copy$default(SubmitButtonMessages submitButtonMessages, String str, String str2, String str3, String str4, int i, Object obj) {
            if ((i & 1) != 0) {
                str = submitButtonMessages.submit;
            }
            if ((i & 2) != 0) {
                str2 = submitButtonMessages.retake;
            }
            if ((i & 4) != 0) {
                str3 = submitButtonMessages.processing;
            }
            if ((i & 8) != 0) {
                str4 = submitButtonMessages.success;
            }
            return submitButtonMessages.copy(str, str2, str3, str4);
        }

        /* renamed from: component1, reason: from getter */
        public final String getSubmit() {
            return this.submit;
        }

        /* renamed from: component2, reason: from getter */
        public final String getRetake() {
            return this.retake;
        }

        /* renamed from: component3, reason: from getter */
        public final String getProcessing() {
            return this.processing;
        }

        /* renamed from: component4, reason: from getter */
        public final String getSuccess() {
            return this.success;
        }

        public final SubmitButtonMessages copy(String submit, String retake, String processing, String success) {
            Intrinsics.checkNotNullParameter(submit, "submit");
            Intrinsics.checkNotNullParameter(retake, "retake");
            Intrinsics.checkNotNullParameter(processing, "processing");
            Intrinsics.checkNotNullParameter(success, "success");
            return new SubmitButtonMessages(submit, retake, processing, success);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SubmitButtonMessages)) {
                return false;
            }
            SubmitButtonMessages submitButtonMessages = (SubmitButtonMessages) other;
            return Intrinsics.areEqual(this.submit, submitButtonMessages.submit) && Intrinsics.areEqual(this.retake, submitButtonMessages.retake) && Intrinsics.areEqual(this.processing, submitButtonMessages.processing) && Intrinsics.areEqual(this.success, submitButtonMessages.success);
        }

        public int hashCode() {
            return (((((this.submit.hashCode() * 31) + this.retake.hashCode()) * 31) + this.processing.hashCode()) * 31) + this.success.hashCode();
        }

        public String toString() {
            return "SubmitButtonMessages(submit=" + this.submit + ", retake=" + this.retake + ", processing=" + this.processing + ", success=" + this.success + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            Intrinsics.checkNotNullParameter(parcel, "out");
            parcel.writeString(this.submit);
            parcel.writeString(this.retake);
            parcel.writeString(this.processing);
            parcel.writeString(this.success);
        }

        public SubmitButtonMessages(String submit, String retake, String processing, String success) {
            Intrinsics.checkNotNullParameter(submit, "submit");
            Intrinsics.checkNotNullParameter(retake, "retake");
            Intrinsics.checkNotNullParameter(processing, "processing");
            Intrinsics.checkNotNullParameter(success, "success");
            this.submit = submit;
            this.retake = retake;
            this.processing = processing;
            this.success = success;
        }

        public final String getSubmit() {
            return this.submit;
        }

        public final String getRetake() {
            return this.retake;
        }

        public final String getProcessing() {
            return this.processing;
        }

        public final String getSuccess() {
            return this.success;
        }
    }
}
