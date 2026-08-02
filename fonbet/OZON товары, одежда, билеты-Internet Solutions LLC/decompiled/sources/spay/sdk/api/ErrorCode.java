package spay.sdk.api;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lspay/sdk/api/ErrorCode;", "", "()V", "API_KEY_VALIDATION_FAILED_ERROR_CODE", "", "APP_PACKAGE_VALIDATION_FAILED_ERROR_CODE", "BANK_AUTHENTICATOR_DEPENDENCY_IS_NOT_INITIALIZED_ON_MOBILE_APP_CHECK", "BANK_INVOICE_ID_VALIDATION_FAILED_ERROR_CODE", "INNER_COMPONENTS_HAS_NOT_BEEN_INITIALIZED_ON_COMPONENT_READY_CHECK", "MERCHANT_LOGIN_VALIDATION_FAILED_ERROR_CODE", "PHONE_NUMBER_NOT_TRANSFERRED_ERROR_CODE", "PHONE_NUMBER_VALIDATION_FAILED_ERROR_CODE", "SPaySDK_baseRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ErrorCode {

    @NotNull
    public static final String API_KEY_VALIDATION_FAILED_ERROR_CODE = "-6";

    @NotNull
    public static final String APP_PACKAGE_VALIDATION_FAILED_ERROR_CODE = "-8";

    @NotNull
    public static final String BANK_AUTHENTICATOR_DEPENDENCY_IS_NOT_INITIALIZED_ON_MOBILE_APP_CHECK = "-4";

    @NotNull
    public static final String BANK_INVOICE_ID_VALIDATION_FAILED_ERROR_CODE = "-3";

    @NotNull
    public static final String INNER_COMPONENTS_HAS_NOT_BEEN_INITIALIZED_ON_COMPONENT_READY_CHECK = "-5";

    @NotNull
    public static final ErrorCode INSTANCE = new ErrorCode();

    @NotNull
    public static final String MERCHANT_LOGIN_VALIDATION_FAILED_ERROR_CODE = "-7";

    @NotNull
    public static final String PHONE_NUMBER_NOT_TRANSFERRED_ERROR_CODE = "-1";

    @NotNull
    public static final String PHONE_NUMBER_VALIDATION_FAILED_ERROR_CODE = "-2";

    private ErrorCode() {
    }
}
