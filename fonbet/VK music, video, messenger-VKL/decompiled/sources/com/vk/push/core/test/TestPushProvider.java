package com.vk.push.core.test;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.vk.push.core.base.AsyncCallback;

/* loaded from: classes5.dex */
public interface TestPushProvider extends IInterface {
    public static final String DESCRIPTOR = "com.vk.push.core.test.TestPushProvider";

    public static class _Parcel {
    }

    void getIntermediateToken(AsyncCallback asyncCallback) throws RemoteException;

    void registerForPushes(String str, String str2, AsyncCallback asyncCallback) throws RemoteException;

    void sendTestPush(String str, TestPushPayload testPushPayload, AsyncCallback asyncCallback) throws RemoteException;

    public static abstract class Stub extends Binder implements TestPushProvider {

        public static class a implements TestPushProvider {
            public IBinder a;

            @Override // android.os.IInterface
            public final IBinder asBinder() {
                return this.a;
            }

            @Override // com.vk.push.core.test.TestPushProvider
            public final void getIntermediateToken(AsyncCallback asyncCallback) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(TestPushProvider.DESCRIPTOR);
                    obtain.writeStrongInterface(asyncCallback);
                    this.a.transact(4, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // com.vk.push.core.test.TestPushProvider
            public final void registerForPushes(String str, String str2, AsyncCallback asyncCallback) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(TestPushProvider.DESCRIPTOR);
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    obtain.writeStrongInterface(asyncCallback);
                    this.a.transact(2, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // com.vk.push.core.test.TestPushProvider
            public final void sendTestPush(String str, TestPushPayload testPushPayload, AsyncCallback asyncCallback) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(TestPushProvider.DESCRIPTOR);
                    obtain.writeString(str);
                    if (testPushPayload != null) {
                        obtain.writeInt(1);
                        testPushPayload.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongInterface(asyncCallback);
                    this.a.transact(3, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, TestPushProvider.DESCRIPTOR);
        }

        public static TestPushProvider asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(TestPushProvider.DESCRIPTOR);
            if (queryLocalInterface != null && (queryLocalInterface instanceof TestPushProvider)) {
                return (TestPushProvider) queryLocalInterface;
            }
            a aVar = new a();
            aVar.a = iBinder;
            return aVar;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(TestPushProvider.DESCRIPTOR);
            }
            if (i == 1598968902) {
                parcel2.writeString(TestPushProvider.DESCRIPTOR);
                return true;
            }
            if (i == 2) {
                registerForPushes(parcel.readString(), parcel.readString(), AsyncCallback.Stub.asInterface(parcel.readStrongBinder()));
            } else if (i == 3) {
                sendTestPush(parcel.readString(), parcel.readInt() != 0 ? TestPushPayload.CREATOR.createFromParcel(parcel) : null, AsyncCallback.Stub.asInterface(parcel.readStrongBinder()));
            } else {
                if (i != 4) {
                    return super.onTransact(i, parcel, parcel2, i2);
                }
                getIntermediateToken(AsyncCallback.Stub.asInterface(parcel.readStrongBinder()));
            }
            return true;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }
    }

    public static class Default implements TestPushProvider {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.vk.push.core.test.TestPushProvider
        public void getIntermediateToken(AsyncCallback asyncCallback) throws RemoteException {
        }

        @Override // com.vk.push.core.test.TestPushProvider
        public void registerForPushes(String str, String str2, AsyncCallback asyncCallback) throws RemoteException {
        }

        @Override // com.vk.push.core.test.TestPushProvider
        public void sendTestPush(String str, TestPushPayload testPushPayload, AsyncCallback asyncCallback) throws RemoteException {
        }
    }
}
