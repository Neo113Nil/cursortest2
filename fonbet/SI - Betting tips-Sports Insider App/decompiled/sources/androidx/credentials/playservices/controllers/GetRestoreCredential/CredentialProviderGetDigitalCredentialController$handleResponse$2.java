package androidx.credentials.playservices.controllers.GetRestoreCredential;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import u0.f;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lu0/f;", "e", "", "invoke", "(Lu0/f;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class CredentialProviderGetDigitalCredentialController$handleResponse$2 extends Lambda implements Function1<f, Unit> {
    final /* synthetic */ CredentialProviderGetDigitalCredentialController this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CredentialProviderGetDigitalCredentialController$handleResponse$2(CredentialProviderGetDigitalCredentialController credentialProviderGetDigitalCredentialController) {
        super(1);
        this.this$0 = credentialProviderGetDigitalCredentialController;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invoke$lambda$0(CredentialProviderGetDigitalCredentialController credentialProviderGetDigitalCredentialController, f fVar) {
        credentialProviderGetDigitalCredentialController.getCallback().a(fVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((f) obj);
        return Unit.f19194a;
    }

    public final void invoke(f e7) {
        Intrinsics.checkNotNullParameter(e7, "e");
        this.this$0.getExecutor().execute(new b(this.this$0, e7, 0));
    }
}
