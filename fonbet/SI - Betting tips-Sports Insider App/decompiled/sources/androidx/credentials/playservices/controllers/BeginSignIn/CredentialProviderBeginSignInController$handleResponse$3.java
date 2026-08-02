package androidx.credentials.playservices.controllers.BeginSignIn;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import t0.q;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class CredentialProviderBeginSignInController$handleResponse$3 extends Lambda implements Function0<Unit> {
    final /* synthetic */ q $response;
    final /* synthetic */ CredentialProviderBeginSignInController this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CredentialProviderBeginSignInController$handleResponse$3(CredentialProviderBeginSignInController credentialProviderBeginSignInController, q qVar) {
        super(0);
        this.this$0 = credentialProviderBeginSignInController;
        this.$response = qVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invoke$lambda$0(CredentialProviderBeginSignInController credentialProviderBeginSignInController, q qVar) {
        credentialProviderBeginSignInController.getCallback().onResult(qVar);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Object invoke() {
        m21invoke();
        return Unit.f19194a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m21invoke() {
        this.this$0.getExecutor().execute(new b(this.this$0, this.$response, 0));
    }
}
