package com.vk.push.core.work;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.vk.push.core.base.AsyncCallback;

/* loaded from: classes5.dex */
public interface WorkExecutor extends IInterface {
    public static final String DESCRIPTOR = "com.vk.push.core.work.WorkExecutor";

    public static class _Parcel {
    }

    void executeWork(WorkModel workModel, AsyncCallback asyncCallback) throws RemoteException;

    public static abstract class Stub extends Binder implements WorkExecutor {

        public static class a implements WorkExecutor {
            public IBinder a;

            @Override // android.os.IInterface
            public final IBinder asBinder() {
                return this.a;
            }

            @Override // com.vk.push.core.work.WorkExecutor
            public final void executeWork(WorkModel workModel, AsyncCallback asyncCallback) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(WorkExecutor.DESCRIPTOR);
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
            attachInterface(this, WorkExecutor.DESCRIPTOR);
        }

        public static WorkExecutor asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(WorkExecutor.DESCRIPTOR);
            if (queryLocalInterface != null && (queryLocalInterface instanceof WorkExecutor)) {
                return (WorkExecutor) queryLocalInterface;
            }
            a aVar = new a();
            aVar.a = iBinder;
            return aVar;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(WorkExecutor.DESCRIPTOR);
            }
            if (i == 1598968902) {
                parcel2.writeString(WorkExecutor.DESCRIPTOR);
                return true;
            }
            if (i != 2) {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            executeWork(parcel.readInt() != 0 ? WorkModel.CREATOR.createFromParcel(parcel) : null, AsyncCallback.Stub.asInterface(parcel.readStrongBinder()));
            return true;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }
    }

    public static class Default implements WorkExecutor {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.vk.push.core.work.WorkExecutor
        public void executeWork(WorkModel workModel, AsyncCallback asyncCallback) throws RemoteException {
        }
    }
}
