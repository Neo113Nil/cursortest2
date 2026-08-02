package spay.sdk.domain.model.response;

import B0.A0;
import N3.C3660k;
import V.e;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import spay.sdk.domain.model.response.paymentToken.errorResponse.FraudMonCheckResult;

@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0013\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0013\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&'(¨\u0006)"}, d2 = {"Lspay/sdk/domain/model/response/ErrorEntity;", "", "()V", "AccessDenied", "ApiError", "BadRequest", "BindingPaymentFailed", "CanceledByUser", "DoubleOtpCall", "NoBnplResponse", "NoInternet", "NotEnoughMoneyForBnplFirstPayment", "NotEnoughMoneyForPayment", "NotFound", "PayBnplPartsFail", "RequiredBodyEmpty", "RequiredFieldEmpty", "ServiceUnavailable", "TimeOut", "Unauthorized", "Unknown", "UnknownApiResult", "Lspay/sdk/domain/model/response/ErrorEntity$AccessDenied;", "Lspay/sdk/domain/model/response/ErrorEntity$ApiError;", "Lspay/sdk/domain/model/response/ErrorEntity$BadRequest;", "Lspay/sdk/domain/model/response/ErrorEntity$BindingPaymentFailed;", "Lspay/sdk/domain/model/response/ErrorEntity$CanceledByUser;", "Lspay/sdk/domain/model/response/ErrorEntity$DoubleOtpCall;", "Lspay/sdk/domain/model/response/ErrorEntity$NoBnplResponse;", "Lspay/sdk/domain/model/response/ErrorEntity$NoInternet;", "Lspay/sdk/domain/model/response/ErrorEntity$NotEnoughMoneyForBnplFirstPayment;", "Lspay/sdk/domain/model/response/ErrorEntity$NotEnoughMoneyForPayment;", "Lspay/sdk/domain/model/response/ErrorEntity$NotFound;", "Lspay/sdk/domain/model/response/ErrorEntity$PayBnplPartsFail;", "Lspay/sdk/domain/model/response/ErrorEntity$RequiredBodyEmpty;", "Lspay/sdk/domain/model/response/ErrorEntity$RequiredFieldEmpty;", "Lspay/sdk/domain/model/response/ErrorEntity$ServiceUnavailable;", "Lspay/sdk/domain/model/response/ErrorEntity$TimeOut;", "Lspay/sdk/domain/model/response/ErrorEntity$Unauthorized;", "Lspay/sdk/domain/model/response/ErrorEntity$Unknown;", "Lspay/sdk/domain/model/response/ErrorEntity$UnknownApiResult;", "SPaySDK_baseRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class ErrorEntity {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lspay/sdk/domain/model/response/ErrorEntity$AccessDenied;", "Lspay/sdk/domain/model/response/ErrorEntity;", "()V", "SPaySDK_baseRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class AccessDenied extends ErrorEntity {

        @NotNull
        public static final AccessDenied INSTANCE = new AccessDenied();

        private AccessDenied() {
            super(null);
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0013"}, d2 = {"Lspay/sdk/domain/model/response/ErrorEntity$ApiError;", "Lspay/sdk/domain/model/response/ErrorEntity;", "errorCode", "", "description", "(Ljava/lang/String;Ljava/lang/String;)V", "getDescription", "()Ljava/lang/String;", "getErrorCode", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "SPaySDK_baseRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class ApiError extends ErrorEntity {

        @NotNull
        private final String description;

        @NotNull
        private final String errorCode;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ApiError(@NotNull String errorCode, @NotNull String description) {
            super(null);
            Intrinsics.checkNotNullParameter(errorCode, "errorCode");
            Intrinsics.checkNotNullParameter(description, "description");
            this.errorCode = errorCode;
            this.description = description;
        }

        public static /* synthetic */ ApiError copy$default(ApiError apiError, String str, String str2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = apiError.errorCode;
            }
            if ((i11 & 2) != 0) {
                str2 = apiError.description;
            }
            return apiError.copy(str, str2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getErrorCode() {
            return this.errorCode;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final String getDescription() {
            return this.description;
        }

        @NotNull
        public final ApiError copy(@NotNull String errorCode, @NotNull String description) {
            Intrinsics.checkNotNullParameter(errorCode, "errorCode");
            Intrinsics.checkNotNullParameter(description, "description");
            return new ApiError(errorCode, description);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ApiError)) {
                return false;
            }
            ApiError apiError = (ApiError) other;
            return Intrinsics.d(this.errorCode, apiError.errorCode) && Intrinsics.d(this.description, apiError.description);
        }

        @NotNull
        public final String getDescription() {
            return this.description;
        }

        @NotNull
        public final String getErrorCode() {
            return this.errorCode;
        }

        public int hashCode() {
            return this.description.hashCode() + (this.errorCode.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return e.a("ApiError(errorCode=", this.errorCode, ", description=", this.description, ")");
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0006HÆ\u0003J-\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0018"}, d2 = {"Lspay/sdk/domain/model/response/ErrorEntity$BadRequest;", "Lspay/sdk/domain/model/response/ErrorEntity;", "errorCode", "", "description", "fraudMonCheckResult", "Lspay/sdk/domain/model/response/paymentToken/errorResponse/FraudMonCheckResult;", "(Ljava/lang/String;Ljava/lang/String;Lspay/sdk/domain/model/response/paymentToken/errorResponse/FraudMonCheckResult;)V", "getDescription", "()Ljava/lang/String;", "getErrorCode", "getFraudMonCheckResult", "()Lspay/sdk/domain/model/response/paymentToken/errorResponse/FraudMonCheckResult;", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "SPaySDK_baseRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class BadRequest extends ErrorEntity {
        private final String description;
        private final String errorCode;
        private final FraudMonCheckResult fraudMonCheckResult;

        public BadRequest() {
            this(null, null, null, 7, null);
        }

        public static /* synthetic */ BadRequest copy$default(BadRequest badRequest, String str, String str2, FraudMonCheckResult fraudMonCheckResult, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = badRequest.errorCode;
            }
            if ((i11 & 2) != 0) {
                str2 = badRequest.description;
            }
            if ((i11 & 4) != 0) {
                fraudMonCheckResult = badRequest.fraudMonCheckResult;
            }
            return badRequest.copy(str, str2, fraudMonCheckResult);
        }

        /* renamed from: component1, reason: from getter */
        public final String getErrorCode() {
            return this.errorCode;
        }

        /* renamed from: component2, reason: from getter */
        public final String getDescription() {
            return this.description;
        }

        /* renamed from: component3, reason: from getter */
        public final FraudMonCheckResult getFraudMonCheckResult() {
            return this.fraudMonCheckResult;
        }

        @NotNull
        public final BadRequest copy(String errorCode, String description, FraudMonCheckResult fraudMonCheckResult) {
            return new BadRequest(errorCode, description, fraudMonCheckResult);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof BadRequest)) {
                return false;
            }
            BadRequest badRequest = (BadRequest) other;
            return Intrinsics.d(this.errorCode, badRequest.errorCode) && Intrinsics.d(this.description, badRequest.description) && Intrinsics.d(this.fraudMonCheckResult, badRequest.fraudMonCheckResult);
        }

        public final String getDescription() {
            return this.description;
        }

        public final String getErrorCode() {
            return this.errorCode;
        }

        public final FraudMonCheckResult getFraudMonCheckResult() {
            return this.fraudMonCheckResult;
        }

        public int hashCode() {
            String str = this.errorCode;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.description;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            FraudMonCheckResult fraudMonCheckResult = this.fraudMonCheckResult;
            return hashCode2 + (fraudMonCheckResult != null ? fraudMonCheckResult.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            String str = this.errorCode;
            String str2 = this.description;
            FraudMonCheckResult fraudMonCheckResult = this.fraudMonCheckResult;
            StringBuilder d11 = C3660k.d("BadRequest(errorCode=", str, ", description=", str2, ", fraudMonCheckResult=");
            d11.append(fraudMonCheckResult);
            d11.append(")");
            return d11.toString();
        }

        public /* synthetic */ BadRequest(String str, String str2, FraudMonCheckResult fraudMonCheckResult, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? null : fraudMonCheckResult);
        }

        public BadRequest(String str, String str2, FraudMonCheckResult fraudMonCheckResult) {
            super(null);
            this.errorCode = str;
            this.description = str2;
            this.fraudMonCheckResult = fraudMonCheckResult;
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lspay/sdk/domain/model/response/ErrorEntity$BindingPaymentFailed;", "Lspay/sdk/domain/model/response/ErrorEntity;", "reason", "", "(Ljava/lang/String;)V", "getReason", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "SPaySDK_baseRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class BindingPaymentFailed extends ErrorEntity {

        @NotNull
        private final String reason;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public BindingPaymentFailed(@NotNull String reason) {
            super(null);
            Intrinsics.checkNotNullParameter(reason, "reason");
            this.reason = reason;
        }

        public static /* synthetic */ BindingPaymentFailed copy$default(BindingPaymentFailed bindingPaymentFailed, String str, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = bindingPaymentFailed.reason;
            }
            return bindingPaymentFailed.copy(str);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getReason() {
            return this.reason;
        }

        @NotNull
        public final BindingPaymentFailed copy(@NotNull String reason) {
            Intrinsics.checkNotNullParameter(reason, "reason");
            return new BindingPaymentFailed(reason);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof BindingPaymentFailed) && Intrinsics.d(this.reason, ((BindingPaymentFailed) other).reason);
        }

        @NotNull
        public final String getReason() {
            return this.reason;
        }

        public int hashCode() {
            return this.reason.hashCode();
        }

        @NotNull
        public String toString() {
            return A0.b("BindingPaymentFailed(reason=", this.reason, ")");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lspay/sdk/domain/model/response/ErrorEntity$CanceledByUser;", "Lspay/sdk/domain/model/response/ErrorEntity;", "()V", "SPaySDK_baseRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class CanceledByUser extends ErrorEntity {

        @NotNull
        public static final CanceledByUser INSTANCE = new CanceledByUser();

        private CanceledByUser() {
            super(null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lspay/sdk/domain/model/response/ErrorEntity$DoubleOtpCall;", "Lspay/sdk/domain/model/response/ErrorEntity;", "()V", "SPaySDK_baseRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class DoubleOtpCall extends ErrorEntity {

        @NotNull
        public static final DoubleOtpCall INSTANCE = new DoubleOtpCall();

        private DoubleOtpCall() {
            super(null);
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\u000b\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\u000b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0013"}, d2 = {"Lspay/sdk/domain/model/response/ErrorEntity$NoBnplResponse;", "Lspay/sdk/domain/model/response/ErrorEntity;", "errorCode", "", "description", "(Ljava/lang/String;Ljava/lang/String;)V", "getDescription", "()Ljava/lang/String;", "getErrorCode", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "SPaySDK_baseRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class NoBnplResponse extends ErrorEntity {
        private final String description;
        private final String errorCode;

        /* JADX WARN: Multi-variable type inference failed */
        public NoBnplResponse() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ NoBnplResponse copy$default(NoBnplResponse noBnplResponse, String str, String str2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = noBnplResponse.errorCode;
            }
            if ((i11 & 2) != 0) {
                str2 = noBnplResponse.description;
            }
            return noBnplResponse.copy(str, str2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getErrorCode() {
            return this.errorCode;
        }

        /* renamed from: component2, reason: from getter */
        public final String getDescription() {
            return this.description;
        }

        @NotNull
        public final NoBnplResponse copy(String errorCode, String description) {
            return new NoBnplResponse(errorCode, description);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof NoBnplResponse)) {
                return false;
            }
            NoBnplResponse noBnplResponse = (NoBnplResponse) other;
            return Intrinsics.d(this.errorCode, noBnplResponse.errorCode) && Intrinsics.d(this.description, noBnplResponse.description);
        }

        public final String getDescription() {
            return this.description;
        }

        public final String getErrorCode() {
            return this.errorCode;
        }

        public int hashCode() {
            String str = this.errorCode;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.description;
            return hashCode + (str2 != null ? str2.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return e.a("NoBnplResponse(errorCode=", this.errorCode, ", description=", this.description, ")");
        }

        public /* synthetic */ NoBnplResponse(String str, String str2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : str2);
        }

        public NoBnplResponse(String str, String str2) {
            super(null);
            this.errorCode = str;
            this.description = str2;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lspay/sdk/domain/model/response/ErrorEntity$NoInternet;", "Lspay/sdk/domain/model/response/ErrorEntity;", "()V", "SPaySDK_baseRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class NoInternet extends ErrorEntity {

        @NotNull
        public static final NoInternet INSTANCE = new NoInternet();

        private NoInternet() {
            super(null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lspay/sdk/domain/model/response/ErrorEntity$NotEnoughMoneyForBnplFirstPayment;", "Lspay/sdk/domain/model/response/ErrorEntity;", "()V", "SPaySDK_baseRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class NotEnoughMoneyForBnplFirstPayment extends ErrorEntity {

        @NotNull
        public static final NotEnoughMoneyForBnplFirstPayment INSTANCE = new NotEnoughMoneyForBnplFirstPayment();

        private NotEnoughMoneyForBnplFirstPayment() {
            super(null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lspay/sdk/domain/model/response/ErrorEntity$NotEnoughMoneyForPayment;", "Lspay/sdk/domain/model/response/ErrorEntity;", "()V", "SPaySDK_baseRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class NotEnoughMoneyForPayment extends ErrorEntity {

        @NotNull
        public static final NotEnoughMoneyForPayment INSTANCE = new NotEnoughMoneyForPayment();

        private NotEnoughMoneyForPayment() {
            super(null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lspay/sdk/domain/model/response/ErrorEntity$NotFound;", "Lspay/sdk/domain/model/response/ErrorEntity;", "()V", "SPaySDK_baseRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class NotFound extends ErrorEntity {

        @NotNull
        public static final NotFound INSTANCE = new NotFound();

        private NotFound() {
            super(null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lspay/sdk/domain/model/response/ErrorEntity$PayBnplPartsFail;", "Lspay/sdk/domain/model/response/ErrorEntity;", "()V", "SPaySDK_baseRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class PayBnplPartsFail extends ErrorEntity {

        @NotNull
        public static final PayBnplPartsFail INSTANCE = new PayBnplPartsFail();

        private PayBnplPartsFail() {
            super(null);
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lspay/sdk/domain/model/response/ErrorEntity$RequiredBodyEmpty;", "Lspay/sdk/domain/model/response/ErrorEntity;", "endPoint", "", "(Ljava/lang/String;)V", "getEndPoint", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "SPaySDK_baseRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class RequiredBodyEmpty extends ErrorEntity {

        @NotNull
        private final String endPoint;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RequiredBodyEmpty(@NotNull String endPoint) {
            super(null);
            Intrinsics.checkNotNullParameter(endPoint, "endPoint");
            this.endPoint = endPoint;
        }

        public static /* synthetic */ RequiredBodyEmpty copy$default(RequiredBodyEmpty requiredBodyEmpty, String str, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = requiredBodyEmpty.endPoint;
            }
            return requiredBodyEmpty.copy(str);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getEndPoint() {
            return this.endPoint;
        }

        @NotNull
        public final RequiredBodyEmpty copy(@NotNull String endPoint) {
            Intrinsics.checkNotNullParameter(endPoint, "endPoint");
            return new RequiredBodyEmpty(endPoint);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof RequiredBodyEmpty) && Intrinsics.d(this.endPoint, ((RequiredBodyEmpty) other).endPoint);
        }

        @NotNull
        public final String getEndPoint() {
            return this.endPoint;
        }

        public int hashCode() {
            return this.endPoint.hashCode();
        }

        @NotNull
        public String toString() {
            return A0.b("RequiredBodyEmpty(endPoint=", this.endPoint, ")");
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lspay/sdk/domain/model/response/ErrorEntity$RequiredFieldEmpty;", "Lspay/sdk/domain/model/response/ErrorEntity;", "field", "", "(Ljava/lang/String;)V", "getField", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "SPaySDK_baseRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class RequiredFieldEmpty extends ErrorEntity {

        @NotNull
        private final String field;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RequiredFieldEmpty(@NotNull String field) {
            super(null);
            Intrinsics.checkNotNullParameter(field, "field");
            this.field = field;
        }

        public static /* synthetic */ RequiredFieldEmpty copy$default(RequiredFieldEmpty requiredFieldEmpty, String str, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = requiredFieldEmpty.field;
            }
            return requiredFieldEmpty.copy(str);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getField() {
            return this.field;
        }

        @NotNull
        public final RequiredFieldEmpty copy(@NotNull String field) {
            Intrinsics.checkNotNullParameter(field, "field");
            return new RequiredFieldEmpty(field);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof RequiredFieldEmpty) && Intrinsics.d(this.field, ((RequiredFieldEmpty) other).field);
        }

        @NotNull
        public final String getField() {
            return this.field;
        }

        public int hashCode() {
            return this.field.hashCode();
        }

        @NotNull
        public String toString() {
            return A0.b("RequiredFieldEmpty(field=", this.field, ")");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lspay/sdk/domain/model/response/ErrorEntity$ServiceUnavailable;", "Lspay/sdk/domain/model/response/ErrorEntity;", "()V", "SPaySDK_baseRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class ServiceUnavailable extends ErrorEntity {

        @NotNull
        public static final ServiceUnavailable INSTANCE = new ServiceUnavailable();

        private ServiceUnavailable() {
            super(null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lspay/sdk/domain/model/response/ErrorEntity$TimeOut;", "Lspay/sdk/domain/model/response/ErrorEntity;", "()V", "SPaySDK_baseRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class TimeOut extends ErrorEntity {

        @NotNull
        public static final TimeOut INSTANCE = new TimeOut();

        private TimeOut() {
            super(null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lspay/sdk/domain/model/response/ErrorEntity$Unauthorized;", "Lspay/sdk/domain/model/response/ErrorEntity;", "()V", "SPaySDK_baseRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Unauthorized extends ErrorEntity {

        @NotNull
        public static final Unauthorized INSTANCE = new Unauthorized();

        private Unauthorized() {
            super(null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lspay/sdk/domain/model/response/ErrorEntity$Unknown;", "Lspay/sdk/domain/model/response/ErrorEntity;", "()V", "SPaySDK_baseRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Unknown extends ErrorEntity {

        @NotNull
        public static final Unknown INSTANCE = new Unknown();

        private Unknown() {
            super(null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lspay/sdk/domain/model/response/ErrorEntity$UnknownApiResult;", "Lspay/sdk/domain/model/response/ErrorEntity;", "()V", "SPaySDK_baseRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class UnknownApiResult extends ErrorEntity {

        @NotNull
        public static final UnknownApiResult INSTANCE = new UnknownApiResult();

        private UnknownApiResult() {
            super(null);
        }
    }

    public /* synthetic */ ErrorEntity(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private ErrorEntity() {
    }
}
