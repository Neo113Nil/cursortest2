package androidx.credentials.playservices.controllers;

import androidx.credentials.CredentialManagerCallback;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.Lambda;
import xsna.gzs;
import xsna.s3q0;

/* compiled from: CredentialProviderController.kt */
/* loaded from: classes12.dex */
public final class CredentialProviderController$maybeReportErrorFromResultReceiver$1 extends Lambda implements gzs<s3q0> {
    final /* synthetic */ CredentialManagerCallback<R1, E1> $callback;
    final /* synthetic */ E1 $exception;
    final /* synthetic */ Executor $executor;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CredentialProviderController$maybeReportErrorFromResultReceiver$1(Executor executor, CredentialManagerCallback<R1, E1> credentialManagerCallback, E1 e1) {
        super(0);
        this.$executor = executor;
        this.$callback = credentialManagerCallback;
        this.$exception = e1;
    }

    @Override // xsna.gzs
    public /* bridge */ /* synthetic */ s3q0 invoke() {
        invoke2();
        return s3q0.a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        Executor executor = this.$executor;
        final CredentialManagerCallback<R1, E1> credentialManagerCallback = this.$callback;
        final E1 e1 = this.$exception;
        executor.execute(new Runnable() { // from class: androidx.credentials.playservices.controllers.a
            @Override // java.lang.Runnable
            public final void run() {
                CredentialManagerCallback.this.onError(e1);
            }
        });
    }
}
