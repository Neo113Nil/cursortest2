package com.moloco.sdk.internal;

import com.moloco.sdk.j2;
import defpackage.mqi;
import defpackage.ypa;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class h {
    public final j2 a;
    public final com.moloco.sdk.internal.services.events.c b;
    public final com.moloco.sdk.internal.services.z c;
    public final mqi d = ypa.b(new com.moloco.sdk.acm.services.d(this, 2));

    public h(j2 j2Var, com.moloco.sdk.internal.services.events.c cVar, com.moloco.sdk.internal.services.z zVar) {
        this.a = j2Var;
        this.b = cVar;
        this.c = zVar;
    }

    public final boolean a() {
        return ((Boolean) this.d.getValue()).booleanValue();
    }
}
