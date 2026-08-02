package androidx.credentials.playservices.controllers.GetRestoreCredential;

import androidx.credentials.exceptions.GetCredentialException;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.Lambda;
import xsna.izs;
import xsna.s3q0;

/* compiled from: CredentialProviderGetDigitalCredentialController.kt */
/* loaded from: classes12.dex */
public final class CredentialProviderGetDigitalCredentialController$handleResponse$2 extends Lambda implements izs<GetCredentialException, s3q0> {
    final /* synthetic */ CredentialProviderGetDigitalCredentialController this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CredentialProviderGetDigitalCredentialController$handleResponse$2(CredentialProviderGetDigitalCredentialController credentialProviderGetDigitalCredentialController) {
        super(1);
        this.this$0 = credentialProviderGetDigitalCredentialController;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invoke$lambda$0(CredentialProviderGetDigitalCredentialController credentialProviderGetDigitalCredentialController, GetCredentialException getCredentialException) {
        credentialProviderGetDigitalCredentialController.getCallback().onError(getCredentialException);
    }

    @Override // xsna.izs
    public /* bridge */ /* synthetic */ s3q0 invoke(GetCredentialException getCredentialException) {
        invoke2(getCredentialException);
        return s3q0.a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(final GetCredentialException getCredentialException) {
        Executor executor = this.this$0.getExecutor();
        final CredentialProviderGetDigitalCredentialController credentialProviderGetDigitalCredentialController = this.this$0;
        executor.execute(new Runnable() { // from class: androidx.credentials.playservices.controllers.GetRestoreCredential.a
            @Override // java.lang.Runnable
            public final void run() {
                CredentialProviderGetDigitalCredentialController$handleResponse$2.invoke$lambda$0(CredentialProviderGetDigitalCredentialController.this, getCredentialException);
            }
        });
    }
}
