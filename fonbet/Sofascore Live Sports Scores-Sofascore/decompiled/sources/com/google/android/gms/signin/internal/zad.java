package com.google.android.gms.signin.internal;

import android.os.Parcel;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public abstract class zad extends com.google.android.gms.internal.base.zab implements zae {
    public zad() {
        super("com.google.android.gms.signin.internal.ISignInCallbacks");
    }

    @Override // com.google.android.gms.internal.base.zab
    public final boolean S1(int i, Parcel parcel, Parcel parcel2) {
        switch (i) {
            case 3:
                com.google.android.gms.internal.base.zac.c(parcel);
                break;
            case 4:
                com.google.android.gms.internal.base.zac.c(parcel);
                break;
            case 5:
            default:
                return false;
            case 6:
                com.google.android.gms.internal.base.zac.c(parcel);
                break;
            case 7:
                com.google.android.gms.internal.base.zac.c(parcel);
                break;
            case 8:
                zak zakVar = (zak) com.google.android.gms.internal.base.zac.a(parcel, zak.CREATOR);
                com.google.android.gms.internal.base.zac.c(parcel);
                p0(zakVar);
                break;
            case 9:
                com.google.android.gms.internal.base.zac.c(parcel);
                break;
        }
        parcel2.writeNoException();
        return true;
    }
}
