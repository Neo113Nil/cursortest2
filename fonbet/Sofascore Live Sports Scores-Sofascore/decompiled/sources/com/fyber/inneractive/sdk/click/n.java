package com.fyber.inneractive.sdk.click;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class n implements Runnable {
    public final /* synthetic */ b a;
    public final /* synthetic */ r b;

    public n(r rVar, b bVar) {
        this.b = rVar;
        this.a = bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        o oVar = this.b.e;
        if (oVar != null) {
            oVar.a(this.a);
        }
    }
}
