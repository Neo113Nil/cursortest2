package ru.ozon.app.android.session.editCredential.externalVerificationHandlerMobile.di;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.action.di.ActionComponentApi;
import ru.ozon.app.android.action.v2.ActionV2Repository;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/app/android/action/v2/ActionV2Repository;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class ExternalVerificationWidgetComponent$actionV2Repository$2 extends AbstractC7737t implements Function0<ActionV2Repository> {
    final /* synthetic */ ExternalVerificationWidgetComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ExternalVerificationWidgetComponent$actionV2Repository$2(ExternalVerificationWidgetComponent externalVerificationWidgetComponent) {
        super(0);
        this.this$0 = externalVerificationWidgetComponent;
    }

    @Override // kotlin.jvm.functions.Function0
    public final ActionV2Repository invoke() {
        ActionComponentApi actionComponentApi;
        actionComponentApi = this.this$0.actionComponent;
        return actionComponentApi.getActionRepository();
    }
}
