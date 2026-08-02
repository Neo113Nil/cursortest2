package com.inmobi.media;

import com.inmobi.ads.controllers.PublisherCallbacks;
import com.inmobi.media.core.config.models.AdConfig;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public abstract class Mi extends AbstractC3896y implements Bj, InterfaceC3430g {
    public final Sc b;
    public final C3870x c;
    public final PublisherCallbacks d;
    public final Ej e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Mi(Sc sc, C3870x c3870x, PublisherCallbacks publisherCallbacks, Ej ej) {
        super(c3870x);
        sc.getClass();
        c3870x.getClass();
        publisherCallbacks.getClass();
        ej.getClass();
        this.b = sc;
        this.c = c3870x;
        this.d = publisherCallbacks;
        this.e = ej;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x004b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a(G g) {
        boolean z;
        InterfaceC3880x9 l;
        if (((AdConfig) AbstractC3435g4.a.a(AdConfig.class)).getNative().getInteraction().getBlockCallbackOnExpiry()) {
            long timeToLive = g.a.b.getCacheConfig(IronSourceConstants.EVENTS_NATIVE).getTimeToLive();
            long j = g.k;
            if (j == -1) {
                j = g.j + TimeUnit.SECONDS.toMillis(timeToLive);
            }
            if (j - System.currentTimeMillis() < 0) {
                z = true;
                l = l();
                if (l != null) {
                    ((C3906y9) l).b("AUM-RenderedState", com.appsflyer.internal.i.j("shouldBlockCallback - ", z));
                }
                return z;
            }
        }
        z = false;
        l = l();
        if (l != null) {
        }
        return z;
    }

    @Override // com.inmobi.media.InterfaceC3430g
    public final void j() {
        InterfaceC3880x9 l = l();
        if (l != null) {
            ((C3906y9) l).a("AUM-RenderedState", "onDestroy");
        }
        this.e.a(new C3928z5(this.b, null, this.c), this);
    }

    @Override // com.inmobi.media.Bj
    public final void c() {
    }

    @Override // com.inmobi.media.Bj
    public final void a() {
        InterfaceC3880x9 l = l();
        if (l != null) {
            ((C3906y9) l).a("AUM-RenderedState", "Initialize Called");
        }
    }
}
