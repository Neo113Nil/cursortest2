package com.inmobi.media;

import android.graphics.Bitmap;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class L0 implements Vg {
    public final /* synthetic */ M0 a;
    public final /* synthetic */ AbstractC3899y2 b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ C3475hi d;

    public L0(M0 m0, AbstractC3899y2 abstractC3899y2, boolean z, C3475hi c3475hi) {
        this.a = m0;
        this.b = abstractC3899y2;
        this.c = z;
        this.d = c3475hi;
    }

    @Override // com.inmobi.media.Vg
    public final void a(Object obj) {
        this.a.a((Bitmap) obj, this.b, this.c, this.d);
    }

    @Override // com.inmobi.media.Vg
    public final void onError(Exception exc) {
        this.a.a(exc, this.b);
    }
}
