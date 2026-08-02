package com.inmobi.media;

import android.content.Context;
import com.inmobi.ads.InMobiNative;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.inmobi.media.qd, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3703qd implements Qo {
    public final C3293ah a;
    public final C3499ih b;
    public final Uc c;
    public final Tc d;
    public C3678pe e;

    public C3703qd(InMobiNative inMobiNative, Context context, long j) {
        inMobiNative.getClass();
        context.getClass();
        C3293ah c3293ah = new C3293ah();
        c3293ah.a = j;
        this.a = c3293ah;
        C3677pd c3677pd = new C3677pd(this);
        C3499ih c3499ih = new C3499ih();
        this.b = c3499ih;
        Uc uc = new Uc(inMobiNative, c3499ih, c3677pd);
        this.c = uc;
        this.d = new Tc(context, c3293ah, uc);
    }

    @Override // com.inmobi.media.Qo
    public final String a(double d) {
        return this.d.a(d);
    }

    @Override // com.inmobi.media.Qo
    public final String a(int i, double d) {
        return this.d.a(i, d);
    }
}
