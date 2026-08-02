package d8;

import com.android.billingclient.api.n0;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class b extends o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f8277b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f8278c;

    public /* synthetic */ b(int i5, Object obj) {
        this.f8277b = i5;
        this.f8278c = obj;
    }

    @Override // d8.o
    public final void b() {
        switch (this.f8277b) {
            case 0:
                c cVar = (c) ((n0) this.f8278c).f4055b;
                cVar.f8281b.a("unlinkToDeath", new Object[0]);
                cVar.f8292n.asBinder().unlinkToDeath(cVar.f8289k, 0);
                cVar.f8292n = null;
                cVar.f8286g = false;
                return;
            default:
                synchronized (((c) this.f8278c).f8285f) {
                    try {
                        if (((c) this.f8278c).f8290l.get() > 0 && ((c) this.f8278c).f8290l.decrementAndGet() > 0) {
                            ((c) this.f8278c).f8281b.a("Leaving the connection open for other ongoing calls.", new Object[0]);
                            return;
                        }
                        c cVar2 = (c) this.f8278c;
                        if (cVar2.f8292n != null) {
                            cVar2.f8281b.a("Unbind from service.", new Object[0]);
                            c cVar3 = (c) this.f8278c;
                            cVar3.f8280a.unbindService(cVar3.f8291m);
                            c cVar4 = (c) this.f8278c;
                            cVar4.f8286g = false;
                            cVar4.f8292n = null;
                            cVar4.f8291m = null;
                        }
                        ((c) this.f8278c).c();
                        return;
                    } finally {
                    }
                }
        }
    }
}
