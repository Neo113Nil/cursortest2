package androidx.credentials.playservices.controllers.GetRestoreCredential;

import androidx.credentials.CredentialManagerCallback;
import androidx.credentials.GetCredentialResponse;
import androidx.credentials.exceptions.GetCredentialException;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref$ObjectRef;
import xsna.gzs;
import xsna.s3q0;

/* compiled from: CredentialProviderGetRestoreCredentialController.kt */
/* loaded from: classes12.dex */
public final class CredentialProviderGetRestoreCredentialController$invokePlayServices$2$1 extends Lambda implements gzs<s3q0> {
    final /* synthetic */ CredentialManagerCallback<GetCredentialResponse, GetCredentialException> $callback;
    final /* synthetic */ Executor $executor;
    final /* synthetic */ Ref$ObjectRef<GetCredentialException> $getException;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CredentialProviderGetRestoreCredentialController$invokePlayServices$2$1(Executor executor, CredentialManagerCallback<GetCredentialResponse, GetCredentialException> credentialManagerCallback, Ref$ObjectRef<GetCredentialException> ref$ObjectRef) {
        super(0);
        this.$executor = executor;
        this.$callback = credentialManagerCallback;
        this.$getException = ref$ObjectRef;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invoke$lambda$0(CredentialManagerCallback credentialManagerCallback, Ref$ObjectRef ref$ObjectRef) {
        credentialManagerCallback.onError(ref$ObjectRef.element);
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
        final Ref$ObjectRef<GetCredentialException> ref$ObjectRef = this.$getException;
        executor.execute(new Runnable() { // from class: androidx.credentials.playservices.controllers.GetRestoreCredential.h
            @Override // java.lang.Runnable
            public final void run() {
                CredentialProviderGetRestoreCredentialController$invokePlayServices$2$1.invoke$lambda$0(CredentialManagerCallback.this, ref$ObjectRef);
            }
        });
    }
}
