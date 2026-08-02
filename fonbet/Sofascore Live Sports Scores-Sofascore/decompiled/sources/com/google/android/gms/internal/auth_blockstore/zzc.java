package com.google.android.gms.internal.auth_blockstore;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.blockstore.restorecredential.ClearRestoreCredentialRequest;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzc {
    public static final /* synthetic */ int a = 0;

    static {
        zzc.class.getClassLoader();
    }

    private zzc() {
    }

    public static Parcelable a(Parcel parcel, Parcelable.Creator creator) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return (Parcelable) creator.createFromParcel(parcel);
    }

    public static void b(Parcel parcel, ClearRestoreCredentialRequest clearRestoreCredentialRequest) {
        if (clearRestoreCredentialRequest == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            clearRestoreCredentialRequest.writeToParcel(parcel, 0);
        }
    }

    public static void c(Parcel parcel, zzb zzbVar) {
        parcel.writeStrongBinder(zzbVar.asBinder());
    }
}
