package k2;

import android.os.IBinder;
import android.os.Parcel;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class e implements f {

    /* renamed from: a, reason: collision with root package name */
    public IBinder f18654a;

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f18654a;
    }

    @Override // k2.f
    public final void i(String[] strArr) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(f.f18659d);
            obtain.writeStringArray(strArr);
            this.f18654a.transact(1, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }
}
