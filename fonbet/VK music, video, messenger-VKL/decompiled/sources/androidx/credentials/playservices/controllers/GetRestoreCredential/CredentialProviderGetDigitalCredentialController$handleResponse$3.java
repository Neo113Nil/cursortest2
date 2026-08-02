package androidx.credentials.playservices.controllers.GetRestoreCredential;

import androidx.credentials.exceptions.GetCredentialUnknownException;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.Lambda;
import xsna.gzs;
import xsna.s3q0;

/* compiled from: CredentialProviderGetDigitalCredentialController.kt */
/* loaded from: classes12.dex */
public final class CredentialProviderGetDigitalCredentialController$handleResponse$3 extends Lambda implements gzs<s3q0> {
    final /* synthetic */ CredentialProviderGetDigitalCredentialController this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CredentialProviderGetDigitalCredentialController$handleResponse$3(CredentialProviderGetDigitalCredentialController credentialProviderGetDigitalCredentialController) {
        super(0);
        this.this$0 = credentialProviderGetDigitalCredentialController;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invoke$lambda$0(CredentialProviderGetDigitalCredentialController credentialProviderGetDigitalCredentialController) {
        credentialProviderGetDigitalCredentialController.getCallback().onError(new GetCredentialUnknownException("No provider data returned."));
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
        executor.execute(new Runnable() { // from class: androidx.credentials.playservices.controllers.GetRestoreCredential.b
            @Override // java.lang.Runnable
            public final void run() {
                CredentialProviderGetDigitalCredentialController$handleResponse$3.invoke$lambda$0(CredentialProviderGetDigitalCredentialController.this);
            }
        });
    }
}
