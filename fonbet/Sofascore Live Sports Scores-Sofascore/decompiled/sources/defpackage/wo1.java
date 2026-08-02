package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class wo1 implements pnd {
    public final /* synthetic */ int a;
    public final /* synthetic */ lcj b;

    public /* synthetic */ wo1(lcj lcjVar, int i) {
        this.a = i;
        this.b = lcjVar;
    }

    @Override // defpackage.pnd
    public final long a() {
        switch (this.a) {
            case 0:
                return this.b.j(true).b;
            case 1:
                return this.b.p(true, true).b;
            default:
                return this.b.p(false, true).b;
        }
    }
}
