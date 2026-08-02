package nm0;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import nm0.j;
import nm0.o;

/* renamed from: nm0.C, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public interface InterfaceC8608C extends IInterface {

    /* renamed from: nm0.C$a */
    public static abstract class a extends Binder implements InterfaceC8608C {

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ int f77382e = 0;

        /* renamed from: nm0.C$a$a, reason: collision with other inner class name */
        public static class C1301a implements InterfaceC8608C {

            /* renamed from: e, reason: collision with root package name */
            public final IBinder f77383e;

            public C1301a(IBinder iBinder) {
                this.f77383e = iBinder;
            }

            @Override // nm0.InterfaceC8608C
            public final void A(Bundle bundle, String str, j.a aVar) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("ru.vk.store.provider.review.ReviewProvider");
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeString(str);
                    obtain.writeStrongInterface(aVar);
                    this.f77383e.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                    obtain2.recycle();
                    obtain.recycle();
                } catch (Throwable th2) {
                    obtain2.recycle();
                    obtain.recycle();
                    throw th2;
                }
            }

            @Override // android.os.IInterface
            public final IBinder asBinder() {
                return this.f77383e;
            }

            @Override // nm0.InterfaceC8608C
            public final void v(String str, o.a aVar) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("ru.vk.store.provider.review.ReviewProvider");
                    obtain.writeString(str);
                    obtain.writeStrongInterface(aVar);
                    this.f77383e.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }
    }

    void A(Bundle bundle, String str, j.a aVar);

    void v(String str, o.a aVar);
}
