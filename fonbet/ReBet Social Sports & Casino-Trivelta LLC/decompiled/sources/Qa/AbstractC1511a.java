package Qa;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: Qa.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC1511a implements IInterface {

    /* renamed from: a, reason: collision with root package name */
    public final IBinder f9570a;

    /* renamed from: b, reason: collision with root package name */
    public final String f9571b;

    public AbstractC1511a(IBinder iBinder, String str) {
        this.f9570a = iBinder;
        this.f9571b = str;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f9570a;
    }

    public final Parcel c() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f9571b);
        return obtain;
    }

    public final void g(int i10, Parcel parcel) {
        try {
            this.f9570a.transact(i10, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }
}
