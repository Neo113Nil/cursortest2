package androidx.car.app;

import android.location.Location;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.text.TextUtils;
import androidx.car.app.ISurfaceCallback;
import androidx.car.app.serialization.Bundleable;
import io.jsonwebtoken.JwtParser;

/* loaded from: classes11.dex */
public interface IAppHost extends IInterface {
    public static final String DESCRIPTOR = "androidx$car$app$IAppHost".replace('$', JwtParser.SEPARATOR_CHAR);

    public static class a {
        public static Object a(Parcel parcel, Parcelable.Creator creator) {
            if (parcel.readInt() != 0) {
                return creator.createFromParcel(parcel);
            }
            return null;
        }

        public static void b(Parcel parcel, Parcelable parcelable, int i) {
            if (parcelable == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcelable.writeToParcel(parcel, i);
            }
        }
    }

    void dismissAlert(int i) throws RemoteException;

    void invalidate() throws RemoteException;

    Bundleable openMicrophone(Bundleable bundleable) throws RemoteException;

    void sendLocation(Location location) throws RemoteException;

    void setSurfaceCallback(ISurfaceCallback iSurfaceCallback) throws RemoteException;

    void showAlert(Bundleable bundleable) throws RemoteException;

    void showToast(CharSequence charSequence, int i) throws RemoteException;

    public static class Default implements IAppHost {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // androidx.car.app.IAppHost
        public Bundleable openMicrophone(Bundleable bundleable) throws RemoteException {
            return null;
        }

        @Override // androidx.car.app.IAppHost
        public void invalidate() throws RemoteException {
        }

        @Override // androidx.car.app.IAppHost
        public void dismissAlert(int i) throws RemoteException {
        }

        @Override // androidx.car.app.IAppHost
        public void sendLocation(Location location) throws RemoteException {
        }

        @Override // androidx.car.app.IAppHost
        public void setSurfaceCallback(ISurfaceCallback iSurfaceCallback) throws RemoteException {
        }

        @Override // androidx.car.app.IAppHost
        public void showAlert(Bundleable bundleable) throws RemoteException {
        }

        @Override // androidx.car.app.IAppHost
        public void showToast(CharSequence charSequence, int i) throws RemoteException {
        }
    }

    public static abstract class Stub extends Binder implements IAppHost {
        static final int TRANSACTION_dismissAlert = 7;
        static final int TRANSACTION_invalidate = 2;
        static final int TRANSACTION_openMicrophone = 8;
        static final int TRANSACTION_sendLocation = 5;
        static final int TRANSACTION_setSurfaceCallback = 4;
        static final int TRANSACTION_showAlert = 6;
        static final int TRANSACTION_showToast = 3;

        public static class Proxy implements IAppHost {
            private IBinder mRemote;

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            @Override // androidx.car.app.IAppHost
            public void dismissAlert(int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IAppHost.DESCRIPTOR);
                    obtain.writeInt(i);
                    this.mRemote.transact(7, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public String getInterfaceDescriptor() {
                return IAppHost.DESCRIPTOR;
            }

            @Override // androidx.car.app.IAppHost
            public void invalidate() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IAppHost.DESCRIPTOR);
                    this.mRemote.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // androidx.car.app.IAppHost
            public Bundleable openMicrophone(Bundleable bundleable) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IAppHost.DESCRIPTOR);
                    a.b(obtain, bundleable, 0);
                    this.mRemote.transact(8, obtain, obtain2, 0);
                    obtain2.readException();
                    return (Bundleable) a.a(obtain2, Bundleable.CREATOR);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // androidx.car.app.IAppHost
            public void sendLocation(Location location) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IAppHost.DESCRIPTOR);
                    a.b(obtain, location, 0);
                    this.mRemote.transact(5, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // androidx.car.app.IAppHost
            public void setSurfaceCallback(ISurfaceCallback iSurfaceCallback) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IAppHost.DESCRIPTOR);
                    obtain.writeStrongInterface(iSurfaceCallback);
                    this.mRemote.transact(4, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // androidx.car.app.IAppHost
            public void showAlert(Bundleable bundleable) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IAppHost.DESCRIPTOR);
                    a.b(obtain, bundleable, 0);
                    this.mRemote.transact(6, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // androidx.car.app.IAppHost
            public void showToast(CharSequence charSequence, int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IAppHost.DESCRIPTOR);
                    if (charSequence != null) {
                        obtain.writeInt(1);
                        TextUtils.writeToParcel(charSequence, obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeInt(i);
                    this.mRemote.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                    obtain2.recycle();
                    obtain.recycle();
                } catch (Throwable th) {
                    obtain2.recycle();
                    obtain.recycle();
                    throw th;
                }
            }
        }

        public Stub() {
            attachInterface(this, IAppHost.DESCRIPTOR);
        }

        public static IAppHost asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(IAppHost.DESCRIPTOR);
            return (queryLocalInterface == null || !(queryLocalInterface instanceof IAppHost)) ? new Proxy(iBinder) : (IAppHost) queryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            String str = IAppHost.DESCRIPTOR;
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(str);
            }
            if (i == 1598968902) {
                parcel2.writeString(str);
                return true;
            }
            switch (i) {
                case 2:
                    invalidate();
                    parcel2.writeNoException();
                    return true;
                case 3:
                    showToast((CharSequence) a.a(parcel, TextUtils.CHAR_SEQUENCE_CREATOR), parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 4:
                    setSurfaceCallback(ISurfaceCallback.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 5:
                    sendLocation((Location) a.a(parcel, Location.CREATOR));
                    parcel2.writeNoException();
                    return true;
                case 6:
                    showAlert((Bundleable) a.a(parcel, Bundleable.CREATOR));
                    parcel2.writeNoException();
                    return true;
                case 7:
                    dismissAlert(parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 8:
                    Bundleable openMicrophone = openMicrophone((Bundleable) a.a(parcel, Bundleable.CREATOR));
                    parcel2.writeNoException();
                    a.b(parcel2, openMicrophone, 1);
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }
    }
}
