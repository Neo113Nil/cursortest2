package spay.sdk.domain.model.response;

import C.o0;
import Lf.a;
import N3.C3660k;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import spay.sdk.api.ErrorCode;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b#\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001By\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\f\u001a\u00020\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u000fJ\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u001e\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u0016J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\u0010\u0010$\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u0016J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\t\u0010'\u001a\u00020\u0003HÆ\u0003J\u0082\u0001\u0010(\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010)J\u0013\u0010*\u001a\u00020\t2\b\u0010+\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010,\u001a\u00020-HÖ\u0001J\t\u0010.\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0011R\u0015\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\b\u0010\u0016R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0011R\u0015\u0010\r\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u0019\u0010\u0016R\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0011R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0011¨\u0006/"}, d2 = {"Lspay/sdk/domain/model/response/SessionIdResponseBody;", "", "deeplink", "", "state", "sessionId", "clientId", "nonce", "isBnplEnabled", "", "codeChallengeMethod", "codeChallenge", "scope", "refreshTokenIsActive", "clientIdPhone", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;)V", "getClientId", "()Ljava/lang/String;", "getClientIdPhone", "getCodeChallenge", "getCodeChallengeMethod", "getDeeplink", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getNonce", "getRefreshTokenIsActive", "getScope", "getSessionId", "getState", "component1", "component10", "component11", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;)Lspay/sdk/domain/model/response/SessionIdResponseBody;", "equals", "other", "hashCode", "", "toString", "SPaySDK_baseRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class SessionIdResponseBody {

    @NotNull
    private final String clientId;
    private final String clientIdPhone;

    @NotNull
    private final String codeChallenge;

    @NotNull
    private final String codeChallengeMethod;

    @NotNull
    private final String deeplink;
    private final Boolean isBnplEnabled;

    @NotNull
    private final String nonce;
    private final Boolean refreshTokenIsActive;

    @NotNull
    private final String scope;

    @NotNull
    private final String sessionId;

    @NotNull
    private final String state;

    public SessionIdResponseBody() {
        this(null, null, null, null, null, null, null, null, null, null, null, 2047, null);
    }

    public static /* synthetic */ SessionIdResponseBody copy$default(SessionIdResponseBody sessionIdResponseBody, String str, String str2, String str3, String str4, String str5, Boolean bool, String str6, String str7, String str8, Boolean bool2, String str9, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = sessionIdResponseBody.deeplink;
        }
        if ((i11 & 2) != 0) {
            str2 = sessionIdResponseBody.state;
        }
        if ((i11 & 4) != 0) {
            str3 = sessionIdResponseBody.sessionId;
        }
        if ((i11 & 8) != 0) {
            str4 = sessionIdResponseBody.clientId;
        }
        if ((i11 & 16) != 0) {
            str5 = sessionIdResponseBody.nonce;
        }
        if ((i11 & 32) != 0) {
            bool = sessionIdResponseBody.isBnplEnabled;
        }
        if ((i11 & 64) != 0) {
            str6 = sessionIdResponseBody.codeChallengeMethod;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
            str7 = sessionIdResponseBody.codeChallenge;
        }
        if ((i11 & 256) != 0) {
            str8 = sessionIdResponseBody.scope;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0) {
            bool2 = sessionIdResponseBody.refreshTokenIsActive;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_ALL) != 0) {
            str9 = sessionIdResponseBody.clientIdPhone;
        }
        Boolean bool3 = bool2;
        String str10 = str9;
        String str11 = str7;
        String str12 = str8;
        Boolean bool4 = bool;
        String str13 = str6;
        String str14 = str5;
        String str15 = str3;
        return sessionIdResponseBody.copy(str, str2, str15, str4, str14, bool4, str13, str11, str12, bool3, str10);
    }

    @NotNull
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

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getState() {
        return this.state;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getSessionId() {
        return this.sessionId;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final String getClientId() {
        return this.clientId;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final String getNonce() {
        return this.nonce;
    }

    /* renamed from: component6, reason: from getter */
    public final Boolean getIsBnplEnabled() {
        return this.isBnplEnabled;
    }

    @NotNull
    /* renamed from: component7, reason: from getter */
    public final String getCodeChallengeMethod() {
        return this.codeChallengeMethod;
    }

    @NotNull
    /* renamed from: component8, reason: from getter */
    public final String getCodeChallenge() {
        return this.codeChallenge;
    }

    @NotNull
    /* renamed from: component9, reason: from getter */
    public final String getScope() {
        return this.scope;
    }

    @NotNull
    public final SessionIdResponseBody copy(@NotNull String deeplink, @NotNull String state, @NotNull String sessionId, @NotNull String clientId, @NotNull String nonce, Boolean isBnplEnabled, @NotNull String codeChallengeMethod, @NotNull String codeChallenge, @NotNull String scope, Boolean refreshTokenIsActive, String clientIdPhone) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        Intrinsics.checkNotNullParameter(clientId, "clientId");
        Intrinsics.checkNotNullParameter(nonce, "nonce");
        Intrinsics.checkNotNullParameter(codeChallengeMethod, "codeChallengeMethod");
        Intrinsics.checkNotNullParameter(codeChallenge, "codeChallenge");
        Intrinsics.checkNotNullParameter(scope, "scope");
        return new SessionIdResponseBody(deeplink, state, sessionId, clientId, nonce, isBnplEnabled, codeChallengeMethod, codeChallenge, scope, refreshTokenIsActive, clientIdPhone);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SessionIdResponseBody)) {
            return false;
        }
        SessionIdResponseBody sessionIdResponseBody = (SessionIdResponseBody) other;
        return Intrinsics.d(this.deeplink, sessionIdResponseBody.deeplink) && Intrinsics.d(this.state, sessionIdResponseBody.state) && Intrinsics.d(this.sessionId, sessionIdResponseBody.sessionId) && Intrinsics.d(this.clientId, sessionIdResponseBody.clientId) && Intrinsics.d(this.nonce, sessionIdResponseBody.nonce) && Intrinsics.d(this.isBnplEnabled, sessionIdResponseBody.isBnplEnabled) && Intrinsics.d(this.codeChallengeMethod, sessionIdResponseBody.codeChallengeMethod) && Intrinsics.d(this.codeChallenge, sessionIdResponseBody.codeChallenge) && Intrinsics.d(this.scope, sessionIdResponseBody.scope) && Intrinsics.d(this.refreshTokenIsActive, sessionIdResponseBody.refreshTokenIsActive) && Intrinsics.d(this.clientIdPhone, sessionIdResponseBody.clientIdPhone);
    }

    @NotNull
    public final String getClientId() {
        return this.clientId;
    }

    public final String getClientIdPhone() {
        return this.clientIdPhone;
    }

    @NotNull
    public final String getCodeChallenge() {
        return this.codeChallenge;
    }

    @NotNull
    public final String getCodeChallengeMethod() {
        return this.codeChallengeMethod;
    }

    @NotNull
    public final String getDeeplink() {
        return this.deeplink;
    }

    @NotNull
    public final String getNonce() {
        return this.nonce;
    }

    public final Boolean getRefreshTokenIsActive() {
        return this.refreshTokenIsActive;
    }

    @NotNull
    public final String getScope() {
        return this.scope;
    }

    @NotNull
    public final String getSessionId() {
        return this.sessionId;
    }

    @NotNull
    public final String getState() {
        return this.state;
    }

    public int hashCode() {
        int b02 = a.b0(a.b0(a.b0(a.b0(this.deeplink.hashCode() * 31, this.state), this.sessionId), this.clientId), this.nonce);
        Boolean bool = this.isBnplEnabled;
        int b03 = a.b0(a.b0(a.b0((b02 + (bool == null ? 0 : bool.hashCode())) * 31, this.codeChallengeMethod), this.codeChallenge), this.scope);
        Boolean bool2 = this.refreshTokenIsActive;
        int hashCode = (b03 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str = this.clientIdPhone;
        return hashCode + (str != null ? str.hashCode() : 0);
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
        StringBuilder d11 = C3660k.d("SessionIdResponseBody(deeplink=", str, ", state=", str2, ", sessionId=");
        Nh.a.h(d11, str3, ", clientId=", str4, ", nonce=");
        Sh.a.d(bool, str5, ", isBnplEnabled=", ", codeChallengeMethod=", d11);
        Nh.a.h(d11, str6, ", codeChallenge=", str7, ", scope=");
        Sh.a.d(bool2, str8, ", refreshTokenIsActive=", ", clientIdPhone=", d11);
        return o0.c(d11, str9, ")");
    }

    public SessionIdResponseBody(@NotNull String deeplink, @NotNull String state, @NotNull String sessionId, @NotNull String clientId, @NotNull String nonce, Boolean bool, @NotNull String codeChallengeMethod, @NotNull String codeChallenge, @NotNull String scope, Boolean bool2, String str) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        Intrinsics.checkNotNullParameter(clientId, "clientId");
        Intrinsics.checkNotNullParameter(nonce, "nonce");
        Intrinsics.checkNotNullParameter(codeChallengeMethod, "codeChallengeMethod");
        Intrinsics.checkNotNullParameter(codeChallenge, "codeChallenge");
        Intrinsics.checkNotNullParameter(scope, "scope");
        this.deeplink = deeplink;
        this.state = state;
        this.sessionId = sessionId;
        this.clientId = clientId;
        this.nonce = nonce;
        this.isBnplEnabled = bool;
        this.codeChallengeMethod = codeChallengeMethod;
        this.codeChallenge = codeChallenge;
        this.scope = scope;
        this.refreshTokenIsActive = bool2;
        this.clientIdPhone = str;
    }

    public /* synthetic */ SessionIdResponseBody(String str, String str2, String str3, String str4, String str5, Boolean bool, String str6, String str7, String str8, Boolean bool2, String str9, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? ErrorCode.PHONE_NUMBER_NOT_TRANSFERRED_ERROR_CODE : str, (i11 & 2) != 0 ? ErrorCode.PHONE_NUMBER_NOT_TRANSFERRED_ERROR_CODE : str2, (i11 & 4) != 0 ? ErrorCode.PHONE_NUMBER_NOT_TRANSFERRED_ERROR_CODE : str3, (i11 & 8) != 0 ? ErrorCode.PHONE_NUMBER_NOT_TRANSFERRED_ERROR_CODE : str4, (i11 & 16) != 0 ? ErrorCode.PHONE_NUMBER_NOT_TRANSFERRED_ERROR_CODE : str5, (i11 & 32) != 0 ? null : bool, (i11 & 64) != 0 ? ErrorCode.PHONE_NUMBER_NOT_TRANSFERRED_ERROR_CODE : str6, (i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? ErrorCode.PHONE_NUMBER_NOT_TRANSFERRED_ERROR_CODE : str7, (i11 & 256) != 0 ? ErrorCode.PHONE_NUMBER_NOT_TRANSFERRED_ERROR_CODE : str8, (i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? null : bool2, (i11 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? null : str9);
    }
}
