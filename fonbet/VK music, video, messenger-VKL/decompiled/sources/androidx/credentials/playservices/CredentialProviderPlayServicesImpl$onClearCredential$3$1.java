package androidx.credentials.playservices;

import androidx.credentials.CredentialManagerCallback;
import androidx.credentials.exceptions.ClearCredentialException;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref$ObjectRef;
import xsna.gzs;
import xsna.s3q0;

/* compiled from: CredentialProviderPlayServicesImpl.kt */
/* loaded from: classes12.dex */
public final class CredentialProviderPlayServicesImpl$onClearCredential$3$1 extends Lambda implements gzs<s3q0> {
    final /* synthetic */ CredentialManagerCallback<Void, ClearCredentialException> $callback;
    final /* synthetic */ Ref$ObjectRef<ClearCredentialException> $clearException;
    final /* synthetic */ Executor $executor;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CredentialProviderPlayServicesImpl$onClearCredential$3$1(Executor executor, CredentialManagerCallback<Void, ClearCredentialException> credentialManagerCallback, Ref$ObjectRef<ClearCredentialException> ref$ObjectRef) {
        super(0);
        this.$executor = executor;
        this.$callback = credentialManagerCallback;
        this.$clearException = ref$ObjectRef;
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
        final CredentialManagerCallback<Void, ClearCredentialException> credentialManagerCallback = this.$callback;
        final Ref$ObjectRef<ClearCredentialException> ref$ObjectRef = this.$clearException;
        executor.execute(new Runnable() { // from class: androidx.credentials.playservices.c
            @Override // java.lang.Runnable
            public final void run() {
                CredentialProviderPlayServicesImpl$onClearCredential$3$1.invoke$lambda$0(CredentialManagerCallback.this, ref$ObjectRef);
            }
        });
    }
}
