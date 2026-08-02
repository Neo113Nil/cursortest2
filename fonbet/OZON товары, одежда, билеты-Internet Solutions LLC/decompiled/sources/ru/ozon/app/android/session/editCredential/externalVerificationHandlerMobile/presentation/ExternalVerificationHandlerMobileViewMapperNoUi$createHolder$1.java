package ru.ozon.app.android.session.editCredential.externalVerificationHandlerMobile.presentation;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "Lru/ozon/app/android/session/editCredential/externalVerificationHandlerMobile/presentation/ExternalVerificationViewModel;", "kotlin.jvm.PlatformType", "invoke", "()Lru/ozon/app/android/session/editCredential/externalVerificationHandlerMobile/presentation/ExternalVerificationViewModel;"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class ExternalVerificationHandlerMobileViewMapperNoUi$createHolder$1 extends AbstractC7737t implements Function0<ExternalVerificationViewModel> {
    final /* synthetic */ ExternalVerificationHandlerMobileViewMapperNoUi this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ExternalVerificationHandlerMobileViewMapperNoUi$createHolder$1(ExternalVerificationHandlerMobileViewMapperNoUi externalVerificationHandlerMobileViewMapperNoUi) {
        super(0);
        this.this$0 = externalVerificationHandlerMobileViewMapperNoUi;
    }

    @Override // kotlin.jvm.functions.Function0
    public final ExternalVerificationViewModel invoke() {
        return this.this$0.component().getViewModelProvider().get();
    }
}
