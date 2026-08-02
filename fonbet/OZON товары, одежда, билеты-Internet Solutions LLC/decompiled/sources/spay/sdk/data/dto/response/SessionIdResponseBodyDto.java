package spay.sdk.data.dto.response;

import C.o0;
import J8.b;
import N3.C3660k;
import Nh.a;
import Ve.C4452mn;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import spay.sdk.domain.model.response.SessionIdResponseBody;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\"\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0080\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001Bs\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010\u0010J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u0010\u0010\u001f\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010\u0017J\u000b\u0010 \u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u0010\u0010%\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010\u0017J\u000b\u0010&\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u0092\u0001\u0010)\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0002\u0010*J\u0013\u0010+\u001a\u00020\n2\b\u0010,\u001a\u0004\u0018\u00010-HÖ\u0003J\t\u0010.\u001a\u00020/HÖ\u0001J\b\u00100\u001a\u00020\u0002H\u0016J\t\u00101\u001a\u00020\u0004HÖ\u0001R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0018\u0010\f\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012R\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0012R\u001a\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0018\u001a\u0004\b\t\u0010\u0017R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0012R\u001a\u0010\u000e\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0018\u001a\u0004\b\u001a\u0010\u0017R\u0018\u0010\r\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0012R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0012R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0012¨\u00062"}, d2 = {"Lspay/sdk/data/dto/response/SessionIdResponseBodyDto;", "Lspay/sdk/data/dto/response/DataDtoInterface;", "Lspay/sdk/domain/model/response/SessionIdResponseBody;", "deeplink", "", "state", "sessionId", "clientId", "nonce", "isBnplEnabled", "", "codeChallengeMethod", "codeChallenge", "scope", "refreshTokenIsActive", "clientIdPhone", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;)V", "getClientId", "()Ljava/lang/String;", "getClientIdPhone", "getCodeChallenge", "getCodeChallengeMethod", "getDeeplink", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getNonce", "getRefreshTokenIsActive", "getScope", "getSessionId", "getState", "component1", "component10", "component11", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;)Lspay/sdk/data/dto/response/SessionIdResponseBodyDto;", "equals", "other", "", "hashCode", "", "toModel", "toString", "SPaySDK_baseRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class SessionIdResponseBodyDto implements DataDtoInterface<SessionIdResponseBody> {

    @b("clientId")
    private final String clientId;

    @b("clientIdPhone")
    private final String clientIdPhone;

    @b("codeChallenge")
    private final String codeChallenge;

    @b("codeChallengeMethod")
    private final String codeChallengeMethod;

    @b("deeplink")
    private final String deeplink;

    @b("isBnplEnabled")
    private final Boolean isBnplEnabled;

    @b("nonce")
    private final String nonce;

    @b("refreshTokenIsActive")
    private final Boolean refreshTokenIsActive;

    @b("scope")
    private final String scope;

    @b("sessionId")
    private final String sessionId;

    @b("state")
    private final String state;

    public SessionIdResponseBodyDto(String str, String str2, String str3, String str4, String str5, Boolean bool, String str6, String str7, String str8, Boolean bool2, String str9) {
        this.deeplink = str;
        this.state = str2;
        this.sessionId = str3;
        this.clientId = str4;
        this.nonce = str5;
        this.isBnplEnabled = bool;
        this.codeChallengeMethod = str6;
        this.codeChallenge = str7;
        this.scope = str8;
        this.refreshTokenIsActive = bool2;
        this.clientIdPhone = str9;
    }

    public static /* synthetic */ SessionIdResponseBodyDto copy$default(SessionIdResponseBodyDto sessionIdResponseBodyDto, String str, String str2, String str3, String str4, String str5, Boolean bool, String str6, String str7, String str8, Boolean bool2, String str9, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = sessionIdResponseBodyDto.deeplink;
        }
        if ((i11 & 2) != 0) {
            str2 = sessionIdResponseBodyDto.state;
        }
        if ((i11 & 4) != 0) {
            str3 = sessionIdResponseBodyDto.sessionId;
        }
        if ((i11 & 8) != 0) {
            str4 = sessionIdResponseBodyDto.clientId;
        }
        if ((i11 & 16) != 0) {
            str5 = sessionIdResponseBodyDto.nonce;
        }
        if ((i11 & 32) != 0) {
            bool = sessionIdResponseBodyDto.isBnplEnabled;
        }
        if ((i11 & 64) != 0) {
            str6 = sessionIdResponseBodyDto.codeChallengeMethod;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
            str7 = sessionIdResponseBodyDto.codeChallenge;
        }
        if ((i11 & 256) != 0) {
            str8 = sessionIdResponseBodyDto.scope;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0) {
            bool2 = sessionIdResponseBodyDto.refreshTokenIsActive;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_ALL) != 0) {
            str9 = sessionIdResponseBodyDto.clientIdPhone;
        }
        Boolean bool3 = bool2;
        String str10 = str9;
        String str11 = str7;
        String str12 = str8;
        Boolean bool4 = bool;
        String str13 = str6;
        String str14 = str5;
        String str15 = str3;
        return sessionIdResponseBodyDto.copy(str, str2, str15, str4, str14, bool4, str13, str11, str12, bool3, str10);
    }

    /* renamed from: component1, reason: from getter */
    public final String getDeeplink() {
        return this.deeplink;
    }

    /* renamed from: component10, reason: from getter */
    public final Boolean getRefreshTokenIsActive() {
        return this.refreshTokenIsActive;
    }

    /* renamed from: component11, reason: from getter */
    public final String getClientIdPhone() {
        return this.clientIdPhone;
    }

    /* renamed from: component2, reason: from getter */
    public final String getState() {
        return this.state;
    }

    /* renamed from: component3, reason: from getter */
    public final String getSessionId() {
        return this.sessionId;
    }

    /* renamed from: component4, reason: from getter */
    public final String getClientId() {
        return this.clientId;
    }

    /* renamed from: component5, reason: from getter */
    public final String getNonce() {
        return this.nonce;
    }

    /* renamed from: component6, reason: from getter */
    public final Boolean getIsBnplEnabled() {
        return this.isBnplEnabled;
    }

    /* renamed from: component7, reason: from getter */
    public final String getCodeChallengeMethod() {
        return this.codeChallengeMethod;
    }

    /* renamed from: component8, reason: from getter */
    public final String getCodeChallenge() {
        return this.codeChallenge;
    }

    /* renamed from: component9, reason: from getter */
    public final String getScope() {
        return this.scope;
    }

    @NotNull
    public final SessionIdResponseBodyDto copy(String deeplink, String state, String sessionId, String clientId, String nonce, Boolean isBnplEnabled, String codeChallengeMethod, String codeChallenge, String scope, Boolean refreshTokenIsActive, String clientIdPhone) {
        return new SessionIdResponseBodyDto(deeplink, state, sessionId, clientId, nonce, isBnplEnabled, codeChallengeMethod, codeChallenge, scope, refreshTokenIsActive, clientIdPhone);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SessionIdResponseBodyDto)) {
            return false;
        }
        SessionIdResponseBodyDto sessionIdResponseBodyDto = (SessionIdResponseBodyDto) other;
        return Intrinsics.d(this.deeplink, sessionIdResponseBodyDto.deeplink) && Intrinsics.d(this.state, sessionIdResponseBodyDto.state) && Intrinsics.d(this.sessionId, sessionIdResponseBodyDto.sessionId) && Intrinsics.d(this.clientId, sessionIdResponseBodyDto.clientId) && Intrinsics.d(this.nonce, sessionIdResponseBodyDto.nonce) && Intrinsics.d(this.isBnplEnabled, sessionIdResponseBodyDto.isBnplEnabled) && Intrinsics.d(this.codeChallengeMethod, sessionIdResponseBodyDto.codeChallengeMethod) && Intrinsics.d(this.codeChallenge, sessionIdResponseBodyDto.codeChallenge) && Intrinsics.d(this.scope, sessionIdResponseBodyDto.scope) && Intrinsics.d(this.refreshTokenIsActive, sessionIdResponseBodyDto.refreshTokenIsActive) && Intrinsics.d(this.clientIdPhone, sessionIdResponseBodyDto.clientIdPhone);
    }

    public final String getClientId() {
        return this.clientId;
    }

    public final String getClientIdPhone() {
        return this.clientIdPhone;
    }

    public final String getCodeChallenge() {
        return this.codeChallenge;
    }

    public final String getCodeChallengeMethod() {
        return this.codeChallengeMethod;
    }

    public final String getDeeplink() {
        return this.deeplink;
    }

    public final String getNonce() {
        return this.nonce;
    }

    public final Boolean getRefreshTokenIsActive() {
        return this.refreshTokenIsActive;
    }

    public final String getScope() {
        return this.scope;
    }

    public final String getSessionId() {
        return this.sessionId;
    }

    public final String getState() {
        return this.state;
    }

    public int hashCode() {
        String str = this.deeplink;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.state;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.sessionId;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.clientId;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.nonce;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Boolean bool = this.isBnplEnabled;
        int hashCode6 = (hashCode5 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str6 = this.codeChallengeMethod;
        int hashCode7 = (hashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.codeChallenge;
        int hashCode8 = (hashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.scope;
        int hashCode9 = (hashCode8 + (str8 == null ? 0 : str8.hashCode())) * 31;
        Boolean bool2 = this.refreshTokenIsActive;
        int hashCode10 = (hashCode9 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str9 = this.clientIdPhone;
        return hashCode10 + (str9 != null ? str9.hashCode() : 0);
    }

    public final Boolean isBnplEnabled() {
        return this.isBnplEnabled;
    }

    @NotNull
    public String toString() {
        String str = this.deeplink;
        String str2 = this.state;
        String str3 = this.sessionId;
        String str4 = this.clientId;
        String str5 = this.nonce;
        Boolean bool = this.isBnplEnabled;
        String str6 = this.codeChallengeMethod;
        String str7 = this.codeChallenge;
        String str8 = this.scope;
        Boolean bool2 = this.refreshTokenIsActive;
        String str9 = this.clientIdPhone;
        StringBuilder d11 = C3660k.d("SessionIdResponseBodyDto(deeplink=", str, ", state=", str2, ", sessionId=");
        a.h(d11, str3, ", clientId=", str4, ", nonce=");
        Sh.a.d(bool, str5, ", isBnplEnabled=", ", codeChallengeMethod=", d11);
        a.h(d11, str6, ", codeChallenge=", str7, ", scope=");
        Sh.a.d(bool2, str8, ", refreshTokenIsActive=", ", clientIdPhone=", d11);
        return o0.c(d11, str9, ")");
    }

    @Override // spay.sdk.data.dto.response.DataDtoInterface
    @NotNull
    public SessionIdResponseBody toModel() {
        String str = this.deeplink;
        if (str == null) {
            throw new C4452mn("deeplink");
        }
        String str2 = this.state;
        if (str2 == null) {
            throw new C4452mn("state");
        }
        String str3 = this.sessionId;
        if (str3 == null) {
            throw new C4452mn("sessionId");
        }
        String str4 = this.clientId;
        if (str4 == null) {
            throw new C4452mn("clientId");
        }
        String str5 = this.nonce;
        if (str5 == null) {
            throw new C4452mn("nonce");
        }
        Boolean bool = this.isBnplEnabled;
        String str6 = this.codeChallengeMethod;
        if (str6 == null) {
            throw new C4452mn("codeChallengeMethod");
        }
        String str7 = this.codeChallenge;
        if (str7 == null) {
            throw new C4452mn("codeChallenge");
        }
        String str8 = this.scope;
        if (str8 != null) {
            return new SessionIdResponseBody(str, str2, str3, str4, str5, bool, str6, str7, str8, this.refreshTokenIsActive, this.clientIdPhone);
        }
        throw new C4452mn("scope");
    }
}
