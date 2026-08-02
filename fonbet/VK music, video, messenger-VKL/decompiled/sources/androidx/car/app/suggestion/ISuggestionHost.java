package androidx.car.app.suggestion;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import androidx.car.app.serialization.Bundleable;
import io.jsonwebtoken.JwtParser;

/* loaded from: classes11.dex */
public interface ISuggestionHost extends IInterface {
    public static final String DESCRIPTOR = "androidx$car$app$suggestion$ISuggestionHost".replace('$', JwtParser.SEPARATOR_CHAR);

    void updateSuggestions(Bundleable bundleable) throws RemoteException;

    public static abstract class Stub extends Binder implements ISuggestionHost {
        static final int TRANSACTION_updateSuggestions = 2;

        public static class Proxy implements ISuggestionHost {
            private IBinder mRemote;

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            public String getInterfaceDescriptor() {
                return ISuggestionHost.DESCRIPTOR;
            }

            @Override // androidx.car.app.suggestion.ISuggestionHost
            public void updateSuggestions(Bundleable bundleable) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(ISuggestionHost.DESCRIPTOR);
                    if (bundleable != null) {
                        obtain.writeInt(1);
                        bundleable.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.mRemote.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, ISuggestionHost.DESCRIPTOR);
        }

        public static ISuggestionHost asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(ISuggestionHost.DESCRIPTOR);
            return (queryLocalInterface == null || !(queryLocalInterface instanceof ISuggestionHost)) ? new Proxy(iBinder) : (ISuggestionHost) queryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            String str = ISuggestionHost.DESCRIPTOR;
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(str);
            }
            if (i == 1598968902) {
                parcel2.writeString(str);
                return true;
            }
            if (i != 2) {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            updateSuggestions(parcel.readInt() != 0 ? Bundleable.CREATOR.createFromParcel(parcel) : null);
            parcel2.writeNoException();
            return true;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }
    }

    public static class Default implements ISuggestionHost {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // androidx.car.app.suggestion.ISuggestionHost
        public void updateSuggestions(Bundleable bundleable) throws RemoteException {
        }
    }
}
