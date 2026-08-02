package rl0;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes4.dex */
public interface M extends IInterface {

    public static abstract class a extends Binder implements M {
        public a() {
            attachInterface(this, "ru.vk.store.provider.appupdate.StartUpdateFlowCallback");
        }

        @Override // android.os.IInterface
        public final IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public final boolean onTransact(int i11, Parcel parcel, Parcel parcel2, int i12) {
            if (i11 >= 1 && i11 <= 16777215) {
                parcel.enforceInterface("ru.vk.store.provider.appupdate.StartUpdateFlowCallback");
            }
            if (i11 == 1598968902) {
                parcel2.writeString("ru.vk.store.provider.appupdate.StartUpdateFlowCallback");
                return true;
            }
            if (i11 == 1) {
                a();
                parcel2.writeNoException();
                return true;
            }
            if (i11 != 2) {
                return super.onTransact(i11, parcel, parcel2, i12);
            }
            C(parcel.readInt(), parcel.readString());
            parcel2.writeNoException();
            return true;
        }
    }

    void C(int i11, String str);

    void a();
}
