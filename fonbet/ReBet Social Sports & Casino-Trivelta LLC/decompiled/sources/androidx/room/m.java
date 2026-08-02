package androidx.room;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import androidx.room.l;
import kotlin.text.Typography;

/* loaded from: classes.dex */
public interface m extends IInterface {

    /* renamed from: I4, reason: collision with root package name */
    public static final String f23378I4 = "androidx$room$IMultiInstanceInvalidationService".replace(Typography.dollar, '.');

    public static abstract class a extends Binder implements m {

        /* renamed from: androidx.room.m$a$a, reason: collision with other inner class name */
        public static class C0407a implements m {

            /* renamed from: a, reason: collision with root package name */
            public IBinder f23379a;

            public C0407a(IBinder iBinder) {
                this.f23379a = iBinder;
            }

            @Override // androidx.room.m
            public void J0(l lVar, int i10) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(m.f23378I4);
                    obtain.writeStrongInterface(lVar);
                    obtain.writeInt(i10);
                    this.f23379a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // androidx.room.m
            public void T(int i10, String[] strArr) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(m.f23378I4);
                    obtain.writeInt(i10);
                    obtain.writeStringArray(strArr);
                    this.f23379a.transact(3, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f23379a;
            }

            @Override // androidx.room.m
            public int d0(l lVar, String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(m.f23378I4);
                    obtain.writeStrongInterface(lVar);
                    obtain.writeString(str);
                    this.f23379a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public a() {
            attachInterface(this, m.f23378I4);
        }

        public static m c(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(m.f23378I4);
            return (queryLocalInterface == null || !(queryLocalInterface instanceof m)) ? new C0407a(iBinder) : (m) queryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) {
            String str = m.f23378I4;
            if (i10 >= 1 && i10 <= 16777215) {
                parcel.enforceInterface(str);
            }
            if (i10 == 1598968902) {
                parcel2.writeString(str);
                return true;
            }
            if (i10 == 1) {
                int d02 = d0(l.a.c(parcel.readStrongBinder()), parcel.readString());
                parcel2.writeNoException();
                parcel2.writeInt(d02);
            } else if (i10 == 2) {
                J0(l.a.c(parcel.readStrongBinder()), parcel.readInt());
                parcel2.writeNoException();
            } else {
                if (i10 != 3) {
                    return super.onTransact(i10, parcel, parcel2, i11);
                }
                T(parcel.readInt(), parcel.createStringArray());
            }
            return true;
        }
    }

    void J0(l lVar, int i10);

    void T(int i10, String[] strArr);

    int d0(l lVar, String str);
}
