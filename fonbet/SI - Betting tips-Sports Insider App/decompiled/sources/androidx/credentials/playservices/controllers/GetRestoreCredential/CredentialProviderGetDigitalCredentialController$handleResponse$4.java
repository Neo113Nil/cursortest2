package androidx.credentials.playservices.controllers.GetRestoreCredential;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import t0.q;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class CredentialProviderGetDigitalCredentialController$handleResponse$4 extends Lambda implements Function0<Unit> {
    final /* synthetic */ q $response;
    final /* synthetic */ CredentialProviderGetDigitalCredentialController this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CredentialProviderGetDigitalCredentialController$handleResponse$4(CredentialProviderGetDigitalCredentialController credentialProviderGetDigitalCredentialController, q qVar) {
        super(0);
        this.this$0 = credentialProviderGetDigitalCredentialController;
        this.$response = qVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invoke$lambda$0(CredentialProviderGetDigitalCredentialController credentialProviderGetDigitalCredentialController, q qVar) {
        credentialProviderGetDigitalCredentialController.getCallback().onResult(qVar);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Object invoke() {
        m51invoke();
        return Unit.f19194a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m51invoke() {
        this.this$0.getExecutor().execute(new d(0, this.this$0, this.$response));
    }
}
