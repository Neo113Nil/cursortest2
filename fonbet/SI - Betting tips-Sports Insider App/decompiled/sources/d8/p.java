package d8;

import android.os.IBinder;
import android.os.RemoteException;
import java.util.Iterator;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final /* synthetic */ class p implements IBinder.DeathRecipient {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8303a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f8304b;

    public /* synthetic */ p(int i5, Object obj) {
        this.f8303a = i5;
        this.f8304b = obj;
    }

    private final void a() {
        c cVar = (c) this.f8304b;
        cVar.f8281b.a("reportBinderDeath", new Object[0]);
        if (cVar.j.get() != null) {
            throw new ClassCastException();
        }
        cVar.f8281b.a("%s : Binder has died.", cVar.f8282c);
        Iterator it = cVar.f8283d.iterator();
        while (it.hasNext()) {
            ((o) it.next()).a(new RemoteException(String.valueOf(cVar.f8282c).concat(" : Binder has died.")));
        }
        cVar.f8283d.clear();
        synchronized (cVar.f8285f) {
            cVar.c();
        }
    }

    @Override // android.os.IBinder.DeathRecipient
    public final void binderDied() {
        switch (this.f8303a) {
            case 0:
                a();
                return;
            default:
                y7.n nVar = (y7.n) this.f8304b;
                nVar.f25708b.g("reportBinderDeath", new Object[0]);
                if (nVar.f25715i.get() != null) {
                    throw new ClassCastException();
                }
                nVar.f25708b.g("%s : Binder has died.", nVar.f25709c);
                Iterator it = nVar.f25710d.iterator();
                while (it.hasNext()) {
                    y7.k kVar = (y7.k) it.next();
                    RemoteException remoteException = new RemoteException(String.valueOf(nVar.f25709c).concat(" : Binder has died."));
                    w7.g gVar = kVar.f25701a;
                    if (gVar != null) {
                        gVar.c(remoteException);
                    }
                }
                nVar.f25710d.clear();
                synchronized (nVar.f25712f) {
                    nVar.d();
                }
                return;
        }
    }
}
