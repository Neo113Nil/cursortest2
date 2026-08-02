package com.fyber.inneractive.sdk.web;

import com.fyber.inneractive.sdk.util.IAlog;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class d implements Runnable {
    public final /* synthetic */ i a;

    public d(i1 i1Var) {
        this.a = i1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        i iVar = this.a;
        boolean z = iVar.k;
        f fVar = iVar.l;
        if (z) {
            IAlog.a("No user web action detected for : %s blocking.", fVar);
            i iVar2 = this.a;
            String c = iVar2.l.c();
            String a = this.a.l.a();
            j1 j1Var = iVar2.g;
            if (j1Var != null) {
                j1Var.a(c, a);
            }
            IAlog.d("AD_AUTO_CLICK_DETECTED", new Object[0]);
            this.a.l.b();
            this.a.i();
        } else {
            IAlog.a("User web action detected for: %s", fVar);
            this.a.l.d();
        }
        this.a.l = null;
    }
}
