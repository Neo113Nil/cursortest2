package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class u3p extends kyo {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ u3p(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // defpackage.kyo
    public final void a() {
        switch (this.b) {
            case 0:
                synchronized (((qbp) this.c).f) {
                    try {
                        if (((qbp) this.c).k.get() > 0 && ((qbp) this.c).k.decrementAndGet() > 0) {
                            ((qbp) this.c).b.f("Leaving the connection open for other ongoing calls.", new Object[0]);
                            return;
                        }
                        qbp qbpVar = (qbp) this.c;
                        if (qbpVar.m != null) {
                            qbpVar.b.f("Unbind from service.", new Object[0]);
                            qbp qbpVar2 = (qbp) this.c;
                            qbpVar2.a.unbindService(qbpVar2.l);
                            qbpVar = (qbp) this.c;
                            qbpVar.g = false;
                            qbpVar.m = null;
                            qbpVar.l = null;
                        }
                        qbpVar.d();
                        return;
                    } finally {
                    }
                }
            default:
                qbp qbpVar3 = (qbp) ((zxc) this.c).b;
                qbpVar3.b.f("unlinkToDeath", new Object[0]);
                qbpVar3.m.asBinder().unlinkToDeath(qbpVar3.j, 0);
                qbpVar3.m = null;
                qbpVar3.g = false;
                return;
        }
    }
}
