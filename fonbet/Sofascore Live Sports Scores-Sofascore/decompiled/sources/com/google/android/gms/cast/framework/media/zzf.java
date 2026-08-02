package com.google.android.gms.cast.framework.media;

import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.ArrayList;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public abstract class zzf extends com.google.android.gms.internal.cast.zzb implements zzg {
    public zzf() {
        super("com.google.android.gms.cast.framework.media.INotificationActionsProvider");
    }

    @Override // com.google.android.gms.internal.cast.zzb
    public final boolean J(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            parcel2.writeNoException();
            parcel2.writeInt(12451000);
            return true;
        }
        if (i == 2) {
            IObjectWrapper zze = zze();
            parcel2.writeNoException();
            com.google.android.gms.internal.cast.zzc.c(parcel2, zze);
            return true;
        }
        if (i == 3) {
            ArrayList zzf = zzf();
            parcel2.writeNoException();
            parcel2.writeTypedList(zzf);
            return true;
        }
        if (i != 4) {
            return false;
        }
        int[] zzg = zzg();
        parcel2.writeNoException();
        parcel2.writeIntArray(zzg);
        return true;
    }
}
