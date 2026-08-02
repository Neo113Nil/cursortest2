package com.fyber.inneractive.sdk.player.ui;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class d implements Runnable {
    public final boolean a;
    public final /* synthetic */ e b;

    public d(e eVar, boolean z) {
        this.b = eVar;
        this.a = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.a == this.b.hasWindowFocus()) {
            this.b.f();
        }
    }
}
