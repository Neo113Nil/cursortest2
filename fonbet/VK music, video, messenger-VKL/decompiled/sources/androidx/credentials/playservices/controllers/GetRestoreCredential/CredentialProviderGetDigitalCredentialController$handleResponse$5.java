package androidx.credentials.playservices.controllers.GetRestoreCredential;

import androidx.credentials.CredentialManagerCallback;
import androidx.credentials.GetCredentialResponse;
import androidx.credentials.exceptions.GetCredentialException;
import androidx.credentials.exceptions.GetCredentialUnknownException;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.Lambda;
import xsna.gzs;
import xsna.s3q0;

/* compiled from: CredentialProviderGetDigitalCredentialController.kt */
/* loaded from: classes12.dex */
public final class CredentialProviderGetDigitalCredentialController$handleResponse$5 extends Lambda implements gzs<s3q0> {
    final /* synthetic */ GetCredentialException $providerException;
    final /* synthetic */ CredentialProviderGetDigitalCredentialController this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CredentialProviderGetDigitalCredentialController$handleResponse$5(CredentialProviderGetDigitalCredentialController credentialProviderGetDigitalCredentialController, GetCredentialException getCredentialException) {
        super(0);
        this.this$0 = credentialProviderGetDigitalCredentialController;
        this.$providerException = getCredentialException;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invoke$lambda$0(CredentialProviderGetDigitalCredentialController credentialProviderGetDigitalCredentialController, GetCredentialException getCredentialException) {
        CredentialManagerCallback<GetCredentialResponse, GetCredentialException> callback = credentialProviderGetDigitalCredentialController.getCallback();
        if (getCredentialException == null) {
            getCredentialException = new GetCredentialUnknownException("Unexpected configuration error");
        }
        callback.onError(getCredentialException);
    }

    @Override // xsna.gzs
    public /* bridge */ /* synthetic */ s3q0 invoke() {
        invoke2();
        return s3q0.a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        Executor executor = this.this$0.getExecutor();
        final CredentialProviderGetDigitalCredentialController credentialProviderGetDigitalCredentialController = this.this$0;
        final GetCredentialException getCredentialException = this.$providerException;
        executor.execute(new Runnable() { // from class: androidx.credentials.playservices.controllers.GetRestoreCredential.d
            @Override // java.lang.Runnable
            public final void run() {
                CredentialProviderGetDigitalCredentialController$handleResponse$5.invoke$lambda$0(CredentialProviderGetDigitalCredentialController.this, getCredentialException);
            }
        });
    }
}
