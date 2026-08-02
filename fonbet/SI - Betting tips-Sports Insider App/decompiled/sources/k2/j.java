package k2;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import androidx.room.MultiInstanceInvalidationService;
import io.sentry.android.core.w0;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class j extends Binder implements g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ MultiInstanceInvalidationService f18687a;

    public j(MultiInstanceInvalidationService multiInstanceInvalidationService) {
        this.f18687a = multiInstanceInvalidationService;
        attachInterface(this, g.f18664e);
    }

    @Override // k2.g
    public final void F(String[] tables, int i5) {
        Intrinsics.checkNotNullParameter(tables, "tables");
        MultiInstanceInvalidationService multiInstanceInvalidationService = this.f18687a;
        synchronized (multiInstanceInvalidationService.f2610c) {
            String str = (String) multiInstanceInvalidationService.f2609b.get(Integer.valueOf(i5));
            if (str == null) {
                w0.m("ROOM", "Remote invalidation client ID not registered");
                return;
            }
            int beginBroadcast = multiInstanceInvalidationService.f2610c.beginBroadcast();
            for (int i10 = 0; i10 < beginBroadcast; i10++) {
                try {
                    Object broadcastCookie = multiInstanceInvalidationService.f2610c.getBroadcastCookie(i10);
                    Intrinsics.checkNotNull(broadcastCookie, "null cannot be cast to non-null type kotlin.Int");
                    Integer num = (Integer) broadcastCookie;
                    int intValue = num.intValue();
                    String str2 = (String) multiInstanceInvalidationService.f2609b.get(num);
                    if (i5 != intValue && Intrinsics.areEqual(str, str2)) {
                        try {
                            ((f) multiInstanceInvalidationService.f2610c.getBroadcastItem(i10)).i(tables);
                            Unit unit = Unit.f19194a;
                        } catch (RemoteException e7) {
                            w0.n("ROOM", "Error invoking a remote callback", e7);
                        }
                    }
                } catch (Throwable th2) {
                    multiInstanceInvalidationService.f2610c.finishBroadcast();
                    throw th2;
                }
            }
            multiInstanceInvalidationService.f2610c.finishBroadcast();
            Unit unit2 = Unit.f19194a;
        }
    }

    public final int a(f callback, String str) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        int i5 = 0;
        if (str == null) {
            return 0;
        }
        MultiInstanceInvalidationService multiInstanceInvalidationService = this.f18687a;
        synchronized (multiInstanceInvalidationService.f2610c) {
            try {
                int i10 = multiInstanceInvalidationService.f2608a + 1;
                multiInstanceInvalidationService.f2608a = i10;
                if (multiInstanceInvalidationService.f2610c.register(callback, Integer.valueOf(i10))) {
                    multiInstanceInvalidationService.f2609b.put(Integer.valueOf(i10), str);
                    i5 = i10;
                } else {
                    multiInstanceInvalidationService.f2608a--;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return i5;
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i5, Parcel parcel, Parcel parcel2, int i10) {
        String str = g.f18664e;
        if (i5 >= 1 && i5 <= 16777215) {
            parcel.enforceInterface(str);
        }
        if (i5 == 1598968902) {
            parcel2.writeString(str);
            return true;
        }
        f fVar = null;
        f callback = null;
        if (i5 == 1) {
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder != null) {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface(f.f18659d);
                if (queryLocalInterface == null || !(queryLocalInterface instanceof f)) {
                    e eVar = new e();
                    eVar.f18654a = readStrongBinder;
                    fVar = eVar;
                } else {
                    fVar = (f) queryLocalInterface;
                }
            }
            int a7 = a(fVar, parcel.readString());
            parcel2.writeNoException();
            parcel2.writeInt(a7);
            return true;
        }
        if (i5 != 2) {
            if (i5 != 3) {
                return super.onTransact(i5, parcel, parcel2, i10);
            }
            F(parcel.createStringArray(), parcel.readInt());
            return true;
        }
        IBinder readStrongBinder2 = parcel.readStrongBinder();
        if (readStrongBinder2 != null) {
            IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface(f.f18659d);
            if (queryLocalInterface2 == null || !(queryLocalInterface2 instanceof f)) {
                e eVar2 = new e();
                eVar2.f18654a = readStrongBinder2;
                callback = eVar2;
            } else {
                callback = (f) queryLocalInterface2;
            }
        }
        int readInt = parcel.readInt();
        Intrinsics.checkNotNullParameter(callback, "callback");
        MultiInstanceInvalidationService multiInstanceInvalidationService = this.f18687a;
        synchronized (multiInstanceInvalidationService.f2610c) {
            multiInstanceInvalidationService.f2610c.unregister(callback);
        }
        parcel2.writeNoException();
        return true;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }
}
