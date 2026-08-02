package com.vungle.ads.internal.presenter;

import com.vungle.ads.NetworkUnreachable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class j implements com.vungle.ads.internal.network.a {
    public final /* synthetic */ r a;

    public j(r rVar) {
        this.a = rVar;
    }

    @Override // com.vungle.ads.internal.network.a
    public final void a(Throwable th) {
        boolean z = com.vungle.ads.internal.util.u.a;
        com.vungle.ads.internal.util.t.a("MRAIDPresenter", "send RI Failure");
        StringBuilder a = com.iab.omid.library.vungle.internal.l.a("Error RI API calls: ");
        a.append(th != null ? th.getLocalizedMessage() : null);
        new NetworkUnreachable(a.toString()).setLogEntry$vungle_ads_release(this.a.b()).logErrorNoReturnValue$vungle_ads_release();
    }

    @Override // com.vungle.ads.internal.network.a
    public final void a(com.vungle.ads.internal.network.o oVar) {
        boolean z = com.vungle.ads.internal.util.u.a;
        com.vungle.ads.internal.util.t.a("MRAIDPresenter", "send RI success");
    }
}
