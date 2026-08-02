package com.inmobi.media;

import defpackage.ate;
import defpackage.f1d;
import defpackage.joa;
import defpackage.ku3;
import defpackage.ypa;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class Rd extends AbstractC3873x2 {
    public final Td h;
    public final joa i;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Rd(ku3 ku3Var, S5 s5, f1d f1dVar) {
        super(ku3Var, r0, r3, f1dVar);
        ku3Var.getClass();
        s5.getClass();
        f1dVar.getClass();
        Tn tn = s5.a;
        Wn wn = s5.b;
        this.h = new Td(new C3532jo(wn.b, wn.c), this.g.c);
        this.i = ypa.b(new ate(this, 22));
    }

    public static final C3300ao a(Rd rd) {
        Td td = rd.h;
        td.getClass();
        return new C3300ao(new Ng(rd.a, new Pg(rd.b.a), td), new C3352co(rd.a, rd.b.d));
    }

    @Override // com.inmobi.media.AbstractC3873x2
    public final C3300ao c() {
        return (C3300ao) this.i.getValue();
    }
}
