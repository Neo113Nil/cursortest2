package com.fyber.inneractive.sdk.flow.nativead;

import com.fyber.inneractive.sdk.util.IAlog;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class o implements com.fyber.inneractive.sdk.click.o {
    public final /* synthetic */ i a;
    public final /* synthetic */ com.fyber.inneractive.sdk.util.g b;
    public final /* synthetic */ p c;

    public o(p pVar, i iVar, com.fyber.inneractive.sdk.util.g gVar) {
        this.c = pVar;
        this.a = iVar;
        this.b = gVar;
    }

    @Override // com.fyber.inneractive.sdk.click.o
    public final void a(com.fyber.inneractive.sdk.click.b bVar) {
        if (bVar.a == com.fyber.inneractive.sdk.click.q.FAILED) {
            p pVar = this.c;
            i iVar = this.a;
            String str = bVar.d;
            com.fyber.inneractive.sdk.util.g gVar = this.b;
            pVar.getClass();
            IAlog.f("%s : Trying to resolve fallback Link: %s", p.b, str);
            j jVar = (j) pVar.a;
            i iVar2 = jVar.a;
            if (iVar2 == null || iVar2 == iVar) {
                IAlog.a("%s : No valid link object, origin: %s", j.d, gVar);
                return;
            }
            p pVar2 = jVar.c;
            pVar2.getClass();
            com.fyber.inneractive.sdk.util.r.a.execute(new m(pVar2, iVar2, true, gVar));
        }
    }
}
