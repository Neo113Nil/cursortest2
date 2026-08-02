package com.applovin.impl;

import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinAdLoadListener;

/* loaded from: classes3.dex */
class s6 extends k5 {
    private final v7 g;
    private final AppLovinAdLoadListener h;

    s6(v7 v7Var, AppLovinAdLoadListener appLovinAdLoadListener, com.applovin.impl.sdk.l lVar) {
        super("TaskResolveVastWrapper", lVar);
        this.h = appLovinAdLoadListener;
        this.g = v7Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        String a2 = d8.a(this.g);
        if (!StringUtils.isValidString(a2)) {
            if (com.applovin.impl.sdk.p.a()) {
                this.c.b(this.b, "Resolving VAST failed. Could not find resolution URL");
            }
            a(-1);
            return;
        }
        if (com.applovin.impl.sdk.p.a()) {
            this.c.a(this.b, "Resolving VAST ad with depth " + this.g.d() + " at " + a2);
        }
        try {
            this.a.s0().a(new a(com.applovin.impl.sdk.network.a.a(this.a).b(a2).c("GET").a(q8.f).a(((Integer) this.a.a(z4.Z4)).intValue()).c(((Integer) this.a.a(z4.a5)).intValue()).a(false).a(), this.a));
        } catch (Throwable th) {
            if (com.applovin.impl.sdk.p.a()) {
                this.c.a(this.b, "Unable to resolve VAST wrapper", th);
            }
            a(-1);
        }
    }

    class a extends o6 {
        a(com.applovin.impl.sdk.network.a aVar, com.applovin.impl.sdk.l lVar) {
            super(aVar, lVar);
        }

        @Override // com.applovin.impl.o6, com.applovin.impl.r0.e
        public void a(String str, q8 q8Var, int i) {
            this.a.s0().a(k6.a(q8Var, s6.this.g, s6.this.h, s6.this.a));
        }

        @Override // com.applovin.impl.o6, com.applovin.impl.r0.e
        public void a(String str, int i, String str2, q8 q8Var) {
            if (com.applovin.impl.sdk.p.a()) {
                this.c.b(this.b, "Unable to resolve VAST wrapper. Server returned " + i);
            }
            s6.this.a(i);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i) {
        if (com.applovin.impl.sdk.p.a()) {
            this.c.b(this.b, "Failed to resolve VAST wrapper due to error code " + i);
        }
        if (i == -1009) {
            AppLovinAdLoadListener appLovinAdLoadListener = this.h;
            if (appLovinAdLoadListener != null) {
                appLovinAdLoadListener.failedToReceiveAd(i);
                return;
            }
            return;
        }
        d8.a(this.g, this.h, i == -1001 ? w7.TIMED_OUT : w7.GENERAL_WRAPPER_ERROR, i, this.a);
    }
}
