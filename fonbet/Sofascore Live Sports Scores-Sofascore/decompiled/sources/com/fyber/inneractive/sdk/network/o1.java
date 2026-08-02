package com.fyber.inneractive.sdk.network;

import defpackage.d2g;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class o1 extends l {
    public final d2g g;

    public o1(l lVar, d2g d2gVar) {
        this.g = d2gVar;
        this.d = lVar.d;
        this.c = lVar.c;
        this.e = lVar.e;
        this.a = lVar.a;
    }

    @Override // com.fyber.inneractive.sdk.network.l
    public final void a() {
        super.a();
        d2g d2gVar = this.g;
        if (d2gVar != null) {
            d2gVar.close();
        }
    }
}
