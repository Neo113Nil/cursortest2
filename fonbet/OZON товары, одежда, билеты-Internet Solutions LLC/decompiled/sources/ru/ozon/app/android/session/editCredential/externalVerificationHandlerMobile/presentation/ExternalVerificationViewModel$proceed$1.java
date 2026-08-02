package ru.ozon.app.android.session.editCredential.externalVerificationHandlerMobile.presentation;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.action.v2.models.ActionV2Response;
import ru.ozon.app.android.domain.session.api.auth.models.Response;

@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "response", "Lru/ozon/app/android/action/v2/models/ActionV2Response;", "Lru/ozon/app/android/domain/session/api/auth/models/Response;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class ExternalVerificationViewModel$proceed$1 extends AbstractC7737t implements Function1<ActionV2Response<Response>, Unit> {
    final /* synthetic */ ExternalVerificationViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ExternalVerificationViewModel$proceed$1(ExternalVerificationViewModel externalVerificationViewModel) {
        super(1);
        this.this$0 = externalVerificationViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(ActionV2Response<Response> actionV2Response) {
        invoke2(actionV2Response);
        return Unit.f71690a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x000c, code lost:
    
        r3 = r2.this$0.toState(r3);
     */
    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void invoke2(ActionV2Response<Response> actionV2Response) {
        OtpResponseModel otpResponseModelError;
        ExternalVerificationViewModel externalVerificationViewModel = this.this$0;
        if (actionV2Response == null || (r3 = actionV2Response.getData()) == null || otpResponseModelError == null) {
            otpResponseModelError = this.this$0.getOtpResponseModelError();
        }
        externalVerificationViewModel.handleActionResult(otpResponseModelError);
    }
}
