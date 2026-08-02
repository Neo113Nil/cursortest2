package g8;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: g8.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public interface InterfaceC4365a extends IInterface {

    /* renamed from: g8.a$a, reason: collision with other inner class name */
    public static abstract class AbstractBinderC0685a extends Binder implements InterfaceC4365a {

        /* renamed from: g8.a$a$a, reason: collision with other inner class name */
        public static class C0686a implements InterfaceC4365a {

            /* renamed from: b, reason: collision with root package name */
            public static InterfaceC4365a f47139b;

            /* renamed from: a, reason: collision with root package name */
            public IBinder f47140a;

            public C0686a(IBinder iBinder) {
                this.f47140a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f47140a;
            }

            @Override // g8.InterfaceC4365a
            public int l(Bundle bundle) {
                int readInt;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.facebook.ppml.receiver.IReceiverService");
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (this.f47140a.transact(1, obtain, obtain2, 0) || AbstractBinderC0685a.g() == null) {
                        obtain2.readException();
                        readInt = obtain2.readInt();
                    } else {
                        readInt = AbstractBinderC0685a.g().l(bundle);
                    }
                    obtain2.recycle();
                    obtain.recycle();
                    return readInt;
                } catch (Throwable th2) {
                    obtain2.recycle();
                    obtain.recycle();
                    throw th2;
                }
            }
        }

        public static InterfaceC4365a c(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.facebook.ppml.receiver.IReceiverService");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof InterfaceC4365a)) ? new C0686a(iBinder) : (InterfaceC4365a) queryLocalInterface;
        }

        public static InterfaceC4365a g() {
            return C0686a.f47139b;
        }
    }

    int l(Bundle bundle);
}
