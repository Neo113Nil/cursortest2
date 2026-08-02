package com.fyber.inneractive.sdk.config;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
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
