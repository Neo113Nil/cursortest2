package d8;

import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import com.android.billingclient.api.n0;
import java.util.Iterator;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class a extends o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ IBinder f8275b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ n0 f8276c;

    public a(n0 n0Var, IBinder iBinder) {
        this.f8276c = n0Var;
        this.f8275b = iBinder;
    }

    @Override // d8.o
    public final void b() {
        m kVar;
        c cVar = (c) this.f8276c.f4055b;
        cVar.f8288i.getClass();
        int i5 = l.f8300f;
        IBinder iBinder = this.f8275b;
        if (iBinder == null) {
            kVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.integrity.protocol.IIntegrityService");
            kVar = queryLocalInterface instanceof m ? (m) queryLocalInterface : new k(iBinder);
        }
        cVar.f8292n = kVar;
        n nVar = cVar.f8281b;
        nVar.a("linkToDeath", new Object[0]);
        try {
            cVar.f8292n.asBinder().linkToDeath(cVar.f8289k, 0);
        } catch (RemoteException e7) {
            Object[] objArr = new Object[0];
            nVar.getClass();
            if (Log.isLoggable("PlayCore", 6)) {
                Log.e("PlayCore", n.b(nVar.f8301a, "linkToDeath failed", objArr), e7);
            }
        }
        cVar.f8286g = false;
        Iterator it = cVar.f8283d.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
        cVar.f8283d.clear();
    }
}
