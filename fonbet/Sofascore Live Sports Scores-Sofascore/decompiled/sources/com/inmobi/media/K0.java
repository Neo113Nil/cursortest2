package com.inmobi.media;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class K0 implements Vg {
    public final /* synthetic */ M0 a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ C3374dk c;
    public final /* synthetic */ String d;

    public K0(M0 m0, boolean z, C3374dk c3374dk, String str) {
        this.a = m0;
        this.b = z;
        this.c = c3374dk;
        this.d = str;
    }

    @Override // com.inmobi.media.Vg
    public final void a(String str) {
        str.getClass();
        this.a.a("file saved - " + str + " , isReporting - " + this.b);
        this.a.a(str, this.c, this.d, this.b);
    }

    @Override // com.inmobi.media.Vg
    public final void onError(Exception exc) {
        this.a.a(exc, this.c);
    }
}
