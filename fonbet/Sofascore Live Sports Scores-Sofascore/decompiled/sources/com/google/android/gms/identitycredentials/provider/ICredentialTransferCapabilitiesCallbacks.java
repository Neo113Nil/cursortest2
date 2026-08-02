package com.google.android.gms.identitycredentials.provider;

import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.identity_credentials.zza;
import com.google.android.gms.internal.identity_credentials.zzb;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public interface ICredentialTransferCapabilitiesCallbacks extends IInterface {

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static abstract class Stub extends zzb implements ICredentialTransferCapabilitiesCallbacks {

        /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
        public static class Proxy extends zza implements ICredentialTransferCapabilitiesCallbacks {
        }

        public Stub() {
            super("com.google.android.gms.identitycredentials.provider.ICredentialTransferCapabilitiesCallbacks");
        }

        @Override // com.google.android.gms.internal.identity_credentials.zzb
        public final boolean J(int i, Parcel parcel, Parcel parcel2) {
            if (i == 1) {
                zzb.S1(parcel);
                l0();
            } else {
                if (i != 2) {
                    return false;
                }
                parcel.readString();
                parcel.readString();
                zzb.S1(parcel);
                c();
            }
            parcel2.writeNoException();
            return true;
        }
    }

    void c();

    void l0();
}
