package com.moloco.sdk.internal.services;

import com.moloco.sdk.internal.MolocoLogger;
import defpackage.ljg;
import defpackage.rq3;
import defpackage.rq4;
import defpackage.rvg;
import defpackage.u6b;
import defpackage.vxd;
import defpackage.xw3;
import defpackage.z40;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class k implements rq4 {
    public final com.moloco.sdk.internal.services.analytics.a a;
    public final i b;
    public Long c;
    public boolean d;

    public k(com.moloco.sdk.internal.services.analytics.a aVar, i iVar) {
        aVar.getClass();
        iVar.getClass();
        this.a = aVar;
        this.b = iVar;
    }

    @Override // defpackage.rq4
    public final void onStart(u6b u6bVar) {
        u6bVar.getClass();
        MolocoLogger molocoLogger = MolocoLogger.INSTANCE;
        MolocoLogger.debug$default(molocoLogger, "SingleObserverBackgroundThenForegroundAnalyticsListener", "Application onStart", false, 4, null);
        Long l = this.c;
        if (l != null) {
            MolocoLogger.debug$default(molocoLogger, "SingleObserverBackgroundThenForegroundAnalyticsListener", "Background event has been recorded, recording foreground", false, 4, null);
            this.b.getClass();
            long currentTimeMillis = System.currentTimeMillis();
            long longValue = l.longValue();
            com.moloco.sdk.internal.services.analytics.a aVar = this.a;
            com.moloco.sdk.internal.services.events.g gVar = aVar.c.a;
            if (gVar.a && gVar.c.length() > 0) {
                StringBuilder o = ljg.o("Recording applicationForeground with timestamp: ", currentTimeMillis, ", lastBgTimestamp: ");
                o.append(longValue);
                MolocoLogger.debug$default(molocoLogger, "AnalyticsService", o.toString(), false, 4, null);
                xw3.L(com.moloco.sdk.internal.scheduling.a.a, null, null, new rvg(aVar, currentTimeMillis, longValue, null), 3);
            }
            this.c = null;
            this.d = false;
        }
    }

    @Override // defpackage.rq4
    public final void onStop(u6b u6bVar) {
        MolocoLogger molocoLogger = MolocoLogger.INSTANCE;
        MolocoLogger.debug$default(molocoLogger, "SingleObserverBackgroundThenForegroundAnalyticsListener", "Application onStop", false, 4, null);
        if (this.d) {
            MolocoLogger.debug$default(molocoLogger, "SingleObserverBackgroundThenForegroundAnalyticsListener", "Tracking of event is true. Recording background", false, 4, null);
            this.b.getClass();
            long currentTimeMillis = System.currentTimeMillis();
            this.c = Long.valueOf(currentTimeMillis);
            com.moloco.sdk.internal.services.analytics.a aVar = this.a;
            com.moloco.sdk.internal.services.events.g gVar = aVar.c.a;
            if (!gVar.a || gVar.d.length() <= 0) {
                return;
            }
            MolocoLogger.debug$default(molocoLogger, "AnalyticsService", vxd.l(currentTimeMillis, "Recording applicationBackground with timestamp: "), false, 4, null);
            xw3.L(com.moloco.sdk.internal.scheduling.a.a, null, null, new z40(aVar, currentTimeMillis, (rq3) null, 11), 3);
        }
    }
}
