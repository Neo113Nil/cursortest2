package spay.sdk.domain.model.response.otp;

import D40.b;
import Ve.AbstractC4182dc;
import Ve.C4289h4;
import Ve.C4293h8;
import Ve.C4467n9;
import Ve.C4578r5;
import Ve.C4670ua;
import Ve.C4723w6;
import Ve.C4812zb;
import Ve.C7;
import Ve.E;
import Ve.K8;
import Ve.M4;
import Ve.P9;
import Ve.V5;
import Ve.Va;
import Ve.Z6;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import spay.sdk.R;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0011\u001a7\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00002\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0000H\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a+\u0010\t\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0000H\u0000¢\u0006\u0004\b\t\u0010\n\"\u0014\u0010\u000b\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u000b\u0010\f\"\u0014\u0010\r\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b\r\u0010\f\"\u0014\u0010\u000e\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\f\"\u0014\u0010\u000f\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\f\"\u0014\u0010\u0010\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\f\"\u0014\u0010\u0011\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\f\"\u0014\u0010\u0012\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\f\"\u0014\u0010\u0013\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\f\"\u0014\u0010\u0014\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\f\"\u0014\u0010\u0015\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\f\"\u0014\u0010\u0016\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0016\u0010\f¨\u0006\u0017"}, d2 = {"", "mobilePhone", "", "errorCode", "errorMessage", "cardNumber", "LVe/dc;", "creationOneTimePasswordState", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)LVe/dc;", "confirmationOneTimePasswordState", "(Ljava/lang/String;ILjava/lang/String;)LVe/dc;", "SUCCESS_CODE", "I", "OTP_SYSTEM_ERROR_CODE", "VALIDATION_ERROR_CODE", "CREATE_ATTEMPTS_EXHAUSTED_CODE", "TIMEOUT_CODE", "WRONG_BUNDLE_STATE_CODE", "ORDER_NOT_FOUND_CODE", "BUNDLE_NOT_FOUND_CODE", "WRONG_CODE", "ATTEMPTS_EXHAUSTED_CODE", "CODE_LIFETIME_EXPIRED", "SPaySDK_baseRelease"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class OneTimePasswordStateBuilderKt {
    private static final int ATTEMPTS_EXHAUSTED_CODE = 6;
    private static final int BUNDLE_NOT_FOUND_CODE = 127;
    private static final int CODE_LIFETIME_EXPIRED = 9;
    private static final int CREATE_ATTEMPTS_EXHAUSTED_CODE = 3;
    private static final int ORDER_NOT_FOUND_CODE = 107;
    public static final int OTP_SYSTEM_ERROR_CODE = 2;
    public static final int SUCCESS_CODE = 0;
    private static final int TIMEOUT_CODE = 4;
    private static final int VALIDATION_ERROR_CODE = 1;
    private static final int WRONG_BUNDLE_STATE_CODE = 8;
    private static final int WRONG_CODE = 5;

    @NotNull
    public static final AbstractC4182dc confirmationOneTimePasswordState(@NotNull String mobilePhone, int i11, String str) {
        Intrinsics.checkNotNullParameter(mobilePhone, "mobilePhone");
        if (i11 == 0) {
            return new C4578r5(mobilePhone);
        }
        if (i11 == 1) {
            return new C4723w6(str != null ? b.a(str, "text", str) : E.d(R.string.spay_otp_confirm_validation_error));
        }
        if (i11 == 5) {
            return new Z6(str != null ? b.a(str, "text", str) : E.d(R.string.spay_otp_confirm_wrong_code_error), mobilePhone);
        }
        if (i11 == 6) {
            return new C4289h4(str != null ? b.a(str, "text", str) : E.d(R.string.spay_otp_confirm_attempts_exhausted_error), mobilePhone);
        }
        if (i11 != 9) {
            return new V5(str != null ? b.a(str, "text", str) : E.d(R.string.spay_otp_confirm_system_or_internal_error));
        }
        return new M4(str != null ? b.a(str, "text", str) : E.d(R.string.spay_otp_confirm_code_lifetime_expired_error), mobilePhone);
    }

    public static /* synthetic */ AbstractC4182dc confirmationOneTimePasswordState$default(String str, int i11, String str2, int i12, Object obj) {
        if ((i12 & 4) != 0) {
            str2 = null;
        }
        return confirmationOneTimePasswordState(str, i11, str2);
    }

    @NotNull
    public static final AbstractC4182dc creationOneTimePasswordState(@NotNull String mobilePhone, int i11, String str, String str2) {
        Intrinsics.checkNotNullParameter(mobilePhone, "mobilePhone");
        if (i11 == 0) {
            return new C4467n9(mobilePhone, str2);
        }
        if (i11 == 1) {
            return new Va(str != null ? b.a(str, "text", str) : E.d(R.string.spay_create_otp_validation_error), mobilePhone);
        }
        if (i11 == 3) {
            return new C7(str != null ? b.a(str, "text", str) : E.d(R.string.spay_create_otp_attempts_exhausted_error), mobilePhone);
        }
        if (i11 == 4) {
            return new C4670ua(str != null ? b.a(str, "text", str) : E.d(R.string.spay_create_otp_timeout_error), mobilePhone);
        }
        if (i11 == 8) {
            return new C4812zb(str != null ? b.a(str, "text", str) : E.d(R.string.spay_create_otp_wrong_bundle_state_error), mobilePhone);
        }
        if (i11 == ORDER_NOT_FOUND_CODE) {
            return new K8(str != null ? b.a(str, "text", str) : E.d(R.string.spay_create_otp_order_not_found_error), mobilePhone);
        }
        if (i11 != BUNDLE_NOT_FOUND_CODE) {
            return new P9(str != null ? b.a(str, "text", str) : E.d(R.string.spay_create_otp_system_or_internal_error), mobilePhone);
        }
        return new C4293h8(str != null ? b.a(str, "text", str) : E.d(R.string.spay_create_otp_bundle_not_found_error), mobilePhone);
    }

    public static /* synthetic */ AbstractC4182dc creationOneTimePasswordState$default(String str, int i11, String str2, String str3, int i12, Object obj) {
        if ((i12 & 4) != 0) {
            str2 = null;
        }
        if ((i12 & 8) != 0) {
            str3 = null;
        }
        return creationOneTimePasswordState(str, i11, str2, str3);
    }
}
