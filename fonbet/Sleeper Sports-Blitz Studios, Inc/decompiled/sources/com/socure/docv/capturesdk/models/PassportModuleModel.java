package com.socure.docv.capturesdk.models;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.common.C;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PassportModuleModel.kt */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b{\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\b´\u0001µ\u0001¶\u0001·\u0001B\u0099\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\u0005\u0012\u0006\u0010\r\u001a\u00020\u0005\u0012\u0006\u0010\u000e\u001a\u00020\u0005\u0012\u0006\u0010\u000f\u001a\u00020\u0005\u0012\u0006\u0010\u0010\u001a\u00020\u0005\u0012\u0006\u0010\u0011\u001a\u00020\u0005\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0015\u0012\u0006\u0010\u0016\u001a\u00020\u0005\u0012\u0006\u0010\u0017\u001a\u00020\u0005\u0012\u0006\u0010\u0018\u001a\u00020\u0005\u0012\u0006\u0010\u0019\u001a\u00020\u0005\u0012\u0006\u0010\u001a\u001a\u00020\u0005\u0012\u0006\u0010\u001b\u001a\u00020\u0005\u0012\u0006\u0010\u001c\u001a\u00020\u0005\u0012\u0006\u0010\u001d\u001a\u00020\u0005\u0012\u0006\u0010\u001e\u001a\u00020\u0005\u0012\u0006\u0010\u001f\u001a\u00020\u0005\u0012\u0006\u0010 \u001a\u00020\u0005\u0012\u0006\u0010!\u001a\u00020\u0005\u0012\u0006\u0010\"\u001a\u00020\u0005\u0012\u0006\u0010#\u001a\u00020\u0005\u0012\u0006\u0010$\u001a\u00020\u0005\u0012\u0006\u0010%\u001a\u00020\u0005\u0012\b\u0010&\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010'\u001a\u00020\u0005\u0012\u0006\u0010(\u001a\u00020)\u0012\u0006\u0010*\u001a\u00020+\u0012\u0006\u0010,\u001a\u00020\u0005\u0012\u0006\u0010-\u001a\u00020.\u0012\u0006\u0010/\u001a\u00020.\u0012\u0006\u00100\u001a\u00020\u0005\u0012\u0006\u00101\u001a\u00020\u0005\u0012\u0006\u00102\u001a\u00020\u0005\u0012\u0006\u00103\u001a\u00020\u0005\u0012\u0006\u00104\u001a\u00020\u0005\u0012\u0006\u00105\u001a\u00020\u0005\u0012\u0006\u00106\u001a\u00020\u0005\u0012\u0006\u00107\u001a\u00020\u0005\u0012\u0006\u00108\u001a\u00020\u0005\u0012\u0006\u00109\u001a\u00020\u0005\u0012\u0006\u0010:\u001a\u00020\u0005\u0012\u0006\u0010;\u001a\u00020\u0005¢\u0006\u0002\u0010<J\t\u0010u\u001a\u00020\u0005HÆ\u0003J\t\u0010v\u001a\u00020\u0005HÆ\u0003J\t\u0010w\u001a\u00020\u0005HÆ\u0003J\t\u0010x\u001a\u00020\u0005HÆ\u0003J\t\u0010y\u001a\u00020\u0005HÆ\u0003J\t\u0010z\u001a\u00020\u0013HÆ\u0003J\t\u0010{\u001a\u00020\u0015HÆ\u0003J\t\u0010|\u001a\u00020\u0005HÆ\u0003J\t\u0010}\u001a\u00020\u0005HÆ\u0003J\t\u0010~\u001a\u00020\u0005HÆ\u0003J\t\u0010\u007f\u001a\u00020\u0005HÆ\u0003J\f\u0010\u0080\u0001\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\n\u0010\u0081\u0001\u001a\u00020\u0005HÆ\u0003J\n\u0010\u0082\u0001\u001a\u00020\u0005HÆ\u0003J\n\u0010\u0083\u0001\u001a\u00020\u0005HÆ\u0003J\n\u0010\u0084\u0001\u001a\u00020\u0005HÆ\u0003J\n\u0010\u0085\u0001\u001a\u00020\u0005HÆ\u0003J\n\u0010\u0086\u0001\u001a\u00020\u0005HÆ\u0003J\n\u0010\u0087\u0001\u001a\u00020\u0005HÆ\u0003J\n\u0010\u0088\u0001\u001a\u00020\u0005HÆ\u0003J\n\u0010\u0089\u0001\u001a\u00020\u0005HÆ\u0003J\n\u0010\u008a\u0001\u001a\u00020\u0005HÆ\u0003J\n\u0010\u008b\u0001\u001a\u00020\u0005HÆ\u0003J\n\u0010\u008c\u0001\u001a\u00020\u0005HÆ\u0003J\n\u0010\u008d\u0001\u001a\u00020\u0005HÆ\u0003J\f\u0010\u008e\u0001\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\n\u0010\u008f\u0001\u001a\u00020\u0005HÆ\u0003J\n\u0010\u0090\u0001\u001a\u00020)HÆ\u0003J\n\u0010\u0091\u0001\u001a\u00020+HÆ\u0003J\n\u0010\u0092\u0001\u001a\u00020\u0005HÆ\u0003J\n\u0010\u0093\u0001\u001a\u00020.HÆ\u0003J\n\u0010\u0094\u0001\u001a\u00020.HÆ\u0003J\n\u0010\u0095\u0001\u001a\u00020\u0005HÆ\u0003J\n\u0010\u0096\u0001\u001a\u00020\u0005HÆ\u0003J\n\u0010\u0097\u0001\u001a\u00020\u0005HÆ\u0003J\n\u0010\u0098\u0001\u001a\u00020\u0005HÆ\u0003J\n\u0010\u0099\u0001\u001a\u00020\u0005HÆ\u0003J\n\u0010\u009a\u0001\u001a\u00020\u0005HÆ\u0003J\n\u0010\u009b\u0001\u001a\u00020\u0005HÆ\u0003J\n\u0010\u009c\u0001\u001a\u00020\u0005HÆ\u0003J\n\u0010\u009d\u0001\u001a\u00020\u0005HÆ\u0003J\n\u0010\u009e\u0001\u001a\u00020\u0005HÆ\u0003J\n\u0010\u009f\u0001\u001a\u00020\u0005HÆ\u0003J\n\u0010 \u0001\u001a\u00020\u0005HÆ\u0003J\n\u0010¡\u0001\u001a\u00020\u0005HÆ\u0003J\n\u0010¢\u0001\u001a\u00020\u0005HÆ\u0003J\n\u0010£\u0001\u001a\u00020\u0005HÆ\u0003J\n\u0010¤\u0001\u001a\u00020\u0005HÆ\u0003J\n\u0010¥\u0001\u001a\u00020\u0005HÆ\u0003J\n\u0010¦\u0001\u001a\u00020\u0005HÆ\u0003J\u0082\u0004\u0010§\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u00052\b\b\u0002\u0010\f\u001a\u00020\u00052\b\b\u0002\u0010\r\u001a\u00020\u00052\b\b\u0002\u0010\u000e\u001a\u00020\u00052\b\b\u0002\u0010\u000f\u001a\u00020\u00052\b\b\u0002\u0010\u0010\u001a\u00020\u00052\b\b\u0002\u0010\u0011\u001a\u00020\u00052\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u00052\b\b\u0002\u0010\u0017\u001a\u00020\u00052\b\b\u0002\u0010\u0018\u001a\u00020\u00052\b\b\u0002\u0010\u0019\u001a\u00020\u00052\b\b\u0002\u0010\u001a\u001a\u00020\u00052\b\b\u0002\u0010\u001b\u001a\u00020\u00052\b\b\u0002\u0010\u001c\u001a\u00020\u00052\b\b\u0002\u0010\u001d\u001a\u00020\u00052\b\b\u0002\u0010\u001e\u001a\u00020\u00052\b\b\u0002\u0010\u001f\u001a\u00020\u00052\b\b\u0002\u0010 \u001a\u00020\u00052\b\b\u0002\u0010!\u001a\u00020\u00052\b\b\u0002\u0010\"\u001a\u00020\u00052\b\b\u0002\u0010#\u001a\u00020\u00052\b\b\u0002\u0010$\u001a\u00020\u00052\b\b\u0002\u0010%\u001a\u00020\u00052\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010'\u001a\u00020\u00052\b\b\u0002\u0010(\u001a\u00020)2\b\b\u0002\u0010*\u001a\u00020+2\b\b\u0002\u0010,\u001a\u00020\u00052\b\b\u0002\u0010-\u001a\u00020.2\b\b\u0002\u0010/\u001a\u00020.2\b\b\u0002\u00100\u001a\u00020\u00052\b\b\u0002\u00101\u001a\u00020\u00052\b\b\u0002\u00102\u001a\u00020\u00052\b\b\u0002\u00103\u001a\u00020\u00052\b\b\u0002\u00104\u001a\u00020\u00052\b\b\u0002\u00105\u001a\u00020\u00052\b\b\u0002\u00106\u001a\u00020\u00052\b\b\u0002\u00107\u001a\u00020\u00052\b\b\u0002\u00108\u001a\u00020\u00052\b\b\u0002\u00109\u001a\u00020\u00052\b\b\u0002\u0010:\u001a\u00020\u00052\b\b\u0002\u0010;\u001a\u00020\u0005HÆ\u0001J\n\u0010¨\u0001\u001a\u00020.HÖ\u0001J\u0017\u0010©\u0001\u001a\u00030ª\u00012\n\u0010«\u0001\u001a\u0005\u0018\u00010¬\u0001HÖ\u0003J\n\u0010\u00ad\u0001\u001a\u00020.HÖ\u0001J\n\u0010®\u0001\u001a\u00020\u0005HÖ\u0001J\u001e\u0010¯\u0001\u001a\u00030°\u00012\b\u0010±\u0001\u001a\u00030²\u00012\u0007\u0010³\u0001\u001a\u00020.HÖ\u0001R\u0011\u0010\u0011\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b=\u0010>R\u0011\u0010 \u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b?\u0010>R\u0011\u0010\u001c\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b@\u0010>R\u0011\u0010\u001b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\bA\u0010>R\u0011\u0010!\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\bB\u0010>R\u0011\u0010\u001e\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\bC\u0010>R\u0011\u0010#\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\bD\u0010>R\u0011\u0010\u0016\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\bE\u0010>R\u0011\u0010-\u001a\u00020.¢\u0006\b\n\u0000\u001a\u0004\bF\u0010GR\u0011\u0010\u001f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\bH\u0010>R\u0011\u0010$\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\bI\u0010>R\u0011\u0010\t\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\bJ\u0010>R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\bK\u0010>R\u0011\u0010;\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\bL\u0010>R\u0011\u0010\"\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\bM\u0010>R\u0011\u0010'\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\bN\u0010>R\u0011\u0010:\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\bO\u0010>R\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\bP\u0010>R\u0011\u0010\u000e\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\bQ\u0010>R\u0011\u0010\u0014\u001a\u00020\u0015¢\u0006\b\n\u0000\u001a\u0004\bR\u0010SR\u0011\u00107\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\bT\u0010>R\u0011\u0010\f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\bU\u0010>R\u0011\u00109\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\bV\u0010>R\u0011\u00108\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\bW\u0010>R\u0011\u0010\u0017\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\bX\u0010>R\u0011\u0010\u0018\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\bY\u0010>R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bZ\u0010>R\u0011\u0010\r\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b[\u0010>R\u0011\u00106\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\\\u0010>R\u0011\u00104\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b]\u0010>R\u0011\u00103\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b^\u0010>R\u0011\u00102\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b_\u0010>R\u0011\u00105\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b`\u0010>R\u0011\u0010\u0012\u001a\u00020\u0013¢\u0006\b\n\u0000\u001a\u0004\ba\u0010bR\u0011\u00100\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\bc\u0010>R\u0011\u0010\u0010\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\bd\u0010>R\u0011\u0010\u000f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\be\u0010>R\u0011\u00101\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\bf\u0010>R\u0011\u0010\u000b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\bg\u0010>R\u0011\u0010,\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\bh\u0010>R\u0011\u0010(\u001a\u00020)¢\u0006\b\n\u0000\u001a\u0004\bi\u0010jR\u0011\u0010\u0019\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\bk\u0010>R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bl\u0010>R\u0011\u0010\u001d\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\bm\u0010>R\u0016\u0010&\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bn\u0010>R\u0011\u0010*\u001a\u00020+¢\u0006\b\n\u0000\u001a\u0004\bo\u0010pR\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\bq\u0010>R\u0011\u0010%\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\br\u0010>R\u0011\u0010/\u001a\u00020.¢\u0006\b\n\u0000\u001a\u0004\bs\u0010GR\u0011\u0010\u001a\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\bt\u0010>¨\u0006¸\u0001"}, d2 = {"Lcom/socure/docv/capturesdk/models/PassportModuleModel;", "Lcom/socure/docv/capturesdk/models/ModuleModel;", "Landroid/os/Parcelable;", "Lcom/socure/docv/capturesdk/models/ScannerModel;", "moduleId", "", "sessionToken", "documentName", "confirmationTitle", "confirmationText", "submitButtonText", "placeFlatAndHoldPassport", "keepPassportFlat", "movePassportCloser", "ensurePassportFocus", "passportLookingGood", "openPassportBook", "adjustLighting", "nativeMessages", "Lcom/socure/docv/capturesdk/models/PassportModuleModel$NativeMessages;", "helpMessages", "Lcom/socure/docv/capturesdk/models/PassportModuleModel$HelpMessages;", "captureSuccess", "manualPrimary", "manualSecondary", "scanning", "tryPhotoManually", "cameraLoading", "cameraIssue", "startMode", "captureMode", "confirmMode", "backToScanning", "captureCompatibilityCheck", "defaultDocumentTitle", "capturePageTitle", "confirmPageTitle", "toGetStarted", "submissionErrorMessage", "defaultIvsError", "previewMessages", "Lcom/socure/docv/capturesdk/models/PassportModuleModel$PreviewMessages;", "submitButtonMessages", "Lcom/socure/docv/capturesdk/models/PassportModuleModel$SubmitButtonMessages;", "pleaseWait", "completedModuleCount", "", "totalModuleCount", "noPassportDetected", "passportTooClose", "movePhoneRight", "movePhoneLeft", "movePhoneDown", "movePhoneUp", "movePhoneBack", "idLookingGood", "lowBrightnessError", "labelErrorMessage", "documentCameraPermission", "darkImageError", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/socure/docv/capturesdk/models/PassportModuleModel$NativeMessages;Lcom/socure/docv/capturesdk/models/PassportModuleModel$HelpMessages;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/socure/docv/capturesdk/models/PassportModuleModel$PreviewMessages;Lcom/socure/docv/capturesdk/models/PassportModuleModel$SubmitButtonMessages;Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAdjustLighting", "()Ljava/lang/String;", "getBackToScanning", "getCameraIssue", "getCameraLoading", "getCaptureCompatibilityCheck", "getCaptureMode", "getCapturePageTitle", "getCaptureSuccess", "getCompletedModuleCount", "()I", "getConfirmMode", "getConfirmPageTitle", "getConfirmationText", "getConfirmationTitle", "getDarkImageError", "getDefaultDocumentTitle", "getDefaultIvsError", "getDocumentCameraPermission", "getDocumentName", "getEnsurePassportFocus", "getHelpMessages", "()Lcom/socure/docv/capturesdk/models/PassportModuleModel$HelpMessages;", "getIdLookingGood", "getKeepPassportFlat", "getLabelErrorMessage", "getLowBrightnessError", "getManualPrimary", "getManualSecondary", "getModuleId", "getMovePassportCloser", "getMovePhoneBack", "getMovePhoneDown", "getMovePhoneLeft", "getMovePhoneRight", "getMovePhoneUp", "getNativeMessages", "()Lcom/socure/docv/capturesdk/models/PassportModuleModel$NativeMessages;", "getNoPassportDetected", "getOpenPassportBook", "getPassportLookingGood", "getPassportTooClose", "getPlaceFlatAndHoldPassport", "getPleaseWait", "getPreviewMessages", "()Lcom/socure/docv/capturesdk/models/PassportModuleModel$PreviewMessages;", "getScanning", "getSessionToken", "getStartMode", "getSubmissionErrorMessage", "getSubmitButtonMessages", "()Lcom/socure/docv/capturesdk/models/PassportModuleModel$SubmitButtonMessages;", "getSubmitButtonText", "getToGetStarted", "getTotalModuleCount", "getTryPhotoManually", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component3", "component30", "component31", "component32", "component33", "component34", "component35", "component36", "component37", "component38", "component39", "component4", "component40", "component41", "component42", "component43", "component44", "component45", "component46", "component47", "component48", "component49", "component5", "component50", "component6", "component7", "component8", "component9", "copy", "describeContents", "equals", "", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "HelpMessages", "NativeMessages", "PreviewMessages", "SubmitButtonMessages", "capturesdk_productionRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class PassportModuleModel implements ModuleModel, Parcelable, ScannerModel {
    public static final int $stable = 0;
    public static final Parcelable.Creator<PassportModuleModel> CREATOR = new Creator();
    private final String adjustLighting;
    private final String backToScanning;
    private final String cameraIssue;
    private final String cameraLoading;
    private final String captureCompatibilityCheck;
    private final String captureMode;
    private final String capturePageTitle;
    private final String captureSuccess;
    private final int completedModuleCount;
    private final String confirmMode;
    private final String confirmPageTitle;
    private final String confirmationText;
    private final String confirmationTitle;
    private final String darkImageError;
    private final String defaultDocumentTitle;
    private final String defaultIvsError;
    private final String documentCameraPermission;
    private final String documentName;
    private final String ensurePassportFocus;
    private final HelpMessages helpMessages;
    private final String idLookingGood;
    private final String keepPassportFlat;
    private final String labelErrorMessage;
    private final String lowBrightnessError;
    private final String manualPrimary;
    private final String manualSecondary;
    private final String moduleId;
    private final String movePassportCloser;
    private final String movePhoneBack;
    private final String movePhoneDown;
    private final String movePhoneLeft;
    private final String movePhoneRight;
    private final String movePhoneUp;
    private final NativeMessages nativeMessages;
    private final String noPassportDetected;
    private final String openPassportBook;
    private final String passportLookingGood;
    private final String passportTooClose;
    private final String placeFlatAndHoldPassport;
    private final String pleaseWait;
    private final PreviewMessages previewMessages;
    private final String scanning;
    private final String sessionToken;
    private final String startMode;
    private final String submissionErrorMessage;
    private final SubmitButtonMessages submitButtonMessages;
    private final String submitButtonText;
    private final String toGetStarted;
    private final int totalModuleCount;
    private final String tryPhotoManually;

    /* compiled from: PassportModuleModel.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<PassportModuleModel> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PassportModuleModel createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new PassportModuleModel(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), NativeMessages.CREATOR.createFromParcel(parcel), HelpMessages.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), PreviewMessages.CREATOR.createFromParcel(parcel), SubmitButtonMessages.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PassportModuleModel[] newArray(int i) {
            return new PassportModuleModel[i];
        }
    }

    public static /* synthetic */ PassportModuleModel copy$default(PassportModuleModel passportModuleModel, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, NativeMessages nativeMessages, HelpMessages helpMessages, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25, String str26, String str27, String str28, String str29, String str30, String str31, PreviewMessages previewMessages, SubmitButtonMessages submitButtonMessages, String str32, int i, int i2, String str33, String str34, String str35, String str36, String str37, String str38, String str39, String str40, String str41, String str42, String str43, String str44, int i3, int i4, Object obj) {
        String moduleId = (i3 & 1) != 0 ? passportModuleModel.getModuleId() : str;
        String sessionToken = (i3 & 2) != 0 ? passportModuleModel.getSessionToken() : str2;
        String str45 = (i3 & 4) != 0 ? passportModuleModel.documentName : str3;
        String str46 = (i3 & 8) != 0 ? passportModuleModel.confirmationTitle : str4;
        String str47 = (i3 & 16) != 0 ? passportModuleModel.confirmationText : str5;
        String str48 = (i3 & 32) != 0 ? passportModuleModel.submitButtonText : str6;
        String str49 = (i3 & 64) != 0 ? passportModuleModel.placeFlatAndHoldPassport : str7;
        String str50 = (i3 & 128) != 0 ? passportModuleModel.keepPassportFlat : str8;
        String str51 = (i3 & 256) != 0 ? passportModuleModel.movePassportCloser : str9;
        String str52 = (i3 & 512) != 0 ? passportModuleModel.ensurePassportFocus : str10;
        String str53 = (i3 & 1024) != 0 ? passportModuleModel.passportLookingGood : str11;
        String str54 = (i3 & 2048) != 0 ? passportModuleModel.openPassportBook : str12;
        String str55 = (i3 & 4096) != 0 ? passportModuleModel.adjustLighting : str13;
        String str56 = moduleId;
        NativeMessages nativeMessages2 = (i3 & 8192) != 0 ? passportModuleModel.nativeMessages : nativeMessages;
        HelpMessages helpMessages2 = (i3 & 16384) != 0 ? passportModuleModel.helpMessages : helpMessages;
        String str57 = (i3 & 32768) != 0 ? passportModuleModel.captureSuccess : str14;
        String str58 = (i3 & 65536) != 0 ? passportModuleModel.manualPrimary : str15;
        String str59 = (i3 & 131072) != 0 ? passportModuleModel.manualSecondary : str16;
        String str60 = (i3 & 262144) != 0 ? passportModuleModel.scanning : str17;
        String str61 = (i3 & 524288) != 0 ? passportModuleModel.tryPhotoManually : str18;
        String str62 = (i3 & 1048576) != 0 ? passportModuleModel.cameraLoading : str19;
        String str63 = (i3 & 2097152) != 0 ? passportModuleModel.cameraIssue : str20;
        String str64 = (i3 & 4194304) != 0 ? passportModuleModel.startMode : str21;
        String str65 = (i3 & 8388608) != 0 ? passportModuleModel.captureMode : str22;
        String str66 = (i3 & 16777216) != 0 ? passportModuleModel.confirmMode : str23;
        String str67 = (i3 & 33554432) != 0 ? passportModuleModel.backToScanning : str24;
        String str68 = (i3 & 67108864) != 0 ? passportModuleModel.captureCompatibilityCheck : str25;
        String str69 = (i3 & C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? passportModuleModel.defaultDocumentTitle : str26;
        String str70 = (i3 & 268435456) != 0 ? passportModuleModel.capturePageTitle : str27;
        String str71 = (i3 & C.BUFFER_FLAG_LAST_SAMPLE) != 0 ? passportModuleModel.confirmPageTitle : str28;
        String str72 = (i3 & 1073741824) != 0 ? passportModuleModel.toGetStarted : str29;
        return passportModuleModel.copy(str56, sessionToken, str45, str46, str47, str48, str49, str50, str51, str52, str53, str54, str55, nativeMessages2, helpMessages2, str57, str58, str59, str60, str61, str62, str63, str64, str65, str66, str67, str68, str69, str70, str71, str72, (i3 & Integer.MIN_VALUE) != 0 ? passportModuleModel.getSubmissionErrorMessage() : str30, (i4 & 1) != 0 ? passportModuleModel.defaultIvsError : str31, (i4 & 2) != 0 ? passportModuleModel.previewMessages : previewMessages, (i4 & 4) != 0 ? passportModuleModel.submitButtonMessages : submitButtonMessages, (i4 & 8) != 0 ? passportModuleModel.pleaseWait : str32, (i4 & 16) != 0 ? passportModuleModel.completedModuleCount : i, (i4 & 32) != 0 ? passportModuleModel.totalModuleCount : i2, (i4 & 64) != 0 ? passportModuleModel.noPassportDetected : str33, (i4 & 128) != 0 ? passportModuleModel.passportTooClose : str34, (i4 & 256) != 0 ? passportModuleModel.movePhoneRight : str35, (i4 & 512) != 0 ? passportModuleModel.movePhoneLeft : str36, (i4 & 1024) != 0 ? passportModuleModel.movePhoneDown : str37, (i4 & 2048) != 0 ? passportModuleModel.movePhoneUp : str38, (i4 & 4096) != 0 ? passportModuleModel.movePhoneBack : str39, (i4 & 8192) != 0 ? passportModuleModel.idLookingGood : str40, (i4 & 16384) != 0 ? passportModuleModel.lowBrightnessError : str41, (i4 & 32768) != 0 ? passportModuleModel.labelErrorMessage : str42, (i4 & 65536) != 0 ? passportModuleModel.documentCameraPermission : str43, (i4 & 131072) != 0 ? passportModuleModel.darkImageError : str44);
    }

    public final String component1() {
        return getModuleId();
    }

    /* renamed from: component10, reason: from getter */
    public final String getEnsurePassportFocus() {
        return this.ensurePassportFocus;
    }

    /* renamed from: component11, reason: from getter */
    public final String getPassportLookingGood() {
        return this.passportLookingGood;
    }

    /* renamed from: component12, reason: from getter */
    public final String getOpenPassportBook() {
        return this.openPassportBook;
    }

    /* renamed from: component13, reason: from getter */
    public final String getAdjustLighting() {
        return this.adjustLighting;
    }

    /* renamed from: component14, reason: from getter */
    public final NativeMessages getNativeMessages() {
        return this.nativeMessages;
    }

    /* renamed from: component15, reason: from getter */
    public final HelpMessages getHelpMessages() {
        return this.helpMessages;
    }

    /* renamed from: component16, reason: from getter */
    public final String getCaptureSuccess() {
        return this.captureSuccess;
    }

    /* renamed from: component17, reason: from getter */
    public final String getManualPrimary() {
        return this.manualPrimary;
    }

    /* renamed from: component18, reason: from getter */
    public final String getManualSecondary() {
        return this.manualSecondary;
    }

    /* renamed from: component19, reason: from getter */
    public final String getScanning() {
        return this.scanning;
    }

    public final String component2() {
        return getSessionToken();
    }

    /* renamed from: component20, reason: from getter */
    public final String getTryPhotoManually() {
        return this.tryPhotoManually;
    }

    /* renamed from: component21, reason: from getter */
    public final String getCameraLoading() {
        return this.cameraLoading;
    }

    /* renamed from: component22, reason: from getter */
    public final String getCameraIssue() {
        return this.cameraIssue;
    }

    /* renamed from: component23, reason: from getter */
    public final String getStartMode() {
        return this.startMode;
    }

    /* renamed from: component24, reason: from getter */
    public final String getCaptureMode() {
        return this.captureMode;
    }

    /* renamed from: component25, reason: from getter */
    public final String getConfirmMode() {
        return this.confirmMode;
    }

    /* renamed from: component26, reason: from getter */
    public final String getBackToScanning() {
        return this.backToScanning;
    }

    /* renamed from: component27, reason: from getter */
    public final String getCaptureCompatibilityCheck() {
        return this.captureCompatibilityCheck;
    }

    /* renamed from: component28, reason: from getter */
    public final String getDefaultDocumentTitle() {
        return this.defaultDocumentTitle;
    }

    /* renamed from: component29, reason: from getter */
    public final String getCapturePageTitle() {
        return this.capturePageTitle;
    }

    /* renamed from: component3, reason: from getter */
    public final String getDocumentName() {
        return this.documentName;
    }

    /* renamed from: component30, reason: from getter */
    public final String getConfirmPageTitle() {
        return this.confirmPageTitle;
    }

    /* renamed from: component31, reason: from getter */
    public final String getToGetStarted() {
        return this.toGetStarted;
    }

    public final String component32() {
        return getSubmissionErrorMessage();
    }

    /* renamed from: component33, reason: from getter */
    public final String getDefaultIvsError() {
        return this.defaultIvsError;
    }

    /* renamed from: component34, reason: from getter */
    public final PreviewMessages getPreviewMessages() {
        return this.previewMessages;
    }

    /* renamed from: component35, reason: from getter */
    public final SubmitButtonMessages getSubmitButtonMessages() {
        return this.submitButtonMessages;
    }

    /* renamed from: component36, reason: from getter */
    public final String getPleaseWait() {
        return this.pleaseWait;
    }

    /* renamed from: component37, reason: from getter */
    public final int getCompletedModuleCount() {
        return this.completedModuleCount;
    }

    /* renamed from: component38, reason: from getter */
    public final int getTotalModuleCount() {
        return this.totalModuleCount;
    }

    /* renamed from: component39, reason: from getter */
    public final String getNoPassportDetected() {
        return this.noPassportDetected;
    }

    /* renamed from: component4, reason: from getter */
    public final String getConfirmationTitle() {
        return this.confirmationTitle;
    }

    /* renamed from: component40, reason: from getter */
    public final String getPassportTooClose() {
        return this.passportTooClose;
    }

    /* renamed from: component41, reason: from getter */
    public final String getMovePhoneRight() {
        return this.movePhoneRight;
    }

    /* renamed from: component42, reason: from getter */
    public final String getMovePhoneLeft() {
        return this.movePhoneLeft;
    }

    /* renamed from: component43, reason: from getter */
    public final String getMovePhoneDown() {
        return this.movePhoneDown;
    }

    /* renamed from: component44, reason: from getter */
    public final String getMovePhoneUp() {
        return this.movePhoneUp;
    }

    /* renamed from: component45, reason: from getter */
    public final String getMovePhoneBack() {
        return this.movePhoneBack;
    }

    /* renamed from: component46, reason: from getter */
    public final String getIdLookingGood() {
        return this.idLookingGood;
    }

    /* renamed from: component47, reason: from getter */
    public final String getLowBrightnessError() {
        return this.lowBrightnessError;
    }

    /* renamed from: component48, reason: from getter */
    public final String getLabelErrorMessage() {
        return this.labelErrorMessage;
    }

    /* renamed from: component49, reason: from getter */
    public final String getDocumentCameraPermission() {
        return this.documentCameraPermission;
    }

    /* renamed from: component5, reason: from getter */
    public final String getConfirmationText() {
        return this.confirmationText;
    }

    /* renamed from: component50, reason: from getter */
    public final String getDarkImageError() {
        return this.darkImageError;
    }

    /* renamed from: component6, reason: from getter */
    public final String getSubmitButtonText() {
        return this.submitButtonText;
    }

    /* renamed from: component7, reason: from getter */
    public final String getPlaceFlatAndHoldPassport() {
        return this.placeFlatAndHoldPassport;
    }

    /* renamed from: component8, reason: from getter */
    public final String getKeepPassportFlat() {
        return this.keepPassportFlat;
    }

    /* renamed from: component9, reason: from getter */
    public final String getMovePassportCloser() {
        return this.movePassportCloser;
    }

    public final PassportModuleModel copy(String moduleId, String sessionToken, String documentName, String confirmationTitle, String confirmationText, String submitButtonText, String placeFlatAndHoldPassport, String keepPassportFlat, String movePassportCloser, String ensurePassportFocus, String passportLookingGood, String openPassportBook, String adjustLighting, NativeMessages nativeMessages, HelpMessages helpMessages, String captureSuccess, String manualPrimary, String manualSecondary, String scanning, String tryPhotoManually, String cameraLoading, String cameraIssue, String startMode, String captureMode, String confirmMode, String backToScanning, String captureCompatibilityCheck, String defaultDocumentTitle, String capturePageTitle, String confirmPageTitle, String toGetStarted, String submissionErrorMessage, String defaultIvsError, PreviewMessages previewMessages, SubmitButtonMessages submitButtonMessages, String pleaseWait, int completedModuleCount, int totalModuleCount, String noPassportDetected, String passportTooClose, String movePhoneRight, String movePhoneLeft, String movePhoneDown, String movePhoneUp, String movePhoneBack, String idLookingGood, String lowBrightnessError, String labelErrorMessage, String documentCameraPermission, String darkImageError) {
        Intrinsics.checkNotNullParameter(moduleId, "moduleId");
        Intrinsics.checkNotNullParameter(documentName, "documentName");
        Intrinsics.checkNotNullParameter(confirmationTitle, "confirmationTitle");
        Intrinsics.checkNotNullParameter(confirmationText, "confirmationText");
        Intrinsics.checkNotNullParameter(submitButtonText, "submitButtonText");
        Intrinsics.checkNotNullParameter(placeFlatAndHoldPassport, "placeFlatAndHoldPassport");
        Intrinsics.checkNotNullParameter(keepPassportFlat, "keepPassportFlat");
        Intrinsics.checkNotNullParameter(movePassportCloser, "movePassportCloser");
        Intrinsics.checkNotNullParameter(ensurePassportFocus, "ensurePassportFocus");
        Intrinsics.checkNotNullParameter(passportLookingGood, "passportLookingGood");
        Intrinsics.checkNotNullParameter(openPassportBook, "openPassportBook");
        Intrinsics.checkNotNullParameter(adjustLighting, "adjustLighting");
        Intrinsics.checkNotNullParameter(nativeMessages, "nativeMessages");
        Intrinsics.checkNotNullParameter(helpMessages, "helpMessages");
        Intrinsics.checkNotNullParameter(captureSuccess, "captureSuccess");
        Intrinsics.checkNotNullParameter(manualPrimary, "manualPrimary");
        Intrinsics.checkNotNullParameter(manualSecondary, "manualSecondary");
        Intrinsics.checkNotNullParameter(scanning, "scanning");
        Intrinsics.checkNotNullParameter(tryPhotoManually, "tryPhotoManually");
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
        Intrinsics.checkNotNullParameter(previewMessages, "previewMessages");
        Intrinsics.checkNotNullParameter(submitButtonMessages, "submitButtonMessages");
        Intrinsics.checkNotNullParameter(pleaseWait, "pleaseWait");
        Intrinsics.checkNotNullParameter(noPassportDetected, "noPassportDetected");
        Intrinsics.checkNotNullParameter(passportTooClose, "passportTooClose");
        Intrinsics.checkNotNullParameter(movePhoneRight, "movePhoneRight");
        Intrinsics.checkNotNullParameter(movePhoneLeft, "movePhoneLeft");
        Intrinsics.checkNotNullParameter(movePhoneDown, "movePhoneDown");
        Intrinsics.checkNotNullParameter(movePhoneUp, "movePhoneUp");
        Intrinsics.checkNotNullParameter(movePhoneBack, "movePhoneBack");
        Intrinsics.checkNotNullParameter(idLookingGood, "idLookingGood");
        Intrinsics.checkNotNullParameter(lowBrightnessError, "lowBrightnessError");
        Intrinsics.checkNotNullParameter(labelErrorMessage, "labelErrorMessage");
        Intrinsics.checkNotNullParameter(documentCameraPermission, "documentCameraPermission");
        Intrinsics.checkNotNullParameter(darkImageError, "darkImageError");
        return new PassportModuleModel(moduleId, sessionToken, documentName, confirmationTitle, confirmationText, submitButtonText, placeFlatAndHoldPassport, keepPassportFlat, movePassportCloser, ensurePassportFocus, passportLookingGood, openPassportBook, adjustLighting, nativeMessages, helpMessages, captureSuccess, manualPrimary, manualSecondary, scanning, tryPhotoManually, cameraLoading, cameraIssue, startMode, captureMode, confirmMode, backToScanning, captureCompatibilityCheck, defaultDocumentTitle, capturePageTitle, confirmPageTitle, toGetStarted, submissionErrorMessage, defaultIvsError, previewMessages, submitButtonMessages, pleaseWait, completedModuleCount, totalModuleCount, noPassportDetected, passportTooClose, movePhoneRight, movePhoneLeft, movePhoneDown, movePhoneUp, movePhoneBack, idLookingGood, lowBrightnessError, labelErrorMessage, documentCameraPermission, darkImageError);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PassportModuleModel)) {
            return false;
        }
        PassportModuleModel passportModuleModel = (PassportModuleModel) other;
        return Intrinsics.areEqual(getModuleId(), passportModuleModel.getModuleId()) && Intrinsics.areEqual(getSessionToken(), passportModuleModel.getSessionToken()) && Intrinsics.areEqual(this.documentName, passportModuleModel.documentName) && Intrinsics.areEqual(this.confirmationTitle, passportModuleModel.confirmationTitle) && Intrinsics.areEqual(this.confirmationText, passportModuleModel.confirmationText) && Intrinsics.areEqual(this.submitButtonText, passportModuleModel.submitButtonText) && Intrinsics.areEqual(this.placeFlatAndHoldPassport, passportModuleModel.placeFlatAndHoldPassport) && Intrinsics.areEqual(this.keepPassportFlat, passportModuleModel.keepPassportFlat) && Intrinsics.areEqual(this.movePassportCloser, passportModuleModel.movePassportCloser) && Intrinsics.areEqual(this.ensurePassportFocus, passportModuleModel.ensurePassportFocus) && Intrinsics.areEqual(this.passportLookingGood, passportModuleModel.passportLookingGood) && Intrinsics.areEqual(this.openPassportBook, passportModuleModel.openPassportBook) && Intrinsics.areEqual(this.adjustLighting, passportModuleModel.adjustLighting) && Intrinsics.areEqual(this.nativeMessages, passportModuleModel.nativeMessages) && Intrinsics.areEqual(this.helpMessages, passportModuleModel.helpMessages) && Intrinsics.areEqual(this.captureSuccess, passportModuleModel.captureSuccess) && Intrinsics.areEqual(this.manualPrimary, passportModuleModel.manualPrimary) && Intrinsics.areEqual(this.manualSecondary, passportModuleModel.manualSecondary) && Intrinsics.areEqual(this.scanning, passportModuleModel.scanning) && Intrinsics.areEqual(this.tryPhotoManually, passportModuleModel.tryPhotoManually) && Intrinsics.areEqual(this.cameraLoading, passportModuleModel.cameraLoading) && Intrinsics.areEqual(this.cameraIssue, passportModuleModel.cameraIssue) && Intrinsics.areEqual(this.startMode, passportModuleModel.startMode) && Intrinsics.areEqual(this.captureMode, passportModuleModel.captureMode) && Intrinsics.areEqual(this.confirmMode, passportModuleModel.confirmMode) && Intrinsics.areEqual(this.backToScanning, passportModuleModel.backToScanning) && Intrinsics.areEqual(this.captureCompatibilityCheck, passportModuleModel.captureCompatibilityCheck) && Intrinsics.areEqual(this.defaultDocumentTitle, passportModuleModel.defaultDocumentTitle) && Intrinsics.areEqual(this.capturePageTitle, passportModuleModel.capturePageTitle) && Intrinsics.areEqual(this.confirmPageTitle, passportModuleModel.confirmPageTitle) && Intrinsics.areEqual(this.toGetStarted, passportModuleModel.toGetStarted) && Intrinsics.areEqual(getSubmissionErrorMessage(), passportModuleModel.getSubmissionErrorMessage()) && Intrinsics.areEqual(this.defaultIvsError, passportModuleModel.defaultIvsError) && Intrinsics.areEqual(this.previewMessages, passportModuleModel.previewMessages) && Intrinsics.areEqual(this.submitButtonMessages, passportModuleModel.submitButtonMessages) && Intrinsics.areEqual(this.pleaseWait, passportModuleModel.pleaseWait) && this.completedModuleCount == passportModuleModel.completedModuleCount && this.totalModuleCount == passportModuleModel.totalModuleCount && Intrinsics.areEqual(this.noPassportDetected, passportModuleModel.noPassportDetected) && Intrinsics.areEqual(this.passportTooClose, passportModuleModel.passportTooClose) && Intrinsics.areEqual(this.movePhoneRight, passportModuleModel.movePhoneRight) && Intrinsics.areEqual(this.movePhoneLeft, passportModuleModel.movePhoneLeft) && Intrinsics.areEqual(this.movePhoneDown, passportModuleModel.movePhoneDown) && Intrinsics.areEqual(this.movePhoneUp, passportModuleModel.movePhoneUp) && Intrinsics.areEqual(this.movePhoneBack, passportModuleModel.movePhoneBack) && Intrinsics.areEqual(this.idLookingGood, passportModuleModel.idLookingGood) && Intrinsics.areEqual(this.lowBrightnessError, passportModuleModel.lowBrightnessError) && Intrinsics.areEqual(this.labelErrorMessage, passportModuleModel.labelErrorMessage) && Intrinsics.areEqual(this.documentCameraPermission, passportModuleModel.documentCameraPermission) && Intrinsics.areEqual(this.darkImageError, passportModuleModel.darkImageError);
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((getModuleId().hashCode() * 31) + (getSessionToken() == null ? 0 : getSessionToken().hashCode())) * 31) + this.documentName.hashCode()) * 31) + this.confirmationTitle.hashCode()) * 31) + this.confirmationText.hashCode()) * 31) + this.submitButtonText.hashCode()) * 31) + this.placeFlatAndHoldPassport.hashCode()) * 31) + this.keepPassportFlat.hashCode()) * 31) + this.movePassportCloser.hashCode()) * 31) + this.ensurePassportFocus.hashCode()) * 31) + this.passportLookingGood.hashCode()) * 31) + this.openPassportBook.hashCode()) * 31) + this.adjustLighting.hashCode()) * 31) + this.nativeMessages.hashCode()) * 31) + this.helpMessages.hashCode()) * 31) + this.captureSuccess.hashCode()) * 31) + this.manualPrimary.hashCode()) * 31) + this.manualSecondary.hashCode()) * 31) + this.scanning.hashCode()) * 31) + this.tryPhotoManually.hashCode()) * 31) + this.cameraLoading.hashCode()) * 31) + this.cameraIssue.hashCode()) * 31) + this.startMode.hashCode()) * 31) + this.captureMode.hashCode()) * 31) + this.confirmMode.hashCode()) * 31) + this.backToScanning.hashCode()) * 31) + this.captureCompatibilityCheck.hashCode()) * 31) + this.defaultDocumentTitle.hashCode()) * 31) + this.capturePageTitle.hashCode()) * 31) + this.confirmPageTitle.hashCode()) * 31) + this.toGetStarted.hashCode()) * 31) + (getSubmissionErrorMessage() != null ? getSubmissionErrorMessage().hashCode() : 0)) * 31) + this.defaultIvsError.hashCode()) * 31) + this.previewMessages.hashCode()) * 31) + this.submitButtonMessages.hashCode()) * 31) + this.pleaseWait.hashCode()) * 31) + Integer.hashCode(this.completedModuleCount)) * 31) + Integer.hashCode(this.totalModuleCount)) * 31) + this.noPassportDetected.hashCode()) * 31) + this.passportTooClose.hashCode()) * 31) + this.movePhoneRight.hashCode()) * 31) + this.movePhoneLeft.hashCode()) * 31) + this.movePhoneDown.hashCode()) * 31) + this.movePhoneUp.hashCode()) * 31) + this.movePhoneBack.hashCode()) * 31) + this.idLookingGood.hashCode()) * 31) + this.lowBrightnessError.hashCode()) * 31) + this.labelErrorMessage.hashCode()) * 31) + this.documentCameraPermission.hashCode()) * 31) + this.darkImageError.hashCode();
    }

    public String toString() {
        return "PassportModuleModel(moduleId=" + getModuleId() + ", sessionToken=" + getSessionToken() + ", documentName=" + this.documentName + ", confirmationTitle=" + this.confirmationTitle + ", confirmationText=" + this.confirmationText + ", submitButtonText=" + this.submitButtonText + ", placeFlatAndHoldPassport=" + this.placeFlatAndHoldPassport + ", keepPassportFlat=" + this.keepPassportFlat + ", movePassportCloser=" + this.movePassportCloser + ", ensurePassportFocus=" + this.ensurePassportFocus + ", passportLookingGood=" + this.passportLookingGood + ", openPassportBook=" + this.openPassportBook + ", adjustLighting=" + this.adjustLighting + ", nativeMessages=" + this.nativeMessages + ", helpMessages=" + this.helpMessages + ", captureSuccess=" + this.captureSuccess + ", manualPrimary=" + this.manualPrimary + ", manualSecondary=" + this.manualSecondary + ", scanning=" + this.scanning + ", tryPhotoManually=" + this.tryPhotoManually + ", cameraLoading=" + this.cameraLoading + ", cameraIssue=" + this.cameraIssue + ", startMode=" + this.startMode + ", captureMode=" + this.captureMode + ", confirmMode=" + this.confirmMode + ", backToScanning=" + this.backToScanning + ", captureCompatibilityCheck=" + this.captureCompatibilityCheck + ", defaultDocumentTitle=" + this.defaultDocumentTitle + ", capturePageTitle=" + this.capturePageTitle + ", confirmPageTitle=" + this.confirmPageTitle + ", toGetStarted=" + this.toGetStarted + ", submissionErrorMessage=" + getSubmissionErrorMessage() + ", defaultIvsError=" + this.defaultIvsError + ", previewMessages=" + this.previewMessages + ", submitButtonMessages=" + this.submitButtonMessages + ", pleaseWait=" + this.pleaseWait + ", completedModuleCount=" + this.completedModuleCount + ", totalModuleCount=" + this.totalModuleCount + ", noPassportDetected=" + this.noPassportDetected + ", passportTooClose=" + this.passportTooClose + ", movePhoneRight=" + this.movePhoneRight + ", movePhoneLeft=" + this.movePhoneLeft + ", movePhoneDown=" + this.movePhoneDown + ", movePhoneUp=" + this.movePhoneUp + ", movePhoneBack=" + this.movePhoneBack + ", idLookingGood=" + this.idLookingGood + ", lowBrightnessError=" + this.lowBrightnessError + ", labelErrorMessage=" + this.labelErrorMessage + ", documentCameraPermission=" + this.documentCameraPermission + ", darkImageError=" + this.darkImageError + ")";
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
        parcel.writeString(this.placeFlatAndHoldPassport);
        parcel.writeString(this.keepPassportFlat);
        parcel.writeString(this.movePassportCloser);
        parcel.writeString(this.ensurePassportFocus);
        parcel.writeString(this.passportLookingGood);
        parcel.writeString(this.openPassportBook);
        parcel.writeString(this.adjustLighting);
        this.nativeMessages.writeToParcel(parcel, flags);
        this.helpMessages.writeToParcel(parcel, flags);
        parcel.writeString(this.captureSuccess);
        parcel.writeString(this.manualPrimary);
        parcel.writeString(this.manualSecondary);
        parcel.writeString(this.scanning);
        parcel.writeString(this.tryPhotoManually);
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
        this.previewMessages.writeToParcel(parcel, flags);
        this.submitButtonMessages.writeToParcel(parcel, flags);
        parcel.writeString(this.pleaseWait);
        parcel.writeInt(this.completedModuleCount);
        parcel.writeInt(this.totalModuleCount);
        parcel.writeString(this.noPassportDetected);
        parcel.writeString(this.passportTooClose);
        parcel.writeString(this.movePhoneRight);
        parcel.writeString(this.movePhoneLeft);
        parcel.writeString(this.movePhoneDown);
        parcel.writeString(this.movePhoneUp);
        parcel.writeString(this.movePhoneBack);
        parcel.writeString(this.idLookingGood);
        parcel.writeString(this.lowBrightnessError);
        parcel.writeString(this.labelErrorMessage);
        parcel.writeString(this.documentCameraPermission);
        parcel.writeString(this.darkImageError);
    }

    public PassportModuleModel(String moduleId, String str, String documentName, String confirmationTitle, String confirmationText, String submitButtonText, String placeFlatAndHoldPassport, String keepPassportFlat, String movePassportCloser, String ensurePassportFocus, String passportLookingGood, String openPassportBook, String adjustLighting, NativeMessages nativeMessages, HelpMessages helpMessages, String captureSuccess, String manualPrimary, String manualSecondary, String scanning, String tryPhotoManually, String cameraLoading, String cameraIssue, String startMode, String captureMode, String confirmMode, String backToScanning, String captureCompatibilityCheck, String defaultDocumentTitle, String capturePageTitle, String confirmPageTitle, String toGetStarted, String str2, String defaultIvsError, PreviewMessages previewMessages, SubmitButtonMessages submitButtonMessages, String pleaseWait, int i, int i2, String noPassportDetected, String passportTooClose, String movePhoneRight, String movePhoneLeft, String movePhoneDown, String movePhoneUp, String movePhoneBack, String idLookingGood, String lowBrightnessError, String labelErrorMessage, String documentCameraPermission, String darkImageError) {
        Intrinsics.checkNotNullParameter(moduleId, "moduleId");
        Intrinsics.checkNotNullParameter(documentName, "documentName");
        Intrinsics.checkNotNullParameter(confirmationTitle, "confirmationTitle");
        Intrinsics.checkNotNullParameter(confirmationText, "confirmationText");
        Intrinsics.checkNotNullParameter(submitButtonText, "submitButtonText");
        Intrinsics.checkNotNullParameter(placeFlatAndHoldPassport, "placeFlatAndHoldPassport");
        Intrinsics.checkNotNullParameter(keepPassportFlat, "keepPassportFlat");
        Intrinsics.checkNotNullParameter(movePassportCloser, "movePassportCloser");
        Intrinsics.checkNotNullParameter(ensurePassportFocus, "ensurePassportFocus");
        Intrinsics.checkNotNullParameter(passportLookingGood, "passportLookingGood");
        Intrinsics.checkNotNullParameter(openPassportBook, "openPassportBook");
        Intrinsics.checkNotNullParameter(adjustLighting, "adjustLighting");
        Intrinsics.checkNotNullParameter(nativeMessages, "nativeMessages");
        Intrinsics.checkNotNullParameter(helpMessages, "helpMessages");
        Intrinsics.checkNotNullParameter(captureSuccess, "captureSuccess");
        Intrinsics.checkNotNullParameter(manualPrimary, "manualPrimary");
        Intrinsics.checkNotNullParameter(manualSecondary, "manualSecondary");
        Intrinsics.checkNotNullParameter(scanning, "scanning");
        Intrinsics.checkNotNullParameter(tryPhotoManually, "tryPhotoManually");
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
        Intrinsics.checkNotNullParameter(previewMessages, "previewMessages");
        Intrinsics.checkNotNullParameter(submitButtonMessages, "submitButtonMessages");
        Intrinsics.checkNotNullParameter(pleaseWait, "pleaseWait");
        Intrinsics.checkNotNullParameter(noPassportDetected, "noPassportDetected");
        Intrinsics.checkNotNullParameter(passportTooClose, "passportTooClose");
        Intrinsics.checkNotNullParameter(movePhoneRight, "movePhoneRight");
        Intrinsics.checkNotNullParameter(movePhoneLeft, "movePhoneLeft");
        Intrinsics.checkNotNullParameter(movePhoneDown, "movePhoneDown");
        Intrinsics.checkNotNullParameter(movePhoneUp, "movePhoneUp");
        Intrinsics.checkNotNullParameter(movePhoneBack, "movePhoneBack");
        Intrinsics.checkNotNullParameter(idLookingGood, "idLookingGood");
        Intrinsics.checkNotNullParameter(lowBrightnessError, "lowBrightnessError");
        Intrinsics.checkNotNullParameter(labelErrorMessage, "labelErrorMessage");
        Intrinsics.checkNotNullParameter(documentCameraPermission, "documentCameraPermission");
        Intrinsics.checkNotNullParameter(darkImageError, "darkImageError");
        this.moduleId = moduleId;
        this.sessionToken = str;
        this.documentName = documentName;
        this.confirmationTitle = confirmationTitle;
        this.confirmationText = confirmationText;
        this.submitButtonText = submitButtonText;
        this.placeFlatAndHoldPassport = placeFlatAndHoldPassport;
        this.keepPassportFlat = keepPassportFlat;
        this.movePassportCloser = movePassportCloser;
        this.ensurePassportFocus = ensurePassportFocus;
        this.passportLookingGood = passportLookingGood;
        this.openPassportBook = openPassportBook;
        this.adjustLighting = adjustLighting;
        this.nativeMessages = nativeMessages;
        this.helpMessages = helpMessages;
        this.captureSuccess = captureSuccess;
        this.manualPrimary = manualPrimary;
        this.manualSecondary = manualSecondary;
        this.scanning = scanning;
        this.tryPhotoManually = tryPhotoManually;
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
        this.previewMessages = previewMessages;
        this.submitButtonMessages = submitButtonMessages;
        this.pleaseWait = pleaseWait;
        this.completedModuleCount = i;
        this.totalModuleCount = i2;
        this.noPassportDetected = noPassportDetected;
        this.passportTooClose = passportTooClose;
        this.movePhoneRight = movePhoneRight;
        this.movePhoneLeft = movePhoneLeft;
        this.movePhoneDown = movePhoneDown;
        this.movePhoneUp = movePhoneUp;
        this.movePhoneBack = movePhoneBack;
        this.idLookingGood = idLookingGood;
        this.lowBrightnessError = lowBrightnessError;
        this.labelErrorMessage = labelErrorMessage;
        this.documentCameraPermission = documentCameraPermission;
        this.darkImageError = darkImageError;
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

    public final String getPlaceFlatAndHoldPassport() {
        return this.placeFlatAndHoldPassport;
    }

    public final String getKeepPassportFlat() {
        return this.keepPassportFlat;
    }

    public final String getMovePassportCloser() {
        return this.movePassportCloser;
    }

    public final String getEnsurePassportFocus() {
        return this.ensurePassportFocus;
    }

    public final String getPassportLookingGood() {
        return this.passportLookingGood;
    }

    public final String getOpenPassportBook() {
        return this.openPassportBook;
    }

    public final String getAdjustLighting() {
        return this.adjustLighting;
    }

    public final NativeMessages getNativeMessages() {
        return this.nativeMessages;
    }

    public final HelpMessages getHelpMessages() {
        return this.helpMessages;
    }

    public final String getCaptureSuccess() {
        return this.captureSuccess;
    }

    public final String getManualPrimary() {
        return this.manualPrimary;
    }

    public final String getManualSecondary() {
        return this.manualSecondary;
    }

    public final String getScanning() {
        return this.scanning;
    }

    public final String getTryPhotoManually() {
        return this.tryPhotoManually;
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

    public final PreviewMessages getPreviewMessages() {
        return this.previewMessages;
    }

    public final SubmitButtonMessages getSubmitButtonMessages() {
        return this.submitButtonMessages;
    }

    public final String getPleaseWait() {
        return this.pleaseWait;
    }

    public final int getCompletedModuleCount() {
        return this.completedModuleCount;
    }

    public final int getTotalModuleCount() {
        return this.totalModuleCount;
    }

    public final String getNoPassportDetected() {
        return this.noPassportDetected;
    }

    public final String getPassportTooClose() {
        return this.passportTooClose;
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

    public final String getIdLookingGood() {
        return this.idLookingGood;
    }

    public final String getLowBrightnessError() {
        return this.lowBrightnessError;
    }

    public final String getLabelErrorMessage() {
        return this.labelErrorMessage;
    }

    public final String getDocumentCameraPermission() {
        return this.documentCameraPermission;
    }

    public final String getDarkImageError() {
        return this.darkImageError;
    }

    /* compiled from: PassportModuleModel.kt */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J;\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aHÖ\u0003J\t\u0010\u001b\u001a\u00020\u0016HÖ\u0001J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001J\u0019\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\n¨\u0006\""}, d2 = {"Lcom/socure/docv/capturesdk/models/PassportModuleModel$NativeMessages;", "Landroid/os/Parcelable;", "title", "", "openPassport", "positionPhonePassport", "ensurePersonalInfo", "clickCapture", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getClickCapture", "()Ljava/lang/String;", "getEnsurePersonalInfo", "getOpenPassport", "getPositionPhonePassport", "getTitle", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "capturesdk_productionRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class NativeMessages implements Parcelable {
        public static final int $stable = 0;
        public static final Parcelable.Creator<NativeMessages> CREATOR = new Creator();
        private final String clickCapture;
        private final String ensurePersonalInfo;
        private final String openPassport;
        private final String positionPhonePassport;
        private final String title;

        /* compiled from: PassportModuleModel.kt */
        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<NativeMessages> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final NativeMessages createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new NativeMessages(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final NativeMessages[] newArray(int i) {
                return new NativeMessages[i];
            }
        }

        public static /* synthetic */ NativeMessages copy$default(NativeMessages nativeMessages, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
            if ((i & 1) != 0) {
                str = nativeMessages.title;
            }
            if ((i & 2) != 0) {
                str2 = nativeMessages.openPassport;
            }
            if ((i & 4) != 0) {
                str3 = nativeMessages.positionPhonePassport;
            }
            if ((i & 8) != 0) {
                str4 = nativeMessages.ensurePersonalInfo;
            }
            if ((i & 16) != 0) {
                str5 = nativeMessages.clickCapture;
            }
            String str6 = str5;
            String str7 = str3;
            return nativeMessages.copy(str, str2, str7, str4, str6);
        }

        /* renamed from: component1, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        /* renamed from: component2, reason: from getter */
        public final String getOpenPassport() {
            return this.openPassport;
        }

        /* renamed from: component3, reason: from getter */
        public final String getPositionPhonePassport() {
            return this.positionPhonePassport;
        }

        /* renamed from: component4, reason: from getter */
        public final String getEnsurePersonalInfo() {
            return this.ensurePersonalInfo;
        }

        /* renamed from: component5, reason: from getter */
        public final String getClickCapture() {
            return this.clickCapture;
        }

        public final NativeMessages copy(String title, String openPassport, String positionPhonePassport, String ensurePersonalInfo, String clickCapture) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(openPassport, "openPassport");
            Intrinsics.checkNotNullParameter(positionPhonePassport, "positionPhonePassport");
            Intrinsics.checkNotNullParameter(ensurePersonalInfo, "ensurePersonalInfo");
            Intrinsics.checkNotNullParameter(clickCapture, "clickCapture");
            return new NativeMessages(title, openPassport, positionPhonePassport, ensurePersonalInfo, clickCapture);
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
            return Intrinsics.areEqual(this.title, nativeMessages.title) && Intrinsics.areEqual(this.openPassport, nativeMessages.openPassport) && Intrinsics.areEqual(this.positionPhonePassport, nativeMessages.positionPhonePassport) && Intrinsics.areEqual(this.ensurePersonalInfo, nativeMessages.ensurePersonalInfo) && Intrinsics.areEqual(this.clickCapture, nativeMessages.clickCapture);
        }

        public int hashCode() {
            return (((((((this.title.hashCode() * 31) + this.openPassport.hashCode()) * 31) + this.positionPhonePassport.hashCode()) * 31) + this.ensurePersonalInfo.hashCode()) * 31) + this.clickCapture.hashCode();
        }

        public String toString() {
            return "NativeMessages(title=" + this.title + ", openPassport=" + this.openPassport + ", positionPhonePassport=" + this.positionPhonePassport + ", ensurePersonalInfo=" + this.ensurePersonalInfo + ", clickCapture=" + this.clickCapture + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            Intrinsics.checkNotNullParameter(parcel, "out");
            parcel.writeString(this.title);
            parcel.writeString(this.openPassport);
            parcel.writeString(this.positionPhonePassport);
            parcel.writeString(this.ensurePersonalInfo);
            parcel.writeString(this.clickCapture);
        }

        public NativeMessages(String title, String openPassport, String positionPhonePassport, String ensurePersonalInfo, String clickCapture) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(openPassport, "openPassport");
            Intrinsics.checkNotNullParameter(positionPhonePassport, "positionPhonePassport");
            Intrinsics.checkNotNullParameter(ensurePersonalInfo, "ensurePersonalInfo");
            Intrinsics.checkNotNullParameter(clickCapture, "clickCapture");
            this.title = title;
            this.openPassport = openPassport;
            this.positionPhonePassport = positionPhonePassport;
            this.ensurePersonalInfo = ensurePersonalInfo;
            this.clickCapture = clickCapture;
        }

        public final String getTitle() {
            return this.title;
        }

        public final String getOpenPassport() {
            return this.openPassport;
        }

        public final String getPositionPhonePassport() {
            return this.positionPhonePassport;
        }

        public final String getEnsurePersonalInfo() {
            return this.ensurePersonalInfo;
        }

        public final String getClickCapture() {
            return this.clickCapture;
        }
    }

    /* compiled from: PassportModuleModel.kt */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J;\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aHÖ\u0003J\t\u0010\u001b\u001a\u00020\u0016HÖ\u0001J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001J\u0019\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\n¨\u0006\""}, d2 = {"Lcom/socure/docv/capturesdk/models/PassportModuleModel$HelpMessages;", "Landroid/os/Parcelable;", "title", "", "openPassport", "holdPhoneOverPassport", "focusCameraPassport", "keepSteady", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getFocusCameraPassport", "()Ljava/lang/String;", "getHoldPhoneOverPassport", "getKeepSteady", "getOpenPassport", "getTitle", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "capturesdk_productionRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class HelpMessages implements Parcelable {
        public static final int $stable = 0;
        public static final Parcelable.Creator<HelpMessages> CREATOR = new Creator();
        private final String focusCameraPassport;
        private final String holdPhoneOverPassport;
        private final String keepSteady;
        private final String openPassport;
        private final String title;

        /* compiled from: PassportModuleModel.kt */
        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<HelpMessages> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final HelpMessages createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new HelpMessages(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final HelpMessages[] newArray(int i) {
                return new HelpMessages[i];
            }
        }

        public static /* synthetic */ HelpMessages copy$default(HelpMessages helpMessages, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
            if ((i & 1) != 0) {
                str = helpMessages.title;
            }
            if ((i & 2) != 0) {
                str2 = helpMessages.openPassport;
            }
            if ((i & 4) != 0) {
                str3 = helpMessages.holdPhoneOverPassport;
            }
            if ((i & 8) != 0) {
                str4 = helpMessages.focusCameraPassport;
            }
            if ((i & 16) != 0) {
                str5 = helpMessages.keepSteady;
            }
            String str6 = str5;
            String str7 = str3;
            return helpMessages.copy(str, str2, str7, str4, str6);
        }

        /* renamed from: component1, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        /* renamed from: component2, reason: from getter */
        public final String getOpenPassport() {
            return this.openPassport;
        }

        /* renamed from: component3, reason: from getter */
        public final String getHoldPhoneOverPassport() {
            return this.holdPhoneOverPassport;
        }

        /* renamed from: component4, reason: from getter */
        public final String getFocusCameraPassport() {
            return this.focusCameraPassport;
        }

        /* renamed from: component5, reason: from getter */
        public final String getKeepSteady() {
            return this.keepSteady;
        }

        public final HelpMessages copy(String title, String openPassport, String holdPhoneOverPassport, String focusCameraPassport, String keepSteady) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(openPassport, "openPassport");
            Intrinsics.checkNotNullParameter(holdPhoneOverPassport, "holdPhoneOverPassport");
            Intrinsics.checkNotNullParameter(focusCameraPassport, "focusCameraPassport");
            Intrinsics.checkNotNullParameter(keepSteady, "keepSteady");
            return new HelpMessages(title, openPassport, holdPhoneOverPassport, focusCameraPassport, keepSteady);
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
            return Intrinsics.areEqual(this.title, helpMessages.title) && Intrinsics.areEqual(this.openPassport, helpMessages.openPassport) && Intrinsics.areEqual(this.holdPhoneOverPassport, helpMessages.holdPhoneOverPassport) && Intrinsics.areEqual(this.focusCameraPassport, helpMessages.focusCameraPassport) && Intrinsics.areEqual(this.keepSteady, helpMessages.keepSteady);
        }

        public int hashCode() {
            return (((((((this.title.hashCode() * 31) + this.openPassport.hashCode()) * 31) + this.holdPhoneOverPassport.hashCode()) * 31) + this.focusCameraPassport.hashCode()) * 31) + this.keepSteady.hashCode();
        }

        public String toString() {
            return "HelpMessages(title=" + this.title + ", openPassport=" + this.openPassport + ", holdPhoneOverPassport=" + this.holdPhoneOverPassport + ", focusCameraPassport=" + this.focusCameraPassport + ", keepSteady=" + this.keepSteady + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            Intrinsics.checkNotNullParameter(parcel, "out");
            parcel.writeString(this.title);
            parcel.writeString(this.openPassport);
            parcel.writeString(this.holdPhoneOverPassport);
            parcel.writeString(this.focusCameraPassport);
            parcel.writeString(this.keepSteady);
        }

        public HelpMessages(String title, String openPassport, String holdPhoneOverPassport, String focusCameraPassport, String keepSteady) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(openPassport, "openPassport");
            Intrinsics.checkNotNullParameter(holdPhoneOverPassport, "holdPhoneOverPassport");
            Intrinsics.checkNotNullParameter(focusCameraPassport, "focusCameraPassport");
            Intrinsics.checkNotNullParameter(keepSteady, "keepSteady");
            this.title = title;
            this.openPassport = openPassport;
            this.holdPhoneOverPassport = holdPhoneOverPassport;
            this.focusCameraPassport = focusCameraPassport;
            this.keepSteady = keepSteady;
        }

        public final String getTitle() {
            return this.title;
        }

        public final String getOpenPassport() {
            return this.openPassport;
        }

        public final String getHoldPhoneOverPassport() {
            return this.holdPhoneOverPassport;
        }

        public final String getFocusCameraPassport() {
            return this.focusCameraPassport;
        }

        public final String getKeepSteady() {
            return this.keepSteady;
        }
    }

    /* compiled from: PassportModuleModel.kt */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J1\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001J\u0019\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u001f"}, d2 = {"Lcom/socure/docv/capturesdk/models/PassportModuleModel$PreviewMessages;", "Landroid/os/Parcelable;", "submitImageForValidation", "", "validatingImage", "invalidImage", "imageValidated", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getImageValidated", "()Ljava/lang/String;", "getInvalidImage", "getSubmitImageForValidation", "getValidatingImage", "component1", "component2", "component3", "component4", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "capturesdk_productionRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class PreviewMessages implements Parcelable {
        public static final int $stable = 0;
        public static final Parcelable.Creator<PreviewMessages> CREATOR = new Creator();
        private final String imageValidated;
        private final String invalidImage;
        private final String submitImageForValidation;
        private final String validatingImage;

        /* compiled from: PassportModuleModel.kt */
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

    /* compiled from: PassportModuleModel.kt */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J1\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001J\u0019\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u001f"}, d2 = {"Lcom/socure/docv/capturesdk/models/PassportModuleModel$SubmitButtonMessages;", "Landroid/os/Parcelable;", "submit", "", "retake", "processing", "success", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getProcessing", "()Ljava/lang/String;", "getRetake", "getSubmit", "getSuccess", "component1", "component2", "component3", "component4", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "capturesdk_productionRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class SubmitButtonMessages implements Parcelable {
        public static final int $stable = 0;
        public static final Parcelable.Creator<SubmitButtonMessages> CREATOR = new Creator();
        private final String processing;
        private final String retake;
        private final String submit;
        private final String success;

        /* compiled from: PassportModuleModel.kt */
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
