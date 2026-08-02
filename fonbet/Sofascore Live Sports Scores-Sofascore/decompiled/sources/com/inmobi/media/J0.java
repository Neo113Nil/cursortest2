package com.inmobi.media;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class J0 implements Vg {
    public final /* synthetic */ M0 a;
    public final /* synthetic */ boolean b;

    public J0(M0 m0, boolean z) {
        this.a = m0;
        this.b = z;
    }

    @Override // com.inmobi.media.Vg
    public final void a(Object obj) {
        ((Boolean) obj).getClass();
        this.a.a("result pushed to queue");
        if (this.b) {
            M0 m0 = this.a;
            m0.a("session end - cleanup");
            m0.g = null;
            m0.f.clear();
            m0.c.set(false);
            m0.d.set(false);
        }
    }

    @Override // com.inmobi.media.Vg
    public final void onError(Exception exc) {
        this.a.a("error in pushing to queue", exc);
    }
}
