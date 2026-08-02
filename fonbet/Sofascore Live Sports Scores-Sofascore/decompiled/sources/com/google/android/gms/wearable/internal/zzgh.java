package com.google.android.gms.wearable.internal;

import android.os.Parcel;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public abstract class zzgh extends com.google.android.gms.internal.wearable.zzb implements zzgi {
    public zzgh() {
        super("com.google.android.gms.wearable.internal.IChannelStreamCallbacks");
    }

    @Override // com.google.android.gms.internal.wearable.zzb
    public final boolean J(int i, Parcel parcel, Parcel parcel2) {
        if (i != 2) {
            return false;
        }
        parcel.readInt();
        parcel.readInt();
        com.google.android.gms.internal.wearable.zzc.c(parcel);
        synchronized (((zzcm) this).a) {
        }
        parcel2.writeNoException();
        return true;
    }
}
