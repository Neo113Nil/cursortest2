package com.google.android.gms.internal.auth;

import android.os.Parcel;
import defpackage.a70;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public abstract class zzas extends zzb implements zzat {
    public zzas() {
        super("com.google.android.gms.auth.api.accounttransfer.internal.IAccountTransferCallbacks");
    }

    @Override // com.google.android.gms.internal.auth.zzb
    public final boolean J(int i, Parcel parcel, Parcel parcel2) {
        switch (i) {
            case 1:
                zzc.b(parcel);
                a70.i();
                break;
            case 2:
                zzc.b(parcel);
                a70.i();
                break;
            case 3:
                zzc.b(parcel);
                a70.i();
                break;
            case 4:
                a70.i();
                break;
            case 5:
                zzc.b(parcel);
                a70.i();
                break;
            case 6:
                parcel.createByteArray();
                zzc.b(parcel);
                a70.i();
                break;
            case 7:
                zzc.b(parcel);
                a70.i();
                break;
        }
        return false;
    }
}
