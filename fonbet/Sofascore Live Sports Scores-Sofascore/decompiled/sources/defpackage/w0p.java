package defpackage;

import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public abstract class w0p extends xkn implements x0p {
    public w0p() {
        super("com.google.android.gms.gass.internal.clearcut.IGassClearcut");
    }

    @Override // defpackage.xkn
    public final boolean J(int i, Parcel parcel, Parcel parcel2) {
        switch (i) {
            case 2:
                IObjectWrapper.Stub.S1(parcel.readStrongBinder());
                parcel.readString();
                avo.c(parcel);
                break;
            case 3:
                break;
            case 4:
                parcel.createIntArray();
                avo.c(parcel);
                break;
            case 5:
                parcel.createByteArray();
                avo.c(parcel);
                break;
            case 6:
                parcel.readInt();
                avo.c(parcel);
                break;
            case 7:
                parcel.readInt();
                avo.c(parcel);
                break;
            case 8:
                IObjectWrapper.Stub.S1(parcel.readStrongBinder());
                parcel.readString();
                parcel.readString();
                avo.c(parcel);
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
