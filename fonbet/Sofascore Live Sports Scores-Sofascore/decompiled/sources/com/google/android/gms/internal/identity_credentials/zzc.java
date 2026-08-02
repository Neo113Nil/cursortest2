package com.google.android.gms.internal.identity_credentials;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.identitycredentials.internal.IdentityCredentialBaseCallbacks;

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

    public static void b(Parcel parcel, IdentityCredentialBaseCallbacks identityCredentialBaseCallbacks) {
        parcel.writeStrongBinder(identityCredentialBaseCallbacks.asBinder());
    }
}
