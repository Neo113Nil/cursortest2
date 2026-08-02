package com.fyber.inneractive.sdk.network;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class c implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ f c;

    public c(f fVar, int i, long j) {
        this.c = fVar;
        this.a = i;
        this.b = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.c.d.sendEmptyMessageDelayed(this.a, this.b);
    }
}
