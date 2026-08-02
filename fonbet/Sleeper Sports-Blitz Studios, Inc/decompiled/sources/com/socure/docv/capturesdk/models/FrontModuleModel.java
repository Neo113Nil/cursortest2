package com.socure.docv.capturesdk.models;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.common.C;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FrontModuleModel.kt */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\bx\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\b±\u0001²\u0001³\u0001´\u0001B\u0091\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\u0005\u0012\u0006\u0010\r\u001a\u00020\u0005\u0012\u0006\u0010\u000e\u001a\u00020\u0005\u0012\u0006\u0010\u000f\u001a\u00020\u0005\u0012\u0006\u0010\u0010\u001a\u00020\u0005\u0012\u0006\u0010\u0011\u001a\u00020\u0005\u0012\u0006\u0010\u0012\u001a\u00020\u0005\u0012\u0006\u0010\u0013\u001a\u00020\u0014\u0012\u0006\u0010\u0015\u001a\u00020\u0016\u0012\u0006\u0010\u0017\u001a\u00020\u0005\u0012\u0006\u0010\u0018\u001a\u00020\u0005\u0012\u0006\u0010\u0019\u001a\u00020\u0005\u0012\u0006\u0010\u001a\u001a\u00020\u0005\u0012\u0006\u0010\u001b\u001a\u00020\u0005\u0012\u0006\u0010\u001c\u001a\u00020\u0005\u0012\u0006\u0010\u001d\u001a\u00020\u0005\u0012\u0006\u0010\u001e\u001a\u00020\u0005\u0012\u0006\u0010\u001f\u001a\u00020\u0005\u0012\u0006\u0010 \u001a\u00020\u0005\u0012\u0006\u0010!\u001a\u00020\u0005\u0012\u0006\u0010\"\u001a\u00020\u0005\u0012\u0006\u0010#\u001a\u00020\u0005\u0012\u0006\u0010$\u001a\u00020\u0005\u0012\u0006\u0010%\u001a\u00020\u0005\u0012\u0006\u0010&\u001a\u00020\u0005\u0012\b\u0010'\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010(\u001a\u00020\u0005\u0012\u0006\u0010)\u001a\u00020*\u0012\u0006\u0010+\u001a\u00020,\u0012\u0006\u0010-\u001a\u00020.\u0012\u0006\u0010/\u001a\u00020.\u0012\u0006\u00100\u001a\u00020\u0005\u0012\u0006\u00101\u001a\u00020\u0005\u0012\u0006\u00102\u001a\u00020\u0005\u0012\u0006\u00103\u001a\u00020\u0005\u0012\u0006\u00104\u001a\u00020\u0005\u0012\u0006\u00105\u001a\u00020\u0005\u0012\u0006\u00106\u001a\u00020\u0005\u0012\u0006\u00107\u001a\u00020\u0005\u0012\u0006\u00108\u001a\u00020\u0005\u0012\u0006\u00109\u001a\u00020\u0005\u0012\u0006\u0010:\u001a\u00020\u0005¢\u0006\u0002\u0010;J\t\u0010s\u001a\u00020\u0005HÆ\u0003J\t\u0010t\u001a\u00020\u0005HÆ\u0003J\t\u0010u\u001a\u00020\u0005HÆ\u0003J\t\u0010v\u001a\u00020\u0005HÆ\u0003J\t\u0010w\u001a\u00020\u0005HÆ\u0003J\t\u0010x\u001a\u00020\u0005HÆ\u0003J\t\u0010y\u001a\u00020\u0014HÆ\u0003J\t\u0010z\u001a\u00020\u0016HÆ\u0003J\t\u0010{\u001a\u00020\u0005HÆ\u0003J\t\u0010|\u001a\u00020\u0005HÆ\u0003J\t\u0010}\u001a\u00020\u0005HÆ\u0003J\u000b\u0010~\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u007f\u001a\u00020\u0005HÆ\u0003J\n\u0010\u0080\u0001\u001a\u00020\u0005HÆ\u0003J\n\u0010\u0081\u0001\u001a\u00020\u0005HÆ\u0003J\n\u0010\u0082\u0001\u001a\u00020\u0005HÆ\u0003J\n\u0010\u0083\u0001\u001a\u00020\u0005HÆ\u0003J\n\u0010\u0084\u0001\u001a\u00020\u0005HÆ\u0003J\n\u0010\u0085\u0001\u001a\u00020\u0005HÆ\u0003J\n\u0010\u0086\u0001\u001a\u00020\u0005HÆ\u0003J\n\u0010\u0087\u0001\u001a\u00020\u0005HÆ\u0003J\n\u0010\u0088\u0001\u001a\u00020\u0005HÆ\u0003J\n\u0010\u0089\u0001\u001a\u00020\u0005HÆ\u0003J\n\u0010\u008a\u0001\u001a\u00020\u0005HÆ\u0003J\n\u0010\u008b\u0001\u001a\u00020\u0005HÆ\u0003J\n\u0010\u008c\u0001\u001a\u00020\u0005HÆ\u0003J\f\u0010\u008d\u0001\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\n\u0010\u008e\u0001\u001a\u00020\u0005HÆ\u0003J\n\u0010\u008f\u0001\u001a\u00020*HÆ\u0003J\n\u0010\u0090\u0001\u001a\u00020,HÆ\u0003J\n\u0010\u0091\u0001\u001a\u00020.HÆ\u0003J\n\u0010\u0092\u0001\u001a\u00020.HÆ\u0003J\n\u0010\u0093\u0001\u001a\u00020\u0005HÆ\u0003J\n\u0010\u0094\u0001\u001a\u00020\u0005HÆ\u0003J\n\u0010\u0095\u0001\u001a\u00020\u0005HÆ\u0003J\n\u0010\u0096\u0001\u001a\u00020\u0005HÆ\u0003J\n\u0010\u0097\u0001\u001a\u00020\u0005HÆ\u0003J\n\u0010\u0098\u0001\u001a\u00020\u0005HÆ\u0003J\n\u0010\u0099\u0001\u001a\u00020\u0005HÆ\u0003J\n\u0010\u009a\u0001\u001a\u00020\u0005HÆ\u0003J\n\u0010\u009b\u0001\u001a\u00020\u0005HÆ\u0003J\n\u0010\u009c\u0001\u001a\u00020\u0005HÆ\u0003J\n\u0010\u009d\u0001\u001a\u00020\u0005HÆ\u0003J\n\u0010\u009e\u0001\u001a\u00020\u0005HÆ\u0003J\n\u0010\u009f\u0001\u001a\u00020\u0005HÆ\u0003J\n\u0010 \u0001\u001a\u00020\u0005HÆ\u0003J\n\u0010¡\u0001\u001a\u00020\u0005HÆ\u0003J\n\u0010¢\u0001\u001a\u00020\u0005HÆ\u0003J\n\u0010£\u0001\u001a\u00020\u0005HÆ\u0003Jø\u0003\u0010¤\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u00052\b\b\u0002\u0010\f\u001a\u00020\u00052\b\b\u0002\u0010\r\u001a\u00020\u00052\b\b\u0002\u0010\u000e\u001a\u00020\u00052\b\b\u0002\u0010\u000f\u001a\u00020\u00052\b\b\u0002\u0010\u0010\u001a\u00020\u00052\b\b\u0002\u0010\u0011\u001a\u00020\u00052\b\b\u0002\u0010\u0012\u001a\u00020\u00052\b\b\u0002\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u00162\b\b\u0002\u0010\u0017\u001a\u00020\u00052\b\b\u0002\u0010\u0018\u001a\u00020\u00052\b\b\u0002\u0010\u0019\u001a\u00020\u00052\b\b\u0002\u0010\u001a\u001a\u00020\u00052\b\b\u0002\u0010\u001b\u001a\u00020\u00052\b\b\u0002\u0010\u001c\u001a\u00020\u00052\b\b\u0002\u0010\u001d\u001a\u00020\u00052\b\b\u0002\u0010\u001e\u001a\u00020\u00052\b\b\u0002\u0010\u001f\u001a\u00020\u00052\b\b\u0002\u0010 \u001a\u00020\u00052\b\b\u0002\u0010!\u001a\u00020\u00052\b\b\u0002\u0010\"\u001a\u00020\u00052\b\b\u0002\u0010#\u001a\u00020\u00052\b\b\u0002\u0010$\u001a\u00020\u00052\b\b\u0002\u0010%\u001a\u00020\u00052\b\b\u0002\u0010&\u001a\u00020\u00052\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010(\u001a\u00020\u00052\b\b\u0002\u0010)\u001a\u00020*2\b\b\u0002\u0010+\u001a\u00020,2\b\b\u0002\u0010-\u001a\u00020.2\b\b\u0002\u0010/\u001a\u00020.2\b\b\u0002\u00100\u001a\u00020\u00052\b\b\u0002\u00101\u001a\u00020\u00052\b\b\u0002\u00102\u001a\u00020\u00052\b\b\u0002\u00103\u001a\u00020\u00052\b\b\u0002\u00104\u001a\u00020\u00052\b\b\u0002\u00105\u001a\u00020\u00052\b\b\u0002\u00106\u001a\u00020\u00052\b\b\u0002\u00107\u001a\u00020\u00052\b\b\u0002\u00108\u001a\u00020\u00052\b\b\u0002\u00109\u001a\u00020\u00052\b\b\u0002\u0010:\u001a\u00020\u0005HÆ\u0001J\n\u0010¥\u0001\u001a\u00020.HÖ\u0001J\u0017\u0010¦\u0001\u001a\u00030§\u00012\n\u0010¨\u0001\u001a\u0005\u0018\u00010©\u0001HÖ\u0003J\n\u0010ª\u0001\u001a\u00020.HÖ\u0001J\n\u0010«\u0001\u001a\u00020\u0005HÖ\u0001J\u001e\u0010¬\u0001\u001a\u00030\u00ad\u00012\b\u0010®\u0001\u001a\u00030¯\u00012\u0007\u0010°\u0001\u001a\u00020.HÖ\u0001R\u0011\u0010\u000e\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b<\u0010=R\u0011\u0010!\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b>\u0010=R\u0011\u0010\u001d\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b?\u0010=R\u0011\u0010\u001c\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b@\u0010=R\u0011\u0010\"\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\bA\u0010=R\u0011\u0010\u001f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\bB\u0010=R\u0011\u0010$\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\bC\u0010=R\u0011\u0010\u0017\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\bD\u0010=R\u0011\u00100\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\bE\u0010=R\u0011\u0010-\u001a\u00020.¢\u0006\b\n\u0000\u001a\u0004\bF\u0010GR\u0011\u0010 \u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\bH\u0010=R\u0011\u0010%\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\bI\u0010=R\u0011\u0010\t\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\bJ\u0010=R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\bK\u0010=R\u0011\u0010#\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\bL\u0010=R\u0011\u0010(\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\bM\u0010=R\u0011\u0010:\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\bN\u0010=R\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\bO\u0010=R\u0011\u0010\u0011\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\bP\u0010=R\u0011\u0010\u0015\u001a\u00020\u0016¢\u0006\b\n\u0000\u001a\u0004\bQ\u0010RR\u0011\u0010\f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\bS\u0010=R\u0011\u00101\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\bT\u0010=R\u0011\u0010\u000f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\bU\u0010=R\u0011\u00109\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\bV\u0010=R\u0011\u00107\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\bW\u0010=R\u0011\u0010\u001a\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\bX\u0010=R\u0011\u0010\u001b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\bY\u0010=R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bZ\u0010=R\u0011\u0010\u0012\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b[\u0010=R\u0011\u0010\r\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\\\u0010=R\u0011\u00106\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b]\u0010=R\u0011\u00104\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b^\u0010=R\u0011\u00103\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b_\u0010=R\u0011\u00102\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b`\u0010=R\u0011\u00105\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\ba\u0010=R\u0011\u0010\u0013\u001a\u00020\u0014¢\u0006\b\n\u0000\u001a\u0004\bb\u0010cR\u0011\u0010\u000b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\bd\u0010=R\u0011\u00108\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\be\u0010=R\u0011\u0010\u0010\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\bf\u0010=R\u0011\u0010)\u001a\u00020*¢\u0006\b\n\u0000\u001a\u0004\bg\u0010hR\u0011\u0010\u0018\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\bi\u0010=R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bj\u0010=R\u0011\u0010\u001e\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\bk\u0010=R\u0016\u0010'\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bl\u0010=R\u0011\u0010+\u001a\u00020,¢\u0006\b\n\u0000\u001a\u0004\bm\u0010nR\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\bo\u0010=R\u0011\u0010&\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\bp\u0010=R\u0011\u0010/\u001a\u00020.¢\u0006\b\n\u0000\u001a\u0004\bq\u0010GR\u0011\u0010\u0019\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\br\u0010=¨\u0006µ\u0001"}, d2 = {"Lcom/socure/docv/capturesdk/models/FrontModuleModel;", "Lcom/socure/docv/capturesdk/models/ModuleModel;", "Lcom/socure/docv/capturesdk/models/ScannerModel;", "Landroid/os/Parcelable;", "moduleId", "", "sessionToken", "documentName", "confirmationTitle", "confirmationText", "submitButtonText", "placeFlatAndHoldId", "idLookingGood", "moveIdCloser", "adjustLighting", "keepIdFlat", "positionFront", "ensureIdFocus", "moveAreaError", "nativeMessages", "Lcom/socure/docv/capturesdk/models/FrontModuleModel$NativeMessages;", "helpMessages", "Lcom/socure/docv/capturesdk/models/FrontModuleModel$HelpMessages;", "captureSuccess", "scanning", "tryPhotoManually", "manualPrimary", "manualSecondary", "cameraLoading", "cameraIssue", "startMode", "captureMode", "confirmMode", "backToScanning", "captureCompatibilityCheck", "defaultDocumentTitle", "capturePageTitle", "confirmPageTitle", "toGetStarted", "submissionErrorMessage", "defaultIvsError", "previewMessages", "Lcom/socure/docv/capturesdk/models/FrontModuleModel$PreviewMessages;", "submitButtonMessages", "Lcom/socure/docv/capturesdk/models/FrontModuleModel$SubmitButtonMessages;", "completedModuleCount", "", "totalModuleCount", "cardNotFound", "idTooClose", "movePhoneRight", "movePhoneLeft", "movePhoneDown", "movePhoneUp", "movePhoneBack", "lowBrightnessError", "pleaseWait", "labelErrorMessage", "documentCameraPermission", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/socure/docv/capturesdk/models/FrontModuleModel$NativeMessages;Lcom/socure/docv/capturesdk/models/FrontModuleModel$HelpMessages;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/socure/docv/capturesdk/models/FrontModuleModel$PreviewMessages;Lcom/socure/docv/capturesdk/models/FrontModuleModel$SubmitButtonMessages;IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAdjustLighting", "()Ljava/lang/String;", "getBackToScanning", "getCameraIssue", "getCameraLoading", "getCaptureCompatibilityCheck", "getCaptureMode", "getCapturePageTitle", "getCaptureSuccess", "getCardNotFound", "getCompletedModuleCount", "()I", "getConfirmMode", "getConfirmPageTitle", "getConfirmationText", "getConfirmationTitle", "getDefaultDocumentTitle", "getDefaultIvsError", "getDocumentCameraPermission", "getDocumentName", "getEnsureIdFocus", "getHelpMessages", "()Lcom/socure/docv/capturesdk/models/FrontModuleModel$HelpMessages;", "getIdLookingGood", "getIdTooClose", "getKeepIdFlat", "getLabelErrorMessage", "getLowBrightnessError", "getManualPrimary", "getManualSecondary", "getModuleId", "getMoveAreaError", "getMoveIdCloser", "getMovePhoneBack", "getMovePhoneDown", "getMovePhoneLeft", "getMovePhoneRight", "getMovePhoneUp", "getNativeMessages", "()Lcom/socure/docv/capturesdk/models/FrontModuleModel$NativeMessages;", "getPlaceFlatAndHoldId", "getPleaseWait", "getPositionFront", "getPreviewMessages", "()Lcom/socure/docv/capturesdk/models/FrontModuleModel$PreviewMessages;", "getScanning", "getSessionToken", "getStartMode", "getSubmissionErrorMessage", "getSubmitButtonMessages", "()Lcom/socure/docv/capturesdk/models/FrontModuleModel$SubmitButtonMessages;", "getSubmitButtonText", "getToGetStarted", "getTotalModuleCount", "getTryPhotoManually", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component3", "component30", "component31", "component32", "component33", "component34", "component35", "component36", "component37", "component38", "component39", "component4", "component40", "component41", "component42", "component43", "component44", "component45", "component46", "component47", "component48", "component49", "component5", "component6", "component7", "component8", "component9", "copy", "describeContents", "equals", "", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "HelpMessages", "NativeMessages", "PreviewMessages", "SubmitButtonMessages", "capturesdk_productionRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class FrontModuleModel implements ModuleModel, ScannerModel, Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<FrontModuleModel> CREATOR = new Creator();
    private final String adjustLighting;
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
    private final String ensureIdFocus;
    private final HelpMessages helpMessages;
    private final String idLookingGood;
    private final String idTooClose;
    private final String keepIdFlat;
    private final String labelErrorMessage;
    private final String lowBrightnessError;
    private final String manualPrimary;
    private final String manualSecondary;
    private final String moduleId;
    private final String moveAreaError;
    private final String moveIdCloser;
    private final String movePhoneBack;
    private final String movePhoneDown;
    private final String movePhoneLeft;
    private final String movePhoneRight;
    private final String movePhoneUp;
    private final NativeMessages nativeMessages;
    private final String placeFlatAndHoldId;
    private final String pleaseWait;
    private final String positionFront;
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

    /* compiled from: FrontModuleModel.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<FrontModuleModel> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final FrontModuleModel createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new FrontModuleModel(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), NativeMessages.CREATOR.createFromParcel(parcel), HelpMessages.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), PreviewMessages.CREATOR.createFromParcel(parcel), SubmitButtonMessages.CREATOR.createFromParcel(parcel), parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final FrontModuleModel[] newArray(int i) {
            return new FrontModuleModel[i];
        }
    }

    public static /* synthetic */ FrontModuleModel copy$default(FrontModuleModel frontModuleModel, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, NativeMessages nativeMessages, HelpMessages helpMessages, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25, String str26, String str27, String str28, String str29, String str30, String str31, String str32, PreviewMessages previewMessages, SubmitButtonMessages submitButtonMessages, int i, int i2, String str33, String str34, String str35, String str36, String str37, String str38, String str39, String str40, String str41, String str42, String str43, int i3, int i4, Object obj) {
        String moduleId = (i3 & 1) != 0 ? frontModuleModel.getModuleId() : str;
        String sessionToken = (i3 & 2) != 0 ? frontModuleModel.getSessionToken() : str2;
        String str44 = (i3 & 4) != 0 ? frontModuleModel.documentName : str3;
        String str45 = (i3 & 8) != 0 ? frontModuleModel.confirmationTitle : str4;
        String str46 = (i3 & 16) != 0 ? frontModuleModel.confirmationText : str5;
        String str47 = (i3 & 32) != 0 ? frontModuleModel.submitButtonText : str6;
        String str48 = (i3 & 64) != 0 ? frontModuleModel.placeFlatAndHoldId : str7;
        String str49 = (i3 & 128) != 0 ? frontModuleModel.idLookingGood : str8;
        String str50 = (i3 & 256) != 0 ? frontModuleModel.moveIdCloser : str9;
        String str51 = (i3 & 512) != 0 ? frontModuleModel.adjustLighting : str10;
        String str52 = (i3 & 1024) != 0 ? frontModuleModel.keepIdFlat : str11;
        String str53 = (i3 & 2048) != 0 ? frontModuleModel.positionFront : str12;
        String str54 = (i3 & 4096) != 0 ? frontModuleModel.ensureIdFocus : str13;
        String str55 = moduleId;
        String str56 = (i3 & 8192) != 0 ? frontModuleModel.moveAreaError : str14;
        NativeMessages nativeMessages2 = (i3 & 16384) != 0 ? frontModuleModel.nativeMessages : nativeMessages;
        HelpMessages helpMessages2 = (i3 & 32768) != 0 ? frontModuleModel.helpMessages : helpMessages;
        String str57 = (i3 & 65536) != 0 ? frontModuleModel.captureSuccess : str15;
        String str58 = (i3 & 131072) != 0 ? frontModuleModel.scanning : str16;
        String str59 = (i3 & 262144) != 0 ? frontModuleModel.tryPhotoManually : str17;
        String str60 = (i3 & 524288) != 0 ? frontModuleModel.manualPrimary : str18;
        String str61 = (i3 & 1048576) != 0 ? frontModuleModel.manualSecondary : str19;
        String str62 = (i3 & 2097152) != 0 ? frontModuleModel.cameraLoading : str20;
        String str63 = (i3 & 4194304) != 0 ? frontModuleModel.cameraIssue : str21;
        String str64 = (i3 & 8388608) != 0 ? frontModuleModel.startMode : str22;
        String str65 = (i3 & 16777216) != 0 ? frontModuleModel.captureMode : str23;
        String str66 = (i3 & 33554432) != 0 ? frontModuleModel.confirmMode : str24;
        String str67 = (i3 & 67108864) != 0 ? frontModuleModel.backToScanning : str25;
        String str68 = (i3 & C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? frontModuleModel.captureCompatibilityCheck : str26;
        String str69 = (i3 & 268435456) != 0 ? frontModuleModel.defaultDocumentTitle : str27;
        String str70 = (i3 & C.BUFFER_FLAG_LAST_SAMPLE) != 0 ? frontModuleModel.capturePageTitle : str28;
        String str71 = (i3 & 1073741824) != 0 ? frontModuleModel.confirmPageTitle : str29;
        String str72 = (i3 & Integer.MIN_VALUE) != 0 ? frontModuleModel.toGetStarted : str30;
        return frontModuleModel.copy(str55, sessionToken, str44, str45, str46, str47, str48, str49, str50, str51, str52, str53, str54, str56, nativeMessages2, helpMessages2, str57, str58, str59, str60, str61, str62, str63, str64, str65, str66, str67, str68, str69, str70, str71, str72, (i4 & 1) != 0 ? frontModuleModel.getSubmissionErrorMessage() : str31, (i4 & 2) != 0 ? frontModuleModel.defaultIvsError : str32, (i4 & 4) != 0 ? frontModuleModel.previewMessages : previewMessages, (i4 & 8) != 0 ? frontModuleModel.submitButtonMessages : submitButtonMessages, (i4 & 16) != 0 ? frontModuleModel.completedModuleCount : i, (i4 & 32) != 0 ? frontModuleModel.totalModuleCount : i2, (i4 & 64) != 0 ? frontModuleModel.cardNotFound : str33, (i4 & 128) != 0 ? frontModuleModel.idTooClose : str34, (i4 & 256) != 0 ? frontModuleModel.movePhoneRight : str35, (i4 & 512) != 0 ? frontModuleModel.movePhoneLeft : str36, (i4 & 1024) != 0 ? frontModuleModel.movePhoneDown : str37, (i4 & 2048) != 0 ? frontModuleModel.movePhoneUp : str38, (i4 & 4096) != 0 ? frontModuleModel.movePhoneBack : str39, (i4 & 8192) != 0 ? frontModuleModel.lowBrightnessError : str40, (i4 & 16384) != 0 ? frontModuleModel.pleaseWait : str41, (i4 & 32768) != 0 ? frontModuleModel.labelErrorMessage : str42, (i4 & 65536) != 0 ? frontModuleModel.documentCameraPermission : str43);
    }

    public final String component1() {
        return getModuleId();
    }

    /* renamed from: component10, reason: from getter */
    public final String getAdjustLighting() {
        return this.adjustLighting;
    }

    /* renamed from: component11, reason: from getter */
    public final String getKeepIdFlat() {
        return this.keepIdFlat;
    }

    /* renamed from: component12, reason: from getter */
    public final String getPositionFront() {
        return this.positionFront;
    }

    /* renamed from: component13, reason: from getter */
    public final String getEnsureIdFocus() {
        return this.ensureIdFocus;
    }

    /* renamed from: component14, reason: from getter */
    public final String getMoveAreaError() {
        return this.moveAreaError;
    }

    /* renamed from: component15, reason: from getter */
    public final NativeMessages getNativeMessages() {
        return this.nativeMessages;
    }

    /* renamed from: component16, reason: from getter */
    public final HelpMessages getHelpMessages() {
        return this.helpMessages;
    }

    /* renamed from: component17, reason: from getter */
    public final String getCaptureSuccess() {
        return this.captureSuccess;
    }

    /* renamed from: component18, reason: from getter */
    public final String getScanning() {
        return this.scanning;
    }

    /* renamed from: component19, reason: from getter */
    public final String getTryPhotoManually() {
        return this.tryPhotoManually;
    }

    public final String component2() {
        return getSessionToken();
    }

    /* renamed from: component20, reason: from getter */
    public final String getManualPrimary() {
        return this.manualPrimary;
    }

    /* renamed from: component21, reason: from getter */
    public final String getManualSecondary() {
        return this.manualSecondary;
    }

    /* renamed from: component22, reason: from getter */
    public final String getCameraLoading() {
        return this.cameraLoading;
    }

    /* renamed from: component23, reason: from getter */
    public final String getCameraIssue() {
        return this.cameraIssue;
    }

    /* renamed from: component24, reason: from getter */
    public final String getStartMode() {
        return this.startMode;
    }

    /* renamed from: component25, reason: from getter */
    public final String getCaptureMode() {
        return this.captureMode;
    }

    /* renamed from: component26, reason: from getter */
    public final String getConfirmMode() {
        return this.confirmMode;
    }

    /* renamed from: component27, reason: from getter */
    public final String getBackToScanning() {
        return this.backToScanning;
    }

    /* renamed from: component28, reason: from getter */
    public final String getCaptureCompatibilityCheck() {
        return this.captureCompatibilityCheck;
    }

    /* renamed from: component29, reason: from getter */
    public final String getDefaultDocumentTitle() {
        return this.defaultDocumentTitle;
    }

    /* renamed from: component3, reason: from getter */
    public final String getDocumentName() {
        return this.documentName;
    }

    /* renamed from: component30, reason: from getter */
    public final String getCapturePageTitle() {
        return this.capturePageTitle;
    }

    /* renamed from: component31, reason: from getter */
    public final String getConfirmPageTitle() {
        return this.confirmPageTitle;
    }

    /* renamed from: component32, reason: from getter */
    public final String getToGetStarted() {
        return this.toGetStarted;
    }

    public final String component33() {
        return getSubmissionErrorMessage();
    }

    /* renamed from: component34, reason: from getter */
    public final String getDefaultIvsError() {
        return this.defaultIvsError;
    }

    /* renamed from: component35, reason: from getter */
    public final PreviewMessages getPreviewMessages() {
        return this.previewMessages;
    }

    /* renamed from: component36, reason: from getter */
    public final SubmitButtonMessages getSubmitButtonMessages() {
        return this.submitButtonMessages;
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
    public final String getCardNotFound() {
        return this.cardNotFound;
    }

    /* renamed from: component4, reason: from getter */
    public final String getConfirmationTitle() {
        return this.confirmationTitle;
    }

    /* renamed from: component40, reason: from getter */
    public final String getIdTooClose() {
        return this.idTooClose;
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
    public final String getLowBrightnessError() {
        return this.lowBrightnessError;
    }

    /* renamed from: component47, reason: from getter */
    public final String getPleaseWait() {
        return this.pleaseWait;
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

    /* renamed from: component6, reason: from getter */
    public final String getSubmitButtonText() {
        return this.submitButtonText;
    }

    /* renamed from: component7, reason: from getter */
    public final String getPlaceFlatAndHoldId() {
        return this.placeFlatAndHoldId;
    }

    /* renamed from: component8, reason: from getter */
    public final String getIdLookingGood() {
        return this.idLookingGood;
    }

    /* renamed from: component9, reason: from getter */
    public final String getMoveIdCloser() {
        return this.moveIdCloser;
    }

    public final FrontModuleModel copy(String moduleId, String sessionToken, String documentName, String confirmationTitle, String confirmationText, String submitButtonText, String placeFlatAndHoldId, String idLookingGood, String moveIdCloser, String adjustLighting, String keepIdFlat, String positionFront, String ensureIdFocus, String moveAreaError, NativeMessages nativeMessages, HelpMessages helpMessages, String captureSuccess, String scanning, String tryPhotoManually, String manualPrimary, String manualSecondary, String cameraLoading, String cameraIssue, String startMode, String captureMode, String confirmMode, String backToScanning, String captureCompatibilityCheck, String defaultDocumentTitle, String capturePageTitle, String confirmPageTitle, String toGetStarted, String submissionErrorMessage, String defaultIvsError, PreviewMessages previewMessages, SubmitButtonMessages submitButtonMessages, int completedModuleCount, int totalModuleCount, String cardNotFound, String idTooClose, String movePhoneRight, String movePhoneLeft, String movePhoneDown, String movePhoneUp, String movePhoneBack, String lowBrightnessError, String pleaseWait, String labelErrorMessage, String documentCameraPermission) {
        Intrinsics.checkNotNullParameter(moduleId, "moduleId");
        Intrinsics.checkNotNullParameter(documentName, "documentName");
        Intrinsics.checkNotNullParameter(confirmationTitle, "confirmationTitle");
        Intrinsics.checkNotNullParameter(confirmationText, "confirmationText");
        Intrinsics.checkNotNullParameter(submitButtonText, "submitButtonText");
        Intrinsics.checkNotNullParameter(placeFlatAndHoldId, "placeFlatAndHoldId");
        Intrinsics.checkNotNullParameter(idLookingGood, "idLookingGood");
        Intrinsics.checkNotNullParameter(moveIdCloser, "moveIdCloser");
        Intrinsics.checkNotNullParameter(adjustLighting, "adjustLighting");
        Intrinsics.checkNotNullParameter(keepIdFlat, "keepIdFlat");
        Intrinsics.checkNotNullParameter(positionFront, "positionFront");
        Intrinsics.checkNotNullParameter(ensureIdFocus, "ensureIdFocus");
        Intrinsics.checkNotNullParameter(moveAreaError, "moveAreaError");
        Intrinsics.checkNotNullParameter(nativeMessages, "nativeMessages");
        Intrinsics.checkNotNullParameter(helpMessages, "helpMessages");
        Intrinsics.checkNotNullParameter(captureSuccess, "captureSuccess");
        Intrinsics.checkNotNullParameter(scanning, "scanning");
        Intrinsics.checkNotNullParameter(tryPhotoManually, "tryPhotoManually");
        Intrinsics.checkNotNullParameter(manualPrimary, "manualPrimary");
        Intrinsics.checkNotNullParameter(manualSecondary, "manualSecondary");
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
        Intrinsics.checkNotNullParameter(cardNotFound, "cardNotFound");
        Intrinsics.checkNotNullParameter(idTooClose, "idTooClose");
        Intrinsics.checkNotNullParameter(movePhoneRight, "movePhoneRight");
        Intrinsics.checkNotNullParameter(movePhoneLeft, "movePhoneLeft");
        Intrinsics.checkNotNullParameter(movePhoneDown, "movePhoneDown");
        Intrinsics.checkNotNullParameter(movePhoneUp, "movePhoneUp");
        Intrinsics.checkNotNullParameter(movePhoneBack, "movePhoneBack");
        Intrinsics.checkNotNullParameter(lowBrightnessError, "lowBrightnessError");
        Intrinsics.checkNotNullParameter(pleaseWait, "pleaseWait");
        Intrinsics.checkNotNullParameter(labelErrorMessage, "labelErrorMessage");
        Intrinsics.checkNotNullParameter(documentCameraPermission, "documentCameraPermission");
        return new FrontModuleModel(moduleId, sessionToken, documentName, confirmationTitle, confirmationText, submitButtonText, placeFlatAndHoldId, idLookingGood, moveIdCloser, adjustLighting, keepIdFlat, positionFront, ensureIdFocus, moveAreaError, nativeMessages, helpMessages, captureSuccess, scanning, tryPhotoManually, manualPrimary, manualSecondary, cameraLoading, cameraIssue, startMode, captureMode, confirmMode, backToScanning, captureCompatibilityCheck, defaultDocumentTitle, capturePageTitle, confirmPageTitle, toGetStarted, submissionErrorMessage, defaultIvsError, previewMessages, submitButtonMessages, completedModuleCount, totalModuleCount, cardNotFound, idTooClose, movePhoneRight, movePhoneLeft, movePhoneDown, movePhoneUp, movePhoneBack, lowBrightnessError, pleaseWait, labelErrorMessage, documentCameraPermission);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FrontModuleModel)) {
            return false;
        }
        FrontModuleModel frontModuleModel = (FrontModuleModel) other;
        return Intrinsics.areEqual(getModuleId(), frontModuleModel.getModuleId()) && Intrinsics.areEqual(getSessionToken(), frontModuleModel.getSessionToken()) && Intrinsics.areEqual(this.documentName, frontModuleModel.documentName) && Intrinsics.areEqual(this.confirmationTitle, frontModuleModel.confirmationTitle) && Intrinsics.areEqual(this.confirmationText, frontModuleModel.confirmationText) && Intrinsics.areEqual(this.submitButtonText, frontModuleModel.submitButtonText) && Intrinsics.areEqual(this.placeFlatAndHoldId, frontModuleModel.placeFlatAndHoldId) && Intrinsics.areEqual(this.idLookingGood, frontModuleModel.idLookingGood) && Intrinsics.areEqual(this.moveIdCloser, frontModuleModel.moveIdCloser) && Intrinsics.areEqual(this.adjustLighting, frontModuleModel.adjustLighting) && Intrinsics.areEqual(this.keepIdFlat, frontModuleModel.keepIdFlat) && Intrinsics.areEqual(this.positionFront, frontModuleModel.positionFront) && Intrinsics.areEqual(this.ensureIdFocus, frontModuleModel.ensureIdFocus) && Intrinsics.areEqual(this.moveAreaError, frontModuleModel.moveAreaError) && Intrinsics.areEqual(this.nativeMessages, frontModuleModel.nativeMessages) && Intrinsics.areEqual(this.helpMessages, frontModuleModel.helpMessages) && Intrinsics.areEqual(this.captureSuccess, frontModuleModel.captureSuccess) && Intrinsics.areEqual(this.scanning, frontModuleModel.scanning) && Intrinsics.areEqual(this.tryPhotoManually, frontModuleModel.tryPhotoManually) && Intrinsics.areEqual(this.manualPrimary, frontModuleModel.manualPrimary) && Intrinsics.areEqual(this.manualSecondary, frontModuleModel.manualSecondary) && Intrinsics.areEqual(this.cameraLoading, frontModuleModel.cameraLoading) && Intrinsics.areEqual(this.cameraIssue, frontModuleModel.cameraIssue) && Intrinsics.areEqual(this.startMode, frontModuleModel.startMode) && Intrinsics.areEqual(this.captureMode, frontModuleModel.captureMode) && Intrinsics.areEqual(this.confirmMode, frontModuleModel.confirmMode) && Intrinsics.areEqual(this.backToScanning, frontModuleModel.backToScanning) && Intrinsics.areEqual(this.captureCompatibilityCheck, frontModuleModel.captureCompatibilityCheck) && Intrinsics.areEqual(this.defaultDocumentTitle, frontModuleModel.defaultDocumentTitle) && Intrinsics.areEqual(this.capturePageTitle, frontModuleModel.capturePageTitle) && Intrinsics.areEqual(this.confirmPageTitle, frontModuleModel.confirmPageTitle) && Intrinsics.areEqual(this.toGetStarted, frontModuleModel.toGetStarted) && Intrinsics.areEqual(getSubmissionErrorMessage(), frontModuleModel.getSubmissionErrorMessage()) && Intrinsics.areEqual(this.defaultIvsError, frontModuleModel.defaultIvsError) && Intrinsics.areEqual(this.previewMessages, frontModuleModel.previewMessages) && Intrinsics.areEqual(this.submitButtonMessages, frontModuleModel.submitButtonMessages) && this.completedModuleCount == frontModuleModel.completedModuleCount && this.totalModuleCount == frontModuleModel.totalModuleCount && Intrinsics.areEqual(this.cardNotFound, frontModuleModel.cardNotFound) && Intrinsics.areEqual(this.idTooClose, frontModuleModel.idTooClose) && Intrinsics.areEqual(this.movePhoneRight, frontModuleModel.movePhoneRight) && Intrinsics.areEqual(this.movePhoneLeft, frontModuleModel.movePhoneLeft) && Intrinsics.areEqual(this.movePhoneDown, frontModuleModel.movePhoneDown) && Intrinsics.areEqual(this.movePhoneUp, frontModuleModel.movePhoneUp) && Intrinsics.areEqual(this.movePhoneBack, frontModuleModel.movePhoneBack) && Intrinsics.areEqual(this.lowBrightnessError, frontModuleModel.lowBrightnessError) && Intrinsics.areEqual(this.pleaseWait, frontModuleModel.pleaseWait) && Intrinsics.areEqual(this.labelErrorMessage, frontModuleModel.labelErrorMessage) && Intrinsics.areEqual(this.documentCameraPermission, frontModuleModel.documentCameraPermission);
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((getModuleId().hashCode() * 31) + (getSessionToken() == null ? 0 : getSessionToken().hashCode())) * 31) + this.documentName.hashCode()) * 31) + this.confirmationTitle.hashCode()) * 31) + this.confirmationText.hashCode()) * 31) + this.submitButtonText.hashCode()) * 31) + this.placeFlatAndHoldId.hashCode()) * 31) + this.idLookingGood.hashCode()) * 31) + this.moveIdCloser.hashCode()) * 31) + this.adjustLighting.hashCode()) * 31) + this.keepIdFlat.hashCode()) * 31) + this.positionFront.hashCode()) * 31) + this.ensureIdFocus.hashCode()) * 31) + this.moveAreaError.hashCode()) * 31) + this.nativeMessages.hashCode()) * 31) + this.helpMessages.hashCode()) * 31) + this.captureSuccess.hashCode()) * 31) + this.scanning.hashCode()) * 31) + this.tryPhotoManually.hashCode()) * 31) + this.manualPrimary.hashCode()) * 31) + this.manualSecondary.hashCode()) * 31) + this.cameraLoading.hashCode()) * 31) + this.cameraIssue.hashCode()) * 31) + this.startMode.hashCode()) * 31) + this.captureMode.hashCode()) * 31) + this.confirmMode.hashCode()) * 31) + this.backToScanning.hashCode()) * 31) + this.captureCompatibilityCheck.hashCode()) * 31) + this.defaultDocumentTitle.hashCode()) * 31) + this.capturePageTitle.hashCode()) * 31) + this.confirmPageTitle.hashCode()) * 31) + this.toGetStarted.hashCode()) * 31) + (getSubmissionErrorMessage() != null ? getSubmissionErrorMessage().hashCode() : 0)) * 31) + this.defaultIvsError.hashCode()) * 31) + this.previewMessages.hashCode()) * 31) + this.submitButtonMessages.hashCode()) * 31) + Integer.hashCode(this.completedModuleCount)) * 31) + Integer.hashCode(this.totalModuleCount)) * 31) + this.cardNotFound.hashCode()) * 31) + this.idTooClose.hashCode()) * 31) + this.movePhoneRight.hashCode()) * 31) + this.movePhoneLeft.hashCode()) * 31) + this.movePhoneDown.hashCode()) * 31) + this.movePhoneUp.hashCode()) * 31) + this.movePhoneBack.hashCode()) * 31) + this.lowBrightnessError.hashCode()) * 31) + this.pleaseWait.hashCode()) * 31) + this.labelErrorMessage.hashCode()) * 31) + this.documentCameraPermission.hashCode();
    }

    public String toString() {
        return "FrontModuleModel(moduleId=" + getModuleId() + ", sessionToken=" + getSessionToken() + ", documentName=" + this.documentName + ", confirmationTitle=" + this.confirmationTitle + ", confirmationText=" + this.confirmationText + ", submitButtonText=" + this.submitButtonText + ", placeFlatAndHoldId=" + this.placeFlatAndHoldId + ", idLookingGood=" + this.idLookingGood + ", moveIdCloser=" + this.moveIdCloser + ", adjustLighting=" + this.adjustLighting + ", keepIdFlat=" + this.keepIdFlat + ", positionFront=" + this.positionFront + ", ensureIdFocus=" + this.ensureIdFocus + ", moveAreaError=" + this.moveAreaError + ", nativeMessages=" + this.nativeMessages + ", helpMessages=" + this.helpMessages + ", captureSuccess=" + this.captureSuccess + ", scanning=" + this.scanning + ", tryPhotoManually=" + this.tryPhotoManually + ", manualPrimary=" + this.manualPrimary + ", manualSecondary=" + this.manualSecondary + ", cameraLoading=" + this.cameraLoading + ", cameraIssue=" + this.cameraIssue + ", startMode=" + this.startMode + ", captureMode=" + this.captureMode + ", confirmMode=" + this.confirmMode + ", backToScanning=" + this.backToScanning + ", captureCompatibilityCheck=" + this.captureCompatibilityCheck + ", defaultDocumentTitle=" + this.defaultDocumentTitle + ", capturePageTitle=" + this.capturePageTitle + ", confirmPageTitle=" + this.confirmPageTitle + ", toGetStarted=" + this.toGetStarted + ", submissionErrorMessage=" + getSubmissionErrorMessage() + ", defaultIvsError=" + this.defaultIvsError + ", previewMessages=" + this.previewMessages + ", submitButtonMessages=" + this.submitButtonMessages + ", completedModuleCount=" + this.completedModuleCount + ", totalModuleCount=" + this.totalModuleCount + ", cardNotFound=" + this.cardNotFound + ", idTooClose=" + this.idTooClose + ", movePhoneRight=" + this.movePhoneRight + ", movePhoneLeft=" + this.movePhoneLeft + ", movePhoneDown=" + this.movePhoneDown + ", movePhoneUp=" + this.movePhoneUp + ", movePhoneBack=" + this.movePhoneBack + ", lowBrightnessError=" + this.lowBrightnessError + ", pleaseWait=" + this.pleaseWait + ", labelErrorMessage=" + this.labelErrorMessage + ", documentCameraPermission=" + this.documentCameraPermission + ")";
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
        parcel.writeString(this.placeFlatAndHoldId);
        parcel.writeString(this.idLookingGood);
        parcel.writeString(this.moveIdCloser);
        parcel.writeString(this.adjustLighting);
        parcel.writeString(this.keepIdFlat);
        parcel.writeString(this.positionFront);
        parcel.writeString(this.ensureIdFocus);
        parcel.writeString(this.moveAreaError);
        this.nativeMessages.writeToParcel(parcel, flags);
        this.helpMessages.writeToParcel(parcel, flags);
        parcel.writeString(this.captureSuccess);
        parcel.writeString(this.scanning);
        parcel.writeString(this.tryPhotoManually);
        parcel.writeString(this.manualPrimary);
        parcel.writeString(this.manualSecondary);
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
        parcel.writeInt(this.completedModuleCount);
        parcel.writeInt(this.totalModuleCount);
        parcel.writeString(this.cardNotFound);
        parcel.writeString(this.idTooClose);
        parcel.writeString(this.movePhoneRight);
        parcel.writeString(this.movePhoneLeft);
        parcel.writeString(this.movePhoneDown);
        parcel.writeString(this.movePhoneUp);
        parcel.writeString(this.movePhoneBack);
        parcel.writeString(this.lowBrightnessError);
        parcel.writeString(this.pleaseWait);
        parcel.writeString(this.labelErrorMessage);
        parcel.writeString(this.documentCameraPermission);
    }

    public FrontModuleModel(String moduleId, String str, String documentName, String confirmationTitle, String confirmationText, String submitButtonText, String placeFlatAndHoldId, String idLookingGood, String moveIdCloser, String adjustLighting, String keepIdFlat, String positionFront, String ensureIdFocus, String moveAreaError, NativeMessages nativeMessages, HelpMessages helpMessages, String captureSuccess, String scanning, String tryPhotoManually, String manualPrimary, String manualSecondary, String cameraLoading, String cameraIssue, String startMode, String captureMode, String confirmMode, String backToScanning, String captureCompatibilityCheck, String defaultDocumentTitle, String capturePageTitle, String confirmPageTitle, String toGetStarted, String str2, String defaultIvsError, PreviewMessages previewMessages, SubmitButtonMessages submitButtonMessages, int i, int i2, String cardNotFound, String idTooClose, String movePhoneRight, String movePhoneLeft, String movePhoneDown, String movePhoneUp, String movePhoneBack, String lowBrightnessError, String pleaseWait, String labelErrorMessage, String documentCameraPermission) {
        Intrinsics.checkNotNullParameter(moduleId, "moduleId");
        Intrinsics.checkNotNullParameter(documentName, "documentName");
        Intrinsics.checkNotNullParameter(confirmationTitle, "confirmationTitle");
        Intrinsics.checkNotNullParameter(confirmationText, "confirmationText");
        Intrinsics.checkNotNullParameter(submitButtonText, "submitButtonText");
        Intrinsics.checkNotNullParameter(placeFlatAndHoldId, "placeFlatAndHoldId");
        Intrinsics.checkNotNullParameter(idLookingGood, "idLookingGood");
        Intrinsics.checkNotNullParameter(moveIdCloser, "moveIdCloser");
        Intrinsics.checkNotNullParameter(adjustLighting, "adjustLighting");
        Intrinsics.checkNotNullParameter(keepIdFlat, "keepIdFlat");
        Intrinsics.checkNotNullParameter(positionFront, "positionFront");
        Intrinsics.checkNotNullParameter(ensureIdFocus, "ensureIdFocus");
        Intrinsics.checkNotNullParameter(moveAreaError, "moveAreaError");
        Intrinsics.checkNotNullParameter(nativeMessages, "nativeMessages");
        Intrinsics.checkNotNullParameter(helpMessages, "helpMessages");
        Intrinsics.checkNotNullParameter(captureSuccess, "captureSuccess");
        Intrinsics.checkNotNullParameter(scanning, "scanning");
        Intrinsics.checkNotNullParameter(tryPhotoManually, "tryPhotoManually");
        Intrinsics.checkNotNullParameter(manualPrimary, "manualPrimary");
        Intrinsics.checkNotNullParameter(manualSecondary, "manualSecondary");
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
        Intrinsics.checkNotNullParameter(cardNotFound, "cardNotFound");
        Intrinsics.checkNotNullParameter(idTooClose, "idTooClose");
        Intrinsics.checkNotNullParameter(movePhoneRight, "movePhoneRight");
        Intrinsics.checkNotNullParameter(movePhoneLeft, "movePhoneLeft");
        Intrinsics.checkNotNullParameter(movePhoneDown, "movePhoneDown");
        Intrinsics.checkNotNullParameter(movePhoneUp, "movePhoneUp");
        Intrinsics.checkNotNullParameter(movePhoneBack, "movePhoneBack");
        Intrinsics.checkNotNullParameter(lowBrightnessError, "lowBrightnessError");
        Intrinsics.checkNotNullParameter(pleaseWait, "pleaseWait");
        Intrinsics.checkNotNullParameter(labelErrorMessage, "labelErrorMessage");
        Intrinsics.checkNotNullParameter(documentCameraPermission, "documentCameraPermission");
        this.moduleId = moduleId;
        this.sessionToken = str;
        this.documentName = documentName;
        this.confirmationTitle = confirmationTitle;
        this.confirmationText = confirmationText;
        this.submitButtonText = submitButtonText;
        this.placeFlatAndHoldId = placeFlatAndHoldId;
        this.idLookingGood = idLookingGood;
        this.moveIdCloser = moveIdCloser;
        this.adjustLighting = adjustLighting;
        this.keepIdFlat = keepIdFlat;
        this.positionFront = positionFront;
        this.ensureIdFocus = ensureIdFocus;
        this.moveAreaError = moveAreaError;
        this.nativeMessages = nativeMessages;
        this.helpMessages = helpMessages;
        this.captureSuccess = captureSuccess;
        this.scanning = scanning;
        this.tryPhotoManually = tryPhotoManually;
        this.manualPrimary = manualPrimary;
        this.manualSecondary = manualSecondary;
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
        this.completedModuleCount = i;
        this.totalModuleCount = i2;
        this.cardNotFound = cardNotFound;
        this.idTooClose = idTooClose;
        this.movePhoneRight = movePhoneRight;
        this.movePhoneLeft = movePhoneLeft;
        this.movePhoneDown = movePhoneDown;
        this.movePhoneUp = movePhoneUp;
        this.movePhoneBack = movePhoneBack;
        this.lowBrightnessError = lowBrightnessError;
        this.pleaseWait = pleaseWait;
        this.labelErrorMessage = labelErrorMessage;
        this.documentCameraPermission = documentCameraPermission;
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

    public final String getPlaceFlatAndHoldId() {
        return this.placeFlatAndHoldId;
    }

    public final String getIdLookingGood() {
        return this.idLookingGood;
    }

    public final String getMoveIdCloser() {
        return this.moveIdCloser;
    }

    public final String getAdjustLighting() {
        return this.adjustLighting;
    }

    public final String getKeepIdFlat() {
        return this.keepIdFlat;
    }

    public final String getPositionFront() {
        return this.positionFront;
    }

    public final String getEnsureIdFocus() {
        return this.ensureIdFocus;
    }

    public final String getMoveAreaError() {
        return this.moveAreaError;
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

    public final String getScanning() {
        return this.scanning;
    }

    public final String getTryPhotoManually() {
        return this.tryPhotoManually;
    }

    public final String getManualPrimary() {
        return this.manualPrimary;
    }

    public final String getManualSecondary() {
        return this.manualSecondary;
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

    public final int getCompletedModuleCount() {
        return this.completedModuleCount;
    }

    public final int getTotalModuleCount() {
        return this.totalModuleCount;
    }

    public final String getCardNotFound() {
        return this.cardNotFound;
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

    public final String getLowBrightnessError() {
        return this.lowBrightnessError;
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

    /* compiled from: FrontModuleModel.kt */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J;\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aHÖ\u0003J\t\u0010\u001b\u001a\u00020\u0016HÖ\u0001J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001J\u0019\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\n¨\u0006\""}, d2 = {"Lcom/socure/docv/capturesdk/models/FrontModuleModel$NativeMessages;", "Landroid/os/Parcelable;", "title", "", "placeIdFlat", "positionPhoneId", "makeSureInfo", "clickCapture", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getClickCapture", "()Ljava/lang/String;", "getMakeSureInfo", "getPlaceIdFlat", "getPositionPhoneId", "getTitle", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "capturesdk_productionRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class NativeMessages implements Parcelable {
        public static final int $stable = 0;
        public static final Parcelable.Creator<NativeMessages> CREATOR = new Creator();
        private final String clickCapture;
        private final String makeSureInfo;
        private final String placeIdFlat;
        private final String positionPhoneId;
        private final String title;

        /* compiled from: FrontModuleModel.kt */
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
                str2 = nativeMessages.placeIdFlat;
            }
            if ((i & 4) != 0) {
                str3 = nativeMessages.positionPhoneId;
            }
            if ((i & 8) != 0) {
                str4 = nativeMessages.makeSureInfo;
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
        public final String getPlaceIdFlat() {
            return this.placeIdFlat;
        }

        /* renamed from: component3, reason: from getter */
        public final String getPositionPhoneId() {
            return this.positionPhoneId;
        }

        /* renamed from: component4, reason: from getter */
        public final String getMakeSureInfo() {
            return this.makeSureInfo;
        }

        /* renamed from: component5, reason: from getter */
        public final String getClickCapture() {
            return this.clickCapture;
        }

        public final NativeMessages copy(String title, String placeIdFlat, String positionPhoneId, String makeSureInfo, String clickCapture) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(placeIdFlat, "placeIdFlat");
            Intrinsics.checkNotNullParameter(positionPhoneId, "positionPhoneId");
            Intrinsics.checkNotNullParameter(makeSureInfo, "makeSureInfo");
            Intrinsics.checkNotNullParameter(clickCapture, "clickCapture");
            return new NativeMessages(title, placeIdFlat, positionPhoneId, makeSureInfo, clickCapture);
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
            return Intrinsics.areEqual(this.title, nativeMessages.title) && Intrinsics.areEqual(this.placeIdFlat, nativeMessages.placeIdFlat) && Intrinsics.areEqual(this.positionPhoneId, nativeMessages.positionPhoneId) && Intrinsics.areEqual(this.makeSureInfo, nativeMessages.makeSureInfo) && Intrinsics.areEqual(this.clickCapture, nativeMessages.clickCapture);
        }

        public int hashCode() {
            return (((((((this.title.hashCode() * 31) + this.placeIdFlat.hashCode()) * 31) + this.positionPhoneId.hashCode()) * 31) + this.makeSureInfo.hashCode()) * 31) + this.clickCapture.hashCode();
        }

        public String toString() {
            return "NativeMessages(title=" + this.title + ", placeIdFlat=" + this.placeIdFlat + ", positionPhoneId=" + this.positionPhoneId + ", makeSureInfo=" + this.makeSureInfo + ", clickCapture=" + this.clickCapture + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            Intrinsics.checkNotNullParameter(parcel, "out");
            parcel.writeString(this.title);
            parcel.writeString(this.placeIdFlat);
            parcel.writeString(this.positionPhoneId);
            parcel.writeString(this.makeSureInfo);
            parcel.writeString(this.clickCapture);
        }

        public NativeMessages(String title, String placeIdFlat, String positionPhoneId, String makeSureInfo, String clickCapture) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(placeIdFlat, "placeIdFlat");
            Intrinsics.checkNotNullParameter(positionPhoneId, "positionPhoneId");
            Intrinsics.checkNotNullParameter(makeSureInfo, "makeSureInfo");
            Intrinsics.checkNotNullParameter(clickCapture, "clickCapture");
            this.title = title;
            this.placeIdFlat = placeIdFlat;
            this.positionPhoneId = positionPhoneId;
            this.makeSureInfo = makeSureInfo;
            this.clickCapture = clickCapture;
        }

        public final String getTitle() {
            return this.title;
        }

        public final String getPlaceIdFlat() {
            return this.placeIdFlat;
        }

        public final String getPositionPhoneId() {
            return this.positionPhoneId;
        }

        public final String getMakeSureInfo() {
            return this.makeSureInfo;
        }

        public final String getClickCapture() {
            return this.clickCapture;
        }
    }

    /* compiled from: FrontModuleModel.kt */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J;\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aHÖ\u0003J\t\u0010\u001b\u001a\u00020\u0016HÖ\u0001J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001J\u0019\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\n¨\u0006\""}, d2 = {"Lcom/socure/docv/capturesdk/models/FrontModuleModel$HelpMessages;", "Landroid/os/Parcelable;", "title", "", "placeIdFlat", "holdPhoneOverId", "focusCameraId", "keepSteady", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getFocusCameraId", "()Ljava/lang/String;", "getHoldPhoneOverId", "getKeepSteady", "getPlaceIdFlat", "getTitle", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "capturesdk_productionRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class HelpMessages implements Parcelable {
        public static final int $stable = 0;
        public static final Parcelable.Creator<HelpMessages> CREATOR = new Creator();
        private final String focusCameraId;
        private final String holdPhoneOverId;
        private final String keepSteady;
        private final String placeIdFlat;
        private final String title;

        /* compiled from: FrontModuleModel.kt */
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
                str2 = helpMessages.placeIdFlat;
            }
            if ((i & 4) != 0) {
                str3 = helpMessages.holdPhoneOverId;
            }
            if ((i & 8) != 0) {
                str4 = helpMessages.focusCameraId;
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
        public final String getPlaceIdFlat() {
            return this.placeIdFlat;
        }

        /* renamed from: component3, reason: from getter */
        public final String getHoldPhoneOverId() {
            return this.holdPhoneOverId;
        }

        /* renamed from: component4, reason: from getter */
        public final String getFocusCameraId() {
            return this.focusCameraId;
        }

        /* renamed from: component5, reason: from getter */
        public final String getKeepSteady() {
            return this.keepSteady;
        }

        public final HelpMessages copy(String title, String placeIdFlat, String holdPhoneOverId, String focusCameraId, String keepSteady) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(placeIdFlat, "placeIdFlat");
            Intrinsics.checkNotNullParameter(holdPhoneOverId, "holdPhoneOverId");
            Intrinsics.checkNotNullParameter(focusCameraId, "focusCameraId");
            Intrinsics.checkNotNullParameter(keepSteady, "keepSteady");
            return new HelpMessages(title, placeIdFlat, holdPhoneOverId, focusCameraId, keepSteady);
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
            return Intrinsics.areEqual(this.title, helpMessages.title) && Intrinsics.areEqual(this.placeIdFlat, helpMessages.placeIdFlat) && Intrinsics.areEqual(this.holdPhoneOverId, helpMessages.holdPhoneOverId) && Intrinsics.areEqual(this.focusCameraId, helpMessages.focusCameraId) && Intrinsics.areEqual(this.keepSteady, helpMessages.keepSteady);
        }

        public int hashCode() {
            return (((((((this.title.hashCode() * 31) + this.placeIdFlat.hashCode()) * 31) + this.holdPhoneOverId.hashCode()) * 31) + this.focusCameraId.hashCode()) * 31) + this.keepSteady.hashCode();
        }

        public String toString() {
            return "HelpMessages(title=" + this.title + ", placeIdFlat=" + this.placeIdFlat + ", holdPhoneOverId=" + this.holdPhoneOverId + ", focusCameraId=" + this.focusCameraId + ", keepSteady=" + this.keepSteady + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            Intrinsics.checkNotNullParameter(parcel, "out");
            parcel.writeString(this.title);
            parcel.writeString(this.placeIdFlat);
            parcel.writeString(this.holdPhoneOverId);
            parcel.writeString(this.focusCameraId);
            parcel.writeString(this.keepSteady);
        }

        public HelpMessages(String title, String placeIdFlat, String holdPhoneOverId, String focusCameraId, String keepSteady) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(placeIdFlat, "placeIdFlat");
            Intrinsics.checkNotNullParameter(holdPhoneOverId, "holdPhoneOverId");
            Intrinsics.checkNotNullParameter(focusCameraId, "focusCameraId");
            Intrinsics.checkNotNullParameter(keepSteady, "keepSteady");
            this.title = title;
            this.placeIdFlat = placeIdFlat;
            this.holdPhoneOverId = holdPhoneOverId;
            this.focusCameraId = focusCameraId;
            this.keepSteady = keepSteady;
        }

        public final String getTitle() {
            return this.title;
        }

        public final String getPlaceIdFlat() {
            return this.placeIdFlat;
        }

        public final String getHoldPhoneOverId() {
            return this.holdPhoneOverId;
        }

        public final String getFocusCameraId() {
            return this.focusCameraId;
        }

        public final String getKeepSteady() {
            return this.keepSteady;
        }
    }

    /* compiled from: FrontModuleModel.kt */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J1\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001J\u0019\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u001f"}, d2 = {"Lcom/socure/docv/capturesdk/models/FrontModuleModel$PreviewMessages;", "Landroid/os/Parcelable;", "submitImageForValidation", "", "validatingImage", "invalidImage", "imageValidated", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getImageValidated", "()Ljava/lang/String;", "getInvalidImage", "getSubmitImageForValidation", "getValidatingImage", "component1", "component2", "component3", "component4", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "capturesdk_productionRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class PreviewMessages implements Parcelable {
        public static final int $stable = 0;
        public static final Parcelable.Creator<PreviewMessages> CREATOR = new Creator();
        private final String imageValidated;
        private final String invalidImage;
        private final String submitImageForValidation;
        private final String validatingImage;

        /* compiled from: FrontModuleModel.kt */
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

    /* compiled from: FrontModuleModel.kt */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J1\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001J\u0019\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u001f"}, d2 = {"Lcom/socure/docv/capturesdk/models/FrontModuleModel$SubmitButtonMessages;", "Landroid/os/Parcelable;", "submit", "", "retake", "processing", "success", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getProcessing", "()Ljava/lang/String;", "getRetake", "getSubmit", "getSuccess", "component1", "component2", "component3", "component4", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "capturesdk_productionRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class SubmitButtonMessages implements Parcelable {
        public static final int $stable = 0;
        public static final Parcelable.Creator<SubmitButtonMessages> CREATOR = new Creator();
        private final String processing;
        private final String retake;
        private final String submit;
        private final String success;

        /* compiled from: FrontModuleModel.kt */
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
