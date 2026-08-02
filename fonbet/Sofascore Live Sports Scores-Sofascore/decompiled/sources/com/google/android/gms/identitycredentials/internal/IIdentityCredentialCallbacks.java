package com.google.android.gms.identitycredentials.internal;

import android.os.IInterface;
import android.os.Parcel;
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
import com.google.android.gms.internal.identity_credentials.zzb;
import com.google.android.gms.internal.identity_credentials.zzc;
import defpackage.a70;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public interface IIdentityCredentialCallbacks extends IInterface {

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static abstract class Stub extends zzb implements IIdentityCredentialCallbacks {
        public Stub() {
            super("com.google.android.gms.identitycredentials.internal.IIdentityCredentialCallbacks");
        }

        @Override // com.google.android.gms.internal.identity_credentials.zzb
        public final boolean J(int i, Parcel parcel, Parcel parcel2) {
            switch (i) {
                case 1:
                    Status status = (Status) zzc.a(parcel, Status.CREATOR);
                    PendingGetCredentialHandle pendingGetCredentialHandle = (PendingGetCredentialHandle) zzc.a(parcel, PendingGetCredentialHandle.CREATOR);
                    zzb.S1(parcel);
                    D3(status, pendingGetCredentialHandle);
                    return true;
                case 2:
                    Status status2 = (Status) zzc.a(parcel, Status.CREATOR);
                    RegistrationResponse registrationResponse = (RegistrationResponse) zzc.a(parcel, RegistrationResponse.CREATOR);
                    zzb.S1(parcel);
                    f4(status2, registrationResponse);
                    return true;
                case 3:
                    Status status3 = (Status) zzc.a(parcel, Status.CREATOR);
                    ClearRegistryResponse clearRegistryResponse = (ClearRegistryResponse) zzc.a(parcel, ClearRegistryResponse.CREATOR);
                    zzb.S1(parcel);
                    X2(status3, clearRegistryResponse);
                    return true;
                case 4:
                    Status status4 = (Status) zzc.a(parcel, Status.CREATOR);
                    PendingImportCredentialsHandle pendingImportCredentialsHandle = (PendingImportCredentialsHandle) zzc.a(parcel, PendingImportCredentialsHandle.CREATOR);
                    zzb.S1(parcel);
                    m0(status4, pendingImportCredentialsHandle);
                    return true;
                case 5:
                    Status status5 = (Status) zzc.a(parcel, Status.CREATOR);
                    RegisterExportResponse registerExportResponse = (RegisterExportResponse) zzc.a(parcel, RegisterExportResponse.CREATOR);
                    zzb.S1(parcel);
                    u4(status5, registerExportResponse);
                    return true;
                case 6:
                    Status status6 = (Status) zzc.a(parcel, Status.CREATOR);
                    zzb.S1(parcel);
                    status6.getClass();
                    a70.i();
                    return false;
                case 7:
                    Status status7 = (Status) zzc.a(parcel, Status.CREATOR);
                    CreateCredentialHandle createCredentialHandle = (CreateCredentialHandle) zzc.a(parcel, CreateCredentialHandle.CREATOR);
                    zzb.S1(parcel);
                    u2(status7, createCredentialHandle);
                    return true;
                case 8:
                    Status status8 = (Status) zzc.a(parcel, Status.CREATOR);
                    RegisterCreationOptionsResponse registerCreationOptionsResponse = (RegisterCreationOptionsResponse) zzc.a(parcel, RegisterCreationOptionsResponse.CREATOR);
                    zzb.S1(parcel);
                    S2(status8, registerCreationOptionsResponse);
                    return true;
                case 9:
                    Status status9 = (Status) zzc.a(parcel, Status.CREATOR);
                    ClearCredentialStateResponse clearCredentialStateResponse = (ClearCredentialStateResponse) zzc.a(parcel, ClearCredentialStateResponse.CREATOR);
                    zzb.S1(parcel);
                    q4(status9, clearCredentialStateResponse);
                    return true;
                case 10:
                    Status status10 = (Status) zzc.a(parcel, Status.CREATOR);
                    SignalCredentialStateResponse signalCredentialStateResponse = (SignalCredentialStateResponse) zzc.a(parcel, SignalCredentialStateResponse.CREATOR);
                    zzb.S1(parcel);
                    L2(status10, signalCredentialStateResponse);
                    return true;
                case 11:
                    Status status11 = (Status) zzc.a(parcel, Status.CREATOR);
                    zzb.S1(parcel);
                    status11.getClass();
                    a70.i();
                    return false;
                case 12:
                    Status status12 = (Status) zzc.a(parcel, Status.CREATOR);
                    zzb.S1(parcel);
                    status12.getClass();
                    a70.i();
                    return false;
                case 13:
                    Status status13 = (Status) zzc.a(parcel, Status.CREATOR);
                    zzb.S1(parcel);
                    status13.getClass();
                    a70.i();
                    return false;
                case 14:
                    Status status14 = (Status) zzc.a(parcel, Status.CREATOR);
                    zzb.S1(parcel);
                    status14.getClass();
                    a70.i();
                    return false;
                case 15:
                    Status status15 = (Status) zzc.a(parcel, Status.CREATOR);
                    ClearCreationOptionsResponse clearCreationOptionsResponse = (ClearCreationOptionsResponse) zzc.a(parcel, ClearCreationOptionsResponse.CREATOR);
                    zzb.S1(parcel);
                    e1(status15, clearCreationOptionsResponse);
                    return true;
                default:
                    return false;
            }
        }
    }

    void D3(Status status, PendingGetCredentialHandle pendingGetCredentialHandle);

    void L2(Status status, SignalCredentialStateResponse signalCredentialStateResponse);

    void S2(Status status, RegisterCreationOptionsResponse registerCreationOptionsResponse);

    void X2(Status status, ClearRegistryResponse clearRegistryResponse);

    void e1(Status status, ClearCreationOptionsResponse clearCreationOptionsResponse);

    void f4(Status status, RegistrationResponse registrationResponse);

    void m0(Status status, PendingImportCredentialsHandle pendingImportCredentialsHandle);

    void q4(Status status, ClearCredentialStateResponse clearCredentialStateResponse);

    void u2(Status status, CreateCredentialHandle createCredentialHandle);

    void u4(Status status, RegisterExportResponse registerExportResponse);
}
