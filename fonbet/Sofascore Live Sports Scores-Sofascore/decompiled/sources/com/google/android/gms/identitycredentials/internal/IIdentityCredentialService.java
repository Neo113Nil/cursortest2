package com.google.android.gms.identitycredentials.internal;

import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.identitycredentials.ClearCredentialStateRequest;
import com.google.android.gms.identitycredentials.GetCredentialRequest;
import com.google.android.gms.internal.identity_credentials.zza;
import com.google.android.gms.internal.identity_credentials.zzb;
import com.google.android.gms.internal.identity_credentials.zzc;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public interface IIdentityCredentialService extends IInterface {

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static abstract class Stub extends zzb implements IIdentityCredentialService {
        public static final /* synthetic */ int a = 0;

        /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
        public static class Proxy extends zza implements IIdentityCredentialService {
            @Override // com.google.android.gms.identitycredentials.internal.IIdentityCredentialService
            public final void Q3(InternalIdentityCredentialClient$getCredential$1$callback$1 internalIdentityCredentialClient$getCredential$1$callback$1, GetCredentialRequest getCredentialRequest, ApiMetadata apiMetadata) {
                Parcel obtain = Parcel.obtain();
                obtain.writeInterfaceToken(this.b);
                zzc.b(obtain, internalIdentityCredentialClient$getCredential$1$callback$1);
                obtain.writeInt(1);
                getCredentialRequest.writeToParcel(obtain, 0);
                obtain.writeInt(1);
                apiMetadata.writeToParcel(obtain, 0);
                J(obtain, 1);
            }

            @Override // com.google.android.gms.identitycredentials.internal.IIdentityCredentialService
            public final void n3(InternalIdentityCredentialClient$clearCredentialState$1$callback$1 internalIdentityCredentialClient$clearCredentialState$1$callback$1, ClearCredentialStateRequest clearCredentialStateRequest, ApiMetadata apiMetadata) {
                Parcel obtain = Parcel.obtain();
                obtain.writeInterfaceToken(this.b);
                zzc.b(obtain, internalIdentityCredentialClient$clearCredentialState$1$callback$1);
                obtain.writeInt(1);
                clearCredentialStateRequest.writeToParcel(obtain, 0);
                obtain.writeInt(1);
                apiMetadata.writeToParcel(obtain, 0);
                J(obtain, 9);
            }
        }

        @Override // com.google.android.gms.internal.identity_credentials.zzb
        public final boolean J(int i, Parcel parcel, Parcel parcel2) {
            throw null;
        }
    }

    void Q3(InternalIdentityCredentialClient$getCredential$1$callback$1 internalIdentityCredentialClient$getCredential$1$callback$1, GetCredentialRequest getCredentialRequest, ApiMetadata apiMetadata);

    void n3(InternalIdentityCredentialClient$clearCredentialState$1$callback$1 internalIdentityCredentialClient$clearCredentialState$1$callback$1, ClearCredentialStateRequest clearCredentialStateRequest, ApiMetadata apiMetadata);
}
