package spay.sdk.domain.model.response;

import I0.C3173b;
import N3.C3660k;
import Nh.a;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b3\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001BÅ\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0013J\u000b\u0010%\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u0003HÆ\u0003JÉ\u0001\u00105\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u00106\u001a\u0002072\b\u00108\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00109\u001a\u00020:HÖ\u0001J\t\u0010;\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0015R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0015R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0015R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0015R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0015R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0015R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0015R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0015R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0015R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0015R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0015R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0015R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0015R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0015¨\u0006<"}, d2 = {"Lspay/sdk/domain/model/response/PaymentOrderResponseBody;", "", "operationId", "", "errorCode", "description", "info", "formUrl", "redirect", "termUrl", "acsUrl", "paReq", "cReq", "threeDSMethodUrl", "threeDSMethodNotificationUrl", "threeDSServerTransId", "threeDSMethodData", "acsRenderingType", "acsSignedContent", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAcsRenderingType", "()Ljava/lang/String;", "getAcsSignedContent", "getAcsUrl", "getCReq", "getDescription", "getErrorCode", "getFormUrl", "getInfo", "getOperationId", "getPaReq", "getRedirect", "getTermUrl", "getThreeDSMethodData", "getThreeDSMethodNotificationUrl", "getThreeDSMethodUrl", "getThreeDSServerTransId", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "", "toString", "SPaySDK_baseRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class PaymentOrderResponseBody {
    private final String acsRenderingType;
    private final String acsSignedContent;
    private final String acsUrl;
    private final String cReq;
    private final String description;
    private final String errorCode;
    private final String formUrl;
    private final String info;
    private final String operationId;
    private final String paReq;
    private final String redirect;
    private final String termUrl;
    private final String threeDSMethodData;
    private final String threeDSMethodNotificationUrl;
    private final String threeDSMethodUrl;
    private final String threeDSServerTransId;

    public PaymentOrderResponseBody() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 65535, null);
    }

    /* renamed from: component1, reason: from getter */
    public final String getOperationId() {
        return this.operationId;
    }

    /* renamed from: component10, reason: from getter */
    public final String getCReq() {
        return this.cReq;
    }

    /* renamed from: component11, reason: from getter */
    public final String getThreeDSMethodUrl() {
        return this.threeDSMethodUrl;
    }

    /* renamed from: component12, reason: from getter */
    public final String getThreeDSMethodNotificationUrl() {
        return this.threeDSMethodNotificationUrl;
    }

    /* renamed from: component13, reason: from getter */
    public final String getThreeDSServerTransId() {
        return this.threeDSServerTransId;
    }

    /* renamed from: component14, reason: from getter */
    public final String getThreeDSMethodData() {
        return this.threeDSMethodData;
    }

    /* renamed from: component15, reason: from getter */
    public final String getAcsRenderingType() {
        return this.acsRenderingType;
    }

    /* renamed from: component16, reason: from getter */
    public final String getAcsSignedContent() {
        return this.acsSignedContent;
    }

    /* renamed from: component2, reason: from getter */
    public final String getErrorCode() {
        return this.errorCode;
    }

    /* renamed from: component3, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* renamed from: component4, reason: from getter */
    public final String getInfo() {
        return this.info;
    }

    /* renamed from: component5, reason: from getter */
    public final String getFormUrl() {
        return this.formUrl;
    }

    /* renamed from: component6, reason: from getter */
    public final String getRedirect() {
        return this.redirect;
    }

    /* renamed from: component7, reason: from getter */
    public final String getTermUrl() {
        return this.termUrl;
    }

    /* renamed from: component8, reason: from getter */
    public final String getAcsUrl() {
        return this.acsUrl;
    }

    /* renamed from: component9, reason: from getter */
    public final String getPaReq() {
        return this.paReq;
    }

    @NotNull
    public final PaymentOrderResponseBody copy(String operationId, String errorCode, String description, String info, String formUrl, String redirect, String termUrl, String acsUrl, String paReq, String cReq, String threeDSMethodUrl, String threeDSMethodNotificationUrl, String threeDSServerTransId, String threeDSMethodData, String acsRenderingType, String acsSignedContent) {
        return new PaymentOrderResponseBody(operationId, errorCode, description, info, formUrl, redirect, termUrl, acsUrl, paReq, cReq, threeDSMethodUrl, threeDSMethodNotificationUrl, threeDSServerTransId, threeDSMethodData, acsRenderingType, acsSignedContent);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PaymentOrderResponseBody)) {
            return false;
        }
        PaymentOrderResponseBody paymentOrderResponseBody = (PaymentOrderResponseBody) other;
        return Intrinsics.d(this.operationId, paymentOrderResponseBody.operationId) && Intrinsics.d(this.errorCode, paymentOrderResponseBody.errorCode) && Intrinsics.d(this.description, paymentOrderResponseBody.description) && Intrinsics.d(this.info, paymentOrderResponseBody.info) && Intrinsics.d(this.formUrl, paymentOrderResponseBody.formUrl) && Intrinsics.d(this.redirect, paymentOrderResponseBody.redirect) && Intrinsics.d(this.termUrl, paymentOrderResponseBody.termUrl) && Intrinsics.d(this.acsUrl, paymentOrderResponseBody.acsUrl) && Intrinsics.d(this.paReq, paymentOrderResponseBody.paReq) && Intrinsics.d(this.cReq, paymentOrderResponseBody.cReq) && Intrinsics.d(this.threeDSMethodUrl, paymentOrderResponseBody.threeDSMethodUrl) && Intrinsics.d(this.threeDSMethodNotificationUrl, paymentOrderResponseBody.threeDSMethodNotificationUrl) && Intrinsics.d(this.threeDSServerTransId, paymentOrderResponseBody.threeDSServerTransId) && Intrinsics.d(this.threeDSMethodData, paymentOrderResponseBody.threeDSMethodData) && Intrinsics.d(this.acsRenderingType, paymentOrderResponseBody.acsRenderingType) && Intrinsics.d(this.acsSignedContent, paymentOrderResponseBody.acsSignedContent);
    }

    public final String getAcsRenderingType() {
        return this.acsRenderingType;
    }

    public final String getAcsSignedContent() {
        return this.acsSignedContent;
    }

    public final String getAcsUrl() {
        return this.acsUrl;
    }

    public final String getCReq() {
        return this.cReq;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getErrorCode() {
        return this.errorCode;
    }

    public final String getFormUrl() {
        return this.formUrl;
    }

    public final String getInfo() {
        return this.info;
    }

    public final String getOperationId() {
        return this.operationId;
    }

    public final String getPaReq() {
        return this.paReq;
    }

    public final String getRedirect() {
        return this.redirect;
    }

    public final String getTermUrl() {
        return this.termUrl;
    }

    public final String getThreeDSMethodData() {
        return this.threeDSMethodData;
    }

    public final String getThreeDSMethodNotificationUrl() {
        return this.threeDSMethodNotificationUrl;
    }

    public final String getThreeDSMethodUrl() {
        return this.threeDSMethodUrl;
    }

    public final String getThreeDSServerTransId() {
        return this.threeDSServerTransId;
    }

    public int hashCode() {
        String str = this.operationId;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.errorCode;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.description;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.info;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.formUrl;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.redirect;
        int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.termUrl;
        int hashCode7 = (hashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.acsUrl;
        int hashCode8 = (hashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.paReq;
        int hashCode9 = (hashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.cReq;
        int hashCode10 = (hashCode9 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.threeDSMethodUrl;
        int hashCode11 = (hashCode10 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.threeDSMethodNotificationUrl;
        int hashCode12 = (hashCode11 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.threeDSServerTransId;
        int hashCode13 = (hashCode12 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.threeDSMethodData;
        int hashCode14 = (hashCode13 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.acsRenderingType;
        int hashCode15 = (hashCode14 + (str15 == null ? 0 : str15.hashCode())) * 31;
        String str16 = this.acsSignedContent;
        return hashCode15 + (str16 != null ? str16.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.operationId;
        String str2 = this.errorCode;
        String str3 = this.description;
        String str4 = this.info;
        String str5 = this.formUrl;
        String str6 = this.redirect;
        String str7 = this.termUrl;
        String str8 = this.acsUrl;
        String str9 = this.paReq;
        String str10 = this.cReq;
        String str11 = this.threeDSMethodUrl;
        String str12 = this.threeDSMethodNotificationUrl;
        String str13 = this.threeDSServerTransId;
        String str14 = this.threeDSMethodData;
        String str15 = this.acsRenderingType;
        String str16 = this.acsSignedContent;
        StringBuilder d11 = C3660k.d("PaymentOrderResponseBody(operationId=", str, ", errorCode=", str2, ", description=");
        a.h(d11, str3, ", info=", str4, ", formUrl=");
        a.h(d11, str5, ", redirect=", str6, ", termUrl=");
        a.h(d11, str7, ", acsUrl=", str8, ", paReq=");
        a.h(d11, str9, ", cReq=", str10, ", threeDSMethodUrl=");
        a.h(d11, str11, ", threeDSMethodNotificationUrl=", str12, ", threeDSServerTransId=");
        a.h(d11, str13, ", threeDSMethodData=", str14, ", acsRenderingType=");
        return C3173b.c(d11, str15, ", acsSignedContent=", str16, ")");
    }

    public PaymentOrderResponseBody(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16) {
        this.operationId = str;
        this.errorCode = str2;
        this.description = str3;
        this.info = str4;
        this.formUrl = str5;
        this.redirect = str6;
        this.termUrl = str7;
        this.acsUrl = str8;
        this.paReq = str9;
        this.cReq = str10;
        this.threeDSMethodUrl = str11;
        this.threeDSMethodNotificationUrl = str12;
        this.threeDSServerTransId = str13;
        this.threeDSMethodData = str14;
        this.acsRenderingType = str15;
        this.acsSignedContent = str16;
    }

    public /* synthetic */ PaymentOrderResponseBody(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? null : str3, (i11 & 8) != 0 ? null : str4, (i11 & 16) != 0 ? null : str5, (i11 & 32) != 0 ? null : str6, (i11 & 64) != 0 ? null : str7, (i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? null : str8, (i11 & 256) != 0 ? null : str9, (i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? null : str10, (i11 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? null : str11, (i11 & 2048) != 0 ? null : str12, (i11 & 4096) != 0 ? null : str13, (i11 & 8192) != 0 ? null : str14, (i11 & 16384) != 0 ? null : str15, (i11 & 32768) != 0 ? null : str16);
    }
}
