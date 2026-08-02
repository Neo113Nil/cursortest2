package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class opd extends h8d {
    public final ppd h;
    public boolean i;

    public opd(ppd ppdVar, qpd qpdVar) {
        super(qpdVar, ppdVar.b, 0);
        this.h = ppdVar;
        this.i = true;
    }

    @Override // defpackage.h8d
    public final void a() {
        this.h.a();
    }

    @Override // defpackage.h8d
    public final void b() {
        this.h.b();
    }

    @Override // defpackage.h8d
    public final void c(e8d e8dVar) {
        this.h.c(new nx0(e8dVar));
    }

    @Override // defpackage.h8d
    public final void d(e8d e8dVar) {
        e8dVar.getClass();
        this.h.d(new nx0(e8dVar));
    }

    public final void h(boolean z) {
        this.i = z;
        g(z && this.h.b);
    }
}
