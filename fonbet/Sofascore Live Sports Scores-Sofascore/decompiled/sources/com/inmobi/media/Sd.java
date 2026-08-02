package com.inmobi.media;

import defpackage.f1d;
import defpackage.ku3;
import defpackage.z88;
import defpackage.zzl;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class Sd implements G8 {
    public final G8 a;

    public Sd(ku3 ku3Var, AbstractC3495ic abstractC3495ic, f1d f1dVar) {
        G8 wd;
        ku3Var.getClass();
        abstractC3495ic.getClass();
        f1dVar.getClass();
        ku3Var.getClass();
        abstractC3495ic.getClass();
        f1dVar.getClass();
        if (abstractC3495ic instanceof S5) {
            wd = new Rd(ku3Var, (S5) abstractC3495ic, f1dVar);
        } else {
            if (!(abstractC3495ic instanceof C3609mn)) {
                zzl.b();
                throw null;
            }
            wd = new Wd((C3609mn) abstractC3495ic);
        }
        this.a = wd;
    }

    @Override // com.inmobi.media.G8
    public final void a() {
        this.a.a();
    }

    @Override // com.inmobi.media.G8
    public final z88 b() {
        return this.a.b();
    }
}
