package com.google.android.gms.internal.pal;

import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public abstract class zzfq extends zzfk implements zzfr {
    public zzfq() {
        super("com.google.android.gms.ads.adshield.internal.IAdShieldClient");
    }

    @Override // com.google.android.gms.internal.pal.zzfk
    public final boolean J(int i, Parcel parcel, Parcel parcel2) {
        switch (i) {
            case 1:
                parcel2.writeNoException();
                parcel2.writeString("ms");
                return true;
            case 2:
                parcel.readString();
                parcel.readString();
                zzfl.a(parcel);
                throw null;
            case 3:
                IObjectWrapper S1 = IObjectWrapper.Stub.S1(parcel.readStrongBinder());
                zzfl.a(parcel);
                throw null;
            case 4:
                IObjectWrapper S12 = IObjectWrapper.Stub.S1(parcel.readStrongBinder());
                zzfl.a(parcel);
                throw null;
            case 5:
                parcel.readString();
                zzfl.a(parcel);
                throw null;
            case 6:
                IObjectWrapper S13 = IObjectWrapper.Stub.S1(parcel.readStrongBinder());
                IObjectWrapper S14 = IObjectWrapper.Stub.S1(parcel.readStrongBinder());
                zzfl.a(parcel);
                try {
                    throw null;
                } catch (zzcw unused) {
                    parcel2.writeNoException();
                    parcel2.writeStrongBinder(null);
                    return true;
                }
            case 7:
                IObjectWrapper S15 = IObjectWrapper.Stub.S1(parcel.readStrongBinder());
                zzfl.a(parcel);
                throw null;
            case 8:
                IObjectWrapper S16 = IObjectWrapper.Stub.S1(parcel.readStrongBinder());
                parcel.readString();
                zzfl.a(parcel);
                throw null;
            case 9:
                IObjectWrapper S17 = IObjectWrapper.Stub.S1(parcel.readStrongBinder());
                zzfl.a(parcel);
                throw null;
            case 10:
                IObjectWrapper S18 = IObjectWrapper.Stub.S1(parcel.readStrongBinder());
                IObjectWrapper S19 = IObjectWrapper.Stub.S1(parcel.readStrongBinder());
                zzfl.a(parcel);
                try {
                    throw null;
                } catch (zzcw unused2) {
                    parcel2.writeNoException();
                    parcel2.writeStrongBinder(null);
                    return true;
                }
            case 11:
                parcel.readString();
                int i2 = zzfl.a;
                parcel.readInt();
                zzfl.a(parcel);
                parcel2.writeNoException();
                parcel2.writeInt(0);
                return true;
            case 12:
                IObjectWrapper S110 = IObjectWrapper.Stub.S1(parcel.readStrongBinder());
                parcel.createByteArray();
                zzfl.a(parcel);
                throw null;
            case 13:
                IObjectWrapper S111 = IObjectWrapper.Stub.S1(parcel.readStrongBinder());
                zzfl.a(parcel);
                throw null;
            case 14:
                IObjectWrapper S112 = IObjectWrapper.Stub.S1(parcel.readStrongBinder());
                IObjectWrapper S113 = IObjectWrapper.Stub.S1(parcel.readStrongBinder());
                IObjectWrapper S114 = IObjectWrapper.Stub.S1(parcel.readStrongBinder());
                zzfl.a(parcel);
                throw null;
            case 15:
                IObjectWrapper S115 = IObjectWrapper.Stub.S1(parcel.readStrongBinder());
                zzfl.a(parcel);
                throw null;
            case 16:
            default:
                return false;
            case 17:
                IObjectWrapper S116 = IObjectWrapper.Stub.S1(parcel.readStrongBinder());
                IObjectWrapper S117 = IObjectWrapper.Stub.S1(parcel.readStrongBinder());
                IObjectWrapper S118 = IObjectWrapper.Stub.S1(parcel.readStrongBinder());
                IObjectWrapper S119 = IObjectWrapper.Stub.S1(parcel.readStrongBinder());
                zzfl.a(parcel);
                throw null;
            case 18:
                parcel2.writeNoException();
                int i3 = zzfl.a;
                parcel2.writeInt(1);
                return true;
            case 19:
                parcel2.writeNoException();
                int i4 = zzfl.a;
                parcel2.writeInt(1);
                return true;
            case 20:
                parcel2.writeNoException();
                parcel2.writeInt(-1);
                return true;
        }
    }
}
