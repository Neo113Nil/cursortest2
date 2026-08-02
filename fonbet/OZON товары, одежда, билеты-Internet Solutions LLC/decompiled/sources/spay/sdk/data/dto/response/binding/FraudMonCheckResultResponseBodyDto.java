package spay.sdk.data.dto.response.binding;

import J8.b;
import N3.C3660k;
import Ve.C4452mn;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import spay.sdk.data.dto.response.DataDtoInterface;
import spay.sdk.data.dto.response.paymentToken.FraudMonCheckResultResponseBodyDto;
import spay.sdk.domain.model.response.paymentToken.errorResponse.FraudMonCheckResult;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0080\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0007HÆ\u0003J-\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\b\u0010\u0018\u001a\u00020\u0002H\u0016J\t\u0010\u0019\u001a\u00020\u0004HÖ\u0001R\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u001a"}, d2 = {"Lspay/sdk/data/dto/response/binding/FraudMonCheckResultResponseBodyDto;", "Lspay/sdk/data/dto/response/DataDtoInterface;", "Lspay/sdk/domain/model/response/paymentToken/errorResponse/FraudMonCheckResult;", "actionCode", "", "ruleName", "formParameters", "Lspay/sdk/data/dto/response/paymentToken/FraudMonCheckResultResponseBodyDto$FormParametersResponseBodyDto;", "(Ljava/lang/String;Ljava/lang/String;Lspay/sdk/data/dto/response/paymentToken/FraudMonCheckResultResponseBodyDto$FormParametersResponseBodyDto;)V", "getActionCode", "()Ljava/lang/String;", "getFormParameters", "()Lspay/sdk/data/dto/response/paymentToken/FraudMonCheckResultResponseBodyDto$FormParametersResponseBodyDto;", "getRuleName", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toModel", "toString", "SPaySDK_baseRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class FraudMonCheckResultResponseBodyDto implements DataDtoInterface<FraudMonCheckResult> {

    @b("actionCode")
    private final String actionCode;

    @b("formParameters")
    private final FraudMonCheckResultResponseBodyDto.FormParametersResponseBodyDto formParameters;

    @b("ruleName")
    private final String ruleName;

    public FraudMonCheckResultResponseBodyDto(String str, String str2, FraudMonCheckResultResponseBodyDto.FormParametersResponseBodyDto formParametersResponseBodyDto) {
        this.actionCode = str;
        this.ruleName = str2;
        this.formParameters = formParametersResponseBodyDto;
    }

    public static /* synthetic */ FraudMonCheckResultResponseBodyDto copy$default(FraudMonCheckResultResponseBodyDto fraudMonCheckResultResponseBodyDto, String str, String str2, FraudMonCheckResultResponseBodyDto.FormParametersResponseBodyDto formParametersResponseBodyDto, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = fraudMonCheckResultResponseBodyDto.actionCode;
        }
        if ((i11 & 2) != 0) {
            str2 = fraudMonCheckResultResponseBodyDto.ruleName;
        }
        if ((i11 & 4) != 0) {
            formParametersResponseBodyDto = fraudMonCheckResultResponseBodyDto.formParameters;
        }
        return fraudMonCheckResultResponseBodyDto.copy(str, str2, formParametersResponseBodyDto);
    }

    /* renamed from: component1, reason: from getter */
    public final String getActionCode() {
        return this.actionCode;
    }

    /* renamed from: component2, reason: from getter */
    public final String getRuleName() {
        return this.ruleName;
    }

    /* renamed from: component3, reason: from getter */
    public final FraudMonCheckResultResponseBodyDto.FormParametersResponseBodyDto getFormParameters() {
        return this.formParameters;
    }

    @NotNull
    public final FraudMonCheckResultResponseBodyDto copy(String actionCode, String ruleName, FraudMonCheckResultResponseBodyDto.FormParametersResponseBodyDto formParameters) {
        return new FraudMonCheckResultResponseBodyDto(actionCode, ruleName, formParameters);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FraudMonCheckResultResponseBodyDto)) {
            return false;
        }
        FraudMonCheckResultResponseBodyDto fraudMonCheckResultResponseBodyDto = (FraudMonCheckResultResponseBodyDto) other;
        return Intrinsics.d(this.actionCode, fraudMonCheckResultResponseBodyDto.actionCode) && Intrinsics.d(this.ruleName, fraudMonCheckResultResponseBodyDto.ruleName) && Intrinsics.d(this.formParameters, fraudMonCheckResultResponseBodyDto.formParameters);
    }

    public final String getActionCode() {
        return this.actionCode;
    }

    public final FraudMonCheckResultResponseBodyDto.FormParametersResponseBodyDto getFormParameters() {
        return this.formParameters;
    }

    public final String getRuleName() {
        return this.ruleName;
    }

    public int hashCode() {
        String str = this.actionCode;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.ruleName;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        FraudMonCheckResultResponseBodyDto.FormParametersResponseBodyDto formParametersResponseBodyDto = this.formParameters;
        return hashCode2 + (formParametersResponseBodyDto != null ? formParametersResponseBodyDto.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.actionCode;
        String str2 = this.ruleName;
        FraudMonCheckResultResponseBodyDto.FormParametersResponseBodyDto formParametersResponseBodyDto = this.formParameters;
        StringBuilder d11 = C3660k.d("FraudMonCheckResultResponseBodyDto(actionCode=", str, ", ruleName=", str2, ", formParameters=");
        d11.append(formParametersResponseBodyDto);
        d11.append(")");
        return d11.toString();
    }

    @Override // spay.sdk.data.dto.response.DataDtoInterface
    @NotNull
    public FraudMonCheckResult toModel() {
        FraudMonCheckResult.FormParameters empty;
        String str = this.actionCode;
        if (str == null) {
            throw new C4452mn("actionCode");
        }
        String str2 = this.ruleName;
        FraudMonCheckResultResponseBodyDto.FormParametersResponseBodyDto formParametersResponseBodyDto = this.formParameters;
        if (formParametersResponseBodyDto == null || (empty = formParametersResponseBodyDto.toModel()) == null) {
            empty = FraudMonCheckResult.FormParameters.INSTANCE.empty();
        }
        return new FraudMonCheckResult(str, false, str2, empty);
    }

    public /* synthetic */ FraudMonCheckResultResponseBodyDto(String str, String str2, FraudMonCheckResultResponseBodyDto.FormParametersResponseBodyDto formParametersResponseBodyDto, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i11 & 4) != 0 ? null : formParametersResponseBodyDto);
    }
}
