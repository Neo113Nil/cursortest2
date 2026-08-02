package y7;

import com.android.billingclient.api.n0;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class l extends k {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f25702b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f25703c;

    public /* synthetic */ l(int i5, Object obj) {
        this.f25702b = i5;
        this.f25703c = obj;
    }

    @Override // y7.k
    public final void a() {
        switch (this.f25702b) {
            case 0:
                synchronized (((n) this.f25703c).f25712f) {
                    try {
                        if (((n) this.f25703c).f25716k.get() > 0 && ((n) this.f25703c).f25716k.decrementAndGet() > 0) {
                            ((n) this.f25703c).f25708b.g("Leaving the connection open for other ongoing calls.", new Object[0]);
                            return;
                        }
                        n nVar = (n) this.f25703c;
                        if (nVar.f25718m != null) {
                            nVar.f25708b.g("Unbind from service.", new Object[0]);
                            n nVar2 = (n) this.f25703c;
                            nVar2.f25707a.unbindService(nVar2.f25717l);
                            n nVar3 = (n) this.f25703c;
                            nVar3.f25713g = false;
                            nVar3.f25718m = null;
                            nVar3.f25717l = null;
                        }
                        ((n) this.f25703c).d();
                        return;
                    } finally {
                    }
                }
            default:
                n nVar4 = (n) ((n0) this.f25703c).f4055b;
                nVar4.f25708b.g("unlinkToDeath", new Object[0]);
                nVar4.f25718m.asBinder().unlinkToDeath(nVar4.j, 0);
                nVar4.f25718m = null;
                nVar4.f25713g = false;
                return;
        }
    }
}
