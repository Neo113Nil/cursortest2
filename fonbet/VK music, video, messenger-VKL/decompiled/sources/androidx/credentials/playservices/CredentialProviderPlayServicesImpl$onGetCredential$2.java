package androidx.credentials.playservices;

import androidx.credentials.CredentialManagerCallback;
import androidx.credentials.GetCredentialResponse;
import androidx.credentials.exceptions.GetCredentialException;
import androidx.credentials.exceptions.GetCredentialProviderConfigurationException;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.Lambda;
import xsna.gzs;
import xsna.s3q0;

/* compiled from: CredentialProviderPlayServicesImpl.kt */
/* loaded from: classes12.dex */
public final class CredentialProviderPlayServicesImpl$onGetCredential$2 extends Lambda implements gzs<s3q0> {
    final /* synthetic */ CredentialManagerCallback<GetCredentialResponse, GetCredentialException> $callback;
    final /* synthetic */ Executor $executor;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CredentialProviderPlayServicesImpl$onGetCredential$2(Executor executor, CredentialManagerCallback<GetCredentialResponse, GetCredentialException> credentialManagerCallback) {
        super(0);
        this.$executor = executor;
        this.$callback = credentialManagerCallback;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invoke$lambda$0(CredentialManagerCallback credentialManagerCallback) {
        credentialManagerCallback.onError(new GetCredentialProviderConfigurationException("this feature requires the minimum API level to be 23"));
    }

    @Override // xsna.gzs
    public /* bridge */ /* synthetic */ s3q0 invoke() {
        invoke2();
        return s3q0.a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        Executor executor = this.$executor;
        final CredentialManagerCallback<GetCredentialResponse, GetCredentialException> credentialManagerCallback = this.$callback;
        executor.execute(new Runnable() { // from class: androidx.credentials.playservices.h
            @Override // java.lang.Runnable
            public final void run() {
                CredentialProviderPlayServicesImpl$onGetCredential$2.invoke$lambda$0(CredentialManagerCallback.this);
            }
        });
    }
}
