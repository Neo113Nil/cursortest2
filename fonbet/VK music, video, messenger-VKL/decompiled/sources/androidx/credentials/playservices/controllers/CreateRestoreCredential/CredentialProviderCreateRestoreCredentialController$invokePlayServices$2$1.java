package androidx.credentials.playservices.controllers.CreateRestoreCredential;

import androidx.credentials.CreateCredentialResponse;
import androidx.credentials.CredentialManagerCallback;
import androidx.credentials.exceptions.CreateCredentialException;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref$ObjectRef;
import xsna.gzs;
import xsna.s3q0;

/* compiled from: CredentialProviderCreateRestoreCredentialController.kt */
/* loaded from: classes12.dex */
public final class CredentialProviderCreateRestoreCredentialController$invokePlayServices$2$1 extends Lambda implements gzs<s3q0> {
    final /* synthetic */ CredentialManagerCallback<CreateCredentialResponse, CreateCredentialException> $callback;
    final /* synthetic */ Ref$ObjectRef<CreateCredentialException> $createException;
    final /* synthetic */ Executor $executor;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CredentialProviderCreateRestoreCredentialController$invokePlayServices$2$1(Executor executor, CredentialManagerCallback<CreateCredentialResponse, CreateCredentialException> credentialManagerCallback, Ref$ObjectRef<CreateCredentialException> ref$ObjectRef) {
        super(0);
        this.$executor = executor;
        this.$callback = credentialManagerCallback;
        this.$createException = ref$ObjectRef;
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
        final CredentialManagerCallback<CreateCredentialResponse, CreateCredentialException> credentialManagerCallback = this.$callback;
        final Ref$ObjectRef<CreateCredentialException> ref$ObjectRef = this.$createException;
        executor.execute(new Runnable() { // from class: androidx.credentials.playservices.controllers.CreateRestoreCredential.c
            @Override // java.lang.Runnable
            public final void run() {
                CredentialProviderCreateRestoreCredentialController$invokePlayServices$2$1.invoke$lambda$0(CredentialManagerCallback.this, ref$ObjectRef);
            }
        });
    }
}
