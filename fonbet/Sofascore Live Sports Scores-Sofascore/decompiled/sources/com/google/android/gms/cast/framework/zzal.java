package com.google.android.gms.cast.framework;

import android.os.Parcel;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.cast.zzb;
import com.google.android.gms.internal.cast.zzc;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public abstract class zzal extends zzb implements zzam {
    public zzal() {
        super("com.google.android.gms.cast.framework.ICastStateListener");
    }

    @Override // com.google.android.gms.internal.cast.zzb
    public final boolean J(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            ObjectWrapper objectWrapper = new ObjectWrapper(null);
            parcel2.writeNoException();
            zzc.c(parcel2, objectWrapper);
            return true;
        }
        if (i == 2) {
            parcel.readInt();
            zzc.d(parcel);
            throw null;
        }
        if (i != 3) {
            return false;
        }
        parcel2.writeNoException();
        parcel2.writeInt(12451000);
        return true;
    }
}
