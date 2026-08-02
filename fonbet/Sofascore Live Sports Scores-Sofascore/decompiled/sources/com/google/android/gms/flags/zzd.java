package com.google.android.gms.flags;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public abstract class zzd extends com.google.android.gms.internal.flags.zzb implements zze {
    public zzd() {
        attachInterface(this, "com.google.android.gms.flags.IFlagProvider");
    }

    public static zze asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.flags.IFlagProvider");
        return queryLocalInterface instanceof zze ? (zze) queryLocalInterface : new zzc(iBinder);
    }

    @Override // com.google.android.gms.internal.flags.zzb
    public final boolean J(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            init(IObjectWrapper.Stub.S1(parcel.readStrongBinder()));
            parcel2.writeNoException();
            return true;
        }
        if (i == 2) {
            String readString = parcel.readString();
            int i2 = com.google.android.gms.internal.flags.zzc.a;
            boolean booleanFlagValue = getBooleanFlagValue(readString, parcel.readInt() != 0, parcel.readInt());
            parcel2.writeNoException();
            parcel2.writeInt(booleanFlagValue ? 1 : 0);
            return true;
        }
        if (i == 3) {
            int intFlagValue = getIntFlagValue(parcel.readString(), parcel.readInt(), parcel.readInt());
            parcel2.writeNoException();
            parcel2.writeInt(intFlagValue);
            return true;
        }
        if (i == 4) {
            long longFlagValue = getLongFlagValue(parcel.readString(), parcel.readLong(), parcel.readInt());
            parcel2.writeNoException();
            parcel2.writeLong(longFlagValue);
            return true;
        }
        if (i != 5) {
            return false;
        }
        String stringFlagValue = getStringFlagValue(parcel.readString(), parcel.readString(), parcel.readInt());
        parcel2.writeNoException();
        parcel2.writeString(stringFlagValue);
        return true;
    }
}
