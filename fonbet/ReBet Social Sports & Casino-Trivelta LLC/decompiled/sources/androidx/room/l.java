package androidx.room;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import kotlin.text.Typography;

/* loaded from: classes.dex */
public interface l extends IInterface {

    /* renamed from: H4, reason: collision with root package name */
    public static final String f23376H4 = "androidx$room$IMultiInstanceInvalidationCallback".replace(Typography.dollar, '.');

    public static abstract class a extends Binder implements l {

        /* renamed from: androidx.room.l$a$a, reason: collision with other inner class name */
        public static class C0406a implements l {

            /* renamed from: a, reason: collision with root package name */
            public IBinder f23377a;

            public C0406a(IBinder iBinder) {
                this.f23377a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f23377a;
            }

            @Override // androidx.room.l
            public void r(String[] strArr) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(l.f23376H4);
                    obtain.writeStringArray(strArr);
                    this.f23377a.transact(1, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }
        }

        public a() {
            attachInterface(this, l.f23376H4);
        }

        public static l c(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(l.f23376H4);
            return (queryLocalInterface == null || !(queryLocalInterface instanceof l)) ? new C0406a(iBinder) : (l) queryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) {
            String str = l.f23376H4;
            if (i10 >= 1 && i10 <= 16777215) {
                parcel.enforceInterface(str);
            }
            if (i10 == 1598968902) {
                parcel2.writeString(str);
                return true;
            }
            if (i10 != 1) {
                return super.onTransact(i10, parcel, parcel2, i11);
            }
            r(parcel.createStringArray());
            return true;
        }
    }

    void r(String[] strArr);
}
