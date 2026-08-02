package androidx.room;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import androidx.room.g;
import io.jsonwebtoken.JwtParser;

/* compiled from: IMultiInstanceInvalidationCallback.java */
/* loaded from: classes12.dex */
public interface c extends IInterface {
    public static final String c = "androidx$room$IMultiInstanceInvalidationCallback".replace('$', JwtParser.SEPARATOR_CHAR);

    void x0(String[] strArr) throws RemoteException;

    /* compiled from: IMultiInstanceInvalidationCallback.java */
    public static abstract class a extends Binder implements c {

        /* compiled from: IMultiInstanceInvalidationCallback.java */
        /* renamed from: androidx.room.c$a$a, reason: collision with other inner class name */
        public static class C0085a implements c {
            public IBinder a;

            @Override // android.os.IInterface
            public final IBinder asBinder() {
                return this.a;
            }

            @Override // androidx.room.c
            public final void x0(String[] strArr) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(c.c);
                    obtain.writeStringArray(strArr);
                    this.a.transact(1, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }
        }

        @Override // android.os.Binder
        public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            String str = c.c;
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
            ((g.a) this).x0(parcel.createStringArray());
            return true;
        }

        @Override // android.os.IInterface
        public final IBinder asBinder() {
            return this;
        }
    }
}
