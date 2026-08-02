package com.vk.push.core.base;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes5.dex */
public interface AsyncCallback extends IInterface {
    public static final String DESCRIPTOR = "com.vk.push.core.base.AsyncCallback";

    public static class _Parcel {
    }

    void onResult(AidlResult aidlResult) throws RemoteException;

    public static abstract class Stub extends Binder implements AsyncCallback {

        public static class a implements AsyncCallback {
            public IBinder a;

            @Override // android.os.IInterface
            public final IBinder asBinder() {
                return this.a;
            }

            @Override // com.vk.push.core.base.AsyncCallback
            public final void onResult(AidlResult aidlResult) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(AsyncCallback.DESCRIPTOR);
                    if (aidlResult != null) {
                        obtain.writeInt(1);
                        aidlResult.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.a.transact(2, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, AsyncCallback.DESCRIPTOR);
        }

        public static AsyncCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(AsyncCallback.DESCRIPTOR);
            if (queryLocalInterface != null && (queryLocalInterface instanceof AsyncCallback)) {
                return (AsyncCallback) queryLocalInterface;
            }
            a aVar = new a();
            aVar.a = iBinder;
            return aVar;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(AsyncCallback.DESCRIPTOR);
            }
            if (i == 1598968902) {
                parcel2.writeString(AsyncCallback.DESCRIPTOR);
                return true;
            }
            if (i != 2) {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            onResult(parcel.readInt() != 0 ? AidlResult.CREATOR.createFromParcel(parcel) : null);
            return true;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }
    }

    public static class Default implements AsyncCallback {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.vk.push.core.base.AsyncCallback
        public void onResult(AidlResult aidlResult) throws RemoteException {
        }
    }
}
