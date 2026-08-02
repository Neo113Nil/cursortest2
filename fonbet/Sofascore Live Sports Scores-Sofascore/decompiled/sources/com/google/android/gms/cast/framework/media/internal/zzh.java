package com.google.android.gms.cast.framework.media.internal;

import android.os.Parcel;
import com.google.android.gms.internal.cast.zzc;
import defpackage.wqn;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public abstract class zzh extends com.google.android.gms.internal.cast.zzb implements zzi {
    public zzh() {
        super("com.google.android.gms.cast.framework.media.internal.IFetchBitmapTaskProgressPublisher");
    }

    @Override // com.google.android.gms.internal.cast.zzb
    public final boolean J(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            if (i != 2) {
                return false;
            }
            parcel2.writeNoException();
            parcel2.writeInt(12451000);
            return true;
        }
        long readLong = parcel.readLong();
        long readLong2 = parcel.readLong();
        zzc.d(parcel);
        ((wqn) this).a.publishProgress(Long.valueOf(readLong), Long.valueOf(readLong2));
        parcel2.writeNoException();
        return true;
    }
}
