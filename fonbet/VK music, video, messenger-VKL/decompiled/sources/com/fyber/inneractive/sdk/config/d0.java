package com.fyber.inneractive.sdk.config;

/* loaded from: classes12.dex */
public final class d0 implements Runnable {
    public final /* synthetic */ IAConfigManager a;

    public d0(IAConfigManager iAConfigManager) {
        this.a = iAConfigManager;
    }

    @Override // java.lang.Runnable
    public final void run() {
        IAConfigManager iAConfigManager = this.a;
        if (iAConfigManager.p == null) {
            iAConfigManager.p = j.a(iAConfigManager.f);
        }
        com.fyber.inneractive.sdk.util.r.b.post(new c0(this));
    }
}
