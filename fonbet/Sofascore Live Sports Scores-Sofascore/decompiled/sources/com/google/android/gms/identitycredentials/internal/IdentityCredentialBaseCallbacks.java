package com.google.android.gms.identitycredentials.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.identitycredentials.ClearCreationOptionsResponse;
import com.google.android.gms.identitycredentials.ClearCredentialStateResponse;
import com.google.android.gms.identitycredentials.ClearRegistryResponse;
import com.google.android.gms.identitycredentials.CreateCredentialHandle;
import com.google.android.gms.identitycredentials.PendingGetCredentialHandle;
import com.google.android.gms.identitycredentials.PendingImportCredentialsHandle;
import com.google.android.gms.identitycredentials.RegisterCreationOptionsResponse;
import com.google.android.gms.identitycredentials.RegisterExportResponse;
import com.google.android.gms.identitycredentials.RegistrationResponse;
import com.google.android.gms.identitycredentials.SignalCredentialStateResponse;
import com.google.android.gms.identitycredentials.internal.IIdentityCredentialCallbacks;
import kotlin.Metadata;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b \u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/google/android/gms/identitycredentials/internal/IdentityCredentialBaseCallbacks;", "Lcom/google/android/gms/identitycredentials/internal/IIdentityCredentialCallbacks$Stub;", "<init>", "()V", "java.com.google.android.gmscore.integ.client.identity_credentials_identity_credentials"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class IdentityCredentialBaseCallbacks extends IIdentityCredentialCallbacks.Stub {
    @Override // com.google.android.gms.identitycredentials.internal.IIdentityCredentialCallbacks
    public void D3(Status status, PendingGetCredentialHandle pendingGetCredentialHandle) {
        status.getClass();
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.identitycredentials.internal.IIdentityCredentialCallbacks
    public void L2(Status status, SignalCredentialStateResponse signalCredentialStateResponse) {
        status.getClass();
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.identitycredentials.internal.IIdentityCredentialCallbacks
    public void S2(Status status, RegisterCreationOptionsResponse registerCreationOptionsResponse) {
        status.getClass();
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.identitycredentials.internal.IIdentityCredentialCallbacks
    public void X2(Status status, ClearRegistryResponse clearRegistryResponse) {
        status.getClass();
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.identitycredentials.internal.IIdentityCredentialCallbacks
    public void e1(Status status, ClearCreationOptionsResponse clearCreationOptionsResponse) {
        status.getClass();
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.identitycredentials.internal.IIdentityCredentialCallbacks
    public void f4(Status status, RegistrationResponse registrationResponse) {
        status.getClass();
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.identitycredentials.internal.IIdentityCredentialCallbacks
    public void m0(Status status, PendingImportCredentialsHandle pendingImportCredentialsHandle) {
        status.getClass();
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.identitycredentials.internal.IIdentityCredentialCallbacks
    public void q4(Status status, ClearCredentialStateResponse clearCredentialStateResponse) {
        status.getClass();
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.identitycredentials.internal.IIdentityCredentialCallbacks
    public void u2(Status status, CreateCredentialHandle createCredentialHandle) {
        status.getClass();
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.identitycredentials.internal.IIdentityCredentialCallbacks
    public void u4(Status status, RegisterExportResponse registerExportResponse) {
        status.getClass();
        throw new UnsupportedOperationException();
    }
}
