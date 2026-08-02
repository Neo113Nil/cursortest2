package g;

import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.text.Typography;

/* renamed from: g.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC4311a extends IInterface {

    /* renamed from: K4, reason: collision with root package name */
    public static final String f46819K4 = "android$support$customtabs$ICustomTabsCallback".replace(Typography.dollar, '.');

    /* renamed from: g.a$b */
    public static class b {
        public static Object c(Parcel parcel, Parcelable.Creator creator) {
            if (parcel.readInt() != 0) {
                return creator.createFromParcel(parcel);
            }
            return null;
        }

        public static void d(Parcel parcel, Parcelable parcelable, int i10) {
            if (parcelable == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcelable.writeToParcel(parcel, i10);
            }
        }
    }

    void C0(String str, Bundle bundle);

    void G0(Bundle bundle);

    void I0(int i10, Uri uri, boolean z10, Bundle bundle);

    void O(String str, Bundle bundle);

    void P(Bundle bundle);

    void g0(Bundle bundle);

    void j0(Bundle bundle);

    void m0(int i10, int i11, Bundle bundle);

    void q(int i10, int i11, int i12, int i13, int i14, Bundle bundle);

    void v0(int i10, Bundle bundle);

    Bundle y(String str, Bundle bundle);

    /* renamed from: g.a$a, reason: collision with other inner class name */
    public static abstract class AbstractBinderC0678a extends Binder implements InterfaceC4311a {
        public AbstractBinderC0678a() {
            attachInterface(this, InterfaceC4311a.f46819K4);
        }

        @Override // android.os.Binder
        public boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) {
            String str = InterfaceC4311a.f46819K4;
            if (i10 >= 1 && i10 <= 16777215) {
                parcel.enforceInterface(str);
            }
            if (i10 == 1598968902) {
                parcel2.writeString(str);
                return true;
            }
            switch (i10) {
                case 2:
                    v0(parcel.readInt(), (Bundle) b.c(parcel, Bundle.CREATOR));
                    return true;
                case 3:
                    O(parcel.readString(), (Bundle) b.c(parcel, Bundle.CREATOR));
                    return true;
                case 4:
                    G0((Bundle) b.c(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    return true;
                case 5:
                    C0(parcel.readString(), (Bundle) b.c(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    return true;
                case 6:
                    I0(parcel.readInt(), (Uri) b.c(parcel, Uri.CREATOR), parcel.readInt() != 0, (Bundle) b.c(parcel, Bundle.CREATOR));
                    return true;
                case 7:
                    Bundle y10 = y(parcel.readString(), (Bundle) b.c(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    b.d(parcel2, y10, 1);
                    return true;
                case 8:
                    m0(parcel.readInt(), parcel.readInt(), (Bundle) b.c(parcel, Bundle.CREATOR));
                    return true;
                case 9:
                    P((Bundle) b.c(parcel, Bundle.CREATOR));
                    return true;
                case 10:
                    q(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), (Bundle) b.c(parcel, Bundle.CREATOR));
                    return true;
                case 11:
                    g0((Bundle) b.c(parcel, Bundle.CREATOR));
                    return true;
                case 12:
                    j0((Bundle) b.c(parcel, Bundle.CREATOR));
                    return true;
                default:
                    return super.onTransact(i10, parcel, parcel2, i11);
            }
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }
    }
}
