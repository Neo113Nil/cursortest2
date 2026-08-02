package androidx.credentials.playservices.controllers.CreatePassword;

import androidx.credentials.CredentialManagerCallback;
import androidx.credentials.exceptions.CreateCredentialException;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.Lambda;
import xsna.izs;
import xsna.s3q0;

/* compiled from: CredentialProviderCreatePasswordController.kt */
/* loaded from: classes12.dex */
public final class CredentialProviderCreatePasswordController$handleResponse$2 extends Lambda implements izs<CreateCredentialException, s3q0> {
    final /* synthetic */ CredentialProviderCreatePasswordController this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CredentialProviderCreatePasswordController$handleResponse$2(CredentialProviderCreatePasswordController credentialProviderCreatePasswordController) {
        super(1);
        this.this$0 = credentialProviderCreatePasswordController;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invoke$lambda$0(CredentialProviderCreatePasswordController credentialProviderCreatePasswordController, CreateCredentialException createCredentialException) {
        CredentialManagerCallback credentialManagerCallback;
        credentialManagerCallback = credentialProviderCreatePasswordController.callback;
        if (credentialManagerCallback == null) {
            credentialManagerCallback = null;
        }
        credentialManagerCallback.onError(createCredentialException);
    }

    @Override // xsna.izs
    public /* bridge */ /* synthetic */ s3q0 invoke(CreateCredentialException createCredentialException) {
        invoke2(createCredentialException);
        return s3q0.a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(final CreateCredentialException createCredentialException) {
        Executor executor;
        executor = this.this$0.executor;
        if (executor == null) {
            executor = null;
        }
        final CredentialProviderCreatePasswordController credentialProviderCreatePasswordController = this.this$0;
        executor.execute(new Runnable() { // from class: androidx.credentials.playservices.controllers.CreatePassword.a
            @Override // java.lang.Runnable
            public final void run() {
                CredentialProviderCreatePasswordController$handleResponse$2.invoke$lambda$0(CredentialProviderCreatePasswordController.this, createCredentialException);
            }
        });
    }
}
