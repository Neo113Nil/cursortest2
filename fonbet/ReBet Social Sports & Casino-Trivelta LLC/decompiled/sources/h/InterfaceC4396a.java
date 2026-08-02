package h;

import android.app.Notification;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.text.Typography;

/* renamed from: h.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC4396a extends IInterface {

    /* renamed from: M4, reason: collision with root package name */
    public static final String f47477M4 = "android$support$v4$app$INotificationSideChannel".replace(Typography.dollar, '.');

    /* renamed from: h.a$a, reason: collision with other inner class name */
    public static abstract class AbstractBinderC0709a extends Binder implements InterfaceC4396a {

        /* renamed from: h.a$a$a, reason: collision with other inner class name */
        public static class C0710a implements InterfaceC4396a {

            /* renamed from: a, reason: collision with root package name */
            public IBinder f47478a;

            public C0710a(IBinder iBinder) {
                this.f47478a = iBinder;
            }

            @Override // h.InterfaceC4396a
            public void H0(String str, int i10, String str2, Notification notification) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(InterfaceC4396a.f47477M4);
                    obtain.writeString(str);
                    obtain.writeInt(i10);
                    obtain.writeString(str2);
                    b.b(obtain, notification, 0);
                    this.f47478a.transact(1, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f47478a;
            }
        }

        public static InterfaceC4396a c(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(InterfaceC4396a.f47477M4);
            return (queryLocalInterface == null || !(queryLocalInterface instanceof InterfaceC4396a)) ? new C0710a(iBinder) : (InterfaceC4396a) queryLocalInterface;
        }
    }

    /* renamed from: h.a$b */
    public static class b {
        public static void b(Parcel parcel, Parcelable parcelable, int i10) {
            if (parcelable == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcelable.writeToParcel(parcel, i10);
            }
        }
    }

    void H0(String str, int i10, String str2, Notification notification);
}
