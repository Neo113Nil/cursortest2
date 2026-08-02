package androidx.car.app.media;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import androidx.car.app.serialization.Bundleable;
import io.jsonwebtoken.JwtParser;

/* loaded from: classes11.dex */
public interface IMediaPlaybackHost extends IInterface {
    public static final String DESCRIPTOR = "androidx$car$app$media$IMediaPlaybackHost".replace('$', JwtParser.SEPARATOR_CHAR);

    void registerMediaSessionToken(Bundleable bundleable) throws RemoteException;

    public static abstract class Stub extends Binder implements IMediaPlaybackHost {
        static final int TRANSACTION_registerMediaSessionToken = 1;

        public static class Proxy implements IMediaPlaybackHost {
            private IBinder mRemote;

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            public String getInterfaceDescriptor() {
                return IMediaPlaybackHost.DESCRIPTOR;
            }

            @Override // androidx.car.app.media.IMediaPlaybackHost
            public void registerMediaSessionToken(Bundleable bundleable) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IMediaPlaybackHost.DESCRIPTOR);
                    if (bundleable != null) {
                        obtain.writeInt(1);
                        bundleable.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.mRemote.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, IMediaPlaybackHost.DESCRIPTOR);
        }

        public static IMediaPlaybackHost asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(IMediaPlaybackHost.DESCRIPTOR);
            return (queryLocalInterface == null || !(queryLocalInterface instanceof IMediaPlaybackHost)) ? new Proxy(iBinder) : (IMediaPlaybackHost) queryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            String str = IMediaPlaybackHost.DESCRIPTOR;
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(str);
            }
            if (i == 1598968902) {
                parcel2.writeString(str);
                return true;
            }
            if (i != 1) {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            registerMediaSessionToken(parcel.readInt() != 0 ? Bundleable.CREATOR.createFromParcel(parcel) : null);
            parcel2.writeNoException();
            return true;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }
    }

    public static class Default implements IMediaPlaybackHost {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // androidx.car.app.media.IMediaPlaybackHost
        public void registerMediaSessionToken(Bundleable bundleable) throws RemoteException {
        }
    }
}
