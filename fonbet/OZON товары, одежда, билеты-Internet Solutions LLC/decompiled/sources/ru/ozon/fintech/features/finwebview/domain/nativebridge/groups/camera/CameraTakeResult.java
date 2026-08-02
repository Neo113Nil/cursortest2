package ru.ozon.fintech.features.finwebview.domain.nativebridge.groups.camera;

import Cm.e;
import G.g;
import N3.C3660k;
import Nh.a;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.squareup.moshi.i;
import com.squareup.moshi.j;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u001b\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001Bi\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0003\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\b\u0012\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\bHÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\"\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0002\u0010\u0019Jp\u0010#\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00032\u0010\b\u0003\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\b2\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\fHÆ\u0001¢\u0006\u0002\u0010$J\u0013\u0010%\u001a\u00020\f2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010'\u001a\u00020(HÖ\u0001J\t\u0010)\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u0019\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0010R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0010R\u0015\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\n\n\u0002\u0010\u001a\u001a\u0004\b\u0018\u0010\u0019¨\u0006*"}, d2 = {"Lru/ozon/fintech/features/finwebview/domain/nativebridge/groups/camera/CameraTakeResult;", "", "photoBase64", "", "photoHash", "qrValue", "qrRawData", "phoneNumbers", "", "bankCardNumber", "videoFileKey", "qrButtonClicked", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V", "getPhotoBase64", "()Ljava/lang/String;", "getPhotoHash", "getQrValue", "getQrRawData", "getPhoneNumbers", "()Ljava/util/List;", "getBankCardNumber", "getVideoFileKey", "getQrButtonClicked", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)Lru/ozon/fintech/features/finwebview/domain/nativebridge/groups/camera/CameraTakeResult;", "equals", "other", "hashCode", "", "toString", "finwebview_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class CameraTakeResult {
    private final String bankCardNumber;
    private final List<String> phoneNumbers;

    @NotNull
    private final String photoBase64;

    @NotNull
    private final String photoHash;
    private final Boolean qrButtonClicked;
    private final String qrRawData;
    private final String qrValue;
    private final String videoFileKey;

    public CameraTakeResult(@i(name = "photo_base64") @NotNull String photoBase64, @i(name = "photo_hmac_base64") @NotNull String photoHash, @i(name = "qr_result") String str, @i(name = "qr_base64") String str2, @i(name = "phone_numbers") List<String> list, @i(name = "bank_card_number") String str3, @i(name = "video_file_key") String str4, @i(name = "qr_button_clicked") Boolean bool) {
        Intrinsics.checkNotNullParameter(photoBase64, "photoBase64");
        Intrinsics.checkNotNullParameter(photoHash, "photoHash");
        this.photoBase64 = photoBase64;
        this.photoHash = photoHash;
        this.qrValue = str;
        this.qrRawData = str2;
        this.phoneNumbers = list;
        this.bankCardNumber = str3;
        this.videoFileKey = str4;
        this.qrButtonClicked = bool;
    }

    public static /* synthetic */ CameraTakeResult copy$default(CameraTakeResult cameraTakeResult, String str, String str2, String str3, String str4, List list, String str5, String str6, Boolean bool, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = cameraTakeResult.photoBase64;
        }
        if ((i11 & 2) != 0) {
            str2 = cameraTakeResult.photoHash;
        }
        if ((i11 & 4) != 0) {
            str3 = cameraTakeResult.qrValue;
        }
        if ((i11 & 8) != 0) {
            str4 = cameraTakeResult.qrRawData;
        }
        if ((i11 & 16) != 0) {
            list = cameraTakeResult.phoneNumbers;
        }
        if ((i11 & 32) != 0) {
            str5 = cameraTakeResult.bankCardNumber;
        }
        if ((i11 & 64) != 0) {
            str6 = cameraTakeResult.videoFileKey;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
            bool = cameraTakeResult.qrButtonClicked;
        }
        String str7 = str6;
        Boolean bool2 = bool;
        List list2 = list;
        String str8 = str5;
        return cameraTakeResult.copy(str, str2, str3, str4, list2, str8, str7, bool2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getPhotoBase64() {
        return this.photoBase64;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getPhotoHash() {
        return this.photoHash;
    }

    /* renamed from: component3, reason: from getter */
    public final String getQrValue() {
        return this.qrValue;
    }

    /* renamed from: component4, reason: from getter */
    public final String getQrRawData() {
        return this.qrRawData;
    }

    public final List<String> component5() {
        return this.phoneNumbers;
    }

    /* renamed from: component6, reason: from getter */
    public final String getBankCardNumber() {
        return this.bankCardNumber;
    }

    /* renamed from: component7, reason: from getter */
    public final String getVideoFileKey() {
        return this.videoFileKey;
    }

    /* renamed from: component8, reason: from getter */
    public final Boolean getQrButtonClicked() {
        return this.qrButtonClicked;
    }

    @NotNull
    public final CameraTakeResult copy(@i(name = "photo_base64") @NotNull String photoBase64, @i(name = "photo_hmac_base64") @NotNull String photoHash, @i(name = "qr_result") String qrValue, @i(name = "qr_base64") String qrRawData, @i(name = "phone_numbers") List<String> phoneNumbers, @i(name = "bank_card_number") String bankCardNumber, @i(name = "video_file_key") String videoFileKey, @i(name = "qr_button_clicked") Boolean qrButtonClicked) {
        Intrinsics.checkNotNullParameter(photoBase64, "photoBase64");
        Intrinsics.checkNotNullParameter(photoHash, "photoHash");
        return new CameraTakeResult(photoBase64, photoHash, qrValue, qrRawData, phoneNumbers, bankCardNumber, videoFileKey, qrButtonClicked);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CameraTakeResult)) {
            return false;
        }
        CameraTakeResult cameraTakeResult = (CameraTakeResult) other;
        return Intrinsics.d(this.photoBase64, cameraTakeResult.photoBase64) && Intrinsics.d(this.photoHash, cameraTakeResult.photoHash) && Intrinsics.d(this.qrValue, cameraTakeResult.qrValue) && Intrinsics.d(this.qrRawData, cameraTakeResult.qrRawData) && Intrinsics.d(this.phoneNumbers, cameraTakeResult.phoneNumbers) && Intrinsics.d(this.bankCardNumber, cameraTakeResult.bankCardNumber) && Intrinsics.d(this.videoFileKey, cameraTakeResult.videoFileKey) && Intrinsics.d(this.qrButtonClicked, cameraTakeResult.qrButtonClicked);
    }

    public final String getBankCardNumber() {
        return this.bankCardNumber;
    }

    public final List<String> getPhoneNumbers() {
        return this.phoneNumbers;
    }

    @NotNull
    public final String getPhotoBase64() {
        return this.photoBase64;
    }

    @NotNull
    public final String getPhotoHash() {
        return this.photoHash;
    }

    public final Boolean getQrButtonClicked() {
        return this.qrButtonClicked;
    }

    public final String getQrRawData() {
        return this.qrRawData;
    }

    public final String getQrValue() {
        return this.qrValue;
    }

    public final String getVideoFileKey() {
        return this.videoFileKey;
    }

    public int hashCode() {
        int a11 = g.a(this.photoBase64.hashCode() * 31, 31, this.photoHash);
        String str = this.qrValue;
        int hashCode = (a11 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.qrRawData;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<String> list = this.phoneNumbers;
        int hashCode3 = (hashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        String str3 = this.bankCardNumber;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.videoFileKey;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Boolean bool = this.qrButtonClicked;
        return hashCode5 + (bool != null ? bool.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.photoBase64;
        String str2 = this.photoHash;
        String str3 = this.qrValue;
        String str4 = this.qrRawData;
        List<String> list = this.phoneNumbers;
        String str5 = this.bankCardNumber;
        String str6 = this.videoFileKey;
        Boolean bool = this.qrButtonClicked;
        StringBuilder d11 = C3660k.d("CameraTakeResult(photoBase64=", str, ", photoHash=", str2, ", qrValue=");
        a.h(d11, str3, ", qrRawData=", str4, ", phoneNumbers=");
        e.i(", bankCardNumber=", str5, ", videoFileKey=", d11, list);
        d11.append(str6);
        d11.append(", qrButtonClicked=");
        d11.append(bool);
        d11.append(")");
        return d11.toString();
    }

    public /* synthetic */ CameraTakeResult(String str, String str2, String str3, String str4, List list, String str5, String str6, Boolean bool, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i11 & 4) != 0 ? null : str3, (i11 & 8) != 0 ? null : str4, (i11 & 16) != 0 ? null : list, (i11 & 32) != 0 ? null : str5, (i11 & 64) != 0 ? null : str6, (i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? Boolean.FALSE : bool);
    }
}
