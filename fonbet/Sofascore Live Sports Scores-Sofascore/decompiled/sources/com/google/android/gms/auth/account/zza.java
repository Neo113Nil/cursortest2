package com.google.android.gms.auth.account;

import android.os.Parcel;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public abstract class zza extends com.google.android.gms.internal.auth.zzb implements zzb {
    public zza() {
        super("com.google.android.gms.auth.account.IWorkAccountCallback");
    }

    @Override // com.google.android.gms.internal.auth.zzb
    public final boolean J(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            com.google.android.gms.internal.auth.zzc.b(parcel);
            zzb();
            return true;
        }
        if (i != 2) {
            return false;
        }
        int i2 = com.google.android.gms.internal.auth.zzc.a;
        parcel.readInt();
        com.google.android.gms.internal.auth.zzc.b(parcel);
        zzc();
        return true;
    }
}
