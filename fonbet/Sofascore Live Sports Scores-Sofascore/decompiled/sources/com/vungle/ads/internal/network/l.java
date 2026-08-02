package com.vungle.ads.internal.network;

import defpackage.ah2;
import defpackage.d2g;
import defpackage.qh2;
import java.io.IOException;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class l implements qh2 {
    public final /* synthetic */ m a;
    public final /* synthetic */ a b;

    public l(m mVar, a aVar) {
        this.a = mVar;
        this.b = aVar;
    }

    @Override // defpackage.qh2
    public final void onFailure(ah2 ah2Var, IOException iOException) {
        ah2Var.getClass();
        iOException.getClass();
        try {
            this.b.a(iOException);
        } catch (Throwable th) {
            h.a(th);
            boolean z = com.vungle.ads.internal.util.u.a;
            com.vungle.ads.internal.util.t.a("OkHttpCall", "Cannot pass failure to callback", th);
        }
    }

    @Override // defpackage.qh2
    public final void onResponse(ah2 ah2Var, d2g d2gVar) {
        o a;
        ah2Var.getClass();
        d2gVar.getClass();
        try {
            a = this.a.a(d2gVar);
            try {
                this.b.a(a);
            } catch (Throwable th) {
                h.a(th);
                boolean z = com.vungle.ads.internal.util.u.a;
                com.vungle.ads.internal.util.t.a("OkHttpCall", "Cannot pass response to callback", th);
            }
        } catch (Throwable th2) {
            boolean z2 = com.vungle.ads.internal.util.u.a;
            StringBuilder a2 = com.iab.omid.library.vungle.internal.l.a("[enqueue] Failed to parse response: ");
            a2.append(th2.getLocalizedMessage());
            com.vungle.ads.internal.util.t.b("OkHttpCall", a2.toString());
            h.a(th2);
            try {
                this.b.a(th2);
            } catch (Throwable th3) {
                h.a(th3);
                boolean z3 = com.vungle.ads.internal.util.u.a;
                com.vungle.ads.internal.util.t.a("OkHttpCall", "Cannot pass failure to callback", th3);
            }
        }
    }
}
