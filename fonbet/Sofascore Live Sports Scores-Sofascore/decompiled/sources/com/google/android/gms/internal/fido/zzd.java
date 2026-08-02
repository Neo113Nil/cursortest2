package com.google.android.gms.internal.fido;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public abstract class zzd extends zzb implements zze {
    public zzd() {
        super("com.google.android.gms.fido.fido2.api.IBooleanCallback");
    }

    @Override // com.google.android.gms.internal.fido.zzb
    public final boolean J(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            ClassLoader classLoader = zzc.a;
            boolean z = parcel.readInt() != 0;
            zzc.b(parcel);
            zzb(z);
        } else {
            if (i != 2) {
                return false;
            }
            Status status = (Status) zzc.a(parcel, Status.CREATOR);
            zzc.b(parcel);
            X1(status);
        }
        parcel2.writeNoException();
        return true;
    }
}
