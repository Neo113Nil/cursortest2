package com.fyber.inneractive.sdk.web;

import com.fyber.inneractive.sdk.ui.IAmraidWebViewController;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class f0 implements f {
    public final com.fyber.inneractive.sdk.mraid.e a;
    public final /* synthetic */ i0 b;

    public f0(i0 i0Var, com.fyber.inneractive.sdk.mraid.e eVar) {
        this.b = i0Var;
        this.a = eVar;
    }

    @Override // com.fyber.inneractive.sdk.web.f
    public final String a() {
        return this.a.c();
    }

    @Override // com.fyber.inneractive.sdk.web.f
    public final void b() {
        com.fyber.inneractive.sdk.mraid.e eVar = this.a;
        if (eVar != null) {
            eVar.d();
        }
    }

    @Override // com.fyber.inneractive.sdk.web.f
    public final String c() {
        return this.a.a;
    }

    @Override // com.fyber.inneractive.sdk.web.f
    public final void d() {
        com.fyber.inneractive.sdk.measurement.tracker.e eVar = ((IAmraidWebViewController) this.b).I;
        if (eVar != null) {
            eVar.a();
        }
        this.a.a();
    }

    public final String toString() {
        return "action = " + this.a.a + " url = " + this.a.c();
    }
}
