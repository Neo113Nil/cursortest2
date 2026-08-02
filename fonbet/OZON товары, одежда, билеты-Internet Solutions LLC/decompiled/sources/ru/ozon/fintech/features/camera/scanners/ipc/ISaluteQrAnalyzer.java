package ru.ozon.fintech.features.camera.scanners.ipc;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import ru.ozon.fintech.features.camera.scanners.ipc.ISaluteQrResultCallback;

/* loaded from: classes3.dex */
public interface ISaluteQrAnalyzer extends IInterface {
    public static final String DESCRIPTOR = "ru.ozon.fintech.features.camera.scanners.ipc.ISaluteQrAnalyzer";

    public static class Default implements ISaluteQrAnalyzer {
        @Override // ru.ozon.fintech.features.camera.scanners.ipc.ISaluteQrAnalyzer
        public void analyze(String str, Bundle bundle, ISaluteQrResultCallback iSaluteQrResultCallback) throws RemoteException {
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }
    }

    public static abstract class Stub extends Binder implements ISaluteQrAnalyzer {
        static final int TRANSACTION_analyze = 1;

        private static class Proxy implements ISaluteQrAnalyzer {
            private IBinder mRemote;

            Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // ru.ozon.fintech.features.camera.scanners.ipc.ISaluteQrAnalyzer
            public void analyze(String str, Bundle bundle, ISaluteQrResultCallback iSaluteQrResultCallback) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(ISaluteQrAnalyzer.DESCRIPTOR);
                    obtain.writeString(str);
                    _Parcel.writeTypedObject(obtain, bundle, 0);
                    obtain.writeStrongInterface(iSaluteQrResultCallback);
                    this.mRemote.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            public String getInterfaceDescriptor() {
                return ISaluteQrAnalyzer.DESCRIPTOR;
            }
        }

        public Stub() {
            attachInterface(this, ISaluteQrAnalyzer.DESCRIPTOR);
        }

        public static ISaluteQrAnalyzer asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(ISaluteQrAnalyzer.DESCRIPTOR);
            return (queryLocalInterface == null || !(queryLocalInterface instanceof ISaluteQrAnalyzer)) ? new Proxy(iBinder) : (ISaluteQrAnalyzer) queryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i11, Parcel parcel, Parcel parcel2, int i12) throws RemoteException {
            if (i11 >= 1 && i11 <= 16777215) {
                parcel.enforceInterface(ISaluteQrAnalyzer.DESCRIPTOR);
            }
            if (i11 == 1598968902) {
                parcel2.writeString(ISaluteQrAnalyzer.DESCRIPTOR);
                return true;
            }
            if (i11 != 1) {
                return super.onTransact(i11, parcel, parcel2, i12);
            }
            String readString = parcel.readString();
            Parcelable.Creator creator = Bundle.CREATOR;
            analyze(readString, (Bundle) _Parcel.a(parcel), ISaluteQrResultCallback.Stub.asInterface(parcel.readStrongBinder()));
            parcel2.writeNoException();
            return true;
        }
    }

    public static class _Parcel {
        static /* bridge */ /* synthetic */ Object a(Parcel parcel) {
            return readTypedObject(parcel, Bundle.CREATOR);
        }

        private static <T> T readTypedObject(Parcel parcel, Parcelable.Creator<T> creator) {
            if (parcel.readInt() != 0) {
                return creator.createFromParcel(parcel);
            }
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static <T extends Parcelable> void writeTypedObject(Parcel parcel, T t2, int i11) {
            if (t2 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                t2.writeToParcel(parcel, i11);
            }
        }
    }

    void analyze(String str, Bundle bundle, ISaluteQrResultCallback iSaluteQrResultCallback) throws RemoteException;
}
