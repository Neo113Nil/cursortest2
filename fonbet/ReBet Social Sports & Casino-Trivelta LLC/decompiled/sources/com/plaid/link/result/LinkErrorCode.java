package com.plaid.link.result;

import android.os.Parcel;
import android.os.Parcelable;
import com.plaid.link.result.LinkErrorCode;
import com.plaid.link.result.LinkErrorType;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \u000f2\u00020\u0001:\u0010\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001bB\u0019\b\u0004\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u000b\u001a\u00020\u0003H\u0016R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u0082\u0001\u000f\u001c\u001d\u001e\u001f !\"#$%&'()*¨\u0006+"}, d2 = {"Lcom/plaid/link/result/LinkErrorCode;", "Landroid/os/Parcelable;", "json", "", "errorType", "Lcom/plaid/link/result/LinkErrorType;", "(Ljava/lang/String;Lcom/plaid/link/result/LinkErrorType;)V", "getErrorType", "()Lcom/plaid/link/result/LinkErrorType;", "getJson", "()Ljava/lang/String;", "toString", "ApiError", "AssetReport", "BankTransferError", "Companion", "DepositSwitchError", "INTERNAL_ERROR", "InstitutionError", "InvalidInput", "InvalidRequest", "ItemError", "OAuthError", "PaymentError", "RateLimit", "RecaptchaError", "SandboxError", "UNKNOWN", "Lcom/plaid/link/result/LinkErrorCode$ApiError;", "Lcom/plaid/link/result/LinkErrorCode$AssetReport;", "Lcom/plaid/link/result/LinkErrorCode$BankTransferError;", "Lcom/plaid/link/result/LinkErrorCode$DepositSwitchError;", "Lcom/plaid/link/result/LinkErrorCode$INTERNAL_ERROR;", "Lcom/plaid/link/result/LinkErrorCode$InstitutionError;", "Lcom/plaid/link/result/LinkErrorCode$InvalidInput;", "Lcom/plaid/link/result/LinkErrorCode$InvalidRequest;", "Lcom/plaid/link/result/LinkErrorCode$ItemError;", "Lcom/plaid/link/result/LinkErrorCode$OAuthError;", "Lcom/plaid/link/result/LinkErrorCode$PaymentError;", "Lcom/plaid/link/result/LinkErrorCode$RateLimit;", "Lcom/plaid/link/result/LinkErrorCode$RecaptchaError;", "Lcom/plaid/link/result/LinkErrorCode$SandboxError;", "Lcom/plaid/link/result/LinkErrorCode$UNKNOWN;", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class LinkErrorCode implements Parcelable {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final Lazy<Map<String, LinkErrorCode>> jsonToObject$delegate = LazyKt.lazy(new Function0<Map<String, ? extends LinkErrorCode>>() { // from class: com.plaid.link.result.LinkErrorCode$Companion$jsonToObject$2
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final Map<String, ? extends LinkErrorCode> invoke() {
            LinkErrorCode.InvalidRequest.MISSING_FIELDS missing_fields = LinkErrorCode.InvalidRequest.MISSING_FIELDS.INSTANCE;
            Pair pair = TuplesKt.to(missing_fields.getJson(), missing_fields);
            LinkErrorCode.InvalidRequest.UNKNOWN_FIELDS unknown_fields = LinkErrorCode.InvalidRequest.UNKNOWN_FIELDS.INSTANCE;
            Pair pair2 = TuplesKt.to(unknown_fields.getJson(), unknown_fields);
            LinkErrorCode.InvalidRequest.INVALID_FIELD invalid_field = LinkErrorCode.InvalidRequest.INVALID_FIELD.INSTANCE;
            Pair pair3 = TuplesKt.to(invalid_field.getJson(), invalid_field);
            LinkErrorCode.InvalidRequest.INVALID_CONFIGURATION invalid_configuration = LinkErrorCode.InvalidRequest.INVALID_CONFIGURATION.INSTANCE;
            Pair pair4 = TuplesKt.to(invalid_configuration.getJson(), invalid_configuration);
            LinkErrorCode.InvalidRequest.INVALID_BODY invalid_body = LinkErrorCode.InvalidRequest.INVALID_BODY.INSTANCE;
            Pair pair5 = TuplesKt.to(invalid_body.getJson(), invalid_body);
            LinkErrorCode.InvalidRequest.INVALID_HEADERS invalid_headers = LinkErrorCode.InvalidRequest.INVALID_HEADERS.INSTANCE;
            Pair pair6 = TuplesKt.to(invalid_headers.getJson(), invalid_headers);
            LinkErrorCode.InvalidRequest.NOT_FOUND not_found = LinkErrorCode.InvalidRequest.NOT_FOUND.INSTANCE;
            Pair pair7 = TuplesKt.to(not_found.getJson(), not_found);
            LinkErrorCode.InvalidRequest.SANDBOX_ONLY sandbox_only = LinkErrorCode.InvalidRequest.SANDBOX_ONLY.INSTANCE;
            Pair pair8 = TuplesKt.to(sandbox_only.getJson(), sandbox_only);
            LinkErrorCode.InvalidInput.INVALID_API_KEYS invalid_api_keys = LinkErrorCode.InvalidInput.INVALID_API_KEYS.INSTANCE;
            Pair pair9 = TuplesKt.to(invalid_api_keys.getJson(), invalid_api_keys);
            LinkErrorCode.InvalidInput.UNAUTHORIZED_ENVIRONMENT unauthorized_environment = LinkErrorCode.InvalidInput.UNAUTHORIZED_ENVIRONMENT.INSTANCE;
            Pair pair10 = TuplesKt.to(unauthorized_environment.getJson(), unauthorized_environment);
            LinkErrorCode.InvalidInput.INVALID_ACCESS_TOKEN invalid_access_token = LinkErrorCode.InvalidInput.INVALID_ACCESS_TOKEN.INSTANCE;
            Pair pair11 = TuplesKt.to(invalid_access_token.getJson(), invalid_access_token);
            LinkErrorCode.InvalidInput.INVALID_PUBLIC_TOKEN invalid_public_token = LinkErrorCode.InvalidInput.INVALID_PUBLIC_TOKEN.INSTANCE;
            Pair pair12 = TuplesKt.to(invalid_public_token.getJson(), invalid_public_token);
            LinkErrorCode.InvalidInput.INVALID_PRODUCTS invalid_products = LinkErrorCode.InvalidInput.INVALID_PRODUCTS.INSTANCE;
            Pair pair13 = TuplesKt.to(invalid_products.getJson(), invalid_products);
            LinkErrorCode.InvalidInput.INVALID_ACCOUNT_ID invalid_account_id = LinkErrorCode.InvalidInput.INVALID_ACCOUNT_ID.INSTANCE;
            Pair pair14 = TuplesKt.to(invalid_account_id.getJson(), invalid_account_id);
            LinkErrorCode.InvalidInput.INVALID_INSTITUTION invalid_institution = LinkErrorCode.InvalidInput.INVALID_INSTITUTION.INSTANCE;
            Pair pair15 = TuplesKt.to(invalid_institution.getJson(), invalid_institution);
            LinkErrorCode.InvalidInput.TOO_MANY_VERIFICATION_ATTEMPTS too_many_verification_attempts = LinkErrorCode.InvalidInput.TOO_MANY_VERIFICATION_ATTEMPTS.INSTANCE;
            Pair pair16 = TuplesKt.to(too_many_verification_attempts.getJson(), too_many_verification_attempts);
            LinkErrorCode.InvalidInput.INCORRECT_DEPOSIT_AMOUNTS incorrect_deposit_amounts = LinkErrorCode.InvalidInput.INCORRECT_DEPOSIT_AMOUNTS.INSTANCE;
            Pair pair17 = TuplesKt.to(incorrect_deposit_amounts.getJson(), incorrect_deposit_amounts);
            LinkErrorCode.InvalidInput.USER_PERMISSION_REVOKED user_permission_revoked = LinkErrorCode.InvalidInput.USER_PERMISSION_REVOKED.INSTANCE;
            Pair pair18 = TuplesKt.to(user_permission_revoked.getJson(), user_permission_revoked);
            LinkErrorCode.InvalidInput.UNAUTHORIZED_ROUTE_ACCESS unauthorized_route_access = LinkErrorCode.InvalidInput.UNAUTHORIZED_ROUTE_ACCESS.INSTANCE;
            Pair pair19 = TuplesKt.to(unauthorized_route_access.getJson(), unauthorized_route_access);
            LinkErrorCode.InvalidInput.DIRECT_INTEGRATION_NOT_ENABLED direct_integration_not_enabled = LinkErrorCode.InvalidInput.DIRECT_INTEGRATION_NOT_ENABLED.INSTANCE;
            Pair pair20 = TuplesKt.to(direct_integration_not_enabled.getJson(), direct_integration_not_enabled);
            LinkErrorCode.InvalidInput.INVALID_LINK_TOKEN invalid_link_token = LinkErrorCode.InvalidInput.INVALID_LINK_TOKEN.INSTANCE;
            Pair pair21 = TuplesKt.to(invalid_link_token.getJson(), invalid_link_token);
            LinkErrorCode.InvalidInput.INVALID_PROCESSOR_TOKEN invalid_processor_token = LinkErrorCode.InvalidInput.INVALID_PROCESSOR_TOKEN.INSTANCE;
            Pair pair22 = TuplesKt.to(invalid_processor_token.getJson(), invalid_processor_token);
            LinkErrorCode.InvalidInput.INVALID_AUDIT_COPY_TOKEN invalid_audit_copy_token = LinkErrorCode.InvalidInput.INVALID_AUDIT_COPY_TOKEN.INSTANCE;
            Pair pair23 = TuplesKt.to(invalid_audit_copy_token.getJson(), invalid_audit_copy_token);
            LinkErrorCode.InvalidInput.INVALID_STRIPE_ACCOUNT invalid_stripe_account = LinkErrorCode.InvalidInput.INVALID_STRIPE_ACCOUNT.INSTANCE;
            Pair pair24 = TuplesKt.to(invalid_stripe_account.getJson(), invalid_stripe_account);
            LinkErrorCode.InvalidInput.INVALID_CREDENTIAL_FIELDS invalid_credential_fields = LinkErrorCode.InvalidInput.INVALID_CREDENTIAL_FIELDS.INSTANCE;
            Pair pair25 = TuplesKt.to(invalid_credential_fields.getJson(), invalid_credential_fields);
            LinkErrorCode.InvalidInput.PRODUCT_UNAVAILABLE product_unavailable = LinkErrorCode.InvalidInput.PRODUCT_UNAVAILABLE.INSTANCE;
            Pair pair26 = TuplesKt.to(product_unavailable.getJson(), product_unavailable);
            LinkErrorCode.InvalidInput.INVALID_WEBHOOK_VERIFICATION_KEY_ID invalid_webhook_verification_key_id = LinkErrorCode.InvalidInput.INVALID_WEBHOOK_VERIFICATION_KEY_ID.INSTANCE;
            Pair pair27 = TuplesKt.to(invalid_webhook_verification_key_id.getJson(), invalid_webhook_verification_key_id);
            LinkErrorCode.RateLimit.ACCOUNTS_LIMIT accounts_limit = LinkErrorCode.RateLimit.ACCOUNTS_LIMIT.INSTANCE;
            Pair pair28 = TuplesKt.to(accounts_limit.getJson(), accounts_limit);
            LinkErrorCode.RateLimit.ADDITION_LIMIT addition_limit = LinkErrorCode.RateLimit.ADDITION_LIMIT.INSTANCE;
            Pair pair29 = TuplesKt.to(addition_limit.getJson(), addition_limit);
            LinkErrorCode.RateLimit.AUTH_LIMIT auth_limit = LinkErrorCode.RateLimit.AUTH_LIMIT.INSTANCE;
            Pair pair30 = TuplesKt.to(auth_limit.getJson(), auth_limit);
            LinkErrorCode.RateLimit.IDENTITY_LIMIT identity_limit = LinkErrorCode.RateLimit.IDENTITY_LIMIT.INSTANCE;
            Pair pair31 = TuplesKt.to(identity_limit.getJson(), identity_limit);
            LinkErrorCode.RateLimit.BALANCE_LIMIT balance_limit = LinkErrorCode.RateLimit.BALANCE_LIMIT.INSTANCE;
            Pair pair32 = TuplesKt.to(balance_limit.getJson(), balance_limit);
            LinkErrorCode.RateLimit.ITEM_GET_LIMIT item_get_limit = LinkErrorCode.RateLimit.ITEM_GET_LIMIT.INSTANCE;
            Pair pair33 = TuplesKt.to(item_get_limit.getJson(), item_get_limit);
            LinkErrorCode.RateLimit.RATE_LIMIT rate_limit = LinkErrorCode.RateLimit.RATE_LIMIT.INSTANCE;
            Pair pair34 = TuplesKt.to(rate_limit.getJson(), rate_limit);
            LinkErrorCode.RateLimit.TRANSACTIONS_LIMIT transactions_limit = LinkErrorCode.RateLimit.TRANSACTIONS_LIMIT.INSTANCE;
            Pair pair35 = TuplesKt.to(transactions_limit.getJson(), transactions_limit);
            LinkErrorCode.ApiError.INTERNAL_SERVER_ERROR internal_server_error = LinkErrorCode.ApiError.INTERNAL_SERVER_ERROR.INSTANCE;
            Pair pair36 = TuplesKt.to(internal_server_error.getJson(), internal_server_error);
            LinkErrorCode.ApiError.PLANNED_MAINTENANCE planned_maintenance = LinkErrorCode.ApiError.PLANNED_MAINTENANCE.INSTANCE;
            Pair pair37 = TuplesKt.to(planned_maintenance.getJson(), planned_maintenance);
            LinkErrorCode.ItemError.INSUFFICIENT_CREDENTIALS insufficient_credentials = LinkErrorCode.ItemError.INSUFFICIENT_CREDENTIALS.INSTANCE;
            Pair pair38 = TuplesKt.to(insufficient_credentials.getJson(), insufficient_credentials);
            LinkErrorCode.ItemError.INVALID_CREDENTIALS invalid_credentials = LinkErrorCode.ItemError.INVALID_CREDENTIALS.INSTANCE;
            Pair pair39 = TuplesKt.to(invalid_credentials.getJson(), invalid_credentials);
            LinkErrorCode.ItemError.INVALID_MFA invalid_mfa = LinkErrorCode.ItemError.INVALID_MFA.INSTANCE;
            Pair pair40 = TuplesKt.to(invalid_mfa.getJson(), invalid_mfa);
            LinkErrorCode.ItemError.INVALID_SEND_METHOD invalid_send_method = LinkErrorCode.ItemError.INVALID_SEND_METHOD.INSTANCE;
            Pair pair41 = TuplesKt.to(invalid_send_method.getJson(), invalid_send_method);
            LinkErrorCode.ItemError.INVALID_UPDATE_USERNAME invalid_update_username = LinkErrorCode.ItemError.INVALID_UPDATE_USERNAME.INSTANCE;
            Pair pair42 = TuplesKt.to(invalid_update_username.getJson(), invalid_update_username);
            LinkErrorCode.ItemError.ITEM_LOCKED item_locked = LinkErrorCode.ItemError.ITEM_LOCKED.INSTANCE;
            Pair pair43 = TuplesKt.to(item_locked.getJson(), item_locked);
            LinkErrorCode.ItemError.ITEM_LOGIN_REQUIRED item_login_required = LinkErrorCode.ItemError.ITEM_LOGIN_REQUIRED.INSTANCE;
            Pair pair44 = TuplesKt.to(item_login_required.getJson(), item_login_required);
            LinkErrorCode.ItemError.ITEM_NO_ERROR item_no_error = LinkErrorCode.ItemError.ITEM_NO_ERROR.INSTANCE;
            Pair pair45 = TuplesKt.to(item_no_error.getJson(), item_no_error);
            Pair pair46 = TuplesKt.to("item-no-error", item_no_error);
            LinkErrorCode.ItemError.ITEM_NOT_SUPPORTED item_not_supported = LinkErrorCode.ItemError.ITEM_NOT_SUPPORTED.INSTANCE;
            Pair pair47 = TuplesKt.to(item_not_supported.getJson(), item_not_supported);
            LinkErrorCode.ItemError.USER_SETUP_REQUIRED user_setup_required = LinkErrorCode.ItemError.USER_SETUP_REQUIRED.INSTANCE;
            Pair pair48 = TuplesKt.to(user_setup_required.getJson(), user_setup_required);
            LinkErrorCode.ItemError.MFA_NOT_SUPPORTED mfa_not_supported = LinkErrorCode.ItemError.MFA_NOT_SUPPORTED.INSTANCE;
            Pair pair49 = TuplesKt.to(mfa_not_supported.getJson(), mfa_not_supported);
            LinkErrorCode.ItemError.NO_ACCOUNTS no_accounts = LinkErrorCode.ItemError.NO_ACCOUNTS.INSTANCE;
            Pair pair50 = TuplesKt.to(no_accounts.getJson(), no_accounts);
            LinkErrorCode.ItemError.NO_AUTH_ACCOUNTS no_auth_accounts = LinkErrorCode.ItemError.NO_AUTH_ACCOUNTS.INSTANCE;
            Pair pair51 = TuplesKt.to(no_auth_accounts.getJson(), no_auth_accounts);
            Pair pair52 = TuplesKt.to("no-depository-accounts", no_auth_accounts);
            LinkErrorCode.ItemError.NO_INVESTMENT_ACCOUNTS no_investment_accounts = LinkErrorCode.ItemError.NO_INVESTMENT_ACCOUNTS.INSTANCE;
            Pair pair53 = TuplesKt.to(no_investment_accounts.getJson(), no_investment_accounts);
            LinkErrorCode.ItemError.NO_LIABILITY_ACCOUNTS no_liability_accounts = LinkErrorCode.ItemError.NO_LIABILITY_ACCOUNTS.INSTANCE;
            Pair pair54 = TuplesKt.to(no_liability_accounts.getJson(), no_liability_accounts);
            LinkErrorCode.ItemError.PRODUCT_NOT_READY product_not_ready = LinkErrorCode.ItemError.PRODUCT_NOT_READY.INSTANCE;
            Pair pair55 = TuplesKt.to(product_not_ready.getJson(), product_not_ready);
            LinkErrorCode.ItemError.PRODUCTS_NOT_SUPPORTED products_not_supported = LinkErrorCode.ItemError.PRODUCTS_NOT_SUPPORTED.INSTANCE;
            Pair pair56 = TuplesKt.to(products_not_supported.getJson(), products_not_supported);
            LinkErrorCode.ItemError.INSTANT_MATCH_FAILED instant_match_failed = LinkErrorCode.ItemError.INSTANT_MATCH_FAILED.INSTANCE;
            Pair pair57 = TuplesKt.to(instant_match_failed.getJson(), instant_match_failed);
            LinkErrorCode.AssetReport.PRODUCT_NOT_ENABLED product_not_enabled = LinkErrorCode.AssetReport.PRODUCT_NOT_ENABLED.INSTANCE;
            Pair pair58 = TuplesKt.to(product_not_enabled.getJson(), product_not_enabled);
            LinkErrorCode.AssetReport.DATA_UNAVAILABLE data_unavailable = LinkErrorCode.AssetReport.DATA_UNAVAILABLE.INSTANCE;
            Pair pair59 = TuplesKt.to(data_unavailable.getJson(), data_unavailable);
            LinkErrorCode.AssetReport.PRODUCT_NOT_READY product_not_ready2 = LinkErrorCode.AssetReport.PRODUCT_NOT_READY.INSTANCE;
            Pair pair60 = TuplesKt.to(product_not_ready2.getJson(), product_not_ready2);
            LinkErrorCode.AssetReport.ASSET_REPORT_GENERATION_FAILED asset_report_generation_failed = LinkErrorCode.AssetReport.ASSET_REPORT_GENERATION_FAILED.INSTANCE;
            Pair pair61 = TuplesKt.to(asset_report_generation_failed.getJson(), asset_report_generation_failed);
            LinkErrorCode.AssetReport.INVALID_PARENT invalid_parent = LinkErrorCode.AssetReport.INVALID_PARENT.INSTANCE;
            Pair pair62 = TuplesKt.to(invalid_parent.getJson(), invalid_parent);
            LinkErrorCode.AssetReport.INSIGHTS_NOT_ENABLED insights_not_enabled = LinkErrorCode.AssetReport.INSIGHTS_NOT_ENABLED.INSTANCE;
            Pair pair63 = TuplesKt.to(insights_not_enabled.getJson(), insights_not_enabled);
            LinkErrorCode.AssetReport.INSIGHTS_PREVIOUSLY_NOT_ENABLED insights_previously_not_enabled = LinkErrorCode.AssetReport.INSIGHTS_PREVIOUSLY_NOT_ENABLED.INSTANCE;
            Pair pair64 = TuplesKt.to(insights_previously_not_enabled.getJson(), insights_previously_not_enabled);
            LinkErrorCode.RecaptchaError.RECAPTCHA_REQUIRED recaptcha_required = LinkErrorCode.RecaptchaError.RECAPTCHA_REQUIRED.INSTANCE;
            Pair pair65 = TuplesKt.to(recaptcha_required.getJson(), recaptcha_required);
            LinkErrorCode.RecaptchaError.RECAPTCHA_BAD recaptcha_bad = LinkErrorCode.RecaptchaError.RECAPTCHA_BAD.INSTANCE;
            Pair pair66 = TuplesKt.to(recaptcha_bad.getJson(), recaptcha_bad);
            LinkErrorCode.BankTransferError.BANK_TRANSFER_LIMIT_EXCEEDED bank_transfer_limit_exceeded = LinkErrorCode.BankTransferError.BANK_TRANSFER_LIMIT_EXCEEDED.INSTANCE;
            Pair pair67 = TuplesKt.to(bank_transfer_limit_exceeded.getJson(), bank_transfer_limit_exceeded);
            LinkErrorCode.BankTransferError.BANK_TRANSFER_MISSING_ORIGINATION_ACCOUNT bank_transfer_missing_origination_account = LinkErrorCode.BankTransferError.BANK_TRANSFER_MISSING_ORIGINATION_ACCOUNT.INSTANCE;
            Pair pair68 = TuplesKt.to(bank_transfer_missing_origination_account.getJson(), bank_transfer_missing_origination_account);
            LinkErrorCode.BankTransferError.BANK_TRANSFER_INVALID_ORIGINATION_ACCOUNT bank_transfer_invalid_origination_account = LinkErrorCode.BankTransferError.BANK_TRANSFER_INVALID_ORIGINATION_ACCOUNT.INSTANCE;
            Pair pair69 = TuplesKt.to(bank_transfer_invalid_origination_account.getJson(), bank_transfer_invalid_origination_account);
            LinkErrorCode.BankTransferError.BANK_TRANSFER_ACCOUNT_BLOCKED bank_transfer_account_blocked = LinkErrorCode.BankTransferError.BANK_TRANSFER_ACCOUNT_BLOCKED.INSTANCE;
            Pair pair70 = TuplesKt.to(bank_transfer_account_blocked.getJson(), bank_transfer_account_blocked);
            LinkErrorCode.BankTransferError.BANK_TRANSFER_INSUFFICIENT_FUNDS bank_transfer_insufficient_funds = LinkErrorCode.BankTransferError.BANK_TRANSFER_INSUFFICIENT_FUNDS.INSTANCE;
            Pair pair71 = TuplesKt.to(bank_transfer_insufficient_funds.getJson(), bank_transfer_insufficient_funds);
            LinkErrorCode.BankTransferError.BANK_TRANSFER_NOT_CANCELLABLE bank_transfer_not_cancellable = LinkErrorCode.BankTransferError.BANK_TRANSFER_NOT_CANCELLABLE.INSTANCE;
            Pair pair72 = TuplesKt.to(bank_transfer_not_cancellable.getJson(), bank_transfer_not_cancellable);
            LinkErrorCode.BankTransferError.BANK_TRANSFER_UNSUPPORTED_ACCOUNT_TYPE bank_transfer_unsupported_account_type = LinkErrorCode.BankTransferError.BANK_TRANSFER_UNSUPPORTED_ACCOUNT_TYPE.INSTANCE;
            Pair pair73 = TuplesKt.to(bank_transfer_unsupported_account_type.getJson(), bank_transfer_unsupported_account_type);
            LinkErrorCode.BankTransferError.BANK_TRANSFER_UNSUPPORTED_ENVIRONMENT bank_transfer_unsupported_environment = LinkErrorCode.BankTransferError.BANK_TRANSFER_UNSUPPORTED_ENVIRONMENT.INSTANCE;
            Pair pair74 = TuplesKt.to(bank_transfer_unsupported_environment.getJson(), bank_transfer_unsupported_environment);
            LinkErrorCode.PaymentError.PAYMENT_BLOCKED payment_blocked = LinkErrorCode.PaymentError.PAYMENT_BLOCKED.INSTANCE;
            Pair pair75 = TuplesKt.to(payment_blocked.getJson(), payment_blocked);
            LinkErrorCode.PaymentError.PAYMENT_INSUFFICIENT_FUNDS payment_insufficient_funds = LinkErrorCode.PaymentError.PAYMENT_INSUFFICIENT_FUNDS.INSTANCE;
            Pair pair76 = TuplesKt.to(payment_insufficient_funds.getJson(), payment_insufficient_funds);
            LinkErrorCode.PaymentError.PAYMENT_INVALID_RECIPIENT payment_invalid_recipient = LinkErrorCode.PaymentError.PAYMENT_INVALID_RECIPIENT.INSTANCE;
            Pair pair77 = TuplesKt.to(payment_invalid_recipient.getJson(), payment_invalid_recipient);
            LinkErrorCode.PaymentError.PAYMENT_INVALID_REFERENCE payment_invalid_reference = LinkErrorCode.PaymentError.PAYMENT_INVALID_REFERENCE.INSTANCE;
            Pair pair78 = TuplesKt.to(payment_invalid_reference.getJson(), payment_invalid_reference);
            LinkErrorCode.PaymentError.PAYMENT_INVALID_SCHEDULE payment_invalid_schedule = LinkErrorCode.PaymentError.PAYMENT_INVALID_SCHEDULE.INSTANCE;
            Pair pair79 = TuplesKt.to(payment_invalid_schedule.getJson(), payment_invalid_schedule);
            LinkErrorCode.OAuthError.INCORRECT_OAUTH_NONCE incorrect_oauth_nonce = LinkErrorCode.OAuthError.INCORRECT_OAUTH_NONCE.INSTANCE;
            Pair pair80 = TuplesKt.to(incorrect_oauth_nonce.getJson(), incorrect_oauth_nonce);
            LinkErrorCode.OAuthError.INCORRECT_LINK_TOKEN incorrect_link_token = LinkErrorCode.OAuthError.INCORRECT_LINK_TOKEN.INSTANCE;
            Pair pair81 = TuplesKt.to(incorrect_link_token.getJson(), incorrect_link_token);
            LinkErrorCode.OAuthError.OAUTH_STATE_ID_ALREADY_PROCESSED oauth_state_id_already_processed = LinkErrorCode.OAuthError.OAUTH_STATE_ID_ALREADY_PROCESSED.INSTANCE;
            Pair pair82 = TuplesKt.to(oauth_state_id_already_processed.getJson(), oauth_state_id_already_processed);
            LinkErrorCode.DepositSwitchError.INVALID_DEPOSIT_SWITCH_ID invalid_deposit_switch_id = LinkErrorCode.DepositSwitchError.INVALID_DEPOSIT_SWITCH_ID.INSTANCE;
            Pair pair83 = TuplesKt.to(invalid_deposit_switch_id.getJson(), invalid_deposit_switch_id);
            LinkErrorCode.DepositSwitchError.DEPOSIT_SWITCH_NOT_FOUND deposit_switch_not_found = LinkErrorCode.DepositSwitchError.DEPOSIT_SWITCH_NOT_FOUND.INSTANCE;
            Pair pair84 = TuplesKt.to(deposit_switch_not_found.getJson(), deposit_switch_not_found);
            LinkErrorCode.DepositSwitchError.DEPOSIT_SWITCH_TOKEN_NOT_FOUND deposit_switch_token_not_found = LinkErrorCode.DepositSwitchError.DEPOSIT_SWITCH_TOKEN_NOT_FOUND.INSTANCE;
            Pair pair85 = TuplesKt.to(deposit_switch_token_not_found.getJson(), deposit_switch_token_not_found);
            LinkErrorCode.DepositSwitchError.DEPOSIT_SWITCH_INVALID_ACCOUNT deposit_switch_invalid_account = LinkErrorCode.DepositSwitchError.DEPOSIT_SWITCH_INVALID_ACCOUNT.INSTANCE;
            Pair pair86 = TuplesKt.to(deposit_switch_invalid_account.getJson(), deposit_switch_invalid_account);
            LinkErrorCode.DepositSwitchError.DEPOSIT_SWITCH_VALID_AUTH_NOT_FOUND deposit_switch_valid_auth_not_found = LinkErrorCode.DepositSwitchError.DEPOSIT_SWITCH_VALID_AUTH_NOT_FOUND.INSTANCE;
            Pair pair87 = TuplesKt.to(deposit_switch_valid_auth_not_found.getJson(), deposit_switch_valid_auth_not_found);
            LinkErrorCode.DepositSwitchError.DEPOSIT_SWITCH_VALID_IDENTITY_NOT_FOUND deposit_switch_valid_identity_not_found = LinkErrorCode.DepositSwitchError.DEPOSIT_SWITCH_VALID_IDENTITY_NOT_FOUND.INSTANCE;
            Pair pair88 = TuplesKt.to(deposit_switch_valid_identity_not_found.getJson(), deposit_switch_valid_identity_not_found);
            LinkErrorCode.DepositSwitchError.DEPOSIT_SWITCH_ALREADY_COMPLETED deposit_switch_already_completed = LinkErrorCode.DepositSwitchError.DEPOSIT_SWITCH_ALREADY_COMPLETED.INSTANCE;
            Pair pair89 = TuplesKt.to(deposit_switch_already_completed.getJson(), deposit_switch_already_completed);
            LinkErrorCode.SandboxError.SANDBOX_PRODUCT_NOT_ENABLED sandbox_product_not_enabled = LinkErrorCode.SandboxError.SANDBOX_PRODUCT_NOT_ENABLED.INSTANCE;
            Pair pair90 = TuplesKt.to(sandbox_product_not_enabled.getJson(), sandbox_product_not_enabled);
            LinkErrorCode.SandboxError.SANDBOX_WEBHOOK_INVALID sandbox_webhook_invalid = LinkErrorCode.SandboxError.SANDBOX_WEBHOOK_INVALID.INSTANCE;
            Pair pair91 = TuplesKt.to(sandbox_webhook_invalid.getJson(), sandbox_webhook_invalid);
            LinkErrorCode.SandboxError.SANDBOX_BANK_TRANSFER_EVENT_TRANSITION_INVALID sandbox_bank_transfer_event_transition_invalid = LinkErrorCode.SandboxError.SANDBOX_BANK_TRANSFER_EVENT_TRANSITION_INVALID.INSTANCE;
            Pair pair92 = TuplesKt.to(sandbox_bank_transfer_event_transition_invalid.getJson(), sandbox_bank_transfer_event_transition_invalid);
            LinkErrorCode.InstitutionError.INSTITUTION_DOWN institution_down = LinkErrorCode.InstitutionError.INSTITUTION_DOWN.INSTANCE;
            Pair pair93 = TuplesKt.to(institution_down.getJson(), institution_down);
            LinkErrorCode.InstitutionError.INSTITUTION_NOT_RESPONDING institution_not_responding = LinkErrorCode.InstitutionError.INSTITUTION_NOT_RESPONDING.INSTANCE;
            Pair pair94 = TuplesKt.to(institution_not_responding.getJson(), institution_not_responding);
            LinkErrorCode.InstitutionError.INSTITUTION_NOT_AVAILABLE institution_not_available = LinkErrorCode.InstitutionError.INSTITUTION_NOT_AVAILABLE.INSTANCE;
            Pair pair95 = TuplesKt.to(institution_not_available.getJson(), institution_not_available);
            LinkErrorCode.InstitutionError.INSTITUTION_NO_LONGER_SUPPORTED institution_no_longer_supported = LinkErrorCode.InstitutionError.INSTITUTION_NO_LONGER_SUPPORTED.INSTANCE;
            return MapsKt.mapOf(pair, pair2, pair3, pair4, pair5, pair6, pair7, pair8, pair9, pair10, pair11, pair12, pair13, pair14, pair15, pair16, pair17, pair18, pair19, pair20, pair21, pair22, pair23, pair24, pair25, pair26, pair27, pair28, pair29, pair30, pair31, pair32, pair33, pair34, pair35, pair36, pair37, pair38, pair39, pair40, pair41, pair42, pair43, pair44, pair45, pair46, pair47, pair48, pair49, pair50, pair51, pair52, pair53, pair54, pair55, pair56, pair57, pair58, pair59, pair60, pair61, pair62, pair63, pair64, pair65, pair66, pair67, pair68, pair69, pair70, pair71, pair72, pair73, pair74, pair75, pair76, pair77, pair78, pair79, pair80, pair81, pair82, pair83, pair84, pair85, pair86, pair87, pair88, pair89, pair90, pair91, pair92, pair93, pair94, pair95, TuplesKt.to(institution_no_longer_supported.getJson(), institution_no_longer_supported));
        }
    });

    @NotNull
    private final LinkErrorType errorType;

    @NotNull
    private final String json;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0005\u0006B\u0011\b\u0004\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004\u0082\u0001\u0002\u0007\b¨\u0006\t"}, d2 = {"Lcom/plaid/link/result/LinkErrorCode$ApiError;", "Lcom/plaid/link/result/LinkErrorCode;", "json", "", "(Ljava/lang/String;)V", "INTERNAL_SERVER_ERROR", "PLANNED_MAINTENANCE", "Lcom/plaid/link/result/LinkErrorCode$ApiError$INTERNAL_SERVER_ERROR;", "Lcom/plaid/link/result/LinkErrorCode$ApiError$PLANNED_MAINTENANCE;", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class ApiError extends LinkErrorCode {

        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004HÖ\u0001J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¨\u0006\n"}, d2 = {"Lcom/plaid/link/result/LinkErrorCode$ApiError$INTERNAL_SERVER_ERROR;", "Lcom/plaid/link/result/LinkErrorCode$ApiError;", "()V", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class INTERNAL_SERVER_ERROR extends ApiError {

            @NotNull
            public static final INTERNAL_SERVER_ERROR INSTANCE = new INTERNAL_SERVER_ERROR();

            @NotNull
            public static final Parcelable.Creator<INTERNAL_SERVER_ERROR> CREATOR = new Creator();

            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<INTERNAL_SERVER_ERROR> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @NotNull
                public final INTERNAL_SERVER_ERROR createFromParcel(@NotNull Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return INTERNAL_SERVER_ERROR.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @NotNull
                public final INTERNAL_SERVER_ERROR[] newArray(int i10) {
                    return new INTERNAL_SERVER_ERROR[i10];
                }
            }

            private INTERNAL_SERVER_ERROR() {
                super("INTERNAL_SERVER_ERROR", null);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(@NotNull Parcel parcel, int flags) {
                Intrinsics.checkNotNullParameter(parcel, "out");
                parcel.writeInt(1);
            }
        }

        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004HÖ\u0001J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¨\u0006\n"}, d2 = {"Lcom/plaid/link/result/LinkErrorCode$ApiError$PLANNED_MAINTENANCE;", "Lcom/plaid/link/result/LinkErrorCode$ApiError;", "()V", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class PLANNED_MAINTENANCE extends ApiError {

            @NotNull
            public static final PLANNED_MAINTENANCE INSTANCE = new PLANNED_MAINTENANCE();

            @NotNull
            public static final Parcelable.Creator<PLANNED_MAINTENANCE> CREATOR = new Creator();

            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<PLANNED_MAINTENANCE> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @NotNull
                public final PLANNED_MAINTENANCE createFromParcel(@NotNull Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return PLANNED_MAINTENANCE.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @NotNull
                public final PLANNED_MAINTENANCE[] newArray(int i10) {
                    return new PLANNED_MAINTENANCE[i10];
                }
            }

            private PLANNED_MAINTENANCE() {
                super("PLANNED_MAINTENANCE", null);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(@NotNull Parcel parcel, int flags) {
                Intrinsics.checkNotNullParameter(parcel, "out");
                parcel.writeInt(1);
            }
        }

        public /* synthetic */ ApiError(String str, DefaultConstructorMarker defaultConstructorMarker) {
            this(str);
        }

        private ApiError(String str) {
            super(str, LinkErrorType.API_ERROR.INSTANCE, null);
        }

        public /* synthetic */ ApiError(String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? "" : str, null);
        }
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0007\u0005\u0006\u0007\b\t\n\u000bB\u0011\b\u0004\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004\u0082\u0001\u0007\f\r\u000e\u000f\u0010\u0011\u0012¨\u0006\u0013"}, d2 = {"Lcom/plaid/link/result/LinkErrorCode$AssetReport;", "Lcom/plaid/link/result/LinkErrorCode;", "json", "", "(Ljava/lang/String;)V", "ASSET_REPORT_GENERATION_FAILED", "DATA_UNAVAILABLE", "INSIGHTS_NOT_ENABLED", "INSIGHTS_PREVIOUSLY_NOT_ENABLED", "INVALID_PARENT", "PRODUCT_NOT_ENABLED", "PRODUCT_NOT_READY", "Lcom/plaid/link/result/LinkErrorCode$AssetReport$ASSET_REPORT_GENERATION_FAILED;", "Lcom/plaid/link/result/LinkErrorCode$AssetReport$DATA_UNAVAILABLE;", "Lcom/plaid/link/result/LinkErrorCode$AssetReport$INSIGHTS_NOT_ENABLED;", "Lcom/plaid/link/result/LinkErrorCode$AssetReport$INSIGHTS_PREVIOUSLY_NOT_ENABLED;", "Lcom/plaid/link/result/LinkErrorCode$AssetReport$INVALID_PARENT;", "Lcom/plaid/link/result/LinkErrorCode$AssetReport$PRODUCT_NOT_ENABLED;", "Lcom/plaid/link/result/LinkErrorCode$AssetReport$PRODUCT_NOT_READY;", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class AssetReport extends LinkErrorCode {

        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004HÖ\u0001J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¨\u0006\n"}, d2 = {"Lcom/plaid/link/result/LinkErrorCode$AssetReport$ASSET_REPORT_GENERATION_FAILED;", "Lcom/plaid/link/result/LinkErrorCode$AssetReport;", "()V", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class ASSET_REPORT_GENERATION_FAILED extends AssetReport {

            @NotNull
            public static final ASSET_REPORT_GENERATION_FAILED INSTANCE = new ASSET_REPORT_GENERATION_FAILED();

            @NotNull
            public static final Parcelable.Creator<ASSET_REPORT_GENERATION_FAILED> CREATOR = new Creator();

            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<ASSET_REPORT_GENERATION_FAILED> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @NotNull
                public final ASSET_REPORT_GENERATION_FAILED createFromParcel(@NotNull Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return ASSET_REPORT_GENERATION_FAILED.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @NotNull
                public final ASSET_REPORT_GENERATION_FAILED[] newArray(int i10) {
                    return new ASSET_REPORT_GENERATION_FAILED[i10];
                }
            }

            private ASSET_REPORT_GENERATION_FAILED() {
                super("ASSET_REPORT_GENERATION_FAILED", null);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(@NotNull Parcel parcel, int flags) {
                Intrinsics.checkNotNullParameter(parcel, "out");
                parcel.writeInt(1);
            }
        }

        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004HÖ\u0001J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¨\u0006\n"}, d2 = {"Lcom/plaid/link/result/LinkErrorCode$AssetReport$DATA_UNAVAILABLE;", "Lcom/plaid/link/result/LinkErrorCode$AssetReport;", "()V", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class DATA_UNAVAILABLE extends AssetReport {

            @NotNull
            public static final DATA_UNAVAILABLE INSTANCE = new DATA_UNAVAILABLE();

            @NotNull
            public static final Parcelable.Creator<DATA_UNAVAILABLE> CREATOR = new Creator();

            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<DATA_UNAVAILABLE> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @NotNull
                public final DATA_UNAVAILABLE createFromParcel(@NotNull Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return DATA_UNAVAILABLE.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @NotNull
                public final DATA_UNAVAILABLE[] newArray(int i10) {
                    return new DATA_UNAVAILABLE[i10];
                }
            }

            private DATA_UNAVAILABLE() {
                super("DATA_UNAVAILABLE", null);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(@NotNull Parcel parcel, int flags) {
                Intrinsics.checkNotNullParameter(parcel, "out");
                parcel.writeInt(1);
            }
        }

        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004HÖ\u0001J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¨\u0006\n"}, d2 = {"Lcom/plaid/link/result/LinkErrorCode$AssetReport$INSIGHTS_NOT_ENABLED;", "Lcom/plaid/link/result/LinkErrorCode$AssetReport;", "()V", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class INSIGHTS_NOT_ENABLED extends AssetReport {

            @NotNull
            public static final INSIGHTS_NOT_ENABLED INSTANCE = new INSIGHTS_NOT_ENABLED();

            @NotNull
            public static final Parcelable.Creator<INSIGHTS_NOT_ENABLED> CREATOR = new Creator();

            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<INSIGHTS_NOT_ENABLED> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @NotNull
                public final INSIGHTS_NOT_ENABLED createFromParcel(@NotNull Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return INSIGHTS_NOT_ENABLED.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @NotNull
                public final INSIGHTS_NOT_ENABLED[] newArray(int i10) {
                    return new INSIGHTS_NOT_ENABLED[i10];
                }
            }

            private INSIGHTS_NOT_ENABLED() {
                super("INSIGHTS_NOT_ENABLED", null);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(@NotNull Parcel parcel, int flags) {
                Intrinsics.checkNotNullParameter(parcel, "out");
                parcel.writeInt(1);
            }
        }

        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004HÖ\u0001J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¨\u0006\n"}, d2 = {"Lcom/plaid/link/result/LinkErrorCode$AssetReport$INSIGHTS_PREVIOUSLY_NOT_ENABLED;", "Lcom/plaid/link/result/LinkErrorCode$AssetReport;", "()V", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class INSIGHTS_PREVIOUSLY_NOT_ENABLED extends AssetReport {

            @NotNull
            public static final INSIGHTS_PREVIOUSLY_NOT_ENABLED INSTANCE = new INSIGHTS_PREVIOUSLY_NOT_ENABLED();

            @NotNull
            public static final Parcelable.Creator<INSIGHTS_PREVIOUSLY_NOT_ENABLED> CREATOR = new Creator();

            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<INSIGHTS_PREVIOUSLY_NOT_ENABLED> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @NotNull
                public final INSIGHTS_PREVIOUSLY_NOT_ENABLED createFromParcel(@NotNull Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return INSIGHTS_PREVIOUSLY_NOT_ENABLED.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @NotNull
                public final INSIGHTS_PREVIOUSLY_NOT_ENABLED[] newArray(int i10) {
                    return new INSIGHTS_PREVIOUSLY_NOT_ENABLED[i10];
                }
            }

            private INSIGHTS_PREVIOUSLY_NOT_ENABLED() {
                super("INSIGHTS_PREVIOUSLY_NOT_ENABLED", null);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(@NotNull Parcel parcel, int flags) {
                Intrinsics.checkNotNullParameter(parcel, "out");
                parcel.writeInt(1);
            }
        }

        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004HÖ\u0001J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¨\u0006\n"}, d2 = {"Lcom/plaid/link/result/LinkErrorCode$AssetReport$INVALID_PARENT;", "Lcom/plaid/link/result/LinkErrorCode$AssetReport;", "()V", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class INVALID_PARENT extends AssetReport {

            @NotNull
            public static final INVALID_PARENT INSTANCE = new INVALID_PARENT();

            @NotNull
            public static final Parcelable.Creator<INVALID_PARENT> CREATOR = new Creator();

            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<INVALID_PARENT> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @NotNull
                public final INVALID_PARENT createFromParcel(@NotNull Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return INVALID_PARENT.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @NotNull
                public final INVALID_PARENT[] newArray(int i10) {
                    return new INVALID_PARENT[i10];
                }
            }

            private INVALID_PARENT() {
                super("INVALID_PARENT", null);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(@NotNull Parcel parcel, int flags) {
                Intrinsics.checkNotNullParameter(parcel, "out");
                parcel.writeInt(1);
            }
        }

        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004HÖ\u0001J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¨\u0006\n"}, d2 = {"Lcom/plaid/link/result/LinkErrorCode$AssetReport$PRODUCT_NOT_ENABLED;", "Lcom/plaid/link/result/LinkErrorCode$AssetReport;", "()V", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class PRODUCT_NOT_ENABLED extends AssetReport {

            @NotNull
            public static final PRODUCT_NOT_ENABLED INSTANCE = new PRODUCT_NOT_ENABLED();

            @NotNull
            public static final Parcelable.Creator<PRODUCT_NOT_ENABLED> CREATOR = new Creator();

            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<PRODUCT_NOT_ENABLED> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @NotNull
                public final PRODUCT_NOT_ENABLED createFromParcel(@NotNull Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return PRODUCT_NOT_ENABLED.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @NotNull
                public final PRODUCT_NOT_ENABLED[] newArray(int i10) {
                    return new PRODUCT_NOT_ENABLED[i10];
                }
            }

            private PRODUCT_NOT_ENABLED() {
                super("PRODUCT_NOT_ENABLED", null);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(@NotNull Parcel parcel, int flags) {
                Intrinsics.checkNotNullParameter(parcel, "out");
                parcel.writeInt(1);
            }
        }

        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004HÖ\u0001J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¨\u0006\n"}, d2 = {"Lcom/plaid/link/result/LinkErrorCode$AssetReport$PRODUCT_NOT_READY;", "Lcom/plaid/link/result/LinkErrorCode$AssetReport;", "()V", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class PRODUCT_NOT_READY extends AssetReport {

            @NotNull
            public static final PRODUCT_NOT_READY INSTANCE = new PRODUCT_NOT_READY();

            @NotNull
            public static final Parcelable.Creator<PRODUCT_NOT_READY> CREATOR = new Creator();

            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<PRODUCT_NOT_READY> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @NotNull
                public final PRODUCT_NOT_READY createFromParcel(@NotNull Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return PRODUCT_NOT_READY.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @NotNull
                public final PRODUCT_NOT_READY[] newArray(int i10) {
                    return new PRODUCT_NOT_READY[i10];
                }
            }

            private PRODUCT_NOT_READY() {
                super("PRODUCT_NOT_READY", null);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(@NotNull Parcel parcel, int flags) {
                Intrinsics.checkNotNullParameter(parcel, "out");
                parcel.writeInt(1);
            }
        }

        public /* synthetic */ AssetReport(String str, DefaultConstructorMarker defaultConstructorMarker) {
            this(str);
        }

        private AssetReport(String str) {
            super(str, LinkErrorType.ASSET_REPORT_ERROR.INSTANCE, null);
        }

        public /* synthetic */ AssetReport(String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? "" : str, null);
        }
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\b\u0005\u0006\u0007\b\t\n\u000b\fB\u0011\b\u0004\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004\u0082\u0001\b\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014¨\u0006\u0015"}, d2 = {"Lcom/plaid/link/result/LinkErrorCode$BankTransferError;", "Lcom/plaid/link/result/LinkErrorCode;", "json", "", "(Ljava/lang/String;)V", "BANK_TRANSFER_ACCOUNT_BLOCKED", "BANK_TRANSFER_INSUFFICIENT_FUNDS", "BANK_TRANSFER_INVALID_ORIGINATION_ACCOUNT", "BANK_TRANSFER_LIMIT_EXCEEDED", "BANK_TRANSFER_MISSING_ORIGINATION_ACCOUNT", "BANK_TRANSFER_NOT_CANCELLABLE", "BANK_TRANSFER_UNSUPPORTED_ACCOUNT_TYPE", "BANK_TRANSFER_UNSUPPORTED_ENVIRONMENT", "Lcom/plaid/link/result/LinkErrorCode$BankTransferError$BANK_TRANSFER_ACCOUNT_BLOCKED;", "Lcom/plaid/link/result/LinkErrorCode$BankTransferError$BANK_TRANSFER_INSUFFICIENT_FUNDS;", "Lcom/plaid/link/result/LinkErrorCode$BankTransferError$BANK_TRANSFER_INVALID_ORIGINATION_ACCOUNT;", "Lcom/plaid/link/result/LinkErrorCode$BankTransferError$BANK_TRANSFER_LIMIT_EXCEEDED;", "Lcom/plaid/link/result/LinkErrorCode$BankTransferError$BANK_TRANSFER_MISSING_ORIGINATION_ACCOUNT;", "Lcom/plaid/link/result/LinkErrorCode$BankTransferError$BANK_TRANSFER_NOT_CANCELLABLE;", "Lcom/plaid/link/result/LinkErrorCode$BankTransferError$BANK_TRANSFER_UNSUPPORTED_ACCOUNT_TYPE;", "Lcom/plaid/link/result/LinkErrorCode$BankTransferError$BANK_TRANSFER_UNSUPPORTED_ENVIRONMENT;", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class BankTransferError extends LinkErrorCode {

        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004HÖ\u0001J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¨\u0006\n"}, d2 = {"Lcom/plaid/link/result/LinkErrorCode$BankTransferError$BANK_TRANSFER_ACCOUNT_BLOCKED;", "Lcom/plaid/link/result/LinkErrorCode$BankTransferError;", "()V", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class BANK_TRANSFER_ACCOUNT_BLOCKED extends BankTransferError {

            @NotNull
            public static final BANK_TRANSFER_ACCOUNT_BLOCKED INSTANCE = new BANK_TRANSFER_ACCOUNT_BLOCKED();

            @NotNull
            public static final Parcelable.Creator<BANK_TRANSFER_ACCOUNT_BLOCKED> CREATOR = new Creator();

            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<BANK_TRANSFER_ACCOUNT_BLOCKED> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @NotNull
                public final BANK_TRANSFER_ACCOUNT_BLOCKED createFromParcel(@NotNull Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return BANK_TRANSFER_ACCOUNT_BLOCKED.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @NotNull
                public final BANK_TRANSFER_ACCOUNT_BLOCKED[] newArray(int i10) {
                    return new BANK_TRANSFER_ACCOUNT_BLOCKED[i10];
                }
            }

            private BANK_TRANSFER_ACCOUNT_BLOCKED() {
                super("BANK_TRANSFER_ACCOUNT_BLOCKED", null);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(@NotNull Parcel parcel, int flags) {
                Intrinsics.checkNotNullParameter(parcel, "out");
                parcel.writeInt(1);
            }
        }

        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004HÖ\u0001J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¨\u0006\n"}, d2 = {"Lcom/plaid/link/result/LinkErrorCode$BankTransferError$BANK_TRANSFER_INSUFFICIENT_FUNDS;", "Lcom/plaid/link/result/LinkErrorCode$BankTransferError;", "()V", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class BANK_TRANSFER_INSUFFICIENT_FUNDS extends BankTransferError {

            @NotNull
            public static final BANK_TRANSFER_INSUFFICIENT_FUNDS INSTANCE = new BANK_TRANSFER_INSUFFICIENT_FUNDS();

            @NotNull
            public static final Parcelable.Creator<BANK_TRANSFER_INSUFFICIENT_FUNDS> CREATOR = new Creator();

            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<BANK_TRANSFER_INSUFFICIENT_FUNDS> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @NotNull
                public final BANK_TRANSFER_INSUFFICIENT_FUNDS createFromParcel(@NotNull Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return BANK_TRANSFER_INSUFFICIENT_FUNDS.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @NotNull
                public final BANK_TRANSFER_INSUFFICIENT_FUNDS[] newArray(int i10) {
                    return new BANK_TRANSFER_INSUFFICIENT_FUNDS[i10];
                }
            }

            private BANK_TRANSFER_INSUFFICIENT_FUNDS() {
                super("BANK_TRANSFER_INSUFFICIENT_FUNDS", null);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(@NotNull Parcel parcel, int flags) {
                Intrinsics.checkNotNullParameter(parcel, "out");
                parcel.writeInt(1);
            }
        }

        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004HÖ\u0001J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¨\u0006\n"}, d2 = {"Lcom/plaid/link/result/LinkErrorCode$BankTransferError$BANK_TRANSFER_INVALID_ORIGINATION_ACCOUNT;", "Lcom/plaid/link/result/LinkErrorCode$BankTransferError;", "()V", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class BANK_TRANSFER_INVALID_ORIGINATION_ACCOUNT extends BankTransferError {

            @NotNull
            public static final BANK_TRANSFER_INVALID_ORIGINATION_ACCOUNT INSTANCE = new BANK_TRANSFER_INVALID_ORIGINATION_ACCOUNT();

            @NotNull
            public static final Parcelable.Creator<BANK_TRANSFER_INVALID_ORIGINATION_ACCOUNT> CREATOR = new Creator();

            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<BANK_TRANSFER_INVALID_ORIGINATION_ACCOUNT> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @NotNull
                public final BANK_TRANSFER_INVALID_ORIGINATION_ACCOUNT createFromParcel(@NotNull Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return BANK_TRANSFER_INVALID_ORIGINATION_ACCOUNT.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @NotNull
                public final BANK_TRANSFER_INVALID_ORIGINATION_ACCOUNT[] newArray(int i10) {
                    return new BANK_TRANSFER_INVALID_ORIGINATION_ACCOUNT[i10];
                }
            }

            private BANK_TRANSFER_INVALID_ORIGINATION_ACCOUNT() {
                super("BANK_TRANSFER_INVALID_ORIGINATION_ACCOUNT", null);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(@NotNull Parcel parcel, int flags) {
                Intrinsics.checkNotNullParameter(parcel, "out");
                parcel.writeInt(1);
            }
        }

        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004HÖ\u0001J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¨\u0006\n"}, d2 = {"Lcom/plaid/link/result/LinkErrorCode$BankTransferError$BANK_TRANSFER_LIMIT_EXCEEDED;", "Lcom/plaid/link/result/LinkErrorCode$BankTransferError;", "()V", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class BANK_TRANSFER_LIMIT_EXCEEDED extends BankTransferError {

            @NotNull
            public static final BANK_TRANSFER_LIMIT_EXCEEDED INSTANCE = new BANK_TRANSFER_LIMIT_EXCEEDED();

            @NotNull
            public static final Parcelable.Creator<BANK_TRANSFER_LIMIT_EXCEEDED> CREATOR = new Creator();

            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<BANK_TRANSFER_LIMIT_EXCEEDED> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @NotNull
                public final BANK_TRANSFER_LIMIT_EXCEEDED createFromParcel(@NotNull Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return BANK_TRANSFER_LIMIT_EXCEEDED.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @NotNull
                public final BANK_TRANSFER_LIMIT_EXCEEDED[] newArray(int i10) {
                    return new BANK_TRANSFER_LIMIT_EXCEEDED[i10];
                }
            }

            private BANK_TRANSFER_LIMIT_EXCEEDED() {
                super("BANK_TRANSFER_LIMIT_EXCEEDED", null);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(@NotNull Parcel parcel, int flags) {
                Intrinsics.checkNotNullParameter(parcel, "out");
                parcel.writeInt(1);
            }
        }

        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004HÖ\u0001J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¨\u0006\n"}, d2 = {"Lcom/plaid/link/result/LinkErrorCode$BankTransferError$BANK_TRANSFER_MISSING_ORIGINATION_ACCOUNT;", "Lcom/plaid/link/result/LinkErrorCode$BankTransferError;", "()V", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class BANK_TRANSFER_MISSING_ORIGINATION_ACCOUNT extends BankTransferError {

            @NotNull
            public static final BANK_TRANSFER_MISSING_ORIGINATION_ACCOUNT INSTANCE = new BANK_TRANSFER_MISSING_ORIGINATION_ACCOUNT();

            @NotNull
            public static final Parcelable.Creator<BANK_TRANSFER_MISSING_ORIGINATION_ACCOUNT> CREATOR = new Creator();

            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<BANK_TRANSFER_MISSING_ORIGINATION_ACCOUNT> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @NotNull
                public final BANK_TRANSFER_MISSING_ORIGINATION_ACCOUNT createFromParcel(@NotNull Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return BANK_TRANSFER_MISSING_ORIGINATION_ACCOUNT.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @NotNull
                public final BANK_TRANSFER_MISSING_ORIGINATION_ACCOUNT[] newArray(int i10) {
                    return new BANK_TRANSFER_MISSING_ORIGINATION_ACCOUNT[i10];
                }
            }

            private BANK_TRANSFER_MISSING_ORIGINATION_ACCOUNT() {
                super("BANK_TRANSFER_MISSING_ORIGINATION_ACCOUNT", null);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(@NotNull Parcel parcel, int flags) {
                Intrinsics.checkNotNullParameter(parcel, "out");
                parcel.writeInt(1);
            }
        }

        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004HÖ\u0001J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¨\u0006\n"}, d2 = {"Lcom/plaid/link/result/LinkErrorCode$BankTransferError$BANK_TRANSFER_NOT_CANCELLABLE;", "Lcom/plaid/link/result/LinkErrorCode$BankTransferError;", "()V", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class BANK_TRANSFER_NOT_CANCELLABLE extends BankTransferError {

            @NotNull
            public static final BANK_TRANSFER_NOT_CANCELLABLE INSTANCE = new BANK_TRANSFER_NOT_CANCELLABLE();

            @NotNull
            public static final Parcelable.Creator<BANK_TRANSFER_NOT_CANCELLABLE> CREATOR = new Creator();

            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<BANK_TRANSFER_NOT_CANCELLABLE> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @NotNull
                public final BANK_TRANSFER_NOT_CANCELLABLE createFromParcel(@NotNull Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return BANK_TRANSFER_NOT_CANCELLABLE.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @NotNull
                public final BANK_TRANSFER_NOT_CANCELLABLE[] newArray(int i10) {
                    return new BANK_TRANSFER_NOT_CANCELLABLE[i10];
                }
            }

            private BANK_TRANSFER_NOT_CANCELLABLE() {
                super("BANK_TRANSFER_NOT_CANCELLABLE", null);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(@NotNull Parcel parcel, int flags) {
                Intrinsics.checkNotNullParameter(parcel, "out");
                parcel.writeInt(1);
            }
        }

        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004HÖ\u0001J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¨\u0006\n"}, d2 = {"Lcom/plaid/link/result/LinkErrorCode$BankTransferError$BANK_TRANSFER_UNSUPPORTED_ACCOUNT_TYPE;", "Lcom/plaid/link/result/LinkErrorCode$BankTransferError;", "()V", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class BANK_TRANSFER_UNSUPPORTED_ACCOUNT_TYPE extends BankTransferError {

            @NotNull
            public static final BANK_TRANSFER_UNSUPPORTED_ACCOUNT_TYPE INSTANCE = new BANK_TRANSFER_UNSUPPORTED_ACCOUNT_TYPE();

            @NotNull
            public static final Parcelable.Creator<BANK_TRANSFER_UNSUPPORTED_ACCOUNT_TYPE> CREATOR = new Creator();

            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<BANK_TRANSFER_UNSUPPORTED_ACCOUNT_TYPE> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @NotNull
                public final BANK_TRANSFER_UNSUPPORTED_ACCOUNT_TYPE createFromParcel(@NotNull Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return BANK_TRANSFER_UNSUPPORTED_ACCOUNT_TYPE.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @NotNull
                public final BANK_TRANSFER_UNSUPPORTED_ACCOUNT_TYPE[] newArray(int i10) {
                    return new BANK_TRANSFER_UNSUPPORTED_ACCOUNT_TYPE[i10];
                }
            }

            private BANK_TRANSFER_UNSUPPORTED_ACCOUNT_TYPE() {
                super("BANK_TRANSFER_UNSUPPORTED_ACCOUNT_TYPE", null);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(@NotNull Parcel parcel, int flags) {
                Intrinsics.checkNotNullParameter(parcel, "out");
                parcel.writeInt(1);
            }
        }

        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004HÖ\u0001J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¨\u0006\n"}, d2 = {"Lcom/plaid/link/result/LinkErrorCode$BankTransferError$BANK_TRANSFER_UNSUPPORTED_ENVIRONMENT;", "Lcom/plaid/link/result/LinkErrorCode$BankTransferError;", "()V", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class BANK_TRANSFER_UNSUPPORTED_ENVIRONMENT extends BankTransferError {

            @NotNull
            public static final BANK_TRANSFER_UNSUPPORTED_ENVIRONMENT INSTANCE = new BANK_TRANSFER_UNSUPPORTED_ENVIRONMENT();

            @NotNull
            public static final Parcelable.Creator<BANK_TRANSFER_UNSUPPORTED_ENVIRONMENT> CREATOR = new Creator();

            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<BANK_TRANSFER_UNSUPPORTED_ENVIRONMENT> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @NotNull
                public final BANK_TRANSFER_UNSUPPORTED_ENVIRONMENT createFromParcel(@NotNull Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return BANK_TRANSFER_UNSUPPORTED_ENVIRONMENT.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @NotNull
                public final BANK_TRANSFER_UNSUPPORTED_ENVIRONMENT[] newArray(int i10) {
                    return new BANK_TRANSFER_UNSUPPORTED_ENVIRONMENT[i10];
                }
            }

            private BANK_TRANSFER_UNSUPPORTED_ENVIRONMENT() {
                super("BANK_TRANSFER_UNSUPPORTED_ENVIRONMENT", null);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(@NotNull Parcel parcel, int flags) {
                Intrinsics.checkNotNullParameter(parcel, "out");
                parcel.writeInt(1);
            }
        }

        public /* synthetic */ BankTransferError(String str, DefaultConstructorMarker defaultConstructorMarker) {
            this(str);
        }

        private BankTransferError(String str) {
            super(str, LinkErrorType.INSTITUTION_ERROR.INSTANCE, null);
        }

        public /* synthetic */ BankTransferError(String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? "" : str, null);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u000b\u001a\u00020\u00062\b\u0010\f\u001a\u0004\u0018\u00010\u0005R'\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\b¨\u0006\r"}, d2 = {"Lcom/plaid/link/result/LinkErrorCode$Companion;", "", "()V", "jsonToObject", "", "", "Lcom/plaid/link/result/LinkErrorCode;", "getJsonToObject", "()Ljava/util/Map;", "jsonToObject$delegate", "Lkotlin/Lazy;", "convert", "json", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final Map<String, LinkErrorCode> getJsonToObject() {
            return (Map) LinkErrorCode.jsonToObject$delegate.getValue();
        }

        @NotNull
        public final LinkErrorCode convert(@Nullable String json) {
            LinkErrorCode linkErrorCode = getJsonToObject().get(json);
            if (linkErrorCode == null) {
                String str = json == null ? "" : json;
                if (json == null) {
                    json = "";
                }
                linkErrorCode = new UNKNOWN(str, new LinkErrorType.UNKNOWN(json));
            }
            return linkErrorCode;
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0007\u0005\u0006\u0007\b\t\n\u000bB\u0011\b\u0004\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004\u0082\u0001\u0007\f\r\u000e\u000f\u0010\u0011\u0012¨\u0006\u0013"}, d2 = {"Lcom/plaid/link/result/LinkErrorCode$DepositSwitchError;", "Lcom/plaid/link/result/LinkErrorCode;", "json", "", "(Ljava/lang/String;)V", "DEPOSIT_SWITCH_ALREADY_COMPLETED", "DEPOSIT_SWITCH_INVALID_ACCOUNT", "DEPOSIT_SWITCH_NOT_FOUND", "DEPOSIT_SWITCH_TOKEN_NOT_FOUND", "DEPOSIT_SWITCH_VALID_AUTH_NOT_FOUND", "DEPOSIT_SWITCH_VALID_IDENTITY_NOT_FOUND", "INVALID_DEPOSIT_SWITCH_ID", "Lcom/plaid/link/result/LinkErrorCode$DepositSwitchError$DEPOSIT_SWITCH_ALREADY_COMPLETED;", "Lcom/plaid/link/result/LinkErrorCode$DepositSwitchError$DEPOSIT_SWITCH_INVALID_ACCOUNT;", "Lcom/plaid/link/result/LinkErrorCode$DepositSwitchError$DEPOSIT_SWITCH_NOT_FOUND;", "Lcom/plaid/link/result/LinkErrorCode$DepositSwitchError$DEPOSIT_SWITCH_TOKEN_NOT_FOUND;", "Lcom/plaid/link/result/LinkErrorCode$DepositSwitchError$DEPOSIT_SWITCH_VALID_AUTH_NOT_FOUND;", "Lcom/plaid/link/result/LinkErrorCode$DepositSwitchError$DEPOSIT_SWITCH_VALID_IDENTITY_NOT_FOUND;", "Lcom/plaid/link/result/LinkErrorCode$DepositSwitchError$INVALID_DEPOSIT_SWITCH_ID;", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class DepositSwitchError extends LinkErrorCode {

        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004HÖ\u0001J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¨\u0006\n"}, d2 = {"Lcom/plaid/link/result/LinkErrorCode$DepositSwitchError$DEPOSIT_SWITCH_ALREADY_COMPLETED;", "Lcom/plaid/link/result/LinkErrorCode$DepositSwitchError;", "()V", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class DEPOSIT_SWITCH_ALREADY_COMPLETED extends DepositSwitchError {

            @NotNull
            public static final DEPOSIT_SWITCH_ALREADY_COMPLETED INSTANCE = new DEPOSIT_SWITCH_ALREADY_COMPLETED();

            @NotNull
            public static final Parcelable.Creator<DEPOSIT_SWITCH_ALREADY_COMPLETED> CREATOR = new Creator();

            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<DEPOSIT_SWITCH_ALREADY_COMPLETED> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @NotNull
                public final DEPOSIT_SWITCH_ALREADY_COMPLETED createFromParcel(@NotNull Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return DEPOSIT_SWITCH_ALREADY_COMPLETED.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @NotNull
                public final DEPOSIT_SWITCH_ALREADY_COMPLETED[] newArray(int i10) {
                    return new DEPOSIT_SWITCH_ALREADY_COMPLETED[i10];
                }
            }

            private DEPOSIT_SWITCH_ALREADY_COMPLETED() {
                super("DEPOSIT_SWITCH_ALREADY_COMPLETED", null);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(@NotNull Parcel parcel, int flags) {
                Intrinsics.checkNotNullParameter(parcel, "out");
                parcel.writeInt(1);
            }
        }

        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004HÖ\u0001J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¨\u0006\n"}, d2 = {"Lcom/plaid/link/result/LinkErrorCode$DepositSwitchError$DEPOSIT_SWITCH_INVALID_ACCOUNT;", "Lcom/plaid/link/result/LinkErrorCode$DepositSwitchError;", "()V", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class DEPOSIT_SWITCH_INVALID_ACCOUNT extends DepositSwitchError {

            @NotNull
            public static final DEPOSIT_SWITCH_INVALID_ACCOUNT INSTANCE = new DEPOSIT_SWITCH_INVALID_ACCOUNT();

            @NotNull
            public static final Parcelable.Creator<DEPOSIT_SWITCH_INVALID_ACCOUNT> CREATOR = new Creator();

            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<DEPOSIT_SWITCH_INVALID_ACCOUNT> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @NotNull
                public final DEPOSIT_SWITCH_INVALID_ACCOUNT createFromParcel(@NotNull Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return DEPOSIT_SWITCH_INVALID_ACCOUNT.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @NotNull
                public final DEPOSIT_SWITCH_INVALID_ACCOUNT[] newArray(int i10) {
                    return new DEPOSIT_SWITCH_INVALID_ACCOUNT[i10];
                }
            }

            private DEPOSIT_SWITCH_INVALID_ACCOUNT() {
                super("DEPOSIT_SWITCH_INVALID_ACCOUNT", null);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(@NotNull Parcel parcel, int flags) {
                Intrinsics.checkNotNullParameter(parcel, "out");
                parcel.writeInt(1);
            }
        }

        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004HÖ\u0001J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¨\u0006\n"}, d2 = {"Lcom/plaid/link/result/LinkErrorCode$DepositSwitchError$DEPOSIT_SWITCH_NOT_FOUND;", "Lcom/plaid/link/result/LinkErrorCode$DepositSwitchError;", "()V", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class DEPOSIT_SWITCH_NOT_FOUND extends DepositSwitchError {

            @NotNull
            public static final DEPOSIT_SWITCH_NOT_FOUND INSTANCE = new DEPOSIT_SWITCH_NOT_FOUND();

            @NotNull
            public static final Parcelable.Creator<DEPOSIT_SWITCH_NOT_FOUND> CREATOR = new Creator();

            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<DEPOSIT_SWITCH_NOT_FOUND> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @NotNull
                public final DEPOSIT_SWITCH_NOT_FOUND createFromParcel(@NotNull Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return DEPOSIT_SWITCH_NOT_FOUND.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @NotNull
                public final DEPOSIT_SWITCH_NOT_FOUND[] newArray(int i10) {
                    return new DEPOSIT_SWITCH_NOT_FOUND[i10];
                }
            }

            private DEPOSIT_SWITCH_NOT_FOUND() {
                super("DEPOSIT_SWITCH_NOT_FOUND", null);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(@NotNull Parcel parcel, int flags) {
                Intrinsics.checkNotNullParameter(parcel, "out");
                parcel.writeInt(1);
            }
        }

        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004HÖ\u0001J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¨\u0006\n"}, d2 = {"Lcom/plaid/link/result/LinkErrorCode$DepositSwitchError$DEPOSIT_SWITCH_TOKEN_NOT_FOUND;", "Lcom/plaid/link/result/LinkErrorCode$DepositSwitchError;", "()V", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class DEPOSIT_SWITCH_TOKEN_NOT_FOUND extends DepositSwitchError {

            @NotNull
            public static final DEPOSIT_SWITCH_TOKEN_NOT_FOUND INSTANCE = new DEPOSIT_SWITCH_TOKEN_NOT_FOUND();

            @NotNull
            public static final Parcelable.Creator<DEPOSIT_SWITCH_TOKEN_NOT_FOUND> CREATOR = new Creator();

            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<DEPOSIT_SWITCH_TOKEN_NOT_FOUND> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @NotNull
                public final DEPOSIT_SWITCH_TOKEN_NOT_FOUND createFromParcel(@NotNull Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return DEPOSIT_SWITCH_TOKEN_NOT_FOUND.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @NotNull
                public final DEPOSIT_SWITCH_TOKEN_NOT_FOUND[] newArray(int i10) {
                    return new DEPOSIT_SWITCH_TOKEN_NOT_FOUND[i10];
                }
            }

            private DEPOSIT_SWITCH_TOKEN_NOT_FOUND() {
                super("DEPOSIT_SWITCH_TOKEN_NOT_FOUND", null);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(@NotNull Parcel parcel, int flags) {
                Intrinsics.checkNotNullParameter(parcel, "out");
                parcel.writeInt(1);
            }
        }

        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004HÖ\u0001J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¨\u0006\n"}, d2 = {"Lcom/plaid/link/result/LinkErrorCode$DepositSwitchError$DEPOSIT_SWITCH_VALID_AUTH_NOT_FOUND;", "Lcom/plaid/link/result/LinkErrorCode$DepositSwitchError;", "()V", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class DEPOSIT_SWITCH_VALID_AUTH_NOT_FOUND extends DepositSwitchError {

            @NotNull
            public static final DEPOSIT_SWITCH_VALID_AUTH_NOT_FOUND INSTANCE = new DEPOSIT_SWITCH_VALID_AUTH_NOT_FOUND();

            @NotNull
            public static final Parcelable.Creator<DEPOSIT_SWITCH_VALID_AUTH_NOT_FOUND> CREATOR = new Creator();

            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<DEPOSIT_SWITCH_VALID_AUTH_NOT_FOUND> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @NotNull
                public final DEPOSIT_SWITCH_VALID_AUTH_NOT_FOUND createFromParcel(@NotNull Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return DEPOSIT_SWITCH_VALID_AUTH_NOT_FOUND.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @NotNull
                public final DEPOSIT_SWITCH_VALID_AUTH_NOT_FOUND[] newArray(int i10) {
                    return new DEPOSIT_SWITCH_VALID_AUTH_NOT_FOUND[i10];
                }
            }

            private DEPOSIT_SWITCH_VALID_AUTH_NOT_FOUND() {
                super("DEPOSIT_SWITCH_VALID_AUTH_NOT_FOUND", null);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(@NotNull Parcel parcel, int flags) {
                Intrinsics.checkNotNullParameter(parcel, "out");
                parcel.writeInt(1);
            }
        }

        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004HÖ\u0001J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¨\u0006\n"}, d2 = {"Lcom/plaid/link/result/LinkErrorCode$DepositSwitchError$DEPOSIT_SWITCH_VALID_IDENTITY_NOT_FOUND;", "Lcom/plaid/link/result/LinkErrorCode$DepositSwitchError;", "()V", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class DEPOSIT_SWITCH_VALID_IDENTITY_NOT_FOUND extends DepositSwitchError {

            @NotNull
            public static final DEPOSIT_SWITCH_VALID_IDENTITY_NOT_FOUND INSTANCE = new DEPOSIT_SWITCH_VALID_IDENTITY_NOT_FOUND();

            @NotNull
            public static final Parcelable.Creator<DEPOSIT_SWITCH_VALID_IDENTITY_NOT_FOUND> CREATOR = new Creator();

            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<DEPOSIT_SWITCH_VALID_IDENTITY_NOT_FOUND> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @NotNull
                public final DEPOSIT_SWITCH_VALID_IDENTITY_NOT_FOUND createFromParcel(@NotNull Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return DEPOSIT_SWITCH_VALID_IDENTITY_NOT_FOUND.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @NotNull
                public final DEPOSIT_SWITCH_VALID_IDENTITY_NOT_FOUND[] newArray(int i10) {
                    return new DEPOSIT_SWITCH_VALID_IDENTITY_NOT_FOUND[i10];
                }
            }

            private DEPOSIT_SWITCH_VALID_IDENTITY_NOT_FOUND() {
                super("DEPOSIT_SWITCH_VALID_IDENTITY_NOT_FOUND", null);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(@NotNull Parcel parcel, int flags) {
                Intrinsics.checkNotNullParameter(parcel, "out");
                parcel.writeInt(1);
            }
        }

        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004HÖ\u0001J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¨\u0006\n"}, d2 = {"Lcom/plaid/link/result/LinkErrorCode$DepositSwitchError$INVALID_DEPOSIT_SWITCH_ID;", "Lcom/plaid/link/result/LinkErrorCode$DepositSwitchError;", "()V", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class INVALID_DEPOSIT_SWITCH_ID extends DepositSwitchError {

            @NotNull
            public static final INVALID_DEPOSIT_SWITCH_ID INSTANCE = new INVALID_DEPOSIT_SWITCH_ID();

            @NotNull
            public static final Parcelable.Creator<INVALID_DEPOSIT_SWITCH_ID> CREATOR = new Creator();

            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<INVALID_DEPOSIT_SWITCH_ID> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @NotNull
                public final INVALID_DEPOSIT_SWITCH_ID createFromParcel(@NotNull Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return INVALID_DEPOSIT_SWITCH_ID.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @NotNull
                public final INVALID_DEPOSIT_SWITCH_ID[] newArray(int i10) {
                    return new INVALID_DEPOSIT_SWITCH_ID[i10];
                }
            }

            private INVALID_DEPOSIT_SWITCH_ID() {
                super("INVALID_DEPOSIT_SWITCH_ID", null);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(@NotNull Parcel parcel, int flags) {
                Intrinsics.checkNotNullParameter(parcel, "out");
                parcel.writeInt(1);
            }
        }

        public /* synthetic */ DepositSwitchError(String str, DefaultConstructorMarker defaultConstructorMarker) {
            this(str);
        }

        private DepositSwitchError(String str) {
            super(str, LinkErrorType.INSTITUTION_ERROR.INSTANCE, null);
        }

        public /* synthetic */ DepositSwitchError(String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? "" : str, null);
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\fHÖ\u0001J\u0019\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0012"}, d2 = {"Lcom/plaid/link/result/LinkErrorCode$INTERNAL_ERROR;", "Lcom/plaid/link/result/LinkErrorCode;", "name", "", "type", "Lcom/plaid/link/result/LinkErrorType;", "(Ljava/lang/String;Lcom/plaid/link/result/LinkErrorType;)V", "getName", "()Ljava/lang/String;", "getType", "()Lcom/plaid/link/result/LinkErrorType;", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class INTERNAL_ERROR extends LinkErrorCode {

        @NotNull
        public static final Parcelable.Creator<INTERNAL_ERROR> CREATOR = new Creator();

        @NotNull
        private final String name;

        @NotNull
        private final LinkErrorType type;

        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<INTERNAL_ERROR> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @NotNull
            public final INTERNAL_ERROR createFromParcel(@NotNull Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new INTERNAL_ERROR(parcel.readString(), (LinkErrorType) parcel.readParcelable(INTERNAL_ERROR.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @NotNull
            public final INTERNAL_ERROR[] newArray(int i10) {
                return new INTERNAL_ERROR[i10];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public INTERNAL_ERROR(@NotNull String name, @NotNull LinkErrorType type) {
            super(name, type, null);
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(type, "type");
            this.name = name;
            this.type = type;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @NotNull
        public final String getName() {
            return this.name;
        }

        @NotNull
        public final LinkErrorType getType() {
            return this.type;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@NotNull Parcel parcel, int flags) {
            Intrinsics.checkNotNullParameter(parcel, "out");
            parcel.writeString(this.name);
            parcel.writeParcelable(this.type, flags);
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0005\u0006\u0007\bB\u0011\b\u0004\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004\u0082\u0001\u0004\t\n\u000b\f¨\u0006\r"}, d2 = {"Lcom/plaid/link/result/LinkErrorCode$InstitutionError;", "Lcom/plaid/link/result/LinkErrorCode;", "json", "", "(Ljava/lang/String;)V", "INSTITUTION_DOWN", "INSTITUTION_NOT_AVAILABLE", "INSTITUTION_NOT_RESPONDING", "INSTITUTION_NO_LONGER_SUPPORTED", "Lcom/plaid/link/result/LinkErrorCode$InstitutionError$INSTITUTION_DOWN;", "Lcom/plaid/link/result/LinkErrorCode$InstitutionError$INSTITUTION_NOT_AVAILABLE;", "Lcom/plaid/link/result/LinkErrorCode$InstitutionError$INSTITUTION_NOT_RESPONDING;", "Lcom/plaid/link/result/LinkErrorCode$InstitutionError$INSTITUTION_NO_LONGER_SUPPORTED;", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class InstitutionError extends LinkErrorCode {

        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004HÖ\u0001J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¨\u0006\n"}, d2 = {"Lcom/plaid/link/result/LinkErrorCode$InstitutionError$INSTITUTION_DOWN;", "Lcom/plaid/link/result/LinkErrorCode$InstitutionError;", "()V", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class INSTITUTION_DOWN extends InstitutionError {

            @NotNull
            public static final INSTITUTION_DOWN INSTANCE = new INSTITUTION_DOWN();

            @NotNull
            public static final Parcelable.Creator<INSTITUTION_DOWN> CREATOR = new Creator();

            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<INSTITUTION_DOWN> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @NotNull
                public final INSTITUTION_DOWN createFromParcel(@NotNull Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return INSTITUTION_DOWN.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @NotNull
                public final INSTITUTION_DOWN[] newArray(int i10) {
                    return new INSTITUTION_DOWN[i10];
                }
            }

            private INSTITUTION_DOWN() {
                super("INSTITUTION_DOWN", null);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(@NotNull Parcel parcel, int flags) {
                Intrinsics.checkNotNullParameter(parcel, "out");
                parcel.writeInt(1);
            }
        }

        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004HÖ\u0001J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¨\u0006\n"}, d2 = {"Lcom/plaid/link/result/LinkErrorCode$InstitutionError$INSTITUTION_NOT_AVAILABLE;", "Lcom/plaid/link/result/LinkErrorCode$InstitutionError;", "()V", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class INSTITUTION_NOT_AVAILABLE extends InstitutionError {

            @NotNull
            public static final INSTITUTION_NOT_AVAILABLE INSTANCE = new INSTITUTION_NOT_AVAILABLE();

            @NotNull
            public static final Parcelable.Creator<INSTITUTION_NOT_AVAILABLE> CREATOR = new Creator();

            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<INSTITUTION_NOT_AVAILABLE> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @NotNull
                public final INSTITUTION_NOT_AVAILABLE createFromParcel(@NotNull Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return INSTITUTION_NOT_AVAILABLE.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @NotNull
                public final INSTITUTION_NOT_AVAILABLE[] newArray(int i10) {
                    return new INSTITUTION_NOT_AVAILABLE[i10];
                }
            }

            private INSTITUTION_NOT_AVAILABLE() {
                super("INSTITUTION_NOT_AVAILABLE", null);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(@NotNull Parcel parcel, int flags) {
                Intrinsics.checkNotNullParameter(parcel, "out");
                parcel.writeInt(1);
            }
        }

        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004HÖ\u0001J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¨\u0006\n"}, d2 = {"Lcom/plaid/link/result/LinkErrorCode$InstitutionError$INSTITUTION_NOT_RESPONDING;", "Lcom/plaid/link/result/LinkErrorCode$InstitutionError;", "()V", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class INSTITUTION_NOT_RESPONDING extends InstitutionError {

            @NotNull
            public static final INSTITUTION_NOT_RESPONDING INSTANCE = new INSTITUTION_NOT_RESPONDING();

            @NotNull
            public static final Parcelable.Creator<INSTITUTION_NOT_RESPONDING> CREATOR = new Creator();

            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<INSTITUTION_NOT_RESPONDING> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @NotNull
                public final INSTITUTION_NOT_RESPONDING createFromParcel(@NotNull Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return INSTITUTION_NOT_RESPONDING.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @NotNull
                public final INSTITUTION_NOT_RESPONDING[] newArray(int i10) {
                    return new INSTITUTION_NOT_RESPONDING[i10];
                }
            }

            private INSTITUTION_NOT_RESPONDING() {
                super("INSTITUTION_NOT_RESPONDING", null);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(@NotNull Parcel parcel, int flags) {
                Intrinsics.checkNotNullParameter(parcel, "out");
                parcel.writeInt(1);
            }
        }

        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004HÖ\u0001J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¨\u0006\n"}, d2 = {"Lcom/plaid/link/result/LinkErrorCode$InstitutionError$INSTITUTION_NO_LONGER_SUPPORTED;", "Lcom/plaid/link/result/LinkErrorCode$InstitutionError;", "()V", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class INSTITUTION_NO_LONGER_SUPPORTED extends InstitutionError {

            @NotNull
            public static final INSTITUTION_NO_LONGER_SUPPORTED INSTANCE = new INSTITUTION_NO_LONGER_SUPPORTED();

            @NotNull
            public static final Parcelable.Creator<INSTITUTION_NO_LONGER_SUPPORTED> CREATOR = new Creator();

            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<INSTITUTION_NO_LONGER_SUPPORTED> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @NotNull
                public final INSTITUTION_NO_LONGER_SUPPORTED createFromParcel(@NotNull Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return INSTITUTION_NO_LONGER_SUPPORTED.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @NotNull
                public final INSTITUTION_NO_LONGER_SUPPORTED[] newArray(int i10) {
                    return new INSTITUTION_NO_LONGER_SUPPORTED[i10];
                }
            }

            private INSTITUTION_NO_LONGER_SUPPORTED() {
                super("INSTITUTION_NO_LONGER_SUPPORTED", null);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(@NotNull Parcel parcel, int flags) {
                Intrinsics.checkNotNullParameter(parcel, "out");
                parcel.writeInt(1);
            }
        }

        public /* synthetic */ InstitutionError(String str, DefaultConstructorMarker defaultConstructorMarker) {
            this(str);
        }

        private InstitutionError(String str) {
            super(str, LinkErrorType.INSTITUTION_ERROR.INSTANCE, null);
        }

        public /* synthetic */ InstitutionError(String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? "" : str, null);
        }
    }

    @Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0013\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017B\u0011\b\u0004\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004\u0082\u0001\u0013\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&'()*¨\u0006+"}, d2 = {"Lcom/plaid/link/result/LinkErrorCode$InvalidInput;", "Lcom/plaid/link/result/LinkErrorCode;", "json", "", "(Ljava/lang/String;)V", "DIRECT_INTEGRATION_NOT_ENABLED", "INCORRECT_DEPOSIT_AMOUNTS", "INVALID_ACCESS_TOKEN", "INVALID_ACCOUNT_ID", "INVALID_API_KEYS", "INVALID_AUDIT_COPY_TOKEN", "INVALID_CREDENTIAL_FIELDS", "INVALID_INSTITUTION", "INVALID_LINK_TOKEN", "INVALID_PROCESSOR_TOKEN", "INVALID_PRODUCTS", "INVALID_PUBLIC_TOKEN", "INVALID_STRIPE_ACCOUNT", "INVALID_WEBHOOK_VERIFICATION_KEY_ID", "PRODUCT_UNAVAILABLE", "TOO_MANY_VERIFICATION_ATTEMPTS", "UNAUTHORIZED_ENVIRONMENT", "UNAUTHORIZED_ROUTE_ACCESS", "USER_PERMISSION_REVOKED", "Lcom/plaid/link/result/LinkErrorCode$InvalidInput$DIRECT_INTEGRATION_NOT_ENABLED;", "Lcom/plaid/link/result/LinkErrorCode$InvalidInput$INCORRECT_DEPOSIT_AMOUNTS;", "Lcom/plaid/link/result/LinkErrorCode$InvalidInput$INVALID_ACCESS_TOKEN;", "Lcom/plaid/link/result/LinkErrorCode$InvalidInput$INVALID_ACCOUNT_ID;", "Lcom/plaid/link/result/LinkErrorCode$InvalidInput$INVALID_API_KEYS;", "Lcom/plaid/link/result/LinkErrorCode$InvalidInput$INVALID_AUDIT_COPY_TOKEN;", "Lcom/plaid/link/result/LinkErrorCode$InvalidInput$INVALID_CREDENTIAL_FIELDS;", "Lcom/plaid/link/result/LinkErrorCode$InvalidInput$INVALID_INSTITUTION;", "Lcom/plaid/link/result/LinkErrorCode$InvalidInput$INVALID_LINK_TOKEN;", "Lcom/plaid/link/result/LinkErrorCode$InvalidInput$INVALID_PROCESSOR_TOKEN;", "Lcom/plaid/link/result/LinkErrorCode$InvalidInput$INVALID_PRODUCTS;", "Lcom/plaid/link/result/LinkErrorCode$InvalidInput$INVALID_PUBLIC_TOKEN;", "Lcom/plaid/link/result/LinkErrorCode$InvalidInput$INVALID_STRIPE_ACCOUNT;", "Lcom/plaid/link/result/LinkErrorCode$InvalidInput$INVALID_WEBHOOK_VERIFICATION_KEY_ID;", "Lcom/plaid/link/result/LinkErrorCode$InvalidInput$PRODUCT_UNAVAILABLE;", "Lcom/plaid/link/result/LinkErrorCode$InvalidInput$TOO_MANY_VERIFICATION_ATTEMPTS;", "Lcom/plaid/link/result/LinkErrorCode$InvalidInput$UNAUTHORIZED_ENVIRONMENT;", "Lcom/plaid/link/result/LinkErrorCode$InvalidInput$UNAUTHORIZED_ROUTE_ACCESS;", "Lcom/plaid/link/result/LinkErrorCode$InvalidInput$USER_PERMISSION_REVOKED;", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class InvalidInput extends LinkErrorCode {

        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004HÖ\u0001J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¨\u0006\n"}, d2 = {"Lcom/plaid/link/result/LinkErrorCode$InvalidInput$DIRECT_INTEGRATION_NOT_ENABLED;", "Lcom/plaid/link/result/LinkErrorCode$InvalidInput;", "()V", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class DIRECT_INTEGRATION_NOT_ENABLED extends InvalidInput {

            @NotNull
            public static final DIRECT_INTEGRATION_NOT_ENABLED INSTANCE = new DIRECT_INTEGRATION_NOT_ENABLED();

            @NotNull
            public static final Parcelable.Creator<DIRECT_INTEGRATION_NOT_ENABLED> CREATOR = new Creator();

            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<DIRECT_INTEGRATION_NOT_ENABLED> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @NotNull
                public final DIRECT_INTEGRATION_NOT_ENABLED createFromParcel(@NotNull Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return DIRECT_INTEGRATION_NOT_ENABLED.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @NotNull
                public final DIRECT_INTEGRATION_NOT_ENABLED[] newArray(int i10) {
                    return new DIRECT_INTEGRATION_NOT_ENABLED[i10];
                }
            }

            private DIRECT_INTEGRATION_NOT_ENABLED() {
                super("DIRECT_INTEGRATION_NOT_ENABLED", null);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(@NotNull Parcel parcel, int flags) {
                Intrinsics.checkNotNullParameter(parcel, "out");
                parcel.writeInt(1);
            }
        }

        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004HÖ\u0001J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¨\u0006\n"}, d2 = {"Lcom/plaid/link/result/LinkErrorCode$InvalidInput$INCORRECT_DEPOSIT_AMOUNTS;", "Lcom/plaid/link/result/LinkErrorCode$InvalidInput;", "()V", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class INCORRECT_DEPOSIT_AMOUNTS extends InvalidInput {

            @NotNull
            public static final INCORRECT_DEPOSIT_AMOUNTS INSTANCE = new INCORRECT_DEPOSIT_AMOUNTS();

            @NotNull
            public static final Parcelable.Creator<INCORRECT_DEPOSIT_AMOUNTS> CREATOR = new Creator();

            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<INCORRECT_DEPOSIT_AMOUNTS> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @NotNull
                public final INCORRECT_DEPOSIT_AMOUNTS createFromParcel(@NotNull Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return INCORRECT_DEPOSIT_AMOUNTS.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @NotNull
                public final INCORRECT_DEPOSIT_AMOUNTS[] newArray(int i10) {
                    return new INCORRECT_DEPOSIT_AMOUNTS[i10];
                }
            }

            private INCORRECT_DEPOSIT_AMOUNTS() {
                super("INCORRECT_DEPOSIT_AMOUNTS", null);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(@NotNull Parcel parcel, int flags) {
                Intrinsics.checkNotNullParameter(parcel, "out");
                parcel.writeInt(1);
            }
        }

        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004HÖ\u0001J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¨\u0006\n"}, d2 = {"Lcom/plaid/link/result/LinkErrorCode$InvalidInput$INVALID_ACCESS_TOKEN;", "Lcom/plaid/link/result/LinkErrorCode$InvalidInput;", "()V", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class INVALID_ACCESS_TOKEN extends InvalidInput {

            @NotNull
            public static final INVALID_ACCESS_TOKEN INSTANCE = new INVALID_ACCESS_TOKEN();

            @NotNull
            public static final Parcelable.Creator<INVALID_ACCESS_TOKEN> CREATOR = new Creator();

            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<INVALID_ACCESS_TOKEN> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @NotNull
                public final INVALID_ACCESS_TOKEN createFromParcel(@NotNull Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return INVALID_ACCESS_TOKEN.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @NotNull
                public final INVALID_ACCESS_TOKEN[] newArray(int i10) {
                    return new INVALID_ACCESS_TOKEN[i10];
                }
            }

            private INVALID_ACCESS_TOKEN() {
                super("INVALID_ACCESS_TOKEN", null);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(@NotNull Parcel parcel, int flags) {
                Intrinsics.checkNotNullParameter(parcel, "out");
                parcel.writeInt(1);
            }
        }

        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004HÖ\u0001J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¨\u0006\n"}, d2 = {"Lcom/plaid/link/result/LinkErrorCode$InvalidInput$INVALID_ACCOUNT_ID;", "Lcom/plaid/link/result/LinkErrorCode$InvalidInput;", "()V", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class INVALID_ACCOUNT_ID extends InvalidInput {

            @NotNull
            public static final INVALID_ACCOUNT_ID INSTANCE = new INVALID_ACCOUNT_ID();

            @NotNull
            public static final Parcelable.Creator<INVALID_ACCOUNT_ID> CREATOR = new Creator();

            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<INVALID_ACCOUNT_ID> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @NotNull
                public final INVALID_ACCOUNT_ID createFromParcel(@NotNull Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return INVALID_ACCOUNT_ID.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @NotNull
                public final INVALID_ACCOUNT_ID[] newArray(int i10) {
                    return new INVALID_ACCOUNT_ID[i10];
                }
            }

            private INVALID_ACCOUNT_ID() {
                super("INVALID_ACCOUNT_ID", null);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(@NotNull Parcel parcel, int flags) {
                Intrinsics.checkNotNullParameter(parcel, "out");
                parcel.writeInt(1);
            }
        }

        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004HÖ\u0001J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¨\u0006\n"}, d2 = {"Lcom/plaid/link/result/LinkErrorCode$InvalidInput$INVALID_API_KEYS;", "Lcom/plaid/link/result/LinkErrorCode$InvalidInput;", "()V", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class INVALID_API_KEYS extends InvalidInput {

            @NotNull
            public static final INVALID_API_KEYS INSTANCE = new INVALID_API_KEYS();

            @NotNull
            public static final Parcelable.Creator<INVALID_API_KEYS> CREATOR = new Creator();

            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<INVALID_API_KEYS> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @NotNull
                public final INVALID_API_KEYS createFromParcel(@NotNull Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return INVALID_API_KEYS.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @NotNull
                public final INVALID_API_KEYS[] newArray(int i10) {
                    return new INVALID_API_KEYS[i10];
                }
            }

            private INVALID_API_KEYS() {
                super("INVALID_API_KEYS", null);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(@NotNull Parcel parcel, int flags) {
                Intrinsics.checkNotNullParameter(parcel, "out");
                parcel.writeInt(1);
            }
        }

        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004HÖ\u0001J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¨\u0006\n"}, d2 = {"Lcom/plaid/link/result/LinkErrorCode$InvalidInput$INVALID_AUDIT_COPY_TOKEN;", "Lcom/plaid/link/result/LinkErrorCode$InvalidInput;", "()V", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class INVALID_AUDIT_COPY_TOKEN extends InvalidInput {

            @NotNull
            public static final INVALID_AUDIT_COPY_TOKEN INSTANCE = new INVALID_AUDIT_COPY_TOKEN();

            @NotNull
            public static final Parcelable.Creator<INVALID_AUDIT_COPY_TOKEN> CREATOR = new Creator();

            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<INVALID_AUDIT_COPY_TOKEN> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @NotNull
                public final INVALID_AUDIT_COPY_TOKEN createFromParcel(@NotNull Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return INVALID_AUDIT_COPY_TOKEN.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @NotNull
                public final INVALID_AUDIT_COPY_TOKEN[] newArray(int i10) {
                    return new INVALID_AUDIT_COPY_TOKEN[i10];
                }
            }

            private INVALID_AUDIT_COPY_TOKEN() {
                super("INVALID_AUDIT_COPY_TOKEN", null);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(@NotNull Parcel parcel, int flags) {
                Intrinsics.checkNotNullParameter(parcel, "out");
                parcel.writeInt(1);
            }
        }

        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004HÖ\u0001J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¨\u0006\n"}, d2 = {"Lcom/plaid/link/result/LinkErrorCode$InvalidInput$INVALID_CREDENTIAL_FIELDS;", "Lcom/plaid/link/result/LinkErrorCode$InvalidInput;", "()V", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class INVALID_CREDENTIAL_FIELDS extends InvalidInput {

            @NotNull
            public static final INVALID_CREDENTIAL_FIELDS INSTANCE = new INVALID_CREDENTIAL_FIELDS();

            @NotNull
            public static final Parcelable.Creator<INVALID_CREDENTIAL_FIELDS> CREATOR = new Creator();

            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<INVALID_CREDENTIAL_FIELDS> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @NotNull
                public final INVALID_CREDENTIAL_FIELDS createFromParcel(@NotNull Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return INVALID_CREDENTIAL_FIELDS.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @NotNull
                public final INVALID_CREDENTIAL_FIELDS[] newArray(int i10) {
                    return new INVALID_CREDENTIAL_FIELDS[i10];
                }
            }

            private INVALID_CREDENTIAL_FIELDS() {
                super("INVALID_CREDENTIAL_FIELDS", null);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(@NotNull Parcel parcel, int flags) {
                Intrinsics.checkNotNullParameter(parcel, "out");
                parcel.writeInt(1);
            }
        }

        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004HÖ\u0001J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¨\u0006\n"}, d2 = {"Lcom/plaid/link/result/LinkErrorCode$InvalidInput$INVALID_INSTITUTION;", "Lcom/plaid/link/result/LinkErrorCode$InvalidInput;", "()V", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class INVALID_INSTITUTION extends InvalidInput {

            @NotNull
            public static final INVALID_INSTITUTION INSTANCE = new INVALID_INSTITUTION();

            @NotNull
            public static final Parcelable.Creator<INVALID_INSTITUTION> CREATOR = new Creator();

            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<INVALID_INSTITUTION> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @NotNull
                public final INVALID_INSTITUTION createFromParcel(@NotNull Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return INVALID_INSTITUTION.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @NotNull
                public final INVALID_INSTITUTION[] newArray(int i10) {
                    return new INVALID_INSTITUTION[i10];
                }
            }

            private INVALID_INSTITUTION() {
                super("INVALID_INSTITUTION", null);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(@NotNull Parcel parcel, int flags) {
                Intrinsics.checkNotNullParameter(parcel, "out");
                parcel.writeInt(1);
            }
        }

        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004HÖ\u0001J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¨\u0006\n"}, d2 = {"Lcom/plaid/link/result/LinkErrorCode$InvalidInput$INVALID_LINK_TOKEN;", "Lcom/plaid/link/result/LinkErrorCode$InvalidInput;", "()V", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class INVALID_LINK_TOKEN extends InvalidInput {

            @NotNull
            public static final INVALID_LINK_TOKEN INSTANCE = new INVALID_LINK_TOKEN();

            @NotNull
            public static final Parcelable.Creator<INVALID_LINK_TOKEN> CREATOR = new Creator();

            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<INVALID_LINK_TOKEN> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @NotNull
                public final INVALID_LINK_TOKEN createFromParcel(@NotNull Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return INVALID_LINK_TOKEN.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @NotNull
                public final INVALID_LINK_TOKEN[] newArray(int i10) {
                    return new INVALID_LINK_TOKEN[i10];
                }
            }

            private INVALID_LINK_TOKEN() {
                super("INVALID_LINK_TOKEN", null);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(@NotNull Parcel parcel, int flags) {
                Intrinsics.checkNotNullParameter(parcel, "out");
                parcel.writeInt(1);
            }
        }

        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004HÖ\u0001J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¨\u0006\n"}, d2 = {"Lcom/plaid/link/result/LinkErrorCode$InvalidInput$INVALID_PROCESSOR_TOKEN;", "Lcom/plaid/link/result/LinkErrorCode$InvalidInput;", "()V", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class INVALID_PROCESSOR_TOKEN extends InvalidInput {

            @NotNull
            public static final INVALID_PROCESSOR_TOKEN INSTANCE = new INVALID_PROCESSOR_TOKEN();

            @NotNull
            public static final Parcelable.Creator<INVALID_PROCESSOR_TOKEN> CREATOR = new Creator();

            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<INVALID_PROCESSOR_TOKEN> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @NotNull
                public final INVALID_PROCESSOR_TOKEN createFromParcel(@NotNull Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return INVALID_PROCESSOR_TOKEN.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @NotNull
                public final INVALID_PROCESSOR_TOKEN[] newArray(int i10) {
                    return new INVALID_PROCESSOR_TOKEN[i10];
                }
            }

            private INVALID_PROCESSOR_TOKEN() {
                super("INVALID_PROCESSOR_TOKEN", null);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(@NotNull Parcel parcel, int flags) {
                Intrinsics.checkNotNullParameter(parcel, "out");
                parcel.writeInt(1);
            }
        }

        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004HÖ\u0001J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¨\u0006\n"}, d2 = {"Lcom/plaid/link/result/LinkErrorCode$InvalidInput$INVALID_PRODUCTS;", "Lcom/plaid/link/result/LinkErrorCode$InvalidInput;", "()V", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class INVALID_PRODUCTS extends InvalidInput {

            @NotNull
            public static final INVALID_PRODUCTS INSTANCE = new INVALID_PRODUCTS();

            @NotNull
            public static final Parcelable.Creator<INVALID_PRODUCTS> CREATOR = new Creator();

            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<INVALID_PRODUCTS> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @NotNull
                public final INVALID_PRODUCTS createFromParcel(@NotNull Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return INVALID_PRODUCTS.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @NotNull
                public final INVALID_PRODUCTS[] newArray(int i10) {
                    return new INVALID_PRODUCTS[i10];
                }
            }

            private INVALID_PRODUCTS() {
                super("INVALID_PRODUCTS", null);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(@NotNull Parcel parcel, int flags) {
                Intrinsics.checkNotNullParameter(parcel, "out");
                parcel.writeInt(1);
            }
        }

        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004HÖ\u0001J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¨\u0006\n"}, d2 = {"Lcom/plaid/link/result/LinkErrorCode$InvalidInput$INVALID_PUBLIC_TOKEN;", "Lcom/plaid/link/result/LinkErrorCode$InvalidInput;", "()V", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class INVALID_PUBLIC_TOKEN extends InvalidInput {

            @NotNull
            public static final INVALID_PUBLIC_TOKEN INSTANCE = new INVALID_PUBLIC_TOKEN();

            @NotNull
            public static final Parcelable.Creator<INVALID_PUBLIC_TOKEN> CREATOR = new Creator();

            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<INVALID_PUBLIC_TOKEN> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @NotNull
                public final INVALID_PUBLIC_TOKEN createFromParcel(@NotNull Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return INVALID_PUBLIC_TOKEN.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @NotNull
                public final INVALID_PUBLIC_TOKEN[] newArray(int i10) {
                    return new INVALID_PUBLIC_TOKEN[i10];
                }
            }

            private INVALID_PUBLIC_TOKEN() {
                super("INVALID_PUBLIC_TOKEN", null);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(@NotNull Parcel parcel, int flags) {
                Intrinsics.checkNotNullParameter(parcel, "out");
                parcel.writeInt(1);
            }
        }

        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004HÖ\u0001J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¨\u0006\n"}, d2 = {"Lcom/plaid/link/result/LinkErrorCode$InvalidInput$INVALID_STRIPE_ACCOUNT;", "Lcom/plaid/link/result/LinkErrorCode$InvalidInput;", "()V", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class INVALID_STRIPE_ACCOUNT extends InvalidInput {

            @NotNull
            public static final INVALID_STRIPE_ACCOUNT INSTANCE = new INVALID_STRIPE_ACCOUNT();

            @NotNull
            public static final Parcelable.Creator<INVALID_STRIPE_ACCOUNT> CREATOR = new Creator();

            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<INVALID_STRIPE_ACCOUNT> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @NotNull
                public final INVALID_STRIPE_ACCOUNT createFromParcel(@NotNull Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return INVALID_STRIPE_ACCOUNT.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @NotNull
                public final INVALID_STRIPE_ACCOUNT[] newArray(int i10) {
                    return new INVALID_STRIPE_ACCOUNT[i10];
                }
            }

            private INVALID_STRIPE_ACCOUNT() {
                super("INVALID_STRIPE_ACCOUNT", null);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(@NotNull Parcel parcel, int flags) {
                Intrinsics.checkNotNullParameter(parcel, "out");
                parcel.writeInt(1);
            }
        }

        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004HÖ\u0001J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¨\u0006\n"}, d2 = {"Lcom/plaid/link/result/LinkErrorCode$InvalidInput$INVALID_WEBHOOK_VERIFICATION_KEY_ID;", "Lcom/plaid/link/result/LinkErrorCode$InvalidInput;", "()V", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class INVALID_WEBHOOK_VERIFICATION_KEY_ID extends InvalidInput {

            @NotNull
            public static final INVALID_WEBHOOK_VERIFICATION_KEY_ID INSTANCE = new INVALID_WEBHOOK_VERIFICATION_KEY_ID();

            @NotNull
            public static final Parcelable.Creator<INVALID_WEBHOOK_VERIFICATION_KEY_ID> CREATOR = new Creator();

            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<INVALID_WEBHOOK_VERIFICATION_KEY_ID> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @NotNull
                public final INVALID_WEBHOOK_VERIFICATION_KEY_ID createFromParcel(@NotNull Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return INVALID_WEBHOOK_VERIFICATION_KEY_ID.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @NotNull
                public final INVALID_WEBHOOK_VERIFICATION_KEY_ID[] newArray(int i10) {
                    return new INVALID_WEBHOOK_VERIFICATION_KEY_ID[i10];
                }
            }

            private INVALID_WEBHOOK_VERIFICATION_KEY_ID() {
                super("INVALID_WEBHOOK_VERIFICATION_KEY_ID", null);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(@NotNull Parcel parcel, int flags) {
                Intrinsics.checkNotNullParameter(parcel, "out");
                parcel.writeInt(1);
            }
        }

        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004HÖ\u0001J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¨\u0006\n"}, d2 = {"Lcom/plaid/link/result/LinkErrorCode$InvalidInput$PRODUCT_UNAVAILABLE;", "Lcom/plaid/link/result/LinkErrorCode$InvalidInput;", "()V", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class PRODUCT_UNAVAILABLE extends InvalidInput {

            @NotNull
            public static final PRODUCT_UNAVAILABLE INSTANCE = new PRODUCT_UNAVAILABLE();

            @NotNull
            public static final Parcelable.Creator<PRODUCT_UNAVAILABLE> CREATOR = new Creator();

            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<PRODUCT_UNAVAILABLE> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @NotNull
                public final PRODUCT_UNAVAILABLE createFromParcel(@NotNull Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return PRODUCT_UNAVAILABLE.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @NotNull
                public final PRODUCT_UNAVAILABLE[] newArray(int i10) {
                    return new PRODUCT_UNAVAILABLE[i10];
                }
            }

            private PRODUCT_UNAVAILABLE() {
                super("PRODUCT_UNAVAILABLE", null);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(@NotNull Parcel parcel, int flags) {
                Intrinsics.checkNotNullParameter(parcel, "out");
                parcel.writeInt(1);
            }
        }

        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004HÖ\u0001J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¨\u0006\n"}, d2 = {"Lcom/plaid/link/result/LinkErrorCode$InvalidInput$TOO_MANY_VERIFICATION_ATTEMPTS;", "Lcom/plaid/link/result/LinkErrorCode$InvalidInput;", "()V", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class TOO_MANY_VERIFICATION_ATTEMPTS extends InvalidInput {

            @NotNull
            public static final TOO_MANY_VERIFICATION_ATTEMPTS INSTANCE = new TOO_MANY_VERIFICATION_ATTEMPTS();

            @NotNull
            public static final Parcelable.Creator<TOO_MANY_VERIFICATION_ATTEMPTS> CREATOR = new Creator();

            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<TOO_MANY_VERIFICATION_ATTEMPTS> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @NotNull
                public final TOO_MANY_VERIFICATION_ATTEMPTS createFromParcel(@NotNull Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return TOO_MANY_VERIFICATION_ATTEMPTS.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @NotNull
                public final TOO_MANY_VERIFICATION_ATTEMPTS[] newArray(int i10) {
                    return new TOO_MANY_VERIFICATION_ATTEMPTS[i10];
                }
            }

            private TOO_MANY_VERIFICATION_ATTEMPTS() {
                super("TOO_MANY_VERIFICATION_ATTEMPTS", null);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(@NotNull Parcel parcel, int flags) {
                Intrinsics.checkNotNullParameter(parcel, "out");
                parcel.writeInt(1);
            }
        }

        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004HÖ\u0001J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¨\u0006\n"}, d2 = {"Lcom/plaid/link/result/LinkErrorCode$InvalidInput$UNAUTHORIZED_ENVIRONMENT;", "Lcom/plaid/link/result/LinkErrorCode$InvalidInput;", "()V", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class UNAUTHORIZED_ENVIRONMENT extends InvalidInput {

            @NotNull
            public static final UNAUTHORIZED_ENVIRONMENT INSTANCE = new UNAUTHORIZED_ENVIRONMENT();

            @NotNull
            public static final Parcelable.Creator<UNAUTHORIZED_ENVIRONMENT> CREATOR = new Creator();

            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<UNAUTHORIZED_ENVIRONMENT> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @NotNull
                public final UNAUTHORIZED_ENVIRONMENT createFromParcel(@NotNull Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return UNAUTHORIZED_ENVIRONMENT.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @NotNull
                public final UNAUTHORIZED_ENVIRONMENT[] newArray(int i10) {
                    return new UNAUTHORIZED_ENVIRONMENT[i10];
                }
            }

            private UNAUTHORIZED_ENVIRONMENT() {
                super("UNAUTHORIZED_ENVIRONMENT", null);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(@NotNull Parcel parcel, int flags) {
                Intrinsics.checkNotNullParameter(parcel, "out");
                parcel.writeInt(1);
            }
        }

        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004HÖ\u0001J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¨\u0006\n"}, d2 = {"Lcom/plaid/link/result/LinkErrorCode$InvalidInput$UNAUTHORIZED_ROUTE_ACCESS;", "Lcom/plaid/link/result/LinkErrorCode$InvalidInput;", "()V", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class UNAUTHORIZED_ROUTE_ACCESS extends InvalidInput {

            @NotNull
            public static final UNAUTHORIZED_ROUTE_ACCESS INSTANCE = new UNAUTHORIZED_ROUTE_ACCESS();

            @NotNull
            public static final Parcelable.Creator<UNAUTHORIZED_ROUTE_ACCESS> CREATOR = new Creator();

            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<UNAUTHORIZED_ROUTE_ACCESS> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @NotNull
                public final UNAUTHORIZED_ROUTE_ACCESS createFromParcel(@NotNull Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return UNAUTHORIZED_ROUTE_ACCESS.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @NotNull
                public final UNAUTHORIZED_ROUTE_ACCESS[] newArray(int i10) {
                    return new UNAUTHORIZED_ROUTE_ACCESS[i10];
                }
            }

            private UNAUTHORIZED_ROUTE_ACCESS() {
                super("UNAUTHORIZED_ROUTE_ACCESS", null);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(@NotNull Parcel parcel, int flags) {
                Intrinsics.checkNotNullParameter(parcel, "out");
                parcel.writeInt(1);
            }
        }

        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004HÖ\u0001J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¨\u0006\n"}, d2 = {"Lcom/plaid/link/result/LinkErrorCode$InvalidInput$USER_PERMISSION_REVOKED;", "Lcom/plaid/link/result/LinkErrorCode$InvalidInput;", "()V", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class USER_PERMISSION_REVOKED extends InvalidInput {

            @NotNull
            public static final USER_PERMISSION_REVOKED INSTANCE = new USER_PERMISSION_REVOKED();

            @NotNull
            public static final Parcelable.Creator<USER_PERMISSION_REVOKED> CREATOR = new Creator();

            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<USER_PERMISSION_REVOKED> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @NotNull
                public final USER_PERMISSION_REVOKED createFromParcel(@NotNull Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return USER_PERMISSION_REVOKED.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @NotNull
                public final USER_PERMISSION_REVOKED[] newArray(int i10) {
                    return new USER_PERMISSION_REVOKED[i10];
                }
            }

            private USER_PERMISSION_REVOKED() {
                super("USER_PERMISSION_REVOKED", null);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(@NotNull Parcel parcel, int flags) {
                Intrinsics.checkNotNullParameter(parcel, "out");
                parcel.writeInt(1);
            }
        }

        public /* synthetic */ InvalidInput(String str, DefaultConstructorMarker defaultConstructorMarker) {
            this(str);
        }

        private InvalidInput(String str) {
            super(str, LinkErrorType.INVALID_INPUT.INSTANCE, null);
        }

        public /* synthetic */ InvalidInput(String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? "" : str, null);
        }
    }

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\t\u0005\u0006\u0007\b\t\n\u000b\f\rB\u0011\b\u0004\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004\u0082\u0001\t\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016¨\u0006\u0017"}, d2 = {"Lcom/plaid/link/result/LinkErrorCode$InvalidRequest;", "Lcom/plaid/link/result/LinkErrorCode;", "json", "", "(Ljava/lang/String;)V", "INCOMPATIBLE_API_VERSION", "INVALID_BODY", "INVALID_CONFIGURATION", "INVALID_FIELD", "INVALID_HEADERS", "MISSING_FIELDS", "NOT_FOUND", "SANDBOX_ONLY", "UNKNOWN_FIELDS", "Lcom/plaid/link/result/LinkErrorCode$InvalidRequest$INCOMPATIBLE_API_VERSION;", "Lcom/plaid/link/result/LinkErrorCode$InvalidRequest$INVALID_BODY;", "Lcom/plaid/link/result/LinkErrorCode$InvalidRequest$INVALID_CONFIGURATION;", "Lcom/plaid/link/result/LinkErrorCode$InvalidRequest$INVALID_FIELD;", "Lcom/plaid/link/result/LinkErrorCode$InvalidRequest$INVALID_HEADERS;", "Lcom/plaid/link/result/LinkErrorCode$InvalidRequest$MISSING_FIELDS;", "Lcom/plaid/link/result/LinkErrorCode$InvalidRequest$NOT_FOUND;", "Lcom/plaid/link/result/LinkErrorCode$InvalidRequest$SANDBOX_ONLY;", "Lcom/plaid/link/result/LinkErrorCode$InvalidRequest$UNKNOWN_FIELDS;", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class InvalidRequest extends LinkErrorCode {

        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004HÖ\u0001J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¨\u0006\n"}, d2 = {"Lcom/plaid/link/result/LinkErrorCode$InvalidRequest$INCOMPATIBLE_API_VERSION;", "Lcom/plaid/link/result/LinkErrorCode$InvalidRequest;", "()V", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class INCOMPATIBLE_API_VERSION extends InvalidRequest {

            @NotNull
            public static final INCOMPATIBLE_API_VERSION INSTANCE = new INCOMPATIBLE_API_VERSION();

            @NotNull
            public static final Parcelable.Creator<INCOMPATIBLE_API_VERSION> CREATOR = new Creator();

            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<INCOMPATIBLE_API_VERSION> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @NotNull
                public final INCOMPATIBLE_API_VERSION createFromParcel(@NotNull Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return INCOMPATIBLE_API_VERSION.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @NotNull
                public final INCOMPATIBLE_API_VERSION[] newArray(int i10) {
                    return new INCOMPATIBLE_API_VERSION[i10];
                }
            }

            private INCOMPATIBLE_API_VERSION() {
                super("INCOMPATIBLE_API_VERSION", null);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(@NotNull Parcel parcel, int flags) {
                Intrinsics.checkNotNullParameter(parcel, "out");
                parcel.writeInt(1);
            }
        }

        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004HÖ\u0001J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¨\u0006\n"}, d2 = {"Lcom/plaid/link/result/LinkErrorCode$InvalidRequest$INVALID_BODY;", "Lcom/plaid/link/result/LinkErrorCode$InvalidRequest;", "()V", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class INVALID_BODY extends InvalidRequest {

            @NotNull
            public static final INVALID_BODY INSTANCE = new INVALID_BODY();

            @NotNull
            public static final Parcelable.Creator<INVALID_BODY> CREATOR = new Creator();

            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<INVALID_BODY> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @NotNull
                public final INVALID_BODY createFromParcel(@NotNull Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return INVALID_BODY.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @NotNull
                public final INVALID_BODY[] newArray(int i10) {
                    return new INVALID_BODY[i10];
                }
            }

            private INVALID_BODY() {
                super("INVALID_BODY", null);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(@NotNull Parcel parcel, int flags) {
                Intrinsics.checkNotNullParameter(parcel, "out");
                parcel.writeInt(1);
            }
        }

        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004HÖ\u0001J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¨\u0006\n"}, d2 = {"Lcom/plaid/link/result/LinkErrorCode$InvalidRequest$INVALID_CONFIGURATION;", "Lcom/plaid/link/result/LinkErrorCode$InvalidRequest;", "()V", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class INVALID_CONFIGURATION extends InvalidRequest {

            @NotNull
            public static final INVALID_CONFIGURATION INSTANCE = new INVALID_CONFIGURATION();

            @NotNull
            public static final Parcelable.Creator<INVALID_CONFIGURATION> CREATOR = new Creator();

            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<INVALID_CONFIGURATION> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @NotNull
                public final INVALID_CONFIGURATION createFromParcel(@NotNull Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return INVALID_CONFIGURATION.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @NotNull
                public final INVALID_CONFIGURATION[] newArray(int i10) {
                    return new INVALID_CONFIGURATION[i10];
                }
            }

            private INVALID_CONFIGURATION() {
                super("INVALID_CONFIGURATION", null);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(@NotNull Parcel parcel, int flags) {
                Intrinsics.checkNotNullParameter(parcel, "out");
                parcel.writeInt(1);
            }
        }

        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004HÖ\u0001J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¨\u0006\n"}, d2 = {"Lcom/plaid/link/result/LinkErrorCode$InvalidRequest$INVALID_FIELD;", "Lcom/plaid/link/result/LinkErrorCode$InvalidRequest;", "()V", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class INVALID_FIELD extends InvalidRequest {

            @NotNull
            public static final INVALID_FIELD INSTANCE = new INVALID_FIELD();

            @NotNull
            public static final Parcelable.Creator<INVALID_FIELD> CREATOR = new Creator();

            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<INVALID_FIELD> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @NotNull
                public final INVALID_FIELD createFromParcel(@NotNull Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return INVALID_FIELD.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @NotNull
                public final INVALID_FIELD[] newArray(int i10) {
                    return new INVALID_FIELD[i10];
                }
            }

            private INVALID_FIELD() {
                super("INVALID_FIELD", null);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(@NotNull Parcel parcel, int flags) {
                Intrinsics.checkNotNullParameter(parcel, "out");
                parcel.writeInt(1);
            }
        }

        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004HÖ\u0001J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¨\u0006\n"}, d2 = {"Lcom/plaid/link/result/LinkErrorCode$InvalidRequest$INVALID_HEADERS;", "Lcom/plaid/link/result/LinkErrorCode$InvalidRequest;", "()V", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class INVALID_HEADERS extends InvalidRequest {

            @NotNull
            public static final INVALID_HEADERS INSTANCE = new INVALID_HEADERS();

            @NotNull
            public static final Parcelable.Creator<INVALID_HEADERS> CREATOR = new Creator();

            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<INVALID_HEADERS> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @NotNull
                public final INVALID_HEADERS createFromParcel(@NotNull Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return INVALID_HEADERS.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @NotNull
                public final INVALID_HEADERS[] newArray(int i10) {
                    return new INVALID_HEADERS[i10];
                }
            }

            private INVALID_HEADERS() {
                super("INVALID_HEADERS", null);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(@NotNull Parcel parcel, int flags) {
                Intrinsics.checkNotNullParameter(parcel, "out");
                parcel.writeInt(1);
            }
        }

        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004HÖ\u0001J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¨\u0006\n"}, d2 = {"Lcom/plaid/link/result/LinkErrorCode$InvalidRequest$MISSING_FIELDS;", "Lcom/plaid/link/result/LinkErrorCode$InvalidRequest;", "()V", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class MISSING_FIELDS extends InvalidRequest {

            @NotNull
            public static final MISSING_FIELDS INSTANCE = new MISSING_FIELDS();

            @NotNull
            public static final Parcelable.Creator<MISSING_FIELDS> CREATOR = new Creator();

            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<MISSING_FIELDS> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @NotNull
                public final MISSING_FIELDS createFromParcel(@NotNull Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return MISSING_FIELDS.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @NotNull
                public final MISSING_FIELDS[] newArray(int i10) {
                    return new MISSING_FIELDS[i10];
                }
            }

            private MISSING_FIELDS() {
                super("MISSING_FIELDS", null);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(@NotNull Parcel parcel, int flags) {
                Intrinsics.checkNotNullParameter(parcel, "out");
                parcel.writeInt(1);
            }
        }

        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004HÖ\u0001J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¨\u0006\n"}, d2 = {"Lcom/plaid/link/result/LinkErrorCode$InvalidRequest$NOT_FOUND;", "Lcom/plaid/link/result/LinkErrorCode$InvalidRequest;", "()V", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class NOT_FOUND extends InvalidRequest {

            @NotNull
            public static final NOT_FOUND INSTANCE = new NOT_FOUND();

            @NotNull
            public static final Parcelable.Creator<NOT_FOUND> CREATOR = new Creator();

            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<NOT_FOUND> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @NotNull
                public final NOT_FOUND createFromParcel(@NotNull Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return NOT_FOUND.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @NotNull
                public final NOT_FOUND[] newArray(int i10) {
                    return new NOT_FOUND[i10];
                }
            }

            private NOT_FOUND() {
                super("NOT_FOUND", null);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(@NotNull Parcel parcel, int flags) {
                Intrinsics.checkNotNullParameter(parcel, "out");
                parcel.writeInt(1);
            }
        }

        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004HÖ\u0001J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¨\u0006\n"}, d2 = {"Lcom/plaid/link/result/LinkErrorCode$InvalidRequest$SANDBOX_ONLY;", "Lcom/plaid/link/result/LinkErrorCode$InvalidRequest;", "()V", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class SANDBOX_ONLY extends InvalidRequest {

            @NotNull
            public static final SANDBOX_ONLY INSTANCE = new SANDBOX_ONLY();

            @NotNull
            public static final Parcelable.Creator<SANDBOX_ONLY> CREATOR = new Creator();

            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<SANDBOX_ONLY> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @NotNull
                public final SANDBOX_ONLY createFromParcel(@NotNull Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return SANDBOX_ONLY.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @NotNull
                public final SANDBOX_ONLY[] newArray(int i10) {
                    return new SANDBOX_ONLY[i10];
                }
            }

            private SANDBOX_ONLY() {
                super("SANDBOX_ONLY", null);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(@NotNull Parcel parcel, int flags) {
                Intrinsics.checkNotNullParameter(parcel, "out");
                parcel.writeInt(1);
            }
        }

        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004HÖ\u0001J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¨\u0006\n"}, d2 = {"Lcom/plaid/link/result/LinkErrorCode$InvalidRequest$UNKNOWN_FIELDS;", "Lcom/plaid/link/result/LinkErrorCode$InvalidRequest;", "()V", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class UNKNOWN_FIELDS extends InvalidRequest {

            @NotNull
            public static final UNKNOWN_FIELDS INSTANCE = new UNKNOWN_FIELDS();

            @NotNull
            public static final Parcelable.Creator<UNKNOWN_FIELDS> CREATOR = new Creator();

            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<UNKNOWN_FIELDS> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @NotNull
                public final UNKNOWN_FIELDS createFromParcel(@NotNull Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return UNKNOWN_FIELDS.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @NotNull
                public final UNKNOWN_FIELDS[] newArray(int i10) {
                    return new UNKNOWN_FIELDS[i10];
                }
            }

            private UNKNOWN_FIELDS() {
                super("UNKNOWN_FIELDS", null);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(@NotNull Parcel parcel, int flags) {
                Intrinsics.checkNotNullParameter(parcel, "out");
                parcel.writeInt(1);
            }
        }

        public /* synthetic */ InvalidRequest(String str, DefaultConstructorMarker defaultConstructorMarker) {
            this(str);
        }

        private InvalidRequest(String str) {
            super(str, LinkErrorType.INVALID_REQUEST.INSTANCE, null);
        }

        public /* synthetic */ InvalidRequest(String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? "" : str, null);
        }
    }

    @Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0012\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016B\u0011\b\u0004\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004\u0082\u0001\u0012\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&'(¨\u0006)"}, d2 = {"Lcom/plaid/link/result/LinkErrorCode$ItemError;", "Lcom/plaid/link/result/LinkErrorCode;", "json", "", "(Ljava/lang/String;)V", "INSTANT_MATCH_FAILED", "INSUFFICIENT_CREDENTIALS", "INVALID_CREDENTIALS", "INVALID_MFA", "INVALID_SEND_METHOD", "INVALID_UPDATE_USERNAME", "ITEM_LOCKED", "ITEM_LOGIN_REQUIRED", "ITEM_NOT_SUPPORTED", "ITEM_NO_ERROR", "MFA_NOT_SUPPORTED", "NO_ACCOUNTS", "NO_AUTH_ACCOUNTS", "NO_INVESTMENT_ACCOUNTS", "NO_LIABILITY_ACCOUNTS", "PRODUCTS_NOT_SUPPORTED", "PRODUCT_NOT_READY", "USER_SETUP_REQUIRED", "Lcom/plaid/link/result/LinkErrorCode$ItemError$INSTANT_MATCH_FAILED;", "Lcom/plaid/link/result/LinkErrorCode$ItemError$INSUFFICIENT_CREDENTIALS;", "Lcom/plaid/link/result/LinkErrorCode$ItemError$INVALID_CREDENTIALS;", "Lcom/plaid/link/result/LinkErrorCode$ItemError$INVALID_MFA;", "Lcom/plaid/link/result/LinkErrorCode$ItemError$INVALID_SEND_METHOD;", "Lcom/plaid/link/result/LinkErrorCode$ItemError$INVALID_UPDATE_USERNAME;", "Lcom/plaid/link/result/LinkErrorCode$ItemError$ITEM_LOCKED;", "Lcom/plaid/link/result/LinkErrorCode$ItemError$ITEM_LOGIN_REQUIRED;", "Lcom/plaid/link/result/LinkErrorCode$ItemError$ITEM_NOT_SUPPORTED;", "Lcom/plaid/link/result/LinkErrorCode$ItemError$ITEM_NO_ERROR;", "Lcom/plaid/link/result/LinkErrorCode$ItemError$MFA_NOT_SUPPORTED;", "Lcom/plaid/link/result/LinkErrorCode$ItemError$NO_ACCOUNTS;", "Lcom/plaid/link/result/LinkErrorCode$ItemError$NO_AUTH_ACCOUNTS;", "Lcom/plaid/link/result/LinkErrorCode$ItemError$NO_INVESTMENT_ACCOUNTS;", "Lcom/plaid/link/result/LinkErrorCode$ItemError$NO_LIABILITY_ACCOUNTS;", "Lcom/plaid/link/result/LinkErrorCode$ItemError$PRODUCTS_NOT_SUPPORTED;", "Lcom/plaid/link/result/LinkErrorCode$ItemError$PRODUCT_NOT_READY;", "Lcom/plaid/link/result/LinkErrorCode$ItemError$USER_SETUP_REQUIRED;", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class ItemError extends LinkErrorCode {

        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004HÖ\u0001J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¨\u0006\n"}, d2 = {"Lcom/plaid/link/result/LinkErrorCode$ItemError$INSTANT_MATCH_FAILED;", "Lcom/plaid/link/result/LinkErrorCode$ItemError;", "()V", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class INSTANT_MATCH_FAILED extends ItemError {

            @NotNull
            public static final INSTANT_MATCH_FAILED INSTANCE = new INSTANT_MATCH_FAILED();

            @NotNull
            public static final Parcelable.Creator<INSTANT_MATCH_FAILED> CREATOR = new Creator();

            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<INSTANT_MATCH_FAILED> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @NotNull
                public final INSTANT_MATCH_FAILED createFromParcel(@NotNull Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return INSTANT_MATCH_FAILED.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @NotNull
                public final INSTANT_MATCH_FAILED[] newArray(int i10) {
                    return new INSTANT_MATCH_FAILED[i10];
                }
            }

            private INSTANT_MATCH_FAILED() {
                super("INSTANT_MATCH_FAILED", null);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(@NotNull Parcel parcel, int flags) {
                Intrinsics.checkNotNullParameter(parcel, "out");
                parcel.writeInt(1);
            }
        }

        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004HÖ\u0001J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¨\u0006\n"}, d2 = {"Lcom/plaid/link/result/LinkErrorCode$ItemError$INSUFFICIENT_CREDENTIALS;", "Lcom/plaid/link/result/LinkErrorCode$ItemError;", "()V", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class INSUFFICIENT_CREDENTIALS extends ItemError {

            @NotNull
            public static final INSUFFICIENT_CREDENTIALS INSTANCE = new INSUFFICIENT_CREDENTIALS();

            @NotNull
            public static final Parcelable.Creator<INSUFFICIENT_CREDENTIALS> CREATOR = new Creator();

            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<INSUFFICIENT_CREDENTIALS> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @NotNull
                public final INSUFFICIENT_CREDENTIALS createFromParcel(@NotNull Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return INSUFFICIENT_CREDENTIALS.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @NotNull
                public final INSUFFICIENT_CREDENTIALS[] newArray(int i10) {
                    return new INSUFFICIENT_CREDENTIALS[i10];
                }
            }

            private INSUFFICIENT_CREDENTIALS() {
                super("INSUFFICIENT_CREDENTIALS", null);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(@NotNull Parcel parcel, int flags) {
                Intrinsics.checkNotNullParameter(parcel, "out");
                parcel.writeInt(1);
            }
        }

        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004HÖ\u0001J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¨\u0006\n"}, d2 = {"Lcom/plaid/link/result/LinkErrorCode$ItemError$INVALID_CREDENTIALS;", "Lcom/plaid/link/result/LinkErrorCode$ItemError;", "()V", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class INVALID_CREDENTIALS extends ItemError {

            @NotNull
            public static final INVALID_CREDENTIALS INSTANCE = new INVALID_CREDENTIALS();

            @NotNull
            public static final Parcelable.Creator<INVALID_CREDENTIALS> CREATOR = new Creator();

            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<INVALID_CREDENTIALS> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @NotNull
                public final INVALID_CREDENTIALS createFromParcel(@NotNull Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return INVALID_CREDENTIALS.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @NotNull
                public final INVALID_CREDENTIALS[] newArray(int i10) {
                    return new INVALID_CREDENTIALS[i10];
                }
            }

            private INVALID_CREDENTIALS() {
                super("INVALID_CREDENTIALS", null);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(@NotNull Parcel parcel, int flags) {
                Intrinsics.checkNotNullParameter(parcel, "out");
                parcel.writeInt(1);
            }
        }

        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004HÖ\u0001J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¨\u0006\n"}, d2 = {"Lcom/plaid/link/result/LinkErrorCode$ItemError$INVALID_MFA;", "Lcom/plaid/link/result/LinkErrorCode$ItemError;", "()V", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class INVALID_MFA extends ItemError {

            @NotNull
            public static final INVALID_MFA INSTANCE = new INVALID_MFA();

            @NotNull
            public static final Parcelable.Creator<INVALID_MFA> CREATOR = new Creator();

            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<INVALID_MFA> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @NotNull
                public final INVALID_MFA createFromParcel(@NotNull Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return INVALID_MFA.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @NotNull
                public final INVALID_MFA[] newArray(int i10) {
                    return new INVALID_MFA[i10];
                }
            }

            private INVALID_MFA() {
                super("INVALID_MFA", null);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(@NotNull Parcel parcel, int flags) {
                Intrinsics.checkNotNullParameter(parcel, "out");
                parcel.writeInt(1);
            }
        }

        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004HÖ\u0001J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¨\u0006\n"}, d2 = {"Lcom/plaid/link/result/LinkErrorCode$ItemError$INVALID_SEND_METHOD;", "Lcom/plaid/link/result/LinkErrorCode$ItemError;", "()V", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class INVALID_SEND_METHOD extends ItemError {

            @NotNull
            public static final INVALID_SEND_METHOD INSTANCE = new INVALID_SEND_METHOD();

            @NotNull
            public static final Parcelable.Creator<INVALID_SEND_METHOD> CREATOR = new Creator();

            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<INVALID_SEND_METHOD> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @NotNull
                public final INVALID_SEND_METHOD createFromParcel(@NotNull Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return INVALID_SEND_METHOD.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @NotNull
                public final INVALID_SEND_METHOD[] newArray(int i10) {
                    return new INVALID_SEND_METHOD[i10];
                }
            }

            private INVALID_SEND_METHOD() {
                super("INVALID_SEND_METHOD", null);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(@NotNull Parcel parcel, int flags) {
                Intrinsics.checkNotNullParameter(parcel, "out");
                parcel.writeInt(1);
            }
        }

        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004HÖ\u0001J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¨\u0006\n"}, d2 = {"Lcom/plaid/link/result/LinkErrorCode$ItemError$INVALID_UPDATE_USERNAME;", "Lcom/plaid/link/result/LinkErrorCode$ItemError;", "()V", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class INVALID_UPDATE_USERNAME extends ItemError {

            @NotNull
            public static final INVALID_UPDATE_USERNAME INSTANCE = new INVALID_UPDATE_USERNAME();

            @NotNull
            public static final Parcelable.Creator<INVALID_UPDATE_USERNAME> CREATOR = new Creator();

            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<INVALID_UPDATE_USERNAME> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @NotNull
                public final INVALID_UPDATE_USERNAME createFromParcel(@NotNull Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return INVALID_UPDATE_USERNAME.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @NotNull
                public final INVALID_UPDATE_USERNAME[] newArray(int i10) {
                    return new INVALID_UPDATE_USERNAME[i10];
                }
            }

            private INVALID_UPDATE_USERNAME() {
                super("INVALID_UPDATE_USERNAME", null);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(@NotNull Parcel parcel, int flags) {
                Intrinsics.checkNotNullParameter(parcel, "out");
                parcel.writeInt(1);
            }
        }

        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004HÖ\u0001J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¨\u0006\n"}, d2 = {"Lcom/plaid/link/result/LinkErrorCode$ItemError$ITEM_LOCKED;", "Lcom/plaid/link/result/LinkErrorCode$ItemError;", "()V", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class ITEM_LOCKED extends ItemError {

            @NotNull
            public static final ITEM_LOCKED INSTANCE = new ITEM_LOCKED();

            @NotNull
            public static final Parcelable.Creator<ITEM_LOCKED> CREATOR = new Creator();

            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<ITEM_LOCKED> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @NotNull
                public final ITEM_LOCKED createFromParcel(@NotNull Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return ITEM_LOCKED.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @NotNull
                public final ITEM_LOCKED[] newArray(int i10) {
                    return new ITEM_LOCKED[i10];
                }
            }

            private ITEM_LOCKED() {
                super("ITEM_LOCKED", null);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(@NotNull Parcel parcel, int flags) {
                Intrinsics.checkNotNullParameter(parcel, "out");
                parcel.writeInt(1);
            }
        }

        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004HÖ\u0001J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¨\u0006\n"}, d2 = {"Lcom/plaid/link/result/LinkErrorCode$ItemError$ITEM_LOGIN_REQUIRED;", "Lcom/plaid/link/result/LinkErrorCode$ItemError;", "()V", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class ITEM_LOGIN_REQUIRED extends ItemError {

            @NotNull
            public static final ITEM_LOGIN_REQUIRED INSTANCE = new ITEM_LOGIN_REQUIRED();

            @NotNull
            public static final Parcelable.Creator<ITEM_LOGIN_REQUIRED> CREATOR = new Creator();

            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<ITEM_LOGIN_REQUIRED> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @NotNull
                public final ITEM_LOGIN_REQUIRED createFromParcel(@NotNull Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return ITEM_LOGIN_REQUIRED.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @NotNull
                public final ITEM_LOGIN_REQUIRED[] newArray(int i10) {
                    return new ITEM_LOGIN_REQUIRED[i10];
                }
            }

            private ITEM_LOGIN_REQUIRED() {
                super("ITEM_LOGIN_REQUIRED", null);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(@NotNull Parcel parcel, int flags) {
                Intrinsics.checkNotNullParameter(parcel, "out");
                parcel.writeInt(1);
            }
        }

        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004HÖ\u0001J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¨\u0006\n"}, d2 = {"Lcom/plaid/link/result/LinkErrorCode$ItemError$ITEM_NOT_SUPPORTED;", "Lcom/plaid/link/result/LinkErrorCode$ItemError;", "()V", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class ITEM_NOT_SUPPORTED extends ItemError {

            @NotNull
            public static final ITEM_NOT_SUPPORTED INSTANCE = new ITEM_NOT_SUPPORTED();

            @NotNull
            public static final Parcelable.Creator<ITEM_NOT_SUPPORTED> CREATOR = new Creator();

            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<ITEM_NOT_SUPPORTED> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @NotNull
                public final ITEM_NOT_SUPPORTED createFromParcel(@NotNull Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return ITEM_NOT_SUPPORTED.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @NotNull
                public final ITEM_NOT_SUPPORTED[] newArray(int i10) {
                    return new ITEM_NOT_SUPPORTED[i10];
                }
            }

            private ITEM_NOT_SUPPORTED() {
                super("ITEM_NOT_SUPPORTED", null);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(@NotNull Parcel parcel, int flags) {
                Intrinsics.checkNotNullParameter(parcel, "out");
                parcel.writeInt(1);
            }
        }

        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004HÖ\u0001J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¨\u0006\n"}, d2 = {"Lcom/plaid/link/result/LinkErrorCode$ItemError$ITEM_NO_ERROR;", "Lcom/plaid/link/result/LinkErrorCode$ItemError;", "()V", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class ITEM_NO_ERROR extends ItemError {

            @NotNull
            public static final ITEM_NO_ERROR INSTANCE = new ITEM_NO_ERROR();

            @NotNull
            public static final Parcelable.Creator<ITEM_NO_ERROR> CREATOR = new Creator();

            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<ITEM_NO_ERROR> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @NotNull
                public final ITEM_NO_ERROR createFromParcel(@NotNull Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return ITEM_NO_ERROR.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @NotNull
                public final ITEM_NO_ERROR[] newArray(int i10) {
                    return new ITEM_NO_ERROR[i10];
                }
            }

            private ITEM_NO_ERROR() {
                super("ITEM_NO_ERROR", null);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(@NotNull Parcel parcel, int flags) {
                Intrinsics.checkNotNullParameter(parcel, "out");
                parcel.writeInt(1);
            }
        }

        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004HÖ\u0001J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¨\u0006\n"}, d2 = {"Lcom/plaid/link/result/LinkErrorCode$ItemError$MFA_NOT_SUPPORTED;", "Lcom/plaid/link/result/LinkErrorCode$ItemError;", "()V", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class MFA_NOT_SUPPORTED extends ItemError {

            @NotNull
            public static final MFA_NOT_SUPPORTED INSTANCE = new MFA_NOT_SUPPORTED();

            @NotNull
            public static final Parcelable.Creator<MFA_NOT_SUPPORTED> CREATOR = new Creator();

            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<MFA_NOT_SUPPORTED> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @NotNull
                public final MFA_NOT_SUPPORTED createFromParcel(@NotNull Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return MFA_NOT_SUPPORTED.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @NotNull
                public final MFA_NOT_SUPPORTED[] newArray(int i10) {
                    return new MFA_NOT_SUPPORTED[i10];
                }
            }

            private MFA_NOT_SUPPORTED() {
                super("MFA_NOT_SUPPORTED", null);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(@NotNull Parcel parcel, int flags) {
                Intrinsics.checkNotNullParameter(parcel, "out");
                parcel.writeInt(1);
            }
        }

        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004HÖ\u0001J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¨\u0006\n"}, d2 = {"Lcom/plaid/link/result/LinkErrorCode$ItemError$NO_ACCOUNTS;", "Lcom/plaid/link/result/LinkErrorCode$ItemError;", "()V", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class NO_ACCOUNTS extends ItemError {

            @NotNull
            public static final NO_ACCOUNTS INSTANCE = new NO_ACCOUNTS();

            @NotNull
            public static final Parcelable.Creator<NO_ACCOUNTS> CREATOR = new Creator();

            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<NO_ACCOUNTS> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @NotNull
                public final NO_ACCOUNTS createFromParcel(@NotNull Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return NO_ACCOUNTS.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @NotNull
                public final NO_ACCOUNTS[] newArray(int i10) {
                    return new NO_ACCOUNTS[i10];
                }
            }

            private NO_ACCOUNTS() {
                super("NO_ACCOUNTS", null);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(@NotNull Parcel parcel, int flags) {
                Intrinsics.checkNotNullParameter(parcel, "out");
                parcel.writeInt(1);
            }
        }

        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004HÖ\u0001J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¨\u0006\n"}, d2 = {"Lcom/plaid/link/result/LinkErrorCode$ItemError$NO_AUTH_ACCOUNTS;", "Lcom/plaid/link/result/LinkErrorCode$ItemError;", "()V", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class NO_AUTH_ACCOUNTS extends ItemError {

            @NotNull
            public static final NO_AUTH_ACCOUNTS INSTANCE = new NO_AUTH_ACCOUNTS();

            @NotNull
            public static final Parcelable.Creator<NO_AUTH_ACCOUNTS> CREATOR = new Creator();

            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<NO_AUTH_ACCOUNTS> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @NotNull
                public final NO_AUTH_ACCOUNTS createFromParcel(@NotNull Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return NO_AUTH_ACCOUNTS.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @NotNull
                public final NO_AUTH_ACCOUNTS[] newArray(int i10) {
                    return new NO_AUTH_ACCOUNTS[i10];
                }
            }

            private NO_AUTH_ACCOUNTS() {
                super("NO_AUTH_ACCOUNTS", null);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(@NotNull Parcel parcel, int flags) {
                Intrinsics.checkNotNullParameter(parcel, "out");
                parcel.writeInt(1);
            }
        }

        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004HÖ\u0001J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¨\u0006\n"}, d2 = {"Lcom/plaid/link/result/LinkErrorCode$ItemError$NO_INVESTMENT_ACCOUNTS;", "Lcom/plaid/link/result/LinkErrorCode$ItemError;", "()V", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class NO_INVESTMENT_ACCOUNTS extends ItemError {

            @NotNull
            public static final NO_INVESTMENT_ACCOUNTS INSTANCE = new NO_INVESTMENT_ACCOUNTS();

            @NotNull
            public static final Parcelable.Creator<NO_INVESTMENT_ACCOUNTS> CREATOR = new Creator();

            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<NO_INVESTMENT_ACCOUNTS> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @NotNull
                public final NO_INVESTMENT_ACCOUNTS createFromParcel(@NotNull Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return NO_INVESTMENT_ACCOUNTS.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @NotNull
                public final NO_INVESTMENT_ACCOUNTS[] newArray(int i10) {
                    return new NO_INVESTMENT_ACCOUNTS[i10];
                }
            }

            private NO_INVESTMENT_ACCOUNTS() {
                super("NO_INVESTMENT_ACCOUNTS", null);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(@NotNull Parcel parcel, int flags) {
                Intrinsics.checkNotNullParameter(parcel, "out");
                parcel.writeInt(1);
            }
        }

        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004HÖ\u0001J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¨\u0006\n"}, d2 = {"Lcom/plaid/link/result/LinkErrorCode$ItemError$NO_LIABILITY_ACCOUNTS;", "Lcom/plaid/link/result/LinkErrorCode$ItemError;", "()V", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class NO_LIABILITY_ACCOUNTS extends ItemError {

            @NotNull
            public static final NO_LIABILITY_ACCOUNTS INSTANCE = new NO_LIABILITY_ACCOUNTS();

            @NotNull
            public static final Parcelable.Creator<NO_LIABILITY_ACCOUNTS> CREATOR = new Creator();

            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<NO_LIABILITY_ACCOUNTS> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @NotNull
                public final NO_LIABILITY_ACCOUNTS createFromParcel(@NotNull Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return NO_LIABILITY_ACCOUNTS.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @NotNull
                public final NO_LIABILITY_ACCOUNTS[] newArray(int i10) {
                    return new NO_LIABILITY_ACCOUNTS[i10];
                }
            }

            private NO_LIABILITY_ACCOUNTS() {
                super("NO_LIABILITY_ACCOUNTS", null);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(@NotNull Parcel parcel, int flags) {
                Intrinsics.checkNotNullParameter(parcel, "out");
                parcel.writeInt(1);
            }
        }

        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004HÖ\u0001J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¨\u0006\n"}, d2 = {"Lcom/plaid/link/result/LinkErrorCode$ItemError$PRODUCTS_NOT_SUPPORTED;", "Lcom/plaid/link/result/LinkErrorCode$ItemError;", "()V", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class PRODUCTS_NOT_SUPPORTED extends ItemError {

            @NotNull
            public static final PRODUCTS_NOT_SUPPORTED INSTANCE = new PRODUCTS_NOT_SUPPORTED();

            @NotNull
            public static final Parcelable.Creator<PRODUCTS_NOT_SUPPORTED> CREATOR = new Creator();

            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<PRODUCTS_NOT_SUPPORTED> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @NotNull
                public final PRODUCTS_NOT_SUPPORTED createFromParcel(@NotNull Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return PRODUCTS_NOT_SUPPORTED.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @NotNull
                public final PRODUCTS_NOT_SUPPORTED[] newArray(int i10) {
                    return new PRODUCTS_NOT_SUPPORTED[i10];
                }
            }

            private PRODUCTS_NOT_SUPPORTED() {
                super("PRODUCTS_NOT_SUPPORTED", null);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(@NotNull Parcel parcel, int flags) {
                Intrinsics.checkNotNullParameter(parcel, "out");
                parcel.writeInt(1);
            }
        }

        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004HÖ\u0001J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¨\u0006\n"}, d2 = {"Lcom/plaid/link/result/LinkErrorCode$ItemError$PRODUCT_NOT_READY;", "Lcom/plaid/link/result/LinkErrorCode$ItemError;", "()V", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class PRODUCT_NOT_READY extends ItemError {

            @NotNull
            public static final PRODUCT_NOT_READY INSTANCE = new PRODUCT_NOT_READY();

            @NotNull
            public static final Parcelable.Creator<PRODUCT_NOT_READY> CREATOR = new Creator();

            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<PRODUCT_NOT_READY> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @NotNull
                public final PRODUCT_NOT_READY createFromParcel(@NotNull Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return PRODUCT_NOT_READY.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @NotNull
                public final PRODUCT_NOT_READY[] newArray(int i10) {
                    return new PRODUCT_NOT_READY[i10];
                }
            }

            private PRODUCT_NOT_READY() {
                super("PRODUCT_NOT_READY", null);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(@NotNull Parcel parcel, int flags) {
                Intrinsics.checkNotNullParameter(parcel, "out");
                parcel.writeInt(1);
            }
        }

        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004HÖ\u0001J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¨\u0006\n"}, d2 = {"Lcom/plaid/link/result/LinkErrorCode$ItemError$USER_SETUP_REQUIRED;", "Lcom/plaid/link/result/LinkErrorCode$ItemError;", "()V", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class USER_SETUP_REQUIRED extends ItemError {

            @NotNull
            public static final USER_SETUP_REQUIRED INSTANCE = new USER_SETUP_REQUIRED();

            @NotNull
            public static final Parcelable.Creator<USER_SETUP_REQUIRED> CREATOR = new Creator();

            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<USER_SETUP_REQUIRED> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @NotNull
                public final USER_SETUP_REQUIRED createFromParcel(@NotNull Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return USER_SETUP_REQUIRED.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @NotNull
                public final USER_SETUP_REQUIRED[] newArray(int i10) {
                    return new USER_SETUP_REQUIRED[i10];
                }
            }

            private USER_SETUP_REQUIRED() {
                super("USER_SETUP_REQUIRED", null);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(@NotNull Parcel parcel, int flags) {
                Intrinsics.checkNotNullParameter(parcel, "out");
                parcel.writeInt(1);
            }
        }

        public /* synthetic */ ItemError(String str, DefaultConstructorMarker defaultConstructorMarker) {
            this(str);
        }

        private ItemError(String str) {
            super(str, LinkErrorType.ITEM_ERROR.INSTANCE, null);
        }

        public /* synthetic */ ItemError(String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? "" : str, null);
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0005\u0006\u0007B\u0011\b\u0004\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004\u0082\u0001\u0003\b\t\n¨\u0006\u000b"}, d2 = {"Lcom/plaid/link/result/LinkErrorCode$OAuthError;", "Lcom/plaid/link/result/LinkErrorCode;", "json", "", "(Ljava/lang/String;)V", "INCORRECT_LINK_TOKEN", "INCORRECT_OAUTH_NONCE", "OAUTH_STATE_ID_ALREADY_PROCESSED", "Lcom/plaid/link/result/LinkErrorCode$OAuthError$INCORRECT_LINK_TOKEN;", "Lcom/plaid/link/result/LinkErrorCode$OAuthError$INCORRECT_OAUTH_NONCE;", "Lcom/plaid/link/result/LinkErrorCode$OAuthError$OAUTH_STATE_ID_ALREADY_PROCESSED;", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class OAuthError extends LinkErrorCode {

        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004HÖ\u0001J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¨\u0006\n"}, d2 = {"Lcom/plaid/link/result/LinkErrorCode$OAuthError$INCORRECT_LINK_TOKEN;", "Lcom/plaid/link/result/LinkErrorCode$OAuthError;", "()V", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class INCORRECT_LINK_TOKEN extends OAuthError {

            @NotNull
            public static final INCORRECT_LINK_TOKEN INSTANCE = new INCORRECT_LINK_TOKEN();

            @NotNull
            public static final Parcelable.Creator<INCORRECT_LINK_TOKEN> CREATOR = new Creator();

            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<INCORRECT_LINK_TOKEN> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @NotNull
                public final INCORRECT_LINK_TOKEN createFromParcel(@NotNull Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return INCORRECT_LINK_TOKEN.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @NotNull
                public final INCORRECT_LINK_TOKEN[] newArray(int i10) {
                    return new INCORRECT_LINK_TOKEN[i10];
                }
            }

            private INCORRECT_LINK_TOKEN() {
                super("INCORRECT_LINK_TOKEN", null);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(@NotNull Parcel parcel, int flags) {
                Intrinsics.checkNotNullParameter(parcel, "out");
                parcel.writeInt(1);
            }
        }

        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004HÖ\u0001J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¨\u0006\n"}, d2 = {"Lcom/plaid/link/result/LinkErrorCode$OAuthError$INCORRECT_OAUTH_NONCE;", "Lcom/plaid/link/result/LinkErrorCode$OAuthError;", "()V", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class INCORRECT_OAUTH_NONCE extends OAuthError {

            @NotNull
            public static final INCORRECT_OAUTH_NONCE INSTANCE = new INCORRECT_OAUTH_NONCE();

            @NotNull
            public static final Parcelable.Creator<INCORRECT_OAUTH_NONCE> CREATOR = new Creator();

            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<INCORRECT_OAUTH_NONCE> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @NotNull
                public final INCORRECT_OAUTH_NONCE createFromParcel(@NotNull Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return INCORRECT_OAUTH_NONCE.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @NotNull
                public final INCORRECT_OAUTH_NONCE[] newArray(int i10) {
                    return new INCORRECT_OAUTH_NONCE[i10];
                }
            }

            private INCORRECT_OAUTH_NONCE() {
                super("INCORRECT_OAUTH_NONCE", null);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(@NotNull Parcel parcel, int flags) {
                Intrinsics.checkNotNullParameter(parcel, "out");
                parcel.writeInt(1);
            }
        }

        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004HÖ\u0001J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¨\u0006\n"}, d2 = {"Lcom/plaid/link/result/LinkErrorCode$OAuthError$OAUTH_STATE_ID_ALREADY_PROCESSED;", "Lcom/plaid/link/result/LinkErrorCode$OAuthError;", "()V", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class OAUTH_STATE_ID_ALREADY_PROCESSED extends OAuthError {

            @NotNull
            public static final OAUTH_STATE_ID_ALREADY_PROCESSED INSTANCE = new OAUTH_STATE_ID_ALREADY_PROCESSED();

            @NotNull
            public static final Parcelable.Creator<OAUTH_STATE_ID_ALREADY_PROCESSED> CREATOR = new Creator();

            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<OAUTH_STATE_ID_ALREADY_PROCESSED> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @NotNull
                public final OAUTH_STATE_ID_ALREADY_PROCESSED createFromParcel(@NotNull Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return OAUTH_STATE_ID_ALREADY_PROCESSED.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @NotNull
                public final OAUTH_STATE_ID_ALREADY_PROCESSED[] newArray(int i10) {
                    return new OAUTH_STATE_ID_ALREADY_PROCESSED[i10];
                }
            }

            private OAUTH_STATE_ID_ALREADY_PROCESSED() {
                super("OAUTH_STATE_ID_ALREADY_PROCESSED", null);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(@NotNull Parcel parcel, int flags) {
                Intrinsics.checkNotNullParameter(parcel, "out");
                parcel.writeInt(1);
            }
        }

        public /* synthetic */ OAuthError(String str, DefaultConstructorMarker defaultConstructorMarker) {
            this(str);
        }

        private OAuthError(String str) {
            super(str, LinkErrorType.INSTITUTION_ERROR.INSTANCE, null);
        }

        public /* synthetic */ OAuthError(String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? "" : str, null);
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0005\u0005\u0006\u0007\b\tB\u0011\b\u0004\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004\u0082\u0001\u0005\n\u000b\f\r\u000e¨\u0006\u000f"}, d2 = {"Lcom/plaid/link/result/LinkErrorCode$PaymentError;", "Lcom/plaid/link/result/LinkErrorCode;", "json", "", "(Ljava/lang/String;)V", "PAYMENT_BLOCKED", "PAYMENT_INSUFFICIENT_FUNDS", "PAYMENT_INVALID_RECIPIENT", "PAYMENT_INVALID_REFERENCE", "PAYMENT_INVALID_SCHEDULE", "Lcom/plaid/link/result/LinkErrorCode$PaymentError$PAYMENT_BLOCKED;", "Lcom/plaid/link/result/LinkErrorCode$PaymentError$PAYMENT_INSUFFICIENT_FUNDS;", "Lcom/plaid/link/result/LinkErrorCode$PaymentError$PAYMENT_INVALID_RECIPIENT;", "Lcom/plaid/link/result/LinkErrorCode$PaymentError$PAYMENT_INVALID_REFERENCE;", "Lcom/plaid/link/result/LinkErrorCode$PaymentError$PAYMENT_INVALID_SCHEDULE;", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class PaymentError extends LinkErrorCode {

        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004HÖ\u0001J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¨\u0006\n"}, d2 = {"Lcom/plaid/link/result/LinkErrorCode$PaymentError$PAYMENT_BLOCKED;", "Lcom/plaid/link/result/LinkErrorCode$PaymentError;", "()V", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class PAYMENT_BLOCKED extends PaymentError {

            @NotNull
            public static final PAYMENT_BLOCKED INSTANCE = new PAYMENT_BLOCKED();

            @NotNull
            public static final Parcelable.Creator<PAYMENT_BLOCKED> CREATOR = new Creator();

            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<PAYMENT_BLOCKED> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @NotNull
                public final PAYMENT_BLOCKED createFromParcel(@NotNull Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return PAYMENT_BLOCKED.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @NotNull
                public final PAYMENT_BLOCKED[] newArray(int i10) {
                    return new PAYMENT_BLOCKED[i10];
                }
            }

            private PAYMENT_BLOCKED() {
                super("PAYMENT_BLOCKED", null);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(@NotNull Parcel parcel, int flags) {
                Intrinsics.checkNotNullParameter(parcel, "out");
                parcel.writeInt(1);
            }
        }

        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004HÖ\u0001J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¨\u0006\n"}, d2 = {"Lcom/plaid/link/result/LinkErrorCode$PaymentError$PAYMENT_INSUFFICIENT_FUNDS;", "Lcom/plaid/link/result/LinkErrorCode$PaymentError;", "()V", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class PAYMENT_INSUFFICIENT_FUNDS extends PaymentError {

            @NotNull
            public static final PAYMENT_INSUFFICIENT_FUNDS INSTANCE = new PAYMENT_INSUFFICIENT_FUNDS();

            @NotNull
            public static final Parcelable.Creator<PAYMENT_INSUFFICIENT_FUNDS> CREATOR = new Creator();

            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<PAYMENT_INSUFFICIENT_FUNDS> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @NotNull
                public final PAYMENT_INSUFFICIENT_FUNDS createFromParcel(@NotNull Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return PAYMENT_INSUFFICIENT_FUNDS.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @NotNull
                public final PAYMENT_INSUFFICIENT_FUNDS[] newArray(int i10) {
                    return new PAYMENT_INSUFFICIENT_FUNDS[i10];
                }
            }

            private PAYMENT_INSUFFICIENT_FUNDS() {
                super("PAYMENT_INSUFFICIENT_FUNDS", null);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(@NotNull Parcel parcel, int flags) {
                Intrinsics.checkNotNullParameter(parcel, "out");
                parcel.writeInt(1);
            }
        }

        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004HÖ\u0001J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¨\u0006\n"}, d2 = {"Lcom/plaid/link/result/LinkErrorCode$PaymentError$PAYMENT_INVALID_RECIPIENT;", "Lcom/plaid/link/result/LinkErrorCode$PaymentError;", "()V", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class PAYMENT_INVALID_RECIPIENT extends PaymentError {

            @NotNull
            public static final PAYMENT_INVALID_RECIPIENT INSTANCE = new PAYMENT_INVALID_RECIPIENT();

            @NotNull
            public static final Parcelable.Creator<PAYMENT_INVALID_RECIPIENT> CREATOR = new Creator();

            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<PAYMENT_INVALID_RECIPIENT> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @NotNull
                public final PAYMENT_INVALID_RECIPIENT createFromParcel(@NotNull Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return PAYMENT_INVALID_RECIPIENT.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @NotNull
                public final PAYMENT_INVALID_RECIPIENT[] newArray(int i10) {
                    return new PAYMENT_INVALID_RECIPIENT[i10];
                }
            }

            private PAYMENT_INVALID_RECIPIENT() {
                super("PAYMENT_INVALID_RECIPIENT", null);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(@NotNull Parcel parcel, int flags) {
                Intrinsics.checkNotNullParameter(parcel, "out");
                parcel.writeInt(1);
            }
        }

        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004HÖ\u0001J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¨\u0006\n"}, d2 = {"Lcom/plaid/link/result/LinkErrorCode$PaymentError$PAYMENT_INVALID_REFERENCE;", "Lcom/plaid/link/result/LinkErrorCode$PaymentError;", "()V", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class PAYMENT_INVALID_REFERENCE extends PaymentError {

            @NotNull
            public static final PAYMENT_INVALID_REFERENCE INSTANCE = new PAYMENT_INVALID_REFERENCE();

            @NotNull
            public static final Parcelable.Creator<PAYMENT_INVALID_REFERENCE> CREATOR = new Creator();

            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<PAYMENT_INVALID_REFERENCE> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @NotNull
                public final PAYMENT_INVALID_REFERENCE createFromParcel(@NotNull Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return PAYMENT_INVALID_REFERENCE.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @NotNull
                public final PAYMENT_INVALID_REFERENCE[] newArray(int i10) {
                    return new PAYMENT_INVALID_REFERENCE[i10];
                }
            }

            private PAYMENT_INVALID_REFERENCE() {
                super("PAYMENT_INVALID_REFERENCE", null);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(@NotNull Parcel parcel, int flags) {
                Intrinsics.checkNotNullParameter(parcel, "out");
                parcel.writeInt(1);
            }
        }

        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004HÖ\u0001J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¨\u0006\n"}, d2 = {"Lcom/plaid/link/result/LinkErrorCode$PaymentError$PAYMENT_INVALID_SCHEDULE;", "Lcom/plaid/link/result/LinkErrorCode$PaymentError;", "()V", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class PAYMENT_INVALID_SCHEDULE extends PaymentError {

            @NotNull
            public static final PAYMENT_INVALID_SCHEDULE INSTANCE = new PAYMENT_INVALID_SCHEDULE();

            @NotNull
            public static final Parcelable.Creator<PAYMENT_INVALID_SCHEDULE> CREATOR = new Creator();

            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<PAYMENT_INVALID_SCHEDULE> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @NotNull
                public final PAYMENT_INVALID_SCHEDULE createFromParcel(@NotNull Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return PAYMENT_INVALID_SCHEDULE.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @NotNull
                public final PAYMENT_INVALID_SCHEDULE[] newArray(int i10) {
                    return new PAYMENT_INVALID_SCHEDULE[i10];
                }
            }

            private PAYMENT_INVALID_SCHEDULE() {
                super("PAYMENT_INVALID_SCHEDULE", null);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(@NotNull Parcel parcel, int flags) {
                Intrinsics.checkNotNullParameter(parcel, "out");
                parcel.writeInt(1);
            }
        }

        public /* synthetic */ PaymentError(String str, DefaultConstructorMarker defaultConstructorMarker) {
            this(str);
        }

        private PaymentError(String str) {
            super(str, LinkErrorType.INSTITUTION_ERROR.INSTANCE, null);
        }

        public /* synthetic */ PaymentError(String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? "" : str, null);
        }
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\b\u0005\u0006\u0007\b\t\n\u000b\fB\u0011\b\u0004\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004\u0082\u0001\b\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014¨\u0006\u0015"}, d2 = {"Lcom/plaid/link/result/LinkErrorCode$RateLimit;", "Lcom/plaid/link/result/LinkErrorCode;", "json", "", "(Ljava/lang/String;)V", "ACCOUNTS_LIMIT", "ADDITION_LIMIT", "AUTH_LIMIT", "BALANCE_LIMIT", "IDENTITY_LIMIT", "ITEM_GET_LIMIT", "RATE_LIMIT", "TRANSACTIONS_LIMIT", "Lcom/plaid/link/result/LinkErrorCode$RateLimit$ACCOUNTS_LIMIT;", "Lcom/plaid/link/result/LinkErrorCode$RateLimit$ADDITION_LIMIT;", "Lcom/plaid/link/result/LinkErrorCode$RateLimit$AUTH_LIMIT;", "Lcom/plaid/link/result/LinkErrorCode$RateLimit$BALANCE_LIMIT;", "Lcom/plaid/link/result/LinkErrorCode$RateLimit$IDENTITY_LIMIT;", "Lcom/plaid/link/result/LinkErrorCode$RateLimit$ITEM_GET_LIMIT;", "Lcom/plaid/link/result/LinkErrorCode$RateLimit$RATE_LIMIT;", "Lcom/plaid/link/result/LinkErrorCode$RateLimit$TRANSACTIONS_LIMIT;", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class RateLimit extends LinkErrorCode {

        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004HÖ\u0001J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¨\u0006\n"}, d2 = {"Lcom/plaid/link/result/LinkErrorCode$RateLimit$ACCOUNTS_LIMIT;", "Lcom/plaid/link/result/LinkErrorCode$RateLimit;", "()V", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class ACCOUNTS_LIMIT extends RateLimit {

            @NotNull
            public static final ACCOUNTS_LIMIT INSTANCE = new ACCOUNTS_LIMIT();

            @NotNull
            public static final Parcelable.Creator<ACCOUNTS_LIMIT> CREATOR = new Creator();

            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<ACCOUNTS_LIMIT> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @NotNull
                public final ACCOUNTS_LIMIT createFromParcel(@NotNull Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return ACCOUNTS_LIMIT.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @NotNull
                public final ACCOUNTS_LIMIT[] newArray(int i10) {
                    return new ACCOUNTS_LIMIT[i10];
                }
            }

            private ACCOUNTS_LIMIT() {
                super("ACCOUNTS_LIMIT", null);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(@NotNull Parcel parcel, int flags) {
                Intrinsics.checkNotNullParameter(parcel, "out");
                parcel.writeInt(1);
            }
        }

        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004HÖ\u0001J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¨\u0006\n"}, d2 = {"Lcom/plaid/link/result/LinkErrorCode$RateLimit$ADDITION_LIMIT;", "Lcom/plaid/link/result/LinkErrorCode$RateLimit;", "()V", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class ADDITION_LIMIT extends RateLimit {

            @NotNull
            public static final ADDITION_LIMIT INSTANCE = new ADDITION_LIMIT();

            @NotNull
            public static final Parcelable.Creator<ADDITION_LIMIT> CREATOR = new Creator();

            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<ADDITION_LIMIT> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @NotNull
                public final ADDITION_LIMIT createFromParcel(@NotNull Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return ADDITION_LIMIT.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @NotNull
                public final ADDITION_LIMIT[] newArray(int i10) {
                    return new ADDITION_LIMIT[i10];
                }
            }

            private ADDITION_LIMIT() {
                super("ADDITION_LIMIT", null);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(@NotNull Parcel parcel, int flags) {
                Intrinsics.checkNotNullParameter(parcel, "out");
                parcel.writeInt(1);
            }
        }

        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004HÖ\u0001J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¨\u0006\n"}, d2 = {"Lcom/plaid/link/result/LinkErrorCode$RateLimit$AUTH_LIMIT;", "Lcom/plaid/link/result/LinkErrorCode$RateLimit;", "()V", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class AUTH_LIMIT extends RateLimit {

            @NotNull
            public static final AUTH_LIMIT INSTANCE = new AUTH_LIMIT();

            @NotNull
            public static final Parcelable.Creator<AUTH_LIMIT> CREATOR = new Creator();

            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<AUTH_LIMIT> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @NotNull
                public final AUTH_LIMIT createFromParcel(@NotNull Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return AUTH_LIMIT.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @NotNull
                public final AUTH_LIMIT[] newArray(int i10) {
                    return new AUTH_LIMIT[i10];
                }
            }

            private AUTH_LIMIT() {
                super("AUTH_LIMIT", null);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(@NotNull Parcel parcel, int flags) {
                Intrinsics.checkNotNullParameter(parcel, "out");
                parcel.writeInt(1);
            }
        }

        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004HÖ\u0001J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¨\u0006\n"}, d2 = {"Lcom/plaid/link/result/LinkErrorCode$RateLimit$BALANCE_LIMIT;", "Lcom/plaid/link/result/LinkErrorCode$RateLimit;", "()V", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class BALANCE_LIMIT extends RateLimit {

            @NotNull
            public static final BALANCE_LIMIT INSTANCE = new BALANCE_LIMIT();

            @NotNull
            public static final Parcelable.Creator<BALANCE_LIMIT> CREATOR = new Creator();

            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<BALANCE_LIMIT> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @NotNull
                public final BALANCE_LIMIT createFromParcel(@NotNull Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return BALANCE_LIMIT.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @NotNull
                public final BALANCE_LIMIT[] newArray(int i10) {
                    return new BALANCE_LIMIT[i10];
                }
            }

            private BALANCE_LIMIT() {
                super("BALANCE_LIMIT", null);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(@NotNull Parcel parcel, int flags) {
                Intrinsics.checkNotNullParameter(parcel, "out");
                parcel.writeInt(1);
            }
        }

        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004HÖ\u0001J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¨\u0006\n"}, d2 = {"Lcom/plaid/link/result/LinkErrorCode$RateLimit$IDENTITY_LIMIT;", "Lcom/plaid/link/result/LinkErrorCode$RateLimit;", "()V", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class IDENTITY_LIMIT extends RateLimit {

            @NotNull
            public static final IDENTITY_LIMIT INSTANCE = new IDENTITY_LIMIT();

            @NotNull
            public static final Parcelable.Creator<IDENTITY_LIMIT> CREATOR = new Creator();

            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<IDENTITY_LIMIT> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @NotNull
                public final IDENTITY_LIMIT createFromParcel(@NotNull Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return IDENTITY_LIMIT.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @NotNull
                public final IDENTITY_LIMIT[] newArray(int i10) {
                    return new IDENTITY_LIMIT[i10];
                }
            }

            private IDENTITY_LIMIT() {
                super("IDENTITY_LIMIT", null);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(@NotNull Parcel parcel, int flags) {
                Intrinsics.checkNotNullParameter(parcel, "out");
                parcel.writeInt(1);
            }
        }

        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004HÖ\u0001J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¨\u0006\n"}, d2 = {"Lcom/plaid/link/result/LinkErrorCode$RateLimit$ITEM_GET_LIMIT;", "Lcom/plaid/link/result/LinkErrorCode$RateLimit;", "()V", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class ITEM_GET_LIMIT extends RateLimit {

            @NotNull
            public static final ITEM_GET_LIMIT INSTANCE = new ITEM_GET_LIMIT();

            @NotNull
            public static final Parcelable.Creator<ITEM_GET_LIMIT> CREATOR = new Creator();

            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<ITEM_GET_LIMIT> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @NotNull
                public final ITEM_GET_LIMIT createFromParcel(@NotNull Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return ITEM_GET_LIMIT.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @NotNull
                public final ITEM_GET_LIMIT[] newArray(int i10) {
                    return new ITEM_GET_LIMIT[i10];
                }
            }

            private ITEM_GET_LIMIT() {
                super("ITEM_GET_LIMIT", null);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(@NotNull Parcel parcel, int flags) {
                Intrinsics.checkNotNullParameter(parcel, "out");
                parcel.writeInt(1);
            }
        }

        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004HÖ\u0001J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¨\u0006\n"}, d2 = {"Lcom/plaid/link/result/LinkErrorCode$RateLimit$RATE_LIMIT;", "Lcom/plaid/link/result/LinkErrorCode$RateLimit;", "()V", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class RATE_LIMIT extends RateLimit {

            @NotNull
            public static final RATE_LIMIT INSTANCE = new RATE_LIMIT();

            @NotNull
            public static final Parcelable.Creator<RATE_LIMIT> CREATOR = new Creator();

            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<RATE_LIMIT> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @NotNull
                public final RATE_LIMIT createFromParcel(@NotNull Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return RATE_LIMIT.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @NotNull
                public final RATE_LIMIT[] newArray(int i10) {
                    return new RATE_LIMIT[i10];
                }
            }

            private RATE_LIMIT() {
                super("RATE_LIMIT", null);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(@NotNull Parcel parcel, int flags) {
                Intrinsics.checkNotNullParameter(parcel, "out");
                parcel.writeInt(1);
            }
        }

        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004HÖ\u0001J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¨\u0006\n"}, d2 = {"Lcom/plaid/link/result/LinkErrorCode$RateLimit$TRANSACTIONS_LIMIT;", "Lcom/plaid/link/result/LinkErrorCode$RateLimit;", "()V", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class TRANSACTIONS_LIMIT extends RateLimit {

            @NotNull
            public static final TRANSACTIONS_LIMIT INSTANCE = new TRANSACTIONS_LIMIT();

            @NotNull
            public static final Parcelable.Creator<TRANSACTIONS_LIMIT> CREATOR = new Creator();

            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<TRANSACTIONS_LIMIT> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @NotNull
                public final TRANSACTIONS_LIMIT createFromParcel(@NotNull Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return TRANSACTIONS_LIMIT.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @NotNull
                public final TRANSACTIONS_LIMIT[] newArray(int i10) {
                    return new TRANSACTIONS_LIMIT[i10];
                }
            }

            private TRANSACTIONS_LIMIT() {
                super("TRANSACTIONS_LIMIT", null);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(@NotNull Parcel parcel, int flags) {
                Intrinsics.checkNotNullParameter(parcel, "out");
                parcel.writeInt(1);
            }
        }

        public /* synthetic */ RateLimit(String str, DefaultConstructorMarker defaultConstructorMarker) {
            this(str);
        }

        private RateLimit(String str) {
            super(str, LinkErrorType.RATE_LIMIT_EXCEEDED.INSTANCE, null);
        }

        public /* synthetic */ RateLimit(String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? "" : str, null);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0005\u0006B\u0011\b\u0004\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004\u0082\u0001\u0002\u0007\b¨\u0006\t"}, d2 = {"Lcom/plaid/link/result/LinkErrorCode$RecaptchaError;", "Lcom/plaid/link/result/LinkErrorCode;", "json", "", "(Ljava/lang/String;)V", "RECAPTCHA_BAD", "RECAPTCHA_REQUIRED", "Lcom/plaid/link/result/LinkErrorCode$RecaptchaError$RECAPTCHA_BAD;", "Lcom/plaid/link/result/LinkErrorCode$RecaptchaError$RECAPTCHA_REQUIRED;", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class RecaptchaError extends LinkErrorCode {

        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004HÖ\u0001J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¨\u0006\n"}, d2 = {"Lcom/plaid/link/result/LinkErrorCode$RecaptchaError$RECAPTCHA_BAD;", "Lcom/plaid/link/result/LinkErrorCode$RecaptchaError;", "()V", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class RECAPTCHA_BAD extends RecaptchaError {

            @NotNull
            public static final RECAPTCHA_BAD INSTANCE = new RECAPTCHA_BAD();

            @NotNull
            public static final Parcelable.Creator<RECAPTCHA_BAD> CREATOR = new Creator();

            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<RECAPTCHA_BAD> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @NotNull
                public final RECAPTCHA_BAD createFromParcel(@NotNull Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return RECAPTCHA_BAD.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @NotNull
                public final RECAPTCHA_BAD[] newArray(int i10) {
                    return new RECAPTCHA_BAD[i10];
                }
            }

            private RECAPTCHA_BAD() {
                super("RECAPTCHA_BAD", null);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(@NotNull Parcel parcel, int flags) {
                Intrinsics.checkNotNullParameter(parcel, "out");
                parcel.writeInt(1);
            }
        }

        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004HÖ\u0001J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¨\u0006\n"}, d2 = {"Lcom/plaid/link/result/LinkErrorCode$RecaptchaError$RECAPTCHA_REQUIRED;", "Lcom/plaid/link/result/LinkErrorCode$RecaptchaError;", "()V", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class RECAPTCHA_REQUIRED extends RecaptchaError {

            @NotNull
            public static final RECAPTCHA_REQUIRED INSTANCE = new RECAPTCHA_REQUIRED();

            @NotNull
            public static final Parcelable.Creator<RECAPTCHA_REQUIRED> CREATOR = new Creator();

            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<RECAPTCHA_REQUIRED> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @NotNull
                public final RECAPTCHA_REQUIRED createFromParcel(@NotNull Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return RECAPTCHA_REQUIRED.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @NotNull
                public final RECAPTCHA_REQUIRED[] newArray(int i10) {
                    return new RECAPTCHA_REQUIRED[i10];
                }
            }

            private RECAPTCHA_REQUIRED() {
                super("RECAPTCHA_REQUIRED", null);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(@NotNull Parcel parcel, int flags) {
                Intrinsics.checkNotNullParameter(parcel, "out");
                parcel.writeInt(1);
            }
        }

        public /* synthetic */ RecaptchaError(String str, DefaultConstructorMarker defaultConstructorMarker) {
            this(str);
        }

        private RecaptchaError(String str) {
            super(str, LinkErrorType.INSTITUTION_ERROR.INSTANCE, null);
        }

        public /* synthetic */ RecaptchaError(String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? "" : str, null);
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0005\u0006\u0007B\u0011\b\u0004\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004\u0082\u0001\u0003\b\t\n¨\u0006\u000b"}, d2 = {"Lcom/plaid/link/result/LinkErrorCode$SandboxError;", "Lcom/plaid/link/result/LinkErrorCode;", "json", "", "(Ljava/lang/String;)V", "SANDBOX_BANK_TRANSFER_EVENT_TRANSITION_INVALID", "SANDBOX_PRODUCT_NOT_ENABLED", "SANDBOX_WEBHOOK_INVALID", "Lcom/plaid/link/result/LinkErrorCode$SandboxError$SANDBOX_BANK_TRANSFER_EVENT_TRANSITION_INVALID;", "Lcom/plaid/link/result/LinkErrorCode$SandboxError$SANDBOX_PRODUCT_NOT_ENABLED;", "Lcom/plaid/link/result/LinkErrorCode$SandboxError$SANDBOX_WEBHOOK_INVALID;", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class SandboxError extends LinkErrorCode {

        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004HÖ\u0001J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¨\u0006\n"}, d2 = {"Lcom/plaid/link/result/LinkErrorCode$SandboxError$SANDBOX_BANK_TRANSFER_EVENT_TRANSITION_INVALID;", "Lcom/plaid/link/result/LinkErrorCode$SandboxError;", "()V", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class SANDBOX_BANK_TRANSFER_EVENT_TRANSITION_INVALID extends SandboxError {

            @NotNull
            public static final SANDBOX_BANK_TRANSFER_EVENT_TRANSITION_INVALID INSTANCE = new SANDBOX_BANK_TRANSFER_EVENT_TRANSITION_INVALID();

            @NotNull
            public static final Parcelable.Creator<SANDBOX_BANK_TRANSFER_EVENT_TRANSITION_INVALID> CREATOR = new Creator();

            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<SANDBOX_BANK_TRANSFER_EVENT_TRANSITION_INVALID> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @NotNull
                public final SANDBOX_BANK_TRANSFER_EVENT_TRANSITION_INVALID createFromParcel(@NotNull Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return SANDBOX_BANK_TRANSFER_EVENT_TRANSITION_INVALID.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @NotNull
                public final SANDBOX_BANK_TRANSFER_EVENT_TRANSITION_INVALID[] newArray(int i10) {
                    return new SANDBOX_BANK_TRANSFER_EVENT_TRANSITION_INVALID[i10];
                }
            }

            private SANDBOX_BANK_TRANSFER_EVENT_TRANSITION_INVALID() {
                super("SANDBOX_BANK_TRANSFER_EVENT_TRANSITION_INVALID", null);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(@NotNull Parcel parcel, int flags) {
                Intrinsics.checkNotNullParameter(parcel, "out");
                parcel.writeInt(1);
            }
        }

        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004HÖ\u0001J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¨\u0006\n"}, d2 = {"Lcom/plaid/link/result/LinkErrorCode$SandboxError$SANDBOX_PRODUCT_NOT_ENABLED;", "Lcom/plaid/link/result/LinkErrorCode$SandboxError;", "()V", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class SANDBOX_PRODUCT_NOT_ENABLED extends SandboxError {

            @NotNull
            public static final SANDBOX_PRODUCT_NOT_ENABLED INSTANCE = new SANDBOX_PRODUCT_NOT_ENABLED();

            @NotNull
            public static final Parcelable.Creator<SANDBOX_PRODUCT_NOT_ENABLED> CREATOR = new Creator();

            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<SANDBOX_PRODUCT_NOT_ENABLED> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @NotNull
                public final SANDBOX_PRODUCT_NOT_ENABLED createFromParcel(@NotNull Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return SANDBOX_PRODUCT_NOT_ENABLED.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @NotNull
                public final SANDBOX_PRODUCT_NOT_ENABLED[] newArray(int i10) {
                    return new SANDBOX_PRODUCT_NOT_ENABLED[i10];
                }
            }

            private SANDBOX_PRODUCT_NOT_ENABLED() {
                super("SANDBOX_PRODUCT_NOT_ENABLED", null);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(@NotNull Parcel parcel, int flags) {
                Intrinsics.checkNotNullParameter(parcel, "out");
                parcel.writeInt(1);
            }
        }

        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004HÖ\u0001J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¨\u0006\n"}, d2 = {"Lcom/plaid/link/result/LinkErrorCode$SandboxError$SANDBOX_WEBHOOK_INVALID;", "Lcom/plaid/link/result/LinkErrorCode$SandboxError;", "()V", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class SANDBOX_WEBHOOK_INVALID extends SandboxError {

            @NotNull
            public static final SANDBOX_WEBHOOK_INVALID INSTANCE = new SANDBOX_WEBHOOK_INVALID();

            @NotNull
            public static final Parcelable.Creator<SANDBOX_WEBHOOK_INVALID> CREATOR = new Creator();

            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<SANDBOX_WEBHOOK_INVALID> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @NotNull
                public final SANDBOX_WEBHOOK_INVALID createFromParcel(@NotNull Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return SANDBOX_WEBHOOK_INVALID.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @NotNull
                public final SANDBOX_WEBHOOK_INVALID[] newArray(int i10) {
                    return new SANDBOX_WEBHOOK_INVALID[i10];
                }
            }

            private SANDBOX_WEBHOOK_INVALID() {
                super("SANDBOX_WEBHOOK_INVALID", null);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(@NotNull Parcel parcel, int flags) {
                Intrinsics.checkNotNullParameter(parcel, "out");
                parcel.writeInt(1);
            }
        }

        public /* synthetic */ SandboxError(String str, DefaultConstructorMarker defaultConstructorMarker) {
            this(str);
        }

        private SandboxError(String str) {
            super(str, LinkErrorType.INSTITUTION_ERROR.INSTANCE, null);
        }

        public /* synthetic */ SandboxError(String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? "" : str, null);
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\fHÖ\u0001J\u0019\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0012"}, d2 = {"Lcom/plaid/link/result/LinkErrorCode$UNKNOWN;", "Lcom/plaid/link/result/LinkErrorCode;", "name", "", "type", "Lcom/plaid/link/result/LinkErrorType;", "(Ljava/lang/String;Lcom/plaid/link/result/LinkErrorType;)V", "getName", "()Ljava/lang/String;", "getType", "()Lcom/plaid/link/result/LinkErrorType;", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class UNKNOWN extends LinkErrorCode {

        @NotNull
        public static final Parcelable.Creator<UNKNOWN> CREATOR = new Creator();

        @NotNull
        private final String name;

        @NotNull
        private final LinkErrorType type;

        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<UNKNOWN> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @NotNull
            public final UNKNOWN createFromParcel(@NotNull Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new UNKNOWN(parcel.readString(), (LinkErrorType) parcel.readParcelable(UNKNOWN.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @NotNull
            public final UNKNOWN[] newArray(int i10) {
                return new UNKNOWN[i10];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public UNKNOWN(@NotNull String name, @NotNull LinkErrorType type) {
            super(name, type, null);
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(type, "type");
            this.name = name;
            this.type = type;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @NotNull
        public final String getName() {
            return this.name;
        }

        @NotNull
        public final LinkErrorType getType() {
            return this.type;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@NotNull Parcel parcel, int flags) {
            Intrinsics.checkNotNullParameter(parcel, "out");
            parcel.writeString(this.name);
            parcel.writeParcelable(this.type, flags);
        }
    }

    public /* synthetic */ LinkErrorCode(String str, LinkErrorType linkErrorType, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, linkErrorType);
    }

    @NotNull
    public final LinkErrorType getErrorType() {
        return this.errorType;
    }

    @NotNull
    public final String getJson() {
        return this.json;
    }

    @NotNull
    public String toString() {
        return this.errorType + " : " + this.json;
    }

    private LinkErrorCode(String str, LinkErrorType linkErrorType) {
        this.json = str;
        this.errorType = linkErrorType;
    }

    public /* synthetic */ LinkErrorCode(String str, LinkErrorType linkErrorType, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? "" : str, linkErrorType, null);
    }
}
