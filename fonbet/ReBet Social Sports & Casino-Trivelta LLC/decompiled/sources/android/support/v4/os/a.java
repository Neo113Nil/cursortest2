package android.support.v4.os;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.text.Typography;

/* loaded from: classes.dex */
public interface a extends IInterface {

    /* renamed from: F4, reason: collision with root package name */
    public static final String f16325F4 = "android$support$v4$os$IResultReceiver".replace(Typography.dollar, '.');

    /* renamed from: android.support.v4.os.a$a, reason: collision with other inner class name */
    public static abstract class AbstractBinderC0336a extends Binder implements a {

        /* renamed from: android.support.v4.os.a$a$a, reason: collision with other inner class name */
        public static class C0337a implements a {

            /* renamed from: a, reason: collision with root package name */
            public IBinder f16326a;

            public C0337a(IBinder iBinder) {
                this.f16326a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f16326a;
            }
        }

        public AbstractBinderC0336a() {
            attachInterface(this, a.f16325F4);
        }

        public static a c(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(a.f16325F4);
            return (queryLocalInterface == null || !(queryLocalInterface instanceof a)) ? new C0337a(iBinder) : (a) queryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) {
            String str = a.f16325F4;
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
            W(parcel.readInt(), (Bundle) b.b(parcel, Bundle.CREATOR));
            return true;
        }
    }

    public static class b {
        public static Object b(Parcel parcel, Parcelable.Creator creator) {
            if (parcel.readInt() != 0) {
                return creator.createFromParcel(parcel);
            }
            return null;
        }
    }

    void W(int i10, Bundle bundle);
}
