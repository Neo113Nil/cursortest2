package rl0;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import rl0.J;
import rl0.P;
import rl0.S;
import rl0.X;

/* loaded from: classes4.dex */
public interface F extends IInterface {

    public static abstract class a extends Binder implements F {

        /* renamed from: rl0.F$a$a, reason: collision with other inner class name */
        public static class C1431a implements F {

            /* renamed from: e, reason: collision with root package name */
            public final IBinder f83613e;

            public C1431a(IBinder iBinder) {
                this.f83613e = iBinder;
            }

            @Override // rl0.F
            public final void D(String str, P.a aVar) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("ru.vk.store.provider.appupdate.AppUpdateProvider");
                    obtain.writeString(str);
                    obtain.writeStrongInterface(aVar);
                    this.f83613e.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public final IBinder asBinder() {
                return this.f83613e;
            }

            @Override // rl0.F
            public final void i(String str, S.a aVar) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("ru.vk.store.provider.appupdate.AppUpdateProvider");
                    obtain.writeString(str);
                    obtain.writeStrongInterface(aVar);
                    this.f83613e.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // rl0.F
            public final void n(String str, Bundle bundle, X.a aVar) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("ru.vk.store.provider.appupdate.AppUpdateProvider");
                    obtain.writeString(str);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongInterface(aVar);
                    this.f83613e.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    obtain2.recycle();
                    obtain.recycle();
                } catch (Throwable th2) {
                    obtain2.recycle();
                    obtain.recycle();
                    throw th2;
                }
            }

            @Override // rl0.F
            public final void r(String str, J.a aVar) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("ru.vk.store.provider.appupdate.AppUpdateProvider");
                    obtain.writeString(str);
                    obtain.writeStrongInterface(aVar);
                    this.f83613e.transact(4, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public static F H(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("ru.vk.store.provider.appupdate.AppUpdateProvider");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof F)) ? new C1431a(iBinder) : (F) queryLocalInterface;
        }
    }

    void D(String str, P.a aVar);

    void i(String str, S.a aVar);

    void n(String str, Bundle bundle, X.a aVar);

    void r(String str, J.a aVar);
}
