package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import defpackage.ceo;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public abstract class zzgl extends com.google.android.gms.internal.wearable.zzb implements zzgm {
    public zzgl() {
        super("com.google.android.gms.wearable.internal.IWearableCallbacks");
    }

    @Override // com.google.android.gms.internal.wearable.zzb
    public final boolean J(int i, Parcel parcel, Parcel parcel2) {
        switch (i) {
            case 2:
                throw ceo.f(parcel);
            case 3:
                zzil zzilVar = (zzil) com.google.android.gms.internal.wearable.zzc.a(parcel, zzil.CREATOR);
                com.google.android.gms.internal.wearable.zzc.c(parcel);
                N1(zzilVar);
                break;
            case 4:
                throw ceo.f(parcel);
            case 5:
                throw ceo.f(parcel);
            case 6:
                throw ceo.f(parcel);
            case 7:
                throw ceo.f(parcel);
            case 8:
                throw ceo.f(parcel);
            case 9:
                throw ceo.f(parcel);
            case 10:
                throw ceo.f(parcel);
            case 11:
                Status status = (Status) com.google.android.gms.internal.wearable.zzc.a(parcel, Status.CREATOR);
                com.google.android.gms.internal.wearable.zzc.c(parcel);
                f3(status);
                break;
            case 12:
                throw ceo.f(parcel);
            case 13:
                throw ceo.f(parcel);
            case 14:
                throw ceo.f(parcel);
            case 15:
                throw ceo.f(parcel);
            case 16:
                throw ceo.f(parcel);
            case 17:
                throw ceo.f(parcel);
            case 18:
                throw ceo.f(parcel);
            case 19:
                throw ceo.f(parcel);
            case 20:
                throw ceo.f(parcel);
            case 21:
            case 24:
            case 25:
            case 31:
            case 32:
            case 33:
            case 44:
            case 45:
            default:
                return false;
            case 22:
                throw ceo.f(parcel);
            case 23:
                throw ceo.f(parcel);
            case 26:
                throw ceo.f(parcel);
            case 27:
                throw ceo.f(parcel);
            case 28:
                throw ceo.f(parcel);
            case 29:
                throw ceo.f(parcel);
            case 30:
                throw ceo.f(parcel);
            case 34:
                throw ceo.f(parcel);
            case 35:
                throw ceo.f(parcel);
            case 36:
                throw ceo.f(parcel);
            case 37:
                throw ceo.f(parcel);
            case 38:
                throw ceo.f(parcel);
            case 39:
                throw ceo.f(parcel);
            case 40:
                throw ceo.f(parcel);
            case 41:
                throw ceo.f(parcel);
            case 42:
                throw ceo.f(parcel);
            case 43:
                throw ceo.f(parcel);
            case 46:
                throw ceo.f(parcel);
            case 47:
                throw ceo.f(parcel);
            case 48:
                throw ceo.f(parcel);
            case 49:
                throw ceo.f(parcel);
            case 50:
                throw ceo.f(parcel);
            case 51:
                throw ceo.f(parcel);
            case 52:
                throw ceo.f(parcel);
        }
        parcel2.writeNoException();
        return true;
    }
}
