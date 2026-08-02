package com.google.android.gms.identitycredentials.provider;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.identity_credentials.zza;
import com.google.android.gms.internal.identity_credentials.zzb;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public interface ICredentialProviderService extends IInterface {

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static abstract class Stub extends zzb implements ICredentialProviderService {

        /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
        public static class Proxy extends zza implements ICredentialProviderService {
        }

        public Stub() {
            super("com.google.android.gms.identitycredentials.provider.ICredentialProviderService");
        }

        @Override // com.google.android.gms.internal.identity_credentials.zzb
        public final boolean J(int i, Parcel parcel, Parcel parcel2) {
            if (i == 1) {
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.identitycredentials.provider.ICreateCredentialCallbacks");
                    if (queryLocalInterface instanceof ICreateCredentialCallbacks) {
                    }
                }
                zzb.S1(parcel);
                S3();
                return true;
            }
            if (i == 2) {
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.identitycredentials.provider.ISignalCredentialStateCallbacks");
                    if (queryLocalInterface2 instanceof ISignalCredentialStateCallbacks) {
                    }
                }
                zzb.S1(parcel);
                t2();
                return true;
            }
            if (i == 3) {
                IBinder readStrongBinder3 = parcel.readStrongBinder();
                if (readStrongBinder3 != null) {
                    IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.identitycredentials.provider.IImportCredentialsCallbacks");
                    if (queryLocalInterface3 instanceof IImportCredentialsCallbacks) {
                    }
                }
                zzb.S1(parcel);
                f2();
                return true;
            }
            if (i == 4) {
                IBinder readStrongBinder4 = parcel.readStrongBinder();
                if (readStrongBinder4 != null) {
                    IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.identitycredentials.provider.IExportCredentialsCallbacks");
                    if (queryLocalInterface4 instanceof IExportCredentialsCallbacks) {
                    }
                }
                zzb.S1(parcel);
                n1();
                return true;
            }
            if (i != 5) {
                return false;
            }
            IBinder readStrongBinder5 = parcel.readStrongBinder();
            if (readStrongBinder5 != null) {
                IInterface queryLocalInterface5 = readStrongBinder5.queryLocalInterface("com.google.android.gms.identitycredentials.provider.ICredentialTransferCapabilitiesCallbacks");
                if (queryLocalInterface5 instanceof ICredentialTransferCapabilitiesCallbacks) {
                }
            }
            zzb.S1(parcel);
            c1();
            return true;
        }
    }

    void S3();

    void c1();

    void f2();

    void n1();

    void t2();
}
