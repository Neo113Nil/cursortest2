package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class ynh extends sdi {
    public int c;

    public ynh(long j, int i) {
        super(j);
        this.c = i;
    }

    @Override // defpackage.sdi
    public final void a(sdi sdiVar) {
        sdiVar.getClass();
        this.c = ((ynh) sdiVar).c;
    }

    @Override // defpackage.sdi
    public final sdi b() {
        return c(snh.h().g());
    }

    @Override // defpackage.sdi
    public final sdi c(long j) {
        return new ynh(j, this.c);
    }
}
