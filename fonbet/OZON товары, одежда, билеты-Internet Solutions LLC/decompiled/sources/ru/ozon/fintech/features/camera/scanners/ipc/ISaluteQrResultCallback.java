package ru.ozon.fintech.features.camera.scanners.ipc;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes3.dex */
public interface ISaluteQrResultCallback extends IInterface {
    public static final String DESCRIPTOR = "ru.ozon.fintech.features.camera.scanners.ipc.ISaluteQrResultCallback";

    public static class Default implements ISaluteQrResultCallback {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // ru.ozon.fintech.features.camera.scanners.ipc.ISaluteQrResultCallback
        public void onError() throws RemoteException {
        }

        @Override // ru.ozon.fintech.features.camera.scanners.ipc.ISaluteQrResultCallback
        public void onSuccess(String str, String str2, int i11) throws RemoteException {
        }
    }

    public static abstract class Stub extends Binder implements ISaluteQrResultCallback {
        static final int TRANSACTION_onError = 2;
        static final int TRANSACTION_onSuccess = 1;

        private static class Proxy implements ISaluteQrResultCallback {
            private IBinder mRemote;

            Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            public String getInterfaceDescriptor() {
                return ISaluteQrResultCallback.DESCRIPTOR;
            }

            @Override // ru.ozon.fintech.features.camera.scanners.ipc.ISaluteQrResultCallback
            public void onError() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(ISaluteQrResultCallback.DESCRIPTOR);
                    this.mRemote.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // ru.ozon.fintech.features.camera.scanners.ipc.ISaluteQrResultCallback
            public void onSuccess(String str, String str2, int i11) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(ISaluteQrResultCallback.DESCRIPTOR);
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    obtain.writeInt(i11);
                    this.mRemote.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, ISaluteQrResultCallback.DESCRIPTOR);
        }

        public static ISaluteQrResultCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(ISaluteQrResultCallback.DESCRIPTOR);
            return (queryLocalInterface == null || !(queryLocalInterface instanceof ISaluteQrResultCallback)) ? new Proxy(iBinder) : (ISaluteQrResultCallback) queryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i11, Parcel parcel, Parcel parcel2, int i12) throws RemoteException {
            if (i11 >= 1 && i11 <= 16777215) {
                parcel.enforceInterface(ISaluteQrResultCallback.DESCRIPTOR);
            }
            if (i11 == 1598968902) {
                parcel2.writeString(ISaluteQrResultCallback.DESCRIPTOR);
                return true;
            }
            if (i11 == 1) {
                onSuccess(parcel.readString(), parcel.readString(), parcel.readInt());
                parcel2.writeNoException();
            } else {
                if (i11 != 2) {
                    return super.onTransact(i11, parcel, parcel2, i12);
                }
                onError();
                parcel2.writeNoException();
            }
            return true;
        }
    }

    void onError() throws RemoteException;

    void onSuccess(String str, String str2, int i11) throws RemoteException;
}
