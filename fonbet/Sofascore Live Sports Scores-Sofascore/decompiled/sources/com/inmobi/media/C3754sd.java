package com.inmobi.media;

import defpackage.f1d;
import defpackage.joa;
import defpackage.ku3;
import defpackage.ndk;
import defpackage.ypa;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.inmobi.media.sd, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3754sd extends AbstractC3873x2 {
    public final C3780td h;
    public final joa i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3754sd(ku3 ku3Var, Tn tn, Wn wn, f1d f1dVar) {
        super(ku3Var, tn, wn, f1dVar);
        ku3Var.getClass();
        tn.getClass();
        wn.getClass();
        f1dVar.getClass();
        this.h = new C3780td(new C3532jo(wn.b, wn.c), this.g.c);
        this.i = ypa.b(new ndk(this, 23));
    }

    public static final C3300ao a(C3754sd c3754sd) {
        C3780td c3780td = c3754sd.h;
        c3780td.getClass();
        return new C3300ao(new Ng(c3754sd.a, new Pg(c3754sd.b.a), c3780td), new C3352co(c3754sd.a, c3754sd.b.d));
    }

    @Override // com.inmobi.media.AbstractC3873x2
    public final C3300ao c() {
        return (C3300ao) this.i.getValue();
    }
}
