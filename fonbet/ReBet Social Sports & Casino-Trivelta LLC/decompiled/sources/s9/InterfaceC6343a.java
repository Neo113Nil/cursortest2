package s9;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import c9.AbstractBinderC2899b;
import c9.AbstractC2898a;
import c9.AbstractC2900c;

/* renamed from: s9.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public interface InterfaceC6343a extends IInterface {

    /* renamed from: s9.a$a, reason: collision with other inner class name */
    public static abstract class AbstractBinderC0901a extends AbstractBinderC2899b implements InterfaceC6343a {

        /* renamed from: s9.a$a$a, reason: collision with other inner class name */
        public static class C0902a extends AbstractC2898a implements InterfaceC6343a {
            public C0902a(IBinder iBinder) {
                super(iBinder);
            }

            @Override // s9.InterfaceC6343a
            public final Bundle c(Bundle bundle) {
                Parcel c10 = c();
                AbstractC2900c.b(c10, bundle);
                Parcel g10 = g(c10);
                Bundle bundle2 = (Bundle) AbstractC2900c.a(g10, Bundle.CREATOR);
                g10.recycle();
                return bundle2;
            }
        }

        public static InterfaceC6343a c(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
            return queryLocalInterface instanceof InterfaceC6343a ? (InterfaceC6343a) queryLocalInterface : new C0902a(iBinder);
        }
    }

    Bundle c(Bundle bundle);
}
