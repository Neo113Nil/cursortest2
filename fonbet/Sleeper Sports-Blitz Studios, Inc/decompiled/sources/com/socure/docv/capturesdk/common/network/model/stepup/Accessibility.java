package com.socure.docv.capturesdk.common.network.model.stepup;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: NewLabels.kt */
@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\bp\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0093\u0002\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0001\u0010\b\u001a\u00020\u0003\u0012\b\b\u0001\u0010\t\u001a\u00020\u0003\u0012\b\b\u0001\u0010\n\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u000b\u001a\u00020\u0003\u0012\b\b\u0001\u0010\f\u001a\u00020\u0003\u0012\b\b\u0001\u0010\r\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u000e\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u000f\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0010\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0011\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0012\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0013\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0014\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0015\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0016\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0017\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0018\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0019\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u001a\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u001b\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u001c\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u001d\u001a\u00020\u0003¢\u0006\u0002\u0010\u001eJ\t\u0010W\u001a\u00020\u0003HÆ\u0003J\t\u0010X\u001a\u00020\u0003HÆ\u0003J\t\u0010Y\u001a\u00020\u0003HÆ\u0003J\t\u0010Z\u001a\u00020\u0003HÆ\u0003J\t\u0010[\u001a\u00020\u0003HÆ\u0003J\t\u0010\\\u001a\u00020\u0003HÆ\u0003J\t\u0010]\u001a\u00020\u0003HÆ\u0003J\t\u0010^\u001a\u00020\u0003HÆ\u0003J\t\u0010_\u001a\u00020\u0003HÆ\u0003J\t\u0010`\u001a\u00020\u0003HÆ\u0003J\t\u0010a\u001a\u00020\u0003HÆ\u0003J\t\u0010b\u001a\u00020\u0003HÆ\u0003J\t\u0010c\u001a\u00020\u0003HÆ\u0003J\t\u0010d\u001a\u00020\u0003HÆ\u0003J\t\u0010e\u001a\u00020\u0003HÆ\u0003J\t\u0010f\u001a\u00020\u0003HÆ\u0003J\t\u0010g\u001a\u00020\u0003HÆ\u0003J\t\u0010h\u001a\u00020\u0003HÆ\u0003J\t\u0010i\u001a\u00020\u0003HÆ\u0003J\t\u0010j\u001a\u00020\u0003HÆ\u0003J\t\u0010k\u001a\u00020\u0003HÆ\u0003J\t\u0010l\u001a\u00020\u0003HÆ\u0003J\t\u0010m\u001a\u00020\u0003HÆ\u0003J\t\u0010n\u001a\u00020\u0003HÆ\u0003J\t\u0010o\u001a\u00020\u0003HÆ\u0003J\t\u0010p\u001a\u00020\u0003HÆ\u0003J\t\u0010q\u001a\u00020\u0003HÆ\u0003J\u0097\u0002\u0010r\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u00032\b\b\u0003\u0010\u0006\u001a\u00020\u00032\b\b\u0003\u0010\u0007\u001a\u00020\u00032\b\b\u0003\u0010\b\u001a\u00020\u00032\b\b\u0003\u0010\t\u001a\u00020\u00032\b\b\u0003\u0010\n\u001a\u00020\u00032\b\b\u0003\u0010\u000b\u001a\u00020\u00032\b\b\u0003\u0010\f\u001a\u00020\u00032\b\b\u0003\u0010\r\u001a\u00020\u00032\b\b\u0003\u0010\u000e\u001a\u00020\u00032\b\b\u0003\u0010\u000f\u001a\u00020\u00032\b\b\u0003\u0010\u0010\u001a\u00020\u00032\b\b\u0003\u0010\u0011\u001a\u00020\u00032\b\b\u0003\u0010\u0012\u001a\u00020\u00032\b\b\u0003\u0010\u0013\u001a\u00020\u00032\b\b\u0003\u0010\u0014\u001a\u00020\u00032\b\b\u0003\u0010\u0015\u001a\u00020\u00032\b\b\u0003\u0010\u0016\u001a\u00020\u00032\b\b\u0003\u0010\u0017\u001a\u00020\u00032\b\b\u0003\u0010\u0018\u001a\u00020\u00032\b\b\u0003\u0010\u0019\u001a\u00020\u00032\b\b\u0003\u0010\u001a\u001a\u00020\u00032\b\b\u0003\u0010\u001b\u001a\u00020\u00032\b\b\u0003\u0010\u001c\u001a\u00020\u00032\b\b\u0003\u0010\u001d\u001a\u00020\u0003HÆ\u0001J\u0013\u0010s\u001a\u00020t2\b\u0010u\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010v\u001a\u00020wHÖ\u0001J\t\u0010x\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u001a\u0010\u001b\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010 \"\u0004\b$\u0010\"R\u001a\u0010\u0019\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010 \"\u0004\b&\u0010\"R\u001a\u0010\f\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010 \"\u0004\b(\u0010\"R\u001a\u0010\u000f\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010 \"\u0004\b*\u0010\"R\u001a\u0010\u000e\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010 \"\u0004\b,\u0010\"R\u001a\u0010\u0010\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010 \"\u0004\b.\u0010\"R\u001a\u0010\u0012\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u0010 \"\u0004\b0\u0010\"R\u001a\u0010\u001a\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b1\u0010 \"\u0004\b2\u0010\"R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b3\u0010 \"\u0004\b4\u0010\"R\u001a\u0010\u000b\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b5\u0010 \"\u0004\b6\u0010\"R\u001a\u0010\u0015\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b7\u0010 \"\u0004\b8\u0010\"R\u001a\u0010\u0016\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b9\u0010 \"\u0004\b:\u0010\"R\u001a\u0010\u0018\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b;\u0010 \"\u0004\b<\u0010\"R\u001a\u0010\b\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b=\u0010 \"\u0004\b>\u0010\"R\u001a\u0010\u0011\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b?\u0010 \"\u0004\b@\u0010\"R\u001a\u0010\r\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bA\u0010 \"\u0004\bB\u0010\"R\u001a\u0010\u0006\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bC\u0010 \"\u0004\bD\u0010\"R\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bE\u0010 \"\u0004\bF\u0010\"R\u001a\u0010\u0007\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bG\u0010 \"\u0004\bH\u0010\"R\u001a\u0010\t\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bI\u0010 \"\u0004\bJ\u0010\"R\u001a\u0010\n\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bK\u0010 \"\u0004\bL\u0010\"R\u001a\u0010\u0013\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bM\u0010 \"\u0004\bN\u0010\"R\u001a\u0010\u0017\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bO\u0010 \"\u0004\bP\u0010\"R\u001a\u0010\u001c\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bQ\u0010 \"\u0004\bR\u0010\"R\u001a\u0010\u001d\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bS\u0010 \"\u0004\bT\u0010\"R\u001a\u0010\u0014\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bU\u0010 \"\u0004\bV\u0010\"¨\u0006y"}, d2 = {"Lcom/socure/docv/capturesdk/common/network/model/stepup/Accessibility;", "", "holdPhoneFront", "", "alignFaceFrame", "movePhoneRight", "movePhoneLeft", "movePhoneUp", "movePhoneDown", "noCardDetected", "noPassportDetected", "idLookingGood", "faceIsSmall", "movePhoneFrontLowEndDevice", "focusCameraId", "flipIdBarcode", "focusCameraPassport", "movePhoneFront", "frontBackTryPhotoManually", "passportTryPhotoManually", "validatingImage", "idealFace", "initialisingSdk", "processingConsent", "manualBtnContDes", "closeBtnContDes", "helpBtnContDes", "backBtnContDes", "selectCheckBox", "unselectCheckBox", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAlignFaceFrame", "()Ljava/lang/String;", "setAlignFaceFrame", "(Ljava/lang/String;)V", "getBackBtnContDes", "setBackBtnContDes", "getCloseBtnContDes", "setCloseBtnContDes", "getFaceIsSmall", "setFaceIsSmall", "getFlipIdBarcode", "setFlipIdBarcode", "getFocusCameraId", "setFocusCameraId", "getFocusCameraPassport", "setFocusCameraPassport", "getFrontBackTryPhotoManually", "setFrontBackTryPhotoManually", "getHelpBtnContDes", "setHelpBtnContDes", "getHoldPhoneFront", "setHoldPhoneFront", "getIdLookingGood", "setIdLookingGood", "getIdealFace", "setIdealFace", "getInitialisingSdk", "setInitialisingSdk", "getManualBtnContDes", "setManualBtnContDes", "getMovePhoneDown", "setMovePhoneDown", "getMovePhoneFront", "setMovePhoneFront", "getMovePhoneFrontLowEndDevice", "setMovePhoneFrontLowEndDevice", "getMovePhoneLeft", "setMovePhoneLeft", "getMovePhoneRight", "setMovePhoneRight", "getMovePhoneUp", "setMovePhoneUp", "getNoCardDetected", "setNoCardDetected", "getNoPassportDetected", "setNoPassportDetected", "getPassportTryPhotoManually", "setPassportTryPhotoManually", "getProcessingConsent", "setProcessingConsent", "getSelectCheckBox", "setSelectCheckBox", "getUnselectCheckBox", "setUnselectCheckBox", "getValidatingImage", "setValidatingImage", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "capturesdk_productionRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class Accessibility {
    public static final int $stable = 8;
    private String alignFaceFrame;
    private String backBtnContDes;
    private String closeBtnContDes;
    private String faceIsSmall;
    private String flipIdBarcode;
    private String focusCameraId;
    private String focusCameraPassport;
    private String frontBackTryPhotoManually;
    private String helpBtnContDes;
    private String holdPhoneFront;
    private String idLookingGood;
    private String idealFace;
    private String initialisingSdk;
    private String manualBtnContDes;
    private String movePhoneDown;
    private String movePhoneFront;
    private String movePhoneFrontLowEndDevice;
    private String movePhoneLeft;
    private String movePhoneRight;
    private String movePhoneUp;
    private String noCardDetected;
    private String noPassportDetected;
    private String passportTryPhotoManually;
    private String processingConsent;
    private String selectCheckBox;
    private String unselectCheckBox;
    private String validatingImage;

    public static /* synthetic */ Accessibility copy$default(Accessibility accessibility, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25, String str26, String str27, int i, Object obj) {
        String str28;
        String str29;
        String str30 = (i & 1) != 0 ? accessibility.holdPhoneFront : str;
        String str31 = (i & 2) != 0 ? accessibility.alignFaceFrame : str2;
        String str32 = (i & 4) != 0 ? accessibility.movePhoneRight : str3;
        String str33 = (i & 8) != 0 ? accessibility.movePhoneLeft : str4;
        String str34 = (i & 16) != 0 ? accessibility.movePhoneUp : str5;
        String str35 = (i & 32) != 0 ? accessibility.movePhoneDown : str6;
        String str36 = (i & 64) != 0 ? accessibility.noCardDetected : str7;
        String str37 = (i & 128) != 0 ? accessibility.noPassportDetected : str8;
        String str38 = (i & 256) != 0 ? accessibility.idLookingGood : str9;
        String str39 = (i & 512) != 0 ? accessibility.faceIsSmall : str10;
        String str40 = (i & 1024) != 0 ? accessibility.movePhoneFrontLowEndDevice : str11;
        String str41 = (i & 2048) != 0 ? accessibility.focusCameraId : str12;
        String str42 = (i & 4096) != 0 ? accessibility.flipIdBarcode : str13;
        String str43 = (i & 8192) != 0 ? accessibility.focusCameraPassport : str14;
        String str44 = str30;
        String str45 = (i & 16384) != 0 ? accessibility.movePhoneFront : str15;
        String str46 = (i & 32768) != 0 ? accessibility.frontBackTryPhotoManually : str16;
        String str47 = (i & 65536) != 0 ? accessibility.passportTryPhotoManually : str17;
        String str48 = (i & 131072) != 0 ? accessibility.validatingImage : str18;
        String str49 = (i & 262144) != 0 ? accessibility.idealFace : str19;
        String str50 = (i & 524288) != 0 ? accessibility.initialisingSdk : str20;
        String str51 = (i & 1048576) != 0 ? accessibility.processingConsent : str21;
        String str52 = (i & 2097152) != 0 ? accessibility.manualBtnContDes : str22;
        String str53 = (i & 4194304) != 0 ? accessibility.closeBtnContDes : str23;
        String str54 = (i & 8388608) != 0 ? accessibility.helpBtnContDes : str24;
        String str55 = (i & 16777216) != 0 ? accessibility.backBtnContDes : str25;
        String str56 = (i & 33554432) != 0 ? accessibility.selectCheckBox : str26;
        if ((i & 67108864) != 0) {
            str29 = str56;
            str28 = accessibility.unselectCheckBox;
        } else {
            str28 = str27;
            str29 = str56;
        }
        return accessibility.copy(str44, str31, str32, str33, str34, str35, str36, str37, str38, str39, str40, str41, str42, str43, str45, str46, str47, str48, str49, str50, str51, str52, str53, str54, str55, str29, str28);
    }

    /* renamed from: component1, reason: from getter */
    public final String getHoldPhoneFront() {
        return this.holdPhoneFront;
    }

    /* renamed from: component10, reason: from getter */
    public final String getFaceIsSmall() {
        return this.faceIsSmall;
    }

    /* renamed from: component11, reason: from getter */
    public final String getMovePhoneFrontLowEndDevice() {
        return this.movePhoneFrontLowEndDevice;
    }

    /* renamed from: component12, reason: from getter */
    public final String getFocusCameraId() {
        return this.focusCameraId;
    }

    /* renamed from: component13, reason: from getter */
    public final String getFlipIdBarcode() {
        return this.flipIdBarcode;
    }

    /* renamed from: component14, reason: from getter */
    public final String getFocusCameraPassport() {
        return this.focusCameraPassport;
    }

    /* renamed from: component15, reason: from getter */
    public final String getMovePhoneFront() {
        return this.movePhoneFront;
    }

    /* renamed from: component16, reason: from getter */
    public final String getFrontBackTryPhotoManually() {
        return this.frontBackTryPhotoManually;
    }

    /* renamed from: component17, reason: from getter */
    public final String getPassportTryPhotoManually() {
        return this.passportTryPhotoManually;
    }

    /* renamed from: component18, reason: from getter */
    public final String getValidatingImage() {
        return this.validatingImage;
    }

    /* renamed from: component19, reason: from getter */
    public final String getIdealFace() {
        return this.idealFace;
    }

    /* renamed from: component2, reason: from getter */
    public final String getAlignFaceFrame() {
        return this.alignFaceFrame;
    }

    /* renamed from: component20, reason: from getter */
    public final String getInitialisingSdk() {
        return this.initialisingSdk;
    }

    /* renamed from: component21, reason: from getter */
    public final String getProcessingConsent() {
        return this.processingConsent;
    }

    /* renamed from: component22, reason: from getter */
    public final String getManualBtnContDes() {
        return this.manualBtnContDes;
    }

    /* renamed from: component23, reason: from getter */
    public final String getCloseBtnContDes() {
        return this.closeBtnContDes;
    }

    /* renamed from: component24, reason: from getter */
    public final String getHelpBtnContDes() {
        return this.helpBtnContDes;
    }

    /* renamed from: component25, reason: from getter */
    public final String getBackBtnContDes() {
        return this.backBtnContDes;
    }

    /* renamed from: component26, reason: from getter */
    public final String getSelectCheckBox() {
        return this.selectCheckBox;
    }

    /* renamed from: component27, reason: from getter */
    public final String getUnselectCheckBox() {
        return this.unselectCheckBox;
    }

    /* renamed from: component3, reason: from getter */
    public final String getMovePhoneRight() {
        return this.movePhoneRight;
    }

    /* renamed from: component4, reason: from getter */
    public final String getMovePhoneLeft() {
        return this.movePhoneLeft;
    }

    /* renamed from: component5, reason: from getter */
    public final String getMovePhoneUp() {
        return this.movePhoneUp;
    }

    /* renamed from: component6, reason: from getter */
    public final String getMovePhoneDown() {
        return this.movePhoneDown;
    }

    /* renamed from: component7, reason: from getter */
    public final String getNoCardDetected() {
        return this.noCardDetected;
    }

    /* renamed from: component8, reason: from getter */
    public final String getNoPassportDetected() {
        return this.noPassportDetected;
    }

    /* renamed from: component9, reason: from getter */
    public final String getIdLookingGood() {
        return this.idLookingGood;
    }

    public final Accessibility copy(@Json(name = "holdPhoneFront") String holdPhoneFront, @Json(name = "alignFaceFrame") String alignFaceFrame, @Json(name = "movePhoneRight") String movePhoneRight, @Json(name = "movePhoneLeft") String movePhoneLeft, @Json(name = "movePhoneUp") String movePhoneUp, @Json(name = "movePhoneDown") String movePhoneDown, @Json(name = "noCardDetected") String noCardDetected, @Json(name = "noPassportDetected") String noPassportDetected, @Json(name = "idLookingGood") String idLookingGood, @Json(name = "faceIsSmall") String faceIsSmall, @Json(name = "movePhoneFrontLowEndDevice") String movePhoneFrontLowEndDevice, @Json(name = "focusCameraId") String focusCameraId, @Json(name = "flipIdBarcode") String flipIdBarcode, @Json(name = "focusCameraPassport") String focusCameraPassport, @Json(name = "movePhoneFront") String movePhoneFront, @Json(name = "frontBackTryPhotoManually") String frontBackTryPhotoManually, @Json(name = "passportTryPhotoManually") String passportTryPhotoManually, @Json(name = "validatingImage") String validatingImage, @Json(name = "idealFace") String idealFace, @Json(name = "initialisingSdk") String initialisingSdk, @Json(name = "processingConsent") String processingConsent, @Json(name = "manualBtnContDes") String manualBtnContDes, @Json(name = "closeBtnContDes") String closeBtnContDes, @Json(name = "helpBtnContDes") String helpBtnContDes, @Json(name = "backBtnContDes") String backBtnContDes, @Json(name = "selectCheckBox") String selectCheckBox, @Json(name = "unselectCheckBox") String unselectCheckBox) {
        Intrinsics.checkNotNullParameter(holdPhoneFront, "holdPhoneFront");
        Intrinsics.checkNotNullParameter(alignFaceFrame, "alignFaceFrame");
        Intrinsics.checkNotNullParameter(movePhoneRight, "movePhoneRight");
        Intrinsics.checkNotNullParameter(movePhoneLeft, "movePhoneLeft");
        Intrinsics.checkNotNullParameter(movePhoneUp, "movePhoneUp");
        Intrinsics.checkNotNullParameter(movePhoneDown, "movePhoneDown");
        Intrinsics.checkNotNullParameter(noCardDetected, "noCardDetected");
        Intrinsics.checkNotNullParameter(noPassportDetected, "noPassportDetected");
        Intrinsics.checkNotNullParameter(idLookingGood, "idLookingGood");
        Intrinsics.checkNotNullParameter(faceIsSmall, "faceIsSmall");
        Intrinsics.checkNotNullParameter(movePhoneFrontLowEndDevice, "movePhoneFrontLowEndDevice");
        Intrinsics.checkNotNullParameter(focusCameraId, "focusCameraId");
        Intrinsics.checkNotNullParameter(flipIdBarcode, "flipIdBarcode");
        Intrinsics.checkNotNullParameter(focusCameraPassport, "focusCameraPassport");
        Intrinsics.checkNotNullParameter(movePhoneFront, "movePhoneFront");
        Intrinsics.checkNotNullParameter(frontBackTryPhotoManually, "frontBackTryPhotoManually");
        Intrinsics.checkNotNullParameter(passportTryPhotoManually, "passportTryPhotoManually");
        Intrinsics.checkNotNullParameter(validatingImage, "validatingImage");
        Intrinsics.checkNotNullParameter(idealFace, "idealFace");
        Intrinsics.checkNotNullParameter(initialisingSdk, "initialisingSdk");
        Intrinsics.checkNotNullParameter(processingConsent, "processingConsent");
        Intrinsics.checkNotNullParameter(manualBtnContDes, "manualBtnContDes");
        Intrinsics.checkNotNullParameter(closeBtnContDes, "closeBtnContDes");
        Intrinsics.checkNotNullParameter(helpBtnContDes, "helpBtnContDes");
        Intrinsics.checkNotNullParameter(backBtnContDes, "backBtnContDes");
        Intrinsics.checkNotNullParameter(selectCheckBox, "selectCheckBox");
        Intrinsics.checkNotNullParameter(unselectCheckBox, "unselectCheckBox");
        return new Accessibility(holdPhoneFront, alignFaceFrame, movePhoneRight, movePhoneLeft, movePhoneUp, movePhoneDown, noCardDetected, noPassportDetected, idLookingGood, faceIsSmall, movePhoneFrontLowEndDevice, focusCameraId, flipIdBarcode, focusCameraPassport, movePhoneFront, frontBackTryPhotoManually, passportTryPhotoManually, validatingImage, idealFace, initialisingSdk, processingConsent, manualBtnContDes, closeBtnContDes, helpBtnContDes, backBtnContDes, selectCheckBox, unselectCheckBox);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Accessibility)) {
            return false;
        }
        Accessibility accessibility = (Accessibility) other;
        return Intrinsics.areEqual(this.holdPhoneFront, accessibility.holdPhoneFront) && Intrinsics.areEqual(this.alignFaceFrame, accessibility.alignFaceFrame) && Intrinsics.areEqual(this.movePhoneRight, accessibility.movePhoneRight) && Intrinsics.areEqual(this.movePhoneLeft, accessibility.movePhoneLeft) && Intrinsics.areEqual(this.movePhoneUp, accessibility.movePhoneUp) && Intrinsics.areEqual(this.movePhoneDown, accessibility.movePhoneDown) && Intrinsics.areEqual(this.noCardDetected, accessibility.noCardDetected) && Intrinsics.areEqual(this.noPassportDetected, accessibility.noPassportDetected) && Intrinsics.areEqual(this.idLookingGood, accessibility.idLookingGood) && Intrinsics.areEqual(this.faceIsSmall, accessibility.faceIsSmall) && Intrinsics.areEqual(this.movePhoneFrontLowEndDevice, accessibility.movePhoneFrontLowEndDevice) && Intrinsics.areEqual(this.focusCameraId, accessibility.focusCameraId) && Intrinsics.areEqual(this.flipIdBarcode, accessibility.flipIdBarcode) && Intrinsics.areEqual(this.focusCameraPassport, accessibility.focusCameraPassport) && Intrinsics.areEqual(this.movePhoneFront, accessibility.movePhoneFront) && Intrinsics.areEqual(this.frontBackTryPhotoManually, accessibility.frontBackTryPhotoManually) && Intrinsics.areEqual(this.passportTryPhotoManually, accessibility.passportTryPhotoManually) && Intrinsics.areEqual(this.validatingImage, accessibility.validatingImage) && Intrinsics.areEqual(this.idealFace, accessibility.idealFace) && Intrinsics.areEqual(this.initialisingSdk, accessibility.initialisingSdk) && Intrinsics.areEqual(this.processingConsent, accessibility.processingConsent) && Intrinsics.areEqual(this.manualBtnContDes, accessibility.manualBtnContDes) && Intrinsics.areEqual(this.closeBtnContDes, accessibility.closeBtnContDes) && Intrinsics.areEqual(this.helpBtnContDes, accessibility.helpBtnContDes) && Intrinsics.areEqual(this.backBtnContDes, accessibility.backBtnContDes) && Intrinsics.areEqual(this.selectCheckBox, accessibility.selectCheckBox) && Intrinsics.areEqual(this.unselectCheckBox, accessibility.unselectCheckBox);
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((((((((((((((((((((((((((this.holdPhoneFront.hashCode() * 31) + this.alignFaceFrame.hashCode()) * 31) + this.movePhoneRight.hashCode()) * 31) + this.movePhoneLeft.hashCode()) * 31) + this.movePhoneUp.hashCode()) * 31) + this.movePhoneDown.hashCode()) * 31) + this.noCardDetected.hashCode()) * 31) + this.noPassportDetected.hashCode()) * 31) + this.idLookingGood.hashCode()) * 31) + this.faceIsSmall.hashCode()) * 31) + this.movePhoneFrontLowEndDevice.hashCode()) * 31) + this.focusCameraId.hashCode()) * 31) + this.flipIdBarcode.hashCode()) * 31) + this.focusCameraPassport.hashCode()) * 31) + this.movePhoneFront.hashCode()) * 31) + this.frontBackTryPhotoManually.hashCode()) * 31) + this.passportTryPhotoManually.hashCode()) * 31) + this.validatingImage.hashCode()) * 31) + this.idealFace.hashCode()) * 31) + this.initialisingSdk.hashCode()) * 31) + this.processingConsent.hashCode()) * 31) + this.manualBtnContDes.hashCode()) * 31) + this.closeBtnContDes.hashCode()) * 31) + this.helpBtnContDes.hashCode()) * 31) + this.backBtnContDes.hashCode()) * 31) + this.selectCheckBox.hashCode()) * 31) + this.unselectCheckBox.hashCode();
    }

    public String toString() {
        return "Accessibility(holdPhoneFront=" + this.holdPhoneFront + ", alignFaceFrame=" + this.alignFaceFrame + ", movePhoneRight=" + this.movePhoneRight + ", movePhoneLeft=" + this.movePhoneLeft + ", movePhoneUp=" + this.movePhoneUp + ", movePhoneDown=" + this.movePhoneDown + ", noCardDetected=" + this.noCardDetected + ", noPassportDetected=" + this.noPassportDetected + ", idLookingGood=" + this.idLookingGood + ", faceIsSmall=" + this.faceIsSmall + ", movePhoneFrontLowEndDevice=" + this.movePhoneFrontLowEndDevice + ", focusCameraId=" + this.focusCameraId + ", flipIdBarcode=" + this.flipIdBarcode + ", focusCameraPassport=" + this.focusCameraPassport + ", movePhoneFront=" + this.movePhoneFront + ", frontBackTryPhotoManually=" + this.frontBackTryPhotoManually + ", passportTryPhotoManually=" + this.passportTryPhotoManually + ", validatingImage=" + this.validatingImage + ", idealFace=" + this.idealFace + ", initialisingSdk=" + this.initialisingSdk + ", processingConsent=" + this.processingConsent + ", manualBtnContDes=" + this.manualBtnContDes + ", closeBtnContDes=" + this.closeBtnContDes + ", helpBtnContDes=" + this.helpBtnContDes + ", backBtnContDes=" + this.backBtnContDes + ", selectCheckBox=" + this.selectCheckBox + ", unselectCheckBox=" + this.unselectCheckBox + ")";
    }

    public Accessibility(@Json(name = "holdPhoneFront") String holdPhoneFront, @Json(name = "alignFaceFrame") String alignFaceFrame, @Json(name = "movePhoneRight") String movePhoneRight, @Json(name = "movePhoneLeft") String movePhoneLeft, @Json(name = "movePhoneUp") String movePhoneUp, @Json(name = "movePhoneDown") String movePhoneDown, @Json(name = "noCardDetected") String noCardDetected, @Json(name = "noPassportDetected") String noPassportDetected, @Json(name = "idLookingGood") String idLookingGood, @Json(name = "faceIsSmall") String faceIsSmall, @Json(name = "movePhoneFrontLowEndDevice") String movePhoneFrontLowEndDevice, @Json(name = "focusCameraId") String focusCameraId, @Json(name = "flipIdBarcode") String flipIdBarcode, @Json(name = "focusCameraPassport") String focusCameraPassport, @Json(name = "movePhoneFront") String movePhoneFront, @Json(name = "frontBackTryPhotoManually") String frontBackTryPhotoManually, @Json(name = "passportTryPhotoManually") String passportTryPhotoManually, @Json(name = "validatingImage") String validatingImage, @Json(name = "idealFace") String idealFace, @Json(name = "initialisingSdk") String initialisingSdk, @Json(name = "processingConsent") String processingConsent, @Json(name = "manualBtnContDes") String manualBtnContDes, @Json(name = "closeBtnContDes") String closeBtnContDes, @Json(name = "helpBtnContDes") String helpBtnContDes, @Json(name = "backBtnContDes") String backBtnContDes, @Json(name = "selectCheckBox") String selectCheckBox, @Json(name = "unselectCheckBox") String unselectCheckBox) {
        Intrinsics.checkNotNullParameter(holdPhoneFront, "holdPhoneFront");
        Intrinsics.checkNotNullParameter(alignFaceFrame, "alignFaceFrame");
        Intrinsics.checkNotNullParameter(movePhoneRight, "movePhoneRight");
        Intrinsics.checkNotNullParameter(movePhoneLeft, "movePhoneLeft");
        Intrinsics.checkNotNullParameter(movePhoneUp, "movePhoneUp");
        Intrinsics.checkNotNullParameter(movePhoneDown, "movePhoneDown");
        Intrinsics.checkNotNullParameter(noCardDetected, "noCardDetected");
        Intrinsics.checkNotNullParameter(noPassportDetected, "noPassportDetected");
        Intrinsics.checkNotNullParameter(idLookingGood, "idLookingGood");
        Intrinsics.checkNotNullParameter(faceIsSmall, "faceIsSmall");
        Intrinsics.checkNotNullParameter(movePhoneFrontLowEndDevice, "movePhoneFrontLowEndDevice");
        Intrinsics.checkNotNullParameter(focusCameraId, "focusCameraId");
        Intrinsics.checkNotNullParameter(flipIdBarcode, "flipIdBarcode");
        Intrinsics.checkNotNullParameter(focusCameraPassport, "focusCameraPassport");
        Intrinsics.checkNotNullParameter(movePhoneFront, "movePhoneFront");
        Intrinsics.checkNotNullParameter(frontBackTryPhotoManually, "frontBackTryPhotoManually");
        Intrinsics.checkNotNullParameter(passportTryPhotoManually, "passportTryPhotoManually");
        Intrinsics.checkNotNullParameter(validatingImage, "validatingImage");
        Intrinsics.checkNotNullParameter(idealFace, "idealFace");
        Intrinsics.checkNotNullParameter(initialisingSdk, "initialisingSdk");
        Intrinsics.checkNotNullParameter(processingConsent, "processingConsent");
        Intrinsics.checkNotNullParameter(manualBtnContDes, "manualBtnContDes");
        Intrinsics.checkNotNullParameter(closeBtnContDes, "closeBtnContDes");
        Intrinsics.checkNotNullParameter(helpBtnContDes, "helpBtnContDes");
        Intrinsics.checkNotNullParameter(backBtnContDes, "backBtnContDes");
        Intrinsics.checkNotNullParameter(selectCheckBox, "selectCheckBox");
        Intrinsics.checkNotNullParameter(unselectCheckBox, "unselectCheckBox");
        this.holdPhoneFront = holdPhoneFront;
        this.alignFaceFrame = alignFaceFrame;
        this.movePhoneRight = movePhoneRight;
        this.movePhoneLeft = movePhoneLeft;
        this.movePhoneUp = movePhoneUp;
        this.movePhoneDown = movePhoneDown;
        this.noCardDetected = noCardDetected;
        this.noPassportDetected = noPassportDetected;
        this.idLookingGood = idLookingGood;
        this.faceIsSmall = faceIsSmall;
        this.movePhoneFrontLowEndDevice = movePhoneFrontLowEndDevice;
        this.focusCameraId = focusCameraId;
        this.flipIdBarcode = flipIdBarcode;
        this.focusCameraPassport = focusCameraPassport;
        this.movePhoneFront = movePhoneFront;
        this.frontBackTryPhotoManually = frontBackTryPhotoManually;
        this.passportTryPhotoManually = passportTryPhotoManually;
        this.validatingImage = validatingImage;
        this.idealFace = idealFace;
        this.initialisingSdk = initialisingSdk;
        this.processingConsent = processingConsent;
        this.manualBtnContDes = manualBtnContDes;
        this.closeBtnContDes = closeBtnContDes;
        this.helpBtnContDes = helpBtnContDes;
        this.backBtnContDes = backBtnContDes;
        this.selectCheckBox = selectCheckBox;
        this.unselectCheckBox = unselectCheckBox;
    }

    public final String getHoldPhoneFront() {
        return this.holdPhoneFront;
    }

    public final void setHoldPhoneFront(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.holdPhoneFront = str;
    }

    public final String getAlignFaceFrame() {
        return this.alignFaceFrame;
    }

    public final void setAlignFaceFrame(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.alignFaceFrame = str;
    }

    public final String getMovePhoneRight() {
        return this.movePhoneRight;
    }

    public final void setMovePhoneRight(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.movePhoneRight = str;
    }

    public final String getMovePhoneLeft() {
        return this.movePhoneLeft;
    }

    public final void setMovePhoneLeft(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.movePhoneLeft = str;
    }

    public final String getMovePhoneUp() {
        return this.movePhoneUp;
    }

    public final void setMovePhoneUp(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.movePhoneUp = str;
    }

    public final String getMovePhoneDown() {
        return this.movePhoneDown;
    }

    public final void setMovePhoneDown(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.movePhoneDown = str;
    }

    public final String getNoCardDetected() {
        return this.noCardDetected;
    }

    public final void setNoCardDetected(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.noCardDetected = str;
    }

    public final String getNoPassportDetected() {
        return this.noPassportDetected;
    }

    public final void setNoPassportDetected(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.noPassportDetected = str;
    }

    public final String getIdLookingGood() {
        return this.idLookingGood;
    }

    public final void setIdLookingGood(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.idLookingGood = str;
    }

    public final String getFaceIsSmall() {
        return this.faceIsSmall;
    }

    public final void setFaceIsSmall(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.faceIsSmall = str;
    }

    public final String getMovePhoneFrontLowEndDevice() {
        return this.movePhoneFrontLowEndDevice;
    }

    public final void setMovePhoneFrontLowEndDevice(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.movePhoneFrontLowEndDevice = str;
    }

    public final String getFocusCameraId() {
        return this.focusCameraId;
    }

    public final void setFocusCameraId(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.focusCameraId = str;
    }

    public final String getFlipIdBarcode() {
        return this.flipIdBarcode;
    }

    public final void setFlipIdBarcode(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.flipIdBarcode = str;
    }

    public final String getFocusCameraPassport() {
        return this.focusCameraPassport;
    }

    public final void setFocusCameraPassport(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.focusCameraPassport = str;
    }

    public final String getMovePhoneFront() {
        return this.movePhoneFront;
    }

    public final void setMovePhoneFront(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.movePhoneFront = str;
    }

    public final String getFrontBackTryPhotoManually() {
        return this.frontBackTryPhotoManually;
    }

    public final void setFrontBackTryPhotoManually(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.frontBackTryPhotoManually = str;
    }

    public final String getPassportTryPhotoManually() {
        return this.passportTryPhotoManually;
    }

    public final void setPassportTryPhotoManually(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.passportTryPhotoManually = str;
    }

    public final String getValidatingImage() {
        return this.validatingImage;
    }

    public final void setValidatingImage(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.validatingImage = str;
    }

    public final String getIdealFace() {
        return this.idealFace;
    }

    public final void setIdealFace(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.idealFace = str;
    }

    public final String getInitialisingSdk() {
        return this.initialisingSdk;
    }

    public final void setInitialisingSdk(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.initialisingSdk = str;
    }

    public final String getProcessingConsent() {
        return this.processingConsent;
    }

    public final void setProcessingConsent(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.processingConsent = str;
    }

    public final String getManualBtnContDes() {
        return this.manualBtnContDes;
    }

    public final void setManualBtnContDes(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.manualBtnContDes = str;
    }

    public final String getCloseBtnContDes() {
        return this.closeBtnContDes;
    }

    public final void setCloseBtnContDes(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.closeBtnContDes = str;
    }

    public final String getHelpBtnContDes() {
        return this.helpBtnContDes;
    }

    public final void setHelpBtnContDes(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.helpBtnContDes = str;
    }

    public final String getBackBtnContDes() {
        return this.backBtnContDes;
    }

    public final void setBackBtnContDes(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.backBtnContDes = str;
    }

    public final String getSelectCheckBox() {
        return this.selectCheckBox;
    }

    public final void setSelectCheckBox(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.selectCheckBox = str;
    }

    public final String getUnselectCheckBox() {
        return this.unselectCheckBox;
    }

    public final void setUnselectCheckBox(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.unselectCheckBox = str;
    }
}
