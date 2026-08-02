package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class x6b {
    public e6b a;
    public p6b b;

    public final void a(u6b u6bVar, d6b d6bVar) {
        e6b d = d6bVar.d();
        e6b e6bVar = this.a;
        if (d.compareTo(e6bVar) < 0) {
            e6bVar = d;
        }
        this.a = e6bVar;
        this.b.onStateChanged(u6bVar, d6bVar);
        this.a = d;
    }
}
