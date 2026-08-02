package com.google.android.gms.identitycredentials.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.TaskUtil;
import com.google.android.gms.identitycredentials.RegisterCreationOptionsResponse;
import kotlin.Metadata;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/google/android/gms/identitycredentials/internal/InternalIdentityCredentialClient$registerCreationOptions$1$callback$1", "Lcom/google/android/gms/identitycredentials/internal/IdentityCredentialBaseCallbacks;", "java.com.google.android.gmscore.integ.client.identity_credentials_identity_credentials"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class InternalIdentityCredentialClient$registerCreationOptions$1$callback$1 extends IdentityCredentialBaseCallbacks {
    @Override // com.google.android.gms.identitycredentials.internal.IdentityCredentialBaseCallbacks, com.google.android.gms.identitycredentials.internal.IIdentityCredentialCallbacks
    public final void S2(Status status, RegisterCreationOptionsResponse registerCreationOptionsResponse) {
        status.getClass();
        TaskUtil.a(status, registerCreationOptionsResponse, null);
    }
}
