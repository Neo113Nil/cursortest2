package defpackage;

import kotlin.Unit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class mdi extends sdi {
    public c7 c;
    public int d;
    public int e;

    public mdi(long j, c7 c7Var) {
        super(j);
        this.c = c7Var;
    }

    @Override // defpackage.sdi
    public final void a(sdi sdiVar) {
        synchronized (j72.f) {
            sdiVar.getClass();
            this.c = ((mdi) sdiVar).c;
            this.d = ((mdi) sdiVar).d;
            this.e = ((mdi) sdiVar).e;
            Unit unit = Unit.a;
        }
    }

    @Override // defpackage.sdi
    public final sdi b() {
        return c(snh.h().g());
    }

    @Override // defpackage.sdi
    public final sdi c(long j) {
        return new mdi(j, this.c);
    }
}
