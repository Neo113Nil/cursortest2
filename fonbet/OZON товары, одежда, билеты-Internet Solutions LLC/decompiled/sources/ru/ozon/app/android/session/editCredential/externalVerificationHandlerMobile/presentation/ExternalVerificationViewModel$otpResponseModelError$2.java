package ru.ozon.app.android.session.editCredential.externalVerificationHandlerMobile.presentation;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.session.editCredential.externalVerificationHandlerMobile.presentation.OtpResponseModel;
import ru.ozon.app.android.uikit.R$string;
import ru.ozon.app.android.uikit.text.StringProvider;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/app/android/session/editCredential/externalVerificationHandlerMobile/presentation/OtpResponseModel$Error;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class ExternalVerificationViewModel$otpResponseModelError$2 extends AbstractC7737t implements Function0<OtpResponseModel.Error> {
    public static final ExternalVerificationViewModel$otpResponseModelError$2 INSTANCE = new ExternalVerificationViewModel$otpResponseModelError$2();

    ExternalVerificationViewModel$otpResponseModelError$2() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final OtpResponseModel.Error invoke() {
        return new OtpResponseModel.Error(StringProvider.getString(R$string.error_common_message_service_error));
    }
}
