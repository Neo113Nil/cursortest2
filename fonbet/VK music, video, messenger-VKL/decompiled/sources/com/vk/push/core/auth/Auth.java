package com.vk.push.core.auth;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.vk.push.core.base.AsyncCallback;

/* loaded from: classes5.dex */
public interface Auth extends IInterface {
    public static final String DESCRIPTOR = "com.vk.push.core.auth.Auth";

    void getIntermediateToken(AsyncCallback asyncCallback) throws RemoteException;

    void isUserAuthorized(AsyncCallback asyncCallback) throws RemoteException;

    public static abstract class Stub extends Binder implements Auth {

        public static class a implements Auth {
            public IBinder a;

            @Override // android.os.IInterface
            public final IBinder asBinder() {
                return this.a;
            }

            @Override // com.vk.push.core.auth.Auth
            public final void getIntermediateToken(AsyncCallback asyncCallback) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Auth.DESCRIPTOR);
                    obtain.writeStrongInterface(asyncCallback);
                    this.a.transact(2, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // com.vk.push.core.auth.Auth
            public final void isUserAuthorized(AsyncCallback asyncCallback) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Auth.DESCRIPTOR);
                    obtain.writeStrongInterface(asyncCallback);
                    this.a.transact(3, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, Auth.DESCRIPTOR);
        }

        public static Auth asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(Auth.DESCRIPTOR);
            if (queryLocalInterface != null && (queryLocalInterface instanceof Auth)) {
                return (Auth) queryLocalInterface;
            }
            a aVar = new a();
            aVar.a = iBinder;
            return aVar;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(Auth.DESCRIPTOR);
            }
            if (i == 1598968902) {
                parcel2.writeString(Auth.DESCRIPTOR);
                return true;
            }
            if (i == 2) {
                getIntermediateToken(AsyncCallback.Stub.asInterface(parcel.readStrongBinder()));
            } else {
                if (i != 3) {
                    return super.onTransact(i, parcel, parcel2, i2);
                }
                isUserAuthorized(AsyncCallback.Stub.asInterface(parcel.readStrongBinder()));
            }
            return true;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }
    }

    public static class Default implements Auth {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.vk.push.core.auth.Auth
        public void getIntermediateToken(AsyncCallback asyncCallback) throws RemoteException {
        }

        @Override // com.vk.push.core.auth.Auth
        public void isUserAuthorized(AsyncCallback asyncCallback) throws RemoteException {
        }
    }
}
