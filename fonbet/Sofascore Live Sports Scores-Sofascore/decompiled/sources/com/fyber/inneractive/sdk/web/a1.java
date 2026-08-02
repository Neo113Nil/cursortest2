package com.fyber.inneractive.sdk.web;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class a1 implements Runnable {
    public final /* synthetic */ b1 a;

    public a1(b1 b1Var) {
        this.a = b1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.a.a.evictAll();
        } catch (Throwable unused) {
        }
    }
}
