package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class gqg implements p6b, AutoCloseable {
    public final String a;
    public final fqg b;
    public boolean c;

    public gqg(String str, fqg fqgVar) {
        this.a = str;
        this.b = fqgVar;
    }

    public final void f(nqg nqgVar, g6b g6bVar) {
        nqgVar.getClass();
        g6bVar.getClass();
        if (this.c) {
            a70.r("Already attached to lifecycleOwner");
            return;
        }
        this.c = true;
        g6bVar.a(this);
        nqgVar.c(this.a, (qb3) this.b.b.f);
    }

    @Override // defpackage.p6b
    public final void onStateChanged(u6b u6bVar, d6b d6bVar) {
        if (d6bVar == d6b.ON_DESTROY) {
            this.c = false;
            u6bVar.getLifecycle().d(this);
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
    }
}
