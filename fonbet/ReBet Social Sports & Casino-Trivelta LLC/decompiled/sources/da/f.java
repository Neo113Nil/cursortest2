package da;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.internal.InterfaceC3184h;
import com.google.android.gms.internal.base.zaa;
import com.google.android.gms.internal.base.zac;
import com.google.android.gms.signin.internal.zai;

/* loaded from: classes2.dex */
public final class f extends zaa implements IInterface {
    public f(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.signin.internal.ISignInService");
    }

    public final void c(int i10) {
        Parcel zaa = zaa();
        zaa.writeInt(i10);
        zac(7, zaa);
    }

    public final void g(InterfaceC3184h interfaceC3184h, int i10, boolean z10) {
        Parcel zaa = zaa();
        zac.zad(zaa, interfaceC3184h);
        zaa.writeInt(i10);
        zaa.writeInt(z10 ? 1 : 0);
        zac(9, zaa);
    }

    public final void i(zai zaiVar, e eVar) {
        Parcel zaa = zaa();
        zac.zac(zaa, zaiVar);
        zac.zad(zaa, eVar);
        zac(12, zaa);
    }
}
