package y7;

import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.android.billingclient.api.n0;
import java.util.Iterator;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class m extends k {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ IBinder f25704b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ n0 f25705c;

    public m(n0 n0Var, IBinder iBinder) {
        this.f25705c = n0Var;
        this.f25704b = iBinder;
    }

    @Override // y7.k
    public final void a() {
        g eVar;
        n nVar = (n) this.f25705c.f4055b;
        int i5 = f.f25694f;
        IBinder iBinder = this.f25704b;
        if (iBinder == null) {
            eVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.appupdate.protocol.IAppUpdateService");
            eVar = queryLocalInterface instanceof g ? (g) queryLocalInterface : new e(iBinder);
        }
        nVar.f25718m = eVar;
        com.android.billingclient.api.a aVar = nVar.f25708b;
        aVar.g("linkToDeath", new Object[0]);
        try {
            nVar.f25718m.asBinder().linkToDeath(nVar.j, 0);
        } catch (RemoteException e7) {
            aVar.f(e7, "linkToDeath failed", new Object[0]);
        }
        nVar.f25713g = false;
        Iterator it = nVar.f25710d.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
        nVar.f25710d.clear();
    }
}
