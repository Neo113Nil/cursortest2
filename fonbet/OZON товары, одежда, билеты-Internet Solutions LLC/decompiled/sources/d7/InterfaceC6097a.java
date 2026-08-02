package d7;

import P6.b;
import P6.c;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;

/* renamed from: d7.a, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public interface InterfaceC6097a extends IInterface {

    /* renamed from: d7.a$a, reason: collision with other inner class name */
    public static abstract class AbstractBinderC0947a extends b implements InterfaceC6097a {

        /* renamed from: d7.a$a$a, reason: collision with other inner class name */
        public static class C0948a extends P6.a implements InterfaceC6097a {
            C0948a(IBinder iBinder) {
                super(iBinder);
            }

            @Override // d7.InterfaceC6097a
            public final Bundle e(Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                obtain.writeInterfaceToken("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
                int i11 = c.f21876a;
                obtain.writeInt(1);
                bundle.writeToParcel(obtain, 0);
                Parcel H11 = H(obtain);
                Bundle bundle2 = (Bundle) (H11.readInt() == 0 ? null : (Parcelable) Bundle.CREATOR.createFromParcel(H11));
                H11.recycle();
                return bundle2;
            }
        }

        public static InterfaceC6097a H(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
            return queryLocalInterface instanceof InterfaceC6097a ? (InterfaceC6097a) queryLocalInterface : new C0948a(iBinder);
        }
    }

    Bundle e(Bundle bundle) throws RemoteException;
}
