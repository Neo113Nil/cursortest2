package com.iab.omid.library.vungle.adsession;

import androidx.annotation.NonNull;
import com.iab.omid.library.vungle.adsession.media.VastProperties;
import com.iab.omid.library.vungle.utils.g;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class AdEvents {
    private final a adSession;

    private AdEvents(a aVar) {
        this.adSession = aVar;
    }

    public static AdEvents createAdEvents(AdSession adSession) {
        a aVar = (a) adSession;
        g.a(adSession, "AdSession is null");
        g.g(aVar);
        g.b(aVar);
        AdEvents adEvents = new AdEvents(aVar);
        aVar.d().a(adEvents);
        return adEvents;
    }

    public void impressionOccurred() {
        g.b(this.adSession);
        g.e(this.adSession);
        if (!this.adSession.h()) {
            try {
                this.adSession.start();
            } catch (Exception unused) {
            }
        }
        if (this.adSession.h()) {
            this.adSession.m();
        }
    }

    public void loaded(@NonNull VastProperties vastProperties) {
        g.a(vastProperties, "VastProperties is null");
        g.a(this.adSession);
        g.e(this.adSession);
        this.adSession.a(vastProperties.a());
    }

    public void loaded() {
        g.a(this.adSession);
        g.e(this.adSession);
        this.adSession.n();
    }
}
