package zone.bi.mobile.fingerprint.impl.cs;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import zone.bi.mobile.fingerprint.impl.cs.FpWorkerService;

/* loaded from: classes4.dex */
public interface a extends IInterface {

    /* renamed from: zone.bi.mobile.fingerprint.impl.cs.a$a, reason: collision with other inner class name */
    public static abstract class AbstractBinderC2359a extends Binder implements a {

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ int f109326e = 0;

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: zone.bi.mobile.fingerprint.impl.cs.a$a$a, reason: collision with other inner class name */
        static class C2360a implements a {

            /* renamed from: e, reason: collision with root package name */
            private IBinder f109327e;

            C2360a(IBinder iBinder) {
                this.f109327e = iBinder;
            }

            @Override // android.os.IInterface
            public final IBinder asBinder() {
                return this.f109327e;
            }

            @Override // zone.bi.mobile.fingerprint.impl.cs.a
            public final int b() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("zone.bi.mobile.fingerprint.impl.cs.IFpWorkerService");
                    this.f109327e.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        @Override // android.os.IInterface
        public final IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public final boolean onTransact(int i11, Parcel parcel, Parcel parcel2, int i12) throws RemoteException {
            if (i11 >= 1 && i11 <= 16777215) {
                parcel.enforceInterface("zone.bi.mobile.fingerprint.impl.cs.IFpWorkerService");
            }
            if (i11 == 1598968902) {
                parcel2.writeString("zone.bi.mobile.fingerprint.impl.cs.IFpWorkerService");
                return true;
            }
            if (i11 != 1) {
                return super.onTransact(i11, parcel, parcel2, i12);
            }
            int b11 = ((FpWorkerService.a) this).b();
            parcel2.writeNoException();
            parcel2.writeInt(b11);
            return true;
        }
    }

    int b() throws RemoteException;
}
