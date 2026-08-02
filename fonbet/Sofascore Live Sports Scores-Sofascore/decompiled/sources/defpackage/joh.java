package defpackage;

import kotlin.Unit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class joh extends sdi {
    public cee c;
    public int d;

    public joh(long j, cee ceeVar) {
        super(j);
        this.c = ceeVar;
    }

    @Override // defpackage.sdi
    public final void a(sdi sdiVar) {
        sdiVar.getClass();
        joh johVar = (joh) sdiVar;
        synchronized (zm2.i) {
            this.c = johVar.c;
            this.d = johVar.d;
            Unit unit = Unit.a;
        }
    }

    @Override // defpackage.sdi
    public final sdi b() {
        return new joh(snh.h().g(), this.c);
    }

    @Override // defpackage.sdi
    public final sdi c(long j) {
        return new joh(j, this.c);
    }
}
