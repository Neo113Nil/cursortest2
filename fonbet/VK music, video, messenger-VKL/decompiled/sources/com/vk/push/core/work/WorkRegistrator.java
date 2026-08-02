package com.vk.push.core.work;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.vk.push.core.base.AsyncCallback;

/* loaded from: classes5.dex */
public interface WorkRegistrator extends IInterface {
    public static final String DESCRIPTOR = "com.vk.push.core.work.WorkRegistrator";

    public static class _Parcel {
    }

    void cancelWork(String str, AsyncCallback asyncCallback) throws RemoteException;

    void registerWork(WorkModel workModel, AsyncCallback asyncCallback) throws RemoteException;

    public static abstract class Stub extends Binder implements WorkRegistrator {

        public static class a implements WorkRegistrator {
            public IBinder a;

            @Override // android.os.IInterface
            public final IBinder asBinder() {
                return this.a;
            }

            @Override // com.vk.push.core.work.WorkRegistrator
            public final void cancelWork(String str, AsyncCallback asyncCallback) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(WorkRegistrator.DESCRIPTOR);
                    obtain.writeString(str);
                    obtain.writeStrongInterface(asyncCallback);
                    this.a.transact(3, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // com.vk.push.core.work.WorkRegistrator
            public final void registerWork(WorkModel workModel, AsyncCallback asyncCallback) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(WorkRegistrator.DESCRIPTOR);
                    if (workModel != null) {
                        obtain.writeInt(1);
                        workModel.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongInterface(asyncCallback);
                    this.a.transact(2, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, WorkRegistrator.DESCRIPTOR);
        }

        public static WorkRegistrator asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(WorkRegistrator.DESCRIPTOR);
            if (queryLocalInterface != null && (queryLocalInterface instanceof WorkRegistrator)) {
                return (WorkRegistrator) queryLocalInterface;
            }
            a aVar = new a();
            aVar.a = iBinder;
            return aVar;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(WorkRegistrator.DESCRIPTOR);
            }
            if (i == 1598968902) {
                parcel2.writeString(WorkRegistrator.DESCRIPTOR);
                return true;
            }
            if (i == 2) {
                registerWork(parcel.readInt() != 0 ? WorkModel.CREATOR.createFromParcel(parcel) : null, AsyncCallback.Stub.asInterface(parcel.readStrongBinder()));
            } else {
                if (i != 3) {
                    return super.onTransact(i, parcel, parcel2, i2);
                }
                cancelWork(parcel.readString(), AsyncCallback.Stub.asInterface(parcel.readStrongBinder()));
            }
            return true;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }
    }

    public static class Default implements WorkRegistrator {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.vk.push.core.work.WorkRegistrator
        public void cancelWork(String str, AsyncCallback asyncCallback) throws RemoteException {
        }

        @Override // com.vk.push.core.work.WorkRegistrator
        public void registerWork(WorkModel workModel, AsyncCallback asyncCallback) throws RemoteException {
        }
    }
}
