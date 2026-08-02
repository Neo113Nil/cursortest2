package defpackage;

import android.os.BadParcelableException;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public abstract class xkn extends Binder implements IInterface {
    public final /* synthetic */ int a = 0;

    public xkn(String str) {
        attachInterface(this, str);
    }

    public abstract boolean J(int i, Parcel parcel, Parcel parcel2);

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        int i = this.a;
        return this;
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (this.a) {
            case 0:
                if (i <= 16777215) {
                    parcel.enforceInterface(getInterfaceDescriptor());
                } else if (super.onTransact(i, parcel, parcel2, i2)) {
                    return true;
                }
                pzo pzoVar = (pzo) this;
                if (i == 2) {
                    Parcelable.Creator creator = Bundle.CREATOR;
                    int i3 = sqn.a;
                    Bundle bundle = (Bundle) (parcel.readInt() != 0 ? (Parcelable) creator.createFromParcel(parcel) : null);
                    int dataAvail = parcel.dataAvail();
                    if (dataAvail > 0) {
                        throw new BadParcelableException(ljg.j(dataAvail, "Parcel data not fully consumed, unread size: "));
                    }
                    pzoVar.S1(bundle);
                    return true;
                }
                if (i != 3) {
                    return false;
                }
                Parcelable.Creator creator2 = Bundle.CREATOR;
                int i4 = sqn.a;
                Bundle bundle2 = (Bundle) (parcel.readInt() != 0 ? (Parcelable) creator2.createFromParcel(parcel) : null);
                int dataAvail2 = parcel.dataAvail();
                if (dataAvail2 > 0) {
                    throw new BadParcelableException(ljg.j(dataAvail2, "Parcel data not fully consumed, unread size: "));
                }
                pzoVar.F(bundle2);
                return true;
            default:
                if (i <= 16777215) {
                    parcel.enforceInterface(getInterfaceDescriptor());
                } else if (super.onTransact(i, parcel, parcel2, i2)) {
                    return true;
                }
                return J(i, parcel, parcel2);
        }
    }

    public /* synthetic */ xkn() {
    }
}
