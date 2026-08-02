package com.inmobi.media;

import android.content.Context;
import com.inmobi.media.ads.nativeAd.InMobiNativeViewData;
import com.ironsource.mediationsdk.utils.IronSourceConstants;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class Tc implements Ih, InterfaceC3323bl, Qo {
    public final C3906y9 a;
    public final Nc b;

    public Tc(Context context, C3293ah c3293ah, Uc uc) {
        context.getClass();
        c3293ah.getClass();
        uc.getClass();
        context.getClass();
        c3293ah.getClass();
        Nb nb = AbstractC3294ai.a;
        this.a = AbstractC3294ai.a(IronSourceConstants.EVENTS_NATIVE, c3293ah.h);
        this.b = new Nc(new C3665p1(context, this, new C3691q1(this, c3293ah)), uc);
    }

    @Override // com.inmobi.media.Ih
    public final void a(InMobiNativeViewData inMobiNativeViewData) {
        inMobiNativeViewData.getClass();
        this.b.a(inMobiNativeViewData);
    }

    @Override // com.inmobi.media.InterfaceC3323bl
    public final void d() {
        this.b.d();
    }

    @Override // com.inmobi.media.Qo
    public final String a(double d) {
        return this.b.a(d);
    }

    @Override // com.inmobi.media.Qo
    public final String a(int i, double d) {
        return this.b.a(i, d);
    }
}
