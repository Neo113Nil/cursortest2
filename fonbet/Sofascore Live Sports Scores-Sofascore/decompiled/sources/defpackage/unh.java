package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class unh extends sdi {
    public double c;

    public unh(long j, double d) {
        super(j);
        this.c = d;
    }

    @Override // defpackage.sdi
    public final void a(sdi sdiVar) {
        sdiVar.getClass();
        this.c = ((unh) sdiVar).c;
    }

    @Override // defpackage.sdi
    public final sdi b() {
        return c(this.a);
    }

    @Override // defpackage.sdi
    public final sdi c(long j) {
        return new unh(j, this.c);
    }
}
