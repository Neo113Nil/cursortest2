package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class r8a implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ yih b;

    public /* synthetic */ r8a(yih yihVar, int i) {
        this.a = i;
        this.b = yihVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                yih yihVar = this.b;
                t8a t8aVar = (t8a) yihVar.d;
                t8aVar.n = null;
                if (t8aVar.x == null) {
                    p8a p8aVar = t8aVar.u;
                    p8a p8aVar2 = (p8a) yihVar.c;
                    if (p8aVar == p8aVar2) {
                        t8aVar.v = p8aVar2;
                        t8a t8aVar2 = (t8a) this.b.d;
                        t8aVar2.u = null;
                        t8aVar2.e(rk3.b);
                        break;
                    }
                } else {
                    z1a.D("Unexpected non-null activeTransport", t8aVar.v == null);
                    yih yihVar2 = this.b;
                    ((p8a) yihVar2.c).a(((t8a) yihVar2.d).x);
                    break;
                }
                break;
            default:
                yih yihVar3 = this.b;
                ((t8a) yihVar3.d).s.remove((p8a) yihVar3.c);
                if (((t8a) this.b.d).w.a == rk3.e && ((t8a) this.b.d).s.isEmpty()) {
                    t8a t8aVar3 = (t8a) this.b.d;
                    t8aVar3.k.execute(new n8a(t8aVar3, 2));
                    break;
                }
                break;
        }
    }
}
