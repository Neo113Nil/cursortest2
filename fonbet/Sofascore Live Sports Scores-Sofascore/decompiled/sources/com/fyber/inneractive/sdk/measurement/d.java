package com.fyber.inneractive.sdk.measurement;

import android.content.Context;
import com.fyber.inneractive.sdk.external.InneractiveAdManager;
import com.fyber.inneractive.sdk.network.z;
import com.fyber.inneractive.sdk.util.IAlog;
import com.iab.omid.library.fyber.Omid;
import com.iab.omid.library.fyber.adsession.Partner;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class d implements Runnable {
    public final /* synthetic */ Context a;
    public final /* synthetic */ e b;

    public d(e eVar, Context context) {
        this.b = eVar;
        this.a = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            Omid.activate(this.a);
            this.b.e = Partner.createPartner("Fyber", InneractiveAdManager.getVersion());
            e.a(this.b, this.a);
            IAlog.a("OMID SDK was activated - version %s", Omid.getVersion());
            IAlog.d("OMID SDK was activated - version %s", Omid.getVersion());
        } catch (Throwable th) {
            IAlog.a("Failed starting omsdk with exception %s", th.getLocalizedMessage());
            this.b.getClass();
            z.a(th.getClass().getSimpleName(), "OpenMeasurementMeasurer - " + th.getMessage(), null, null);
        }
    }
}
