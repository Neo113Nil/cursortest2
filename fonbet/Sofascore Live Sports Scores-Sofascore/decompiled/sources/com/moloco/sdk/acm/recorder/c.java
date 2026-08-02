package com.moloco.sdk.acm.recorder;

import com.facebook.c0;
import com.moloco.sdk.acm.d;
import com.moloco.sdk.acm.h;
import com.moloco.sdk.acm.k;
import defpackage.mqi;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class c implements b {
    public final String a;

    public c(String str) {
        this.a = str;
    }

    public final void a(d dVar) {
        dVar.getClass();
        String str = this.a;
        if (str == null || str.length() == 0) {
            com.moloco.sdk.acm.b bVar = com.moloco.sdk.acm.b.a;
            com.moloco.sdk.acm.b.a(dVar);
        } else {
            dVar.a("mediator", str);
            com.moloco.sdk.acm.b bVar2 = com.moloco.sdk.acm.b.a;
            com.moloco.sdk.acm.b.a(dVar);
        }
    }

    public final void b(h hVar) {
        hVar.getClass();
        String str = this.a;
        if (str == null || str.length() == 0) {
            com.moloco.sdk.acm.b bVar = com.moloco.sdk.acm.b.a;
            com.moloco.sdk.acm.b.b(hVar);
        } else {
            hVar.a("mediator", str);
            com.moloco.sdk.acm.b bVar2 = com.moloco.sdk.acm.b.a;
            com.moloco.sdk.acm.b.b(hVar);
        }
    }

    public final h c(String str) {
        if (com.moloco.sdk.acm.b.h.get() != k.a) {
            mqi mqiVar = com.moloco.sdk.acm.services.c.a;
            com.moloco.sdk.acm.services.c.b("AndroidClientMetrics", "Moloco Client Metrics not initialized");
        }
        h.Companion.getClass();
        c0 c0Var = new c0(new com.facebook.b(14));
        h hVar = new h(str, c0Var);
        ((AtomicLong) c0Var.b).set(System.currentTimeMillis());
        return hVar;
    }
}
