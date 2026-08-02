package Oa;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes3.dex */
public abstract class a implements IInterface {

    /* renamed from: a, reason: collision with root package name */
    public final IBinder f8579a;

    /* renamed from: b, reason: collision with root package name */
    public final String f8580b = "com.google.android.play.core.inappreview.protocol.IInAppReviewService";

    public a(IBinder iBinder, String str) {
        this.f8579a = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f8579a;
    }

    public final Parcel c() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f8580b);
        return obtain;
    }

    public final void g(int i10, Parcel parcel) {
        try {
            this.f8579a.transact(2, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }
}
