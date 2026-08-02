package com.fyber.inneractive.sdk.measurement.tracker;

import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.web.m;
import com.iab.omid.library.fyber.adsession.AdEvents;
import com.iab.omid.library.fyber.adsession.AdSessionConfiguration;
import com.iab.omid.library.fyber.adsession.CreativeType;
import com.iab.omid.library.fyber.adsession.ImpressionType;
import com.iab.omid.library.fyber.adsession.Owner;
import com.iab.omid.library.fyber.adsession.Partner;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class a extends e {
    public a(Partner partner, m mVar) {
        super(partner, mVar);
    }

    @Override // com.fyber.inneractive.sdk.measurement.tracker.e
    public final void a(m mVar) {
        super.a(mVar);
        try {
            AdEvents createAdEvents = AdEvents.createAdEvents(this.a);
            this.b = createAdEvents;
            createAdEvents.loaded();
        } catch (Throwable unused) {
        }
    }

    @Override // com.fyber.inneractive.sdk.measurement.tracker.e
    public final AdSessionConfiguration b() {
        try {
            return AdSessionConfiguration.createAdSessionConfiguration(CreativeType.HTML_DISPLAY, ImpressionType.UNSPECIFIED, Owner.NATIVE, Owner.NONE, false);
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // com.fyber.inneractive.sdk.measurement.tracker.e
    public final void c() {
        AdEvents adEvents;
        if (this.c || this.a == null || (adEvents = this.b) == null) {
            return;
        }
        this.c = true;
        try {
            adEvents.impressionOccurred();
        } catch (Throwable unused) {
        }
    }

    @Override // com.fyber.inneractive.sdk.measurement.tracker.e
    public final void a() {
        IAlog.f("%s Unsupported functionality for non video MRAID ads", IAlog.a(this));
    }
}
