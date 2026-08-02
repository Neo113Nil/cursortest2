package spay.sdk.data.dto.response.otp;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import spay.sdk.domain.model.response.otp.CreateOtpSdkResponseBody;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000¨\u0006\u0003"}, d2 = {"toDto", "Lspay/sdk/data/dto/response/otp/CreateOtpSdkResponseBodyDto;", "Lspay/sdk/domain/model/response/otp/CreateOtpSdkResponseBody;", "SPaySDK_baseRelease"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class CreateOtpSdkResponseBodyDtoKt {
    @NotNull
    public static final CreateOtpSdkResponseBodyDto toDto(@NotNull CreateOtpSdkResponseBody createOtpSdkResponseBody) {
        Intrinsics.checkNotNullParameter(createOtpSdkResponseBody, "<this>");
        return new CreateOtpSdkResponseBodyDto(String.valueOf(createOtpSdkResponseBody.getErrorCode()), createOtpSdkResponseBody.getErrorMessage(), createOtpSdkResponseBody.getMobilePhone());
    }
}
