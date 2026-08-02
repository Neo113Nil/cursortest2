package com.fyber.inneractive.sdk.config;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class p implements com.fyber.inneractive.sdk.network.f0 {
    public final /* synthetic */ s a;

    public p(s sVar) {
        this.a = sVar;
    }

    @Override // com.fyber.inneractive.sdk.network.f0
    public final void a(Object obj, Exception exc, boolean z) {
        o oVar = (o) obj;
        if (oVar != null) {
            s sVar = this.a;
            if (oVar.equals(sVar.b)) {
                return;
            }
            sVar.d = true;
            sVar.b = oVar;
            com.fyber.inneractive.sdk.util.r.a.execute(new q(sVar));
        }
    }
}
