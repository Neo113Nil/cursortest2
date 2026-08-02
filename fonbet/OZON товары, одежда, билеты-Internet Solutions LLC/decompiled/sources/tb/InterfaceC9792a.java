package tb;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import lb.InterfaceC7913b;

/* renamed from: tb.a, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public interface InterfaceC9792a extends IInterface {

    /* renamed from: tb.a$a, reason: collision with other inner class name */
    public static abstract class AbstractBinderC2183a extends Binder implements InterfaceC9792a {

        /* renamed from: tb.a$a$a, reason: collision with other inner class name */
        private static class C2184a implements InterfaceC9792a {

            /* renamed from: e, reason: collision with root package name */
            private IBinder f99324e;

            C2184a(IBinder iBinder) {
                this.f99324e = iBinder;
            }

            @Override // android.os.IInterface
            public final IBinder asBinder() {
                return this.f99324e;
            }

            @Override // tb.InterfaceC9792a
            public final void s(InterfaceC7913b interfaceC7913b) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.vk.push.core.hostinfo.MasterElections");
                    obtain.writeStrongInterface(interfaceC7913b);
                    this.f99324e.transact(4, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }
        }

        public static InterfaceC9792a H(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.vk.push.core.hostinfo.MasterElections");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof InterfaceC9792a)) ? new C2184a(iBinder) : (InterfaceC9792a) queryLocalInterface;
        }
    }

    void s(InterfaceC7913b interfaceC7913b) throws RemoteException;
}
