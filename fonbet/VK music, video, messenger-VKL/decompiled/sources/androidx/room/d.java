package androidx.room;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import androidx.room.MultiInstanceInvalidationService;
import androidx.room.c;
import io.jsonwebtoken.JwtParser;

/* compiled from: IMultiInstanceInvalidationService.java */
/* loaded from: classes12.dex */
public interface d extends IInterface {
    public static final String d = "androidx$room$IMultiInstanceInvalidationService".replace('$', JwtParser.SEPARATOR_CHAR);

    int i0(c cVar, String str) throws RemoteException;

    void o1(int i, String[] strArr) throws RemoteException;

    void s0(c cVar, int i) throws RemoteException;

    /* compiled from: IMultiInstanceInvalidationService.java */
    public static abstract class a extends Binder implements d {
        public static final /* synthetic */ int a = 0;

        /* compiled from: IMultiInstanceInvalidationService.java */
        /* renamed from: androidx.room.d$a$a, reason: collision with other inner class name */
        public static class C0088a implements d {
            public IBinder a;

            @Override // android.os.IInterface
            public final IBinder asBinder() {
                return this.a;
            }

            @Override // androidx.room.d
            public final int i0(c cVar, String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(d.d);
                    obtain.writeStrongInterface(cVar);
                    obtain.writeString(str);
                    this.a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // androidx.room.d
            public final void o1(int i, String[] strArr) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(d.d);
                    obtain.writeInt(i);
                    obtain.writeStringArray(strArr);
                    this.a.transact(3, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // androidx.room.d
            public final void s0(c cVar, int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(d.d);
                    obtain.writeStrongInterface(cVar);
                    obtain.writeInt(i);
                    this.a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        @Override // android.os.Binder
        public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            String str = d.d;
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(str);
            }
            if (i == 1598968902) {
                parcel2.writeString(str);
                return true;
            }
            c cVar = null;
            c cVar2 = null;
            if (i == 1) {
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface(c.c);
                    if (queryLocalInterface == null || !(queryLocalInterface instanceof c)) {
                        c.a.C0085a c0085a = new c.a.C0085a();
                        c0085a.a = readStrongBinder;
                        cVar = c0085a;
                    } else {
                        cVar = (c) queryLocalInterface;
                    }
                }
                int i0 = ((MultiInstanceInvalidationService.a) this).i0(cVar, parcel.readString());
                parcel2.writeNoException();
                parcel2.writeInt(i0);
                return true;
            }
            if (i != 2) {
                if (i != 3) {
                    return super.onTransact(i, parcel, parcel2, i2);
                }
                ((MultiInstanceInvalidationService.a) this).o1(parcel.readInt(), parcel.createStringArray());
                return true;
            }
            IBinder readStrongBinder2 = parcel.readStrongBinder();
            if (readStrongBinder2 != null) {
                IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface(c.c);
                if (queryLocalInterface2 == null || !(queryLocalInterface2 instanceof c)) {
                    c.a.C0085a c0085a2 = new c.a.C0085a();
                    c0085a2.a = readStrongBinder2;
                    cVar2 = c0085a2;
                } else {
                    cVar2 = (c) queryLocalInterface2;
                }
            }
            ((MultiInstanceInvalidationService.a) this).s0(cVar2, parcel.readInt());
            parcel2.writeNoException();
            return true;
        }

        @Override // android.os.IInterface
        public final IBinder asBinder() {
            return this;
        }
    }
}
