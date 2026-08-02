package ru.ozon.app.android.session.editCredential.externalVerificationHandlerMobile.di;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.network.di.NetworkOzonIdComponentApi;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LOb0/a;", "invoke", "()LOb0/a;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes2.dex */
final class ExternalVerificationWidgetComponent$ozonIdApi$2 extends AbstractC7737t implements Function0<Ob0.a> {
    final /* synthetic */ ExternalVerificationWidgetComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ExternalVerificationWidgetComponent$ozonIdApi$2(ExternalVerificationWidgetComponent externalVerificationWidgetComponent) {
        super(0);
        this.this$0 = externalVerificationWidgetComponent;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final Ob0.a invoke() {
        NetworkOzonIdComponentApi networkOzonIdComponentApi;
        networkOzonIdComponentApi = this.this$0.ozonIdComponentApi;
        return networkOzonIdComponentApi.getOzonIdAppApi();
    }
}
