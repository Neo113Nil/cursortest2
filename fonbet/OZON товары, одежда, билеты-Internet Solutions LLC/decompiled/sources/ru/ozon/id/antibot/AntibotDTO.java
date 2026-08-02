package ru.ozon.id.antibot;

import C.o0;
import N3.C3660k;
import Sh.a;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b!\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001Ba\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010!\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0015J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010#\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010\u0019J\u000b\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010%\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010\u0019J\u000b\u0010&\u001a\u0004\u0018\u00010\u0003HÆ\u0003Jz\u0010'\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010(J\u0013\u0010)\u001a\u00020\n2\b\u0010*\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010+\u001a\u00020,HÖ\u0001J\t\u0010-\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0011R\u0015\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\n\n\u0002\u0010\u001a\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0011R\u0015\u0010\f\u001a\u0004\u0018\u00010\n¢\u0006\n\n\u0002\u0010\u001a\u001a\u0004\b\u001c\u0010\u0019R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0011¨\u0006."}, d2 = {"Lru/ozon/id/antibot/AntibotDTO;", "", "incidentId", "", "challengeURL", "captchaURL", "captchaTimeoutMs", "", "errorText", "hideCloseButton", "", "supportURL", "mf", "mfToken", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;)V", "getIncidentId", "()Ljava/lang/String;", "getChallengeURL", "getCaptchaURL", "getCaptchaTimeoutMs", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getErrorText", "getHideCloseButton", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getSupportURL", "getMf", "getMfToken", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;)Lru/ozon/id/antibot/AntibotDTO;", "equals", "other", "hashCode", "", "toString", "ozon-id-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class AntibotDTO {
    private final Long captchaTimeoutMs;
    private final String captchaURL;
    private final String challengeURL;
    private final String errorText;
    private final Boolean hideCloseButton;
    private final String incidentId;
    private final Boolean mf;
    private final String mfToken;
    private final String supportURL;

    public AntibotDTO(String str, String str2, String str3, Long l11, String str4, Boolean bool, String str5, Boolean bool2, String str6) {
        this.incidentId = str;
        this.challengeURL = str2;
        this.captchaURL = str3;
        this.captchaTimeoutMs = l11;
        this.errorText = str4;
        this.hideCloseButton = bool;
        this.supportURL = str5;
        this.mf = bool2;
        this.mfToken = str6;
    }

    public static /* synthetic */ AntibotDTO copy$default(AntibotDTO antibotDTO, String str, String str2, String str3, Long l11, String str4, Boolean bool, String str5, Boolean bool2, String str6, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = antibotDTO.incidentId;
        }
        if ((i11 & 2) != 0) {
            str2 = antibotDTO.challengeURL;
        }
        if ((i11 & 4) != 0) {
            str3 = antibotDTO.captchaURL;
        }
        if ((i11 & 8) != 0) {
            l11 = antibotDTO.captchaTimeoutMs;
        }
        if ((i11 & 16) != 0) {
            str4 = antibotDTO.errorText;
        }
        if ((i11 & 32) != 0) {
            bool = antibotDTO.hideCloseButton;
        }
        if ((i11 & 64) != 0) {
            str5 = antibotDTO.supportURL;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
            bool2 = antibotDTO.mf;
        }
        if ((i11 & 256) != 0) {
            str6 = antibotDTO.mfToken;
        }
        Boolean bool3 = bool2;
        String str7 = str6;
        Boolean bool4 = bool;
        String str8 = str5;
        String str9 = str4;
        String str10 = str3;
        return antibotDTO.copy(str, str2, str10, l11, str9, bool4, str8, bool3, str7);
    }

    /* renamed from: component1, reason: from getter */
    public final String getIncidentId() {
        return this.incidentId;
    }

    /* renamed from: component2, reason: from getter */
    public final String getChallengeURL() {
        return this.challengeURL;
    }

    /* renamed from: component3, reason: from getter */
    public final String getCaptchaURL() {
        return this.captchaURL;
    }

    /* renamed from: component4, reason: from getter */
    public final Long getCaptchaTimeoutMs() {
        return this.captchaTimeoutMs;
    }

    /* renamed from: component5, reason: from getter */
    public final String getErrorText() {
        return this.errorText;
    }

    /* renamed from: component6, reason: from getter */
    public final Boolean getHideCloseButton() {
        return this.hideCloseButton;
    }

    /* renamed from: component7, reason: from getter */
    public final String getSupportURL() {
        return this.supportURL;
    }

    /* renamed from: component8, reason: from getter */
    public final Boolean getMf() {
        return this.mf;
    }

    /* renamed from: component9, reason: from getter */
    public final String getMfToken() {
        return this.mfToken;
    }

    @NotNull
    public final AntibotDTO copy(String incidentId, String challengeURL, String captchaURL, Long captchaTimeoutMs, String errorText, Boolean hideCloseButton, String supportURL, Boolean mf2, String mfToken) {
        return new AntibotDTO(incidentId, challengeURL, captchaURL, captchaTimeoutMs, errorText, hideCloseButton, supportURL, mf2, mfToken);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AntibotDTO)) {
            return false;
        }
        AntibotDTO antibotDTO = (AntibotDTO) other;
        return Intrinsics.d(this.incidentId, antibotDTO.incidentId) && Intrinsics.d(this.challengeURL, antibotDTO.challengeURL) && Intrinsics.d(this.captchaURL, antibotDTO.captchaURL) && Intrinsics.d(this.captchaTimeoutMs, antibotDTO.captchaTimeoutMs) && Intrinsics.d(this.errorText, antibotDTO.errorText) && Intrinsics.d(this.hideCloseButton, antibotDTO.hideCloseButton) && Intrinsics.d(this.supportURL, antibotDTO.supportURL) && Intrinsics.d(this.mf, antibotDTO.mf) && Intrinsics.d(this.mfToken, antibotDTO.mfToken);
    }

    public final Long getCaptchaTimeoutMs() {
        return this.captchaTimeoutMs;
    }

    public final String getCaptchaURL() {
        return this.captchaURL;
    }

    public final String getChallengeURL() {
        return this.challengeURL;
    }

    public final String getErrorText() {
        return this.errorText;
    }

    public final Boolean getHideCloseButton() {
        return this.hideCloseButton;
    }

    public final String getIncidentId() {
        return this.incidentId;
    }

    public final Boolean getMf() {
        return this.mf;
    }

    public final String getMfToken() {
        return this.mfToken;
    }

    public final String getSupportURL() {
        return this.supportURL;
    }

    public int hashCode() {
        String str = this.incidentId;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.challengeURL;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.captchaURL;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Long l11 = this.captchaTimeoutMs;
        int hashCode4 = (hashCode3 + (l11 == null ? 0 : l11.hashCode())) * 31;
        String str4 = this.errorText;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Boolean bool = this.hideCloseButton;
        int hashCode6 = (hashCode5 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str5 = this.supportURL;
        int hashCode7 = (hashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Boolean bool2 = this.mf;
        int hashCode8 = (hashCode7 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str6 = this.mfToken;
        return hashCode8 + (str6 != null ? str6.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.incidentId;
        String str2 = this.challengeURL;
        String str3 = this.captchaURL;
        Long l11 = this.captchaTimeoutMs;
        String str4 = this.errorText;
        Boolean bool = this.hideCloseButton;
        String str5 = this.supportURL;
        Boolean bool2 = this.mf;
        String str6 = this.mfToken;
        StringBuilder d11 = C3660k.d("AntibotDTO(incidentId=", str, ", challengeURL=", str2, ", captchaURL=");
        d11.append(str3);
        d11.append(", captchaTimeoutMs=");
        d11.append(l11);
        d11.append(", errorText=");
        a.d(bool, str4, ", hideCloseButton=", ", supportURL=", d11);
        a.d(bool2, str5, ", mf=", ", mfToken=", d11);
        return o0.c(d11, str6, ")");
    }
}
