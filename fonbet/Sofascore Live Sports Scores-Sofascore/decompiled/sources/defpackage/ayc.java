package defpackage;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import androidx.room.MultiInstanceInvalidationService;
import kotlin.Unit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class ayc extends Binder implements sm9 {
    public static final /* synthetic */ int b = 0;
    public final /* synthetic */ MultiInstanceInvalidationService a;

    public ayc(MultiInstanceInvalidationService multiInstanceInvalidationService) {
        this.a = multiInstanceInvalidationService;
        attachInterface(this, sm9.u7);
    }

    @Override // defpackage.sm9
    public final void R1(int i, String[] strArr) {
        strArr.getClass();
        MultiInstanceInvalidationService multiInstanceInvalidationService = this.a;
        synchronized (multiInstanceInvalidationService.c) {
            try {
                String str = (String) multiInstanceInvalidationService.b.get(Integer.valueOf(i));
                if (str == null) {
                    return;
                }
                int beginBroadcast = multiInstanceInvalidationService.c.beginBroadcast();
                int i2 = 0;
                while (true) {
                    byc bycVar = multiInstanceInvalidationService.c;
                    if (i2 >= beginBroadcast) {
                        bycVar.finishBroadcast();
                        Unit unit = Unit.a;
                        return;
                    }
                    try {
                        Object broadcastCookie = bycVar.getBroadcastCookie(i2);
                        broadcastCookie.getClass();
                        Integer num = (Integer) broadcastCookie;
                        int intValue = num.intValue();
                        String str2 = (String) multiInstanceInvalidationService.b.get(num);
                        if (i != intValue && str.equals(str2)) {
                            try {
                                ((qm9) multiInstanceInvalidationService.c.getBroadcastItem(i2)).k0(strArr);
                                Unit unit2 = Unit.a;
                            } catch (RemoteException unused) {
                            }
                        }
                        i2++;
                    } catch (Throwable th) {
                        multiInstanceInvalidationService.c.finishBroadcast();
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // defpackage.sm9
    public final void Y3(qm9 qm9Var, int i) {
        qm9Var.getClass();
        MultiInstanceInvalidationService multiInstanceInvalidationService = this.a;
        synchronized (multiInstanceInvalidationService.c) {
            multiInstanceInvalidationService.c.unregister(qm9Var);
        }
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        String str = sm9.u7;
        if (i >= 1 && i <= 16777215) {
            parcel.enforceInterface(str);
        }
        if (i == 1598968902) {
            parcel2.writeString(str);
            return true;
        }
        qm9 qm9Var = null;
        qm9 qm9Var2 = null;
        if (i == 1) {
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder != null) {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface(qm9.t7);
                if (queryLocalInterface == null || !(queryLocalInterface instanceof qm9)) {
                    pm9 pm9Var = new pm9();
                    pm9Var.a = readStrongBinder;
                    qm9Var = pm9Var;
                } else {
                    qm9Var = (qm9) queryLocalInterface;
                }
            }
            int u0 = u0(qm9Var, parcel.readString());
            parcel2.writeNoException();
            parcel2.writeInt(u0);
            return true;
        }
        if (i != 2) {
            if (i != 3) {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            R1(parcel.readInt(), parcel.createStringArray());
            return true;
        }
        IBinder readStrongBinder2 = parcel.readStrongBinder();
        if (readStrongBinder2 != null) {
            IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface(qm9.t7);
            if (queryLocalInterface2 == null || !(queryLocalInterface2 instanceof qm9)) {
                pm9 pm9Var2 = new pm9();
                pm9Var2.a = readStrongBinder2;
                qm9Var2 = pm9Var2;
            } else {
                qm9Var2 = (qm9) queryLocalInterface2;
            }
        }
        Y3(qm9Var2, parcel.readInt());
        parcel2.writeNoException();
        return true;
    }

    @Override // defpackage.sm9
    public final int u0(qm9 qm9Var, String str) {
        qm9Var.getClass();
        int i = 0;
        if (str == null) {
            return 0;
        }
        MultiInstanceInvalidationService multiInstanceInvalidationService = this.a;
        synchronized (multiInstanceInvalidationService.c) {
            try {
                int i2 = multiInstanceInvalidationService.a + 1;
                multiInstanceInvalidationService.a = i2;
                if (multiInstanceInvalidationService.c.register(qm9Var, Integer.valueOf(i2))) {
                    multiInstanceInvalidationService.b.put(Integer.valueOf(i2), str);
                    i = i2;
                } else {
                    multiInstanceInvalidationService.a--;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return i;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }
}
