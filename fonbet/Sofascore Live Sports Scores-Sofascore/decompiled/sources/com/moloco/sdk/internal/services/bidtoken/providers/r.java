package com.moloco.sdk.internal.services.bidtoken.providers;

import android.app.ActivityManager;
import com.moloco.sdk.internal.MolocoLogger;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class r implements j {
    public final ActivityManager a;
    public q b;

    public r(ActivityManager activityManager) {
        activityManager.getClass();
        this.a = activityManager;
        this.b = d();
    }

    @Override // com.moloco.sdk.internal.services.bidtoken.providers.j
    public final void a() {
        MolocoLogger.debugBuildLog$default(MolocoLogger.INSTANCE, "MemorySignalProvider", "[CBT] Updating m state", false, 4, null);
        this.b = d();
    }

    @Override // com.moloco.sdk.internal.services.bidtoken.providers.j
    public final boolean b() {
        q d = d();
        MolocoLogger molocoLogger = MolocoLogger.INSTANCE;
        MolocoLogger.debugBuildLog$default(molocoLogger, "MemorySignalProvider", "[CBT] cached lm: " + this.b.a + ", t: " + this.b.b + ", tm: " + this.b.c, false, 4, null);
        StringBuilder sb = new StringBuilder("[CBT] current lm: ");
        Boolean bool = d.a;
        sb.append(bool);
        sb.append(", t: ");
        Long l = d.b;
        sb.append(l);
        sb.append(", tm: ");
        Long l2 = d.c;
        sb.append(l2);
        MolocoLogger.debugBuildLog$default(molocoLogger, "MemorySignalProvider", sb.toString(), false, 4, null);
        q qVar = this.b;
        boolean z = (Intrinsics.c(bool, qVar.a) && Intrinsics.c(l, qVar.b) && Intrinsics.c(l2, qVar.c)) ? false : true;
        MolocoLogger.debugBuildLog$default(molocoLogger, "MemorySignalProvider", com.appsflyer.internal.i.j("[CBT] m needsRefresh: ", z), false, 4, null);
        return z;
    }

    @Override // com.moloco.sdk.internal.services.bidtoken.providers.j
    public final String c() {
        return "MemorySignalProvider";
    }

    public final q d() {
        try {
            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
            this.a.getMemoryInfo(memoryInfo);
            return new q(Boolean.valueOf(memoryInfo.lowMemory), Long.valueOf(memoryInfo.threshold), Long.valueOf(memoryInfo.totalMem));
        } catch (Exception e) {
            MolocoLogger.error$default(MolocoLogger.INSTANCE, "MemorySignalProvider", "[CBT] MI Error", e, false, 8, null);
            return new q(null, null, null);
        }
    }
}
