package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class o6p implements Runnable {
    public final t6p a;
    public final ddb b;

    public o6p(t6p t6pVar, ddb ddbVar) {
        this.a = t6pVar;
        this.b = ddbVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.a.a != this) {
            return;
        }
        ddb ddbVar = this.b;
        if (z6p.g.g(this.a, this, t6p.h(ddbVar))) {
            t6p.n(this.a, false);
        }
    }
}
