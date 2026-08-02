package c;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import android.support.v4.os.ResultReceiver;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class c extends Binder implements b {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f3229f = 0;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ResultReceiver f3230a;

    public c(ResultReceiver resultReceiver) {
        this.f3230a = resultReceiver;
        attachInterface(this, b.f3228c);
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i5, Parcel parcel, Parcel parcel2, int i10) {
        String str = b.f3228c;
        if (i5 >= 1 && i5 <= 16777215) {
            parcel.enforceInterface(str);
        }
        if (i5 == 1598968902) {
            parcel2.writeString(str);
            return true;
        }
        if (i5 != 1) {
            return super.onTransact(i5, parcel, parcel2, i10);
        }
        parcel.readInt();
        this.f3230a.getClass();
        return true;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }
}
