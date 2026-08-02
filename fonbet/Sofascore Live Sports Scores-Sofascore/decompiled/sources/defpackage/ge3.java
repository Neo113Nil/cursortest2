package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class ge3 implements u6b {
    public final y6b a = new y6b(this, true);
    public e6b b;
    public e6b c;

    public ge3() {
        e6b e6bVar = e6b.b;
        this.b = e6bVar;
        this.c = e6bVar;
    }

    public final void a() {
        e6b e6bVar = this.b.ordinal() < this.c.ordinal() ? this.b : this.c;
        y6b y6bVar = this.a;
        if (y6bVar.i == e6b.b && e6bVar == e6b.a) {
            return;
        }
        y6bVar.i(e6bVar);
    }

    @Override // defpackage.u6b
    public final g6b getLifecycle() {
        return this.a;
    }
}
