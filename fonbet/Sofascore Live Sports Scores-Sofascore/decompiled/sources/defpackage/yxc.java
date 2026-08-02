package defpackage;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class yxc extends Binder implements qm9 {
    public final /* synthetic */ rqa a;

    public yxc(rqa rqaVar) {
        this.a = rqaVar;
        attachInterface(this, qm9.t7);
    }

    @Override // defpackage.qm9
    public final void k0(String[] strArr) {
        strArr.getClass();
        rqa rqaVar = this.a;
        xw3.L((ku3) rqaVar.e, null, null, new j8c(strArr, rqaVar, (rq3) null, 7), 3);
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        String str = qm9.t7;
        if (i >= 1 && i <= 16777215) {
            parcel.enforceInterface(str);
        }
        if (i == 1598968902) {
            parcel2.writeString(str);
            return true;
        }
        if (i != 1) {
            return super.onTransact(i, parcel, parcel2, i2);
        }
        k0(parcel.createStringArray());
        return true;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }
}
