package com.applovin.impl;

import com.applovin.impl.f6;
import com.applovin.impl.r7;
import com.applovin.sdk.AppLovinAdLoadListener;
import java.util.HashSet;

/* loaded from: classes.dex */
class n6 extends k5 {
    private final v7 g;
    private final AppLovinAdLoadListener h;

    n6(v7 v7Var, AppLovinAdLoadListener appLovinAdLoadListener, com.applovin.impl.sdk.l lVar) {
        super("TaskRenderVastAd", lVar);
        this.h = appLovinAdLoadListener;
        this.g = v7Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (com.applovin.impl.sdk.p.a()) {
            this.c.a(this.b, "Rendering VAST ad...");
        }
        int size = this.g.a().size();
        HashSet hashSet = new HashSet(size);
        HashSet hashSet2 = new HashSet(size);
        String str = "";
        a8 a8Var = null;
        e8 e8Var = null;
        u7 u7Var = null;
        t7 t7Var = null;
        String str2 = "";
        for (q8 q8Var : this.g.a()) {
            q8 b = q8Var.b(d8.b(q8Var) ? com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.f : com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.e);
            if (b != null) {
                q8 b2 = b.b(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.h);
                if (b2 != null) {
                    a8Var = a8.a(b2, a8Var, this.a);
                }
                str = d8.a(b, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.i, str);
                str2 = d8.a(b, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.j, str2);
                d8.a(b.a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.n), hashSet, this.g, this.a);
                q8 c = b.c("ViewableImpression");
                if (c != null) {
                    d8.a(c.a("Viewable"), hashSet, this.g, this.a);
                }
                q8 b3 = b.b("AdVerifications");
                if (b3 != null) {
                    t7Var = t7.a(b3, t7Var, this.g, this.a);
                }
                d8.a(b.a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.c), hashSet2, this.g, this.a);
                q8 c2 = b.c(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.o);
                if (c2 != null) {
                    for (q8 q8Var2 : c2.b()) {
                        q8 c3 = q8Var2.c(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.q);
                        if (c3 != null) {
                            e8Var = e8.a(c3, e8Var, this.g, this.a);
                        } else {
                            q8 b4 = q8Var2.b(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.L);
                            if (b4 != null) {
                                q8 b5 = b4.b(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M);
                                if (b5 != null) {
                                    u7Var = u7.a(b5, u7Var, this.g, this.a);
                                }
                            } else if (com.applovin.impl.sdk.p.a()) {
                                this.c.b(this.b, "Received and will skip rendering for an unidentified creative: " + q8Var2);
                            }
                        }
                    }
                }
            } else if (com.applovin.impl.sdk.p.a()) {
                this.c.b(this.b, "Did not find wrapper or inline response for node: " + q8Var);
            }
        }
        r7 a = new r7.b().a(this.a).a(this.g.b()).b(this.g.e()).a(this.g.c()).b(str).a(str2).a(a8Var).a(e8Var).a(u7Var).a(t7Var).b(hashSet).a(t7Var).a(hashSet2).a();
        w7 c4 = d8.c(a);
        if (c4 != null) {
            d8.a(this.g, this.h, c4, -6, this.a);
            return;
        }
        if (com.applovin.impl.sdk.p.a()) {
            this.c.a(this.b, "Finished rendering VAST ad: " + a);
        }
        a.getAdEventTracker().e();
        this.a.s0().a((k5) new p5(a, this.a, this.h), f6.b.CACHING);
    }
}
