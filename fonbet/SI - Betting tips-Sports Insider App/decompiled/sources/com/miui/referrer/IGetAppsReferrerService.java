package com.miui.referrer;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public interface IGetAppsReferrerService extends IInterface {

    /* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
    public static class Default implements IGetAppsReferrerService {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.miui.referrer.IGetAppsReferrerService
        public Bundle referrerBundle(Bundle bundle) throws RemoteException {
            return null;
        }
    }

    Bundle referrerBundle(Bundle bundle) throws RemoteException;

    /* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
    public static abstract class Stub extends Binder implements IGetAppsReferrerService {
        private static final String DESCRIPTOR = "com.miui.referrer.IGetAppsReferrerService";
        static final int TRANSACTION_referrerBundle = 1;

        public Stub() {
            attachInterface(this, DESCRIPTOR);
        }

        public static IGetAppsReferrerService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            if (queryLocalInterface != null && (queryLocalInterface instanceof IGetAppsReferrerService)) {
                return (IGetAppsReferrerService) queryLocalInterface;
            }
            a aVar = new a();
            aVar.f6829a = iBinder;
            return aVar;
        }

        public static IGetAppsReferrerService getDefaultImpl() {
            return a.f6828f;
        }

        public static boolean setDefaultImpl(IGetAppsReferrerService iGetAppsReferrerService) {
            if (a.f6828f != null) {
                throw new IllegalStateException("setDefaultImpl() called twice");
            }
            if (iGetAppsReferrerService == null) {
                return false;
            }
            a.f6828f = iGetAppsReferrerService;
            return true;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i5, Parcel parcel, Parcel parcel2, int i10) throws RemoteException {
            if (i5 != 1) {
                if (i5 != 1598968902) {
                    return super.onTransact(i5, parcel, parcel2, i10);
                }
                parcel2.writeString(DESCRIPTOR);
                return true;
            }
            parcel.enforceInterface(DESCRIPTOR);
            Bundle referrerBundle = referrerBundle(parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
            parcel2.writeNoException();
            if (referrerBundle != null) {
                parcel2.writeInt(1);
                referrerBundle.writeToParcel(parcel2, 1);
            } else {
                parcel2.writeInt(0);
            }
            return true;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }
    }
}
