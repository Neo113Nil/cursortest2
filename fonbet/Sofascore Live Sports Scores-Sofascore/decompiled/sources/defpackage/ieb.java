package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class ieb extends jeb implements p6b {
    public final u6b e;
    public final /* synthetic */ keb f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ieb(keb kebVar, u6b u6bVar, skd skdVar) {
        super(kebVar, skdVar);
        this.f = kebVar;
        this.e = u6bVar;
    }

    @Override // defpackage.jeb
    public final void b() {
        this.e.getLifecycle().d(this);
    }

    @Override // defpackage.jeb
    public final boolean c(u6b u6bVar) {
        return this.e == u6bVar;
    }

    @Override // defpackage.jeb
    public final boolean d() {
        return this.e.getLifecycle().b().compareTo(e6b.d) >= 0;
    }

    @Override // defpackage.p6b
    public final void onStateChanged(u6b u6bVar, d6b d6bVar) {
        u6b u6bVar2 = this.e;
        e6b b = u6bVar2.getLifecycle().b();
        if (b == e6b.a) {
            this.f.i(this.a);
            return;
        }
        e6b e6bVar = null;
        while (e6bVar != b) {
            a(d());
            e6bVar = b;
            b = u6bVar2.getLifecycle().b();
        }
    }
}
