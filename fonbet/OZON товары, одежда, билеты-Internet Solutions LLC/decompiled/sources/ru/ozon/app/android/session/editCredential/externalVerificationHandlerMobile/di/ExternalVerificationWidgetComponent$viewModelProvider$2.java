package ru.ozon.app.android.session.editCredential.externalVerificationHandlerMobile.di;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.session.editCredential.externalVerificationHandlerMobile.presentation.ExternalVerificationViewModel;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0005\u001a\u0010\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LPc/a;", "Lru/ozon/app/android/session/editCredential/externalVerificationHandlerMobile/presentation/ExternalVerificationViewModel;", "kotlin.jvm.PlatformType", "invoke", "()LPc/a;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes2.dex */
final class ExternalVerificationWidgetComponent$viewModelProvider$2 extends AbstractC7737t implements Function0<Pc.a<ExternalVerificationViewModel>> {
    final /* synthetic */ ExternalVerificationWidgetComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ExternalVerificationWidgetComponent$viewModelProvider$2(ExternalVerificationWidgetComponent externalVerificationWidgetComponent) {
        super(0);
        this.this$0 = externalVerificationWidgetComponent;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ExternalVerificationViewModel invoke$lambda$0(ExternalVerificationWidgetComponent externalVerificationWidgetComponent) {
        return new ExternalVerificationViewModel(externalVerificationWidgetComponent.getPostMessageParser(), externalVerificationWidgetComponent.getActionV2Repository());
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final Pc.a<ExternalVerificationViewModel> invoke() {
        final ExternalVerificationWidgetComponent externalVerificationWidgetComponent = this.this$0;
        return new Pc.a() { // from class: ru.ozon.app.android.session.editCredential.externalVerificationHandlerMobile.di.a
            @Override // Pc.a
            public final Object get() {
                ExternalVerificationViewModel invoke$lambda$0;
                invoke$lambda$0 = ExternalVerificationWidgetComponent$viewModelProvider$2.invoke$lambda$0(ExternalVerificationWidgetComponent.this);
                return invoke$lambda$0;
            }
        };
    }
}
