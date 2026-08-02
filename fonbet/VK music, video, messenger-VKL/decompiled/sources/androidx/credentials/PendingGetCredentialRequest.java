package androidx.credentials;

import xsna.izs;
import xsna.s3q0;

/* compiled from: PendingGetCredentialRequest.kt */
/* loaded from: classes12.dex */
public final class PendingGetCredentialRequest {
    private final izs<GetCredentialResponse, s3q0> callback;
    private final GetCredentialRequest request;

    /* JADX WARN: Multi-variable type inference failed */
    public PendingGetCredentialRequest(GetCredentialRequest getCredentialRequest, izs<? super GetCredentialResponse, s3q0> izsVar) {
        this.request = getCredentialRequest;
        this.callback = izsVar;
    }

    public final izs<GetCredentialResponse, s3q0> getCallback() {
        return this.callback;
    }

    public final GetCredentialRequest getRequest() {
        return this.request;
    }
}
