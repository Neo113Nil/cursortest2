package com.vk.push.core.push;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.vk.push.common.messaging.RemoteMessage;
import com.vk.push.core.base.AsyncCallback;
import java.util.List;

/* loaded from: classes5.dex */
public interface PushClient extends IInterface {
    public static final String DESCRIPTOR = "com.vk.push.core.push.PushClient";

    public static class _Parcel {
    }

    void isPushTokenExist(String str, AsyncCallback asyncCallback) throws RemoteException;

    void onDeletedMessages(AsyncCallback asyncCallback) throws RemoteException;

    void onMessagesReceived(List<RemoteMessage> list, AsyncCallback asyncCallback) throws RemoteException;

    void onTokenInvalidated(AsyncCallback asyncCallback) throws RemoteException;

    public static abstract class Stub extends Binder implements PushClient {

        public static class a implements PushClient {
            public IBinder a;

            @Override // android.os.IInterface
            public final IBinder asBinder() {
                return this.a;
            }

            @Override // com.vk.push.core.push.PushClient
            public final void isPushTokenExist(String str, AsyncCallback asyncCallback) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(PushClient.DESCRIPTOR);
                    obtain.writeString(str);
                    obtain.writeStrongInterface(asyncCallback);
                    this.a.transact(5, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // com.vk.push.core.push.PushClient
            public final void onDeletedMessages(AsyncCallback asyncCallback) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(PushClient.DESCRIPTOR);
                    obtain.writeStrongInterface(asyncCallback);
                    this.a.transact(4, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // com.vk.push.core.push.PushClient
            public final void onMessagesReceived(List<RemoteMessage> list, AsyncCallback asyncCallback) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(PushClient.DESCRIPTOR);
                    if (list == null) {
                        obtain.writeInt(-1);
                    } else {
                        int size = list.size();
                        obtain.writeInt(size);
                        for (int i = 0; i < size; i++) {
                            RemoteMessage remoteMessage = list.get(i);
                            if (remoteMessage != null) {
                                obtain.writeInt(1);
                                remoteMessage.writeToParcel(obtain, 0);
                            } else {
                                obtain.writeInt(0);
                            }
                        }
                    }
                    obtain.writeStrongInterface(asyncCallback);
                    this.a.transact(2, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // com.vk.push.core.push.PushClient
            public final void onTokenInvalidated(AsyncCallback asyncCallback) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(PushClient.DESCRIPTOR);
                    obtain.writeStrongInterface(asyncCallback);
                    this.a.transact(3, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, PushClient.DESCRIPTOR);
        }

        public static PushClient asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(PushClient.DESCRIPTOR);
            if (queryLocalInterface != null && (queryLocalInterface instanceof PushClient)) {
                return (PushClient) queryLocalInterface;
            }
            a aVar = new a();
            aVar.a = iBinder;
            return aVar;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(PushClient.DESCRIPTOR);
            }
            if (i == 1598968902) {
                parcel2.writeString(PushClient.DESCRIPTOR);
                return true;
            }
            if (i == 2) {
                onMessagesReceived(parcel.createTypedArrayList(RemoteMessage.CREATOR), AsyncCallback.Stub.asInterface(parcel.readStrongBinder()));
            } else if (i == 3) {
                onTokenInvalidated(AsyncCallback.Stub.asInterface(parcel.readStrongBinder()));
            } else if (i == 4) {
                onDeletedMessages(AsyncCallback.Stub.asInterface(parcel.readStrongBinder()));
            } else {
                if (i != 5) {
                    return super.onTransact(i, parcel, parcel2, i2);
                }
                isPushTokenExist(parcel.readString(), AsyncCallback.Stub.asInterface(parcel.readStrongBinder()));
            }
            return true;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }
    }

    public static class Default implements PushClient {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.vk.push.core.push.PushClient
        public void onDeletedMessages(AsyncCallback asyncCallback) throws RemoteException {
        }

        @Override // com.vk.push.core.push.PushClient
        public void onTokenInvalidated(AsyncCallback asyncCallback) throws RemoteException {
        }

        @Override // com.vk.push.core.push.PushClient
        public void isPushTokenExist(String str, AsyncCallback asyncCallback) throws RemoteException {
        }

        @Override // com.vk.push.core.push.PushClient
        public void onMessagesReceived(List<RemoteMessage> list, AsyncCallback asyncCallback) throws RemoteException {
        }
    }
}
