package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class wnh extends sdi {
    public float c;

    public wnh(long j, float f) {
        super(j);
        this.c = f;
    }

    @Override // defpackage.sdi
    public final void a(sdi sdiVar) {
        sdiVar.getClass();
        this.c = ((wnh) sdiVar).c;
    }

    @Override // defpackage.sdi
    public final sdi b() {
        return c(snh.h().g());
    }

    @Override // defpackage.sdi
    public final sdi c(long j) {
        return new wnh(j, this.c);
    }
}
