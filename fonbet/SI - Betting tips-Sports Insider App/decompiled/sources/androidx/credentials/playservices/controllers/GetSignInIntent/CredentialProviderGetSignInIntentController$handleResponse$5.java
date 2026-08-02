package androidx.credentials.playservices.controllers.GetSignInIntent;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import u0.f;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class CredentialProviderGetSignInIntentController$handleResponse$5 extends Lambda implements Function0<Unit> {
    final /* synthetic */ f $e;
    final /* synthetic */ CredentialProviderGetSignInIntentController this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CredentialProviderGetSignInIntentController$handleResponse$5(CredentialProviderGetSignInIntentController credentialProviderGetSignInIntentController, f fVar) {
        super(0);
        this.this$0 = credentialProviderGetSignInIntentController;
        this.$e = fVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invoke$lambda$0(CredentialProviderGetSignInIntentController credentialProviderGetSignInIntentController, f fVar) {
        credentialProviderGetSignInIntentController.getCallback().a(fVar);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Object invoke() {
        m62invoke();
        return Unit.f19194a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m62invoke() {
        this.this$0.getExecutor().execute(new a(this.this$0, this.$e, 1));
    }
}
