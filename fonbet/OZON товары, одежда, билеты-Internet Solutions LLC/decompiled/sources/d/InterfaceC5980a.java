package d;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: d.a, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public interface InterfaceC5980a extends IInterface {

    /* renamed from: d, reason: collision with root package name */
    public static final String f60768d = "android$support$v4$os$IResultReceiver".replace('$', '.');

    /* renamed from: d.a$a, reason: collision with other inner class name */
    public static abstract class AbstractBinderC0933a extends Binder implements InterfaceC5980a {

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ int f60769e = 0;

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: d.a$a$a, reason: collision with other inner class name */
        static class C0934a implements InterfaceC5980a {

            /* renamed from: e, reason: collision with root package name */
            private IBinder f60770e;

            C0934a(IBinder iBinder) {
                this.f60770e = iBinder;
            }

            @Override // android.os.IInterface
            public final IBinder asBinder() {
                return this.f60770e;
            }
        }

        @Override // android.os.IInterface
        public final IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public final boolean onTransact(int i11, Parcel parcel, Parcel parcel2, int i12) throws RemoteException {
            String str = InterfaceC5980a.f60768d;
            if (i11 >= 1 && i11 <= 16777215) {
                parcel.enforceInterface(str);
            }
            if (i11 == 1598968902) {
                parcel2.writeString(str);
                return true;
            }
            if (i11 != 1) {
                return super.onTransact(i11, parcel, parcel2, i12);
            }
            b.this.a(parcel.readInt(), (Bundle) (parcel.readInt() != 0 ? Bundle.CREATOR.createFromParcel(parcel) : null));
            return true;
        }
    }
}
