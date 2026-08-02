package jb;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import lb.InterfaceC7913b;

/* renamed from: jb.a, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public interface InterfaceC7332a extends IInterface {

    /* renamed from: jb.a$a, reason: collision with other inner class name */
    public static abstract class AbstractBinderC1134a extends Binder implements InterfaceC7332a {

        /* renamed from: jb.a$a$a, reason: collision with other inner class name */
        private static class C1135a implements InterfaceC7332a {

            /* renamed from: e, reason: collision with root package name */
            private IBinder f69654e;

            C1135a(IBinder iBinder) {
                this.f69654e = iBinder;
            }

            @Override // jb.InterfaceC7332a
            public final void B(InterfaceC7913b interfaceC7913b) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.vk.push.core.auth.Auth");
                    obtain.writeStrongInterface(interfaceC7913b);
                    this.f69654e.transact(3, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public final IBinder asBinder() {
                return this.f69654e;
            }

            @Override // jb.InterfaceC7332a
            public final void t(InterfaceC7913b interfaceC7913b) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.vk.push.core.auth.Auth");
                    obtain.writeStrongInterface(interfaceC7913b);
                    this.f69654e.transact(2, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }
        }

        public static InterfaceC7332a H(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.vk.push.core.auth.Auth");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof InterfaceC7332a)) ? new C1135a(iBinder) : (InterfaceC7332a) queryLocalInterface;
        }
    }

    void B(InterfaceC7913b interfaceC7913b) throws RemoteException;

    void t(InterfaceC7913b interfaceC7913b) throws RemoteException;
}
