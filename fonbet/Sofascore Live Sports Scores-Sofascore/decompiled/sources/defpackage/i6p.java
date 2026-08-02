package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import java.util.Iterator;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class i6p extends kyo {
    public final /* synthetic */ IBinder b;
    public final /* synthetic */ zxc c;

    public i6p(zxc zxcVar, IBinder iBinder) {
        this.c = zxcVar;
        this.b = iBinder;
    }

    @Override // defpackage.kyo
    public final void a() {
        z6o uxnVar;
        qbp qbpVar = (qbp) this.c.b;
        int i = c2o.b;
        IBinder iBinder = this.b;
        if (iBinder == null) {
            uxnVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.appupdate.protocol.IAppUpdateService");
            uxnVar = queryLocalInterface instanceof z6o ? (z6o) queryLocalInterface : new uxn(iBinder);
        }
        qbpVar.m = uxnVar;
        f79 f79Var = qbpVar.b;
        f79Var.f("linkToDeath", new Object[0]);
        try {
            qbpVar.m.asBinder().linkToDeath(qbpVar.j, 0);
        } catch (RemoteException e) {
            f79Var.e(e, "linkToDeath failed", new Object[0]);
        }
        qbpVar.g = false;
        Iterator it = qbpVar.d.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
        qbpVar.d.clear();
    }
}
