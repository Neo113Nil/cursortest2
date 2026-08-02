package lb;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.vk.push.core.base.AidlResult;
import ub.AbstractC10010q;

/* renamed from: lb.b, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public interface InterfaceC7913b extends IInterface {

    /* renamed from: lb.b$a */
    public static abstract class a extends Binder implements InterfaceC7913b {

        /* renamed from: lb.b$a$a, reason: collision with other inner class name */
        private static class C1229a implements InterfaceC7913b {

            /* renamed from: e, reason: collision with root package name */
            private IBinder f73158e;

            C1229a(IBinder iBinder) {
                this.f73158e = iBinder;
            }

            @Override // android.os.IInterface
            public final IBinder asBinder() {
                return this.f73158e;
            }

            @Override // lb.InterfaceC7913b
            public final void g(AidlResult aidlResult) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.vk.push.core.base.AsyncCallback");
                    obtain.writeInt(1);
                    aidlResult.writeToParcel(obtain, 0);
                    this.f73158e.transact(2, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }
        }

        public static InterfaceC7913b H(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.vk.push.core.base.AsyncCallback");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof InterfaceC7913b)) ? new C1229a(iBinder) : (InterfaceC7913b) queryLocalInterface;
        }

        @Override // android.os.IInterface
        public final IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public final boolean onTransact(int i11, Parcel parcel, Parcel parcel2, int i12) throws RemoteException {
            if (i11 >= 1 && i11 <= 16777215) {
                parcel.enforceInterface("com.vk.push.core.base.AsyncCallback");
            }
            if (i11 == 1598968902) {
                parcel2.writeString("com.vk.push.core.base.AsyncCallback");
                return true;
            }
            if (i11 != 2) {
                return super.onTransact(i11, parcel, parcel2, i12);
            }
            ((AbstractC10010q.a.BinderC2204a) this).g(parcel.readInt() != 0 ? AidlResult.CREATOR.createFromParcel(parcel) : null);
            return true;
        }
    }

    void g(AidlResult aidlResult) throws RemoteException;
}
