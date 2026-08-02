package g;

import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import kotlin.text.Typography;

/* renamed from: g.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC4312b extends IInterface {

    /* renamed from: L4, reason: collision with root package name */
    public static final String f46820L4 = "android$support$customtabs$ICustomTabsService".replace(Typography.dollar, '.');

    /* renamed from: g.b$a */
    public static abstract class a extends Binder implements InterfaceC4312b {

        /* renamed from: g.b$a$a, reason: collision with other inner class name */
        public static class C0679a implements InterfaceC4312b {

            /* renamed from: a, reason: collision with root package name */
            public IBinder f46821a;

            public C0679a(IBinder iBinder) {
                this.f46821a = iBinder;
            }

            @Override // g.InterfaceC4312b
            public boolean E0(InterfaceC4311a interfaceC4311a) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(InterfaceC4312b.f46820L4);
                    obtain.writeStrongInterface(interfaceC4311a);
                    this.f46821a.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // g.InterfaceC4312b
            public boolean G(InterfaceC4311a interfaceC4311a, Bundle bundle) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(InterfaceC4312b.f46820L4);
                    obtain.writeStrongInterface(interfaceC4311a);
                    C0680b.d(obtain, bundle, 0);
                    this.f46821a.transact(10, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f46821a;
            }

            @Override // g.InterfaceC4312b
            public boolean f0(long j10) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(InterfaceC4312b.f46820L4);
                    obtain.writeLong(j10);
                    this.f46821a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // g.InterfaceC4312b
            public boolean o(InterfaceC4311a interfaceC4311a, Uri uri, Bundle bundle, List list) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(InterfaceC4312b.f46820L4);
                    obtain.writeStrongInterface(interfaceC4311a);
                    C0680b.d(obtain, uri, 0);
                    C0680b.d(obtain, bundle, 0);
                    C0680b.c(obtain, list, 0);
                    this.f46821a.transact(4, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public static InterfaceC4312b c(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(InterfaceC4312b.f46820L4);
            return (queryLocalInterface == null || !(queryLocalInterface instanceof InterfaceC4312b)) ? new C0679a(iBinder) : (InterfaceC4312b) queryLocalInterface;
        }
    }

    /* renamed from: g.b$b, reason: collision with other inner class name */
    public static class C0680b {
        public static void c(Parcel parcel, List list, int i10) {
            if (list == null) {
                parcel.writeInt(-1);
                return;
            }
            int size = list.size();
            parcel.writeInt(size);
            for (int i11 = 0; i11 < size; i11++) {
                d(parcel, (Parcelable) list.get(i11), i10);
            }
        }

        public static void d(Parcel parcel, Parcelable parcelable, int i10) {
            if (parcelable == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcelable.writeToParcel(parcel, i10);
            }
        }
    }

    boolean E0(InterfaceC4311a interfaceC4311a);

    boolean G(InterfaceC4311a interfaceC4311a, Bundle bundle);

    boolean f0(long j10);

    boolean o(InterfaceC4311a interfaceC4311a, Uri uri, Bundle bundle, List list);
}
