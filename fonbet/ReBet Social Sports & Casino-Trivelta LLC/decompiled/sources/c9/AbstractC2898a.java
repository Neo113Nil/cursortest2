package c9;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: c9.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2898a implements IInterface {

    /* renamed from: a, reason: collision with root package name */
    public final IBinder f27624a;

    /* renamed from: b, reason: collision with root package name */
    public final String f27625b = "com.google.android.finsky.externalreferrer.IGetInstallReferrerService";

    public AbstractC2898a(IBinder iBinder) {
        this.f27624a = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f27624a;
    }

    public final Parcel c() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f27625b);
        return obtain;
    }

    public final Parcel g(Parcel parcel) {
        Parcel obtain = Parcel.obtain();
        try {
            try {
                this.f27624a.transact(1, parcel, obtain, 0);
                obtain.readException();
                return obtain;
            } catch (RuntimeException e10) {
                obtain.recycle();
                throw e10;
            }
        } finally {
            parcel.recycle();
        }
    }
}
