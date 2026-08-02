package com.google.android.gms.identitycredentials.internal;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.internal.ConnectionCallbacks;
import com.google.android.gms.common.api.internal.OnConnectionFailedListener;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.identitycredentials.IdentityCredentialClient;
import kotlin.Metadata;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u001dB%\b\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\r2\u0006\u0010\f\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001d\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\r2\u0006\u0010\f\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u001d\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\r2\u0006\u0010\f\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, d2 = {"Lcom/google/android/gms/identitycredentials/internal/InternalIdentityCredentialClient;", "Lcom/google/android/gms/common/api/GoogleApi;", "Lcom/google/android/gms/common/api/Api$ApiOptions$NoOptions;", "Lcom/google/android/gms/identitycredentials/IdentityCredentialClient;", "Landroid/content/Context;", "context", "Lcom/google/android/gms/common/api/Api$AbstractClientBuilder;", "Lcom/google/android/gms/identitycredentials/internal/IdentityCredentialClientImpl;", "clientBuilder", "<init>", "(Landroid/content/Context;Lcom/google/android/gms/common/api/Api$AbstractClientBuilder;)V", "Lcom/google/android/gms/identitycredentials/ClearExportRequest;", "request", "Lcom/google/android/gms/tasks/Task;", "Lcom/google/android/gms/identitycredentials/ClearExportResponse;", "clearExport", "(Lcom/google/android/gms/identitycredentials/ClearExportRequest;)Lcom/google/android/gms/tasks/Task;", "Lcom/google/android/gms/identitycredentials/ExportCredentialsToDeviceSetupRequest;", "Lcom/google/android/gms/identitycredentials/ExportCredentialsToDeviceSetupResponse;", "exportCredentialsToDeviceSetup", "(Lcom/google/android/gms/identitycredentials/ExportCredentialsToDeviceSetupRequest;)Lcom/google/android/gms/tasks/Task;", "Lcom/google/android/gms/identitycredentials/ImportCredentialsForDeviceSetupRequest;", "Lcom/google/android/gms/identitycredentials/ImportCredentialsForDeviceSetupResponse;", "importCredentialsForDeviceSetup", "(Lcom/google/android/gms/identitycredentials/ImportCredentialsForDeviceSetupRequest;)Lcom/google/android/gms/tasks/Task;", "Lcom/google/android/gms/identitycredentials/GetCredentialTransferCapabilitiesRequest;", "Lcom/google/android/gms/identitycredentials/CredentialTransferCapabilities;", "getCredentialTransferCapabilities", "(Lcom/google/android/gms/identitycredentials/GetCredentialTransferCapabilitiesRequest;)Lcom/google/android/gms/tasks/Task;", "Companion", "java.com.google.android.gmscore.integ.client.identity_credentials_identity_credentials"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class InternalIdentityCredentialClient extends GoogleApi<Api.ApiOptions.NoOptions> implements IdentityCredentialClient {
    public static final Api l;

    static {
        new Companion(0);
        l = new Api("IdentityCredentials.API", new Api.AbstractClientBuilder<IdentityCredentialClientImpl, Api.ApiOptions.NoOptions>() { // from class: com.google.android.gms.identitycredentials.internal.InternalIdentityCredentialClient$Companion$CLIENT_BUILDER$1
            @Override // com.google.android.gms.common.api.Api.AbstractClientBuilder
            public final Api.Client c(Context context, Looper looper, ClientSettings clientSettings, Object obj, ConnectionCallbacks connectionCallbacks, OnConnectionFailedListener onConnectionFailedListener) {
                context.getClass();
                looper.getClass();
                clientSettings.getClass();
                ((Api.ApiOptions.NoOptions) obj).getClass();
                return new IdentityCredentialClientImpl(context, looper, 352, clientSettings, connectionCallbacks, onConnectionFailedListener);
            }
        }, new Api.ClientKey());
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000-\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\tR\u000e\u0010\n\u001a\u00020\u000bX\u0082T¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/google/android/gms/identitycredentials/internal/InternalIdentityCredentialClient$Companion;", "", "<init>", "()V", "CLIENT_KEY", "Lcom/google/android/gms/common/api/Api$ClientKey;", "Lcom/google/android/gms/identitycredentials/internal/IdentityCredentialClientImpl;", "CLIENT_BUILDER", "com/google/android/gms/identitycredentials/internal/InternalIdentityCredentialClient$Companion$CLIENT_BUILDER$1", "Lcom/google/android/gms/identitycredentials/internal/InternalIdentityCredentialClient$Companion$CLIENT_BUILDER$1;", "API_NAME", "", "API", "Lcom/google/android/gms/common/api/Api;", "Lcom/google/android/gms/common/api/Api$ApiOptions$NoOptions;", "java.com.google.android.gmscore.integ.client.identity_credentials_identity_credentials"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(int i) {
            this();
        }
    }
}
