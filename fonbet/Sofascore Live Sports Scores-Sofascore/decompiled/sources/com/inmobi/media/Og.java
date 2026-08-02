package com.inmobi.media;

import android.os.Handler;
import android.os.Looper;
import com.inmobi.media.core.config.models.AdConfig;
import defpackage.xw3;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public abstract class Og extends AbstractC3765so {
    public final AdConfig.ViewabilityConfig l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Og(AdConfig.ViewabilityConfig viewabilityConfig, byte b, InterfaceC3880x9 interfaceC3880x9) {
        super(new WeakHashMap(10), new Handler(Looper.getMainLooper()), b, interfaceC3880x9);
        C3826v7 c3826v7 = C3904y7.k;
        c3826v7.getClass();
        c3826v7.getClass();
        this.l = viewabilityConfig;
    }

    @Override // com.inmobi.media.AbstractC3765so
    public final void d() {
        toString();
        if (this.k || this.g.get()) {
            return;
        }
        this.k = true;
        xw3.L(L9.d, null, null, new C3739ro(this, null), 3);
    }
}
