package com.google.android.gms.internal.cast;

import android.os.Parcel;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public abstract class zzex extends zzb implements zzey {
    public zzex() {
        super("com.google.android.gms.cast.remote_display.ICastRemoteDisplayCallbacks");
    }

    @Override // com.google.android.gms.internal.cast.zzb
    public final boolean J(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            parcel.readInt();
            parcel.readInt();
            zzc.d(parcel);
            D();
            throw null;
        }
        if (i == 2) {
            int readInt = parcel.readInt();
            zzc.d(parcel);
            C0(readInt);
        } else {
            if (i != 3) {
                if (i == 4) {
                    zzc.d(parcel);
                    d1();
                    throw null;
                }
                if (i != 5) {
                    return false;
                }
                int i2 = zzc.a;
                parcel.readInt();
                zzc.d(parcel);
                o2();
                throw null;
            }
            zzc.d(parcel);
            t1();
        }
        parcel2.writeNoException();
        return true;
    }
}
