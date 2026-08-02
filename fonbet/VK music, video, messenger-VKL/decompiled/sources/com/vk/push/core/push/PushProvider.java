package com.vk.push.core.push;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.vk.push.core.base.AsyncCallback;

/* loaded from: classes5.dex */
public interface PushProvider extends IInterface {
    public static final String DESCRIPTOR = "com.vk.push.core.push.PushProvider";

    void registerForPushes(String str, String str2, AsyncCallback asyncCallback) throws RemoteException;

    public static abstract class Stub extends Binder implements PushProvider {

        public static class a implements PushProvider {
            public IBinder a;

            @Override // android.os.IInterface
            public final IBinder asBinder() {
                return this.a;
            }

            @Override // com.vk.push.core.push.PushProvider
            public final void registerForPushes(String str, String str2, AsyncCallback asyncCallback) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(PushProvider.DESCRIPTOR);
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    obtain.writeStrongInterface(asyncCallback);
                    this.a.transact(2, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, PushProvider.DESCRIPTOR);
        }

        public static PushProvider asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(PushProvider.DESCRIPTOR);
            if (queryLocalInterface != null && (queryLocalInterface instanceof PushProvider)) {
                return (PushProvider) queryLocalInterface;
            }
            a aVar = new a();
            aVar.a = iBinder;
            return aVar;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(PushProvider.DESCRIPTOR);
            }
            if (i == 1598968902) {
                parcel2.writeString(PushProvider.DESCRIPTOR);
                return true;
            }
            if (i != 2) {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            registerForPushes(parcel.readString(), parcel.readString(), AsyncCallback.Stub.asInterface(parcel.readStrongBinder()));
            return true;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }
    }

    public static class Default implements PushProvider {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.vk.push.core.push.PushProvider
        public void registerForPushes(String str, String str2, AsyncCallback asyncCallback) throws RemoteException {
        }
    }
}
