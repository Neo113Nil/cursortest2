package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class aoh extends sdi {
    public long c;

    public aoh(long j, long j2) {
        super(j);
        this.c = j2;
    }

    @Override // defpackage.sdi
    public final void a(sdi sdiVar) {
        sdiVar.getClass();
        this.c = ((aoh) sdiVar).c;
    }

    @Override // defpackage.sdi
    public final sdi b() {
        return c(snh.h().g());
    }

    @Override // defpackage.sdi
    public final sdi c(long j) {
        return new aoh(j, this.c);
    }
}
