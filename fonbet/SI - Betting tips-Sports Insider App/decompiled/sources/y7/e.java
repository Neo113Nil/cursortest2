package y7;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class e implements g, IInterface {

    /* renamed from: a, reason: collision with root package name */
    public final IBinder f25693a;

    public e(IBinder iBinder) {
        this.f25693a = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f25693a;
    }

    @Override // y7.g
    public final void o(String str, Bundle bundle, com.google.android.play.core.appupdate.i iVar) {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken("com.google.android.play.core.appupdate.protocol.IAppUpdateService");
        obtain.writeString(str);
        int i5 = d.f25692a;
        obtain.writeInt(1);
        bundle.writeToParcel(obtain, 0);
        obtain.writeStrongBinder(iVar);
        try {
            this.f25693a.transact(3, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override // y7.g
    public final void z(String str, Bundle bundle, com.google.android.play.core.appupdate.j jVar) {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken("com.google.android.play.core.appupdate.protocol.IAppUpdateService");
        obtain.writeString(str);
        int i5 = d.f25692a;
        obtain.writeInt(1);
        bundle.writeToParcel(obtain, 0);
        obtain.writeStrongBinder(jVar);
        try {
            this.f25693a.transact(2, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }
}
