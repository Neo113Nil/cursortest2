package com.google.android.gms.identitycredentials.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.identitycredentials.ClearRegistryRequest;
import com.google.android.gms.identitycredentials.GetCredentialRequest;
import com.google.android.gms.identitycredentials.RegistrationRequest;
import com.google.android.gms.internal.identity_credentials.zza;
import com.google.android.gms.internal.identity_credentials.zzb;
import com.google.android.gms.internal.identity_credentials.zzc;

/* compiled from: com.google.android.gms:play-services-identity-credentials@@16.0.0-alpha02 */
/* loaded from: classes7.dex */
public interface IIdentityCredentialService extends IInterface {

    /* compiled from: com.google.android.gms:play-services-identity-credentials@@16.0.0-alpha02 */
    public static abstract class Stub extends zzb implements IIdentityCredentialService {

        /* compiled from: com.google.android.gms:play-services-identity-credentials@@16.0.0-alpha02 */
        public static class Proxy extends zza implements IIdentityCredentialService {
            Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.identitycredentials.internal.IIdentityCredentialService");
            }

            @Override // com.google.android.gms.identitycredentials.internal.IIdentityCredentialService
            public void clearRegistry(IIdentityCredentialCallbacks iIdentityCredentialCallbacks, ClearRegistryRequest clearRegistryRequest) throws RemoteException {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                zzc.zzc(obtainAndWriteInterfaceToken, iIdentityCredentialCallbacks);
                zzc.zzb(obtainAndWriteInterfaceToken, clearRegistryRequest);
                transactAndReadExceptionReturnVoid(3, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.identitycredentials.internal.IIdentityCredentialService
            public void getCredential(IIdentityCredentialCallbacks iIdentityCredentialCallbacks, GetCredentialRequest getCredentialRequest) throws RemoteException {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                zzc.zzc(obtainAndWriteInterfaceToken, iIdentityCredentialCallbacks);
                zzc.zzb(obtainAndWriteInterfaceToken, getCredentialRequest);
                transactAndReadExceptionReturnVoid(1, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.identitycredentials.internal.IIdentityCredentialService
            public void registerCredentials(IIdentityCredentialCallbacks iIdentityCredentialCallbacks, RegistrationRequest registrationRequest) throws RemoteException {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                zzc.zzc(obtainAndWriteInterfaceToken, iIdentityCredentialCallbacks);
                zzc.zzb(obtainAndWriteInterfaceToken, registrationRequest);
                transactAndReadExceptionReturnVoid(2, obtainAndWriteInterfaceToken);
            }
        }

        public static IIdentityCredentialService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.identitycredentials.internal.IIdentityCredentialService");
            return queryLocalInterface instanceof IIdentityCredentialService ? (IIdentityCredentialService) queryLocalInterface : new Proxy(iBinder);
        }
    }

    void clearRegistry(IIdentityCredentialCallbacks iIdentityCredentialCallbacks, ClearRegistryRequest clearRegistryRequest) throws RemoteException;

    void getCredential(IIdentityCredentialCallbacks iIdentityCredentialCallbacks, GetCredentialRequest getCredentialRequest) throws RemoteException;

    void registerCredentials(IIdentityCredentialCallbacks iIdentityCredentialCallbacks, RegistrationRequest registrationRequest) throws RemoteException;
}
