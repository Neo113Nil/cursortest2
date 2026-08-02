package com.fyber.inneractive.sdk.web;

import com.fyber.inneractive.sdk.util.IAlog;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class o0 implements Runnable {
    public final /* synthetic */ String a;
    public final /* synthetic */ v0 b;

    public o0(v0 v0Var, String str) {
        this.b = v0Var;
        this.a = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        IAlog.a("injecting JS: %s", this.a);
        try {
            String str = this.a;
            if (str != null) {
                com.fyber.inneractive.sdk.util.q0.a(this.b.a, str);
            }
        } catch (Exception unused) {
            IAlog.a("Failed to inject JS", new Object[0]);
        }
    }
}
