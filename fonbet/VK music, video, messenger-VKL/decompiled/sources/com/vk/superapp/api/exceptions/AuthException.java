package com.vk.superapp.api.exceptions;

import com.vk.api.sdk.auth.UtilityTokens;
import com.vk.superapp.api.dto.auth.VkAuthCredentials;
import com.vk.superapp.api.states.VkAuthState;
import com.vk.superapp.core.api.models.BanInfo;
import com.vk.superapp.core.api.models.SendOtpInfo;
import com.vk.superapp.core.api.models.SignUpField;
import com.vk.superapp.core.api.models.SignUpIncompleteFieldsModel;
import com.vk.superapp.core.api.models.ValidateInfo;
import com.vk.superapp.core.api.models.a;
import com.vkontakte.android.R;
import java.util.List;
import xsna.epx;
import xsna.ho8;
import xsna.shy;
import xsna.urd0;
import xsna.xbu0;

/* compiled from: AuthException.kt */
/* loaded from: classes11.dex */
public abstract class AuthException extends Exception {

    /* compiled from: AuthException.kt */
    /* loaded from: classes6.dex */
    public static final class AgeIsTooYoung extends DetailedAuthException {
    }

    /* compiled from: AuthException.kt */
    /* loaded from: classes6.dex */
    public static final class BannedUserException extends AuthException {
        private final BanInfo banInfo;

        public BannedUserException(BanInfo banInfo) {
            super(null, 3);
            this.banInfo = banInfo;
        }

        public final BanInfo d() {
            return this.banInfo;
        }
    }

    /* compiled from: AuthException.kt */
    /* loaded from: classes6.dex */
    public static final class CancelByOwnerNeeded extends DetailedAuthException {
    }

    /* compiled from: AuthException.kt */
    /* loaded from: classes6.dex */
    public static final class DeactivatedUserException extends AuthException {
        private final String accessToken;
        private final VkAuthCredentials authCredentials;
        private final UtilityTokens utilityTokens;

        public DeactivatedUserException(String str, VkAuthCredentials vkAuthCredentials, UtilityTokens utilityTokens) {
            super(null, 3);
            this.accessToken = str;
            this.authCredentials = vkAuthCredentials;
            this.utilityTokens = utilityTokens;
        }

        public static DeactivatedUserException a(DeactivatedUserException deactivatedUserException, VkAuthCredentials vkAuthCredentials) {
            String str = deactivatedUserException.accessToken;
            UtilityTokens utilityTokens = deactivatedUserException.utilityTokens;
            deactivatedUserException.getClass();
            return new DeactivatedUserException(str, vkAuthCredentials, utilityTokens);
        }

        public final String d() {
            return this.accessToken;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof DeactivatedUserException)) {
                return false;
            }
            DeactivatedUserException deactivatedUserException = (DeactivatedUserException) obj;
            return epx.f(this.accessToken, deactivatedUserException.accessToken) && epx.f(this.authCredentials, deactivatedUserException.authCredentials) && epx.f(this.utilityTokens, deactivatedUserException.utilityTokens);
        }

        public final VkAuthCredentials g() {
            return this.authCredentials;
        }

        public final UtilityTokens h() {
            return this.utilityTokens;
        }

        public final int hashCode() {
            int hashCode = this.accessToken.hashCode() * 31;
            VkAuthCredentials vkAuthCredentials = this.authCredentials;
            return this.utilityTokens.b.hashCode() + ((hashCode + (vkAuthCredentials == null ? 0 : vkAuthCredentials.hashCode())) * 31);
        }

        @Override // java.lang.Throwable
        public final String toString() {
            return "DeactivatedUserException(accessToken=" + this.accessToken + ", authCredentials=" + this.authCredentials + ", utilityTokens=" + this.utilityTokens + ')';
        }
    }

    /* compiled from: AuthException.kt */
    /* loaded from: classes6.dex */
    public static class DetailedAuthException extends AuthException {
        private final a authAnswer;

        public DetailedAuthException(a aVar) {
            super(null, 3);
            this.authAnswer = aVar;
        }

        public final a d() {
            return this.authAnswer;
        }
    }

    /* compiled from: AuthException.kt */
    /* loaded from: classes6.dex */
    public static final class ExchangeSilentTokenException extends AuthException {
        private final int errorTitleResId;
        private final boolean silentTokenWasUsed;

        public ExchangeSilentTokenException(String str, Throwable th, boolean z) {
            super(str, th);
            this.silentTokenWasUsed = z;
            this.errorTitleResId = R.string.vk_auth_silent_token_exchange_error_dialog_title;
        }

        public final boolean d() {
            return this.silentTokenWasUsed;
        }
    }

    /* compiled from: AuthException.kt */
    /* loaded from: classes6.dex */
    public static final class ExchangeTokenException extends DetailedAuthException {
    }

    /* compiled from: AuthException.kt */
    public static final class ExpiredAnonymousTokenException extends AuthException {
        public ExpiredAnonymousTokenException() {
            super(null, 3);
        }
    }

    /* compiled from: AuthException.kt */
    /* loaded from: classes6.dex */
    public static final class IncorrectLoginDataException extends StatedAuthException {
    }

    /* compiled from: AuthException.kt */
    /* loaded from: classes6.dex */
    public static final class InterruptForUserChooseException extends AuthException {
        private final xbu0 data;

        public InterruptForUserChooseException(xbu0 xbu0Var) {
            super(null, 3);
            this.data = xbu0Var;
        }

        public final xbu0 d() {
            return this.data;
        }
    }

    /* compiled from: AuthException.kt */
    public static final class InvalidAnonymousTokenException extends AuthException {
        public InvalidAnonymousTokenException() {
            super(null, 3);
        }
    }

    /* compiled from: AuthException.kt */
    /* loaded from: classes6.dex */
    public static final class InvalidRequestException extends StatedAuthException {
    }

    /* compiled from: AuthException.kt */
    /* loaded from: classes6.dex */
    public static final class InvalidSidException extends AuthException {
        private final Exception fallback;

        public InvalidSidException(Exception exc) {
            super(null, 3);
            this.fallback = exc;
        }
    }

    /* compiled from: AuthException.kt */
    /* loaded from: classes6.dex */
    public static final class MailAccountBlockedException extends AuthException {
        private final String email;

        public MailAccountBlockedException(String str) {
            super(null, 3);
            this.email = str;
        }
    }

    /* compiled from: AuthException.kt */
    /* loaded from: classes6.dex */
    public static final class NeedCheckSilentTokenException extends DetailedAuthException {
        private final VkAuthState authState;

        public NeedCheckSilentTokenException(a aVar, VkAuthState vkAuthState) {
            super(aVar);
            this.authState = vkAuthState;
        }

        public final VkAuthState g() {
            return this.authState;
        }
    }

    /* compiled from: AuthException.kt */
    /* loaded from: classes6.dex */
    public static final class NeedSignUpException extends AuthException {
        private final boolean isAccountExisting;
        private final boolean isForceSignUp;
        private final boolean isSignUpAgreementRequired;
        private final String sid;
        private final List<SignUpField> signUpFields;
        private final SignUpIncompleteFieldsModel signUpIncompleteFieldsModel;
        private final List<SignUpField> signUpSkippableFields;

        /* JADX WARN: Multi-variable type inference failed */
        public NeedSignUpException(List<? extends SignUpField> list, List<? extends SignUpField> list2, String str, SignUpIncompleteFieldsModel signUpIncompleteFieldsModel, boolean z, boolean z2, boolean z3) {
            super(null, 3);
            this.signUpFields = list;
            this.signUpSkippableFields = list2;
            this.sid = str;
            this.signUpIncompleteFieldsModel = signUpIncompleteFieldsModel;
            this.isForceSignUp = z;
            this.isSignUpAgreementRequired = z2;
            this.isAccountExisting = z3;
        }

        public final String d() {
            return this.sid;
        }

        public final List<SignUpField> g() {
            return this.signUpFields;
        }

        public final SignUpIncompleteFieldsModel h() {
            return this.signUpIncompleteFieldsModel;
        }

        public final List<SignUpField> i() {
            return this.signUpSkippableFields;
        }

        public final boolean j() {
            return this.isAccountExisting;
        }

        public final boolean k() {
            return this.isForceSignUp;
        }

        public final boolean l() {
            return this.isSignUpAgreementRequired;
        }
    }

    /* compiled from: AuthException.kt */
    /* loaded from: classes6.dex */
    public static final class NeedSilentAuthException extends AuthException {
        private final VkAuthCredentials authCredentials;
        private final String silentToken;
        private final int silentTokenTimeout;
        private final String silentTokenUuid;
        private final String trustedHash;
        private final String whiteLabelFlowOutputSat;

        public /* synthetic */ NeedSilentAuthException(String str, String str2, int i, VkAuthCredentials vkAuthCredentials, String str3, int i2) {
            this(str, str2, i, (i2 & 8) != 0 ? null : vkAuthCredentials, (i2 & 16) != 0 ? null : str3, (String) null);
        }

        public static NeedSilentAuthException a(NeedSilentAuthException needSilentAuthException, String str) {
            String str2 = needSilentAuthException.silentToken;
            String str3 = needSilentAuthException.silentTokenUuid;
            int i = needSilentAuthException.silentTokenTimeout;
            VkAuthCredentials vkAuthCredentials = needSilentAuthException.authCredentials;
            String str4 = needSilentAuthException.whiteLabelFlowOutputSat;
            needSilentAuthException.getClass();
            return new NeedSilentAuthException(str2, str3, i, vkAuthCredentials, str4, str);
        }

        public final VkAuthCredentials d() {
            return this.authCredentials;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof NeedSilentAuthException)) {
                return false;
            }
            NeedSilentAuthException needSilentAuthException = (NeedSilentAuthException) obj;
            return epx.f(this.silentToken, needSilentAuthException.silentToken) && epx.f(this.silentTokenUuid, needSilentAuthException.silentTokenUuid) && this.silentTokenTimeout == needSilentAuthException.silentTokenTimeout && epx.f(this.authCredentials, needSilentAuthException.authCredentials) && epx.f(this.whiteLabelFlowOutputSat, needSilentAuthException.whiteLabelFlowOutputSat) && epx.f(this.trustedHash, needSilentAuthException.trustedHash);
        }

        public final String g() {
            return this.silentToken;
        }

        public final int h() {
            return this.silentTokenTimeout;
        }

        public final int hashCode() {
            int a = shy.a(this.silentTokenTimeout, urd0.a(this.silentToken.hashCode() * 31, 31, this.silentTokenUuid), 31);
            VkAuthCredentials vkAuthCredentials = this.authCredentials;
            int hashCode = (a + (vkAuthCredentials == null ? 0 : vkAuthCredentials.hashCode())) * 31;
            String str = this.whiteLabelFlowOutputSat;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.trustedHash;
            return hashCode2 + (str2 != null ? str2.hashCode() : 0);
        }

        public final String i() {
            return this.silentTokenUuid;
        }

        public final String j() {
            return this.trustedHash;
        }

        public final String k() {
            return this.whiteLabelFlowOutputSat;
        }

        @Override // java.lang.Throwable
        public final String toString() {
            StringBuilder sb = new StringBuilder("NeedSilentAuthException(silentToken=");
            sb.append(this.silentToken);
            sb.append(", silentTokenUuid=");
            sb.append(this.silentTokenUuid);
            sb.append(", silentTokenTimeout=");
            sb.append(this.silentTokenTimeout);
            sb.append(", authCredentials=");
            sb.append(this.authCredentials);
            sb.append(", whiteLabelFlowOutputSat=");
            sb.append(this.whiteLabelFlowOutputSat);
            sb.append(", trustedHash=");
            return ho8.a(sb, this.trustedHash, ')');
        }

        public NeedSilentAuthException(String str, String str2, int i, VkAuthCredentials vkAuthCredentials, String str3, String str4) {
            super(null, 3);
            this.silentToken = str;
            this.silentTokenUuid = str2;
            this.silentTokenTimeout = i;
            this.authCredentials = vkAuthCredentials;
            this.whiteLabelFlowOutputSat = str3;
            this.trustedHash = str4;
        }
    }

    /* compiled from: AuthException.kt */
    /* loaded from: classes6.dex */
    public static final class NeedValidationException extends StatedAuthException {
    }

    /* compiled from: AuthException.kt */
    /* loaded from: classes6.dex */
    public static final class OAuthSpecificException extends AuthException {
        private final VkAuthState authState;
        private final String emailMasked;
        private final String oauthError;

        public OAuthSpecificException(String str, VkAuthState vkAuthState, String str2) {
            super(null, 3);
            this.oauthError = str;
            this.authState = vkAuthState;
            this.emailMasked = str2;
        }

        public final VkAuthState d() {
            return this.authState;
        }

        public final String g() {
            return this.emailMasked;
        }

        public final String h() {
            return this.oauthError;
        }
    }

    /* compiled from: AuthException.kt */
    /* loaded from: classes6.dex */
    public static final class PartialTokenException extends AuthException {
        public PartialTokenException() {
            super(null, 3);
        }
    }

    /* compiled from: AuthException.kt */
    /* loaded from: classes6.dex */
    public static final class PhoneValidationRequiredException extends AuthException {
        private final String accessTokenForLk;
        private final VkAuthState authState;
        private final boolean instant;
        private final a.b optional;
        private final String phoneMask;
        private final String sid;
        private final int status;

        public PhoneValidationRequiredException(VkAuthState vkAuthState, String str, String str2, boolean z, a.b bVar, int i, String str3) {
            super(null, 3);
            this.authState = vkAuthState;
            this.sid = str;
            this.phoneMask = str2;
            this.instant = z;
            this.optional = bVar;
            this.status = i;
            this.accessTokenForLk = str3;
        }

        public final String d() {
            return this.accessTokenForLk;
        }

        public final VkAuthState g() {
            return this.authState;
        }

        public final a.b h() {
            return this.optional;
        }

        public final String i() {
            return this.phoneMask;
        }

        public final String j() {
            return this.sid;
        }

        public final int k() {
            return this.status;
        }
    }

    /* compiled from: AuthException.kt */
    /* loaded from: classes6.dex */
    public static abstract class StatedAuthException extends DetailedAuthException {
        private final VkAuthState authState;

        public StatedAuthException(a aVar, VkAuthState vkAuthState) {
            super(aVar);
            this.authState = vkAuthState;
        }

        public final VkAuthState g() {
            return this.authState;
        }
    }

    /* compiled from: AuthException.kt */
    /* loaded from: classes6.dex */
    public static final class SuspiciousAuthException extends AuthException {
        private final VkAuthState authState;
        private final SendOtpInfo sendOtpInfo;
        private final ValidateInfo validateInfo;

        public SuspiciousAuthException(VkAuthState vkAuthState, SendOtpInfo sendOtpInfo, ValidateInfo validateInfo) {
            super("Need validate: " + validateInfo, 2);
            this.authState = vkAuthState;
            this.validateInfo = validateInfo;
            this.sendOtpInfo = sendOtpInfo;
        }

        public final VkAuthState d() {
            return this.authState;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SuspiciousAuthException)) {
                return false;
            }
            SuspiciousAuthException suspiciousAuthException = (SuspiciousAuthException) obj;
            return epx.f(this.authState, suspiciousAuthException.authState) && epx.f(this.validateInfo, suspiciousAuthException.validateInfo) && epx.f(this.sendOtpInfo, suspiciousAuthException.sendOtpInfo);
        }

        public final SendOtpInfo g() {
            return this.sendOtpInfo;
        }

        public final ValidateInfo h() {
            return this.validateInfo;
        }

        public final int hashCode() {
            int hashCode = (this.validateInfo.hashCode() + (this.authState.hashCode() * 31)) * 31;
            SendOtpInfo sendOtpInfo = this.sendOtpInfo;
            return hashCode + (sendOtpInfo == null ? 0 : sendOtpInfo.hashCode());
        }

        @Override // java.lang.Throwable
        public final String toString() {
            return "SuspiciousAuthException(authState=" + this.authState + ", validateInfo=" + this.validateInfo + ", sendOtpInfo=" + this.sendOtpInfo + ')';
        }
    }

    /* compiled from: AuthException.kt */
    /* loaded from: classes6.dex */
    public static final class TooManyAttemptsException extends DetailedAuthException {
    }

    /* compiled from: AuthException.kt */
    /* loaded from: classes6.dex */
    public static final class TooManyRequestsException extends DetailedAuthException {
    }

    /* compiled from: AuthException.kt */
    /* loaded from: classes6.dex */
    public static final class UnknownException extends AuthException {
        public UnknownException() {
            super((String) null, (Throwable) null);
        }

        public UnknownException(int i) {
            super((String) null, (Throwable) null);
        }
    }

    /* compiled from: AuthException.kt */
    /* loaded from: classes6.dex */
    public static final class VkEmailSignUpRequiredException extends AuthException {
        private final String accessToken;
        private final boolean adsIsChecked;
        private final String domain;
        private final List<String> domains;
        private final boolean showAds;
        private final String username;

        public VkEmailSignUpRequiredException(String str, String str2, String str3, List list, boolean z, boolean z2) {
            super(null, 3);
            this.accessToken = str;
            this.domains = list;
            this.domain = str2;
            this.username = str3;
            this.showAds = z;
            this.adsIsChecked = z2;
        }

        public final String d() {
            return this.accessToken;
        }

        public final boolean g() {
            return this.adsIsChecked;
        }

        public final String h() {
            return this.domain;
        }

        public final List<String> i() {
            return this.domains;
        }

        public final boolean j() {
            return this.showAds;
        }

        public final String k() {
            return this.username;
        }
    }

    public AuthException(String str, int i) {
        super((i & 1) != 0 ? null : str, null);
    }
}
