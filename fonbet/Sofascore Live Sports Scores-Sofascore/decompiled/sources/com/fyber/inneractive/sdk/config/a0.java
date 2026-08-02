package com.fyber.inneractive.sdk.config;

import android.content.Context;
import com.iab.omid.library.fyber.Omid;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class a0 implements Runnable {
    public final /* synthetic */ IAConfigManager a;
    public final /* synthetic */ Context b;

    public a0(IAConfigManager iAConfigManager, Context context) {
        this.a = iAConfigManager;
        this.b = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            int i = Omid.a;
            com.fyber.inneractive.sdk.util.r.b.post(new z(this));
        } catch (Throwable unused) {
        }
    }
}
