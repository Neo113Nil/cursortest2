package ru.ozon.fintech.features.finwebview.domain.nativebridge.groups.camera;

import C.o0;
import G.g;
import I1.w;
import Kk.C3532b;
import Nh.a;
import androidx.annotation.Keep;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.squareup.moshi.i;
import com.squareup.moshi.j;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@j(generateAdapter = true)
@Keep
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b \n\u0002\u0010\b\n\u0002\b\u001b\b\u0081\b\u0018\u0000 M2\u00020\u0001:\u0001NBË\u0001\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0003\u0010\b\u001a\u00020\u0005\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0003\u0010\n\u001a\u00020\u0005\u0012\b\b\u0003\u0010\u000b\u001a\u00020\u0005\u0012\b\b\u0003\u0010\f\u001a\u00020\u0002\u0012\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\b\u0003\u0010\u0011\u001a\u00020\u0002\u0012\n\b\u0003\u0010\u0012\u001a\u0004\u0018\u00010\u0005\u0012\u0010\b\u0003\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0013\u0012\n\b\u0003\u0010\u0015\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\u0016\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0017\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001eJ\u0010\u0010 \u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b \u0010\u001eJ\u0012\u0010!\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\u001bJ\u0010\u0010\"\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\"\u0010\u001eJ\u0010\u0010#\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b#\u0010\u001eJ\u0010\u0010$\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b$\u0010%J\u0012\u0010&\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b&\u0010'J\u0012\u0010(\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0004\b(\u0010)J\u0010\u0010*\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b*\u0010%J\u0012\u0010+\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b+\u0010\u001eJ\u0018\u0010,\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0013HÆ\u0003¢\u0006\u0004\b,\u0010-J\u0012\u0010.\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b.\u0010\u001eJ\u0012\u0010/\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b/\u0010\u001bJ\u0012\u00100\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b0\u0010\u001eJÔ\u0001\u00101\u001a\u00020\u00002\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\b\u0003\u0010\u0006\u001a\u00020\u00052\b\b\u0003\u0010\u0007\u001a\u00020\u00052\b\b\u0003\u0010\b\u001a\u00020\u00052\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u00022\b\b\u0003\u0010\n\u001a\u00020\u00052\b\b\u0003\u0010\u000b\u001a\u00020\u00052\b\b\u0003\u0010\f\u001a\u00020\u00022\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\b\u0003\u0010\u0011\u001a\u00020\u00022\n\b\u0003\u0010\u0012\u001a\u0004\u0018\u00010\u00052\u0010\b\u0003\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00132\n\b\u0003\u0010\u0015\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0016\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0017\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b1\u00102J\u0010\u00103\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b3\u0010\u001eJ\u0010\u00105\u001a\u000204HÖ\u0001¢\u0006\u0004\b5\u00106J\u001a\u00108\u001a\u00020\u00022\b\u00107\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b8\u00109R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010:\u001a\u0004\b\u0003\u0010\u001bR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010:\u001a\u0004\b\u0004\u0010\u001bR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010;\u001a\u0004\b<\u0010\u001eR\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010;\u001a\u0004\b=\u0010\u001eR\u0017\u0010\b\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\b\u0010;\u001a\u0004\b>\u0010\u001eR\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010:\u001a\u0004\b?\u0010\u001bR\u0017\u0010\n\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\n\u0010;\u001a\u0004\b@\u0010\u001eR\u0017\u0010\u000b\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u000b\u0010;\u001a\u0004\bA\u0010\u001eR\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010B\u001a\u0004\b\f\u0010%R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010C\u001a\u0004\bD\u0010'R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010E\u001a\u0004\bF\u0010)R\u0017\u0010\u0011\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010B\u001a\u0004\b\u0011\u0010%R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0012\u0010;\u001a\u0004\bG\u0010\u001eR\u001f\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010H\u001a\u0004\bI\u0010-R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0015\u0010;\u001a\u0004\bJ\u0010\u001eR\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010:\u001a\u0004\bK\u0010\u001bR\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0017\u0010;\u001a\u0004\bL\u0010\u001e¨\u0006O"}, d2 = {"Lru/ozon/fintech/features/finwebview/domain/nativebridge/groups/camera/TakePhotoRequest;", "", "", "isNeedFrame", "isNeedQrFrame", "", "confirmTitle", "certificate", "qrAction", "qrADetectAutoClose", "scannerType", "previewCameraTitle", "isBack", "Lru/ozon/fintech/features/finwebview/domain/nativebridge/groups/camera/CameraTipsOptions;", "tipsOptions", "Lru/ozon/fintech/features/finwebview/domain/nativebridge/groups/camera/VideoOptions;", "videoOptions", "isRegFrame", "phoneNumberRegex", "", "barcodeFormats", "qrButtonText", "roundFaceFrameEnabled", "publicKey", "<init>", "(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;ZLru/ozon/fintech/features/finwebview/domain/nativebridge/groups/camera/CameraTipsOptions;Lru/ozon/fintech/features/finwebview/domain/nativebridge/groups/camera/VideoOptions;ZLjava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;)V", "component1", "()Ljava/lang/Boolean;", "component2", "component3", "()Ljava/lang/String;", "component4", "component5", "component6", "component7", "component8", "component9", "()Z", "component10", "()Lru/ozon/fintech/features/finwebview/domain/nativebridge/groups/camera/CameraTipsOptions;", "component11", "()Lru/ozon/fintech/features/finwebview/domain/nativebridge/groups/camera/VideoOptions;", "component12", "component13", "component14", "()Ljava/util/List;", "component15", "component16", "component17", "copy", "(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;ZLru/ozon/fintech/features/finwebview/domain/nativebridge/groups/camera/CameraTipsOptions;Lru/ozon/fintech/features/finwebview/domain/nativebridge/groups/camera/VideoOptions;ZLjava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;)Lru/ozon/fintech/features/finwebview/domain/nativebridge/groups/camera/TakePhotoRequest;", "toString", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Boolean;", "Ljava/lang/String;", "getConfirmTitle", "getCertificate", "getQrAction", "getQrADetectAutoClose", "getScannerType", "getPreviewCameraTitle", "Z", "Lru/ozon/fintech/features/finwebview/domain/nativebridge/groups/camera/CameraTipsOptions;", "getTipsOptions", "Lru/ozon/fintech/features/finwebview/domain/nativebridge/groups/camera/VideoOptions;", "getVideoOptions", "getPhoneNumberRegex", "Ljava/util/List;", "getBarcodeFormats", "getQrButtonText", "getRoundFaceFrameEnabled", "getPublicKey", "Companion", "a", "finwebview_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class TakePhotoRequest {

    @NotNull
    public static final String BANK_CARD = "BANK_CARD";

    @NotNull
    public static final String BARCODE_SCANNER_TYPE = "BARCODE";

    @NotNull
    public static final String MIX_SCANNER_TYPE = "MIX";

    @NotNull
    public static final String QR_SCANNER_TYPE = "QR";

    @NotNull
    public static final String TEXT = "TEXT";
    private final List<String> barcodeFormats;

    @NotNull
    private final String certificate;

    @NotNull
    private final String confirmTitle;
    private final boolean isBack;
    private final Boolean isNeedFrame;
    private final Boolean isNeedQrFrame;
    private final boolean isRegFrame;
    private final String phoneNumberRegex;

    @NotNull
    private final String previewCameraTitle;
    private final String publicKey;
    private final Boolean qrADetectAutoClose;

    @NotNull
    private final String qrAction;
    private final String qrButtonText;
    private final Boolean roundFaceFrameEnabled;

    @NotNull
    private final String scannerType;
    private final CameraTipsOptions tipsOptions;
    private final VideoOptions videoOptions;

    public TakePhotoRequest(@i(name = "show_frame") Boolean bool, @i(name = "show_qr_frame") Boolean bool2, @i(name = "photo_confirm_title") @NotNull String confirmTitle, @i(name = "photo_salt") @NotNull String certificate, @i(name = "qr_action") @NotNull String qrAction, @i(name = "qr_detect_autoclose") Boolean bool3, @i(name = "scanner_type") @NotNull String scannerType, @i(name = "preview_camera_title") @NotNull String previewCameraTitle, @i(name = "is_back") boolean z11, @i(name = "tips_options") CameraTipsOptions cameraTipsOptions, @i(name = "video") VideoOptions videoOptions, @i(name = "reg_frame") boolean z12, @i(name = "phone_number_regex") String str, @i(name = "barcode_formats") List<String> list, @i(name = "qr_button_text") String str2, @i(name = "round_face_frame_enabled") Boolean bool4, @i(name = "public_key") String str3) {
        Intrinsics.checkNotNullParameter(confirmTitle, "confirmTitle");
        Intrinsics.checkNotNullParameter(certificate, "certificate");
        Intrinsics.checkNotNullParameter(qrAction, "qrAction");
        Intrinsics.checkNotNullParameter(scannerType, "scannerType");
        Intrinsics.checkNotNullParameter(previewCameraTitle, "previewCameraTitle");
        this.isNeedFrame = bool;
        this.isNeedQrFrame = bool2;
        this.confirmTitle = confirmTitle;
        this.certificate = certificate;
        this.qrAction = qrAction;
        this.qrADetectAutoClose = bool3;
        this.scannerType = scannerType;
        this.previewCameraTitle = previewCameraTitle;
        this.isBack = z11;
        this.tipsOptions = cameraTipsOptions;
        this.videoOptions = videoOptions;
        this.isRegFrame = z12;
        this.phoneNumberRegex = str;
        this.barcodeFormats = list;
        this.qrButtonText = str2;
        this.roundFaceFrameEnabled = bool4;
        this.publicKey = str3;
    }

    public static /* synthetic */ TakePhotoRequest copy$default(TakePhotoRequest takePhotoRequest, Boolean bool, Boolean bool2, String str, String str2, String str3, Boolean bool3, String str4, String str5, boolean z11, CameraTipsOptions cameraTipsOptions, VideoOptions videoOptions, boolean z12, String str6, List list, String str7, Boolean bool4, String str8, int i11, Object obj) {
        String str9;
        Boolean bool5;
        Boolean bool6;
        TakePhotoRequest takePhotoRequest2;
        String str10;
        Boolean bool7;
        String str11;
        String str12;
        String str13;
        Boolean bool8;
        String str14;
        String str15;
        boolean z13;
        CameraTipsOptions cameraTipsOptions2;
        VideoOptions videoOptions2;
        boolean z14;
        String str16;
        List list2;
        Boolean bool9 = (i11 & 1) != 0 ? takePhotoRequest.isNeedFrame : bool;
        Boolean bool10 = (i11 & 2) != 0 ? takePhotoRequest.isNeedQrFrame : bool2;
        String str17 = (i11 & 4) != 0 ? takePhotoRequest.confirmTitle : str;
        String str18 = (i11 & 8) != 0 ? takePhotoRequest.certificate : str2;
        String str19 = (i11 & 16) != 0 ? takePhotoRequest.qrAction : str3;
        Boolean bool11 = (i11 & 32) != 0 ? takePhotoRequest.qrADetectAutoClose : bool3;
        String str20 = (i11 & 64) != 0 ? takePhotoRequest.scannerType : str4;
        String str21 = (i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? takePhotoRequest.previewCameraTitle : str5;
        boolean z15 = (i11 & 256) != 0 ? takePhotoRequest.isBack : z11;
        CameraTipsOptions cameraTipsOptions3 = (i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? takePhotoRequest.tipsOptions : cameraTipsOptions;
        VideoOptions videoOptions3 = (i11 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? takePhotoRequest.videoOptions : videoOptions;
        boolean z16 = (i11 & 2048) != 0 ? takePhotoRequest.isRegFrame : z12;
        String str22 = (i11 & 4096) != 0 ? takePhotoRequest.phoneNumberRegex : str6;
        List list3 = (i11 & 8192) != 0 ? takePhotoRequest.barcodeFormats : list;
        Boolean bool12 = bool9;
        String str23 = (i11 & 16384) != 0 ? takePhotoRequest.qrButtonText : str7;
        Boolean bool13 = (i11 & 32768) != 0 ? takePhotoRequest.roundFaceFrameEnabled : bool4;
        if ((i11 & 65536) != 0) {
            bool5 = bool13;
            str9 = takePhotoRequest.publicKey;
            str10 = str23;
            bool7 = bool10;
            str11 = str17;
            str12 = str18;
            str13 = str19;
            bool8 = bool11;
            str14 = str20;
            str15 = str21;
            z13 = z15;
            cameraTipsOptions2 = cameraTipsOptions3;
            videoOptions2 = videoOptions3;
            z14 = z16;
            str16 = str22;
            list2 = list3;
            bool6 = bool12;
            takePhotoRequest2 = takePhotoRequest;
        } else {
            str9 = str8;
            bool5 = bool13;
            bool6 = bool12;
            takePhotoRequest2 = takePhotoRequest;
            str10 = str23;
            bool7 = bool10;
            str11 = str17;
            str12 = str18;
            str13 = str19;
            bool8 = bool11;
            str14 = str20;
            str15 = str21;
            z13 = z15;
            cameraTipsOptions2 = cameraTipsOptions3;
            videoOptions2 = videoOptions3;
            z14 = z16;
            str16 = str22;
            list2 = list3;
        }
        return takePhotoRequest2.copy(bool6, bool7, str11, str12, str13, bool8, str14, str15, z13, cameraTipsOptions2, videoOptions2, z14, str16, list2, str10, bool5, str9);
    }

    /* renamed from: component1, reason: from getter */
    public final Boolean getIsNeedFrame() {
        return this.isNeedFrame;
    }

    /* renamed from: component10, reason: from getter */
    public final CameraTipsOptions getTipsOptions() {
        return this.tipsOptions;
    }

    /* renamed from: component11, reason: from getter */
    public final VideoOptions getVideoOptions() {
        return this.videoOptions;
    }

    /* renamed from: component12, reason: from getter */
    public final boolean getIsRegFrame() {
        return this.isRegFrame;
    }

    /* renamed from: component13, reason: from getter */
    public final String getPhoneNumberRegex() {
        return this.phoneNumberRegex;
    }

    public final List<String> component14() {
        return this.barcodeFormats;
    }

    /* renamed from: component15, reason: from getter */
    public final String getQrButtonText() {
        return this.qrButtonText;
    }

    /* renamed from: component16, reason: from getter */
    public final Boolean getRoundFaceFrameEnabled() {
        return this.roundFaceFrameEnabled;
    }

    /* renamed from: component17, reason: from getter */
    public final String getPublicKey() {
        return this.publicKey;
    }

    /* renamed from: component2, reason: from getter */
    public final Boolean getIsNeedQrFrame() {
        return this.isNeedQrFrame;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getConfirmTitle() {
        return this.confirmTitle;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final String getCertificate() {
        return this.certificate;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final String getQrAction() {
        return this.qrAction;
    }

    /* renamed from: component6, reason: from getter */
    public final Boolean getQrADetectAutoClose() {
        return this.qrADetectAutoClose;
    }

    @NotNull
    /* renamed from: component7, reason: from getter */
    public final String getScannerType() {
        return this.scannerType;
    }

    @NotNull
    /* renamed from: component8, reason: from getter */
    public final String getPreviewCameraTitle() {
        return this.previewCameraTitle;
    }

    /* renamed from: component9, reason: from getter */
    public final boolean getIsBack() {
        return this.isBack;
    }

    @NotNull
    public final TakePhotoRequest copy(@i(name = "show_frame") Boolean isNeedFrame, @i(name = "show_qr_frame") Boolean isNeedQrFrame, @i(name = "photo_confirm_title") @NotNull String confirmTitle, @i(name = "photo_salt") @NotNull String certificate, @i(name = "qr_action") @NotNull String qrAction, @i(name = "qr_detect_autoclose") Boolean qrADetectAutoClose, @i(name = "scanner_type") @NotNull String scannerType, @i(name = "preview_camera_title") @NotNull String previewCameraTitle, @i(name = "is_back") boolean isBack, @i(name = "tips_options") CameraTipsOptions tipsOptions, @i(name = "video") VideoOptions videoOptions, @i(name = "reg_frame") boolean isRegFrame, @i(name = "phone_number_regex") String phoneNumberRegex, @i(name = "barcode_formats") List<String> barcodeFormats, @i(name = "qr_button_text") String qrButtonText, @i(name = "round_face_frame_enabled") Boolean roundFaceFrameEnabled, @i(name = "public_key") String publicKey) {
        Intrinsics.checkNotNullParameter(confirmTitle, "confirmTitle");
        Intrinsics.checkNotNullParameter(certificate, "certificate");
        Intrinsics.checkNotNullParameter(qrAction, "qrAction");
        Intrinsics.checkNotNullParameter(scannerType, "scannerType");
        Intrinsics.checkNotNullParameter(previewCameraTitle, "previewCameraTitle");
        return new TakePhotoRequest(isNeedFrame, isNeedQrFrame, confirmTitle, certificate, qrAction, qrADetectAutoClose, scannerType, previewCameraTitle, isBack, tipsOptions, videoOptions, isRegFrame, phoneNumberRegex, barcodeFormats, qrButtonText, roundFaceFrameEnabled, publicKey);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TakePhotoRequest)) {
            return false;
        }
        TakePhotoRequest takePhotoRequest = (TakePhotoRequest) other;
        return Intrinsics.d(this.isNeedFrame, takePhotoRequest.isNeedFrame) && Intrinsics.d(this.isNeedQrFrame, takePhotoRequest.isNeedQrFrame) && Intrinsics.d(this.confirmTitle, takePhotoRequest.confirmTitle) && Intrinsics.d(this.certificate, takePhotoRequest.certificate) && Intrinsics.d(this.qrAction, takePhotoRequest.qrAction) && Intrinsics.d(this.qrADetectAutoClose, takePhotoRequest.qrADetectAutoClose) && Intrinsics.d(this.scannerType, takePhotoRequest.scannerType) && Intrinsics.d(this.previewCameraTitle, takePhotoRequest.previewCameraTitle) && this.isBack == takePhotoRequest.isBack && Intrinsics.d(this.tipsOptions, takePhotoRequest.tipsOptions) && Intrinsics.d(this.videoOptions, takePhotoRequest.videoOptions) && this.isRegFrame == takePhotoRequest.isRegFrame && Intrinsics.d(this.phoneNumberRegex, takePhotoRequest.phoneNumberRegex) && Intrinsics.d(this.barcodeFormats, takePhotoRequest.barcodeFormats) && Intrinsics.d(this.qrButtonText, takePhotoRequest.qrButtonText) && Intrinsics.d(this.roundFaceFrameEnabled, takePhotoRequest.roundFaceFrameEnabled) && Intrinsics.d(this.publicKey, takePhotoRequest.publicKey);
    }

    public final List<String> getBarcodeFormats() {
        return this.barcodeFormats;
    }

    @NotNull
    public final String getCertificate() {
        return this.certificate;
    }

    @NotNull
    public final String getConfirmTitle() {
        return this.confirmTitle;
    }

    public final String getPhoneNumberRegex() {
        return this.phoneNumberRegex;
    }

    @NotNull
    public final String getPreviewCameraTitle() {
        return this.previewCameraTitle;
    }

    public final String getPublicKey() {
        return this.publicKey;
    }

    public final Boolean getQrADetectAutoClose() {
        return this.qrADetectAutoClose;
    }

    @NotNull
    public final String getQrAction() {
        return this.qrAction;
    }

    public final String getQrButtonText() {
        return this.qrButtonText;
    }

    public final Boolean getRoundFaceFrameEnabled() {
        return this.roundFaceFrameEnabled;
    }

    @NotNull
    public final String getScannerType() {
        return this.scannerType;
    }

    public final CameraTipsOptions getTipsOptions() {
        return this.tipsOptions;
    }

    public final VideoOptions getVideoOptions() {
        return this.videoOptions;
    }

    public int hashCode() {
        Boolean bool = this.isNeedFrame;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Boolean bool2 = this.isNeedQrFrame;
        int a11 = g.a(g.a(g.a((hashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31, 31, this.confirmTitle), 31, this.certificate), 31, this.qrAction);
        Boolean bool3 = this.qrADetectAutoClose;
        int a12 = C3532b.a(g.a(g.a((a11 + (bool3 == null ? 0 : bool3.hashCode())) * 31, 31, this.scannerType), 31, this.previewCameraTitle), 31, this.isBack);
        CameraTipsOptions cameraTipsOptions = this.tipsOptions;
        int hashCode2 = (a12 + (cameraTipsOptions == null ? 0 : cameraTipsOptions.hashCode())) * 31;
        VideoOptions videoOptions = this.videoOptions;
        int a13 = C3532b.a((hashCode2 + (videoOptions == null ? 0 : videoOptions.hashCode())) * 31, 31, this.isRegFrame);
        String str = this.phoneNumberRegex;
        int hashCode3 = (a13 + (str == null ? 0 : str.hashCode())) * 31;
        List<String> list = this.barcodeFormats;
        int hashCode4 = (hashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        String str2 = this.qrButtonText;
        int hashCode5 = (hashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool4 = this.roundFaceFrameEnabled;
        int hashCode6 = (hashCode5 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        String str3 = this.publicKey;
        return hashCode6 + (str3 != null ? str3.hashCode() : 0);
    }

    public final boolean isBack() {
        return this.isBack;
    }

    public final Boolean isNeedFrame() {
        return this.isNeedFrame;
    }

    public final Boolean isNeedQrFrame() {
        return this.isNeedQrFrame;
    }

    public final boolean isRegFrame() {
        return this.isRegFrame;
    }

    @NotNull
    public String toString() {
        Boolean bool = this.isNeedFrame;
        Boolean bool2 = this.isNeedQrFrame;
        String str = this.confirmTitle;
        String str2 = this.certificate;
        String str3 = this.qrAction;
        Boolean bool3 = this.qrADetectAutoClose;
        String str4 = this.scannerType;
        String str5 = this.previewCameraTitle;
        boolean z11 = this.isBack;
        CameraTipsOptions cameraTipsOptions = this.tipsOptions;
        VideoOptions videoOptions = this.videoOptions;
        boolean z12 = this.isRegFrame;
        String str6 = this.phoneNumberRegex;
        List<String> list = this.barcodeFormats;
        String str7 = this.qrButtonText;
        Boolean bool4 = this.roundFaceFrameEnabled;
        String str8 = this.publicKey;
        StringBuilder sb2 = new StringBuilder("TakePhotoRequest(isNeedFrame=");
        sb2.append(bool);
        sb2.append(", isNeedQrFrame=");
        sb2.append(bool2);
        sb2.append(", confirmTitle=");
        a.h(sb2, str, ", certificate=", str2, ", qrAction=");
        Sh.a.d(bool3, str3, ", qrADetectAutoClose=", ", scannerType=", sb2);
        a.h(sb2, str4, ", previewCameraTitle=", str5, ", isBack=");
        sb2.append(z11);
        sb2.append(", tipsOptions=");
        sb2.append(cameraTipsOptions);
        sb2.append(", videoOptions=");
        sb2.append(videoOptions);
        sb2.append(", isRegFrame=");
        sb2.append(z12);
        sb2.append(", phoneNumberRegex=");
        w.d(str6, ", barcodeFormats=", ", qrButtonText=", sb2, list);
        Sh.a.d(bool4, str7, ", roundFaceFrameEnabled=", ", publicKey=", sb2);
        return o0.c(sb2, str8, ")");
    }

    public /* synthetic */ TakePhotoRequest(Boolean bool, Boolean bool2, String str, String str2, String str3, Boolean bool3, String str4, String str5, boolean z11, CameraTipsOptions cameraTipsOptions, VideoOptions videoOptions, boolean z12, String str6, List list, String str7, Boolean bool4, String str8, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(bool, bool2, str, str2, (i11 & 16) != 0 ? "" : str3, bool3, (i11 & 64) != 0 ? "" : str4, (i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? "" : str5, (i11 & 256) != 0 ? true : z11, (i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? null : cameraTipsOptions, (i11 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? null : videoOptions, (i11 & 2048) != 0 ? false : z12, (i11 & 4096) != 0 ? null : str6, (i11 & 8192) != 0 ? null : list, (i11 & 16384) != 0 ? null : str7, (32768 & i11) != 0 ? null : bool4, (i11 & 65536) != 0 ? null : str8);
    }
}
